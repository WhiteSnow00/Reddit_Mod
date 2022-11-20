// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import java.util.List;
import c7.c;
import java.util.ArrayList;

public abstract class a<K, A>
{
    public final ArrayList a;
    public boolean b;
    public final c<K> c;
    public float d;
    public c7.c<A> e;
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
            c = new b();
        }
        else if (list.size() != 0) {
            c = new e((List<? extends a<Object>>)list);
        }
        else {
            c = new d((List<? extends a<Object>>)list);
        }
        this.c = (c<K>)c;
    }
    
    public final void a(final a a) {
        this.a.add(a);
    }
    
    public final a<K> b() {
        final a<K> a = this.c.a();
        hg1.a.l();
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
            ((a)this.a.get(i)).e();
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
    
    public final void k(final c7.c<A> e) {
        final c7.c<A> e2 = this.e;
        if (e2 != null) {
            e2.getClass();
        }
        this.e = e;
    }
    
    public interface a
    {
        void e();
    }
    
    public static final class b<T> implements c<T>
    {
        @Override
        public final a<T> a() {
            throw new IllegalStateException("not implemented");
        }
        
        @Override
        public final float b() {
            return 0.0f;
        }
        
        @Override
        public final boolean c(final float n) {
            throw new IllegalStateException("not implemented");
        }
        
        @Override
        public final boolean d(final float n) {
            return false;
        }
        
        @Override
        public final float e() {
            return 1.0f;
        }
        
        @Override
        public final boolean isEmpty() {
            return true;
        }
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
    
    public static final class d<T> implements c<T>
    {
        public final List<? extends a<T>> a;
        public a<T> b;
        public a<T> c;
        public float d;
        
        public d(final List<? extends a<T>> a) {
            this.c = null;
            this.d = -1.0f;
            this.a = a;
            this.b = this.f(0.0f);
        }
        
        @Override
        public final a<T> a() {
            return this.b;
        }
        
        @Override
        public final float b() {
            return ((a)this.a.get(0)).b();
        }
        
        @Override
        public final boolean c(final float d) {
            final a<T> c = this.c;
            final a<T> b = this.b;
            if (c == b && this.d == d) {
                return true;
            }
            this.c = b;
            this.d = d;
            return false;
        }
        
        @Override
        public final boolean d(final float n) {
            final a<T> b = this.b;
            if (n >= b.b() && n < b.a()) {
                return this.b.c() ^ true;
            }
            this.b = this.f(n);
            return true;
        }
        
        @Override
        public final float e() {
            final List<? extends a<T>> a = this.a;
            return ((a)a.get(a.size() - 1)).a();
        }
        
        public final a<T> f(final float n) {
            final List<? extends a<T>> a = this.a;
            final a a2 = a.get(a.size() - 1);
            if (n >= a2.b()) {
                return a2;
            }
            int n2 = this.a.size() - 2;
            while (true) {
                final boolean b = false;
                if (n2 < 1) {
                    return (a)this.a.get(0);
                }
                final a a3 = (a)this.a.get(n2);
                if (this.b != a3) {
                    int n3 = b ? 1 : 0;
                    if (n >= a3.b()) {
                        n3 = (b ? 1 : 0);
                        if (n < a3.a()) {
                            n3 = 1;
                        }
                    }
                    if (n3 != 0) {
                        return a3;
                    }
                }
                --n2;
            }
        }
        
        @Override
        public final boolean isEmpty() {
            return false;
        }
    }
    
    public static final class e<T> implements c<T>
    {
        public final a<T> a;
        public float b;
        
        public e(final List<? extends a<T>> list) {
            this.b = -1.0f;
            this.a = (a)list.get(0);
        }
        
        @Override
        public final a<T> a() {
            return this.a;
        }
        
        @Override
        public final float b() {
            return this.a.b();
        }
        
        @Override
        public final boolean c(final float b) {
            if (this.b == b) {
                return true;
            }
            this.b = b;
            return false;
        }
        
        @Override
        public final boolean d(final float n) {
            return this.a.c() ^ true;
        }
        
        @Override
        public final float e() {
            return this.a.a();
        }
        
        @Override
        public final boolean isEmpty() {
            return false;
        }
    }
}
