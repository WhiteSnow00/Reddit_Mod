// 
// Decompiled by Procyon v0.6.0
// 

package wg2;

import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import ci2.q;
import ci2.o$a$a;
import ci2.o$a$b;
import ci2.o$a;
import ci2.i;
import java.lang.reflect.Array;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import oi2.o0;
import kotlin.NoWhenBranchMatchedException;
import th2.l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import th2.n;
import java.util.Set;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import java.lang.reflect.Method;
import kotlin.Pair;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import yh2.b;
import ch2.d0;
import ch2.t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import wh2.f;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import mg2.p;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import ih2.m;
import ch2.e0;
import java.util.Iterator;
import java.util.Collection;
import dg2.o;
import ng2.j;
import java.lang.annotation.Annotation;
import ih2.d;
import hh2.g;
import ng2.e;
import java.util.ArrayList;
import dh2.a;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KCallableImpl;
import yh2.c;

public final class k
{
    public static final c a;
    
    static {
        a = new c("kotlin.jvm.JvmStatic");
    }
    
    public static final KCallableImpl<?> a(final Object o) {
        KCallableImpl kCallableImpl;
        if (o instanceof KCallableImpl) {
            kCallableImpl = (KCallableImpl)o;
        }
        else {
            kCallableImpl = null;
        }
        Object o2 = kCallableImpl;
        if (kCallableImpl == null) {
            o2 = b(o);
            if (o2 == null) {
                o2 = c(o);
            }
        }
        return (KCallableImpl<?>)o2;
    }
    
    public static final KFunctionImpl b(final Object o) {
        final boolean b = o instanceof KFunctionImpl;
        final KFunctionImpl kFunctionImpl = null;
        KFunctionImpl kFunctionImpl2;
        if (b) {
            kFunctionImpl2 = (KFunctionImpl)o;
        }
        else {
            kFunctionImpl2 = null;
        }
        KFunctionImpl kFunctionImpl3;
        if (kFunctionImpl2 == null) {
            Object o2;
            if (o instanceof FunctionReference) {
                o2 = o;
            }
            else {
                o2 = null;
            }
            Object compute;
            if (o2 != null) {
                compute = ((CallableReference)o2).compute();
            }
            else {
                compute = null;
            }
            kFunctionImpl3 = kFunctionImpl;
            if (compute instanceof KFunctionImpl) {
                kFunctionImpl3 = (KFunctionImpl)compute;
            }
        }
        else {
            kFunctionImpl3 = kFunctionImpl2;
        }
        return kFunctionImpl3;
    }
    
    public static final KPropertyImpl<?> c(final Object o) {
        final boolean b = o instanceof KPropertyImpl;
        final KPropertyImpl<?> kPropertyImpl = null;
        KPropertyImpl kPropertyImpl2;
        if (b) {
            kPropertyImpl2 = (KPropertyImpl)o;
        }
        else {
            kPropertyImpl2 = null;
        }
        KPropertyImpl kPropertyImpl3;
        if (kPropertyImpl2 == null) {
            Object o2;
            if (o instanceof PropertyReference) {
                o2 = o;
            }
            else {
                o2 = null;
            }
            Object compute;
            if (o2 != null) {
                compute = ((CallableReference)o2).compute();
            }
            else {
                compute = null;
            }
            kPropertyImpl3 = kPropertyImpl;
            if (compute instanceof KPropertyImpl) {
                kPropertyImpl3 = (KPropertyImpl)compute;
            }
        }
        else {
            kPropertyImpl3 = kPropertyImpl2;
        }
        return (KPropertyImpl<?>)kPropertyImpl3;
    }
    
