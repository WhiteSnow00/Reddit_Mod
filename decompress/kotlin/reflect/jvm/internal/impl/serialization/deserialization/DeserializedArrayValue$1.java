// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ng2.e;
import ch2.t;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class DeserializedArrayValue$1 extends Lambda implements l<t, oi2.t>
{
    public final oi2.t $type;
    
    public DeserializedArrayValue$1(final oi2.t $type) {
        this.$type = $type;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((t)o);
    }
    
    public final oi2.t invoke(final t t) {
        e.f((Object)t, "it");
        return this.$type;
    }
}
