// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver;

import java.util.Arrays;

public final class SolverVariable
{
    public int a;
    public int b;
    public int c;
    public float d;
    public float[] e;
    public Type f;
    public b[] g;
    public int h;
    public int i;
    
    public SolverVariable(final Type f) {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.e = new float[7];
        this.g = new b[8];
        this.h = 0;
        this.i = 0;
        this.f = f;
    }
    
    public final void a(final b b) {
        int n = 0;
        while (true) {
            final int h = this.h;
            if (n >= h) {
                final b[] g = this.g;
                if (h >= g.length) {
                    this.g = Arrays.copyOf(g, g.length * 2);
                }
                final b[] g2 = this.g;
                final int h2 = this.h;
                g2[h2] = b;
                this.h = h2 + 1;
                return;
            }
            if (this.g[n] == b) {
                return;
            }
            ++n;
        }
    }
    
    public final void b(final b b) {
        final int h = this.h;
        int i = 0;
        for (int j = 0; j < h; ++j) {
            if (this.g[j] == b) {
                while (i < h - j - 1) {
                    final b[] g = this.g;
                    final int n = j + i;
                    g[n] = g[n + 1];
                    ++i;
                }
                --this.h;
                return;
            }
        }
    }
    
    public final void c() {
        this.f = Type.UNKNOWN;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.h = 0;
        this.i = 0;
    }
    
    public final void d(final b b) {
        for (int h = this.h, i = 0; i < h; ++i) {
            final b b2 = this.g[i];
            final a c = b2.c;
            int n = c.h;
        Label_0039:
            while (true) {
                for (int n2 = 0; n != -1 && n2 < c.a; n = c.f[n], ++n2) {
                    final int n3 = c.e[n];
                    final SolverVariable a = b.a;
                    if (n3 == a.a) {
                        final float n4 = c.g[n];
                        c.g(a, false);
                        final a c2 = b.c;
                        for (int h2 = c2.h, n5 = 0; h2 != -1 && n5 < c2.a; h2 = c2.f[h2], ++n5) {
                            c.a(((SolverVariable[])c.c.c)[c2.e[h2]], c2.g[h2] * n4, false);
                        }
                        b2.b += b.b * n4;
                        n = c.h;
                        continue Label_0039;
                    }
                }
                break;
            }
        }
        this.h = 0;
    }
    
    @Override
    public final String toString() {
        return "null";
    }
    
    public enum Type
    {
        private static final Type[] $VALUES;
        
        CONSTANT, 
        ERROR, 
        SLACK, 
        UNKNOWN, 
        UNRESTRICTED;
    }
}
