// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.ArrayList;

public final class w3 implements Runnable
{
    public final /* synthetic */ SendBird$g f;
    
    public w3(final x f) {
        this.f = (SendBird$g)f;
    }
    
    @Override
    public final void run() {
        this.f.a((ArrayList)null, (ArrayList)null, false, (String)null, new SendBirdException("Invalid arguments.", 800110));
    }
}
