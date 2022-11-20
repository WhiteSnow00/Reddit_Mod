// 
// Decompiled by Procyon v0.6.0
// 

package dev.chrisbanes.snapper;

import wi2.v;
import wi2.v$a;
import kotlin.Metadata;
import pe2.c;
import mg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpe2/c;", "invoke", "()Lpe2/c;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LazyListSnapperLayoutInfo$currentItem$2 extends Lambda implements a<c>
{
    public final dev.chrisbanes.snapper.a this$0;
    
    public LazyListSnapperLayoutInfo$currentItem$2(final dev.chrisbanes.snapper.a this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    public final c invoke() {
        final v j = this.this$0.j();
        final dev.chrisbanes.snapper.a this$0 = this.this$0;
        final v$a v$a = new v$a(j);
        c c = null;
        while (v$a.hasNext()) {
            final Object next = v$a.next();
            final c c2 = (c)next;
            if (c2.b() <= ((Number)this$0.b.invoke((Object)this$0, (Object)c2)).intValue()) {
                c = (c)next;
            }
        }
        return c;
    }
}
