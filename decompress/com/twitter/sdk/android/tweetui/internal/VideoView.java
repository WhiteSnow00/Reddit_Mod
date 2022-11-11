// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.KeyEvent;
import android.util.Log;
import android.util.AttributeSet;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.view.SurfaceHolder$Callback;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnInfoListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.view.GestureDetector;
import android.view.SurfaceView;

public class VideoView extends SurfaceView implements VideoControlView$MediaPlayerControl
{
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private String TAG;
    private GestureDetector gestureDetector;
    private int mAudioSession;
    private MediaPlayer$OnBufferingUpdateListener mBufferingUpdateListener;
    private MediaPlayer$OnCompletionListener mCompletionListener;
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private MediaPlayer$OnErrorListener mErrorListener;
    private MediaPlayer$OnInfoListener mInfoListener;
    private boolean mLooping;
    private VideoControlView mMediaController;
    private MediaPlayer mMediaPlayer;
    private MediaPlayer$OnCompletionListener mOnCompletionListener;
    private MediaPlayer$OnErrorListener mOnErrorListener;
    private MediaPlayer$OnInfoListener mOnInfoListener;
    private MediaPlayer$OnPreparedListener mOnPreparedListener;
    public MediaPlayer$OnPreparedListener mPreparedListener;
    public SurfaceHolder$Callback mSHCallback;
    private int mSeekWhenPrepared;
    public MediaPlayer$OnVideoSizeChangedListener mSizeChangedListener;
    private int mSurfaceHeight;
    private SurfaceHolder mSurfaceHolder;
    private int mSurfaceWidth;
    private int mTargetState;
    private Uri mUri;
    private int mVideoHeight;
    private int mVideoWidth;
    
    public VideoView(final Context context) {
        super(context);
        this.TAG = "VideoView";
        this.mCurrentState = 0;
        this.mTargetState = 0;
        this.mSurfaceHolder = null;
        this.mMediaPlayer = null;
        this.mSizeChangedListener = (MediaPlayer$OnVideoSizeChangedListener)new VideoView$1(this);
        this.mPreparedListener = (MediaPlayer$OnPreparedListener)new VideoView$2(this);
        this.mCompletionListener = (MediaPlayer$OnCompletionListener)new VideoView$3(this);
        this.mInfoListener = (MediaPlayer$OnInfoListener)new VideoView$4(this);
        this.mErrorListener = (MediaPlayer$OnErrorListener)new VideoView$5(this);
        this.mBufferingUpdateListener = (MediaPlayer$OnBufferingUpdateListener)new VideoView$6(this);
        this.gestureDetector = new GestureDetector(((View)this).getContext(), (GestureDetector$OnGestureListener)new VideoView$7(this));
        this.mSHCallback = (SurfaceHolder$Callback)new VideoView$8(this);
        this.initVideoView();
    }
    
