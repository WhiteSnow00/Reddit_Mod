// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;
import java.util.concurrent.TimeUnit;
import v3.k$a;
import v3.k;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public final class q implements Runnable
{
    public static final ThreadLocal<q> j;
    public static q$a k;
    public ArrayList<RecyclerView> f;
    public long g;
    public long h;
    public ArrayList<c> i;
    
    static {
        j = new ThreadLocal<q>();
        q.k = new Comparator<c>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                final c c = (c)o;
                final c c2 = (c)o2;
                final RecyclerView d = c.d;
                final int n = 0;
                if (d == null != (c2.d == null)) {
                    if (d != null) {
                        return -1;
                    }
                }
                else {
                    final boolean a = c.a;
                    if (a != c2.a) {
                        if (a) {
                            return -1;
                        }
                    }
                    else {
                        int n2 = c2.b - c.b;
                        if (n2 != 0) {
                            return n2;
                        }
                        final int n3 = c.c - c2.c;
                        n2 = n;
                        if (n3 != 0) {
                            n2 = n3;
                            return n2;
                        }
                        return n2;
                    }
                }
                return 1;
                n2 = -1;
                return n2;
            }
        };
    }
    
    public q() {
        this.f = new ArrayList<RecyclerView>();
        this.i = new ArrayList<c>();
    }
    
    public static RecyclerView$f0 c(final RecyclerView recyclerView, final int n, final long n2) {
        final int h = recyclerView.mChildHelper.h();
        int i = 0;
        while (true) {
            while (i < h) {
                final RecyclerView$f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i));
                if (childViewHolderInt.mPosition == n && !childViewHolderInt.isInvalid()) {
                    final boolean b = true;
                    if (b) {
                        return null;
                    }
                    final RecyclerView.v mRecycler = recyclerView.mRecycler;
                    try {
                        recyclerView.onEnterLayoutOrScroll();
                        final RecyclerView$f0 l = mRecycler.l(n, n2);
                        if (l != null) {
                            if (l.isBound() && !l.isInvalid()) {
                                mRecycler.i(l.itemView);
                            }
                            else {
                                mRecycler.a(l, false);
                            }
                        }
                        return l;
                    }
                    finally {
                        recyclerView.onExitLayoutOrScroll(false);
                    }
                }
                else {
                    ++i;
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    public final void a(final RecyclerView recyclerView, final int a, final int b) {
        if (recyclerView.isAttachedToWindow() && this.g == 0L) {
            this.g = recyclerView.getNanoTime();
            ((View)recyclerView).post((Runnable)this);
        }
        final q.q$b mPrefetchRegistry = recyclerView.mPrefetchRegistry;
        mPrefetchRegistry.a = a;
        mPrefetchRegistry.b = b;
    }
    
    public final void b(final long n) {
        final int size = this.f.size();
        int n2;
        int n3;
        for (int i = n2 = 0; i < size; ++i, n2 = n3) {
            final RecyclerView recyclerView = this.f.get(i);
            n3 = n2;
            if (((View)recyclerView).getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.b(recyclerView, false);
                n3 = n2 + recyclerView.mPrefetchRegistry.d;
            }
        }
        this.i.ensureCapacity(n2);
        int n4;
        int n5;
        for (int j = n4 = 0; j < size; ++j, n4 = n5) {
            final RecyclerView d = this.f.get(j);
            if (((View)d).getWindowVisibility() != 0) {
                n5 = n4;
            }
            else {
                final q.q$b mPrefetchRegistry = d.mPrefetchRegistry;
                final int b = Math.abs(mPrefetchRegistry.b) + Math.abs(mPrefetchRegistry.a);
                int n6 = 0;
                while (true) {
                    n5 = n4;
                    if (n6 >= mPrefetchRegistry.d * 2) {
                        break;
                    }
                    c c;
                    if (n4 >= this.i.size()) {
                        c = new c();
                        this.i.add(c);
                    }
                    else {
                        c = this.i.get(n4);
                    }
                    final int[] c2 = mPrefetchRegistry.c;
                    final int c3 = c2[n6 + 1];
                    c.a = (c3 <= b);
                    c.b = b;
                    c.c = c3;
                    c.d = d;
                    c.e = c2[n6];
                    ++n4;
                    n6 += 2;
                }
            }
        }
        Collections.sort(this.i, (Comparator<? super c>)q.k);
        for (int k = 0; k < this.i.size(); ++k) {
            final c c4 = this.i.get(k);
            final RecyclerView d2 = c4.d;
            if (d2 == null) {
                break;
            }
            long n7;
            if (c4.a) {
                n7 = Long.MAX_VALUE;
            }
            else {
                n7 = n;
            }
            final RecyclerView$f0 c5 = c(d2, c4.e, n7);
            if (c5 != null && c5.mNestedRecyclerView != null && c5.isBound() && !c5.isInvalid()) {
                final RecyclerView recyclerView2 = (RecyclerView)c5.mNestedRecyclerView.get();
                if (recyclerView2 != null) {
                    if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                        recyclerView2.removeAndRecycleViews();
                    }
                    final q.q$b mPrefetchRegistry2 = recyclerView2.mPrefetchRegistry;
                    mPrefetchRegistry2.b(recyclerView2, true);
                    if (mPrefetchRegistry2.d != 0) {
                        try {
                            final int a = v3.k.a;
                            k$a.a("RV Nested Prefetch");
                            final RecyclerView$b0 mState = recyclerView2.mState;
                            final RecyclerView$Adapter mAdapter = recyclerView2.mAdapter;
                            mState.d = 1;
                            mState.e = mAdapter.getItemCount();
                            mState.g = false;
                            mState.h = false;
                            mState.i = false;
                            for (int l = 0; l < mPrefetchRegistry2.d * 2; l += 2) {
                                c(recyclerView2, mPrefetchRegistry2.c[l], n);
                            }
                            k$a.b();
                        }
                        finally {
                            k = v3.k.a;
                            k$a.b();
                        }
                    }
                }
            }
            c4.a = false;
            c4.b = 0;
            c4.c = 0;
            c4.d = null;
            c4.e = 0;
        }
    }
    
    @Override
    public final void run() {
        try {
            final int a = v3.k.a;
            k$a.a("RV Prefetch");
            if (this.f.isEmpty()) {
                this.g = 0L;
                k$a.b();
                return;
            }
            final int size = this.f.size();
            int i = 0;
            long n = 0L;
            while (i < size) {
                final RecyclerView recyclerView = this.f.get(i);
                long max = n;
                if (((View)recyclerView).getWindowVisibility() == 0) {
                    max = Math.max(((View)recyclerView).getDrawingTime(), n);
                }
                ++i;
                n = max;
            }
            if (n == 0L) {
                this.g = 0L;
                k$a.b();
                return;
            }
            this.b(TimeUnit.MILLISECONDS.toNanos(n) + this.h);
            this.g = 0L;
            k$a.b();
        }
        finally {
            this.g = 0L;
            final int a2 = v3.k.a;
            k$a.b();
        }
    }
    
    public static final class c
    {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }
}
