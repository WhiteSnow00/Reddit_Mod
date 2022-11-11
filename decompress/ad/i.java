// 
// Decompiled by Procyon v0.6.0
// 

package ad;

import wc.j;
import ac.u;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.q;
import java.io.IOException;
import ac.h;
import za.g;
import com.google.android.exoplayer2.n;
import pb.a$b;
import android.util.Log;
import al0.f0;
import android.text.TextUtils;
import lg.e0;
import com.google.android.exoplayer2.PlaybackException;
import a81.e;
import wa.b$a;
import android.os.SystemClock;
import java.util.Locale;
import com.google.android.exoplayer2.e0$b;
import com.google.android.exoplayer2.e0$c;
import java.text.NumberFormat;
import wa.b;

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
    
    public final String a(final b$a b$a, String s, String s2, final Throwable t) {
        final String b = this.b(b$a);
        final String s3 = s = a.j(e.h(b, s.length() + 2), s, " [", b);
        if (t instanceof PlaybackException) {
            s = String.valueOf(s3);
            final String errorCodeName = ((PlaybackException)t).getErrorCodeName();
            s = a.j(e.h(errorCodeName, s.length() + 12), s, ", errorCode=", errorCodeName);
        }
        String j = s;
        if (s2 != null) {
            final String value = String.valueOf(s);
            j = a.j(s2.length() + (value.length() + 2), value, ", ", s2);
        }
        s2 = e0.S(t);
        s = j;
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            final String value2 = String.valueOf(j);
            s2 = s2.replace("\n", "\n  ");
            final StringBuilder sb = new StringBuilder(e.h(s2, value2.length() + 4));
            sb.append(value2);
            sb.append("\n  ");
            sb.append(s2);
            sb.append('\n');
            s = sb.toString();
        }
        return String.valueOf(s).concat("]");
    }
    
    public final String b(final b$a b$a) {
        String s2;
        final String s = s2 = f0.f(18, "window=", b$a.c);
        if (b$a.d != null) {
            final String value = String.valueOf(s);
            final int b = b$a.b.b(((ac.j)b$a.d).a);
            final StringBuilder sb = new StringBuilder(value.length() + 20);
            sb.append(value);
            sb.append(", period=");
            sb.append(b);
            final String s3 = s2 = sb.toString();
            if (((ac.j)b$a.d).a()) {
                final String value2 = String.valueOf(s3);
                final int b2 = ((ac.j)b$a.d).b;
                final StringBuilder sb2 = new StringBuilder(value2.length() + 21);
                sb2.append(value2);
                sb2.append(", adGroup=");
                sb2.append(b2);
                final String value3 = String.valueOf(sb2.toString());
                final int c = ((ac.j)b$a.d).c;
                final StringBuilder sb3 = new StringBuilder(value3.length() + 16);
                sb3.append(value3);
                sb3.append(", ad=");
                sb3.append(c);
                s2 = sb3.toString();
            }
        }
        final String c2 = c(b$a.a - this.c);
        final String c3 = c(b$a.e);
        return a.o(aw.b.k(e.h(s2, e.h(c3, e.h(c2, 23))), "eventTime=", c2, ", mediaPos=", c3), ", ", s2);
    }
    
    public final void d(final String s) {
        Log.d("RedditVideoPlayerEventLogger", s);
    }
    
    public final void e(final pb.a a, final String s) {
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
    public final void onAudioDecoderInitialized(final b$a b$a, final String s, final long n) {
        this.d(this.a(b$a, "audioDecoderInitialized", s, null));
    }
    
    @Override
    public final void onAudioDecoderReleased(final b$a b$a, final String s) {
        this.d(this.a(b$a, "audioDecoderReleased", s, null));
    }
    
    @Override
    public final void onAudioDisabled(final b$a b$a, final za.e e) {
        this.d(this.a(b$a, "audioDisabled", null, null));
    }
    
    @Override
    public final void onAudioEnabled(final b$a b$a, final za.e e) {
        this.d(this.a(b$a, "audioEnabled", null, null));
    }
    
    @Override
    public final void onAudioInputFormatChanged(final b$a b$a, final n n, final g g) {
        this.d(this.a(b$a, "audioInputFormat", n.f(n), null));
    }
    
    @Override
    public final void onAudioUnderrun(final b$a b$a, final int n, final long n2, final long n3) {
        final StringBuilder sb = new StringBuilder(55);
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        sb.append(", ");
        sb.append(n3);
        Log.e("RedditVideoPlayerEventLogger", this.a(b$a, "audioTrackUnderrun", sb.toString(), null));
    }
    
    @Override
    public final void onBandwidthEstimate(final b$a b$a, final int n, final long n2, final long n3) {
    }
    
    @Override
    public final void onDownstreamFormatChanged(final b$a b$a, final ac.i i) {
        this.d(this.a(b$a, "downstreamFormat", n.f(i.c), null));
    }
    
    @Override
    public final void onDrmKeysLoaded(final b$a b$a) {
        this.d(this.a(b$a, "drmKeysLoaded", null, null));
    }
    
    @Override
    public final void onDrmKeysRemoved(final b$a b$a) {
        this.d(this.a(b$a, "drmKeysRemoved", null, null));
    }
    
    @Override
    public final void onDrmKeysRestored(final b$a b$a) {
        this.d(this.a(b$a, "drmKeysRestored", null, null));
    }
    
    @Override
    public final void onDrmSessionAcquired(final b$a b$a, final int n) {
        this.d(this.a(b$a, "drmSessionAcquired", f0.f(17, "state=", n), null));
    }
    
    @Override
    public final void onDrmSessionManagerError(final b$a b$a, final Exception ex) {
        Log.e("RedditVideoPlayerEventLogger", this.a(b$a, "internalError", "drmSessionManagerError", ex));
    }
    
    @Override
    public final void onDrmSessionReleased(final b$a b$a) {
        this.d(this.a(b$a, "drmSessionReleased", null, null));
    }
    
    @Override
    public final void onDroppedVideoFrames(final b$a b$a, final int n, final long n2) {
        this.d(this.a(b$a, "droppedFrames", Integer.toString(n), null));
    }
    
    @Override
    public final void onIsLoadingChanged(final b$a b$a, final boolean b) {
        this.d(this.a(b$a, "loading", Boolean.toString(b), null));
    }
    
    @Override
    public final void onIsPlayingChanged(final b$a b$a, final boolean b) {
        this.d(this.a(b$a, "isPlaying", Boolean.toString(b), null));
    }
    
    @Override
    public final void onLoadCanceled(final b$a b$a, final h h, final ac.i i) {
    }
    
    @Override
    public final void onLoadCompleted(final b$a b$a, final h h, final ac.i i) {
    }
    
    @Override
    public final void onLoadError(final b$a b$a, final h h, final ac.i i, final IOException ex, final boolean b) {
        Log.e("RedditVideoPlayerEventLogger", this.a(b$a, "internalError", "loadError", ex));
    }
    
    @Override
    public final void onLoadStarted(final b$a b$a, final h h, final ac.i i) {
    }
    
    @Override
    public final void onMediaItemTransition(final b$a b$a, final q q, int h) {
        final String b = this.b(b$a);
        String s;
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    if (h != 3) {
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
        h = e.h(b, 21);
        final StringBuilder k = aw.b.k(s.length() + h, "mediaItem [", b, ", reason=", s);
        k.append("]");
        this.d(k.toString());
    }
    
    @Override
    public final void onMetadata(final b$a b$a, final pb.a a) {
        final String value = String.valueOf(this.b(b$a));
        String concat;
        if (value.length() != 0) {
            concat = "metadata [".concat(value);
        }
        else {
            concat = new String("metadata [");
        }
        this.d(concat);
        this.e(a, "  ");
        this.d("]");
    }
    
    @Override
    public final void onPlayWhenReadyChanged(final b$a b$a, final boolean b, final int n) {
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
        this.d(this.a(b$a, "playWhenReady", sb.toString(), null));
    }
    
    @Override
    public final void onPlaybackParametersChanged(final b$a b$a, final v v) {
        this.d(this.a(b$a, "playbackParameters", v.toString(), null));
    }
    
    @Override
    public final void onPlaybackStateChanged(final b$a b$a, final int n) {
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
        this.d(this.a(b$a, "state", s, null));
    }
    
    @Override
    public final void onPlaybackSuppressionReasonChanged(final b$a b$a, final int n) {
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
        this.d(this.a(b$a, "playbackSuppressionReason", s, null));
    }
    
    @Override
    public final void onPlayerError(final b$a b$a, final PlaybackException ex) {
        Log.e("RedditVideoPlayerEventLogger", this.a(b$a, "playerFailed", null, (Throwable)ex));
    }
    
    @Override
    public final void onPositionDiscontinuity(final b$a b$a, final w.d d, final w.d d2, final int n) {
        final StringBuilder r = a.r("reason=");
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
        e.A(r, s, ", PositionInfo:old [", "mediaItem=");
        r.append(d.g);
        r.append(", period=");
        r.append(d.j);
        r.append(", pos=");
        r.append(d.k);
        if (d.m != -1) {
            r.append(", contentPos=");
            r.append(d.l);
            r.append(", adGroup=");
            r.append(d.m);
            r.append(", ad=");
            r.append(d.n);
        }
        r.append("], PositionInfo:new [");
        r.append("mediaItem=");
        r.append(d2.g);
        r.append(", period=");
        r.append(d2.j);
        r.append(", pos=");
        r.append(d2.k);
        if (d2.m != -1) {
            r.append(", contentPos=");
            r.append(d2.l);
            r.append(", adGroup=");
            r.append(d2.m);
            r.append(", ad=");
            r.append(d2.n);
        }
        r.append("]");
        this.d(this.a(b$a, "positionDiscontinuity", r.toString(), null));
    }
    
    @Override
    public final void onRenderedFirstFrame(final b$a b$a, final Object o, final long n) {
        this.d(this.a(b$a, "renderedFirstFrame", String.valueOf(o), null));
    }
    
    @Override
    public final void onRepeatModeChanged(final b$a b$a, final int n) {
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
        this.d(this.a(b$a, "repeatMode", s, null));
    }
    
    @Override
    public final void onShuffleModeChanged(final b$a b$a, final boolean b) {
        this.d(this.a(b$a, "shuffleModeEnabled", Boolean.toString(b), null));
    }
    
    @Override
    public final void onSkipSilenceEnabledChanged(final b$a b$a, final boolean b) {
        this.d(this.a(b$a, "skipSilenceEnabled", Boolean.toString(b), null));
    }
    
    @Override
    public final void onSurfaceSizeChanged(final b$a b$a, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder(24);
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        this.d(this.a(b$a, "surfaceSize", sb.toString(), null));
    }
    
    @Override
    public final void onTimelineChanged(final b$a b$a, int i) {
        final int h = b$a.b.h();
        final int o = b$a.b.o();
        final String b = this.b(b$a);
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
        i = e.h(b, 69);
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
            b$a.b.f(i, this.b, false);
            c = c(c0.U(this.b.i));
            sb2 = new StringBuilder(e.h(c, 11));
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
            b$a.b.m(i, this.a);
            final String c2 = c(c0.U(this.a.s));
            final e0$c a = this.a;
            final boolean m = a.m;
            final boolean n2 = a.n;
            final StringBuilder sb3 = new StringBuilder(e.h(c2, 42));
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
    public final void onTracksChanged(final b$a b$a, final u u, final j j) {
        this.d(this.a(b$a, "tracks", "[]", null));
    }
    
    @Override
    public final void onUpstreamDiscarded(final b$a b$a, final ac.i i) {
        this.d(this.a(b$a, "upstreamDiscarded", n.f(i.c), null));
    }
    
    @Override
    public final void onVideoDecoderInitialized(final b$a b$a, final String s, final long n) {
        this.d(this.a(b$a, "videoDecoderInitialized", s, null));
    }
    
    @Override
    public final void onVideoDecoderReleased(final b$a b$a, final String s) {
        this.d(this.a(b$a, "videoDecoderReleased", s, null));
    }
    
    @Override
    public final void onVideoDisabled(final b$a b$a, final za.e e) {
        this.d(this.a(b$a, "videoDisabled", null, null));
    }
    
    @Override
    public final void onVideoEnabled(final b$a b$a, final za.e e) {
        this.d(this.a(b$a, "videoEnabled", null, null));
    }
    
    @Override
    public final void onVideoInputFormatChanged(final b$a b$a, final n n, final g g) {
        this.d(this.a(b$a, "videoInputFormat", n.f(n), null));
    }
    
    @Override
    public final void onVideoSizeChanged(final b$a b$a, final bd.q q) {
        final int f = q.f;
        final int g = q.g;
        final StringBuilder sb = new StringBuilder(24);
        sb.append(f);
        sb.append(", ");
        sb.append(g);
        this.d(this.a(b$a, "videoSize", sb.toString(), null));
    }
    
    @Override
    public final void onVolumeChanged(final b$a b$a, final float n) {
        this.d(this.a(b$a, "volume", Float.toString(n), null));
    }
}
