// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui;

import kotlin.Metadata;
import jj2.g;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.domain.model.CarouselCollectionState;
import java.util.Iterator;
import com.reddit.discoveryunits.ui.carousel.SubheaderIcon;
import jj2.v;
import com.reddit.domain.model.Account;
import com.reddit.domain.model.Subreddit;
import h00.e$b;
import java.util.ArrayList;
import qg2.m;
import l00.i;
import h91.h$a;
import com.reddit.domain.model.UserSubreddit;
import h91.b$a;
import com.reddit.discoveryunits.data.OrderBy;
import com.reddit.discoveryunits.ui.carousel.CarouselItemLayout;
import com.reddit.listing.model.Listable$Type;
import java.util.LinkedHashMap;
import java.util.Map;
import h00.e$a;
import jj2.k;
import pg2.j;
import com.reddit.domain.model.Link;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.Pair;
import zg2.p;
import d22.l;
import q20.b;
import jl0.e;
import ge0.a0$a;
import com.reddit.domain.model.discovery.DiscoveryUnitListing;
import javax.inject.Inject;
import d22.f;
import fv.c;
import com.reddit.screens.listing.mapper.a;

public final class DiscoveryUnitListingMapper
{
    public final com.reddit.screens.listing.mapper.a a;
    public final gv.a b;
    public final c c;
    public final f d;
    
