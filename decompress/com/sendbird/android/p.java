// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import fc2.g;
import y30.x;

public final class p implements Runnable
{
    public final /* synthetic */ t4 f;
    public final /* synthetic */ BaseChannel$b g;
    
    public p(final x g, final t4 f) {
        this.f = f;
        this.g = (BaseChannel$b)g;
    }
    
    @Override
    public final void run() {
        final t4 f = this.f;
        final int e = BaseMessage.E;
        final t4 t4 = (t4)BaseMessage.e((g)f.k(), ((BaseMessage)f).e, ((BaseMessage)f).f);
        if (t4 != null) {
            ((BaseMessage)t4).u = BaseMessage$SendingStatus.FAILED;
            ((BaseMessage)t4).q = 800101;
        }
        ((x)this.g).b(t4, new SendBirdException("Connection must be made before you send message.", 800101));
    }
}
