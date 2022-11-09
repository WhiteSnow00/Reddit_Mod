// 
// Decompiled by Procyon v0.6.0
// 

package v7;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField;
import android.os.Looper;
import ig.m0;
import j7.b;

public final class a implements b, m0, mp.b
{
    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
    
    public final Object a(final ResponseField responseField, final Object o) {
        return ((Map)o).get(responseField.b);
    }
    
    public final void l(final SQLiteDatabase sqLiteDatabase) {
        if (sqLiteDatabase != null) {
            d.w(sqLiteDatabase, "CREATE TABLE IF NOT EXISTS apm_experiment ( id INTEGER PRIMARY KEY AUTOINCREMENT,experiment_array BLOB,session_id INTEGER UNIQUE , CONSTRAINT session_id_foreign_key FOREIGN KEY (session_id) REFERENCES apm_session_table(session_id) ON DELETE CASCADE )", "ALTER TABLE apm_session_meta_data ADD COLUMN experiments_total_count  INTEGER DEFAULT 0", "DROP TABLE IF EXISTS sdk_api", "DROP TABLE IF EXISTS sdk_event");
        }
    }
}
