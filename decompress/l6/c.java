// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import android.database.Cursor;
import j5.o;
import java.util.ArrayList;
import j5.e;
import androidx.room.RoomDatabase;

public final class c implements b
{
    public final RoomDatabase a;
    public final c$a b;
    
    public c(final RoomDatabase a) {
        this.a = a;
        this.b = new e<a>(a) {
            public final String b() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final a a = (a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a2);
                }
                final String b = a.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
            }
        };
    }
    
    public final ArrayList a(String b) {
        final o a = o.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (b == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, b);
        }
        this.a.b();
        b = (String)l5.c.b(this.a, a, false);
        try {
            final ArrayList<String> list = new ArrayList<String>(((Cursor)b).getCount());
            while (((Cursor)b).moveToNext()) {
                list.add(((Cursor)b).getString(0));
            }
            return list;
        }
        finally {
            ((Cursor)b).close();
            a.h();
        }
    }
    
    public final boolean b(String b) {
        final boolean b2 = true;
        final o a = o.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (b == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, b);
        }
        this.a.b();
        final RoomDatabase a2 = this.a;
        boolean b3 = false;
        b = (String)l5.c.b(a2, a, false);
        try {
            if (((Cursor)b).moveToFirst()) {
                b3 = (((Cursor)b).getInt(0) != 0 && b2);
            }
            return b3;
        }
        finally {
            ((Cursor)b).close();
            a.h();
        }
    }
}
