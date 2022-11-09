// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import j5.o;
import android.os.CancellationSignal;
import java.util.List;
import java.util.concurrent.Callable;
import androidx.room.a;
import pg2.j;
import tg2.c;
import j5.w;
import j5.d;
import i60.z;
import j5.e;
import androidx.room.RoomDatabase;

public final class a2 implements z1
{
    public final RoomDatabase f;
    public final a2$b g;
    public final a2$f h;
    
    public a2(final RoomDatabase f) {
        this.f = f;
        new e<z>(f) {
            public final String b() {
                return "INSERT OR ABORT INTO `survey_local_demo` (`id`,`triggerJsonName`,`desiredTriggerCount`) VALUES (?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final z z = (z)o;
                e.bindLong(1, z.a);
                final String b = z.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                e.bindLong(3, z.c);
            }
        };
        this.g = new e<z>(f) {
            public final String b() {
                return "INSERT OR REPLACE INTO `survey_local_demo` (`id`,`triggerJsonName`,`desiredTriggerCount`) VALUES (?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final z z = (z)o;
                e.bindLong(1, z.a);
                final String b = z.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                e.bindLong(3, z.c);
            }
        };
        new e<z>(f) {
            public final String b() {
                return "INSERT OR IGNORE INTO `survey_local_demo` (`id`,`triggerJsonName`,`desiredTriggerCount`) VALUES (?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final z z = (z)o;
                e.bindLong(1, z.a);
                final String b = z.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                e.bindLong(3, z.c);
            }
        };
        new d<z>(f) {
            public final String b() {
                return "DELETE FROM `survey_local_demo` WHERE `id` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                e.bindLong(1, ((z)o).a);
            }
        };
        new d<z>(f) {
            public final String b() {
                return "UPDATE OR ABORT `survey_local_demo` SET `id` = ?,`triggerJsonName` = ?,`desiredTriggerCount` = ? WHERE `id` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final z z = (z)o;
                e.bindLong(1, z.a);
                final String b = z.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                e.bindLong(3, z.c);
                e.bindLong(4, z.a);
            }
        };
        this.h = new w(f) {
            public final String b() {
                return "\n      DELETE FROM survey_local_demo\n    ";
            }
        };
    }
    
    public final Object Q1(final z z, final c<? super j> c) {
        return a.c(this.f, (Callable)new a2$g(this, z), (c)c);
    }
    
    public final Object a(final c<? super List<z>> c) {
        return a.b(this.f, new CancellationSignal(), (Callable)new a2$i(this, o.a(0, "\n      SELECT `survey_local_demo`.`id` AS `id`, `survey_local_demo`.`triggerJsonName` AS `triggerJsonName`, `survey_local_demo`.`desiredTriggerCount` AS `desiredTriggerCount` FROM survey_local_demo\n    ")), (c)c);
    }
    
    public final Object m(final c<? super j> c) {
        return a.c(this.f, (Callable)new a2$h(this), (c)c);
    }
}
