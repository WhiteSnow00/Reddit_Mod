// 
// Decompiled by Procyon v0.6.0
// 

package k6;

import android.database.Cursor;
import k5.c;
import i5.k;
import java.util.ArrayList;
import androidx.room.RoomDatabase;

public final class w implements v
{
    public final RoomDatabase a;
    public final w$a b;
    
    public w(final RoomDatabase a) {
        this.a = a;
        this.b = new w$a(a);
    }
    
    public final ArrayList a(String b) {
        final k d = k.d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (b == null) {
            d.bindNull(1);
        }
        else {
            d.bindString(1, b);
        }
        this.a.b();
        b = (String)c.b(this.a, d, false);
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
}
