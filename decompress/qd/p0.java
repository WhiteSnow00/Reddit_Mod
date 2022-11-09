// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.Handler;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import pd.c;
import android.os.Bundle;
import od.b;
import java.util.ArrayList;
import od.e;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import rd.d;
import java.util.HashMap;
import com.google.android.gms.common.api.a$e;
import com.google.android.gms.common.api.a$b;
import java.util.Map;
import od.f;
import android.content.Context;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class p0 implements e1, c2
{
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final f d;
    public final o0 e;
    public final Map<a$b<?>, a$e> f;
    public final HashMap g;
    public final d h;
    public final Map<a<?>, Boolean> i;
    public final a.a<? extends ue.f, ue.a> j;
    public volatile m0 k;
    public int l;
    public final l0 m;
    public final c1 n;
    
    public p0(final Context c, final l0 m, final Lock a, final Looper looper, final e d, final Map f, final d h, final Map i, final a.a j, final ArrayList list, final c1 n) {
        this.g = new HashMap();
        this.c = c;
        this.a = a;
        this.d = (f)d;
        this.f = f;
        this.h = h;
        this.i = i;
        this.j = j;
        this.m = m;
        this.n = n;
        for (int size = list.size(), k = 0; k < size; ++k) {
            ((b2)list.get(k)).c = (c2)this;
        }
        this.e = new o0(this, looper);
        this.b = a.newCondition();
        this.k = (m0)new i0(this);
    }
    
    public final void J(final b b, final a<?> a, final boolean b2) {
        this.a.lock();
        try {
            this.k.g(b, (a)a, b2);
        }
        finally {
            this.a.unlock();
        }
    }
    
    public final void R(final Bundle bundle) {
        this.a.lock();
        try {
            this.k.f(bundle);
        }
        finally {
            this.a.unlock();
        }
    }
    
    public final <A, T extends com.google.android.gms.common.api.internal.a<? extends c, A>> T a(final T t) {
        ((BasePendingResult)t).j();
        return (T)this.k.e((com.google.android.gms.common.api.internal.a)t);
    }
    
    public final void b() {
        this.k.b();
    }
    
    public final void c() {
    }
    
    public final void d() {
        if (this.k.d()) {
            this.g.clear();
        }
    }
    
    public final void e(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final String concat = String.valueOf(s).concat("  ");
        printWriter.append(s).append("mState=").println(this.k);
        for (final a a : this.i.keySet()) {
            printWriter.append(s).append(a.c).println(":");
            final a$e a$e = this.f.get(a.b);
            yd.a.S0((Object)a$e);
            a$e.k(concat, fileDescriptor, printWriter, array);
        }
    }
    
    public final boolean f(final n n) {
        return false;
    }
    
    public final boolean g() {
        return this.k instanceof x;
    }
    
    public final void h() {
        this.a.lock();
        try {
            (this.k = (m0)new i0(this)).a();
            this.b.signalAll();
        }
        finally {
            this.a.unlock();
        }
    }
    
    public final void i(final n0 n0) {
        ((Handler)this.e).sendMessage(((Handler)this.e).obtainMessage(1, (Object)n0));
    }
    
    public final void k(final int n) {
        this.a.lock();
        try {
            this.k.c(n);
        }
        finally {
            this.a.unlock();
        }
    }
}
