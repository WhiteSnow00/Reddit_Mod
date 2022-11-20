// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import x12.p;
import x12.p$a;
import com.reddit.tracking.TrackerParams$TrackerType;
import o12.b;
import x12.q;
import ng2.e;
import com.reddit.domain.model.Result;
import java.util.ArrayList;
import com.reddit.domain.model.listing.RemovalReason;
import com.reddit.domain.model.listing.ContentRemovalMessage;
import com.reddit.domain.model.ILink;
import com.reddit.ads.domain.DisplaySource;
import com.reddit.data.repository.RedditLinkRepository$getLinkStreamById$$inlined$map$1;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.domain.repository.ModQueueSortingType;
import mg2.l;
import com.reddit.domain.model.vote.VoteDirection;
import com.reddit.domain.model.listing.Listing;
import com.reddit.domain.model.media.FbpMediaType;
import com.reddit.domain.model.media.VideoContext;
import java.util.List;
import od0.d;
import com.reddit.frontpage.presentation.link.DistinguishType;
import java.util.LinkedHashMap;
import com.reddit.listing.model.sort.HistorySortType;
import java.util.Map;
import af2.c0;
import va0.i;
import s12.c;
import android.content.Context;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.domain.model.Link;
import af2.n;
import com.reddit.data.repository.RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1;
import af2.a;

public interface j
{
    af2.a A(final String p0);
    
    RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1 B(final String p0);
    
    n<Link> C(final String p0);
    
    c0 D(final String p0, final SortType p1, final SortTimeFrame p2, final String p3, final String p4, final boolean p5, final ListingViewMode p6, final Context p7, final c p8, final i p9, final va0.j p10);
    
    c0<Map<String, Link>> E(final String p0, final String p1, final String p2);
    
    Object F(final String p0, final gg2.c<? super cg2.j> p1);
    
    Object G(final String p0, final gg2.c p1);
    
    c0<Boolean> H(final String p0, final String p1);
    
    c0 I(final String p0, final HistorySortType p1, final String p2, final boolean p3, final Context p4, final c p5);
    
    af2.a J();
    
    c0 K(final String p0, final LinkedHashMap p1);
    
    Object L(final Link p0, final gg2.c<? super cg2.j> p1);
    
    af2.a M(final String p0, final DistinguishType p1);
    
    Object N(final String p0, final int p1, final gg2.c<? super cg2.j> p2);
    
    Object O(final String p0, final gg2.c<? super cg2.j> p1);
    
    af2.a P(final String p0);
    
    Object Q(final Link p0, final gg2.c<? super Boolean> p1);
    
    n R(final SortTimeFrame p0, final SortType p1, final String p2);
    
    Object S(final String p0, final d p1, final boolean p2, final String p3, final gg2.c p4);
    
    af2.a T(final String p0);
    
    c0 U(final SortType p0, final SortTimeFrame p1, final String p2, final String p3, final boolean p4, final ListingViewMode p5, final String p6, final Context p7, final c p8, final List p9, final Integer p10, final i p11, final va0.j p12, final boolean p13);
    
    Object V(final String p0, final VideoContext p1, final boolean p2, final FbpMediaType p3, final gg2.c<? super Listing<Link>> p4);
    
    void W();
    
    c0 X(final String p0, final String p1, final boolean p2, final Context p3, final c p4, final String p5, final i p6, final va0.j p7);
    
    n Y(final SortTimeFrame p0, final SortType p1, final String p2);
    
    c0<Boolean> Z(final String p0, final String p1);
    
    c0<Link> a(final String p0);
    
    cg2.j a0(final String p0, final VoteDirection p1);
    
    void b(final String p0);
    
    af2.a b0(final String p0, final VoteDirection p1);
    
    af2.a c();
    
    af2.a c0(final String p0);
    
    af2.a d(final String p0);
    
    Object d0(final String p0, final String p1, final String p2, final boolean p3, final String p4, final boolean p5, final l<? super Link, cg2.j> p6, final gg2.c<? super Listing<Link>> p7);
    
    c0<Boolean> delete(final String p0);
    
    Object e(final String p0, final ModQueueSortingType p1, final String p2, final gg2.c<? super Listing<Link>> p3);
    
    VoteDirection e0(final String p0);
    
    Object f(final String p0, final gg2.c<? super UpdateResponse> p1);
    
    af2.a f0(final String p0, final boolean p1);
    
    af2.a follow(final String p0, final boolean p1);
    
    RedditLinkRepository$getLinkStreamById$$inlined$map$1 g(final String p0);
    
    af2.a g0(final String p0);
    
