// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.reddit.domain.model.ILink;
import com.reddit.domain.model.listing.Listing;
import com.reddit.listing.model.sort.SortTimeFrame;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import tg2.c;
import javax.inject.Inject;
import pj2.u;
import kotlinx.coroutines.channels.BufferOverflow;
import ah2.f;
import kotlinx.coroutines.flow.h;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortType;
import ge0.a0;
import db0.c0;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import ge0.w;

public final class RedditPopularPreloadListingRepository implements w
{
    public final RemoteGqlLinkDataSource a;
    public final c0 b;
    public final a0 c;
    public boolean d;
    public SortType e;
    public String f;
    public ListingViewMode g;
    public final h h;
    
    @Inject
    public RedditPopularPreloadListingRepository(final RemoteGqlLinkDataSource a, final c0 b, final a0 c) {
        ah2.f.f((Object)a, "remoteGql");
        ah2.f.f((Object)b, "startupFeatures");
        ah2.f.f((Object)c, "preferenceRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = u.g(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }
    
    public final Object a(c<? super j> c) {
        RedditPopularPreloadListingRepository$initiatePreload.RedditPopularPreloadListingRepository$initiatePreload$1 redditPopularPreloadListingRepository$initiatePreload$1 = null;
        Label_0045: {
            if (c instanceof RedditPopularPreloadListingRepository$initiatePreload.RedditPopularPreloadListingRepository$initiatePreload$1) {
                redditPopularPreloadListingRepository$initiatePreload$1 = (RedditPopularPreloadListingRepository$initiatePreload.RedditPopularPreloadListingRepository$initiatePreload$1)c;
                final int label = redditPopularPreloadListingRepository$initiatePreload$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPopularPreloadListingRepository$initiatePreload$1.label = label + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            redditPopularPreloadListingRepository$initiatePreload$1 = new RedditPopularPreloadListingRepository$initiatePreload.RedditPopularPreloadListingRepository$initiatePreload$1(this, (c)c);
        }
        Object o = redditPopularPreloadListingRepository$initiatePreload$1.result;
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
                Label_0369: {
                    if (label2 != 2) {
                        if (label2 == 3) {
                            aj2.c.Q0(o);
                            break Label_0369;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c = redditPopularPreloadListingRepository$initiatePreload$1.L$0;
                    while (true) {
                        try {
                            aj2.c.Q0(o);
                            return j.a;
                            RedditPopularPreloadListingRepository l$0 = (RedditPopularPreloadListingRepository)(c = redditPopularPreloadListingRepository$initiatePreload$1.L$0);
                            aj2.c.Q0(o);
                            Label_0257: {
                                break Label_0257;
                                aj2.c.Q0(o);
                                c = this.c;
                                this.g = ((a0)c).V3("popular", ((a0)c).C3());
                                this.e = SortType.HOT;
                                final String filter = this.c.w3().getFilter();
                                this.f = filter;
                                try {
                                    final RemoteGqlLinkDataSource a = this.a;
                                    final SortType e = this.e;
                                    final Integer n = new Integer(7);
                                    final ListingViewMode g = this.g;
                                    redditPopularPreloadListingRepository$initiatePreload$1.L$0 = this;
                                    redditPopularPreloadListingRepository$initiatePreload$1.label = 1;
                                    o = a.k(e, null, n, filter, g, (c<? super Listing<? extends ILink>>)redditPopularPreloadListingRepository$initiatePreload$1);
                                    if (o == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    l$0 = this;
                                    final Listing listing = (Listing)o;
                                    final h h = l$0.h;
                                    redditPopularPreloadListingRepository$initiatePreload$1.L$0 = l$0;
                                    redditPopularPreloadListingRepository$initiatePreload$1.label = 2;
                                    c = l$0;
                                    if (h.emit((Object)listing, (c)redditPopularPreloadListingRepository$initiatePreload$1) == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    return j.a;
                                }
                                catch (Exception c) {
                                    c = this;
                                }
                            }
                            final h h2 = ((RedditPopularPreloadListingRepository)c).h;
                            c = new Listing(null, null, null, null, null, false, null, 127, null);
                            redditPopularPreloadListingRepository$initiatePreload$1.L$0 = null;
                            redditPopularPreloadListingRepository$initiatePreload$1.label = 3;
                            iftrue(Label_0369:)(h2.emit(c, (c)redditPopularPreloadListingRepository$initiatePreload$1) != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
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
    
    public final h b() {
        return this.h;
    }
    
    public final boolean c(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final ListingViewMode listingViewMode) {
        ah2.f.f((Object)sortType, "sort");
        ah2.f.f((Object)s, "geoFilter");
        return !this.d && this.e == sortType && sortTimeFrame == null && ah2.f.a((Object)this.f, (Object)s) && this.g == listingViewMode;
    }
    
    public final void dispose() {
        this.d = true;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
