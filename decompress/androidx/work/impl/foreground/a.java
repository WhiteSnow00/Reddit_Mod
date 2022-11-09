// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.foreground;

import java.util.Map;
import android.os.Build$VERSION;
import android.text.TextUtils;
import java.util.List;
import m6.p;
import n6.b;
import java.util.ArrayList;
import android.app.Notification;
import java.util.Iterator;
import k6.e;
import java.util.Collection;
import l6.q;
import android.os.Parcelable;
import android.content.Intent;
import c6.h;
import h6.d;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import d6.j;
import android.content.Context;
import h6.c;

public final class a implements c, d6.a
{
    public static final String p;
    public Context f;
    public j g;
    public final n6.a h;
    public final Object i;
    public String j;
    public final LinkedHashMap k;
    public final HashMap l;
    public final HashSet m;
    public final d n;
    public a.a$a o;
    
    static {
        p = h.e("SystemFgDispatcher");
    }
    
    public a(final Context f) {
        this.f = f;
        this.i = new Object();
        final j k = d6.j.k(f);
        this.g = k;
        final n6.a d = k.d;
        this.h = d;
        this.j = null;
        this.k = new LinkedHashMap();
        this.m = new HashSet();
        this.l = new HashMap();
        this.n = new d(this.f, d, (c)this);
        this.g.f.a((d6.a)this);
    }
    
    public static Intent a(final Context context, final String s, final c6.d d) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", d.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", d.b);
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)d.c);
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    public static Intent b(final Context context, final String s, final c6.d d) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        intent.putExtra("KEY_NOTIFICATION_ID", d.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", d.b);
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)d.c);
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    public final void c(final String s, final boolean b) {
        final Object i = this.i;
        monitorenter(i);
        Label_0062: {
            try {
                final q q = this.l.remove(s);
                if (q != null && this.m.remove(q)) {
                    this.n.b(this.m);
                }
                break Label_0062;
            }
            finally {
                monitorexit(i);
                Object o = null;
                Label_0151: {
                    this.j = ((Map.Entry<String, V>)o).getKey();
                }
                iftrue(Label_0272:)(this.o == null);
            Label_0127:
                while (true) {
                    Iterator iterator = null;
                    Block_8: {
                    Label_0272_Outer:
                        while (true) {
                            a.a$a o2 = null;
                            final c6.d d;
                        Block_11:
                            while (true) {
                                Block_9: {
                                    break Block_9;
                                    iterator = this.k.entrySet().iterator();
                                    o = iterator.next();
                                    break Label_0127;
                                    o2 = this.o;
                                    iftrue(Label_0364:)(d == null || o2 == null);
                                    break Block_11;
                                }
                                final c6.d d2 = (c6.d)((Map.Entry)o).getValue();
                                final a.a$a o3 = this.o;
                                final int a = d2.a;
                                final int b2 = d2.b;
                                final Notification c = d2.c;
                                final SystemForegroundService systemForegroundService = (SystemForegroundService)o3;
                                systemForegroundService.g.post((Runnable)new k6.c(systemForegroundService, a, c, b2));
                                final a.a$a o4 = this.o;
                                final int a2 = d2.a;
                                final SystemForegroundService systemForegroundService2 = (SystemForegroundService)o4;
                                systemForegroundService2.g.post((Runnable)new e(systemForegroundService2, a2));
                                continue;
                            }
                            c6.h.c().a(a.p, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", d.a, s, d.b), new Throwable[0]);
                            final int a3 = d.a;
                            final SystemForegroundService systemForegroundService3 = (SystemForegroundService)o2;
                            systemForegroundService3.g.post((Runnable)new e(systemForegroundService3, a3));
                            return;
                            iftrue(Label_0151:)(!iterator.hasNext());
                            break Block_8;
                            Label_0364:
                            return;
                            monitorexit(i);
                            d = (c6.d)this.k.remove(s);
                            iftrue(Label_0272:)(!s.equals(this.j) || this.k.size() <= 0);
                            continue Label_0272_Outer;
                        }
                    }
                    o = iterator.next();
                    continue Label_0127;
                }
            }
        }
    }
    
    public final void d(final ArrayList list) {
        if (!list.isEmpty()) {
            for (final String s : list) {
                c6.h.c().a(a.p, String.format("Constraints unmet for WorkSpec %s", s), new Throwable[0]);
                final j g = this.g;
                ((b)g.d).a((Runnable)new p(g, s, true));
            }
        }
    }
    
    public final void e(final List<String> list) {
    }
    
    public final void f(final Intent intent) {
        int n = 0;
        final int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        final int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        final Notification notification = (Notification)intent.getParcelableExtra("KEY_NOTIFICATION");
        c6.h.c().a(a.p, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", intExtra, stringExtra, intExtra2), new Throwable[0]);
        if (notification != null && this.o != null) {
            this.k.put(stringExtra, new c6.d(intExtra, intExtra2, notification));
            if (TextUtils.isEmpty((CharSequence)this.j)) {
                this.j = stringExtra;
                final SystemForegroundService systemForegroundService = (SystemForegroundService)this.o;
                systemForegroundService.g.post((Runnable)new k6.c(systemForegroundService, intExtra, notification, intExtra2));
            }
            else {
                final SystemForegroundService systemForegroundService2 = (SystemForegroundService)this.o;
                systemForegroundService2.g.post((Runnable)new k6.d(systemForegroundService2, intExtra, notification));
                if (intExtra2 != 0 && Build$VERSION.SDK_INT >= 29) {
                    final Iterator iterator = this.k.entrySet().iterator();
                    while (iterator.hasNext()) {
                        n |= ((Map.Entry<K, c6.d>)iterator.next()).getValue().b;
                    }
                    final c6.d d = this.k.get(this.j);
                    if (d != null) {
                        final a.a$a o = this.o;
                        final int a = d.a;
                        final Notification c = d.c;
                        final SystemForegroundService systemForegroundService3 = (SystemForegroundService)o;
                        systemForegroundService3.g.post((Runnable)new k6.c(systemForegroundService3, a, c, n));
                    }
                }
            }
        }
    }
}
