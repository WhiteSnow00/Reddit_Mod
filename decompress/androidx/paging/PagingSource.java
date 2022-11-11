// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import lg2.c;
import c5.u;
import rg2.l;
import hg2.j;
import rg2.a;
import c5.i;

public abstract class PagingSource<Key, Value>
{
    public final i<rg2.a<j>> a;
    
    public PagingSource() {
        this.a = new i<rg2.a<j>>((l)PagingSource$invalidateCallbackTracker.PagingSource$invalidateCallbackTracker$1.INSTANCE);
    }
    
    public boolean a() {
        return false;
    }
    
    public boolean b() {
        return false;
    }
    
    public abstract Key c(final u<Key, Value> p0);
    
    public abstract Object d(final a<Key> p0, final c<? super b<Key, Value>> p1);
    
    public abstract static class a<Key>
    {
        public final int a;
        
        public a(final boolean b, final int a) {
            this.a = a;
        }
        
        public abstract Key a();
    }
    
    public abstract static class b<Key, Value>
    {
    }
}
