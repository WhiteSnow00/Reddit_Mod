// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.nio.ByteBuffer;
import android.media.AudioFormat;
import android.media.AudioAttributes;
import android.media.AudioTrack$Builder;
import android.media.AudioFormat$Builder;
import android.media.AudioAttributes$Builder;
import android.media.PlaybackParams;
import android.util.Log;
import android.os.Process;
import android.media.AudioTrack;
import android.media.MediaFormat;

class AudioTrackRenderer implements MediaRenderer, AudioRenderer
{
    private static final int BUFFERS = 2;
    private int audioSessionId;
    private int bufferSize;
    private int bytesWritten;
    private MediaFormat format;
    private int frameSizeBytes;
    private long framesWritten;
    private float playbackRate;
    private long playheadBasePosition;
    private long playheadPrevPosition;
    private long sampleTimeUs;
    private boolean started;
    private AudioTrack track;
    private float volume;
    
    public AudioTrackRenderer() {
        this.volume = 1.0f;
        this.playbackRate = 1.0f;
        Process.setThreadPriority(-19);
    }
    
    private void checkResult(final int n) {
        if (n != -6) {
            if (n != -3) {
                if (n == -2) {
                    Log.e("AmazonIVS", "AudioTrack.ERROR_BAD_VALUE");
                }
            }
            else {
                Log.e("AmazonIVS", "AudioTrack.ERROR_INVALID_OPERATION");
            }
        }
        else {
            Log.e("AmazonIVS", "AudioTrack.ERROR_DEAD_OBJECT");
            this.flush();
        }
    }
    
    private static int createChannelConfig(final int n) {
        switch (n) {
            default: {
                return 1;
            }
            case 8: {
                return 6396;
            }
            case 7: {
                return 1276;
            }
            case 6: {
                return 252;
            }
            case 5: {
                return 220;
            }
            case 4: {
                return 204;
            }
            case 3: {
                return 28;
            }
            case 2: {
                return 12;
            }
            case 1: {
                return 4;
            }
        }
    }
    
    private void updatePlaybackRate() {
        final AudioTrack track = this.track;
        if (track != null && track.getState() == 1) {
            final StringBuilder r = a.r("Set playback rate ");
            r.append(this.playbackRate);
            Log.i("AmazonIVS", r.toString());
            this.track.setPlaybackParams(new PlaybackParams().setSpeed(this.playbackRate));
        }
    }
    
    private void updateTrackVolume() {
        if (this.track != null) {
            final StringBuilder r = a.r("Set audio track volume ");
            r.append(this.volume);
            Log.i("AmazonIVS", r.toString());
            this.checkResult(this.track.setVolume(this.volume));
        }
    }
    
    public void configure(final MediaFormat format) {
        this.format = format;
        final int integer = format.getInteger("sample-rate");
        final int integer2 = format.getInteger("channel-count");
        final AudioTrack track = this.track;
        if (track != null) {
            if (track.getSampleRate() == integer && this.track.getChannelCount() == integer2) {
                return;
            }
            this.flush();
            this.release();
        }
        final int channelConfig = createChannelConfig(integer2);
        if ((this.bufferSize = AudioTrack.getMinBufferSize(integer, channelConfig, 2)) == -2) {
            this.bufferSize = integer;
            final StringBuilder sb = new StringBuilder();
            sb.append("Error getting min buffer size using sample rate ");
            sb.append(integer);
            Log.w("AmazonIVS", sb.toString());
        }
        this.bufferSize *= (int)this.playbackRate * 2;
        this.frameSizeBytes = integer2 * 2;
        this.framesWritten = 0L;
        int audioSessionId = this.audioSessionId;
        if (audioSessionId <= 0) {
            audioSessionId = 0;
        }
        final AudioAttributes build = new AudioAttributes$Builder().setContentType(3).setUsage(1).build();
        final AudioFormat build2 = new AudioFormat$Builder().setEncoding(2).setSampleRate(integer).setChannelMask(channelConfig).build();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Creating audio track format: ");
        sb2.append(build2);
        Log.i("AmazonIVS", sb2.toString());
        final AudioTrack build3 = new AudioTrack$Builder().setAudioAttributes(build).setAudioFormat(build2).setBufferSizeInBytes(this.bufferSize).setTransferMode(1).setSessionId(audioSessionId).build();
        this.track = build3;
        this.audioSessionId = build3.getAudioSessionId();
        this.updateTrackVolume();
        this.updatePlaybackRate();
    }
    
