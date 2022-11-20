// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import ch2.l0;
import oi2.x;
import ci2.r;
import ci2.w;
import ci2.l;
import ci2.u;
import ci2.p;
import ci2.v;
import ci2.k;
import ci2.s;
import ci2.o;
import tg2.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import ch2.e0;
import java.util.List;
import kotlin.Pair;
import ci2.j$a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument;
import ch2.m0;
import java.util.LinkedHashMap;
import dg2.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ch2.b;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import ch2.g;
import qi2.h;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p7.a;
import dh2.d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import ch2.t;

public final class c
{
    public final t a;
    public final NotFoundClasses b;
    
    public c(final t a, final NotFoundClasses b) {
        e.f((Object)a, "module");
        e.f((Object)b, "notFoundClasses");
        this.a = a;
        this.b = b;
    }
    
    public final d a(final ProtoBuf$Annotation protoBuf$Annotation, final wh2.c c) {
        e.f((Object)protoBuf$Annotation, "proto");
        e.f((Object)c, "nameResolver");
        final ch2.c c2 = FindClassInModuleKt.c(this.a, p7.a.n(c, protoBuf$Annotation.getId()), this.b);
        Map map2;
        final Map map = map2 = kotlin.collections.c.u4();
        if (protoBuf$Annotation.getArgumentCount() != 0) {
            map2 = map;
            if (!h.f((g)c2)) {
                final int a = ai2.d.a;
                map2 = map;
                if (ai2.d.n((g)c2, ClassKind.ANNOTATION_CLASS)) {
                    final Collection v = c2.V();
                    e.e((Object)v, "annotationClass.constructors");
                    final b b = (b)CollectionsKt___CollectionsKt.u5(v);
                    map2 = map;
                    if (b != null) {
                        final List g = ((kotlin.reflect.jvm.internal.impl.descriptors.a)b).g();
                        e.e((Object)g, "constructor.valueParameters");
                        int p2;
                        if ((p2 = cg.d.p3(m.u4((Iterable)g, 10))) < 16) {
                            p2 = 16;
                        }
                        final LinkedHashMap linkedHashMap = new LinkedHashMap<yh2.e, m0>(p2);
                        for (final Object next : g) {
                            linkedHashMap.put(((g)next).getName(), (m0)next);
                        }
                        final List argumentList = protoBuf$Annotation.getArgumentList();
                        final ArrayList s = aq2.a.s(argumentList, "proto.argumentList");
                        for (final ProtoBuf$Annotation$Argument protoBuf$Annotation$Argument : argumentList) {
                            e.e((Object)protoBuf$Annotation$Argument, "it");
                            final m0 m0 = linkedHashMap.get(p7.a.s(c, protoBuf$Annotation$Argument.getNameId()));
                            final Object o = null;
                            ci2.g g2 = null;
                            Object o2;
                            if (m0 == null) {
                                o2 = o;
                            }
                            else {
                                final yh2.e s2 = p7.a.s(c, protoBuf$Annotation$Argument.getNameId());
                                final oi2.t type = ((l0)m0).getType();
                                e.e((Object)type, "parameter.type");
                                final ProtoBuf$Annotation$Argument$Value value = protoBuf$Annotation$Argument.getValue();
                                e.e((Object)value, "proto.value");
                                final ci2.g<?> c3 = this.c(type, value, c);
                                if (this.b(c3, type, value)) {
                                    g2 = c3;
                                }
                                Object o3;
                                if ((o3 = g2) == null) {
                                    final StringBuilder t = a.t("Unexpected argument value: actual type ");
                                    t.append(value.getType());
                                    t.append(" != expected type ");
                                    t.append(type);
                                    final String string = t.toString();
                                    e.f((Object)string, "message");
                                    o3 = new j$a(string);
                                }
                                o2 = new Pair((Object)s2, o3);
                            }
                            if (o2 != null) {
                                s.add(o2);
                            }
                        }
                        map2 = kotlin.collections.c.E4((List)s);
                    }
                }
            }
        }
        return new d(c2.r(), map2, (e0)e0.a);
    }
    
    public final boolean b(final ci2.g<?> g, oi2.t g2, final ProtoBuf$Annotation$Argument$Value protoBuf$Annotation$Argument$Value) {
        final ProtoBuf$Annotation$Argument$Value$Type type = protoBuf$Annotation$Argument$Value.getType();
        int n;
        if (type == null) {
            n = -1;
        }
        else {
            n = c.a.a[((Enum)type).ordinal()];
        }
        boolean a = false;
        if (n != 10) {
            if (n != 13) {
                a = e.a((Object)g.a(this.a), (Object)g2);
                return a;
            }
            if (!(g instanceof ci2.b) || ((List)((ci2.g)g).a).size() != protoBuf$Annotation$Argument$Value.getArrayElementList().size()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Deserialized ArrayValue should have the same number of elements as the original array value: ");
                sb.append(g);
                throw new IllegalStateException(sb.toString().toString());
            }
            g2 = this.a.p().g(g2);
            final ci2.b b = (ci2.b)g;
            final i p3 = cg.d.P2((Collection)((ci2.g)b).a);
            if (!(p3 instanceof Collection) || !((Collection)p3).isEmpty()) {
                final tg2.h f = ((tg2.g)p3).f();
                while (f.h) {
                    final int nextInt = ((dg2.w)f).nextInt();
                    final ci2.g g3 = ((List)((ci2.g)b).a).get(nextInt);
                    final ProtoBuf$Annotation$Argument$Value arrayElement = protoBuf$Annotation$Argument$Value.getArrayElement(nextInt);
                    e.e((Object)arrayElement, "value.getArrayElement(i)");
                    if (!this.b((ci2.g<?>)g3, g2, arrayElement)) {
                        return a;
                    }
                }
            }
        }
        else {
            final ch2.e f2 = g2.I0().f();
            Object o;
            if (f2 instanceof ch2.c) {
                o = f2;
            }
            else {
                o = null;
            }
            if (o != null) {
                final yh2.e e = kotlin.reflect.jvm.internal.impl.builtins.c.e;
                if (!kotlin.reflect.jvm.internal.impl.builtins.c.c((ch2.e)o, e$a.P)) {
                    return a;
                }
            }
        }
        a = true;
        return a;
    }
    
