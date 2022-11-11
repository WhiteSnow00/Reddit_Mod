// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class RemoteVideoTrackPublication implements VideoTrackPublication
{
    private boolean enabled;
    private final String name;
    private TrackPriority publishPriority;
    private RemoteVideoTrack remoteVideoTrack;
    private final String sid;
    private boolean subscribed;
    
    public RemoteVideoTrackPublication(final boolean subscribed, final boolean enabled, final String sid, final String name, final TrackPriority publishPriority) {
        this.enabled = enabled;
        this.subscribed = subscribed;
        this.sid = sid;
        this.name = name;
        this.publishPriority = publishPriority;
    }
    
    public TrackPriority getPublishPriority() {
        synchronized (this) {
            return this.publishPriority;
        }
    }
    
    public RemoteVideoTrack getRemoteVideoTrack() {
        synchronized (this) {
            return this.remoteVideoTrack;
        }
    }
    
    public String getTrackName() {
        return this.name;
    }
    
    public String getTrackSid() {
        return this.sid;
    }
    
    public VideoTrack getVideoTrack() {
        synchronized (this) {
            return this.remoteVideoTrack;
        }
    }
    
    public boolean isTrackEnabled() {
        synchronized (this) {
            return this.enabled;
        }
    }
    
    public boolean isTrackSubscribed() {
        synchronized (this) {
            return this.subscribed;
        }
    }
    
    public void setEnabled(final boolean b) {
        synchronized (this) {
            this.enabled = b;
            final RemoteVideoTrack remoteVideoTrack = this.remoteVideoTrack;
            if (remoteVideoTrack != null) {
                remoteVideoTrack.setEnabled(b);
            }
        }
    }
    
    public void setPublishPriority(final TrackPriority publishPriority) {
        synchronized (this) {
            this.publishPriority = publishPriority;
        }
    }
    
    public void setRemoteVideoTrack(final RemoteVideoTrack remoteVideoTrack) {
        synchronized (this) {
            this.remoteVideoTrack = remoteVideoTrack;
        }
    }
    
    public void setSubscribed(final boolean subscribed) {
        synchronized (this) {
            this.subscribed = subscribed;
        }
    }
}
