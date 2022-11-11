// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core;

import java.util.Arrays;

public final class SolverVariable implements Comparable<SolverVariable>
{
    public boolean f;
    public int g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public float[] l;
    public float[] m;
    public Type n;
    public b[] o;
    public int p;
    public int q;
    
    public SolverVariable(final Type n) {
        this.g = -1;
        this.h = -1;
        this.i = 0;
        this.k = false;
        this.l = new float[9];
        this.m = new float[9];
        this.o = new b[16];
        this.p = 0;
        this.q = 0;
        this.n = n;
    }
    
    public final void a(final b b) {
        int n = 0;
        while (true) {
            final int p = this.p;
            if (n >= p) {
                final b[] o = this.o;
                if (p >= o.length) {
                    this.o = Arrays.copyOf(o, o.length * 2);
                }
                final b[] o2 = this.o;
                final int p2 = this.p;
                o2[p2] = b;
                this.p = p2 + 1;
                return;
            }
            if (this.o[n] == b) {
                return;
            }
            ++n;
        }
    }
    
    public final void b(final b b) {
        for (int p = this.p, i = 0; i < p; ++i) {
            if (this.o[i] == b) {
                while (i < p - 1) {
                    final b[] o = this.o;
                    final int n = i + 1;
                    o[i] = o[n];
                    i = n;
                }
                --this.p;
                return;
            }
        }
    }
    
    public final void c() {
        this.n = Type.UNKNOWN;
        this.i = 0;
        this.g = -1;
        this.h = -1;
        this.j = 0.0f;
        this.k = false;
        for (int p = this.p, i = 0; i < p; ++i) {
            this.o[i] = null;
        }
        this.p = 0;
        this.q = 0;
        this.f = false;
        Arrays.fill(this.m, 0.0f);
    }
    
    @Override
    public final int compareTo(final Object o) {
        return this.g - ((SolverVariable)o).g;
    }
    
    public final void d(final c c, final float j) {
        this.j = j;
        this.k = true;
        final int p2 = this.p;
        this.h = -1;
        for (int i = 0; i < p2; ++i) {
            this.o[i].g(c, this, false);
        }
        this.p = 0;
    }
    
    public final void f(final c c, final b b) {
        for (int p2 = this.p, i = 0; i < p2; ++i) {
            this.o[i].h(c, b, false);
        }
        this.p = 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("");
        k.append(this.g);
        return k.toString();
    }
    
    public enum Type
    {
        CONSTANT, 
        ERROR, 
        SLACK, 
        UNKNOWN, 
        UNRESTRICTED;
    }
}
