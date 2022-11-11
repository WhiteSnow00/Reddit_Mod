// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import android.content.ContentValues;
import java.util.Iterator;
import java.util.Set;
import android.database.sqlite.SQLiteDatabase;
import ya.d;
import android.database.Cursor;
import android.database.SQLException;
import com.google.android.exoplayer2.database.DatabaseIOException;
import java.util.HashMap;
import ya.c;
import ya.a;

public final class b
{
    public static final String[] c;
    public final a a;
    public String b;
    
    static {
        c = new String[] { "name", "length", "last_touch_timestamp" };
    }
    
    public b(final c a) {
        this.a = (a)a;
    }
    
    public final HashMap a() throws DatabaseIOException {
        try {
            this.b.getClass();
            final Cursor query = this.a.getReadableDatabase().query(this.b, zc.b.c, (String)null, (String[])null, (String)null, (String)null, (String)null);
            try {
                final HashMap hashMap = new HashMap<String, zc.a>(query.getCount());
                while (query.moveToNext()) {
                    final String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new zc.a(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            }
            finally {
                if (query != null) {
                    try {
                        query.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        catch (final SQLException ex) {
            throw new DatabaseIOException(ex);
        }
    }
    
    public final void b(final long n) throws DatabaseIOException {
        try {
            final String hexString = Long.toHexString(n);
            final String value = String.valueOf(hexString);
            String concat;
            if (value.length() != 0) {
                concat = "ExoPlayerCacheFileMetadata".concat(value);
            }
            else {
                concat = new String("ExoPlayerCacheFileMetadata");
            }
            this.b = concat;
            if (d.a(this.a.getReadableDatabase(), 2, hexString) != 1) {
                final SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    d.b(writableDatabase, 2, hexString, 1);
                    final String value2 = String.valueOf(this.b);
                    String concat2;
                    if (value2.length() != 0) {
                        concat2 = "DROP TABLE IF EXISTS ".concat(value2);
                    }
                    else {
                        concat2 = new String("DROP TABLE IF EXISTS ");
                    }
                    writableDatabase.execSQL(concat2);
                    final String b = this.b;
                    final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 108);
                    sb.append("CREATE TABLE ");
                    sb.append(b);
                    sb.append(" ");
                    sb.append("(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.execSQL(sb.toString());
                    writableDatabase.setTransactionSuccessful();
                }
                finally {
                    writableDatabase.endTransaction();
                }
            }
        }
        catch (final SQLException ex) {
            throw new DatabaseIOException(ex);
        }
    }
    
    public final void c(final Set<String> set) throws DatabaseIOException {
        this.b.getClass();
        try {
            final SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                final Iterator<String> iterator = set.iterator();
                while (iterator.hasNext()) {
                    writableDatabase.delete(this.b, "name = ?", new String[] { iterator.next() });
                }
                writableDatabase.setTransactionSuccessful();
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
        catch (final SQLException ex) {
            throw new DatabaseIOException(ex);
        }
    }
    
    public final void d(final long n, final long n2, final String s) throws DatabaseIOException {
        this.b.getClass();
        try {
            final SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            final ContentValues contentValues = new ContentValues();
            contentValues.put("name", s);
            contentValues.put("length", Long.valueOf(n));
            contentValues.put("last_touch_timestamp", Long.valueOf(n2));
            writableDatabase.replaceOrThrow(this.b, (String)null, contentValues);
        }
        catch (final SQLException ex) {
            throw new DatabaseIOException(ex);
        }
    }
}
