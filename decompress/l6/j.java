// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import android.database.Cursor;
import l5.b;
import l5.c;
import j5.o;
import j5.w;
import j5.e;
import androidx.room.RoomDatabase;

public final class j implements i
{
    public final RoomDatabase a;
    public final j$a b;
    public final j$b c;
    
    public j(final RoomDatabase a) {
        this.a = a;
        this.b = new e<h>(a) {
            public final String b() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final h h = (h)o;
                final String a = h.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                e.bindLong(2, h.b);
            }
        };
        this.c = new w(a) {
            public final String b() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }
    
    public final h a(final String s) {
        final o a = o.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        this.a.b();
        final RoomDatabase a2 = this.a;
        h h = null;
        final Cursor b = l5.c.b(a2, a, false);
        try {
            final int b2 = l5.b.b(b, "work_spec_id");
            final int b3 = l5.b.b(b, "system_id");
            if (b.moveToFirst()) {
                h = new h(b.getString(b2), b.getInt(b3));
            }
            return h;
        }
        finally {
            b.close();
            a.h();
        }
    }
    
    public final void b(final h h) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(h);
            this.a.q();
        }
        finally {
            this.a.m();
        }
    }
    
    public final void c(final String s) {
        this.a.b();
        final n5.e a = this.c.a();
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
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
}
