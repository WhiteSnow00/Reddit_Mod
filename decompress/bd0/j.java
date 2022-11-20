// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import java.util.ArrayList;
import kotlinx.coroutines.flow.StateFlowImpl;
import java.util.Map;
import java.util.Set;
import u20.a;
import com.reddit.domain.powerups.PowerupsBenefit;
import af2.t;
import java.util.List;
import gg2.c;
import cj2.e;

public interface j
{
    e<n> a();
    
    af2.n b();
    
    Object c(final String p0, final c<? super List<o>> p1);
    
    void d(final boolean p0);
    
    Object e(final int p0, final String p1, final String p2, final String p3, final c p4, final boolean p5);
    
    t<List<g>> f(final String p0);
    
    Object g(final String p0, final String p1, final List<String> p2, final boolean p3, final c<? super cg2.j> p4);
    
    Object h(final String p0, final String p1, final PowerupsBenefit p2, final boolean p3, final c<? super List<bd0.c>> p4);
    
    t<a<l>> i(final String p0);
    
    t<List<p>> j(final String p0);
    
    Object k(final String p0, final String p1, final int p2, final boolean p3, final c<? super cg2.j> p4);
    
    t<n> l();
    
    Object m(final String p0, final Set<String> p1, final c<? super List<r>> p2);
    
    Object n(final String p0, final Set<String> p1, final c<? super Map<String, ? extends Set<String>>> p2);
    
    StateFlowImpl o();
    
    Object p(final String p0, final String p1, final c<? super r> p2);
    
    Object q(final String p0, final c<? super l> p1);
    
    ArrayList r();
    
    Object s(final String p0, final c<? super List<p>> p1);
}
