// 
// Decompiled by Procyon v0.6.0
// 

package sa;

import u10.o;
import android.database.sqlite.SQLiteDatabase;
import javax.inject.Inject;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import javax.inject.Named;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import android.database.sqlite.SQLiteOpenHelper;

public final class b0 extends SQLiteOpenHelper
{
    public static final String h;
    public static int i;
    public static final List<a> j;
    public final int f;
    public boolean g;
    
    static {
        final StringBuilder t = a.t("INSERT INTO global_log_event_state VALUES (");
        t.append(System.currentTimeMillis());
        t.append(")");
        h = t.toString();
        b0.i = 5;
        j = Arrays.asList((a)new w(), (a)new x(), (a)new y(), (a)new z(), (a)new a0());
    }
    
    @Inject
    public b0(final Context context, @Named("SCHEMA_VERSION") final int f, @Named("SQLITE_DB_NAME") final String s) {
        super(context, s, (SQLiteDatabase$CursorFactory)null, f);
        this.g = false;
        this.f = f;
    }
    
    public static void a(final SQLiteDatabase sqLiteDatabase, int i, final int n) {
        final List<a> j = b0.j;
        if (n <= j.size()) {
            while (i < n) {
                b0.j.get(i).a(sqLiteDatabase);
                ++i;
            }
            return;
        }
        final StringBuilder p3 = android.support.v4.media.a.p("Migration from ", i, " to ", n, " was requested, but cannot be performed. Only ");
        p3.append(j.size());
        p3.append(" migrations are provided");
        throw new IllegalArgumentException(p3.toString());
    }
    
    public final void onConfigure(final SQLiteDatabase sqLiteDatabase) {
        this.g = true;
        sqLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sqLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        final int f = this.f;
        if (!this.g) {
            this.onConfigure(sqLiteDatabase);
        }
        a(sqLiteDatabase, 0, f);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        o.n(sqLiteDatabase, "DROP TABLE events", "DROP TABLE event_metadata", "DROP TABLE transport_contexts", "DROP TABLE IF EXISTS event_payloads");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.g) {
            this.onConfigure(sqLiteDatabase);
        }
        a(sqLiteDatabase, 0, n2);
    }
    
    public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
        if (!this.g) {
            this.onConfigure(sqLiteDatabase);
        }
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        if (!this.g) {
            this.onConfigure(sqLiteDatabase);
        }
        a(sqLiteDatabase, n, n2);
    }
    
    public interface a
    {
        void a(final SQLiteDatabase p0);
    }
}
