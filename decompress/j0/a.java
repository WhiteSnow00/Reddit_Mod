// 
// Decompiled by Procyon v0.6.0
// 

package j0;

import java.util.Map;

public final class a extends h<Object, Object>
{
    public final /* synthetic */ b d;
    
    public a(final b d) {
        this.d = d;
    }
    
    public final void a() {
        this.d.clear();
    }
    
    public final Object b(final int n, final int n2) {
        return this.d.g[(n << 1) + n2];
    }
    
    public final Map<Object, Object> c() {
        return this.d;
    }
    
    public final int d() {
        return this.d.h;
    }
    
    public final int e(final Object o) {
        return this.d.f(o);
    }
    
    public final int f(final Object o) {
        return this.d.h(o);
    }
    
    public final void g(final Object o, final Object o2) {
        this.d.put(o, o2);
    }
    
    public final void h(final int n) {
        this.d.l(n);
    }
    
    public final Object i(final int n, final Object o) {
        return this.d.m(n, o);
    }
}
