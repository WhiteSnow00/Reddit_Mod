// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import j0.i;
import android.database.Cursor;
import androidx.room.RoomDatabase;
import l6.r;
import l6.x;
import l6.q;
import java.util.ArrayList;
import l5.b;
import l5.c;
import l6.t;
import java.util.UUID;
import d6.j;
import androidx.work.WorkInfo;

public final class n extends o<WorkInfo>
{
    public final /* synthetic */ j g;
    public final /* synthetic */ UUID h;
    
    public n(final j g, final UUID h) {
        this.g = g;
        this.h = h;
    }
    
    public final WorkInfo a() {
        final r x = this.g.c.x();
        final String string = this.h.toString();
        final t t = (t)x;
        t.getClass();
        final j5.o a = j5.o.a(1, "SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?");
        if (string == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, string);
        }
        t.a.b();
        t.a.c();
        try {
            final RoomDatabase a2 = t.a;
            final WorkInfo workInfo = null;
            final Cursor b = c.b(a2, a, true);
            Label_0519: {
                final q.c c2;
                Label_0479: {
                    try {
                        final int b2 = l5.b.b(b, "id");
                        final int b3 = l5.b.b(b, "state");
                        final int b4 = l5.b.b(b, "output");
                        final int b5 = l5.b.b(b, "run_attempt_count");
                        final j0.b b6 = new j0.b();
                        final j0.b b7 = new j0.b();
                        while (b.moveToNext()) {
                            if (!b.isNull(b2)) {
                                final String string2 = b.getString(b2);
                                if (((i)b6).getOrDefault((Object)string2, (Object)null) == null) {
                                    ((i)b6).put((Object)string2, (Object)new ArrayList());
                                }
                            }
                            if (!b.isNull(b2)) {
                                final String string3 = b.getString(b2);
                                if (((i)b7).getOrDefault((Object)string3, (Object)null) != null) {
                                    continue;
                                }
                                ((i)b7).put((Object)string3, (Object)new ArrayList());
                            }
                        }
                        b.moveToPosition(-1);
                        t.b((j0.b<String, ArrayList<String>>)b6);
                        t.a((j0.b<String, ArrayList<androidx.work.b>>)b7);
                        if (b.moveToFirst()) {
                            ArrayList list;
                            if (!b.isNull(b2)) {
                                list = (ArrayList)((i)b6).getOrDefault((Object)b.getString(b2), (Object)null);
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
                                list2 = (ArrayList)((i)b7).getOrDefault((Object)b.getString(b2), (Object)null);
                            }
                            else {
                                list2 = null;
                            }
                            ArrayList f = list2;
                            if (list2 == null) {
                                f = new ArrayList();
                            }
                            final q.c c = new q.c();
                            c.a = b.getString(b2);
                            c.b = l6.x.e(b.getInt(b3));
                            c.c = androidx.work.b.a(b.getBlob(b4));
                            c.d = b.getInt(b5);
                            c.e = e;
                            c.f = f;
                            break Label_0479;
                        }
                    }
                    finally {
                        break Label_0519;
                    }
                    c2 = null;
                }
                t.a.q();
                b.close();
                a.h();
                t.a.m();
                WorkInfo a3 = workInfo;
                if (c2 != null) {
                    a3 = c2.a();
                }
                return a3;
            }
            b.close();
            a.h();
        }
        finally {
            t.a.m();
        }
    }
}