    public final ci2.g<?> c(final oi2.t t, final ProtoBuf$Annotation$Argument$Value protoBuf$Annotation$Argument$Value, final wh2.c c) {
        e.f((Object)c, "nameResolver");
        final Boolean c2 = wh2.b.M.c(protoBuf$Annotation$Argument$Value.getFlags());
        e.e((Object)c2, "IS_UNSIGNED.get(value.flags)");
        final boolean booleanValue = c2;
        final ProtoBuf$Annotation$Argument$Value$Type type = protoBuf$Annotation$Argument$Value.getType();
        int n;
        if (type == null) {
            n = -1;
        }
        else {
            n = ki2.c.a.a[((Enum)type).ordinal()];
        }
        Object o = null;
        switch (n) {
            default: {
                final StringBuilder t2 = a.t("Unsupported annotation argument type: ");
                t2.append(protoBuf$Annotation$Argument$Value.getType());
                t2.append(" (expected ");
                t2.append(t);
                t2.append(')');
                throw new IllegalStateException(t2.toString().toString());
            }
            case 13: {
                final List arrayElementList = protoBuf$Annotation$Argument$Value.getArrayElementList();
                e.e((Object)arrayElementList, "value.arrayElementList");
                final ArrayList list = new ArrayList<ci2.g<?>>(m.u4((Iterable)arrayElementList, 10));
                for (final ProtoBuf$Annotation$Argument$Value protoBuf$Annotation$Argument$Value2 : arrayElementList) {
                    final x f = this.a.p().f();
                    e.e((Object)f, "builtIns.anyType");
                    e.e((Object)protoBuf$Annotation$Argument$Value2, "it");
                    list.add(this.c((oi2.t)f, protoBuf$Annotation$Argument$Value2, c));
                }
                o = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.b(list, t);
                break;
            }
            case 12: {
                final ProtoBuf$Annotation annotation = protoBuf$Annotation$Argument$Value.getAnnotation();
                e.e((Object)annotation, "value.annotation");
                o = new ci2.a((dh2.c)this.a(annotation, c));
                break;
            }
            case 11: {
                o = new ci2.i(p7.a.n(c, protoBuf$Annotation$Argument$Value.getClassId()), p7.a.s(c, protoBuf$Annotation$Argument$Value.getEnumValueId()));
                break;
            }
            case 10: {
                o = new o(p7.a.n(c, protoBuf$Annotation$Argument$Value.getClassId()), protoBuf$Annotation$Argument$Value.getArrayDimensionCount());
                break;
            }
            case 9: {
                o = new s(c.getString(protoBuf$Annotation$Argument$Value.getStringValue()));
                break;
            }
            case 8: {
                o = new ci2.c(protoBuf$Annotation$Argument$Value.getIntValue() != 0L);
                break;
            }
            case 7: {
                o = new ci2.h(protoBuf$Annotation$Argument$Value.getDoubleValue());
                break;
            }
            case 6: {
                o = new k(protoBuf$Annotation$Argument$Value.getFloatValue());
                break;
            }
            case 5: {
                final long intValue = protoBuf$Annotation$Argument$Value.getIntValue();
                if (booleanValue) {
                    o = new v(intValue);
                }
                else {
                    o = new p(intValue);
                }
                break;
            }
            case 4: {
                final int n2 = (int)protoBuf$Annotation$Argument$Value.getIntValue();
                if (booleanValue) {
                    o = new u(n2);
                    break;
                }
                o = new l(n2);
                break;
            }
            case 3: {
                final short n3 = (short)protoBuf$Annotation$Argument$Value.getIntValue();
                if (booleanValue) {
                    o = new w(n3);
                    break;
                }
                o = new r(n3);
                break;
            }
            case 2: {
                o = new ci2.e((char)protoBuf$Annotation$Argument$Value.getIntValue());
                break;
            }
            case 1: {
                final byte b = (byte)protoBuf$Annotation$Argument$Value.getIntValue();
                if (booleanValue) {
                    o = new ci2.t(b);
                    break;
                }
                o = new ci2.d(b);
                break;
            }
        }
        return (ci2.g<?>)o;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[ProtoBuf$Annotation$Argument$Value$Type.values().length];
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.BYTE).ordinal()] = 1;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.CHAR).ordinal()] = 2;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.SHORT).ordinal()] = 3;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.INT).ordinal()] = 4;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.LONG).ordinal()] = 5;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.FLOAT).ordinal()] = 6;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.DOUBLE).ordinal()] = 7;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.BOOLEAN).ordinal()] = 8;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.STRING).ordinal()] = 9;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.CLASS).ordinal()] = 10;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.ENUM).ordinal()] = 11;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.ANNOTATION).ordinal()] = 12;
            a2[((Enum)ProtoBuf$Annotation$Argument$Value$Type.ARRAY).ordinal()] = 13;
            a = a2;
        }
    }
}
