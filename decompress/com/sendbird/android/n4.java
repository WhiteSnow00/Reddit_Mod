// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

public final class n4 implements Runnable
{
    public final /* synthetic */ SendBird$e f;
    
    public n4(final o4 f) {
        this.f = (SendBird$e)f;
    }
    
    @Override
    public final void run() {
        final SendBird$e f = this.f;
        if (f != null) {
            final o4 o4 = (o4)f;
            o4.a.run();
            if (o4.b) {
                o4.c.k(SocketManager$ReconnectState.FAIL);
            }
        }
    }
}
