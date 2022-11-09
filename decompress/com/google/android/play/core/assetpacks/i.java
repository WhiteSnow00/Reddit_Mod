// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import eg.r0;
import eg.o0;
import eg.p0;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;
import java.util.HashMap;
import java.util.concurrent.Executor;
import eg.u1;
import ig.k0;
import dg.k;

public final class i
{
    public static final k g;
    public final c a;
    public final k0<u1> b;
    public final eg.k0 c;
    public final k0<Executor> d;
    public final HashMap e;
    public final ReentrantLock f;
    
    static {
        g = new k("ExtractorSessionStoreView");
    }
    
    public i(final c a, final k0<u1> b, final eg.k0 c, final k0<Executor> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new HashMap();
        this.f = new ReentrantLock();
    }
    
    public static String e(final Bundle bundle) {
        final ArrayList stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return (String)stringArrayList.get(0);
        }
        throw new zzck("Session without pack received.");
    }
    
    public final void a(int n) {
        final p0 c = this.c(n);
        final o0 c2 = c.c;
        final int d = c2.d;
        if (d == 5 || d == 6 || d == 4) {
            final c a = this.a;
            final String a2 = c2.a;
            n = c.b;
            final long b = c2.b;
            if (a.c(n, a2, b).exists()) {
                com.google.android.play.core.assetpacks.c.g(a.c(n, a2, b));
            }
            final o0 c3 = c.c;
            n = c3.d;
            if (n == 5 || n == 6) {
                final c a3 = this.a;
                final String a4 = c3.a;
                n = c.b;
                final long b2 = c3.b;
                if (a3.j(n, a4, b2).exists()) {
                    com.google.android.play.core.assetpacks.c.g(a3.j(n, a4, b2));
                }
            }
            return;
        }
        throw new zzck(String.format("Could not safely delete session %d because it is not in a terminal state.", n), n);
    }
    
    public final void b() {
        this.f.unlock();
    }
    
    public final p0 c(final int n) {
        final HashMap e = this.e;
        final Integer value = n;
        final p0 p = e.get(value);
        if (p != null) {
            return p;
        }
        throw new zzck(String.format("Could not find session %d while trying to get it", value), n);
    }
    
    public final <T> T d(final r0<T> r0) {
        try {
            this.f.lock();
            return (T)r0.zza();
        }
        finally {
            this.f.unlock();
        }
    }
}
