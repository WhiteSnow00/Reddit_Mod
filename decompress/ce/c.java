// 
// Decompiled by Procyon v0.6.0
// 

package ce;

import android.os.IBinder;
import android.os.IInterface;

public final class c implements b, IInterface
{
    public final IBinder a;
    
    public c(final IBinder a) {
        this.a = a;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
