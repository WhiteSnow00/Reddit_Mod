// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.ViewGroup;
import al0.f0;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.ArrayList;

public final class f
{
    public final b a;
    public final a b;
    public final ArrayList c;
    
    public f(final RecyclerView$e a) {
        this.a = (b)a;
        this.b = new a();
        this.c = new ArrayList();
    }
    
    public final void a(final View view, int n, final boolean b) {
        if (n < 0) {
            n = ((RecyclerView$e)this.a).a();
        }
        else {
            n = this.f(n);
        }
        this.b.e(n, b);
        if (b) {
            this.i(view);
        }
        final RecyclerView$e recyclerView$e = (RecyclerView$e)this.a;
        ((ViewGroup)recyclerView$e.a).addView(view, n);
        recyclerView$e.a.dispatchChildAttached(view);
    }
    
    public final void b(final View view, int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (n < 0) {
            n = ((RecyclerView$e)this.a).a();
        }
        else {
            n = this.f(n);
        }
        this.b.e(n, b);
        if (b) {
            this.i(view);
        }
        final RecyclerView$e recyclerView$e = (RecyclerView$e)this.a;
        recyclerView$e.getClass();
        final RecyclerView$f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(f0.h(recyclerView$e.a, sb));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        RecyclerView.access$000(recyclerView$e.a, view, n, viewGroup$LayoutParams);
    }
    
    public final void c(int f) {
        f = this.f(f);
        this.b.f(f);
        final RecyclerView$e recyclerView$e = (RecyclerView$e)this.a;
        final View child = ((ViewGroup)recyclerView$e.a).getChildAt(f);
        if (child != null) {
            final RecyclerView$f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(child);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(f0.h(recyclerView$e.a, sb));
                }
                childViewHolderInt.addFlags(256);
            }
        }
        RecyclerView.access$100(recyclerView$e.a, f);
    }
    
    public final View d(int f) {
        f = this.f(f);
        return ((ViewGroup)((RecyclerView$e)this.a).a).getChildAt(f);
    }
    
    public final int e() {
        return ((RecyclerView$e)this.a).a() - this.c.size();
    }
    
    public final int f(final int n) {
        if (n < 0) {
            return -1;
        }
        int n2;
        for (int a = ((RecyclerView$e)this.a).a(), i = n; i < a; i += n2) {
            n2 = n - (i - this.b.b(i));
            if (n2 == 0) {
                while (this.b.d(i)) {
                    ++i;
                }
                return i;
            }
        }
        return -1;
    }
    
    public final View g(final int n) {
        return ((ViewGroup)((RecyclerView$e)this.a).a).getChildAt(n);
    }
    
    public final int h() {
        return ((RecyclerView$e)this.a).a();
    }
    
    public final void i(final View view) {
        this.c.add(view);
        final RecyclerView$e recyclerView$e = (RecyclerView$e)this.a;
        recyclerView$e.getClass();
        final RecyclerView$f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(recyclerView$e.a);
        }
    }
    
    public final int j(final View view) {
        final int indexOfChild = ((ViewGroup)((RecyclerView$e)this.a).a).indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        if (this.b.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.b.b(indexOfChild);
    }
    
    public final boolean k(final View view) {
        return this.c.contains(view);
    }
    
    public final void l(int f) {
        f = this.f(f);
        final View child = ((ViewGroup)((RecyclerView$e)this.a).a).getChildAt(f);
        if (child == null) {
            return;
        }
        if (this.b.f(f)) {
            this.m(child);
        }
        ((RecyclerView$e)this.a).b(f);
    }
    
    public final void m(final View view) {
        if (this.c.remove(view)) {
            final RecyclerView$e recyclerView$e = (RecyclerView$e)this.a;
            recyclerView$e.getClass();
            final RecyclerView$f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView$e.a);
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.toString());
        sb.append(", hidden list:");
        sb.append(this.c.size());
        return sb.toString();
    }
    
    public static final class a
    {
        public long a;
        public a b;
        
        public a() {
            this.a = 0L;
        }
        
        public final void a(final int n) {
            if (n >= 64) {
                final a b = this.b;
                if (b != null) {
                    b.a(n - 64);
                }
            }
            else {
                this.a &= ~(1L << n);
            }
        }
        
        public final int b(int b) {
            final a b2 = this.b;
            if (b2 == null) {
                if (b >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & (1L << b) - 1L);
            }
            else {
                if (b < 64) {
                    return Long.bitCount(this.a & (1L << b) - 1L);
                }
                b = b2.b(b - 64);
                return Long.bitCount(this.a) + b;
            }
        }
        
        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }
        
        public final boolean d(final int n) {
            if (n >= 64) {
                this.c();
                return this.b.d(n - 64);
            }
            return (this.a & 1L << n) != 0x0L;
        }
        
        public final void e(final int n, final boolean b) {
            if (n >= 64) {
                this.c();
                this.b.e(n - 64, b);
            }
            else {
                final long a = this.a;
                final boolean b2 = (Long.MIN_VALUE & a) != 0x0L;
                final long n2 = (1L << n) - 1L;
                this.a = ((a & ~n2) << 1 | (a & n2));
                if (b) {
                    this.h(n);
                }
                else {
                    this.a(n);
                }
                if (b2 || this.b != null) {
                    this.c();
                    this.b.e(0, b2);
                }
            }
        }
        
        public final boolean f(final int n) {
            if (n >= 64) {
                this.c();
                return this.b.f(n - 64);
            }
            final long n2 = 1L << n;
            final long a = this.a;
            final boolean b = (a & n2) != 0x0L;
            final long a2 = a & ~n2;
            this.a = a2;
            final long n3 = n2 - 1L;
            this.a = ((a2 & n3) | Long.rotateRight(~n3 & a2, 1));
            final a b2 = this.b;
            if (b2 != null) {
                if (b2.d(0)) {
                    this.h(63);
                }
                this.b.f(0);
            }
            return b;
        }
        
        public final void g() {
            this.a = 0L;
            final a b = this.b;
            if (b != null) {
                b.g();
            }
        }
        
        public final void h(final int n) {
            if (n >= 64) {
                this.c();
                this.b.h(n - 64);
            }
            else {
                this.a |= 1L << n;
            }
        }
        
        @Override
        public final String toString() {
            String s;
            if (this.b == null) {
                s = Long.toBinaryString(this.a);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.b.toString());
                sb.append("xx");
                sb.append(Long.toBinaryString(this.a));
                s = sb.toString();
            }
            return s;
        }
    }
    
    public interface b
    {
    }
}
