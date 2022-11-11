// 
// Decompiled by Procyon v0.6.0
// 

package w1;

import d2.d;
import d2.e;
import rg2.l;
import d2.c;

public final class b<T extends a> implements d2.b, c<b<T>>
{
    public final l<a, Boolean> f;
    public final l<a, Boolean> g;
    public final e<b<T>> h;
    public b<T> i;
    
    public b(final l f, final e h) {
        sg2.e.f((Object)h, "key");
        this.f = f;
        this.g = null;
        this.h = h;
    }
    
    public final void F0(final d d) {
        sg2.e.f((Object)d, "scope");
        this.i = (b)d.a((e)this.h);
    }
    
    public final boolean a(final b2.a a) {
        final l<a, Boolean> f = this.f;
        boolean a2 = false;
        if (f != null && f.invoke((a)a)) {
            return true;
        }
        final b<T> i = this.i;
        if (i != null) {
            a2 = i.a(a);
        }
        return a2;
    }
    
    public final boolean b(final b2.a a) {
        final b<T> i = this.i;
        boolean booleanValue = false;
        if (i != null && i.b(a)) {
            return true;
        }
        final l<a, Boolean> g = this.g;
        if (g != null) {
            booleanValue = g.invoke((a)a);
        }
        return booleanValue;
    }
    
    public final e<b<T>> getKey() {
        return this.h;
    }
    
    public final Object getValue() {
        return this;
    }
}
