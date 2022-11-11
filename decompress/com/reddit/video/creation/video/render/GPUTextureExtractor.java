// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import android.graphics.PointF;
import com.reddit.video.creation.video.utils.OpenGlUtils;
import java.util.Iterator;
import android.opengl.Matrix;
import java.nio.Buffer;
import android.util.Log;
import android.opengl.GLES20;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Collection;
import android.graphics.Bitmap$Config;
import com.reddit.video.creation.video.FragmentShaderSource;
import java.nio.FloatBuffer;
import com.reddit.video.creation.video.render.models.TextStickerData;
import java.util.ArrayList;
import java.util.LinkedList;
import android.graphics.Bitmap;
import com.reddit.video.creation.video.render.models.TextStickerTextureData;
import java.util.List;
import com.reddit.video.creation.models.video.VideoFilter;

public class GPUTextureExtractor
{
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
    private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
    private final VideoFilter filter;
    private final String mFragmentShader;
    private int mGLAttribPosition;
    private int mGLAttribTextureCoord;
    private int mGLHashTagTextureId;
    private int mGLOverlayTextureId;
    private int mGLProgId;
    private List<TextStickerTextureData> mGLStickerTextureIds;
    private int mGLUniformHashTagTexture;
    private int mGLUniformMVPMatrix;
    private int mGLUniformMirrorFactor;
    private int mGLUniformMirrorOffset;
    private int mGLUniformOverlayMirrorFactor;
    private int mGLUniformOverlayMirrorOffset;
    private int mGLUniformOverlaySTMatrix;
    private int mGLUniformOverlayTexture;
    private int mGLUniformRotation;
    private int mGLUniformSTMatrix;
    private int mGLUniformTexture;
    private int mGLUniformWatermarkTexture;
    private int mGLUniformXOffset;
    private int mGLUniformXScale;
    private int mGLUniformYOffset;
    private int mGLUniformYScale;
    private int mGLWatermarkTextureId;
    private final Bitmap mHashTagBitmap;
    private boolean mIsInitialized;
    private float mMirrorFactor;
    private float mMirrorOffset;
    private float mOutputHeight;
    private float mOutputWidth;
    private final Bitmap mOverlayBitmap;
    private float mOverlayMirrorFactor;
    private float mOverlayMirrorOffset;
    private final float mPercentageTopOffset;
    private final float[] mRotationMatrix;
    private final LinkedList<Runnable> mRunOnDraw;
    private final ArrayList<TextStickerData> mStickerBitmaps;
    private final FloatBuffer mTriangleVertices;
    private final float[] mTriangleVerticesData;
    private final String mVertexShader;
    private final Bitmap mWatermarkBitmap;
    private float mXOffset;
    private float mXScale;
    private float mYOffset;
    private float mYScale;
    
    public GPUTextureExtractor(Bitmap bitmap, final List<TextStickerData> list, final VideoFilter filter, final float mPercentageTopOffset) {
        final float[] array;
        final float[] mTriangleVerticesData = array = new float[20];
        array[1] = (array[0] = -1.0f);
        array[2] = 0.0f;
        array[4] = (array[3] = 0.0f);
        array[5] = 1.0f;
        array[6] = -1.0f;
        array[7] = 0.0f;
        array[8] = 1.0f;
        array[9] = 0.0f;
        array[10] = -1.0f;
        array[11] = 1.0f;
        array[13] = (array[12] = 0.0f);
        array[14] = 1.0f;
        array[16] = (array[15] = 1.0f);
        array[17] = 0.0f;
        array[19] = (array[18] = 1.0f);
        this.mTriangleVerticesData = mTriangleVerticesData;
        this.mRotationMatrix = new float[16];
        this.mMirrorFactor = -1.0f;
        this.mMirrorOffset = 0.0f;
        this.mOverlayMirrorFactor = -1.0f;
        this.mOverlayMirrorOffset = 0.0f;
        this.filter = filter;
        this.mRunOnDraw = new LinkedList<Runnable>();
        this.mVertexShader = VertexShaderSource.createSource(filter.getProcessVertexShaderFunctionSource());
        this.mFragmentShader = FragmentShaderSource.generateFragmentShaderSource(filter, list.size());
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
            (this.mWatermarkBitmap = bitmap).eraseColor(0);
        }
        else {
            this.mWatermarkBitmap = bitmap;
        }
        if (list.isEmpty()) {
            final ArrayList<TextStickerData> mStickerBitmaps = new ArrayList<TextStickerData>(list);
            this.mStickerBitmaps = mStickerBitmaps;
            final Bitmap bitmap2 = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
            bitmap2.eraseColor(0);
            mStickerBitmaps.add(new TextStickerData(bitmap2, 0L, Long.MAX_VALUE));
        }
        else {
            this.mStickerBitmaps = new ArrayList<TextStickerData>(list);
        }
        bitmap = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
        (this.mOverlayBitmap = bitmap).eraseColor(0);
        bitmap = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
        (this.mHashTagBitmap = bitmap).eraseColor(0);
        final FloatBuffer floatBuffer = ByteBuffer.allocateDirect(mTriangleVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTriangleVertices = floatBuffer;
        floatBuffer.put(mTriangleVerticesData).position(0);
        this.mPercentageTopOffset = mPercentageTopOffset;
    }
    
