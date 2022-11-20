// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ki2.s;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import dh2.c;
import java.util.List;
import mg2.a;
import kotlin.jvm.internal.Lambda;

final class MemberDeserializer$getReceiverParameterAnnotations$1 extends Lambda implements a<List<? extends c>>
{
    public final AnnotatedCallableKind $kind;
    public final l $proto;
    public final MemberDeserializer this$0;
    
    public MemberDeserializer$getReceiverParameterAnnotations$1(final MemberDeserializer this$0, final l $proto, final AnnotatedCallableKind $kind) {
        this.this$0 = this$0;
        this.$proto = $proto;
        this.$kind = $kind;
        super(0);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    public final List<c> invoke() {
        final MemberDeserializer this$0 = this.this$0;
        final s a = this$0.a(this$0.a.c);
        List<Object> j;
        if (a != null) {
            j = this.this$0.a.a.e.j(a, this.$proto, this.$kind);
        }
        else {
            j = null;
        }
        Object instance = j;
        if (j == null) {
            instance = EmptyList.INSTANCE;
        }
        return (List<c>)instance;
    }
}
