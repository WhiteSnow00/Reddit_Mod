// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import mf1.a;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public final class j extends SQLiteOpenHelper
{
    public final /* synthetic */ k f;
    
    public j(final k f, final Context context) {
        this.f = f;
        super(context, "google_app_measurement.db", (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    public final SQLiteDatabase getWritableDatabase() {
        final k f = this.f;
        final x6 j = f.j;
        f.f.getClass();
        boolean b = false;
        Label_0066: {
            if (j.b != 0L) {
                ((a)j.a).getClass();
                if (SystemClock.elapsedRealtime() - j.b < 3600000L) {
                    b = false;
                    break Label_0066;
                }
            }
            b = true;
        }
        if (b) {
            try {
                return super.getWritableDatabase();
            }
            catch (final SQLiteException ex) {
                final x6 i = this.f.j;
                ((a)i.a).getClass();
                i.b = SystemClock.elapsedRealtime();
                ((h4)this.f.f).h().k.a("Opening the database failed, dropping and recreating it");
                this.f.f.getClass();
                if (!((h4)this.f.f).f.getDatabasePath("google_app_measurement.db").delete()) {
                    ((h4)this.f.f).h().k.b((Object)"google_app_measurement.db", "Failed to delete corrupted db file");
                }
                try {
                    final SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f.j.b = 0L;
                    return writableDatabase;
                }
                catch (final SQLiteException ex2) {
                    ((h4)this.f.f).h().k.b((Object)ex2, "Failed to open freshly created database");
                    throw ex2;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        l.b(((h4)this.f.f).h(), sqLiteDatabase);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", k.k);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", k.l);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", k.m);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", k.o);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", k.n);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", k.p);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", k.q);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", k.r);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        l.a(((h4)this.f.f).h(), sqLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
