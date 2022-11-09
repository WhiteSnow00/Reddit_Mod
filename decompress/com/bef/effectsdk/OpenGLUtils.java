// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import android.opengl.GLUtils;
import android.graphics.BitmapFactory$Options;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.0II;
import java.util.Locale;
import com.bytedance.covode.number.Covode;

public class OpenGLUtils
{
    public static final String FAIL_RES;
    
    static {
        Covode.recordClassIndex(2804);
        FAIL_RES = 0II.LIZ(Locale.US, "{%s: false}", new Object[] { "\"res\"" });
    }
    
    public static void byte2Bitmap(final byte[] array, final int n, final int n2, final String s) {
        MethodCollector.i(3977);
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        bitmap.eraseColor(-16776961);
        bitmap.copyPixelsFromBuffer((Buffer)ByteBuffer.wrap(array));
        saveBitmap(bitmap, s);
        MethodCollector.o(3977);
    }
    
    public static void checkGlError(final String s) {
        final int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(": glError 0x");
        sb.append(Integer.toHexString(glGetError));
        throw new RuntimeException(sb.toString());
    }
    
    public static int getExternalOESTextureID() {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(36197, array[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return array[0];
    }
    
    public static int initEffectTexture(final int n, final int n2, final int[] array, final int n3) {
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(n3, array[0]);
        GLES20.glTexParameterf(n3, 10240, 9729.0f);
        GLES20.glTexParameterf(n3, 10241, 9729.0f);
        GLES20.glTexParameterf(n3, 10242, 33071.0f);
        GLES20.glTexParameterf(n3, 10243, 33071.0f);
        GLES20.glTexImage2D(n3, 0, 6408, n, n2, 0, 6408, 5121, (Buffer)null);
        return array[0];
    }
    
    public static Bitmap loadBitmap(FileDescriptor inputStream, final long n, final long n2) {
        MethodCollector.i(165);
        inputStream = (FileDescriptor)new AssetFileDescriptor(ParcelFileDescriptor.dup(inputStream), n, n2).createInputStream();
        try {
            return BitmapFactory.decodeStream((InputStream)inputStream);
        }
        finally {
            ((InputStream)inputStream).close();
            MethodCollector.o(165);
        }
    }
    
    public static Bitmap loadBitmap(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aconst_null    
        //     7: astore_1       
        //     8: new             Ljava/io/FileInputStream;
        //    11: astore_2       
        //    12: new             Ljava/io/File;
        //    15: astore_3       
        //    16: aload_3        
        //    17: aload_0        
        //    18: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    21: aload_2        
        //    22: aload_3        
        //    23: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    26: aload_2        
        //    27: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
        //    30: astore_0       
        //    31: aload_2        
        //    32: invokevirtual   java/io/InputStream.close:()V
        //    35: sipush          4118
        //    38: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    41: aload_0        
        //    42: areturn        
        //    43: astore_0       
        //    44: aload_1        
        //    45: astore_2       
        //    46: goto            50
        //    49: astore_0       
        //    50: aload_2        
        //    51: ifnull          58
        //    54: aload_2        
        //    55: invokevirtual   java/io/InputStream.close:()V
        //    58: sipush          4118
        //    61: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    64: aload_0        
        //    65: athrow         
        //    66: astore_0       
        //    67: aconst_null    
        //    68: astore_2       
        //    69: aload_2        
        //    70: ifnull          77
        //    73: aload_2        
        //    74: invokevirtual   java/io/InputStream.close:()V
        //    77: sipush          4118
        //    80: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    83: aconst_null    
        //    84: areturn        
        //    85: astore_0       
        //    86: goto            69
        //    89: astore_2       
        //    90: goto            35
        //    93: astore_2       
        //    94: goto            58
        //    97: astore_0       
        //    98: goto            77
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      26     66     69     Ljava/lang/Exception;
        //  8      26     43     49     Any
        //  26     31     85     89     Ljava/lang/Exception;
        //  26     31     49     50     Any
        //  31     35     89     93     Ljava/io/IOException;
        //  54     58     93     97     Ljava/io/IOException;
        //  73     77     97     101    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 55, Size: 55
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static Bitmap loadBitmap(final byte[] array, final int n, final int n2, final boolean inPremultiplied) {
        MethodCollector.i(197);
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inPremultiplied = inPremultiplied;
        Bitmap bitmap2;
        final Bitmap bitmap = bitmap2 = BitmapFactory.decodeByteArray(array, n, n2, bitmapFactory$Options);
        if (bitmap != null) {
            bitmap2 = bitmap;
            if (bitmap.getConfig() != Bitmap$Config.ARGB_8888) {
                bitmap2 = bitmap.copy(Bitmap$Config.ARGB_8888, true);
            }
        }
        MethodCollector.o(197);
        return bitmap2;
    }
    
    public static int loadProgram(final String s, final String s2) {
        final int[] array = { 0 };
        final int loadShader = loadShader(s, 35633);
        if (loadShader == 0) {
            return 0;
        }
        final int loadShader2 = loadShader(s2, 35632);
        if (loadShader2 == 0) {
            return 0;
        }
        final int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, array, 0);
        if (array[0] <= 0) {
            return 0;
        }
        GLES20.glDeleteShader(loadShader);
        GLES20.glDeleteShader(loadShader2);
        return glCreateProgram;
    }
    
    public static int loadShader(int glCreateShader, final String s) {
        glCreateShader = GLES20.glCreateShader(glCreateShader);
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }
    
    public static int loadShader(final String s, int glCreateShader) {
        final int[] array = { 0 };
        glCreateShader = GLES20.glCreateShader(glCreateShader);
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] == 0) {
            return 0;
        }
        return glCreateShader;
    }
    
    public static int loadTexture(final Bitmap bitmap, final int n) {
        return loadTexture(bitmap, n, false);
    }
    
    public static int loadTexture(final Bitmap bitmap, final int n, final boolean b) {
        if (bitmap == null) {
            return -1;
        }
        final int[] array = { 0 };
        if (n == -1) {
            GLES20.glGenTextures(1, array, 0);
            GLES20.glBindTexture(3553, array[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        else {
            GLES20.glBindTexture(3553, n);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            array[0] = n;
        }
        if (b) {
            bitmap.recycle();
        }
        return array[0];
    }
    
    public static String loadTexture(String s) {
        MethodCollector.i(213);
        final Bitmap decodeFile = BitmapFactory.decodeFile(s);
        if (decodeFile == null) {
            s = OpenGLUtils.FAIL_RES;
            MethodCollector.o(213);
            return s;
        }
        s = 0II.LIZ(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", new Object[] { "\"res\"", "\"width\"", decodeFile.getWidth(), "\"height\"", decodeFile.getHeight(), "\"textureId\"", loadTexture(decodeFile, -1, false) });
        MethodCollector.o(213);
        return s;
    }
    
    public static void saveBitmap(final Bitmap bitmap, final String s) {
    }
}
