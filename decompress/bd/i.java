// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import xc.j;
import bc.u;
import androidx.appcompat.widget.s0;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.q;
import java.io.IOException;
import bc.h;
import ab.g;
import ab.e;
import qb.a$b;
import android.util.Log;
import ak0.m;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import ag0.a;
import ak0.n;
import android.os.SystemClock;
import java.util.Locale;
import com.google.android.exoplayer2.e0$b;
import com.google.android.exoplayer2.e0$c;
import java.text.NumberFormat;
import xa.b;

public final class i implements b
{
    public static final NumberFormat d;
    public final e0$c a;
    public final e0$b b;
    public final long c;
    
    static {
        final NumberFormat instance = NumberFormat.getInstance(Locale.US);
        (d = instance).setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        instance.setGroupingUsed(false);
    }
    
    public i() {
        this.a = new e0$c();
        this.b = new e0$b();
        this.c = SystemClock.elapsedRealtime();
    }
    
    public static String c(final long n) {
        String format;
        if (n == -9223372036854775807L) {
            format = "?";
        }
        else {
            format = i.d.format(n / 1000.0f);
        }
        return format;
    }
    
    public final String a(final a a, String s, String k, final Throwable t) {
        final String b = this.b(a);
        final String s2 = s = a.l(n.f(b, s.length() + 2), s, " [", b);
        if (t instanceof PlaybackException) {
            final String value = String.valueOf(s2);
            s = ((PlaybackException)t).getErrorCodeName();
            s = a.l(n.f(s, value.length() + 12), value, ", errorCode=", s);
        }
        String l = s;
        if (k != null) {
            final String value2 = String.valueOf(s);
            l = a.l(k.length() + (value2.length() + 2), value2, ", ", k);
        }
        k = wi.b.K(t);
        s = l;
        if (!TextUtils.isEmpty((CharSequence)k)) {
            final String value3 = String.valueOf(l);
            s = k.replace("\n", "\n  ");
            final StringBuilder sb = new StringBuilder(n.f(s, value3.length() + 4));
            sb.append(value3);
            sb.append("\n  ");
            sb.append(s);
            sb.append('\n');
            s = sb.toString();
        }
        return String.valueOf(s).concat("]");
    }
    
    public final String b(final a a) {
        String s2;
        final String s = s2 = a2.b.f(18, "window=", a.c);
        if (a.d != null) {
            final String value = String.valueOf(s);
            final int b = a.b.b(((bc.j)a.d).a);
            final StringBuilder sb = new StringBuilder(value.length() + 20);
            sb.append(value);
            sb.append(", period=");
            sb.append(b);
            final String s3 = s2 = sb.toString();
            if (((bc.j)a.d).a()) {
                final String value2 = String.valueOf(s3);
                final int b2 = ((bc.j)a.d).b;
                final StringBuilder sb2 = new StringBuilder(value2.length() + 21);
                sb2.append(value2);
                sb2.append(", adGroup=");
                sb2.append(b2);
                final String value3 = String.valueOf(sb2.toString());
                final int c = ((bc.j)a.d).c;
                final StringBuilder sb3 = new StringBuilder(value3.length() + 16);
                sb3.append(value3);
                sb3.append(", ad=");
                sb3.append(c);
                s2 = sb3.toString();
            }
        }
        final String c2 = c(a.a - this.c);
        final String c3 = c(a.e);
        return a2.b.j(m.q(n.f(s2, n.f(c3, n.f(c2, 23))), "eventTime=", c2, ", mediaPos=", c3), ", ", s2);
    }
    
    public final void d(final String s) {
        Log.d("RedditVideoPlayerEventLogger", s);
    }
    
    public final void e(final qb.a a, final String s) {
        int n = 0;
        while (true) {
            final a$b[] f = a.f;
            if (n >= f.length) {
                break;
            }
            final String value = String.valueOf(f[n]);
            final StringBuilder sb = new StringBuilder(value.length() + s.length());
            sb.append(s);
            sb.append(value);
            this.d(sb.toString());
            ++n;
        }
    }
    
    @Override
    public final void onAudioDecoderInitialized(final a a, final String s, final long n) {
        this.d(this.a(a, "audioDecoderInitialized", s, null));
    }
    
