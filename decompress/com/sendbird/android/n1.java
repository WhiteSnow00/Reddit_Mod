// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;

public final class n1 implements Runnable
{
    public final /* synthetic */ k3 f;
    public final /* synthetic */ BaseMessage g;
    public final /* synthetic */ a1 h;
    
    public n1(final a1 h, final k3 f, final BaseMessage g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final Iterator iterator = this.h.c.values().iterator();
        while (iterator.hasNext()) {
            ((b3)iterator.next()).b((BaseChannel)this.f, this.g);
        }
        final Iterator iterator2 = this.h.b.values().iterator();
        while (iterator2.hasNext()) {
            ((SendBird$b)iterator2.next()).a((BaseChannel)this.f);
        }
    }
}
