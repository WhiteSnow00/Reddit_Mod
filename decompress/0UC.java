// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import android.os.Handler$Callback;

public final class 0Uc implements Handler$Callback
{
    public final /* synthetic */ 0Uf LIZ;
    
    static {
        Covode.recordClassIndex(4736);
    }
    
    public 0Uc(final 0Uf liz) {
        this.LIZ = liz;
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 1) {
            this.LIZ.LIZJ();
            return true;
        }
        return false;
    }
}
