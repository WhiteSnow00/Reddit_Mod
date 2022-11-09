// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.workers;

import l6.r;
import androidx.work.impl.WorkDatabase;
import l6.x;
import l5.b;
import l6.t;
import java.util.concurrent.TimeUnit;
import androidx.work.ListenableWorker$a;
import android.database.Cursor;
import java.util.Iterator;
import android.text.TextUtils;
import l6.w;
import l5.c;
import j5.o;
import l6.m;
import l6.j;
import l6.q;
import java.util.ArrayList;
import l6.i;
import l6.v;
import l6.l;
import androidx.work.WorkerParameters;
import android.content.Context;
import c6.h;
import androidx.work.Worker;

public class DiagnosticsWorker extends Worker
{
    public static final String g;
    
    static {
        g = h.e("DiagnosticsWrkr");
    }
    
    public DiagnosticsWorker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    public static String b(final l l, final v v, final i i, final ArrayList list) {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (final q q : list) {
            final l6.h a = ((j)i).a(q.a);
            Object value = null;
            if (a != null) {
                value = a.b;
            }
            final String a2 = q.a;
            final m m = (m)l;
            m.getClass();
            Object o = j5.o.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (a2 == null) {
                ((o)o).bindNull(1);
            }
            else {
                ((o)o).bindString(1, a2);
            }
            m.a.b();
            final Cursor b = c.b(m.a, (o)o, false);
            try {
                final ArrayList list2 = new ArrayList<String>(b.getCount());
                while (b.moveToNext()) {
                    list2.add(b.getString(0));
                }
                b.close();
                ((o)o).h();
                o = q.a;
                o = ((w)v).a((String)o);
                final String join = TextUtils.join((CharSequence)",", (Iterable)list2);
                o = TextUtils.join((CharSequence)",", (Iterable)o);
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", q.a, q.c, value, ((Enum)q.b).name(), join, o));
                continue;
            }
            finally {
                b.close();
                ((o)o).h();
            }
            break;
        }
        return sb.toString();
    }
    
    @Override
    public final ListenableWorker$a a() {
        final WorkDatabase c = d6.j.k(this.getApplicationContext()).c;
        final r x = c.x();
        final l v = c.v();
        final v y = c.y();
        final i u = c.u();
        final long currentTimeMillis = System.currentTimeMillis();
        final long millis = TimeUnit.DAYS.toMillis(1L);
        final t t = (t)x;
        t.getClass();
        Object o = j5.o.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        ((o)o).bindLong(1, currentTimeMillis - millis);
        t.a.b();
        Object o2 = l5.c.b(t.a, (o)o, false);
        try {
            final int b = l5.b.b((Cursor)o2, "required_network_type");
            final int b2 = l5.b.b((Cursor)o2, "requires_charging");
            final int b3 = l5.b.b((Cursor)o2, "requires_device_idle");
            final int b4 = l5.b.b((Cursor)o2, "requires_battery_not_low");
            final int b5 = l5.b.b((Cursor)o2, "requires_storage_not_low");
            final int b6 = l5.b.b((Cursor)o2, "trigger_content_update_delay");
            final int b7 = l5.b.b((Cursor)o2, "trigger_max_content_delay");
            final int b8 = l5.b.b((Cursor)o2, "content_uri_triggers");
            final int b9 = l5.b.b((Cursor)o2, "id");
            final int b10 = l5.b.b((Cursor)o2, "state");
            final int b11 = l5.b.b((Cursor)o2, "worker_class_name");
            final int b12 = l5.b.b((Cursor)o2, "input_merger_class_name");
            final int b13 = l5.b.b((Cursor)o2, "input");
            final int b14 = l5.b.b((Cursor)o2, "output");
            try {
                final int b15 = l5.b.b((Cursor)o2, "initial_delay");
                final int b16 = l5.b.b((Cursor)o2, "interval_duration");
                final int b17 = l5.b.b((Cursor)o2, "flex_duration");
                final int b18 = l5.b.b((Cursor)o2, "run_attempt_count");
                final int b19 = l5.b.b((Cursor)o2, "backoff_policy");
                final int b20 = l5.b.b((Cursor)o2, "backoff_delay_duration");
                final int b21 = l5.b.b((Cursor)o2, "period_start_time");
                final int b22 = l5.b.b((Cursor)o2, "minimum_retention_duration");
                final int b23 = l5.b.b((Cursor)o2, "schedule_requested_at");
                final int b24 = l5.b.b((Cursor)o2, "run_in_foreground");
                final int b25 = l5.b.b((Cursor)o2, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(((Cursor)o2).getCount());
                while (((Cursor)o2).moveToNext()) {
                    final String string = ((Cursor)o2).getString(b9);
                    final String string2 = ((Cursor)o2).getString(b11);
                    final c6.b j = new c6.b();
                    j.a = l6.x.c(((Cursor)o2).getInt(b));
                    j.b = (((Cursor)o2).getInt(b2) != 0);
                    j.c = (((Cursor)o2).getInt(b3) != 0);
                    j.d = (((Cursor)o2).getInt(b4) != 0);
                    j.e = (((Cursor)o2).getInt(b5) != 0);
                    j.f = ((Cursor)o2).getLong(b6);
                    j.g = ((Cursor)o2).getLong(b7);
                    j.h = l6.x.a(((Cursor)o2).getBlob(b8));
                    final q q = new q(string, string2);
                    q.b = l6.x.e(((Cursor)o2).getInt(b10));
                    q.d = ((Cursor)o2).getString(b12);
                    q.e = androidx.work.b.a(((Cursor)o2).getBlob(b13));
                    q.f = androidx.work.b.a(((Cursor)o2).getBlob(b14));
                    q.g = ((Cursor)o2).getLong(b15);
                    q.h = ((Cursor)o2).getLong(b16);
                    q.i = ((Cursor)o2).getLong(b17);
                    q.k = ((Cursor)o2).getInt(b18);
                    q.l = l6.x.b(((Cursor)o2).getInt(b19));
                    q.m = ((Cursor)o2).getLong(b20);
                    q.n = ((Cursor)o2).getLong(b21);
                    q.o = ((Cursor)o2).getLong(b22);
                    q.p = ((Cursor)o2).getLong(b23);
                    q.q = (((Cursor)o2).getInt(b24) != 0);
                    q.r = l6.x.d(((Cursor)o2).getInt(b25));
                    q.j = j;
                    list.add(q);
                }
                ((Cursor)o2).close();
                ((o)o).h();
                o = t.f();
                o2 = t.d();
                if (!list.isEmpty()) {
                    final h c2 = h.c();
                    final String g = DiagnosticsWorker.g;
                    c2.d(g, "Recently completed work:\n\n", new Throwable[0]);
                    h.c().d(g, b(v, y, u, list), new Throwable[0]);
                }
                if (!((ArrayList)o).isEmpty()) {
                    final h c3 = h.c();
                    final String g2 = DiagnosticsWorker.g;
                    c3.d(g2, "Running work:\n\n", new Throwable[0]);
                    h.c().d(g2, b(v, y, u, (ArrayList)o), new Throwable[0]);
                }
                if (!((ArrayList)o2).isEmpty()) {
                    final h c4 = h.c();
                    o = DiagnosticsWorker.g;
                    c4.d((String)o, "Enqueued work:\n\n", new Throwable[0]);
                    h.c().d((String)o, b(v, y, u, (ArrayList)o2), new Throwable[0]);
                }
                return new ListenableWorker$a.c();
            }
            finally {}
        }
        finally {}
        ((Cursor)o2).close();
        ((o)o).h();
    }
}
