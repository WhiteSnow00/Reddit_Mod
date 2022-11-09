// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.CancellationException;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public final class 15o implements Closeable, BFk
{
    public final F2r LIZ;
    
    static {
        Covode.recordClassIndex(1253);
    }
    
    public 15o(final F2r liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    @Override
    public final void close() {
        F0y.LIZ(this.getCoroutineContext(), (CancellationException)null);
    }
    
    public final F2r getCoroutineContext() {
        return this.LIZ;
    }
}
