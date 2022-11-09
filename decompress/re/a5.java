// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;

public final class a5 implements Runnable
{
    public final /* synthetic */ long f;
    public final /* synthetic */ n5 g;
    
    public a5(final n5 g, final long f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        ((h4)((w)this.g).f).s().o.b(this.f);
        ((h4)((w)this.g).f).f().r.b(this.f, "Session timeout duration set");
    }
}
