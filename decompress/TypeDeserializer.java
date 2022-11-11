// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ej2.c0;
import ti2.v0;
import ti2.j$a;
import pi2.v;
import pi2.w;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import ti2.t0;
import ih2.e$a;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import ti2.p0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.NoWhenBranchMatchedException;
import pi2.t$a;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import ti2.b0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import vi2.h;
import bj2.k;
import kotlin.sequences.SequencesKt__SequencesKt;
import ml0.a;
import ti2.j0$a;
import ti2.i0;
import hh2.g;
import ti2.k0;
import java.util.Collection;
import kotlin.collections.EmptyList;
import lw0.b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import ti2.n0;
import java.util.ArrayList;
import ig2.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import a4.a0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import ti2.t;
import ti2.x;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import java.util.LinkedHashMap;
import kotlin.collections.c;
import rg2.l;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import java.util.List;
import hh2.j0;
import java.util.Map;
import si2.d;
import pi2.j;

public final class TypeDeserializer
{
    public final j a;
    public final TypeDeserializer b;
    public final String c;
    public final String d;
    public final d e;
    public final d f;
    public final Map<Integer, j0> g;
    
    public TypeDeserializer(final j a, final TypeDeserializer b, final List<ProtoBuf$TypeParameter> list, final String c, final String d) {
        sg2.e.f((Object)a, "c");
        sg2.e.f((Object)list, "typeParameterProtos");
        sg2.e.f((Object)c, "debugName");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (d)a.a.a.b((l)new TypeDeserializer$classifierDescriptors$1(this));
        this.f = (d)a.a.a.b((l)new TypeDeserializer$typeAliasDescriptors$1(this));
        Map v0;
        if (list.isEmpty()) {
            v0 = kotlin.collections.c.V0();
        }
        else {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            final Iterator iterator = list.iterator();
            int n = 0;
            while (true) {
                v0 = linkedHashMap;
                if (!iterator.hasNext()) {
                    break;
                }
                final ProtoBuf$TypeParameter protoBuf$TypeParameter = (ProtoBuf$TypeParameter)iterator.next();
                linkedHashMap.put(protoBuf$TypeParameter.getId(), new DeserializedTypeParameterDescriptor(this.a, protoBuf$TypeParameter, n));
                ++n;
            }
        }
        this.g = v0;
    }
    
    public static x a(final x x, final t t) {
        final kotlin.reflect.jvm.internal.impl.builtins.c g = TypeUtilsKt.g((t)x);
        final ih2.e annotations = ((t)x).getAnnotations();
        final t w = a0.W((t)x);
        final List n = a0.N((t)x);
        final List v3 = CollectionsKt___CollectionsKt.v3(a0.d0((t)x));
        final ArrayList list = new ArrayList<t>(m.c3((Iterable)v3, 10));
        final Iterator iterator = v3.iterator();
        while (iterator.hasNext()) {
            list.add(((n0)iterator.next()).getType());
        }
        return a0.z(g, annotations, w, n, list, t, true).P0(((t)x).J0());
    }
    
    public static final ArrayList e(final TypeDeserializer typeDeserializer, ProtoBuf$Type i1) {
        final List argumentList = i1.getArgumentList();
        e.e((Object)argumentList, "argumentList");
        i1 = b.I1(i1, typeDeserializer.a.d);
        ArrayList e;
        if (i1 != null) {
            e = e(typeDeserializer, i1);
        }
        else {
            e = null;
        }
        Object instance = e;
        if (e == null) {
            instance = EmptyList.INSTANCE;
        }
        return CollectionsKt___CollectionsKt.W3((Iterable)instance, (Collection)argumentList);
    }
    
