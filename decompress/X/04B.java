// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import android.os.Handler$Callback;

public final class 04b implements Handler$Callback
{
    public final /* synthetic */ 04f LIZ;
    
    static {
        Covode.recordClassIndex(547);
    }
    
    public 04b(final 04f liz) {
        this.LIZ = liz;
    }
    
    public final boolean handleMessage(final Message message) {
        final 04f.b b = (04f.b)message.obj;
        if (b.LIZLLL == null) {
            b.LIZLLL = 0II.LIZ(this.LIZ.LIZ, b.LIZJ, b.LIZIZ, false);
        }
        b.LJ.onInflateFinished(b.LIZLLL, b.LIZJ, b.LIZIZ);
        final 04f.c lizj = this.LIZ.LIZJ;
        b.LJ = null;
        b.LIZ = null;
        b.LIZIZ = null;
        b.LIZJ = 0;
        b.LIZLLL = null;
        lizj.LIZJ.LIZ(b);
        return true;
    }
}
