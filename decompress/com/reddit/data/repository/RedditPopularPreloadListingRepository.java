// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.listing.model.sort.SortTimeFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.reddit.domain.model.listing.Listing;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import javax.inject.Inject;
import dg.l0;
import kotlinx.coroutines.channels.BufferOverflow;
import ng2.e;
import kotlinx.coroutines.flow.g;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortType;
import xd0.s;
import wa0.a0;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import xd0.o;

public final class RedditPopularPreloadListingRepository implements o
{
    public final RemoteGqlLinkDataSource a;
    public final a0 b;
    public final s c;
    public boolean d;
    public SortType e;
    public String f;
    public ListingViewMode g;
    public final g h;
    
    @Inject
    public RedditPopularPreloadListingRepository(final RemoteGqlLinkDataSource a, final a0 b, final s c) {
        ng2.e.f((Object)a, "remoteGql");
        ng2.e.f((Object)b, "startupFeatures");
        ng2.e.f((Object)c, "preferenceRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = l0.m(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }
    
    @Override
    public final Object a(c<? super j> f) {
        RedditPopularPreloadListingRepository$initiatePreload$1 redditPopularPreloadListingRepository$initiatePreload$1 = null;
        Label_0049: {
            if (f instanceof RedditPopularPreloadListingRepository$initiatePreload$1) {
                redditPopularPreloadListingRepository$initiatePreload$1 = (RedditPopularPreloadListingRepository$initiatePreload$1)f;
                final int label = redditPopularPreloadListingRepository$initiatePreload$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPopularPreloadListingRepository$initiatePreload$1.label = label + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            redditPopularPreloadListingRepository$initiatePreload$1 = new RedditPopularPreloadListingRepository$initiatePreload$1(this, (c)f);
        }
        Object o = redditPopularPreloadListingRepository$initiatePreload$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPopularPreloadListingRepository$initiatePreload$1.label;
        Label_0140: {
            if (label2 == 0) {
                break Label_0140;
            }
            Label_0121: {
                if (label2 == 1) {
                    break Label_0121;
                }
                Label_0368: {
                    if (label2 != 2) {
                        if (label2 == 3) {
                            cg.d.b4(o);
                            break Label_0368;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = redditPopularPreloadListingRepository$initiatePreload$1.L$0;
                Label_0261_Outer:
                    while (true) {
                        try {
                            cg.d.b4(o);
                            return j.a;
                            final g h = ((RedditPopularPreloadListingRepository)f).h;
                            f = new Listing((List)null, (String)null, (String)null, (String)null, (String)null, false, (List)null, 127, (DefaultConstructorMarker)null);
                            redditPopularPreloadListingRepository$initiatePreload$1.L$0 = null;
                            redditPopularPreloadListingRepository$initiatePreload$1.label = 3;
                            iftrue(Label_0368:)(h.emit(f, (c)redditPopularPreloadListingRepository$initiatePreload$1) != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            cg.d.b4(o);
                            f = this.c;
                            this.g = ((s)f).z("popular", ((s)f).h());
                            this.e = SortType.HOT;
                            f = this.c.a().getFilter();
                            this.f = (String)f;
                            while (true) {
                                try {
                                    final RemoteGqlLinkDataSource a = this.a;
                                    final SortType e = this.e;
                                    final Integer n = new Integer(7);
                                    final ListingViewMode g = this.g;
                                    redditPopularPreloadListingRepository$initiatePreload$1.L$0 = this;
                                    redditPopularPreloadListingRepository$initiatePreload$1.label = 1;
                                    o = a.k(e, (SortTimeFrame)null, n, (String)f, g, (c)redditPopularPreloadListingRepository$initiatePreload$1);
                                    if (o == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    final RedditPopularPreloadListingRepository l$0 = this;
                                    final Listing listing = (Listing)o;
                                    final g h2 = l$0.h;
                                    redditPopularPreloadListingRepository$initiatePreload$1.L$0 = l$0;
                                    redditPopularPreloadListingRepository$initiatePreload$1.label = 2;
                                    f = l$0;
                                    if (h2.emit((Object)listing, (c)redditPopularPreloadListingRepository$initiatePreload$1) == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    return j.a;
                                }
                                catch (Exception f) {
                                    f = this;
                                }
                                continue Label_0261_Outer;
                                final RedditPopularPreloadListingRepository l$0 = (RedditPopularPreloadListingRepository)(f = redditPopularPreloadListingRepository$initiatePreload$1.L$0);
                                cg.d.b4(o);
                                continue;
                            }
                        }
                        catch (final Exception ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    @Override
    public final g b() {
        return this.h;
    }
    
    @Override
    public final boolean c(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final ListingViewMode listingViewMode) {
        ng2.e.f((Object)sortType, "sort");
        ng2.e.f((Object)s, "geoFilter");
        return !this.d && this.e == sortType && sortTimeFrame == null && ng2.e.a((Object)this.f, (Object)s) && this.g == listingViewMode;
    }
    
    @Override
    public final void dispose() {
        this.d = true;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
