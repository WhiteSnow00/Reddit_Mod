// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.Handler;
import xe.c;
import qd.t1;
import qd.i1;
import qd.r1;
import java.util.concurrent.Executor;
import qd.r0;
import qd.f1;
import android.os.SystemClock;
import rd.o;
import xe.x;
import qd.p;
import java.util.Set;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collection;
import java.util.Collections;
import android.accounts.Account;
import fe.f;
import java.lang.reflect.InvocationTargetException;
import qd.h;
import qd.t;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import qd.g;
import android.os.Build$VERSION;
import android.app.Activity;
import qd.e;
import qd.a1;
import android.os.Looper;
import android.content.Context;

public abstract class b<O extends a$c> implements d<O>
{
    public final Context a;
    public final String b;
    public final a<O> c;
    public final O d;
    public final qd.a<O> e;
    public final Looper f;
    public final int g;
    public final a1 h;
    public final h3.b i;
    public final e j;
    
    @Deprecated
    public b() {
        throw null;
    }
    
    public b(final Activity activity, final a<O> a, final O o, final b.b$a b$a) {
        this((Context)activity, activity, (com.google.android.gms.common.api.a<a$c>)a, o, b$a);
    }
    
    @Deprecated
    public b(final Activity activity, final a<O> a, final O o, final h3.b a2) {
        final b$a$a b$a$a = new b$a$a();
        b$a$a.a = a2;
        final Looper mainLooper = ((Context)activity).getMainLooper();
        yd.a.T0((Object)mainLooper, "Looper must not be null.");
        b$a$a.b = mainLooper;
        this(activity, (com.google.android.gms.common.api.a<a$c>)a, o, b$a$a.a());
    }
    
    public b(final Context context, Activity activity, a<O> a, O f, b.b$a c) {
        Label_0293: {
            if (context == null) {
                break Label_0293;
            }
            Label_0283: {
                if (a == null) {
                    break Label_0283;
                }
                Label_0273: {
                    if (c == null) {
                        break Label_0273;
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
                            this.c = (a<O>)a;
                            this.d = f;
                            this.f = c.b;
                            a = new qd.a((a)a, (a$c)f, b2);
                            this.e = (qd.a<O>)a;
                            this.h = new a1((b<O>)this);
                            f = (O)qd.e.f(this.a);
                            this.j = (e)f;
                            this.g = ((e)f).m.getAndIncrement();
                            this.i = c.a;
                            if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                                c = (b.b$a)LifecycleCallback.c(new g(activity));
                                activity = (Activity)((h)c).h((Class)t.class, "ConnectionlessLifecycleHelper");
                                Object o;
                                if ((o = activity) == null) {
                                    o = new t((h)c, (e)f, od.e.d);
                                }
                                ((t)o).k.add((Object)a);
                                ((e)f).a((t)o);
                            }
                            final f s2 = ((e)f).s;
                            ((Handler)s2).sendMessage(((Handler)s2).obtainMessage(7, (Object)this));
                            return;
                            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
                            throw new NullPointerException("Null context is not permitted.");
                            throw new NullPointerException("Api must not be null.");
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
    
    public final rd.d.a a() {
        final rd.d.a a = new rd.d.a();
        final a$c d = this.d;
        Account c = null;
        Label_0087: {
            Label_0085: {
                if (d instanceof a$c.b) {
                    final GoogleSignInAccount e = ((a$c.b)d).e();
                    if (e != null) {
                        final String i = e.i;
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
        a.a = c;
        final a$c d3 = this.d;
        Set<Object> set;
        if (d3 instanceof a$c.b) {
            final GoogleSignInAccount e2 = ((a$c.b)d3).e();
            if (e2 == null) {
                set = Collections.emptySet();
            }
            else {
                set = e2.f();
            }
        }
        else {
            set = Collections.emptySet();
        }
        if (a.b == null) {
            a.b = (j0.d<Scope>)new j0.d();
        }
        a.b.addAll((Collection)set);
        a.d = this.a.getClass().getName();
        a.c = this.a.getPackageName();
        return a;
    }
    
    public final x b(final int n, final p p2) {
        final xe.h h = new xe.h();
        final e j = this.j;
        final h3.b i = this.i;
        j.getClass();
        final int c = p2.c;
        if (c != 0) {
            final qd.a<O> e = this.e;
            final boolean b = j.b();
            c c2 = null;
            if (b) {
                o.a().getClass();
                c2 = new f1(j, c, e, System.currentTimeMillis(), SystemClock.elapsedRealtime());
            }
            if (c2 != null) {
                final x<TResult> a = h.a;
                final f s = j.s;
                s.getClass();
                a.b((Executor)new r0(s), c2);
            }
        }
        final r1 r1 = new r1(n, p2, h, i);
        final f s2 = j.s;
        ((Handler)s2).sendMessage(((Handler)s2).obtainMessage(4, (Object)new i1((t1)r1, j.n.get(), this)));
        return h.a;
    }
}
