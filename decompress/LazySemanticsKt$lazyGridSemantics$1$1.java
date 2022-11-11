// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import h2.o;
import ah2.f;
import zg2.p;
import h2.b;
import h2.h;
import kotlin.Metadata;
import pg2.j;
import h2.q;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazySemanticsKt$lazyGridSemantics$1$1 extends Lambda implements l<q, j>
{
    public final /* synthetic */ h $accessibilityScrollState;
    public final /* synthetic */ b $collectionInfo;
    public final /* synthetic */ l<Object, Integer> $indexForKeyMapping;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ p<Float, Float, Boolean> $scrollByAction;
    public final /* synthetic */ l<Integer, Boolean> $scrollToIndexAction;
    
    public LazySemanticsKt$lazyGridSemantics$1$1(final l<Object, Integer> $indexForKeyMapping, final boolean $isVertical, final h $accessibilityScrollState, final p<? super Float, ? super Float, Boolean> $scrollByAction, final l<? super Integer, Boolean> $scrollToIndexAction, final b $collectionInfo) {
        this.$indexForKeyMapping = $indexForKeyMapping;
        this.$isVertical = $isVertical;
        this.$accessibilityScrollState = $accessibilityScrollState;
        this.$scrollByAction = (p<Float, Float, Boolean>)$scrollByAction;
        this.$scrollToIndexAction = (l<Integer, Boolean>)$scrollToIndexAction;
        this.$collectionInfo = $collectionInfo;
        super(1);
    }
    
    public final void invoke(final q q) {
        f.f((Object)q, "$this$semantics");
        o.b(q, (l)this.$indexForKeyMapping);
        if (this.$isVertical) {
            o.l(q, this.$accessibilityScrollState);
        }
        else {
            o.h(q, this.$accessibilityScrollState);
        }
        final p<Float, Float, Boolean> $scrollByAction = this.$scrollByAction;
        if ($scrollByAction != null) {
            o.d(q, (p)$scrollByAction);
        }
        final l<Integer, Boolean> $scrollToIndexAction = this.$scrollToIndexAction;
        if ($scrollToIndexAction != null) {
            o.e(q, (l)$scrollToIndexAction);
        }
        o.f(q, this.$collectionInfo);
    }
}
