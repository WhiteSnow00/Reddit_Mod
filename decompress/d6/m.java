// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import androidx.work.impl.utils.futures.AbstractFuture;
import android.database.Cursor;
import androidx.room.RoomDatabase;
import c6.g;
import androidx.work.WorkerParameters;
import m6.u;
import java.util.UUID;
import java.util.concurrent.Executor;
import m6.s;
import c6.f;
import l6.w;
import m6.h;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import j5.o;
import l6.p;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import androidx.work.ListenableWorker$a$b;
import androidx.work.WorkInfo$State;
import l6.t;
import androidx.work.ListenableWorker$a$c;
import androidx.work.ListenableWorker$a$a;
import c6.i;
import wg.c;
import java.util.ArrayList;
import l6.v;
import l6.b;
import l6.r;
import androidx.work.impl.WorkDatabase;
import androidx.work.ListenableWorker$a;
import n6.a;
import androidx.work.ListenableWorker;
import l6.q;
import androidx.work.WorkerParameters$a;
import java.util.List;
import android.content.Context;

public final class m implements Runnable
{
    public static final String y;
    public Context f;
    public String g;
    public List<d> h;
    public WorkerParameters$a i;
    public q j;
    public ListenableWorker k;
    public n6.a l;
    public ListenableWorker$a m;
    public androidx.work.a n;
    public k6.a o;
    public WorkDatabase p;
    public r q;
    public b r;
    public v s;
    public ArrayList t;
    public String u;
    public androidx.work.impl.utils.futures.a<Boolean> v;
    public c<ListenableWorker$a> w;
    public volatile boolean x;
    
    static {
        y = i.e("WorkerWrapper");
    }
    
    public m(final a a) {
        this.m = (ListenableWorker$a)new ListenableWorker$a$a();
        this.v = (androidx.work.impl.utils.futures.a<Boolean>)new androidx.work.impl.utils.futures.a();
        this.w = null;
        this.f = a.a;
        this.l = a.c;
        this.o = a.b;
        this.g = a.f;
        this.h = a.g;
        this.i = a.h;
        this.k = null;
        this.n = a.d;
        final WorkDatabase e = a.e;
        this.p = e;
        this.q = e.x();
        this.r = this.p.s();
        this.s = this.p.y();
    }
    
    public final void a(final ListenableWorker$a listenableWorker$a) {
        if (listenableWorker$a instanceof ListenableWorker$a$c) {
            c6.i.c().d(d6.m.y, String.format("Worker result SUCCESS for %s", this.u), new Throwable[0]);
            if (this.j.c()) {
                this.e();
                return;
            }
            ((RoomDatabase)this.p).c();
            try {
                ((t)this.q).s(WorkInfo$State.SUCCEEDED, new String[] { this.g });
                ((t)this.q).q(this.g, ((ListenableWorker$a$c)this.m).a);
                final long currentTimeMillis = System.currentTimeMillis();
                for (final String s : ((l6.c)this.r).a(this.g)) {
                    if (((t)this.q).h(s) == WorkInfo$State.BLOCKED && ((l6.c)this.r).b(s)) {
                        c6.i.c().d(d6.m.y, String.format("Setting status to enqueued for %s", s), new Throwable[0]);
                        ((t)this.q).s(WorkInfo$State.ENQUEUED, new String[] { s });
                        ((t)this.q).r(currentTimeMillis, s);
                    }
                }
                ((RoomDatabase)this.p).q();
                return;
            }
            finally {
                ((RoomDatabase)this.p).m();
                this.f(false);
            }
        }
        if (listenableWorker$a instanceof ListenableWorker$a$b) {
            c6.i.c().d(d6.m.y, String.format("Worker result RETRY for %s", this.u), new Throwable[0]);
            this.d();
        }
        else {
            c6.i.c().d(d6.m.y, String.format("Worker result FAILURE for %s", this.u), new Throwable[0]);
            if (this.j.c()) {
                this.e();
            }
            else {
                this.h();
            }
        }
    }
    
