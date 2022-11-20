// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import android.os.Trace;
import java.util.concurrent.TimeUnit;
import android.view.Display;
import ng2.e;
import android.view.Choreographer;
import a1.d;
import android.view.View;
import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import android.view.Choreographer$FrameCallback;
import z0.s0;

public final class j implements s0, b, Runnable, Choreographer$FrameCallback
{
    public static long p;
    public final i f;
    public final SubcomposeLayoutState g;
    public final androidx.compose.foundation.lazy.layout.b h;
    public final View i;
    public final d<a> j;
    public long k;
    public long l;
    public boolean m;
    public final Choreographer n;
    public boolean o;
    
    public j(final i f, final SubcomposeLayoutState g, final androidx.compose.foundation.lazy.layout.b h, final View i) {
        e.f((Object)f, "prefetchState");
        e.f((Object)g, "subcomposeLayoutState");
        e.f((Object)h, "itemContentFactory");
        e.f((Object)i, "view");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = (d<a>)new d((Object[])new a[16]);
        this.n = Choreographer.getInstance();
        if (s0.j.p == 0L) {
            final Display display = i.getDisplay();
            float n2;
            final float n = n2 = 60.0f;
            if (!i.isInEditMode()) {
                n2 = n;
                if (display != null) {
                    final float refreshRate = display.getRefreshRate();
                    n2 = n;
                    if (refreshRate >= 30.0f) {
                        n2 = refreshRate;
                    }
                }
            }
            s0.j.p = (long)(1000000000 / n2);
        }
    }
    
    @Override
    public final void a() {
        ((SnapshotMutableStateImpl)this.f.a).setValue((Object)this);
        this.o = true;
    }
    
    @Override
    public final a b(final int n, final long n2) {
        final a a = new a(n, n2);
        this.j.b((Object)a);
        if (!this.m) {
            this.m = true;
            this.i.post((Runnable)this);
        }
        return a;
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d() {
        this.o = false;
        ((SnapshotMutableStateImpl)this.f.a).setValue((Object)null);
        this.i.removeCallbacks((Runnable)this);
        this.n.removeFrameCallback((Choreographer$FrameCallback)this);
    }
    
    public final void doFrame(final long n) {
        if (this.o) {
            this.i.post((Runnable)this);
        }
    }
    
    @Override
    public final void run() {
        if (!this.j.j() && this.m && this.o && this.i.getWindowVisibility() == 0) {
            final long n = TimeUnit.MILLISECONDS.toNanos(this.i.getDrawingTime()) + s0.j.p;
            int n2 = 0;
            while (this.j.k() && n2 == 0) {
                final a a = (a)this.j.f[0];
                final s0.e e = (s0.e)this.h.b.invoke();
                if (!a.d) {
                    final int m = e.M();
                    final int a2 = a.a;
                    if (a2 >= 0 && a2 < m) {
                        if (a.c == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                final long nanoTime = System.nanoTime();
                                final long k = this.k;
                                if (nanoTime > n || k + nanoTime < n) {
                                    final Object a3 = e.a(a.a);
                                    a.c = (SubcomposeLayoutState.a)this.g.b(a3, this.h.a(a.a, a3));
                                    long i = System.nanoTime() - nanoTime;
                                    final long j = this.k;
                                    if (j != 0L) {
                                        final long n3 = 4;
                                        i = i / n3 + j / n3 * 3;
                                    }
                                    this.k = i;
                                }
                                else {
                                    n2 = 1;
                                }
                                final cg2.j a4 = cg2.j.a;
                                continue;
                            }
                            finally {
                                Trace.endSection();
                            }
                        }
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            final long nanoTime2 = System.nanoTime();
                            final long l = this.l;
                            if (nanoTime2 > n || l + nanoTime2 < n) {
                                final SubcomposeLayoutState.a c = a.c;
                                ng2.e.c((Object)c);
                                for (int a5 = c.a(), n4 = 0; n4 < a5; ++n4) {
                                    c.b(n4, a.b);
                                }
                                long l2 = System.nanoTime() - nanoTime2;
                                final long l3 = this.l;
                                if (l3 != 0L) {
                                    final long n5 = 4;
                                    l2 = l2 / n5 + l3 / n5 * 3;
                                }
                                this.l = l2;
                                this.j.n(0);
                            }
                            else {
                                final cg2.j a6 = cg2.j.a;
                                n2 = 1;
                            }
                            continue;
                        }
                        finally {
                            Trace.endSection();
                        }
                    }
                }
                this.j.n(0);
            }
            if (n2 != 0) {
                this.n.postFrameCallback((Choreographer$FrameCallback)this);
            }
            else {
                this.m = false;
            }
            return;
        }
        this.m = false;
    }
    
    public static final class a implements i.a
    {
        public final int a;
        public final long b;
        public SubcomposeLayoutState.a c;
        public boolean d;
        
        public a(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final void cancel() {
            if (!this.d) {
                this.d = true;
                final SubcomposeLayoutState.a c = this.c;
                if (c != null) {
                    c.dispose();
                }
                this.c = null;
            }
        }
    }
}
