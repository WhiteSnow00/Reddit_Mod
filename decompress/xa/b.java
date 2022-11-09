// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import android.util.SparseArray;
import java.util.Arrays;
import com.google.android.exoplayer2.source.i$b;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.f0;
import xc.j;
import bc.u;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.q;
import java.io.IOException;
import bc.h;
import com.google.android.exoplayer2.i;
import nc.a;
import java.util.List;
import com.google.android.exoplayer2.w;
import ab.g;
import com.google.android.exoplayer2.n;
import ab.e;

public interface b
{
    default void onAudioCodecError(final a a, final Exception ex) {
    }
    
    @Deprecated
    default void onAudioDecoderInitialized(final a a, final String s, final long n) {
    }
    
    default void onAudioDecoderInitialized(final a a, final String s, final long n, final long n2) {
    }
    
    default void onAudioDecoderReleased(final a a, final String s) {
    }
    
    default void onAudioDisabled(final a a, final e e) {
    }
    
    default void onAudioEnabled(final a a, final e e) {
    }
    
    @Deprecated
    default void onAudioInputFormatChanged(final a a, final n n) {
    }
    
    default void onAudioInputFormatChanged(final a a, final n n, final g g) {
    }
    
    default void onAudioPositionAdvancing(final a a, final long n) {
    }
    
    default void onAudioSinkError(final a a, final Exception ex) {
    }
    
    default void onAudioUnderrun(final a a, final int n, final long n2, final long n3) {
    }
    
    default void onAvailableCommandsChanged(final a a, final w.a a2) {
    }
    
    default void onBandwidthEstimate(final a a, final int n, final long n2, final long n3) {
    }
    
    default void onCues(final a a, final List<nc.a> list) {
    }
    
    @Deprecated
    default void onDecoderDisabled(final a a, final int n, final e e) {
    }
    
    @Deprecated
    default void onDecoderEnabled(final a a, final int n, final e e) {
    }
    
    @Deprecated
    default void onDecoderInitialized(final a a, final int n, final String s, final long n2) {
    }
    
    @Deprecated
    default void onDecoderInputFormatChanged(final a a, final int n, final n n2) {
    }
    
    default void onDeviceInfoChanged(final a a, final i i) {
    }
    
    default void onDeviceVolumeChanged(final a a, final int n, final boolean b) {
    }
    
    default void onDownstreamFormatChanged(final a a, final bc.i i) {
    }
    
    default void onDrmKeysLoaded(final a a) {
    }
    
    default void onDrmKeysRemoved(final a a) {
    }
    
    default void onDrmKeysRestored(final a a) {
    }
    
    @Deprecated
    default void onDrmSessionAcquired(final a a) {
    }
    
    default void onDrmSessionAcquired(final a a, final int n) {
    }
    
    default void onDrmSessionManagerError(final a a, final Exception ex) {
    }
    
    default void onDrmSessionReleased(final a a) {
    }
    
    default void onDroppedVideoFrames(final a a, final int n, final long n2) {
    }
    
    default void onEvents(final w w, final b b) {
    }
    
    default void onIsLoadingChanged(final a a, final boolean b) {
    }
    
    default void onIsPlayingChanged(final a a, final boolean b) {
    }
    
    default void onLoadCanceled(final a a, final h h, final bc.i i) {
    }
    
    default void onLoadCompleted(final a a, final h h, final bc.i i) {
    }
    
    default void onLoadError(final a a, final h h, final bc.i i, final IOException ex, final boolean b) {
    }
    
    default void onLoadStarted(final a a, final h h, final bc.i i) {
    }
    
    @Deprecated
    default void onLoadingChanged(final a a, final boolean b) {
    }
    
    default void onMediaItemTransition(final a a, final q q, final int n) {
    }
    
    default void onMediaMetadataChanged(final a a, final r r) {
    }
    
    default void onMetadata(final a a, final qb.a a2) {
    }
    
    default void onPlayWhenReadyChanged(final a a, final boolean b, final int n) {
    }
    
