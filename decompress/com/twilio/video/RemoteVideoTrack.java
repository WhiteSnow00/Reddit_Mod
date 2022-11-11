// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.Iterator;
import tvi.webrtc.VideoSink;
import al0.g7;

public class RemoteVideoTrack extends VideoTrack
{
    private static final String SET_CONTENT_PREFERENCES_ERROR = "RemoteVideoTrack.setContentPreferences() can only be called after setting VideoContentPreferencesMode.MANUAL and not setting renderDimensions in VideoBandwidthProfileOptions.\";";
    private static final String SWITCH_ON_SWITCH_OFF_ERROR = "RemoteVideoTrack.switchOn() and RemoteVideoTrack.switchOff() can only be called after setting ClientTrackSwitchOffControl.MANUAL and not setting maxTracks in VideoBandwidthProfileOptions.\";";
    private static final Logger logger;
    private SinkHints cachedSinkHints;
    private boolean isSwitchedOff;
    private long nativeRemoteVideoTrackContext;
    private TrackPriority priority;
    private final String sid;
    private final VideoBandwidthProfileOptions videoBandwidthProfileOptions;
    public final VideoSinkHintsConsumer videoSinkHintsConsumer;
    
    static {
        logger = Logger.getLogger((Class)RemoteVideoTrack.class);
    }
    
    public RemoteVideoTrack(final tvi.webrtc.VideoTrack videoTrack, final String sid, final String s, final boolean b, final boolean isSwitchedOff, final TrackPriority priority, final VideoBandwidthProfileOptions videoBandwidthProfileOptions, final long nativeRemoteVideoTrackContext) {
        super(videoTrack, b, s);
        this.cachedSinkHints = new SinkHints(-1L, (Boolean)null, (VideoContentPreferences)null);
        this.sid = sid;
        this.isSwitchedOff = isSwitchedOff;
        this.priority = priority;
        this.nativeRemoteVideoTrackContext = nativeRemoteVideoTrackContext;
        this.videoBandwidthProfileOptions = videoBandwidthProfileOptions;
        if (videoBandwidthProfileOptions != null) {
            final boolean inVideoContentPreferencesAutoMode = this.isInVideoContentPreferencesAutoMode();
            boolean b2 = true;
            final boolean b3 = inVideoContentPreferencesAutoMode && this.isRenderDimensionsNotSet();
            if (!this.isInClientTrackSwitchOffAutoMode() || !this.isMaxTracksNotSet()) {
                b2 = false;
            }
            this.videoSinkHintsConsumer = new VideoSinkHintsConsumer(b3, b2, (VideoSinkHintsConsumer$ConsumeSinkHintsListener)new s(this));
        }
        else {
            this.videoSinkHintsConsumer = null;
        }
    }
    
    private void addSinkHints(final SinkHints sinkHints) {
        if (!this.isReleased()) {
            final Logger logger = RemoteVideoTrack.logger;
            final StringBuilder sb = new StringBuilder();
            sb.append("Add SinkHints = ");
            sb.append(sinkHints);
            logger.d(sb.toString());
            this.nativeAddSinkHints(this.nativeRemoteVideoTrackContext, sinkHints);
        }
    }
    
    private void checkClientTrackSwitchOffParameters() {
        Preconditions.checkState(this.videoBandwidthProfileOptions != null && this.isMaxTracksNotSet() && this.videoBandwidthProfileOptions.getClientTrackSwitchOffControl() == ClientTrackSwitchOffControl.MANUAL, (Object)"RemoteVideoTrack.switchOn() and RemoteVideoTrack.switchOff() can only be called after setting ClientTrackSwitchOffControl.MANUAL and not setting maxTracks in VideoBandwidthProfileOptions.\";");
    }
    
    private void checkSetContentPreferencesParameters() {
        final VideoBandwidthProfileOptions videoBandwidthProfileOptions = this.videoBandwidthProfileOptions;
        Preconditions.checkState(videoBandwidthProfileOptions != null && videoBandwidthProfileOptions.getVideoContentPreferencesMode() == VideoContentPreferencesMode.MANUAL && this.isRenderDimensionsNotSet(), (Object)"RemoteVideoTrack.setContentPreferences() can only be called after setting VideoContentPreferencesMode.MANUAL and not setting renderDimensions in VideoBandwidthProfileOptions.\";");
    }
    
    private boolean isInClientTrackSwitchOffAutoMode() {
        final VideoBandwidthProfileOptions videoBandwidthProfileOptions = this.videoBandwidthProfileOptions;
        return videoBandwidthProfileOptions != null && (videoBandwidthProfileOptions.getClientTrackSwitchOffControl() == ClientTrackSwitchOffControl.AUTO || this.videoBandwidthProfileOptions.getClientTrackSwitchOffControl() == null);
    }
    
    private boolean isInVideoContentPreferencesAutoMode() {
        final VideoBandwidthProfileOptions videoBandwidthProfileOptions = this.videoBandwidthProfileOptions;
        return videoBandwidthProfileOptions != null && (videoBandwidthProfileOptions.getVideoContentPreferencesMode() == VideoContentPreferencesMode.AUTO || this.videoBandwidthProfileOptions.getVideoContentPreferencesMode() == null);
    }
    
    private boolean isMaxTracksNotSet() {
        final VideoBandwidthProfileOptions videoBandwidthProfileOptions = this.videoBandwidthProfileOptions;
        return videoBandwidthProfileOptions != null && videoBandwidthProfileOptions.getMaxTracks() == null;
    }
    
    private boolean isRenderDimensionsNotSet() {
        final VideoBandwidthProfileOptions videoBandwidthProfileOptions = this.videoBandwidthProfileOptions;
        return videoBandwidthProfileOptions != null && videoBandwidthProfileOptions.getRenderDimensions().isEmpty();
    }
    
