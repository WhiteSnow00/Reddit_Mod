// 
// Decompiled by Procyon v0.6.0
// 

package l5;

import android.util.Log;
import java.util.Arrays;
import a40.f;
import ak0.m;
import android.os.Build$VERSION;
import android.database.Cursor;

public final class b
{
    public static int a(final Cursor cursor, final String s) {
        final int columnIndex = cursor.getColumnIndex(s);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("`");
        sb.append(s);
        sb.append("`");
        final int columnIndex2 = cursor.getColumnIndex(sb.toString());
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = -1;
        int n2;
        if (sdk_INT > 25) {
            n2 = n;
        }
        else if (s.length() == 0) {
            n2 = n;
        }
        else {
            final String[] columnNames = cursor.getColumnNames();
            final String l = m.l(".", s);
            final String n3 = f.n(".", s, "`");
            int n4 = 0;
            while (true) {
                n2 = n;
                if (n4 >= columnNames.length) {
                    return n2;
                }
                final String s2 = columnNames[n4];
                if (s2.length() >= s.length() + 2) {
                    if (s2.endsWith(l)) {
                        break;
                    }
                    if (s2.charAt(0) == '`' && s2.endsWith(n3)) {
                        break;
                    }
                }
                ++n4;
            }
            n2 = n4;
        }
        return n2;
    }
    
    public static int b(final Cursor cursor, final String s) {
        final int a = a(cursor, s);
        if (a >= 0) {
            return a;
        }
        String string;
        try {
            string = Arrays.toString(cursor.getColumnNames());
        }
        catch (final Exception ex) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", (Throwable)ex);
            string = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("column '");
        sb.append(s);
        sb.append("' does not exist. Available columns: ");
        sb.append(string);
        throw new IllegalArgumentException(sb.toString());
    }
}
