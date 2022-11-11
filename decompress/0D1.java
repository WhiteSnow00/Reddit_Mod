// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.os.IBinder;
import android.text.TextUtils;
import android.os.RemoteException;
import android.os.IBinder$DeathRecipient;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import androidx.media.MediaBrowserServiceCompat;

public final class 0D1 implements Runnable
{
    public final /* synthetic */ MediaBrowserServiceCompat.k LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ MediaBrowserServiceCompat.j LJ;
    
    static {
        Covode.recordClassIndex(1376);
    }
    
    public 0D1(final MediaBrowserServiceCompat.j lj, final MediaBrowserServiceCompat.k liz, final int liziz, final String lizj, final int lizlll, final Bundle bundle) {
        this.LJ = lj;
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final void run() {
        final IBinder liz = this.LIZ.LIZ();
        this.LJ.LIZ.LIZIZ.remove(liz);
        final Iterator<MediaBrowserServiceCompat.b> iterator = this.LJ.LIZ.LIZ.iterator();
        while (true) {
            while (true) {
                MediaBrowserServiceCompat.b b;
                Object o;
                do {
                    final boolean hasNext = iterator.hasNext();
                    o = null;
                    if (hasNext) {
                        b = iterator.next();
                    }
                    else {
                        final Object o2 = this.LJ.LIZ.new b(this.LIZJ, this.LIZLLL, this.LIZIZ, this.LIZ);
                        this.LJ.LIZ.LIZIZ.put(liz, (MediaBrowserServiceCompat.b)o2);
                        try {
                            liz.linkToDeath((IBinder$DeathRecipient)o2, 0);
                            return;
                        }
                        catch (final RemoteException ex) {
                            return;
                        }
                    }
                } while (b.LIZJ != this.LIZIZ);
                if (TextUtils.isEmpty((CharSequence)this.LIZJ) || this.LIZLLL <= 0) {
                    o = this.LJ.LIZ.new b(b.LIZ, b.LIZIZ, b.LIZJ, this.LIZ);
                }
                iterator.remove();
                Object o2;
                if ((o2 = o) == null) {
                    continue;
                }
                break;
            }
            continue;
        }
    }
}
