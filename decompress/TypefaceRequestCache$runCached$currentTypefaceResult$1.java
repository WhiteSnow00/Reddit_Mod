// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import ah2.f;
import n2.x;
import n2.w;
import kotlin.Metadata;
import pg2.j;
import n2.y;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Ln2/y;", "finalResult", "Lpg2/j;", "invoke", "(Ln2/y;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements l<y, j>
{
    public final /* synthetic */ w $typefaceRequest;
    public final /* synthetic */ x this$0;
    
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(final x this$0, final w $typefaceRequest) {
        this.this$0 = this$0;
        this.$typefaceRequest = $typefaceRequest;
        super(1);
    }
    
    public final void invoke(final y y) {
        f.f((Object)y, "finalResult");
        final x this$0 = this.this$0;
        final v0.j a = this$0.a;
        final w $typefaceRequest = this.$typefaceRequest;
        synchronized (a) {
            if (y.c()) {
                this$0.b.b((Object)$typefaceRequest, (Object)y);
            }
            else {
                this$0.b.c((Object)$typefaceRequest);
            }
            final j a2 = j.a;
        }
    }
}
