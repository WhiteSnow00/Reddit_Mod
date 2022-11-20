// 
// Decompiled by Procyon v0.6.0
// 

package c7;

import p6.l0;

public class c<T>
{
    public final b<T> a;
    public T b;
    
    public c() {
        this.a = new b<T>();
        this.b = null;
    }
    
    public c(final l0 b) {
        this.a = new b<T>();
        this.b = (T)b;
    }
    
    public T a(final b<T> b) {
        return this.b;
    }
    
    public final T b(final float a, final float b, final T c, final T d, final float e, final float f, final float g) {
        final b<T> a2 = this.a;
        a2.a = a;
        a2.b = b;
        a2.c = c;
        a2.d = d;
        a2.e = e;
        a2.f = f;
        a2.g = g;
        return this.a(a2);
    }
}
