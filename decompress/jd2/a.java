// 
// Decompiled by Procyon v0.6.0
// 

package jd2;

import java.lang.reflect.Field;
import java.util.Iterator;
import bh2.i$a;
import java.util.List;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter;
import com.squareup.moshi.JsonReader$b;
import java.util.Map;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter$a;
import java.util.LinkedHashSet;
import java.util.Arrays;
import zg2.p;
import zg2.j;
import java.lang.reflect.Modifier;
import zg2.k;
import lg.e0;
import ig2.o;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.squareup.moshi.n;
import kotlin.reflect.jvm.internal.KCallableImpl;
import java.util.ArrayList;
import zg2.c;
import kotlin.reflect.KParameter;
import java.util.LinkedHashMap;
import bg.d;
import ig2.m;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import zg2.g;
import java.util.Collection;
import kotlin.reflect.jvm.internal.KClassImpl$Data;
import kotlin.reflect.jvm.internal.KClassImpl;
import sg2.h;
import com.squareup.moshi.a0;
import sg2.e;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.y;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import com.squareup.moshi.JsonAdapter$e;

public final class a implements JsonAdapter$e
{
    public final JsonAdapter<?> create(final Type type, final Set<? extends Annotation> set, final y y) {
        e.f((Object)type, "type");
        e.f((Object)set, "annotations");
        e.f((Object)y, "moshi");
        if (set.isEmpty() ^ true) {
            return null;
        }
        final Class c = a0.c(type);
        e.e((Object)c, "getRawType(this)");
        if (c.isInterface()) {
            return null;
        }
        if (c.isEnum()) {
            return null;
        }
        if (!c.isAnnotationPresent(b.a)) {
            return null;
        }
        if (id2.a.f(c)) {
            return null;
        }
        try {
            final JsonAdapter c2 = id2.a.c(y, type, c);
            if (c2 != null) {
                return (JsonAdapter<?>)c2;
            }
        }
        catch (final RuntimeException ex) {
            if (!(ex.getCause() instanceof ClassNotFoundException)) {
                throw ex;
            }
        }
        if (!(c.isLocalClass() ^ true)) {
            throw new IllegalArgumentException(e.l((Object)c.getName(), "Cannot serialize local class or object expression ").toString());
        }
        final zg2.d a = h.a(c);
        if (!(a.isAbstract() ^ true)) {
            throw new IllegalArgumentException(e.l((Object)c.getName(), "Cannot serialize abstract class ").toString());
        }
        if (!(a.h() ^ true)) {
            throw new IllegalArgumentException(e.l((Object)c.getName(), "Cannot serialize inner class ").toString());
        }
        if (a.g() != null) {
            throw new IllegalArgumentException(e.l((Object)c.getName(), "Cannot serialize object declaration ").toString());
        }
        if (a.j() ^ true) {
            final KClassImpl kClassImpl = (KClassImpl)a;
            final i$a f = ((KClassImpl$Data)kClassImpl.h.invoke()).f;
            final k k = KClassImpl$Data.o[4];
            final Object invoke = f.invoke();
            e.e(invoke, "<get-constructors>(...)");
            while (true) {
                for (final Object next : (Collection)invoke) {
                    final g g = (g)next;
                    e.d((Object)g, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.b)((KFunctionImpl)g).x()).m0()) {
                        final g g2 = (g)next;
                        if (g2 == null) {
                            return null;
                        }
                        final List parameters = ((c)g2).getParameters();
                        int o0;
                        if ((o0 = d.o0(m.c3((Iterable)parameters, 10))) < 16) {
                            o0 = 16;
                        }
                        final LinkedHashMap linkedHashMap = new LinkedHashMap<String, KParameter>(o0);
                        for (final Object next2 : parameters) {
                            linkedHashMap.put(((KParameter)next2).getName(), (KParameter)next2);
                        }
                        lw0.b.n2((c)g2);
                        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        final i$a m = ((KClassImpl$Data)kClassImpl.h.invoke()).m;
                        final k i = KClassImpl$Data.o[14];
                        final Object invoke2 = m.invoke();
                        e.e(invoke2, "<get-allNonStaticMembers>(...)");
                        final Collection collection = (Collection)invoke2;
                        final ArrayList<KCallableImpl> list = new ArrayList<KCallableImpl>();
                        for (final Object next3 : collection) {
                            final KCallableImpl kCallableImpl = (KCallableImpl)next3;
                            if ((((kotlin.reflect.jvm.internal.impl.descriptors.a)kCallableImpl.s()).f0() != null ^ true) && kCallableImpl instanceof zg2.m) {
                                list.add((KCallableImpl)next3);
                            }
                        }
                        final Iterator<KCallableImpl> iterator4 = list.iterator();
                    Label_0658_Outer:
                        while (true) {
                            final boolean b = true;
                            final boolean b2 = true;
                            final boolean b3 = true;
                            if (iterator4.hasNext()) {
                                final zg2.m j = (zg2.m)iterator4.next();
                                final KParameter kParameter = linkedHashMap.get(((c)j).getName());
                                lw0.b.n2((c)j);
                                while (true) {
                                    for (final Object next4 : ((zg2.b)j).getAnnotations()) {
                                        if (((Annotation)next4) instanceof n) {
                                            final n n = (n)next4;
                                            final ArrayList r4 = CollectionsKt___CollectionsKt.r4((Collection)((zg2.b)j).getAnnotations());
                                            n n2 = n;
                                            Label_0757: {
                                                if (kParameter != null) {
                                                    o.j3((Iterable)((zg2.b)kParameter).getAnnotations(), (Collection)r4);
                                                    if ((n2 = n) == null) {
                                                        while (true) {
                                                            for (final Object next5 : ((zg2.b)kParameter).getAnnotations()) {
                                                                if (((Annotation)next5) instanceof n) {
                                                                    n2 = (n)next5;
                                                                    break Label_0757;
                                                                }
                                                            }
                                                            Object next5 = null;
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                            final Field n3 = e0.N((k)j);
                                            int modifiers;
                                            if (n3 == null) {
                                                modifiers = 0;
                                            }
                                            else {
                                                modifiers = n3.getModifiers();
                                            }
                                            if (Modifier.isTransient(modifiers)) {
                                                int n4 = b3 ? 1 : 0;
                                                if (kParameter != null) {
                                                    if (kParameter.d()) {
                                                        n4 = (b3 ? 1 : 0);
                                                    }
                                                    else {
                                                        n4 = 0;
                                                    }
                                                }
                                                if (n4 == 0) {
                                                    throw new IllegalArgumentException(e.l((Object)kParameter, "No default value for transient constructor ").toString());
                                                }
                                            }
                                            else {
                                                boolean b4 = false;
                                                Label_0872: {
                                                    if (n2 != null) {
                                                        if (n2.ignore()) {
                                                            b4 = true;
                                                            break Label_0872;
                                                        }
                                                    }
                                                    b4 = false;
                                                }
                                                if (b4) {
                                                    int n5 = b ? 1 : 0;
                                                    if (kParameter != null) {
                                                        if (kParameter.d()) {
                                                            n5 = (b ? 1 : 0);
                                                        }
                                                        else {
                                                            n5 = 0;
                                                        }
                                                    }
                                                    if (n5 == 0) {
                                                        throw new IllegalArgumentException(e.l((Object)kParameter, "No default value for ignored constructor ").toString());
                                                    }
                                                }
                                                else {
                                                    int n6 = b2 ? 1 : 0;
                                                    if (kParameter != null) {
                                                        if (e.a((Object)kParameter.getType(), (Object)((c)j).getReturnType())) {
                                                            n6 = (b2 ? 1 : 0);
                                                        }
                                                        else {
                                                            n6 = 0;
                                                        }
                                                    }
                                                    if (n6 == 0) {
                                                        final StringBuilder p3 = d.p('\'');
                                                        p3.append(((c)j).getName());
                                                        p3.append("' has a constructor parameter of type ");
                                                        e.c((Object)kParameter);
                                                        p3.append(kParameter.getType());
                                                        p3.append(" but a property of type ");
                                                        p3.append(((c)j).getReturnType());
                                                        p3.append('.');
                                                        throw new IllegalArgumentException(p3.toString().toString());
                                                    }
                                                    if (j instanceof j || kParameter != null) {
                                                        String name = null;
                                                        Label_1029: {
                                                            if (n2 != null) {
                                                                name = n2.name();
                                                                if (name != null) {
                                                                    if (!e.a((Object)name, (Object)"\u0000")) {
                                                                        break Label_1029;
                                                                    }
                                                                }
                                                            }
                                                            name = null;
                                                        }
                                                        String name2 = name;
                                                        if (name == null) {
                                                            name2 = ((c)j).getName();
                                                        }
                                                        final zg2.e l = ((c)j).getReturnType().k();
                                                        Object o2;
                                                        if (l instanceof zg2.d) {
                                                            final zg2.d d = (zg2.d)l;
                                                            if (d.t()) {
                                                                final Class j2 = ml0.a.J(d);
                                                                if (((c)j).getReturnType().l().isEmpty()) {
                                                                    o2 = j2;
                                                                }
                                                                else {
                                                                    final List l2 = ((c)j).getReturnType().l();
                                                                    final ArrayList<Type> list2 = new ArrayList<Type>();
                                                                    final Iterator iterator7 = l2.iterator();
                                                                    while (iterator7.hasNext()) {
                                                                        final zg2.n b5 = ((p)iterator7.next()).b;
                                                                        Type p4;
                                                                        if (b5 == null) {
                                                                            p4 = null;
                                                                        }
                                                                        else {
                                                                            p4 = e0.P(b5);
                                                                        }
                                                                        if (p4 == null) {
                                                                            continue Label_0658_Outer;
                                                                        }
                                                                        list2.add(p4);
                                                                    }
                                                                    final Type[] array = list2.toArray(new Type[0]);
                                                                    if (array == null) {
                                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                                                    }
                                                                    final Type[] array2 = array;
                                                                    o2 = a0.d(j2, (Type[])Arrays.copyOf(array2, array2.length));
                                                                }
                                                            }
                                                            else {
                                                                o2 = e0.P(((c)j).getReturnType());
                                                            }
                                                        }
                                                        else {
                                                            if (!(l instanceof zg2.o)) {
                                                                throw new IllegalStateException("Not possible!".toString());
                                                            }
                                                            o2 = e0.P(((c)j).getReturnType());
                                                        }
                                                        final Type j3 = id2.a.j(type, c, (Type)o2, new LinkedHashSet());
                                                        final Annotation[] array3 = r4.toArray(new Annotation[0]);
                                                        if (array3 == null) {
                                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                                        }
                                                        final JsonAdapter c3 = y.c(j3, id2.a.g((Annotation[])array3), ((c)j).getName());
                                                        final String name3 = ((c)j).getName();
                                                        int index;
                                                        if (kParameter == null) {
                                                            index = -1;
                                                        }
                                                        else {
                                                            index = kParameter.getIndex();
                                                        }
                                                        linkedHashMap2.put(name3, new KotlinJsonAdapter$a(name2, c3, (zg2.m)j, kParameter, index));
                                                    }
                                                }
                                            }
                                            continue Label_0658_Outer;
                                        }
                                    }
                                    Object next4 = null;
                                    continue;
                                }
                            }
                            final ArrayList<KotlinJsonAdapter$a> list3 = new ArrayList<KotlinJsonAdapter$a>();
                            for (final KParameter kParameter2 : ((c)g2).getParameters()) {
                                final KotlinJsonAdapter$a kotlinJsonAdapter$a = (KotlinJsonAdapter$a)linkedHashMap2.remove(kParameter2.getName());
                                if (kotlinJsonAdapter$a == null && !kParameter2.d()) {
                                    throw new IllegalArgumentException(e.l((Object)kParameter2, "No property for required constructor ").toString());
                                }
                                list3.add(kotlinJsonAdapter$a);
                            }
                            int size = list3.size();
                            final Iterator iterator9 = linkedHashMap2.entrySet().iterator();
                            while (iterator9.hasNext()) {
                                final KotlinJsonAdapter$a kotlinJsonAdapter$a2 = ((Map.Entry<K, KotlinJsonAdapter$a>)iterator9.next()).getValue();
                                final String a2 = kotlinJsonAdapter$a2.a;
                                final JsonAdapter b6 = kotlinJsonAdapter$a2.b;
                                final zg2.m c4 = kotlinJsonAdapter$a2.c;
                                final KParameter d2 = kotlinJsonAdapter$a2.d;
                                e.f((Object)a2, "jsonName");
                                e.f((Object)b6, "adapter");
                                e.f((Object)c4, "property");
                                list3.add(new KotlinJsonAdapter$a(a2, b6, c4, d2, size));
                                ++size;
                            }
                            final ArrayList y2 = CollectionsKt___CollectionsKt.y3((Iterable)list3);
                            final ArrayList list4 = new ArrayList<String>(ig2.m.c3((Iterable)y2, 10));
                            final Iterator iterator10 = y2.iterator();
                            while (iterator10.hasNext()) {
                                list4.add(((KotlinJsonAdapter$a)iterator10.next()).a);
                            }
                            final String[] array4 = list4.toArray(new String[0]);
                            if (array4 != null) {
                                final String[] array5 = array4;
                                return (JsonAdapter<?>)((JsonAdapter)new KotlinJsonAdapter(g2, (List)list3, (List)y2, JsonReader$b.a((String[])Arrays.copyOf(array5, array5.length)))).nullSafe();
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                }
                Object next = null;
                continue;
            }
        }
        final StringBuilder r5 = a.r("Cannot reflectively serialize sealed class ");
        r5.append((Object)c.getName());
        r5.append(". Please register an adapter.");
        throw new IllegalArgumentException(r5.toString().toString());
    }
}
