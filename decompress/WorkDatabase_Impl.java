// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl;

import l6.v;
import l6.r;
import l6.o;
import l6.l;
import l6.i;
import l6.e;
import androidx.room.h;
import java.util.HashSet;
import androidx.appcompat.widget.s0;
import java.util.Arrays;
import l5.d;
import androidx.room.h$b;
import java.util.List;
import androidx.room.RoomDatabase$b;
import o5.a;
import androidx.room.h$a;
import androidx.room.b;
import androidx.room.RoomDatabase;
import java.util.HashMap;
import l6.g;
import l6.p;
import l6.m;
import l6.j;
import l6.w;
import l6.c;
import l6.t;

public final class WorkDatabase_Impl extends WorkDatabase
{
    public static final /* synthetic */ int v = 0;
    public volatile t o;
    public volatile c p;
    public volatile w q;
    public volatile j r;
    public volatile m s;
    public volatile p t;
    public volatile g u;
    
    public final j5.g g() {
        return new j5.g((RoomDatabase)this, new HashMap(0), new HashMap(0), new String[] { "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference" });
    }
    
    public final n5.b h(final b b) {
        final h c = new h(b, (h$a)new h$a() {
            public final void a(final a a) {
                a.u(a, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                a.u(a, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                a.u(a, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                a.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            }
            
            public final void b(final a a) {
                a.u(a, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
                a.execSQL("DROP TABLE IF EXISTS `WorkName`");
                a.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
                a.execSQL("DROP TABLE IF EXISTS `Preference`");
                final WorkDatabase_Impl b = WorkDatabase_Impl.this;
                final int v = WorkDatabase_Impl.v;
                final List g = b.g;
                if (g != null) {
                    for (int i = 0; i < g.size(); ++i) {
                        ((RoomDatabase$b)WorkDatabase_Impl.this.g.get(i)).getClass();
                    }
                }
            }
            
            public final void c(final a a) {
                final WorkDatabase_Impl b = WorkDatabase_Impl.this;
                final int v = WorkDatabase_Impl.v;
                final List g = b.g;
                if (g != null) {
                    for (int i = 0; i < g.size(); ++i) {
                        ((RoomDatabase$b)WorkDatabase_Impl.this.g.get(i)).a(a);
                    }
                }
            }
            
            public final void d(final a a) {
                final WorkDatabase_Impl b = WorkDatabase_Impl.this;
                final int v = WorkDatabase_Impl.v;
                ((a)(b.a = (n5.a)a)).execSQL("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.n((n5.a)a);
                final List g = WorkDatabase_Impl.this.g;
                if (g != null) {
                    for (int i = 0; i < g.size(); ++i) {
                        ((RoomDatabase$b)WorkDatabase_Impl.this.g.get(i)).b(a);
                    }
                }
            }
            
            public final void e() {
            }
            
            public final void f(final a a) {
                l5.c.a(a);
            }
            
            public final h$b g(final a a) {
                final HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new d.a(1, "work_spec_id", "TEXT", null, true, 1));
                final HashSet r = d.r(hashMap, "prerequisite_id", new d.a(2, "prerequisite_id", "TEXT", null, true, 1), 2);
                r.add(new d.b("WorkSpec", Arrays.asList("work_spec_id"), Arrays.asList("id"), "CASCADE", "CASCADE"));
                final HashSet q = s0.q(r, new d.b("WorkSpec", Arrays.asList("prerequisite_id"), Arrays.asList("id"), "CASCADE", "CASCADE"), 2);
                q.add(new d.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), null, false));
                q.add(new d.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), null, false));
                final d d = new d("Dependency", hashMap, r, q);
                final d a2 = l5.d.a(a, "Dependency");
                if (!d.equals(a2)) {
                    return new h$b(false, b.h("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", d, "\n Found:\n", a2));
                }
                final HashMap hashMap2 = new HashMap(25);
                hashMap2.put("id", new d.a(1, "id", "TEXT", null, true, 1));
                hashMap2.put("state", new d.a(0, "state", "INTEGER", null, true, 1));
                hashMap2.put("worker_class_name", new d.a(0, "worker_class_name", "TEXT", null, true, 1));
                hashMap2.put("input_merger_class_name", new d.a(0, "input_merger_class_name", "TEXT", null, false, 1));
                hashMap2.put("input", new d.a(0, "input", "BLOB", null, true, 1));
                hashMap2.put("output", new d.a(0, "output", "BLOB", null, true, 1));
                hashMap2.put("initial_delay", new d.a(0, "initial_delay", "INTEGER", null, true, 1));
                hashMap2.put("interval_duration", new d.a(0, "interval_duration", "INTEGER", null, true, 1));
                hashMap2.put("flex_duration", new d.a(0, "flex_duration", "INTEGER", null, true, 1));
                hashMap2.put("run_attempt_count", new d.a(0, "run_attempt_count", "INTEGER", null, true, 1));
                hashMap2.put("backoff_policy", new d.a(0, "backoff_policy", "INTEGER", null, true, 1));
                hashMap2.put("backoff_delay_duration", new d.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
                hashMap2.put("period_start_time", new d.a(0, "period_start_time", "INTEGER", null, true, 1));
                hashMap2.put("minimum_retention_duration", new d.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
                hashMap2.put("schedule_requested_at", new d.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
                hashMap2.put("run_in_foreground", new d.a(0, "run_in_foreground", "INTEGER", null, true, 1));
                hashMap2.put("out_of_quota_policy", new d.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
                hashMap2.put("required_network_type", new d.a(0, "required_network_type", "INTEGER", null, false, 1));
                hashMap2.put("requires_charging", new d.a(0, "requires_charging", "INTEGER", null, true, 1));
                hashMap2.put("requires_device_idle", new d.a(0, "requires_device_idle", "INTEGER", null, true, 1));
                hashMap2.put("requires_battery_not_low", new d.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
                hashMap2.put("requires_storage_not_low", new d.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
                hashMap2.put("trigger_content_update_delay", new d.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
                hashMap2.put("trigger_max_content_delay", new d.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
                final HashSet r2 = d.r(hashMap2, "content_uri_triggers", new d.a(0, "content_uri_triggers", "BLOB", null, false, 1), 0);
                final HashSet set = new HashSet(2);
                set.add(new d.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), null, false));
                set.add(new d.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), null, false));
                final d d2 = new d("WorkSpec", hashMap2, r2, set);
                final d a3 = l5.d.a(a, "WorkSpec");
                if (!d2.equals(a3)) {
                    return new h$b(false, b.h("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", d2, "\n Found:\n", a3));
                }
                final HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new d.a(1, "tag", "TEXT", null, true, 1));
                final HashSet r3 = d.r(hashMap3, "work_spec_id", new d.a(2, "work_spec_id", "TEXT", null, true, 1), 1);
                final HashSet q2 = s0.q(r3, new d.b("WorkSpec", Arrays.asList("work_spec_id"), Arrays.asList("id"), "CASCADE", "CASCADE"), 1);
                q2.add(new d.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), null, false));
                final d d3 = new d("WorkTag", hashMap3, r3, q2);
                final d a4 = l5.d.a(a, "WorkTag");
                if (!d3.equals(a4)) {
                    return new h$b(false, b.h("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", d3, "\n Found:\n", a4));
                }
                final HashMap hashMap4 = new HashMap(2);
                hashMap4.put("work_spec_id", new d.a(1, "work_spec_id", "TEXT", null, true, 1));
                final HashSet r4 = d.r(hashMap4, "system_id", new d.a(0, "system_id", "INTEGER", null, true, 1), 1);
                final d d4 = new d("SystemIdInfo", hashMap4, r4, s0.q(r4, new d.b("WorkSpec", Arrays.asList("work_spec_id"), Arrays.asList("id"), "CASCADE", "CASCADE"), 0));
                final d a5 = l5.d.a(a, "SystemIdInfo");
                if (!d4.equals(a5)) {
                    return new h$b(false, b.h("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", d4, "\n Found:\n", a5));
                }
                final HashMap hashMap5 = new HashMap(2);
                hashMap5.put("name", new d.a(1, "name", "TEXT", null, true, 1));
                final HashSet r5 = d.r(hashMap5, "work_spec_id", new d.a(2, "work_spec_id", "TEXT", null, true, 1), 1);
                final HashSet q3 = s0.q(r5, new d.b("WorkSpec", Arrays.asList("work_spec_id"), Arrays.asList("id"), "CASCADE", "CASCADE"), 1);
                q3.add(new d.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), null, false));
                final d d5 = new d("WorkName", hashMap5, r5, q3);
                final d a6 = l5.d.a(a, "WorkName");
                if (!d5.equals(a6)) {
                    return new h$b(false, b.h("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", d5, "\n Found:\n", a6));
                }
                final HashMap hashMap6 = new HashMap(2);
                hashMap6.put("work_spec_id", new d.a(1, "work_spec_id", "TEXT", null, true, 1));
                final HashSet r6 = d.r(hashMap6, "progress", new d.a(0, "progress", "BLOB", null, true, 1), 1);
                final d d6 = new d("WorkProgress", hashMap6, r6, s0.q(r6, new d.b("WorkSpec", Arrays.asList("work_spec_id"), Arrays.asList("id"), "CASCADE", "CASCADE"), 0));
                final d a7 = l5.d.a(a, "WorkProgress");
                if (!d6.equals(a7)) {
                    return new h$b(false, b.h("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", d6, "\n Found:\n", a7));
                }
                final HashMap hashMap7 = new HashMap(2);
                hashMap7.put("key", new d.a(1, "key", "TEXT", null, true, 1));
                final d d7 = new d("Preference", hashMap7, d.r(hashMap7, "long_value", new d.a(0, "long_value", "INTEGER", null, false, 1), 0), new HashSet(0));
                final d a8 = l5.d.a(a, "Preference");
                if (!d7.equals(a8)) {
                    return new h$b(false, b.h("Preference(androidx.work.impl.model.Preference).\n Expected:\n", d7, "\n Found:\n", a8));
                }
                return new h$b(true, (String)null);
            }
        }, "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        final n5.b.b.a a = new n5.b.b.a(b.b);
        a.b = b.c;
        a.c = (n5.b.a)c;
        return b.a.a(a.a());
    }
    
    @Override
    public final l6.b s() {
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new c(this);
            }
            return this.p;
        }
    }
    
    @Override
    public final e t() {
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new g(this);
            }
            return this.u;
        }
    }
    
    @Override
    public final i u() {
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new j(this);
            }
            return this.r;
        }
    }
    
    @Override
    public final l v() {
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new m(this);
            }
            return this.s;
        }
    }
    
    @Override
    public final o w() {
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new p(this);
            }
            return this.t;
        }
    }
    
    @Override
    public final r x() {
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new t(this);
            }
            return this.o;
        }
    }
    
    @Override
    public final v y() {
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new w(this);
            }
            return this.q;
        }
    }
}
