// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class m1 implements Runnable
{
    public final /* synthetic */ GroupChannel f;
    public final /* synthetic */ BaseMessage g;
    public final /* synthetic */ AtomicBoolean h;
    public final /* synthetic */ a1 i;
    
    public m1(final a1 i, final GroupChannel f, final BaseMessage g, final AtomicBoolean h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final Iterator iterator = this.i.c.values().iterator();
        while (iterator.hasNext()) {
            ((b3)iterator.next()).b((BaseChannel)this.f, this.g);
        }
        for (final SendBird$b sendBird$b : this.i.b.values()) {
            if (this.h.get()) {
                sendBird$b.a((BaseChannel)this.f);
            }
        }
    }
}
