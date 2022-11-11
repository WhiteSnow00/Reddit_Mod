// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import androidx.room.RoomDatabase;
import l6.d;
import l6.g;
import androidx.work.impl.WorkDatabase;

public final class f
{
    public final WorkDatabase a;
    
    public f(final WorkDatabase a) {
        this.a = a;
    }
    
    public final int a(final String s) {
        ((RoomDatabase)this.a).c();
        try {
            final Long a = ((g)this.a.t()).a(s);
            int n = 0;
            int intValue;
            if (a != null) {
                intValue = a.intValue();
            }
            else {
                intValue = 0;
            }
            if (intValue != Integer.MAX_VALUE) {
                n = intValue + 1;
            }
            ((g)this.a.t()).b(new d(s, (long)n));
            ((RoomDatabase)this.a).q();
            return intValue;
        }
        finally {
            ((RoomDatabase)this.a).m();
        }
    }
}
