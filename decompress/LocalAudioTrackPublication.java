// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class LocalAudioTrackPublication implements AudioTrackPublication
{
    private final LocalAudioTrack localAudioTrack;
    private long nativeLocalAudioTrackPublicationContext;
    private TrackPriority priority;
    private final String sid;
    
    public LocalAudioTrackPublication(final String sid, final LocalAudioTrack localAudioTrack, final TrackPriority priority, final long nativeLocalAudioTrackPublicationContext) {
        Preconditions.checkNotNull((Object)sid, (Object)"SID must not be null");
        Preconditions.checkNotNull((Object)localAudioTrack, (Object)"Local audio track must not be null");
        Preconditions.checkArgument(sid.isEmpty() ^ true, (Object)"SID must not be empty");
        Preconditions.checkNotNull((Object)priority, (Object)"priority should not be null");
        this.sid = sid;
        this.localAudioTrack = localAudioTrack;
        this.priority = priority;
        this.nativeLocalAudioTrackPublicationContext = nativeLocalAudioTrackPublicationContext;
    }
    
    private native void nativeRelease(final long p0);
    
    private native void nativeSetPriority(final long p0, final TrackPriority p1);
    
    public AudioTrack getAudioTrack() {
        return this.localAudioTrack;
    }
    
    public LocalAudioTrack getLocalAudioTrack() {
        return this.localAudioTrack;
    }
    
    public TrackPriority getPriority() {
        return this.priority;
    }
    
    public String getTrackName() {
        return this.localAudioTrack.getName();
    }
    
    public String getTrackSid() {
        return this.sid;
    }
    
    public boolean isReleased() {
        synchronized (this) {
            return this.nativeLocalAudioTrackPublicationContext == 0L;
        }
    }
    
    public boolean isTrackEnabled() {
        return this.localAudioTrack.isEnabled();
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeRelease(this.nativeLocalAudioTrackPublicationContext);
                this.nativeLocalAudioTrackPublicationContext = 0L;
            }
        }
    }
    
    public void setPriority(final TrackPriority priority) {
        this.priority = priority;
        if (!this.isReleased()) {
            this.nativeSetPriority(this.nativeLocalAudioTrackPublicationContext, priority);
        }
    }
}
