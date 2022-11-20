// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import fh2.d0;
import oi2.t;
import dh2.c;
import ki2.s;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import ci2.g;
import ni2.f;
import mg2.a;
import kotlin.jvm.internal.Lambda;

final class MemberDeserializer$loadProperty$4 extends Lambda implements a<f<? extends g<?>>>
{
    public final mi2.g $property;
    public final ProtoBuf$Property $proto;
    public final MemberDeserializer this$0;
    
    public MemberDeserializer$loadProperty$4(final MemberDeserializer this$0, final ProtoBuf$Property $proto, final mi2.g $property) {
        this.this$0 = this$0;
        this.$proto = $proto;
        this.$property = $property;
        super(0);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    public final f<g<?>> invoke() {
        final MemberDeserializer this$0 = this.this$0;
        return (f<g<?>>)this$0.a.a.a.g((a)new a<g<?>>(this$0, this.$proto, this.$property) {
            public final mi2.g $property;
            public final ProtoBuf$Property $proto;
            public final MemberDeserializer this$0;
            
            public final g<?> invoke() {
                final MemberDeserializer this$0 = this.this$0;
                final s a = this$0.a(this$0.a.c);
                e.c((Object)a);
                final ki2.a<c, g<?>> e = this.this$0.a.a.e;
                final ProtoBuf$Property $proto = this.$proto;
                final t returnType = ((d0)this.$property).getReturnType();
                ng2.e.e((Object)returnType, "property.returnType");
                return e.k(a, $proto, returnType);
            }
            
            public /* bridge */ Object invoke() {
                return this.invoke();
            }
        });
    }
}
