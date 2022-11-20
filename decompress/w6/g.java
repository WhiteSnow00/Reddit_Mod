// 
// Decompiled by Procyon v0.6.0
// 

package w6;

import com.google.android.play.core.assetpacks.i;
import dg.i0;
import hg.l0;
import java.util.Iterator;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import java.util.Map;
import android.content.ContentValues;
import hk.e;
import com.instabug.library.model.common.Session;
import jk.h;
import mk.b;
import hk.a;
import hk.c;
import hg.m0;

public final class g implements m0
{
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    
    public g(final c f, final a g, final b h, final h i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public g(final Object f, final Object g, final Object h, final Object i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void a(final lk.c c, final Session session) {
        if (this.i != null) {
            final c c2 = (c)this.f;
            final String id = session.getId();
            final e e = (e)c2;
            final DatabaseManager b = e.b;
            if (b != null) {
                final SQLiteDatabaseWrapper openDatabase = b.openDatabase();
                final ContentValues contentValues = new ContentValues();
                contentValues.put("trace_id", Long.valueOf(c.a));
                contentValues.put("session_id", id);
                final String b2 = c.b;
                if (b2 != null) {
                    contentValues.put("name", b2);
                }
                contentValues.put("start_time", Long.valueOf(c.c));
                contentValues.put("duration", Long.valueOf(c.d));
                contentValues.put("started_on_background", Integer.valueOf((int)(c.f ? 1 : 0)));
                contentValues.put("ended_on_background", Integer.valueOf((int)(c.g ? 1 : 0)));
                if (openDatabase.insert("execution_traces", (String)null, contentValues) != -1L) {
                    final String b3 = c.b;
                    if (b3 != null) {
                        final Map e2 = c.e;
                        if (e2 != null) {
                            final long a = c.a;
                            for (final Map.Entry<String, V> entry : e2.entrySet()) {
                                e.c(a, b3, (String)entry.getKey(), (String)entry.getValue());
                            }
                        }
                    }
                }
                openDatabase.close();
            }
            ((h)this.i).f(session.getId());
        }
    }
    
    public final /* bridge */ Object zza() {
        return new i((com.google.android.play.core.assetpacks.c)((m0)this.f).zza(), l0.a((m0)this.g), (i0)((m0)this.h).zza(), l0.a((m0)this.i));
    }
}
