// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.IBinder;
import android.os.IBinder$DeathRecipient;
import com.bytedance.covode.number.Covode;
import androidx.media.MediaBrowserServiceCompat;

public final class 0D2 implements Runnable
{
    public final /* synthetic */ MediaBrowserServiceCompat.k LIZ;
    public final /* synthetic */ MediaBrowserServiceCompat.j LIZIZ;
    
    static {
        Covode.recordClassIndex(1377);
    }
    
    public 0D2(final MediaBrowserServiceCompat.j liziz, final MediaBrowserServiceCompat.k liz) {
        this.LIZIZ = liziz;
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final IBinder liz = this.LIZ.LIZ();
        final MediaBrowserServiceCompat.b b = this.LIZIZ.LIZ.LIZIZ.remove(liz);
        if (b != null) {
            liz.unlinkToDeath((IBinder$DeathRecipient)b, 0);
        }
    }
}
