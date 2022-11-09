// 
// Decompiled by Procyon v0.6.0
// 

package y9;

import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.database.Cursor;
import v9.n;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public final class a extends SQLiteOpenHelper implements b
{
    public static final String[] f;
    
    static {
        f = new String[] { "_id", "url", "length", "mime" };
    }
    
    public a(final Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    public final n b(String string) {
        string.getClass();
        final n n = null;
        Cursor cursor = null;
        Label_0129: {
            try {
                final Cursor query = this.getReadableDatabase().query("SourceInfo", a.f, "url=?", new String[] { string }, (String)null, (String)null, (String)null);
                n n2 = n;
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {}
                        string = query.getString(query.getColumnIndexOrThrow("url"));
                        final n n3 = new n(query.getLong(query.getColumnIndexOrThrow("length")), string, query.getString(query.getColumnIndexOrThrow("mime")));
                    }
                    finally {
                        n2 = (n)query;
                        break Label_0129;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return n2;
            }
            finally {
                cursor = null;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
    }
    
    public final void f(final String s, final n n) {
        for (int i = 0; i < 2; ++i) {
            (new Object[] { s, n })[i].getClass();
        }
        final boolean b = this.b(s) != null;
        final ContentValues contentValues = new ContentValues();
        contentValues.put("url", n.a);
        contentValues.put("length", Long.valueOf(n.b));
        contentValues.put("mime", n.c);
        if (b) {
            this.getWritableDatabase().update("SourceInfo", contentValues, "url=?", new String[] { s });
        }
        else {
            this.getWritableDatabase().insert("SourceInfo", (String)null, contentValues);
        }
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.getClass();
        sqLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }
}
