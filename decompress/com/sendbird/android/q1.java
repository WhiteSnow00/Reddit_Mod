// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;
import ec2.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class q1 implements Runnable
{
    public final /* synthetic */ GroupChannel f;
    public final /* synthetic */ BaseMessage g;
    public final /* synthetic */ AtomicBoolean h;
    public final /* synthetic */ a1 i;
    
    public q1(final a1 i, final GroupChannel f, final BaseMessage g, final AtomicBoolean h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        for (final SendBird$b sendBird$b : this.i.b.values()) {
            sendBird$b.j((BaseChannel)this.f, this.g);
            a.b("__ callChannelChanged = %s", new Object[] { this.h.get() });
            if (this.h.get()) {
                sendBird$b.a((BaseChannel)this.f);
            }
            if (this.g.j()) {
                sendBird$b.h((BaseChannel)this.f);
            }
        }
    }
}