    public final void b(String s) {
        final LinkedList list = new LinkedList();
        list.add(s);
        while (!list.isEmpty()) {
            s = (String)list.remove();
            if (((t)this.q).h(s) != WorkInfo$State.CANCELLED) {
                ((t)this.q).s(WorkInfo$State.FAILED, new String[] { s });
            }
            list.addAll(((l6.c)this.r).a(s));
        }
    }
    
    public final void c() {
        if (!this.i()) {
            ((RoomDatabase)this.p).c();
            try {
                final WorkInfo$State h = ((t)this.q).h(this.g);
                ((p)this.p.w()).a(this.g);
                if (h == null) {
                    this.f(false);
                }
                else if (h == WorkInfo$State.RUNNING) {
                    this.a(this.m);
                }
                else if (!h.isFinished()) {
                    this.d();
                }
                ((RoomDatabase)this.p).q();
            }
            finally {
                ((RoomDatabase)this.p).m();
            }
        }
        final List<d> h2 = this.h;
        if (h2 != null) {
            final Iterator<d> iterator = h2.iterator();
            while (iterator.hasNext()) {
                iterator.next().cancel(this.g);
            }
            e.a(this.n, this.p, (List)this.h);
        }
    }
    
    public final void d() {
        ((RoomDatabase)this.p).c();
        try {
            ((t)this.q).s(WorkInfo$State.ENQUEUED, new String[] { this.g });
            ((t)this.q).r(System.currentTimeMillis(), this.g);
            ((t)this.q).n(-1L, this.g);
            ((RoomDatabase)this.p).q();
        }
        finally {
            ((RoomDatabase)this.p).m();
            this.f(true);
        }
    }
    
    public final void e() {
        ((RoomDatabase)this.p).c();
        try {
            ((t)this.q).r(System.currentTimeMillis(), this.g);
            ((t)this.q).s(WorkInfo$State.ENQUEUED, new String[] { this.g });
            ((t)this.q).p(this.g);
            ((t)this.q).n(-1L, this.g);
            ((RoomDatabase)this.p).q();
        }
        finally {
            ((RoomDatabase)this.p).m();
            this.f(false);
        }
    }
    
    public final void f(final boolean b) {
        ((RoomDatabase)this.p).c();
        try {
            final t t = (t)this.p.x();
            t.getClass();
            Object o = j5.o.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            t.a.b();
            Object o2 = l5.c.b(t.a, (o)o, false);
            try {
                final boolean b2 = ((Cursor)o2).moveToFirst() && ((Cursor)o2).getInt(0) != 0;
                ((Cursor)o2).close();
                ((o)o).h();
                if (!b2) {
                    m6.h.a(this.f, RescheduleReceiver.class, false);
                }
                if (b) {
                    o2 = this.q;
                    o = WorkInfo$State.ENQUEUED;
                    ((t)o2).s((WorkInfo$State)o, new String[] { this.g });
                    o = this.q;
                    o2 = this.g;
                    ((t)o).n(-1L, (String)o2);
                }
                if (this.j != null) {
                    o = this.k;
                    if (o != null && ((ListenableWorker)o).isRunInForeground()) {
                        o = this.o;
                        o2 = this.g;
                        final d6.c c = (d6.c)o;
                        synchronized (c.p) {
                            c.k.remove(o2);
                            c.g();
                        }
                    }
                }
                ((RoomDatabase)this.p).q();
                ((RoomDatabase)this.p).m();
                this.v.i((Object)b);
            }
            finally {
                ((Cursor)o2).close();
                ((o)o).h();
            }
        }
        finally {
            ((RoomDatabase)this.p).m();
        }
    }
    
