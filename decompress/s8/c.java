// 
// Decompiled by Procyon v0.6.0
// 

package s8;

import l9.j;
import java.util.ArrayDeque;

public abstract class c<T extends l>
{
    public final ArrayDeque a;
    
    public c() {
        final char[] a = j.a;
        this.a = new ArrayDeque(20);
    }
    
    public abstract T a();
    
    public final T b() {
        l a;
        if ((a = this.a.poll()) == null) {
            a = this.a();
        }
        return (T)a;
    }
    
    public final void c(final T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
