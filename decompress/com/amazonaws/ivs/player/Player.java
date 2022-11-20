// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.view.Surface;
import android.net.Uri;
import java.util.Set;

public interface Player extends Releasable
{
    void addListener(final Player.Player$Listener p0);
    
    int getAudioSessionId();
    
    long getAverageBitrate();
    
    long getBandwidthEstimate();
    
    long getBufferedPosition();
    
    long getDuration();
    
    long getLiveLatency();
    
    float getPlaybackRate();
    
    long getPosition();
    
    Set<Quality> getQualities();
    
    Quality getQuality();
    
    String getSessionId();
    
    Player.Player$State getState();
    
    Statistics getStatistics();
    
    String getVersion();
    
    boolean isAutoQualityMode();
    
    boolean isLiveLowLatency();
    
    boolean isMuted();
    
    void load(final Uri p0);
    
    void load(final Uri p0, final String p1);
    
    void pause();
    
    void play();
    
    void release();
    
    void removeListener(final Player.Player$Listener p0);
    
    void seekTo(final long p0);
    
    void setAutoInitialBitrate(final int p0);
    
    void setAutoMaxBitrate(final int p0);
    
    void setAutoMaxQuality(final Quality p0);
    
    void setAutoMaxVideoSize(final int p0, final int p1);
    
    void setAutoQualityMode(final boolean p0);
    
    void setInitialBufferDuration(final long p0);
    
    void setLiveLowLatencyEnabled(final boolean p0);
    
    void setLogLevel(final Player.Player$LogLevel p0);
    
    void setLooping(final boolean p0);
    
    void setMuted(final boolean p0);
    
    void setPlaybackRate(final float p0);
    
    void setQuality(final Quality p0);
    
    void setQuality(final Quality p0, final boolean p1);
    
    void setRebufferToLive(final boolean p0);
    
    void setSurface(final Surface p0);
    
    void setVolume(final float p0);
}
