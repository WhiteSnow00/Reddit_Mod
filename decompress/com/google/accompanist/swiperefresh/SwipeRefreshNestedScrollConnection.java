// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import u2.l;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import ng2.e;
import cg2.j;
import zi2.c0;
import fa.c;
import y1.a;

public final class SwipeRefreshNestedScrollConnection implements a
{
    public final c f;
    public final c0 g;
    public final mg2.a<j> h;
    public boolean i;
    public float j;
    
    public SwipeRefreshNestedScrollConnection(final c f, final c0 g, final mg2.a<j> h) {
        e.f((Object)f, "state");
        e.f((Object)g, "coroutineScope");
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final long a(int n, long n2) {
        if (!this.i) {
            n = n1.c.e;
            n2 = n1.c.b;
        }
        else if (this.f.b()) {
            n = n1.c.e;
            n2 = n1.c.b;
        }
        else {
            final int n3 = 1;
            if (n == 1) {
                n = n3;
            }
            else {
                n = 0;
            }
            if (n != 0 && n1.c.f(n2) < 0.0f) {
                n2 = this.b(n2);
            }
            else {
                n = n1.c.e;
                n2 = n1.c.b;
            }
        }
        return n2;
    }
    
    public final long b(long n) {
        if (n1.c.f(n) > 0.0f) {
            ((SnapshotMutableStateImpl)this.f.d).setValue((Object)Boolean.TRUE);
        }
        else if (p7.a.W(this.f.a()) == 0) {
            ((SnapshotMutableStateImpl)this.f.d).setValue((Object)Boolean.FALSE);
        }
        float n2;
        if ((n2 = this.f.a() + n1.c.f(n) * 0.5f) < 0.0f) {
            n2 = 0.0f;
        }
        final float n3 = n2 - this.f.a();
        if (Math.abs(n3) >= 0.5f) {
            zi2.g.g(this.g, null, null, (p)new SwipeRefreshNestedScrollConnection$onScroll$1(this, n3, (gg2.c)null), 3);
            n = vl.a.T(0.0f, n3 / 0.5f);
        }
        else {
            n = n1.c.b;
        }
        return n;
    }
    
    public final long e(int n, long n2, final long n3) {
        if (!this.i) {
            n = n1.c.e;
            n2 = n1.c.b;
        }
        else if (this.f.b()) {
            n = n1.c.e;
            n2 = n1.c.b;
        }
        else {
            final int n4 = 1;
            if (n == 1) {
                n = n4;
            }
            else {
                n = 0;
            }
            if (n != 0 && n1.c.f(n3) > 0.0f) {
                n2 = this.b(n3);
            }
            else {
                n = n1.c.e;
                n2 = n1.c.b;
            }
        }
        return n2;
    }
    
    public final Object i(final long n, final gg2.c<? super l> c) {
        if (!this.f.b() && this.f.a() >= this.j) {
            this.h.invoke();
        }
        ((SnapshotMutableStateImpl)this.f.d).setValue((Object)Boolean.FALSE);
        return new l(l.b);
    }
}
