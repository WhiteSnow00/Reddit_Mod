// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import com.reddit.ui.compose.components.gridview.LazyListState;
import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = { 61 }, m = "scrollBy")
final class ScrollExtensionsKt$scrollBy$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    
    public ScrollExtensionsKt$scrollBy$1(final lg2.c<? super ScrollExtensionsKt$scrollBy$1> c) {
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.c((LazyListState)null, 0.0f, (lg2.c)this);
    }
}
