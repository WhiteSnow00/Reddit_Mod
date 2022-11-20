// 
// Decompiled by Procyon v0.6.0
// 

package wg2;

import kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor;
import ih2.l;
import kotlin.reflect.jvm.internal.JvmFunctionSignature$a;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature$b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import xh2.h;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import ch2.e0;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import ih2.o;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import mi2.g;
import ch2.a0;
import xh2.d$b;
import p7.a;
import ch2.c0;
import kh2.r;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import ch2.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.JvmFunctionSignature$c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import yh2.c;
import yh2.b;

public final class j
{
    public static final b a;
    
    static {
        a = b.l(new c("java.lang.Void"));
    }
    
    public static JvmFunctionSignature$c a(final d d) {
        String s;
        if ((s = SpecialBuiltinMembers.a((CallableMemberDescriptor)d)) == null) {
            if (d instanceof b0) {
                final String c = ((ch2.g)DescriptorUtilsKt.l((CallableMemberDescriptor)d)).getName().c();
                e.e((Object)c, "descriptor.propertyIfAccessor.name.asString()");
                s = r.a(c);
            }
            else if (d instanceof c0) {
                final String c2 = ((ch2.g)DescriptorUtilsKt.l((CallableMemberDescriptor)d)).getName().c();
                e.e((Object)c2, "descriptor.propertyIfAccessor.name.asString()");
                s = r.b(c2);
            }
            else {
                s = ((ch2.g)d).getName().c();
                e.e((Object)s, "descriptor.name.asString()");
            }
        }
        return new JvmFunctionSignature$c(new d$b(s, p7.a.i(d, 1)));
    }
    
