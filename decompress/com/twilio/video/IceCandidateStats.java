// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class IceCandidateStats
{
    public final String candidateType;
    public final boolean deleted;
    public final String ip;
    public final boolean isRemote;
    public final int port;
    public final int priority;
    public final String protocol;
    public final String transportId;
    public final String url;
    
    public IceCandidateStats(final String transportId, final boolean isRemote, final String ip, final int port, final String protocol, final String candidateType, final int priority, final String url, final boolean deleted) {
        this.transportId = transportId;
        this.isRemote = isRemote;
        this.ip = ip;
        this.port = port;
        this.protocol = protocol;
        this.candidateType = candidateType;
        this.priority = priority;
        this.url = url;
        this.deleted = deleted;
    }
}
