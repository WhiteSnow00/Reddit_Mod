// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.Iterator;
import android.view.Surface;
import com.amazonaws.ivs.experiments.ExperimentData;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import android.os.Looper;
import android.content.Context;
import android.util.Log;
import java.util.Set;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

public class MediaPlayer implements Player, VideoSizeListener
{
    private final AtomicBoolean closed;
    private final Handler handler;
    private final Set<Player.Listener> listeners;
    private Platform platform;
    private long player;
    private Statistics statistics;
    
    static {
        try {
            System.loadLibrary("playercore");
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            Log.e("AmazonIVS", "Failed to load playercore", (Throwable)unsatisfiedLinkError);
        }
        initialize();
    }
    
    public MediaPlayer(final Context context) {
        final Platform platform = new Platform(context, this);
        this.platform = platform;
        this.player = this.init(platform, context.getCacheDir().toString());
        this.handler = new Handler(Looper.getMainLooper());
        this.closed = new AtomicBoolean();
        this.listeners = new CopyOnWriteArraySet<Player.Listener>();
        this.statistics = new Statistics();
    }
    
    public static /* synthetic */ Set access$000(final MediaPlayer mediaPlayer) {
        return mediaPlayer.listeners;
    }
    
    private native long getAverageBitrate(final long p0);
    
    private native long getBandwidthEstimate(final long p0);
    
    private native long getBufferedPosition(final long p0);
    
    private native long getDuration(final long p0);
    
    private native Map<String, String> getExperiments(final long p0);
    
    private native long getLiveLatency(final long p0);
    
    private native String getPath(final long p0);
    
    private native float getPlaybackRate(final long p0);
    
    private native long getPosition(final long p0);
    
    private native String getProtocol(final long p0);
    
    private native HashSet<Quality> getQualities(final long p0);
    
    private native Quality getQuality(final long p0);
    
    private native String getSessionId(final long p0);
    
    private native int getState(final long p0);
    
    private native void getStatistics(final long p0, final Statistics p1);
    
    private native String getVersion(final long p0);
    
    private native long init(final Platform p0, final String p1);
    
    private static native void initialize();
    
    private native boolean isAutoQualityMode(final long p0);
    
    private native boolean isLiveLowLatency(final long p0);
    
    private native boolean isMuted(final long p0);
    
    private native void load(final long p0, final String p1, final String p2);
    
    private Player.State mapState(final int n) {
        if (n == 1) {
            return Player.State.READY;
        }
        if (n == 2) {
            return Player.State.BUFFERING;
        }
        if (n == 3) {
            return Player.State.PLAYING;
        }
        if (n != 4) {
            return Player.State.IDLE;
        }
        return Player.State.ENDED;
    }
    
    private native void pause(final long p0);
    
    private native void play(final long p0);
    
    private native void release(final long p0);
    
    private native void seekTo(final long p0, final long p1);
    
    private native void setAuthToken(final long p0, final String p1);
    
    private native void setAutoInitialBitrate(final long p0, final int p1);
    
    private native void setAutoMaxBitrate(final long p0, final int p1);
    
    private native void setAutoMaxQuality(final long p0, final Quality p1);
    
    private native void setAutoMaxVideoSize(final long p0, final int p1, final int p2);
    
    private native void setAutoQualityMode(final long p0, final boolean p1);
    
    private native void setClientId(final long p0, final String p1);
    
    private native void setConfiguration(final long p0, final String p1);
    
    private native void setDeviceId(final long p0, final String p1);
    
    private native void setExperiment(final long p0, final ExperimentData p1);
    
    private native void setInitialBufferDuration(final long p0, final long p1);
    
    private native void setLiveLowLatencyEnabled(final long p0, final boolean p1);
    
    private native void setLogLevel(final long p0, final String p1);
    
    private native void setLooping(final long p0, final boolean p1);
    
    private native void setMuted(final long p0, final boolean p1);
    
    private native void setPlaybackRate(final long p0, final float p1);
    
    private native void setQuality(final long p0, final String p1, final boolean p2);
    
    private native void setRebufferToLive(final long p0, final boolean p1);
    
    private native void setSurface(final long p0, final Surface p1);
    
    private native void setUserAgent(final long p0, final String p1);
    
    private native void setVolume(final long p0, final float p1);
    
    public void addListener(final Player.Listener listener) {
        this.listeners.add(listener);
    }
    
    public void finalize() throws Throwable {
        try {
            if (this.player != 0L) {
                Log.e("AmazonIVS", "Player not released, releasing from finalizer");
            }
            this.release();
        }
        finally {
            super.finalize();
        }
    }
    
    public int getAudioSessionId() {
        return this.platform.getAudioSessionId();
    }
    
    public long getAverageBitrate() {
        return this.getAverageBitrate(this.player);
    }
    
    public long getBandwidthEstimate() {
        return this.getBandwidthEstimate(this.player);
    }
    
    public long getBufferedPosition() {
        return this.getBufferedPosition(this.player);
    }
    
    public long getDuration() {
        return this.getDuration(this.player);
    }
    
    public Map<String, String> getExperiments() {
        return this.getExperiments(this.player);
    }
    
    public long getLiveLatency() {
        return this.getLiveLatency(this.player);
    }
    
    public String getPath() {
        return this.getPath(this.player);
    }
    
    public float getPlaybackRate() {
        return this.getPlaybackRate(this.player);
    }
    
    public long getPosition() {
        return this.getPosition(this.player);
    }
    
    public String getProtocol() {
        return this.getProtocol(this.player);
    }
    
    public Set<Quality> getQualities() {
        return this.getQualities(this.player);
    }
    
