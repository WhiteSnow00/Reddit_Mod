// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import ng2.e;
import oi2.t;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class DescriptorRendererImpl$renderSuperTypes$1 extends Lambda implements l<t, CharSequence>
{
    public final DescriptorRendererImpl this$0;
    
    public DescriptorRendererImpl$renderSuperTypes$1(final DescriptorRendererImpl this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final CharSequence invoke(final t t) {
        final DescriptorRendererImpl this$0 = this.this$0;
        e.e((Object)t, "it");
        return this$0.s(t);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((t)o);
    }
}
