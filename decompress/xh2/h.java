// 
// Decompiled by Procyon v0.6.0
// 

package xh2;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import ig2.u;
import ig2.t;
import ig2.v;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.kotlin.b;
import kotlin.Pair;
import java.util.ArrayList;
import ig2.m;
import hg2.j;
import rg2.l;
import sg2.e;
import java.util.LinkedHashMap;

public final class h
{
    public final LinkedHashMap a;
    
    public h() {
        this.a = new LinkedHashMap();
    }
    
    public final class a
    {
        public final String a;
        
        public a(final String a) {
            e.f((Object)a, "className");
            this.a = a;
        }
        
        public final void a(String j, final l<? super h.a.a, j> l) {
            final LinkedHashMap a = h.this.a;
            final h.a.a a2 = new h.a.a(j);
            l.invoke(a2);
            final String a3 = this.a;
            final ArrayList a4 = a2.a;
            final ArrayList list = new ArrayList<Object>(m.c3((Iterable)a4, 10));
            final Iterator iterator = a4.iterator();
            while (iterator.hasNext()) {
                list.add(((Pair)iterator.next()).getFirst());
            }
            j = kotlin.reflect.jvm.internal.impl.load.kotlin.b.j(a3, kotlin.reflect.jvm.internal.impl.load.kotlin.b.i(j, (String)a2.b.getFirst(), list));
            final xh2.j i = (xh2.j)a2.b.getSecond();
            final ArrayList a5 = a2.a;
            final ArrayList list2 = new ArrayList<xh2.j>(m.c3((Iterable)a5, 10));
            final Iterator iterator2 = a5.iterator();
            while (iterator2.hasNext()) {
                list2.add(((Pair)iterator2.next()).getSecond());
            }
            final Pair pair = new Pair((Object)j, (Object)new g(i, (List<xh2.j>)list2));
            a.put(pair.getFirst(), pair.getSecond());
        }
        
        public final class a
        {
            public final ArrayList a;
            public Pair<String, xh2.j> b;
            
            public a(final h.a a, final String s) {
                this.a = new ArrayList();
                this.b = (Pair<String, xh2.j>)new Pair((Object)"V", (Object)null);
            }
            
            public final void a(final String s, final d... array) {
                e.f((Object)s, "type");
                final ArrayList a = this.a;
                Object o;
                if (array.length == 0) {
                    o = null;
                }
                else {
                    final u z1 = kotlin.collections.b.z1(array);
                    int o2;
                    if ((o2 = bg.d.o0(m.c3((Iterable)z1, 10))) < 16) {
                        o2 = 16;
                    }
                    final LinkedHashMap linkedHashMap = new LinkedHashMap(o2);
                    final Iterator iterator = z1.iterator();
                    while (true) {
                        final v v = (v)iterator;
                        if (!v.hasNext()) {
                            break;
                        }
                        final t t = (t)v.next();
                        linkedHashMap.put((Object)t.a, (Object)t.b);
                    }
                    o = new xh2.j(linkedHashMap);
                }
                a.add(new Pair((Object)s, o));
            }
            
            public final void b(final String s, final d... array) {
                e.f((Object)s, "type");
                final u z1 = kotlin.collections.b.z1(array);
                int o0;
                if ((o0 = bg.d.o0(m.c3((Iterable)z1, 10))) < 16) {
                    o0 = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(o0);
                final Iterator iterator = z1.iterator();
                while (true) {
                    final v v = (v)iterator;
                    if (!v.hasNext()) {
                        break;
                    }
                    final t t = (t)v.next();
                    linkedHashMap.put((Object)t.a, (Object)t.b);
                }
                this.b = (Pair<String, xh2.j>)new Pair((Object)s, (Object)new xh2.j(linkedHashMap));
            }
            
            public final void c(final JvmPrimitiveType jvmPrimitiveType) {
                e.f((Object)jvmPrimitiveType, "type");
                final String desc = jvmPrimitiveType.getDesc();
                e.e((Object)desc, "type.desc");
                this.b = (Pair<String, xh2.j>)new Pair((Object)desc, (Object)null);
            }
        }
    }
}
