// 
// Decompiled by Procyon v0.6.0
// 

package l5;

import android.database.AbstractCursor;
import java.util.Iterator;
import android.database.MatrixCursor;
import android.database.AbstractWindowedCursor;
import n5.d;
import android.database.Cursor;
import j5.o;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import o5.a;

public final class c
{
    public static void a(final a a) {
        final ArrayList list = new ArrayList();
        Object o = a.V1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            while (((Cursor)o).moveToNext()) {
                list.add(((Cursor)o).getString(0));
            }
            ((Cursor)o).close();
            o = list.iterator();
            while (((Iterator)o).hasNext()) {
                final String s = (String)((Iterator)o).next();
                if (s.startsWith("room_fts_content_sync_")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("DROP TRIGGER IF EXISTS ");
                    sb.append(s);
                    a.execSQL(sb.toString());
                }
            }
        }
        finally {
            ((Cursor)o).close();
        }
    }
    
    public static Cursor b(RoomDatabase roomDatabase, final o o, final boolean b) {
        final Cursor p3 = roomDatabase.p((d)o);
        if (b && p3 instanceof AbstractWindowedCursor) {
            roomDatabase = (RoomDatabase)p3;
            final int count = ((AbstractCursor)roomDatabase).getCount();
            int numRows;
            if (((AbstractWindowedCursor)roomDatabase).hasWindow()) {
                numRows = ((AbstractWindowedCursor)roomDatabase).getWindow().getNumRows();
            }
            else {
                numRows = count;
            }
            if (numRows < count) {
                try {
                    final MatrixCursor matrixCursor = new MatrixCursor(((Cursor)roomDatabase).getColumnNames(), ((Cursor)roomDatabase).getCount());
                    while (((Cursor)roomDatabase).moveToNext()) {
                        final Object[] array = new Object[((Cursor)roomDatabase).getColumnCount()];
                        for (int i = 0; i < ((Cursor)roomDatabase).getColumnCount(); ++i) {
                            final int type = ((Cursor)roomDatabase).getType(i);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type != 4) {
                                                throw new IllegalStateException();
                                            }
                                            array[i] = ((Cursor)roomDatabase).getBlob(i);
                                        }
                                        else {
                                            array[i] = ((Cursor)roomDatabase).getString(i);
                                        }
                                    }
                                    else {
                                        array[i] = ((Cursor)roomDatabase).getDouble(i);
                                    }
                                }
                                else {
                                    array[i] = ((Cursor)roomDatabase).getLong(i);
                                }
                            }
                            else {
                                array[i] = null;
                            }
                        }
                        matrixCursor.addRow(array);
                    }
                    return (Cursor)matrixCursor;
                }
                finally {
                    ((Cursor)roomDatabase).close();
                }
            }
        }
        return p3;
    }
}
