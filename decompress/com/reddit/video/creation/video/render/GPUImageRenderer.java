// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import android.opengl.Matrix;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.opengl.GLES20;
import java.util.LinkedList;
import com.reddit.video.creation.models.video.VideoFilter;
import com.reddit.video.creation.video.render.models.TextStickerData;
import java.util.List;
import android.graphics.Bitmap;
import java.util.Queue;

public class GPUImageRenderer
{
    private final GPUTextureExtractor gpuTextureExtractor;
    private final float[] mMVPMatrix;
    private final float[] mOverlaySTMatrix;
    private final float mRotation;
    private final Queue<Runnable> mRunOnDraw;
    private final float[] mSTMatrix;
    private int mTextureID;
    
    public GPUImageRenderer(final Bitmap bitmap, final List<TextStickerData> list, final float mRotation, final VideoFilter videoFilter, final float n) {
        this.mMVPMatrix = new float[16];
        this.mSTMatrix = new float[16];
        this.mOverlaySTMatrix = new float[16];
        this.gpuTextureExtractor = new GPUTextureExtractor(bitmap, list, videoFilter, n);
        this.mRotation = mRotation;
        this.mRunOnDraw = new LinkedList<Runnable>();
    }
    
    private void runAll(final Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                queue.poll().run();
            }
        }
    }
    
    public void checkGlError(final String s) {
        final int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(": glError ");
        sb.append(glGetError);
        Log.e("RENDERER", sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(": glError ");
        sb2.append(glGetError);
        throw new RuntimeException(sb2.toString());
    }
    
    public void destroy() {
        this.gpuTextureExtractor.destroy();
        GLES20.glDeleteTextures(1, new int[] { this.mTextureID }, 0);
    }
    
    public void drawFrame(final SurfaceTexture surfaceTexture, final boolean b, final boolean b2, final boolean mirroring, final boolean mirroringOverlay, final long n) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.runAll(this.mRunOnDraw);
        surfaceTexture.getTransformMatrix(this.mOverlaySTMatrix);
        if (b2) {
            final float[] mOverlaySTMatrix = this.mOverlaySTMatrix;
            mOverlaySTMatrix[5] = -mOverlaySTMatrix[5];
            mOverlaySTMatrix[13] = 1.0f - mOverlaySTMatrix[13];
        }
        surfaceTexture.getTransformMatrix(this.mSTMatrix);
        if (b) {
            final float[] mstMatrix = this.mSTMatrix;
            mstMatrix[5] = -mstMatrix[5];
            mstMatrix[13] = 1.0f - mstMatrix[13];
        }
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        this.gpuTextureExtractor.setMirroring(mirroring);
        this.gpuTextureExtractor.setMirroringOverlay(mirroringOverlay);
        this.gpuTextureExtractor.drawFrame(this.mTextureID, this.mMVPMatrix, this.mSTMatrix, this.mOverlaySTMatrix, n);
    }
    
    public int getTextureId() {
        return this.mTextureID;
    }
    
    public void runOnDraw(final Runnable runnable) {
        synchronized (this.mRunOnDraw) {
            this.mRunOnDraw.add(runnable);
        }
    }
    
    public void surfaceChanged(final int n, final int n2, final float n3, final float n4) {
        GLES20.glViewport(0, 0, n, n2);
        GLES20.glUseProgram(this.gpuTextureExtractor.getProgram());
        this.gpuTextureExtractor.onVideoSizesChanged((float)n, (float)n2, n3, n4, this.mRotation);
    }
    
    public void surfaceCreated() {
        this.gpuTextureExtractor.init();
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(36197, this.mTextureID = array[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }
}
