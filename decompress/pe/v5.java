// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Bundle;

public final class v5 implements Runnable
{
    public final /* synthetic */ u5 f;
    public final /* synthetic */ u5 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ y5 j;
    
    public v5(final y5 j, final u5 f, final u5 g, final long h, final boolean i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        this.j.R(this.f, this.g, this.h, this.i, (Bundle)null);
    }
}
