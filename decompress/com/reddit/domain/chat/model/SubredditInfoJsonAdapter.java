// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012�\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0010\u0010\u0011�\u0006\u0016" }, d2 = { "Lcom/reddit/domain/chat/model/SubredditInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/SubredditInfo;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditInfoJsonAdapter extends JsonAdapter<SubredditInfo>
{
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public SubredditInfoJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "subredditKindWithId", "subredditName" });
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)EmptySet.INSTANCE, "subredditKindWithId");
    }
    
    public SubredditInfo fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        String s2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("subredditName", "subredditName", jsonReader);
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("subredditKindWithId", "subredditKindWithId", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("subredditKindWithId", "subredditKindWithId", jsonReader);
        }
        if (s2 != null) {
            return new SubredditInfo(s, s2);
        }
        throw a.h("subredditName", "subredditName", jsonReader);
    }
    
    public void toJson(final x x, final SubredditInfo subredditInfo) {
        f.f((Object)x, "writer");
        if (subredditInfo != null) {
            x.h();
            x.w("subredditKindWithId");
            this.stringAdapter.toJson(x, (Object)subredditInfo.getSubredditKindWithId());
            x.w("subredditName");
            this.stringAdapter.toJson(x, (Object)subredditInfo.getSubredditName());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SubredditInfo)";
    }
}