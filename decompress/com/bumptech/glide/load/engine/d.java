// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry$NoSourceEncoderAvailableException;
import f9.a$a;
import o8.a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import com.bumptech.glide.Registry;
import c9.c;
import f9.c$a;
import o8.h;
import q8.e;
import f9.b;
import k9.i;
import java.util.List;
import u8.n;
import u8.n$a;
import com.bumptech.glide.Priority;
import o8.j;
import java.util.Map;
import o8.g;
import com.bumptech.glide.f;
import java.util.ArrayList;

public final class d<Transcode>
{
    public final ArrayList a;
    public final ArrayList b;
    public f c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public DecodeJob.e h;
    public g i;
    public Map<Class<?>, j<?>> j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public o8.d n;
    public Priority o;
    public q8.f p;
    public boolean q;
    public boolean r;
    
    public d() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    public final ArrayList a() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            final ArrayList b = this.b();
            for (int size = b.size(), i = 0; i < size; ++i) {
                final n$a n$a = (n$a)b.get(i);
                if (!this.b.contains(n$a.a)) {
                    this.b.add(n$a.a);
                }
                for (int j = 0; j < n$a.b.size(); ++j) {
                    if (!this.b.contains(n$a.b.get(j))) {
                        this.b.add(n$a.b.get(j));
                    }
                }
            }
        }
        return this.b;
    }
    
    public final ArrayList b() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            final List<u8.n<Object, ?>> e = this.c.b.e(this.d);
            for (int i = 0; i < e.size(); ++i) {
                final n$a buildLoadData = e.get(i).buildLoadData(this.d, this.e, this.f, this.i);
                if (buildLoadData != null) {
                    this.a.add(buildLoadData);
                }
            }
        }
        return this.a;
    }
    
    public final <Data> q8.j<Data, ?, Transcode> c(final Class<Data> a) {
        final Registry b = this.c.b;
        final Class<?> g = this.g;
        final Class<Transcode> k = this.k;
        final b i = b.i;
        final AtomicReference b2 = i.b;
        final q8.j<Data, ?, Transcode> j = null;
        i l;
        if ((l = b2.getAndSet(null)) == null) {
            l = new i();
        }
        l.a = a;
        l.b = g;
        l.c = k;
        Object o = i.a;
        synchronized (o) {
            final q8.j m = (q8.j)i.a.getOrDefault((Object)l, (Object)null);
            monitorexit(o);
            i.b.set(l);
            b.i.getClass();
            q8.j j2;
            if (f9.b.c.equals(m)) {
                j2 = j;
            }
            else {
                if (m == null) {
                    final ArrayList<e> list = new ArrayList<e>();
                    o = b.c.b((Class)a, (Class)g).iterator();
                Label_0606:
                    while (((Iterator)o).hasNext()) {
                        final Class clazz = (Class)((Iterator)o).next();
                        for (Class clazz2 : b.f.a(clazz, k)) {
                            Object o2 = b.c;
                            synchronized (o2) {
                                final ArrayList<h> list2 = new ArrayList<h>();
                                final Iterator iterator2 = ((f9.c)o2).a.iterator();
                                while (iterator2.hasNext()) {
                                    final List list3 = ((f9.c)o2).b.get(iterator2.next());
                                    if (list3 == null) {
                                        continue;
                                    }
                                    for (final c$a c$a : list3) {
                                        if (c$a.a.isAssignableFrom(a) && clazz.isAssignableFrom(c$a.b)) {
                                            list2.add(c$a.c);
                                        }
                                    }
                                }
                                monitorexit(o2);
                                final c f = b.f;
                                synchronized (f) {
                                    Label_0424: {
                                        if (!clazz2.isAssignableFrom(clazz)) {
                                            final Iterator iterator4 = f.a.iterator();
                                            while (iterator4.hasNext()) {
                                                o2 = iterator4.next();
                                                if (((c.a)o2).a.isAssignableFrom(clazz) && clazz2.isAssignableFrom(((c.a)o2).b)) {
                                                    o2 = ((c.a)o2).c;
                                                    monitorexit(f);
                                                    break Label_0424;
                                                }
                                            }
                                            o2 = new(java.lang.IllegalArgumentException.class)();
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("No transcoder registered to transcode from ");
                                            sb.append(clazz);
                                            sb.append(" to ");
                                            sb.append(clazz2);
                                            new IllegalArgumentException(sb.toString());
                                            throw o2;
                                        }
                                        o2 = a92.b.i;
                                        monitorexit(f);
                                    }
                                    list.add(new e((Class)a, (Class)clazz, (Class)clazz2, (List)list2, (c9.b)o2, b.j));
                                }
                            }
                            break Label_0606;
                        }
                    }
                    if (list.isEmpty()) {
                        j2 = null;
                    }
                    else {
                        j2 = new q8.j((Class)a, (Class)g, (Class)k, (List)list, b.j);
                    }
                    final b i2 = b.i;
                    synchronized (i2.a) {
                        final j0.b a2 = i2.a;
                        final i i3 = new i((Class)a, (Class)g, (Class)k);
                        q8.j c;
                        if (j2 != null) {
                            c = j2;
                        }
                        else {
                            c = f9.b.c;
                        }
                        a2.put((Object)i3, (Object)c);
                        return (q8.j<Data, ?, Transcode>)j2;
                    }
                }
                j2 = m;
            }
            return (q8.j<Data, ?, Transcode>)j2;
        }
    }
    
    public final <X> a<X> d(final X x) throws Registry$NoSourceEncoderAvailableException {
        final f9.a b = this.c.b.b;
        final Class<?> class1 = x.getClass();
        synchronized (b) {
            while (true) {
                for (a$a a$a : b.a) {
                    if (a$a.a.isAssignableFrom(class1)) {
                        final a b2 = a$a.b;
                        monitorexit(b);
                        if (b2 != null) {
                            return b2;
                        }
                        throw new Registry$NoSourceEncoderAvailableException((Class)x.getClass());
                    }
                }
                final a b2 = null;
                monitorexit(b);
                continue;
            }
        }
    }
    
    public final <Z> j<Z> e(final Class<Z> clazz) {
        j i;
        final j j = i = this.j.get(clazz);
        Label_0085: {
            if (j == null) {
                final Iterator<Map.Entry<Class<?>, j<?>>> iterator = this.j.entrySet().iterator();
                Map.Entry<Class, V> entry;
                do {
                    i = j;
                    if (!iterator.hasNext()) {
                        break Label_0085;
                    }
                    entry = iterator.next();
                } while (!entry.getKey().isAssignableFrom(clazz));
                i = (j)entry.getValue();
            }
        }
        if (i != null) {
            return i;
        }
        if (this.j.isEmpty() && this.q) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Missing transformation for ");
            sb.append(clazz);
            sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
            throw new IllegalArgumentException(sb.toString());
        }
        return (j<Z>)w8.d.a;
    }
}
