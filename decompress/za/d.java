// 
// Decompiled by Procyon v0.6.0
// 

package za;

import android.database.Cursor;
import android.content.ContentValues;
import android.database.SQLException;
import com.google.android.exoplayer2.database.DatabaseIOException;
import bd.c0;
import android.database.sqlite.SQLiteDatabase;
import wa.w;

public final class d
{
    static {
        w.a("goog.exo.database");
    }
    
    public static int a(final SQLiteDatabase sqLiteDatabase, int n, String query) throws DatabaseIOException {
        try {
            if (!c0.S(sqLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            query = (String)sqLiteDatabase.query("ExoPlayerVersions", new String[] { "version" }, "feature = ? AND instance_uid = ?", new String[] { Integer.toString(n), query }, (String)null, (String)null, (String)null);
            try {
                n = ((Cursor)query).getCount();
                if (n == 0) {
                    ((Cursor)query).close();
                    return -1;
                }
                ((Cursor)query).moveToNext();
                n = ((Cursor)query).getInt(0);
                ((Cursor)query).close();
                return n;
            }
            finally {
                if (query != null) {
                    try {
                        ((Cursor)query).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)sqLiteDatabase).addSuppressed(t);
                    }
                }
            }
        }
        catch (final SQLException ex) {
            throw new DatabaseIOException(ex);
        }
    }
    
    public static void b(final SQLiteDatabase sqLiteDatabase, final int n, final String s, final int n2) throws DatabaseIOException {
        try {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            final ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(n));
            contentValues.put("instance_uid", s);
            contentValues.put("version", Integer.valueOf(n2));
            sqLiteDatabase.replaceOrThrow("ExoPlayerVersions", (String)null, contentValues);
        }
        catch (final SQLException ex) {
            throw new DatabaseIOException(ex);
        }
    }
}
