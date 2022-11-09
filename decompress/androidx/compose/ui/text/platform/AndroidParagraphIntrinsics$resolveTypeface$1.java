// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.platform;

import z0.e1;
import q2.c;
import ah2.f;
import kotlin.Metadata;
import android.graphics.Typeface;
import n2.l;
import n2.k;
import n2.m;
import n2.g;
import zg2.r;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n" }, d2 = { "Ln2/g;", "fontFamily", "Ln2/m;", "fontWeight", "Ln2/k;", "fontStyle", "Ln2/l;", "fontSynthesis", "Landroid/graphics/Typeface;", "invoke-DPcqOEQ", "(Ln2/g;Ln2/m;II)Landroid/graphics/Typeface;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class AndroidParagraphIntrinsics$resolveTypeface$1 extends Lambda implements r<g, m, k, l, Typeface>
{
    public final /* synthetic */ a this$0;
    
    public AndroidParagraphIntrinsics$resolveTypeface$1(final a this$0) {
        this.this$0 = this$0;
        super(4);
    }
    
    public final Typeface invoke-DPcqOEQ(final g g, final m m, final int n, final int n2) {
        f.f((Object)m, "fontWeight");
        final c c = new c(this.this$0.d.a(g, m, n, n2));
        this.this$0.i.add(c);
        return (Typeface)c.b;
    }
}