    public void flush() {
        this.sampleTimeUs = 0L;
        this.framesWritten = 0L;
        this.bytesWritten = 0;
        this.playheadPrevPosition = 0L;
        final AudioTrack track = this.track;
        if (track != null) {
            track.stop();
            this.track.flush();
            final long n = this.track.getPlaybackHeadPosition();
            if (n > 0L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("audio position at flush ");
                sb.append(n);
                Log.w("AmazonIVS", sb.toString());
                this.release();
            }
        }
    }
    
    public int getAudioSessionId() {
        return this.audioSessionId;
    }
    
    public long getRenderedPresentationTime() {
        final long sampleTimeUs = this.sampleTimeUs;
        long n = 0L;
        if (sampleTimeUs != 0L) {
            final AudioTrack track = this.track;
            if (track != null) {
                if (track.getPlayState() == 3) {
                    final long playheadPrevPosition = 0xFFFFFFFFL & (long)this.track.getPlaybackHeadPosition();
                    final long playheadPrevPosition2 = this.playheadPrevPosition;
                    if (playheadPrevPosition2 > 0L && playheadPrevPosition < playheadPrevPosition2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("AudioTrack.getPlaybackHeadPosition ");
                        sb.append(playheadPrevPosition);
                        sb.append(" < previous ");
                        sb.append(this.playheadPrevPosition);
                        Log.w("AmazonIVS", sb.toString());
                        this.playheadBasePosition = this.playheadPrevPosition;
                    }
                    this.playheadPrevPosition = playheadPrevPosition;
                    final long n2 = this.sampleTimeUs - (long)((this.framesWritten - (playheadPrevPosition + this.playheadBasePosition)) / (double)this.track.getSampleRate() * 1000000.0);
                    if (n2 >= 0L) {
                        n = n2;
                    }
                    return n;
                }
            }
        }
        return -1L;
    }
    
    public void release() {
        final AudioTrack track = this.track;
        if (track != null) {
            try {
                track.release();
            }
            finally {
                this.track = null;
            }
        }
    }
    
    public void render(final ByteBuffer byteBuffer, int bytesWritten, final long sampleTimeUs) {
        final AudioTrack track = this.track;
        if (track != null) {
            if (bytesWritten != 0) {
                final int write = track.write(byteBuffer, bytesWritten, 0);
                this.framesWritten += bytesWritten / this.frameSizeBytes;
                bytesWritten += this.bytesWritten;
                this.bytesWritten = bytesWritten;
                this.sampleTimeUs = sampleTimeUs;
                if (this.started && bytesWritten >= this.bufferSize && this.track.getPlayState() != 3) {
                    this.track.play();
                }
                this.checkResult(write);
            }
        }
    }
    
    public void setPlaybackRate(final float playbackRate) {
        this.playbackRate = playbackRate;
        try {
            this.updatePlaybackRate();
        }
        catch (final IllegalArgumentException ex) {
            ex.printStackTrace();
            this.configure(this.format);
        }
    }
    
    public void setVolume(final float volume) {
        this.volume = volume;
        this.updateTrackVolume();
    }
    
    public void start() {
        this.started = true;
    }
    
    public void stop() {
        this.started = false;
        final AudioTrack track = this.track;
        if (track != null && track.getPlayState() == 3) {
            this.track.pause();
        }
    }
}
