// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.Handler;
import android.database.ContentObserver;

public final class d4 extends ContentObserver
{
    public d4() {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        e4.d.set(true);
    }
}
