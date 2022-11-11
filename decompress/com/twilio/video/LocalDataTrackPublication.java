// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class LocalDataTrackPublication implements DataTrackPublication
{
    private final LocalDataTrack localDataTrack;
    private long nativeLocalDataTrackPublicationContext;
    private TrackPriority priority;
    private final String sid;
    
    public LocalDataTrackPublication(final String sid, final LocalDataTrack localDataTrack, final TrackPriority priority, final long nativeLocalDataTrackPublicationContext) {
        Preconditions.checkNotNull((Object)sid, (Object)"SID must not be null");
        Preconditions.checkArgument(sid.isEmpty() ^ true, (Object)"SID must not be empty");
        Preconditions.checkNotNull((Object)localDataTrack, (Object)"Local data track must not be null");
        Preconditions.checkNotNull((Object)priority, (Object)"priority should not be null");
        this.sid = sid;
        this.localDataTrack = localDataTrack;
        this.priority = priority;
        this.nativeLocalDataTrackPublicationContext = nativeLocalDataTrackPublicationContext;
    }
    
    private native void nativeRelease(final long p0);
    
    private native void nativeSetPriority(final long p0, final TrackPriority p1);
    
    public DataTrack getDataTrack() {
        return this.localDataTrack;
    }
    
    public LocalDataTrack getLocalDataTrack() {
        return this.localDataTrack;
    }
    
    public TrackPriority getPriority() {
        return this.priority;
    }
    
    public String getTrackName() {
        return this.localDataTrack.getName();
    }
    
    public String getTrackSid() {
        return this.sid;
    }
    
    public boolean isReleased() {
        synchronized (this) {
            return this.nativeLocalDataTrackPublicationContext == 0L;
        }
    }
    
    public boolean isTrackEnabled() {
        return this.localDataTrack.isEnabled();
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeRelease(this.nativeLocalDataTrackPublicationContext);
                this.nativeLocalDataTrackPublicationContext = 0L;
            }
        }
    }
    
    public void setPriority(final TrackPriority priority) {
        this.priority = priority;
        if (!this.isReleased()) {
            this.nativeSetPriority(this.nativeLocalDataTrackPublicationContext, priority);
        }
    }
}
