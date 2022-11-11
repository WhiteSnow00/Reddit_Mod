// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.os.Bundle;
import android.net.Uri;
import android.media.session.MediaSession$Callback;

public class MediaSessionCallback extends MediaSession$Callback
{
    private final Player player;
    
    public MediaSessionCallback(final Player player) {
        this.player = player;
    }
    
    public void onPause() {
        this.player.pause();
    }
    
    public void onPlay() {
        this.player.play();
    }
    
    public void onPlayFromUri(final Uri uri, final Bundle bundle) {
        this.player.load(uri);
        this.player.play();
    }
    
    public void onPrepareFromUri(final Uri uri, final Bundle bundle) {
        this.player.load(uri);
    }
    
    public void onSeekTo(final long n) {
        this.player.seekTo(n);
    }
    
    public void onSetPlaybackSpeed(final float playbackRate) {
        this.player.setPlaybackRate(playbackRate);
    }
    
    public void onStop() {
        this.player.pause();
    }
}
