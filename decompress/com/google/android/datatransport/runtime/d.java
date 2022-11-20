// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime;

import java.util.Set;
import java.util.Collections;
import android.content.Context;
import javax.inject.Inject;
import androidx.activity.b;
import ra.m;
import ra.j;
import qa.e;
import ua.a;
import ka.c;
import javax.inject.Singleton;
import ka.l;

@Singleton
public final class d implements l
{
    public static volatile c e;
    public final a a;
    public final a b;
    public final e c;
    public final j d;
    
    @Inject
    public d(final a a, final a b, final e c, final j d, final m m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        m.a.execute((Runnable)new b((Object)m, 6));
    }
    
    public static d a() {
        final c e = d.e;
        if (e != null) {
            return (d)e.j.get();
        }
        throw new IllegalStateException("Not initialized!");
    }
    
    public static void b(final Context context) {
        if (d.e == null) {
            synchronized (d.class) {
                if (d.e == null) {
                    context.getClass();
                    d.e = new c(context);
                }
            }
        }
    }
    
    public final ka.j c(final ia.a a) {
        Object o;
        if (a instanceof ka.d) {
            a.getClass();
            o = Collections.unmodifiableSet((Set<?>)ia.a.d);
        }
        else {
            o = Collections.singleton(new ha.b("proto"));
        }
        final com.google.android.datatransport.runtime.b.a a2 = com.google.android.datatransport.runtime.c.a();
        a.getClass();
        a2.b("cct");
        a2.b = a.b();
        return new ka.j((Set)o, a2.a(), (l)this);
    }
}
