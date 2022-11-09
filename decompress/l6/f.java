// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import j5.e;

public final class f extends e<d>
{
    public f(final WorkDatabase workDatabase) {
        super(workDatabase);
    }
    
    public final String b() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
    
    @Override
    public final void d(final n5.e e, final Object o) {
        final d d = (d)o;
        final String a = d.a;
        if (a == null) {
            e.bindNull(1);
        }
        else {
            e.bindString(1, a);
        }
        final Long b = d.b;
        if (b == null) {
            e.bindNull(2);
        }
        else {
            e.bindLong(2, b);
        }
    }
}
