// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import ah2.f;
import zg2.q;
import kotlin.Metadata;
import pg2.j;
import z0.d;
import q0.e;
import zg2.r;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Lq0/e;", "", "it", "Lpg2/j;", "invoke", "(Lq0/e;ILz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LazyListScopeImpl$item$3 extends Lambda implements r<e, Integer, d, Integer, j>
{
    public final /* synthetic */ q<e, d, Integer, j> $content;
    
    public LazyListScopeImpl$item$3(final q<? super e, ? super d, ? super Integer, j> $content) {
        this.$content = (q<e, d, Integer, j>)$content;
        super(4);
    }
    
    public final void invoke(final e e, int n, final d d, final int n2) {
        f.f((Object)e, "$this$$receiver");
        n = n2;
        if ((n2 & 0xE) == 0x0) {
            if (d.l(e)) {
                n = 4;
            }
            else {
                n = 2;
            }
            n |= n2;
        }
        if ((n & 0x28B) == 0x82 && d.b()) {
            d.j();
        }
        else {
            this.$content.invoke((Object)e, (Object)d, (Object)(n & 0xE));
        }
    }
}
