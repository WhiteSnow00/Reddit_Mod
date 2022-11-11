// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

public final class v4 implements Runnable
{
    public final /* synthetic */ Object f;
    public final /* synthetic */ w4 g;
    
    public v4(final w4 g, final Object f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        synchronized (this.g.b) {
            final w4.a a = (w4.a)this.g.a.get(this.f);
            if (a != null && a.b) {
                this.g.a.remove(this.f);
            }
        }
    }
}
