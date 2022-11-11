// 
// Decompiled by Procyon v0.6.0
// 

package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import android.net.Uri;
import android.content.Context;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import androidx.annotation.Keep;
import android.graphics.Bitmap$Config;

public class SkiaImageDecoder implements ImageDecoder
{
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap$Config bitmapConfig;
    
    @Keep
    public SkiaImageDecoder() {
        this(null);
    }
    
    public SkiaImageDecoder(final Bitmap$Config bitmapConfig) {
        final Bitmap$Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (bitmapConfig != null) {
            this.bitmapConfig = bitmapConfig;
        }
        else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        }
        else {
            this.bitmapConfig = Bitmap$Config.RGB_565;
        }
    }
    
    public Bitmap decode(final Context p0, final Uri p1) throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //     4: astore_3       
        //     5: new             Landroid/graphics/BitmapFactory$Options;
        //     8: dup            
        //     9: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //    12: astore          4
        //    14: aload           4
        //    16: aload_0        
        //    17: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder.bitmapConfig:Landroid/graphics/Bitmap$Config;
        //    20: putfield        android/graphics/BitmapFactory$Options.inPreferredConfig:Landroid/graphics/Bitmap$Config;
        //    23: aload_3        
        //    24: ldc             "android.resource://"
        //    26: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    29: ifeq            190
        //    32: aload_2        
        //    33: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //    36: astore_3       
        //    37: aload_1        
        //    38: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    41: aload_3        
        //    42: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    45: ifeq            57
        //    48: aload_1        
        //    49: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    52: astore          5
        //    54: goto            67
        //    57: aload_1        
        //    58: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    61: aload_3        
        //    62: invokevirtual   android/content/pm/PackageManager.getResourcesForApplication:(Ljava/lang/String;)Landroid/content/res/Resources;
        //    65: astore          5
        //    67: aload_2        
        //    68: invokevirtual   android/net/Uri.getPathSegments:()Ljava/util/List;
        //    71: astore_2       
        //    72: aload_2        
        //    73: invokeinterface java/util/List.size:()I
        //    78: istore          6
        //    80: iconst_0       
        //    81: istore          7
        //    83: iload           6
        //    85: iconst_2       
        //    86: if_icmpne       130
        //    89: aload_2        
        //    90: iconst_0       
        //    91: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    96: checkcast       Ljava/lang/String;
        //    99: ldc             "drawable"
        //   101: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   104: ifeq            130
        //   107: aload           5
        //   109: aload_2        
        //   110: iconst_1       
        //   111: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   116: checkcast       Ljava/lang/String;
        //   119: ldc             "drawable"
        //   121: aload_3        
        //   122: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   125: istore          8
        //   127: goto            175
        //   130: iload           7
        //   132: istore          8
        //   134: iload           6
        //   136: iconst_1       
        //   137: if_icmpne       175
        //   140: iload           7
        //   142: istore          8
        //   144: aload_2        
        //   145: iconst_0       
        //   146: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   151: checkcast       Ljava/lang/CharSequence;
        //   154: invokestatic    android/text/TextUtils.isDigitsOnly:(Ljava/lang/CharSequence;)Z
        //   157: ifeq            175
        //   160: aload_2        
        //   161: iconst_0       
        //   162: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   167: checkcast       Ljava/lang/String;
        //   170: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   173: istore          8
        //   175: aload_1        
        //   176: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   179: iload           8
        //   181: aload           4
        //   183: invokestatic    android/graphics/BitmapFactory.decodeResource:(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   186: astore_1       
        //   187: goto            280
        //   190: aload_3        
        //   191: ldc             "file:///android_asset/"
        //   193: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   196: istore          9
        //   198: aconst_null    
        //   199: astore          5
        //   201: iload           9
        //   203: ifeq            231
        //   206: aload_3        
        //   207: bipush          22
        //   209: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   212: astore_2       
        //   213: aload_1        
        //   214: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   217: aload_2        
        //   218: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   221: aconst_null    
        //   222: aload           4
        //   224: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   227: astore_1       
        //   228: goto            280
        //   231: aload_3        
        //   232: ldc             "file://"
        //   234: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   237: ifeq            255
        //   240: aload_3        
        //   241: bipush          7
        //   243: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   246: aload           4
        //   248: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   251: astore_1       
        //   252: goto            280
        //   255: aload_1        
        //   256: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   259: aload_2        
        //   260: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   263: astore_2       
        //   264: aload_2        
        //   265: aconst_null    
        //   266: aload           4
        //   268: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   271: astore_1       
        //   272: aload_2        
        //   273: ifnull          280
        //   276: aload_2        
        //   277: invokevirtual   java/io/InputStream.close:()V
        //   280: aload_1        
        //   281: ifnull          286
        //   284: aload_1        
        //   285: areturn        
        //   286: new             Ljava/lang/RuntimeException;
        //   289: dup            
        //   290: ldc             "Skia image region decoder returned null bitmap - image format may not be supported"
        //   292: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   295: athrow         
        //   296: astore_1       
        //   297: goto            304
        //   300: astore_1       
        //   301: aload           5
        //   303: astore_2       
        //   304: aload_2        
        //   305: ifnull          312
        //   308: aload_2        
        //   309: invokevirtual   java/io/InputStream.close:()V
        //   312: aload_1        
        //   313: athrow         
        //   314: astore_2       
        //   315: iload           7
        //   317: istore          8
        //   319: goto            175
        //   322: astore_2       
        //   323: goto            280
        //   326: astore_2       
        //   327: goto            312
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  160    175    314    322    Ljava/lang/NumberFormatException;
        //  255    264    300    304    Any
        //  264    272    296    300    Any
        //  276    280    322    326    Ljava/lang/Exception;
        //  308    312    326    330    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 160, Size: 160
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
}
