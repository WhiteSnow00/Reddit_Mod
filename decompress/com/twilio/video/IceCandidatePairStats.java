// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class IceCandidatePairStats
{
    public final boolean activeCandidatePair;
    public final double availableIncomingBitrate;
    public final double availableOutgoingBitrate;
    public final long bytesReceived;
    public final long bytesSent;
    public final long consentRequestsReceived;
    public final long consentRequestsSent;
    public final long consentResponsesReceived;
    public final long consentResponsesSent;
    public final double currentRoundTripTime;
    public final String localCandidateId;
    public final String localCandidateIp;
    public final boolean nominated;
    public final long priority;
    public final boolean readable;
    public final String relayProtocol;
    public final String remoteCandidateId;
    public final String remoteCandidateIp;
    public final long requestsReceived;
    public final long requestsSent;
    public final long responsesReceived;
    public final long retransmissionsReceived;
    public final long retransmissionsSent;
    public final IceCandidatePairState state;
    public final double totalRoundTripTime;
    public final String transportId;
    public final boolean writeable;
    
    public IceCandidatePairStats(final String transportId, final String localCandidateId, final String remoteCandidateId, final IceCandidatePairState state, final String localCandidateIp, final String remoteCandidateIp, final long priority, final boolean nominated, final boolean writeable, final boolean readable, final long bytesSent, final long bytesReceived, final double totalRoundTripTime, final double currentRoundTripTime, final double availableOutgoingBitrate, final double availableIncomingBitrate, final long requestsReceived, final long requestsSent, final long responsesReceived, final long retransmissionsReceived, final long retransmissionsSent, final long consentRequestsReceived, final long consentRequestsSent, final long consentResponsesReceived, final long consentResponsesSent, final boolean activeCandidatePair, final String relayProtocol) {
        this.transportId = transportId;
        this.localCandidateId = localCandidateId;
        this.remoteCandidateId = remoteCandidateId;
        this.state = state;
        this.localCandidateIp = localCandidateIp;
        this.remoteCandidateIp = remoteCandidateIp;
        this.priority = priority;
        this.nominated = nominated;
        this.writeable = writeable;
        this.readable = readable;
        this.bytesSent = bytesSent;
        this.bytesReceived = bytesReceived;
        this.totalRoundTripTime = totalRoundTripTime;
        this.currentRoundTripTime = currentRoundTripTime;
        this.availableOutgoingBitrate = availableOutgoingBitrate;
        this.availableIncomingBitrate = availableIncomingBitrate;
        this.requestsReceived = requestsReceived;
        this.requestsSent = requestsSent;
        this.responsesReceived = responsesReceived;
        this.retransmissionsReceived = retransmissionsReceived;
        this.retransmissionsSent = retransmissionsSent;
        this.consentRequestsReceived = consentRequestsReceived;
        this.consentRequestsSent = consentRequestsSent;
        this.consentResponsesReceived = consentResponsesReceived;
        this.consentResponsesSent = consentResponsesSent;
        this.activeCandidatePair = activeCandidatePair;
        this.relayProtocol = relayProtocol;
    }
}