    public static ti2.j0 f(final List list, final ih2.e e, final k0 k0, final g g) {
        final ArrayList list2 = new ArrayList(m.c3((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((i0)iterator.next()).a(e));
        }
        final ArrayList d3 = m.d3((Collection)list2);
        ti2.j0.g.getClass();
        return j0$a.c((List)d3);
    }
    
    public static final hh2.c h(final TypeDeserializer typeDeserializer, final ProtoBuf$Type protoBuf$Type, int f1) {
        final di2.b h = a.H(typeDeserializer.a.b, f1);
        final List b1 = kotlin.sequences.b.B1((k)kotlin.sequences.b.s1(SequencesKt__SequencesKt.b1((l)new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(typeDeserializer), (Object)protoBuf$Type), (l)TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2.INSTANCE));
        f1 = kotlin.sequences.b.f1(SequencesKt__SequencesKt.b1((l)TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.INSTANCE, (Object)h));
        while (true) {
            final ArrayList list = (ArrayList)b1;
            if (list.size() >= f1) {
                break;
            }
            list.add(0);
        }
        return typeDeserializer.a.a.l.a(h, b1);
    }
    
    public final List<j0> b() {
        return CollectionsKt___CollectionsKt.q4((Iterable)this.g.values());
    }
    
    public final j0 c(final int n) {
        j0 c;
        if ((c = this.g.get(n)) == null) {
            final TypeDeserializer b = this.b;
            if (b != null) {
                c = b.c(n);
            }
            else {
                c = null;
            }
        }
        return c;
    }
    
    public final x d(final ProtoBuf$Type protoBuf$Type, final boolean b) {
        sg2.e.f((Object)protoBuf$Type, "proto");
        if (protoBuf$Type.hasClassName()) {
            if (ml0.a.H(this.a.b, protoBuf$Type.getClassName()).c) {
                this.a.a.g.a();
            }
        }
        else if (protoBuf$Type.hasTypeAliasName() && ml0.a.H(this.a.b, protoBuf$Type.getTypeAliasName()).c) {
            this.a.a.g.a();
        }
        final boolean hasClassName = protoBuf$Type.hasClassName();
        final boolean b2 = true;
        Object o2 = null;
        Label_0439: {
            Object o = null;
            Label_0402: {
                if (hasClassName) {
                    if ((o = ((l<Integer, hh2.e>)this.e).invoke(Integer.valueOf(protoBuf$Type.getClassName()))) == null) {
                        o = h(this, protoBuf$Type, protoBuf$Type.getClassName());
                    }
                }
                else if (protoBuf$Type.hasTypeParameter()) {
                    if ((o = this.c(protoBuf$Type.getTypeParameter())) == null) {
                        final h a = h.a;
                        o2 = h.d(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, new String[] { String.valueOf(protoBuf$Type.getTypeParameter()), this.d });
                        break Label_0439;
                    }
                }
                else {
                    if (protoBuf$Type.hasTypeParameterName()) {
                        final String string = this.a.b.getString(protoBuf$Type.getTypeParameterName());
                        while (true) {
                            for (final j0 next : this.b()) {
                                if (sg2.e.a((Object)((g)next).getName().c(), (Object)string)) {
                                    o = next;
                                    if (o == null) {
                                        final h a2 = h.a;
                                        o2 = h.d(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, new String[] { string, this.a.c.toString() });
                                        break Label_0439;
                                    }
                                    break Label_0402;
                                }
                            }
                            j0 next = null;
                            continue;
                        }
                    }
                    if (!protoBuf$Type.hasTypeAliasName()) {
                        final h a3 = h.a;
                        o2 = h.d(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
                        break Label_0439;
                    }
                    if ((o = ((l<Integer, hh2.e>)this.f).invoke(Integer.valueOf(protoBuf$Type.getTypeAliasName()))) == null) {
                        o = h(this, protoBuf$Type, protoBuf$Type.getTypeAliasName());
                    }
                }
            }
            o2 = ((hh2.e)o).m();
            sg2.e.e(o2, "classifier.typeConstructor");
        }
        if (h.f((g)((k0)o2).f())) {
            final h a4 = h.a;
            final ErrorTypeKind type_FOR_ERROR_TYPE_CONSTRUCTOR = ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
            final String string2 = o2.toString();
            sg2.e.f((Object)type_FOR_ERROR_TYPE_CONSTRUCTOR, "kind");
            return h.e(type_FOR_ERROR_TYPE_CONSTRUCTOR, (List)EmptyList.INSTANCE, (k0)o2, (String[])Arrays.copyOf(new String[] { string2 }, 1));
        }
        final ri2.a a5 = new ri2.a(this.a.a.a, (rg2.a)new TypeDeserializer$simpleType$annotations$1(this, protoBuf$Type));
        final j a6 = this.a;
        final ti2.j0 f = f(a6.a.s, (ih2.e)a5, (k0)o2, a6.c);
        final ArrayList e = e(this, protoBuf$Type);
        final ArrayList list = new ArrayList<Object>(m.c3((Iterable)e, 10));
        final Iterator iterator2 = e.iterator();
        int n = 0;
        while (iterator2.hasNext()) {
            final Object next2 = iterator2.next();
            if (n < 0) {
                b.I2();
                throw null;
            }
            final ProtoBuf$Type$Argument protoBuf$Type$Argument = (ProtoBuf$Type$Argument)next2;
            final List parameters = ((k0)o2).getParameters();
            sg2.e.e((Object)parameters, "constructor.parameters");
            final j0 j0 = (j0)CollectionsKt___CollectionsKt.D3(n, parameters);
            Object o3;
            if (protoBuf$Type$Argument.getProjection() == ProtoBuf$Type$Argument$Projection.STAR) {
                if (j0 == null) {
                    o3 = new b0(this.a.a.b.o());
                }
                else {
                    o3 = new StarProjectionImpl(j0);
                }
            }
            else {
                final ProtoBuf$Type$Argument$Projection projection = protoBuf$Type$Argument.getProjection();
                sg2.e.e((Object)projection, "typeArgumentProto.projection");
                final int n2 = t$a.d[((Enum)projection).ordinal()];
                Variance variance;
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Only IN, OUT and INV are supported. Actual argument: ");
                            sb.append(projection);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        else {
                            variance = Variance.INVARIANT;
                        }
                    }
                    else {
                        variance = Variance.OUT_VARIANCE;
                    }
                }
                else {
                    variance = Variance.IN_VARIANCE;
                }
                final bi2.e d = this.a.d;
                sg2.e.f((Object)d, "typeTable");
                ProtoBuf$Type protoBuf$Type2;
                if (protoBuf$Type$Argument.hasType()) {
                    protoBuf$Type2 = protoBuf$Type$Argument.getType();
                }
                else if (protoBuf$Type$Argument.hasTypeId()) {
                    protoBuf$Type2 = d.a(protoBuf$Type$Argument.getTypeId());
                }
                else {
                    protoBuf$Type2 = null;
                }
                if (protoBuf$Type2 == null) {
                    o3 = new p0((t)h.c(ErrorTypeKind.NO_RECORDED_TYPE, new String[] { protoBuf$Type$Argument.toString() }));
                }
                else {
                    o3 = new p0(this.g(protoBuf$Type2), variance);
                }
            }
            list.add(o3);
            ++n;
        }
        final List q4 = CollectionsKt___CollectionsKt.q4((Iterable)list);
        final hh2.e f2 = ((k0)o2).f();
        Object o4 = null;
        if (b && f2 instanceof hh2.i0) {
            final int a7 = KotlinTypeFactory.a;
            final x b3 = KotlinTypeFactory.b((hh2.i0)f2, q4);
            final ti2.j0 f3 = f(this.a.a.s, e$a.a((List)CollectionsKt___CollectionsKt.U3((Iterable)a5, (Iterable)((t)b3).getAnnotations())), (k0)o2, this.a.c);
            boolean b4 = b2;
            if (!t0.g((t)b3)) {
                b4 = (protoBuf$Type.getNullable() && b2);
            }
            o4 = b3.P0(b4).Q0(f3);
        }
        else {
            final Boolean c = bi2.b.a.c(protoBuf$Type.getFlags());
            sg2.e.e((Object)c, "SUSPEND_TYPE.get(proto.flags)");
            if (c) {
                final boolean nullable = protoBuf$Type.getNullable();
                final int n3 = ((k0)o2).getParameters().size() - q4.size();
                Label_1487: {
                    if (n3 != 0) {
                        if (n3 == 1) {
                            final int n4 = q4.size() - 1;
                            if (n4 >= 0) {
                                final k0 m = ((hh2.e)((k0)o2).o().w(n4)).m();
                                sg2.e.e((Object)m, "functionTypeConstructor.\u2026on(arity).typeConstructor");
                                o4 = KotlinTypeFactory.f(f, m, q4, nullable, null);
                                break Label_1487;
                            }
                        }
                    }
                    else {
                        final x f4 = KotlinTypeFactory.f(f, (k0)o2, q4, nullable, null);
                        final hh2.e f5 = ((t)f4).I0().f();
                        FunctionClassKind r;
                        if (f5 != null) {
                            r = a0.R(f5);
                        }
                        else {
                            r = null;
                        }
                        if (r == FunctionClassKind.Function) {
                            final n0 n5 = (n0)CollectionsKt___CollectionsKt.M3(a0.d0((t)f4));
                            if (n5 != null) {
                                final t type = n5.getType();
                                if (type != null) {
                                    final hh2.e f6 = type.I0().f();
                                    di2.c g;
                                    if (f6 != null) {
                                        g = DescriptorUtilsKt.g((g)f6);
                                    }
                                    else {
                                        g = null;
                                    }
                                    if (type.G0().size() != 1 || (!sg2.e.a((Object)g, (Object)kotlin.reflect.jvm.internal.impl.builtins.e.e) && !sg2.e.a((Object)g, (Object)w.a))) {
                                        o4 = f4;
                                        break Label_1487;
                                    }
                                    final t type2 = ((n0)CollectionsKt___CollectionsKt.b4(type.G0())).getType();
                                    sg2.e.e((Object)type2, "continuationArgumentType.arguments.single().type");
                                    Object c2;
                                    if (!((c2 = this.a.c) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
                                        c2 = null;
                                    }
                                    final kotlin.reflect.jvm.internal.impl.descriptors.a a8 = (kotlin.reflect.jvm.internal.impl.descriptors.a)c2;
                                    di2.c c3;
                                    if (a8 != null) {
                                        c3 = DescriptorUtilsKt.c((g)a8);
                                    }
                                    else {
                                        c3 = null;
                                    }
                                    if (sg2.e.a((Object)c3, (Object)v.a)) {
                                        o4 = a(f4, type2);
                                        break Label_1487;
                                    }
                                    o4 = a(f4, type2);
                                    break Label_1487;
                                }
                            }
                        }
                    }
                    o4 = null;
                }
                if (o4 == null) {
                    final h a9 = h.a;
                    o4 = h.e(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, q4, (k0)o2, new String[0]);
                }
            }
            else {
                final x f7 = KotlinTypeFactory.f(f, (k0)o2, q4, protoBuf$Type.getNullable(), null);
                final Boolean c4 = bi2.b.b.c(protoBuf$Type.getFlags());
                sg2.e.e((Object)c4, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                o4 = f7;
                if (c4) {
                    o4 = j$a.a((v0)f7, false);
                    if (o4 == null) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("null DefinitelyNotNullType for '");
                        sb2.append(f7);
                        sb2.append('\'');
                        throw new IllegalStateException(sb2.toString().toString());
                    }
                }
            }
        }
        ProtoBuf$Type protoBuf$Type3 = null;
        final bi2.e d2 = this.a.d;
        sg2.e.f((Object)d2, "typeTable");
        if (protoBuf$Type.hasAbbreviatedType()) {
            protoBuf$Type3 = protoBuf$Type.getAbbreviatedType();
        }
        else if (protoBuf$Type.hasAbbreviatedTypeId()) {
            protoBuf$Type3 = d2.a(protoBuf$Type.getAbbreviatedTypeId());
        }
        Object w4 = o4;
        if (protoBuf$Type3 != null) {
            w4 = c0.w4((x)o4, this.d(protoBuf$Type3, false));
        }
        if (protoBuf$Type.hasClassName()) {
            return this.a.a.r.a(ml0.a.H(this.a.b, protoBuf$Type.getClassName()), (x)w4);
        }
        return (x)w4;
    }
    
    public final t g(final ProtoBuf$Type protoBuf$Type) {
        sg2.e.f((Object)protoBuf$Type, "proto");
        if (protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
            final String string = this.a.b.getString(protoBuf$Type.getFlexibleTypeCapabilitiesId());
            final x d = this.d(protoBuf$Type, true);
            final bi2.e d2 = this.a.d;
            sg2.e.f((Object)d2, "typeTable");
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Type.hasFlexibleUpperBound()) {
                protoBuf$Type2 = protoBuf$Type.getFlexibleUpperBound();
            }
            else if (protoBuf$Type.hasFlexibleUpperBoundId()) {
                protoBuf$Type2 = d2.a(protoBuf$Type.getFlexibleUpperBoundId());
            }
            else {
                protoBuf$Type2 = null;
            }
            sg2.e.c((Object)protoBuf$Type2);
            return this.a.a.j.b(protoBuf$Type, string, d, this.d(protoBuf$Type2, true));
        }
        return (t)this.d(protoBuf$Type, true);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        String string;
        if (this.b == null) {
            string = "";
        }
        else {
            final StringBuilder r = a.r(". Child of ");
            r.append(this.b.c);
            string = r.toString();
        }
        sb.append(string);
        return sb.toString();
    }
}