    @Override
    public final void onAudioDecoderReleased(final a a, final String s) {
        this.d(this.a(a, "audioDecoderReleased", s, null));
    }
    
    @Override
    public final void onAudioDisabled(final a a, final e e) {
        this.d(this.a(a, "audioDisabled", null, null));
    }
    
    @Override
    public final void onAudioEnabled(final a a, final e e) {
        this.d(this.a(a, "audioEnabled", null, null));
    }
    
    @Override
    public final void onAudioInputFormatChanged(final a a, final com.google.android.exoplayer2.n n, final g g) {
        this.d(this.a(a, "audioInputFormat", com.google.android.exoplayer2.n.f(n), null));
    }
    
    @Override
    public final void onAudioUnderrun(final a a, final int n, final long n2, final long n3) {
        final StringBuilder sb = new StringBuilder(55);
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        sb.append(", ");
        sb.append(n3);
        Log.e("RedditVideoPlayerEventLogger", this.a(a, "audioTrackUnderrun", sb.toString(), null));
    }
    
    @Override
    public final void onBandwidthEstimate(final a a, final int n, final long n2, final long n3) {
    }
    
    @Override
    public final void onDownstreamFormatChanged(final a a, final bc.i i) {
        this.d(this.a(a, "downstreamFormat", com.google.android.exoplayer2.n.f(i.c), null));
    }
    
    @Override
    public final void onDrmKeysLoaded(final a a) {
        this.d(this.a(a, "drmKeysLoaded", null, null));
    }
    
    @Override
    public final void onDrmKeysRemoved(final a a) {
        this.d(this.a(a, "drmKeysRemoved", null, null));
    }
    
    @Override
    public final void onDrmKeysRestored(final a a) {
        this.d(this.a(a, "drmKeysRestored", null, null));
    }
    
    @Override
    public final void onDrmSessionAcquired(final a a, final int n) {
        this.d(this.a(a, "drmSessionAcquired", a2.b.f(17, "state=", n), null));
    }
    
    @Override
    public final void onDrmSessionManagerError(final a a, final Exception ex) {
        Log.e("RedditVideoPlayerEventLogger", this.a(a, "internalError", "drmSessionManagerError", ex));
    }
    
    @Override
    public final void onDrmSessionReleased(final a a) {
        this.d(this.a(a, "drmSessionReleased", null, null));
    }
    
    @Override
    public final void onDroppedVideoFrames(final a a, final int n, final long n2) {
        this.d(this.a(a, "droppedFrames", Integer.toString(n), null));
    }
    
    @Override
    public final void onIsLoadingChanged(final a a, final boolean b) {
        this.d(this.a(a, "loading", Boolean.toString(b), null));
    }
    
    @Override
    public final void onIsPlayingChanged(final a a, final boolean b) {
        this.d(this.a(a, "isPlaying", Boolean.toString(b), null));
    }
    
    @Override
    public final void onLoadCanceled(final a a, final h h, final bc.i i) {
    }
    
    @Override
    public final void onLoadCompleted(final a a, final h h, final bc.i i) {
    }
    
    @Override
    public final void onLoadError(final a a, final h h, final bc.i i, final IOException ex, final boolean b) {
        Log.e("RedditVideoPlayerEventLogger", this.a(a, "internalError", "loadError", ex));
    }
    
    @Override
    public final void onLoadStarted(final a a, final h h, final bc.i i) {
    }
    
    @Override
    public final void onMediaItemTransition(final a a, final q q, int f) {
        final String b = this.b(a);
        String s;
        if (f != 0) {
            if (f != 1) {
                if (f != 2) {
                    if (f != 3) {
                        s = "?";
                    }
                    else {
                        s = "PLAYLIST_CHANGED";
                    }
                }
                else {
                    s = "SEEK";
                }
            }
            else {
                s = "AUTO";
            }
        }
        else {
            s = "REPEAT";
        }
        f = n.f(b, 21);
        final StringBuilder q2 = m.q(s.length() + f, "mediaItem [", b, ", reason=", s);
        q2.append("]");
        this.d(q2.toString());
    }
    
