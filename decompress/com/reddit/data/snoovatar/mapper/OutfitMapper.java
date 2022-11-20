// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper;

import p1.h;
import kotlin.a;
import ng2.e;
import kotlin.collections.EmptyList;
import cg2.f;
import com.reddit.domain.snoovatar.model.AccessoryModel;
import java.util.LinkedHashMap;
import java.util.List;

public interface OutfitMapper
{
    Outfits a(final List p0, final LinkedHashMap p1);
    
    Outfits b(final List p0, final LinkedHashMap p1);
    
    public static final class Outfits
    {
        public static final Outfits c;
        public final List<AccessoryModel> a;
        public final f b;
        
        static {
            c = new Outfits((List<AccessoryModel>)EmptyList.INSTANCE);
        }
        
        public Outfits(final List<AccessoryModel> a) {
            e.f((Object)a, "allOutfits");
            this.a = a;
            this.b = a.b((mg2.a)new OutfitMapper$Outfits$nftOutfits$2(this));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof Outfits && e.a((Object)this.a, (Object)((Outfits)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return h.d(a.t("Outfits(allOutfits="), (List)this.a, ')');
        }
    }
}
