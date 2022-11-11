// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

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

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000f" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/ArtistsCarouselJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ArtistsCarousel;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ArtistsCarouselBody;", "artistsCarouselBodyAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ArtistsCarouselJsonAdapter extends JsonAdapter<ArtistsCarousel>
{
    private final JsonAdapter<ArtistsCarouselBody> artistsCarouselBodyAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public ArtistsCarouselJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "body" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.artistsCarouselBodyAdapter = (JsonAdapter<ArtistsCarouselBody>)y.c((Type)ArtistsCarouselBody.class, (Set)instance, "body");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        ArtistsCarouselBody artistsCarouselBody = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    artistsCarouselBody = (ArtistsCarouselBody)this.artistsCarouselBodyAdapter.fromJson(jsonReader);
                    if (artistsCarouselBody != null) {
                        continue;
                    }
                    throw a.n("body", "body", jsonReader);
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (artistsCarouselBody != null) {
            return new ArtistsCarousel(s, artistsCarouselBody);
        }
        throw a.h("body", "body", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final ArtistsCarousel artistsCarousel = (ArtistsCarousel)o;
        f.f((Object)x, "writer");
        if (artistsCarousel != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)artistsCarousel.a);
            x.w("body");
            this.artistsCarouselBodyAdapter.toJson(x, (Object)artistsCarousel.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(ArtistsCarousel)";
    }
}
