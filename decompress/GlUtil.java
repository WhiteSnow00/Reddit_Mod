// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.util;

import java.util.HashMap;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import android.opengl.GLU;
import android.util.Log;
import a81.e;
import android.opengl.GLES20;

public final class GlUtil
{
    public static void a(final int n, int h, final String s) {
        final int glCreateShader = GLES20.glCreateShader(h);
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] != 1) {
            final String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            h = e.h(glGetShaderInfoLog, 10);
            final StringBuilder sb = new StringBuilder(s.length() + h);
            sb.append(glGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(s);
            Log.e("GlUtil", sb.toString());
        }
        GLES20.glAttachShader(n, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        b();
    }
    
    public static void b() {
        int n = 0;
        while (true) {
            final int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            final String value = String.valueOf(GLU.gluErrorString(glGetError));
            String concat;
            if (value.length() != 0) {
                concat = "glError: ".concat(value);
            }
            else {
                concat = new String("glError: ");
            }
            Log.e("GlUtil", concat);
            n = glGetError;
        }
        if (n != 0) {
            final String value2 = String.valueOf(GLU.gluErrorString(n));
            String concat2;
            if (value2.length() != 0) {
                concat2 = "glError: ".concat(value2);
            }
            else {
                concat2 = new String("glError: ");
            }
            Log.e("GlUtil", concat2);
        }
    }
    
    public static FloatBuffer c(final float[] array) {
        return (FloatBuffer)ByteBuffer.allocateDirect(array.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(array).flip();
    }
    
    public static final class GlException extends RuntimeException
    {
        public GlException(final String s) {
            super(s);
        }
    }
    
    public static final class a
    {
        public a(final String s) {
        }
    }
    
    public static final class b
    {
        public final int a;
        public final a[] b;
        public final c[] c;
        public final HashMap d;
        public final HashMap e;
        
        public b(String s, final String s2) {
            final int glCreateProgram = GLES20.glCreateProgram();
            this.a = glCreateProgram;
            GlUtil.b();
            GlUtil.a(glCreateProgram, 35633, s);
            GlUtil.a(glCreateProgram, 35632, s2);
            GLES20.glLinkProgram(glCreateProgram);
            final int[] array = { 0 };
            GLES20.glGetProgramiv(glCreateProgram, 35714, array, 0);
            if (array[0] != 1) {
                s = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
                if (s.length() != 0) {
                    s = "Unable to link shader program: \n".concat(s);
                }
                else {
                    s = new String("Unable to link shader program: \n");
                }
                Log.e("GlUtil", s);
            }
            GLES20.glUseProgram(glCreateProgram);
            this.d = new HashMap();
            final int[] array2 = { 0 };
            GLES20.glGetProgramiv(glCreateProgram, 35721, array2, 0);
            this.b = new a[array2[0]];
            int i = 0;
        Label_0142:
            while (i < array2[0]) {
                final int a = this.a;
                final int[] array3 = { 0 };
                GLES20.glGetProgramiv(a, 35722, array3, 0);
                final int n = array3[0];
                byte[] array4 = new byte[n];
                GLES20.glGetActiveAttrib(a, i, n, new int[1], 0, new int[1], 0, new int[1], 0, array4, 0);
                while (true) {
                    byte[] array5;
                    for (int j = 0; j < n; ++j, array4 = array5) {
                        array5 = array4;
                        if (array5[j] == 0) {
                            final String s3 = new String(array4, 0, j);
                            GLES20.glGetAttribLocation(a, s3);
                            final a a2 = new a(s3);
                            this.b[i] = a2;
                            this.d.put(s3, a2);
                            ++i;
                            continue Label_0142;
                        }
                    }
                    int j = n;
                    continue;
                }
            }
            this.e = new HashMap();
            final int[] array6 = { 0 };
            GLES20.glGetProgramiv(this.a, 35718, array6, 0);
            this.c = new c[array6[0]];
            int k = 0;
            Label_0336:
            while (k < array6[0]) {
                final int a3 = this.a;
                final int[] array7 = { 0 };
                GLES20.glGetProgramiv(a3, 35719, array7, 0);
                final int[] array8 = { 0 };
                final int n2 = array7[0];
                byte[] array9 = new byte[n2];
                GLES20.glGetActiveUniform(a3, k, n2, new int[1], 0, new int[1], 0, array8, 0, array9, 0);
                while (true) {
                    byte[] array10;
                    for (int l = 0; l < n2; ++l, array9 = array10) {
                        array10 = array9;
                        if (array10[l] == 0) {
                            final String s4 = new String(array9, 0, l);
                            GLES20.glGetUniformLocation(a3, s4);
                            final c c = new c(s4);
                            this.c[k] = c;
                            this.e.put(s4, c);
                            ++k;
                            continue Label_0336;
                        }
                    }
                    int l = n2;
                    continue;
                }
            }
            GlUtil.b();
        }
        
        public final int a(final String s) {
            final int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, s);
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GlUtil.b();
            return glGetAttribLocation;
        }
    }
    
    public static final class c
    {
        public c(final String s) {
        }
    }
}
