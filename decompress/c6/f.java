// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import androidx.room.RoomDatabase;
import java.util.Iterator;
import java.util.ArrayList;
import k6.r;
import k6.q;
import k6.t;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import androidx.work.a;
import b6.j;

public final class f
{
    public static final String a;
    
    static {
        a = j.e("Schedulers");
    }
    
    public static void a(final a a, WorkDatabase workDatabase, final List<e> list) {
        if (list != null) {
            if (list.size() != 0) {
                final r x = workDatabase.x();
                ((RoomDatabase)workDatabase).c();
                try {
                    final int h = a.h;
                    final t t = (t)x;
                    final ArrayList e = t.e(h);
                    final ArrayList d = t.d();
                    if (e.size() > 0) {
                        final long currentTimeMillis = System.currentTimeMillis();
                        final Iterator iterator = e.iterator();
                        while (iterator.hasNext()) {
                            t.n(currentTimeMillis, ((q)iterator.next()).a);
                        }
                    }
                    ((RoomDatabase)workDatabase).q();
                    ((RoomDatabase)workDatabase).m();
                    if (e.size() > 0) {
                        workDatabase = (WorkDatabase)(Object)e.toArray(new q[e.size()]);
                        for (final e e2 : list) {
                            if (e2.b()) {
                                e2.a((q[])(Object)workDatabase);
                            }
                        }
                    }
                    if (d.size() > 0) {
                        final q[] array = d.toArray(new q[d.size()]);
                        final Iterator iterator3 = list.iterator();
                        while (iterator3.hasNext()) {
                            workDatabase = (WorkDatabase)iterator3.next();
                            if (!((e)workDatabase).b()) {
                                ((e)workDatabase).a(array);
                            }
                        }
                    }
                }
                finally {
                    ((RoomDatabase)workDatabase).m();
                }
            }
        }
    }
}
