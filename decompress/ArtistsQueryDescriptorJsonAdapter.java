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

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/ArtistsQueryDescriptorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ArtistsQueryDescriptor;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ArtistsFilters;", "artistsFiltersAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ArtistsQueryDescriptorJsonAdapter extends JsonAdapter<ArtistsQueryDescriptor>
{
    private final JsonAdapter<ArtistsFilters> artistsFiltersAdapter;
    private final JsonReader$b options;
    
    public ArtistsQueryDescriptorJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "filters" });
        this.artistsFiltersAdapter = (JsonAdapter<ArtistsFilters>)y.c((Type)ArtistsFilters.class, (Set)EmptySet.INSTANCE, "filters");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        ArtistsFilters artistsFilters = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    continue;
                }
                artistsFilters = (ArtistsFilters)this.artistsFiltersAdapter.fromJson(jsonReader);
                if (artistsFilters != null) {
                    continue;
                }
                throw a.n("filters", "filters", jsonReader);
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (artistsFilters != null) {
            return new ArtistsQueryDescriptor(artistsFilters);
        }
        throw a.h("filters", "filters", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final ArtistsQueryDescriptor artistsQueryDescriptor = (ArtistsQueryDescriptor)o;
        f.f((Object)x, "writer");
        if (artistsQueryDescriptor != null) {
            x.h();
            x.w("filters");
            this.artistsFiltersAdapter.toJson(x, (Object)artistsQueryDescriptor.a);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(ArtistsQueryDescriptor)";
    }
}
