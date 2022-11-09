// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.android;

import android.graphics.Paint;
import java.util.Iterator;
import android.text.Layout;
import kotlin.Pair;
import java.util.Comparator;
import java.util.PriorityQueue;
import e2.d;
import java.text.CharacterIterator;
import java.text.BreakIterator;
import ah2.f;
import android.text.TextPaint;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Float;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LayoutIntrinsics$minIntrinsicWidth$2 extends Lambda implements a<Float>
{
    public final /* synthetic */ CharSequence $charSequence;
    public final /* synthetic */ TextPaint $textPaint;
    
    public LayoutIntrinsics$minIntrinsicWidth$2(final CharSequence $charSequence, final TextPaint $textPaint) {
        this.$charSequence = $charSequence;
        this.$textPaint = $textPaint;
        super(0);
    }
    
    public final Float invoke() {
        final CharSequence $charSequence = this.$charSequence;
        final TextPaint $textPaint = this.$textPaint;
        f.f((Object)$charSequence, "text");
        f.f((Object)$textPaint, "paint");
        final BreakIterator lineInstance = BreakIterator.getLineInstance(((Paint)$textPaint).getTextLocale());
        lineInstance.setText((CharacterIterator)new j2.a($charSequence, $charSequence.length()));
        final PriorityQueue priorityQueue = new PriorityQueue(10, (Comparator<? super E>)new d(1));
        int i = lineInstance.next();
        int n = 0;
        while (i != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair((Object)n, (Object)i));
            }
            else {
                final Pair pair = priorityQueue.peek();
                if (pair != null && ((Number)pair.getSecond()).intValue() - ((Number)pair.getFirst()).intValue() < i - n) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair((Object)n, (Object)i));
                }
            }
            final int next = lineInstance.next();
            n = i;
            i = next;
        }
        float max = 0.0f;
        for (final Pair pair2 : priorityQueue) {
            max = Math.max(max, Layout.getDesiredWidth($charSequence, ((Number)pair2.component1()).intValue(), ((Number)pair2.component2()).intValue(), $textPaint));
        }
        return max;
    }
}
