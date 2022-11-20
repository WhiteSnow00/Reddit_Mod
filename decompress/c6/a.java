// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import v3.g;
import android.os.Looper;
import android.os.Handler;

public final class a
{
    public final Handler a;
    
    public a(final int n) {
        if (n != 1) {
            this.a = g.a(Looper.getMainLooper());
            return;
        }
        this.a = new Handler(Looper.getMainLooper());
    }
}
