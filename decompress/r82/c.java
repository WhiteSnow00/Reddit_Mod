// 
// Decompiled by Procyon v0.6.0
// 

package r82;

import hg2.j;
import java.util.Set;
import x82.k0;
import com.reddit.vault.m;
import x82.j0;
import java.util.Map;
import x82.l0;
import com.reddit.vault.domain.model.PendingTransactionSubtype;
import x82.h;
import java.util.List;
import hj2.e;

public interface c
{
    e<List<h>> a();
    
    e<List<l0>> b(final PendingTransactionSubtype p0);
    
    e<Map<String, j0>> c(final String p0);
    
    Object d(final lg2.c<? super m> p0);
    
    e e();
    
    e<Boolean> f();
    
    e<List<k0>> g();
    
    Object h(final Set<String> p0, final String p1, final boolean p2, final lg2.c<? super j> p3);
}
