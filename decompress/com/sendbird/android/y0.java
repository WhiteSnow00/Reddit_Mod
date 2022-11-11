// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;

public final class y0 implements Runnable
{
    public final /* synthetic */ GroupChannel f;
    public final /* synthetic */ a1 g;
    
    public y0(final a1 g, final GroupChannel f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        final Iterator iterator = this.g.b.values().iterator();
        while (iterator.hasNext()) {
            ((SendBird$b)iterator.next()).g(this.f);
        }
    }
}
