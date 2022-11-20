// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.List;

public final class s implements StatsListener
{
    public final Room a;
    
    public s(final Room a) {
        this.a = a;
    }
    
    public final void onStats(final List list) {
        Room.b(this.a, list);
    }
}
