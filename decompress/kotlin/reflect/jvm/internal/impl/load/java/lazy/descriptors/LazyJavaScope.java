// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import rh2.r;
import rh2.s;
import fh2.n;
import rh2.p;
import java.util.Map;
import fh2.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality$a;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import dh2.e$a;
import rh2.x;
import ch2.j0;
import rh2.y;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import ch2.d0;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$k;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import java.util.Set;
import oi2.w0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import java.util.Iterator;
import dg2.u;
import ch2.e0;
import ch2.m0;
import kotlin.Pair;
import rh2.z;
import dg2.v;
import java.util.ArrayList;
import dg2.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import rh2.w;
import fh2.i;
import ph2.b;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import oi2.t;
import rh2.q;
import mg2.l;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import ng2.h;
import java.util.List;
import ch2.a0;
import ni2.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import oh2.a;
import java.util.Collection;
import ni2.e;
import nh2.c;
import ug2.k;
import hi2.g;

public abstract class LazyJavaScope extends g
{
    public static final k<Object>[] m;
    public final c b;
    public final LazyJavaScope c;
    public final e<Collection<ch2.g>> d;
    public final e<a> e;
    public final ni2.c<yh2.e, Collection<f>> f;
    public final d<yh2.e, a0> g;
    public final ni2.c<yh2.e, Collection<f>> h;
    public final e i;
    public final e j;
    public final e k;
    public final ni2.c<yh2.e, List<a0>> l;
    
