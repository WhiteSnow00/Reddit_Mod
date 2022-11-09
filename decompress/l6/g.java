// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import android.database.Cursor;
import l5.c;
import j5.o;
import androidx.work.impl.WorkDatabase;
import androidx.room.RoomDatabase;

public final class g implements e
{
    public final RoomDatabase a;
    public final f b;
    
    public g(final WorkDatabase a) {
        this.a = a;
        this.b = new f(a);
    }
    
    public final Long a(final String s) {
        final o a = o.a(1, "SELECT long_value FROM Preference where `key`=?");
        a.bindString(1, s);
        this.a.b();
        final RoomDatabase a2 = this.a;
        final Long n = null;
        final Cursor b = c.b(a2, a, false);
        Long value = n;
        try {
            if (b.moveToFirst()) {
                if (b.isNull(0)) {
                    value = n;
                }
                else {
                    value = b.getLong(0);
                }
            }
            return value;
        }
        finally {
            b.close();
            a.h();
        }
    }
    
    public final void b(final d d) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(d);
            this.a.q();
        }
        finally {
            this.a.m();
        }
    }
}
