// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import u8.p;
import com.bumptech.glide.load.DataSource;
import java.util.Iterator;
import z0.c1;
import com.bumptech.glide.Registry;
import o8.j;
import java.util.Collections;
import java.util.ArrayList;
import j0.b;
import java.util.concurrent.atomic.AtomicReference;
import k9.i;
import q8.m;
import u8.n$a;
import java.io.File;
import u8.n;
import java.util.List;
import com.bumptech.glide.load.data.d;

public final class h implements c, d.a<Object>
{
    public final c.a f;
    public final com.bumptech.glide.load.engine.d<?> g;
    public int h;
    public int i;
    public o8.d j;
    public List<n<File, ?>> k;
    public int l;
    public volatile n$a<?> m;
    public File n;
    public m o;
    
    public h(final com.bumptech.glide.load.engine.d<?> g, final c.a f) {
        this.i = -1;
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final boolean b() {
        final ArrayList a = this.g.a();
        if (a.isEmpty()) {
            return false;
        }
        final com.bumptech.glide.load.engine.d<?> g = this.g;
        final Registry b = g.c.b;
        final Class<?> class1 = g.d.getClass();
        final Class<?> g2 = g.g;
        final Class<?> k = g.k;
        final c1 h = b.h;
        i i = ((AtomicReference)h.g).getAndSet(null);
        if (i == null) {
            i = new i((Class)class1, (Class)g2, (Class)k);
        }
        else {
            i.a = class1;
            i.b = g2;
            i.c = k;
        }
        Object o = h.h;
        synchronized (o) {
            final List list = (List)((b)h.h).getOrDefault((Object)i, (Object)null);
            monitorexit(o);
            ((AtomicReference)h.g).set(i);
            final List list2 = list;
            if (list == null) {
                final ArrayList list3 = new ArrayList();
                Object o2 = b.a;
                synchronized (o2) {
                    final ArrayList d = ((p)o2).a.d((Class)class1);
                    monitorexit(o2);
                    o2 = d.iterator();
                    while (((Iterator)o2).hasNext()) {
                        final Iterator iterator = b.c.b((Class)((Iterator)o2).next(), (Class)g2).iterator();
                        while (iterator.hasNext()) {
                            o = iterator.next();
                            if (!b.f.a((Class)o, k).isEmpty() && !list3.contains(o)) {
                                list3.add(o);
                            }
                        }
                    }
                    final c1 h2 = b.h;
                    final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list3);
                    synchronized ((b)h2.h) {
                        final b b2 = (b)h2.h;
                        o = new i((Class)class1, (Class)g2, (Class)k);
                        b2.put(o, (Object)unmodifiableList);
                    }
                }
            }
            if (list2.isEmpty()) {
                if (File.class.equals(this.g.k)) {
                    return false;
                }
                final StringBuilder r = a.r("Failed to find any load path from ");
                r.append(this.g.d.getClass());
                r.append(" to ");
                r.append(this.g.k);
                throw new IllegalStateException(r.toString());
            }
            else {
                while (true) {
                    final List<n<File, ?>> j = this.k;
                    if (j != null && this.l < j.size()) {
                        this.m = null;
                        boolean b3;
                        for (b3 = false; !b3 && this.l < this.k.size(); b3 = true) {
                            final n n = this.k.get(this.l++);
                            final File n2 = this.n;
                            final com.bumptech.glide.load.engine.d<?> g3 = this.g;
                            this.m = (n$a<?>)n.buildLoadData((Object)n2, g3.e, g3.f, g3.i);
                            if (this.m != null && this.g.c(this.m.c.a()) != null) {
                                this.m.c.d(this.g.o, (d.a)this);
                            }
                        }
                        return b3;
                    }
                    if (++this.i >= list2.size()) {
                        if (++this.h >= a.size()) {
                            return false;
                        }
                        this.i = 0;
                    }
                    final o8.d l = (o8.d)a.get(this.h);
                    final Class clazz = list2.get(this.i);
                    final j<Object> e = this.g.e((Class<Object>)clazz);
                    final com.bumptech.glide.load.engine.d<?> g4 = this.g;
                    this.o = new m(g4.c.a, l, g4.n, g4.e, g4.f, (j)e, (Class)clazz, g4.i);
                    final File e2 = ((e.c)g4.h).a().e((o8.d)this.o);
                    if ((this.n = e2) == null) {
                        continue;
                    }
                    this.j = l;
                    this.k = this.g.c.b.e(e2);
                    this.l = 0;
                }
            }
        }
    }
    
    @Override
    public final void cancel() {
        final n$a<?> m = this.m;
        if (m != null) {
            m.c.cancel();
        }
    }
    
    @Override
    public final void e(final Object o) {
        this.f.a(this.j, o, this.m.c, DataSource.RESOURCE_DISK_CACHE, (o8.d)this.o);
    }
    
    @Override
    public final void f(final Exception ex) {
        this.f.d((o8.d)this.o, ex, this.m.c, DataSource.RESOURCE_DISK_CACHE);
    }
}
