// 
// Decompiled by Procyon v0.6.0
// 

package c3;

import java.util.Iterator;
import a3.a;
import java.util.HashMap;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public final class d
{
    public ConstraintWidget a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public final HashMap<String, a> r;
    
    public d() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = new HashMap<String, a>();
    }
    
    public d(final ConstraintWidget a) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = new HashMap<String, a>();
        this.a = a;
    }
    
    public d(final d d) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = new HashMap<String, a>();
        this.a = d.a;
        this.b = d.b;
        this.c = d.c;
        this.d = d.d;
        this.e = d.e;
        this.c(d);
    }
    
    public static void a(final StringBuilder sb, final String s, final float n) {
        if (Float.isNaN(n)) {
            return;
        }
        sb.append(s);
        sb.append(": ");
        sb.append(n);
        sb.append(",\n");
    }
    
    public static void b(final StringBuilder sb, final String s, final int n) {
        sb.append(s);
        sb.append(": ");
        sb.append(n);
        sb.append(",\n");
    }
    
    public final void c(final d d) {
        this.f = d.f;
        this.g = d.g;
        this.h = d.h;
        this.i = d.i;
        this.j = d.j;
        this.k = d.k;
        this.l = d.l;
        this.m = d.m;
        this.n = d.n;
        this.o = d.o;
        this.p = d.p;
        this.r.clear();
        for (final a a : d.r.values()) {
            this.r.put(a.a, new a(a));
        }
    }
}
