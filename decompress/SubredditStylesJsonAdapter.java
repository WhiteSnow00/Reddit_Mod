// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

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

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018" }, d2 = { "Lcom/reddit/data/model/SubredditStylesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/SubredditStyles;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/MediaSource;", "nullableMediaSourceAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditStylesJsonAdapter extends JsonAdapter<SubredditStyles>
{
    private final JsonAdapter<MediaSource> nullableMediaSourceAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public SubredditStylesJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "primaryColor", "icon", "bannerBackgroundImage", "legacyPrimaryColor", "legacyIcon" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "primaryColor");
        this.nullableMediaSourceAdapter = (JsonAdapter<MediaSource>)y.c((Type)MediaSource.class, (Set)instance, "legacyIcon");
    }
    
    public SubredditStyles fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object o = null;
        Object o2;
        String s = (String)(o2 = o);
        Object o3;
        String s2 = (String)(o3 = o2);
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f != 4) {
                                    continue;
                                }
                                o3 = this.nullableMediaSourceAdapter.fromJson(jsonReader);
                            }
                            else {
                                s2 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                            }
                        }
                        else {
                            o2 = this.nullableStringAdapter.fromJson(jsonReader);
                        }
                    }
                    else {
                        s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    }
                }
                else {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        return new SubredditStyles((String)o, s, (String)o2, s2, (MediaSource)o3);
    }
    
    public void toJson(final x x, final SubredditStyles subredditStyles) {
        f.f((Object)x, "writer");
        if (subredditStyles != null) {
            x.h();
            x.w("primaryColor");
            this.nullableStringAdapter.toJson(x, (Object)subredditStyles.getPrimaryColor());
            x.w("icon");
            this.nullableStringAdapter.toJson(x, (Object)subredditStyles.getIcon());
            x.w("bannerBackgroundImage");
            this.nullableStringAdapter.toJson(x, (Object)subredditStyles.getBannerBackgroundImage());
            x.w("legacyPrimaryColor");
            this.nullableStringAdapter.toJson(x, (Object)subredditStyles.getLegacyPrimaryColor());
            x.w("legacyIcon");
            this.nullableMediaSourceAdapter.toJson(x, (Object)subredditStyles.getLegacyIcon());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SubredditStyles)";
    }
}
