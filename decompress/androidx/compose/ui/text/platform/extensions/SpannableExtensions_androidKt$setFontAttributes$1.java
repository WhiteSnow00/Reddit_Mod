// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.platform.extensions;

import ah2.f;
import android.text.Spannable;
import android.graphics.Typeface;
import n2.l;
import n2.m;
import n2.g;
import zg2.r;
import kotlin.Metadata;
import pg2.j;
import i2.k;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007" }, d2 = { "Li2/k;", "spanStyle", "", "start", "end", "Lpg2/j;", "invoke", "(Li2/k;II)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements q<k, Integer, Integer, j>
{
    public final /* synthetic */ r<g, m, n2.k, l, Typeface> $resolveTypeface;
    public final /* synthetic */ Spannable $this_setFontAttributes;
    
    public SpannableExtensions_androidKt$setFontAttributes$1(final Spannable $this_setFontAttributes, final r<? super g, ? super m, ? super n2.k, ? super l, ? extends Typeface> $resolveTypeface) {
        this.$this_setFontAttributes = $this_setFontAttributes;
        this.$resolveTypeface = (r<g, m, n2.k, l, Typeface>)$resolveTypeface;
        super(3);
    }
    
    public final void invoke(final k k, final int n, final int n2) {
        f.f((Object)k, "spanStyle");
        final Spannable $this_setFontAttributes = this.$this_setFontAttributes;
        final r<g, m, n2.k, l, Typeface> $resolveTypeface = this.$resolveTypeface;
        final g f = k.f;
        m m;
        if ((m = k.c) == null) {
            final m g = n2.m.g;
            m = n2.m.m;
        }
        final n2.k d = k.d;
        int a;
        if (d != null) {
            a = d.a;
        }
        else {
            a = 0;
        }
        final n2.k i = new n2.k(a);
        final l e = k.e;
        int a2;
        if (e != null) {
            a2 = e.a;
        }
        else {
            a2 = 1;
        }
        $this_setFontAttributes.setSpan((Object)new l2.j((Typeface)$resolveTypeface.invoke((Object)f, (Object)m, (Object)i, (Object)new l(a2)), 0), n, n2, 33);
    }
}
