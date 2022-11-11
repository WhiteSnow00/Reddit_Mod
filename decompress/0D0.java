// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Parcelable;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import com.bytedance.covode.number.Covode;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

public final class 0D0 implements Runnable
{
    public final /* synthetic */ MediaBrowserServiceCompat.k LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ ResultReceiver LIZJ;
    public final /* synthetic */ MediaBrowserServiceCompat.j LIZLLL;
    
    static {
        Covode.recordClassIndex(1375);
    }
    
    public 0D0(final MediaBrowserServiceCompat.j lizlll, final MediaBrowserServiceCompat.k liz, final String liziz, final ResultReceiver lizj) {
        this.LIZLLL = lizlll;
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void run() {
        if (this.LIZLLL.LIZ.LIZIZ.get(this.LIZ.LIZ()) == null) {
            return;
        }
        final MediaBrowserServiceCompat liz = this.LIZLLL.LIZ;
        final String liziz = this.LIZIZ;
        final MediaBrowserServiceCompat.h<MediaBrowserCompat.MediaItem> h = new MediaBrowserServiceCompat.h<MediaBrowserCompat.MediaItem>((Object)liziz) {
            public final /* synthetic */ ResultReceiver LIZ = this.LIZJ;
            
            static {
                Covode.recordClassIndex(1350);
            }
        };
        liz.LIZ((MediaBrowserServiceCompat.h)h);
        if (((MediaBrowserServiceCompat.h)h).LIZLLL()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(liziz)));
    }
}
