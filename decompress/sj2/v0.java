// 
// Decompiled by Procyon v0.6.0
// 

package sj2;

import tj2.i;
import rj2.d;
import rj2.c;
import java.util.Iterator;
import sg2.e;
import pj2.b;

public abstract class v0<Element, Array, Builder extends t0<Array>> extends p<Element, Array, Builder>
{
    public final u0 b;
    
    public v0(final b<Element> b) {
        super((b)b);
        this.b = new u0(b.getDescriptor());
    }
    
    public final Object a() {
        return ((a)this).g(this.j());
    }
    
    public final int b(final Object o) {
        final t0 t0 = (t0)o;
        e.f((Object)t0, "<this>");
        return t0.d();
    }
    
    public final Iterator<Element> c(final Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }
    
    public final Array deserialize(final c c) {
        e.f((Object)c, "decoder");
        return (Array)((a)this).e(c);
    }
    
    public final qj2.e getDescriptor() {
        return (qj2.e)this.b;
    }
    
    public final Object h(final Object o) {
        final t0 t0 = (t0)o;
        e.f((Object)t0, "<this>");
        return t0.a();
    }
    
    public final void i(final int n, final Object o, final Object o2) {
        e.f((Object)o, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }
    
    public abstract Array j();
    
    public abstract void k(final rj2.b p0, final Array p1, final int p2);
    
    public final void serialize(final d d, final Array array) {
        e.f((Object)d, "encoder");
        final int d2 = ((a)this).d((Object)array);
        final u0 b = this.b;
        final i w = d.W((qj2.e)b);
        this.k((rj2.b)w, array, d2);
        ((rj2.b)w).d((qj2.e)b);
    }
}
