// 
// Decompiled by Procyon v0.6.0
// 

package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.BitmapRegionDecoder;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.Rect;
import al0.b;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import java.io.FileFilter;
import java.io.File;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import androidx.annotation.Keep;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import android.graphics.Point;
import java.util.concurrent.locks.ReadWriteLock;
import android.content.Context;
import android.graphics.Bitmap$Config;

public class SkiaPooledImageRegionDecoder implements ImageRegionDecoder
{
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private static final String TAG = "SkiaPooledImageRegionDecoder";
    private static boolean debug;
    private final Bitmap$Config bitmapConfig;
    private Context context;
    private final ReadWriteLock decoderLock;
    private SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool decoderPool;
    private long fileLength;
    private final Point imageDimensions;
    private final AtomicBoolean lazyInited;
    private Uri uri;
    
    @Keep
    public SkiaPooledImageRegionDecoder() {
        this(null);
    }
    
    public SkiaPooledImageRegionDecoder(final Bitmap$Config bitmapConfig) {
        this.decoderPool = new SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool((SkiaPooledImageRegionDecoder$1)null);
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.fileLength = Long.MAX_VALUE;
        this.imageDimensions = new Point(0, 0);
        this.lazyInited = new AtomicBoolean(false);
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
    
    private void debug(final String s) {
        if (SkiaPooledImageRegionDecoder.debug) {
            Log.d(SkiaPooledImageRegionDecoder.TAG, s);
        }
    }
    
    private int getNumCoresOldPhones() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles((FileFilter)new SkiaPooledImageRegionDecoder$1CpuFilter(this)).length;
        }
        catch (final Exception ex) {
            return 1;
        }
    }
    
    private int getNumberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }
    
    private void initialiseDecoder() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.uri:Landroid/net/Uri;
        //     4: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //     7: astore_1       
        //     8: aload_1        
        //     9: ldc             "android.resource://"
        //    11: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    14: istore_2       
        //    15: ldc2_w          9223372036854775807
        //    18: lstore_3       
        //    19: iload_2        
        //    20: ifeq            221
        //    23: aload_0        
        //    24: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.uri:Landroid/net/Uri;
        //    27: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //    30: astore          5
        //    32: aload_0        
        //    33: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.context:Landroid/content/Context;
        //    36: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    39: aload           5
        //    41: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    44: ifeq            59
        //    47: aload_0        
        //    48: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.context:Landroid/content/Context;
        //    51: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    54: astore          6
        //    56: goto            73
        //    59: aload_0        
        //    60: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.context:Landroid/content/Context;
        //    63: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    66: aload           5
        //    68: invokevirtual   android/content/pm/PackageManager.getResourcesForApplication:(Ljava/lang/String;)Landroid/content/res/Resources;
        //    71: astore          6
        //    73: aload_0        
        //    74: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.uri:Landroid/net/Uri;
        //    77: invokevirtual   android/net/Uri.getPathSegments:()Ljava/util/List;
        //    80: astore_1       
        //    81: aload_1        
        //    82: invokeinterface java/util/List.size:()I
        //    87: istore          7
        //    89: iload           7
        //    91: iconst_2       
        //    92: if_icmpne       137
        //    95: aload_1        
        //    96: iconst_0       
        //    97: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   102: checkcast       Ljava/lang/String;
        //   105: ldc             "drawable"
        //   107: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   110: ifeq            137
        //   113: aload           6
        //   115: aload_1        
        //   116: iconst_1       
        //   117: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   122: checkcast       Ljava/lang/String;
        //   125: ldc             "drawable"
        //   127: aload           5
        //   129: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   132: istore          7
        //   134: goto            180
        //   137: iload           7
        //   139: iconst_1       
        //   140: if_icmpne       177
        //   143: aload_1        
        //   144: iconst_0       
        //   145: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   150: checkcast       Ljava/lang/CharSequence;
        //   153: invokestatic    android/text/TextUtils.isDigitsOnly:(Ljava/lang/CharSequence;)Z
        //   156: ifeq            177
        //   159: aload_1        
        //   160: iconst_0       
        //   161: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   166: checkcast       Ljava/lang/String;
        //   169: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   172: istore          7
        //   174: goto            180
        //   177: iconst_0       
        //   178: istore          7
        //   180: aload_0        
        //   181: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.context:Landroid/content/Context;
        //   184: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   187: iload           7
        //   189: invokevirtual   android/content/res/Resources.openRawResourceFd:(I)Landroid/content/res/AssetFileDescriptor;
        //   192: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //   195: lstore          8
        //   197: lload           8
        //   199: lstore_3       
        //   200: aload_0        
        //   201: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.context:Landroid/content/Context;
        //   204: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   207: iload           7
        //   209: invokevirtual   android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
        //   212: iconst_0       
        //   213: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
        //   216: astore          6
        //   218: goto            426
        //   221: aload_1        
        //   222: ldc             "file:///android_asset/"
        //   224: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   227: ifeq            280
        //   230: aload_1        
        //   231: bipush          22
        //   233: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   236: astore          5
        //   238: aload_0        
        //   239: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.context:Landroid/content/Context;
        //   242: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   245: aload           5
        //   247: invokevirtual   android/content/res/AssetManager.openFd:(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //   250: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //   253: lstore          8
        //   255: lload           8
        //   257: lstore_3       
        //   258: aload_0        
        //   259: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.context:Landroid/content/Context;
        //   262: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   265: aload           5
        //   267: iconst_1       
        //   268: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;I)Ljava/io/InputStream;
        //   271: iconst_0       
        //   272: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
        //   275: astore          6
        //   277: goto            426
        //   280: aload_1        
        //   281: ldc             "file://"
        //   283: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   286: ifeq            336
        //   289: aload_1        
        //   290: bipush          7
        //   292: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   295: iconst_0       
        //   296: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/lang/String;Z)Landroid/graphics/BitmapRegionDecoder;
        //   299: astore          6
        //   301: new             Ljava/io/File;
        //   304: astore          5
        //   306: aload           5
        //   308: aload_1        
        //   309: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   312: lload_3        
        //   313: lstore          8
        //   315: aload           5
        //   317: invokevirtual   java/io/File.exists:()Z
        //   320: ifeq            330
        //   323: aload           5
        //   325: invokevirtual   java/io/File.length:()J
        //   328: lstore          8
        //   330: lload           8
        //   332: lstore_3       
        //   333: goto            426
        //   336: aconst_null    
        //   337: astore          5
        //   339: aload           5
        //   341: astore          6
        //   343: aload_0        
        //   344: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.context:Landroid/content/Context;
        //   347: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   350: astore          10
        //   352: aload           5
        //   354: astore          6
        //   356: aload           10
        //   358: aload_0        
        //   359: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.uri:Landroid/net/Uri;
        //   362: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   365: astore_1       
        //   366: aload_1        
        //   367: astore          6
        //   369: aload_1        
        //   370: iconst_0       
        //   371: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
        //   374: astore          5
        //   376: aload_1        
        //   377: astore          6
        //   379: aload           10
        //   381: aload_0        
        //   382: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.uri:Landroid/net/Uri;
        //   385: ldc_w           "r"
        //   388: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //   391: astore          10
        //   393: lload_3        
        //   394: lstore          8
        //   396: aload           10
        //   398: ifnull          411
        //   401: aload_1        
        //   402: astore          6
        //   404: aload           10
        //   406: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //   409: lstore          8
        //   411: aload_1        
        //   412: ifnull          419
        //   415: aload_1        
        //   416: invokevirtual   java/io/InputStream.close:()V
        //   419: aload           5
        //   421: astore          6
        //   423: lload           8
        //   425: lstore_3       
        //   426: aload_0        
        //   427: lload_3        
        //   428: putfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.fileLength:J
        //   431: aload_0        
        //   432: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.imageDimensions:Landroid/graphics/Point;
        //   435: aload           6
        //   437: invokevirtual   android/graphics/BitmapRegionDecoder.getWidth:()I
        //   440: aload           6
        //   442: invokevirtual   android/graphics/BitmapRegionDecoder.getHeight:()I
        //   445: invokevirtual   android/graphics/Point.set:(II)V
        //   448: aload_0        
        //   449: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;
        //   452: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock:()Ljava/util/concurrent/locks/Lock;
        //   457: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //   462: aload_0        
        //   463: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.decoderPool:Lcom/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder$DecoderPool;
        //   466: astore          5
        //   468: aload           5
        //   470: ifnull          480
        //   473: aload           5
        //   475: aload           6
        //   477: invokestatic    com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder$DecoderPool.access$600:(Lcom/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder$DecoderPool;Landroid/graphics/BitmapRegionDecoder;)V
        //   480: aload_0        
        //   481: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;
        //   484: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock:()Ljava/util/concurrent/locks/Lock;
        //   489: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   494: return         
        //   495: astore          6
        //   497: aload_0        
        //   498: getfield        com/davemorrissey/labs/subscaleview/decoder/SkiaPooledImageRegionDecoder.decoderLock:Ljava/util/concurrent/locks/ReadWriteLock;
        //   501: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock:()Ljava/util/concurrent/locks/Lock;
        //   506: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   511: aload           6
        //   513: athrow         
        //   514: astore          5
        //   516: aload           6
        //   518: ifnull          526
        //   521: aload           6
        //   523: invokevirtual   java/io/InputStream.close:()V
        //   526: aload           5
        //   528: athrow         
        //   529: astore          6
        //   531: goto            177
        //   534: astore          6
        //   536: goto            200
        //   539: astore          6
        //   541: goto            258
        //   544: astore          5
        //   546: lload_3        
        //   547: lstore          8
        //   549: goto            330
        //   552: astore          6
        //   554: lload_3        
        //   555: lstore          8
        //   557: goto            411
        //   560: astore          6
        //   562: goto            419
        //   565: astore          6
        //   567: goto            526
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  159    174    529    534    Ljava/lang/NumberFormatException;
        //  180    197    534    539    Ljava/lang/Exception;
        //  238    255    539    544    Ljava/lang/Exception;
        //  301    312    544    552    Ljava/lang/Exception;
        //  315    330    544    552    Ljava/lang/Exception;
        //  343    352    514    529    Any
        //  356    366    514    529    Any
        //  369    376    514    529    Any
        //  379    393    552    560    Ljava/lang/Exception;
        //  379    393    514    529    Any
        //  404    411    552    560    Ljava/lang/Exception;
        //  404    411    514    529    Any
        //  415    419    560    565    Ljava/lang/Exception;
        //  462    468    495    514    Any
        //  473    480    495    514    Any
        //  521    526    565    570    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 254, Size: 254
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
    
    private boolean isLowMemory() {
        final ActivityManager activityManager = (ActivityManager)this.context.getSystemService("activity");
        if (activityManager != null) {
            final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
            activityManager.getMemoryInfo(activityManager$MemoryInfo);
            return activityManager$MemoryInfo.lowMemory;
        }
        return true;
    }
    
    private void lazyInit() {
        if (this.lazyInited.compareAndSet(false, true) && this.fileLength < Long.MAX_VALUE) {
            this.debug("Starting lazy init of additional decoders");
            ((Thread)new SkiaPooledImageRegionDecoder$1(this)).start();
        }
    }
    
    @Keep
    public static void setDebug(final boolean debug) {
        SkiaPooledImageRegionDecoder.debug = debug;
    }
    
    public boolean allowAdditionalDecoder(final int n, long n2) {
        if (n >= 4) {
            this.debug("No additional decoders allowed, reached hard limit (4)");
            return false;
        }
        n2 *= n;
        if (n2 > 20971520L) {
            this.debug("No additional encoders allowed, reached hard memory limit (20Mb)");
            return false;
        }
        if (n >= this.getNumberOfCores()) {
            this.debug(al0.a.l(a.r("No additional encoders allowed, limited by CPU cores ("), this.getNumberOfCores(), ")"));
            return false;
        }
        if (this.isLowMemory()) {
            this.debug("No additional encoders allowed, memory is low");
            return false;
        }
        final StringBuilder i = b.i("Additional decoder allowed, current count is ", n, ", estimated native memory ");
        i.append(n2 / 1048576L);
        i.append("Mb");
        this.debug(i.toString());
        return true;
    }
    
    public Bitmap decodeRegion(final Rect rect, final int inSampleSize) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Decode region ");
        sb.append(rect);
        sb.append(" on thread ");
        sb.append(Thread.currentThread().getName());
        this.debug(sb.toString());
        if (rect.width() < this.imageDimensions.x || rect.height() < this.imageDimensions.y) {
            this.lazyInit();
        }
        this.decoderLock.readLock().lock();
        try {
            final SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool decoderPool = this.decoderPool;
            if (decoderPool != null) {
                final BitmapRegionDecoder access$700 = SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool.access$700(decoderPool);
                if (access$700 != null) {
                    try {
                        if (!access$700.isRecycled()) {
                            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                            bitmapFactory$Options.inSampleSize = inSampleSize;
                            bitmapFactory$Options.inPreferredConfig = this.bitmapConfig;
                            final Bitmap decodeRegion = access$700.decodeRegion(rect, bitmapFactory$Options);
                            if (decodeRegion != null) {
                                return decodeRegion;
                            }
                            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                        }
                    }
                    finally {
                        SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool.access$800(this.decoderPool, access$700);
                    }
                }
                if (access$700 != null) {
                    SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool.access$800(this.decoderPool, access$700);
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        }
        finally {
            this.decoderLock.readLock().unlock();
        }
    }
    
    public Point init(final Context context, final Uri uri) throws Exception {
        this.context = context;
        this.uri = uri;
        this.initialiseDecoder();
        return this.imageDimensions;
    }
    
    public boolean isReady() {
        synchronized (this) {
            final SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool decoderPool = this.decoderPool;
            return decoderPool != null && !SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool.access$900(decoderPool);
        }
    }
    
    public void recycle() {
        synchronized (this) {
            this.decoderLock.writeLock().lock();
            try {
                final SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool decoderPool = this.decoderPool;
                if (decoderPool != null) {
                    SkiaPooledImageRegionDecoder.SkiaPooledImageRegionDecoder$DecoderPool.access$1000(decoderPool);
                    this.decoderPool = null;
                    this.context = null;
                    this.uri = null;
                }
            }
            finally {
                this.decoderLock.writeLock().unlock();
            }
        }
    }
}
