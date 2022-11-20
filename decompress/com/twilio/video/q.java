// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public final class q implements VideoSinkHintsConsumer$ConsumeSinkHintsListener
{
    public final RemoteVideoTrack a;
    
    public q(final RemoteVideoTrack a) {
        this.a = a;
    }
    
    public final void consumeSinkHints(final SinkHints sinkHints) {
        RemoteVideoTrack.a(this.a, sinkHints);
    }
}
