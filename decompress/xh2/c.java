// 
// Decompiled by Procyon v0.6.0
// 

package xh2;

import kotlin.NoWhenBranchMatchedException;
import vl.a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import ti2.w;
import ti2.p;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import java.util.Iterator;
import ti2.k0;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ti2.t0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import ti2.t;
import a4.a0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import ti2.v0;
import ti2.n0;
import hh2.j0;
import ti2.p0;
import java.util.ArrayList;
import ig2.m;
import ej2.c0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import hh2.g;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition;
import rg2.l;
import ti2.x;
import sh2.b$a;
import sh2.b;

public final class c
{
    public final sh2.b a;
    
    public c() {
        final b$a a = b$a.a;
        this.a = (sh2.b)a;
    }
    
    public final b a(x f, final l<? super Integer, d> l, int size, final TypeComponentPosition typeComponentPosition, final boolean b, final boolean b2) {
        e.f((Object)typeComponentPosition, "<this>");
        final TypeComponentPosition inflexible = TypeComponentPosition.INFLEXIBLE;
        final boolean b3 = typeComponentPosition != inflexible;
        final boolean b4 = !b2 || !b;
        if (!b3 && ((t)f).G0().isEmpty()) {
            return new b(null, 1, false);
        }
        final hh2.e f2 = ((t)f).I0().f();
        if (f2 == null) {
            return new b(null, 1, false);
        }
        final d d = l.invoke(size);
        final xh2.b a = k.a;
        Object o = null;
        Label_0365: {
            if (typeComponentPosition != inflexible) {
                if (f2 instanceof hh2.c) {
                    if (d.b == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
                        final hh2.c c = (hh2.c)f2;
                        final String a2 = gh2.c.a;
                        final di2.d g = fi2.d.g((g)c);
                        final HashMap<di2.d, di2.c> j = gh2.c.j;
                        if (j.containsKey(g)) {
                            final di2.c c2 = j.get(fi2.d.g((g)c));
                            if (c2 != null) {
                                o = DescriptorUtilsKt.e((g)c).j(c2);
                                break Label_0365;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Given class ");
                            sb.append(c);
                            sb.append(" is not a ");
                            sb.append("mutable");
                            sb.append(" collection");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (d.b == MutabilityQualifier.MUTABLE && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
                        final hh2.c c3 = (hh2.c)f2;
                        final String a3 = gh2.c.a;
                        if (gh2.c.k.containsKey(fi2.d.g((g)c3))) {
                            o = c0.V2(c3);
                            break Label_0365;
                        }
                    }
                }
            }
            o = null;
        }
        Boolean b5 = null;
        Label_0449: {
            if (typeComponentPosition != inflexible) {
                final NullabilityQualifier a4 = d.a;
                int n;
                if (a4 == null) {
                    n = -1;
                }
                else {
                    n = k.a.a[((Enum)a4).ordinal()];
                }
                if (n == 1) {
                    b5 = Boolean.TRUE;
                    break Label_0449;
                }
                if (n == 2) {
                    b5 = Boolean.FALSE;
                    break Label_0449;
                }
            }
            b5 = null;
        }
        k0 k0;
        if (o == null || (k0 = ((hh2.e)o).m()) == null) {
            k0 = ((t)f).I0();
        }
        e.e((Object)k0, "enhancedClassifier?.typeConstructor ?: constructor");
        int n2 = size + 1;
        final List g2 = ((t)f).G0();
        final List parameters = k0.getParameters();
        e.e((Object)parameters, "typeConstructor.parameters");
        final Iterator iterator = g2.iterator();
        final Iterator iterator2 = parameters.iterator();
        final ArrayList list = new ArrayList<p0>(Math.min(m.c3((Iterable)g2, 10), m.c3((Iterable)parameters, 10)));
        while (iterator.hasNext() && iterator2.hasNext()) {
            final Object next = iterator.next();
            final j0 j2 = (j0)iterator2.next();
            final n0 n3 = (n0)next;
            a b6;
            if (!b4) {
                b6 = new a(null, 0);
            }
            else if (!n3.b()) {
                b6 = this.b(n3.getType().L0(), l, n2, b2);
            }
            else if (l.invoke(n2).a == NullabilityQualifier.FORCE_FLEXIBILITY) {
                final v0 l2 = n3.getType().L0();
                b6 = new a(KotlinTypeFactory.c(a0.o0(l2).P0(false), a0.T0(l2).P0(true)), 1);
            }
            else {
                b6 = new a(null, 1);
            }
            n2 += b6.b;
            final t a5 = b6.a;
            Object o2;
            if (a5 != null) {
                final Variance c4 = n3.c();
                e.e((Object)c4, "arg.projectionKind");
                o2 = TypeUtilsKt.e(a5, c4, j2);
            }
            else if (o != null && !n3.b()) {
                final t type = n3.getType();
                e.e((Object)type, "arg.type");
                final Variance c5 = n3.c();
                e.e((Object)c5, "arg.projectionKind");
                o2 = TypeUtilsKt.e(type, c5, j2);
            }
            else if (o != null) {
                o2 = t0.m(j2);
            }
            else {
                o2 = null;
            }
            list.add((p0)o2);
        }
        final int n4 = n2 - size;
        if (o == null && b5 == null) {
            Label_0959: {
                if (!list.isEmpty()) {
                    final Iterator<p0> iterator3 = list.iterator();
                    while (iterator3.hasNext()) {
                        if (iterator3.next() == null) {
                            size = 1;
                        }
                        else {
                            size = 0;
                        }
                        if (size == 0) {
                            size = 0;
                            break Label_0959;
                        }
                    }
                }
                size = 1;
            }
            if (size != 0) {
                return new b(null, n4, false);
            }
        }
        final boolean b7 = false;
        final ih2.e annotations = ((t)f).getAnnotations();
        Object b8 = k.b;
        if (o != null) {
            size = 1;
        }
        else {
            size = 0;
        }
        if (size == 0) {
            b8 = null;
        }
        Object a6 = k.a;
        if (b5 != null) {
            size = 1;
        }
        else {
            size = 0;
        }
        if (size == 0) {
            a6 = null;
        }
        final ArrayList v0 = kotlin.collections.b.V0(new ih2.e[] { annotations, (ih2.e)b8, (ih2.e)a6 });
        size = v0.size();
        if (size != 0) {
            Object o3;
            if (size != 1) {
                o3 = new CompositeAnnotations(CollectionsKt___CollectionsKt.q4((Iterable)v0));
            }
            else {
                o3 = CollectionsKt___CollectionsKt.b4((List)v0);
            }
            final ti2.j0 n5 = lw0.b.N2((ih2.e)o3);
            final List g3 = ((t)f).G0();
            final Iterator<p0> iterator4 = list.iterator();
            final Iterator iterator5 = g3.iterator();
            final ArrayList list2 = new ArrayList<n0>(Math.min(m.c3((Iterable)list, 10), m.c3((Iterable)g3, 10)));
            while (iterator4.hasNext() && iterator5.hasNext()) {
                final n0 next2 = iterator4.next();
                n0 n6 = (n0)iterator5.next();
                final n0 n7 = next2;
                if (n7 != null) {
                    n6 = n7;
                }
                list2.add(n6);
            }
            boolean b9;
            if (b5 != null) {
                b9 = b5;
            }
            else {
                b9 = ((t)f).J0();
            }
            final x x = (x)(f = KotlinTypeFactory.f(n5, k0, (List<? extends n0>)list2, b9, null));
            if (d.c) {
                this.a.a();
                f = new xh2.e(x);
            }
            boolean b10 = b7;
            if (b5 != null) {
                b10 = b7;
                if (d.d) {
                    b10 = true;
                }
            }
            return new b((x)f, n4, b10);
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }
    
    public final a b(v0 v0, final l<? super Integer, d> l, final int n, final boolean b) {
        final boolean h = ui.b.H((t)v0);
        final v0 v2 = null;
        if (h) {
            return new a(null, 1);
        }
        a a4;
        if (v0 instanceof p) {
            final boolean b2 = v0 instanceof w;
            final p p4 = (p)v0;
            final b a = this.a(p4.g, l, n, TypeComponentPosition.FLEXIBLE_LOWER, b2, b);
            final b a2 = this.a(p4.h, l, n, TypeComponentPosition.FLEXIBLE_UPPER, b2, b);
            Object o = a.a;
            if (o == null && a2.a == null) {
                v0 = v2;
            }
            else if (!a.c && !a2.c) {
                if (b2) {
                    x g;
                    if ((g = (x)o) == null) {
                        g = p4.g;
                    }
                    x x;
                    if ((x = a2.a) == null) {
                        x = p4.h;
                    }
                    v0 = (v0)new RawTypeImpl(g, x);
                }
                else {
                    x g2;
                    if ((g2 = (x)o) == null) {
                        g2 = p4.g;
                    }
                    x x2;
                    if ((x2 = a2.a) == null) {
                        x2 = p4.h;
                    }
                    v0 = KotlinTypeFactory.c(g2, x2);
                }
            }
            else {
                final x a3 = a2.a;
                if (a3 != null) {
                    x x3;
                    if ((x3 = (x)o) == null) {
                        x3 = a3;
                    }
                    o = KotlinTypeFactory.c(x3, a3);
                }
                else {
                    e.c(o);
                }
                v0 = vl.a.L0(v0, (t)o);
            }
            a4 = new a(v0, a.b);
        }
        else {
            if (!(v0 instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            final b a5 = this.a((x)v0, l, n, TypeComponentPosition.INFLEXIBLE, false, b);
            if (a5.c) {
                v0 = vl.a.L0(v0, (t)a5.a);
            }
            else {
                v0 = (v0)a5.a;
            }
            a4 = new a(v0, a5.b);
        }
        return a4;
    }
    
    public static final class a
    {
        public final t a;
        public final int b;
        
        public a(final v0 a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b
    {
        public final x a;
        public final int b;
        public final boolean c;
        
        public b(final x a, final int b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
