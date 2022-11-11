// 
// Decompiled by Procyon v0.6.0
// 

package k6;

import android.app.Service;
import android.os.Build$VERSION;
import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;

public final class c implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Notification g;
    public final /* synthetic */ int h;
    public final /* synthetic */ SystemForegroundService i;
    
    public c(final SystemForegroundService i, final int f, final Notification g, final int h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        if (Build$VERSION.SDK_INT >= 29) {
            ((Service)this.i).startForeground(this.f, this.g, this.h);
        }
        else {
            ((Service)this.i).startForeground(this.f, this.g);
        }
    }
}
