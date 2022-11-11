// 
// Decompiled by Procyon v0.6.0
// 

package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Point;
import android.net.Uri;
import android.content.Context;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.concurrent.locks.Lock;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import androidx.annotation.Keep;
import java.util.concurrent.locks.ReadWriteLock;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Bitmap$Config;

public class SkiaImageRegionDecoder implements ImageRegionDecoder
{
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap$Config bitmapConfig;
    private BitmapRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    
    @Keep
    public SkiaImageRegionDecoder() {
        this(null);
    }
    
    public SkiaImageRegionDecoder(final Bitmap$Config bitmapConfig) {
        this.decoderLock = new ReentrantReadWriteLock(true);
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
    
    private Lock getDecodeLock() {
        return this.decoderLock.readLock();
    }
    
    public Bitmap decodeRegion(final Rect rect, final int inSampleSize) {
        this.getDecodeLock().lock();
        try {
            final BitmapRegionDecoder decoder = this.decoder;
            if (decoder == null || decoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
            bitmapFactory$Options.inSampleSize = inSampleSize;
            bitmapFactory$Options.inPreferredConfig = this.bitmapConfig;
            final Bitmap decodeRegion = this.decoder.decodeRegion(rect, bitmapFactory$Options);
            if (decodeRegion != null) {
                return decodeRegion;
            }
            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
        }
        finally {
            this.getDecodeLock().unlock();
        }
    }
    
    public Point init(final Context p0, final Uri p1) throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ldc             "android.resource://"
        //     8: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    11: ifeq            173
        //    14: aload_2        
        //    15: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //    18: astore          4
        //    20: aload_1        
        //    21: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    24: aload           4
        //    26: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    29: ifeq            40
        //    32: aload_1        
        //    33: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    36: astore_3       
        //    37: goto            50
        //    40: aload_1        
        //    41: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    44: aload           4
        //    46: invokevirtual   android/content/pm/PackageManager.getResourcesForApplication:(Ljava/lang/String;)Landroid/content/res/Resources;
        //    49: astore_3       
        //    50: aload_2        
        //    51: invokevirtual   android/net/Uri.getPathSegments:()Ljava/util/List;
        //    54: astore_2       
        //    55: aload_2        
        //    56: invokeinterface java/util/List.size:()I
        //    61: istore          5
        //    63: iload           5
        //    65: iconst_2       
        //    66: if_icmpne       110
        //    69: aload_2        
        //    70: iconst_0       
        //    71: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    76: checkcast       Ljava/lang/String;
        //    79: ldc             "drawable"
        //    81: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    84: ifeq            110
        //    87: aload_3        
        //    88: aload_2        
        //    89: iconst_1       
        //    90: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    95: checkcast       Ljava/lang/String;
        //    98: ldc             "drawable"
        //   100: aload           4
        //   102: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   105: istore          5
        //   107: goto            153
        //   110: iload           5
        //   112: iconst_1       
        //   113: if_icmpne       150
        //   116: aload_2        
        //   117: iconst_0       
        //   118: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   123: checkcast       Ljava/lang/CharSequence;
        //   126: invokestatic    android/text/TextUtils.isDigitsOnly:(Ljava/lang/CharSequence;)Z
        //   129: ifeq            150
        //   132: aload_2        
        //   133: iconst_0       
        //   134: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   139: checkcast       Ljava/lang/String;
        //   142: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   145: istore          5
        //   147: goto            153
        //   150: iconst_0       
        //   151: istore          5
        //   153: aload_0        
        //   154: aload_1        
        //   155: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   158: iload           5
        //   160: invokevirtual   android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
        //   163: iconst_0       
        //   164: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
        //   167: putfield        com/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder.decoder:Landroid/graphics/BitmapRegionDecoder;
        //   170: goto            265
        //   173: aload_3        
        //   174: ldc             "file:///android_asset/"
        //   176: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   179: ifeq            209
        //   182: aload_3        
        //   183: bipush          22
        //   185: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   188: astore_2       
        //   189: aload_0        
        //   190: aload_1        
        //   191: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   194: aload_2        
        //   195: iconst_1       
        //   196: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;I)Ljava/io/InputStream;
        //   199: iconst_0       
        //   200: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
        //   203: putfield        com/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder.decoder:Landroid/graphics/BitmapRegionDecoder;
        //   206: goto            265
        //   209: aload_3        
        //   210: ldc             "file://"
        //   212: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   215: ifeq            235
        //   218: aload_0        
        //   219: aload_3        
        //   220: bipush          7
        //   222: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   225: iconst_0       
        //   226: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/lang/String;Z)Landroid/graphics/BitmapRegionDecoder;
        //   229: putfield        com/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder.decoder:Landroid/graphics/BitmapRegionDecoder;
        //   232: goto            265
        //   235: aconst_null    
        //   236: astore_3       
        //   237: aload_1        
        //   238: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   241: aload_2        
        //   242: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   245: astore_1       
        //   246: aload_1        
        //   247: astore_3       
        //   248: aload_0        
        //   249: aload_1        
        //   250: iconst_0       
        //   251: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
        //   254: putfield        com/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder.decoder:Landroid/graphics/BitmapRegionDecoder;
        //   257: aload_1        
        //   258: ifnull          265
        //   261: aload_1        
        //   262: invokevirtual   java/io/InputStream.close:()V
        //   265: new             Landroid/graphics/Point;
        //   268: dup            
        //   269: aload_0        
        //   270: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder.decoder:Landroid/graphics/BitmapRegionDecoder;
        //   273: invokevirtual   android/graphics/BitmapRegionDecoder.getWidth:()I
        //   276: aload_0        
        //   277: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaImageRegionDecoder.decoder:Landroid/graphics/BitmapRegionDecoder;
        //   280: invokevirtual   android/graphics/BitmapRegionDecoder.getHeight:()I
        //   283: invokespecial   android/graphics/Point.<init>:(II)V
        //   286: areturn        
        //   287: astore_1       
        //   288: aload_3        
        //   289: ifnull          296
        //   292: aload_3        
        //   293: invokevirtual   java/io/InputStream.close:()V
        //   296: aload_1        
        //   297: athrow         
        //   298: astore_2       
        //   299: goto            150
        //   302: astore_1       
        //   303: goto            265
        //   306: astore_2       
        //   307: goto            296
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  132    147    298    302    Ljava/lang/NumberFormatException;
        //  237    246    287    298    Any
        //  248    257    287    298    Any
        //  261    265    302    306    Ljava/lang/Exception;
        //  292    296    306    310    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 148, Size: 148
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
    
    public boolean isReady() {
        synchronized (this) {
            final BitmapRegionDecoder decoder = this.decoder;
            return decoder != null && !decoder.isRecycled();
        }
    }
    
    public void recycle() {
        synchronized (this) {
            this.decoderLock.writeLock().lock();
            try {
                this.decoder.recycle();
                this.decoder = null;
            }
            finally {
                this.decoderLock.writeLock().unlock();
            }
        }
    }
}
