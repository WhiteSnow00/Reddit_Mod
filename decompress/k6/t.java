// 
// Decompiled by Procyon v0.6.0
// 

package k6;

import cg.d;
import androidx.work.WorkInfo$State;
import m5.f;
import android.database.Cursor;
import java.util.Iterator;
import k5.c;
import j0.h$a;
import i5.k;
import j0.h$c;
import java.util.ArrayList;
import j0.b;
import i5.s;
import androidx.room.RoomDatabase;

public final class t implements r
{
    public final RoomDatabase a;
    public final t$a b;
    public final t$b c;
    public final t$c d;
    public final t$d e;
    public final t$e f;
    public final t$f g;
    public final t$g h;
    public final t$h i;
    public final t$i j;
    
    public t(final RoomDatabase a) {
        this.a = a;
        this.b = new t$a(a);
        this.c = new s(a) {
            public final String b() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.d = new s(a) {
            public final String b() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.e = new s(a) {
            public final String b() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f = new s(a) {
            public final String b() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.g = new s(a) {
            public final String b() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.h = new s(a) {
            public final String b() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.i = new s(a) {
            public final String b() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.j = new s(a) {
            public final String b() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }
    
    public final void a(final b<String, ArrayList<androidx.work.b>> b) {
        final h$c h$c = (h$c)b.keySet();
        if (h$c.isEmpty()) {
            return;
        }
        if (b.h > 999) {
            b b2 = new b(999);
            final int h = b.h;
            int i = 0;
            int n = 0;
            while (i < h) {
                b2.put((Object)b.j(i), (Object)b.n(i));
                final int n2 = i + 1;
                final int n3 = n + 1;
                i = n2;
                if ((n = n3) == 999) {
                    this.a(b2);
                    b2 = new b(999);
                    n = 0;
                    i = n2;
                }
            }
            if (n > 0) {
                this.a(b2);
            }
            return;
        }
        final StringBuilder t = a.t("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        final k d = k.d(android.support.v4.media.a.e(h$c, t, ")") + 0, t.toString());
        final Iterator iterator = h$c.iterator();
        int n4 = 1;
        while (true) {
            final h$a h$a = (h$a)iterator;
            if (!h$a.hasNext()) {
                break;
            }
            final String s = (String)h$a.next();
            if (s == null) {
                d.bindNull(n4);
            }
            else {
                d.bindString(n4, s);
            }
            ++n4;
        }
        final Cursor b3 = k5.c.b(this.a, d, false);
        try {
            final int a = k5.b.a(b3, "work_spec_id");
            if (a == -1) {
                return;
            }
            while (b3.moveToNext()) {
                if (!b3.isNull(a)) {
                    final ArrayList list = (ArrayList)b.getOrDefault((Object)b3.getString(a), (Object)null);
                    if (list == null) {
                        continue;
                    }
                    list.add(androidx.work.b.a(b3.getBlob(0)));
                }
            }
        }
        finally {
            b3.close();
        }
    }
    
    public final void b(final b<String, ArrayList<String>> b) {
        final h$c h$c = (h$c)b.keySet();
        if (h$c.isEmpty()) {
            return;
        }
        if (b.h > 999) {
            b b2 = new b(999);
            final int h = b.h;
            int i = 0;
            int n = 0;
            while (i < h) {
                b2.put((Object)b.j(i), (Object)b.n(i));
                final int n2 = i + 1;
                final int n3 = n + 1;
                i = n2;
                if ((n = n3) == 999) {
                    this.b(b2);
                    b2 = new b(999);
                    n = 0;
                    i = n2;
                }
            }
            if (n > 0) {
                this.b(b2);
            }
            return;
        }
        final StringBuilder t = a.t("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        final k d = k.d(android.support.v4.media.a.e(h$c, t, ")") + 0, t.toString());
        final Iterator iterator = h$c.iterator();
        int n4 = 1;
        while (true) {
            final h$a h$a = (h$a)iterator;
            if (!h$a.hasNext()) {
                break;
            }
            final String s = (String)h$a.next();
            if (s == null) {
                d.bindNull(n4);
            }
            else {
                d.bindString(n4, s);
            }
            ++n4;
        }
        final Cursor b3 = k5.c.b(this.a, d, false);
        try {
            final int a = k5.b.a(b3, "work_spec_id");
            if (a == -1) {
                return;
            }
            while (b3.moveToNext()) {
                if (!b3.isNull(a)) {
                    final ArrayList list = (ArrayList)b.getOrDefault((Object)b3.getString(a), (Object)null);
                    if (list == null) {
                        continue;
                    }
                    list.add(b3.getString(0));
                }
            }
        }
        finally {
            b3.close();
        }
    }
    
    public final void c(final String s) {
        this.a.b();
        final f a = this.c.a();
        if (s == null) {
            ((m5.d)a).bindNull(1);
        }
        else {
            ((m5.d)a).bindString(1, s);
        }
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.c.c(a);
        }
    }
    
    public final ArrayList d() {
        final k d = k.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        d.bindLong(1, 200);
        this.a.b();
        final Cursor b = k5.c.b(this.a, d, false);
        try {
            final int b2 = k5.b.b(b, "required_network_type");
            final int b3 = k5.b.b(b, "requires_charging");
            final int b4 = k5.b.b(b, "requires_device_idle");
            final int b5 = k5.b.b(b, "requires_battery_not_low");
            final int b6 = k5.b.b(b, "requires_storage_not_low");
            final int b7 = k5.b.b(b, "trigger_content_update_delay");
            final int b8 = k5.b.b(b, "trigger_max_content_delay");
            final int b9 = k5.b.b(b, "content_uri_triggers");
            final int b10 = k5.b.b(b, "id");
            final int b11 = k5.b.b(b, "state");
            final int b12 = k5.b.b(b, "worker_class_name");
            final int b13 = k5.b.b(b, "input_merger_class_name");
            final int b14 = k5.b.b(b, "input");
            final int b15 = k5.b.b(b, "output");
            try {
                final int b16 = k5.b.b(b, "initial_delay");
                final int b17 = k5.b.b(b, "interval_duration");
                final int b18 = k5.b.b(b, "flex_duration");
                final int b19 = k5.b.b(b, "run_attempt_count");
                final int b20 = k5.b.b(b, "backoff_policy");
                final int b21 = k5.b.b(b, "backoff_delay_duration");
                final int b22 = k5.b.b(b, "period_start_time");
                final int b23 = k5.b.b(b, "minimum_retention_duration");
                final int b24 = k5.b.b(b, "schedule_requested_at");
                final int b25 = k5.b.b(b, "run_in_foreground");
                final int b26 = k5.b.b(b, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(b.getCount());
                while (b.moveToNext()) {
                    final String string = b.getString(b10);
                    final String string2 = b.getString(b12);
                    final b6.b j = new b6.b();
                    j.a = x.c(b.getInt(b2));
                    j.b = (b.getInt(b3) != 0);
                    j.c = (b.getInt(b4) != 0);
                    j.d = (b.getInt(b5) != 0);
                    j.e = (b.getInt(b6) != 0);
                    j.f = b.getLong(b7);
                    j.g = b.getLong(b8);
                    j.h = x.a(b.getBlob(b9));
                    final q q = new q(string, string2);
                    q.b = x.e(b.getInt(b11));
                    q.d = b.getString(b13);
                    q.e = androidx.work.b.a(b.getBlob(b14));
                    q.f = androidx.work.b.a(b.getBlob(b15));
                    q.g = b.getLong(b16);
                    q.h = b.getLong(b17);
                    q.i = b.getLong(b18);
                    q.k = b.getInt(b19);
                    q.l = x.b(b.getInt(b20));
                    q.m = b.getLong(b21);
                    q.n = b.getLong(b22);
                    q.o = b.getLong(b23);
                    q.p = b.getLong(b24);
                    q.q = (b.getInt(b25) != 0);
                    q.r = x.d(b.getInt(b26));
                    q.j = j;
                    list.add(q);
                }
                b.close();
                d.h();
                return list;
            }
            finally {}
        }
        finally {}
        b.close();
        d.h();
    }
    
    public final ArrayList e(int b) {
        final k d = k.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        d.bindLong(1, b);
        this.a.b();
        final Cursor b2 = k5.c.b(this.a, d, false);
        try {
            final int b3 = k5.b.b(b2, "required_network_type");
            final int b4 = k5.b.b(b2, "requires_charging");
            final int b5 = k5.b.b(b2, "requires_device_idle");
            final int b6 = k5.b.b(b2, "requires_battery_not_low");
            final int b7 = k5.b.b(b2, "requires_storage_not_low");
            final int b8 = k5.b.b(b2, "trigger_content_update_delay");
            final int b9 = k5.b.b(b2, "trigger_max_content_delay");
            final int b10 = k5.b.b(b2, "content_uri_triggers");
            final int b11 = k5.b.b(b2, "id");
            final int b12 = k5.b.b(b2, "state");
            final int b13 = k5.b.b(b2, "worker_class_name");
            final int b14 = k5.b.b(b2, "input_merger_class_name");
            final int b15 = k5.b.b(b2, "input");
            final int b16 = k5.b.b(b2, "output");
            try {
                final int b17 = k5.b.b(b2, "initial_delay");
                final int b18 = k5.b.b(b2, "interval_duration");
                final int b19 = k5.b.b(b2, "flex_duration");
                final int b20 = k5.b.b(b2, "run_attempt_count");
                b = k5.b.b(b2, "backoff_policy");
                final int b21 = k5.b.b(b2, "backoff_delay_duration");
                final int b22 = k5.b.b(b2, "period_start_time");
                final int b23 = k5.b.b(b2, "minimum_retention_duration");
                final int b24 = k5.b.b(b2, "schedule_requested_at");
                final int b25 = k5.b.b(b2, "run_in_foreground");
                final int b26 = k5.b.b(b2, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(b2.getCount());
                while (b2.moveToNext()) {
                    final String string = b2.getString(b11);
                    final String string2 = b2.getString(b13);
                    final b6.b j = new b6.b();
                    j.a = x.c(b2.getInt(b3));
                    j.b = (b2.getInt(b4) != 0);
                    j.c = (b2.getInt(b5) != 0);
                    j.d = (b2.getInt(b6) != 0);
                    j.e = (b2.getInt(b7) != 0);
                    j.f = b2.getLong(b8);
                    j.g = b2.getLong(b9);
                    j.h = x.a(b2.getBlob(b10));
                    final q q = new q(string, string2);
                    q.b = x.e(b2.getInt(b12));
                    q.d = b2.getString(b14);
                    q.e = androidx.work.b.a(b2.getBlob(b15));
                    q.f = androidx.work.b.a(b2.getBlob(b16));
                    q.g = b2.getLong(b17);
                    q.h = b2.getLong(b18);
                    q.i = b2.getLong(b19);
                    q.k = b2.getInt(b20);
                    q.l = x.b(b2.getInt(b));
                    q.m = b2.getLong(b21);
                    q.n = b2.getLong(b22);
                    q.o = b2.getLong(b23);
                    q.p = b2.getLong(b24);
                    q.q = (b2.getInt(b25) != 0);
                    q.r = x.d(b2.getInt(b26));
                    q.j = j;
                    list.add(q);
                }
                b2.close();
                d.h();
                return list;
            }
            finally {}
        }
        finally {}
        b2.close();
        d.h();
    }
    
    public final ArrayList f() {
        final k d = k.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        this.a.b();
        final Cursor b = k5.c.b(this.a, d, false);
        try {
            final int b2 = k5.b.b(b, "required_network_type");
            final int b3 = k5.b.b(b, "requires_charging");
            final int b4 = k5.b.b(b, "requires_device_idle");
            final int b5 = k5.b.b(b, "requires_battery_not_low");
            final int b6 = k5.b.b(b, "requires_storage_not_low");
            final int b7 = k5.b.b(b, "trigger_content_update_delay");
            final int b8 = k5.b.b(b, "trigger_max_content_delay");
            final int b9 = k5.b.b(b, "content_uri_triggers");
            final int b10 = k5.b.b(b, "id");
            final int b11 = k5.b.b(b, "state");
            final int b12 = k5.b.b(b, "worker_class_name");
            final int b13 = k5.b.b(b, "input_merger_class_name");
            final int b14 = k5.b.b(b, "input");
            final int b15 = k5.b.b(b, "output");
            try {
                final int b16 = k5.b.b(b, "initial_delay");
                final int b17 = k5.b.b(b, "interval_duration");
                final int b18 = k5.b.b(b, "flex_duration");
                final int b19 = k5.b.b(b, "run_attempt_count");
                final int b20 = k5.b.b(b, "backoff_policy");
                final int b21 = k5.b.b(b, "backoff_delay_duration");
                final int b22 = k5.b.b(b, "period_start_time");
                final int b23 = k5.b.b(b, "minimum_retention_duration");
                final int b24 = k5.b.b(b, "schedule_requested_at");
                final int b25 = k5.b.b(b, "run_in_foreground");
                final int b26 = k5.b.b(b, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(b.getCount());
                while (b.moveToNext()) {
                    final String string = b.getString(b10);
                    final String string2 = b.getString(b12);
                    final b6.b j = new b6.b();
                    j.a = x.c(b.getInt(b2));
                    j.b = (b.getInt(b3) != 0);
                    j.c = (b.getInt(b4) != 0);
                    j.d = (b.getInt(b5) != 0);
                    j.e = (b.getInt(b6) != 0);
                    j.f = b.getLong(b7);
                    j.g = b.getLong(b8);
                    j.h = x.a(b.getBlob(b9));
                    final q q = new q(string, string2);
                    q.b = x.e(b.getInt(b11));
                    q.d = b.getString(b13);
                    q.e = androidx.work.b.a(b.getBlob(b14));
                    q.f = androidx.work.b.a(b.getBlob(b15));
                    q.g = b.getLong(b16);
                    q.h = b.getLong(b17);
                    q.i = b.getLong(b18);
                    q.k = b.getInt(b19);
                    q.l = x.b(b.getInt(b20));
                    q.m = b.getLong(b21);
                    q.n = b.getLong(b22);
                    q.o = b.getLong(b23);
                    q.p = b.getLong(b24);
                    q.q = (b.getInt(b25) != 0);
                    q.r = x.d(b.getInt(b26));
                    q.j = j;
                    list.add(q);
                }
                b.close();
                d.h();
                return list;
            }
            finally {}
        }
        finally {}
        b.close();
        d.h();
    }
    
    public final ArrayList g() {
        final k d = k.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.a.b();
        final Cursor b = k5.c.b(this.a, d, false);
        try {
            final int b2 = k5.b.b(b, "required_network_type");
            final int b3 = k5.b.b(b, "requires_charging");
            final int b4 = k5.b.b(b, "requires_device_idle");
            final int b5 = k5.b.b(b, "requires_battery_not_low");
            final int b6 = k5.b.b(b, "requires_storage_not_low");
            final int b7 = k5.b.b(b, "trigger_content_update_delay");
            final int b8 = k5.b.b(b, "trigger_max_content_delay");
            final int b9 = k5.b.b(b, "content_uri_triggers");
            final int b10 = k5.b.b(b, "id");
            final int b11 = k5.b.b(b, "state");
            final int b12 = k5.b.b(b, "worker_class_name");
            final int b13 = k5.b.b(b, "input_merger_class_name");
            final int b14 = k5.b.b(b, "input");
            final int b15 = k5.b.b(b, "output");
            try {
                final int b16 = k5.b.b(b, "initial_delay");
                final int b17 = k5.b.b(b, "interval_duration");
                final int b18 = k5.b.b(b, "flex_duration");
                final int b19 = k5.b.b(b, "run_attempt_count");
                final int b20 = k5.b.b(b, "backoff_policy");
                final int b21 = k5.b.b(b, "backoff_delay_duration");
                final int b22 = k5.b.b(b, "period_start_time");
                final int b23 = k5.b.b(b, "minimum_retention_duration");
                final int b24 = k5.b.b(b, "schedule_requested_at");
                final int b25 = k5.b.b(b, "run_in_foreground");
                final int b26 = k5.b.b(b, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(b.getCount());
                while (b.moveToNext()) {
                    final String string = b.getString(b10);
                    final String string2 = b.getString(b12);
                    final b6.b j = new b6.b();
                    j.a = x.c(b.getInt(b2));
                    j.b = (b.getInt(b3) != 0);
                    j.c = (b.getInt(b4) != 0);
                    j.d = (b.getInt(b5) != 0);
                    j.e = (b.getInt(b6) != 0);
                    j.f = b.getLong(b7);
                    j.g = b.getLong(b8);
                    j.h = x.a(b.getBlob(b9));
                    final q q = new q(string, string2);
                    q.b = x.e(b.getInt(b11));
                    q.d = b.getString(b13);
                    q.e = androidx.work.b.a(b.getBlob(b14));
                    q.f = androidx.work.b.a(b.getBlob(b15));
                    q.g = b.getLong(b16);
                    q.h = b.getLong(b17);
                    q.i = b.getLong(b18);
                    q.k = b.getInt(b19);
                    q.l = x.b(b.getInt(b20));
                    q.m = b.getLong(b21);
                    q.n = b.getLong(b22);
                    q.o = b.getLong(b23);
                    q.p = b.getLong(b24);
                    q.q = (b.getInt(b25) != 0);
                    q.r = x.d(b.getInt(b26));
                    q.j = j;
                    list.add(q);
                }
                b.close();
                d.h();
                return list;
            }
            finally {}
        }
        finally {}
        b.close();
        d.h();
    }
    
    public final WorkInfo$State h(final String s) {
        final k d = k.d(1, "SELECT state FROM workspec WHERE id=?");
        if (s == null) {
            d.bindNull(1);
        }
        else {
            d.bindString(1, s);
        }
        this.a.b();
        final RoomDatabase a = this.a;
        WorkInfo$State e = null;
        final Cursor b = k5.c.b(a, d, false);
        try {
            if (b.moveToFirst()) {
                e = x.e(b.getInt(0));
            }
            return e;
        }
        finally {
            b.close();
            d.h();
        }
    }
    
    public final ArrayList i(String b) {
        final k d = k.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (b == null) {
            d.bindNull(1);
        }
        else {
            d.bindString(1, b);
        }
        this.a.b();
        b = (String)k5.c.b(this.a, d, false);
        try {
            final ArrayList<String> list = new ArrayList<String>(((Cursor)b).getCount());
            while (((Cursor)b).moveToNext()) {
                list.add(((Cursor)b).getString(0));
            }
            return list;
        }
        finally {
            ((Cursor)b).close();
            d.h();
        }
    }
    
    public final ArrayList j(String b) {
        final k d = k.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (b == null) {
            d.bindNull(1);
        }
        else {
            d.bindString(1, b);
        }
        this.a.b();
        b = (String)k5.c.b(this.a, d, false);
        try {
            final ArrayList<String> list = new ArrayList<String>(((Cursor)b).getCount());
            while (((Cursor)b).moveToNext()) {
                list.add(((Cursor)b).getString(0));
            }
            return list;
        }
        finally {
            ((Cursor)b).close();
            d.h();
        }
    }
    
    public final q k(final String s) {
        final k d = k.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (s == null) {
            d.bindNull(1);
        }
        else {
            d.bindString(1, s);
        }
        this.a.b();
        final Cursor b = k5.c.b(this.a, d, false);
        try {
            final int b2 = k5.b.b(b, "required_network_type");
            final int b3 = k5.b.b(b, "requires_charging");
            final int b4 = k5.b.b(b, "requires_device_idle");
            final int b5 = k5.b.b(b, "requires_battery_not_low");
            final int b6 = k5.b.b(b, "requires_storage_not_low");
            final int b7 = k5.b.b(b, "trigger_content_update_delay");
            final int b8 = k5.b.b(b, "trigger_max_content_delay");
            final int b9 = k5.b.b(b, "content_uri_triggers");
            final int b10 = k5.b.b(b, "id");
            final int b11 = k5.b.b(b, "state");
            final int b12 = k5.b.b(b, "worker_class_name");
            final int b13 = k5.b.b(b, "input_merger_class_name");
            final int b14 = k5.b.b(b, "input");
            final int b15 = k5.b.b(b, "output");
            try {
                final int b16 = k5.b.b(b, "initial_delay");
                final int b17 = k5.b.b(b, "interval_duration");
                final int b18 = k5.b.b(b, "flex_duration");
                final int b19 = k5.b.b(b, "run_attempt_count");
                final int b20 = k5.b.b(b, "backoff_policy");
                final int b21 = k5.b.b(b, "backoff_delay_duration");
                final int b22 = k5.b.b(b, "period_start_time");
                final int b23 = k5.b.b(b, "minimum_retention_duration");
                final int b24 = k5.b.b(b, "schedule_requested_at");
                final int b25 = k5.b.b(b, "run_in_foreground");
                final int b26 = k5.b.b(b, "out_of_quota_policy");
                q q;
                if (b.moveToFirst()) {
                    final String string = b.getString(b10);
                    final String string2 = b.getString(b12);
                    final b6.b j = new b6.b();
                    j.a = x.c(b.getInt(b2));
                    j.b = (b.getInt(b3) != 0);
                    j.c = (b.getInt(b4) != 0);
                    j.d = (b.getInt(b5) != 0);
                    j.e = (b.getInt(b6) != 0);
                    j.f = b.getLong(b7);
                    j.g = b.getLong(b8);
                    j.h = x.a(b.getBlob(b9));
                    q = new q(string, string2);
                    q.b = x.e(b.getInt(b11));
                    q.d = b.getString(b13);
                    q.e = androidx.work.b.a(b.getBlob(b14));
                    q.f = androidx.work.b.a(b.getBlob(b15));
                    q.g = b.getLong(b16);
                    q.h = b.getLong(b17);
                    q.i = b.getLong(b18);
                    q.k = b.getInt(b19);
                    q.l = x.b(b.getInt(b20));
                    q.m = b.getLong(b21);
                    q.n = b.getLong(b22);
                    q.o = b.getLong(b23);
                    q.p = b.getLong(b24);
                    q.q = (b.getInt(b25) != 0);
                    q.r = x.d(b.getInt(b26));
                    q.j = j;
                }
                else {
                    q = null;
                }
                b.close();
                d.h();
                return q;
            }
            finally {}
        }
        finally {}
        b.close();
        d.h();
    }
    
    public final ArrayList l(String b) {
        final k d = k.d(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (b == null) {
            d.bindNull(1);
        }
        else {
            d.bindString(1, b);
        }
        this.a.b();
        b = (String)k5.c.b(this.a, d, false);
        try {
            final int b2 = k5.b.b((Cursor)b, "id");
            final int b3 = k5.b.b((Cursor)b, "state");
            final ArrayList<q$b> list = new ArrayList<q$b>(((Cursor)b).getCount());
            while (((Cursor)b).moveToNext()) {
                final q$b q$b = new q$b();
                q$b.a = ((Cursor)b).getString(b2);
                q$b.b = x.e(((Cursor)b).getInt(b3));
                list.add(q$b);
            }
            return list;
        }
        finally {
            ((Cursor)b).close();
            d.h();
        }
    }
    
    public final int m(final String s) {
        this.a.b();
        final f a = this.f.a();
        if (s == null) {
            ((m5.d)a).bindNull(1);
        }
        else {
            ((m5.d)a).bindString(1, s);
        }
        this.a.c();
        try {
            final int executeUpdateDelete = a.executeUpdateDelete();
            this.a.q();
            return executeUpdateDelete;
        }
        finally {
            this.a.m();
            this.f.c(a);
        }
    }
    
    public final int n(final long n, final String s) {
        this.a.b();
        final f a = this.h.a();
        ((m5.d)a).bindLong(1, n);
        if (s == null) {
            ((m5.d)a).bindNull(2);
        }
        else {
            ((m5.d)a).bindString(2, s);
        }
        this.a.c();
        try {
            final int executeUpdateDelete = a.executeUpdateDelete();
            this.a.q();
            return executeUpdateDelete;
        }
        finally {
            this.a.m();
            this.h.c(a);
        }
    }
    
    public final void o() {
        this.a.b();
        final f a = this.j.a();
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.j.c(a);
        }
    }
    
    public final int p(final String s) {
        this.a.b();
        final f a = this.g.a();
        if (s == null) {
            ((m5.d)a).bindNull(1);
        }
        else {
            ((m5.d)a).bindString(1, s);
        }
        this.a.c();
        try {
            final int executeUpdateDelete = a.executeUpdateDelete();
            this.a.q();
            return executeUpdateDelete;
        }
        finally {
            this.a.m();
            this.g.c(a);
        }
    }
    
    public final void q(final String s, final androidx.work.b b) {
        this.a.b();
        final f a = this.d.a();
        final byte[] e = androidx.work.b.e(b);
        if (e == null) {
            ((m5.d)a).bindNull(1);
        }
        else {
            ((m5.d)a).bindBlob(1, e);
        }
        if (s == null) {
            ((m5.d)a).bindNull(2);
        }
        else {
            ((m5.d)a).bindString(2, s);
        }
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.d.c(a);
        }
    }
    
    public final void r(final long n, final String s) {
        this.a.b();
        final f a = this.e.a();
        ((m5.d)a).bindLong(1, n);
        if (s == null) {
            ((m5.d)a).bindNull(2);
        }
        else {
            ((m5.d)a).bindString(2, s);
        }
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.e.c(a);
        }
    }
    
    public final int s(final WorkInfo$State workInfo$State, final String... array) {
        this.a.b();
        final StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        cg.d.F0(array.length, sb);
        sb.append(")");
        final f f = this.a.f(sb.toString());
        ((m5.d)f).bindLong(1, (long)x.f(workInfo$State));
        final int length = array.length;
        int n = 2;
        for (final String s : array) {
            if (s == null) {
                ((m5.d)f).bindNull(n);
            }
            else {
                ((m5.d)f).bindString(n, s);
            }
            ++n;
        }
        this.a.c();
        try {
            final int executeUpdateDelete = f.executeUpdateDelete();
            this.a.q();
            return executeUpdateDelete;
        }
        finally {
            this.a.m();
        }
    }
}
