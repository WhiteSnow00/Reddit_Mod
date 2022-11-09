// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.wiki;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016�\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00130\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0015\u0010\u0012�\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/wiki/SubredditWikiIndexJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/wiki/SubredditWikiIndex;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/model/wiki/SubredditWikiPageStatus;", "nullableSubredditWikiPageStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/domain/model/wiki/SubredditWikiPageNode;", "nullableListOfNullableSubredditWikiPageNodeAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditWikiIndexJsonAdapter extends JsonAdapter<SubredditWikiIndex>
{
    private final JsonAdapter<List<SubredditWikiPageNode>> nullableListOfNullableSubredditWikiPageNodeAdapter;
    private final JsonAdapter<SubredditWikiPageStatus> nullableSubredditWikiPageStatusAdapter;
    private final JsonReader$b options;
    
    public SubredditWikiIndexJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "status", "pageTree" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableSubredditWikiPageStatusAdapter = (JsonAdapter<SubredditWikiPageStatus>)y.c((Type)SubredditWikiPageStatus.class, (Set)instance, "status");
        this.nullableListOfNullableSubredditWikiPageNodeAdapter = (JsonAdapter<List<SubredditWikiPageNode>>)y.c((Type)a0.d((Class)List.class, new Type[] { SubredditWikiPageNode.class }), (Set)instance, "pageTree");
    }
    
    public SubredditWikiIndex fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        SubredditWikiPageStatus subredditWikiPageStatus = null;
        List<SubredditWikiPageNode> list = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    list = (List)this.nullableListOfNullableSubredditWikiPageNodeAdapter.fromJson(jsonReader);
                }
                else {
                    subredditWikiPageStatus = (SubredditWikiPageStatus)this.nullableSubredditWikiPageStatusAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        return new SubredditWikiIndex(subredditWikiPageStatus, list);
    }
    
    public void toJson(final x x, final SubredditWikiIndex subredditWikiIndex) {
        f.f((Object)x, "writer");
        if (subredditWikiIndex != null) {
            x.h();
            x.w("status");
            this.nullableSubredditWikiPageStatusAdapter.toJson(x, (Object)subredditWikiIndex.getStatus());
            x.w("pageTree");
            this.nullableListOfNullableSubredditWikiPageNodeAdapter.toJson(x, (Object)subredditWikiIndex.getPageTree());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SubredditWikiIndex)";
    }
}