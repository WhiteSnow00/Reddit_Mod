// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.listing.model.sort.SortTimeFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.reddit.domain.model.listing.Listing;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import javax.inject.Inject;
import a92.b;
import kotlinx.coroutines.channels.BufferOverflow;
import sg2.e;
import kotlinx.coroutines.flow.f;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortType;
import xd0.s;
import va0.b0;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import xd0.o;

public final class RedditPopularPreloadListingRepository implements o
{
    public final RemoteGqlLinkDataSource a;
    public final b0 b;
    public final s c;
    public boolean d;
    public SortType e;
    public String f;
    public ListingViewMode g;
    public final f h;
    
    @Inject
    public RedditPopularPreloadListingRepository(final RemoteGqlLinkDataSource a, final b0 b, final s c) {
        sg2.e.f((Object)a, "remoteGql");
        sg2.e.f((Object)b, "startupFeatures");
        sg2.e.f((Object)c, "preferenceRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = a92.b.l(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }
    
    public final Object a(c<? super j> o) {
        RedditPopularPreloadListingRepository$initiatePreload$1 redditPopularPreloadListingRepository$initiatePreload$1 = null;
        Label_0045: {
            if (o instanceof RedditPopularPreloadListingRepository$initiatePreload$1) {
                redditPopularPreloadListingRepository$initiatePreload$1 = (RedditPopularPreloadListingRepository$initiatePreload$1)o;
                final int label = redditPopularPreloadListingRepository$initiatePreload$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPopularPreloadListingRepository$initiatePreload$1.label = label + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            redditPopularPreloadListingRepository$initiatePreload$1 = new RedditPopularPreloadListingRepository$initiatePreload$1(this, (c)o);
        }
        Object o2 = redditPopularPreloadListingRepository$initiatePreload$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPopularPreloadListingRepository$initiatePreload$1.label;
        Label_0134: {
            if (label2 == 0) {
                break Label_0134;
            }
            Label_0114: {
                if (label2 == 1) {
                    break Label_0114;
                }
                Label_0368: {
                    if (label2 != 2) {
                        if (label2 == 3) {
                            yd.b.k0(o2);
                            break Label_0368;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o = redditPopularPreloadListingRepository$initiatePreload$1.L$0;
                    while (true) {
                        try {
                            yd.b.k0(o2);
                            return j.a;
                            RedditPopularPreloadListingRepository l$0 = (RedditPopularPreloadListingRepository)(o = redditPopularPreloadListingRepository$initiatePreload$1.L$0);
                            yd.b.k0(o2);
                            Label_0256: {
                                break Label_0256;
                                o = ((RedditPopularPreloadListingRepository)o).h;
                                final Listing listing = new Listing((List)null, (String)null, (String)null, (String)null, (String)null, false, (List)null, 127, (DefaultConstructorMarker)null);
                                redditPopularPreloadListingRepository$initiatePreload$1.L$0 = null;
                                redditPopularPreloadListingRepository$initiatePreload$1.label = 3;
                                iftrue(Label_0368:)(((f)o).emit((Object)listing, (c)redditPopularPreloadListingRepository$initiatePreload$1) != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                yd.b.k0(o2);
                                o = this.c;
                                this.g = ((s)o).D("popular", ((s)o).l());
                                this.e = SortType.HOT;
                                final String filter = this.c.c().getFilter();
                                this.f = filter;
                                try {
                                    final RemoteGqlLinkDataSource a = this.a;
                                    final SortType e = this.e;
                                    final Integer n = new Integer(7);
                                    final ListingViewMode g = this.g;
                                    redditPopularPreloadListingRepository$initiatePreload$1.L$0 = this;
                                    redditPopularPreloadListingRepository$initiatePreload$1.label = 1;
                                    o2 = a.k(e, (SortTimeFrame)null, n, filter, g, (c)redditPopularPreloadListingRepository$initiatePreload$1);
                                    if (o2 == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    l$0 = this;
                                    final Listing listing2 = (Listing)o2;
                                    final f h = l$0.h;
                                    redditPopularPreloadListingRepository$initiatePreload$1.L$0 = l$0;
                                    redditPopularPreloadListingRepository$initiatePreload$1.label = 2;
                                    o = l$0;
                                    if (h.emit((Object)listing2, (c)redditPopularPreloadListingRepository$initiatePreload$1) == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    return j.a;
                                }
                                catch (Exception o) {
                                    o = this;
                                }
                            }
                            continue;
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
    
    public final f b() {
        return this.h;
    }
    
    public final boolean c(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final ListingViewMode listingViewMode) {
        sg2.e.f((Object)sortType, "sort");
        sg2.e.f((Object)s, "geoFilter");
        return !this.d && this.e == sortType && sortTimeFrame == null && sg2.e.a((Object)this.f, (Object)s) && this.g == listingViewMode;
    }
    
    public final void dispose() {
        this.d = true;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
