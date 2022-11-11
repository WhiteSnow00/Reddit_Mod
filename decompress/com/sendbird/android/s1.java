// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;

public final class s1 implements Runnable
{
    public final /* synthetic */ BaseChannel f;
    public final /* synthetic */ BaseMessage g;
    public final /* synthetic */ a1 h;
    
    public s1(final a1 h, final BaseChannel f, final BaseMessage g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final Iterator iterator = this.h.b.values().iterator();
        while (iterator.hasNext()) {
            ((SendBird$b)iterator.next()).k(this.f, this.g);
        }
    }
}
