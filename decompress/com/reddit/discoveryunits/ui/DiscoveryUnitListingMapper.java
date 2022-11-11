// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui;

import kotlin.Metadata;
import bj2.g;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.domain.model.CarouselCollectionState;
import java.util.Iterator;
import com.reddit.discoveryunits.ui.carousel.SubheaderIcon;
import bj2.v;
import com.reddit.domain.model.Account;
import com.reddit.domain.model.Subreddit;
import d00.e$b;
import java.util.ArrayList;
import ig2.m;
import h00.i;
import b91.h$a;
import b91.b$a;
import com.reddit.discoveryunits.data.OrderBy;
import java.util.List;
import com.reddit.discoveryunits.ui.carousel.CarouselItemLayout;
import com.reddit.listing.model.Listable$Type;
import h.t;
import java.util.LinkedHashMap;
import java.util.Map;
import d00.e$a;
import bj2.k;
import hg2.j;
import com.reddit.domain.model.discovery.DiscoveryUnitListing$LinkCause;
import com.reddit.domain.model.Link;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.Pair;
import rg2.p;
import v12.l;
import m20.b;
import xd0.s$a;
import com.reddit.domain.model.discovery.DiscoveryUnitListing;
import javax.inject.Inject;
import sg2.e;
import v12.f;
import bv.c;
import com.reddit.screens.listing.mapper.a;

public final class DiscoveryUnitListingMapper
{
    public final com.reddit.screens.listing.mapper.a a;
    public final cv.a b;
    public final c c;
    public final f d;
    