    private native void nativeSetPriority(final long p0, final TrackPriority p1);
    
    private void removeSinkHints(final long n) {
        RemoteVideoTrack.logger.d(g7.g("Removing SinkHints for sink id: ", n));
        this.nativeRemoveSinkHints(this.nativeRemoteVideoTrackContext, n);
    }
    
    private void removeVideoSinkHintsProducers() {
        for (final VideoSink videoSink : this.getVideoSinks()) {
            if (videoSink instanceof VideoTextureView) {
                ((VideoTextureView)videoSink).removeVideoSinkHintsProducer();
            }
            if (videoSink instanceof VideoView) {
                ((VideoView)videoSink).removeVideoSinkHintsProducer();
            }
        }
    }
    
    public void addSink(final VideoSink videoSink) {
        synchronized (this) {
            super.addSink(videoSink);
            if (!this.isReleased() && ((this.isInClientTrackSwitchOffAutoMode() && this.isMaxTracksNotSet()) || (this.isInVideoContentPreferencesAutoMode() && this.isRenderDimensionsNotSet()))) {
                final long longValue = this.videoSinkHintsConsumer.getNextSinkHintsId();
                if (videoSink instanceof VideoTextureView) {
                    ((VideoTextureView)videoSink).setupVideoSinkHintsProducer(this.videoSinkHintsConsumer, longValue);
                }
                else if (videoSink instanceof VideoView) {
                    ((VideoView)videoSink).setupVideoSinkHintsProducer(this.videoSinkHintsConsumer, longValue);
                }
                else {
                    Boolean true = Boolean.TRUE;
                    if (!this.isMaxTracksNotSet()) {
                        true = null;
                    }
                    this.addSinkHints(new SinkHints(1L, true, (VideoContentPreferences)null));
                }
                final Logger logger = RemoteVideoTrack.logger;
                final StringBuilder sb = new StringBuilder();
                sb.append("Add a new VideoSink using the auto switch off policy with id = ");
                sb.append(longValue);
                logger.d(sb.toString());
            }
        }
    }
    
    public void checkSinkAttachments() {
        if (this.isInClientTrackSwitchOffAutoMode() && this.isMaxTracksNotSet()) {
            if (this.getSinks().isEmpty()) {
                this.addSinkHints(new SinkHints(0L, Boolean.FALSE, (VideoContentPreferences)null));
            }
            else {
                this.removeSinkHints(0L);
            }
        }
    }
    
    public TrackPriority getPriority() {
        return this.priority;
    }
    
    public String getSid() {
        return this.sid;
    }
    
    public boolean isReleased() {
        synchronized (this) {
            return this.nativeRemoteVideoTrackContext == 0L && super.isReleased();
        }
    }
    
    public boolean isSwitchedOff() {
        return this.isSwitchedOff;
    }
    
    public native void nativeAddSinkHints(final long p0, final SinkHints p1);
    
    public native void nativeRelease(final long p0);
    
    public native void nativeRemoveSinkHints(final long p0, final long p1);
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                this.removeVideoSinkHintsProducers();
                super.release();
                this.nativeRelease(this.nativeRemoteVideoTrackContext);
                this.nativeRemoteVideoTrackContext = 0L;
            }
        }
    }
    
    public void removeSink(final VideoSink videoSink) {
        synchronized (this) {
            super.removeSink(videoSink);
            if (!this.isReleased() && ((this.isInClientTrackSwitchOffAutoMode() && this.isMaxTracksNotSet()) || (this.isInVideoContentPreferencesAutoMode() && this.isRenderDimensionsNotSet()))) {
                this.checkSinkAttachments();
                RemoteVideoTrack.logger.d("Removing VideoSinkHintsProducer");
                if (videoSink instanceof VideoTextureView) {
                    final VideoTextureView videoTextureView = (VideoTextureView)videoSink;
                    this.removeSinkHints(videoTextureView.getSinkHintsId());
                    videoTextureView.removeVideoSinkHintsProducer();
                }
                else if (videoSink instanceof VideoView) {
                    final VideoView videoView = (VideoView)videoSink;
                    this.removeSinkHints(videoView.getSinkHintsId());
                    videoView.removeVideoSinkHintsProducer();
                }
                else if (this.getSinks().isEmpty()) {
                    this.removeSinkHints(1L);
                }
            }
        }
    }
    
    public void setContentPreferences(final VideoContentPreferences videoContentPreferences) {
        this.checkSetContentPreferencesParameters();
        this.addSinkHints(this.cachedSinkHints = new SinkHints(-1L, this.cachedSinkHints.isEnabled(), videoContentPreferences));
    }
    
    public void setPriority(final TrackPriority priority) {
        this.priority = priority;
        if (!this.isReleased()) {
            this.nativeSetPriority(this.nativeRemoteVideoTrackContext, priority);
        }
    }
    
    public void setSwitchedOff(final boolean isSwitchedOff) {
        this.isSwitchedOff = isSwitchedOff;
    }
    
    public void switchOff() {
        this.checkClientTrackSwitchOffParameters();
        RemoteVideoTrack.logger.d("Manually switching off track");
        this.addSinkHints(this.cachedSinkHints = new SinkHints(-1L, Boolean.FALSE, this.cachedSinkHints.getVideoContentPreferences()));
    }
    
    public void switchOn() {
        this.checkClientTrackSwitchOffParameters();
        RemoteVideoTrack.logger.d("Manually switching on track");
        this.addSinkHints(this.cachedSinkHints = new SinkHints(-1L, Boolean.TRUE, this.cachedSinkHints.getVideoContentPreferences()));
    }
}
