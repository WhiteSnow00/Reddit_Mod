// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import java.util.NoSuchElementException;
import af2.s;
import af2.l;
import af2.g;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import nt2.b;

public final class d<T> implements Iterable<T>
{
    public final b<? extends T> f;
    
    public d(final b<? extends T> f) {
        this.f = f;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return new a<T>(this.f, (lf2.d$b<T>)new d$b());
    }
    
    public static final class a<T> implements Iterator<T>
    {
        public final d$b<T> f;
        public final b<? extends T> g;
        public T h;
        public boolean i;
        public boolean j;
        public Throwable k;
        public boolean l;
        
        public a(final b<? extends T> g, final d$b<T> f) {
            this.i = true;
            this.j = true;
            this.g = g;
            this.f = f;
        }
        
        @Override
        public final boolean hasNext() {
            final Throwable k = this.k;
            if (k != null) {
                throw ExceptionHelper.d(k);
            }
            final boolean i = this.i;
            boolean b = false;
            if (!i) {
                return false;
            }
            if (this.j) {
                try {
                    if (!this.l) {
                        this.l = true;
                        this.f.h.set(1);
                        af2.g.fromPublisher((nt2.b<?>)this.g).materialize().subscribe((l<? super af2.s<Object>>)this.f);
                    }
                    final d$b<T> f = this.f;
                    f.h.set(1);
                    zd.b.z1();
                    final s s = f.g.take();
                    boolean b2;
                    if (s.g()) {
                        this.j = false;
                        this.h = (T)s.d();
                        b2 = true;
                    }
                    else {
                        this.i = false;
                        if (s.e()) {
                            b2 = false;
                        }
                        else {
                            if (s.f()) {
                                final Throwable c = s.c();
                                this.k = c;
                                throw ExceptionHelper.d(c);
                            }
                            throw new IllegalStateException("Should not reach here");
                        }
                    }
                    if (!b2) {
                        return b;
                    }
                }
                catch (final InterruptedException j) {
                    ((bg2.b)this.f).dispose();
                    this.k = j;
                    throw ExceptionHelper.d((Throwable)j);
                }
            }
            b = true;
            return b;
        }
        
        @Override
        public final T next() {
            final Throwable k = this.k;
            if (k != null) {
                throw ExceptionHelper.d(k);
            }
            if (this.hasNext()) {
                this.j = true;
                return this.h;
            }
            throw new NoSuchElementException("No more elements");
        }
        
        @Override
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }
}
