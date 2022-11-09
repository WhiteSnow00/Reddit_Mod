// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.media.AudioAttributes$Builder;
import android.media.AudioFocusRequest$Builder;
import android.util.Log;
import a4.s;
import android.os.Build$VERSION;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioManager$OnAudioFocusChangeListener;

class AudioFocusHandler implements AudioManager$OnAudioFocusChangeListener
{
    private final AudioManager audioManager;
    private int defaultAudioStream;
    private boolean enabled;
    private int focusMode;
    private AudioFocusRequest focusRequest;
    
    public AudioFocusHandler(final Context context) {
        this.focusMode = -1;
        this.defaultAudioStream = 3;
        this.audioManager = (AudioManager)context.getSystemService("audio");
    }
    
    public void abandonFocus() {
        if (this.enabled) {
            if (Build$VERSION.SDK_INT >= 26) {
                final AudioFocusRequest focusRequest = this.focusRequest;
                if (focusRequest != null) {
                    s.f(this.audioManager, focusRequest);
                }
            }
            else {
                this.audioManager.abandonAudioFocus((AudioManager$OnAudioFocusChangeListener)this);
            }
        }
    }
    
    public int getVolumeControlStream() {
        if (Build$VERSION.SDK_INT >= 26) {
            final AudioFocusRequest focusRequest = this.focusRequest;
            if (focusRequest != null) {
                return focusRequest.getAudioAttributes().getVolumeControlStream();
            }
        }
        return this.defaultAudioStream;
    }
    
    public void onAudioFocusChange(final int focusMode) {
        this.focusMode = focusMode;
        if (focusMode == -1) {
            Log.i("AmazonIVS", "AUDIOFOCUS_LOSS pause");
        }
    }
    
    public void requestFocus() {
        if (this.enabled) {
            int n;
            if (Build$VERSION.SDK_INT >= 26) {
                final AudioFocusRequest$Builder audioFocusRequest$Builder = new AudioFocusRequest$Builder(2);
                audioFocusRequest$Builder.setAudioAttributes(new AudioAttributes$Builder().setContentType(3).setUsage(1).build());
                audioFocusRequest$Builder.setWillPauseWhenDucked(false);
                audioFocusRequest$Builder.setOnAudioFocusChangeListener((AudioManager$OnAudioFocusChangeListener)this);
                final AudioFocusRequest build = audioFocusRequest$Builder.build();
                this.focusRequest = build;
                n = this.audioManager.requestAudioFocus(build);
            }
            else {
                n = this.audioManager.requestAudioFocus((AudioManager$OnAudioFocusChangeListener)this, this.defaultAudioStream, 2);
            }
            if (n != 1) {
                if (n != 0) {
                    if (n == 2) {
                        Log.w("AmazonIVS", "requestAudioFocus AUDIOFOCUS_REQUEST_DELAYED");
                    }
                }
                else {
                    Log.w("AmazonIVS", "requestAudioFocus AUDIOFOCUS_REQUEST_FAILED");
                }
            }
        }
    }
    
    public void setEnabled(final boolean enabled) {
        if (!(this.enabled = enabled)) {
            this.abandonFocus();
        }
    }
}
