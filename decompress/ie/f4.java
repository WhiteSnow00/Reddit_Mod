// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.Handler;
import android.database.ContentObserver;

public final class f4 extends ContentObserver
{
    public f4() {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        g4.d.set(true);
    }
}
