// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class r1 implements Runnable
{
    public final /* synthetic */ GroupChannel f;
    public final /* synthetic */ BaseMessage g;
    public final /* synthetic */ AtomicBoolean h;
    public final /* synthetic */ AtomicBoolean i;
    public final /* synthetic */ a1 j;
    
    public r1(final a1 j, final GroupChannel f, final BaseMessage g, final AtomicBoolean h, final AtomicBoolean i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        for (final SendBird$b sendBird$b : this.j.b.values()) {
            sendBird$b.k((BaseChannel)this.f, this.g);
            if (this.h.get()) {
                sendBird$b.a((BaseChannel)this.f);
            }
            if (this.i.get()) {
                sendBird$b.h((BaseChannel)this.f);
            }
        }
    }
}
