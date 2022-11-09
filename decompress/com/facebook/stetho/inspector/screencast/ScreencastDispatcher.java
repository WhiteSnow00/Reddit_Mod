// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.screencast;

import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import java.io.OutputStream;
import android.util.Base64OutputStream;
import android.graphics.Bitmap$CompressFormat;
import android.view.View;
import android.app.Activity;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Bitmap$Config;
import com.facebook.stetho.common.LogUtil;
import android.os.Looper;
import android.graphics.RectF;
import java.io.ByteArrayOutputStream;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import android.os.HandlerThread;
import com.facebook.stetho.inspector.protocol.module.Page;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.os.Handler;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;

public final class ScreencastDispatcher
{
    private static final long FRAME_DELAY = 200L;
    private final ActivityTracker mActivityTracker;
    private Handler mBackgroundHandler;
    private Bitmap mBitmap;
    private final BitmapFetchRunnable mBitmapFetchRunnable;
    private Canvas mCanvas;
    private Page.ScreencastFrameEvent mEvent;
    private final EventDispatchRunnable mEventDispatchRunnable;
    private HandlerThread mHandlerThread;
    private boolean mIsRunning;
    private final Handler mMainHandler;
    private Page.ScreencastFrameEventMetadata mMetadata;
    private JsonRpcPeer mPeer;
    private Page.StartScreencastRequest mRequest;
    private ByteArrayOutputStream mStream;
    private final RectF mTempDst;
    private final RectF mTempSrc;
    
    public ScreencastDispatcher() {
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mBitmapFetchRunnable = new BitmapFetchRunnable(null);
        this.mActivityTracker = ActivityTracker.get();
        this.mEventDispatchRunnable = new EventDispatchRunnable(null);
        this.mTempSrc = new RectF();
        this.mTempDst = new RectF();
        this.mEvent = new Page.ScreencastFrameEvent();
        this.mMetadata = new Page.ScreencastFrameEventMetadata();
    }
    
    public static /* synthetic */ Canvas access$1000(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mCanvas;
    }
    
    public static /* synthetic */ Canvas access$1002(final ScreencastDispatcher screencastDispatcher, final Canvas mCanvas) {
        return screencastDispatcher.mCanvas = mCanvas;
    }
    
    public static /* synthetic */ RectF access$1100(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mTempSrc;
    }
    
    public static /* synthetic */ RectF access$1200(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mTempDst;
    }
    
    public static /* synthetic */ ByteArrayOutputStream access$1300(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mStream;
    }
    
    public static /* synthetic */ ByteArrayOutputStream access$1302(final ScreencastDispatcher screencastDispatcher, final ByteArrayOutputStream mStream) {
        return screencastDispatcher.mStream = mStream;
    }
    
    public static /* synthetic */ Page.ScreencastFrameEvent access$1400(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mEvent;
    }
    
    public static /* synthetic */ Page.ScreencastFrameEventMetadata access$1500(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mMetadata;
    }
    
    public static /* synthetic */ JsonRpcPeer access$1600(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mPeer;
    }
    
    public static /* synthetic */ Handler access$1700(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mMainHandler;
    }
    
    public static /* synthetic */ HandlerThread access$1800(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mHandlerThread;
    }
    
    public static /* synthetic */ HandlerThread access$1802(final ScreencastDispatcher screencastDispatcher, final HandlerThread mHandlerThread) {
        return screencastDispatcher.mHandlerThread = mHandlerThread;
    }
    
    public static /* synthetic */ BitmapFetchRunnable access$1900(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mBitmapFetchRunnable;
    }
    
    public static /* synthetic */ EventDispatchRunnable access$300(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mEventDispatchRunnable;
    }
    
    public static /* synthetic */ Handler access$500(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mBackgroundHandler;
    }
    
    public static /* synthetic */ boolean access$600(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mIsRunning;
    }
    
    public static /* synthetic */ boolean access$602(final ScreencastDispatcher screencastDispatcher, final boolean mIsRunning) {
        return screencastDispatcher.mIsRunning = mIsRunning;
    }
    
    public static /* synthetic */ ActivityTracker access$700(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mActivityTracker;
    }
    
    public static /* synthetic */ Bitmap access$800(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mBitmap;
    }
    
    public static /* synthetic */ Bitmap access$802(final ScreencastDispatcher screencastDispatcher, final Bitmap mBitmap) {
        return screencastDispatcher.mBitmap = mBitmap;
    }
    
    public static /* synthetic */ Page.StartScreencastRequest access$900(final ScreencastDispatcher screencastDispatcher) {
        return screencastDispatcher.mRequest;
    }
    
    public void startScreencast(final JsonRpcPeer mPeer, final Page.StartScreencastRequest mRequest) {
        LogUtil.d("Starting screencast");
        this.mRequest = mRequest;
        ((Thread)(this.mHandlerThread = new HandlerThread("Screencast Thread"))).start();
        this.mPeer = mPeer;
        this.mIsRunning = true;
        this.mStream = new ByteArrayOutputStream();
        this.mBackgroundHandler = new Handler(this.mHandlerThread.getLooper());
        this.mMainHandler.postDelayed((Runnable)this.mBitmapFetchRunnable, 200L);
    }
    
    public void stopScreencast() {
        LogUtil.d("Stopping screencast");
        this.mBackgroundHandler.post((Runnable)new CancellationRunnable(null));
    }
    
    public class BitmapFetchRunnable implements Runnable
    {
        private BitmapFetchRunnable() {
        }
        