    public static final ArrayList d(final dh2.a a) {
        e.f((Object)a, "<this>");
        final dh2.e annotations = a.getAnnotations();
        final ArrayList list = new ArrayList();
        for (final dh2.c c : annotations) {
            final e0 f = c.f();
            final boolean b = f instanceof hh2.a;
            Annotation annotation = null;
            if (b) {
                annotation = ((hh2.a)f).b;
            }
            else if (f instanceof g.a) {
                final m b2 = ((g.a)f).b;
                d d;
                if (b2 instanceof d) {
                    d = (d)b2;
                }
                else {
                    d = null;
                }
                if (d != null) {
                    annotation = d.a;
                }
            }
            else {
                annotation = i(c);
            }
            if (annotation != null) {
                list.add(annotation);
            }
        }
        boolean b3 = false;
        Label_0205: {
            if (!list.isEmpty()) {
                final Iterator iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    if (e.a((Object)p7.a.p(p7.a.m((Annotation)iterator2.next())).getSimpleName(), (Object)"Container")) {
                        b3 = true;
                        break Label_0205;
                    }
                }
            }
            b3 = false;
        }
        ArrayList list2 = list;
        if (b3) {
            final ArrayList list3 = new ArrayList();
            for (final Annotation annotation2 : list) {
                final Class p = p7.a.p(p7.a.m(annotation2));
                List list4;
                if (e.a((Object)p.getSimpleName(), (Object)"Container") && p.getAnnotation(j.class) != null) {
                    final Object invoke = p.getDeclaredMethod("value", (Class[])new Class[0]).invoke(annotation2, new Object[0]);
                    e.d(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                    list4 = dg2.j.K1((Object[])invoke);
                }
                else {
                    list4 = cg.d.l3((Object)annotation2);
                }
                o.B4((Iterable)list4, (Collection)list3);
            }
            list2 = list3;
        }
        return list2;
    }
    
