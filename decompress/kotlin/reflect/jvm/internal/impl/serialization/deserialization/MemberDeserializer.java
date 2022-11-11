// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bi2.b$c;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kh2.h0;
import ti2.x;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import ih2.d;
import ri2.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import bi2.b$b;
import bi2.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.collections.CollectionsKt___CollectionsKt;
import hh2.m0;
import hh2.c0;
import kh2.f0;
import hh2.b0;
import hh2.a0;
import hh2.j0;
import java.util.Iterator;
import java.util.ArrayList;
import hh2.d0;
import kh2.g0;
import pi2.t;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import bi2.f;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import hh2.m;
import pi2.u;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import java.util.List;
import kh2.o;
import kotlin.collections.EmptyList;
import hh2.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import rg2.a;
import ih2.e$a;
import bi2.b;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import pi2.s$b;
import hh2.v;
import pi2.s;
import hh2.g;
import pi2.h;
import sg2.e;
import pi2.c;
import pi2.j;

public final class MemberDeserializer
{
    public final j a;
    public final c b;
    
    public MemberDeserializer(final j a) {
        e.f((Object)a, "c");
        this.a = a;
        final h a2 = a.a;
        this.b = new c(a2.b, a2.l);
    }
    
    public final s a(final g g) {
        Object b;
        if (g instanceof v) {
            final di2.c d = ((v)g).d();
            final j a = this.a;
            b = new s$b(d, a.b, a.d, a.g);
        }
        else if (g instanceof DeserializedClassDescriptor) {
            b = ((DeserializedClassDescriptor)g).B;
        }
        else {
            b = null;
        }
        return (s)b;
    }
    
    public final ih2.e b(final l l, final int n, final AnnotatedCallableKind annotatedCallableKind) {
        if (!bi2.b.c.c(n)) {
            return (ih2.e)e$a.a;
        }
        return (ih2.e)new ri2.j(this.a.a.a, (a)new MemberDeserializer$getAnnotations$1(this, l, annotatedCallableKind));
    }
    
    public final ih2.e c(final ProtoBuf$Property protoBuf$Property, final boolean b) {
        if (!b.c.c(protoBuf$Property.getFlags())) {
            return (ih2.e)e$a.a;
        }
        return (ih2.e)new ri2.j(this.a.a.a, (a)new MemberDeserializer$getPropertyFieldAnnotations$1(this, b, protoBuf$Property));
    }
    
