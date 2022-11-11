// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0Y2 implements Runnable
{
    public final /* synthetic */ 0YK LIZ;
    public final /* synthetic */ int LIZIZ;
    
    static {
        Covode.recordClassIndex(5210);
    }
    
    public 0Y2(final 0YK liz, final int liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        if (n.LIZ((Object)this.LIZ.LJIJJ, (Object)this.LIZ.LJJI)) {
            return;
        }
        this.LIZ.LJJIJIIJIL.LIZ.LIZIZ(this.LIZIZ);
    }
}
