// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.Handler;
import pd.s1;
import pd.h1;
import pd.q1;
import we.c;
import java.util.concurrent.Executor;
import pd.r0;
import pd.f1;
import android.os.SystemClock;
import qd.n;
import we.v;
import pd.p;
import java.util.Set;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collection;
import java.util.Collections;
import android.accounts.Account;
import qd.d$a;
import ee.f;
import java.lang.reflect.InvocationTargetException;
import pd.h;
import pd.t;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import pd.g;
import android.os.Build$VERSION;
import mg.d0;
import android.app.Activity;
import bu0.e;
import pd.a1;
import android.os.Looper;
import android.content.Context;

public abstract class b<O extends a$c> implements d<O>
{
    public final Context a;
    public final String b;
    public final a<O> c;
    public final O d;
    public final pd.a<O> e;
    public final Looper f;
    public final int g;
    public final a1 h;
    public final e i;
    public final pd.e j;
    
    @Deprecated
    public b() {
        throw null;
    }
    
    @Deprecated
    public b(final Activity activity, final a<O> a, final O o, final e a2) {
        final b$a$a b$a$a = new b$a$a();
        b$a$a.a = a2;
        final Looper mainLooper = ((Context)activity).getMainLooper();
        d0.z((Object)mainLooper, "Looper must not be null.");
        b$a$a.b = mainLooper;
        this(activity, (com.google.android.gms.common.api.a<a$c>)a, o, b$a$a.a());
    }
    
    public b(final Activity activity, final a<O> a, final O o, final b.b$a b$a) {
        this((Context)activity, activity, (com.google.android.gms.common.api.a<a$c>)a, o, b$a);
    }
    
    public b(final Context context, Activity activity, a<O> f, O o, b.b$a c) {
        Label_0290: {
            if (context == null) {
                break Label_0290;
            }
            Label_0280: {
                if (f == null) {
                    break Label_0280;
                }
                Label_0270: {
                    if (c == null) {
                        break Label_0270;
                    }
                    this.a = context.getApplicationContext();
                    final boolean b = Build$VERSION.SDK_INT >= 30;
                    String b2;
                    final String s = b2 = null;
                    while (true) {
                        if (!b) {
                            break Label_0078;
                        }
                        try {
                            b2 = (String)Context.class.getMethod("getAttributionTag", (Class<?>[])new Class[0]).invoke(context, new Object[0]);
                            this.b = b2;
                            this.c = (a<O>)f;
                            this.d = o;
                            this.f = c.b;
                            o = (O)new pd.a((a)f, (a$c)o, b2);
                            this.e = (pd.a<O>)o;
                            this.h = new a1(this);
                            f = pd.e.f(this.a);
                            this.j = f;
                            this.g = f.m.getAndIncrement();
                            this.i = c.a;
                            if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                                c = (b.b$a)LifecycleCallback.c(new g(activity));
                                activity = (Activity)((h)c).h((Class)t.class, "ConnectionlessLifecycleHelper");
                                Object o2;
                                if ((o2 = activity) == null) {
                                    o2 = new t((h)c, f, nd.e.d);
                                }
                                ((t)o2).k.add((Object)o);
                                f.a((t)o2);
                            }
                            final f s2 = f.s;
                            ((Handler)s2).sendMessage(((Handler)s2).obtainMessage(7, (Object)this));
                            return;
                            throw new NullPointerException("Null context is not permitted.");
                            throw new NullPointerException("Api must not be null.");
                            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
                        }
                        catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                            b2 = s;
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public b(final Context context, final a<O> a, final O o, final b.b$a b$a) {
        this(context, null, (com.google.android.gms.common.api.a<a$c>)a, o, b$a);
    }
    
    public final d$a a() {
        final d$a d$a = new d$a();
        final a$c d = this.d;
        Account c = null;
        Label_0087: {
            Label_0085: {
                if (d instanceof a$c.b) {
                    final GoogleSignInAccount f = ((a$c.b)d).f();
                    if (f != null) {
                        final String i = f.i;
                        if (i == null) {
                            break Label_0085;
                        }
                        c = new Account(i, "com.google");
                        break Label_0087;
                    }
                }
                final a$c d2 = this.d;
                if (d2 instanceof a$c.a) {
                    c = ((a$c.a)d2).c();
                    break Label_0087;
                }
            }
            c = null;
        }
        d$a.a = c;
        final a$c d3 = this.d;
        Set<Object> set;
        if (d3 instanceof a$c.b) {
            final GoogleSignInAccount f2 = ((a$c.b)d3).f();
            if (f2 == null) {
                set = Collections.emptySet();
            }
            else {
                set = f2.g();
            }
        }
        else {
            set = Collections.emptySet();
        }
        if (d$a.b == null) {
            d$a.b = new j0.d();
        }
        d$a.b.addAll((Collection)set);
        d$a.d = this.a.getClass().getName();
        d$a.c = this.a.getPackageName();
        return d$a;
    }
    
    public final v b(final int n, final p p2) {
        final we.h h = new we.h();
        final pd.e j = this.j;
        final e i = this.i;
        j.getClass();
        final int c = p2.c;
        if (c != 0) {
            final pd.a<O> e = this.e;
            final boolean b = j.b();
            Object o = null;
            if (b) {
                n.a().getClass();
                o = new f1(j, c, e, System.currentTimeMillis(), SystemClock.elapsedRealtime());
            }
            if (o != null) {
                final v a = h.a;
                final f s = j.s;
                s.getClass();
                a.b((Executor)new r0(s), (c)o);
            }
        }
        final q1 q1 = new q1(n, p2, h, i);
        final f s2 = j.s;
        ((Handler)s2).sendMessage(((Handler)s2).obtainMessage(4, (Object)new h1((s1)q1, j.n.get(), this)));
        return h.a;
    }
}
