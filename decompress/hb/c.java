// 
// Decompiled by Procyon v0.6.0
// 

package hb;

import bd.d0;
import db.e;
import db.i;

public final class c implements i
{
    public final i a;
    public final long b;
    
    public c(final e a, final long b) {
        this.a = (i)a;
        d0.c(a.d >= b);
        this.b = b;
    }
    
    public final void b(final int n, final int n2, final byte[] array) {
        this.a.b(n, n2, array);
    }
    
    public final boolean f(final byte[] array, final int n, final int n2, final boolean b) {
        return this.a.f(array, n, n2, b);
    }
    
    public final long getLength() {
        return this.a.getLength() - this.b;
    }
    
    public final long getPosition() {
        return this.a.getPosition() - this.b;
    }
    
    public final boolean h(final byte[] array, final int n, final int n2, final boolean b) {
        return this.a.h(array, n, n2, b);
    }
    
    public final void i() {
        this.a.i();
    }
    
    public final long k() {
        return this.a.k() - this.b;
    }
    
    public final void m(final int n) {
        this.a.m(n);
    }
    
    public final void n(final int n) {
        this.a.n(n);
    }
    
    public final int read(final byte[] array, final int n, final int n2) {
        return this.a.read(array, n, n2);
    }
    
    public final void readFully(final byte[] array, final int n, final int n2) {
        this.a.readFully(array, n, n2);
    }
}
