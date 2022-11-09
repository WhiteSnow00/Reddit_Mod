// 
// Decompiled by Procyon v0.6.0
// 

package z3;

public final class g<T> extends f<T>
{
    public final Object c;
    
    public g(final int n) {
        super(n);
        this.c = new Object();
    }
    
    @Override
    public final T a() {
        synchronized (this.c) {
            return super.a();
        }
    }
    
    @Override
    public final boolean b(final T t) {
        synchronized (this.c) {
            return super.b(t);
        }
    }
}
