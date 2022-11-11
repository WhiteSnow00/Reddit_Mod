// 
// Decompiled by Procyon v0.6.0
// 

package k6;

import androidx.work.impl.foreground.SystemForegroundService;

public final class e implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ SystemForegroundService g;
    
    public e(final SystemForegroundService g, final int f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        this.g.j.cancel(this.f);
    }
}
