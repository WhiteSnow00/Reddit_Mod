// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import j0.i;
import android.database.Cursor;
import java.util.ArrayList;
import l5.b;
import l5.c;
import j5.o;
import java.util.List;
import java.util.concurrent.Callable;

public final class s implements Callable<List<q.c>>
{
    public final /* synthetic */ o f;
    public final /* synthetic */ t g;
    
    public s(final t g, final o f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        this.g.a.c();
        try {
            final Cursor b = c.b(this.g.a, this.f, true);
            Label_0476: {
                ArrayList list;
                try {
                    final int b2 = l5.b.b(b, "id");
                    final int b3 = l5.b.b(b, "state");
                    final int b4 = l5.b.b(b, "output");
                    final int b5 = l5.b.b(b, "run_attempt_count");
                    final j0.b b6 = new j0.b();
                    final j0.b b7 = new j0.b();
                    while (b.moveToNext()) {
                        if (!b.isNull(b2)) {
                            final String string = b.getString(b2);
                            if (((i)b6).getOrDefault((Object)string, (Object)null) == null) {
                                ((i)b6).put((Object)string, (Object)new ArrayList());
                            }
                        }
                        if (!b.isNull(b2)) {
                            final String string2 = b.getString(b2);
                            if (((i)b7).getOrDefault((Object)string2, (Object)null) != null) {
                                continue;
                            }
                            ((i)b7).put((Object)string2, (Object)new ArrayList());
                        }
                    }
                    b.moveToPosition(-1);
                    this.g.b((j0.b<String, ArrayList<String>>)b6);
                    this.g.a((j0.b<String, ArrayList<androidx.work.b>>)b7);
                    list = new ArrayList<q.c>(b.getCount());
                    while (b.moveToNext()) {
                        ArrayList list2;
                        if (!b.isNull(b2)) {
                            list2 = (ArrayList)((i)b6).getOrDefault((Object)b.getString(b2), (Object)null);
                        }
                        else {
                            list2 = null;
                        }
                        ArrayList e = list2;
                        if (list2 == null) {
                            e = new ArrayList();
                        }
                        ArrayList list3;
                        if (!b.isNull(b2)) {
                            list3 = (ArrayList)((i)b7).getOrDefault((Object)b.getString(b2), (Object)null);
                        }
                        else {
                            list3 = null;
                        }
                        ArrayList f = list3;
                        if (list3 == null) {
                            f = new ArrayList();
                        }
                        final q.c c = new q.c();
                        c.a = b.getString(b2);
                        c.b = x.e(b.getInt(b3));
                        c.c = androidx.work.b.a(b.getBlob(b4));
                        c.d = b.getInt(b5);
                        c.e = e;
                        c.f = f;
                        list.add(c);
                    }
                }
                finally {
                    break Label_0476;
                }
                this.g.a.q();
                b.close();
                return list;
            }
            b.close();
        }
        finally {
            this.g.a.m();
        }
    }
    
    public final void finalize() {
        this.f.h();
    }
}
