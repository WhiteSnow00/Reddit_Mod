// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.database.Cursor;
import android.content.ContentResolver;
import android.os.BaseBundle;
import rh2.s;
import hi2.h;
import java.io.Serializable;
import android.net.Uri;
import dg.n0;
import android.database.ContentObserver;
import je.d4;
import java.util.HashMap;
import je.e4;
import je.l4;
import dg.b1;
import java.util.concurrent.Executor;
import md.v;
import android.os.Bundle;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import sh.k;
import java.util.Iterator;
import sh.c;
import java.util.ArrayList;
import com.google.firebase.database.snapshot.f;
import java.util.List;
import java.util.Collections;
import qh.i;
import qh.g0;
import com.google.firebase.database.snapshot.Node;
import java.util.Map;
import i6.g;
import je.o;
import lh2.d$a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import android.content.res.Resources;
import java.util.concurrent.ScheduledExecutorService;
import ng2.e;
import java.util.concurrent.Executors;
import java.lang.ref.ReferenceQueue;
import a1.d;
import java.lang.ref.Reference;
import dg.p0;
import hg.m0;
import je.a0;
import we.a;

public final class p1 implements a, a0, m0, p0
{
    public final int f;
    public final Object g;
    public Object h;
    
    public p1(final int f) {
        this.f = f;
        if (f != 1) {
            this.g = new d((Object[])new Reference[16]);
            this.h = new ReferenceQueue();
            return;
        }
        final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        e.b((Object)singleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.g = singleThreadScheduledExecutor;
    }
    
    public p1(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public p1(final Resources resources, final String s) {
        this(this.f = 5, resources, s);
    }
    
    public p1(final String g, final String h) {
        this.f = 9;
        this.g = g;
        this.h = h;
    }
    
    public p1(final LazyJavaPackageFragmentProvider g) {
        final d$a a = lh2.d.a;
        this.f = 10;
        this.g = g;
        this.h = a;
    }
    
    public final g a(final o o) {
        final g b = ((g)this.g).b();
        final String s = (String)this.h;
        b.f(s, o);
        ((Map)b.d).put(s, Boolean.TRUE);
        return b;
    }
    
    public final Node b(final wh.a a, final uh.a a2) {
        final g0 g0 = (g0)this.h;
        final i i = (i)this.g;
        g0.getClass();
        final i d = i.d(a);
        final Node j = g0.a.i(d);
        Node d2;
        if (j != null) {
            d2 = j;
        }
        else if (a2.a(a)) {
            d2 = g0.a.f(d).d(a2.a.f.R0(a));
        }
        else {
            d2 = null;
        }
        return d2;
    }
    
    public final Node c(final Node node) {
        return ((g0)this.h).a((i)this.g, node, (List)Collections.emptyList(), false);
    }
    
    public final Node d(Node l0) {
        final g0 g0 = (g0)this.h;
        final i i = (i)this.g;
        g0.getClass();
        Object o = com.google.firebase.database.snapshot.f.j;
        final Node j = g0.a.i(i);
        Node node;
        if (j != null) {
            node = (Node)o;
            if (!j.a0()) {
                final Iterator iterator = ((Iterable)j).iterator();
                while (true) {
                    node = (Node)o;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final wh.e e = (wh.e)iterator.next();
                    o = ((Node)o).L0(e.a, e.b);
                }
            }
        }
        else {
            final qh.d f = g0.a.f(i);
            final Iterator<Object> iterator2 = ((Iterable<Object>)l0).iterator();
            l0 = (Node)o;
            while (iterator2.hasNext()) {
                final wh.e e2 = iterator2.next();
                l0 = l0.L0(e2.a, f.f(new i(new wh.a[] { e2.a })).d(e2.b));
            }
            final ArrayList<wh.e> list = new ArrayList<wh.e>();
            final c f2 = f.f;
            final Object f3 = f2.f;
            if (f3 != null) {
                for (final wh.e e3 : (Node)f3) {
                    list.add(new wh.e(e3.a, e3.b));
                }
            }
            else {
                for (final Map.Entry entry : f2.g) {
                    final c c = (c)entry.getValue();
                    if (c.f != null) {
                        list.add(new wh.e((wh.a)entry.getKey(), (Node)c.f));
                    }
                }
            }
            final Iterator<wh.e> iterator5 = list.iterator();
            Node l2 = l0;
            while (true) {
                node = l2;
                if (!iterator5.hasNext()) {
                    break;
                }
                final wh.e e4 = iterator5.next();
                l2 = l2.L0(e4.a, e4.b);
            }
        }
        return node;
    }
    
    public final Node e(final i i, final Node node, final Node node2) {
        final g0 g0 = (g0)this.h;
        final i j = (i)this.g;
        g0.getClass();
        boolean b = false;
        k.b("Either existingEventSnap or existingServerSnap must exist", node != null || node2 != null);
        final i c = j.c(i);
        if (g0.a.i(c) != null) {
            b = true;
        }
        Node node3;
        if (b) {
            node3 = null;
        }
        else {
            final qh.d f = g0.a.f(c);
            if (f.f.isEmpty()) {
                node3 = node2.D0(i);
            }
            else {
                node3 = f.d(node2.D0(i));
            }
        }
        return node3;
    }
    
    public final ch2.c f(final rh2.g g) {
        final yh2.c d = g.d();
        ch2.c v = null;
        final ch2.c c = null;
        if (d != null) {
            g.x();
            if (LightClassOriginKind.SOURCE == null) {
                ((d$a)this.h).getClass();
                return null;
            }
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a b = g.B();
        if (b != null) {
            final ch2.c f = this.f((rh2.g)b);
            Object g2;
            if (f != null) {
                g2 = f.G();
            }
            else {
                g2 = null;
            }
            Object e;
            if (g2 != null) {
                e = ((h)g2).e(((s)g).getName(), NoLookupLocation.FROM_JAVA_LOADER);
            }
            else {
                e = null;
            }
            ch2.c c2 = c;
            if (e instanceof ch2.c) {
                c2 = (ch2.c)e;
            }
            return c2;
        }
        if (d == null) {
            return null;
        }
        final LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = (LazyJavaPackageFragmentProvider)this.g;
        final yh2.c e2 = d.e();
        e.e((Object)e2, "fqName.parent()");
        final LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment)CollectionsKt___CollectionsKt.U4(lazyJavaPackageFragmentProvider.a(e2));
        if (lazyJavaPackageFragment != null) {
            final LazyJavaPackageScope d2 = lazyJavaPackageFragment.o.d;
            d2.getClass();
            v = d2.v(((s)g).getName(), g);
        }
        return v;
    }
    
    public final Node g(i c) {
        final g0 g0 = (g0)this.h;
        c = ((i)this.g).c(c);
        return g0.a.i(c);
    }
    
    public final Object then(we.g o) {
        final md.c c = (md.c)this.g;
        final Bundle bundle = (Bundle)this.h;
        c.getClass();
        if (o.n()) {
            final Bundle bundle2 = (Bundle)o.j();
            if (bundle2 != null && ((BaseBundle)bundle2).containsKey("google.messenger")) {
                o = c.b(bundle).o((Executor)v.f, (we.f)i10.a.H);
            }
        }
        return o;
    }
    
    public final Object zza() {
        switch (this.f) {
            case 6: {
                return new com.google.android.play.core.assetpacks.c(((dg.p1)this.g).a(), (b1)((m0)this.h).zza());
            }
            case 4: {
                final l4 l4 = (l4)this.g;
                final String s = (String)this.h;
                Object o = l4.a.getContentResolver();
                final Uri a = e4.a;
                synchronized (e4.class) {
                    final HashMap e = e4.e;
                    final Serializable s2 = null;
                    final Serializable s3 = null;
                    Serializable s4 = null;
                    if (e == null) {
                        e4.d.set(false);
                        e4.e = new HashMap();
                        e4.j = new Object();
                        ((ContentResolver)o).registerContentObserver(e4.a, true, (ContentObserver)new d4(0));
                    }
                    else if (e4.d.getAndSet(false)) {
                        e4.e.clear();
                        e4.f.clear();
                        e4.g.clear();
                        e4.h.clear();
                        e4.i.clear();
                        e4.j = new Object();
                    }
                    final Object j = e4.j;
                    if (e4.e.containsKey(s)) {
                        final String s5 = e4.e.get(s);
                        if (s5 != null) {
                            s4 = s5;
                        }
                        monitorexit(e4.class);
                        return s4;
                    }
                    final int length = e4.k.length;
                    monitorexit(e4.class);
                    o = ((ContentResolver)o).query(e4.a, (String[])null, (String)null, new String[] { s }, (String)null);
                    if (o == null) {
                        s4 = s3;
                        return s4;
                    }
                    try {
                        if (!((Cursor)o).moveToFirst()) {
                            synchronized (e4.class) {
                                if (j == e4.j) {
                                    e4.e.put(s, null);
                                }
                                monitorexit(e4.class);
                                return s4;
                            }
                        }
                        final String string = ((Cursor)o).getString(1);
                        if ((s4 = string) != null) {
                            s4 = string;
                            if (string.equals(null)) {
                                s4 = null;
                            }
                        }
                        synchronized (e4.class) {
                            if (j == e4.j) {
                                e4.e.put(s, s4);
                            }
                            monitorexit(e4.class);
                            if (s4 == null) {
                                s4 = s2;
                            }
                            return s4;
                        }
                    }
                    finally {
                        ((Cursor)o).close();
                    }
                }
                break;
            }
        }
        final com.google.android.play.core.assetpacks.i i = (com.google.android.play.core.assetpacks.i)this.g;
        final List list = (List)this.h;
        i.getClass();
        final HashMap hashMap = new HashMap();
        for (final n0 n0 : i.e.values()) {
            final String a2 = n0.c.a;
            if (list.contains(a2)) {
                final n0 n2 = hashMap.get(a2);
                int a3;
                if (n2 == null) {
                    a3 = -1;
                }
                else {
                    a3 = n2.a;
                }
                if (a3 >= n0.a) {
                    continue;
                }
                hashMap.put(a2, n0);
            }
        }
        return hashMap;
    }
}
