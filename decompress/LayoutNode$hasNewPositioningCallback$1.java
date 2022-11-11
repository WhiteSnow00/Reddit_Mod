// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import ah2.f;
import c2.x;
import kotlin.Pair;
import a1.e;
import kotlin.Metadata;
import j1.d;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Lj1/d$b;", "mod", "", "hasNewCallback", "invoke", "(Lj1/d$b;Z)Ljava/lang/Boolean;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LayoutNode$hasNewPositioningCallback$1 extends Lambda implements p<d.b, Boolean, Boolean>
{
    public final /* synthetic */ e<Pair<LayoutNodeWrapper, x>> $onPositionedCallbacks;
    
    public LayoutNode$hasNewPositioningCallback$1(final e<Pair<LayoutNodeWrapper, x>> $onPositionedCallbacks) {
        this.$onPositionedCallbacks = $onPositionedCallbacks;
        super(2);
    }
    
    public final Boolean invoke(final d.b b, final boolean b2) {
        f.f((Object)b, "mod");
        final boolean b3 = false;
        if (!b2) {
            boolean b4 = b3;
            if (!(b instanceof x)) {
                return b4;
            }
            final e<Pair<LayoutNodeWrapper, x>> $onPositionedCallbacks = this.$onPositionedCallbacks;
            Pair pair = null;
            final Pair pair2 = null;
            if ($onPositionedCallbacks != null) {
                final int h = $onPositionedCallbacks.h;
                Pair pair3 = pair2;
                Label_0110: {
                    if (h > 0) {
                        final Pair<LayoutNodeWrapper, x>[] f = $onPositionedCallbacks.f;
                        int n = 0;
                        do {
                            pair3 = f[n];
                            if (ah2.f.a((Object)b, pair3.getSecond())) {
                                break Label_0110;
                            }
                        } while (++n < h);
                        pair3 = pair2;
                    }
                }
                pair = pair3;
            }
            b4 = b3;
            if (pair != null) {
                return b4;
            }
        }
        return true;
    }
}
