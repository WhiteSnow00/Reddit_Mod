// 
// Decompiled by Procyon v0.6.0
// 

package u60;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.c;
import kotlin.Pair;
import com.reddit.fragment.GqlStorefrontListing$g;
import dl0.x7;
import dg2.m;
import com.reddit.fragment.GqlStorefrontListing;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.util.List;
import javax.inject.Inject;
import ng2.e;
import r60.p;
import com.reddit.data.snoovatar.repository.usecase.FetchListingPricesUseCase;

public final class a
{
    public final FetchListingPricesUseCase a;
    public final p b;
    
    @Inject
    public a(final FetchListingPricesUseCase a, final p b) {
        e.f((Object)a, "fetchListingPricesUseCase");
        e.f((Object)b, "validPricePackageFinder");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(List b, final ContinuationImpl continuationImpl) {
        final ArrayList list = new ArrayList();
        for (final GqlStorefrontListing gqlStorefrontListing : b) {
            b = gqlStorefrontListing.e.b;
            Object o = null;
            ArrayList list3;
            if (b != null) {
                final ArrayList list2 = new ArrayList<x7>(m.u4((Iterable)b, 10));
                final Iterator iterator2 = b.iterator();
                while (true) {
                    list3 = list2;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    list2.add((Object)((GqlStorefrontListing$g)iterator2.next()).b.a);
                }
            }
            else {
                list3 = null;
            }
            if (list3 != null && !list3.isEmpty()) {
                final x7 a = this.b.a(list3);
                String c;
                if (a != null) {
                    c = a.c;
                }
                else {
                    c = null;
                }
                if (c != null) {
                    o = new Pair((Object)gqlStorefrontListing.b, (Object)c);
                }
            }
            if (o != null) {
                list.add(o);
            }
        }
        return this.a.a(new FetchListingPricesUseCase.a(c.E4((List)list)), (gg2.c<? super Map<String, ? extends vz.e>>)continuationImpl);
    }
}
