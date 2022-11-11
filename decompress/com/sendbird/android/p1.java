// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;

public final class p1 implements Runnable
{
    public final /* synthetic */ BaseChannel f;
    public final /* synthetic */ BaseMessage g;
    public final /* synthetic */ a1 h;
    
    public p1(final a1 h, final BaseChannel f, final BaseMessage g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        for (final SendBird$b sendBird$b : this.h.b.values()) {
            if (k3.q.get(this.f.a) != null) {
                sendBird$b.j(this.f, this.g);
            }
            if (this.g.j()) {
                sendBird$b.h(this.f);
            }
        }
    }
}
