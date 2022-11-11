// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import androidx.work.impl.WorkDatabase;
import o5.a;
import androidx.room.RoomDatabase;

public final class h extends b
{
    @Override
    public final void b(final o5.a a) {
        a.beginTransaction();
        try {
            final int n = WorkDatabase.n;
            final StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
            sb.append(System.currentTimeMillis() - WorkDatabase.m);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            a.execSQL(sb.toString());
            a.setTransactionSuccessful();
        }
        finally {
            a.endTransaction();
        }
    }
}
