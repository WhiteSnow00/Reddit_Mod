// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.layout.SubcomposeLayoutState$a;
import hg2.j;
import rg2.p;
import android.os.Trace;
import java.util.concurrent.TimeUnit;
import android.view.Display;
import android.view.Choreographer;
import a1.e;
import android.view.View;
import androidx.compose.foundation.lazy.layout.a;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import android.view.Choreographer$FrameCallback;
import z0.u0;

public final class i implements u0, h$b, Runnable, Choreographer$FrameCallback
{
    public static long p;
    public final h f;
    public final SubcomposeLayoutState g;
    public final androidx.compose.foundation.lazy.layout.a h;
    public final View i;
    public final e<a> j;
    public long k;
    public long l;
    public boolean m;
    public final Choreographer n;
    public boolean o;
    
    public i(final h f, final SubcomposeLayoutState g, final androidx.compose.foundation.lazy.layout.a h, final View i) {
        sg2.e.f((Object)f, "prefetchState");
        sg2.e.f((Object)g, "subcomposeLayoutState");
        sg2.e.f((Object)h, "itemContentFactory");
        sg2.e.f((Object)i, "view");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = (e<a>)new e((Object[])new a[16]);
        this.n = Choreographer.getInstance();
        if (s0.i.p == 0L) {
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
            s0.i.p = (long)(1000000000 / n2);
        }
    }
    
    public final void a() {
        ((SnapshotMutableStateImpl)this.f.a).setValue((Object)this);
        this.o = true;
    }
    
    public final a b(final int n, final long n2) {
        final a a = new a(n, n2);
        this.j.b((Object)a);
        if (!this.m) {
            this.m = true;
            this.i.post((Runnable)this);
        }
        return a;
    }
    
    public final void d() {
    }
    
    public final void doFrame(final long n) {
        if (this.o) {
            this.i.post((Runnable)this);
        }
    }
    
    public final void e() {
        this.o = false;
        ((SnapshotMutableStateImpl)this.f.a).setValue((Object)null);
        this.i.removeCallbacks((Runnable)this);
        this.n.removeFrameCallback((Choreographer$FrameCallback)this);
    }
    
    public final void run() {
        if (!this.j.j() && this.m && this.o && this.i.getWindowVisibility() == 0) {
            final long n = TimeUnit.MILLISECONDS.toNanos(this.i.getDrawingTime()) + s0.i.p;
            int n2 = 0;
            while (this.j.k() && n2 == 0) {
                final a a = (a)this.j.f[0];
                final d d = this.h.b.invoke();
                if (!a.d) {
                    final int c0 = d.C0();
                    final int a2 = a.a;
                    if (a2 >= 0 && a2 < c0) {
                        if (a.c == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                final long nanoTime = System.nanoTime();
                                final long k = this.k;
                                if (nanoTime > n || k + nanoTime < n) {
                                    final Object a3 = d.a(a.a);
                                    a.c = (SubcomposeLayoutState$a)this.g.b(a3, (p)this.h.a(a.a, a3));
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
                                final j a4 = hg2.j.a;
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
                                final SubcomposeLayoutState$a c2 = a.c;
                                sg2.e.c((Object)c2);
                                for (int a5 = c2.a(), n4 = 0; n4 < a5; ++n4) {
                                    c2.b(n4, a.b);
                                }
                                long m = System.nanoTime() - nanoTime2;
                                final long l2 = this.l;
                                if (l2 != 0L) {
                                    final long n5 = 4;
                                    m = m / n5 + l2 / n5 * 3;
                                }
                                this.l = m;
                                this.j.n(0);
                            }
                            else {
                                final j a6 = hg2.j.a;
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
    
    public static final class a implements h$a
    {
        public final int a;
        public final long b;
        public SubcomposeLayoutState$a c;
        public boolean d;
        
        public a(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public final void cancel() {
            if (!this.d) {
                this.d = true;
                final SubcomposeLayoutState$a c = this.c;
                if (c != null) {
                    c.dispose();
                }
                this.c = null;
            }
        }
    }
}
