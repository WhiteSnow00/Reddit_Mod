// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import n2.m;
import n2.g;
import ah2.f;
import kotlin.Metadata;
import n2.w;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Ln2/w;", "it", "", "invoke", "(Ln2/w;)Ljava/lang/Object;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class FontFamilyResolverImpl$createDefaultTypeface$1 extends Lambda implements l<w, Object>
{
    public final /* synthetic */ c this$0;
    
    public FontFamilyResolverImpl$createDefaultTypeface$1(final c this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final Object invoke(final w w) {
        f.f((Object)w, "it");
        final c this$0 = this.this$0;
        final m b = w.b;
        final int c = w.c;
        final int d = w.d;
        final Object e = w.e;
        f.f((Object)b, "fontWeight");
        return this$0.b(new w(null, b, c, d, e)).getValue();
    }
}
