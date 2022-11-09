// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import java.io.IOException;
import android.util.Log;
import java.io.FileDescriptor;
import android.os.Build$VERSION;
import android.opengl.EGLContext;
import com.daasuu.mp4compose.FillMode;
import com.daasuu.mp4compose.Rotation;
import t9.b;
import android.media.MediaCodecList;
import com.daasuu.mp4compose.VideoFormatMimeType;
import android.util.Size;
import android.media.MediaFormat;
import v7.a;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.media.MediaExtractor;

public final class i
{
    public m a;
    public f b;
    public MediaExtractor c;
    public MediaMuxer d;
    public a e;
    public long f;
    public MediaMetadataRetriever g;
    public volatile boolean h;
    public final v7.a i;
    public long j;
    
    public i(final v7.a i) {
        this.i = i;
    }
    
    public static MediaFormat b(final MediaFormat mediaFormat) {
        if ("audio/mp4a-latm".equals(mediaFormat.getString("mime"))) {
            return mediaFormat;
        }
        final MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", "audio/mp4a-latm");
        mediaFormat2.setInteger("aac-profile", 39);
        mediaFormat2.setInteger("sample-rate", mediaFormat.getInteger("sample-rate"));
        mediaFormat2.setInteger("bitrate", 128000);
        mediaFormat2.setInteger("channel-count", mediaFormat.getInteger("channel-count"));
        return mediaFormat2;
    }
    
    public static MediaFormat c(final String s, final int n, final Size size) {
        final MediaFormat videoFormat = MediaFormat.createVideoFormat(s, size.getWidth(), size.getHeight());
        videoFormat.setInteger("bitrate", n);
        videoFormat.setInteger("frame-rate", 30);
        videoFormat.setInteger("i-frame-interval", 1);
        videoFormat.setInteger("color-format", 2130708361);
        return videoFormat;
    }
    
    public static MediaFormat d(final VideoFormatMimeType videoFormatMimeType, final int n, final Size size) {
        final MediaCodecList list = new MediaCodecList(0);
        if (videoFormatMimeType != VideoFormatMimeType.AUTO) {
            final MediaFormat c = c(videoFormatMimeType.getFormat(), n, size);
            if (list.findEncoderForFormat(c) != null) {
                return c;
            }
        }
        final MediaFormat c2 = c(VideoFormatMimeType.HEVC.getFormat(), n, size);
        if (list.findEncoderForFormat(c2) != null) {
            return c2;
        }
        final MediaFormat c3 = c(VideoFormatMimeType.AVC.getFormat(), n, size);
        if (list.findEncoderForFormat(c3) != null) {
            return c3;
        }
        final MediaFormat c4 = c(VideoFormatMimeType.MPEG4.getFormat(), n, size);
        if (list.findEncoderForFormat(c4) != null) {
            return c4;
        }
        return c(VideoFormatMimeType.H263.getFormat(), n, size);
    }
    
