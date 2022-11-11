// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import od.t1;
import od.i1;
import od.r1;
import ve.c;
import java.util.concurrent.Executor;
import od.r0;
import od.f1;
import android.os.SystemClock;
import pd.o;
import ve.x;
import od.p;
import java.util.Set;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collection;
import java.util.Collections;
import android.accounts.Account;
import pd.d$a;
import de.f;
import java.lang.reflect.InvocationTargetException;
import od.h;
import od.t;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import od.g;
import android.os.Build$VERSION;
import android.app.Activity;
import od.e;
import od.a1;
import android.os.Looper;
import android.content.Context;

public abstract class b<O extends a$c> implements d<O>
{
    public final Context a;
    public final String b;
    public final a<O> c;
    public final O d;
    public final od.a<O> e;
    public final Looper f;
    public final int g;
    public final a1 h;
    public final ui.b i;
    public final e j;
    
    @Deprecated
    public b() {
        throw null;
    }
    
    public b(final Activity activity, final a<O> a, final O o, final b.b$a b$a) {
        this((Context)activity, activity, (com.google.android.gms.common.api.a<a$c>)a, o, b$a);
    }
    
    @Deprecated
    public b(final Activity activity, final a<O> a, final O o, final ui.b a2) {
        final b$a$a b$a$a = new b$a$a();
        b$a$a.a = a2;
        final Looper mainLooper = ((Context)activity).getMainLooper();
        lw0.b.S((Object)mainLooper, "Looper must not be null.");
        b$a$a.b = mainLooper;
        this(activity, (com.google.android.gms.common.api.a<a$c>)a, o, b$a$a.a());
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
                            o = (O)new od.a((com.google.android.gms.common.api.a<a$c>)f, o, b2);
                            this.e = (od.a<O>)o;
                            this.h = new a1((b<O>)this);
                            f = od.e.f(this.a);
                            this.j = f;
                            this.g = f.m.getAndIncrement();
                            this.i = c.a;
                            if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                                c = (b.b$a)LifecycleCallback.c(new g(activity));
                                activity = (Activity)((h)c).i(t.class, "ConnectionlessLifecycleHelper");
                                Object o2;
                                if ((o2 = activity) == null) {
                                    o2 = new t((h)c, f, md.e.d);
                                }
                                ((t)o2).k.add((Object)o);
                                f.a((t)o2);
                            }
                            final f s2 = f.s;
                            s2.sendMessage(s2.obtainMessage(7, (Object)this));
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
    
    public final d$a a() {
        final d$a d$a = new d$a();
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
        d$a.a = c;
        final a$c d3 = this.d;
        Set<Object> set;
        if (d3 instanceof a$c.b) {
            final GoogleSignInAccount e2 = ((a$c.b)d3).e();
            if (e2 == null) {
                set = Collections.emptySet();
            }
            else {
                set = e2.q();
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
    
    public final x b(final int n, final p p2) {
        final ve.h h = new ve.h();
        final e j = this.j;
        final ui.b i = this.i;
        j.getClass();
        final int c = p2.c;
        if (c != 0) {
            final od.a<O> e = this.e;
            final boolean b = j.b();
            Object o = null;
            if (b) {
                pd.o.a().getClass();
                o = new f1(j, c, e, System.currentTimeMillis(), SystemClock.elapsedRealtime());
            }
            if (o != null) {
                final x a = h.a;
                final f s = j.s;
                s.getClass();
                a.b((Executor)new r0(s), (c)o);
            }
        }
        final r1 r1 = new r1<Object>(n, (od.p<Object, Object>)p2, (ve.h<Object>)h, i);
        final f s2 = j.s;
        s2.sendMessage(s2.obtainMessage(4, (Object)new i1((t1)r1, j.n.get(), this)));
        return h.a;
    }
}
