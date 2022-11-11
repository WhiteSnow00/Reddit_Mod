// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import o0.j;
import m0.q;
import j1.d;
import z1.k;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import z1.c;
import yd.a;
import d2.e;

public final class ScrollableKt
{
    public static final ScrollableKt$a a;
    public static final e<Boolean> b;
    
    static {
        a = new ScrollableKt$a();
        b = yd.a.Y1((zg2.a)ScrollableKt$ModifierLocalScrollableContainer$1.INSTANCE);
    }
    
    public static final Object a(c l$0, final tg2.c c) {
        Object o = null;
        Label_0046: {
            if (c instanceof ScrollableKt$awaitScrollEvent$1) {
                final ScrollableKt$awaitScrollEvent$1 scrollableKt$awaitScrollEvent$1 = (ScrollableKt$awaitScrollEvent$1)c;
                final int label = scrollableKt$awaitScrollEvent$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    scrollableKt$awaitScrollEvent$1.label = label + Integer.MIN_VALUE;
                    o = scrollableKt$awaitScrollEvent$1;
                    break Label_0046;
                }
            }
            o = new ScrollableKt$awaitScrollEvent$1(c);
        }
        Object o2 = ((ScrollableKt$awaitScrollEvent$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((ScrollableKt$awaitScrollEvent$1)o).label;
        k k;
        while (true) {
            Label_0132: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$0 = (c)((ScrollableKt$awaitScrollEvent$1)o).L$0;
                        aj2.c.Q0(o2);
                        break Label_0132;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    aj2.c.Q0(o2);
                }
                ((ScrollableKt$awaitScrollEvent$1)o).L$0 = l$0;
                ((ScrollableKt$awaitScrollEvent$1)o).label = 1;
                if ((o2 = c.O0(l$0, (BaseContinuationImpl)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            k = (k)o2;
            if (k.c != 6) {
                continue;
            }
            break;
        }
        return (CoroutineSingletons)k;
    }
    
    public static final d b(final d d, final n0.k k, final Orientation orientation, final q q, final boolean b, final boolean b2, final n0.d d2, final j j) {
        f.f((Object)d, "<this>");
        f.f((Object)k, "state");
        f.f((Object)orientation, "orientation");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (zg2.q)new ScrollableKt$scrollable$2(orientation, k, b2, j, d2, q, b));
    }
    
    public static d c(final d d, final n0.k k, final Orientation orientation, boolean b, boolean b2, j j, final int n) {
        if ((n & 0x4) != 0x0) {
            b = true;
        }
        if ((n & 0x8) != 0x0) {
            b2 = false;
        }
        if ((n & 0x20) != 0x0) {
            j = null;
        }
        f.f((Object)d, "<this>");
        f.f((Object)k, "state");
        f.f((Object)orientation, "orientation");
        return b(d, k, orientation, null, b, b2, null, j);
    }
}
