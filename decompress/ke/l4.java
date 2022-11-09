// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.Handler;
import android.database.ContentObserver;

public final class l4 extends ContentObserver
{
    public l4() {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        y4.h.incrementAndGet();
    }
}