    public final void a(b a, String s, final Size size, final r9.a a2, final int n, final Rotation rotation, final Size size2, final FillMode fillMode, final float n2, final long j, final long n3, final VideoFormatMimeType videoFormatMimeType, final EGLContext eglContext) throws IOException {
        try {
            (this.c = new MediaExtractor()).setDataSource(((b)a).a);
            Label_0081: {
                Label_0063: {
                    if (Build$VERSION.SDK_INT >= 26 && s == null) {
                        try {
                            this.d = new MediaMuxer((FileDescriptor)null, 0);
                            break Label_0081;
                        }
                        finally {}
                        break Label_0063;
                    }
                }
                this.d = new MediaMuxer(s, 0);
            }
            (this.g = new MediaMetadataRetriever()).setDataSource(((b)a).a);
            this.j = j;
            if (n3 != -1L) {
                this.f = (n3 - j) * 1000L;
            }
            else {
                try {
                    this.f = Long.parseLong(this.g.extractMetadata(9)) * 1000L;
                }
                catch (final NumberFormatException ex) {
                    this.f = -1L;
                }
            }
            final v7.a i = this.i;
            final StringBuilder sb = new StringBuilder();
            sb.append("Duration (us): ");
            sb.append(this.f);
            s = sb.toString();
            i.getClass();
            Log.d("Mp4ComposerEngine", s);
            a = (RuntimeException)new j(this.d, this.i);
            int n5;
            int n4 = n5 = -1;
            int n6;
            for (int k = 0; k < this.c.getTrackCount(); ++k, n5 = n6) {
                s = this.c.getTrackFormat(k).getString("mime");
                if (s == null) {
                    n6 = n5;
                }
                else if (s.startsWith("video/")) {
                    n6 = k;
                }
                else {
                    final boolean startsWith = s.startsWith("audio/");
                    n6 = n5;
                    if (startsWith) {
                        n4 = k;
                        n6 = n5;
                    }
                }
            }
            final MediaFormat d = d(videoFormatMimeType, n, size);
            final MediaExtractor c = this.c;
            final v7.a l = this.i;
            try {
                (this.a = new m(c, n5, d, (j)a, n2, j, n3, l)).b(a2, rotation, size, size2, fillMode, eglContext);
                this.c.selectTrack(n5);
                Label_0590: {
                    if (n4 >= 0) {
                        try {
                            if (this.g.extractMetadata(16) != null) {
                                final MediaFormat trackFormat = this.c.getTrackFormat(n4);
                                final MediaFormat b = b(trackFormat);
                                final double n7 = n2;
                                if (n7 >= 0.99 && n7 <= 1.01 && b.equals(trackFormat)) {
                                    this.b = new q9.b(this.c, n4, (j)a, j, n3, this.i);
                                }
                                else {
                                    this.b = new k(this.c, n4, b, (j)a, n2, j, n3);
                                }
                                this.b.setup();
                                this.c.selectTrack(n4);
                                this.c.seekTo(j * 1000L, 0);
                                this.e();
                                break Label_0590;
                            }
                        }
                        finally {}
                    }
                    this.c.seekTo(j * 1000L, 0);
                    this.f();
                }
                this.d.stop();
                try {
                    a = (RuntimeException)this.a;
                    Label_0618: {
                        if (a == null) {
                            break Label_0618;
                        }
                        ((m)a).a();
                        try {
                            this.a = null;
                            final f b2 = this.b;
                            if (b2 != null) {
                                b2.release();
                                this.b = null;
                            }
                            final MediaExtractor c2 = this.c;
                            if (c2 != null) {
                                c2.release();
                                this.c = null;
                            }
                        }
                        catch (final RuntimeException a) {}
                    }
                }
                catch (final RuntimeException ex2) {}
                this.i.getClass();
                Log.e("Mp4ComposerEngine", "Could not shutdown mediaExtractor, codecs and mediaMuxer pipeline.", (Throwable)a);
                try {
                    final MediaMuxer d2 = this.d;
                    if (d2 != null) {
                        d2.release();
                        this.d = null;
                    }
                }
                catch (final RuntimeException ex3) {
                    this.i.getClass();
                    Log.e("Mp4ComposerEngine", "Failed to release mediaMuxer.", (Throwable)ex3);
                }
                try {
                    final MediaMetadataRetriever g = this.g;
                    if (g != null) {
                        g.release();
                        this.g = null;
                    }
                }
                catch (final RuntimeException ex4) {
                    this.i.getClass();
                    Log.e("Mp4ComposerEngine", "Failed to release mediaMetadataRetriever.", (Throwable)ex4);
                }
                return;
            }
            finally {}
        }
        finally {}
        try {
            final m a3 = this.a;
            if (a3 != null) {
                a3.a();
                this.a = null;
            }
            final f b3 = this.b;
            if (b3 != null) {
                b3.release();
                this.b = null;
            }
            final MediaExtractor c3 = this.c;
            if (c3 != null) {
                c3.release();
                this.c = null;
            }
        }
        catch (final RuntimeException ex5) {
            this.i.getClass();
            Log.e("Mp4ComposerEngine", "Could not shutdown mediaExtractor, codecs and mediaMuxer pipeline.", (Throwable)ex5);
        }
        try {
            final MediaMuxer d3 = this.d;
            if (d3 != null) {
                d3.release();
                this.d = null;
            }
        }
        catch (final RuntimeException ex6) {
            this.i.getClass();
            Log.e("Mp4ComposerEngine", "Failed to release mediaMuxer.", (Throwable)ex6);
        }
        try {
            final MediaMetadataRetriever g2 = this.g;
            if (g2 != null) {
                g2.release();
                this.g = null;
            }
        }
        catch (final RuntimeException ex7) {
            this.i.getClass();
            Log.e("Mp4ComposerEngine", "Failed to release mediaMetadataRetriever.", (Throwable)ex7);
        }
    }
    
