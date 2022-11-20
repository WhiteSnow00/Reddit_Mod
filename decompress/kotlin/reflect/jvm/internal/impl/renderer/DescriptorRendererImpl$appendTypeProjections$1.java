// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import oi2.t;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import ng2.e;
import oi2.o0;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements l<o0, CharSequence>
{
    public final DescriptorRendererImpl this$0;
    
    public DescriptorRendererImpl$appendTypeProjections$1(final DescriptorRendererImpl this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final CharSequence invoke(final o0 o0) {
        e.f((Object)o0, "it");
        String string;
        if (o0.a()) {
            string = "*";
        }
        else {
            final DescriptorRendererImpl this$0 = this.this$0;
            final t type = o0.getType();
            e.e((Object)type, "it.type");
            final String s = this$0.s(type);
            if (o0.b() == Variance.INVARIANT) {
                string = s;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(o0.b());
                sb.append(' ');
                sb.append(s);
                string = sb.toString();
            }
        }
        return string;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((o0)o);
    }
}
