// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui;

import java.util.Iterator;
import com.reddit.discoveryunits.ui.carousel.CarouselItemLayout;
import com.reddit.discoveryunits.data.OrderBy;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.discoveryunits.domain.AppVersionNameConverter;
import com.reddit.discoveryunits.data.OrderType;
import java.util.Collection;
import zg2.l;
import java.util.Set;
import java.util.LinkedHashSet;
import com.reddit.discoveryunits.data.Surface;
import a4.u1;
import qg2.m;
import ah2.f;
import kotlin.collections.EmptyList;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/discoveryunits/ui/DiscoveryUnitExperimentManager;", "", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class DiscoveryUnitExperimentManager
{
    public final List<DiscoveryUnit> a;
    public final boolean b;
    public final LinkedHashMap c;
    
    public DiscoveryUnitExperimentManager() {
        this(null, null, false, 7, null);
    }
    
    public DiscoveryUnitExperimentManager(List list, List instance, boolean b, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            list = new ArrayList();
        }
        if ((n & 0x2) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        this(b, list, (List)instance);
    }
    
    public DiscoveryUnitExperimentManager(final boolean b, List a, final List list) {
        f.f((Object)a, "configDiscoveryUnits");
        f.f((Object)list, "surfaces");
        this.a = a;
        this.b = b;
        int a2;
        if ((a2 = u1.A0(m.P0((Iterable)list, 10))) < 16) {
            a2 = 16;
        }
        final LinkedHashMap c = new LinkedHashMap(a2);
        for (final Surface surface : list) {
            c.put((Object)surface.a, (Object)surface);
        }
        this.c = c;
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator<Object> iterator2 = this.a.iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            int d = 0;
            if (!hasNext) {
                a = this.a;
                qg2.o.Z0((List)a, (l)new DiscoveryUnitExperimentManager$2$1((Set)set));
                a.addAll(set);
                for (final DiscoveryUnit discoveryUnit : this.a) {
                    final boolean b2 = discoveryUnit.t.i != OrderType.INDEX || discoveryUnit.n != -1;
                    discoveryUnit.B = (AppVersionNameConverter.a(discoveryUnit.m) <= AppVersionNameConverter.a(discoveryUnit.x) && b2);
                }
                return;
            }
            final DiscoveryUnit discoveryUnit2 = iterator2.next();
            final Surface surface2 = this.c.get(discoveryUnit2.i);
            if (surface2 == null) {
                continue;
            }
            final int n = DiscoveryUnitExperimentManager.a.a[surface2.c.ordinal()];
            DiscoveryUnit discoveryUnit3;
            if (n != 1) {
                if (n != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                discoveryUnit3 = DiscoveryUnit.a(discoveryUnit2, null, null, new OrderBy(0, 0, discoveryUnit2.n, surface2.c, 3, null), null, 4177919);
            }
            else {
                final boolean b3 = this.b;
                int e;
                if (b3) {
                    e = 0;
                }
                else {
                    e = surface2.e;
                }
                if (!b3) {
                    d = surface2.d;
                }
                discoveryUnit3 = DiscoveryUnit.a(discoveryUnit2, null, null, new OrderBy(e, d, 0, OrderType.RANDOM, 4, null), null, 4177919);
            }
            set.add(discoveryUnit3);
        }
    }
}
