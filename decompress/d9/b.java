// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import com.google.android.play.core.internal.zzbx;
import java.lang.reflect.Field;
import s8.d;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import r8.l;
import java.util.concurrent.ScheduledFuture;
import xe.g;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.diagnostics.nonfatals.NonFatals;
import java.util.ArrayList;
import java.util.Iterator;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import java.util.Map;
import android.content.ContentValues;
import java.lang.reflect.Array;
import jk2.e;
import jk2.a;

public class b implements d9.c, c, a, e
{
    public Object f;
    public Object g;
    public Object h;
    
    public b(final int n) {
        if (n != 5) {
            synchronized (qk.a.class) {
                if (qk.a.j == null) {
                    qk.a.j = new ik.b();
                }
                final ik.b j = qk.a.j;
                monitorexit(qk.a.class);
                this.f = j;
                this.g = qk.a.d();
                this.h = qk.a.h();
                return;
            }
        }
        this.f = new float[4];
        final Class<Float> type = Float.TYPE;
        this.g = Array.newInstance(type, 2, 24);
        this.h = Array.newInstance(type, 2, 24);
    }
    
    public final void a(final nk.b b) {
        final ik.b b2 = (ik.b)this.f;
        if (b2.a != null) {
            b2.b.getClass();
            cl.a.g("updating app launch");
            final SQLiteDatabaseWrapper openDatabase = b2.a.openDatabase();
            final ContentValues contentValues = new ContentValues();
            final String c = b.c;
            if (c != null) {
                contentValues.put("screen_name", c);
            }
            contentValues.put("duration", Long.valueOf(b.e));
            openDatabase.update("app_launch", contentValues, "app_launch_id = ?", new String[] { String.valueOf(b.a) });
            final Map f = b.f;
            if (f != null) {
                for (final Map.Entry<String, V> entry : f.entrySet()) {
                    if (entry.getKey().equals("eal_mus")) {
                        final ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_launch_id", Long.valueOf(b.a));
                        contentValues2.put("attribute_key", (String)entry.getKey());
                        contentValues2.put("attribute_value", (String)entry.getValue());
                        openDatabase.insert("app_launch_attributes", (String)null, contentValues2);
                        break;
                    }
                }
            }
            openDatabase.close();
            final cl.a b3 = b2.b;
            final StringBuilder k = a.k("updating app launch done with id: ");
            k.append(b.a);
            final String string = k.toString();
            b3.getClass();
            cl.a.g(string);
        }
    }
    
    public final ArrayList b(final String s) {
        final ik.b b = (ik.b)this.f;
        final DatabaseManager a = b.a;
        final Throwable t = null;
        final Cursor cursor = null;
        Throwable t2 = t;
        if (a != null) {
            final SQLiteDatabaseWrapper openDatabase = a.openDatabase();
            Cursor cursor3 = null;
            Label_0233: {
                Cursor cursor2;
                try {
                    final Cursor query = openDatabase.query("app_launch", (String[])null, "session_id = ?", new String[] { s }, (String)null, (String)null, (String)null);
                    try {
                        try {
                            b.a(openDatabase, query);
                            openDatabase.close();
                            if (query != null) {
                                query.close();
                            }
                        }
                        finally {}
                    }
                    catch (final Exception t2) {}
                }
                catch (final Exception t2) {
                    cursor2 = null;
                }
                finally {
                    cursor3 = cursor;
                    break Label_0233;
                }
                final cl.a b2 = b.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("Error while getting app launches for session: ");
                sb.append(t2.getMessage());
                b2.b(sb.toString(), t2);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Error while getting app launches for session: ");
                sb2.append(t2.getMessage());
                NonFatals.reportNonFatal(t2, sb2.toString());
                t2 = t;
                if (cursor2 != null) {
                    cursor2.close();
                    t2 = t;
                    return (ArrayList)t2;
                }
                return (ArrayList)t2;
            }
            if (cursor3 != null) {
                cursor3.close();
            }
        }
        return (ArrayList)t2;
    }
    
    public final void c(final g g) {
        final nd.c c = (nd.c)this.f;
        final String s = (String)this.g;
        final ScheduledFuture scheduledFuture = (ScheduledFuture)this.h;
        synchronized (c.a) {
            c.a.remove((Object)s);
            monitorexit(c.a);
            scheduledFuture.cancel(false);
        }
    }
    
    public final l d(final l l, final p8.g g) {
        final Drawable drawable = l.get();
        if (drawable instanceof BitmapDrawable) {
            return ((d9.c)this.g).d((l)y8.d.b((d)this.f, ((BitmapDrawable)drawable).getBitmap()), g);
        }
        if (drawable instanceof c9.c) {
            return ((d9.c)this.h).d(l, g);
        }
        return null;
    }
    
    public final Object e() {
        try {
            return ((Class)this.h).cast(((Field)this.g).get(this.f));
        }
        catch (final Exception ex) {
            throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", ((Field)this.g).getName(), this.f.getClass().getName(), ((Class)this.h).getName()), (Throwable)ex);
        }
    }
    
    public final void f(final Object o) {
        try {
            ((Field)this.g).set(this.f, o);
        }
        catch (final Exception ex) {
            throw new zzbx(String.format("Failed to set value of field %s of type %s on object of type %s", ((Field)this.g).getName(), this.f.getClass().getName(), ((Class)this.h).getName()), (Throwable)ex);
        }
    }
}
