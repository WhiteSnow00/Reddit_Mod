// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;

public final class x0 implements Runnable
{
    public final /* synthetic */ boolean f;
    public final /* synthetic */ GroupChannel g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ a1 i;
    
    public x0(final a1 i, final boolean f, final GroupChannel g, final boolean h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        for (final SendBird$b sendBird$b : this.i.b.values()) {
            if (!this.f) {
                sendBird$b.n(this.g);
            }
            if (this.h) {
                sendBird$b.a((BaseChannel)this.g);
            }
        }
    }
}