    @Override
    public final void onMetadata(final a a, final qb.a a2) {
        final String value = String.valueOf(this.b(a));
        String concat;
        if (value.length() != 0) {
            concat = "metadata [".concat(value);
        }
        else {
            concat = new String("metadata [");
        }
        this.d(concat);
        this.e(a2, "  ");
        this.d("]");
    }
    
    @Override
    public final void onPlayWhenReadyChanged(final a a, final boolean b, final int n) {
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            s = "?";
                        }
                        else {
                            s = "END_OF_MEDIA_ITEM";
                        }
                    }
                    else {
                        s = "REMOTE";
                    }
                }
                else {
                    s = "AUDIO_BECOMING_NOISY";
                }
            }
            else {
                s = "AUDIO_FOCUS_LOSS";
            }
        }
        else {
            s = "USER_REQUEST";
        }
        final StringBuilder sb = new StringBuilder(s.length() + 7);
        sb.append(b);
        sb.append(", ");
        sb.append(s);
        this.d(this.a(a, "playWhenReady", sb.toString(), null));
    }
    
    @Override
    public final void onPlaybackParametersChanged(final a a, final v v) {
        this.d(this.a(a, "playbackParameters", v.toString(), null));
    }
    
    @Override
    public final void onPlaybackStateChanged(final a a, final int n) {
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        s = "?";
                    }
                    else {
                        s = "ENDED";
                    }
                }
                else {
                    s = "READY";
                }
            }
            else {
                s = "BUFFERING";
            }
        }
        else {
            s = "IDLE";
        }
        this.d(this.a(a, "state", s, null));
    }
    
    @Override
    public final void onPlaybackSuppressionReasonChanged(final a a, final int n) {
        String s;
        if (n != 0) {
            if (n != 1) {
                s = "?";
            }
            else {
                s = "TRANSIENT_AUDIO_FOCUS_LOSS";
            }
        }
        else {
            s = "NONE";
        }
        this.d(this.a(a, "playbackSuppressionReason", s, null));
    }
    
    @Override
    public final void onPlayerError(final a a, final PlaybackException ex) {
        Log.e("RedditVideoPlayerEventLogger", this.a(a, "playerFailed", null, (Throwable)ex));
    }
    
    @Override
    public final void onPositionDiscontinuity(final a a, final w.d d, final w.d d2, final int n) {
        final StringBuilder k = a.k("reason=");
        String s;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                s = "?";
                            }
                            else {
                                s = "INTERNAL";
                            }
                        }
                        else {
                            s = "REMOVE";
                        }
                    }
                    else {
                        s = "SKIP";
                    }
                }
                else {
                    s = "SEEK_ADJUSTMENT";
                }
            }
            else {
                s = "SEEK";
            }
        }
        else {
            s = "AUTO_TRANSITION";
        }
        s0.v(k, s, ", PositionInfo:old [", "mediaItem=");
        k.append(d.g);
        k.append(", period=");
        k.append(d.j);
        k.append(", pos=");
        k.append(d.k);
        if (d.m != -1) {
            k.append(", contentPos=");
            k.append(d.l);
            k.append(", adGroup=");
            k.append(d.m);
            k.append(", ad=");
            k.append(d.n);
        }
        k.append("], PositionInfo:new [");
        k.append("mediaItem=");
        k.append(d2.g);
        k.append(", period=");
        k.append(d2.j);
        k.append(", pos=");
        k.append(d2.k);
        if (d2.m != -1) {
            k.append(", contentPos=");
            k.append(d2.l);
            k.append(", adGroup=");
            k.append(d2.m);
            k.append(", ad=");
            k.append(d2.n);
        }
        k.append("]");
        this.d(this.a(a, "positionDiscontinuity", k.toString(), null));
    }
    
    @Override
    public final void onRenderedFirstFrame(final a a, final Object o, final long n) {
        this.d(this.a(a, "renderedFirstFrame", String.valueOf(o), null));
    }
    
    @Override
    public final void onRepeatModeChanged(final a a, final int n) {
        String s;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    s = "?";
                }
                else {
                    s = "ALL";
                }
            }
            else {
                s = "ONE";
            }
        }
        else {
            s = "OFF";
        }
        this.d(this.a(a, "repeatMode", s, null));
    }
    
    @Override
    public final void onShuffleModeChanged(final a a, final boolean b) {
        this.d(this.a(a, "shuffleModeEnabled", Boolean.toString(b), null));
    }
    
    @Override
    public final void onSkipSilenceEnabledChanged(final a a, final boolean b) {
        this.d(this.a(a, "skipSilenceEnabled", Boolean.toString(b), null));
    }
    
    @Override
    public final void onSurfaceSizeChanged(final a a, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder(24);
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        this.d(this.a(a, "surfaceSize", sb.toString(), null));
    }
    
    @Override
    public final void onTimelineChanged(final a a, int i) {
        final int h = a.b.h();
        final int o = a.b.o();
        final String b = this.b(a);
        String s;
        if (i != 0) {
            if (i != 1) {
                s = "?";
            }
            else {
                s = "SOURCE_UPDATE";
            }
        }
        else {
            s = "PLAYLIST_CHANGED";
        }
        i = n.f(b, 69);
        final StringBuilder sb = new StringBuilder(s.length() + i);
        sb.append("timeline [");
        sb.append(b);
        sb.append(", periodCount=");
        sb.append(h);
        sb.append(", windowCount=");
        sb.append(o);
        sb.append(", reason=");
        sb.append(s);
        this.d(sb.toString());
        final int n = 0;
        String c;
        StringBuilder sb2;
        for (i = 0; i < Math.min(h, 3); ++i) {
            a.b.f(i, this.b, false);
            c = c(c0.U(this.b.i));
            sb2 = new StringBuilder(ak0.n.f(c, 11));
            sb2.append("  period [");
            sb2.append(c);
            sb2.append("]");
            this.d(sb2.toString());
        }
        i = n;
        if (h > 3) {
            this.d("  ...");
            i = n;
        }
        while (i < Math.min(o, 3)) {
            a.b.m(i, this.a);
            final String c2 = c(c0.U(this.a.s));
            final e0$c a2 = this.a;
            final boolean m = a2.m;
            final boolean n2 = a2.n;
            final StringBuilder sb3 = new StringBuilder(ak0.n.f(c2, 42));
            sb3.append("  window [");
            sb3.append(c2);
            sb3.append(", seekable=");
            sb3.append(m);
            sb3.append(", dynamic=");
            sb3.append(n2);
            sb3.append("]");
            this.d(sb3.toString());
            ++i;
        }
        if (o > 3) {
            this.d("  ...");
        }
        this.d("]");
    }
    
    @Override
    public final void onTracksChanged(final a a, final u u, final j j) {
        this.d(this.a(a, "tracks", "[]", null));
    }
    
    @Override
    public final void onUpstreamDiscarded(final a a, final bc.i i) {
        this.d(this.a(a, "upstreamDiscarded", com.google.android.exoplayer2.n.f(i.c), null));
    }
    
    @Override
    public final void onVideoDecoderInitialized(final a a, final String s, final long n) {
        this.d(this.a(a, "videoDecoderInitialized", s, null));
    }
    
    @Override
    public final void onVideoDecoderReleased(final a a, final String s) {
        this.d(this.a(a, "videoDecoderReleased", s, null));
    }
    
    @Override
    public final void onVideoDisabled(final a a, final e e) {
        this.d(this.a(a, "videoDisabled", null, null));
    }
    
    @Override
    public final void onVideoEnabled(final a a, final e e) {
        this.d(this.a(a, "videoEnabled", null, null));
    }
    
    @Override
    public final void onVideoInputFormatChanged(final a a, final com.google.android.exoplayer2.n n, final g g) {
        this.d(this.a(a, "videoInputFormat", com.google.android.exoplayer2.n.f(n), null));
    }
    
    @Override
    public final void onVideoSizeChanged(final a a, final cd.q q) {
        final int f = q.f;
        final int g = q.g;
        final StringBuilder sb = new StringBuilder(24);
        sb.append(f);
        sb.append(", ");
        sb.append(g);
        this.d(this.a(a, "videoSize", sb.toString(), null));
    }
    
    @Override
    public final void onVolumeChanged(final a a, final float n) {
        this.d(this.a(a, "volume", Float.toString(n), null));
    }
}