    public final void g() {
        final WorkInfo$State h = ((t)this.q).h(this.g);
        if (h == WorkInfo$State.RUNNING) {
            c6.i.c().a(d6.m.y, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.g), new Throwable[0]);
            this.f(true);
        }
        else {
            c6.i.c().a(d6.m.y, String.format("Status for %s is %s; not doing any work", this.g, h), new Throwable[0]);
            this.f(false);
        }
    }
    
    public final void h() {
        ((RoomDatabase)this.p).c();
        try {
            this.b(this.g);
            ((t)this.q).q(this.g, ((ListenableWorker$a$a)this.m).a);
            ((RoomDatabase)this.p).q();
        }
        finally {
            ((RoomDatabase)this.p).m();
            this.f(false);
        }
    }
    
    public final boolean i() {
        if (this.x) {
            c6.i.c().a(d6.m.y, String.format("Work interrupted for %s", this.u), new Throwable[0]);
            final WorkInfo$State h = ((t)this.q).h(this.g);
            if (h == null) {
                this.f(false);
            }
            else {
                this.f(h.isFinished() ^ true);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final void run() {
        Object o = ((w)this.s).a(this.g);
        this.t = (ArrayList)o;
        final StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.g);
        sb.append(", tags={ ");
        final Iterator iterator = ((ArrayList)o).iterator();
        final int n = 1;
        int n2 = 1;
        while (iterator.hasNext()) {
            o = iterator.next();
            if (n2 != 0) {
                n2 = 0;
            }
            else {
                sb.append(", ");
            }
            sb.append((String)o);
        }
        sb.append(" } ]");
        this.u = sb.toString();
        if (this.i()) {
            return;
        }
        ((RoomDatabase)this.p).c();
        try {
            o = ((t)this.q).k(this.g);
            this.j = (q)o;
        Label_0858_Outer:
            while (true) {
                Label_0728: {
                    f f = null;
                    ArrayList list = null;
                    t t = null;
                    Label_0634: {
                        Label_0406: {
                            if (o == null) {
                                c6.i.c().b(d6.m.y, String.format("Didn't find WorkSpec for id %s", this.g), new Throwable[0]);
                                this.f(false);
                                ((RoomDatabase)this.p).q();
                            }
                            else {
                                final WorkInfo$State b = ((q)o).b;
                                final WorkInfo$State enqueued = WorkInfo$State.ENQUEUED;
                                if (b != enqueued) {
                                    this.g();
                                    ((RoomDatabase)this.p).q();
                                    c6.i.c().a(d6.m.y, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.j.c), new Throwable[0]);
                                }
                                else {
                                    Label_0416: {
                                        if (!((q)o).c()) {
                                            o = this.j;
                                            if (((q)o).b != enqueued || ((q)o).k <= 0) {
                                                break Label_0416;
                                            }
                                        }
                                        final long currentTimeMillis = System.currentTimeMillis();
                                        final q j = this.j;
                                        if (j.n != 0L && currentTimeMillis < j.a()) {
                                            c6.i.c().a(d6.m.y, String.format("Delaying execution for %s because it is being executed before schedule.", this.j.c), new Throwable[0]);
                                            this.f(true);
                                            ((RoomDatabase)this.p).q();
                                            break Label_0406;
                                        }
                                    }
                                    ((RoomDatabase)this.p).q();
                                    ((RoomDatabase)this.p).m();
                                    if (this.j.c()) {
                                        final androidx.work.b e = this.j.e;
                                        break Label_0448;
                                    }
                                    final g d = this.n.d;
                                    final String d2 = this.j.d;
                                    d.getClass();
                                    final String a = c6.f.a;
                                    f = null;
                                    try {
                                        o = (f = (f)Class.forName(d2).newInstance());
                                    }
                                    catch (final Exception o) {
                                        c6.i.c().b(c6.f.a, al0.b.h("Trouble instantiating + ", d2), (Throwable)o);
                                    }
                                    if (f == null) {
                                        c6.i.c().b(d6.m.y, String.format("Could not create Input Merger %s", this.j.d), new Throwable[0]);
                                        this.h();
                                        return;
                                    }
                                    list = new ArrayList();
                                    list.add(this.j.e);
                                    final r q = this.q;
                                    final String g = this.g;
                                    t = (t)q;
                                    t.getClass();
                                    o = j5.o.a(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                                    if (g == null) {
                                        ((o)o).bindNull(1);
                                        break Label_0634;
                                    }
                                    ((o)o).bindString(1, g);
                                    break Label_0634;
                                }
                            }
                        }
                        ((RoomDatabase)this.p).m();
                        return;
                        break Label_0728;
                    }
                    t.a.b();
                    Object o2 = l5.c.b(t.a, (o)o, false);
                    try {
                        final ArrayList list2 = new ArrayList<androidx.work.b>(((Cursor)o2).getCount());
                        while (((Cursor)o2).moveToNext()) {
                            list2.add(androidx.work.b.a(((Cursor)o2).getBlob(0)));
                        }
                        ((Cursor)o2).close();
                        ((o)o).h();
                        list.addAll(list2);
                        f.a(list);
                        continue Label_0858_Outer;
                        final WorkerParameters workerParameters;
                        Block_24:Block_25_Outer:
                        while (true) {
                            o = this.k;
                            iftrue(Label_0907:)(o != null);
                            break Block_24;
                            while (true) {
                                c6.i.c().b(d6.m.y, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.j.c), new Throwable[0]);
                                this.h();
                                return;
                                Label_0907: {
                                    iftrue(Label_0954:)(!((ListenableWorker)o).isUsed());
                                }
                                continue;
                            }
                            this.k = this.n.c.b(this.f, this.j.c, workerParameters);
                            continue Block_25_Outer;
                        }
                        c6.i.c().b(d6.m.y, String.format("Could not create Worker %s", this.j.c), new Throwable[0]);
                        this.h();
                        return;
                        Label_0954: {
                            this.k.setUsed();
                        }
                        ((RoomDatabase)this.p).c();
                        try {
                            o = this.q;
                            int n3;
                            if (((t)o).h(this.g) == WorkInfo$State.ENQUEUED) {
                                final r q2 = this.q;
                                o2 = WorkInfo$State.RUNNING;
                                o = this.g;
                                ((t)q2).s((WorkInfo$State)o2, new String[] { (String)o });
                                o = this.q;
                                ((t)o).m(this.g);
                                n3 = n;
                            }
                            else {
                                n3 = 0;
                            }
                            ((RoomDatabase)this.p).q();
                            ((RoomDatabase)this.p).m();
                            if (n3 != 0) {
                                if (!this.i()) {
                                    o = new androidx.work.impl.utils.futures.a();
                                    final s s = new s(this.f, this.j, this.k, workerParameters.j, this.l);
                                    ((n6.b)this.l).c.execute((Runnable)s);
                                    final androidx.work.impl.utils.futures.a f2 = s.f;
                                    ((AbstractFuture)f2).a((Runnable)new k(this, f2, (androidx.work.impl.utils.futures.a)o), (Executor)((n6.b)this.l).c);
                                    ((AbstractFuture)o).a((Runnable)new l(this, (androidx.work.impl.utils.futures.a)o, this.u), (Executor)((n6.b)this.l).a);
                                }
                            }
                            else {
                                this.g();
                            }
                            return;
                        }
                        finally {
                            ((RoomDatabase)this.p).m();
                        }
                        o = UUID.fromString(this.g);
                        final ArrayList t2 = this.t;
                        final WorkerParameters$a i = this.i;
                        final int k = this.j.k;
                        o2 = this.n;
                        final androidx.work.b e;
                        workerParameters = new WorkerParameters((UUID)o, e, (List)t2, i, k, ((androidx.work.a)o2).a, this.l, ((androidx.work.a)o2).c, new m6.w(this.p, this.l), new u(this.p, this.o, this.l));
                        iftrue(Label_0858:)(this.k != null);
                    }
                    finally {
                        ((Cursor)o2).close();
                        ((o)o).h();
                    }
                }
                break;
            }
        }
        finally {
            ((RoomDatabase)this.p).m();
        }
    }
    
    public static final class a
    {
        public Context a;
        public k6.a b;
        public n6.a c;
        public androidx.work.a d;
        public WorkDatabase e;
        public String f;
        public List<d> g;
        public WorkerParameters$a h;
        
        public a(final Context context, final androidx.work.a d, final n6.a c, final k6.a b, final WorkDatabase e, final String f) {
            this.h = new WorkerParameters$a();
            this.a = context.getApplicationContext();
            this.c = c;
            this.b = b;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
}