    Object getLinkTitle(final String p0, final gg2.c<? super String> p1);
    
    Object h(final String p0, final VoteDirection p1, final gg2.c<? super UpdateResponse> p2);
    
    Object h0(final String p0, final VideoContext p1, final boolean p2, final String p3, final gg2.c<? super Listing<Link>> p4);
    
    Object i(final String p0, final gg2.c<? super UpdateResponse> p1);
    
    c0<Listing<Link>> i0(final List<String> p0);
    
    n<Listing<Link>> j();
    
    n<Listing<Link>> j0(final String p0);
    
    c0 k(final SortType p0, final SortTimeFrame p1, final String p2, final String p3, final String p4);
    
    n<Listing<Link>> k0(final SortType p0, final SortTimeFrame p1);
    
    c0<Listing<ILink>> l(final DisplaySource p0, final SortType p1, final SortTimeFrame p2, final String p3, final String p4, final boolean p5, final ListingViewMode p6, final String p7, final boolean p8, final Context p9, final c p10, final Integer p11, final i<ILink> p12, final va0.j<ILink> p13);
    
    Object l0(final gg2.c<? super Boolean> p0);
    
    n<Listing<Link>> m(final String p0);
    
    af2.a n(final String p0);
    
    Object o(final Link p0, final gg2.c<? super Boolean> p1);
    
    n p(final SortTimeFrame p0, final SortType p1, final String p2);
    
    c0<Listing<Link>> q(final String p0, final SortType p1, final SortTimeFrame p2, final String p3, final Integer p4, final String p5, final boolean p6, final ListingViewMode p7, final Context p8, final c p9, final String p10, final String p11, final i<Link> p12, final va0.j<Link> p13);
    
    af2.a r(final String p0);
    
    Object s(final String p0, final gg2.c<? super Listing<Link>> p1);
    
    af2.a sendRemovalMessage(final ContentRemovalMessage p0);
    
    af2.a sendRemovalReason(final RemovalReason p0);
    
    c0 t(final ArrayList p0);
    
    af2.a u(final String p0);
    
    Object v(final Link p0, final String p1, final boolean p2, final boolean p3, final gg2.c<? super Result<Link>> p4);
    
    c0<List<Link>> w(final String p0);
    
    af2.a x(final String p0);
    
    n<Listing<Link>> y(final SortType p0, final SortTimeFrame p1, final String p2, final String p3);
    
    af2.a z(final String p0);
    
    public static final class a
    {
        public static c0 a(final j j, SortType sortType, SortTimeFrame sortTimeFrame, String s, String s2, boolean b, ListingViewMode listingViewMode, final boolean b2, String s3, final Context context, final c c, List list, Integer n, i i, va0.j k, boolean b3, final int n2) {
            if ((n2 & 0x1) != 0x0) {
                sortType = null;
            }
            if ((n2 & 0x2) != 0x0) {
                sortTimeFrame = null;
            }
            if ((n2 & 0x4) != 0x0) {
                s = null;
            }
            if ((n2 & 0x8) != 0x0) {
                s2 = null;
            }
            if ((n2 & 0x10) != 0x0) {
                b = false;
            }
            if ((n2 & 0x20) != 0x0) {
                listingViewMode = null;
            }
            if ((n2 & 0x80) != 0x0) {
                s3 = null;
            }
            if ((n2 & 0x400) != 0x0) {
                list = null;
            }
            if ((n2 & 0x800) != 0x0) {
                n = null;
            }
            if ((n2 & 0x1000) != 0x0) {
                i = null;
            }
            if ((n2 & 0x2000) != 0x0) {
                k = null;
            }
            if ((n2 & 0x4000) != 0x0) {
                b3 = false;
            }
            return j.U(sortType, sortTimeFrame, s, s2, b, listingViewMode, s3, context, c, list, n, i, k, b3);
        }
        
        public static c0 b(final j j, final String s, SortType sortType, SortTimeFrame sortTimeFrame, String s2, String s3, boolean b, ListingViewMode listingViewMode, final Context context, final c c, String a, final i i, final va0.j k, final int n) {
            if ((n & 0x2) != 0x0) {
                sortType = null;
            }
            if ((n & 0x4) != 0x0) {
                sortTimeFrame = null;
            }
            if ((n & 0x8) != 0x0) {
                s2 = null;
            }
            if ((n & 0x10) != 0x0) {
                s3 = null;
            }
            if ((n & 0x20) != 0x0) {
                b = false;
            }
            if ((n & 0x40) != 0x0) {
                listingViewMode = null;
            }
            if ((n & 0x200) != 0x0) {
                final Context w = p5.a.w;
                e.d((Object)w, "null cannot be cast to non-null type com.reddit.tracking.TrackingDelegateHolder");
                ((q)w).Q();
                a = p$a.c((p)b.a, TrackerParams$TrackerType.Listing, j.class.getName(), (String)null, (String)null, context, c, 92).a;
            }
            i l;
            if ((n & 0x400) != 0x0) {
                l = null;
            }
            else {
                l = i;
            }
            va0.j m;
            if ((n & 0x800) != 0x0) {
                m = null;
            }
            else {
                m = k;
            }
            return j.D(s, sortType, sortTimeFrame, s2, s3, b, listingViewMode, context, c, l, m);
        }
        
