// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class RemoteAudioTrackPublication implements AudioTrackPublication
{
    private boolean enabled;
    private final String name;
    private TrackPriority publishPriority;
    private RemoteAudioTrack remoteAudioTrack;
    private final String sid;
    private boolean subscribed;
    
    public RemoteAudioTrackPublication(final boolean subscribed, final boolean enabled, final String sid, final String name, final TrackPriority publishPriority) {
        this.subscribed = subscribed;
        this.sid = sid;
        this.name = name;
        this.enabled = enabled;
        this.publishPriority = publishPriority;
    }
    
    public AudioTrack getAudioTrack() {
        synchronized (this) {
            return this.remoteAudioTrack;
        }
    }
    
    public TrackPriority getPublishPriority() {
        synchronized (this) {
            return this.publishPriority;
        }
    }
    
    public RemoteAudioTrack getRemoteAudioTrack() {
        synchronized (this) {
            return this.remoteAudioTrack;
        }
    }
    
    public String getTrackName() {
        return this.name;
    }
    
    public String getTrackSid() {
        return this.sid;
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
            final RemoteAudioTrack remoteAudioTrack = this.remoteAudioTrack;
            if (remoteAudioTrack != null) {
                remoteAudioTrack.setEnabled(b);
            }
        }
    }
    
    public void setPublishPriority(final TrackPriority publishPriority) {
        synchronized (this) {
            this.publishPriority = publishPriority;
        }
    }
    
    public void setRemoteAudioTrack(final RemoteAudioTrack remoteAudioTrack) {
        synchronized (this) {
            this.remoteAudioTrack = remoteAudioTrack;
        }
    }
    
    public void setSubscribed(final boolean subscribed) {
        synchronized (this) {
            this.subscribed = subscribed;
        }
    }
}
