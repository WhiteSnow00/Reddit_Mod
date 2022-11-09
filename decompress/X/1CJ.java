// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import javax.microedition.khronos.egl.EGLConfig;
import android.opengl.Matrix;
import javax.microedition.khronos.opengles.GL10;
import java.util.Iterator;
import java.nio.Buffer;
import android.opengl.GLES20;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import android.view.MotionEvent;
import android.graphics.RectF;
import android.graphics.PointF;
import com.bef.effectsdk.view.BEFView;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Queue;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.view.ViewControllerInterface;
import com.bef.effectsdk.message.MessageCenter;
import android.opengl.GLSurfaceView$Renderer;

public class 1CJ extends 0Mt implements GLSurfaceView$Renderer, Listener, NativeMessageListener
{
    public String mAdBundlePath;
    public AssetResourceFinder mAssetResourceFinder;
    public long mAttachedEffect;
    public Queue<Runnable> mCacheMessages;
    public boolean mDestroyed;
    public long mHandle;
    public long mLastAttachedEffect;
    public long mLastTickInNanoSeconds;
    public HashSet<1CJ.MessageListener> mListeners;
    public float[] mMatrix;
    public boolean mMultipleTouchEnabled;
    public boolean mNativeInited;
    public 1CJ.Params mParams;
    public int mSourceTexture;
    public int[] mTouch_ids;
    public float[] mTouch_xs;
    public float[] mTouch_ys;
    
    static {
        Covode.recordClassIndex(2848);
    }
    
    public 1CJ(final Context context) {
        super(context);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        this.init(context);
    }
    
    public 1CJ(final Context context, final AttributeSet set) {
        super(context, set);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        this.init(context);
    }
    
