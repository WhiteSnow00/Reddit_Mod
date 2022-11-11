// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.support.v4.os.ResultReceiver;
import android.os.Bundle;
import androidx.media.MediaBrowserServiceCompat;

public final class 0D4 implements Runnable
{
    public final /* synthetic */ MediaBrowserServiceCompat.k LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Bundle LIZJ;
    public final /* synthetic */ ResultReceiver LIZLLL;
    public final /* synthetic */ MediaBrowserServiceCompat.j LJ;
    
    static {
        Covode.recordClassIndex(1379);
    }
    
    public 0D4(final MediaBrowserServiceCompat.j lj, final MediaBrowserServiceCompat.k liz, final String liziz, final Bundle lizj, final ResultReceiver lizlll) {
        this.LJ = lj;
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final void run() {
        if (this.LJ.LIZ.LIZIZ.get(this.LIZ.LIZ()) == null) {
            return;
        }
        final String liziz = this.LIZIZ;
        final Bundle lizj = this.LIZJ;
        final MediaBrowserServiceCompat.h<Bundle> h = new MediaBrowserServiceCompat.h<Bundle>((Object)liziz) {
            public final /* synthetic */ ResultReceiver LIZ = this.LIZLLL;
            
            static {
                Covode.recordClassIndex(1352);
            }
            
            @Override
            public final void LIZIZ() {
                this.LIZ.LIZIZ(-1, null);
            }
        };
        if (h.LJI || h.LJII) {
            final StringBuilder sb = new StringBuilder("sendError() called when either sendResult() or sendError() had already been called for: ");
            sb.append(h.LJFF);
            throw new IllegalStateException(sb.toString());
        }
        h.LJII = true;
        ((MediaBrowserServiceCompat.h)h).LIZIZ();
        if (((MediaBrowserServiceCompat.h)h).LIZLLL()) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
        sb2.append(liziz);
        sb2.append(" extras=");
        sb2.append(lizj);
        throw new IllegalStateException(sb2.toString());
    }
}
