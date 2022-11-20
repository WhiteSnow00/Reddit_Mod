// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import com.reddit.vault.m;
import cg2.j;
import java.util.Set;
import r82.k0;
import r82.j0;
import java.util.Map;
import r82.l0;
import com.reddit.vault.domain.model.PendingTransactionSubtype;
import r82.h;
import java.util.List;
import cj2.e;

public interface c
{
    e<List<h>> a();
    
    e<List<l0>> b(final PendingTransactionSubtype p0);
    
    e<Map<String, j0>> c(final String p0);
    
    e d();
    
    e<Boolean> e();
    
    e<List<k0>> f();
    
    Object g(final Set<String> p0, final String p1, final boolean p2, final gg2.c<? super j> p3);
    
    Object h(final gg2.c<? super m> p0);
}
