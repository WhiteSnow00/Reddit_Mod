// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import tvi.webrtc.VideoSink;
import java.util.Set;

public abstract class VideoTrack implements Track
{
    private static final Logger logger;
    private boolean isEnabled;
    private boolean isReleased;
    private final String name;
    private Set<VideoSink> videoSinks;
    private final tvi.webrtc.VideoTrack webRtcVideoTrack;
    
    static {
        logger = Logger.getLogger((Class)VideoTrack.class);
    }
    
    public VideoTrack(final tvi.webrtc.VideoTrack webRtcVideoTrack, final boolean isEnabled, final String name) {
        this.videoSinks = new HashSet<VideoSink>();
        this.isReleased = false;
        this.isEnabled = isEnabled;
        this.name = name;
        this.webRtcVideoTrack = webRtcVideoTrack;
    }
    
    public void addSink(final VideoSink videoSink) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)videoSink, (Object)"Video sink must not be null");
            if (!this.isReleased) {
                this.videoSinks.add(videoSink);
                this.webRtcVideoTrack.addSink(videoSink);
            }
            else {
                VideoTrack.logger.w("Attempting to add sink to track that has been removed");
            }
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public List<VideoSink> getSinks() {
        synchronized (this) {
            return new ArrayList<VideoSink>(this.videoSinks);
        }
    }
    
    public Set<VideoSink> getVideoSinks() {
        return this.videoSinks;
    }
    
    public tvi.webrtc.VideoTrack getWebRtcTrack() {
        synchronized (this) {
            return this.webRtcVideoTrack;
        }
    }
    
    public void invalidateWebRtcTrack() {
        synchronized (this) {
            if (this.webRtcVideoTrack != null) {
                final Iterator<VideoSink> iterator = this.videoSinks.iterator();
                while (iterator.hasNext()) {
                    this.webRtcVideoTrack.removeSink((VideoSink)iterator.next());
                }
            }
        }
    }
    
    public boolean isEnabled() {
        return this.isEnabled;
    }
    
    public boolean isReleased() {
        synchronized (this) {
            return this.isReleased;
        }
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased) {
                this.invalidateWebRtcTrack();
                this.videoSinks.clear();
                this.isReleased = true;
            }
        }
    }
    
    public void removeSink(final VideoSink videoSink) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)videoSink, (Object)"Video sink must not be null");
            if (!this.isReleased) {
                this.webRtcVideoTrack.removeSink(videoSink);
                this.videoSinks.remove(videoSink);
            }
            else {
                VideoTrack.logger.w("Attempting to remove sink from track that has been removed");
            }
        }
    }
    
    public void setEnabled(final boolean isEnabled) {
        synchronized (this) {
            this.isEnabled = isEnabled;
        }
    }
}
