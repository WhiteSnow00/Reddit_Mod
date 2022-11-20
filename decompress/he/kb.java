// 
// Decompiled by Procyon v0.6.0
// 

package he;

import cg.o;
import mg.d0;
import cg.l;
import android.content.Context;
import cg.f;
import android.util.Log;
import android.util.Pair;
import dg.e1;
import we.j;
import com.google.firebase.iid.a$a;
import com.google.firebase.iid.FirebaseInstanceId;
import we.g;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.diagnostics.nonfatals.NonFatals;
import android.content.ContentValues;
import ai2.h;
import java.io.Closeable;
import zd.b;
import kotlin.collections.EmptyList;
import ng2.e;
import com.instabug.library.map.TwoWayMapper;
import java.util.List;
import android.database.Cursor;
import ih.i;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import we.a;
import hg.m0;

public final class kb implements jc, m0, a
{
    public Object f;
    public Object g;
    public Object h;
    
    public kb(final DatabaseManager f, final zk.a g, final com.instabug.apm.cache.handler.experiment.mapping.a h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public kb(final q5 h, final vd f, final r5 g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public kb(final Object f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public kb(final String f, final String g, final String h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void a(final String s) {
        ((r5)this.g).d(i.a(s));
    }
    
    public final List b(final Cursor cursor) {
        try {
            Object instance;
            if (cursor.moveToFirst()) {
                final byte[] blob = cursor.getBlob(cursor.getColumnIndex("experiment_array"));
                final TwoWayMapper twoWayMapper = (TwoWayMapper)this.h;
                e.e((Object)blob, "experimentsByteArray");
                instance = twoWayMapper.mapBackwards((Object)blob);
            }
            else {
                instance = EmptyList.INSTANCE;
            }
            b.u((Closeable)cursor, null);
            return (List)instance;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                b.u((Closeable)cursor, t);
            }
        }
    }
    
    public final void c(final cc cc) {
        final bd bd = (bd)cc;
        final vd vd = (vd)this.f;
        vd.j = bd.g;
        ((h)((q5)this.h).f).q0(vd, (jc)new jb(0, this, this));
    }
    
    public final void d(final String s, final List list) {
        e.f((Object)list, "experiments");
        try {
            final SQLiteDatabaseWrapper openDatabase = ((DatabaseManager)this.f).openDatabase();
            final ContentValues contentValues = new ContentValues();
            contentValues.put("session_id", s);
            contentValues.put("experiment_array", (byte[])((TwoWayMapper)this.h).mapForwards((Object)list));
            openDatabase.insertWithOnConflict("apm_experiment", (String)null, contentValues);
        }
        catch (final Exception ex) {
            ((zk.a)this.g).b("DB execution a sql failed", (Throwable)ex);
            NonFatals.reportNonFatal((Throwable)ex, "DB execution a sql failed");
        }
    }
    
    public final Object then(g g) {
        final FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId)this.f;
        final String s = (String)this.g;
        final String s2 = (String)this.h;
        final String f = firebaseInstanceId.f();
        Object o = FirebaseInstanceId.j;
        final String g2 = firebaseInstanceId.g();
        synchronized (o) {
            final a$a b = a$a.b(((com.google.firebase.iid.a)o).a.getString(com.google.firebase.iid.a.b(g2, s, s2), (String)null));
            monitorexit(o);
            if (!firebaseInstanceId.j(b)) {
                g = j.e((Object)new hi.g(b.a));
                return g;
            }
            o = firebaseInstanceId.e;
            final e1 e1 = new e1((Object)firebaseInstanceId, (Object)f, (Object)s, (Object)s2, (Object)b);
            synchronized (o) {
                final Pair pair = new Pair((Object)s, (Object)s2);
                g = (g)((hi.i)o).b.getOrDefault((Object)pair, (Object)null);
                if (g != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        final String value = String.valueOf(pair);
                        final StringBuilder sb = new StringBuilder(value.length() + 29);
                        sb.append("Joining ongoing request for: ");
                        sb.append(value);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                    monitorexit(o);
                }
                else {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        final String value2 = String.valueOf(pair);
                        final StringBuilder sb2 = new StringBuilder(value2.length() + 24);
                        sb2.append("Making new request for: ");
                        sb2.append(value2);
                        Log.d("FirebaseInstanceId", sb2.toString());
                    }
                    g = e1.a();
                    g = g.h(((hi.i)o).a, (a)new oe2.e(6, o, (Object)pair));
                    ((hi.i)o).b.put((Object)pair, (Object)g);
                }
                return g;
            }
        }
    }
    
    public final Object zza() {
        final Object zza = ((m0)this.f).zza();
        final f f = (f)((m0)this.g).zza();
        final Context context = (Context)((l)this.h).f.g;
        d0.u1((Object)context);
        return new cg.i((o)zza, context);
    }
}
