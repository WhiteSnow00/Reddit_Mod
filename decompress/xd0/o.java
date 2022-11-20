// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import kotlinx.coroutines.flow.g;
import cg2.j;
import gg2.c;

public interface o
{
    Object a(final c<? super j> p0);
    
    g b();
    
    boolean c(final SortType p0, final SortTimeFrame p1, final String p2, final ListingViewMode p3);
    
    void dispose();
}
