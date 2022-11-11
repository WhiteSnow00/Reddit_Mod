// 
// Decompiled by Procyon v0.6.0
// 

package gh2;

import cj2.i;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import di2.g;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.ListIterator;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import di2.h;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import java.util.List;
import di2.d;
import java.util.HashMap;
import di2.b;

public final class c
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final b e;
    public static final di2.c f;
    public static final b g;
    public static final HashMap<d, b> h;
    public static final HashMap<d, b> i;
    public static final HashMap<d, di2.c> j;
    public static final HashMap<d, di2.c> k;
    public static final HashMap<b, b> l;
    public static final HashMap<b, b> m;
    public static final List<a> n;
    
    static {
        final StringBuilder sb = new StringBuilder();
        final FunctionClassKind function = FunctionClassKind.Function;
        sb.append(function.getPackageFqName().toString());
        sb.append('.');
        sb.append(function.getClassNamePrefix());
        a = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        final FunctionClassKind kFunction = FunctionClassKind.KFunction;
        sb2.append(kFunction.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(kFunction.getClassNamePrefix());
        b = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        final FunctionClassKind suspendFunction = FunctionClassKind.SuspendFunction;
        sb3.append(suspendFunction.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(suspendFunction.getClassNamePrefix());
        c = sb3.toString();
        final StringBuilder sb4 = new StringBuilder();
        final FunctionClassKind kSuspendFunction = FunctionClassKind.KSuspendFunction;
        sb4.append(kSuspendFunction.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(kSuspendFunction.getClassNamePrefix());
        d = sb4.toString();
        final di2.c b2 = (e = di2.b.l(new di2.c("kotlin.jvm.functions.FunctionN"))).b();
        sg2.e.e((Object)b2, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f = b2;
        g = di2.h.n;
        d(Class.class);
        h = new HashMap<d, b>();
        i = new HashMap<d, b>();
        j = new HashMap<d, di2.c>();
        k = new HashMap<d, di2.c>();
        l = new HashMap<b, b>();
        m = new HashMap<b, b>();
        final b l2 = di2.b.l(e$a.A);
        final di2.c i2 = e$a.I;
        final di2.c h2 = l2.h();
        final di2.c h3 = l2.h();
        sg2.e.e((Object)h3, "kotlinReadOnly.packageFqName");
        final di2.c b3 = kotlin.reflect.jvm.internal.impl.name.a.b(i2, h3);
        final int n2 = 0;
        final a a2 = new a(d(Iterable.class), l2, new b(h2, b3, false));
        final b l3 = di2.b.l(e$a.z);
        final di2.c h4 = e$a.H;
        final di2.c h5 = l3.h();
        final di2.c h6 = l3.h();
        sg2.e.e((Object)h6, "kotlinReadOnly.packageFqName");
        final a a3 = new a(d(Iterator.class), l3, new b(h5, kotlin.reflect.jvm.internal.impl.name.a.b(h4, h6), false));
        final b l4 = di2.b.l(e$a.B);
        final di2.c j2 = e$a.J;
        final di2.c h7 = l4.h();
        final di2.c h8 = l4.h();
        sg2.e.e((Object)h8, "kotlinReadOnly.packageFqName");
        final a a4 = new a(d(Collection.class), l4, new b(h7, kotlin.reflect.jvm.internal.impl.name.a.b(j2, h8), false));
        final b l5 = di2.b.l(e$a.C);
        final di2.c k2 = e$a.K;
        final di2.c h9 = l5.h();
        final di2.c h10 = l5.h();
        sg2.e.e((Object)h10, "kotlinReadOnly.packageFqName");
        final a a5 = new a(d(List.class), l5, new b(h9, kotlin.reflect.jvm.internal.impl.name.a.b(k2, h10), false));
        final b l6 = di2.b.l(e$a.E);
        final di2.c m2 = e$a.M;
        final di2.c h11 = l6.h();
        final di2.c h12 = l6.h();
        sg2.e.e((Object)h12, "kotlinReadOnly.packageFqName");
        final a a6 = new a(d(Set.class), l6, new b(h11, kotlin.reflect.jvm.internal.impl.name.a.b(m2, h12), false));
        final b l7 = di2.b.l(e$a.D);
        final di2.c l8 = e$a.L;
        final di2.c h13 = l7.h();
        final di2.c h14 = l7.h();
        sg2.e.e((Object)h14, "kotlinReadOnly.packageFqName");
        final a a7 = new a(d(ListIterator.class), l7, new b(h13, kotlin.reflect.jvm.internal.impl.name.a.b(l8, h14), false));
        final di2.c f2 = e$a.F;
        final b l9 = di2.b.l(f2);
        final di2.c n3 = e$a.N;
        final di2.c h15 = l9.h();
        final di2.c h16 = l9.h();
        sg2.e.e((Object)h16, "kotlinReadOnly.packageFqName");
        final a a8 = new a(d(Map.class), l9, new b(h15, kotlin.reflect.jvm.internal.impl.name.a.b(n3, h16), false));
        final b d2 = di2.b.l(f2).d(e$a.G.f());
        final di2.c o = e$a.O;
        final di2.c h17 = d2.h();
        final di2.c h18 = d2.h();
        sg2.e.e((Object)h18, "kotlinReadOnly.packageFqName");
        final List<a> list = n = lw0.b.s1((Object[])new a[] { a2, a3, a4, a5, a6, a7, a8, new a(d(Map.Entry.class), d2, new b(h17, kotlin.reflect.jvm.internal.impl.name.a.b(o, h18), false)) });
        c(Object.class, e$a.a);
        c(String.class, e$a.f);
        c(CharSequence.class, e$a.e);
        a(d(Throwable.class), di2.b.l(e$a.k));
        c(Cloneable.class, e$a.c);
        c(Number.class, e$a.i);
        a(d(Comparable.class), di2.b.l(e$a.l));
        c(Enum.class, e$a.j);
        a(d(Annotation.class), di2.b.l(e$a.s));
        for (final a a9 : list) {
            final b a10 = a9.a;
            final b b4 = a9.b;
            final b c2 = a9.c;
            a(a10, b4);
            final di2.c b5 = c2.b();
            sg2.e.e((Object)b5, "mutableClassId.asSingleFqName()");
            b(b5, a10);
            gh2.c.l.put(c2, b4);
            gh2.c.m.put(b4, c2);
            final di2.c b6 = b4.b();
            sg2.e.e((Object)b6, "readOnlyClassId.asSingleFqName()");
            final di2.c b7 = c2.b();
            sg2.e.e((Object)b7, "mutableClassId.asSingleFqName()");
            final HashMap<d, di2.c> j3 = gh2.c.j;
            final d i3 = c2.b().i();
            sg2.e.e((Object)i3, "mutableClassId.asSingleFqName().toUnsafe()");
            j3.put(i3, b6);
            final HashMap<d, di2.c> k3 = gh2.c.k;
            final d i4 = b6.i();
            sg2.e.e((Object)i4, "readOnlyFqName.toUnsafe()");
            k3.put(i4, b7);
        }
        for (final JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            final b l10 = di2.b.l(jvmPrimitiveType.getWrapperFqName());
            final PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            sg2.e.e((Object)primitiveType, "jvmType.primitiveType");
            a(l10, di2.b.l(kotlin.reflect.jvm.internal.impl.builtins.e.j.c(primitiveType.getTypeName())));
        }
        for (final b b8 : eh2.b.a) {
            final StringBuilder r = a.r("kotlin.jvm.internal.");
            r.append(b8.j().c());
            r.append("CompanionObject");
            a(di2.b.l(new di2.c(r.toString())), b8.d(di2.g.b));
        }
        int n5 = 0;
        int n6;
        while (true) {
            n6 = n2;
            if (n5 >= 23) {
                break;
            }
            final b l11 = di2.b.l(new di2.c(d.h("kotlin.jvm.functions.Function", n5)));
            final di2.c j4 = kotlin.reflect.jvm.internal.impl.builtins.e.j;
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Function");
            sb5.append(n5);
            a(l11, new b(j4, di2.e.f(sb5.toString())));
            final StringBuilder sb6 = new StringBuilder();
            sb6.append(gh2.c.b);
            sb6.append(n5);
            b(new di2.c(sb6.toString()), gh2.c.g);
            ++n5;
        }
        while (n6 < 22) {
            final FunctionClassKind kSuspendFunction2 = FunctionClassKind.KSuspendFunction;
            final StringBuilder sb7 = new StringBuilder();
            sb7.append(kSuspendFunction2.getPackageFqName().toString());
            sb7.append('.');
            sb7.append(kSuspendFunction2.getClassNamePrefix());
            b(new di2.c(d.h(sb7.toString(), n6)), gh2.c.g);
            ++n6;
        }
        final di2.c i5 = e$a.b.i();
        sg2.e.e((Object)i5, "nothing.toSafe()");
        b(i5, d(Void.class));
    }
    
    public static void a(final b b, final b b2) {
        final HashMap<d, b> h = gh2.c.h;
        final d i = b.b().i();
        sg2.e.e((Object)i, "javaClassId.asSingleFqName().toUnsafe()");
        h.put(i, b2);
        final di2.c b3 = b2.b();
        sg2.e.e((Object)b3, "kotlinClassId.asSingleFqName()");
        b(b3, b);
    }
    
    public static void b(final di2.c c, final b b) {
        final HashMap<d, b> i = c.i;
        final d j = c.i();
        sg2.e.e((Object)j, "kotlinFqNameUnsafe.toUnsafe()");
        i.put(j, b);
    }
    
    public static void c(final Class clazz, final d d) {
        final di2.c i = d.i();
        sg2.e.e((Object)i, "kotlinFqName.toSafe()");
        a(d(clazz), di2.b.l(i));
    }
    
    public static b d(final Class clazz) {
        if (!clazz.isPrimitive()) {
            clazz.isArray();
        }
        final Class declaringClass = clazz.getDeclaringClass();
        b b;
        if (declaringClass == null) {
            b = di2.b.l(new di2.c(clazz.getCanonicalName()));
        }
        else {
            b = d(declaringClass).d(di2.e.f(clazz.getSimpleName()));
        }
        return b;
    }
    
    public static boolean e(final d d, final String s) {
        final String b = d.b();
        sg2.e.e((Object)b, "kotlinFqName.asString()");
        final String s2 = kotlin.text.b.s1(b, s, "");
        final int length = s2.length();
        boolean b2 = true;
        if (length > 0 && !kotlin.text.b.o1((CharSequence)s2, '0')) {
            final Integer a0 = cj2.i.A0(s2);
            if (a0 == null || a0 < 23) {
                b2 = false;
            }
            return b2;
        }
        return false;
    }
    
    public static b f(final di2.c c) {
        return c.h.get(c.i());
    }
    
    public static b g(final d d) {
        b b;
        if (e(d, gh2.c.a)) {
            b = gh2.c.e;
        }
        else if (e(d, gh2.c.c)) {
            b = gh2.c.e;
        }
        else if (e(d, gh2.c.b)) {
            b = gh2.c.g;
        }
        else if (e(d, gh2.c.d)) {
            b = gh2.c.g;
        }
        else {
            b = gh2.c.i.get(d);
        }
        return b;
    }
    
    public static final class a
    {
        public final b a;
        public final b b;
        public final b c;
        
        public a(final b a, final b b, final b c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return sg2.e.a((Object)this.a, (Object)a.a) && sg2.e.a((Object)this.b, (Object)a.b) && sg2.e.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("PlatformMutabilityMapping(javaClass=");
            r.append(this.a);
            r.append(", kotlinReadOnly=");
            r.append(this.b);
            r.append(", kotlinMutable=");
            r.append(this.c);
            r.append(')');
            return r.toString();
        }
    }
}