    private void convertTouchesToNormalizedPos(final float[] array, final float[] array2, final int n) {
        final int width = this.getWidth();
        final int height = this.getHeight();
        for (int i = 0; i < n; ++i) {
            final float n2 = array[i];
            final float n3 = array2[i];
            final PointF pointF = new PointF(n2, n3);
            final float n4 = (float)width;
            final float n5 = (float)height;
            final RectF rectF = new RectF(0.0f, 0.0f, n4, n5);
            new PointF();
            PointF pointF2;
            if (this.mParams.mFitMode == 1CJ.FitMode.FILL_SCREEN) {
                pointF2 = this.fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float)this.mParams.mRenderWidth, (float)this.mParams.mRenderHeight), 1CJ.FitMode.NO_CLIP);
            }
            else if (this.mParams.mFitMode == 1CJ.FitMode.NO_CLIP) {
                pointF2 = this.fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float)this.mParams.mRenderWidth, (float)this.mParams.mRenderHeight), 1CJ.FitMode.FILL_SCREEN);
            }
            else {
                if (this.mParams.mFitMode == 1CJ.FitMode.FIT_WIDTH_BOTTOM) {
                    final float n6 = n4 * 1.0f / this.mParams.mRenderWidth * this.mParams.mRenderHeight;
                    array[i] = n2 * 1.0f / n4;
                    array2[i] = (n3 - (n5 - n6)) * 1.0f / n6;
                    continue;
                }
                pointF2 = this.fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float)this.mParams.mRenderWidth, (float)this.mParams.mRenderHeight), this.mParams.mFitMode);
            }
            array[i] = pointF2.x / this.mParams.mRenderWidth;
            array2[i] = pointF2.y / this.mParams.mRenderHeight;
        }
    }
    
    private void dealWithTouches(final MotionEvent motionEvent) {
        int pointerCount;
        if ((pointerCount = motionEvent.getPointerCount()) > 10) {
            pointerCount = 10;
        }
        final int n = 0;
        for (int i = 0; i < pointerCount; ++i) {
            this.mTouch_ids[i] = motionEvent.getPointerId(i);
            this.mTouch_xs[i] = motionEvent.getX(i);
            this.mTouch_ys[i] = motionEvent.getY(i);
        }
        this.convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, pointerCount);
        final int actionIndex = motionEvent.getActionIndex();
        if (this.mMultipleTouchEnabled || actionIndex == 0) {
            final int n2 = motionEvent.getAction() & 0xFF;
            Label_0275: {
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 == 2) {
                            final int[] array = new int[pointerCount];
                            final float[] array2 = new float[pointerCount];
                            final float[] array3 = new float[pointerCount];
                            for (int j = n; j < pointerCount; ++j) {
                                array[j] = this.mTouch_ids[j];
                                array2[j] = this.mTouch_xs[j];
                                array3[j] = this.mTouch_ys[j];
                            }
                            this.queueEvent((Runnable)new BEFView.BEFView$4(this, array, array2, array3, pointerCount));
                            return;
                        }
                        if (n2 == 5) {
                            break Label_0275;
                        }
                        if (n2 != 6) {
                            return;
                        }
                    }
                    this.queueEvent((Runnable)new BEFView.BEFView$5(this, new int[] { this.mTouch_ids[actionIndex] }, new float[] { this.mTouch_xs[actionIndex] }, new float[] { this.mTouch_ys[actionIndex] }, pointerCount));
                    return;
                }
            }
            this.queueEvent((Runnable)new BEFView.BEFView$3(this, new int[] { this.mTouch_ids[actionIndex] }, new float[] { this.mTouch_xs[actionIndex] }, new float[] { this.mTouch_ys[actionIndex] }, pointerCount));
        }
    }
    
    private PointF fitResolution(final PointF pointF, final RectF rectF, final RectF rectF2, 1CJ.FitMode fitMode) {
        PointF pointF2 = null;
        float left = 0.0f;
        float top = 0.0f;
        float width = 0.0f;
        float height = 0.0f;
        float n = 0.0f;
        float n2 = 0.0f;
        Label_0231: {
            Label_0171: {
                while (true) {
                    pointF2 = new PointF();
                    left = rectF2.left;
                    top = rectF2.top;
                    width = rectF2.width();
                    height = rectF2.height();
                    n = (pointF.x - rectF.left) / rectF.width();
                    n2 = (pointF.y - rectF.top) / rectF.height();
                    final int n3 = BEFView.BEFView$12.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[fitMode.ordinal()];
                    if (n3 == 1) {
                        break Label_0231;
                    }
                    if (n3 == 2) {
                        break Label_0171;
                    }
                    if (n3 != 3) {
                        if (n3 != 4) {
                            break;
                        }
                        if (width / rectF.width() > height / rectF.height()) {
                            fitMode = 1CJ.FitMode.FIT_HEIGHT;
                        }
                        else {
                            fitMode = 1CJ.FitMode.FIT_WIDTH;
                        }
                    }
                    else if (width / rectF.width() < height / rectF.height()) {
                        fitMode = 1CJ.FitMode.FIT_HEIGHT;
                    }
                    else {
                        fitMode = 1CJ.FitMode.FIT_WIDTH;
                    }
                }
                return pointF2;
            }
            final float n4 = height / rectF.height();
            pointF2.x = (float)(int)(left + (width - rectF.width() * n4) / 2.0f + n * n4 * rectF.width());
            pointF2.y = (float)(int)(top + n2 * height);
            return pointF2;
        }
        final float n5 = width / rectF.width();
        pointF2.x = (float)(int)(left + n * width);
        pointF2.y = (float)(int)(top + (height - rectF.height() * n5) / 2.0f + n2 * n5 * rectF.height());
        return pointF2;
    }
    
    private void init(final Context context) {
        this.setPreserveEGLContextOnPause(true);
        this.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        this.setRenderer((GLSurfaceView$Renderer)this);
        this.setRenderMode(1);
        this.mListeners = new HashSet<1CJ.MessageListener>();
        this.mCacheMessages = new LinkedList<Runnable>();
        (this.mAssetResourceFinder = new AssetResourceFinder(context.getAssets(), "")).createNativeResourceFinder(0L);
        this.mDestroyed = false;
    }
    
    public int addMessageListener(final 1CJ.MessageListener messageListener) {
        synchronized (this) {
            MethodCollector.i(8061);
            if (messageListener == null) {
                MethodCollector.o(8061);
                return -1;
            }
            this.mListeners.add(messageListener);
            MethodCollector.o(8061);
            return 0;
        }
    }
    
    public void attachEffect(final long mAttachedEffect) {
        synchronized (this) {
            MethodCollector.i(4879);
            this.mAttachedEffect = mAttachedEffect;
            MethodCollector.o(4879);
        }
    }
    
    public void destoryRender() {
        if (this.getNativeInited()) {
            this.setNativeInited(false);
            if (this.mParams.mResourceFinder != null) {
                this.mParams.mResourceFinder.release(this.mHandle);
            }
            final AssetResourceFinder mAssetResourceFinder = this.mAssetResourceFinder;
            if (mAssetResourceFinder != null) {
                mAssetResourceFinder.release(0L);
            }
            ViewControllerInterface.removeMessageListener(this.mHandle, (ViewControllerInterface.NativeMessageListener)this);
            ViewControllerInterface.destroy(this.mHandle);
            this.mHandle = 0L;
            ViewControllerInterface.deleteTexture(this.mSourceTexture);
            this.mSourceTexture = 0;
            MessageCenter.removeListener((MessageCenter.Listener)this);
            MessageCenter.destroy();
            this.mLastAttachedEffect = 0L;
        }
    }
    
    public boolean getNativeInited() {
        synchronized (this) {
            MethodCollector.i(6971);
            final boolean mNativeInited = this.mNativeInited;
            MethodCollector.o(6971);
            return mNativeInited;
        }
    }
    
    public void initRender() {
        this.setNativeInited(false);
        final long mHandle = this.mHandle;
        while (true) {
            if (mHandle == 0L) {
                break Label_0026;
            }
            try {
                ViewControllerInterface.destroy(mHandle);
                this.mHandle = 0L;
                final int mSourceTexture = this.mSourceTexture;
                if (mSourceTexture > 0) {
                    ViewControllerInterface.deleteTexture(mSourceTexture);
                }
                if (this.mHandle == 0L) {
                    final long[] array = new long[2];
                    ViewControllerInterface.createHandle(array, this.mParams.mSceneKey.ordinal());
                    this.mHandle = array[0];
                    if (this.mParams.mResourceFinder != null) {
                        ViewControllerInterface.setResourceFinder(this.mHandle, this.mParams.mResourceFinder.createNativeResourceFinder(this.mHandle), 0L);
                    }
                    else {
                        ViewControllerInterface.setResourceFinder(this.mHandle, 0L, 0L);
                    }
                    ViewControllerInterface.init(this.mHandle, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
                }
                ViewControllerInterface.addMessageListener(this.mHandle, (ViewControllerInterface.NativeMessageListener)this);
                MessageCenter.init();
                MessageCenter.addListener((MessageCenter.Listener)this);
                this.mLastTickInNanoSeconds = System.nanoTime();
                final int[] array2 = { 0 };
                final int[] array3 = { 0 };
                final int[] array4 = { 0 };
                GLES20.glGenTextures(1, array2, 0);
                GLES20.glBindTexture(3553, array2[0]);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glTexImage2D(3553, 0, 6408, this.mParams.mRenderWidth, this.mParams.mRenderHeight, 0, 6408, 5121, (Buffer)null);
                GLES20.glBindTexture(3553, 0);
                GLES20.glGetIntegerv(36006, array4, 0);
                GLES20.glGenFramebuffers(1, array3, 0);
                GLES20.glBindFramebuffer(36160, array3[0]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, array2[0], 0);
                GLES20.glViewport(0, 0, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBindFramebuffer(36160, array4[0]);
                GLES20.glDeleteFramebuffers(1, array3, 0);
                this.mSourceTexture = array2[0];
                final String mAdBundlePath = this.mAdBundlePath;
                if (mAdBundlePath != "") {
                    ViewControllerInterface.setStickerPath(this.mHandle, mAdBundlePath);
                }
                this.mLastAttachedEffect = 0L;
                this.setNativeInited(true);
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public int nativeOnMsgReceived(final long n, final long n2, final long n3, final String s) {
        synchronized (this) {
            MethodCollector.i(8074);
            final Iterator<1CJ.MessageListener> iterator = this.mListeners.iterator();
            while (iterator.hasNext()) {
                iterator.next().onMessageReceived(n, n2, n3, s);
            }
            MethodCollector.o(8074);
            return 0;
        }
    }
    
    @Override
    public void onDestroy() {
        if (this.mDestroyed) {
            return;
        }
        this.queueEvent((Runnable)new BEFView.BEFView$8(this));
        super.onDestroy();
        this.mDestroyed = true;
    }
    
    public void onDrawFrame(final GL10 gl10) {
        MethodCollector.i(6962);
        if (!this.getNativeInited()) {
            MethodCollector.o(6962);
            return;
        }
        final long mAttachedEffect = this.mAttachedEffect;
        if (mAttachedEffect != this.mLastAttachedEffect) {
            ViewControllerInterface.attachEffect(this.mHandle, mAttachedEffect);
            this.mLastAttachedEffect = this.mAttachedEffect;
        }
        final long nanoTime = System.nanoTime();
        final long mLastTickInNanoSeconds = this.mLastTickInNanoSeconds;
        final double n = 1.0 / this.mParams.mFPS * 1.0E9;
        final double n2 = (double)(nanoTime - mLastTickInNanoSeconds);
        while (true) {
            if (n2 >= n) {
                break Label_0108;
            }
            final long n3 = (long)((n - n2) * 1.0 / 1000000.0);
            try {
                Thread.sleep(n3);
                this.mLastTickInNanoSeconds = System.nanoTime();
                while (!this.mCacheMessages.isEmpty()) {
                    this.mCacheMessages.poll().run();
                }
                final double n4 = System.nanoTime() / 1.0E9;
                final int width = this.getWidth();
                final int height = this.getHeight();
                Matrix.setIdentityM(this.mMatrix, 0);
                final RectF rectF = new RectF(0.0f, 0.0f, (float)this.mParams.mRenderWidth, (float)this.mParams.mRenderHeight);
                final float n5 = (float)width;
                final RectF rectF2 = new RectF(0.0f, 0.0f, n5, (float)height);
                PointF fitResolution = this.fitResolution(new PointF(0.0f, 0.0f), rectF, rectF2, this.mParams.mFitMode);
                PointF fitResolution2 = this.fitResolution(new PointF((float)this.mParams.mRenderWidth, (float)this.mParams.mRenderHeight), rectF, rectF2, this.mParams.mFitMode);
                if (this.mParams.mFitMode == 1CJ.FitMode.FIT_WIDTH_BOTTOM) {
                    fitResolution = new PointF(0.0f, 0.0f);
                    fitResolution2 = new PointF(n5, (float)(this.mParams.mRenderHeight * width / this.mParams.mRenderWidth));
                }
                ViewControllerInterface.processFrame(this.mHandle, this.mSourceTexture, this.mParams.mRenderWidth, this.mParams.mRenderHeight, this.mMatrix, new float[] { fitResolution.x, fitResolution.y, fitResolution2.x - fitResolution.x, fitResolution2.y - fitResolution.y }, n4);
                MethodCollector.o(6962);
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void onExitContext() {
        this.destoryRender();
    }
    
    public void onMessageReceived(final int n, final int n2, final int n3, final String s) {
        this.postMessage(n, n2, n3, s);
    }
    
    @Override
    public void onPause() {
        if (this.mDestroyed) {
            return;
        }
        this.queueEvent((Runnable)new BEFView.BEFView$6(this));
        super.onPause();
    }
    
    @Override
    public void onResume() {
        if (this.mDestroyed) {
            return;
        }
        super.onResume();
        this.queueEvent((Runnable)new BEFView.BEFView$7(this));
    }
    
    public void onSurfaceChanged(final GL10 gl10, final int n, final int n2) {
    }
    
    public void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        this.initRender();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.getNativeInited() || this.mAdBundlePath == "" || this.mParams.mNeglectTouchEvent) {
            return false;
        }
        this.dealWithTouches(motionEvent);
        ((ViewGroup)this.getParent()).requestDisallowInterceptTouchEvent(true);
        return true;
    }
    
    public int postMessage(final long n, final long n2, final long n3, final String s) {
        synchronized (this) {
            MethodCollector.i(8071);
            this.queueEvent((Runnable)new BEFView.BEFView$2(this, n, n2, n3, s));
            MethodCollector.o(8071);
            return 0;
        }
    }
    
    public int removeMessageListener(final 1CJ.MessageListener messageListener) {
        synchronized (this) {
            MethodCollector.i(8065);
            if (messageListener == null) {
                MethodCollector.o(8065);
                return -1;
            }
            this.mListeners.remove(messageListener);
            MethodCollector.o(8065);
            return 0;
        }
    }
    
    public boolean setExternalTouchEvent(final MotionEvent motionEvent) {
        synchronized (this) {
            MethodCollector.i(2650);
            if (this.getNativeInited() && this.mAdBundlePath != "") {
                this.dealWithTouches(motionEvent);
                MethodCollector.o(2650);
                return true;
            }
            MethodCollector.o(2650);
            return false;
        }
    }
    
    public void setNativeInited(final boolean mNativeInited) {
        synchronized (this) {
            MethodCollector.i(6976);
            this.mNativeInited = mNativeInited;
            MethodCollector.o(6976);
        }
    }
    
    public void setParams(final 1CJ.Params mParams) {
        this.mParams = mParams;
    }
    
    public void setRenderCacheData(final String s, final String s2) {
        synchronized (this) {
            MethodCollector.i(2822);
            this.queueEvent((Runnable)new BEFView.BEFView$9(this, s, s2));
            MethodCollector.o(2822);
        }
    }
    
    public void setRenderCacheTexture(final String s, final String s2) {
        synchronized (this) {
            MethodCollector.i(3138);
            this.queueEvent((Runnable)new BEFView.BEFView$10(this, s, s2));
            MethodCollector.o(3138);
        }
    }
    
    public void setRenderCacheTextureWithBuffer(final String s, final byte[] array, final int n, final int n2) {
        synchronized (this) {
            MethodCollector.i(3531);
            this.queueEvent((Runnable)new BEFView.BEFView$11(this, s, array, n, n2));
            MethodCollector.o(3531);
        }
    }
    
    public void setStickerPath(final String s) {
        synchronized (this) {
            MethodCollector.i(7071);
            this.queueEvent((Runnable)new BEFView.BEFView$1(this, s));
            MethodCollector.o(7071);
        }
    }
}