    static {
        m = new k[] { (k)h.c((PropertyReference1)new PropertyReference1Impl((ug2.f)h.a((Class)LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), (k)h.c((PropertyReference1)new PropertyReference1Impl((ug2.f)h.a((Class)LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), (k)h.c((PropertyReference1)new PropertyReference1Impl((ug2.f)h.a((Class)LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;")) };
    }
    
    public LazyJavaScope(final c b, final LazyJavaScope c) {
        ng2.e.f((Object)b, "c");
        this.b = b;
        this.c = c;
        this.d = (e<Collection<ch2.g>>)b.a.a.e(EmptyList.INSTANCE, (mg2.a)new LazyJavaScope$allDescriptors.LazyJavaScope$allDescriptors$1(this));
        this.e = (e<a>)b.a.a.h((mg2.a)new LazyJavaScope$declaredMemberIndex.LazyJavaScope$declaredMemberIndex$1(this));
        this.f = (ni2.c<yh2.e, Collection<f>>)b.a.a.c((l)new LazyJavaScope$declaredFunctions.LazyJavaScope$declaredFunctions$1(this));
        this.g = (d<yh2.e, a0>)b.a.a.b((l)new LazyJavaScope$declaredField.LazyJavaScope$declaredField$1(this));
        this.h = (ni2.c<yh2.e, Collection<f>>)b.a.a.c((l)new LazyJavaScope$functions.LazyJavaScope$functions$1(this));
        this.i = (e)b.a.a.h((mg2.a)new LazyJavaScope$functionNamesLazy.LazyJavaScope$functionNamesLazy$2(this));
        this.j = (e)b.a.a.h((mg2.a)new LazyJavaScope$propertyNamesLazy.LazyJavaScope$propertyNamesLazy$2(this));
        this.k = (e)b.a.a.h((mg2.a)new LazyJavaScope$classNamesLazy.LazyJavaScope$classNamesLazy$2(this));
        this.l = (ni2.c<yh2.e, List<a0>>)b.a.a.c((l)new LazyJavaScope$properties.LazyJavaScope$properties$1(this));
    }
    
    public static t l(final q q, final c c) {
        ng2.e.f((Object)q, "method");
        return c.e.e((w)q.J(), b.b(TypeUsage.COMMON, ((p)q).A().n(), (i)null, 2));
    }
    
    public static LazyJavaScope.LazyJavaScope$b u(final c c, final kotlin.reflect.jvm.internal.impl.descriptors.impl.b b, final List list) {
        ng2.e.f((Object)list, "jValueParameters");
        final u n5 = CollectionsKt___CollectionsKt.N5((Iterable)list);
        final ArrayList list2 = new ArrayList(dg2.m.u4((Iterable)n5, 10));
        final Iterator iterator = n5.iterator();
        int n6 = 0;
        while (true) {
            final v v = (v)iterator;
            if (!v.hasNext()) {
                return new LazyJavaScope.LazyJavaScope$b(CollectionsKt___CollectionsKt.I5((Iterable)list2), (boolean)(n6 != 0));
            }
            final dg2.t t = (dg2.t)v.next();
            final int a = t.a;
            final z z = (z)t.b;
            final LazyJavaAnnotations w = if0.a.W(c, (rh2.d)z);
            final TypeUsage common = TypeUsage.COMMON;
            rh2.f f = null;
            final ph2.a b2 = b.b(common, false, (i)null, 3);
            Pair pair;
            if (z.a()) {
                final w type = z.getType();
                if (type instanceof rh2.f) {
                    f = (rh2.f)type;
                }
                if (f == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Vararg parameter should be an array: ");
                    sb.append(z);
                    throw new AssertionError((Object)sb.toString());
                }
                final w0 c2 = c.e.c(f, b2, true);
                pair = new Pair((Object)c2, (Object)c.a.o.p().g((t)c2));
            }
            else {
                pair = new Pair((Object)c.e.e(z.getType(), b2), (Object)null);
            }
            final t t2 = (t)pair.component1();
            final t t3 = (t)pair.component2();
            yh2.e e;
            int n7;
            if (ng2.e.a((Object)((n)b).getName().c(), (Object)"equals") && list.size() == 1 && ng2.e.a((Object)c.a.o.p().p(), (Object)t2)) {
                e = yh2.e.g("other");
                n7 = n6;
            }
            else {
                final yh2.e name = z.getName();
                if (name == null) {
                    n6 = 1;
                }
                n7 = n6;
                if ((e = name) == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(a);
                    e = yh2.e.g(sb2.toString());
                    n7 = n6;
                }
            }
            list2.add((Object)new kotlin.reflect.jvm.internal.impl.descriptors.impl.d((kotlin.reflect.jvm.internal.impl.descriptors.a)b, (m0)null, a, (dh2.e)w, e, t2, false, false, false, t3, (e0)c.a.j.a((rh2.l)z)));
            n6 = n7;
        }
    }
    
    @Override
    public final Set<yh2.e> a() {
        return (Set)zd.b.f0(this.i, LazyJavaScope.m[0]);
    }
    
    @Override
    public Collection b(final yh2.e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        if (!this.d().contains(e)) {
            return (Collection)EmptyList.INSTANCE;
        }
        return (Collection)((LockBasedStorageManager$k)this.l).invoke((Object)e);
    }
    
    @Override
    public Collection c(final yh2.e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        if (!this.a().contains(e)) {
            return (Collection)EmptyList.INSTANCE;
        }
        return (Collection)((LockBasedStorageManager$k)this.h).invoke((Object)e);
    }
    
    @Override
    public final Set<yh2.e> d() {
        return (Set)zd.b.f0(this.j, LazyJavaScope.m[1]);
    }
    
    @Override
    public final Set<yh2.e> f() {
        return (Set)zd.b.f0(this.k, LazyJavaScope.m[2]);
    }
    
    @Override
    public Collection<ch2.g> g(final hi2.d d, final l<? super yh2.e, Boolean> l) {
        ng2.e.f((Object)d, "kindFilter");
        ng2.e.f((Object)l, "nameFilter");
        return (Collection)((mg2.a)this.d).invoke();
    }
    
    public abstract Set<yh2.e> h(final hi2.d p0, final l<? super yh2.e, Boolean> p1);
    
    public abstract Set<yh2.e> i(final hi2.d p0, final l<? super yh2.e, Boolean> p1);
    
    public void j(final ArrayList list, final yh2.e e) {
        ng2.e.f((Object)e, "name");
    }
    
    public abstract a k();
    
    public abstract void m(final LinkedHashSet p0, final yh2.e p1);
    
    public abstract void n(final ArrayList p0, final yh2.e p1);
    
    public abstract Set o(final hi2.d p0);
    
    public abstract d0 p();
    
    public abstract ch2.g q();
    
    public boolean r(final JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }
    
    public abstract LazyJavaScope.LazyJavaScope$a s(final q p0, final ArrayList p1, final t p2, final List p3);
    
    public final JavaMethodDescriptor t(final q q) {
        ng2.e.f((Object)q, "method");
        final JavaMethodDescriptor u0 = JavaMethodDescriptor.U0(this.q(), if0.a.W(this.b, (rh2.d)q), ((s)q).getName(), (qh2.a)this.b.a.j.a((rh2.l)q), ((a)((mg2.a)this.e).invoke()).b(((s)q).getName()) != null && q.g().isEmpty());
        final c b = this.b;
        ng2.e.f((Object)b, "<this>");
        final c c = new c(b.a, (nh2.f)new LazyJavaTypeParameterResolver(b, (ch2.g)u0, (y)q, 0), b.c);
        final ArrayList typeParameters = ((y)q).getTypeParameters();
        final ArrayList list = new ArrayList<j0>(dg2.m.u4((Iterable)typeParameters, 10));
        final Iterator iterator = typeParameters.iterator();
        while (iterator.hasNext()) {
            final j0 a = c.b.a((x)iterator.next());
            ng2.e.c((Object)a);
            list.add(a);
        }
        final LazyJavaScope.LazyJavaScope$b u2 = u(c, (kotlin.reflect.jvm.internal.impl.descriptors.impl.b)u0, q.g());
        final LazyJavaScope.LazyJavaScope$a s = this.s(q, list, l(q, c), u2.a);
        final t b2 = s.b;
        g0 g;
        if (b2 != null) {
            g = ai2.c.g((kotlin.reflect.jvm.internal.impl.descriptors.a)u0, b2, (dh2.e)e$a.a);
        }
        else {
            g = null;
        }
        final d0 p = this.p();
        final EmptyList instance = EmptyList.INSTANCE;
        final List d = s.d;
        final List c2 = s.c;
        final t a2 = s.a;
        final Modality$a companion = Modality.Companion;
        final boolean abstract1 = ((r)q).isAbstract();
        final boolean final1 = ((r)q).isFinal();
        companion.getClass();
        final Modality a3 = Modality$a.a(false, abstract1, final1 ^ true);
        final ch2.m y1 = xd.a.y1(((r)q).getVisibility());
        Map map;
        if (s.b != null) {
            map = cg.d.r3(new Pair((Object)JavaMethodDescriptor.L, CollectionsKt___CollectionsKt.S4(u2.a)));
        }
        else {
            map = kotlin.collections.c.u4();
        }
        u0.T0(g, p, (List)instance, d, c2, a2, a3, y1, map);
        u0.V0(s.e, u2.b);
        if (!(s.f.isEmpty() ^ true)) {
            return u0;
        }
        final lh2.e e = c.a.e;
        final List f = s.f;
        ((lh2.e$a)e).getClass();
        if (f == null) {
            lh2.e$a.a(6);
            throw null;
        }
        throw new UnsupportedOperationException("Should not be called");
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Lazy scope for ");
        t.append(this.q());
        return t.toString();
    }
}
