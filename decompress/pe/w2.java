// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public final class w2 extends SQLiteOpenHelper
{
    public final /* synthetic */ x2 f;
    
    public w2(final x2 f, final Context context) {
        this.f = f;
        super(context, "google_app_measurement_local.db", (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        }
        catch (final SQLiteException ex) {
            ((h4)((d1)this.f).f).h().k.a("Opening the local database failed, dropping and recreating it");
            ((d1)this.f).f.getClass();
            if (!((h4)((d1)this.f).f).f.getDatabasePath("google_app_measurement_local.db").delete()) {
                ((h4)((d1)this.f).f).h().k.b((Object)"google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            }
            catch (final SQLiteException ex2) {
                ((h4)((d1)this.f).f).h().k.b((Object)ex2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
        catch (final SQLiteDatabaseLockedException ex3) {
            throw ex3;
        }
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        l.b(((h4)((d1)this.f).f).h(), sqLiteDatabase);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
        l.a(((h4)((d1)this.f).f).h(), sqLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
