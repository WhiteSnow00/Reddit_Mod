// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player;

import mg2.l;
import ng2.e;
import android.view.Surface;

public final class b implements Runnable
{
    public final Player f;
    public final Surface g;
    
    public b(final Player f, final Surface g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final Player f = this.f;
        final Surface g = this.g;
        e.f((Object)f, "this$0");
        f.f.setSurface(g);
        f.h.b("read playerView", (l)new Player$playerView$1(f));
    }
}
