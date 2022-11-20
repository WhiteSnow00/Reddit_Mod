// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ng2.e;
import ch2.e0;
import yh2.b;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements l<b, e0>
{
    public final DeserializedPackageFragmentImpl this$0;
    
    public DeserializedPackageFragmentImpl$classDataFinder$1(final DeserializedPackageFragmentImpl this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final e0 invoke(final b b) {
        e.f((Object)b, "it");
        Object o = this.this$0.m;
        if (o == null) {
            o = e0.a;
        }
        return (e0)o;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((b)o);
    }
}
