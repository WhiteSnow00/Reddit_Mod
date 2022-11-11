// 
// Decompiled by Procyon v0.6.0
// 

package ad;

import android.os.Handler;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.SystemClock;

public final class x implements c
{
    @Override
    public final long a() {
        return SystemClock.uptimeMillis();
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final y c(final Looper looper, final Handler$Callback handler$Callback) {
        return new y(new Handler(looper, handler$Callback));
    }
    
    @Override
    public final long d() {
        return SystemClock.elapsedRealtime();
    }
}