    private void checkGlError(final String s) {
        while (true) {
            final int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            final String simpleName = this.getClass().getSimpleName();
            final StringBuilder q = d.q(s, ": EGL error: 0x");
            q.append(Integer.toHexString(glGetError));
            Log.e(simpleName, q.toString());
        }
    }
    
    private void drawFrame(final int n, final float[] array, final float[] array2, final float[] array3, final FloatBuffer floatBuffer, final long n2) {
        GLES20.glUseProgram(this.mGLProgId);
        this.runPendingOnDrawTasks();
        this.filter.onDraw(this.getProgram());
        if (!this.mIsInitialized) {
            return;
        }
        if (n != -1) {
            GLES20.glActiveTexture(33984);
            this.checkGlError("glActiveTexture");
            GLES20.glBindTexture(36197, n);
            this.checkGlError("glBindTexture start");
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.mGLAttribPosition, 3, 5126, false, 20, (Buffer)floatBuffer);
        GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
        this.checkGlError("glEnableVertexAttribArray");
        floatBuffer.position(3);
        GLES20.glVertexAttribPointer(this.mGLAttribTextureCoord, 2, 5126, false, 20, (Buffer)floatBuffer);
        GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord);
        this.checkGlError("glEnableVertexAttribArray");
        GLES20.glUniform1f(this.mGLUniformXScale, this.mXScale);
        GLES20.glUniform1f(this.mGLUniformYScale, this.mYScale);
        GLES20.glUniform1f(this.mGLUniformXOffset, this.mXOffset);
        GLES20.glUniform1f(this.mGLUniformYOffset, this.mYOffset);
        GLES20.glUniform1f(this.mGLUniformMirrorFactor, this.mMirrorFactor);
        GLES20.glUniform1f(this.mGLUniformMirrorOffset, this.mMirrorOffset);
        GLES20.glUniform1f(this.mGLUniformOverlayMirrorFactor, this.mOverlayMirrorFactor);
        GLES20.glUniform1f(this.mGLUniformOverlayMirrorOffset, this.mOverlayMirrorOffset);
        GLES20.glUniformMatrix4fv(this.mGLUniformRotation, 1, false, this.mRotationMatrix, 0);
        this.checkGlError("glUniform dimension parameter");
        this.onDrawArraysPre(n2);
        this.checkGlError("onDrawArraysPre");
        Matrix.setIdentityM(array, 0);
        GLES20.glUniformMatrix4fv(this.mGLUniformMVPMatrix, 1, false, array, 0);
        GLES20.glUniformMatrix4fv(this.mGLUniformSTMatrix, 1, false, array2, 0);
        GLES20.glUniformMatrix4fv(this.mGLUniformOverlaySTMatrix, 1, false, array3, 0);
        this.checkGlError("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        this.checkGlError("glDrawArrays");
        GLES20.glBindTexture(36197, 0);
        this.checkGlError("glBindTexture end");
    }
    
