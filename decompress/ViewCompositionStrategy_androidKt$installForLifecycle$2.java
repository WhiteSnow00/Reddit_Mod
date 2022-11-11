// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import androidx.lifecycle.p;
import androidx.lifecycle.o;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import pg2.j;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends Lambda implements a<j>
{
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ o $observer;
    
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(final Lifecycle $lifecycle, final o $observer) {
        this.$lifecycle = $lifecycle;
        this.$observer = $observer;
        super(0);
    }
    
    public final void invoke() {
        this.$lifecycle.c((p)this.$observer);
    }
}