        public static c0 c(final j j, SortType hot, SortTimeFrame sortTimeFrame, String s, String s2, boolean b, ListingViewMode listingViewMode, String s3, boolean b2, final Context context, final c c, Integer n, i i, va0.j k, final int n2) {
            if ((n2 & 0x2) != 0x0) {
                hot = SortType.HOT;
            }
            if ((n2 & 0x4) != 0x0) {
                sortTimeFrame = null;
            }
            if ((n2 & 0x8) != 0x0) {
                s = null;
            }
            if ((n2 & 0x10) != 0x0) {
                s2 = null;
            }
            if ((n2 & 0x20) != 0x0) {
                b = false;
            }
            if ((n2 & 0x40) != 0x0) {
                listingViewMode = null;
            }
            if ((n2 & 0x80) != 0x0) {
                s3 = "";
            }
            if ((n2 & 0x100) != 0x0) {
                b2 = false;
            }
            if ((n2 & 0x800) != 0x0) {
                n = null;
            }
            if ((n2 & 0x1000) != 0x0) {
                i = null;
            }
            if ((n2 & 0x2000) != 0x0) {
                k = null;
            }
            return j.l(null, hot, sortTimeFrame, s, s2, b, listingViewMode, s3, b2, context, c, n, (i<ILink>)i, (va0.j<ILink>)k);
        }
        
        public static c0 d(final j j, final String s, String s2, String a, boolean b, final ListingViewMode listingViewMode, final Context context, final c c, final String s3, final i i, va0.j k, final int n) {
            if ((n & 0x2) != 0x0) {
                s2 = null;
            }
            if ((n & 0x8) != 0x0) {
                b = false;
            }
            if ((n & 0x80) != 0x0) {
                final Context w = p5.a.w;
                e.d((Object)w, "null cannot be cast to non-null type com.reddit.tracking.TrackingDelegateHolder");
                ((q)w).Q();
                a = p$a.c((p)b.a, TrackerParams$TrackerType.Listing, j.class.getName(), (String)null, (String)null, context, c, 92).a;
            }
            else {
                a = s3;
            }
            i l;
            if ((n & 0x100) != 0x0) {
                l = null;
            }
            else {
                l = i;
            }
            if ((n & 0x200) != 0x0) {
                k = null;
            }
            return j.X(s, s2, b, context, c, a, l, k);
        }
        
        public static c0 e(final j j, final String s, SortType sortType, SortTimeFrame sortTimeFrame, String s2, String s3, boolean b, ListingViewMode listingViewMode, final Context context, final c c, String a, String s4, i i, va0.j k, final int n) {
            if ((n & 0x2) != 0x0) {
                sortType = null;
            }
            if ((n & 0x4) != 0x0) {
                sortTimeFrame = null;
            }
            if ((n & 0x8) != 0x0) {
                s2 = null;
            }
            if ((n & 0x20) != 0x0) {
                s3 = null;
            }
            if ((n & 0x40) != 0x0) {
                b = false;
            }
            if ((n & 0x80) != 0x0) {
                listingViewMode = null;
            }
            if ((n & 0x400) != 0x0) {
                final Context w = p5.a.w;
                e.d((Object)w, "null cannot be cast to non-null type com.reddit.tracking.TrackingDelegateHolder");
                ((q)w).Q();
                a = p$a.c((p)b.a, TrackerParams$TrackerType.Listing, j.class.getName(), (String)null, (String)null, context, c, 92).a;
            }
            if ((n & 0x800) != 0x0) {
                s4 = null;
            }
            if ((n & 0x1000) != 0x0) {
                i = null;
            }
            if ((n & 0x2000) != 0x0) {
                k = null;
            }
            return j.q(s, sortType, sortTimeFrame, s2, null, s3, b, listingViewMode, context, c, a, s4, (i<Link>)i, (va0.j<Link>)k);
        }
    }
}
