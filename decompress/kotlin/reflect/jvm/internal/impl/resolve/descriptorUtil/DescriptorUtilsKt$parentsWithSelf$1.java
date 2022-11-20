// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import ng2.e;
import ch2.g;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class DescriptorUtilsKt$parentsWithSelf$1 extends Lambda implements l<g, g>
{
    public static final DescriptorUtilsKt$parentsWithSelf$1 INSTANCE;
    
    static {
        INSTANCE = new DescriptorUtilsKt$parentsWithSelf$1();
    }
    
    public DescriptorUtilsKt$parentsWithSelf$1() {
        super(1);
    }
    
    public final g invoke(final g g) {
        e.f((Object)g, "it");
        return g.b();
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((g)o);
    }
}