    public static wg2.b b(final a0 a0) {
        e.f((Object)a0, "possiblyOverriddenProperty");
        final a0 a2 = ((a0)ai2.d.u((CallableMemberDescriptor)a0)).a();
        e.e((Object)a2, "unwrapFakeOverride(possi\u2026rriddenProperty).original");
        final boolean b = a2 instanceof g;
        JvmFunctionSignature$c a3 = null;
        Method a4 = null;
        if (b) {
            final g g = (g)a2;
            final ProtoBuf$Property g2 = g.G;
            final GeneratedMessageLite$e d = JvmProtoBuf.d;
            e.e((Object)d, "propertySignature");
            final JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature)xd.a.c0((GeneratedMessageLite$ExtendableMessage)g2, d);
            if (jvmProtoBuf$JvmPropertySignature != null) {
                return (wg2.b)new b$c(a2, g2, jvmProtoBuf$JvmPropertySignature, g.H, g.I);
            }
        }
        else if (a2 instanceof mh2.e) {
            final e0 f = ((fh2.o)a2).f();
            qh2.a a5;
            if (f instanceof qh2.a) {
                a5 = (qh2.a)f;
            }
            else {
                a5 = null;
            }
            Object b2;
            if (a5 != null) {
                b2 = a5.b();
            }
            else {
                b2 = null;
            }
            Object o;
            if (b2 instanceof o) {
                o = new b$a(((o)b2).a);
            }
            else {
                if (!(b2 instanceof ih2.r)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Incorrect resolution sequence for Java field ");
                    sb.append(a2);
                    sb.append(" (source = ");
                    sb.append(b2);
                    sb.append(')');
                    throw new KotlinReflectionInternalError(sb.toString());
                }
                final Method a6 = ((ih2.r)b2).a;
                final c0 setter = a2.getSetter();
                Object f2;
                if (setter != null) {
                    f2 = ((ch2.j)setter).f();
                }
                else {
                    f2 = null;
                }
                qh2.a a7;
                if (f2 instanceof qh2.a) {
                    a7 = (qh2.a)f2;
                }
                else {
                    a7 = null;
                }
                Object b3;
                if (a7 != null) {
                    b3 = a7.b();
                }
                else {
                    b3 = null;
                }
                ih2.r r;
                if (b3 instanceof ih2.r) {
                    r = (ih2.r)b3;
                }
                else {
                    r = null;
                }
                if (r != null) {
                    a4 = r.a;
                }
                o = new b$b(a6, a4);
            }
            return (wg2.b)o;
        }
        final fh2.e0 getter = a2.getGetter();
        e.c((Object)getter);
        final JvmFunctionSignature$c a8 = a((d)getter);
        final c0 setter2 = a2.getSetter();
        if (setter2 != null) {
            a3 = a((d)setter2);
        }
        return (wg2.b)new b$d(a8, a3);
    }
    
    public static JvmFunctionSignature c(final d d) {
        e.f((Object)d, "possiblySubstitutedFunction");
        final d a = ((d)ai2.d.u((CallableMemberDescriptor)d)).a();
        e.e((Object)a, "unwrapFakeOverride(possi\u2026titutedFunction).original");
        if (a instanceof mi2.b) {
            final mi2.b b = (mi2.b)a;
            final kotlin.reflect.jvm.internal.impl.protobuf.l l = ((mi2.e)b).L();
            if (l instanceof ProtoBuf$Function) {
                final kotlin.reflect.jvm.internal.impl.protobuf.e a2 = h.a;
                final d$b c = h.c((ProtoBuf$Function)l, ((mi2.e)b).Z(), ((mi2.e)b).A());
                if (c != null) {
                    return (JvmFunctionSignature)new JvmFunctionSignature$c(c);
                }
            }
            if (l instanceof ProtoBuf$Constructor) {
                final kotlin.reflect.jvm.internal.impl.protobuf.e a3 = h.a;
                final d$b a4 = h.a((ProtoBuf$Constructor)l, ((mi2.e)b).Z(), ((mi2.e)b).A());
                if (a4 != null) {
                    final ch2.g b2 = d.b();
                    e.e((Object)b2, "possiblySubstitutedFunction.containingDeclaration");
                    Object o;
                    if (ai2.e.b(b2)) {
                        o = new JvmFunctionSignature$c(a4);
                    }
                    else {
                        o = new JvmFunctionSignature$b(a4);
                    }
                    return (JvmFunctionSignature)o;
                }
            }
            return (JvmFunctionSignature)a(a);
        }
        final boolean b3 = a instanceof JavaMethodDescriptor;
        Object b4 = null;
        ih2.r r = null;
        if (b3) {
            final e0 f = ((fh2.o)a).f();
            qh2.a a5;
            if (f instanceof qh2.a) {
                a5 = (qh2.a)f;
            }
            else {
                a5 = null;
            }
            Object b5;
            if (a5 != null) {
                b5 = a5.b();
            }
            else {
                b5 = null;
            }
            if (b5 instanceof ih2.r) {
                r = (ih2.r)b5;
            }
            if (r != null) {
                final Method a6 = r.a;
                if (a6 != null) {
                    return (JvmFunctionSignature)new JvmFunctionSignature$a(a6);
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Incorrect resolution sequence for Java method ");
            sb.append(a);
            throw new KotlinReflectionInternalError(sb.toString());
        }
        if (a instanceof mh2.b) {
            final e0 f2 = ((fh2.o)a).f();
            qh2.a a7;
            if (f2 instanceof qh2.a) {
                a7 = (qh2.a)f2;
            }
            else {
                a7 = null;
            }
            if (a7 != null) {
                b4 = a7.b();
            }
            if (!(b4 instanceof l)) {
                if (b4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a a8 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a)b4;
                    if (a8.n()) {
                        final Object o2 = new JvmFunctionSignature$FakeJavaAnnotationConstructor(a8.a);
                        return (JvmFunctionSignature)o2;
                    }
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Incorrect resolution sequence for Java constructor ");
                sb2.append(a);
                sb2.append(" (");
                sb2.append(b4);
                sb2.append(')');
                throw new KotlinReflectionInternalError(sb2.toString());
            }
            final Object o2 = new JvmFunctionSignature$JavaConstructor(((l)b4).a);
            return (JvmFunctionSignature)o2;
        }
        final boolean equals = ((ch2.g)a).getName().equals((Object)kotlin.reflect.jvm.internal.impl.builtins.e.b);
        final boolean b6 = false;
        int n = 0;
        Label_0616: {
            if (!equals || !ai2.c.j(a)) {
                if (!((ch2.g)a).getName().equals((Object)kotlin.reflect.jvm.internal.impl.builtins.e.a) || !ai2.c.j(a)) {
                    n = (b6 ? 1 : 0);
                    if (!e.a((Object)((ch2.g)a).getName(), (Object)bh2.a.e)) {
                        break Label_0616;
                    }
                    n = (b6 ? 1 : 0);
                    if (!((kotlin.reflect.jvm.internal.impl.descriptors.a)a).g().isEmpty()) {
                        break Label_0616;
                    }
                }
            }
            n = 1;
        }
        if (n != 0) {
            return (JvmFunctionSignature)a(a);
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown origin of ");
        sb3.append(a);
        sb3.append(" (");
        sb3.append(((kotlin.reflect.jvm.internal.impl.descriptors.a)a).getClass());
        sb3.append(')');
        throw new KotlinReflectionInternalError(sb3.toString());
    }
}
