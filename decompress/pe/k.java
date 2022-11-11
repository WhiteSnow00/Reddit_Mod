// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.SystemClock;
import java.util.Collections;
import android.os.Parcelable$Creator;
import java.util.List;
import java.io.Serializable;
import java.util.Collection;
import java.util.Arrays;
import android.database.Cursor;
import android.os.Parcelable;
import ie.g3;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.m;
import ie.v8;
import android.text.TextUtils;
import android.database.sqlite.SQLiteException;
import lw0.b;
import android.content.ContentValues;
import ud.c;

public final class k extends b7
{
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public static final String[] q;
    public static final String[] r;
    public final j i;
    public final x6 j;
    
    static {
        k = new String[] { "last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;" };
        l = new String[] { "origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;" };
        m = new String[] { "app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;" };
        n = new String[] { "realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;" };
        o = new String[] { "has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;" };
        p = new String[] { "session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;" };
        q = new String[] { "session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;" };
        r = new String[] { "previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;" };
    }
    
    public k(final g7 g7) {
        super(g7);
        this.j = new x6((c)((h4)super.f).s);
        super.f.getClass();
        this.i = new j(this, ((h4)super.f).f);
    }
    
    public static final void Z(final ContentValues contentValues, final Object o) {
        b.O("value");
        b.R(o);
        if (o instanceof String) {
            contentValues.put("value", (String)o);
            return;
        }
        if (o instanceof Long) {
            contentValues.put("value", (Long)o);
            return;
        }
        if (o instanceof Double) {
            contentValues.put("value", (Double)o);
            return;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
    
    @Override
    public final boolean P() {
        return false;
    }
    
    public final void Q(final String s, final String s2) {
        b.O(s);
        b.O(s2);
        this.M();
        this.N();
        try {
            this.f0().delete("user_attributes", "app_id=? and name=?", new String[] { s, s2 });
        }
        catch (final SQLiteException ex) {
            ((h4)super.f).h().k.d((Object)d3.V(s), "Error deleting user property. appId", (Object)((h4)super.f).r.f(s2), (Object)ex);
        }
    }
    
    public final void R() {
        this.N();
        this.f0().setTransactionSuccessful();
    }
    
    public final void S(final x4 x4) {
        this.M();
        this.N();
        final String v = x4.v();
        b.R((Object)v);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", v);
        contentValues.put("app_instance_id", x4.w());
        contentValues.put("gmp_app_id", x4.z());
        x4.a.b().M();
        contentValues.put("resettable_device_id_hash", x4.e);
        x4.a.b().M();
        contentValues.put("last_bundle_index", Long.valueOf(x4.g));
        x4.a.b().M();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(x4.h));
        x4.a.b().M();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(x4.i));
        contentValues.put("app_version", x4.x());
        x4.a.b().M();
        contentValues.put("app_store", x4.l);
        x4.a.b().M();
        contentValues.put("gmp_version", Long.valueOf(x4.m));
        x4.a.b().M();
        contentValues.put("dev_cert_hash", Long.valueOf(x4.n));
        x4.a.b().M();
        contentValues.put("measurement_enabled", Boolean.valueOf(x4.o));
        x4.a.b().M();
        contentValues.put("day", Long.valueOf(x4.v));
        x4.a.b().M();
        contentValues.put("daily_public_events_count", Long.valueOf(x4.w));
        x4.a.b().M();
        contentValues.put("daily_events_count", Long.valueOf(x4.x));
        x4.a.b().M();
        contentValues.put("daily_conversions_count", Long.valueOf(x4.y));
        x4.a.b().M();
        contentValues.put("config_fetched_time", Long.valueOf(x4.D));
        x4.a.b().M();
        contentValues.put("failed_config_fetch_time", Long.valueOf(x4.E));
        contentValues.put("app_version_int", Long.valueOf(x4.s()));
        contentValues.put("firebase_instance_id", x4.y());
        x4.a.b().M();
        contentValues.put("daily_error_events_count", Long.valueOf(x4.z));
        x4.a.b().M();
        contentValues.put("daily_realtime_events_count", Long.valueOf(x4.A));
        x4.a.b().M();
        contentValues.put("health_monitor_sample", x4.B);
        x4.a.b().M();
        contentValues.put("android_id", Long.valueOf(0L));
        x4.a.b().M();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(x4.p));
        contentValues.put("admob_app_id", x4.t());
        x4.a.b().M();
        contentValues.put("dynamite_version", Long.valueOf(x4.s));
        x4.a.b().M();
        contentValues.put("session_stitching_token", x4.u);
        x4.a.b().M();
        final ArrayList t = x4.t;
        if (t != null) {
            if (t.isEmpty()) {
                ((h4)super.f).h().n.b((Object)v, "Safelisted events should not be an empty list. appId");
            }
            else {
                contentValues.put("safelisted_events", TextUtils.join((CharSequence)",", (Iterable)t));
            }
        }
        ((v8)com.google.android.gms.internal.measurement.m.g.f.zza()).zza();
        if (((h4)super.f).l.V(null, r2.k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String)null);
        }
        try {
            final SQLiteDatabase f0 = this.f0();
            if (f0.update("apps", contentValues, "app_id = ?", new String[] { v }) == 0L && f0.insertWithOnConflict("apps", (String)null, contentValues, 5) == -1L) {
                ((h4)super.f).h().k.b((Object)d3.V(v), "Failed to insert/update app (got -1). appId");
            }
        }
        catch (final SQLiteException ex) {
            ((h4)super.f).h().k.c((Object)d3.V(v), "Error storing app. appId", (Object)ex);
        }
    }
    
    public final void T(final p p) {
        b.R((Object)p);
        this.M();
        this.N();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", p.a);
        contentValues.put("name", p.b);
        contentValues.put("lifetime_count", Long.valueOf(p.c));
        contentValues.put("current_bundle_count", Long.valueOf(p.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(p.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(p.g));
        contentValues.put("last_bundled_day", p.h);
        contentValues.put("last_sampled_complex_event_id", p.i);
        contentValues.put("last_sampling_rate", p.j);
        contentValues.put("current_session_count", Long.valueOf(p.e));
        final Boolean k = p.k;
        Long value;
        if (k != null && k) {
            value = 1L;
        }
        else {
            value = null;
        }
        contentValues.put("last_exempt_from_sampling", value);
        try {
            if (this.f0().insertWithOnConflict("events", (String)null, contentValues, 5) == -1L) {
                ((h4)super.f).h().k.b((Object)d3.V(p.a), "Failed to insert/update event aggregates (got -1). appId");
            }
        }
        catch (final SQLiteException ex) {
            ((h4)super.f).h().k.c((Object)d3.V(p.a), "Error storing event aggregates. appId", (Object)ex);
        }
    }
    
    public final boolean U() {
        final Object f = super.f;
        final Context f2 = ((h4)f).f;
        ((h4)f).getClass();
        return f2.getDatabasePath("google_app_measurement.db").exists();
    }
    
    public final void V(final String s, final Long n, final long n2, final g3 g3) {
        this.M();
        this.N();
        b.R((Object)g3);
        b.O(s);
        final byte[] i = g3.i();
        ((h4)super.f).h().s.c((Object)((h4)super.f).r.d(s), "Saving complex main event, appId, data size", (Object)i.length);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("event_id", n);
        contentValues.put("children_to_process", Long.valueOf(n2));
        contentValues.put("main_event", i);
        try {
            if (this.f0().insertWithOnConflict("main_event_params", (String)null, contentValues, 5) == -1L) {
                ((h4)super.f).h().k.b((Object)d3.V(s), "Failed to insert complex main event (got -1). appId");
            }
        }
        catch (final SQLiteException ex) {
            ((h4)super.f).h().k.c((Object)d3.V(s), "Error storing complex main event. appId", (Object)ex);
        }
    }
    
    public final boolean W(final pe.c c) {
        this.M();
        this.N();
        final String f = c.f;
        b.R((Object)f);
        if (this.l0(f, c.h.g) == null) {
            final long a0 = this.a0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] { f });
            super.f.getClass();
            if (a0 >= 1000L) {
                return false;
            }
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f);
        contentValues.put("origin", c.g);
        contentValues.put("name", c.h.g);
        final Object q = c.h.q();
        b.R(q);
        Z(contentValues, q);
        contentValues.put("active", Boolean.valueOf(c.j));
        contentValues.put("trigger_event_name", c.k);
        contentValues.put("trigger_timeout", Long.valueOf(c.m));
        final n7 y = ((h4)super.f).y();
        final t l = c.l;
        y.getClass();
        contentValues.put("timed_out_event", n7.C0((Parcelable)l));
        contentValues.put("creation_timestamp", Long.valueOf(c.i));
        final n7 y2 = ((h4)super.f).y();
        final t n = c.n;
        y2.getClass();
        contentValues.put("triggered_event", n7.C0((Parcelable)n));
        contentValues.put("triggered_timestamp", Long.valueOf(c.h.h));
        contentValues.put("time_to_live", Long.valueOf(c.o));
        final n7 y3 = ((h4)super.f).y();
        final t p = c.p;
        y3.getClass();
        contentValues.put("expired_event", n7.C0((Parcelable)p));
        try {
            if (this.f0().insertWithOnConflict("conditional_properties", (String)null, contentValues, 5) == -1L) {
                ((h4)super.f).h().k.b((Object)d3.V(f), "Failed to insert/update conditional user property (got -1)");
            }
        }
        catch (final SQLiteException ex) {
            ((h4)super.f).h().k.c((Object)d3.V(f), "Error storing conditional user property", (Object)ex);
        }
        return true;
    }
    
    public final boolean X(final l7 l7) {
        this.M();
        this.N();
        if (this.l0(l7.a, l7.c) == null) {
            if (n7.z0(l7.c)) {
                if (this.a0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { l7.a }) >= Math.max(Math.min(((h4)super.f).l.Q(l7.a, r2.G), 100), 25)) {
                    return false;
                }
            }
            else if (!"_npa".equals(l7.c)) {
                final long a0 = this.a0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { l7.a, l7.b });
                super.f.getClass();
                if (a0 >= 25L) {
                    return false;
                }
            }
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", l7.a);
        contentValues.put("origin", l7.b);
        contentValues.put("name", l7.c);
        contentValues.put("set_timestamp", Long.valueOf(l7.d));
        Z(contentValues, l7.e);
        try {
            if (this.f0().insertWithOnConflict("user_attributes", (String)null, contentValues, 5) == -1L) {
                ((h4)super.f).h().k.b((Object)d3.V(l7.a), "Failed to insert/update user property (got -1). appId");
            }
        }
        catch (final SQLiteException ex) {
            ((h4)super.f).h().k.c((Object)d3.V(l7.a), "Error storing user property. appId", (Object)ex);
        }
        return true;
    }
    
    public final void Y(final long p0, final long p1, final e7 p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   z0/d1.M:()V
        //     4: aload_0        
        //     5: invokevirtual   pe/b7.N:()V
        //     8: aconst_null    
        //     9: astore          6
        //    11: aconst_null    
        //    12: astore          7
        //    14: aconst_null    
        //    15: astore          8
        //    17: aconst_null    
        //    18: astore          9
        //    20: aload           6
        //    22: astore          10
        //    24: aload_0        
        //    25: invokevirtual   pe/k.f0:()Landroid/database/sqlite/SQLiteDatabase;
        //    28: astore          11
        //    30: aload           6
        //    32: astore          10
        //    34: aconst_null    
        //    35: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    38: istore          12
        //    40: ldc_w           ""
        //    43: astore          13
        //    45: iload           12
        //    47: ifeq            313
        //    50: lload_3        
        //    51: ldc2_w          -1
        //    54: lcmp           
        //    55: istore          14
        //    57: iload           14
        //    59: ifeq            99
        //    62: aload           6
        //    64: astore          10
        //    66: iconst_2       
        //    67: anewarray       Ljava/lang/String;
        //    70: astore          15
        //    72: aload           6
        //    74: astore          10
        //    76: aload           15
        //    78: iconst_0       
        //    79: lload_3        
        //    80: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    83: aastore        
        //    84: aload           6
        //    86: astore          10
        //    88: aload           15
        //    90: iconst_1       
        //    91: lload_1        
        //    92: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    95: aastore        
        //    96: goto            121
        //    99: aload           6
        //   101: astore          10
        //   103: iconst_1       
        //   104: anewarray       Ljava/lang/String;
        //   107: astore          15
        //   109: aload           6
        //   111: astore          10
        //   113: aload           15
        //   115: iconst_0       
        //   116: lload_1        
        //   117: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   120: aastore        
        //   121: iload           14
        //   123: ifeq            131
        //   126: ldc_w           "rowid <= ? and "
        //   129: astore          13
        //   131: aload           6
        //   133: astore          10
        //   135: new             Ljava/lang/StringBuilder;
        //   138: astore          9
        //   140: aload           6
        //   142: astore          10
        //   144: aload           9
        //   146: invokespecial   java/lang/StringBuilder.<init>:()V
        //   149: aload           6
        //   151: astore          10
        //   153: aload           9
        //   155: ldc_w           "select app_id, metadata_fingerprint from raw_events where "
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: pop            
        //   162: aload           6
        //   164: astore          10
        //   166: aload           9
        //   168: aload           13
        //   170: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   173: pop            
        //   174: aload           6
        //   176: astore          10
        //   178: aload           9
        //   180: ldc_w           "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: pop            
        //   187: aload           6
        //   189: astore          10
        //   191: aload           11
        //   193: aload           9
        //   195: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   198: aload           15
        //   200: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   203: astore          6
        //   205: aload           7
        //   207: astore          15
        //   209: aload           6
        //   211: astore          13
        //   213: aload           6
        //   215: astore          10
        //   217: aload           6
        //   219: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   224: istore          12
        //   226: iload           12
        //   228: ifne            239
        //   231: aload           6
        //   233: invokeinterface android/database/Cursor.close:()V
        //   238: return         
        //   239: aload           7
        //   241: astore          15
        //   243: aload           6
        //   245: astore          13
        //   247: aload           6
        //   249: astore          10
        //   251: aload           6
        //   253: iconst_0       
        //   254: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   259: astore          7
        //   261: aload           7
        //   263: astore          15
        //   265: aload           6
        //   267: astore          13
        //   269: aload           6
        //   271: astore          10
        //   273: aload           6
        //   275: iconst_1       
        //   276: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   281: astore          8
        //   283: aload           7
        //   285: astore          15
        //   287: aload           6
        //   289: astore          13
        //   291: aload           6
        //   293: astore          10
        //   295: aload           6
        //   297: invokeinterface android/database/Cursor.close:()V
        //   302: aload           7
        //   304: astore          15
        //   306: aload           8
        //   308: astore          7
        //   310: goto            536
        //   313: lload_3        
        //   314: ldc2_w          -1
        //   317: lcmp           
        //   318: istore          14
        //   320: iload           14
        //   322: ifeq            355
        //   325: aload           6
        //   327: astore          10
        //   329: iconst_2       
        //   330: anewarray       Ljava/lang/String;
        //   333: astore          15
        //   335: aload           15
        //   337: iconst_0       
        //   338: aconst_null    
        //   339: aastore        
        //   340: aload           6
        //   342: astore          10
        //   344: aload           15
        //   346: iconst_1       
        //   347: lload_3        
        //   348: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   351: aastore        
        //   352: goto            369
        //   355: aload           6
        //   357: astore          10
        //   359: iconst_1       
        //   360: anewarray       Ljava/lang/String;
        //   363: dup            
        //   364: iconst_0       
        //   365: aconst_null    
        //   366: aastore        
        //   367: astore          15
        //   369: iload           14
        //   371: ifeq            379
        //   374: ldc_w           " and rowid <= ?"
        //   377: astore          13
        //   379: aload           6
        //   381: astore          10
        //   383: new             Ljava/lang/StringBuilder;
        //   386: astore          16
        //   388: aload           6
        //   390: astore          10
        //   392: aload           16
        //   394: invokespecial   java/lang/StringBuilder.<init>:()V
        //   397: aload           6
        //   399: astore          10
        //   401: aload           16
        //   403: ldc_w           "select metadata_fingerprint from raw_events where app_id = ?"
        //   406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   409: pop            
        //   410: aload           6
        //   412: astore          10
        //   414: aload           16
        //   416: aload           13
        //   418: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   421: pop            
        //   422: aload           6
        //   424: astore          10
        //   426: aload           16
        //   428: ldc_w           " order by rowid limit 1;"
        //   431: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   434: pop            
        //   435: aload           6
        //   437: astore          10
        //   439: aload           11
        //   441: aload           16
        //   443: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   446: aload           15
        //   448: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   451: astore          6
        //   453: aload           7
        //   455: astore          15
        //   457: aload           6
        //   459: astore          13
        //   461: aload           6
        //   463: astore          10
        //   465: aload           6
        //   467: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   472: istore          12
        //   474: iload           12
        //   476: ifne            487
        //   479: aload           6
        //   481: invokeinterface android/database/Cursor.close:()V
        //   486: return         
        //   487: aload           7
        //   489: astore          15
        //   491: aload           6
        //   493: astore          13
        //   495: aload           6
        //   497: astore          10
        //   499: aload           6
        //   501: iconst_0       
        //   502: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   507: astore          8
        //   509: aload           7
        //   511: astore          15
        //   513: aload           6
        //   515: astore          13
        //   517: aload           6
        //   519: astore          10
        //   521: aload           6
        //   523: invokeinterface android/database/Cursor.close:()V
        //   528: aload           8
        //   530: astore          7
        //   532: aload           9
        //   534: astore          15
        //   536: aload           6
        //   538: astore          13
        //   540: aload           13
        //   542: astore          10
        //   544: aload           11
        //   546: ldc_w           "raw_events_metadata"
        //   549: iconst_1       
        //   550: anewarray       Ljava/lang/String;
        //   553: dup            
        //   554: iconst_0       
        //   555: ldc_w           "metadata"
        //   558: aastore        
        //   559: ldc_w           "app_id = ? and metadata_fingerprint = ?"
        //   562: iconst_2       
        //   563: anewarray       Ljava/lang/String;
        //   566: dup            
        //   567: iconst_0       
        //   568: aload           15
        //   570: aastore        
        //   571: dup            
        //   572: iconst_1       
        //   573: aload           7
        //   575: aastore        
        //   576: aconst_null    
        //   577: aconst_null    
        //   578: ldc_w           "rowid"
        //   581: ldc_w           "2"
        //   584: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   587: astore          6
        //   589: aload           6
        //   591: astore          10
        //   593: aload           6
        //   595: astore          13
        //   597: aload           6
        //   599: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   604: ifne            647
        //   607: aload           6
        //   609: astore          10
        //   611: aload           6
        //   613: astore          13
        //   615: aload_0        
        //   616: getfield        z0/d1.f:Ljava/lang/Object;
        //   619: checkcast       Lpe/h4;
        //   622: invokevirtual   pe/h4.h:()Lpe/d3;
        //   625: getfield        pe/d3.k:Lpe/b3;
        //   628: aload           15
        //   630: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   633: ldc_w           "Raw event metadata record is missing. appId"
        //   636: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   639: aload           6
        //   641: invokeinterface android/database/Cursor.close:()V
        //   646: return         
        //   647: aload           6
        //   649: astore          10
        //   651: aload           6
        //   653: astore          13
        //   655: aload           6
        //   657: iconst_0       
        //   658: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   663: astore          8
        //   665: aload           6
        //   667: astore          10
        //   669: aload           6
        //   671: astore          13
        //   673: invokestatic    ie/q3.A1:()Lie/p3;
        //   676: aload           8
        //   678: invokestatic    pe/i7.f0:(Lie/b6;[B)Lie/b6;
        //   681: checkcast       Lie/p3;
        //   684: invokevirtual   ie/b6.j:()Lie/e6;
        //   687: checkcast       Lie/q3;
        //   690: astore          8
        //   692: aload           6
        //   694: astore          10
        //   696: aload           6
        //   698: astore          13
        //   700: aload           6
        //   702: invokeinterface android/database/Cursor.moveToNext:()Z
        //   707: ifeq            742
        //   710: aload           6
        //   712: astore          10
        //   714: aload           6
        //   716: astore          13
        //   718: aload_0        
        //   719: getfield        z0/d1.f:Ljava/lang/Object;
        //   722: checkcast       Lpe/h4;
        //   725: invokevirtual   pe/h4.h:()Lpe/d3;
        //   728: getfield        pe/d3.n:Lpe/b3;
        //   731: aload           15
        //   733: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   736: ldc_w           "Get multiple raw event metadata records, expected one. appId"
        //   739: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   742: aload           6
        //   744: astore          10
        //   746: aload           6
        //   748: astore          13
        //   750: aload           6
        //   752: invokeinterface android/database/Cursor.close:()V
        //   757: aload           6
        //   759: astore          10
        //   761: aload           6
        //   763: astore          13
        //   765: aload           5
        //   767: aload           8
        //   769: putfield        pe/e7.b:Ljava/lang/Object;
        //   772: lload_3        
        //   773: ldc2_w          -1
        //   776: lcmp           
        //   777: ifeq            834
        //   780: ldc_w           "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
        //   783: astore          8
        //   785: aload           6
        //   787: astore          10
        //   789: aload           6
        //   791: astore          13
        //   793: iconst_3       
        //   794: anewarray       Ljava/lang/String;
        //   797: astore          9
        //   799: aload           9
        //   801: iconst_0       
        //   802: aload           15
        //   804: aastore        
        //   805: aload           9
        //   807: iconst_1       
        //   808: aload           7
        //   810: aastore        
        //   811: aload           6
        //   813: astore          10
        //   815: aload           6
        //   817: astore          13
        //   819: aload           9
        //   821: iconst_2       
        //   822: lload_3        
        //   823: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   826: aastore        
        //   827: aload           9
        //   829: astore          7
        //   831: goto            869
        //   834: ldc_w           "app_id = ? and metadata_fingerprint = ?"
        //   837: astore          8
        //   839: aload           6
        //   841: astore          10
        //   843: aload           6
        //   845: astore          13
        //   847: iconst_2       
        //   848: anewarray       Ljava/lang/String;
        //   851: astore          9
        //   853: aload           9
        //   855: iconst_0       
        //   856: aload           15
        //   858: aastore        
        //   859: aload           9
        //   861: iconst_1       
        //   862: aload           7
        //   864: aastore        
        //   865: aload           9
        //   867: astore          7
        //   869: aload           6
        //   871: astore          10
        //   873: aload           6
        //   875: astore          13
        //   877: aload           11
        //   879: ldc_w           "raw_events"
        //   882: iconst_4       
        //   883: anewarray       Ljava/lang/String;
        //   886: dup            
        //   887: iconst_0       
        //   888: ldc_w           "rowid"
        //   891: aastore        
        //   892: dup            
        //   893: iconst_1       
        //   894: ldc_w           "name"
        //   897: aastore        
        //   898: dup            
        //   899: iconst_2       
        //   900: ldc_w           "timestamp"
        //   903: aastore        
        //   904: dup            
        //   905: iconst_3       
        //   906: ldc_w           "data"
        //   909: aastore        
        //   910: aload           8
        //   912: aload           7
        //   914: aconst_null    
        //   915: aconst_null    
        //   916: ldc_w           "rowid"
        //   919: aconst_null    
        //   920: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   923: astore          6
        //   925: aload           6
        //   927: astore          10
        //   929: aload           6
        //   931: astore          13
        //   933: aload           6
        //   935: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   940: ifeq            1211
        //   943: aload           6
        //   945: astore          10
        //   947: aload           6
        //   949: astore          13
        //   951: aload           6
        //   953: iconst_0       
        //   954: invokeinterface android/database/Cursor.getLong:(I)J
        //   959: lstore_1       
        //   960: aload           6
        //   962: astore          10
        //   964: aload           6
        //   966: astore          13
        //   968: aload           6
        //   970: iconst_3       
        //   971: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   976: astore          7
        //   978: aload           6
        //   980: astore          10
        //   982: aload           6
        //   984: astore          13
        //   986: invokestatic    ie/g3.v:()Lie/f3;
        //   989: aload           7
        //   991: invokestatic    pe/i7.f0:(Lie/b6;[B)Lie/b6;
        //   994: checkcast       Lie/f3;
        //   997: astore          7
        //   999: aload           6
        //  1001: astore          10
        //  1003: aload           6
        //  1005: astore          13
        //  1007: aload           7
        //  1009: aload           6
        //  1011: iconst_1       
        //  1012: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1017: invokevirtual   ie/f3.q:(Ljava/lang/String;)V
        //  1020: aload           6
        //  1022: astore          10
        //  1024: aload           6
        //  1026: astore          13
        //  1028: aload           6
        //  1030: iconst_2       
        //  1031: invokeinterface android/database/Cursor.getLong:(I)J
        //  1036: lstore_3       
        //  1037: aload           6
        //  1039: astore          10
        //  1041: aload           6
        //  1043: astore          13
        //  1045: aload           7
        //  1047: getfield        ie/b6.h:Z
        //  1050: ifeq            1088
        //  1053: aload           6
        //  1055: astore          10
        //  1057: aload           6
        //  1059: astore          13
        //  1061: aload           7
        //  1063: invokevirtual   ie/b6.l:()V
        //  1066: aload           6
        //  1068: astore          10
        //  1070: aload           6
        //  1072: astore          13
        //  1074: aload           7
        //  1076: iconst_0       
        //  1077: putfield        ie/b6.h:Z
        //  1080: goto            1088
        //  1083: astore          5
        //  1085: goto            1370
        //  1088: aload           6
        //  1090: astore          10
        //  1092: aload           6
        //  1094: astore          13
        //  1096: lload_3        
        //  1097: aload           7
        //  1099: getfield        ie/b6.g:Lie/e6;
        //  1102: checkcast       Lie/g3;
        //  1105: invokestatic    ie/g3.G:(JLie/g3;)V
        //  1108: aload           6
        //  1110: astore          10
        //  1112: aload           6
        //  1114: astore          13
        //  1116: aload           5
        //  1118: lload_1        
        //  1119: aload           7
        //  1121: invokevirtual   ie/b6.j:()Lie/e6;
        //  1124: checkcast       Lie/g3;
        //  1127: invokevirtual   pe/e7.c:(JLie/g3;)Z
        //  1130: istore          12
        //  1132: iload           12
        //  1134: ifne            1181
        //  1137: aload           6
        //  1139: invokeinterface android/database/Cursor.close:()V
        //  1144: return         
        //  1145: astore          7
        //  1147: aload           6
        //  1149: astore          10
        //  1151: aload           6
        //  1153: astore          13
        //  1155: aload_0        
        //  1156: getfield        z0/d1.f:Ljava/lang/Object;
        //  1159: checkcast       Lpe/h4;
        //  1162: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1165: getfield        pe/d3.k:Lpe/b3;
        //  1168: aload           15
        //  1170: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //  1173: ldc_w           "Data loss. Failed to merge raw event. appId"
        //  1176: aload           7
        //  1178: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  1181: aload           6
        //  1183: astore          10
        //  1185: aload           6
        //  1187: astore          13
        //  1189: aload           6
        //  1191: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1196: istore          12
        //  1198: iload           12
        //  1200: ifne            943
        //  1203: aload           6
        //  1205: invokeinterface android/database/Cursor.close:()V
        //  1210: return         
        //  1211: aload           6
        //  1213: astore          10
        //  1215: aload           6
        //  1217: astore          13
        //  1219: aload_0        
        //  1220: getfield        z0/d1.f:Ljava/lang/Object;
        //  1223: checkcast       Lpe/h4;
        //  1226: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1229: getfield        pe/d3.n:Lpe/b3;
        //  1232: aload           15
        //  1234: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //  1237: ldc_w           "Raw event data disappeared while in transaction. appId"
        //  1240: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1243: aload           6
        //  1245: invokeinterface android/database/Cursor.close:()V
        //  1250: return         
        //  1251: astore          6
        //  1253: goto            1300
        //  1256: astore          5
        //  1258: aload           6
        //  1260: astore          10
        //  1262: aload           6
        //  1264: astore          13
        //  1266: aload_0        
        //  1267: getfield        z0/d1.f:Ljava/lang/Object;
        //  1270: checkcast       Lpe/h4;
        //  1273: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1276: getfield        pe/d3.k:Lpe/b3;
        //  1279: aload           15
        //  1281: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //  1284: ldc_w           "Data loss. Failed to merge raw event metadata. appId"
        //  1287: aload           5
        //  1289: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  1292: aload           6
        //  1294: invokeinterface android/database/Cursor.close:()V
        //  1299: return         
        //  1300: aload           13
        //  1302: astore          5
        //  1304: goto            1325
        //  1307: astore          6
        //  1309: aload           13
        //  1311: astore          5
        //  1313: goto            1325
        //  1316: astore          6
        //  1318: aconst_null    
        //  1319: astore          5
        //  1321: aload           8
        //  1323: astore          15
        //  1325: aload           5
        //  1327: astore          10
        //  1329: aload_0        
        //  1330: getfield        z0/d1.f:Ljava/lang/Object;
        //  1333: checkcast       Lpe/h4;
        //  1336: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1339: getfield        pe/d3.k:Lpe/b3;
        //  1342: aload           15
        //  1344: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //  1347: ldc_w           "Data loss. Error selecting raw event. appId"
        //  1350: aload           6
        //  1352: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  1355: aload           5
        //  1357: ifnull          1367
        //  1360: aload           5
        //  1362: invokeinterface android/database/Cursor.close:()V
        //  1367: return         
        //  1368: astore          5
        //  1370: aload           10
        //  1372: ifnull          1382
        //  1375: aload           10
        //  1377: invokeinterface android/database/Cursor.close:()V
        //  1382: aload           5
        //  1384: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  24     30     1316   1325   Landroid/database/sqlite/SQLiteException;
        //  24     30     1083   1088   Any
        //  34     40     1316   1325   Landroid/database/sqlite/SQLiteException;
        //  34     40     1083   1088   Any
        //  66     72     1316   1325   Landroid/database/sqlite/SQLiteException;
        //  66     72     1083   1088   Any
        //  76     84     1316   1325   Landroid/database/sqlite/SQLiteException;
        //  76     84     1083   1088   Any
        //  88     96     1316   1325   Landroid/database/sqlite/SQLiteException;
        //  88     96     1083   1088   Any
        //  103    109    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  103    109    1083   1088   Any
        //  113    121    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  113    121    1083   1088   Any
        //  135    140    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  135    140    1083   1088   Any
        //  144    149    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  144    149    1083   1088   Any
        //  153    162    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  153    162    1083   1088   Any
        //  166    174    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  166    174    1083   1088   Any
        //  178    187    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  178    187    1083   1088   Any
        //  191    205    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  191    205    1083   1088   Any
        //  217    226    1307   1316   Landroid/database/sqlite/SQLiteException;
        //  217    226    1368   1370   Any
        //  251    261    1307   1316   Landroid/database/sqlite/SQLiteException;
        //  251    261    1368   1370   Any
        //  273    283    1307   1316   Landroid/database/sqlite/SQLiteException;
        //  273    283    1368   1370   Any
        //  295    302    1307   1316   Landroid/database/sqlite/SQLiteException;
        //  295    302    1368   1370   Any
        //  329    335    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  329    335    1083   1088   Any
        //  344    352    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  344    352    1083   1088   Any
        //  359    369    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  359    369    1083   1088   Any
        //  383    388    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  383    388    1083   1088   Any
        //  392    397    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  392    397    1083   1088   Any
        //  401    410    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  401    410    1083   1088   Any
        //  414    422    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  414    422    1083   1088   Any
        //  426    435    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  426    435    1083   1088   Any
        //  439    453    1316   1325   Landroid/database/sqlite/SQLiteException;
        //  439    453    1083   1088   Any
        //  465    474    1307   1316   Landroid/database/sqlite/SQLiteException;
        //  465    474    1368   1370   Any
        //  499    509    1307   1316   Landroid/database/sqlite/SQLiteException;
        //  499    509    1368   1370   Any
        //  521    528    1307   1316   Landroid/database/sqlite/SQLiteException;
        //  521    528    1368   1370   Any
        //  544    589    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  544    589    1083   1088   Any
        //  597    607    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  597    607    1083   1088   Any
        //  615    639    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  615    639    1083   1088   Any
        //  655    665    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  655    665    1083   1088   Any
        //  673    692    1256   1300   Ljava/io/IOException;
        //  673    692    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  673    692    1083   1088   Any
        //  700    710    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  700    710    1083   1088   Any
        //  718    742    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  718    742    1083   1088   Any
        //  750    757    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  750    757    1083   1088   Any
        //  765    772    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  765    772    1083   1088   Any
        //  793    799    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  793    799    1083   1088   Any
        //  819    827    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  819    827    1083   1088   Any
        //  847    853    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  847    853    1083   1088   Any
        //  877    925    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  877    925    1083   1088   Any
        //  933    943    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  933    943    1083   1088   Any
        //  951    960    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  951    960    1083   1088   Any
        //  968    978    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  968    978    1083   1088   Any
        //  986    999    1145   1181   Ljava/io/IOException;
        //  986    999    1251   1256   Landroid/database/sqlite/SQLiteException;
        //  986    999    1083   1088   Any
        //  1007   1020   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1007   1020   1083   1088   Any
        //  1028   1037   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1028   1037   1083   1088   Any
        //  1045   1053   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1045   1053   1083   1088   Any
        //  1061   1066   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1061   1066   1083   1088   Any
        //  1074   1080   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1074   1080   1083   1088   Any
        //  1096   1108   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1096   1108   1083   1088   Any
        //  1116   1132   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1116   1132   1083   1088   Any
        //  1155   1181   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1155   1181   1083   1088   Any
        //  1189   1198   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1189   1198   1083   1088   Any
        //  1219   1243   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1219   1243   1083   1088   Any
        //  1266   1292   1251   1256   Landroid/database/sqlite/SQLiteException;
        //  1266   1292   1083   1088   Any
        //  1329   1355   1368   1370   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0239:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final long a0(final String s, final String[] array) {
        final SQLiteDatabase f0 = this.f0();
        Cursor rawQuery = null;
        try {
            final Cursor cursor = rawQuery = f0.rawQuery(s, array);
            if (cursor.moveToFirst()) {
                rawQuery = cursor;
                final long long1 = cursor.getLong(0);
                cursor.close();
                return long1;
            }
            rawQuery = cursor;
            rawQuery = cursor;
            final SQLiteException ex = new SQLiteException("Database returned empty set");
            rawQuery = cursor;
            throw ex;
        }
        catch (final SQLiteException ex2) {}
        finally {
            if (rawQuery != null) {
                rawQuery.close();
            }
        }
    }
    
    public final void b0(final String s, final String s2) {
        b.O(s);
        b.O(s2);
        this.M();
        this.N();
        try {
            this.f0().delete("conditional_properties", "app_id=? and name=?", new String[] { s, s2 });
        }
        catch (final SQLiteException ex) {
            ((h4)super.f).h().k.d((Object)d3.V(s), "Error deleting conditional property", (Object)((h4)super.f).r.f(s2), (Object)ex);
        }
    }
    
    public final long c0(final String s, final String[] array, long long1) {
        final SQLiteDatabase f0 = this.f0();
        Cursor rawQuery = null;
        try {
            try {
                final Cursor cursor = rawQuery = f0.rawQuery(s, array);
                if (cursor.moveToFirst()) {
                    rawQuery = cursor;
                    long1 = cursor.getLong(0);
                    cursor.close();
                    return long1;
                }
                cursor.close();
                return long1;
            }
            finally {
                if (rawQuery != null) {
                    rawQuery.close();
                }
            }
        }
        catch (final SQLiteException ex) {}
    }
    
    public final long d0(final String s) {
        b.O(s);
        b.O("first_open_count");
        this.M();
        this.N();
        final SQLiteDatabase f0 = this.f0();
        f0.beginTransaction();
        final long n = 0L;
        long c0;
        Object value = null;
        try {
            try {
                if ((c0 = this.c0("select first_open_count from app2 where app_id=?", new String[] { s }, -1L)) == -1L) {
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", s);
                    value = 0;
                    contentValues.put("first_open_count", (Integer)value);
                    contentValues.put("previous_install_count", (Integer)value);
                    if (f0.insertWithOnConflict("app2", (String)null, contentValues, 5) == -1L) {
                        ((h4)super.f).h().k.c((Object)d3.V(s), "Failed to insert column (got -1). appId", (Object)"first_open_count");
                        f0.endTransaction();
                        return -1L;
                    }
                    c0 = 0L;
                }
                try {
                    value = new ContentValues();
                    ((ContentValues)value).put("app_id", s);
                    ((ContentValues)value).put("first_open_count", Long.valueOf(1L + c0));
                    if (f0.update("app2", (ContentValues)value, "app_id = ?", new String[] { s }) == 0L) {
                        ((h4)super.f).h().k.c((Object)d3.V(s), "Failed to update column (got 0). appId", (Object)"first_open_count");
                        f0.endTransaction();
                        return -1L;
                    }
                    f0.setTransactionSuccessful();
                    f0.endTransaction();
                    return c0;
                }
                catch (final SQLiteException value) {}
            }
            finally {}
        }
        catch (final SQLiteException value) {
            c0 = n;
        }
        ((h4)super.f).h().k.d((Object)d3.V(s), "Error inserting column. appId", (Object)"first_open_count", value);
        f0.endTransaction();
        return c0;
        f0.endTransaction();
    }
    
    public final long e0(final String s) {
        b.O(s);
        return this.c0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { s }, 0L);
    }
    
    public final SQLiteDatabase f0() {
        this.M();
        try {
            return this.i.getWritableDatabase();
        }
        catch (final SQLiteException ex) {
            ((h4)super.f).h().n.b((Object)ex, "Error opening database");
            throw ex;
        }
    }
    
    public final x4 g0(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    lw0/b.O:(Ljava/lang/String;)V
        //     4: aload_0        
        //     5: invokevirtual   z0/d1.M:()V
        //     8: aload_0        
        //     9: invokevirtual   pe/b7.N:()V
        //    12: aconst_null    
        //    13: astore_2       
        //    14: aload_0        
        //    15: invokevirtual   pe/k.f0:()Landroid/database/sqlite/SQLiteDatabase;
        //    18: ldc_w           "apps"
        //    21: bipush          29
        //    23: anewarray       Ljava/lang/String;
        //    26: dup            
        //    27: iconst_0       
        //    28: ldc_w           "app_instance_id"
        //    31: aastore        
        //    32: dup            
        //    33: iconst_1       
        //    34: ldc_w           "gmp_app_id"
        //    37: aastore        
        //    38: dup            
        //    39: iconst_2       
        //    40: ldc_w           "resettable_device_id_hash"
        //    43: aastore        
        //    44: dup            
        //    45: iconst_3       
        //    46: ldc_w           "last_bundle_index"
        //    49: aastore        
        //    50: dup            
        //    51: iconst_4       
        //    52: ldc             "last_bundle_start_timestamp"
        //    54: aastore        
        //    55: dup            
        //    56: iconst_5       
        //    57: ldc_w           "last_bundle_end_timestamp"
        //    60: aastore        
        //    61: dup            
        //    62: bipush          6
        //    64: ldc             "app_version"
        //    66: aastore        
        //    67: dup            
        //    68: bipush          7
        //    70: ldc             "app_store"
        //    72: aastore        
        //    73: dup            
        //    74: bipush          8
        //    76: ldc             "gmp_version"
        //    78: aastore        
        //    79: dup            
        //    80: bipush          9
        //    82: ldc             "dev_cert_hash"
        //    84: aastore        
        //    85: dup            
        //    86: bipush          10
        //    88: ldc             "measurement_enabled"
        //    90: aastore        
        //    91: dup            
        //    92: bipush          11
        //    94: ldc             "day"
        //    96: aastore        
        //    97: dup            
        //    98: bipush          12
        //   100: ldc             "daily_public_events_count"
        //   102: aastore        
        //   103: dup            
        //   104: bipush          13
        //   106: ldc             "daily_events_count"
        //   108: aastore        
        //   109: dup            
        //   110: bipush          14
        //   112: ldc             "daily_conversions_count"
        //   114: aastore        
        //   115: dup            
        //   116: bipush          15
        //   118: ldc             "config_fetched_time"
        //   120: aastore        
        //   121: dup            
        //   122: bipush          16
        //   124: ldc             "failed_config_fetch_time"
        //   126: aastore        
        //   127: dup            
        //   128: bipush          17
        //   130: ldc             "app_version_int"
        //   132: aastore        
        //   133: dup            
        //   134: bipush          18
        //   136: ldc             "firebase_instance_id"
        //   138: aastore        
        //   139: dup            
        //   140: bipush          19
        //   142: ldc             "daily_error_events_count"
        //   144: aastore        
        //   145: dup            
        //   146: bipush          20
        //   148: ldc             "daily_realtime_events_count"
        //   150: aastore        
        //   151: dup            
        //   152: bipush          21
        //   154: ldc             "health_monitor_sample"
        //   156: aastore        
        //   157: dup            
        //   158: bipush          22
        //   160: ldc             "android_id"
        //   162: aastore        
        //   163: dup            
        //   164: bipush          23
        //   166: ldc             "adid_reporting_enabled"
        //   168: aastore        
        //   169: dup            
        //   170: bipush          24
        //   172: ldc             "admob_app_id"
        //   174: aastore        
        //   175: dup            
        //   176: bipush          25
        //   178: ldc             "dynamite_version"
        //   180: aastore        
        //   181: dup            
        //   182: bipush          26
        //   184: ldc             "safelisted_events"
        //   186: aastore        
        //   187: dup            
        //   188: bipush          27
        //   190: ldc             "ga_app_id"
        //   192: aastore        
        //   193: dup            
        //   194: bipush          28
        //   196: ldc             "session_stitching_token"
        //   198: aastore        
        //   199: ldc_w           "app_id=?"
        //   202: iconst_1       
        //   203: anewarray       Ljava/lang/String;
        //   206: dup            
        //   207: iconst_0       
        //   208: aload_1        
        //   209: aastore        
        //   210: aconst_null    
        //   211: aconst_null    
        //   212: aconst_null    
        //   213: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   216: astore_3       
        //   217: aload_3        
        //   218: astore_2       
        //   219: aload_3        
        //   220: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   225: istore          4
        //   227: iload           4
        //   229: ifne            240
        //   232: aload_3        
        //   233: invokeinterface android/database/Cursor.close:()V
        //   238: aconst_null    
        //   239: areturn        
        //   240: aload_3        
        //   241: astore_2       
        //   242: new             Lpe/x4;
        //   245: astore          5
        //   247: aload_3        
        //   248: astore_2       
        //   249: aload           5
        //   251: aload_0        
        //   252: getfield        pe/a7.g:Lpe/g7;
        //   255: getfield        pe/g7.q:Lpe/h4;
        //   258: aload_1        
        //   259: invokespecial   pe/x4.<init>:(Lpe/h4;Ljava/lang/String;)V
        //   262: aload_3        
        //   263: astore_2       
        //   264: aload           5
        //   266: aload_3        
        //   267: iconst_0       
        //   268: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   273: invokevirtual   pe/x4.b:(Ljava/lang/String;)V
        //   276: aload_3        
        //   277: astore_2       
        //   278: aload           5
        //   280: aload_3        
        //   281: iconst_1       
        //   282: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   287: invokevirtual   pe/x4.j:(Ljava/lang/String;)V
        //   290: aload_3        
        //   291: astore_2       
        //   292: aload           5
        //   294: aload_3        
        //   295: iconst_2       
        //   296: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   301: invokevirtual   pe/x4.q:(Ljava/lang/String;)V
        //   304: aload_3        
        //   305: astore_2       
        //   306: aload           5
        //   308: aload_3        
        //   309: iconst_3       
        //   310: invokeinterface android/database/Cursor.getLong:(I)J
        //   315: invokevirtual   pe/x4.n:(J)V
        //   318: aload_3        
        //   319: astore_2       
        //   320: aload           5
        //   322: aload_3        
        //   323: iconst_4       
        //   324: invokeinterface android/database/Cursor.getLong:(I)J
        //   329: invokevirtual   pe/x4.o:(J)V
        //   332: aload_3        
        //   333: astore_2       
        //   334: aload           5
        //   336: aload_3        
        //   337: iconst_5       
        //   338: invokeinterface android/database/Cursor.getLong:(I)J
        //   343: invokevirtual   pe/x4.m:(J)V
        //   346: aload_3        
        //   347: astore_2       
        //   348: aload           5
        //   350: aload_3        
        //   351: bipush          6
        //   353: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   358: invokevirtual   pe/x4.d:(Ljava/lang/String;)V
        //   361: aload_3        
        //   362: astore_2       
        //   363: aload           5
        //   365: aload_3        
        //   366: bipush          7
        //   368: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   373: invokevirtual   pe/x4.c:(Ljava/lang/String;)V
        //   376: aload_3        
        //   377: astore_2       
        //   378: aload           5
        //   380: aload_3        
        //   381: bipush          8
        //   383: invokeinterface android/database/Cursor.getLong:(I)J
        //   388: invokevirtual   pe/x4.k:(J)V
        //   391: aload_3        
        //   392: astore_2       
        //   393: aload           5
        //   395: aload_3        
        //   396: bipush          9
        //   398: invokeinterface android/database/Cursor.getLong:(I)J
        //   403: invokevirtual   pe/x4.g:(J)V
        //   406: aload_3        
        //   407: astore_2       
        //   408: aload_3        
        //   409: bipush          10
        //   411: invokeinterface android/database/Cursor.isNull:(I)Z
        //   416: ifne            441
        //   419: aload_3        
        //   420: astore_2       
        //   421: aload_3        
        //   422: bipush          10
        //   424: invokeinterface android/database/Cursor.getInt:(I)I
        //   429: ifeq            435
        //   432: goto            441
        //   435: iconst_0       
        //   436: istore          4
        //   438: goto            444
        //   441: iconst_1       
        //   442: istore          4
        //   444: aload_3        
        //   445: astore_2       
        //   446: aload           5
        //   448: iload           4
        //   450: invokevirtual   pe/x4.p:(Z)V
        //   453: aload_3        
        //   454: astore_2       
        //   455: aload_3        
        //   456: bipush          11
        //   458: invokeinterface android/database/Cursor.getLong:(I)J
        //   463: lstore          6
        //   465: aload_3        
        //   466: astore_2       
        //   467: aload           5
        //   469: getfield        pe/x4.a:Lpe/h4;
        //   472: invokevirtual   pe/h4.b:()Lpe/g4;
        //   475: invokevirtual   pe/g4.M:()V
        //   478: aload_3        
        //   479: astore_2       
        //   480: aload           5
        //   482: getfield        pe/x4.C:Z
        //   485: istore          4
        //   487: aload_3        
        //   488: astore_2       
        //   489: aload           5
        //   491: getfield        pe/x4.v:J
        //   494: lload           6
        //   496: lcmp           
        //   497: ifeq            506
        //   500: iconst_1       
        //   501: istore          8
        //   503: goto            509
        //   506: iconst_0       
        //   507: istore          8
        //   509: aload_3        
        //   510: astore_2       
        //   511: aload           5
        //   513: iload           4
        //   515: iload           8
        //   517: ior            
        //   518: putfield        pe/x4.C:Z
        //   521: aload_3        
        //   522: astore_2       
        //   523: aload           5
        //   525: lload           6
        //   527: putfield        pe/x4.v:J
        //   530: aload_3        
        //   531: astore_2       
        //   532: aload_3        
        //   533: bipush          12
        //   535: invokeinterface android/database/Cursor.getLong:(I)J
        //   540: lstore          6
        //   542: aload_3        
        //   543: astore_2       
        //   544: aload           5
        //   546: getfield        pe/x4.a:Lpe/h4;
        //   549: invokevirtual   pe/h4.b:()Lpe/g4;
        //   552: invokevirtual   pe/g4.M:()V
        //   555: aload_3        
        //   556: astore_2       
        //   557: aload           5
        //   559: getfield        pe/x4.C:Z
        //   562: istore          4
        //   564: aload_3        
        //   565: astore_2       
        //   566: aload           5
        //   568: getfield        pe/x4.w:J
        //   571: lload           6
        //   573: lcmp           
        //   574: ifeq            583
        //   577: iconst_1       
        //   578: istore          8
        //   580: goto            586
        //   583: iconst_0       
        //   584: istore          8
        //   586: aload_3        
        //   587: astore_2       
        //   588: aload           5
        //   590: iload           4
        //   592: iload           8
        //   594: ior            
        //   595: putfield        pe/x4.C:Z
        //   598: aload_3        
        //   599: astore_2       
        //   600: aload           5
        //   602: lload           6
        //   604: putfield        pe/x4.w:J
        //   607: aload_3        
        //   608: astore_2       
        //   609: aload_3        
        //   610: bipush          13
        //   612: invokeinterface android/database/Cursor.getLong:(I)J
        //   617: lstore          6
        //   619: aload_3        
        //   620: astore_2       
        //   621: aload           5
        //   623: getfield        pe/x4.a:Lpe/h4;
        //   626: invokevirtual   pe/h4.b:()Lpe/g4;
        //   629: invokevirtual   pe/g4.M:()V
        //   632: aload_3        
        //   633: astore_2       
        //   634: aload           5
        //   636: getfield        pe/x4.C:Z
        //   639: istore          4
        //   641: aload_3        
        //   642: astore_2       
        //   643: aload           5
        //   645: getfield        pe/x4.x:J
        //   648: lload           6
        //   650: lcmp           
        //   651: ifeq            660
        //   654: iconst_1       
        //   655: istore          8
        //   657: goto            663
        //   660: iconst_0       
        //   661: istore          8
        //   663: aload_3        
        //   664: astore_2       
        //   665: aload           5
        //   667: iload           4
        //   669: iload           8
        //   671: ior            
        //   672: putfield        pe/x4.C:Z
        //   675: aload_3        
        //   676: astore_2       
        //   677: aload           5
        //   679: lload           6
        //   681: putfield        pe/x4.x:J
        //   684: aload_3        
        //   685: astore_2       
        //   686: aload_3        
        //   687: bipush          14
        //   689: invokeinterface android/database/Cursor.getLong:(I)J
        //   694: lstore          6
        //   696: aload_3        
        //   697: astore_2       
        //   698: aload           5
        //   700: getfield        pe/x4.a:Lpe/h4;
        //   703: invokevirtual   pe/h4.b:()Lpe/g4;
        //   706: invokevirtual   pe/g4.M:()V
        //   709: aload_3        
        //   710: astore_2       
        //   711: aload           5
        //   713: getfield        pe/x4.C:Z
        //   716: istore          4
        //   718: aload_3        
        //   719: astore_2       
        //   720: aload           5
        //   722: getfield        pe/x4.y:J
        //   725: lload           6
        //   727: lcmp           
        //   728: ifeq            737
        //   731: iconst_1       
        //   732: istore          8
        //   734: goto            740
        //   737: iconst_0       
        //   738: istore          8
        //   740: aload_3        
        //   741: astore_2       
        //   742: aload           5
        //   744: iload           4
        //   746: iload           8
        //   748: ior            
        //   749: putfield        pe/x4.C:Z
        //   752: aload_3        
        //   753: astore_2       
        //   754: aload           5
        //   756: lload           6
        //   758: putfield        pe/x4.y:J
        //   761: aload_3        
        //   762: astore_2       
        //   763: aload           5
        //   765: aload_3        
        //   766: bipush          15
        //   768: invokeinterface android/database/Cursor.getLong:(I)J
        //   773: invokevirtual   pe/x4.f:(J)V
        //   776: aload_3        
        //   777: astore_2       
        //   778: aload_3        
        //   779: bipush          16
        //   781: invokeinterface android/database/Cursor.getLong:(I)J
        //   786: lstore          6
        //   788: aload_3        
        //   789: astore_2       
        //   790: aload           5
        //   792: getfield        pe/x4.a:Lpe/h4;
        //   795: invokevirtual   pe/h4.b:()Lpe/g4;
        //   798: invokevirtual   pe/g4.M:()V
        //   801: aload_3        
        //   802: astore_2       
        //   803: aload           5
        //   805: getfield        pe/x4.C:Z
        //   808: istore          4
        //   810: aload_3        
        //   811: astore_2       
        //   812: aload           5
        //   814: getfield        pe/x4.E:J
        //   817: lload           6
        //   819: lcmp           
        //   820: ifeq            829
        //   823: iconst_1       
        //   824: istore          8
        //   826: goto            832
        //   829: iconst_0       
        //   830: istore          8
        //   832: aload_3        
        //   833: astore_2       
        //   834: aload           5
        //   836: iload           4
        //   838: iload           8
        //   840: ior            
        //   841: putfield        pe/x4.C:Z
        //   844: aload_3        
        //   845: astore_2       
        //   846: aload           5
        //   848: lload           6
        //   850: putfield        pe/x4.E:J
        //   853: aload_3        
        //   854: astore_2       
        //   855: aload_3        
        //   856: bipush          17
        //   858: invokeinterface android/database/Cursor.isNull:(I)Z
        //   863: ifeq            874
        //   866: ldc2_w          -2147483648
        //   869: lstore          6
        //   871: goto            887
        //   874: aload_3        
        //   875: astore_2       
        //   876: aload_3        
        //   877: bipush          17
        //   879: invokeinterface android/database/Cursor.getInt:(I)I
        //   884: i2l            
        //   885: lstore          6
        //   887: aload_3        
        //   888: astore_2       
        //   889: aload           5
        //   891: lload           6
        //   893: invokevirtual   pe/x4.e:(J)V
        //   896: aload_3        
        //   897: astore_2       
        //   898: aload           5
        //   900: aload_3        
        //   901: bipush          18
        //   903: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   908: invokevirtual   pe/x4.i:(Ljava/lang/String;)V
        //   911: aload_3        
        //   912: astore_2       
        //   913: aload_3        
        //   914: bipush          19
        //   916: invokeinterface android/database/Cursor.getLong:(I)J
        //   921: lstore          6
        //   923: aload_3        
        //   924: astore_2       
        //   925: aload           5
        //   927: getfield        pe/x4.a:Lpe/h4;
        //   930: invokevirtual   pe/h4.b:()Lpe/g4;
        //   933: invokevirtual   pe/g4.M:()V
        //   936: aload_3        
        //   937: astore_2       
        //   938: aload           5
        //   940: getfield        pe/x4.C:Z
        //   943: istore          4
        //   945: aload_3        
        //   946: astore_2       
        //   947: aload           5
        //   949: getfield        pe/x4.z:J
        //   952: lload           6
        //   954: lcmp           
        //   955: ifeq            964
        //   958: iconst_1       
        //   959: istore          8
        //   961: goto            967
        //   964: iconst_0       
        //   965: istore          8
        //   967: aload_3        
        //   968: astore_2       
        //   969: aload           5
        //   971: iload           4
        //   973: iload           8
        //   975: ior            
        //   976: putfield        pe/x4.C:Z
        //   979: aload_3        
        //   980: astore_2       
        //   981: aload           5
        //   983: lload           6
        //   985: putfield        pe/x4.z:J
        //   988: aload_3        
        //   989: astore_2       
        //   990: aload_3        
        //   991: bipush          20
        //   993: invokeinterface android/database/Cursor.getLong:(I)J
        //   998: lstore          6
        //  1000: aload_3        
        //  1001: astore_2       
        //  1002: aload           5
        //  1004: getfield        pe/x4.a:Lpe/h4;
        //  1007: invokevirtual   pe/h4.b:()Lpe/g4;
        //  1010: invokevirtual   pe/g4.M:()V
        //  1013: aload_3        
        //  1014: astore_2       
        //  1015: aload           5
        //  1017: getfield        pe/x4.C:Z
        //  1020: istore          4
        //  1022: aload_3        
        //  1023: astore_2       
        //  1024: aload           5
        //  1026: getfield        pe/x4.A:J
        //  1029: lload           6
        //  1031: lcmp           
        //  1032: ifeq            1041
        //  1035: iconst_1       
        //  1036: istore          8
        //  1038: goto            1044
        //  1041: iconst_0       
        //  1042: istore          8
        //  1044: aload_3        
        //  1045: astore_2       
        //  1046: aload           5
        //  1048: iload           4
        //  1050: iload           8
        //  1052: ior            
        //  1053: putfield        pe/x4.C:Z
        //  1056: aload_3        
        //  1057: astore_2       
        //  1058: aload           5
        //  1060: lload           6
        //  1062: putfield        pe/x4.A:J
        //  1065: aload_3        
        //  1066: astore_2       
        //  1067: aload           5
        //  1069: aload_3        
        //  1070: bipush          21
        //  1072: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1077: invokevirtual   pe/x4.l:(Ljava/lang/String;)V
        //  1080: aload_3        
        //  1081: astore_2       
        //  1082: aload_3        
        //  1083: bipush          23
        //  1085: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1090: ifne            1115
        //  1093: aload_3        
        //  1094: astore_2       
        //  1095: aload_3        
        //  1096: bipush          23
        //  1098: invokeinterface android/database/Cursor.getInt:(I)I
        //  1103: ifeq            1109
        //  1106: goto            1115
        //  1109: iconst_0       
        //  1110: istore          4
        //  1112: goto            1118
        //  1115: iconst_1       
        //  1116: istore          4
        //  1118: aload_3        
        //  1119: astore_2       
        //  1120: aload           5
        //  1122: getfield        pe/x4.a:Lpe/h4;
        //  1125: invokevirtual   pe/h4.b:()Lpe/g4;
        //  1128: invokevirtual   pe/g4.M:()V
        //  1131: aload_3        
        //  1132: astore_2       
        //  1133: aload           5
        //  1135: getfield        pe/x4.C:Z
        //  1138: istore          9
        //  1140: aload_3        
        //  1141: astore_2       
        //  1142: aload           5
        //  1144: getfield        pe/x4.p:Z
        //  1147: iload           4
        //  1149: if_icmpeq       1158
        //  1152: iconst_1       
        //  1153: istore          8
        //  1155: goto            1161
        //  1158: iconst_0       
        //  1159: istore          8
        //  1161: aload_3        
        //  1162: astore_2       
        //  1163: aload           5
        //  1165: iload           9
        //  1167: iload           8
        //  1169: ior            
        //  1170: putfield        pe/x4.C:Z
        //  1173: aload_3        
        //  1174: astore_2       
        //  1175: aload           5
        //  1177: iload           4
        //  1179: putfield        pe/x4.p:Z
        //  1182: aload_3        
        //  1183: astore_2       
        //  1184: aload           5
        //  1186: aload_3        
        //  1187: bipush          24
        //  1189: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1194: invokevirtual   pe/x4.a:(Ljava/lang/String;)V
        //  1197: aload_3        
        //  1198: astore_2       
        //  1199: aload_3        
        //  1200: bipush          25
        //  1202: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1207: ifeq            1216
        //  1210: lconst_0       
        //  1211: lstore          6
        //  1213: goto            1228
        //  1216: aload_3        
        //  1217: astore_2       
        //  1218: aload_3        
        //  1219: bipush          25
        //  1221: invokeinterface android/database/Cursor.getLong:(I)J
        //  1226: lstore          6
        //  1228: aload_3        
        //  1229: astore_2       
        //  1230: aload           5
        //  1232: lload           6
        //  1234: invokevirtual   pe/x4.h:(J)V
        //  1237: aload_3        
        //  1238: astore_2       
        //  1239: aload_3        
        //  1240: bipush          26
        //  1242: invokeinterface android/database/Cursor.isNull:(I)Z
        //  1247: ifne            1275
        //  1250: aload_3        
        //  1251: astore_2       
        //  1252: aload           5
        //  1254: aload_3        
        //  1255: bipush          26
        //  1257: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1262: ldc_w           ","
        //  1265: iconst_m1      
        //  1266: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //  1269: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //  1272: invokevirtual   pe/x4.r:(Ljava/util/List;)V
        //  1275: aload_3        
        //  1276: astore_2       
        //  1277: invokestatic    com/google/android/gms/internal/measurement/y.a:()V
        //  1280: aload_3        
        //  1281: astore_2       
        //  1282: aload_0        
        //  1283: getfield        z0/d1.f:Ljava/lang/Object;
        //  1286: checkcast       Lpe/h4;
        //  1289: getfield        pe/h4.l:Lpe/f;
        //  1292: aconst_null    
        //  1293: getstatic       pe/r2.t0:Lpe/q2;
        //  1296: invokevirtual   pe/f.V:(Ljava/lang/String;Lpe/q2;)Z
        //  1299: ifeq            1375
        //  1302: aload_3        
        //  1303: astore_2       
        //  1304: aload_3        
        //  1305: bipush          28
        //  1307: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1312: astore          10
        //  1314: aload_3        
        //  1315: astore_2       
        //  1316: aload           5
        //  1318: getfield        pe/x4.a:Lpe/h4;
        //  1321: invokevirtual   pe/h4.b:()Lpe/g4;
        //  1324: invokevirtual   pe/g4.M:()V
        //  1327: aload_3        
        //  1328: astore_2       
        //  1329: aload           5
        //  1331: getfield        pe/x4.C:Z
        //  1334: istore          4
        //  1336: aload_3        
        //  1337: astore_2       
        //  1338: aload           5
        //  1340: iconst_1       
        //  1341: aload           5
        //  1343: getfield        pe/x4.u:Ljava/lang/String;
        //  1346: aload           10
        //  1348: invokestatic    lq0/k.Y0:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1351: ixor           
        //  1352: iload           4
        //  1354: ior            
        //  1355: putfield        pe/x4.C:Z
        //  1358: aload_3        
        //  1359: astore_2       
        //  1360: aload           5
        //  1362: aload           10
        //  1364: putfield        pe/x4.u:Ljava/lang/String;
        //  1367: goto            1375
        //  1370: astore          10
        //  1372: goto            1449
        //  1375: aload_3        
        //  1376: astore_2       
        //  1377: aload           5
        //  1379: getfield        pe/x4.a:Lpe/h4;
        //  1382: invokevirtual   pe/h4.b:()Lpe/g4;
        //  1385: invokevirtual   pe/g4.M:()V
        //  1388: aload_3        
        //  1389: astore_2       
        //  1390: aload           5
        //  1392: iconst_0       
        //  1393: putfield        pe/x4.C:Z
        //  1396: aload_3        
        //  1397: astore_2       
        //  1398: aload_3        
        //  1399: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1404: ifeq            1432
        //  1407: aload_3        
        //  1408: astore_2       
        //  1409: aload_0        
        //  1410: getfield        z0/d1.f:Ljava/lang/Object;
        //  1413: checkcast       Lpe/h4;
        //  1416: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1419: getfield        pe/d3.k:Lpe/b3;
        //  1422: aload_1        
        //  1423: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //  1426: ldc_w           "Got multiple records for app, expected one. appId"
        //  1429: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1432: aload_3        
        //  1433: invokeinterface android/database/Cursor.close:()V
        //  1438: aload           5
        //  1440: areturn        
        //  1441: astore_1       
        //  1442: goto            1489
        //  1445: astore          10
        //  1447: aconst_null    
        //  1448: astore_3       
        //  1449: aload_3        
        //  1450: astore_2       
        //  1451: aload_0        
        //  1452: getfield        z0/d1.f:Ljava/lang/Object;
        //  1455: checkcast       Lpe/h4;
        //  1458: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1461: getfield        pe/d3.k:Lpe/b3;
        //  1464: aload_1        
        //  1465: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //  1468: ldc_w           "Error querying app. appId"
        //  1471: aload           10
        //  1473: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  1476: aload_3        
        //  1477: ifnull          1486
        //  1480: aload_3        
        //  1481: invokeinterface android/database/Cursor.close:()V
        //  1486: aconst_null    
        //  1487: areturn        
        //  1488: astore_1       
        //  1489: aload_2        
        //  1490: ifnull          1499
        //  1493: aload_2        
        //  1494: invokeinterface android/database/Cursor.close:()V
        //  1499: aload_1        
        //  1500: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  14     217    1445   1449   Landroid/database/sqlite/SQLiteException;
        //  14     217    1441   1445   Any
        //  219    227    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  219    227    1488   1489   Any
        //  242    247    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  242    247    1488   1489   Any
        //  249    262    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  249    262    1488   1489   Any
        //  264    276    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  264    276    1488   1489   Any
        //  278    290    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  278    290    1488   1489   Any
        //  292    304    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  292    304    1488   1489   Any
        //  306    318    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  306    318    1488   1489   Any
        //  320    332    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  320    332    1488   1489   Any
        //  334    346    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  334    346    1488   1489   Any
        //  348    361    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  348    361    1488   1489   Any
        //  363    376    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  363    376    1488   1489   Any
        //  378    391    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  378    391    1488   1489   Any
        //  393    406    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  393    406    1488   1489   Any
        //  408    419    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  408    419    1488   1489   Any
        //  421    432    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  421    432    1488   1489   Any
        //  446    453    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  446    453    1488   1489   Any
        //  455    465    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  455    465    1488   1489   Any
        //  467    478    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  467    478    1488   1489   Any
        //  480    487    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  480    487    1488   1489   Any
        //  489    500    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  489    500    1488   1489   Any
        //  511    521    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  511    521    1488   1489   Any
        //  523    530    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  523    530    1488   1489   Any
        //  532    542    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  532    542    1488   1489   Any
        //  544    555    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  544    555    1488   1489   Any
        //  557    564    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  557    564    1488   1489   Any
        //  566    577    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  566    577    1488   1489   Any
        //  588    598    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  588    598    1488   1489   Any
        //  600    607    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  600    607    1488   1489   Any
        //  609    619    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  609    619    1488   1489   Any
        //  621    632    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  621    632    1488   1489   Any
        //  634    641    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  634    641    1488   1489   Any
        //  643    654    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  643    654    1488   1489   Any
        //  665    675    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  665    675    1488   1489   Any
        //  677    684    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  677    684    1488   1489   Any
        //  686    696    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  686    696    1488   1489   Any
        //  698    709    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  698    709    1488   1489   Any
        //  711    718    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  711    718    1488   1489   Any
        //  720    731    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  720    731    1488   1489   Any
        //  742    752    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  742    752    1488   1489   Any
        //  754    761    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  754    761    1488   1489   Any
        //  763    776    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  763    776    1488   1489   Any
        //  778    788    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  778    788    1488   1489   Any
        //  790    801    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  790    801    1488   1489   Any
        //  803    810    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  803    810    1488   1489   Any
        //  812    823    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  812    823    1488   1489   Any
        //  834    844    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  834    844    1488   1489   Any
        //  846    853    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  846    853    1488   1489   Any
        //  855    866    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  855    866    1488   1489   Any
        //  876    887    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  876    887    1488   1489   Any
        //  889    896    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  889    896    1488   1489   Any
        //  898    911    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  898    911    1488   1489   Any
        //  913    923    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  913    923    1488   1489   Any
        //  925    936    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  925    936    1488   1489   Any
        //  938    945    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  938    945    1488   1489   Any
        //  947    958    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  947    958    1488   1489   Any
        //  969    979    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  969    979    1488   1489   Any
        //  981    988    1370   1375   Landroid/database/sqlite/SQLiteException;
        //  981    988    1488   1489   Any
        //  990    1000   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  990    1000   1488   1489   Any
        //  1002   1013   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1002   1013   1488   1489   Any
        //  1015   1022   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1015   1022   1488   1489   Any
        //  1024   1035   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1024   1035   1488   1489   Any
        //  1046   1056   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1046   1056   1488   1489   Any
        //  1058   1065   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1058   1065   1488   1489   Any
        //  1067   1080   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1067   1080   1488   1489   Any
        //  1082   1093   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1082   1093   1488   1489   Any
        //  1095   1106   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1095   1106   1488   1489   Any
        //  1120   1131   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1120   1131   1488   1489   Any
        //  1133   1140   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1133   1140   1488   1489   Any
        //  1142   1152   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1142   1152   1488   1489   Any
        //  1163   1173   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1163   1173   1488   1489   Any
        //  1175   1182   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1175   1182   1488   1489   Any
        //  1184   1197   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1184   1197   1488   1489   Any
        //  1199   1210   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1199   1210   1488   1489   Any
        //  1218   1228   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1218   1228   1488   1489   Any
        //  1230   1237   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1230   1237   1488   1489   Any
        //  1239   1250   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1239   1250   1488   1489   Any
        //  1252   1275   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1252   1275   1488   1489   Any
        //  1277   1280   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1277   1280   1488   1489   Any
        //  1282   1302   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1282   1302   1488   1489   Any
        //  1304   1314   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1304   1314   1488   1489   Any
        //  1316   1327   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1316   1327   1488   1489   Any
        //  1329   1336   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1329   1336   1488   1489   Any
        //  1338   1358   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1338   1358   1488   1489   Any
        //  1360   1367   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1360   1367   1488   1489   Any
        //  1377   1388   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1377   1388   1488   1489   Any
        //  1390   1396   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1390   1396   1488   1489   Any
        //  1398   1407   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1398   1407   1488   1489   Any
        //  1409   1432   1370   1375   Landroid/database/sqlite/SQLiteException;
        //  1409   1432   1488   1489   Any
        //  1451   1476   1488   1489   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0240:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final pe.c h0(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    lw0/b.O:(Ljava/lang/String;)V
        //     4: aload_2        
        //     5: invokestatic    lw0/b.O:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: invokevirtual   z0/d1.M:()V
        //    12: aload_0        
        //    13: invokevirtual   pe/b7.N:()V
        //    16: aconst_null    
        //    17: astore_3       
        //    18: aload_0        
        //    19: invokevirtual   pe/k.f0:()Landroid/database/sqlite/SQLiteDatabase;
        //    22: ldc_w           "conditional_properties"
        //    25: bipush          11
        //    27: anewarray       Ljava/lang/String;
        //    30: dup            
        //    31: iconst_0       
        //    32: ldc             "origin"
        //    34: aastore        
        //    35: dup            
        //    36: iconst_1       
        //    37: ldc             "value"
        //    39: aastore        
        //    40: dup            
        //    41: iconst_2       
        //    42: ldc_w           "active"
        //    45: aastore        
        //    46: dup            
        //    47: iconst_3       
        //    48: ldc_w           "trigger_event_name"
        //    51: aastore        
        //    52: dup            
        //    53: iconst_4       
        //    54: ldc_w           "trigger_timeout"
        //    57: aastore        
        //    58: dup            
        //    59: iconst_5       
        //    60: ldc_w           "timed_out_event"
        //    63: aastore        
        //    64: dup            
        //    65: bipush          6
        //    67: ldc_w           "creation_timestamp"
        //    70: aastore        
        //    71: dup            
        //    72: bipush          7
        //    74: ldc_w           "triggered_event"
        //    77: aastore        
        //    78: dup            
        //    79: bipush          8
        //    81: ldc_w           "triggered_timestamp"
        //    84: aastore        
        //    85: dup            
        //    86: bipush          9
        //    88: ldc_w           "time_to_live"
        //    91: aastore        
        //    92: dup            
        //    93: bipush          10
        //    95: ldc_w           "expired_event"
        //    98: aastore        
        //    99: ldc_w           "app_id=? and name=?"
        //   102: iconst_2       
        //   103: anewarray       Ljava/lang/String;
        //   106: dup            
        //   107: iconst_0       
        //   108: aload_1        
        //   109: aastore        
        //   110: dup            
        //   111: iconst_1       
        //   112: aload_2        
        //   113: aastore        
        //   114: aconst_null    
        //   115: aconst_null    
        //   116: aconst_null    
        //   117: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   120: astore          4
        //   122: aload           4
        //   124: astore_3       
        //   125: aload           4
        //   127: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   132: istore          5
        //   134: iload           5
        //   136: ifne            148
        //   139: aload           4
        //   141: invokeinterface android/database/Cursor.close:()V
        //   146: aconst_null    
        //   147: areturn        
        //   148: aload           4
        //   150: astore_3       
        //   151: aload           4
        //   153: iconst_0       
        //   154: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   159: astore          6
        //   161: aload           6
        //   163: astore          7
        //   165: aload           6
        //   167: ifnonnull       175
        //   170: ldc_w           ""
        //   173: astore          7
        //   175: aload           4
        //   177: astore_3       
        //   178: aload_0        
        //   179: aload           4
        //   181: iconst_1       
        //   182: invokevirtual   pe/k.m0:(Landroid/database/Cursor;I)Ljava/lang/Object;
        //   185: astore          8
        //   187: aload           4
        //   189: astore_3       
        //   190: aload           4
        //   192: iconst_2       
        //   193: invokeinterface android/database/Cursor.getInt:(I)I
        //   198: ifeq            207
        //   201: iconst_1       
        //   202: istore          5
        //   204: goto            210
        //   207: iconst_0       
        //   208: istore          5
        //   210: aload           4
        //   212: astore_3       
        //   213: aload           4
        //   215: iconst_3       
        //   216: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   221: astore          6
        //   223: aload           4
        //   225: astore_3       
        //   226: aload           4
        //   228: iconst_4       
        //   229: invokeinterface android/database/Cursor.getLong:(I)J
        //   234: lstore          9
        //   236: aload           4
        //   238: astore_3       
        //   239: aload_0        
        //   240: getfield        pe/a7.g:Lpe/g7;
        //   243: getfield        pe/g7.l:Lpe/i7;
        //   246: astore          11
        //   248: aload           4
        //   250: astore_3       
        //   251: aload           11
        //   253: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   256: aload           4
        //   258: astore_3       
        //   259: aload           4
        //   261: iconst_5       
        //   262: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   267: astore          12
        //   269: aload           4
        //   271: astore_3       
        //   272: getstatic       pe/t.CREATOR:Landroid/os/Parcelable$Creator;
        //   275: astore          13
        //   277: aload           4
        //   279: astore_3       
        //   280: aload           11
        //   282: aload           12
        //   284: aload           13
        //   286: invokevirtual   pe/i7.c0:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   289: checkcast       Lpe/t;
        //   292: astore          11
        //   294: aload           4
        //   296: astore_3       
        //   297: aload           4
        //   299: bipush          6
        //   301: invokeinterface android/database/Cursor.getLong:(I)J
        //   306: lstore          14
        //   308: aload           4
        //   310: astore_3       
        //   311: aload_0        
        //   312: getfield        pe/a7.g:Lpe/g7;
        //   315: getfield        pe/g7.l:Lpe/i7;
        //   318: astore          12
        //   320: aload           4
        //   322: astore_3       
        //   323: aload           12
        //   325: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   328: aload           4
        //   330: astore_3       
        //   331: aload           12
        //   333: aload           4
        //   335: bipush          7
        //   337: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   342: aload           13
        //   344: invokevirtual   pe/i7.c0:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   347: checkcast       Lpe/t;
        //   350: astore          12
        //   352: aload           4
        //   354: astore_3       
        //   355: aload           4
        //   357: bipush          8
        //   359: invokeinterface android/database/Cursor.getLong:(I)J
        //   364: lstore          16
        //   366: aload           4
        //   368: astore_3       
        //   369: aload           4
        //   371: bipush          9
        //   373: invokeinterface android/database/Cursor.getLong:(I)J
        //   378: lstore          18
        //   380: aload           4
        //   382: astore_3       
        //   383: aload_0        
        //   384: getfield        pe/a7.g:Lpe/g7;
        //   387: getfield        pe/g7.l:Lpe/i7;
        //   390: astore          20
        //   392: aload           4
        //   394: astore_3       
        //   395: aload           20
        //   397: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   400: aload           4
        //   402: astore_3       
        //   403: aload           20
        //   405: aload           4
        //   407: bipush          10
        //   409: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   414: aload           13
        //   416: invokevirtual   pe/i7.c0:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   419: checkcast       Lpe/t;
        //   422: astore          13
        //   424: aload           4
        //   426: astore_3       
        //   427: new             Lpe/j7;
        //   430: astore          20
        //   432: aload           4
        //   434: astore_3       
        //   435: aload           20
        //   437: lload           16
        //   439: aload           8
        //   441: aload_2        
        //   442: aload           7
        //   444: invokespecial   pe/j7.<init>:(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
        //   447: aload           4
        //   449: astore_3       
        //   450: new             Lpe/c;
        //   453: astore          8
        //   455: aload           4
        //   457: astore_3       
        //   458: aload           8
        //   460: aload_1        
        //   461: aload           7
        //   463: aload           20
        //   465: lload           14
        //   467: iload           5
        //   469: aload           6
        //   471: aload           11
        //   473: lload           9
        //   475: aload           12
        //   477: lload           18
        //   479: aload           13
        //   481: invokespecial   pe/c.<init>:(Ljava/lang/String;Ljava/lang/String;Lpe/j7;JZLjava/lang/String;Lpe/t;JLpe/t;JLpe/t;)V
        //   484: aload           4
        //   486: astore_3       
        //   487: aload           4
        //   489: invokeinterface android/database/Cursor.moveToNext:()Z
        //   494: ifeq            537
        //   497: aload           4
        //   499: astore_3       
        //   500: aload_0        
        //   501: getfield        z0/d1.f:Ljava/lang/Object;
        //   504: checkcast       Lpe/h4;
        //   507: invokevirtual   pe/h4.h:()Lpe/d3;
        //   510: getfield        pe/d3.k:Lpe/b3;
        //   513: aload_1        
        //   514: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   517: ldc_w           "Got multiple records for conditional property, expected one"
        //   520: aload_0        
        //   521: getfield        z0/d1.f:Ljava/lang/Object;
        //   524: checkcast       Lpe/h4;
        //   527: getfield        pe/h4.r:Lpe/y2;
        //   530: aload_2        
        //   531: invokevirtual   pe/y2.f:(Ljava/lang/String;)Ljava/lang/String;
        //   534: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   537: aload           4
        //   539: invokeinterface android/database/Cursor.close:()V
        //   544: aload           8
        //   546: areturn        
        //   547: astore          7
        //   549: goto            563
        //   552: astore_1       
        //   553: aload_3        
        //   554: astore_2       
        //   555: goto            622
        //   558: astore          7
        //   560: aconst_null    
        //   561: astore          4
        //   563: aload           4
        //   565: astore_3       
        //   566: aload_0        
        //   567: getfield        z0/d1.f:Ljava/lang/Object;
        //   570: checkcast       Lpe/h4;
        //   573: invokevirtual   pe/h4.h:()Lpe/d3;
        //   576: getfield        pe/d3.k:Lpe/b3;
        //   579: aload_1        
        //   580: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   583: ldc_w           "Error querying conditional property"
        //   586: aload_0        
        //   587: getfield        z0/d1.f:Ljava/lang/Object;
        //   590: checkcast       Lpe/h4;
        //   593: getfield        pe/h4.r:Lpe/y2;
        //   596: aload_2        
        //   597: invokevirtual   pe/y2.f:(Ljava/lang/String;)Ljava/lang/String;
        //   600: aload           7
        //   602: invokevirtual   pe/b3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   605: aload           4
        //   607: ifnull          617
        //   610: aload           4
        //   612: invokeinterface android/database/Cursor.close:()V
        //   617: aconst_null    
        //   618: areturn        
        //   619: astore_1       
        //   620: aload_3        
        //   621: astore_2       
        //   622: aload_2        
        //   623: ifnull          632
        //   626: aload_2        
        //   627: invokeinterface android/database/Cursor.close:()V
        //   632: aload_1        
        //   633: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  18     122    558    563    Landroid/database/sqlite/SQLiteException;
        //  18     122    552    558    Any
        //  125    134    547    552    Landroid/database/sqlite/SQLiteException;
        //  125    134    619    622    Any
        //  151    161    547    552    Landroid/database/sqlite/SQLiteException;
        //  151    161    619    622    Any
        //  178    187    547    552    Landroid/database/sqlite/SQLiteException;
        //  178    187    619    622    Any
        //  190    201    547    552    Landroid/database/sqlite/SQLiteException;
        //  190    201    619    622    Any
        //  213    223    547    552    Landroid/database/sqlite/SQLiteException;
        //  213    223    619    622    Any
        //  226    236    547    552    Landroid/database/sqlite/SQLiteException;
        //  226    236    619    622    Any
        //  239    248    547    552    Landroid/database/sqlite/SQLiteException;
        //  239    248    619    622    Any
        //  251    256    547    552    Landroid/database/sqlite/SQLiteException;
        //  251    256    619    622    Any
        //  259    269    547    552    Landroid/database/sqlite/SQLiteException;
        //  259    269    619    622    Any
        //  272    277    547    552    Landroid/database/sqlite/SQLiteException;
        //  272    277    619    622    Any
        //  280    294    547    552    Landroid/database/sqlite/SQLiteException;
        //  280    294    619    622    Any
        //  297    308    547    552    Landroid/database/sqlite/SQLiteException;
        //  297    308    619    622    Any
        //  311    320    547    552    Landroid/database/sqlite/SQLiteException;
        //  311    320    619    622    Any
        //  323    328    547    552    Landroid/database/sqlite/SQLiteException;
        //  323    328    619    622    Any
        //  331    352    547    552    Landroid/database/sqlite/SQLiteException;
        //  331    352    619    622    Any
        //  355    366    547    552    Landroid/database/sqlite/SQLiteException;
        //  355    366    619    622    Any
        //  369    380    547    552    Landroid/database/sqlite/SQLiteException;
        //  369    380    619    622    Any
        //  383    392    547    552    Landroid/database/sqlite/SQLiteException;
        //  383    392    619    622    Any
        //  395    400    547    552    Landroid/database/sqlite/SQLiteException;
        //  395    400    619    622    Any
        //  403    424    547    552    Landroid/database/sqlite/SQLiteException;
        //  403    424    619    622    Any
        //  427    432    547    552    Landroid/database/sqlite/SQLiteException;
        //  427    432    619    622    Any
        //  435    447    547    552    Landroid/database/sqlite/SQLiteException;
        //  435    447    619    622    Any
        //  450    455    547    552    Landroid/database/sqlite/SQLiteException;
        //  450    455    619    622    Any
        //  458    484    547    552    Landroid/database/sqlite/SQLiteException;
        //  458    484    619    622    Any
        //  487    497    547    552    Landroid/database/sqlite/SQLiteException;
        //  487    497    619    622    Any
        //  500    537    547    552    Landroid/database/sqlite/SQLiteException;
        //  500    537    619    622    Any
        //  566    605    619    622    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final i i0(final long n, final String s, final boolean b, final boolean b2) {
        return this.j0(n, s, 1L, false, false, b, false, b2);
    }
    
    public final i j0(final long n, final String s, final long n2, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        b.O(s);
        this.M();
        this.N();
        final i i = new i();
        final Cursor cursor = null;
        Cursor query;
        final Cursor cursor2 = query = null;
        Cursor cursor3 = cursor;
        try {
            try {
                final SQLiteDatabase f0 = this.f0();
                query = cursor2;
                cursor3 = cursor;
                final Cursor cursor4 = cursor3 = (query = f0.query("apps", new String[] { "day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count" }, "app_id=?", new String[] { s }, (String)null, (String)null, (String)null));
                if (!cursor4.moveToFirst()) {
                    query = cursor4;
                    cursor3 = cursor4;
                    ((h4)super.f).h().n.b((Object)d3.V(s), "Not updating daily counts, app is not known. appId");
                    cursor4.close();
                    return i;
                }
                query = cursor4;
                cursor3 = cursor4;
                if (cursor4.getLong(0) == n) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.b = cursor4.getLong(1);
                    query = cursor4;
                    cursor3 = cursor4;
                    i.a = cursor4.getLong(2);
                    query = cursor4;
                    cursor3 = cursor4;
                    i.c = cursor4.getLong(3);
                    query = cursor4;
                    cursor3 = cursor4;
                    i.d = cursor4.getLong(4);
                    query = cursor4;
                    cursor3 = cursor4;
                    i.e = cursor4.getLong(5);
                }
                if (b) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.b += n2;
                }
                if (b2) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.a += n2;
                }
                if (b3) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.c += n2;
                }
                if (b4) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.d += n2;
                }
                if (b5) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.e += n2;
                }
                query = cursor4;
                cursor3 = cursor4;
                query = cursor4;
                cursor3 = cursor4;
                final ContentValues contentValues = new ContentValues();
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("day", Long.valueOf(n));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_public_events_count", Long.valueOf(i.a));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_events_count", Long.valueOf(i.b));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_conversions_count", Long.valueOf(i.c));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_error_events_count", Long.valueOf(i.d));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_realtime_events_count", Long.valueOf(i.e));
                query = cursor4;
                cursor3 = cursor4;
                f0.update("apps", contentValues, "app_id=?", new String[] { s });
                cursor4.close();
                return i;
            }
            finally {
                if (query != null) {
                    query.close();
                }
                cursor3.close();
                return i;
            }
        }
        catch (final SQLiteException ex) {}
    }
    
    public final p k0(final String s, String s2) {
        b.O(s);
        b.O(s2);
        this.M();
        this.N();
        Object query = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        Serializable value = null;
        Label_0520: {
            try {
                final SQLiteDatabase f0 = this.f0();
                boolean b = false;
                query = f0.query("events", (String[])((ArrayList)query).toArray(new String[0]), "app_id=? and name=?", new String[] { s, s2 }, (String)null, (String)null, (String)null);
                try {
                    if (!((Cursor)query).moveToFirst()) {
                        ((Cursor)query).close();
                        return null;
                    }
                    final long long1 = ((Cursor)query).getLong(0);
                    final long long2 = ((Cursor)query).getLong(1);
                    final long long3 = ((Cursor)query).getLong(2);
                    long long4;
                    if (((Cursor)query).isNull(3)) {
                        long4 = 0L;
                    }
                    else {
                        long4 = ((Cursor)query).getLong(3);
                    }
                    if (((Cursor)query).isNull(4)) {
                        value = null;
                    }
                    else {
                        value = ((Cursor)query).getLong(4);
                    }
                    Long value2;
                    if (((Cursor)query).isNull(5)) {
                        value2 = null;
                    }
                    else {
                        value2 = ((Cursor)query).getLong(5);
                    }
                    Long value3;
                    if (((Cursor)query).isNull(6)) {
                        value3 = null;
                    }
                    else {
                        value3 = ((Cursor)query).getLong(6);
                    }
                    Boolean value4;
                    if (!((Cursor)query).isNull(7)) {
                        if (((Cursor)query).getLong(7) == 1L) {
                            b = true;
                        }
                        value4 = b;
                    }
                    else {
                        value4 = null;
                    }
                    long long5;
                    if (((Cursor)query).isNull(8)) {
                        long5 = 0L;
                    }
                    else {
                        long5 = ((Cursor)query).getLong(8);
                    }
                    final Cursor cursor = (Cursor)query;
                    try {
                        final p p = new p(s, s2, long1, long2, long5, long3, long4, (Long)value, value2, value3, value4);
                        if (cursor.moveToNext()) {
                            ((h4)super.f).h().k.b((Object)d3.V(s), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursor.close();
                        return p;
                    }
                    catch (final SQLiteException value) {}
                }
                catch (final SQLiteException ex) {}
            }
            catch (final SQLiteException value) {
                query = null;
            }
            finally {
                s2 = (String)value;
                break Label_0520;
            }
            try {
                ((h4)super.f).h().k.d((Object)d3.V(s), "Error querying events. appId", (Object)((h4)super.f).r.d(s2), (Object)value);
                if (query != null) {
                    ((Cursor)query).close();
                }
                return null;
            }
            finally {
                s2 = (String)query;
            }
        }
        if (s2 != null) {
            ((Cursor)s2).close();
        }
        throw s;
    }
    
    public final l7 l0(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    lw0/b.O:(Ljava/lang/String;)V
        //     4: aload_2        
        //     5: invokestatic    lw0/b.O:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: invokevirtual   z0/d1.M:()V
        //    12: aload_0        
        //    13: invokevirtual   pe/b7.N:()V
        //    16: aconst_null    
        //    17: astore_3       
        //    18: aload_0        
        //    19: invokevirtual   pe/k.f0:()Landroid/database/sqlite/SQLiteDatabase;
        //    22: ldc_w           "user_attributes"
        //    25: iconst_3       
        //    26: anewarray       Ljava/lang/String;
        //    29: dup            
        //    30: iconst_0       
        //    31: ldc_w           "set_timestamp"
        //    34: aastore        
        //    35: dup            
        //    36: iconst_1       
        //    37: ldc             "value"
        //    39: aastore        
        //    40: dup            
        //    41: iconst_2       
        //    42: ldc             "origin"
        //    44: aastore        
        //    45: ldc_w           "app_id=? and name=?"
        //    48: iconst_2       
        //    49: anewarray       Ljava/lang/String;
        //    52: dup            
        //    53: iconst_0       
        //    54: aload_1        
        //    55: aastore        
        //    56: dup            
        //    57: iconst_1       
        //    58: aload_2        
        //    59: aastore        
        //    60: aconst_null    
        //    61: aconst_null    
        //    62: aconst_null    
        //    63: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    66: astore          4
        //    68: aload           4
        //    70: astore_3       
        //    71: aload           4
        //    73: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    78: istore          5
        //    80: iload           5
        //    82: ifne            94
        //    85: aload           4
        //    87: invokeinterface android/database/Cursor.close:()V
        //    92: aconst_null    
        //    93: areturn        
        //    94: aload           4
        //    96: astore_3       
        //    97: aload           4
        //    99: iconst_0       
        //   100: invokeinterface android/database/Cursor.getLong:(I)J
        //   105: lstore          6
        //   107: aload           4
        //   109: astore_3       
        //   110: aload_0        
        //   111: aload           4
        //   113: iconst_1       
        //   114: invokevirtual   pe/k.m0:(Landroid/database/Cursor;I)Ljava/lang/Object;
        //   117: astore          8
        //   119: aload           8
        //   121: ifnonnull       133
        //   124: aload           4
        //   126: invokeinterface android/database/Cursor.close:()V
        //   131: aconst_null    
        //   132: areturn        
        //   133: aload           4
        //   135: astore_3       
        //   136: aload           4
        //   138: iconst_2       
        //   139: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   144: astore          9
        //   146: aload           4
        //   148: astore_3       
        //   149: new             Lpe/l7;
        //   152: astore          10
        //   154: aload           4
        //   156: astore_3       
        //   157: aload           10
        //   159: aload_1        
        //   160: aload           9
        //   162: lload           6
        //   164: aload_2        
        //   165: aload           8
        //   167: invokespecial   pe/l7.<init>:(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Object;)V
        //   170: aload           4
        //   172: astore_3       
        //   173: aload           4
        //   175: invokeinterface android/database/Cursor.moveToNext:()Z
        //   180: ifeq            209
        //   183: aload           4
        //   185: astore_3       
        //   186: aload_0        
        //   187: getfield        z0/d1.f:Ljava/lang/Object;
        //   190: checkcast       Lpe/h4;
        //   193: invokevirtual   pe/h4.h:()Lpe/d3;
        //   196: getfield        pe/d3.k:Lpe/b3;
        //   199: aload_1        
        //   200: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   203: ldc_w           "Got multiple records for user property, expected one. appId"
        //   206: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   209: aload           4
        //   211: invokeinterface android/database/Cursor.close:()V
        //   216: aload           10
        //   218: areturn        
        //   219: astore          8
        //   221: goto            235
        //   224: astore_1       
        //   225: aload_3        
        //   226: astore_2       
        //   227: goto            294
        //   230: astore          8
        //   232: aconst_null    
        //   233: astore          4
        //   235: aload           4
        //   237: astore_3       
        //   238: aload_0        
        //   239: getfield        z0/d1.f:Ljava/lang/Object;
        //   242: checkcast       Lpe/h4;
        //   245: invokevirtual   pe/h4.h:()Lpe/d3;
        //   248: getfield        pe/d3.k:Lpe/b3;
        //   251: aload_1        
        //   252: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   255: ldc_w           "Error querying user property. appId"
        //   258: aload_0        
        //   259: getfield        z0/d1.f:Ljava/lang/Object;
        //   262: checkcast       Lpe/h4;
        //   265: getfield        pe/h4.r:Lpe/y2;
        //   268: aload_2        
        //   269: invokevirtual   pe/y2.f:(Ljava/lang/String;)Ljava/lang/String;
        //   272: aload           8
        //   274: invokevirtual   pe/b3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   277: aload           4
        //   279: ifnull          289
        //   282: aload           4
        //   284: invokeinterface android/database/Cursor.close:()V
        //   289: aconst_null    
        //   290: areturn        
        //   291: astore_1       
        //   292: aload_3        
        //   293: astore_2       
        //   294: aload_2        
        //   295: ifnull          304
        //   298: aload_2        
        //   299: invokeinterface android/database/Cursor.close:()V
        //   304: aload_1        
        //   305: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  18     68     230    235    Landroid/database/sqlite/SQLiteException;
        //  18     68     224    230    Any
        //  71     80     219    224    Landroid/database/sqlite/SQLiteException;
        //  71     80     291    294    Any
        //  97     107    219    224    Landroid/database/sqlite/SQLiteException;
        //  97     107    291    294    Any
        //  110    119    219    224    Landroid/database/sqlite/SQLiteException;
        //  110    119    291    294    Any
        //  136    146    219    224    Landroid/database/sqlite/SQLiteException;
        //  136    146    291    294    Any
        //  149    154    219    224    Landroid/database/sqlite/SQLiteException;
        //  149    154    291    294    Any
        //  157    170    219    224    Landroid/database/sqlite/SQLiteException;
        //  157    170    291    294    Any
        //  173    183    219    224    Landroid/database/sqlite/SQLiteException;
        //  173    183    291    294    Any
        //  186    209    219    224    Landroid/database/sqlite/SQLiteException;
        //  186    209    291    294    Any
        //  238    277    291    294    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final Object m0(final Cursor cursor, final int n) {
        final int type = cursor.getType(n);
        if (type == 0) {
            ((h4)super.f).h().k.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return cursor.getLong(n);
        }
        if (type == 2) {
            return cursor.getDouble(n);
        }
        if (type == 3) {
            return cursor.getString(n);
        }
        if (type != 4) {
            ((h4)super.f).h().k.b((Object)type, "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        ((h4)super.f).h().k.a("Loaded invalid blob type value, ignoring it");
        return null;
    }
    
    public final String n0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   pe/k.f0:()Landroid/database/sqlite/SQLiteDatabase;
        //     4: astore_1       
        //     5: aconst_null    
        //     6: astore_2       
        //     7: aload_1        
        //     8: ldc_w           "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
        //    11: aconst_null    
        //    12: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //    15: astore_3       
        //    16: aload_3        
        //    17: astore_1       
        //    18: aload_3        
        //    19: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    24: ifeq            45
        //    27: aload_3        
        //    28: astore_1       
        //    29: aload_3        
        //    30: iconst_0       
        //    31: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    36: astore_2       
        //    37: aload_3        
        //    38: invokeinterface android/database/Cursor.close:()V
        //    43: aload_2        
        //    44: areturn        
        //    45: aload_3        
        //    46: invokeinterface android/database/Cursor.close:()V
        //    51: aconst_null    
        //    52: areturn        
        //    53: astore_2       
        //    54: goto            66
        //    57: astore_1       
        //    58: aload_2        
        //    59: astore_3       
        //    60: goto            105
        //    63: astore_2       
        //    64: aconst_null    
        //    65: astore_3       
        //    66: aload_3        
        //    67: astore_1       
        //    68: aload_0        
        //    69: getfield        z0/d1.f:Ljava/lang/Object;
        //    72: checkcast       Lpe/h4;
        //    75: invokevirtual   pe/h4.h:()Lpe/d3;
        //    78: getfield        pe/d3.k:Lpe/b3;
        //    81: aload_2        
        //    82: ldc_w           "Database error getting next bundle app id"
        //    85: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //    88: aload_3        
        //    89: ifnull          98
        //    92: aload_3        
        //    93: invokeinterface android/database/Cursor.close:()V
        //    98: aconst_null    
        //    99: areturn        
        //   100: astore_2       
        //   101: aload_1        
        //   102: astore_3       
        //   103: aload_2        
        //   104: astore_1       
        //   105: aload_3        
        //   106: ifnull          115
        //   109: aload_3        
        //   110: invokeinterface android/database/Cursor.close:()V
        //   115: aload_1        
        //   116: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  7      16     63     66     Landroid/database/sqlite/SQLiteException;
        //  7      16     57     63     Any
        //  18     27     53     57     Landroid/database/sqlite/SQLiteException;
        //  18     27     100    105    Any
        //  29     37     53     57     Landroid/database/sqlite/SQLiteException;
        //  29     37     100    105    Any
        //  68     88     100    105    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final List o0(final String s, final String s2, final String s3) {
        b.O(s);
        this.M();
        this.N();
        final ArrayList list = new ArrayList(3);
        list.add(s);
        final StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            list.add(s2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            list.add(String.valueOf(s3).concat("*"));
            sb.append(" and name glob ?");
        }
        return this.p0(sb.toString(), list.toArray(new String[list.size()]));
    }
    
    public final List p0(final String s, final String[] array) {
        this.M();
        this.N();
        final ArrayList list = new ArrayList();
        final Cursor cursor = null;
        Cursor query;
        final Cursor cursor2 = query = null;
        Cursor cursor3 = cursor;
        try {
            try {
                final SQLiteDatabase f0 = this.f0();
                query = cursor2;
                cursor3 = cursor;
                super.f.getClass();
                query = cursor2;
                cursor3 = cursor;
                final Cursor cursor4 = cursor3 = (query = f0.query("conditional_properties", new String[] { "app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event" }, s, array, (String)null, (String)null, "rowid", "1001"));
                if (cursor4.moveToFirst()) {
                    do {
                        query = cursor4;
                        cursor3 = cursor4;
                        final int size = list.size();
                        query = cursor4;
                        cursor3 = cursor4;
                        super.f.getClass();
                        if (size >= 1000) {
                            query = cursor4;
                            cursor3 = cursor4;
                            final b3 k = ((h4)super.f).h().k;
                            query = cursor4;
                            cursor3 = cursor4;
                            super.f.getClass();
                            query = cursor4;
                            cursor3 = cursor4;
                            k.b((Object)1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string = cursor4.getString(0);
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string2 = cursor4.getString(1);
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string3 = cursor4.getString(2);
                        query = cursor4;
                        cursor3 = cursor4;
                        final Object m0 = this.m0(cursor4, 3);
                        query = cursor4;
                        cursor3 = cursor4;
                        final boolean b = cursor4.getInt(4) != 0;
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string4 = cursor4.getString(5);
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long1 = cursor4.getLong(6);
                        query = cursor4;
                        cursor3 = cursor4;
                        final i7 l = super.g.l;
                        query = cursor4;
                        cursor3 = cursor4;
                        g7.H((b7)l);
                        query = cursor4;
                        cursor3 = cursor4;
                        final byte[] blob = cursor4.getBlob(7);
                        query = cursor4;
                        cursor3 = cursor4;
                        final Parcelable$Creator<t> creator = t.CREATOR;
                        query = cursor4;
                        cursor3 = cursor4;
                        final t t = (t)l.c0(blob, creator);
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long2 = cursor4.getLong(8);
                        query = cursor4;
                        cursor3 = cursor4;
                        final i7 i = super.g.l;
                        query = cursor4;
                        cursor3 = cursor4;
                        g7.H((b7)i);
                        query = cursor4;
                        cursor3 = cursor4;
                        final t t2 = (t)i.c0(cursor4.getBlob(9), creator);
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long3 = cursor4.getLong(10);
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long4 = cursor4.getLong(11);
                        query = cursor4;
                        cursor3 = cursor4;
                        final i7 j = super.g.l;
                        query = cursor4;
                        cursor3 = cursor4;
                        g7.H((b7)j);
                        query = cursor4;
                        cursor3 = cursor4;
                        final t t3 = (t)j.c0(cursor4.getBlob(12), creator);
                        query = cursor4;
                        cursor3 = cursor4;
                        query = cursor4;
                        cursor3 = cursor4;
                        final j7 j2 = new j7(long3, m0, string3, string2);
                        query = cursor4;
                        cursor3 = cursor4;
                        query = cursor4;
                        cursor3 = cursor4;
                        final pe.c c = new pe.c(string, string2, j2, long2, b, string4, t, long1, t2, long4, t3);
                        query = cursor4;
                        cursor3 = cursor4;
                        list.add(c);
                        query = cursor4;
                        cursor3 = cursor4;
                    } while (cursor4.moveToNext());
                    cursor4.close();
                    return list;
                }
                cursor4.close();
                return list;
            }
            finally {
                if (query != null) {
                    query.close();
                }
                cursor3.close();
                return;
            }
        }
        catch (final SQLiteException ex) {}
    }
    
    public final List q0(final String s) {
        b.O(s);
        this.M();
        this.N();
        final ArrayList list = new ArrayList();
        final Cursor cursor = null;
        Cursor query;
        final Cursor cursor2 = query = null;
        Cursor cursor3 = cursor;
        try {
            try {
                final SQLiteDatabase f0 = this.f0();
                query = cursor2;
                cursor3 = cursor;
                super.f.getClass();
                query = cursor2;
                cursor3 = cursor;
                final Cursor cursor4 = cursor3 = (query = f0.query("user_attributes", new String[] { "name", "origin", "set_timestamp", "value" }, "app_id=?", new String[] { s }, (String)null, (String)null, "rowid", "1000"));
                if (cursor4.moveToFirst()) {
                    do {
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string = cursor4.getString(0);
                        query = cursor4;
                        cursor3 = cursor4;
                        String string2;
                        if ((string2 = cursor4.getString(1)) == null) {
                            string2 = "";
                        }
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long1 = cursor4.getLong(2);
                        query = cursor4;
                        cursor3 = cursor4;
                        final Object m0 = this.m0(cursor4, 3);
                        if (m0 == null) {
                            query = cursor4;
                            cursor3 = cursor4;
                            ((h4)super.f).h().k.b((Object)d3.V(s), "Read invalid user property value, ignoring it. appId");
                        }
                        else {
                            query = cursor4;
                            cursor3 = cursor4;
                            query = cursor4;
                            cursor3 = cursor4;
                            final l7 l7 = new l7(s, string2, long1, string, m0);
                            query = cursor4;
                            cursor3 = cursor4;
                            list.add(l7);
                        }
                        query = cursor4;
                        cursor3 = cursor4;
                    } while (cursor4.moveToNext());
                    cursor4.close();
                    return list;
                }
                cursor4.close();
                return list;
            }
            finally {
                if (query != null) {
                    query.close();
                }
                cursor3.close();
                return;
            }
        }
        catch (final SQLiteException ex) {}
    }
    
    public final List r0(final String s, String string, final String ex) {
        b.O(s);
        this.M();
        this.N();
        final ArrayList list = new ArrayList();
        final Cursor cursor = null;
        Cursor query = null;
        final Cursor cursor2 = null;
        Cursor cursor3 = cursor;
        try {
            try {
                cursor3 = cursor;
                final ArrayList<String> list2 = new ArrayList<String>(3);
                cursor3 = cursor;
                try {
                    list2.add(s);
                    cursor3 = cursor;
                    cursor3 = cursor;
                    final StringBuilder sb = new StringBuilder("app_id=?");
                    cursor3 = cursor;
                    Label_0143: {
                        if (TextUtils.isEmpty((CharSequence)string)) {
                            break Label_0143;
                        }
                        final String s2 = string;
                        query = cursor2;
                        String s3 = s2;
                        cursor3 = cursor;
                        try {
                            list2.add(s2);
                            query = cursor2;
                            s3 = s2;
                            cursor3 = cursor;
                            sb.append(" and origin=?");
                            query = cursor2;
                            s3 = string;
                            cursor3 = cursor;
                            if (!TextUtils.isEmpty((CharSequence)ex)) {
                                query = cursor2;
                                s3 = string;
                                cursor3 = cursor;
                                query = cursor2;
                                s3 = string;
                                cursor3 = cursor;
                                final StringBuilder sb2 = new StringBuilder();
                                query = cursor2;
                                s3 = string;
                                cursor3 = cursor;
                                sb2.append((String)ex);
                                query = cursor2;
                                s3 = string;
                                cursor3 = cursor;
                                sb2.append("*");
                                query = cursor2;
                                s3 = string;
                                cursor3 = cursor;
                                list2.add(sb2.toString());
                                query = cursor2;
                                s3 = string;
                                cursor3 = cursor;
                                sb.append(" and name glob ?");
                            }
                            query = cursor2;
                            s3 = string;
                            cursor3 = cursor;
                            final String[] array = list2.toArray(new String[list2.size()]);
                            query = cursor2;
                            s3 = string;
                            cursor3 = cursor;
                            final SQLiteDatabase f0 = this.f0();
                            query = cursor2;
                            s3 = string;
                            cursor3 = cursor;
                            final String string2 = sb.toString();
                            query = cursor2;
                            s3 = string;
                            cursor3 = cursor;
                            super.f.getClass();
                            query = cursor2;
                            s3 = string;
                            cursor3 = cursor;
                            final Cursor cursor4 = query = f0.query("user_attributes", new String[] { "name", "set_timestamp", "value", "origin" }, string2, array, (String)null, (String)null, "rowid", "1001");
                            s3 = string;
                            cursor3 = cursor4;
                            if (!cursor4.moveToFirst()) {
                                cursor4.close();
                                return list;
                            }
                            do {
                                query = cursor4;
                                s3 = string;
                                cursor3 = cursor4;
                                final int size = list.size();
                                query = cursor4;
                                s3 = string;
                                cursor3 = cursor4;
                                super.f.getClass();
                                if (size >= 1000) {
                                    query = cursor4;
                                    s3 = string;
                                    cursor3 = cursor4;
                                    final b3 k = ((h4)super.f).h().k;
                                    query = cursor4;
                                    s3 = string;
                                    cursor3 = cursor4;
                                    super.f.getClass();
                                    query = cursor4;
                                    s3 = string;
                                    cursor3 = cursor4;
                                    k.b((Object)1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                query = cursor4;
                                s3 = string;
                                cursor3 = cursor4;
                                final String string3 = cursor4.getString(0);
                                query = cursor4;
                                s3 = string;
                                cursor3 = cursor4;
                                final long long1 = cursor4.getLong(1);
                                query = cursor4;
                                s3 = string;
                                cursor3 = cursor4;
                                final Object m0 = this.m0(cursor4, 2);
                                query = cursor4;
                                s3 = string;
                                cursor3 = cursor4;
                                string = cursor4.getString(3);
                                if (m0 == null) {
                                    query = cursor4;
                                    s3 = string;
                                    cursor3 = cursor4;
                                    ((h4)super.f).h().k.d((Object)d3.V(s), "(2)Read invalid user property value, ignoring it", (Object)string, (Object)ex);
                                }
                                else {
                                    query = cursor4;
                                    s3 = string;
                                    cursor3 = cursor4;
                                    query = cursor4;
                                    s3 = string;
                                    cursor3 = cursor4;
                                    final l7 l7 = new l7(s, string, long1, string3, m0);
                                    query = cursor4;
                                    s3 = string;
                                    cursor3 = cursor4;
                                    list.add(l7);
                                }
                                query = cursor4;
                                s3 = string;
                                cursor3 = cursor4;
                            } while (cursor4.moveToNext());
                            cursor4.close();
                            return list;
                        }
                        catch (final SQLiteException ex) {
                            string = s3;
                        }
                    }
                }
                catch (final SQLiteException ex2) {}
            }
            finally {
                if (cursor3 != null) {
                    cursor3.close();
                }
                ((h4)super.f).h().k.d((Object)d3.V(s), "(2)Error querying user properties", (Object)string, (Object)ex);
                final List<Object> emptyList = Collections.emptyList();
                iftrue(Label_0866:)(query == null);
                Block_18: {
                    break Block_18;
                    Label_0866: {
                        return emptyList;
                    }
                }
                query.close();
            }
        }
        catch (final SQLiteException ex3) {}
    }
    
    public final void s0() {
        this.N();
        this.f0().beginTransaction();
    }
    
    public final void t0() {
        this.N();
        this.f0().endTransaction();
    }
    
    public final void u0(final List list) {
        this.M();
        this.N();
        if (list.size() != 0) {
            if (!this.U()) {
                return;
            }
            final String k = a.k("(", TextUtils.join((CharSequence)",", (Iterable)list), ")");
            final StringBuilder sb = new StringBuilder();
            sb.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb.append(k);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (this.a0(sb.toString(), null) > 0L) {
                ((h4)super.f).h().n.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                final SQLiteDatabase f0 = this.f0();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(k);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                f0.execSQL(sb2.toString());
                return;
            }
            catch (final SQLiteException ex) {
                ((h4)super.f).h().k.b((Object)ex, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }
    
    public final void v0() {
        this.M();
        this.N();
        if (this.U()) {
            final long a = super.g.n.j.a();
            ((h4)super.f).s.getClass();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long abs = Math.abs(elapsedRealtime - a);
            super.f.getClass();
            if (abs > (long)r2.y.a(null)) {
                super.g.n.j.b(elapsedRealtime);
                this.M();
                this.N();
                if (this.U()) {
                    final SQLiteDatabase f0 = this.f0();
                    ((h4)super.f).s.getClass();
                    final long currentTimeMillis = System.currentTimeMillis();
                    super.f.getClass();
                    final int delete = f0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(currentTimeMillis), String.valueOf((long)r2.D.a(null)) });
                    if (delete > 0) {
                        ((h4)super.f).h().s.b((Object)delete, "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }
}
