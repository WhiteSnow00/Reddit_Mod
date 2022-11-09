// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import z0.e0;
import kotlin.Metadata;
import pg2.j;
import z0.d;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "(Lz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class MovableContentKt$movableContentOf$1 extends Lambda implements p<d, Integer, j>
{
    public final /* synthetic */ e0<j> $movableContent;
    
    public MovableContentKt$movableContentOf$1(final e0<j> $movableContent) {
        this.$movableContent = $movableContent;
        super(2);
    }
    
    public final void invoke(final d d, final int n) {
        if ((n & 0xB) == 0x2 && d.b()) {
            d.j();
        }
        else {
            d.w(this.$movableContent, j.a);
        }
    }
}
