// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import dh2.d;
import dg2.m;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import ch2.t;
import ci2.g;
import dh2.c;

public final class b implements ki2.a<c, g<?>>
{
    public final ji2.a a;
    public final ki2.c b;
    
    public b(final t t, final NotFoundClasses notFoundClasses, final li2.a a) {
        e.f((Object)t, "module");
        e.f((Object)a, "protocol");
        this.a = (ji2.a)a;
        this.b = new ki2.c(t, notFoundClasses);
    }
    
    @Override
    public final ArrayList a(final ProtoBuf$Type protoBuf$Type, final wh2.c c) {
        e.f((Object)protoBuf$Type, "proto");
        e.f((Object)c, "nameResolver");
        Object instance;
        if ((instance = ((GeneratedMessageLite$ExtendableMessage)protoBuf$Type).getExtension((GeneratedMessageLite$e)this.a.k)) == null) {
            instance = EmptyList.INSTANCE;
        }
        final ArrayList list = new ArrayList<dh2.d>(m.u4((Iterable)instance, 10));
        final Iterator iterator = ((Iterable)instance).iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a((ProtoBuf$Annotation)iterator.next(), c));
        }
        return list;
    }
    
    @Override
    public final List b(final s$a s$a, final ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        e.f((Object)s$a, "container");
        e.f((Object)protoBuf$EnumEntry, "proto");
        Object instance;
        if ((instance = ((GeneratedMessageLite$ExtendableMessage)protoBuf$EnumEntry).getExtension((GeneratedMessageLite$e)this.a.h)) == null) {
            instance = EmptyList.INSTANCE;
        }
        final ArrayList list = new ArrayList<dh2.d>(m.u4((Iterable)instance, 10));
        final Iterator iterator = ((Iterable)instance).iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a((ProtoBuf$Annotation)iterator.next(), ((s)s$a).a));
        }
        return list;
    }
    
    @Override
    public final List<c> c(final s s, final ProtoBuf$Property protoBuf$Property) {
        e.f((Object)protoBuf$Property, "proto");
        return (List<c>)EmptyList.INSTANCE;
    }
    
    @Override
    public final List<c> d(final s s, final l l, final AnnotatedCallableKind annotatedCallableKind, final int n, final ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        e.f((Object)s, "container");
        e.f((Object)l, "callableProto");
        e.f((Object)annotatedCallableKind, "kind");
        e.f((Object)protoBuf$ValueParameter, "proto");
        Object instance;
        if ((instance = ((GeneratedMessageLite$ExtendableMessage)protoBuf$ValueParameter).getExtension((GeneratedMessageLite$e)this.a.j)) == null) {
            instance = EmptyList.INSTANCE;
        }
        final ArrayList list = new ArrayList<dh2.d>(m.u4((Iterable)instance, 10));
        final Iterator iterator = ((Iterable)instance).iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a((ProtoBuf$Annotation)iterator.next(), s.a));
        }
        return (List<c>)list;
    }
    
    @Override
    public final Object e(final s s, final ProtoBuf$Property protoBuf$Property, final oi2.t t) {
        e.f((Object)protoBuf$Property, "proto");
        return null;
    }
    
    @Override
    public final ArrayList f(final ProtoBuf$TypeParameter protoBuf$TypeParameter, final wh2.c c) {
        e.f((Object)protoBuf$TypeParameter, "proto");
        e.f((Object)c, "nameResolver");
        Object instance;
        if ((instance = ((GeneratedMessageLite$ExtendableMessage)protoBuf$TypeParameter).getExtension((GeneratedMessageLite$e)this.a.l)) == null) {
            instance = EmptyList.INSTANCE;
        }
        final ArrayList list = new ArrayList<dh2.d>(m.u4((Iterable)instance, 10));
        final Iterator iterator = ((Iterable)instance).iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a((ProtoBuf$Annotation)iterator.next(), c));
        }
        return list;
    }
    
    @Override
    public final ArrayList g(final s$a s$a) {
        e.f((Object)s$a, "container");
        Object instance;
        if ((instance = ((GeneratedMessageLite$ExtendableMessage)s$a.d).getExtension((GeneratedMessageLite$e)this.a.c)) == null) {
            instance = EmptyList.INSTANCE;
        }
        final ArrayList list = new ArrayList<dh2.d>(m.u4((Iterable)instance, 10));
        final Iterator iterator = ((Iterable)instance).iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a((ProtoBuf$Annotation)iterator.next(), ((s)s$a).a));
        }
        return list;
    }
    
    @Override
    public final List<c> h(final s s, final l l, final AnnotatedCallableKind annotatedCallableKind) {
        e.f((Object)l, "proto");
        e.f((Object)annotatedCallableKind, "kind");
        List list;
        if (l instanceof ProtoBuf$Constructor) {
            list = (List)((GeneratedMessageLite$ExtendableMessage)l).getExtension((GeneratedMessageLite$e)this.a.b);
        }
        else if (l instanceof ProtoBuf$Function) {
            list = (List)((GeneratedMessageLite$ExtendableMessage)l).getExtension((GeneratedMessageLite$e)this.a.d);
        }
        else {
            if (!(l instanceof ProtoBuf$Property)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown message: ");
                sb.append(l);
                throw new IllegalStateException(sb.toString().toString());
            }
            final int n = ki2.b.a.a[((Enum)annotatedCallableKind).ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                    }
                    list = (List)((GeneratedMessageLite$ExtendableMessage)l).getExtension((GeneratedMessageLite$e)this.a.g);
                }
                else {
                    list = (List)((GeneratedMessageLite$ExtendableMessage)l).getExtension((GeneratedMessageLite$e)this.a.f);
                }
            }
            else {
                list = (List)((GeneratedMessageLite$ExtendableMessage)l).getExtension((GeneratedMessageLite$e)this.a.e);
            }
        }
        Object instance = list;
        if (list == null) {
            instance = EmptyList.INSTANCE;
        }
        final ArrayList list2 = new ArrayList<dh2.d>(m.u4((Iterable)instance, 10));
        final Iterator iterator = ((Iterable)instance).iterator();
        while (iterator.hasNext()) {
            list2.add(this.b.a((ProtoBuf$Annotation)iterator.next(), s.a));
        }
        return (List<c>)list2;
    }
    
    @Override
    public final List<c> i(final s s, final ProtoBuf$Property protoBuf$Property) {
        e.f((Object)protoBuf$Property, "proto");
        return (List<c>)EmptyList.INSTANCE;
    }
    
    @Override
    public final List<c> j(final s s, final l l, final AnnotatedCallableKind annotatedCallableKind) {
        e.f((Object)l, "proto");
        e.f((Object)annotatedCallableKind, "kind");
        return (List<c>)EmptyList.INSTANCE;
    }
    
    @Override
    public final Object k(final s s, final ProtoBuf$Property protoBuf$Property, final oi2.t t) {
        e.f((Object)protoBuf$Property, "proto");
        final ProtoBuf$Annotation$Argument$Value protoBuf$Annotation$Argument$Value = (ProtoBuf$Annotation$Argument$Value)xd.a.c0((GeneratedMessageLite$ExtendableMessage)protoBuf$Property, (GeneratedMessageLite$e)this.a.i);
        Object c;
        if (protoBuf$Annotation$Argument$Value == null) {
            c = null;
        }
        else {
            c = this.b.c(t, protoBuf$Annotation$Argument$Value, s.a);
        }
        return c;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[AnnotatedCallableKind.values().length];
            a2[((Enum)AnnotatedCallableKind.PROPERTY).ordinal()] = 1;
            a2[((Enum)AnnotatedCallableKind.PROPERTY_GETTER).ordinal()] = 2;
            a2[((Enum)AnnotatedCallableKind.PROPERTY_SETTER).ordinal()] = 3;
            a = a2;
        }
    }
}
