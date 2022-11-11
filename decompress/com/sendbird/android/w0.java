// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;

public final class w0 implements Runnable
{
    public final /* synthetic */ BaseChannel f;
    public final /* synthetic */ ReactionEvent g;
    public final /* synthetic */ a1 h;
    
    public w0(final a1 h, final BaseChannel f, final ReactionEvent g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final Iterator iterator = this.h.b.values().iterator();
        while (iterator.hasNext()) {
            ((SendBird$b)iterator.next()).m(this.f, this.g);
        }
    }
}