    public final void e() {
        if (this.f <= 0L) {
            final a e = this.e;
            if (e != null) {
                final g.b g = ((h.h$a)e).a.f.g;
                if (g != null) {
                    g.onProgress(-1.0);
                }
            }
        }
        long n = 0L;
        while (true) {
            if (this.h || (this.a.m && this.b.c())) {
                return;
            }
            final boolean b = this.a.c() || this.b.a();
            final long n2 = n + 1L;
            if (this.f > 0L && n2 % 10L == 0L) {
                final m a = this.a;
                final long n3 = (long)(a.p * a.q);
                final a e2 = this.e;
                if (e2 != null) {
                    final g.b g2 = ((h.h$a)e2).a.f.g;
                    if (g2 != null) {
                        g2.onCurrentWrittenVideoTime(n3);
                    }
                }
                final boolean m = this.a.m;
                double min = 1.0;
                double min2;
                if (m) {
                    min2 = 1.0;
                }
                else {
                    min2 = Math.min(1.0, Math.max(0L, n3 - this.j * 1000L) / (double)this.f);
                }
                if (!this.b.c()) {
                    min = Math.min(1.0, Math.max(0L, this.b.b() - this.j * 1000L) / (double)this.f);
                }
                final double n4 = (min2 + min) / 2.0;
                final a e3 = this.e;
                if (e3 != null) {
                    final g.b g3 = ((h.h$a)e3).a.f.g;
                    if (g3 != null) {
                        g3.onProgress(n4);
                    }
                }
            }
            n = n2;
            if (b) {
                continue;
            }
            try {
                Thread.sleep(10L);
                n = n2;
                continue;
            }
            catch (final InterruptedException ex) {
                n = n2;
            }
        }
    }
    
    public final void f() {
        if (this.f <= 0L) {
            final a e = this.e;
            if (e != null) {
                final g.b g = ((h.h$a)e).a.f.g;
                if (g != null) {
                    g.onProgress(-1.0);
                }
            }
        }
        long n = 0L;
        while (true) {
            if (this.h) {
                return;
            }
            final m a = this.a;
            if (a.m) {
                return;
            }
            final boolean c = a.c();
            final long n2 = n + 1L;
            if (this.f > 0L && n2 % 10L == 0L) {
                final m a2 = this.a;
                final long n3 = (long)(a2.p * a2.q);
                final a e2 = this.e;
                if (e2 != null) {
                    final g.b g2 = ((h.h$a)e2).a.f.g;
                    if (g2 != null) {
                        g2.onCurrentWrittenVideoTime(n3);
                    }
                }
                final boolean m = this.a.m;
                double min = 1.0;
                if (!m) {
                    min = Math.min(1.0, Math.max(0L, n3 - this.j * 1000L) / (double)this.f);
                }
                final a e3 = this.e;
                if (e3 != null) {
                    final g.b g3 = ((h.h$a)e3).a.f.g;
                    if (g3 != null) {
                        g3.onProgress(min);
                    }
                }
            }
            n = n2;
            if (c) {
                continue;
            }
            try {
                Thread.sleep(10L);
                n = n2;
                continue;
            }
            catch (final InterruptedException ex) {
                n = n2;
            }
        }
    }
    
    public interface a
    {
    }
}
