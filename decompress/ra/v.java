// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import android.database.sqlite.SQLiteOpenHelper;
import java.util.Objects;
import com.google.android.datatransport.Priority;
import android.util.Log;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import java.util.HashMap;
import android.os.SystemClock;
import android.database.sqlite.SQLiteDatabaseLockedException;
import qa.h;
import qa.i;
import java.util.Iterator;
import android.database.Cursor;
import android.util.Base64;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import android.database.sqlite.SQLiteDatabase;
import javax.inject.Inject;
import javax.inject.Named;
import ga.b;
import javax.inject.Singleton;
import sa.a;

@Singleton
public final class v implements d, a, c
{
    public static final b k;
    public final c0 f;
    public final ta.a g;
    public final ta.a h;
    public final e i;
    public final la.a<String> j;
    
    static {
        k = new b("proto");
    }
    
    @Inject
    public v(final ta.a g, final ta.a h, final e i, final c0 f, @Named("PACKAGE_NAME") final la.a<String> j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static Long r(final SQLiteDatabase sqLiteDatabase, final com.google.android.datatransport.runtime.c c) {
        final StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(c.b(), String.valueOf(ua.a.a(c.d()))));
        if (c.c() != null) {
            sb.append(" and extras = ?");
            list.add(Base64.encodeToString(c.c(), 0));
        }
        else {
            sb.append(" and extras is null");
        }
        return u(sqLiteDatabase.query("transport_contexts", new String[] { "_id" }, sb.toString(), (String[])list.toArray(new String[0]), (String)null, (String)null, (String)null), (v.v$a<Cursor, Long>)new k(0));
    }
    
    public static String t(final Iterable<j> iterable) {
        final StringBuilder sb = new StringBuilder("(");
        final Iterator<j> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().b());
            if (iterator.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }
    
    public static <T> T u(final Cursor cursor, final v.v$a<Cursor, T> v$a) {
        try {
            return (T)v$a.apply((Object)cursor);
        }
        finally {
            cursor.close();
        }
    }
    
    public final void D(final Iterable<j> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final StringBuilder r = a.r("DELETE FROM events WHERE _id in ");
        r.append(t(iterable));
        this.q().compileStatement(r.toString()).execute();
    }
    
    public final Iterable<com.google.android.datatransport.runtime.c> G1() {
        return this.s((v.v$a<SQLiteDatabase, Iterable<com.google.android.datatransport.runtime.c>>)new ha.c(1));
    }
    
    public final long Q1(final com.google.android.datatransport.runtime.c c) {
        final Cursor rawQuery = this.q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { c.b(), String.valueOf(ua.a.a(c.d())) });
        try {
            Long n;
            if (rawQuery.moveToNext()) {
                n = rawQuery.getLong(0);
            }
            else {
                n = 0L;
            }
            rawQuery.close();
            return n;
        }
        finally {
            rawQuery.close();
        }
    }
    
    public final boolean R1(final com.google.android.datatransport.runtime.c c) {
        return this.s((v.v$a<SQLiteDatabase, Boolean>)new i(1, this, c));
    }
    
    public final void U1(final Iterable<j> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final StringBuilder r = a.r("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        r.append(t(iterable));
        this.s((v.v$a<SQLiteDatabase, Object>)new t(this, r.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
    }
    
    public final Iterable<j> Z1(final com.google.android.datatransport.runtime.c c) {
        return this.s((v.v$a<SQLiteDatabase, Iterable<j>>)new h(1, (Object)this, (Object)c));
    }
    
    public final <T> T a(final a<T> a) {
        final SQLiteDatabase q = this.q();
        final ja.k k = new ja.k(1);
        final long a2 = this.h.a();
        while (true) {
            Label_0089: {
                try {
                    q.beginTransaction();
                }
                catch (final SQLiteDatabaseLockedException ex) {
                    if (this.h.a() < this.i.a() + a2) {
                        break Label_0089;
                    }
                    k.apply(ex);
                }
                try {
                    final T execute = a.execute();
                    q.setTransactionSuccessful();
                    return execute;
                }
                finally {
                    q.endTransaction();
                }
            }
            SystemClock.sleep(50L);
        }
    }
    
    public final void b() {
        this.s((v.v$a<SQLiteDatabase, Object>)new s(this, 0));
    }
    
    public final int cleanUp() {
        return this.s((v.v$a<SQLiteDatabase, Integer>)new q(this, this.g.a() - this.i.b()));
    }
    
    public final void close() {
        ((SQLiteOpenHelper)this.f).close();
    }
    
    public final void g2(final long n, final com.google.android.datatransport.runtime.c c) {
        this.s((v.v$a<SQLiteDatabase, Object>)new r(n, c));
    }
    
    public final na.a h() {
        final int e = na.a.e;
        final a.a a = new a.a();
        final HashMap hashMap = new HashMap();
        final SQLiteDatabase q = this.q();
        q.beginTransaction();
        try {
            final na.a a2 = u(q.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), (v.v$a<Cursor, na.a>)new p(this, hashMap, a, 1));
            q.setTransactionSuccessful();
            return a2;
        }
        finally {
            q.endTransaction();
        }
    }
    
    public final void j(final long n, final LogEventDropped$Reason logEventDropped$Reason, final String s) {
        this.s((v.v$a<SQLiteDatabase, Object>)new qa.j(s, n, logEventDropped$Reason));
    }
    
    public final ra.b l2(final com.google.android.datatransport.runtime.c c, final EventInternal eventInternal) {
        final Priority d = c.d();
        final String transportName = eventInternal.getTransportName();
        final String b = c.b();
        final String c2 = oa.a.c("SQLiteEventStore");
        if (Log.isLoggable(c2, 3)) {
            Log.d(c2, String.format("Storing event with priority=%s, name=%s for destination %s", d, transportName, b));
        }
        final long longValue = this.s((v.v$a<SQLiteDatabase, Long>)new p(this, eventInternal, c, 0));
        if (longValue < 1L) {
            return null;
        }
        return new ra.b(longValue, c, eventInternal);
    }
    
    public final SQLiteDatabase q() {
        final c0 f = this.f;
        Objects.requireNonNull(f);
        final n n = new n(0);
        final long a = this.h.a();
        Object o;
        while (true) {
            Label_0079: {
                try {
                    o = ((SQLiteOpenHelper)f).getWritableDatabase();
                }
                catch (final SQLiteDatabaseLockedException ex) {
                    if (this.h.a() < this.i.a() + a) {
                        break Label_0079;
                    }
                    o = ((v.v$a)n).apply(ex);
                }
                break;
            }
            SystemClock.sleep(50L);
        }
        return (SQLiteDatabase)o;
    }
    
    public final <T> T s(final v.v$a<SQLiteDatabase, T> v$a) {
        final SQLiteDatabase q = this.q();
        q.beginTransaction();
        try {
            final Object apply = v$a.apply((Object)q);
            q.setTransactionSuccessful();
            return (T)apply;
        }
        finally {
            q.endTransaction();
        }
    }
}
