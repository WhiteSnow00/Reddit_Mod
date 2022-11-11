// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import java.util.ArrayDeque;
import android.graphics.drawable.Drawable;
import h9.i;
import g9.c;
import android.widget.AbsListView;
import dr0.d;
import java.util.List;
import k9.k;
import dr0.e;
import android.widget.AbsListView$OnScrollListener;

public final class h<T> implements AbsListView$OnScrollListener
{
    public final int a;
    public final d b;
    public final j c;
    public final a<T> d;
    public final b<T> e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    
    public h(final e c, final a d, final k e, final int a) {
        this.h = -1;
        this.j = true;
        this.c = (j)c;
        this.d = d;
        this.e = (b<T>)e;
        this.a = a;
        this.b = new d(a + 1);
    }
    
    public final void a(int i, final boolean j) {
        if (this.j != j) {
            this.j = j;
            for (int k = 0; k < this.b.a.size(); ++k) {
                final j c = this.c;
                final d b = this.b;
                final c c2 = b.a.poll();
                b.a.offer(c2);
                c2.g = 0;
                c2.f = 0;
                c.clear((h9.j<?>)c2);
            }
        }
        int a;
        if (j) {
            a = this.a;
        }
        else {
            a = -this.a;
        }
        final int n = a + i;
        int max;
        int min;
        if (i < n) {
            max = Math.max(this.f, i);
            min = n;
        }
        else {
            min = Math.min(this.g, i);
            max = n;
        }
        final int min2 = Math.min(this.i, min);
        final int min3 = Math.min(this.i, Math.max(0, max));
        if (i < n) {
            for (i = min3; i < min2; ++i) {
                this.b(i, this.d.e(i), true);
            }
        }
        else {
            for (i = min2 - 1; i >= min3; --i) {
                this.b(i, this.d.e(i), false);
            }
        }
        this.g = min3;
        this.f = min2;
    }
    
    public final void b(final int n, final List list, final boolean b) {
        final int size = list.size();
        if (b) {
            for (int i = 0; i < size; ++i) {
                this.c(n, i, list.get(i));
            }
        }
        else {
            for (int j = size - 1; j >= 0; --j) {
                this.c(n, j, list.get(j));
            }
        }
    }
    
    public final void c(int f, int g, final Object o) {
        if (o == null) {
            return;
        }
        final int[] a = this.e.a();
        if (a == null) {
            return;
        }
        final dr0.d k = this.d.k(o);
        if (k == null) {
            return;
        }
        final d b = this.b;
        g = a[0];
        f = a[1];
        final c c = b.a.poll();
        b.a.offer(c);
        c.g = g;
        c.f = f;
        ((com.bumptech.glide.i)k).into((h9.j)c);
    }
    
    public final void onScroll(final AbsListView absListView, final int h, final int n, int h2) {
        this.i = h2;
        h2 = this.h;
        if (h > h2) {
            this.a(n + h, true);
        }
        else if (h < h2) {
            this.a(h, false);
        }
        this.h = h;
    }
    
    public final void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
    
    public interface a<U>
    {
        List<U> e(final int p0);
        
        dr0.d k(final Object p0);
    }
    
    public interface b<T>
    {
        int[] a();
    }
    
    public static final class c implements h9.j<Object>
    {
        public int f;
        public int g;
        public g9.c h;
        
        public final void b(final i i) {
        }
        
        public final void c(final g9.c h) {
            this.h = h;
        }
        
        public final void d(final Object o, final i9.d<? super Object> d) {
        }
        
        public final void e(final Drawable drawable) {
        }
        
        public final void f(final i i) {
            i.b(this.g, this.f);
        }
        
        public final void g(final Drawable drawable) {
        }
        
        public final g9.c getRequest() {
            return this.h;
        }
        
        public final void h(final Drawable drawable) {
        }
        
        public final void onDestroy() {
        }
        
        public final void onStart() {
        }
        
        public final void onStop() {
        }
    }
    
    public static final class d
    {
        public final ArrayDeque a;
        
        public d(final int n) {
            final char[] a = k9.j.a;
            this.a = new ArrayDeque(n);
            for (int i = 0; i < n; ++i) {
                this.a.offer(new c());
            }
        }
    }
}
