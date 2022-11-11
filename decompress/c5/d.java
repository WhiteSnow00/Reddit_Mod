// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import sg2.e;
import androidx.paging.LoadType;

public final class d<K>
{
    public final K a;
    
    public d(final LoadType loadType, final Object a) {
        e.f((Object)loadType, "type");
        this.a = (K)a;
        if (loadType != LoadType.REFRESH && a == null) {
            throw new IllegalArgumentException("Key must be non-null for prepend/append");
        }
    }
}
