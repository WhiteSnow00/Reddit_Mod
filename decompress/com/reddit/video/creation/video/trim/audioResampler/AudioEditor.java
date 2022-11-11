// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.audioResampler;

import kf2.o;
import ff2.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import al0.g7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.video.creation.video.trim.data.audioEditor.TargetAudioTrack;
import com.reddit.video.creation.video.trim.data.audioEditor.TargetAudio;
import java.io.File;
import com.reddit.video.creation.video.utils.VideoCacheHelper;
import java.util.UUID;
import com.reddit.video.creation.video.trim.data.audioEditor.SourceAudio;
import ff2.f0;
import qa.d;
import kotlin.Pair;
import ff2.c0;
import android.media.MediaMetadataRetriever;
import android.media.MediaFormat;
import java.io.IOException;
import cj2.j;
import java.util.Map;
import android.media.MediaExtractor;
import android.net.Uri;
import ff2.g0;
import ff2.d0;
import com.reddit.video.creation.video.trim.data.audioEditor.AudioTrackFormat;
import javax.inject.Inject;
import sg2.e;
import javax.inject.Named;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J*\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0002J=\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00140\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006," }, d2 = { "Lcom/reddit/video/creation/video/trim/audioResampler/AudioEditor;", "", "Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;", "track", "", "samplingRate", "Lff2/c0;", "Lkotlin/Pair;", "", "resampleTrack", "Landroid/net/Uri;", "uri", "", "getMediaDuration", "getAudioTrack", "Landroid/media/MediaFormat;", "mediaFormat", "key", "getInt", "getLong", "", "tracksToTranscode", "resampleTracks$creation_release", "(Ljava/util/List;I)Lff2/c0;", "resampleTracks", "audioTracks", "getTracksToTranscode$creation_release", "(Ljava/util/List;I)Ljava/util/List;", "getTracksToTranscode", "calculateSamplingRate$creation_release", "(Ljava/util/List;)I", "calculateSamplingRate", "mp4sToExtractSoundFrom", "getAudioTracks$creation_release", "(Ljava/util/List;)Ljava/util/List;", "getAudioTracks", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/reddit/video/creation/video/trim/audioResampler/AudioTranscoder;", "audioTranscoder", "Lcom/reddit/video/creation/video/trim/audioResampler/AudioTranscoder;", "<init>", "(Landroid/content/Context;Lcom/reddit/video/creation/video/trim/audioResampler/AudioTranscoder;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class AudioEditor
{
    public static final int $stable = 8;
    private final AudioTranscoder audioTranscoder;
    private final Context context;
    
    @Inject
    public AudioEditor(@Named("APP_CONTEXT") final Context context, final AudioTranscoder audioTranscoder) {
        e.f((Object)context, "context");
        e.f((Object)audioTranscoder, "audioTranscoder");
        this.context = context;
        this.audioTranscoder = audioTranscoder;
    }
    
    private final AudioTrackFormat getAudioTrack(final Uri uri) {
        try {
            final MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(this.context, uri, (Map)null);
            for (int trackCount = mediaExtractor.getTrackCount(), i = 0; i < trackCount; ++i) {
                final MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                e.e((Object)trackFormat, "mediaExtractor.getTrackFormat(track)");
                final String string = trackFormat.getString("mime");
                if (string != null) {
                    if (j.O0(string, "audio", false)) {
                        return new AudioTrackFormat(i, string, uri, this.getInt(trackFormat, "channel-count"), this.getInt(trackFormat, "sample-rate"), this.getInt(trackFormat, "bitrate"), this.getLong(trackFormat, "durationUs"));
                    }
                }
            }
            return null;
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    private final int getInt(final MediaFormat mediaFormat, final String s) {
        int integer;
        if (mediaFormat.containsKey(s)) {
            integer = mediaFormat.getInteger(s);
        }
        else {
            integer = -1;
        }
        return integer;
    }
    
    private final long getLong(final MediaFormat mediaFormat, final String s) {
        long long1;
        if (mediaFormat.containsKey(s)) {
            long1 = mediaFormat.getLong(s);
        }
        else {
            long1 = -1L;
        }
        return long1;
    }
    
    private final long getMediaDuration(final Uri uri) {
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this.context, uri);
        final String metadata = mediaMetadataRetriever.extractMetadata(9);
        long long1;
        if (metadata != null) {
            long1 = Long.parseLong(metadata);
        }
        else {
            long1 = 0L;
        }
        return long1;
    }
    
    private final c0<Pair<String, String>> resampleTrack(final AudioTrackFormat audioTrackFormat, final int n) {
        final c0<Object> h = c0.h((ff2.f0<Object>)new d(n, 3, (Object)audioTrackFormat, (Object)this));
        e.e((Object)h, "create { emitter ->\n    \u2026\n        },\n      )\n    }");
        return (c0<Pair<String, String>>)h;
    }
    
    private static final void resampleTrack$lambda-1(final AudioTrackFormat audioTrackFormat, final AudioEditor audioEditor, final int n, final d0 d0) {
        e.f((Object)audioTrackFormat, "$track");
        e.f((Object)audioEditor, "this$0");
        e.f((Object)d0, "emitter");
        final SourceAudio sourceAudio = new SourceAudio(audioTrackFormat.getSourceUri(), ct.d.b(audioEditor.context, audioTrackFormat.getSourceUri()), audioEditor.getMediaDuration(audioTrackFormat.getSourceUri()) / 1000.0f, audioTrackFormat);
        final StringBuilder r = a.r("adjusted-clip");
        r.append(UUID.randomUUID());
        final File tempFile = File.createTempFile(r.toString(), ".mp4", VideoCacheHelper.getVideoCacheDirectory(audioEditor.context));
        e.e((Object)tempFile, "targetFile");
        final TargetAudio targetAudio = new TargetAudio(tempFile, null, null, null, false, 30, null);
        targetAudio.setTrack(audioTrackFormat, n);
        audioEditor.audioTranscoder.transcodeAudio(sourceAudio, targetAudio, g7.d("randomUUID().toString()"), (us.e)new AudioEditor$resampleTrack$1$1(d0, audioTrackFormat, tempFile));
    }
    
    private static final g0 resampleTracks$lambda-0(final AudioEditor audioEditor, final int n, final AudioTrackFormat audioTrackFormat) {
        e.f((Object)audioEditor, "this$0");
        e.f((Object)audioTrackFormat, "track");
        return (g0)audioEditor.resampleTrack(audioTrackFormat, n);
    }
    
    public final int calculateSamplingRate$creation_release(final List<AudioTrackFormat> list) {
        e.f((Object)list, "audioTracks");
        final Iterator<Object> iterator = list.iterator();
        int max = 44100;
        while (iterator.hasNext()) {
            max = Math.max(max, iterator.next().getSamplingRate());
        }
        return Math.min(48000, max);
    }
    
    public final List<AudioTrackFormat> getAudioTracks$creation_release(final List<String> list) {
        e.f((Object)list, "mp4sToExtractSoundFrom");
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Uri fromFile = Uri.fromFile(new File(iterator.next()));
            e.e((Object)fromFile, "uri");
            final AudioTrackFormat audioTrack = this.getAudioTrack(fromFile);
            if (audioTrack != null) {
                list2.add(audioTrack);
            }
        }
        return list2;
    }
    
    public final List<AudioTrackFormat> getTracksToTranscode$creation_release(final List<AudioTrackFormat> list, final int n) {
        e.f((Object)list, "audioTracks");
        final ArrayList list2 = new ArrayList();
        for (final AudioTrackFormat next : list) {
            if (next.getSamplingRate() != n) {
                list2.add(next);
            }
        }
        return list2;
    }
    
    public final c0<List<Pair<String, String>>> resampleTracks$creation_release(final List<AudioTrackFormat> list, final int n) {
        e.f((Object)list, "tracksToTranscode");
        final c0 list2 = t.fromIterable((Iterable)list).flatMapSingle((o)new kb2.a(this, n)).toList();
        e.e((Object)list2, "fromIterable(tracksToTra\u2026)\n      }\n      .toList()");
        return list2;
    }
}
