// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video;

import android.media.CamcorderProfile;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005" }, d2 = { "Lcom/reddit/video/creation/video/MediaConfig;", "", "()V", "Audio", "Video", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MediaConfig
{
    public static final int $stable = 0;
    public static final MediaConfig INSTANCE;
    
    static {
        INSTANCE = new MediaConfig();
    }
    
    private MediaConfig() {
    }
    
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lcom/reddit/video/creation/video/MediaConfig$Audio;", "", "()V", "AUDIO_ENCODER_AAC", "", "BIT_RATE", "CHANNELS_STEREO", "FRAMES_PER_BUFFER", "MAX_SAMPLING_RATE", "MIME_TYPE", "", "MIN_SAMPLING_RATE", "SAMPLES_PER_FRAME", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Audio
    {
        public static final int $stable = 0;
        public static final int AUDIO_ENCODER_AAC = 3;
        public static final int BIT_RATE = 64000;
        public static final int CHANNELS_STEREO = 2;
        public static final int FRAMES_PER_BUFFER = 25;
        public static final Audio INSTANCE;
        public static final int MAX_SAMPLING_RATE = 48000;
        public static final String MIME_TYPE = "audio/mp4a-latm";
        public static final int MIN_SAMPLING_RATE = 44100;
        public static final int SAMPLES_PER_FRAME = 1024;
        
        static {
            INSTANCE = new Audio();
        }
        
        private Audio() {
        }
    }
    
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002¨\u0006\u000b" }, d2 = { "Lcom/reddit/video/creation/video/MediaConfig$Video;", "", "()V", "FRAME_RATE", "", "I_KEY_FRAME_INTERVAL", "MIME_TYPE", "", "getMIME_TYPE$annotations", "getBitrate", "cameraId", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Video
    {
        public static final int $stable = 0;
        public static final int FRAME_RATE = 30;
        public static final Video INSTANCE;
        public static final int I_KEY_FRAME_INTERVAL = 1;
        public static final String MIME_TYPE = "video/avc";
        
        static {
            INSTANCE = new Video();
        }
        
        private Video() {
        }
        
        public static final int getBitrate(final int n) {
            return CamcorderProfile.get(n, 1).videoBitRate;
        }
    }
}