    default void onPlaybackParametersChanged(final a a, final v v) {
    }
    
    default void onPlaybackStateChanged(final a a, final int n) {
    }
    
    default void onPlaybackSuppressionReasonChanged(final a a, final int n) {
    }
    
    default void onPlayerError(final a a, final PlaybackException ex) {
    }
    
    default void onPlayerErrorChanged(final a a, final PlaybackException ex) {
    }
    
    default void onPlayerReleased(final a a) {
    }
    
    @Deprecated
    default void onPlayerStateChanged(final a a, final boolean b, final int n) {
    }
    
    @Deprecated
    default void onPositionDiscontinuity(final a a, final int n) {
    }
    
    default void onPositionDiscontinuity(final a a, final w.d d, final w.d d2, final int n) {
    }
    
    default void onRenderedFirstFrame(final a a, final Object o, final long n) {
    }
    
    default void onRepeatModeChanged(final a a, final int n) {
    }
    
    @Deprecated
    default void onSeekProcessed(final a a) {
    }
    
    @Deprecated
    default void onSeekStarted(final a a) {
    }
    
    default void onShuffleModeChanged(final a a, final boolean b) {
    }
    
    default void onSkipSilenceEnabledChanged(final a a, final boolean b) {
    }
    
    default void onSurfaceSizeChanged(final a a, final int n, final int n2) {
    }
    
    default void onTimelineChanged(final a a, final int n) {
    }
    
    @Deprecated
    default void onTracksChanged(final a a, final u u, final j j) {
    }
    
    default void onTracksInfoChanged(final a a, final f0 f0) {
    }
    
    default void onUpstreamDiscarded(final a a, final bc.i i) {
    }
    
    default void onVideoCodecError(final a a, final Exception ex) {
    }
    
    @Deprecated
    default void onVideoDecoderInitialized(final a a, final String s, final long n) {
    }
    
    default void onVideoDecoderInitialized(final a a, final String s, final long n, final long n2) {
    }
    
    default void onVideoDecoderReleased(final a a, final String s) {
    }
    
    default void onVideoDisabled(final a a, final e e) {
    }
    
    default void onVideoEnabled(final a a, final e e) {
    }
    
    default void onVideoFrameProcessingOffset(final a a, final long n, final int n2) {
    }
    
    @Deprecated
    default void onVideoInputFormatChanged(final a a, final n n) {
    }
    
    default void onVideoInputFormatChanged(final a a, final n n, final g g) {
    }
    
    @Deprecated
    default void onVideoSizeChanged(final a a, final int n, final int n2, final int n3, final float n4) {
    }
    
    default void onVideoSizeChanged(final a a, final cd.q q) {
    }
    
    default void onVolumeChanged(final a a, final float n) {
    }
    
    public static final class a
    {
        public final long a;
        public final e0 b;
        public final int c;
        public final i$b d;
        public final long e;
        public final e0 f;
        public final int g;
        public final i$b h;
        public final long i;
        public final long j;
        
        public a(final long a, final e0 b, final int c, final i$b d, final long e, final e0 f, final int g, final i$b h, final long i, final long j) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (this.a != a.a || this.c != a.c || this.e != a.e || this.g != a.g || this.i != a.i || this.j != a.j || !yl.a.d0((Object)this.b, (Object)a.b) || !yl.a.d0((Object)this.d, (Object)a.d) || !yl.a.d0((Object)this.f, (Object)a.f) || !yl.a.d0((Object)this.h, (Object)a.h)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j });
        }
    }
    
    public static final class b
    {
        public b(final bd.j j, final SparseArray<a> sparseArray) {
            final SparseArray sparseArray2 = new SparseArray(j.b());
            for (int i = 0; i < j.b(); ++i) {
                final int a = j.a(i);
                final a a2 = (a)sparseArray.get(a);
                a2.getClass();
                sparseArray2.append(a, (Object)a2);
            }
        }
    }
}
