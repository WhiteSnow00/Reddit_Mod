// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class LocalVideoTrackPublication implements VideoTrackPublication
{
    private final LocalVideoTrack localVideoTrack;
    private long nativeLocalVideoTrackPublicationContext;
    private TrackPriority priority;
    private final String sid;
    
    public LocalVideoTrackPublication(final String sid, final LocalVideoTrack localVideoTrack, final TrackPriority priority, final long nativeLocalVideoTrackPublicationContext) {
        Preconditions.checkNotNull((Object)sid, (Object)"SID must not be null");
        Preconditions.checkArgument(sid.isEmpty() ^ true, (Object)"SID must not be empty");
        Preconditions.checkNotNull((Object)localVideoTrack, (Object)"Local video track must not be null");
        Preconditions.checkNotNull((Object)priority, (Object)"priority should not be null");
        this.sid = sid;
        this.localVideoTrack = localVideoTrack;
        this.priority = priority;
        this.nativeLocalVideoTrackPublicationContext = nativeLocalVideoTrackPublicationContext;
    }
    
    private native void nativeRelease(final long p0);
    
    private native void nativeSetPriority(final long p0, final TrackPriority p1);
    
    public LocalVideoTrack getLocalVideoTrack() {
        return this.localVideoTrack;
    }
    
    public TrackPriority getPriority() {
        return this.priority;
    }
    
    public String getTrackName() {
        return this.localVideoTrack.getName();
    }
    
    public String getTrackSid() {
        return this.sid;
    }
    
    public VideoTrack getVideoTrack() {
        return this.localVideoTrack;
    }
    
    public boolean isReleased() {
        synchronized (this) {
            return this.nativeLocalVideoTrackPublicationContext == 0L;
        }
    }
    
    public boolean isTrackEnabled() {
        return this.localVideoTrack.isEnabled();
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeRelease(this.nativeLocalVideoTrackPublicationContext);
                this.nativeLocalVideoTrackPublicationContext = 0L;
            }
        }
    }
    
    public void setPriority(final TrackPriority priority) {
        this.priority = priority;
        if (!this.isReleased()) {
            this.nativeSetPriority(this.nativeLocalVideoTrackPublicationContext, priority);
        }
    }
}
