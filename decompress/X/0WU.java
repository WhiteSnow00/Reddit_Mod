// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.Pair;
import android.os.Message;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import android.os.Handler;

public final class 0WU
{
    public static final Handler LIZ;
    
    static {
        Covode.recordClassIndex(5050);
        LIZ = new 0WT(Looper.getMainLooper());
    }
    
    public static void LIZ() {
        final Handler liz = 0WU.LIZ;
        liz.sendMessage(Message.obtain(liz, 3));
    }
    
    public static void LIZ(final String s, final String s2) {
        final Handler liz = 0WU.LIZ;
        final Message obtain = Message.obtain(liz, 2);
        obtain.obj = new Pair((Object)s, (Object)s2);
        liz.sendMessage(obtain);
    }
}
