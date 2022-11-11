// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import a1.e;
import ah2.f;
import kotlin.Metadata;
import j1.d;
import pg2.j;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Lpg2/j;", "<anonymous parameter 0>", "Lj1/d$b;", "mod", "invoke", "(Lpg2/j;Lj1/d$b;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LayoutNode$markReusedModifiers$2 extends Lambda implements p<j, d.b, j>
{
    public final /* synthetic */ LayoutNode this$0;
    
    public LayoutNode$markReusedModifiers$2(final LayoutNode this$0) {
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(final j j, final d.b b) {
        f.f((Object)j, "<anonymous parameter 0>");
        f.f((Object)b, "mod");
        final e o = this.this$0.o;
        int h = o.h;
        Object o2 = null;
        Label_0098: {
            if (h > 0) {
                --h;
                final T[] f = o.f;
                do {
                    o2 = f[h];
                    final c c = (c)o2;
                    if (c.H == b && !c.I) {
                        break Label_0098;
                    }
                } while (--h >= 0);
            }
            o2 = null;
        }
        final c c2 = (c)o2;
        if (c2 != null) {
            c2.I = true;
        }
    }
}
