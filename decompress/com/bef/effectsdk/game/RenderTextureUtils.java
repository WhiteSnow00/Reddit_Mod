// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.game;

import java.nio.FloatBuffer;
import java.nio.Buffer;
import android.opengl.GLES20;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import com.bytedance.covode.number.Covode;

public class RenderTextureUtils
{
    public static float[] flipY_uvArray;
    public static float[] uvArray;
    public static float[] vertexArray;
    
    static {
        Covode.recordClassIndex(2832);
        RenderTextureUtils.vertexArray = new float[] { -1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f };
        RenderTextureUtils.uvArray = new float[] { 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f };
        RenderTextureUtils.flipY_uvArray = new float[] { 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f };
    }
    
    public static int generateBlankTexture(final int n, final int n2) {
        final FloatBuffer floatBuffer = ByteBuffer.allocateDirect(n * n2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBuffer.put(0.0f);
        floatBuffer.position(0);
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(3553, array[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, n, n2, 0, 6408, 5121, (Buffer)floatBuffer);
        GLES20.glBindTexture(3553, 0);
        return array[0];
    }
    
    public static FloatBuffer getFlipY_uvBuffer() {
        return getFloatBuffer(RenderTextureUtils.flipY_uvArray);
    }
    
    public static FloatBuffer getFloatBuffer(final float[] array) {
        final FloatBuffer floatBuffer = ByteBuffer.allocateDirect(array.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBuffer.put(array);
        floatBuffer.position(0);
        return floatBuffer;
    }
    
    public static FloatBuffer getUVBuffer() {
        return getFloatBuffer(RenderTextureUtils.uvArray);
    }
    
    public static FloatBuffer getUVBufferWithParams(final float n, final float n2, final float n3, final float n4) {
        return getFloatBuffer(new float[] { n, n3, n2, n3, n, n4, n2, n4 });
    }
    
    public static FloatBuffer getVertexBuffer() {
        return getFloatBuffer(RenderTextureUtils.vertexArray);
    }
    
    public static FloatBuffer getVertexBufferWithParams(final float n, final float n2, final float n3, final float n4) {
        return getFloatBuffer(new float[] { n, n3, n2, n3, n, n4, n2, n4 });
    }
}
