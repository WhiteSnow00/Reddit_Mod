// 
// Decompiled by Procyon v0.6.0
// 

package k4;

import android.view.View;
import java.util.ArrayList;

public abstract class b<T extends b<T>> implements k4.a.b
{
    public static final b$d m;
    public static final b$e n;
    public static final b$f o;
    public static final b$g p;
    public static final b$h q;
    public static final b$i r;
    public static final b$j s;
    public static final b$a t;
    public static final b$b u;
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final android.support.v4.media.a e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList<l> k;
    public final ArrayList<m> l;
    
    static {
        m = new b$n() {
            public final void K1(final float translationY, final Object o) {
                ((View)o).setTranslationY(translationY);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getTranslationY();
            }
        };
        n = new b$n() {
            public final void K1(final float scaleX, final Object o) {
                ((View)o).setScaleX(scaleX);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getScaleX();
            }
        };
        o = new b$n() {
            public final void K1(final float scaleY, final Object o) {
                ((View)o).setScaleY(scaleY);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getScaleY();
            }
        };
        p = new b$n() {
            public final void K1(final float rotation, final Object o) {
                ((View)o).setRotation(rotation);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getRotation();
            }
        };
        q = new b$n() {
            public final void K1(final float rotationX, final Object o) {
                ((View)o).setRotationX(rotationX);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getRotationX();
            }
        };
        r = new b$n() {
            public final void K1(final float rotationY, final Object o) {
                ((View)o).setRotationY(rotationY);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getRotationY();
            }
        };
        s = new b$n() {
            public final void K1(final float x, final Object o) {
                ((View)o).setX(x);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getX();
            }
        };
        t = new b$n() {
            public final void K1(final float y, final Object o) {
                ((View)o).setY(y);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getY();
            }
        };
        u = new b$n() {
            public final void K1(final float alpha, final Object o) {
                ((View)o).setAlpha(alpha);
            }
            
            public final float g1(final Object o) {
                return ((View)o).getAlpha();
            }
        };
    }
    
    public <K> b(final K d, final android.support.v4.media.a e) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList<l>();
        this.l = new ArrayList<m>();
        this.d = d;
        this.e = e;
        if (e != k4.b.p && e != k4.b.q && e != k4.b.r) {
            if (e == k4.b.u) {
                this.j = 0.00390625f;
            }
            else if (e != k4.b.n && e != k4.b.o) {
                this.j = 1.0f;
            }
            else {
                this.j = 0.00390625f;
            }
        }
        else {
            this.j = 0.1f;
        }
    }
    
    public b(final k4.c c) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList<l>();
        this.l = new ArrayList<m>();
        this.d = null;
        this.e = (android.support.v4.media.a)new b$c(c);
        this.j = 1.0f;
    }
    
    @Override
    public final boolean a(long n) {
        final long i = this.i;
        if (i == 0L) {
            this.i = n;
            this.e(this.b);
            return false;
        }
        final long n2 = n - i;
        this.i = n;
        final k4.d d = (k4.d)this;
        boolean b = true;
        if (d.w != Float.MAX_VALUE) {
            final e v = d.v;
            final double n3 = ((b)d).b;
            final double n4 = ((b)d).a;
            n = n2 / 2L;
            final k c = v.c(n3, n4, n);
            final e v2 = d.v;
            v2.i = d.w;
            d.w = Float.MAX_VALUE;
            final k c2 = v2.c(c.a, c.b, n);
            ((b)d).b = c2.a;
            ((b)d).a = c2.b;
        }
        else {
            final k c3 = d.v.c(((b)d).b, ((b)d).a, n2);
            ((b)d).b = c3.a;
            ((b)d).a = c3.b;
        }
        final float max = Math.max(((b)d).b, ((b)d).h);
        ((b)d).b = max;
        final float min = Math.min(max, ((b)d).g);
        ((b)d).b = min;
        final float a = ((b)d).a;
        final e v3 = d.v;
        v3.getClass();
        if (Math.abs(a) < v3.e && Math.abs(min - (float)v3.i) < v3.d) {
            ((b)d).b = (float)d.v.i;
            ((b)d).a = 0.0f;
        }
        else {
            b = false;
        }
        final float min2 = Math.min(this.b, this.g);
        this.b = min2;
        this.e(this.b = Math.max(min2, this.h));
        if (b) {
            this.d(false);
        }
        return b;
    }
    
    public final void b(final l l) {
        if (!this.k.contains(l)) {
            this.k.add(l);
        }
    }
    
    public final void c(final m m) {
        if (!this.f) {
            if (!this.l.contains(m)) {
                this.l.add(m);
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }
    
    public final void d(final boolean b) {
        int i = 0;
        this.f = false;
        final ThreadLocal<a> g = k4.a.g;
        if (g.get() == null) {
            g.set(new a());
        }
        final a a = g.get();
        a.a.remove((Object)this);
        final int index = a.b.indexOf(this);
        if (index >= 0) {
            a.b.set(index, null);
            a.f = true;
        }
        this.i = 0L;
        this.c = false;
        while (i < this.k.size()) {
            if (this.k.get(i) != null) {
                this.k.get(i).a(this.b);
            }
            ++i;
        }
        final ArrayList<l> k = this.k;
        int size = k.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            size = n;
            if (k.get(n) != null) {
                continue;
            }
            k.remove(n);
            size = n;
        }
    }
    
    public final void e(final float n) {
        this.e.K1(n, this.d);
        for (int i = 0; i < this.l.size(); ++i) {
            if (this.l.get(i) != null) {
                this.l.get(i).a(this.b);
            }
        }
        final ArrayList<m> l = this.l;
        int size = l.size();
        while (true) {
            final int n2 = size - 1;
            if (n2 < 0) {
                break;
            }
            size = n2;
            if (l.get(n2) != null) {
                continue;
            }
            l.remove(n2);
            size = n2;
        }
    }
    
    public static final class k
    {
        public float a;
        public float b;
    }
    
    public interface l
    {
        void a(final float p0);
    }
    
    public interface m
    {
        void a(final float p0);
    }
}
