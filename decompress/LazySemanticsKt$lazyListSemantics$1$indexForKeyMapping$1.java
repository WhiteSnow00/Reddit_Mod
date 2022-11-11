// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import ah2.f;
import kotlin.Metadata;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1 extends Lambda implements l<Object, Integer>
{
    public final /* synthetic */ q0.l $itemProvider;
    
    public LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1(final q0.l $itemProvider) {
        this.$itemProvider = $itemProvider;
        super(1);
    }
    
    public final Integer invoke(final Object o) {
        f.f(o, "needle");
        final LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 = new LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1((Object)this.$itemProvider);
        for (int k0 = this.$itemProvider.K0(), i = 0; i < k0; ++i) {
            if (f.a(((l)lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1).invoke((Object)i), o)) {
                return i;
            }
        }
        return -1;
    }
}
