// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.descriptors;

import al0.f0;
import lg.e0;
import java.util.Arrays;
import java.util.Set;
import ig2.u;
import java.util.Iterator;
import kotlin.collections.c;
import ig2.t;
import ig2.v;
import kotlin.Pair;
import java.util.ArrayList;
import ig2.m;
import yd.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qj2.a;
import hg2.f;
import java.util.Map;
import java.util.HashSet;
import java.lang.annotation.Annotation;
import java.util.List;
import qj2.h;
import sj2.l;
import qj2.e;

public final class SerialDescriptorImpl implements e, l
{
    public final String a;
    public final h b;
    public final int c;
    public final List<Annotation> d;
    public final HashSet e;
    public final String[] f;
    public final e[] g;
    public final List<Annotation>[] h;
    public final boolean[] i;
    public final Map<String, Integer> j;
    public final e[] k;
    public final f l;
    
    public SerialDescriptorImpl(final String a, final h b, int c, final List<? extends e> list, final a a2) {
        sg2.e.f((Object)a, "serialName");
        sg2.e.f((Object)b, "kind");
        sg2.e.f((Object)list, "typeParameters");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List<Annotation>)a2.a;
        this.e = CollectionsKt___CollectionsKt.o4((Iterable)a2.b);
        final ArrayList b2 = a2.b;
        c = 0;
        final String[] array = b2.toArray(new String[0]);
        sg2.e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f = array;
        this.g = yd.b.i((List)a2.d);
        final List[] array2 = a2.e.toArray(new List[0]);
        sg2.e.d((Object)array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.h = array2;
        final ArrayList f = a2.f;
        sg2.e.f((Object)f, "<this>");
        final boolean[] i = new boolean[f.size()];
        final Iterator iterator = f.iterator();
        while (iterator.hasNext()) {
            i[c] = (boolean)iterator.next();
            ++c;
        }
        this.i = i;
        final u z1 = kotlin.collections.b.z1(this.f);
        final ArrayList list2 = new ArrayList<Pair>(m.c3((Iterable)z1, 10));
        final Iterator iterator2 = z1.iterator();
        while (true) {
            final v v = (v)iterator2;
            if (!v.hasNext()) {
                break;
            }
            final t t = (t)v.next();
            list2.add(new Pair(t.b, (Object)t.a));
        }
        this.j = kotlin.collections.c.g1((List)list2);
        this.k = yd.b.i((List)list);
        this.l = kotlin.a.b((rg2.a)new SerialDescriptorImpl$_hashCode$2(this));
    }
    
    public final Set<String> a() {
        return this.e;
    }
    
    @Override
    public final boolean b() {
        return false;
    }
    
    @Override
    public final int c(final String s) {
        sg2.e.f((Object)s, "name");
        final Integer n = this.j.get(s);
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = -3;
        }
        return intValue;
    }
    
    @Override
    public final e d(final int n) {
        return this.g[n];
    }
    
    @Override
    public final int e() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = true;
        boolean b2;
        if (this == o) {
            b2 = b;
        }
        else {
            if (o instanceof SerialDescriptorImpl) {
                final String h = this.h();
                final e e = (e)o;
                if (sg2.e.a((Object)h, (Object)e.h())) {
                    if (Arrays.equals(this.k, ((SerialDescriptorImpl)o).k)) {
                        if (this.e() == e.e()) {
                            final int e2 = this.e();
                            int n = 0;
                            while (true) {
                                b2 = b;
                                if (n >= e2) {
                                    return b2;
                                }
                                if (!sg2.e.a((Object)this.d(n).h(), (Object)e.d(n).h())) {
                                    break;
                                }
                                if (!sg2.e.a((Object)this.d(n).getKind(), (Object)e.d(n).getKind())) {
                                    break;
                                }
                                ++n;
                            }
                        }
                    }
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final String f(final int n) {
        return this.f[n];
    }
    
    @Override
    public final List<Annotation> g(final int n) {
        return this.h[n];
    }
    
    @Override
    public final List<Annotation> getAnnotations() {
        return this.d;
    }
    
    @Override
    public final h getKind() {
        return this.b;
    }
    
    @Override
    public final String h() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        return this.l.getValue().intValue();
    }
    
    @Override
    public final boolean i(final int n) {
        return this.i[n];
    }
    
    @Override
    public final boolean isInline() {
        return false;
    }
    
    @Override
    public final String toString() {
        return CollectionsKt___CollectionsKt.I3((Iterable)e0.v0(0, this.c), (CharSequence)", ", f0.n(new StringBuilder(), this.a, '('), ")", (rg2.l)new SerialDescriptorImpl$toString$1(this), 24);
    }
}
