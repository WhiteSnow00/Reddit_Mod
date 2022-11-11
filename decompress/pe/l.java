// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.io.File;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;

public final class l
{
    public static void a(final d3 d3, final SQLiteDatabase sqLiteDatabase, final String s, final String s2, String s3, final String[] array) throws SQLiteException {
        if (d3 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        final int n = 0;
        Object o = null;
        Cursor cursor;
        Cursor cursor2;
        boolean b;
        Cursor cursor3;
        boolean b2;
        HashSet<Object> set;
        StringBuilder sb;
        final SQLiteException ex;
        Cursor cursor4 = null;
        Label_0382:Block_17_Outer:
        while (true) {
            Label_0118: {
                try {
                    cursor = (Cursor)(o = sqLiteDatabase.query("SQLITE_MASTER", new String[] { "name" }, "name=?", new String[] { s }, (String)null, (String)null, (String)null));
                    try {
                        cursor2 = cursor;
                        b = cursor2.moveToFirst();
                        cursor3 = cursor;
                        cursor3.close();
                        b2 = b;
                        if (!b2) {
                            break Label_0113;
                        }
                        break Label_0118;
                    }
                    catch (final SQLiteException ex) {}
                }
                catch (final SQLiteException ex) {
                    cursor = null;
                }
                finally {
                    break Label_0382;
                }
                try {
                    cursor2 = cursor;
                    b = cursor2.moveToFirst();
                    cursor3 = cursor;
                    cursor3.close();
                    b2 = b;
                    if (!b2) {
                        sqLiteDatabase.execSQL(s2);
                    }
                    try {
                        set = new HashSet<Object>();
                        o = new StringBuilder();
                        ((StringBuilder)o).append("SELECT * FROM ");
                        ((StringBuilder)o).append(s);
                        ((StringBuilder)o).append(" LIMIT 0");
                        o = sqLiteDatabase.rawQuery(((StringBuilder)o).toString(), (String[])null);
                        try {
                            Collections.addAll(set, ((Cursor)o).getColumnNames());
                            ((Cursor)o).close();
                            o = s3.split(",");
                            for (int length = ((Cursor)o).length, i = 0; i < length; ++i) {
                                s3 = o[i];
                                if (!set.remove(s3)) {
                                    sb = new StringBuilder();
                                    sb.append("Table ");
                                    sb.append(s);
                                    sb.append(" is missing required column: ");
                                    sb.append(s3);
                                    throw new SQLiteException(sb.toString());
                                }
                            }
                            if (array != null) {
                                for (int j = n; j < array.length; j += 2) {
                                    if (!set.remove(array[j])) {
                                        sqLiteDatabase.execSQL(array[j + 1]);
                                    }
                                }
                            }
                            if (!set.isEmpty()) {
                                d3.n.c((Object)s, "Table has extra columns. table, columns", (Object)TextUtils.join((CharSequence)", ", (Iterable)set));
                            }
                            return;
                        }
                        finally {
                            ((Cursor)o).close();
                        }
                    }
                    catch (final SQLiteException ex2) {
                        d3.k.b((Object)s, "Failed to verify columns on table that was just created");
                        throw ex2;
                    }
                    while (true) {
                        cursor.close();
                        continue Block_17_Outer;
                        o = cursor;
                        d3.n.c((Object)s, "Error querying for table", (Object)ex);
                        iftrue(Label_0113:)(cursor == null);
                        continue;
                    }
                }
                finally {
                    cursor4 = (Cursor)o;
                }
            }
            break;
        }
        if (cursor4 != null) {
            cursor4.close();
        }
    }
    
    public static void b(final d3 d3, final SQLiteDatabase sqLiteDatabase) {
        if (d3 != null) {
            final File file = new File(sqLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                d3.n.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                d3.n.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                d3.n.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                d3.n.a("Failed to turn on database write permission for owner");
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
