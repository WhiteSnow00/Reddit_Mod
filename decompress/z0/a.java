// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import java.util.ArrayList;

public abstract class a<T> implements c<T>
{
    public final T a;
    public final ArrayList b;
    public T c;
    
    public a(final T t) {
        this.a = t;
        this.b = new ArrayList();
        this.c = t;
    }
    
    public final void clear() {
        this.b.clear();
        this.c = this.a;
        this.i();
    }
    
    public final T e() {
        return this.c;
    }
    
    public final void g(final T c) {
        this.b.add(this.c);
        this.c = c;
    }
    
    public final void h() {
        if (this.b.isEmpty() ^ true) {
            final ArrayList b = this.b;
            this.c = (T)b.remove(b.size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public abstract void i();
}
