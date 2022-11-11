// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.Metadata;
import pg2.j;
import z0.d;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "(Lz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LayoutNodeSubcompositionsState$subcompose$2$1$1 extends Lambda implements p<d, Integer, j>
{
    public final /* synthetic */ p<d, Integer, j> $content;
    public final /* synthetic */ b$a $nodeState;
    
    public LayoutNodeSubcompositionsState$subcompose$2$1$1(final b$a $nodeState, final p<? super d, ? super Integer, j> $content) {
        this.$nodeState = $nodeState;
        this.$content = (p<d, Integer, j>)$content;
        super(2);
    }
    
    public final void invoke(final d d, final int n) {
        if ((n & 0xB) == 0x2 && d.b()) {
            d.j();
        }
        else {
            final boolean booleanValue = ((SnapshotMutableStateImpl<Boolean>)this.$nodeState.e).getValue();
            final p<d, Integer, j> $content = this.$content;
            d.g(booleanValue);
            final boolean m = d.m(booleanValue);
            if (booleanValue) {
                $content.invoke((Object)d, (Object)0);
            }
            else {
                d.a(m);
            }
            d.z();
        }
    }
}
