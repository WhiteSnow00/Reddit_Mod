// 
// Decompiled by Procyon v0.6.0
// 

package s8;

import java.util.Queue;
import java.util.ArrayDeque;
import l9.j;

public abstract class c
{
    public final Object a = a;
    
    public c() {
        final char[] a = j.a;
        this.a = new ArrayDeque(20);
    }
    
    public abstract l a();
    
    public final l b() {
        l a;
        if ((a = ((Queue)this.a).poll()) == null) {
            a = this.a();
        }
        return a;
    }
    
    public final void c(final l l) {
        if (((Queue)this.a).size() < 20) {
            ((Queue)this.a).offer(l);
        }
    }
}
