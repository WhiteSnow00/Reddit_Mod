// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.audioResampler;

import com.reddit.video.creation.video.trim.data.audioEditor.AudioTrackFormat;
import com.reddit.video.creation.video.trim.data.audioEditor.TargetAudioTrack;
import com.linkedin.android.litr.exception.MediaTransformationException;
import zs.d;
import us.c$a;
import android.media.MediaFormat;
import java.util.ArrayList;
import zs.a;
import zs.f;
import zs.c;
import com.reddit.video.creation.video.trim.data.audioEditor.TargetAudio;
import com.reddit.video.creation.video.trim.data.audioEditor.SourceAudio;
import javax.inject.Inject;
import sg2.e;
import javax.inject.Named;
import kotlin.jvm.internal.DefaultConstructorMarker;
import us.b;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\b\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014" }, d2 = { "Lcom/reddit/video/creation/video/trim/audioResampler/AudioTranscoder;", "", "Lcom/reddit/video/creation/video/trim/data/audioEditor/SourceAudio;", "sourceAudio", "Lcom/reddit/video/creation/video/trim/data/audioEditor/TargetAudio;", "targetAudio", "", "requestId", "Lus/e;", "listener", "Lhg2/j;", "transcodeAudio", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lus/b;", "mediaTransformer", "<init>", "(Landroid/content/Context;Lus/b;)V", "Companion", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class AudioTranscoder
{
    public static final int $stable;
    public static final Companion Companion;
    private static final int ENCODER_BUFFER_CAPACITY = 8192;
    private static final String MP4_MIME_TYPE = "audio/mp4a-latm";
    private static final String RAW_MIME_TYPE = "audio/raw";
    private final Context context;
    private final b mediaTransformer;
    
    static {
        Companion = new Companion(null);
        $stable = 8;
    }
    
    @Inject
    public AudioTranscoder(@Named("APP_CONTEXT") final Context context, final b mediaTransformer) {
        e.f((Object)context, "context");
        e.f((Object)mediaTransformer, "mediaTransformer");
        this.context = context;
        this.mediaTransformer = mediaTransformer;
    }
    
    public final void transcodeAudio(final SourceAudio sourceAudio, final TargetAudio targetAudio, final String s, final us.e e) {
        e.f((Object)sourceAudio, "sourceAudio");
        e.f((Object)targetAudio, "targetAudio");
        e.f((Object)s, "requestId");
        e.f((Object)e, "listener");
        if (targetAudio.getTargetFile().exists()) {
            targetAudio.getTargetFile().delete();
        }
        final c c = new c(0L, Long.MAX_VALUE);
        try {
            String s2;
            if (targetAudio.getWriteToWav()) {
                s2 = "audio/raw";
            }
            else {
                s2 = "audio/mp4a-latm";
            }
            Object o;
            if (targetAudio.getWriteToWav()) {
                o = new(zs.f.class)();
                final String path = targetAudio.getTargetFile().getPath();
                e.e((Object)path, "targetAudio.targetFile.path");
                new f(path);
            }
            else {
                o = new zs.b(targetAudio.getTargetFile().getPath());
            }
            final a a = new a(this.context, sourceAudio.getUri(), c);
            final ArrayList<us.c> list = new ArrayList<us.c>();
            final TargetAudioTrack track = targetAudio.getTrack();
            if (track != null) {
                final AudioTrackFormat format = track.getFormat();
                final MediaFormat audioFormat = MediaFormat.createAudioFormat(s2, format.getSamplingRate(), format.getChannelCount());
                e.e((Object)audioFormat, "createAudioFormat(\n     \u2026t.channelCount,\n        )");
                audioFormat.setInteger("bitrate", format.getBitrate());
                audioFormat.setLong("durationUs", format.getDuration());
                Object f;
                if (targetAudio.getWriteToWav()) {
                    f = new ws.f();
                }
                else {
                    f = new ws.e();
                }
                final c$a c$a = new c$a((d)a, track.getSourceTrackIndex(), (zs.e)o);
                c$a.h = 0;
                c$a.d = (ws.a)new ws.d();
                c$a.f = (ws.b)f;
                c$a.e = (at.e)new at.b((ws.b)f);
                c$a.g = audioFormat;
                list.add(c$a.a());
                this.mediaTransformer.a(s, (ArrayList)list, e);
            }
        }
        catch (final MediaTransformationException ex) {
            su2.a.a.f((Throwable)ex, "Exception when trying to transcode audio", new Object[0]);
        }
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lcom/reddit/video/creation/video/trim/audioResampler/AudioTranscoder$Companion;", "", "()V", "ENCODER_BUFFER_CAPACITY", "", "MP4_MIME_TYPE", "", "RAW_MIME_TYPE", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
