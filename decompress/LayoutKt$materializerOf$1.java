// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.ComposedModifierKt;
import ah2.f;
import kotlin.Metadata;
import pg2.j;
import z0.d;
import androidx.compose.ui.node.ComposeUiNode;
import z0.v0;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Lz0/v0;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lpg2/j;", "invoke-Deg8D_g", "(Lz0/d;Lz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LayoutKt$materializerOf$1 extends Lambda implements q<v0<ComposeUiNode>, d, Integer, j>
{
    public final /* synthetic */ j1.d $modifier;
    
    public LayoutKt$materializerOf$1(final j1.d $modifier) {
        this.$modifier = $modifier;
        super(3);
    }
    
    public final void invoke-Deg8D_g(final d d, final d d2, final int n) {
        f.f((Object)d, "$this$null");
        final j1.d c = ComposedModifierKt.c(d2, this.$modifier);
        d.A(509942095);
        ComposeUiNode.w2.getClass();
        Updater.b(d, (Object)c, ComposeUiNode$Companion.c);
        d.I();
    }
}
