// 
// Decompiled by Procyon v0.6.0
// 

package od;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import nd.c;
import android.os.Bundle;
import md.b;
import java.util.ArrayList;
import md.e;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import pd.d;
import java.util.HashMap;
import com.google.android.gms.common.api.a$e;
import com.google.android.gms.common.api.a$b;
import java.util.Map;
import md.f;
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
    public final pd.d h;
    public final Map<a<?>, Boolean> i;
    public final a.a<? extends se.f, se.a> j;
    public volatile m0 k;
    public int l;
    public final l0 m;
    public final c1 n;
    
    public p0(final Context c, final l0 m, final Lock a, final Looper looper, final e d, final Map f, final pd.d h, final Map i, final a.a j, final ArrayList list, final c1 n) {
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
            ((b2)list.get(k)).c = this;
        }
        this.e = new o0(this, looper);
        this.b = a.newCondition();
        this.k = (m0)new i0(this);
    }
    
    @Override
    public final void N(final md.b b, final a<?> a, final boolean b2) {
        this.a.lock();
        try {
            this.k.d(b, (a)a, b2);
        }
        finally {
            this.a.unlock();
        }
    }
    
    @Override
    public final void X(final Bundle bundle) {
        this.a.lock();
        try {
            this.k.g(bundle);
        }
        finally {
            this.a.unlock();
        }
    }
    
    @Override
    public final <A, T extends com.google.android.gms.common.api.internal.a<? extends nd.c, A>> T a(final T t) {
        ((BasePendingResult)t).j();
        return (T)this.k.f((com.google.android.gms.common.api.internal.a)t);
    }
    
    @Override
    public final boolean b(final n n) {
        return false;
    }
    
    @Override
    public final void c() {
        this.k.b();
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void e() {
        if (this.k.e()) {
            this.g.clear();
        }
    }
    
    @Override
    public final void f(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final String concat = String.valueOf(s).concat("  ");
        printWriter.append(s).append("mState=").println(this.k);
        for (final a a : this.i.keySet()) {
            printWriter.append(s).append(a.c).println(":");
            final a$e a$e = this.f.get(a.b);
            lw0.b.R((Object)a$e);
            a$e.m(concat, fileDescriptor, printWriter, array);
        }
    }
    
    @Override
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
        this.e.sendMessage(this.e.obtainMessage(1, (Object)n0));
    }
    
    @Override
    public final void l(final int n) {
        this.a.lock();
        try {
            this.k.c(n);
        }
        finally {
            this.a.unlock();
        }
    }
}
