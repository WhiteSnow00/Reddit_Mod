// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import X.0II;
import android.media.MediaPlayer$OnErrorListener;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.media.MediaPlayer$OnInfoListener;
import com.bytedance.covode.number.Covode;
import android.media.MediaPlayer;

public class AudioPlayer
{
    public static final String TAG;
    public String mFilename;
    public boolean mIsPrepared;
    public MediaPlayer mMediaPlayer;
    public long mNativePtr;
    
    static {
        Covode.recordClassIndex(2766);
        TAG = AudioPlayer.class.getSimpleName();
    }
    
    public float getCurrentPlayTime() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return 0.0f;
        }
        return mMediaPlayer.getCurrentPosition() / 1000.0f;
    }
    
    public float getTotalPlayTime() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return 0.0f;
        }
        return mMediaPlayer.getDuration() / 1000.0f;
    }
    
    public int init() {
        this.mIsPrepared = false;
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer != null) {
            mMediaPlayer.stop();
            this.mMediaPlayer.release();
        }
        (this.mMediaPlayer = new MediaPlayer()).setOnInfoListener((MediaPlayer$OnInfoListener)new MediaPlayer$OnInfoListener() {
            static {
                Covode.recordClassIndex(2767);
            }
            
            public boolean onInfo(final MediaPlayer mediaPlayer, final int n, final int n2) {
                MethodCollector.i(3918);
                final AudioPlayer this$0 = AudioPlayer.this;
                this$0.nativeOnInfo(this$0.mNativePtr, n, n2);
                MethodCollector.o(3918);
                return false;
            }
        });
        this.mMediaPlayer.setOnErrorListener((MediaPlayer$OnErrorListener)new MediaPlayer$OnErrorListener() {
            static {
                Covode.recordClassIndex(2768);
            }
            
            public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
                MethodCollector.i(4766);
                try {
                    AudioPlayer.this.mMediaPlayer.stop();
                    AudioPlayer.this.mMediaPlayer.release();
                }
                catch (final Exception ex) {
                    0II.LIZ(ex);
                }
                AudioPlayer.this.mMediaPlayer = null;
                final AudioPlayer this$0 = AudioPlayer.this;
                this$0.nativeOnError(this$0.mNativePtr, n, n2);
                MethodCollector.o(4766);
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener((MediaPlayer$OnPreparedListener)new MediaPlayer$OnPreparedListener() {
            static {
                Covode.recordClassIndex(2769);
            }
            
            public void onPrepared(final MediaPlayer mediaPlayer) {
                MethodCollector.i(3254);
                AudioPlayer.this.mIsPrepared = true;
                final AudioPlayer this$0 = AudioPlayer.this;
                this$0.nativeOnPrepared(this$0.mNativePtr);
                MethodCollector.o(3254);
            }
        });
        this.mMediaPlayer.setOnCompletionListener((MediaPlayer$OnCompletionListener)new MediaPlayer$OnCompletionListener() {
            static {
                Covode.recordClassIndex(2770);
            }
            
            public void onCompletion(final MediaPlayer mediaPlayer) {
                MethodCollector.i(4709);
                final AudioPlayer this$0 = AudioPlayer.this;
                this$0.nativeOnCompletion(this$0.mNativePtr);
                MethodCollector.o(4709);
            }
        });
        return 0;
    }
    
    public boolean isPlaying() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        final boolean b = false;
        if (mMediaPlayer == null) {
            return false;
        }
        if (!this.mIsPrepared) {
            return false;
        }
        boolean playing;
        try {
            playing = mMediaPlayer.isPlaying();
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
            playing = b;
        }
        return playing;
    }
    
    public native void nativeOnCompletion(final long p0);
    
    public native void nativeOnError(final long p0, final int p1, final int p2);
    
    public native void nativeOnInfo(final long p0, final int p1, final int p2);
    
    public native void nativeOnPrepared(final long p0);
    
    public boolean pause() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return false;
        }
        if (!this.mIsPrepared) {
            return false;
        }
        mMediaPlayer.pause();
        return true;
    }
    
    public int release() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer != null) {
            try {
                mMediaPlayer.stop();
                this.mMediaPlayer.release();
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
            }
            this.mMediaPlayer = null;
        }
        return 0;
    }
    
    public boolean resume() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return false;
        }
        if (!this.mIsPrepared) {
            return false;
        }
        mMediaPlayer.start();
        return true;
    }
    
    public boolean seek(final int n) {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return false;
        }
        if (!this.mIsPrepared) {
            return false;
        }
        try {
            mMediaPlayer.seekTo(n);
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
        return true;
    }
    
    public void setDataSource(final String s) {
        if (this.mMediaPlayer == null) {
            this.init();
        }
        if (s.equals(this.mFilename) && this.mIsPrepared && this.mMediaPlayer.isPlaying()) {
            return;
        }
        try {
            this.mMediaPlayer.reset();
            this.mMediaPlayer.setDataSource(s);
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
        this.mFilename = s;
    }
    
    public boolean setLoop(final boolean looping) {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return false;
        }
        mMediaPlayer.setLooping(looping);
        return true;
    }
    
    public void setNativePtr(final long mNativePtr) {
        this.mNativePtr = mNativePtr;
    }
    
    public boolean setVolume(final float n) {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return false;
        }
        if (!this.mIsPrepared) {
            return false;
        }
        mMediaPlayer.setVolume(n, n);
        return true;
    }
    
    public void startPlay() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return;
        }
        try {
            if (!this.mIsPrepared) {
                mMediaPlayer.prepare();
                this.mIsPrepared = true;
            }
            this.mMediaPlayer.start();
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
    }
    
    public void stopPlay() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer == null) {
            return;
        }
        if (this.mIsPrepared) {
            try {
                mMediaPlayer.stop();
                this.mMediaPlayer.release();
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
            }
            this.mMediaPlayer = null;
            this.mIsPrepared = false;
        }
    }
}