    public final ri2.c d(final ProtoBuf$Constructor protoBuf$Constructor, final boolean b) {
        final g c = this.a.c;
        e.d((Object)c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        final hh2.c c2 = (hh2.c)c;
        final int flags = protoBuf$Constructor.getFlags();
        final AnnotatedCallableKind function = AnnotatedCallableKind.FUNCTION;
        final ih2.e b2 = this.b((l)protoBuf$Constructor, flags, function);
        final CallableMemberDescriptor$Kind declaration = CallableMemberDescriptor$Kind.DECLARATION;
        final j a = this.a;
        final ri2.c c3 = new ri2.c(c2, (kotlin.reflect.jvm.internal.impl.descriptors.b)null, b2, b, declaration, protoBuf$Constructor, a.b, a.d, a.e, a.g, (e0)null);
        final MemberDeserializer i = j.b(this.a, (o)c3, (List)EmptyList.INSTANCE).i;
        final List valueParameterList = protoBuf$Constructor.getValueParameterList();
        e.e((Object)valueParameterList, "proto.valueParameterList");
        ((kh2.j)c3).R0((List)i.h(valueParameterList, (l)protoBuf$Constructor, function), (m)u.a((ProtoBuf$Visibility)b.d.c(protoBuf$Constructor.getFlags())));
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)c3).O0(c2.q());
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)c3).w = ((hh2.s)c2).q0();
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)c3).B = (b.n.c(protoBuf$Constructor.getFlags()) ^ true);
        return c3;
    }
    
    public final ri2.h e(final ProtoBuf$Function protoBuf$Function) {
        e.f((Object)protoBuf$Function, "proto");
        int flags;
        if (protoBuf$Function.hasFlags()) {
            flags = protoBuf$Function.getFlags();
        }
        else {
            final int oldFlags = protoBuf$Function.getOldFlags();
            flags = (oldFlags >> 8 << 6) + (oldFlags & 0x3F);
        }
        final AnnotatedCallableKind function = AnnotatedCallableKind.FUNCTION;
        final ih2.e b = this.b((l)protoBuf$Function, flags, function);
        Object a;
        if (protoBuf$Function.hasReceiverType() || protoBuf$Function.hasReceiverTypeId()) {
            a = new ri2.a(this.a.a.a, (a)new MemberDeserializer$getReceiverParameterAnnotations$1(this, (l)protoBuf$Function, function));
        }
        else {
            a = e$a.a;
        }
        f f;
        if (e.a((Object)DescriptorUtilsKt.g(this.a.c).c(ml0.a.M(this.a.b, protoBuf$Function.getName())), (Object)pi2.v.a)) {
            f = bi2.f.b;
        }
        else {
            f = this.a.e;
        }
        final j a2 = this.a;
        final g c = a2.c;
        final di2.e m = ml0.a.M(a2.b, protoBuf$Function.getName());
        final CallableMemberDescriptor$Kind b2 = u.b((ProtoBuf$MemberKind)bi2.b.o.c(flags));
        final j a3 = this.a;
        final ri2.h h = new ri2.h(c, (kotlin.reflect.jvm.internal.impl.descriptors.f)null, b, m, b2, protoBuf$Function, a3.b, a3.d, f, a3.g, (e0)null);
        final j a4 = this.a;
        final List typeParameterList = protoBuf$Function.getTypeParameterList();
        e.e((Object)typeParameterList, "proto.typeParameterList");
        final j b3 = j.b(a4, (o)h, typeParameterList);
        final ProtoBuf$Type v1 = lw0.b.V1(protoBuf$Function, this.a.d);
        g0 g2 = null;
        Label_0336: {
            if (v1 != null) {
                final ti2.t g = b3.h.g(v1);
                if (g != null) {
                    g2 = fi2.c.g((kotlin.reflect.jvm.internal.impl.descriptors.a)h, g, (ih2.e)a);
                    break Label_0336;
                }
            }
            g2 = null;
        }
        final g c2 = this.a.c;
        hh2.c c3;
        if (c2 instanceof hh2.c) {
            c3 = (hh2.c)c2;
        }
        else {
            c3 = null;
        }
        d0 t;
        if (c3 != null) {
            t = c3.T();
        }
        else {
            t = null;
        }
        final List contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
        final ArrayList i = android.support.v4.media.a.m(contextReceiverTypeList, "proto.contextReceiverTypeList");
        for (final ProtoBuf$Type protoBuf$Type : contextReceiverTypeList) {
            e.e((Object)protoBuf$Type, "it");
            final g0 b4 = fi2.c.b((kotlin.reflect.jvm.internal.impl.descriptors.a)h, b3.h.g(protoBuf$Type), (ih2.e)e$a.a);
            if (b4 != null) {
                i.add(b4);
            }
        }
        final List<j0> b5 = b3.h.b();
        final MemberDeserializer j = b3.i;
        final List valueParameterList = protoBuf$Function.getValueParameterList();
        e.e((Object)valueParameterList, "proto.valueParameterList");
        ((h0)h).T0(g2, t, (List)i, (List)b5, (List)j.h(valueParameterList, (l)protoBuf$Function, AnnotatedCallableKind.FUNCTION), b3.h.g(lw0.b.h2(protoBuf$Function, this.a.d)), pi2.t.a((ProtoBuf$Modality)bi2.b.e.c(flags)), (m)u.a((ProtoBuf$Visibility)bi2.b.d.c(flags)), kotlin.collections.c.V0());
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)h).r = b.s(bi2.b.p, flags, "IS_OPERATOR.get(flags)");
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)h).s = b.s(bi2.b.q, flags, "IS_INFIX.get(flags)");
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)h).t = b.s(bi2.b.t, flags, "IS_EXTERNAL_FUNCTION.get(flags)");
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)h).u = b.s(bi2.b.r, flags, "IS_INLINE.get(flags)");
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)h).v = b.s(bi2.b.s, flags, "IS_TAILREC.get(flags)");
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)h).A = b.s(bi2.b.u, flags, "IS_SUSPEND.get(flags)");
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)h).w = b.s(bi2.b.v, flags, "IS_EXPECT_FUNCTION.get(flags)");
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)h).B = (bi2.b.w.c(flags) ^ true);
        final j a5 = this.a;
        a5.a.m.a(protoBuf$Function, h, a5.d, b3.h);
        return h;
    }
    
    public final ri2.g f(final ProtoBuf$Property protoBuf$Property) {
        e.f((Object)protoBuf$Property, "proto");
        int flags;
        if (protoBuf$Property.hasFlags()) {
            flags = protoBuf$Property.getFlags();
        }
        else {
            final int oldFlags = protoBuf$Property.getOldFlags();
            flags = (oldFlags >> 8 << 6) + (oldFlags & 0x3F);
        }
        final g c = this.a.c;
        final ih2.e b = this.b((l)protoBuf$Property, flags, AnnotatedCallableKind.PROPERTY);
        final Modality a = t.a((ProtoBuf$Modality)bi2.b.e.c(flags));
        final hh2.l a2 = u.a((ProtoBuf$Visibility)bi2.b.d.c(flags));
        final boolean s = b.s(bi2.b.x, flags, "IS_VAR.get(flags)");
        final di2.e m = ml0.a.M(this.a.b, protoBuf$Property.getName());
        final CallableMemberDescriptor$Kind b2 = u.b((ProtoBuf$MemberKind)bi2.b.o.c(flags));
        final boolean s2 = b.s(bi2.b.B, flags, "IS_LATEINIT.get(flags)");
        final boolean s3 = b.s(bi2.b.A, flags, "IS_CONST.get(flags)");
        final boolean s4 = b.s(bi2.b.D, flags, "IS_EXTERNAL_PROPERTY.get(flags)");
        final boolean s5 = b.s(bi2.b.E, flags, "IS_DELEGATED.get(flags)");
        final boolean s6 = b.s(bi2.b.F, flags, "IS_EXPECT_PROPERTY.get(flags)");
        final j a3 = this.a;
        final ri2.g g = new ri2.g(c, (a0)null, b, a, (m)a2, s, m, b2, s2, s3, s4, s5, s6, protoBuf$Property, a3.b, a3.d, a3.e, a3.g);
        final j a4 = this.a;
        final List typeParameterList = protoBuf$Property.getTypeParameterList();
        e.e((Object)typeParameterList, "proto.typeParameterList");
        final j b3 = j.b(a4, (o)g, typeParameterList);
        final boolean s7 = b.s(bi2.b.y, flags, "HAS_GETTER.get(flags)");
        boolean b4 = false;
        Object a5 = null;
        Label_0365: {
            if (s7) {
                if (protoBuf$Property.hasReceiverType() || protoBuf$Property.hasReceiverTypeId()) {
                    b4 = true;
                }
                if (b4) {
                    a5 = new ri2.a(this.a.a.a, (a)new MemberDeserializer$getReceiverParameterAnnotations$1(this, (l)protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER));
                    break Label_0365;
                }
            }
            a5 = e$a.a;
        }
        final ti2.t g2 = b3.h.g(lw0.b.i2(protoBuf$Property, this.a.d));
        final List<j0> b5 = b3.h.b();
        final g c2 = this.a.c;
        hh2.c c3;
        if (c2 instanceof hh2.c) {
            c3 = (hh2.c)c2;
        }
        else {
            c3 = null;
        }
        d0 t;
        if (c3 != null) {
            t = c3.T();
        }
        else {
            t = null;
        }
        final bi2.e d = this.a.d;
        e.f((Object)d, "typeTable");
        ProtoBuf$Type protoBuf$Type;
        if (protoBuf$Property.hasReceiverType()) {
            protoBuf$Type = protoBuf$Property.getReceiverType();
        }
        else if (protoBuf$Property.hasReceiverTypeId()) {
            protoBuf$Type = d.a(protoBuf$Property.getReceiverTypeId());
        }
        else {
            protoBuf$Type = null;
        }
        g0 g4 = null;
        Label_0545: {
            if (protoBuf$Type != null) {
                final ti2.t g3 = b3.h.g(protoBuf$Type);
                if (g3 != null) {
                    g4 = fi2.c.g((kotlin.reflect.jvm.internal.impl.descriptors.a)g, g3, (ih2.e)a5);
                    break Label_0545;
                }
            }
            g4 = null;
        }
        final List contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
        e.e((Object)contextReceiverTypeList, "proto.contextReceiverTypeList");
        final ArrayList list = new ArrayList<g0>(ig2.m.c3((Iterable)contextReceiverTypeList, 10));
        for (final ProtoBuf$Type protoBuf$Type2 : contextReceiverTypeList) {
            e.e((Object)protoBuf$Type2, "it");
            list.add(fi2.c.b((kotlin.reflect.jvm.internal.impl.descriptors.a)g, b3.h.g(protoBuf$Type2), (ih2.e)e$a.a));
        }
        ((kh2.d0)g).L0(g2, (List)b5, t, g4, (List)list);
        final b$a c4 = bi2.b.c;
        final boolean s8 = b.s(c4, flags, "HAS_ANNOTATIONS.get(flags)");
        final b$b d2 = bi2.b.d;
        final ProtoBuf$Visibility protoBuf$Visibility = (ProtoBuf$Visibility)d2.c(flags);
        final b$b e = bi2.b.e;
        final ProtoBuf$Modality protoBuf$Modality = (ProtoBuf$Modality)e.c(flags);
        if (protoBuf$Visibility == null) {
            bi2.b.a(10);
            throw null;
        }
        if (protoBuf$Modality != null) {
            final int d3 = c4.d(Boolean.valueOf(s8));
            final int number = ((Internal.a)protoBuf$Modality).getNumber();
            final int a6 = ((b$c)e).a;
            final int number2 = ((Internal.a)protoBuf$Visibility).getNumber();
            final int a7 = ((b$c)d2).a;
            final b$a j = bi2.b.J;
            final Boolean false = Boolean.FALSE;
            final int d4 = j.d(false);
            final b$a k = bi2.b.K;
            final int d5 = k.d(false);
            final b$a l = bi2.b.L;
            int setterFlags = d3 | number << a6 | number2 << a7 | d4 | d5 | l.d(false);
            kh2.e0 c5;
            if (s7) {
                int getterFlags;
                if (protoBuf$Property.hasGetterFlags()) {
                    getterFlags = protoBuf$Property.getGetterFlags();
                }
                else {
                    getterFlags = setterFlags;
                }
                final boolean s9 = b.s(j, getterFlags, "IS_NOT_DEFAULT.get(getterFlags)");
                final boolean s10 = b.s(k, getterFlags, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
                final boolean s11 = b.s(l, getterFlags, "IS_INLINE_ACCESSOR.get(getterFlags)");
                final ih2.e b6 = this.b((l)protoBuf$Property, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
                if (s9) {
                    c5 = new kh2.e0((a0)g, b6, pi2.t.a((ProtoBuf$Modality)e.c(getterFlags)), (m)u.a((ProtoBuf$Visibility)d2.c(getterFlags)), s9 ^ true, s10, s11, ((kh2.d0)g).getKind(), (b0)null, (e0)e0.a);
                }
                else {
                    c5 = fi2.c.c((a0)g, b6);
                }
                c5.I0(((kh2.d0)g).getReturnType());
            }
            else {
                c5 = null;
            }
            f0 d6;
            if (b.s(bi2.b.z, flags, "HAS_SETTER.get(flags)")) {
                if (protoBuf$Property.hasSetterFlags()) {
                    setterFlags = protoBuf$Property.getSetterFlags();
                }
                final boolean s12 = b.s(j, setterFlags, "IS_NOT_DEFAULT.get(setterFlags)");
                final boolean s13 = b.s(k, setterFlags, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
                final boolean s14 = b.s(l, setterFlags, "IS_INLINE_ACCESSOR.get(setterFlags)");
                final AnnotatedCallableKind property_SETTER = AnnotatedCallableKind.PROPERTY_SETTER;
                final ih2.e b7 = this.b((l)protoBuf$Property, setterFlags, property_SETTER);
                if (s12) {
                    final f0 f0 = new f0((a0)g, b7, pi2.t.a((ProtoBuf$Modality)e.c(setterFlags)), (m)u.a((ProtoBuf$Visibility)d2.c(setterFlags)), s12 ^ true, s13, s14, ((kh2.d0)g).getKind(), (c0)null, (e0)e0.a);
                    final m0 r = (m0)CollectionsKt___CollectionsKt.b4((List)pi2.j.b(b3, (o)f0, (List)EmptyList.INSTANCE).i.h(lw0.b.r1((Object)protoBuf$Property.getSetterValueParameter()), (l)protoBuf$Property, property_SETTER));
                    if (r == null) {
                        kh2.f0.F(6);
                        throw null;
                    }
                    f0.r = r;
                    d6 = f0;
                }
                else {
                    d6 = fi2.c.d((a0)g, b7);
                }
            }
            else {
                d6 = null;
            }
            if (b.s(bi2.b.C, flags, "HAS_CONSTANT.get(flags)")) {
                ((kh2.m0)g).E0((si2.f)null, (a)new MemberDeserializer$loadProperty$4(this, protoBuf$Property, g));
            }
            final g c6 = this.a.c;
            hh2.c c7;
            if (c6 instanceof hh2.c) {
                c7 = (hh2.c)c6;
            }
            else {
                c7 = null;
            }
            ClassKind kind;
            if (c7 != null) {
                kind = c7.getKind();
            }
            else {
                kind = null;
            }
            if (kind == ClassKind.ANNOTATION_CLASS) {
                ((kh2.m0)g).E0((si2.f)null, (a)new MemberDeserializer$loadProperty$5(this, protoBuf$Property, g));
            }
            ((kh2.d0)g).J0(c5, d6, (hh2.o)new kh2.s((kh2.d0)g, this.c(protoBuf$Property, false)), (hh2.o)new kh2.s((kh2.d0)g, this.c(protoBuf$Property, true)));
            return g;
        }
        bi2.b.a(11);
        throw null;
    }
    
    public final i g(final ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        e.f((Object)protoBuf$TypeAlias, "proto");
        final List annotationList = protoBuf$TypeAlias.getAnnotationList();
        e.e((Object)annotationList, "proto.annotationList");
        final ArrayList list = new ArrayList<d>(ig2.m.c3((Iterable)annotationList, 10));
        for (final ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
            final c b = this.b;
            e.e((Object)protoBuf$Annotation, "it");
            list.add(b.a(protoBuf$Annotation, this.a.b));
        }
        final ih2.e a = e$a.a((List)list);
        final hh2.l a2 = u.a((ProtoBuf$Visibility)bi2.b.d.c(protoBuf$TypeAlias.getFlags()));
        final j a3 = this.a;
        final si2.h a4 = a3.a.a;
        final g c = a3.c;
        final di2.e m = ml0.a.M(a3.b, protoBuf$TypeAlias.getName());
        final j a5 = this.a;
        final i i = new i(a4, c, a, m, (m)a2, protoBuf$TypeAlias, a5.b, a5.d, a5.e, a5.g);
        final j a6 = this.a;
        final List typeParameterList = protoBuf$TypeAlias.getTypeParameterList();
        e.e((Object)typeParameterList, "proto.typeParameterList");
        final j b2 = j.b(a6, (o)i, typeParameterList);
        final List<j0> b3 = b2.h.b();
        final TypeDeserializer h = b2.h;
        final bi2.e d = this.a.d;
        e.f((Object)d, "typeTable");
        ProtoBuf$Type protoBuf$Type;
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            protoBuf$Type = protoBuf$TypeAlias.getUnderlyingType();
            e.e((Object)protoBuf$Type, "underlyingType");
        }
        else {
            if (!protoBuf$TypeAlias.hasUnderlyingTypeId()) {
                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
            }
            protoBuf$Type = d.a(protoBuf$TypeAlias.getUnderlyingTypeId());
        }
        final x d2 = h.d(protoBuf$Type, false);
        final TypeDeserializer h2 = b2.h;
        final bi2.e d3 = this.a.d;
        e.f((Object)d3, "typeTable");
        ProtoBuf$Type protoBuf$Type2;
        if (protoBuf$TypeAlias.hasExpandedType()) {
            protoBuf$Type2 = protoBuf$TypeAlias.getExpandedType();
            e.e((Object)protoBuf$Type2, "expandedType");
        }
        else {
            if (!protoBuf$TypeAlias.hasExpandedTypeId()) {
                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
            }
            protoBuf$Type2 = d3.a(protoBuf$TypeAlias.getExpandedTypeId());
        }
        i.G0((List)b3, d2, h2.d(protoBuf$Type2, false));
        return i;
    }
    
    public final List<m0> h(final List<ProtoBuf$ValueParameter> list, final l l, final AnnotatedCallableKind annotatedCallableKind) {
        final g c = this.a.c;
        e.d((Object)c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        final kotlin.reflect.jvm.internal.impl.descriptors.a a = (kotlin.reflect.jvm.internal.impl.descriptors.a)c;
        final g b = ((hh2.h)a).b();
        e.e((Object)b, "callableDescriptor.containingDeclaration");
        final s a2 = this.a(b);
        final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.impl.d>(ig2.m.c3((Iterable)list, 10));
        final Iterator<Object> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ProtoBuf$ValueParameter next = iterator.next();
            if (n < 0) {
                lw0.b.I2();
                throw null;
            }
            final ProtoBuf$ValueParameter protoBuf$ValueParameter = next;
            int flags;
            if (protoBuf$ValueParameter.hasFlags()) {
                flags = protoBuf$ValueParameter.getFlags();
            }
            else {
                flags = 0;
            }
            Object a3;
            if (a2 != null && b.s(bi2.b.c, flags, "HAS_ANNOTATIONS.get(flags)")) {
                a3 = new ri2.j(this.a.a.a, (a)new MemberDeserializer$valueParameters$1$annotations$1(this, a2, l, annotatedCallableKind, n, protoBuf$ValueParameter));
            }
            else {
                a3 = e$a.a;
            }
            final di2.e m = ml0.a.M(this.a.b, protoBuf$ValueParameter.getName());
            final j a4 = this.a;
            final ti2.t g = a4.h.g(lw0.b.W2(protoBuf$ValueParameter, a4.d));
            final boolean s = b.s(bi2.b.G, flags, "DECLARES_DEFAULT_VALUE.get(flags)");
            final boolean s2 = b.s(bi2.b.H, flags, "IS_CROSSINLINE.get(flags)");
            final boolean s3 = b.s(bi2.b.I, flags, "IS_NOINLINE.get(flags)");
            final bi2.e d = this.a.d;
            e.f((Object)d, "typeTable");
            ProtoBuf$Type protoBuf$Type;
            if (protoBuf$ValueParameter.hasVarargElementType()) {
                protoBuf$Type = protoBuf$ValueParameter.getVarargElementType();
            }
            else if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
                protoBuf$Type = d.a(protoBuf$ValueParameter.getVarargElementTypeId());
            }
            else {
                protoBuf$Type = null;
            }
            ti2.t g2;
            if (protoBuf$Type != null) {
                g2 = this.a.h.g(protoBuf$Type);
            }
            else {
                g2 = null;
            }
            list2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.d(a, (m0)null, n, (ih2.e)a3, m, g, s, s2, s3, g2, (e0)e0.a));
            ++n;
        }
        return CollectionsKt___CollectionsKt.q4((Iterable)list2);
    }
}
