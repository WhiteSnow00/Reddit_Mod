// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import com.reddit.domain.powerups.PowerupsBenefit;
import java.util.ArrayList;
import kotlinx.coroutines.flow.StateFlowImpl;
import r20.a;
import ff2.t;
import java.util.Map;
import java.util.Set;
import hg2.j;
import lg2.c;
import java.util.List;
import ff2.n;
import hj2.e;

public interface k
{
    e<o> a();
    
    n b();
    
    Object c(final String p0, final String p1, final List<String> p2, final boolean p3, final c<? super j> p4);
    
    Object d(final String p0, final String p1, final c<? super s> p2);
    
    Object e(final String p0, final Set<String> p1, final c<? super Map<String, ? extends Set<String>>> p2);
    
    Object f(final String p0, final c<? super List<p>> p1);
    
    void g(final boolean p0);
    
    Object h(final String p0, final c<? super List<q>> p1);
    
    t<List<h>> i(final String p0);
    
    t<a<m>> j(final String p0);
    
    t<List<q>> k(final String p0);
    
    Object l(final String p0, final Set<String> p1, final c<? super List<s>> p2);
    
    Object m(final int p0, final String p1, final String p2, final String p3, final c p4, final boolean p5);
    
    t<o> n();
    
    Object o(final String p0, final c<? super m> p1);
    
    StateFlowImpl p();
    
    ArrayList q();
    
    Object r(final String p0, final String p1, final int p2, final boolean p3, final c<? super j> p4);
    
    Object s(final String p0, final String p1, final PowerupsBenefit p2, final boolean p3, final c<? super List<d>> p4);
}
