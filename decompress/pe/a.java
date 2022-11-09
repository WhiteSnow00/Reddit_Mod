// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import j0.i;
import u5.w;
import re.n7;
import re.e5;
import java.util.ArrayList;
import java.util.Iterator;
import re.j7;
import j0.b;
import java.util.List;
import re.g5;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Collections;
import java.util.Map;
import android.os.Bundle;
import re.j1;
import android.os.SystemClock;
import re.t5;
import re.n5;
import re.h4;

public final class a extends c
{
    public final h4 a;
    public final n5 b;
    
    public a(final h4 a) {
        yd.a.S0((Object)a);
        this.a = a;
        this.b = a.u();
    }
    
    public final int a(final String s) {
        final n5 b = this.b;
        b.getClass();
        yd.a.P0(s);
        ((w)b).f.getClass();
        return 25;
    }
    
    public final String b() {
        final t5 h = ((h4)((w)this.b).f).v().h;
        String a;
        if (h != null) {
            a = h.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final String c() {
        final t5 h = ((h4)((w)this.b).f).v().h;
        String b;
        if (h != null) {
            b = h.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final void d(final String s) {
        final j1 l = this.a.l();
        this.a.s.getClass();
        l.z(SystemClock.elapsedRealtime(), s);
    }
    
    public final void e(final String s) {
        final j1 l = this.a.l();
        this.a.s.getClass();
        l.A(SystemClock.elapsedRealtime(), s);
    }
    
    public final String f() {
        return this.b.l.get();
    }
    
    public final void g(final Bundle bundle, final String s, final String s2) {
        this.a.u().C(bundle, s, s2);
    }
    
    public final Map h(final String s, final String s2, final boolean b) {
        final n5 b2 = this.b;
        Object o;
        if (((h4)((w)b2).f).a().I()) {
            ((h4)((w)b2).f).f().k.a("Cannot get user properties from analytics worker thread");
            o = Collections.emptyMap();
        }
        else {
            ((w)b2).f.getClass();
            if (v7.a.b()) {
                ((h4)((w)b2).f).f().k.a("Cannot get user properties from main thread");
                o = Collections.emptyMap();
            }
            else {
                final AtomicReference atomicReference = new AtomicReference();
                ((h4)((w)b2).f).a().D(atomicReference, 5000L, "get user properties", (Runnable)new g5(b2, atomicReference, s, s2, b));
                final List list = atomicReference.get();
                if (list == null) {
                    ((h4)((w)b2).f).f().k.b(b, "Timed out waiting for handle get user properties, includeInternal");
                    o = Collections.emptyMap();
                }
                else {
                    o = new b(list.size());
                    for (final j7 j7 : list) {
                        final Object f = j7.f();
                        if (f != null) {
                            ((i)o).put((Object)j7.g, f);
                        }
                    }
                }
            }
        }
        return (Map)o;
    }
    
    public final void i(final Bundle bundle, final String s, final String s2) {
        final n5 b = this.b;
        ((h4)((w)b).f).s.getClass();
        b.E(s, s2, bundle, true, true, System.currentTimeMillis());
    }
    
    public final List j(final String s, final String s2) {
        final n5 b = this.b;
        ArrayList i;
        if (((h4)((w)b).f).a().I()) {
            ((h4)((w)b).f).f().k.a("Cannot get conditional user properties from analytics worker thread");
            i = new ArrayList(0);
        }
        else {
            ((w)b).f.getClass();
            if (v7.a.b()) {
                ((h4)((w)b).f).f().k.a("Cannot get conditional user properties from main thread");
                i = new ArrayList(0);
            }
            else {
                final AtomicReference atomicReference = new AtomicReference();
                ((h4)((w)b).f).a().D(atomicReference, 5000L, "get conditional user properties", new e5(b, atomicReference, s, s2));
                final List list = atomicReference.get();
                if (list == null) {
                    ((h4)((w)b).f).f().k.b(null, "Timed out waiting for get conditional user properties");
                    i = new ArrayList();
                }
                else {
                    i = n7.I(list);
                }
            }
        }
        return i;
    }
    
    public final void k(final Bundle bundle) {
        final n5 b = this.b;
        ((h4)((w)b).f).s.getClass();
        b.J(bundle, System.currentTimeMillis());
    }
    
    public final long r() {
        return this.a.y().A0();
    }
    
    public final String v() {
        return this.b.l.get();
    }
}
