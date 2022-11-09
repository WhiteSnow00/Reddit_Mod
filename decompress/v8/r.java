// 
// Decompiled by Procyon v0.6.0
// 

package v8;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.Iterator;
import ng.f0;
import m9.a;
import java.util.List;
import z3.e;
import java.util.HashSet;
import java.util.ArrayList;

public final class r
{
    public static final c e;
    public static final r.r$a f;
    public final ArrayList a;
    public final c b;
    public final HashSet c;
    public final e<List<Throwable>> d;
    
    static {
        e = new c();
        f = new r.r$a();
    }
    
    public r(final a.c d) {
        final c e = r.e;
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = d;
        this.b = e;
    }
    
    public final ArrayList a(final Class clazz) {
        monitorenter(this);
        Label_0117: {
            try {
                final ArrayList<n> list = new ArrayList<n>();
                for (final b b : this.a) {
                    if (this.c.contains(b)) {
                        continue;
                    }
                    if (!b.a.isAssignableFrom(clazz)) {
                        continue;
                    }
                    this.c.add(b);
                    final n<? extends Model, ? extends Data> build = b.c.build(this);
                    f0.a2(build);
                    list.add(build);
                    this.c.remove(b);
                }
                break Label_0117;
            }
            finally {
                try {
                    this.c.clear();
                }
                finally {
                    monitorexit(this);
                }
                monitorexit(this);
                return;
            }
        }
    }
    
    public final <Model, Data> n<Model, Data> b(final Class<Model> clazz, final Class<Data> clazz2) {
        monitorenter(this);
        ArrayList<n> list;
        Iterator iterator;
        boolean b;
        b b2 = null;
        boolean b3;
        c b4;
        e<List<Throwable>> d;
        q q;
        n n;
        r.r$a f;
        Block_8_Outer:Block_9_Outer:Block_11_Outer:
        while (true) {
            Label_0096: {
                try {
                    list = new ArrayList<n>();
                    iterator = this.a.iterator();
                    b = false;
                    Label_0062: {
                        while (iterator.hasNext()) {
                            b2 = (b)iterator.next();
                            if (!this.c.contains(b2)) {
                                break Label_0062;
                            }
                            b = true;
                        }
                        break Label_0096;
                    }
                    if (b2.a.isAssignableFrom(clazz) && b2.b.isAssignableFrom(clazz2)) {
                        b3 = true;
                        break Label_0096;
                    }
                    break Label_0096;
                }
                finally {
                    try {
                        this.c.clear();
                    }
                    finally {
                        monitorexit(this);
                    }
                    Label_0209: {
                        throw new Registry$NoModelLoaderAvailableException((Class)clazz, (Class)clazz2);
                    }
                    b3 = false;
                    break Label_0096;
                    while (true) {
                        while (true) {
                            while (true) {
                                this.c.add(b2);
                                list.add(this.c(b2));
                                this.c.remove(b2);
                                continue Block_8_Outer;
                                b4 = this.b;
                                d = this.d;
                                b4.getClass();
                                q = new q((ArrayList)list, (e)d);
                                monitorexit(this);
                                return (n<Model, Data>)q;
                                iftrue(Label_0022:)(!b3);
                                continue Block_9_Outer;
                            }
                            Label_0175:
                            iftrue(Label_0196:)(list.size() != 1);
                            n = list.get(0);
                            monitorexit(this);
                            return n;
                            f = r.f;
                            monitorexit(this);
                            return (n<Model, Data>)f;
                            iftrue(Label_0175:)(list.size() <= 1);
                            continue Block_11_Outer;
                        }
                        Label_0196:
                        iftrue(Label_0209:)(!b);
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    public final <Model, Data> n<Model, Data> c(final b<?, ?> b) {
        final n<?, ?> build = b.c.build(this);
        f0.a2(build);
        return (n<Model, Data>)build;
    }
    
    public final ArrayList d(final Class clazz) {
        synchronized (this) {
            final ArrayList list = new ArrayList();
            for (final b b : this.a) {
                if (!list.contains(b.b) && b.a.isAssignableFrom(clazz)) {
                    list.add(b.b);
                }
            }
            return list;
        }
    }
    
    public final ArrayList e(final Class clazz) {
        synchronized (this) {
            final ArrayList<o<? extends Model, ? extends Data>> list = new ArrayList<o<? extends Model, ? extends Data>>();
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final b b = (b)iterator.next();
                if (b.a.isAssignableFrom(f.class) && b.b.isAssignableFrom(clazz)) {
                    iterator.remove();
                    list.add(b.c);
                }
            }
            return list;
        }
    }
    
    public static final class b<Model, Data>
    {
        public final Class<Model> a;
        public final Class<Data> b;
        public final o<? extends Model, ? extends Data> c;
        
        public b(final Class<Model> a, final Class<Data> b, final o<? extends Model, ? extends Data> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class c
    {
    }
}
