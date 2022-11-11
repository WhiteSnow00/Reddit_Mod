// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import androidx.room.RoomDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import l6.l;
import l6.v;
import android.database.Cursor;
import l6.r;
import l6.q;
import androidx.work.impl.WorkDatabase;
import d6.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l6.m;
import l6.k;
import l6.w;
import l6.u;
import l6.a;
import java.util.Map;
import androidx.work.b$a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import android.os.Build$VERSION;
import java.util.Collections;
import j5.o;
import java.util.ArrayList;
import l6.q$b;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo$State;
import l6.t;
import android.text.TextUtils;
import c6.i;
import d6.b;
import d6.f;

public final class e implements Runnable
{
    public static final String h;
    public final f f;
    public final b g;
    
    static {
        h = i.e("EnqueueRunnable");
    }
    
    public e(final f f) {
        this.f = f;
        this.g = new b();
    }
    
    public static boolean a(final f f) {
        final List<f> g = f.g;
        int n2;
        if (g != null) {
            final Iterator<f> iterator = g.iterator();
            int n = 0;
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final f f2 = iterator.next();
                if (!f2.h) {
                    n |= (a(f2) ? 1 : 0);
                }
                else {
                    i.c().f(e.h, String.format("Already enqueued work ids (%s).", TextUtils.join((CharSequence)", ", (Iterable)f2.e)), new Throwable[0]);
                }
            }
        }
        else {
            n2 = 0;
        }
        final HashSet f3 = f.f(f);
        final j a = f.a;
        final List<? extends androidx.work.f> d = f.d;
        String[] array = (String[])f3.toArray(new String[0]);
        final String b = f.b;
        final ExistingWorkPolicy c = f.c;
        final long currentTimeMillis = System.currentTimeMillis();
        final WorkDatabase c2 = a.c;
        int n3;
        if (array != null && array.length > 0) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        boolean b5 = false;
        Label_1609: {
            Label_0475: {
                int n8;
                int n9;
                int n10;
                if (n3 != 0) {
                    final int length = array.length;
                    int n4 = 0;
                    int n6;
                    int n5 = n6 = n4;
                    int n7 = 1;
                    while (true) {
                        n8 = n7;
                        n9 = n5;
                        n10 = n6;
                        if (n4 >= length) {
                            break;
                        }
                        final String s = array[n4];
                        final q k = ((t)c2.x()).k(s);
                        if (k == null) {
                            i.c().b(e.h, String.format("Prerequisite %s doesn't exist; not enqueuing", s), new Throwable[0]);
                            break Label_0475;
                        }
                        final WorkInfo$State b2 = k.b;
                        n7 &= ((b2 == WorkInfo$State.SUCCEEDED) ? 1 : 0);
                        int n11;
                        if (b2 == WorkInfo$State.FAILED) {
                            n11 = 1;
                        }
                        else {
                            n11 = n5;
                            if (b2 == WorkInfo$State.CANCELLED) {
                                n6 = 1;
                                n11 = n5;
                            }
                        }
                        ++n4;
                        n5 = n11;
                    }
                }
                else {
                    n8 = 1;
                    n9 = 0;
                    n10 = 0;
                }
                final boolean b3 = TextUtils.isEmpty((CharSequence)b) ^ true;
                Label_0977: {
                    if (b3 && n3 == 0) {
                        final ArrayList l = ((t)c2.x()).l(b);
                        if (!l.isEmpty()) {
                            if (c != ExistingWorkPolicy.APPEND && c != ExistingWorkPolicy.APPEND_OR_REPLACE) {
                                if (c == ExistingWorkPolicy.KEEP) {
                                    final Iterator iterator2 = l.iterator();
                                    while (iterator2.hasNext()) {
                                        final WorkInfo$State b4 = ((q$b)iterator2.next()).b;
                                        if (b4 == WorkInfo$State.ENQUEUED || b4 == WorkInfo$State.RUNNING) {
                                            break Label_0475;
                                        }
                                    }
                                }
                                ((d)new c(a, b, false)).run();
                                final r x = c2.x();
                                final Iterator iterator3 = l.iterator();
                                while (iterator3.hasNext()) {
                                    ((t)x).c(((q$b)iterator3.next()).a);
                                }
                                b5 = true;
                                break Label_0977;
                            }
                            final l6.b s2 = c2.s();
                            final ArrayList<String> list = new ArrayList<String>();
                            for (final q$b q$b : l) {
                                final String a2 = q$b.a;
                                final l6.c c3 = (l6.c)s2;
                                c3.getClass();
                                Object o = j5.o.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                                if (a2 == null) {
                                    ((o)o).bindNull(1);
                                }
                                else {
                                    ((o)o).bindString(1, a2);
                                }
                                c3.a.b();
                                final Cursor b6 = l5.c.b(c3.a, (o)o, false);
                                try {
                                    final boolean b7 = b6.moveToFirst() && b6.getInt(0) != 0;
                                    b6.close();
                                    ((o)o).h();
                                    boolean b8 = n8 != 0;
                                    int n12 = n9;
                                    int n13 = n10;
                                    if (!b7) {
                                        o = q$b.b;
                                        final boolean b9 = o == WorkInfo$State.SUCCEEDED;
                                        if (o == WorkInfo$State.FAILED) {
                                            n12 = 1;
                                        }
                                        else {
                                            n12 = n9;
                                            if (o == WorkInfo$State.CANCELLED) {
                                                n10 = 1;
                                                n12 = n9;
                                            }
                                        }
                                        list.add(q$b.a);
                                        b8 = (((b9 ? 1 : 0) & n8) != 0x0);
                                        n13 = n10;
                                    }
                                    n8 = (b8 ? 1 : 0);
                                    n9 = n12;
                                    n10 = n13;
                                    continue;
                                }
                                finally {
                                    b6.close();
                                    ((o)o).h();
                                }
                                break;
                            }
                            final int n14 = n2;
                            Object emptyList;
                            int n15;
                            if (c == ExistingWorkPolicy.APPEND_OR_REPLACE && (n10 != 0 || n9 != 0)) {
                                final t t = (t)c2.x();
                                final Iterator iterator5 = t.l(b).iterator();
                                while (iterator5.hasNext()) {
                                    t.c(((q$b)iterator5.next()).a);
                                }
                                emptyList = Collections.emptyList();
                                n15 = (n10 = 0);
                            }
                            else {
                                n15 = n9;
                                emptyList = list;
                            }
                            array = (String[])((List)emptyList).toArray(array);
                            if (array.length > 0) {
                                n3 = 1;
                                n9 = n15;
                                n2 = n14;
                            }
                            else {
                                n3 = 0;
                                n9 = n15;
                                n2 = n14;
                            }
                        }
                    }
                    b5 = false;
                }
                for (final androidx.work.f f4 : d) {
                    final q b10 = f4.b;
                    if (n3 != 0 && n8 == 0) {
                        if (n9 != 0) {
                            b10.b = WorkInfo$State.FAILED;
                        }
                        else if (n10 != 0) {
                            b10.b = WorkInfo$State.CANCELLED;
                        }
                        else {
                            b10.b = WorkInfo$State.BLOCKED;
                        }
                    }
                    else if (!b10.c()) {
                        b10.n = currentTimeMillis;
                    }
                    else {
                        b10.n = 0L;
                    }
                    if (Build$VERSION.SDK_INT <= 25) {
                        final c6.b j = b10.j;
                        final String c4 = b10.c;
                        if (!c4.equals(ConstraintTrackingWorker.class.getName()) && (j.d || j.e)) {
                            final b$a b$a = new b$a();
                            b$a.c((Map)b10.e.a);
                            b$a.e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", c4);
                            b10.c = ConstraintTrackingWorker.class.getName();
                            b10.e = b$a.a();
                        }
                    }
                    if (b10.b == WorkInfo$State.ENQUEUED) {
                        b5 = true;
                    }
                    Object o2 = c2.x();
                    ((t)o2).a.b();
                    ((t)o2).a.c();
                    try {
                        ((j5.e<q>)((t)o2).b).f(b10);
                        ((t)o2).a.q();
                        ((t)o2).a.m();
                        if (n3 != 0) {
                            final int length2 = array.length;
                            int i = 0;
                            while (i < length2) {
                                o2 = new a(f4.a.toString(), array[i]);
                                final l6.c c5 = (l6.c)c2.s();
                                c5.a.b();
                                c5.a.c();
                                try {
                                    ((j5.e<t>)c5.b).f((t)o2);
                                    c5.a.q();
                                    c5.a.m();
                                    ++i;
                                    continue;
                                }
                                finally {
                                    c5.a.m();
                                }
                                break;
                            }
                        }
                        final Iterator iterator7 = f4.c.iterator();
                        while (iterator7.hasNext()) {
                            o2 = iterator7.next();
                            final v y = c2.y();
                            o2 = new u((String)o2, f4.a.toString());
                            final w w = (w)y;
                            w.a.b();
                            w.a.c();
                            try {
                                ((j5.e<t>)w.b).f((t)o2);
                                w.a.q();
                                continue;
                            }
                            finally {
                                w.a.m();
                            }
                            break;
                        }
                        if (!b3) {
                            continue;
                        }
                        final l v = c2.v();
                        o2 = new k(b, f4.a.toString());
                        final m m = (m)v;
                        m.a.b();
                        m.a.c();
                        try {
                            ((j5.e<t>)m.b).f((t)o2);
                            m.a.q();
                        }
                        finally {
                            m.a.m();
                        }
                        continue;
                    }
                    finally {
                        ((t)o2).a.m();
                    }
                    break;
                }
                break Label_1609;
            }
            b5 = false;
        }
        f.h = true;
        return (n2 | (b5 ? 1 : 0)) != 0x0;
    }
    
    @Override
    public final void run() {
        try {
            final f f = this.f;
            f.getClass();
            if (!d6.f.e(f, new HashSet())) {
                final WorkDatabase c = this.f.a.c;
                ((RoomDatabase)c).c();
                try {
                    final boolean a = a(this.f);
                    ((RoomDatabase)c).q();
                    ((RoomDatabase)c).m();
                    if (a) {
                        m6.h.a(this.f.a.a, RescheduleReceiver.class, true);
                        final j a2 = this.f.a;
                        d6.e.a(a2.b, a2.c, (List)a2.e);
                    }
                    this.g.a((c6.j.a)c6.j.a);
                    return;
                }
                finally {
                    ((RoomDatabase)c).m();
                }
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f));
        }
        finally {
            final Throwable t;
            this.g.a((c6.j.a)new c6.j.a.a(t));
        }
    }
}
