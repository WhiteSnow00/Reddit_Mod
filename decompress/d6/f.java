// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import java.util.Collections;
import androidx.work.WorkInfo;
import o.a;
import j5.p;
import androidx.lifecycle.y;
import androidx.lifecycle.LiveData;
import m6.g;
import l6.q;
import java.util.concurrent.Callable;
import l6.s;
import j5.o;
import a4.u1;
import l6.t;
import androidx.lifecycle.v;
import android.text.TextUtils;
import m6.e;
import c6.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collection;
import c6.h;
import java.util.ArrayList;
import java.util.List;
import androidx.work.ExistingWorkPolicy;
import c6.k;

public final class f extends k
{
    public static final String j;
    public final j a;
    public final String b;
    public final ExistingWorkPolicy c;
    public final List<? extends androidx.work.f> d;
    public final ArrayList e;
    public final ArrayList f;
    public final List<f> g;
    public boolean h;
    public b i;
    
    static {
        j = h.e("WorkContinuationImpl");
    }
    
    public f() {
        throw null;
    }
    
    public f(final j j, final String s, final ExistingWorkPolicy existingWorkPolicy, final List<? extends androidx.work.f> list) {
        this(j, s, existingWorkPolicy, list, null);
    }
    
    public f(final j a, final String b, final ExistingWorkPolicy c, final List<? extends androidx.work.f> d, final List<f> g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = new ArrayList(d.size());
        this.f = new ArrayList();
        if (g != null) {
            final Iterator<f> iterator = g.iterator();
            while (iterator.hasNext()) {
                this.f.addAll(iterator.next().f);
            }
        }
        for (int i = 0; i < d.size(); ++i) {
            final String string = d.get(i).a.toString();
            this.e.add(string);
            this.f.add(string);
        }
    }
    
    public static boolean e(final f f, final HashSet set) {
        set.addAll(f.e);
        final HashSet f2 = f(f);
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if (f2.contains(iterator.next())) {
                return true;
            }
        }
        final List<f> g = f.g;
        if (g != null && !g.isEmpty()) {
            final Iterator iterator2 = g.iterator();
            while (iterator2.hasNext()) {
                if (e((f)iterator2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(f.e);
        return false;
    }
    
    public static HashSet f(final f f) {
        final HashSet set = new HashSet();
        final List<f> g = f.g;
        if (g != null && !g.isEmpty()) {
            final Iterator iterator = g.iterator();
            while (iterator.hasNext()) {
                set.addAll(((f)iterator.next()).e);
            }
        }
        return set;
    }
    
    public final i a() {
        if (!this.h) {
            final e e = new e(this);
            ((n6.b)this.a.d).a((Runnable)e);
            this.i = e.g;
        }
        else {
            c6.h.c().f(d6.f.j, String.format("Already enqueued work ids (%s)", TextUtils.join((CharSequence)", ", (Iterable)this.e)), new Throwable[0]);
        }
        return (i)this.i;
    }
    
    public final v b() {
        final j a = this.a;
        final ArrayList f = this.f;
        final t t = (t)a.c.x();
        t.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        final int size = f.size();
        u1.v(size, sb);
        sb.append(")");
        final o a2 = o.a(size + 0, sb.toString());
        final Iterator iterator = f.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (s == null) {
                a2.bindNull(n);
            }
            else {
                a2.bindString(n, s);
            }
            ++n;
        }
        final p b = t.a.e.b(new String[] { "WorkTag", "WorkProgress", "workspec" }, true, (Callable)new s(t, a2));
        final a<List<q.c>, List<WorkInfo>> t2 = (a<List<q.c>, List<WorkInfo>>)q.t;
        final n6.a d = a.d;
        final Object o = new Object();
        final v v = new v();
        v.l((LiveData)b, (y)new g(d, o, t2, v));
        return v;
    }
    
    public final f d(final List list) {
        if (list.isEmpty()) {
            return this;
        }
        return new f(this.a, this.b, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }
}
