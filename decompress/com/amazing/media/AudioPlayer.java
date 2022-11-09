// 
// Decompiled by Procyon v0.6.0
// 

package com.amazing.media;

import java.io.IOException;
import X.0II;
import com.bytedance.covode.number.Covode;
import android.media.MediaPlayer;

public class AudioPlayer
{
    public MediaPlayer LIZ;
    public String LIZIZ;
    
    static {
        Covode.recordClassIndex(2471);
    }
    
    public AudioPlayer(final String liziz) {
        this.LIZ = new MediaPlayer();
        this.LIZIZ = liziz;
    }
    
    public void destroy() {
        final MediaPlayer liz = this.LIZ;
        if (liz != null) {
            liz.stop();
            this.LIZ.release();
            this.LIZ = null;
        }
    }
    
    public boolean isPlaying() {
        return this.LIZ.isPlaying();
    }
    
    public void pause() {
        this.LIZ.pause();
    }
    
    public void play() {
        this.LIZ.reset();
        if (this.prepare()) {
            this.LIZ.start();
        }
    }
    
    public boolean prepare() {
        try {
            this.LIZ.setDataSource(this.LIZIZ);
            this.LIZ.setAudioStreamType(3);
            this.LIZ.prepare();
            return true;
        }
        catch (final IOException ex) {
            0II.LIZ(ex);
            return false;
        }
    }
    
    public void resume() {
        this.LIZ.start();
    }
    
    public void setLoop(final boolean looping) {
        this.LIZ.setLooping(looping);
    }
    
    public void stop() {
        this.LIZ.stop();
    }
}
