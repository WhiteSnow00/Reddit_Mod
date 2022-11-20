// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import k6.r;
import k6.x;
import k6.q$c;
import java.util.ArrayList;
import k5.b;
import k5.c;
import k6.t;
import java.util.UUID;
import c6.k;
import androidx.work.WorkInfo;

public final class n extends o<WorkInfo>
{
    public final k g;
    public final UUID h;
    
    public n(final k g, final UUID h) {
        this.g = g;
        this.h = h;
    }
    
    public final WorkInfo a() {
        final r x = this.g.c.x();
        final String string = this.h.toString();
        final t t = (t)x;
        t.getClass();
        final i5.k d = i5.k.d(1, "SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?");
        if (string == null) {
            d.bindNull(1);
        }
        else {
            d.bindString(1, string);
        }
        t.a.b();
        t.a.c();
        try {
            final RoomDatabase a = t.a;
            final WorkInfo workInfo = null;
            final Cursor b = c.b(a, d, true);
            Label_0560: {
                final q$c q$c2;
                Label_0513: {
                    try {
                        final int b2 = k5.b.b(b, "id");
                        final int b3 = k5.b.b(b, "state");
                        final int b4 = k5.b.b(b, "output");
                        final int b5 = k5.b.b(b, "run_attempt_count");
                        final j0.b<String, ArrayList<String>> b6 = new j0.b<String, ArrayList<String>>();
                        final j0.b<String, ArrayList<androidx.work.b>> b7 = new j0.b<String, ArrayList<androidx.work.b>>();
                        while (b.moveToNext()) {
                            if (!b.isNull(b2)) {
                                final String string2 = b.getString(b2);
                                if (b6.getOrDefault((Object)string2, (Object)null) == null) {
                                    b6.put((Object)string2, (Object)new ArrayList());
                                }
                            }
                            if (!b.isNull(b2)) {
                                final String string3 = b.getString(b2);
                                if (b7.getOrDefault((Object)string3, (Object)null) != null) {
                                    continue;
                                }
                                b7.put((Object)string3, (Object)new ArrayList());
                            }
                        }
                        b.moveToPosition(-1);
                        t.b(b6);
                        t.a(b7);
                        if (b.moveToFirst()) {
                            ArrayList list;
                            if (!b.isNull(b2)) {
                                list = (ArrayList)b6.getOrDefault((Object)b.getString(b2), (Object)null);
                            }
                            else {
                                list = null;
                            }
                            ArrayList e = list;
                            if (list == null) {
                                e = new ArrayList();
                            }
                            ArrayList list2;
                            if (!b.isNull(b2)) {
                                list2 = (ArrayList)b7.getOrDefault((Object)b.getString(b2), (Object)null);
                            }
                            else {
                                list2 = null;
                            }
                            ArrayList f = list2;
                            if (list2 == null) {
                                f = new ArrayList();
                            }
                            final q$c q$c = new q$c();
                            q$c.a = b.getString(b2);
                            q$c.b = k6.x.e(b.getInt(b3));
                            q$c.c = androidx.work.b.a(b.getBlob(b4));
                            q$c.d = b.getInt(b5);
                            q$c.e = e;
                            q$c.f = f;
                            break Label_0513;
                        }
                    }
                    finally {
                        break Label_0560;
                    }
                    q$c2 = null;
                }
                t.a.q();
                b.close();
                d.h();
                t.a.m();
                WorkInfo a2 = workInfo;
                if (q$c2 != null) {
                    a2 = q$c2.a();
                }
                return a2;
            }
            b.close();
            d.h();
        }
        finally {
            t.a.m();
        }
    }
}