    @Inject
    public DiscoveryUnitListingMapper(final com.reddit.screens.listing.mapper.a a, final cv.a b, final c c, final f d) {
        e.f((Object)a, "linkMapper");
        e.f((Object)b, "adsFeatures");
        e.f((Object)c, "voteableAnalyticsDomainMapper");
        e.f((Object)d, "dateUtilDelegate");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static d00.e a(final DiscoveryUnitListingMapper discoveryUnitListingMapper, final DiscoveryUnit discoveryUnit, DiscoveryUnitListing discoveryUnitListing, final s$a s$a, final ba0.c c, final zk0.e e, b b, l publicDescription, final long n, Integer n2, boolean booleanValue, boolean booleanValue2, p subreddit, boolean b2, Integer a, int n3) {
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
        e.f((Object)discoveryUnitListing, "listing");
        e.f((Object)c, "templateManager");
        e.f((Object)e, "numberFormatter");
        e.f((Object)b, "resourceProvider");
        e.f((Object)publicDescription, "relativeTimestamps");
        final List component1 = discoveryUnitListing.component1();
        final Subreddit component2 = discoveryUnitListing.component2();
        final Account component3 = discoveryUnitListing.component3();
        if (component3 != null) {
            subreddit = component3.getSubreddit();
        }
        else {
            subreddit = null;
        }
        final Pair pair = (Pair)CollectionsKt___CollectionsKt.C3(component1);
        if (pair != null) {
            final Link link = (Link)pair.component1();
            final String cause = ((DiscoveryUnitListing$LinkCause)pair.component2()).getCause();
            if (cause != null) {
                c.b(discoveryUnit, "first_item.cause", cause);
                final j a2 = j.a;
            }
            final o20.a a3 = o20.a.a;
            final String subredditNamePrefixed = link.getSubredditNamePrefixed();
            a3.getClass();
            c.b(discoveryUnit, "first_item.subreddit.visual_name", o20.a.a(subredditNamePrefixed));
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
        final ArrayList d = discoveryUnitListingMapper.a.d(CollectionsKt___CollectionsKt.j4((Iterable)component1, Math.min(n3, 10)), component2, component3, discoveryUnit, booleanValue, booleanValue2, (p)o, b2, publicDescription, b);
        final int size = d.size();
        final v s1 = kotlin.sequences.b.s1((k)CollectionsKt___CollectionsKt.q3((Iterable)component1), (rg2.l)DiscoveryUnitListingMapper$mapListingToDiscoveryUnitResult$linksAfterCarousel$1.INSTANCE);
        final Integer a6 = discoveryUnit.A;
        if (a6 != null) {
            n3 = a6;
        }
        else {
            n3 = 0;
        }
        final List a7 = kotlin.sequences.b.A1(kotlin.sequences.b.h1(kotlin.sequences.b.x1((k)s1, n3 + size), size));
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
            return (d00.e)o2;
        }
        final Link link2 = (Link)((Pair)CollectionsKt___CollectionsKt.A3(component1)).getFirst();
        Label_0559: {
            if (component2 != null) {
                publicDescription = (l)component2.getPublicDescription();
                if (publicDescription != null) {
                    break Label_0559;
                }
            }
            Object o3;
            if (subreddit != null) {
                o3 = subreddit.getPublicDescription();
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
                    b3 = subreddit.getUserIsSubscriber();
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
                final Integer subscribers2 = subreddit.getSubscribers();
                if (subscribers2 != null) {
                    longValue = subscribers2;
                    break Label_0661;
                }
            }
            longValue = 0L;
        }
        a = (Integer)b.a(2131953624, new Object[] { e.g(longValue, false) });
        if (component2 == null || (discoveryUnitListing = (DiscoveryUnitListing)component2.getDisplayNamePrefixed()) == null) {
            if (subreddit != null) {
                discoveryUnitListing = (DiscoveryUnitListing)subreddit.getDisplayNamePrefixed();
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
                    b4 = subreddit.getUserIsSubscriber();
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
                String e2;
                if ((e2 = p16) == null) {
                    e2 = "";
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
                final t t = new t((Map)map);
                String p17;
                if ((p17 = discoveryUnit.p) == null) {
                    p17 = "";
                }
                final String e2 = t.e(p17);
                if (e2 == null) {
                    synchronized (c.b) {
                        final t t2 = new t((Map)c.b);
                        String p18;
                        if ((p18 = discoveryUnit.p) == null) {
                            p18 = "";
                        }
                        e.c((Object)t2.e(p18));
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
                        final String e3 = new t((Map)c.b).e(v);
                        monitorexit(b);
                        b = (b)DiscoveryUnit.a(discoveryUnit, (CarouselItemLayout)null, (List)null, (OrderBy)null, e3, 4128767);
                        Object o4;
                        if (component2 != null) {
                            o4 = b$a.a(component2);
                        }
                        else if (subreddit != null) {
                            o4 = b$a.c(subreddit);
                        }
                        else {
                            o4 = new h$a((Integer)null);
                        }
                        final i i = new i(d2, e2, value, "", (String)discoveryUnitListing, (String)a, (String)publicDescription, (b91.b)o4, booleanValue, booleanValue2, (List)d, f, n, a7, carousel_LINK_LISTING, (DiscoveryUnit)b, n2, s$a);
                        final ArrayList list = new ArrayList<Object>(m.c3((Iterable)component1, 10));
                        final Iterator iterator = component1.iterator();
                        while (iterator.hasNext()) {
                            list.add(((Pair)iterator.next()).getFirst());
                        }
                        final Object o2 = new e$b(discoveryUnit, (h00.b)i, list, (List)null, (List)null, 24);
                        return (d00.e)o2;
                    }
                }
            }
        }
    }
    
    public static d00.e b(final DiscoveryUnitListingMapper discoveryUnitListingMapper, final DiscoveryUnit discoveryUnit, final List list, final CarouselCollectionState carouselCollectionState, final s$a s$a, final ba0.c c, final zk0.e e, final long n, final ca0.a a, final FilterStrategy filterStrategy, final Map map, final b b) {
        discoveryUnitListingMapper.getClass();
        e.f((Object)list, "subreddits");
        e.f((Object)c, "templateManager");
        e.f((Object)e, "numberFormatter");
        e.f((Object)a, "colorGenerator");
        e.f((Object)filterStrategy, "filterStrategy");
        e.f((Object)map, "rankDeltaMap");
        e.f((Object)b, "resourceProvider");
        final boolean contains = discoveryUnit.s.contains("description");
        final boolean b2 = discoveryUnit.s.contains("subscribe_button") || e.a((Object)discoveryUnit.h, (Object)"top_subreddits");
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
        final g j1 = kotlin.sequences.b.j1((k)kotlin.sequences.b.j1((k)CollectionsKt___CollectionsKt.q3((Iterable)list), (rg2.l)new DiscoveryUnitListingMapper$mapSubredditsToDiscoveryUnitResult$items$1(discoveryUnit)), (rg2.l)new DiscoveryUnitListingMapper$mapSubredditsToDiscoveryUnitResult$items$2(carouselCollectionState));
        final int n3 = DiscoveryUnitListingMapper.a.b[filterStrategy.ordinal()];
        Object j2 = j1;
        if (n3 != 1) {
            if (n3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            j2 = kotlin.sequences.b.j1((k)j1, (rg2.l)DiscoveryUnitListingMapper$mapSubredditsToDiscoveryUnitResult$items$3$1.INSTANCE);
        }
        final List a2 = kotlin.sequences.b.A1(kotlin.sequences.b.x1((k)j2, 10));
        Map g1;
        if (contains2) {
            final ArrayList list2 = new ArrayList(m.c3((Iterable)a2, 10));
            final Iterator iterator = a2.iterator();
            int n4 = 0;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                final int n5 = n4 + 1;
                if (n4 < 0) {
                    lw0.b.I2();
                    throw null;
                }
                aw.b.s(((Subreddit)next).getKindWithId(), Integer.valueOf(n5), list2);
                n4 = n5;
            }
            g1 = kotlin.collections.c.g1((List)list2);
        }
        else {
            g1 = null;
        }
        Map g2;
        if (contains3) {
            final ArrayList list3 = new ArrayList<Pair>(m.c3((Iterable)a2, 10));
            final Iterator iterator2 = a2.iterator();
            int n6 = 0;
            while (iterator2.hasNext()) {
                final Object next2 = iterator2.next();
                if (n6 < 0) {
                    lw0.b.I2();
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
            g2 = kotlin.collections.c.g1((List)list3);
        }
        else {
            g2 = null;
        }
        final ArrayList list4 = new ArrayList<String>(m.c3((Iterable)a2, 10));
        final Iterator iterator3 = a2.iterator();
        int n8 = 0;
        while (iterator3.hasNext()) {
            final Object next3 = iterator3.next();
            if (n8 < 0) {
                lw0.b.I2();
                throw null;
            }
            list4.add(discoveryUnitListingMapper.d.b(1, 1000 * ((Subreddit)next3).getCreatedUtc()));
            ++n8;
        }
        final ArrayList a3 = nn0.a.a0(a2, contains, e, a, b2, g1, g2, b, list4);
        Object o;
        if (a3.size() < 3) {
            o = new e$a(discoveryUnit);
        }
        else {
            o = new e$b(discoveryUnit, (h00.b)new h00.f(c.d(discoveryUnit), contains, false, (List)a3, discoveryUnit.f, n, discoveryUnit.s.contains("hide_title") ^ true, listable$Type, discoveryUnit, (Integer)null, s$a), (ArrayList)null, list, (List)null, 20);
        }
        return (d00.e)o;
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/discoveryunits/ui/DiscoveryUnitListingMapper$FilterStrategy;", "", "(Ljava/lang/String;I)V", "SEARCH", "FEEDS", "mapper_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum FilterStrategy
    {
        FEEDS, 
        SEARCH;
    }
}
