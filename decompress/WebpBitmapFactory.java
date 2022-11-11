// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.webp;

import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStream;
import android.util.TypedValue;
import android.content.res.Resources;
import android.graphics.Rect;
import java.io.FileDescriptor;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import androidx.annotation.Keep;

@Keep
public class WebpBitmapFactory
{
    private static final int IN_TEMP_BUFFER_SIZE = 8192;
    private static final int MAX_WEBP_HEADER_SIZE = 21;
    
    static {
        System.loadLibrary("glide-webp");
    }
    
    @Keep
    private static Bitmap createBitmap(final int n, final int n2, final BitmapFactory$Options bitmapFactory$Options) {
        if (bitmapFactory$Options != null) {
            final Bitmap inBitmap = bitmapFactory$Options.inBitmap;
            if (inBitmap != null && inBitmap.isMutable()) {
                return bitmapFactory$Options.inBitmap;
            }
        }
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        bitmap.setHasAlpha(true);
        bitmap.eraseColor(0);
        return bitmap;
    }
    
    public static Bitmap decodeByteArray(final byte[] array, final int n, final int n2) {
        return decodeByteArray(array, n, n2, null);
    }
    
    public static Bitmap decodeByteArray(final byte[] array, final int n, final int n2, final BitmapFactory$Options bitmapFactory$Options) {
        if ((n | n2) >= 0 && array.length >= n + n2) {
            Bitmap bitmap;
            if (webpSupportRequired(array, n, n2)) {
                bitmap = nativeDecodeByteArray(array, n, n2, bitmapFactory$Options, getScaleFromOptions(bitmapFactory$Options), getInTempStorageFromOptions(bitmapFactory$Options));
                setWebpBitmapOptions(bitmap, bitmapFactory$Options);
            }
            else {
                bitmap = BitmapFactory.decodeByteArray(array, n, n2, bitmapFactory$Options);
            }
            return bitmap;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public static Bitmap decodeFile(final String s) {
        return decodeFile(s, null);
    }
    
    public static Bitmap decodeFile(final String p0, final BitmapFactory$Options p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aconst_null    
        //     3: astore_3       
        //     4: aconst_null    
        //     5: astore          4
        //     7: new             Ljava/io/FileInputStream;
        //    10: astore          5
        //    12: aload           5
        //    14: aload_0        
        //    15: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //    18: aload           5
        //    20: astore_3       
        //    21: aload           5
        //    23: aconst_null    
        //    24: aload_1        
        //    25: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    28: astore_1       
        //    29: aload           5
        //    31: astore_0       
        //    32: aload_0        
        //    33: invokevirtual   java/io/InputStream.close:()V
        //    36: goto            111
        //    39: astore_1       
        //    40: aload           5
        //    42: astore_0       
        //    43: goto            53
        //    46: astore_0       
        //    47: goto            114
        //    50: astore_1       
        //    51: aconst_null    
        //    52: astore_0       
        //    53: aload_0        
        //    54: astore_3       
        //    55: new             Ljava/lang/StringBuilder;
        //    58: astore          5
        //    60: aload_0        
        //    61: astore_3       
        //    62: aload           5
        //    64: invokespecial   java/lang/StringBuilder.<init>:()V
        //    67: aload_0        
        //    68: astore_3       
        //    69: aload           5
        //    71: ldc             "Unable to decode stream: "
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    76: pop            
        //    77: aload_0        
        //    78: astore_3       
        //    79: aload           5
        //    81: aload_1        
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    85: pop            
        //    86: aload_0        
        //    87: astore_3       
        //    88: ldc             "WebpBitmapFactory"
        //    90: aload           5
        //    92: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    95: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    98: pop            
        //    99: aload_2        
        //   100: astore_1       
        //   101: aload_0        
        //   102: ifnull          111
        //   105: aload           4
        //   107: astore_1       
        //   108: goto            32
        //   111: aload_1        
        //   112: areturn        
        //   113: astore_0       
        //   114: aload_3        
        //   115: ifnull          122
        //   118: aload_3        
        //   119: invokevirtual   java/io/InputStream.close:()V
        //   122: aload_0        
        //   123: athrow         
        //   124: astore_0       
        //   125: goto            111
        //   128: astore_1       
        //   129: goto            122
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      18     50     53     Ljava/lang/Exception;
        //  7      18     46     50     Any
        //  21     29     39     46     Ljava/lang/Exception;
        //  21     29     113    114    Any
        //  32     36     124    128    Ljava/io/IOException;
        //  55     60     113    114    Any
        //  62     67     113    114    Any
        //  69     77     113    114    Any
        //  79     86     113    114    Any
        //  88     99     113    114    Any
        //  118    122    128    132    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 79, Size: 79
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
    
    public static Bitmap decodeFileDescriptor(final FileDescriptor fileDescriptor) {
        return decodeFileDescriptor(fileDescriptor, null, null);
    }
    
    public static Bitmap decodeFileDescriptor(final FileDescriptor p0, final Rect p1, final BitmapFactory$Options p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //     8: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.wrapToMarkSupportedStream:(Ljava/io/InputStream;)Ljava/io/InputStream;
        //    11: astore_3       
        //    12: aload_3        
        //    13: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.getImageHeader:(Ljava/io/InputStream;)[B
        //    16: iconst_0       
        //    17: bipush          21
        //    19: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.webpSupportRequired:([BII)Z
        //    22: ifeq            51
        //    25: aload_3        
        //    26: aload_2        
        //    27: aload_2        
        //    28: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.getScaleFromOptions:(Landroid/graphics/BitmapFactory$Options;)F
        //    31: aload_2        
        //    32: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.getInTempStorageFromOptions:(Landroid/graphics/BitmapFactory$Options;)[B
        //    35: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.nativeDecodeStream:(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;F[B)Landroid/graphics/Bitmap;
        //    38: astore_0       
        //    39: aload_0        
        //    40: aload_2        
        //    41: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.setWebpBitmapOptions:(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)V
        //    44: aload_1        
        //    45: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.setDefaultPadding:(Landroid/graphics/Rect;)V
        //    48: goto            58
        //    51: aload_0        
        //    52: aload_1        
        //    53: aload_2        
        //    54: invokestatic    android/graphics/BitmapFactory.decodeFileDescriptor:(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    57: astore_0       
        //    58: aload_3        
        //    59: invokevirtual   java/io/InputStream.close:()V
        //    62: aload_0        
        //    63: areturn        
        //    64: astore_0       
        //    65: aload_3        
        //    66: invokevirtual   java/io/InputStream.close:()V
        //    69: aload_0        
        //    70: athrow         
        //    71: astore_1       
        //    72: goto            62
        //    75: astore_1       
        //    76: goto            69
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     48     64     71     Any
        //  51     58     64     71     Any
        //  58     62     71     75     Any
        //  65     69     75     79     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 44, Size: 44
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
    
    public static Bitmap decodeResource(final Resources resources, final int n) {
        return decodeResource(resources, n, null);
    }
    
    public static Bitmap decodeResource(final Resources p0, final int p1, final BitmapFactory$Options p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aconst_null    
        //     3: astore          4
        //     5: aconst_null    
        //     6: astore          5
        //     8: new             Landroid/util/TypedValue;
        //    11: astore          6
        //    13: aload           6
        //    15: invokespecial   android/util/TypedValue.<init>:()V
        //    18: aload_0        
        //    19: iload_1        
        //    20: aload           6
        //    22: invokevirtual   android/content/res/Resources.openRawResource:(ILandroid/util/TypedValue;)Ljava/io/InputStream;
        //    25: astore          7
        //    27: aload_0        
        //    28: aload           6
        //    30: aload           7
        //    32: aconst_null    
        //    33: aload_2        
        //    34: invokestatic    com/bumptech/glide/integration/webp/WebpBitmapFactory.decodeResourceStream:(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    37: astore_3       
        //    38: aload_3        
        //    39: astore_0       
        //    40: aload           7
        //    42: ifnull          93
        //    45: aload_3        
        //    46: astore_0       
        //    47: aload           7
        //    49: invokevirtual   java/io/InputStream.close:()V
        //    52: goto            93
        //    55: astore_0       
        //    56: aload           7
        //    58: astore_2       
        //    59: goto            65
        //    62: astore_0       
        //    63: aload_3        
        //    64: astore_2       
        //    65: aload_2        
        //    66: ifnull          73
        //    69: aload_2        
        //    70: invokevirtual   java/io/InputStream.close:()V
        //    73: aload_0        
        //    74: athrow         
        //    75: astore_0       
        //    76: aconst_null    
        //    77: astore          7
        //    79: aload           4
        //    81: astore_0       
        //    82: aload           7
        //    84: ifnull          93
        //    87: aload           5
        //    89: astore_0       
        //    90: goto            47
        //    93: aload_0        
        //    94: ifnonnull       121
        //    97: aload_2        
        //    98: ifnull          121
        //   101: aload_2        
        //   102: getfield        android/graphics/BitmapFactory$Options.inBitmap:Landroid/graphics/Bitmap;
        //   105: ifnonnull       111
        //   108: goto            121
        //   111: new             Ljava/lang/IllegalArgumentException;
        //   114: dup            
        //   115: ldc             "Problem decoding into existing bitmap"
        //   117: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   120: athrow         
        //   121: aload_0        
        //   122: areturn        
        //   123: astore_0       
        //   124: goto            79
        //   127: astore          7
        //   129: goto            93
        //   132: astore_2       
        //   133: goto            73
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      27     75     79     Ljava/lang/Exception;
        //  8      27     62     65     Any
        //  27     38     123    127    Ljava/lang/Exception;
        //  27     38     55     62     Any
        //  47     52     127    132    Ljava/io/IOException;
        //  69     73     132    136    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 75, Size: 75
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
    
    public static Bitmap decodeResourceStream(final Resources resources, final TypedValue typedValue, final InputStream inputStream, final Rect rect, final BitmapFactory$Options bitmapFactory$Options) {
        BitmapFactory$Options bitmapFactory$Options2 = bitmapFactory$Options;
        if (bitmapFactory$Options == null) {
            bitmapFactory$Options2 = new BitmapFactory$Options();
        }
        if (bitmapFactory$Options2.inDensity == 0 && typedValue != null) {
            final int density = typedValue.density;
            if (density == 0) {
                bitmapFactory$Options2.inDensity = 160;
            }
            else if (density != 65535) {
                bitmapFactory$Options2.inDensity = density;
            }
        }
        if (bitmapFactory$Options2.inTargetDensity == 0 && resources != null) {
            bitmapFactory$Options2.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return decodeStream(inputStream, rect, bitmapFactory$Options2);
    }
    
    public static Bitmap decodeStream(final InputStream inputStream) {
        return decodeStream(inputStream, null, null);
    }
    
    public static Bitmap decodeStream(InputStream wrapToMarkSupportedStream, final Rect defaultPadding, final BitmapFactory$Options bitmapFactory$Options) {
        if (wrapToMarkSupportedStream == null) {
            return null;
        }
        wrapToMarkSupportedStream = wrapToMarkSupportedStream(wrapToMarkSupportedStream);
        Bitmap bitmap;
        if (webpSupportRequired(getImageHeader(wrapToMarkSupportedStream), 0, 21)) {
            bitmap = nativeDecodeStream(wrapToMarkSupportedStream, bitmapFactory$Options, getScaleFromOptions(bitmapFactory$Options), getInTempStorageFromOptions(bitmapFactory$Options));
            setWebpBitmapOptions(bitmap, bitmapFactory$Options);
            setDefaultPadding(defaultPadding);
        }
        else {
            bitmap = BitmapFactory.decodeStream(wrapToMarkSupportedStream, defaultPadding, bitmapFactory$Options);
        }
        return bitmap;
    }
    
    private static byte[] getImageHeader(final InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new BufferedInputStream(inputStream, 21);
        }
        inputStream2.mark(21);
        final byte[] array = new byte[21];
        try {
            inputStream2.read(array, 0, 21);
            inputStream2.reset();
            return array;
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    private static byte[] getInTempStorageFromOptions(final BitmapFactory$Options bitmapFactory$Options) {
        if (bitmapFactory$Options != null) {
            final byte[] inTempStorage = bitmapFactory$Options.inTempStorage;
            if (inTempStorage != null) {
                return inTempStorage;
            }
        }
        return new byte[8192];
    }
    
    private static float getScaleFromOptions(final BitmapFactory$Options bitmapFactory$Options) {
        float n2;
        float n = n2 = 1.0f;
        if (bitmapFactory$Options != null) {
            final int inSampleSize = bitmapFactory$Options.inSampleSize;
            if (inSampleSize > 1) {
                n = 1.0f / inSampleSize;
            }
            n2 = n;
            if (bitmapFactory$Options.inScaled) {
                final int inDensity = bitmapFactory$Options.inDensity;
                final int inTargetDensity = bitmapFactory$Options.inTargetDensity;
                final int inScreenDensity = bitmapFactory$Options.inScreenDensity;
                n2 = n;
                if (inDensity != 0) {
                    n2 = n;
                    if (inTargetDensity != 0) {
                        n2 = n;
                        if (inDensity != inScreenDensity) {
                            n2 = inTargetDensity / (float)inDensity;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    private static native Bitmap nativeDecodeByteArray(final byte[] p0, final int p1, final int p2, final BitmapFactory$Options p3, final float p4, final byte[] p5);
    
    private static native Bitmap nativeDecodeStream(final InputStream p0, final BitmapFactory$Options p1, final float p2, final byte[] p3);
    
    private static void setDefaultPadding(final Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }
    
    private static void setDensityFromOptions(final Bitmap bitmap, final BitmapFactory$Options bitmapFactory$Options) {
        if (bitmap != null) {
            if (bitmapFactory$Options != null) {
                final int inDensity = bitmapFactory$Options.inDensity;
                if (inDensity != 0) {
                    bitmap.setDensity(inDensity);
                    final int inTargetDensity = bitmapFactory$Options.inTargetDensity;
                    if (inTargetDensity == 0 || inDensity == inTargetDensity || inDensity == bitmapFactory$Options.inScreenDensity) {
                        return;
                    }
                    if (bitmapFactory$Options.inScaled) {
                        bitmap.setDensity(inTargetDensity);
                    }
                }
                else if (bitmapFactory$Options.inBitmap != null) {
                    bitmap.setDensity(160);
                }
            }
        }
    }
    
    @Keep
    private static boolean setOutDimensions(final BitmapFactory$Options bitmapFactory$Options, final int outWidth, final int outHeight) {
        if (bitmapFactory$Options != null) {
            bitmapFactory$Options.outWidth = outWidth;
            bitmapFactory$Options.outHeight = outHeight;
            return bitmapFactory$Options.inJustDecodeBounds;
        }
        return false;
    }
    
    private static void setWebpBitmapOptions(final Bitmap bitmap, final BitmapFactory$Options bitmapFactory$Options) {
        setDensityFromOptions(bitmap, bitmapFactory$Options);
        if (bitmapFactory$Options != null) {
            bitmapFactory$Options.outMimeType = "image/webp";
        }
    }
    
    public static boolean webpSupportRequired(final byte[] array, final int n, final int n2) {
        try {
            WebpHeaderParser.a((WebpHeaderParser.c)new WebpHeaderParser$a(array, n, n2));
        }
        catch (final IOException ex) {
            final WebpHeaderParser.WebpImageType webp_SIMPLE = WebpHeaderParser.WebpImageType.WEBP_SIMPLE;
        }
        return false;
    }
    
    private static InputStream wrapToMarkSupportedStream(final InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new BufferedInputStream(inputStream, 8192);
        }
        return inputStream2;
    }
}
