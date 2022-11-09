// 
// Decompiled by Procyon v0.6.0
// 

package r9;

import java.nio.FloatBuffer;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import p2.e;
import ak0.m;
import android.opengl.GLES20;
import java.util.HashMap;

public class a
{
    public static final float[] i;
    public final String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final HashMap<String, Integer> g;
    public float[] h;
    
    static {
        i = new float[] { -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f };
    }
    
    public a() {
        this("attribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying highp vec2 vTextureCoord;\nvoid main() {\ngl_Position = aPosition;\nvTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying highp vec2 vTextureCoord;\nuniform lowp sampler2D sTexture;\nvoid main() {\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    }
    
    public a(final String a, final String b) {
        this.g = new HashMap<String, Integer>();
        this.h = new float[] { 0.0f, 0.0f, 0.0f, 1.0f };
        this.a = a;
        this.b = b;
    }
    
    public final void a(final int n) {
        GLES20.glUseProgram(this.c);
        GLES20.glBindBuffer(34962, this.f);
        GLES20.glEnableVertexAttribArray(this.b("aPosition"));
        GLES20.glVertexAttribPointer(this.b("aPosition"), 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(this.b("aTextureCoord"));
        GLES20.glVertexAttribPointer(this.b("aTextureCoord"), 2, 5126, false, 20, 12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, n);
        GLES20.glUniform1i(this.b("sTexture"), 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.b("aPosition"));
        GLES20.glDisableVertexAttribArray(this.b("aTextureCoord"));
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindBuffer(34962, 0);
    }
    
    public final int b(final String s) {
        final Integer n = this.g.get(s);
        if (n != null) {
            return n;
        }
        int n2;
        if ((n2 = GLES20.glGetAttribLocation(this.c, s)) == -1) {
            n2 = GLES20.glGetUniformLocation(this.c, s);
        }
        if (n2 != -1) {
            this.g.put(s, n2);
            return n2;
        }
        throw new IllegalStateException(m.l("Could not get attrib or uniform location for ", s));
    }
    
    public final void c() {
        GLES20.glDeleteProgram(this.c);
        this.c = 0;
        GLES20.glDeleteShader(this.d);
        this.d = 0;
        GLES20.glDeleteShader(this.e);
        this.e = 0;
        GLES20.glDeleteBuffers(1, new int[] { this.f }, 0);
        this.f = 0;
        this.g.clear();
    }
    
    public final void d() {
        this.c();
        this.d = p2.e.k(this.a, 35633);
        final int k = p2.e.k(this.b, 35632);
        this.e = k;
        final int d = this.d;
        final int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            throw new RuntimeException("Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, d);
        GLES20.glAttachShader(glCreateProgram, k);
        GLES20.glLinkProgram(glCreateProgram);
        final int[] array = { 0 };
        GLES20.glGetProgramiv(glCreateProgram, 35714, array, 0);
        if (array[0] == 1) {
            this.c = glCreateProgram;
            final float[] i = r9.a.i;
            final FloatBuffer floatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBuffer.put(i).position(0);
            final int[] array2 = { 0 };
            GLES20.glGenBuffers(1, array2, 0);
            GLES20.glBindBuffer(34962, array2[0]);
            GLES20.glBufferData(34962, floatBuffer.capacity() * 4, (Buffer)floatBuffer, 35044);
            GLES20.glBindBuffer(34962, 0);
            this.f = array2[0];
            this.b("aPosition");
            this.b("aTextureCoord");
            this.b("sTexture");
            return;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        throw new RuntimeException("Could not link program");
    }
}
