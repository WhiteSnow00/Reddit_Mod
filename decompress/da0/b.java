// 
// Decompiled by Procyon v0.6.0
// 

package da0;

import com.squareup.moshi.y;
import com.squareup.moshi.JsonAdapter$e;
import com.reddit.data.snoovatar.entity.storefront.layout.CategoriesRow;
import com.reddit.data.snoovatar.entity.storefront.layout.OutfitsGallery;
import com.reddit.data.snoovatar.entity.storefront.layout.ArtistRows;
import com.reddit.data.snoovatar.entity.storefront.layout.ArtistsCarousel;
import com.reddit.data.snoovatar.entity.storefront.layout.OutfitsRow;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import t60.a;
import com.squareup.moshi.y$a;
import u60.g;
import af2.d;

public final class b implements d<g>
{
    public final Object get() {
        final y$a y$a = new y$a();
        y$a.a((JsonAdapter$e)PolymorphicJsonAdapterFactory.a((Class)a.class, "type").b((Class)OutfitsRow.class, "outfitsRow").b((Class)ArtistsCarousel.class, "artistsCarousel").b((Class)ArtistRows.class, "artistRows").b((Class)OutfitsGallery.class, "outfitsGallery").b((Class)CategoriesRow.class, "categoriesRow"));
        return new g(new y(y$a));
    }
}
