// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000f" }, d2 = { "Lcom/reddit/data/snoovatar/entity/ShareableSnoovatarJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/ShareableSnoovatarJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "nullableSnoovatarJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ShareableSnoovatarJsonJsonAdapter extends JsonAdapter<ShareableSnoovatarJson>
{
    private final JsonAdapter<SnoovatarJson> nullableSnoovatarJsonAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public ShareableSnoovatarJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "avatar", "share_link" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableSnoovatarJsonAdapter = (JsonAdapter<SnoovatarJson>)y.c((Type)SnoovatarJson.class, (Set)instance, "snoovatar");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "shareLink");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        SnoovatarJson snoovatarJson = null;
        String s = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                }
                else {
                    snoovatarJson = (SnoovatarJson)this.nullableSnoovatarJsonAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        return new ShareableSnoovatarJson(snoovatarJson, s);
    }
    
    public final void toJson(final x x, final Object o) {
        final ShareableSnoovatarJson shareableSnoovatarJson = (ShareableSnoovatarJson)o;
        f.f((Object)x, "writer");
        if (shareableSnoovatarJson != null) {
            x.h();
            x.w("avatar");
            this.nullableSnoovatarJsonAdapter.toJson(x, (Object)shareableSnoovatarJson.a);
            x.w("share_link");
            this.nullableStringAdapter.toJson(x, (Object)shareableSnoovatarJson.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(ShareableSnoovatarJson)";
    }
}
