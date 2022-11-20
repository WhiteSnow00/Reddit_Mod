// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import androidx.work.impl.utils.futures.AbstractFuture;
import android.database.Cursor;
import androidx.room.RoomDatabase;
import b6.g;
import java.util.concurrent.Executor;
import l6.s;
import androidx.work.WorkerParameters;
import l6.u;
import java.util.UUID;
import k6.w;
import l6.h;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import i5.k;
import k6.p;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import androidx.work.ListenableWorker$a$b;
import androidx.work.WorkInfo$State;
import k6.t;
import androidx.work.ListenableWorker$a$c;
import androidx.work.ListenableWorker$a$a;
import b6.j;
import xg.c;
import java.util.ArrayList;
import k6.v;
import k6.b;
import k6.r;
import androidx.work.impl.WorkDatabase;
import androidx.work.ListenableWorker$a;
import m6.a;
import androidx.work.ListenableWorker;
import k6.q;
import androidx.work.WorkerParameters$a;
import java.util.List;
import android.content.Context;

public final class n implements Runnable
{
    public static final String y;
    public Context f;
    public String g;
    public List<e> h;
    public WorkerParameters$a i;
    public q j;
    public ListenableWorker k;
    public m6.a l;
    public ListenableWorker$a m;
    public androidx.work.a n;
    public j6.a o;
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
        y = j.e("WorkerWrapper");
    }
    
    public n(final a a) {
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
            b6.j.c().d(c6.n.y, String.format("Worker result SUCCESS for %s", this.u), new Throwable[0]);
            if (this.j.c()) {
                this.e();
                return;
            }
            ((RoomDatabase)this.p).c();
            try {
                ((t)this.q).s(WorkInfo$State.SUCCEEDED, this.g);
                ((t)this.q).q(this.g, ((ListenableWorker$a$c)this.m).a);
                final long currentTimeMillis = System.currentTimeMillis();
                for (final String s : ((k6.c)this.r).a(this.g)) {
                    if (((t)this.q).h(s) == WorkInfo$State.BLOCKED && ((k6.c)this.r).b(s)) {
                        b6.j.c().d(c6.n.y, String.format("Setting status to enqueued for %s", s), new Throwable[0]);
                        ((t)this.q).s(WorkInfo$State.ENQUEUED, s);
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
            b6.j.c().d(c6.n.y, String.format("Worker result RETRY for %s", this.u), new Throwable[0]);
            this.d();
        }
        else {
            b6.j.c().d(c6.n.y, String.format("Worker result FAILURE for %s", this.u), new Throwable[0]);
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
                ((t)this.q).s(WorkInfo$State.FAILED, s);
            }
            list.addAll(((k6.c)this.r).a(s));
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
        final List<e> h2 = this.h;
        if (h2 != null) {
            final Iterator<e> iterator = h2.iterator();
            while (iterator.hasNext()) {
                iterator.next().cancel(this.g);
            }
            c6.f.a(this.n, this.p, this.h);
        }
    }
    
    public final void d() {
        ((RoomDatabase)this.p).c();
        try {
            ((t)this.q).s(WorkInfo$State.ENQUEUED, this.g);
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
            ((t)this.q).s(WorkInfo$State.ENQUEUED, this.g);
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
            Object o = i5.k.d(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            t.a.b();
            Object o2 = k5.c.b(t.a, (k)o, false);
            try {
                final boolean b2 = ((Cursor)o2).moveToFirst() && ((Cursor)o2).getInt(0) != 0;
                ((Cursor)o2).close();
                ((k)o).h();
                if (!b2) {
                    l6.h.a(this.f, (Class)RescheduleReceiver.class, false);
                }
                if (b) {
                    final r q = this.q;
                    o = WorkInfo$State.ENQUEUED;
                    o2 = this.g;
                    ((t)q).s((WorkInfo$State)o, (String)o2);
                    o = this.q;
                    ((t)o).n(-1L, this.g);
                }
                if (this.j != null) {
                    o = this.k;
                    if (o != null && ((ListenableWorker)o).isRunInForeground()) {
                        o = this.o;
                        final String g = this.g;
                        o2 = o;
                        synchronized (((d)o2).p) {
                            ((d)o2).k.remove(g);
                            ((d)o2).g();
                        }
                    }
                }
                ((RoomDatabase)this.p).q();
                ((RoomDatabase)this.p).m();
                this.v.i((Object)b);
            }
            finally {
                ((Cursor)o2).close();
                ((k)o).h();
            }
        }
        finally {
            ((RoomDatabase)this.p).m();
        }
    }
    
    public final void g() {
        final WorkInfo$State h = ((t)this.q).h(this.g);
        if (h == WorkInfo$State.RUNNING) {
            b6.j.c().a(c6.n.y, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.g), new Throwable[0]);
            this.f(true);
        }
        else {
            b6.j.c().a(c6.n.y, String.format("Status for %s is %s; not doing any work", this.g, h), new Throwable[0]);
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
            b6.j.c().a(c6.n.y, String.format("Work interrupted for %s", this.u), new Throwable[0]);
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
        final ArrayList a = ((w)this.s).a(this.g);
        this.t = a;
        final StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.g);
        sb.append(", tags={ ");
        final Iterator iterator = a.iterator();
        final int n = 1;
        int n2 = 1;
        while (iterator.hasNext()) {
            final Object j = iterator.next();
            if (n2 != 0) {
                n2 = 0;
            }
            else {
                sb.append(", ");
            }
            sb.append((String)j);
        }
        sb.append(" } ]");
        this.u = sb.toString();
        if (this.i()) {
            return;
        }
        ((RoomDatabase)this.p).c();
        try {
            Object j = ((t)this.q).k(this.g);
            this.j = (q)j;
            WorkInfo$State b;
            WorkInfo$State enqueued;
            q i;
            long currentTimeMillis;
            q k;
            androidx.work.b e;
            g d;
            String a2;
            b6.f f = null;
            ArrayList list = null;
            r q;
            String g;
            t t = null;
            Object o;
            ArrayList list2;
            WorkerParameters workerParameters;
            UUID fromString;
            ArrayList t2;
            int l;
            r q2;
            WorkInfo$State running;
            r q3;
            int n3;
            androidx.work.impl.utils.futures.a a3;
            s s;
            androidx.work.impl.utils.futures.a f2;
            ListenableWorker m;
            Block_23_Outer:Block_24_Outer:
            while (true) {
                Label_0782: {
                    Label_0682: {
                        Label_0433: {
                            if (j == null) {
                                b6.j.c().b(c6.n.y, String.format("Didn't find WorkSpec for id %s", this.g), new Throwable[0]);
                                this.f(false);
                                ((RoomDatabase)this.p).q();
                            }
                            else {
                                b = ((q)j).b;
                                enqueued = WorkInfo$State.ENQUEUED;
                                if (b != enqueued) {
                                    this.g();
                                    ((RoomDatabase)this.p).q();
                                    b6.j.c().a(c6.n.y, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.j.c), new Throwable[0]);
                                }
                                else {
                                    Label_0443: {
                                        if (!((q)j).c()) {
                                            i = this.j;
                                            if (i.b != enqueued || i.k <= 0) {
                                                break Label_0443;
                                            }
                                        }
                                        currentTimeMillis = System.currentTimeMillis();
                                        k = this.j;
                                        if (k.n != 0L && currentTimeMillis < k.a()) {
                                            b6.j.c().a(c6.n.y, String.format("Delaying execution for %s because it is being executed before schedule.", this.j.c), new Throwable[0]);
                                            this.f(true);
                                            ((RoomDatabase)this.p).q();
                                            break Label_0433;
                                        }
                                    }
                                    ((RoomDatabase)this.p).q();
                                    ((RoomDatabase)this.p).m();
                                    if (this.j.c()) {
                                        e = this.j.e;
                                        break Label_0476;
                                    }
                                    d = this.n.d;
                                    j = this.j.d;
                                    d.getClass();
                                    a2 = b6.f.a;
                                    f = null;
                                    try {
                                        f = (b6.f)Class.forName((String)j).newInstance();
                                    }
                                    catch (final Exception ex) {
                                        b6.j.c().b(b6.f.a, b.l("Trouble instantiating + ", (String)j), new Throwable[] { ex });
                                    }
                                    if (f == null) {
                                        b6.j.c().b(c6.n.y, String.format("Could not create Input Merger %s", this.j.d), new Throwable[0]);
                                        this.h();
                                        return;
                                    }
                                    list = new ArrayList();
                                    list.add(this.j.e);
                                    q = this.q;
                                    g = this.g;
                                    t = (t)q;
                                    t.getClass();
                                    j = i5.k.d(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                                    if (g == null) {
                                        ((k)j).bindNull(1);
                                        break Label_0682;
                                    }
                                    ((k)j).bindString(1, g);
                                    break Label_0682;
                                }
                            }
                        }
                        ((RoomDatabase)this.p).m();
                        return;
                        break Label_0782;
                    }
                    t.a.b();
                    o = k5.c.b(t.a, (k)j, false);
                    try {
                        list2 = new ArrayList<androidx.work.b>(((Cursor)o).getCount());
                        while (((Cursor)o).moveToNext()) {
                            list2.add(androidx.work.b.a(((Cursor)o).getBlob(0)));
                        }
                        ((Cursor)o).close();
                        ((k)j).h();
                        list.addAll(list2);
                        f.a((ArrayList)list);
                        continue Block_23_Outer;
                        while (true) {
                            Label_0917: {
                                while (true) {
                                    this.k = this.n.c.b(this.f, this.j.c, workerParameters);
                                    break Label_0917;
                                    b6.j.c().b(c6.n.y, String.format("Could not create Worker %s", this.j.c), new Throwable[0]);
                                    this.h();
                                    return;
                                    fromString = UUID.fromString(this.g);
                                    t2 = this.t;
                                    j = this.i;
                                    l = this.j.k;
                                    o = this.n;
                                    workerParameters = new WorkerParameters(fromString, e, (List)t2, (WorkerParameters$a)j, l, ((androidx.work.a)o).a, this.l, ((androidx.work.a)o).c, new l6.w(this.p, this.l), new u(this.p, this.o, this.l));
                                    iftrue(Label_0917:)(this.k != null);
                                    continue Block_24_Outer;
                                }
                                Label_1016: {
                                    this.k.setUsed();
                                }
                                ((RoomDatabase)this.p).c();
                                try {
                                    q2 = this.q;
                                    j = this.g;
                                    if (((t)q2).h((String)j) == WorkInfo$State.ENQUEUED) {
                                        j = this.q;
                                        running = WorkInfo$State.RUNNING;
                                        o = this.g;
                                        ((t)j).s(running, (String)o);
                                        q3 = this.q;
                                        j = this.g;
                                        ((t)q3).m((String)j);
                                        n3 = n;
                                    }
                                    else {
                                        n3 = 0;
                                    }
                                    ((RoomDatabase)this.p).q();
                                    ((RoomDatabase)this.p).m();
                                    if (n3 != 0) {
                                        if (!this.i()) {
                                            a3 = new androidx.work.impl.utils.futures.a();
                                            s = new s(this.f, this.j, this.k, workerParameters.j, this.l);
                                            ((m6.b)this.l).c.execute((Runnable)s);
                                            f2 = s.f;
                                            ((AbstractFuture)f2).a((Runnable)new l(this, f2, a3), (Executor)((m6.b)this.l).c);
                                            ((AbstractFuture)a3).a((Runnable)new m(this, a3, this.u), (Executor)((m6.b)this.l).a);
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
                            }
                            m = this.k;
                            iftrue(Label_0968:)(m != null);
                            continue;
                        }
                        Label_0968: {
                            iftrue(Label_1016:)(!m.isUsed());
                        }
                        b6.j.c().b(c6.n.y, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.j.c), new Throwable[0]);
                        this.h();
                    }
                    finally {
                        ((Cursor)o).close();
                        ((k)j).h();
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
        public j6.a b;
        public m6.a c;
        public androidx.work.a d;
        public WorkDatabase e;
        public String f;
        public List<e> g;
        public WorkerParameters$a h;
        
        public a(final Context context, final androidx.work.a d, final m6.a c, final j6.a b, final WorkDatabase e, final String f) {
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
