// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.sequences;

import kotlin.Metadata;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "T", "it", "", "invoke", "(I)Ljava/lang/Object;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class SequencesKt___SequencesKt$elementAt$1 extends Lambda implements l<Integer, Object>
{
    public final /* synthetic */ int $index;
    
    public SequencesKt___SequencesKt$elementAt$1(final int $index) {
        this.$index = $index;
        super(1);
    }
    
    public final Object invoke(final int n) {
        throw new IndexOutOfBoundsException(d.l(a.r("Sequence doesn't contain element at index "), this.$index, '.'));
    }
}
