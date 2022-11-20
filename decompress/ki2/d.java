// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import java.util.ArrayList;
import wh2.c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;

public interface d<A>
{
    ArrayList a(final ProtoBuf$Type p0, final c p1);
    
    List b(final s$a p0, final ProtoBuf$EnumEntry p1);
    
    List<A> c(final s p0, final ProtoBuf$Property p1);
    
    List<A> d(final s p0, final l p1, final AnnotatedCallableKind p2, final int p3, final ProtoBuf$ValueParameter p4);
    
    ArrayList f(final ProtoBuf$TypeParameter p0, final c p1);
    
    ArrayList g(final s$a p0);
    
    List<A> h(final s p0, final l p1, final AnnotatedCallableKind p2);
    
    List<A> i(final s p0, final ProtoBuf$Property p1);
    
    List<A> j(final s p0, final l p1, final AnnotatedCallableKind p2);
}
