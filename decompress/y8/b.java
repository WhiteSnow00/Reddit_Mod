// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import com.bumptech.glide.load.EncodeStrategy;
import p8.g;
import java.io.File;
import android.graphics.Bitmap$CompressFormat;
import p8.f;
import android.graphics.Bitmap;
import p8.i;

public final class b implements i<Bitmap>
{
    public static final f<Integer> g;
    public static final f<Bitmap$CompressFormat> h;
    public final s8.b f;
    
    static {
        g = f.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
        h = new f<Bitmap$CompressFormat>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, (f.b<Bitmap$CompressFormat>)f.e);
    }
    
    public b(final s8.b f) {
        this.f = f;
    }
    
    public final boolean b(final Object p0, final File p1, final g p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lr8/l;
        //     4: invokeinterface r8/l.get:()Ljava/lang/Object;
        //     9: checkcast       Landroid/graphics/Bitmap;
        //    12: astore          4
        //    14: aload_3        
        //    15: getstatic       y8/b.h:Lp8/f;
        //    18: invokevirtual   p8/g.a:(Lp8/f;)Ljava/lang/Object;
        //    21: checkcast       Landroid/graphics/Bitmap$CompressFormat;
        //    24: astore          5
        //    26: aload           5
        //    28: ifnull          34
        //    31: goto            55
        //    34: aload           4
        //    36: invokevirtual   android/graphics/Bitmap.hasAlpha:()Z
        //    39: ifeq            50
        //    42: getstatic       android/graphics/Bitmap$CompressFormat.PNG:Landroid/graphics/Bitmap$CompressFormat;
        //    45: astore          5
        //    47: goto            55
        //    50: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //    53: astore          5
        //    55: aload           4
        //    57: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //    60: pop            
        //    61: aload           4
        //    63: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //    66: pop            
        //    67: getstatic       l9/f.b:I
        //    70: istore          6
        //    72: invokestatic    android/os/SystemClock.elapsedRealtimeNanos:()J
        //    75: lstore          7
        //    77: aload_3        
        //    78: getstatic       y8/b.g:Lp8/f;
        //    81: invokevirtual   p8/g.a:(Lp8/f;)Ljava/lang/Object;
        //    84: checkcast       Ljava/lang/Integer;
        //    87: invokevirtual   java/lang/Integer.intValue:()I
        //    90: istore          6
        //    92: iconst_0       
        //    93: istore          9
        //    95: iconst_0       
        //    96: istore          10
        //    98: aconst_null    
        //    99: astore          11
        //   101: aconst_null    
        //   102: astore          12
        //   104: aload           12
        //   106: astore          13
        //   108: aload           11
        //   110: astore          14
        //   112: new             Ljava/io/FileOutputStream;
        //   115: astore_1       
        //   116: aload           12
        //   118: astore          13
        //   120: aload           11
        //   122: astore          14
        //   124: aload_1        
        //   125: aload_2        
        //   126: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   129: aload_0        
        //   130: getfield        y8/b.f:Ls8/b;
        //   133: ifnull          163
        //   136: new             Lcom/bumptech/glide/load/data/c;
        //   139: astore_2       
        //   140: aload_2        
        //   141: aload_1        
        //   142: aload_0        
        //   143: getfield        y8/b.f:Ls8/b;
        //   146: invokespecial   com/bumptech/glide/load/data/c.<init>:(Ljava/io/FileOutputStream;Ls8/b;)V
        //   149: aload_2        
        //   150: astore_1       
        //   151: goto            163
        //   154: astore_2       
        //   155: aload_1        
        //   156: astore          13
        //   158: aload_2        
        //   159: astore_1       
        //   160: goto            358
        //   163: aload_1        
        //   164: astore          13
        //   166: aload_1        
        //   167: astore          14
        //   169: aload           4
        //   171: aload           5
        //   173: iload           6
        //   175: aload_1        
        //   176: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   179: pop            
        //   180: aload_1        
        //   181: astore          13
        //   183: aload_1        
        //   184: astore          14
        //   186: aload_1        
        //   187: invokevirtual   java/io/OutputStream.close:()V
        //   190: iconst_1       
        //   191: istore          9
        //   193: goto            240
        //   196: astore_2       
        //   197: goto            208
        //   200: astore_1       
        //   201: goto            358
        //   204: astore_2       
        //   205: aload           14
        //   207: astore_1       
        //   208: aload_1        
        //   209: astore          13
        //   211: ldc             "BitmapEncoder"
        //   213: iconst_3       
        //   214: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   217: ifeq            232
        //   220: aload_1        
        //   221: astore          13
        //   223: ldc             "BitmapEncoder"
        //   225: ldc             "Failed to encode Bitmap"
        //   227: aload_2        
        //   228: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   231: pop            
        //   232: aload_1        
        //   233: ifnull          244
        //   236: iload           10
        //   238: istore          9
        //   240: aload_1        
        //   241: invokevirtual   java/io/OutputStream.close:()V
        //   244: ldc             "BitmapEncoder"
        //   246: iconst_2       
        //   247: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   250: ifeq            355
        //   253: new             Ljava/lang/StringBuilder;
        //   256: astore_1       
        //   257: aload_1        
        //   258: invokespecial   java/lang/StringBuilder.<init>:()V
        //   261: aload_1        
        //   262: ldc             "Compressed with type: "
        //   264: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   267: pop            
        //   268: aload_1        
        //   269: aload           5
        //   271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   274: pop            
        //   275: aload_1        
        //   276: ldc             " of size "
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: pop            
        //   282: aload_1        
        //   283: aload           4
        //   285: invokestatic    l9/j.d:(Landroid/graphics/Bitmap;)I
        //   288: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   291: pop            
        //   292: aload_1        
        //   293: ldc             " in "
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: pop            
        //   299: aload_1        
        //   300: lload           7
        //   302: invokestatic    l9/f.a:(J)D
        //   305: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   308: pop            
        //   309: aload_1        
        //   310: ldc             ", options format: "
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: pop            
        //   316: aload_1        
        //   317: aload_3        
        //   318: getstatic       y8/b.h:Lp8/f;
        //   321: invokevirtual   p8/g.a:(Lp8/f;)Ljava/lang/Object;
        //   324: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   327: pop            
        //   328: aload_1        
        //   329: ldc             ", hasAlpha: "
        //   331: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   334: pop            
        //   335: aload_1        
        //   336: aload           4
        //   338: invokevirtual   android/graphics/Bitmap.hasAlpha:()Z
        //   341: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   344: pop            
        //   345: ldc             "BitmapEncoder"
        //   347: aload_1        
        //   348: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   351: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   354: pop            
        //   355: iload           9
        //   357: ireturn        
        //   358: aload           13
        //   360: ifnull          368
        //   363: aload           13
        //   365: invokevirtual   java/io/OutputStream.close:()V
        //   368: aload_1        
        //   369: athrow         
        //   370: astore_1       
        //   371: aload_1        
        //   372: athrow         
        //   373: astore_1       
        //   374: goto            244
        //   377: astore_2       
        //   378: goto            368
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  67     92     370    373    Any
        //  112    116    204    208    Ljava/io/IOException;
        //  112    116    200    204    Any
        //  124    129    204    208    Ljava/io/IOException;
        //  124    129    200    204    Any
        //  129    149    196    200    Ljava/io/IOException;
        //  129    149    154    163    Any
        //  169    180    204    208    Ljava/io/IOException;
        //  169    180    200    204    Any
        //  186    190    204    208    Ljava/io/IOException;
        //  186    190    200    204    Any
        //  211    220    200    204    Any
        //  223    232    200    204    Any
        //  240    244    373    377    Ljava/io/IOException;
        //  240    244    370    373    Any
        //  244    355    370    373    Any
        //  363    368    377    381    Ljava/io/IOException;
        //  363    368    370    373    Any
        //  368    370    370    373    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 195, Size: 195
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
    
    public final EncodeStrategy e(final g g) {
        return EncodeStrategy.TRANSFORMED;
    }
}
