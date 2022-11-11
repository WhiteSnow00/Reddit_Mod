// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import pg2.j;
import androidx.compose.foundation.MutatePriority;
import com.reddit.ui.compose.components.gridview.LazyListState;
import at1.a;
import zg2.p;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import l0.d;
import n0.k;

public final class ScrollExtensionsKt
{
    public static final Object a(final k k, final float n, final d<Float> d, final c<? super Float> c) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$2 = null;
        Label_0053: {
            if (c instanceof ScrollExtensionsKt$animateScrollBy$1) {
                final ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1)c;
                final int label = scrollExtensionsKt$animateScrollBy$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    scrollExtensionsKt$animateScrollBy$1.label = label + Integer.MIN_VALUE;
                    scrollExtensionsKt$animateScrollBy$2 = scrollExtensionsKt$animateScrollBy$1;
                    break Label_0053;
                }
            }
            scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$1((c)c);
        }
        final Object result = scrollExtensionsKt$animateScrollBy$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = scrollExtensionsKt$animateScrollBy$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o = scrollExtensionsKt$animateScrollBy$2.L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final Ref$FloatRef l$0 = new Ref$FloatRef();
            final ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$3 = new ScrollExtensionsKt$animateScrollBy$2(n, (d)d, l$0, (c)null);
            scrollExtensionsKt$animateScrollBy$2.L$0 = l$0;
            scrollExtensionsKt$animateScrollBy$2.label = 1;
            if (k.d(k, (p)scrollExtensionsKt$animateScrollBy$3, (c)scrollExtensionsKt$animateScrollBy$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o = l$0;
        }
        return new Float(((Ref$FloatRef)o).element);
    }
    
    public static final Object c(final LazyListState lazyListState, final float n, final c c) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$2 = null;
        Label_0049: {
            if (c instanceof ScrollExtensionsKt$scrollBy$1) {
                final ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1)c;
                final int label = scrollExtensionsKt$scrollBy$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    scrollExtensionsKt$scrollBy$1.label = label + Integer.MIN_VALUE;
                    scrollExtensionsKt$scrollBy$2 = scrollExtensionsKt$scrollBy$1;
                    break Label_0049;
                }
            }
            scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$1(c);
        }
        final Object result = scrollExtensionsKt$scrollBy$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = scrollExtensionsKt$scrollBy$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o = scrollExtensionsKt$scrollBy$2.L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final Ref$FloatRef l$0 = new Ref$FloatRef();
            final ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$3 = new ScrollExtensionsKt$scrollBy$2(l$0, n, (c)null);
            scrollExtensionsKt$scrollBy$2.L$0 = l$0;
            scrollExtensionsKt$scrollBy$2.label = 1;
            if (k.d((k)lazyListState, (p)scrollExtensionsKt$scrollBy$3, (c)scrollExtensionsKt$scrollBy$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o = l$0;
        }
        return new Float(((Ref$FloatRef)o).element);
    }
    
    public static Object d(final androidx.compose.foundation.lazy.LazyListState lazyListState, final c c) {
        Object o = lazyListState.a(MutatePriority.Default, (p)new ScrollExtensionsKt$stopScroll$2((c)null), c);
        if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o = j.a;
        }
        return o;
    }
}
