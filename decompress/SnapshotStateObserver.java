// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import a1.c;
import a1.d;
import a1.e;
import i1.f;
import java.util.Set;
import rg2.p;
import hg2.j;
import rg2.a;
import rg2.l;

public final class SnapshotStateObserver
{
    public final l<rg2.a<j>, j> a;
    public final p<Set<?>, f, j> b;
    public final l<Object, j> c;
    public final e<a<?>> d;
    public i1.e e;
    public boolean f;
    public a<?> g;
    
    public SnapshotStateObserver(final l<? super rg2.a<j>, j> a) {
        this.a = (l<rg2.a<j>, j>)a;
        this.b = (p<Set<?>, f, j>)new SnapshotStateObserver$applyObserver$1(this);
        this.c = (l<Object, j>)new SnapshotStateObserver$readObserver$1(this);
        this.d = (e<a<?>>)new e((Object[])new a[16]);
    }
    
    public final void a() {
        synchronized (this.d) {
            final e<a<?>> d = this.d;
            final int h = d.h;
            if (h > 0) {
                final Object[] f = d.f;
                int n = 0;
                do {
                    final d<T> b = ((a)f[n]).b;
                    for (int length = b.c.length, i = 0; i < length; ++i) {
                        final c c = b.c[i];
                        if (c != null) {
                            c.clear();
                        }
                        b.a[i] = i;
                        b.b[i] = null;
                    }
                    b.d = 0;
                } while (++n < h);
            }
            final j a = j.a;
        }
    }
    
    public final <T> void b(final T d, final l<? super T, j> l, final rg2.a<j> a) {
        sg2.e.f((Object)d, "scope");
        sg2.e.f((Object)l, "onValueChangedForScope");
        sg2.e.f((Object)a, "block");
        final a<?> g = this.g;
        final boolean f = this.f;
        synchronized (this.d) {
            final e<a<?>> d2 = this.d;
            final int h = d2.h;
            int n = 0;
            Label_0119: {
                Label_0116: {
                    if (h > 0) {
                        final Object[] f2 = d2.f;
                        n = 0;
                        while (((a)f2[n]).a != l) {
                            if (++n >= h) {
                                break Label_0116;
                            }
                        }
                        break Label_0119;
                    }
                }
                n = -1;
            }
            Object g2;
            if (n == -1) {
                final a a2 = new a((l<? super T, j>)l);
                this.d.b((Object)a2);
                g2 = a2;
            }
            else {
                g2 = this.d.f[n];
            }
            ((a)g2).b.e((Object)d);
            monitorexit(this.d);
            final T d3 = ((a)g2).d;
            ((a)g2).d = (T)d;
            this.g = (a<?>)g2;
            this.f = false;
            i1.f.a.b(a, this.c);
            this.g = g;
            ((a)g2).d = d3;
            this.f = f;
        }
    }
    
    public static final class a<T>
    {
        public final l<T, j> a;
        public final d<T> b;
        public final HashSet<Object> c;
        public T d;
        
        public a(final l<? super T, j> a) {
            sg2.e.f((Object)a, "onChanged");
            this.a = (l<T, j>)a;
            this.b = (d<T>)new d();
            this.c = new HashSet<Object>();
        }
    }
}
