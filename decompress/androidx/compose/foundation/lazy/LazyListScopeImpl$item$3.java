// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposerKt;
import mg2.q;
import kotlin.Metadata;
import cg2.j;
import z0.d;
import q0.e;
import mg2.r;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Lq0/e;", "", "it", "Lcg2/j;", "invoke", "(Lq0/e;ILz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class LazyListScopeImpl$item$3 extends Lambda implements r<e, Integer, d, Integer, j>
{
    public final q<e, d, Integer, j> $content;
    
    public LazyListScopeImpl$item$3(final q<? super e, ? super d, ? super Integer, j> $content) {
        this.$content = (q<e, d, Integer, j>)$content;
        super(4);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3, final Object o4) {
        this.invoke((e)o, ((Number)o2).intValue(), (d)o3, ((Number)o4).intValue());
        return j.a;
    }
    
    public final void invoke(final e e, int n, final d d, final int n2) {
        ng2.e.f((Object)e, "$this$$receiver");
        n = n2;
        if ((n2 & 0xE) == 0x0) {
            if (d.m((Object)e)) {
                n = 4;
            }
            else {
                n = 2;
            }
            n |= n2;
        }
        if ((n & 0x28B) == 0x82 && d.d()) {
            d.j();
        }
        else {
            final q a = ComposerKt.a;
            this.$content.invoke((Object)e, (Object)d, (Object)(n & 0xE));
        }
    }
}