    public Quality getQuality() {
        return this.getQuality(this.player);
    }
    
    public String getSessionId() {
        return this.getSessionId(this.player);
    }
    
    public Player.State getState() {
        return this.mapState(this.getState(this.player));
    }
    
    public Statistics getStatistics() {
        this.getStatistics(this.player, this.statistics);
        return this.statistics;
    }
    
    public String getVersion() {
        return this.getVersion(this.player);
    }
    
    public void handleAnalyticsEvent(final String s, final String s2) {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onAnalyticsEvent(s, s2);
                }
            }
        });
    }
    
    public void handleCue(final Cue cue) {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onCue(cue);
                }
            }
        });
    }
    
    public void handleDurationChanged(final long n) {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onDurationChanged(n);
                }
            }
        });
    }
    
    public void handleError(final String s, final int n, final int n2, final String s2) {
        this.handler.post((Runnable)new Runnable() {
            public final /* synthetic */ PlayerException val$exception = MediaPlayer.this.platform.createException(s, n, n2, s2);
            
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onError(this.val$exception);
                }
            }
        });
    }
    
    public void handleMetadata(final String s, final ByteBuffer byteBuffer) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        allocate.put(byteBuffer);
        allocate.flip();
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onMetadata(s, allocate);
                }
            }
        });
    }
    
    public void handleNetworkUnavailable() {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onNetworkUnavailable();
                }
            }
        });
    }
    
    public void handleQualityChange(final Quality quality) {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onQualityChanged(quality);
                }
            }
        });
    }
    
    public void handleRebuffering() {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onRebuffering();
                }
            }
        });
    }
    
    public void handleSeekCompleted(final long n) {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onSeekCompleted(n);
                }
            }
        });
    }
    
    public void handleStateChange(final int n) {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Player.State access$100 = MediaPlayer.this.mapState(n);
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onStateChanged(access$100);
                }
            }
        });
    }
    
    public boolean isAutoQualityMode() {
        return this.isAutoQualityMode(this.player);
    }
    
    public boolean isLiveLowLatency() {
        return this.isLiveLowLatency(this.player);
    }
    
    public boolean isMuted() {
        return this.isMuted(this.player);
    }
    
    public void load(final Uri uri) {
        this.load(this.player, uri.toString(), "");
    }
    
    public void load(final Uri uri, final String s) {
        this.load(this.player, uri.toString(), s);
    }
    
    public void onSizeChange(final int n, final int n2) {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final Iterator iterator = MediaPlayer.access$000(MediaPlayer.this).iterator();
                while (iterator.hasNext()) {
                    ((Player.Listener)iterator.next()).onVideoSizeChanged(n, n2);
                }
            }
        });
    }
    
    public void pause() {
        this.pause(this.player);
    }
    
    public void play() {
        this.play(this.player);
    }
    
    public void release() {
        if (this.closed.compareAndSet(false, true)) {
            this.handler.removeCallbacksAndMessages((Object)null);
            this.release(this.player);
            this.player = 0L;
        }
    }
    
    public void removeListener(final Player.Listener listener) {
        this.listeners.remove(listener);
    }
    
    public void seekTo(final long n) {
        this.seekTo(this.player, n);
    }
    
    public void setAuthToken(final String s) {
        this.setAuthToken(this.player, s);
    }
    
    public void setAutoInitialBitrate(final int n) {
        this.setAutoInitialBitrate(this.player, n);
    }
    
    public void setAutoMaxBitrate(final int n) {
        this.setAutoMaxBitrate(this.player, n);
    }
    
    public void setAutoMaxQuality(final Quality quality) {
        this.setAutoMaxQuality(this.player, quality);
    }
    
    public void setAutoMaxVideoSize(final int n, final int n2) {
        this.setAutoMaxVideoSize(this.player, n, n2);
    }
    
    public void setAutoQualityMode(final boolean b) {
        this.setAutoQualityMode(this.player, b);
    }
    
    public void setClientId(final String s) {
        this.setClientId(this.player, s);
    }
    
    public void setConfiguration(final String s) {
        this.setConfiguration(this.player, s);
    }
    
    public void setDeviceId(final String s) {
        this.setDeviceId(this.player, s);
    }
    
    public void setExperiment(final ExperimentData experimentData) {
        this.setExperiment(this.player, experimentData);
    }
    
    public void setInitialBufferDuration(final long n) {
        this.setInitialBufferDuration(this.player, n);
    }
    
    public void setLiveLowLatencyEnabled(final boolean b) {
        this.setLiveLowLatencyEnabled(this.player, b);
    }
    
    public void setLogLevel(final Player.LogLevel logLevel) {
        this.setLogLevel(this.player, logLevel.toString().toLowerCase());
    }
    
    public void setLooping(final boolean b) {
        this.setLooping(this.player, b);
    }
    
    public void setMuted(final boolean b) {
        this.setMuted(this.player, b);
    }
    
    public void setPlaybackRate(final float n) {
        this.setPlaybackRate(this.player, n);
    }
    
    public void setQuality(final Quality quality) {
        this.setQuality(this.player, quality.getName(), false);
    }
    
    public void setQuality(final Quality quality, final boolean b) {
        this.setQuality(this.player, quality.getName(), b);
    }
    
    public void setRebufferToLive(final boolean b) {
        this.setRebufferToLive(this.player, b);
    }
    
    public void setSurface(final Surface surface) {
        this.setSurface(this.player, surface);
    }
    
    public void setUserAgent(final String s) {
        this.setUserAgent(this.player, s);
    }
    
    public void setVolume(final float n) {
        this.setVolume(this.player, n);
    }
}
