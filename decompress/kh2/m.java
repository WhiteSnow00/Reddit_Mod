// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import ch2.l0;
import ch2.h;
import fh2.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;
import oi2.t;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import th2.i$b;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import th2.i;
import java.util.Iterator;
import java.util.List;
import th2.i$c;
import ch2.m0;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import ch2.g;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import ch2.c;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

public final class m implements ExternalOverridabilityCondition
{
    public ExternalOverridabilityCondition$Result a(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2, final c c) {
        e.f((Object)a, "superDescriptor");
        e.f((Object)a2, "subDescriptor");
        final boolean b = a instanceof CallableMemberDescriptor;
        int n2;
        final int n = n2 = 0;
        Label_0339: {
            if (b) {
                n2 = n;
                if (a2 instanceof d) {
                    if (kotlin.reflect.jvm.internal.impl.builtins.c.A((g)a2)) {
                        n2 = n;
                    }
                    else {
                        final int m = BuiltinMethodsWithSpecialGenericSignature.m;
                        final d d = (d)a2;
                        final yh2.e name = ((g)d).getName();
                        e.e((Object)name, "subDescriptor.name");
                        if (!BuiltinMethodsWithSpecialGenericSignature.b(name)) {
                            final SpecialGenericSignatures$a a3 = SpecialGenericSignatures.a;
                            final yh2.e name2 = ((g)d).getName();
                            e.e((Object)name2, "subDescriptor.name");
                            if (!SpecialGenericSignatures.k.contains(name2)) {
                                n2 = n;
                                break Label_0339;
                            }
                        }
                        final CallableMemberDescriptor c2 = SpecialBuiltinMembers.c((CallableMemberDescriptor)a);
                        final boolean b2 = a instanceof d;
                        d d2 = null;
                        if (b2) {
                            d2 = (d)a;
                        }
                        Label_0336: {
                            if ((d2 != null && d.C0() == d2.C0()) ^ true) {
                                if (c2 == null) {
                                    break Label_0336;
                                }
                                if (!d.C0()) {
                                    break Label_0336;
                                }
                            }
                            n2 = n;
                            if (!(c instanceof mh2.c)) {
                                break Label_0339;
                            }
                            if (d.v0() != null) {
                                n2 = n;
                                break Label_0339;
                            }
                            n2 = n;
                            if (c2 == null) {
                                break Label_0339;
                            }
                            if (SpecialBuiltinMembers.d(c, c2)) {
                                n2 = n;
                                break Label_0339;
                            }
                            if (c2 instanceof d && b2 && BuiltinMethodsWithSpecialGenericSignature.a((d)c2) != null) {
                                final String i = p7.a.i(d, 2);
                                final d a4 = ((d)a).a();
                                e.e((Object)a4, "superDescriptor.original");
                                if (e.a((Object)i, (Object)p7.a.i(a4, 2))) {
                                    n2 = n;
                                    break Label_0339;
                                }
                            }
                        }
                        n2 = 1;
                    }
                }
            }
        }
        if (n2 != 0) {
            return ExternalOverridabilityCondition$Result.INCOMPATIBLE;
        }
        if (m.a.a(a, a2)) {
            return ExternalOverridabilityCondition$Result.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition$Result.UNKNOWN;
    }
    
    public ExternalOverridabilityCondition$Contract b() {
        return ExternalOverridabilityCondition$Contract.CONFLICTS_ONLY;
    }
    
    public static final class a
    {
        public static boolean a(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
            e.f((Object)a, "superDescriptor");
            e.f((Object)a2, "subDescriptor");
            if (a2 instanceof JavaMethodDescriptor) {
                if (a instanceof d) {
                    final JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor)a2;
                    ((b)javaMethodDescriptor).g().size();
                    final d d = (d)a;
                    ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).g().size();
                    final List g = ((kotlin.reflect.jvm.internal.impl.descriptors.a)((h0)javaMethodDescriptor).R0()).g();
                    e.e((Object)g, "subDescriptor.original.valueParameters");
                    final List g2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d.a()).g();
                    e.e((Object)g2, "superDescriptor.original.valueParameters");
                    for (final Pair pair : CollectionsKt___CollectionsKt.O5((Iterable)g, (Iterable)g2)) {
                        final m0 m0 = (m0)pair.component1();
                        final m0 m2 = (m0)pair.component2();
                        final d d2 = (d)a2;
                        e.e((Object)m0, "subParameter");
                        final boolean b = b(d2, m0) instanceof i$c;
                        e.e((Object)m2, "superParameter");
                        if (b != b(d, m2) instanceof i$c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        
        public static i b(final d d, final m0 m0) {
            e.f((Object)d, "f");
            final boolean a = e.a((Object)((g)d).getName().c(), (Object)"remove");
            final boolean b = false;
            final g g = null;
            boolean b3 = false;
            Label_0314: {
                if (a && ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).g().size() == 1) {
                    if (!(((h)DescriptorUtilsKt.l((CallableMemberDescriptor)d)).b() instanceof mh2.c) && !kotlin.reflect.jvm.internal.impl.builtins.c.A((g)d)) {
                        final List g2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d.a()).g();
                        e.e((Object)g2, "f.original.valueParameters");
                        final t type = ((l0)CollectionsKt___CollectionsKt.t5(g2)).getType();
                        e.e((Object)type, "f.original.valueParameters.single().type");
                        final i z = p7.a.z(type);
                        i$c i$c;
                        if (z instanceof i$c) {
                            i$c = (i$c)z;
                        }
                        else {
                            i$c = null;
                        }
                        JvmPrimitiveType i;
                        if (i$c != null) {
                            i = i$c.i;
                        }
                        else {
                            i = null;
                        }
                        if (i == JvmPrimitiveType.INT) {
                            final d a2 = BuiltinMethodsWithSpecialGenericSignature.a(d);
                            if (a2 != null) {
                                final List g3 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)a2.a()).g();
                                e.e((Object)g3, "overridden.original.valueParameters");
                                final t type2 = ((l0)CollectionsKt___CollectionsKt.t5(g3)).getType();
                                e.e((Object)type2, "overridden.original.valueParameters.single().type");
                                final i z2 = p7.a.z(type2);
                                final g b2 = a2.b();
                                e.e((Object)b2, "overridden.containingDeclaration");
                                if (e.a((Object)DescriptorUtilsKt.h(b2), (Object)e$a.J.i()) && z2 instanceof i$b && e.a((Object)((i$b)z2).i, (Object)"java/lang/Object")) {
                                    b3 = true;
                                    break Label_0314;
                                }
                            }
                        }
                    }
                }
                b3 = false;
            }
            if (!b3) {
                int n;
                if (((kotlin.reflect.jvm.internal.impl.descriptors.a)d).g().size() != 1) {
                    n = (b ? 1 : 0);
                }
                else {
                    final g b4 = d.b();
                    Object o;
                    if (b4 instanceof c) {
                        o = b4;
                    }
                    else {
                        o = null;
                    }
                    if (o == null) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        final List g4 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).g();
                        e.e((Object)g4, "f.valueParameters");
                        final ch2.e f = ((l0)CollectionsKt___CollectionsKt.t5(g4)).getType().I0().f();
                        Object o2 = g;
                        if (f instanceof c) {
                            o2 = f;
                        }
                        if (o2 == null) {
                            n = (b ? 1 : 0);
                        }
                        else {
                            final boolean b5 = kotlin.reflect.jvm.internal.impl.builtins.c.u((g)o) != null;
                            n = (b ? 1 : 0);
                            if (b5) {
                                n = (b ? 1 : 0);
                                if (e.a((Object)DescriptorUtilsKt.g((g)o), (Object)DescriptorUtilsKt.g((g)o2))) {
                                    n = 1;
                                }
                            }
                        }
                    }
                }
                if (n == 0) {
                    final t type3 = ((l0)m0).getType();
                    e.e((Object)type3, "valueParameterDescriptor.type");
                    return p7.a.z(type3);
                }
            }
            final t type4 = ((l0)m0).getType();
            e.e((Object)type4, "valueParameterDescriptor.type");
            return p7.a.z((t)TypeUtilsKt.l(type4));
        }
    }
}
