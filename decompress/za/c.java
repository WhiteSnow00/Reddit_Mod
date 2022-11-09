// 
// Decompiled by Procyon v0.6.0
// 

package za;

import android.database.Cursor;
import android.database.SQLException;
import wi.b;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public class c extends SQLiteOpenHelper implements a
{
    public c(final Context context) {
        super(context.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, int length, int length2) {
        final Cursor query = sqLiteDatabase.query("sqlite_master", new String[] { "type", "name" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
        try {
            while (query.moveToNext()) {
                final String string = query.getString(0);
                final String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    length2 = String.valueOf(string).length();
                    length = String.valueOf(string2).length();
                    final StringBuilder sb = new StringBuilder(length2 + 16 + length);
                    sb.append("DROP ");
                    sb.append(string);
                    sb.append(" IF EXISTS ");
                    sb.append(string2);
                    final String string3 = sb.toString();
                    try {
                        sqLiteDatabase.execSQL(string3);
                    }
                    catch (final SQLException ex) {
                        final String value = String.valueOf(string3);
                        String concat;
                        if (value.length() != 0) {
                            concat = "Error executing ".concat(value);
                        }
                        else {
                            concat = new String("Error executing ");
                        }
                        b.C("SADatabaseProvider", concat, (Throwable)ex);
                    }
                }
            }
            query.close();
        }
        finally {
            if (query != null) {
                try {
                    query.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)sqLiteDatabase).addSuppressed(t);
                }
            }
        }
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