    private void onDrawArraysPre(final long n) {
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.mGLOverlayTextureId);
        GLES20.glUniform1i(this.mGLUniformOverlayTexture, 1);
        this.checkGlError("Bind overlay");
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.mGLWatermarkTextureId);
        GLES20.glUniform1i(this.mGLUniformWatermarkTexture, 2);
        this.checkGlError("Bind watermark");
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.mGLHashTagTextureId);
        GLES20.glUniform1i(this.mGLUniformHashTagTexture, 3);
        this.checkGlError("Bind hashTag");
        for (final TextStickerTextureData textStickerTextureData : this.mGLStickerTextureIds) {
            final boolean b = textStickerTextureData.getStartTime() <= n && n <= textStickerTextureData.getEndTime();
            GLES20.glActiveTexture(textStickerTextureData.getActiveTextureIndex());
            int n2;
            if (b) {
                n2 = textStickerTextureData.getTextureId();
            }
            else {
                n2 = this.mGLHashTagTextureId;
            }
            GLES20.glBindTexture(3553, n2);
            GLES20.glUniform1i(textStickerTextureData.getTextureTagId(), textStickerTextureData.getTextureTagIndex());
            this.checkGlError("Bind text sticker");
        }
    }
    
    private void onInit() {
        final int loadProgram = OpenGlUtils.loadProgram(this.mVertexShader, this.mFragmentShader);
        this.mGLProgId = loadProgram;
        this.mGLUniformMVPMatrix = GLES20.glGetUniformLocation(loadProgram, "uMVPMatrix");
        this.mGLUniformSTMatrix = GLES20.glGetUniformLocation(this.mGLProgId, "uSTMatrix");
        this.mGLUniformOverlaySTMatrix = GLES20.glGetUniformLocation(this.mGLProgId, "uOverlaySTMatrix");
        this.mGLAttribPosition = GLES20.glGetAttribLocation(this.mGLProgId, "aPosition");
        this.mGLAttribTextureCoord = GLES20.glGetAttribLocation(this.mGLProgId, "aTextureCoord");
        this.mGLUniformTexture = GLES20.glGetUniformLocation(this.mGLProgId, "sTexture");
        this.mGLUniformOverlayTexture = GLES20.glGetUniformLocation(this.mGLProgId, "sTexture1");
        this.mGLUniformWatermarkTexture = GLES20.glGetUniformLocation(this.mGLProgId, "sTexture2");
        this.mGLUniformHashTagTexture = GLES20.glGetUniformLocation(this.mGLProgId, "sTexture3");
        this.mGLUniformXScale = GLES20.glGetUniformLocation(this.mGLProgId, "uXScaleFactor");
        this.mGLUniformYScale = GLES20.glGetUniformLocation(this.mGLProgId, "uYScaleFactor");
        this.mGLUniformXOffset = GLES20.glGetUniformLocation(this.mGLProgId, "uXOffset");
        this.mGLUniformYOffset = GLES20.glGetUniformLocation(this.mGLProgId, "uYOffset");
        this.mGLUniformRotation = GLES20.glGetUniformLocation(this.mGLProgId, "uRotationMatrix");
        this.mGLUniformMirrorOffset = GLES20.glGetUniformLocation(this.mGLProgId, "uMirrorOffset");
        this.mGLUniformMirrorFactor = GLES20.glGetUniformLocation(this.mGLProgId, "uMirrorFactor");
        this.mGLUniformOverlayMirrorOffset = GLES20.glGetUniformLocation(this.mGLProgId, "uOverlayMirrorOffset");
        this.mGLUniformOverlayMirrorFactor = GLES20.glGetUniformLocation(this.mGLProgId, "uOverlayMirrorFactor");
        GLES20.glActiveTexture(33985);
        this.mGLOverlayTextureId = OpenGlUtils.loadTexture(this.mOverlayBitmap, -1, false);
        GLES20.glActiveTexture(33986);
        this.mGLWatermarkTextureId = OpenGlUtils.loadTexture(this.mWatermarkBitmap, -1, false);
        GLES20.glActiveTexture(33987);
        this.mGLHashTagTextureId = OpenGlUtils.loadTexture(this.mHashTagBitmap, -1, false);
        this.mGLStickerTextureIds = new ArrayList<TextStickerTextureData>();
        final Iterator<TextStickerData> iterator = this.mStickerBitmaps.iterator();
        int n = 33988;
        int n2 = 4;
        while (iterator.hasNext()) {
            final TextStickerData textStickerData = iterator.next();
            final int mglProgId = this.mGLProgId;
            final StringBuilder sb = new StringBuilder();
            sb.append("sTexture");
            sb.append(n2);
            final int glGetUniformLocation = GLES20.glGetUniformLocation(mglProgId, sb.toString());
            GLES20.glActiveTexture(n);
            this.mGLStickerTextureIds.add(new TextStickerTextureData(n, OpenGlUtils.loadTexture(textStickerData.getBitmap(), -1, false), textStickerData.getStartTime(), textStickerData.getEndTime(), n2, glGetUniformLocation));
            ++n;
            ++n2;
        }
        this.mIsInitialized = true;
    }
    
    private void onInitialized() {
    }
    
    private void runOnDraw(final Runnable runnable) {
        synchronized (this.mRunOnDraw) {
            this.mRunOnDraw.addLast(runnable);
        }
    }
    
    private void runPendingOnDrawTasks() {
        while (!this.mRunOnDraw.isEmpty()) {
            this.mRunOnDraw.removeFirst().run();
        }
    }
    
    public final void destroy() {
        this.mIsInitialized = false;
        GLES20.glDeleteProgram(this.mGLProgId);
        this.onDestroy();
    }
    
    public void drawFrame(final int n, final float[] array, final float[] array2, final float[] array3, final long n2) {
        this.drawFrame(n, array, array2, array3, this.mTriangleVertices, n2);
    }
    
    public int getAttribPosition() {
        return this.mGLAttribPosition;
    }
    
    public int getAttribTextureCoordinate() {
        return this.mGLAttribTextureCoord;
    }
    
    public float getOutputHeight() {
        return this.mOutputHeight;
    }
    
    public float getOutputWidth() {
        return this.mOutputWidth;
    }
    
    public int getProgram() {
        return this.mGLProgId;
    }
    
    public final void init() {
        this.onInit();
        this.mIsInitialized = true;
        this.onInitialized();
    }
    
    public boolean isInitialized() {
        return this.mIsInitialized;
    }
    
    public void onDestroy() {
    }
    
    public void onVideoSizesChanged(float mOutputWidth, final float mOutputHeight, final float n, final float n2, final float n3) {
        this.mOutputWidth = mOutputWidth;
        this.mOutputHeight = mOutputHeight;
        final float n4 = n / n2;
        if (n4 < 1.0f) {
            this.mYScale = mOutputHeight / mOutputWidth * n4;
            this.mXScale = 1.0f;
        }
        else {
            this.mYScale = 1.0f;
            mOutputWidth = mOutputWidth * 1.0f / mOutputHeight;
            this.mXScale = n2 / n * mOutputWidth;
        }
        this.mXOffset = (1.0f - this.mXScale) / 2.0f;
        this.mYOffset = (1.0f - this.mYScale) / 2.0f + this.mPercentageTopOffset;
        Matrix.setRotateM(this.mRotationMatrix, 0, n3, 0.0f, 0.0f, 1.0f);
    }
    
    public void setFloat(final int n, final float n2) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                GLES20.glUniform1f(n, n2);
            }
        });
    }
    
    public void setFloatArray(final int n, final float[] array) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                final int val$location = n;
                final float[] val$arrayValue = array;
                GLES20.glUniform1fv(val$location, val$arrayValue.length, FloatBuffer.wrap(val$arrayValue));
            }
        });
    }
    
    public void setFloatVec2(final int n, final float[] array) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                GLES20.glUniform2fv(n, 1, FloatBuffer.wrap(array));
            }
        });
    }
    
    public void setFloatVec3(final int n, final float[] array) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                GLES20.glUniform3fv(n, 1, FloatBuffer.wrap(array));
            }
        });
    }
    
    public void setFloatVec4(final int n, final float[] array) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                GLES20.glUniform4fv(n, 1, FloatBuffer.wrap(array));
            }
        });
    }
    
    public void setInteger(final int n, final int n2) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                GLES20.glUniform1i(n, n2);
            }
        });
    }
    
    public void setMirroring(final boolean b) {
        if (b) {
            this.mMirrorFactor = 1.0f;
            this.mMirrorOffset = 1.0f;
        }
        else {
            this.mMirrorFactor = -1.0f;
            this.mMirrorOffset = 0.0f;
        }
    }
    
    public void setMirroringOverlay(final boolean b) {
        if (b) {
            this.mOverlayMirrorFactor = 1.0f;
            this.mOverlayMirrorOffset = 1.0f;
        }
        else {
            this.mOverlayMirrorFactor = -1.0f;
            this.mOverlayMirrorOffset = 0.0f;
        }
    }
    
    public void setPoint(final int n, final PointF pointF) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                final PointF val$point = pointF;
                GLES20.glUniform2fv(n, 1, new float[] { val$point.x, val$point.y }, 0);
            }
        });
    }
    
    public void setUniformMatrix3f(final int n, final float[] array) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                GLES20.glUniformMatrix3fv(n, 1, false, array, 0);
            }
        });
    }
    
    public void setUniformMatrix4f(final int n, final float[] array) {
        this.runOnDraw(new Runnable() {
            @Override
            public void run() {
                GLES20.glUniformMatrix4fv(n, 1, false, array, 0);
            }
        });
    }
}
