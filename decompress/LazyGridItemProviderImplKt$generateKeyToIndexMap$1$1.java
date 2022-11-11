// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import java.util.HashMap;
import kotlin.Metadata;
import pg2.j;
import r0.f;
import s0.c$a;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Ls0/c$a;", "Lr0/f;", "it", "Lpg2/j;", "invoke", "(Ls0/c$a;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LazyGridItemProviderImplKt$generateKeyToIndexMap$1$1 extends Lambda implements l<c$a<f>, j>
{
    public final /* synthetic */ int $first;
    public final /* synthetic */ int $last;
    public final /* synthetic */ HashMap<Object, Integer> $map;
    
    public LazyGridItemProviderImplKt$generateKeyToIndexMap$1$1(final int $first, final int $last, final HashMap<Object, Integer> $map) {
        this.$first = $first;
        this.$last = $last;
        this.$map = $map;
        super(1);
    }
    
    public final void invoke(final c$a<f> c$a) {
        ah2.f.f((Object)c$a, "it");
        final Object c = c$a.c;
        if (((f)c).a != null) {
            final l a = ((f)c).a;
            if (a == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            int max = Math.max(this.$first, c$a.a);
            final int min = Math.min(this.$last, c$a.a + c$a.b - 1);
            if (max <= min) {
                while (true) {
                    this.$map.put(a.invoke((Object)(max - c$a.a)), max);
                    if (max == min) {
                        break;
                    }
                    ++max;
                }
            }
        }
    }
}
