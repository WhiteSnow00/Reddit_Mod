// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import mg2.q;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import q0.f;
import kotlin.Metadata;
import z0.d;
import q0.j;
import mg2.r;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "Lq0/j;", "interval", "", "index", "Lcg2/j;", "invoke", "(Lq0/j;ILz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class LazyListItemProviderImpl$1 extends Lambda implements r<j, Integer, d, Integer, cg2.j>
{
    public final f $itemScope;
    
    public LazyListItemProviderImpl$1(final f $itemScope) {
        this.$itemScope = $itemScope;
        super(4);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3, final Object o4) {
        this.invoke((j)o, ((Number)o2).intValue(), (d)o3, ((Number)o4).intValue());
        return cg2.j.a;
    }
    
    public final void invoke(final j j, final int n, final d d, int n2) {
        e.f((Object)j, "interval");
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (d.m((Object)j)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            if (d.q(n)) {
                n2 = 32;
            }
            else {
                n2 = 16;
            }
            n5 = (n4 | n2);
        }
        if ((n5 & 0x2DB) == 0x92 && d.d()) {
            d.j();
        }
        else {
            final q a = ComposerKt.a;
            j.c.invoke((Object)this.$itemScope, (Object)n, (Object)d, (Object)(n5 & 0x70));
        }
    }
}
