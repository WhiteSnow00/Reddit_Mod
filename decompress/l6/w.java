// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import android.database.Cursor;
import l5.c;
import j5.o;
import java.util.ArrayList;
import j5.e;
import androidx.room.RoomDatabase;

public final class w implements v
{
    public final RoomDatabase a;
    public final w$a b;
    
    public w(final RoomDatabase a) {
        this.a = a;
        this.b = new e<u>(a) {
            public final String b() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final u u = (u)o;
                final String a = u.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final String b = u.b;
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
        final o a = o.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (b == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, b);
        }
        this.a.b();
        b = (String)c.b(this.a, a, false);
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
}
