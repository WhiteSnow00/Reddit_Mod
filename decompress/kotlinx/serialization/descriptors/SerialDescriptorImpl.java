// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.descriptors;

import java.util.Arrays;
import java.util.Set;
import dg2.u;
import java.util.Iterator;
import kotlin.collections.c;
import dg2.t;
import dg2.v;
import kotlin.Pair;
import java.util.ArrayList;
import dg2.m;
import kotlin.collections.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import mj2.a;
import cg2.f;
import java.util.Map;
import java.util.HashSet;
import java.lang.annotation.Annotation;
import java.util.List;
import mj2.h;
import oj2.l;
import mj2.e;

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
        ng2.e.f((Object)a, "serialName");
        ng2.e.f((Object)b, "kind");
        ng2.e.f((Object)list, "typeParameters");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List<Annotation>)a2.a;
        this.e = CollectionsKt___CollectionsKt.G5((Iterable)a2.b);
        final ArrayList b2 = a2.b;
        c = 0;
        final String[] array = b2.toArray(new String[0]);
        ng2.e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f = array;
        this.g = if0.a.l((List)a2.d);
        final List[] array2 = a2.e.toArray(new List[0]);
        ng2.e.d((Object)array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.h = array2;
        final ArrayList f = a2.f;
        ng2.e.f((Object)f, "<this>");
        final boolean[] i = new boolean[f.size()];
        final Iterator iterator = f.iterator();
        while (iterator.hasNext()) {
            i[c] = (boolean)iterator.next();
            ++c;
        }
        this.i = i;
        final u i2 = kotlin.collections.b.I2((Object[])this.f);
        final ArrayList list2 = new ArrayList<Pair>(m.u4((Iterable)i2, 10));
        final Iterator iterator2 = i2.iterator();
        while (true) {
            final v v = (v)iterator2;
            if (!v.hasNext()) {
                break;
            }
            final t t = (t)v.next();
            list2.add(new Pair(t.b, (Object)t.a));
        }
        this.j = kotlin.collections.c.E4((List)list2);
        this.k = if0.a.l((List)list);
        this.l = kotlin.a.b((mg2.a)new SerialDescriptorImpl$_hashCode$2(this));
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
        ng2.e.f((Object)s, "name");
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
                if (ng2.e.a((Object)h, (Object)e.h())) {
                    if (Arrays.equals(this.k, ((SerialDescriptorImpl)o).k)) {
                        if (this.e() == e.e()) {
                            final int e2 = this.e();
                            int n = 0;
                            while (true) {
                                b2 = b;
                                if (n >= e2) {
                                    return b2;
                                }
                                if (!ng2.e.a((Object)this.d(n).h(), (Object)e.d(n).h())) {
                                    break;
                                }
                                if (!ng2.e.a((Object)this.d(n).getKind(), (Object)e.d(n).getKind())) {
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
        return ((Number)this.l.getValue()).intValue();
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
        return CollectionsKt___CollectionsKt.a5((Iterable)zd.b.w1(0, this.c), (CharSequence)", ", p1.h.c(new StringBuilder(), this.a, '('), ")", (mg2.l)new SerialDescriptorImpl$toString$1(this), 24);
    }
}
