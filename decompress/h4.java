// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;
import android.os.Handler;
import android.database.ContentObserver;

public final class h4 extends ContentObserver
{
    public final /* synthetic */ i4 a;
    
    public h4(final i4 a) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        final i4 a = this.a;
        synchronized (a.e) {
            a.f = null;
            a.c.run();
            monitorexit(a.e);
            synchronized (a) {
                final Iterator iterator = a.g.iterator();
                while (iterator.hasNext()) {
                    ((j4)iterator.next()).zza();
                }
            }
        }
    }
}
