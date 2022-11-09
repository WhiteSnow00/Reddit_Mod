// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import ah2.f;
import zg2.q;
import kotlin.Metadata;
import z0.d;
import r0.j;
import zg2.r;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Lr0/j;", "", "it", "Lpg2/j;", "invoke", "(Lr0/j;ILz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LazyGridScopeImpl$item$4 extends Lambda implements r<j, Integer, d, Integer, pg2.j>
{
    public final /* synthetic */ q<j, d, Integer, pg2.j> $content;
    
    public LazyGridScopeImpl$item$4(final q<? super j, ? super d, ? super Integer, pg2.j> $content) {
        this.$content = (q<j, d, Integer, pg2.j>)$content;
        super(4);
    }
    
    public final void invoke(final j j, int n, final d d, final int n2) {
        f.f((Object)j, "$this$$receiver");
        n = n2;
        if ((n2 & 0xE) == 0x0) {
            if (d.l(j)) {
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
            this.$content.invoke((Object)j, (Object)d, (Object)(n & 0xE));
        }
    }
}
