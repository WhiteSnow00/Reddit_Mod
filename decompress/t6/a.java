// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import java.util.List;
import d7.c;
import java.util.ArrayList;

public abstract class a<K, A>
{
    public final ArrayList a;
    public boolean b;
    public final c<K> c;
    public float d;
    public d7.c<A> e;
    public A f;
    public float g;
    public float h;
    
    public a(final List<? extends a<K>> list) {
        this.a = new ArrayList(1);
        this.b = false;
        this.d = 0.0f;
        this.f = null;
        this.g = -1.0f;
        this.h = -1.0f;
        Object c;
        if (list.isEmpty()) {
            c = new a$b();
        }
        else if (list.size() == 1) {
            c = new a$e((List)list);
        }
        else {
            c = new a$d((List)list);
        }
        this.c = (c<K>)c;
    }
    
    public final void a(final a a) {
        this.a.add(a);
    }
    
    public final a<K> b() {
        final a<K> a = this.c.a();
        ml0.a.A();
        return a;
    }
    
    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }
    
    public final float d() {
        final a<K> b = this.b();
        if (b != null && !b.c()) {
            return ((TimeInterpolator)b.d).getInterpolation(this.e());
        }
        return 0.0f;
    }
    
    public final float e() {
        if (this.b) {
            return 0.0f;
        }
        final a<K> b = this.b();
        if (b.c()) {
            return 0.0f;
        }
        return (this.d - b.b()) / (b.a() - b.b());
    }
    
    public A f() {
        final float e = this.e();
        if (this.e == null && this.c.c(e)) {
            return this.f;
        }
        final a<K> b = this.b();
        final Interpolator e2 = b.e;
        A f;
        if (e2 != null && b.f != null) {
            f = this.h(b, e, ((TimeInterpolator)e2).getInterpolation(e), ((TimeInterpolator)b.f).getInterpolation(e));
        }
        else {
            f = this.g(b, this.d());
        }
        return this.f = f;
    }
    
    public abstract A g(final a<K> p0, final float p1);
    
    public A h(final a<K> a, final float n, final float n2, final float n3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
    
    public void i() {
        for (int i = 0; i < this.a.size(); ++i) {
            ((a)this.a.get(i)).f();
        }
    }
    
    public void j(final float n) {
        if (this.c.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = this.c.b();
        }
        final float g = this.g;
        float d;
        if (n < g) {
            if (g == -1.0f) {
                this.g = this.c.b();
            }
            d = this.g;
        }
        else {
            d = n;
            if (n > this.c()) {
                d = this.c();
            }
        }
        if (d == this.d) {
            return;
        }
        this.d = d;
        if (this.c.d(d)) {
            this.i();
        }
    }
    
    public final void k(final d7.c<A> e) {
        final d7.c<A> e2 = this.e;
        if (e2 != null) {
            e2.getClass();
        }
        this.e = e;
    }
    
    public interface a
    {
        void f();
    }
    
    public interface c<T>
    {
        a<T> a();
        
        float b();
        
        boolean c(final float p0);
        
        boolean d(final float p0);
        
        float e();
        
        boolean isEmpty();
    }
}
