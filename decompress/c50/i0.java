// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import i60.k;
import java.util.List;
import com.reddit.data.local.DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1;
import java.util.ArrayList;
import nf2.a;
import pg2.j;
import tg2.c;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import nf2.n;
import nf2.c0;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;

public interface i0
{
    c0<Boolean> A(final Listing<Link> p0);
    
    c0<Boolean> B(final Listing<Link> p0, final String p1, final String p2);
    
    n<Listing<Link>> C(final String p0);
    
    j D(final Listing p0, final SortType p1, final SortTimeFrame p2, final String p3, final String p4, final c p5);
    
    Object E(final Listing<Link> p0, final c<? super Boolean> p1);
    
    n F(final SortTimeFrame p0, final SortType p1, final String p2);
    
    c0<Boolean> G(final Listing<Link> p0, final SortType p1, final SortTimeFrame p2, final String p3, final String p4);
    
    a H(final Link p0);
    
    n<Listing<Link>> I(final String p0);
    
    j J(final Listing p0, final String p1, final c p2);
    
    n<Listing<Link>> K(final String p0, final String p1);
    
    c0<Boolean> L(final Listing<Link> p0, final SortType p1, final SortTimeFrame p2, final String p3, final String p4);
    
    Listing M(final SortType p0, final SortTimeFrame p1, final String p2, final String p3, final c p4);
    
    c0 N(final ArrayList p0);
    
    n<Listing<Link>> O(final String p0, final String p1);
    
    c0 P(final Listing p0, final SortType p1, final SortTimeFrame p2, final String p3, final String p4);
    
    a Q(final Link p0);
    
    DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1 R(final String p0);
    
    c0<List<String>> S();
    
    n<Listing<Link>> T(final SortType p0, final SortTimeFrame p1);
    
    j U(final Listing p0, final SortType p1, final SortTimeFrame p2, final String p3, final c p4);
    
    a V(final String p0);
    
    c0<Boolean> W(final Listing<Link> p0, final SortType p1, final SortTimeFrame p2, final String p3, final String p4, final String p5);
    
    n X(final SortTimeFrame p0, final SortType p1, final String p2);
    
    c0<Boolean> Y(final String p0, final Listing<Link> p1);
    
    n<Listing<Link>> Z();
    
    n<Link> a(final String p0);
    
    Listing a0(final SortType p0, final SortTimeFrame p1, final String p2, final c p3);
    
    a delete(final String p0);
    
    a follow(final String p0, final boolean p1);
    
    a k();
    
    a l(final String p0);
    
    a m(final String p0);
    
    a n(final String p0);
    
    a o();
    
    j p();
    
    List<k> q(final List<String> p0);
    
    n<Listing<Link>> r(final SortType p0, final SortTimeFrame p1, final String p2, final String p3);
    
    n<Listing<Link>> s(final SortType p0, final SortTimeFrame p1, final String p2, final String p3);
    
    a save(final String p0);
    
    a t(final String p0);
    
    n<Listing<Link>> u(final String p0, final String p1);
    
    a unsave(final String p0);
    
    n v(final SortTimeFrame p0, final SortType p1, final String p2);
    
    n<Listing<Link>> w(final SortType p0, final SortTimeFrame p1, final String p2, final String p3);
    
    c0<Boolean> x(final Listing<Link> p0, final String p1, final String p2);
    
    n y(final SortType p0, final SortTimeFrame p1, final String p2, final String p3);
    
    n<Listing<Link>> z(final SortType p0, final SortTimeFrame p1, final String p2, final String p3, final String p4);
}
