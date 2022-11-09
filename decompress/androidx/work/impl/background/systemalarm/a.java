// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import androidx.work.impl.WorkDatabase;
import androidx.room.RoomDatabase;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import l6.j;
import java.util.ArrayList;
import java.util.Collection;
import android.content.ComponentName;
import androidx.work.NetworkType;
import l6.q;
import l6.t;
import android.content.Intent;
import c6.h;
import java.util.HashMap;
import android.content.Context;

public final class a implements d6.a
{
    public static final String i;
    public final Context f;
    public final HashMap g;
    public final Object h;
    
    static {
        i = h.e("CommandHandler");
    }
    
    public a(final Context f) {
        this.f = f;
        this.g = new HashMap();
        this.h = new Object();
    }
    
    public static Intent a(final Context context, final String s) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    public static Intent b(final Context context, final String s) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    public final void c(final String s, final boolean b) {
        synchronized (this.h) {
            final d6.a a = this.g.remove(s);
            if (a != null) {
                a.c(s, b);
            }
        }
    }
    
    public final void d(int n, Intent c, final d d) {
        final String action = c.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c6.h.c().a(a.i, String.format("Handling constraints changed %s", c), new Throwable[0]);
            final Context f = this.f;
            final b b = new b(f, n, d);
            final ArrayList g = ((t)d.j.c.x()).g();
            final String a = ConstraintProxy.a;
            final Iterator iterator = g.iterator();
            int n3;
            int n2 = n3 = 0;
            int n5;
            int n4 = n5 = n3;
            boolean b2;
            boolean b3;
            boolean b4;
            int n6;
            while (true) {
                b2 = (n2 != 0);
                b3 = (n3 != 0);
                b4 = (n4 != 0);
                n6 = n5;
                if (!iterator.hasNext()) {
                    break;
                }
                final c6.b j = ((q)iterator.next()).j;
                b2 = ((n2 | (j.d ? 1 : 0)) != 0x0);
                b3 = ((n3 | (j.b ? 1 : 0)) != 0x0);
                b4 = ((n4 | (j.e ? 1 : 0)) != 0x0);
                if (j.a != NetworkType.NOT_REQUIRED) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                n6 = (n5 | n);
                n2 = (b2 ? 1 : 0);
                n3 = (b3 ? 1 : 0);
                n4 = (b4 ? 1 : 0);
                n5 = n6;
                if (!b2) {
                    continue;
                }
                n2 = (b2 ? 1 : 0);
                n3 = (b3 ? 1 : 0);
                n4 = (b4 ? 1 : 0);
                n5 = n6;
                if (!b3) {
                    continue;
                }
                n2 = (b2 ? 1 : 0);
                n3 = (b3 ? 1 : 0);
                n4 = (b4 ? 1 : 0);
                n5 = n6;
                if (!b4) {
                    continue;
                }
                n2 = (b2 ? 1 : 0);
                n3 = (b3 ? 1 : 0);
                n4 = (b4 ? 1 : 0);
                if ((n5 = n6) != 0) {
                    break;
                }
            }
            final String a2 = ConstraintProxyUpdateReceiver.a;
            final Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent.setComponent(new ComponentName(f, (Class)ConstraintProxyUpdateReceiver.class));
            intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", b2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", b3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", b4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", (boolean)(n6 != 0));
            f.sendBroadcast(intent);
            b.d.b(g);
            final ArrayList list = new ArrayList<q>(g.size());
            final long currentTimeMillis = System.currentTimeMillis();
            for (final q q : g) {
                final String a3 = q.a;
                if (currentTimeMillis >= q.a() && (!q.b() || b.d.a(a3))) {
                    list.add(q);
                }
            }
            final Iterator<q> iterator3 = list.iterator();
            while (iterator3.hasNext()) {
                final String a4 = iterator3.next().a;
                final Intent a5 = a(b.a, a4);
                c6.h.c().a(androidx.work.impl.background.systemalarm.b.e, String.format("Creating a delay_met command for workSpec with id (%s)", a4), new Throwable[0]);
                final d c2 = b.c;
                c2.e((Runnable)new d$b(b.b, a5, c2));
            }
            b.d.c();
        }
        else if ("ACTION_RESCHEDULE".equals(action)) {
            c6.h.c().a(a.i, String.format("Handling reschedule %s, %s", c, n), new Throwable[0]);
            d.j.n();
        }
        else {
            final Bundle extras = c.getExtras();
            boolean b5 = false;
            Label_0681: {
                Label_0678: {
                    if (extras != null) {
                        if (!((BaseBundle)extras).isEmpty()) {
                            for (int i = 0; i < 1; ++i) {
                                if (((BaseBundle)extras).get((new String[] { "KEY_WORKSPEC_ID" })[i]) == null) {
                                    break Label_0678;
                                }
                            }
                            b5 = true;
                            break Label_0681;
                        }
                    }
                }
                b5 = false;
            }
            if (!b5) {
                c6.h.c().b(a.i, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            }
            else {
                if ("ACTION_SCHEDULE_WORK".equals(action)) {
                    final String string = ((BaseBundle)c.getExtras()).getString("KEY_WORKSPEC_ID");
                    final h c3 = c6.h.c();
                    final String k = a.i;
                    c3.a(k, String.format("Handling schedule work for %s", string), new Throwable[0]);
                    c = (Intent)d.j.c;
                    ((RoomDatabase)c).c();
                    try {
                        final q l = ((t)((WorkDatabase)c).x()).k(string);
                        if (l == null) {
                            final h c4 = c6.h.c();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Skipping scheduling ");
                            sb.append(string);
                            sb.append(" because it's no longer in the DB");
                            c4.f(k, sb.toString(), new Throwable[0]);
                        }
                        else if (l.b.isFinished()) {
                            final h c5 = c6.h.c();
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Skipping scheduling ");
                            sb2.append(string);
                            sb2.append("because it is finished.");
                            c5.f(k, sb2.toString(), new Throwable[0]);
                        }
                        else {
                            final long a6 = l.a();
                            if (!l.b()) {
                                c6.h.c().a(k, String.format("Setting up Alarms for %s at %s", string, a6), new Throwable[0]);
                                f6.a.b(this.f, d.j, string, a6);
                            }
                            else {
                                c6.h.c().a(k, String.format("Opportunistically setting an alarm for %s at %s", string, a6), new Throwable[0]);
                                f6.a.b(this.f, d.j, string, a6);
                                final Intent intent2 = new Intent(this.f, (Class)SystemAlarmService.class);
                                intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
                                d.e((Runnable)new d$b(n, intent2, d));
                            }
                            ((RoomDatabase)c).q();
                        }
                        return;
                    }
                    finally {
                        ((RoomDatabase)c).m();
                    }
                }
                if ("ACTION_DELAY_MET".equals(action)) {
                    final Bundle extras2 = c.getExtras();
                    synchronized (this.h) {
                        final String string2 = ((BaseBundle)extras2).getString("KEY_WORKSPEC_ID");
                        final h c6 = c6.h.c();
                        final String m = a.i;
                        c6.a(m, String.format("Handing delay met for %s", string2), new Throwable[0]);
                        if (!this.g.containsKey(string2)) {
                            final c c7 = new c(this.f, n, string2, d);
                            this.g.put(string2, c7);
                            c7.f();
                        }
                        else {
                            c6.h.c().a(m, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                        }
                        return;
                    }
                }
                if ("ACTION_STOP_WORK".equals(action)) {
                    final String string3 = ((BaseBundle)c.getExtras()).getString("KEY_WORKSPEC_ID");
                    c6.h.c().a(a.i, String.format("Handing stopWork work for %s", string3), new Throwable[0]);
                    d.j.p(string3);
                    final Context f2 = this.f;
                    final d6.j j2 = d.j;
                    final String a7 = f6.a.a;
                    final j j3 = (j)j2.c.u();
                    final l6.h a8 = j3.a(string3);
                    if (a8 != null) {
                        f6.a.a(f2, a8.b, string3);
                        c6.h.c().a(f6.a.a, String.format("Removing SystemIdInfo for workSpecId (%s)", string3), new Throwable[0]);
                        j3.c(string3);
                    }
                    d.c(string3, false);
                }
                else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                    final Bundle extras3 = c.getExtras();
                    final String string4 = ((BaseBundle)extras3).getString("KEY_WORKSPEC_ID");
                    final boolean boolean1 = ((BaseBundle)extras3).getBoolean("KEY_NEEDS_RESCHEDULE");
                    c6.h.c().a(a.i, String.format("Handling onExecutionCompleted %s, %s", c, n), new Throwable[0]);
                    this.c(string4, boolean1);
                }
                else {
                    c6.h.c().f(a.i, String.format("Ignoring intent %s", c), new Throwable[0]);
                }
            }
        }
    }
}