    public static final Object e(final Type type) {
        Serializable s;
        if (type instanceof Class && ((Class)type).isPrimitive()) {
            if (e.a((Object)type, (Object)Boolean.TYPE)) {
                s = Boolean.FALSE;
            }
            else if (e.a((Object)type, (Object)Character.TYPE)) {
                s = '\0';
            }
            else if (e.a((Object)type, (Object)Byte.TYPE)) {
                s = 0;
            }
            else if (e.a((Object)type, (Object)Short.TYPE)) {
                s = 0;
            }
            else if (e.a((Object)type, (Object)Integer.TYPE)) {
                s = 0;
            }
            else if (e.a((Object)type, (Object)Float.TYPE)) {
                s = 0.0f;
            }
            else if (e.a((Object)type, (Object)Long.TYPE)) {
                s = 0L;
            }
            else if (e.a((Object)type, (Object)Double.TYPE)) {
                s = 0.0;
            }
            else {
                if (e.a((Object)type, (Object)Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown primitive: ");
                sb.append(type);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        else {
            s = null;
        }
        return s;
    }
    
    public static final kotlin.reflect.jvm.internal.impl.descriptors.a f(final Class clazz, final GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage, final wh2.c c, final wh2.e e, final wh2.a a, final p p6) {
        e.f((Object)clazz, "moduleAnchor");
        e.f((Object)generatedMessageLite$ExtendableMessage, "proto");
        e.f((Object)c, "nameResolver");
        e.f((Object)e, "typeTable");
        e.f((Object)a, "metadataVersion");
        e.f((Object)p6, "createDescriptor");
        final hh2.f a2 = h.a(clazz);
        List list;
        if (generatedMessageLite$ExtendableMessage instanceof ProtoBuf$Function) {
            list = ((ProtoBuf$Function)generatedMessageLite$ExtendableMessage).getTypeParameterList();
        }
        else {
            if (!(generatedMessageLite$ExtendableMessage instanceof ProtoBuf$Property)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported message: ");
                sb.append(generatedMessageLite$ExtendableMessage);
                throw new IllegalStateException(sb.toString().toString());
            }
            list = ((ProtoBuf$Property)generatedMessageLite$ExtendableMessage).getTypeParameterList();
        }
        final ki2.h a3 = a2.a;
        final t b = a3.b;
        final f b2 = f.b;
        e.e((Object)list, "typeParameters");
        return (kotlin.reflect.jvm.internal.impl.descriptors.a)p6.invoke((Object)new MemberDeserializer(new ki2.j(a3, c, (ch2.g)b, e, b2, a, null, null, list)), (Object)generatedMessageLite$ExtendableMessage);
    }
    
    public static final d0 g(final kotlin.reflect.jvm.internal.impl.descriptors.a a) {
        e.f((Object)a, "<this>");
        d0 u;
        if (a.b0() != null) {
            final ch2.g b = ((ch2.h)a).b();
            e.d((Object)b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            u = ((ch2.c)b).U();
        }
        else {
            u = null;
        }
        return u;
    }
    
    public static final Class<?> h(final ClassLoader classLoader, b b, final int n) {
        final String a = bh2.c.a;
        final yh2.d i = b.b().i();
        e.e((Object)i, "kotlinClassId.asSingleFqName().toUnsafe()");
        final b g = bh2.c.g(i);
        if (g != null) {
            b = g;
        }
        final String b2 = b.h().b();
        e.e((Object)b2, "javaClassId.packageFqName.asString()");
        final String b3 = b.i().b();
        e.e((Object)b3, "javaClassId.relativeClassName.asString()");
        if (e.a((Object)b2, (Object)"kotlin")) {
            switch (b3) {
                case "LongArray": {
                    final Serializable w0 = long[].class;
                    return (Class<?>)w0;
                }
                case "FloatArray": {
                    final Serializable w0 = float[].class;
                    return (Class<?>)w0;
                }
                case "IntArray": {
                    final Serializable w0 = int[].class;
                    return (Class<?>)w0;
                }
                case "Array": {
                    final Serializable w0 = Object[].class;
                    return (Class<?>)w0;
                }
                case "DoubleArray": {
                    final Serializable w0 = double[].class;
                    return (Class<?>)w0;
                }
                case "ByteArray": {
                    final Serializable w0 = byte[].class;
                    return (Class<?>)w0;
                }
                case "CharArray": {
                    final Serializable w0 = char[].class;
                    return (Class<?>)w0;
                }
                case "ShortArray": {
                    final Serializable w0 = short[].class;
                    return (Class<?>)w0;
                }
                case "BooleanArray": {
                    final Serializable w0 = boolean[].class;
                    return (Class<?>)w0;
                }
                default:
                    break;
            }
        }
        final StringBuilder n2 = android.support.v4.media.a.n(b2, '.');
        n2.append(xi2.j.F0(b3, '.', '$'));
        String s = n2.toString();
        if (n > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(xi2.j.D0(n, "["));
            sb.append('L');
            sb.append(s);
            sb.append(';');
            s = sb.toString();
        }
        final Serializable w0 = zg.a.w0(classLoader, s);
        return (Class<?>)w0;
    }
    
    public static final Annotation i(final dh2.c c) {
        final ch2.c d = DescriptorUtilsKt.d(c);
        Class<?> j;
        if (d != null) {
            j = j(d);
        }
        else {
            j = null;
        }
        if (!(j instanceof Class)) {
            j = null;
        }
        if (j == null) {
            return null;
        }
        final Set entrySet = c.a().entrySet();
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Map.Entry<yh2.e, V> entry : entrySet) {
            final yh2.e e = entry.getKey();
            final ci2.g g = (ci2.g)entry.getValue();
            final ClassLoader classLoader = j.getClassLoader();
            ng2.e.e((Object)classLoader, "annotationClass.classLoader");
            final Object k = k((ci2.g<?>)g, classLoader);
            Object o;
            if (k != null) {
                o = new Pair((Object)e.c(), k);
            }
            else {
                o = null;
            }
            if (o != null) {
                list.add(o);
            }
        }
        final Map e2 = kotlin.collections.c.E4((List)list);
        final Set keySet = e2.keySet();
        final ArrayList list2 = new ArrayList<Method>(dg2.m.u4((Iterable)keySet, 10));
        final Iterator iterator2 = keySet.iterator();
        while (iterator2.hasNext()) {
            list2.add(j.getDeclaredMethod((String)iterator2.next(), (Class[])new Class[0]));
        }
        return (Annotation)AnnotationConstructorCallerKt.a((Class)j, e2, (List)list2);
    }
    
    public static final Class<?> j(final ch2.c c) {
        e.f((Object)c, "<this>");
        final e0 f = ((ch2.j)c).f();
        e.e((Object)f, "source");
        Class<?> clazz;
        if (f instanceof n) {
            final l b = ((n)f).b;
            e.d((Object)b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            clazz = ((hh2.c)b).a;
        }
        else if (f instanceof g.a) {
            final m b2 = ((g.a)f).b;
            e.d((Object)b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            clazz = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a)b2).a;
        }
        else {
            final b f2 = DescriptorUtilsKt.f((ch2.e)c);
            if (f2 == null) {
                return null;
            }
            clazz = h(ReflectClassUtilKt.d((Class)c.getClass()), f2, 0);
        }
        return clazz;
    }
    
    public static final Object k(final ci2.g<?> g, final ClassLoader classLoader) {
        final boolean b = g instanceof ci2.a;
        final Annotation annotation = null;
        Object o = null;
        Label_1346: {
            if (b) {
                o = i((dh2.c)((ci2.g)g).a);
            }
            else {
                final boolean b2 = g instanceof ci2.b;
                final int n = 0;
                final int n2 = 0;
                final int n3 = 0;
                final int n4 = 0;
                final int n5 = 0;
                final int n6 = 0;
                final int n7 = 0;
                final int n8 = 0;
                final int n9 = 0;
                final int n10 = 0;
                final int n11 = 0;
                if (b2) {
                    final ci2.b b3 = (ci2.b)g;
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.b b4;
                    if (b3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.b) {
                        b4 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.b)b3;
                    }
                    else {
                        b4 = null;
                    }
                    o = annotation;
                    if (b4 != null) {
                        final oi2.t c = b4.c;
                        if (c == null) {
                            o = annotation;
                        }
                        else {
                            final Iterable iterable = (Iterable)((ci2.g)b3).a;
                            final ArrayList list = new ArrayList<Double>(dg2.m.u4(iterable, 10));
                            final Iterator iterator = iterable.iterator();
                            while (iterator.hasNext()) {
                                list.add((Double)k((ci2.g<?>)iterator.next(), classLoader));
                            }
                            final yh2.e e = kotlin.reflect.jvm.internal.impl.builtins.c.e;
                            final ch2.e f = c.I0().f();
                            Object s;
                            if (f == null) {
                                s = null;
                            }
                            else {
                                s = kotlin.reflect.jvm.internal.impl.builtins.c.s(f);
                            }
                            int n12;
                            if (s == null) {
                                n12 = -1;
                            }
                            else {
                                n12 = k.a.a[((Enum)s).ordinal()];
                            }
                            Label_0766: {
                                switch (n12) {
                                    default: {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    case 8: {
                                        final int size = ((List)((ci2.g)b3).a).size();
                                        final double[] array = new double[size];
                                        int n13 = n11;
                                        while (true) {
                                            o = array;
                                            if (n13 >= size) {
                                                break Label_0766;
                                            }
                                            final Double value = list.get(n13);
                                            ng2.e.d((Object)value, "null cannot be cast to non-null type kotlin.Double");
                                            array[n13] = value;
                                            ++n13;
                                        }
                                        break;
                                    }
                                    case 7: {
                                        final int size2 = ((List)((ci2.g)b3).a).size();
                                        final long[] array2 = new long[size2];
                                        int n14 = n;
                                        while (true) {
                                            o = array2;
                                            if (n14 >= size2) {
                                                break Label_0766;
                                            }
                                            final Double value2 = list.get(n14);
                                            ng2.e.d((Object)value2, "null cannot be cast to non-null type kotlin.Long");
                                            array2[n14] = (Long)(Object)value2;
                                            ++n14;
                                        }
                                        break;
                                    }
                                    case 6: {
                                        final int size3 = ((List)((ci2.g)b3).a).size();
                                        final float[] array3 = new float[size3];
                                        int n15 = n2;
                                        while (true) {
                                            o = array3;
                                            if (n15 >= size3) {
                                                break Label_0766;
                                            }
                                            final Double value3 = list.get(n15);
                                            ng2.e.d((Object)value3, "null cannot be cast to non-null type kotlin.Float");
                                            array3[n15] = (Float)(Object)value3;
                                            ++n15;
                                        }
                                        break;
                                    }
                                    case 5: {
                                        final int size4 = ((List)((ci2.g)b3).a).size();
                                        final int[] array4 = new int[size4];
                                        int n16 = n3;
                                        while (true) {
                                            o = array4;
                                            if (n16 >= size4) {
                                                break Label_0766;
                                            }
                                            final Double value4 = list.get(n16);
                                            ng2.e.d((Object)value4, "null cannot be cast to non-null type kotlin.Int");
                                            array4[n16] = (Integer)(Object)value4;
                                            ++n16;
                                        }
                                        break;
                                    }
                                    case 4: {
                                        final int size5 = ((List)((ci2.g)b3).a).size();
                                        final short[] array5 = new short[size5];
                                        int n17 = n4;
                                        while (true) {
                                            o = array5;
                                            if (n17 >= size5) {
                                                break Label_0766;
                                            }
                                            final Double value5 = list.get(n17);
                                            ng2.e.d((Object)value5, "null cannot be cast to non-null type kotlin.Short");
                                            array5[n17] = (Short)(Object)value5;
                                            ++n17;
                                        }
                                        break;
                                    }
                                    case 3: {
                                        final int size6 = ((List)((ci2.g)b3).a).size();
                                        final byte[] array6 = new byte[size6];
                                        int n18 = n5;
                                        while (true) {
                                            o = array6;
                                            if (n18 >= size6) {
                                                break Label_0766;
                                            }
                                            final Double value6 = list.get(n18);
                                            ng2.e.d((Object)value6, "null cannot be cast to non-null type kotlin.Byte");
                                            array6[n18] = (Byte)(Object)value6;
                                            ++n18;
                                        }
                                        break;
                                    }
                                    case 2: {
                                        final int size7 = ((List)((ci2.g)b3).a).size();
                                        final char[] array7 = new char[size7];
                                        int n19 = n6;
                                        while (true) {
                                            o = array7;
                                            if (n19 >= size7) {
                                                break Label_0766;
                                            }
                                            final Double value7 = list.get(n19);
                                            ng2.e.d((Object)value7, "null cannot be cast to non-null type kotlin.Char");
                                            array7[n19] = (Character)(Object)value7;
                                            ++n19;
                                        }
                                        break;
                                    }
                                    case 1: {
                                        final int size8 = ((List)((ci2.g)b3).a).size();
                                        final boolean[] array8 = new boolean[size8];
                                        int n20 = n7;
                                        while (true) {
                                            o = array8;
                                            if (n20 >= size8) {
                                                break Label_0766;
                                            }
                                            final Double value8 = list.get(n20);
                                            ng2.e.d((Object)value8, "null cannot be cast to non-null type kotlin.Boolean");
                                            array8[n20] = (Boolean)(Object)value8;
                                            ++n20;
                                        }
                                        break;
                                    }
                                    case -1: {
                                        if (!kotlin.reflect.jvm.internal.impl.builtins.c.z(c)) {
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("Not an array type: ");
                                            sb.append(c);
                                            throw new IllegalStateException(sb.toString().toString());
                                        }
                                        final oi2.t type = ((o0)CollectionsKt___CollectionsKt.t5(c.G0())).getType();
                                        ng2.e.e((Object)type, "type.arguments.single().type");
                                        final ch2.e f2 = type.I0().f();
                                        Object o2;
                                        if (f2 instanceof ch2.c) {
                                            o2 = f2;
                                        }
                                        else {
                                            o2 = null;
                                        }
                                        if (o2 == null) {
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Not a class type: ");
                                            sb2.append(type);
                                            throw new IllegalStateException(sb2.toString().toString());
                                        }
                                        if (kotlin.reflect.jvm.internal.impl.builtins.c.J(type)) {
                                            final int size9 = ((List)((ci2.g)b3).a).size();
                                            final String[] array9 = new String[size9];
                                            int n21 = n8;
                                            while (true) {
                                                o = array9;
                                                if (n21 >= size9) {
                                                    break Label_0766;
                                                }
                                                final Double value9 = list.get(n21);
                                                ng2.e.d((Object)value9, "null cannot be cast to non-null type kotlin.String");
                                                array9[n21] = (String)value9;
                                                ++n21;
                                            }
                                        }
                                        else if (kotlin.reflect.jvm.internal.impl.builtins.c.c((ch2.e)o2, e$a.P)) {
                                            final int size10 = ((List)((ci2.g)b3).a).size();
                                            final Class[] array10 = new Class[size10];
                                            int n22 = n9;
                                            while (true) {
                                                o = array10;
                                                if (n22 >= size10) {
                                                    break Label_0766;
                                                }
                                                final Double value10 = list.get(n22);
                                                ng2.e.d((Object)value10, "null cannot be cast to non-null type java.lang.Class<*>");
                                                array10[n22] = (Class)value10;
                                                ++n22;
                                            }
                                        }
                                        else {
                                            final b f3 = DescriptorUtilsKt.f((ch2.e)o2);
                                            o = annotation;
                                            if (f3 == null) {
                                                break;
                                            }
                                            final Class<?> h = h(classLoader, f3, 0);
                                            if (h == null) {
                                                o = annotation;
                                                break;
                                            }
                                            final Object instance = Array.newInstance(h, ((List)((ci2.g)b3).a).size());
                                            ng2.e.d(instance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                                            final Object[] array11 = (Object[])instance;
                                            final int size11 = list.size();
                                            int n23 = n10;
                                            while (true) {
                                                o = array11;
                                                if (n23 >= size11) {
                                                    break Label_1346;
                                                }
                                                array11[n23] = list.get(n23);
                                                ++n23;
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                else if (g instanceof i) {
                    final Pair pair = (Pair)((ci2.g)g).a;
                    final b b5 = (b)pair.component1();
                    final yh2.e e2 = (yh2.e)pair.component2();
                    final Class<?> h2 = h(classLoader, b5, 0);
                    o = annotation;
                    if (h2 != null) {
                        o = Enum.valueOf(h2, e2.c());
                    }
                }
                else if (g instanceof ci2.o) {
                    final o$a o$a = (o$a)((ci2.g)g).a;
                    if (o$a instanceof o$a$b) {
                        final ci2.f a = ((o$a$b)o$a).a;
                        o = h(classLoader, a.a, a.b);
                    }
                    else {
                        if (!(o$a instanceof o$a$a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final ch2.e f4 = ((o$a$a)o$a).a.I0().f();
                        ch2.c c2;
                        if (f4 instanceof ch2.c) {
                            c2 = (ch2.c)f4;
                        }
                        else {
                            c2 = null;
                        }
                        o = annotation;
                        if (c2 != null) {
                            o = j(c2);
                        }
                    }
                }
                else if (g instanceof ci2.j || g instanceof q) {
                    o = annotation;
                }
                else {
                    o = g.b();
                }
            }
        }
        return o;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[PrimitiveType.values().length];
            a2[((Enum)PrimitiveType.BOOLEAN).ordinal()] = 1;
            a2[((Enum)PrimitiveType.CHAR).ordinal()] = 2;
            a2[((Enum)PrimitiveType.BYTE).ordinal()] = 3;
            a2[((Enum)PrimitiveType.SHORT).ordinal()] = 4;
            a2[((Enum)PrimitiveType.INT).ordinal()] = 5;
            a2[((Enum)PrimitiveType.FLOAT).ordinal()] = 6;
            a2[((Enum)PrimitiveType.LONG).ordinal()] = 7;
            a2[((Enum)PrimitiveType.DOUBLE).ordinal()] = 8;
            a = a2;
        }
    }
}
