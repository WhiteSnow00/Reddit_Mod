// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import u2.a;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "", "startSlot", "span", "Lu2/a;", "invoke-JhjzzOo", "(II)J", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LazyMeasuredLineProvider$childConstraints$1 extends Lambda implements p<Integer, Integer, a>
{
    public final /* synthetic */ int $crossAxisSpacing;
    public final /* synthetic */ List<Integer> $slotSizesSums;
    public final /* synthetic */ b this$0;
    
    public LazyMeasuredLineProvider$childConstraints$1(final List<Integer> $slotSizesSums, final int $crossAxisSpacing, final b this$0) {
        this.$slotSizesSums = $slotSizesSums;
        this.$crossAxisSpacing = $crossAxisSpacing;
        this.this$0 = this$0;
        super(2);
    }
    
    public final long invoke-JhjzzOo(int n, final int n2) {
        final int intValue = this.$slotSizesSums.get(n + n2 - 1).intValue();
        if (n == 0) {
            n = 0;
        }
        else {
            n = this.$slotSizesSums.get(n - 1).intValue();
        }
        n = a.w(n2, -1, this.$crossAxisSpacing, intValue - n);
        long n3;
        if (this.this$0.a) {
            n3 = a.a.e(n);
        }
        else {
            n3 = a.a.d(n);
        }
        return n3;
    }
}
