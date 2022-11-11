// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class RemoteDataTrackPublication implements DataTrackPublication
{
    private boolean enabled;
    private final String name;
    private TrackPriority publishPriority;
    private RemoteDataTrack remoteDataTrack;
    private final String sid;
    private boolean subscribed;
    
    public RemoteDataTrackPublication(final boolean subscribed, final boolean enabled, final String sid, final String name, final TrackPriority publishPriority) {
        this.enabled = enabled;
        this.subscribed = subscribed;
        this.sid = sid;
        this.name = name;
        this.publishPriority = publishPriority;
    }
    
    public DataTrack getDataTrack() {
        synchronized (this) {
            return this.remoteDataTrack;
        }
    }
    
    public TrackPriority getPublishPriority() {
        synchronized (this) {
            return this.publishPriority;
        }
    }
    
    public RemoteDataTrack getRemoteDataTrack() {
        synchronized (this) {
            return this.remoteDataTrack;
        }
    }
    
    public String getTrackName() {
        return this.name;
    }
    
    public String getTrackSid() {
        return this.sid;
    }
    
    public boolean isTrackEnabled() {
        return this.enabled;
    }
    
    public boolean isTrackSubscribed() {
        synchronized (this) {
            return this.subscribed;
        }
    }
    
    public void setPublishPriority(final TrackPriority publishPriority) {
        synchronized (this) {
            this.publishPriority = publishPriority;
        }
    }
    
    public void setRemoteDataTrack(final RemoteDataTrack remoteDataTrack) {
        synchronized (this) {
            this.remoteDataTrack = remoteDataTrack;
        }
    }
    
    public void setSubscribed(final boolean subscribed) {
        synchronized (this) {
            this.subscribed = subscribed;
        }
    }
}