        private void updateScreenBitmap() {
            if (!ScreencastDispatcher.access$600(ScreencastDispatcher.this)) {
                return;
            }
            final Activity tryGetTopActivity = ScreencastDispatcher.access$700(ScreencastDispatcher.this).tryGetTopActivity();
            if (tryGetTopActivity == null) {
                return;
            }
            final View decorView = tryGetTopActivity.getWindow().getDecorView();
            try {
                if (ScreencastDispatcher.access$800(ScreencastDispatcher.this) == null) {
                    final int width = decorView.getWidth();
                    final int height = decorView.getHeight();
                    final float n = (float)ScreencastDispatcher.access$900(ScreencastDispatcher.this).maxWidth;
                    final float n2 = (float)width;
                    final float n3 = n / n2;
                    final float n4 = (float)ScreencastDispatcher.access$900(ScreencastDispatcher.this).maxHeight;
                    final float n5 = (float)height;
                    final float min = Math.min(n3, n4 / n5);
                    final int n6 = (int)(n2 * min);
                    final int n7 = (int)(min * n5);
                    ScreencastDispatcher.access$802(ScreencastDispatcher.this, Bitmap.createBitmap(n6, n7, Bitmap$Config.RGB_565));
                    ScreencastDispatcher.access$1002(ScreencastDispatcher.this, new Canvas(ScreencastDispatcher.access$800(ScreencastDispatcher.this)));
                    final Matrix matrix = new Matrix();
                    ScreencastDispatcher.access$1100(ScreencastDispatcher.this).set(0.0f, 0.0f, n2, n5);
                    ScreencastDispatcher.access$1200(ScreencastDispatcher.this).set(0.0f, 0.0f, (float)n6, (float)n7);
                    matrix.setRectToRect(ScreencastDispatcher.access$1100(ScreencastDispatcher.this), ScreencastDispatcher.access$1200(ScreencastDispatcher.this), Matrix$ScaleToFit.CENTER);
                    ScreencastDispatcher.access$1000(ScreencastDispatcher.this).setMatrix(matrix);
                }
                decorView.draw(ScreencastDispatcher.access$1000(ScreencastDispatcher.this));
            }
            catch (final OutOfMemoryError outOfMemoryError) {
                LogUtil.w("Out of memory trying to allocate screencast Bitmap.");
            }
        }
        
        @Override
        public void run() {
            this.updateScreenBitmap();
            ScreencastDispatcher.access$500(ScreencastDispatcher.this).post((Runnable)ScreencastDispatcher.access$300(ScreencastDispatcher.this).withEndAction(this));
        }
    }
    
    public class CancellationRunnable implements Runnable
    {
        private CancellationRunnable() {
        }
        
        @Override
        public void run() {
            ((Thread)ScreencastDispatcher.access$1800(ScreencastDispatcher.this)).interrupt();
            ScreencastDispatcher.access$1700(ScreencastDispatcher.this).removeCallbacks((Runnable)ScreencastDispatcher.access$1900(ScreencastDispatcher.this));
            ScreencastDispatcher.access$500(ScreencastDispatcher.this).removeCallbacks((Runnable)ScreencastDispatcher.access$300(ScreencastDispatcher.this));
            ScreencastDispatcher.access$602(ScreencastDispatcher.this, false);
            ScreencastDispatcher.access$1802(ScreencastDispatcher.this, null);
            ScreencastDispatcher.access$802(ScreencastDispatcher.this, null);
            ScreencastDispatcher.access$1002(ScreencastDispatcher.this, null);
            ScreencastDispatcher.access$1302(ScreencastDispatcher.this, null);
        }
    }
    
    public class EventDispatchRunnable implements Runnable
    {
        private Runnable mEndAction;
        
        private EventDispatchRunnable() {
        }
        
        private EventDispatchRunnable withEndAction(final Runnable mEndAction) {
            this.mEndAction = mEndAction;
            return this;
        }
        
        @Override
        public void run() {
            if (ScreencastDispatcher.access$600(ScreencastDispatcher.this)) {
                if (ScreencastDispatcher.access$800(ScreencastDispatcher.this) != null) {
                    final int width = ScreencastDispatcher.access$800(ScreencastDispatcher.this).getWidth();
                    final int height = ScreencastDispatcher.access$800(ScreencastDispatcher.this).getHeight();
                    ScreencastDispatcher.access$1300(ScreencastDispatcher.this).reset();
                    ScreencastDispatcher.access$800(ScreencastDispatcher.this).compress(Bitmap$CompressFormat.valueOf(ScreencastDispatcher.access$900(ScreencastDispatcher.this).format.toUpperCase()), ScreencastDispatcher.access$900(ScreencastDispatcher.this).quality, (OutputStream)new Base64OutputStream((OutputStream)ScreencastDispatcher.access$1300(ScreencastDispatcher.this), 0));
                    ScreencastDispatcher.access$1400(ScreencastDispatcher.this).data = ScreencastDispatcher.access$1300(ScreencastDispatcher.this).toString();
                    ScreencastDispatcher.access$1500(ScreencastDispatcher.this).pageScaleFactor = 1;
                    ScreencastDispatcher.access$1500(ScreencastDispatcher.this).deviceWidth = width;
                    ScreencastDispatcher.access$1500(ScreencastDispatcher.this).deviceHeight = height;
                    ScreencastDispatcher.access$1400(ScreencastDispatcher.this).metadata = ScreencastDispatcher.access$1500(ScreencastDispatcher.this);
                    ScreencastDispatcher.access$1600(ScreencastDispatcher.this).invokeMethod("Page.screencastFrame", ScreencastDispatcher.access$1400(ScreencastDispatcher.this), null);
                    ScreencastDispatcher.access$1700(ScreencastDispatcher.this).postDelayed(this.mEndAction, 200L);
                }
            }
        }
    }
}