    @Inject
    public DiscoveryUnitListingMapper(final com.reddit.screens.listing.mapper.a a, final gv.a b, final c c, final f d) {
        ah2.f.f((Object)a, "linkMapper");
        ah2.f.f((Object)b, "adsFeatures");
        ah2.f.f((Object)c, "voteableAnalyticsDomainMapper");
        ah2.f.f((Object)d, "dateUtilDelegate");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static h00.e a(final DiscoveryUnitListingMapper discoveryUnitListingMapper, final DiscoveryUnit discoveryUnit, DiscoveryUnitListing discoveryUnitListing, final a0$a a0$a, final ja0.c c, final e e, b b, l publicDescription, final long n, Integer n2, boolean booleanValue, boolean booleanValue2, p subreddit, boolean b2, Integer a, int n3) {
        if ((n3 & 0x200) != 0x0) {
            n2 = null;
        }
        if ((n3 & 0x400) != 0x0) {
            booleanValue = false;
        }
        if ((n3 & 0x800) != 0x0) {
            booleanValue2 = false;
        }
        Object o;
        if ((n3 & 0x1000) != 0x0) {
            o = null;
        }
        else {
            o = subreddit;
        }
        if ((n3 & 0x2000) != 0x0) {
            b2 = false;
        }
        if ((n3 & 0x4000) != 0x0) {
            a = null;
        }
        discoveryUnitListingMapper.getClass();
        ah2.f.f((Object)discoveryUnitListing, "listing");
        ah2.f.f((Object)c, "templateManager");
        ah2.f.f((Object)e, "numberFormatter");
        ah2.f.f((Object)b, "resourceProvider");
        ah2.f.f((Object)publicDescription, "relativeTimestamps");
        final List<Pair<Link, DiscoveryUnitListing.LinkCause>> component1 = discoveryUnitListing.component1();
        final Subreddit component2 = discoveryUnitListing.component2();
        final Account component3 = discoveryUnitListing.component3();
        if (component3 != null) {
            subreddit = component3.getSubreddit();
        }
        else {
            subreddit = null;
        }
        final Pair pair = (Pair)CollectionsKt___CollectionsKt.s1((List)component1);
        if (pair != null) {
            final Link link = (Link)pair.component1();
            final String cause = ((DiscoveryUnitListing.LinkCause)pair.component2()).getCause();
            if (cause != null) {
                c.b(discoveryUnit, "first_item.cause", cause);
                final j a2 = j.a;
            }
            final s20.a a3 = s20.a.a;
            final String subredditNamePrefixed = link.getSubredditNamePrefixed();
            a3.getClass();
            c.b(discoveryUnit, "first_item.subreddit.visual_name", s20.a.a(subredditNamePrefixed));
            final String linkFlairText = link.getLinkFlairText();
            if (linkFlairText != null) {
                c.b(discoveryUnit, "first_item.post_flair", linkFlairText);
                final j a4 = j.a;
            }
            c.a("first_item.subreddit.id", link.getSubredditId());
            c.b(discoveryUnit, "subreddit.name", "");
            c.b(discoveryUnit, "category.name", "");
            final j a5 = j.a;
        }
        final Integer z = discoveryUnit.z;
        if (z != null) {
            n3 = z;
        }
        else {
            n3 = Integer.MAX_VALUE;
        }
        final ArrayList c2 = discoveryUnitListingMapper.a.c(CollectionsKt___CollectionsKt.a2((Iterable)component1, Math.min(n3, 10)), component2, component3, discoveryUnit, booleanValue, booleanValue2, (p)o, b2, publicDescription, b);
        final int size = c2.size();
        final v d1 = kotlin.sequences.b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)component1), (zg2.l)DiscoveryUnitListingMapper$mapListingToDiscoveryUnitResult$linksAfterCarousel$1.INSTANCE);
        final Integer a6 = discoveryUnit.A;
        if (a6 != null) {
            n3 = a6;
        }
        else {
            n3 = 0;
        }
        final List k1 = kotlin.sequences.b.k1(kotlin.sequences.b.S0(kotlin.sequences.b.i1((k)d1, n3 + size), size));
        if (a != null) {
            n3 = a;
        }
        else {
            n3 = 3;
        }
        if (size >= n3) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n3 == 0) {
            final Object o2 = new e$a(discoveryUnit);
            return (h00.e)o2;
        }
        final Link link2 = (Link)((Pair)CollectionsKt___CollectionsKt.p1((List)component1)).getFirst();
        Label_0559: {
            if (component2 != null) {
                publicDescription = (l)component2.getPublicDescription();
                if (publicDescription != null) {
                    break Label_0559;
                }
            }
            Object o3;
            if (subreddit != null) {
                o3 = ((UserSubreddit)subreddit).getPublicDescription();
            }
            else {
                o3 = link2.getSubreddit();
            }
            publicDescription = (l)o3;
        }
        Label_0609: {
            Boolean b3 = null;
            Label_0597: {
                if (component2 != null) {
                    b3 = component2.getUserIsSubscriber();
                    if (b3 != null) {
                        break Label_0597;
                    }
                }
                if (subreddit != null) {
                    b3 = ((UserSubreddit)subreddit).getUserIsSubscriber();
                }
                else {
                    b3 = null;
                }
                if (b3 == null) {
                    booleanValue = false;
                    break Label_0609;
                }
            }
            booleanValue = b3;
        }
        long longValue = 0L;
        Label_0661: {
            if (component2 != null) {
                final Long subscribers = component2.getSubscribers();
                if (subscribers != null) {
                    longValue = subscribers;
                    break Label_0661;
                }
            }
            if (subreddit != null) {
                final Integer subscribers2 = ((UserSubreddit)subreddit).getSubscribers();
                if (subscribers2 != null) {
                    longValue = subscribers2;
                    break Label_0661;
                }
            }
            longValue = 0L;
        }
        a = (Integer)b.a(2131953630, new Object[] { e.g(longValue, false) });
        if (component2 == null || (discoveryUnitListing = (DiscoveryUnitListing)component2.getDisplayNamePrefixed()) == null) {
            if (subreddit != null) {
                discoveryUnitListing = (DiscoveryUnitListing)((UserSubreddit)subreddit).getDisplayNamePrefixed();
            }
            else {
                discoveryUnitListing = (DiscoveryUnitListing)"";
            }
        }
        Label_0783: {
            Boolean b4 = null;
            Label_0771: {
                if (component2 != null) {
                    b4 = component2.getUserIsSubscriber();
                    if (b4 != null) {
                        break Label_0771;
                    }
                }
                if (subreddit != null) {
                    b4 = ((UserSubreddit)subreddit).getUserIsSubscriber();
                }
                else {
                    b4 = null;
                }
                if (b4 == null) {
                    booleanValue2 = false;
                    break Label_0783;
                }
            }
            booleanValue2 = b4;
        }
        final String d2 = c.d(discoveryUnit);
        final String p16 = discoveryUnit.p;
        Label_0966: {
            if (p16 == null) {
                String g;
                if ((g = p16) == null) {
                    g = "";
                    break Label_0966;
                }
                break Label_0966;
            }
            b = (b)c.c;
            synchronized (b) {
                Map map;
                if ((map = c.c.get(discoveryUnit)) == null) {
                    map = new LinkedHashMap();
                }
                final c1.c c3 = new c1.c(map);
                String p17;
                if ((p17 = discoveryUnit.p) == null) {
                    p17 = "";
                }
                final String g = c3.g(p17);
                if (g == null) {
                    synchronized (c.b) {
                        final c1.c c4 = new c1.c(c.b);
                        String p18;
                        if ((p18 = discoveryUnit.p) == null) {
                            p18 = "";
                        }
                        ah2.f.c((Object)c4.g(p18));
                        monitorexit(c.b);
                        break Label_0966;
                    }
                }
                monitorexit(b);
                final SubheaderIcon q = discoveryUnit.q;
                Integer value;
                if (q != null) {
                    value = q.getDrawable();
                }
                else {
                    value = null;
                }
                final String f = discoveryUnit.f;
                final Listable$Type carousel_LINK_LISTING = Listable$Type.CAROUSEL_LINK_LISTING;
                final String v = discoveryUnit.v;
                Label_1072: {
                    if (v == null) {
                        b = (b)discoveryUnit;
                        break Label_1072;
                    }
                    b = (b)c.b;
                    synchronized (b) {
                        final String g2 = new c1.c(c.b).g(v);
                        monitorexit(b);
                        b = (b)DiscoveryUnit.a(discoveryUnit, null, null, null, g2, 4128767);
                        Object o4;
                        if (component2 != null) {
                            o4 = b$a.a(component2);
                        }
                        else if (subreddit != null) {
                            o4 = b$a.c((UserSubreddit)subreddit);
                        }
                        else {
                            o4 = new h$a((Integer)null);
                        }
                        final i i = new i(d2, g, value, "", (String)discoveryUnitListing, (String)a, (String)publicDescription, (h91.b)o4, booleanValue, booleanValue2, (List)c2, f, n, k1, carousel_LINK_LISTING, (DiscoveryUnit)b, n2, a0$a);
                        final ArrayList list = new ArrayList<Object>(m.P0((Iterable)component1, 10));
                        final Iterator<Pair> iterator = component1.iterator();
                        while (iterator.hasNext()) {
                            list.add(iterator.next().getFirst());
                        }
                        final Object o2 = new e$b(discoveryUnit, (l00.b)i, list, (List)null, (List)null, 24);
                        return (h00.e)o2;
                    }
                }
            }
        }
    }
    
    public static h00.e b(final DiscoveryUnitListingMapper discoveryUnitListingMapper, final DiscoveryUnit discoveryUnit, final List list, final CarouselCollectionState carouselCollectionState, final a0$a a0$a, final ja0.c c, final e e, final long n, final ka0.a a, final FilterStrategy filterStrategy, final Map map, final b b) {
        discoveryUnitListingMapper.getClass();
        ah2.f.f((Object)list, "subreddits");
        ah2.f.f((Object)c, "templateManager");
        ah2.f.f((Object)e, "numberFormatter");
        ah2.f.f((Object)a, "colorGenerator");
        ah2.f.f((Object)filterStrategy, "filterStrategy");
        ah2.f.f((Object)map, "rankDeltaMap");
        ah2.f.f((Object)b, "resourceProvider");
        final boolean contains = discoveryUnit.s.contains("description");
        final boolean b2 = discoveryUnit.s.contains("subscribe_button") || discoveryUnit.j();
        final boolean contains2 = discoveryUnit.s.contains("show_rank");
        final boolean contains3 = discoveryUnit.s.contains("show_direction");
        final int n2 = DiscoveryUnitListingMapper.a.a[discoveryUnit.r.ordinal()];
        Listable$Type listable$Type;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        throw new RuntimeException("Not a valid discovery unit layout");
                    }
                    listable$Type = Listable$Type.CAROUSEL_GRID_LIST_SUBREDDIT_LISTING;
                }
                else {
                    listable$Type = Listable$Type.CAROUSEL_HERO_SUBREDDIT_LISTING;
                }
            }
            else if (discoveryUnit.s.contains("wide")) {
                listable$Type = Listable$Type.CAROUSEL_MEDIUM_SUBREDDIT_LISTING;
            }
            else {
                listable$Type = Listable$Type.CAROUSEL_SMALL_SUBREDDIT_LISTING;
            }
        }
        else {
            listable$Type = Listable$Type.CAROUSEL_LARGE_SUBREDDIT_LISTING;
        }
        final g u0 = kotlin.sequences.b.U0((k)kotlin.sequences.b.U0((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (zg2.l)new DiscoveryUnitListingMapper$mapSubredditsToDiscoveryUnitResult$items$1(discoveryUnit)), (zg2.l)new DiscoveryUnitListingMapper$mapSubredditsToDiscoveryUnitResult$items$2(carouselCollectionState));
        final int n3 = DiscoveryUnitListingMapper.a.b[filterStrategy.ordinal()];
        Object u2 = u0;
        if (n3 != 1) {
            if (n3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            u2 = kotlin.sequences.b.U0((k)u0, (zg2.l)DiscoveryUnitListingMapper$mapSubredditsToDiscoveryUnitResult$items$3$1.INSTANCE);
        }
        final List k1 = kotlin.sequences.b.k1(kotlin.sequences.b.i1((k)u2, 10));
        Map x1;
        if (contains2) {
            final ArrayList list2 = new ArrayList(m.P0((Iterable)k1, 10));
            final Iterator iterator = k1.iterator();
            int n4 = 0;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                final int n5 = n4 + 1;
                if (n4 < 0) {
                    ah2.c.x0();
                    throw null;
                }
                d.A(((Subreddit)next).getKindWithId(), Integer.valueOf(n5), list2);
                n4 = n5;
            }
            x1 = kotlin.collections.c.X1((List)list2);
        }
        else {
            x1 = null;
        }
        Map x2;
        if (contains3) {
            final ArrayList list3 = new ArrayList<Pair>(m.P0((Iterable)k1, 10));
            final Iterator iterator2 = k1.iterator();
            int n6 = 0;
            while (iterator2.hasNext()) {
                final Object next2 = iterator2.next();
                if (n6 < 0) {
                    ah2.c.x0();
                    throw null;
                }
                final Subreddit subreddit = (Subreddit)next2;
                final String kindWithId = subreddit.getKindWithId();
                final Integer n7 = map.get(subreddit.getKindWithId());
                int intValue;
                if (n7 != null) {
                    intValue = n7;
                }
                else {
                    intValue = 0;
                }
                list3.add(new Pair((Object)kindWithId, (Object)(intValue >= 0)));
                ++n6;
            }
            x2 = kotlin.collections.c.X1((List)list3);
        }
        else {
            x2 = null;
        }
        final ArrayList list4 = new ArrayList<String>(m.P0((Iterable)k1, 10));
        final Iterator iterator3 = k1.iterator();
        int n8 = 0;
        while (iterator3.hasNext()) {
            final Object next3 = iterator3.next();
            if (n8 < 0) {
                ah2.c.x0();
                throw null;
            }
            list4.add(discoveryUnitListingMapper.d.b(1, 1000 * ((Subreddit)next3).getCreatedUtc()));
            ++n8;
        }
        final ArrayList v0 = ae.b.v0(k1, contains, e, a, b2, x1, x2, b, list4);
        Object o;
        if (v0.size() < 3) {
            o = new e$a(discoveryUnit);
        }
        else {
            o = new e$b(discoveryUnit, (l00.b)new l00.f(c.d(discoveryUnit), contains, false, (List)v0, discoveryUnit.f, n, discoveryUnit.s.contains("hide_title") ^ true, listable$Type, discoveryUnit, (Integer)null, a0$a), (ArrayList)null, list, (List)null, 20);
        }
        return (h00.e)o;
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/discoveryunits/ui/DiscoveryUnitListingMapper$FilterStrategy;", "", "(Ljava/lang/String;I)V", "SEARCH", "FEEDS", "mapper_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum FilterStrategy
    {
        FEEDS, 
        SEARCH;
    }
}
