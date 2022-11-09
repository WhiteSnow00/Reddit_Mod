// 
// Decompiled by Procyon v0.6.0
// 

package k6;

import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;

public final class d implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Notification g;
    public final /* synthetic */ SystemForegroundService h;
    
    public d(final SystemForegroundService h, final int f, final Notification g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        this.h.j.notify(this.f, this.g);
    }
}
