// 
// Decompiled by Procyon v0.6.0
// 

package uc;

import android.text.Layout$Alignment;

public final class f
{
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public String l;
    public int m;
    public int n;
    public Layout$Alignment o;
    public Layout$Alignment p;
    public int q;
    public b r;
    public float s;
    
    public f() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.m = -1;
        this.n = -1;
        this.q = -1;
        this.s = Float.MAX_VALUE;
    }
    
    public final void a(final f f) {
        if (f != null) {
            if (!this.c && f.c) {
                this.b = f.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = f.h;
            }
            if (this.i == -1) {
                this.i = f.i;
            }
            if (this.a == null) {
                final String a = f.a;
                if (a != null) {
                    this.a = a;
                }
            }
            if (this.f == -1) {
                this.f = f.f;
            }
            if (this.g == -1) {
                this.g = f.g;
            }
            if (this.n == -1) {
                this.n = f.n;
            }
            if (this.o == null) {
                final Layout$Alignment o = f.o;
                if (o != null) {
                    this.o = o;
                }
            }
            if (this.p == null) {
                final Layout$Alignment p = f.p;
                if (p != null) {
                    this.p = p;
                }
            }
            if (this.q == -1) {
                this.q = f.q;
            }
            if (this.j == -1) {
                this.j = f.j;
                this.k = f.k;
            }
            if (this.r == null) {
                this.r = f.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = f.s;
            }
            if (!this.e && f.e) {
                this.d = f.d;
                this.e = true;
            }
            if (this.m == -1) {
                final int m = f.m;
                if (m != -1) {
                    this.m = m;
                }
            }
        }
    }
}