    public VideoView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VideoView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.TAG = "VideoView";
        this.mCurrentState = 0;
        this.mTargetState = 0;
        this.mSurfaceHolder = null;
        this.mMediaPlayer = null;
        this.mSizeChangedListener = (MediaPlayer$OnVideoSizeChangedListener)new VideoView$1(this);
        this.mPreparedListener = (MediaPlayer$OnPreparedListener)new VideoView$2(this);
        this.mCompletionListener = (MediaPlayer$OnCompletionListener)new VideoView$3(this);
        this.mInfoListener = (MediaPlayer$OnInfoListener)new VideoView$4(this);
        this.mErrorListener = (MediaPlayer$OnErrorListener)new VideoView$5(this);
        this.mBufferingUpdateListener = (MediaPlayer$OnBufferingUpdateListener)new VideoView$6(this);
        this.gestureDetector = new GestureDetector(((View)this).getContext(), (GestureDetector$OnGestureListener)new VideoView$7(this));
        this.mSHCallback = (SurfaceHolder$Callback)new VideoView$8(this);
        this.initVideoView();
    }
    
    private void attachMediaController() {
        if (this.mMediaPlayer != null) {
            final VideoControlView mMediaController = this.mMediaController;
            if (mMediaController != null) {
                mMediaController.setMediaPlayer((VideoControlView$MediaPlayerControl)this);
                ((View)this.mMediaController).setEnabled(this.isInPlaybackState());
            }
        }
    }
    
    private void initVideoView() {
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.getHolder().addCallback(this.mSHCallback);
        this.getHolder().setType(3);
        ((View)this).setFocusable(true);
        ((View)this).setFocusableInTouchMode(true);
        ((View)this).setClickable(true);
        ((View)this).requestFocus();
        this.mCurrentState = 0;
        this.mTargetState = 0;
    }
    
    private boolean isInPlaybackState() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        boolean b = true;
        if (mMediaPlayer != null) {
            final int mCurrentState = this.mCurrentState;
            if (mCurrentState != -1 && mCurrentState != 0 && mCurrentState != 1) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    private void openVideo() {
        if (this.mUri != null) {
            if (this.mSurfaceHolder != null) {
                this.release(false);
                try {
                    final MediaPlayer mMediaPlayer = new MediaPlayer();
                    this.mMediaPlayer = mMediaPlayer;
                    final int mAudioSession = this.mAudioSession;
                    if (mAudioSession != 0) {
                        mMediaPlayer.setAudioSessionId(mAudioSession);
                    }
                    else {
                        this.mAudioSession = mMediaPlayer.getAudioSessionId();
                    }
                    this.mMediaPlayer.setOnPreparedListener(this.mPreparedListener);
                    this.mMediaPlayer.setOnVideoSizeChangedListener(this.mSizeChangedListener);
                    this.mMediaPlayer.setOnCompletionListener(this.mCompletionListener);
                    this.mMediaPlayer.setOnErrorListener(this.mErrorListener);
                    this.mMediaPlayer.setOnInfoListener(this.mInfoListener);
                    this.mMediaPlayer.setOnBufferingUpdateListener(this.mBufferingUpdateListener);
                    this.mCurrentBufferPercentage = 0;
                    this.mMediaPlayer.setLooping(this.mLooping);
                    this.mMediaPlayer.setDataSource(((View)this).getContext(), this.mUri);
                    this.mMediaPlayer.setDisplay(this.mSurfaceHolder);
                    this.mMediaPlayer.setAudioStreamType(3);
                    this.mMediaPlayer.setScreenOnWhilePlaying(true);
                    this.mMediaPlayer.prepareAsync();
                    this.mCurrentState = 1;
                    this.attachMediaController();
                }
                catch (final Exception ex) {
                    final String tag = this.TAG;
                    final StringBuilder r = a.r("Unable to open content: ");
                    r.append(this.mUri);
                    Log.w(tag, r.toString(), (Throwable)ex);
                    this.mCurrentState = -1;
                    this.mTargetState = -1;
                    this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
                }
            }
        }
    }
    
    private void release(final boolean b) {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer != null) {
            mMediaPlayer.reset();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            if (b) {
                this.mTargetState = 0;
            }
        }
    }
    
    private void toggleMediaControlsVisiblity() {
        if (this.mMediaController.isShowing()) {
            this.mMediaController.hide();
        }
        else {
            this.mMediaController.show();
        }
    }
    
    public int getBufferPercentage() {
        if (this.mMediaPlayer != null) {
            return this.mCurrentBufferPercentage;
        }
        return 0;
    }
    
    public int getCurrentPosition() {
        if (this.isInPlaybackState()) {
            return this.mMediaPlayer.getCurrentPosition();
        }
        return 0;
    }
    
    public int getDuration() {
        if (this.isInPlaybackState()) {
            return this.mMediaPlayer.getDuration();
        }
        return -1;
    }
    
    public boolean isPlaying() {
        return this.isInPlaybackState() && this.mMediaPlayer.isPlaying();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final boolean b = n != 4 && n != 24 && n != 25 && n != 82 && n != 5 && n != 6;
        if (this.isInPlaybackState() && b && this.mMediaController != null) {
            if (n == 79 || n == 85) {
                if (this.mMediaPlayer.isPlaying()) {
                    this.pause();
                    this.mMediaController.show();
                }
                else {
                    this.start();
                    this.mMediaController.hide();
                }
                return true;
            }
            if (n == 126) {
                if (!this.mMediaPlayer.isPlaying()) {
                    this.start();
                    this.mMediaController.hide();
                }
                return true;
            }
            if (n == 86 || n == 127) {
                if (this.mMediaPlayer.isPlaying()) {
                    this.pause();
                    this.mMediaController.show();
                }
                return true;
            }
            this.toggleMediaControlsVisiblity();
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public void onMeasure(int mVideoWidth, int size) {
        final int defaultSize = View.getDefaultSize(this.mVideoWidth, mVideoWidth);
        final int defaultSize2 = View.getDefaultSize(this.mVideoHeight, size);
        int n = defaultSize;
        int n2 = defaultSize2;
        Label_0335: {
            if (this.mVideoWidth > 0) {
                n = defaultSize;
                n2 = defaultSize2;
                if (this.mVideoHeight > 0) {
                    final int mode = View$MeasureSpec.getMode(mVideoWidth);
                    final int size2 = View$MeasureSpec.getSize(mVideoWidth);
                    final int mode2 = View$MeasureSpec.getMode(size);
                    size = View$MeasureSpec.getSize(size);
                    Label_0246: {
                        Label_0235: {
                            Label_0177: {
                                if (mode == 1073741824 && mode2 == 1073741824) {
                                    mVideoWidth = this.mVideoWidth;
                                    final int mVideoHeight = this.mVideoHeight;
                                    if (mVideoWidth * size < size2 * mVideoHeight) {
                                        mVideoWidth = mVideoWidth * size / mVideoHeight;
                                        break Label_0246;
                                    }
                                    if (mVideoWidth * size <= size2 * mVideoHeight) {
                                        break Label_0235;
                                    }
                                    mVideoWidth = mVideoHeight * size2 / mVideoWidth;
                                }
                                else {
                                    if (mode != 1073741824) {
                                        int n4;
                                        if (mode2 == 1073741824) {
                                            final int n3 = n4 = this.mVideoWidth * size / this.mVideoHeight;
                                            mVideoWidth = size;
                                            if (mode == Integer.MIN_VALUE) {
                                                n4 = n3;
                                                mVideoWidth = size;
                                                if (n3 > size2) {
                                                    break Label_0235;
                                                }
                                            }
                                        }
                                        else {
                                            final int mVideoWidth2 = this.mVideoWidth;
                                            final int mVideoHeight2 = this.mVideoHeight;
                                            int n5;
                                            if (mode2 == Integer.MIN_VALUE && mVideoHeight2 > size) {
                                                n5 = size * mVideoWidth2 / mVideoHeight2;
                                            }
                                            else {
                                                n5 = mVideoWidth2;
                                                size = mVideoHeight2;
                                            }
                                            n4 = n5;
                                            mVideoWidth = size;
                                            if (mode == Integer.MIN_VALUE) {
                                                n4 = n5;
                                                mVideoWidth = size;
                                                if (n5 > size2) {
                                                    mVideoWidth = mVideoHeight2 * size2 / mVideoWidth2;
                                                    break Label_0177;
                                                }
                                            }
                                        }
                                        size = mVideoWidth;
                                        mVideoWidth = n4;
                                        break Label_0246;
                                    }
                                    mVideoWidth = this.mVideoHeight * size2 / this.mVideoWidth;
                                    if (mode2 == Integer.MIN_VALUE && mVideoWidth > size) {
                                        break Label_0235;
                                    }
                                }
                            }
                            n = size2;
                            n2 = mVideoWidth;
                            break Label_0335;
                        }
                        mVideoWidth = size2;
                    }
                    n = mVideoWidth;
                    n2 = size;
                }
            }
        }
        ((View)this).setMeasuredDimension(n, n2);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }
    
    public void pause() {
        if (this.isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            this.mMediaPlayer.pause();
            this.mCurrentState = 4;
        }
        this.mTargetState = 4;
    }
    
    public void seekTo(final int mSeekWhenPrepared) {
        if (this.isInPlaybackState()) {
            this.mMediaPlayer.seekTo(mSeekWhenPrepared);
            this.mSeekWhenPrepared = 0;
        }
        else {
            this.mSeekWhenPrepared = mSeekWhenPrepared;
        }
    }
    
    public void setMediaController(final VideoControlView mMediaController) {
        final VideoControlView mMediaController2 = this.mMediaController;
        if (mMediaController2 != null) {
            mMediaController2.hide();
        }
        this.mMediaController = mMediaController;
        this.attachMediaController();
    }
    
    public void setOnCompletionListener(final MediaPlayer$OnCompletionListener mOnCompletionListener) {
        this.mOnCompletionListener = mOnCompletionListener;
    }
    
    public void setOnErrorListener(final MediaPlayer$OnErrorListener mOnErrorListener) {
        this.mOnErrorListener = mOnErrorListener;
    }
    
    public void setOnInfoListener(final MediaPlayer$OnInfoListener mOnInfoListener) {
        this.mOnInfoListener = mOnInfoListener;
    }
    
    public void setOnPreparedListener(final MediaPlayer$OnPreparedListener mOnPreparedListener) {
        this.mOnPreparedListener = mOnPreparedListener;
    }
    
    public void setVideoURI(final Uri mUri, final boolean mLooping) {
        this.mUri = mUri;
        this.mLooping = mLooping;
        this.mSeekWhenPrepared = 0;
        this.openVideo();
        ((View)this).requestLayout();
        ((View)this).invalidate();
    }
    
    public void start() {
        if (this.isInPlaybackState()) {
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
        }
        this.mTargetState = 3;
    }
    
    public void stopPlayback() {
        final MediaPlayer mMediaPlayer = this.mMediaPlayer;
        if (mMediaPlayer != null) {
            mMediaPlayer.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            this.mTargetState = 0;
        }
    }
}
