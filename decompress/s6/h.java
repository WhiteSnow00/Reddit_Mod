// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.diagnostics.nonfatals.NonFatals;
import java.util.Iterator;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import java.util.Map;
import android.content.ContentValues;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import h7.n;
import h7.p;
import ok.a;
import pl2.b;

public final class h implements b
{
    public Object f;
    public Object g;
    public Object h;
    
    public h() {
        synchronized (a.class) {
            if (ok.a.j == null) {
                ok.a.j = new gk.b();
            }
            final gk.b j = ok.a.j;
            monitorexit(a.class);
            this.f = j;
            this.g = ok.a.d();
            this.h = ok.a.h();
        }
    }
    
    public h(final gl2.b f) {
        this.f = f;
    }
    
    public h(final p f, final n g, final Collection h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public h(final List h) {
        this.h = h;
        this.f = new ArrayList(h.size());
        this.g = new ArrayList(h.size());
        for (int i = 0; i < h.size(); ++i) {
            ((List)this.f).add(new m((List<c7.a<x6.h>>)((Mask)h.get(i)).b.g));
            ((List)this.g).add(((Mask)h.get(i)).c.b());
        }
    }
    
    public final void a(final lk.b b) {
        final gk.b b2 = (gk.b)this.f;
        if (b2.a != null) {
            b2.b.getClass();
            zk.a.g("updating app launch");
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
            final zk.a b3 = b2.b;
            final StringBuilder t = a.t("updating app launch done with id: ");
            t.append(b.a);
            final String string = t.toString();
            b3.getClass();
            zk.a.g(string);
        }
    }
    
    public final ArrayList b(final String s) {
        final gk.b b = (gk.b)this.f;
        final DatabaseManager a = b.a;
        final Throwable t = null;
        final Cursor cursor = null;
        Throwable t2 = t;
        if (a != null) {
            final SQLiteDatabaseWrapper openDatabase = a.openDatabase();
            Cursor cursor3 = null;
            Label_0232: {
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
                    break Label_0232;
                }
                final zk.a b2 = b.b;
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
}
