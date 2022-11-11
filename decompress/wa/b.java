// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.f0;
import wc.j;
import ac.u;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.q;
import java.io.IOException;
import ac.h;
import com.google.android.exoplayer2.i;
import mc.a;
import java.util.List;
import com.google.android.exoplayer2.w;
import za.g;
import com.google.android.exoplayer2.n;
import za.e;

public interface b
{
    default void onAudioCodecError(final b.b$a b$a, final Exception ex) {
    }
    
    @Deprecated
    default void onAudioDecoderInitialized(final b.b$a b$a, final String s, final long n) {
    }
    
    default void onAudioDecoderInitialized(final b.b$a b$a, final String s, final long n, final long n2) {
    }
    
    default void onAudioDecoderReleased(final b.b$a b$a, final String s) {
    }
    
    default void onAudioDisabled(final b.b$a b$a, final e e) {
    }
    
    default void onAudioEnabled(final b.b$a b$a, final e e) {
    }
    
    @Deprecated
    default void onAudioInputFormatChanged(final b.b$a b$a, final n n) {
    }
    
    default void onAudioInputFormatChanged(final b.b$a b$a, final n n, final g g) {
    }
    
    default void onAudioPositionAdvancing(final b.b$a b$a, final long n) {
    }
    
    default void onAudioSinkError(final b.b$a b$a, final Exception ex) {
    }
    
    default void onAudioUnderrun(final b.b$a b$a, final int n, final long n2, final long n3) {
    }
    
    default void onAvailableCommandsChanged(final b.b$a b$a, final w.a a) {
    }
    
    default void onBandwidthEstimate(final b.b$a b$a, final int n, final long n2, final long n3) {
    }
    
    default void onCues(final b.b$a b$a, final List<a> list) {
    }
    
    @Deprecated
    default void onDecoderDisabled(final b.b$a b$a, final int n, final e e) {
    }
    
    @Deprecated
    default void onDecoderEnabled(final b.b$a b$a, final int n, final e e) {
    }
    
    @Deprecated
    default void onDecoderInitialized(final b.b$a b$a, final int n, final String s, final long n2) {
    }
    
    @Deprecated
    default void onDecoderInputFormatChanged(final b.b$a b$a, final int n, final n n2) {
    }
    
    default void onDeviceInfoChanged(final b.b$a b$a, final i i) {
    }
    
    default void onDeviceVolumeChanged(final b.b$a b$a, final int n, final boolean b) {
    }
    
    default void onDownstreamFormatChanged(final b.b$a b$a, final ac.i i) {
    }
    
    default void onDrmKeysLoaded(final b.b$a b$a) {
    }
    
    default void onDrmKeysRemoved(final b.b$a b$a) {
    }
    
    default void onDrmKeysRestored(final b.b$a b$a) {
    }
    
    @Deprecated
    default void onDrmSessionAcquired(final b.b$a b$a) {
    }
    
    default void onDrmSessionAcquired(final b.b$a b$a, final int n) {
    }
    
    default void onDrmSessionManagerError(final b.b$a b$a, final Exception ex) {
    }
    
    default void onDrmSessionReleased(final b.b$a b$a) {
    }
    
    default void onDroppedVideoFrames(final b.b$a b$a, final int n, final long n2) {
    }
    
    default void onEvents(final w w, final b.b$b b$b) {
    }
    
    default void onIsLoadingChanged(final b.b$a b$a, final boolean b) {
    }
    
    default void onIsPlayingChanged(final b.b$a b$a, final boolean b) {
    }
    
    default void onLoadCanceled(final b.b$a b$a, final h h, final ac.i i) {
    }
    
    default void onLoadCompleted(final b.b$a b$a, final h h, final ac.i i) {
    }
    
    default void onLoadError(final b.b$a b$a, final h h, final ac.i i, final IOException ex, final boolean b) {
    }
    
    default void onLoadStarted(final b.b$a b$a, final h h, final ac.i i) {
    }
    
    @Deprecated
    default void onLoadingChanged(final b.b$a b$a, final boolean b) {
    }
    
    default void onMediaItemTransition(final b.b$a b$a, final q q, final int n) {
    }
    
    default void onMediaMetadataChanged(final b.b$a b$a, final r r) {
    }
    
    default void onMetadata(final b.b$a b$a, final pb.a a) {
    }
    
    default void onPlayWhenReadyChanged(final b.b$a b$a, final boolean b, final int n) {
    }
    
    default void onPlaybackParametersChanged(final b.b$a b$a, final v v) {
    }
    
    default void onPlaybackStateChanged(final b.b$a b$a, final int n) {
    }
    
    default void onPlaybackSuppressionReasonChanged(final b.b$a b$a, final int n) {
    }
    
    default void onPlayerError(final b.b$a b$a, final PlaybackException ex) {
    }
    
    default void onPlayerErrorChanged(final b.b$a b$a, final PlaybackException ex) {
    }
    
    default void onPlayerReleased(final b.b$a b$a) {
    }
    
    @Deprecated
    default void onPlayerStateChanged(final b.b$a b$a, final boolean b, final int n) {
    }
    
    @Deprecated
    default void onPositionDiscontinuity(final b.b$a b$a, final int n) {
    }
    
    default void onPositionDiscontinuity(final b.b$a b$a, final w.d d, final w.d d2, final int n) {
    }
    
    default void onRenderedFirstFrame(final b.b$a b$a, final Object o, final long n) {
    }
    
    default void onRepeatModeChanged(final b.b$a b$a, final int n) {
    }
    
    @Deprecated
    default void onSeekProcessed(final b.b$a b$a) {
    }
    
    @Deprecated
    default void onSeekStarted(final b.b$a b$a) {
    }
    
    default void onShuffleModeChanged(final b.b$a b$a, final boolean b) {
    }
    
    default void onSkipSilenceEnabledChanged(final b.b$a b$a, final boolean b) {
    }
    
    default void onSurfaceSizeChanged(final b.b$a b$a, final int n, final int n2) {
    }
    
    default void onTimelineChanged(final b.b$a b$a, final int n) {
    }
    
    @Deprecated
    default void onTracksChanged(final b.b$a b$a, final u u, final j j) {
    }
    
    default void onTracksInfoChanged(final b.b$a b$a, final f0 f0) {
    }
    
    default void onUpstreamDiscarded(final b.b$a b$a, final ac.i i) {
    }
    
    default void onVideoCodecError(final b.b$a b$a, final Exception ex) {
    }
    
    @Deprecated
    default void onVideoDecoderInitialized(final b.b$a b$a, final String s, final long n) {
    }
    
    default void onVideoDecoderInitialized(final b.b$a b$a, final String s, final long n, final long n2) {
    }
    
    default void onVideoDecoderReleased(final b.b$a b$a, final String s) {
    }
    
    default void onVideoDisabled(final b.b$a b$a, final e e) {
    }
    
    default void onVideoEnabled(final b.b$a b$a, final e e) {
    }
    
    default void onVideoFrameProcessingOffset(final b.b$a b$a, final long n, final int n2) {
    }
    
    @Deprecated
    default void onVideoInputFormatChanged(final b.b$a b$a, final n n) {
    }
    
    default void onVideoInputFormatChanged(final b.b$a b$a, final n n, final g g) {
    }
    
    @Deprecated
    default void onVideoSizeChanged(final b.b$a b$a, final int n, final int n2, final int n3, final float n4) {
    }
    
    default void onVideoSizeChanged(final b.b$a b$a, final bd.q q) {
    }
    
    default void onVolumeChanged(final b.b$a b$a, final float n) {
    }
}
