// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import ah2.f;
import zg2.p;
import kotlin.Metadata;
import z0.d;
import pg2.j;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lpg2/j;", "it", "invoke", "(Lpg2/j;Lz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class MovableContentKt$movableContentOf$movableContent$1 extends Lambda implements q<j, d, Integer, j>
{
    public final /* synthetic */ p<d, Integer, j> $content;
    
    public MovableContentKt$movableContentOf$movableContent$1(final p<? super d, ? super Integer, j> $content) {
        this.$content = (p<d, Integer, j>)$content;
        super(3);
    }
    
    public final void invoke(final j j, final d d, final int n) {
        f.f((Object)j, "it");
        if ((n & 0x51) == 0x10 && d.b()) {
            d.j();
        }
        else {
            this.$content.invoke((Object)d, (Object)0);
        }
    }
}
