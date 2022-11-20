// 
// Decompiled by Procyon v0.6.0
// 

package q8;

import android.provider.MediaStore$Video$Thumbnails;
import android.provider.MediaStore$Images$Thumbnails;
import android.database.Cursor;
import android.content.ContentResolver;
import java.io.FileNotFoundException;
import android.util.Log;
import com.bumptech.glide.load.data.d$a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import com.bumptech.glide.load.data.d;

public final class a implements d<InputStream>
{
    public final Uri f;
    public final c g;
    public InputStream h;
    
    public a(final Uri f, final c g) {
        this.f = f;
        this.g = g;
    }
    
    public static a e(final Context context, final Uri uri, final q8.b b) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).i.d(), b, com.bumptech.glide.b.b(context).j, context.getContentResolver()));
    }
    
    public final Class<InputStream> a() {
        return InputStream.class;
    }
    
    public final void b() {
        final InputStream h = this.h;
        if (h == null) {
            return;
        }
        try {
            h.close();
        }
        catch (final IOException ex) {}
    }
    
    public final DataSource c() {
        return DataSource.LOCAL;
    }
    
    public final void cancel() {
    }
    
    public final void d(final Priority priority, final d$a<? super InputStream> d$a) {
        try {
            d$a.e((Object)(this.h = this.f()));
        }
        catch (final FileNotFoundException ex) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", (Throwable)ex);
            }
            d$a.f((Exception)ex);
        }
    }
    
    public final InputStream f() throws FileNotFoundException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        q8/a.g:Lq8/c;
        //     4: astore          10
        //     6: aload_0        
        //     7: getfield        q8/a.f:Landroid/net/Uri;
        //    10: astore          9
        //    12: aload           10
        //    14: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    17: pop            
        //    18: iconst_0       
        //    19: istore_2       
        //    20: aconst_null    
        //    21: astore          7
        //    23: aconst_null    
        //    24: astore          6
        //    26: aconst_null    
        //    27: astore          4
        //    29: aconst_null    
        //    30: astore          8
        //    32: aload           10
        //    34: getfield        q8/c.a:Lq8/b;
        //    37: aload           9
        //    39: invokeinterface q8/b.a:(Landroid/net/Uri;)Landroid/database/Cursor;
        //    44: astore_3       
        //    45: aload_3        
        //    46: ifnull          94
        //    49: aload_3        
        //    50: astore          4
        //    52: aload_3        
        //    53: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    58: ifeq            94
        //    61: aload_3        
        //    62: astore          4
        //    64: aload_3        
        //    65: iconst_0       
        //    66: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    71: astore          5
        //    73: aload_3        
        //    74: invokeinterface android/database/Cursor.close:()V
        //    79: aload           5
        //    81: astore_3       
        //    82: goto            187
        //    85: astore_3       
        //    86: goto            555
        //    89: astore          5
        //    91: goto            109
        //    94: aload_3        
        //    95: ifnull          185
        //    98: goto            179
        //   101: astore_3       
        //   102: goto            555
        //   105: astore          5
        //   107: aconst_null    
        //   108: astore_3       
        //   109: aload_3        
        //   110: astore          4
        //   112: ldc             "ThumbStreamOpener"
        //   114: iconst_3       
        //   115: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   118: ifeq            175
        //   121: aload_3        
        //   122: astore          4
        //   124: new             Ljava/lang/StringBuilder;
        //   127: astore          11
        //   129: aload_3        
        //   130: astore          4
        //   132: aload           11
        //   134: invokespecial   java/lang/StringBuilder.<init>:()V
        //   137: aload_3        
        //   138: astore          4
        //   140: aload           11
        //   142: ldc             "Failed to query for thumbnail for Uri: "
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: pop            
        //   148: aload_3        
        //   149: astore          4
        //   151: aload           11
        //   153: aload           9
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   158: pop            
        //   159: aload_3        
        //   160: astore          4
        //   162: ldc             "ThumbStreamOpener"
        //   164: aload           11
        //   166: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   169: aload           5
        //   171: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   174: pop            
        //   175: aload_3        
        //   176: ifnull          185
        //   179: aload_3        
        //   180: invokeinterface android/database/Cursor.close:()V
        //   185: aconst_null    
        //   186: astore_3       
        //   187: aload_3        
        //   188: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   191: ifeq            199
        //   194: aconst_null    
        //   195: astore_3       
        //   196: goto            254
        //   199: new             Ljava/io/File;
        //   202: dup            
        //   203: aload_3        
        //   204: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   207: astore_3       
        //   208: iload_2        
        //   209: istore_1       
        //   210: aload_3        
        //   211: invokevirtual   java/io/File.exists:()Z
        //   214: ifeq            230
        //   217: iload_2        
        //   218: istore_1       
        //   219: lconst_0       
        //   220: aload_3        
        //   221: invokevirtual   java/io/File.length:()J
        //   224: lcmp           
        //   225: ifge            230
        //   228: iconst_1       
        //   229: istore_1       
        //   230: iload_1        
        //   231: ifne            237
        //   234: goto            194
        //   237: aload_3        
        //   238: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   241: astore          4
        //   243: aload           10
        //   245: getfield        q8/c.c:Landroid/content/ContentResolver;
        //   248: aload           4
        //   250: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   253: astore_3       
        //   254: aload_3        
        //   255: ifnull          473
        //   258: aload_0        
        //   259: getfield        q8/a.g:Lq8/c;
        //   262: astore          10
        //   264: aload_0        
        //   265: getfield        q8/a.f:Landroid/net/Uri;
        //   268: astore          9
        //   270: aload           10
        //   272: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   275: pop            
        //   276: aload           8
        //   278: astore          4
        //   280: aload           7
        //   282: astore          5
        //   284: aload           10
        //   286: getfield        q8/c.c:Landroid/content/ContentResolver;
        //   289: aload           9
        //   291: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   294: astore          7
        //   296: aload           7
        //   298: astore          4
        //   300: aload           7
        //   302: astore          5
        //   304: aload           7
        //   306: astore          6
        //   308: aload           10
        //   310: getfield        q8/c.d:Ljava/util/List;
        //   313: astore          8
        //   315: aload           7
        //   317: astore          4
        //   319: aload           7
        //   321: astore          5
        //   323: aload           7
        //   325: astore          6
        //   327: aload           10
        //   329: getfield        q8/c.b:Ls8/b;
        //   332: aload           7
        //   334: aload           8
        //   336: invokestatic    com/bumptech/glide/load/d.a:(Ls8/b;Ljava/io/InputStream;Ljava/util/List;)I
        //   339: istore_2       
        //   340: iload_2        
        //   341: istore_1       
        //   342: aload           7
        //   344: ifnull          475
        //   347: aload           7
        //   349: invokevirtual   java/io/InputStream.close:()V
        //   352: iload_2        
        //   353: istore_1       
        //   354: goto            475
        //   357: astore_3       
        //   358: goto            461
        //   361: astore          6
        //   363: goto            376
        //   366: astore          4
        //   368: aload           6
        //   370: astore          5
        //   372: aload           4
        //   374: astore          6
        //   376: aload           5
        //   378: astore          4
        //   380: ldc             "ThumbStreamOpener"
        //   382: iconst_3       
        //   383: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   386: ifeq            448
        //   389: aload           5
        //   391: astore          4
        //   393: new             Ljava/lang/StringBuilder;
        //   396: astore          7
        //   398: aload           5
        //   400: astore          4
        //   402: aload           7
        //   404: invokespecial   java/lang/StringBuilder.<init>:()V
        //   407: aload           5
        //   409: astore          4
        //   411: aload           7
        //   413: ldc             "Failed to open uri: "
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   418: pop            
        //   419: aload           5
        //   421: astore          4
        //   423: aload           7
        //   425: aload           9
        //   427: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   430: pop            
        //   431: aload           5
        //   433: astore          4
        //   435: ldc             "ThumbStreamOpener"
        //   437: aload           7
        //   439: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   442: aload           6
        //   444: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   447: pop            
        //   448: aload           5
        //   450: ifnull          473
        //   453: aload           5
        //   455: invokevirtual   java/io/InputStream.close:()V
        //   458: goto            473
        //   461: aload           4
        //   463: ifnull          471
        //   466: aload           4
        //   468: invokevirtual   java/io/InputStream.close:()V
        //   471: aload_3        
        //   472: athrow         
        //   473: iconst_m1      
        //   474: istore_1       
        //   475: aload_3        
        //   476: astore          4
        //   478: iload_1        
        //   479: iconst_m1      
        //   480: if_icmpeq       494
        //   483: new             Lcom/bumptech/glide/load/data/g;
        //   486: dup            
        //   487: aload_3        
        //   488: iload_1        
        //   489: invokespecial   com/bumptech/glide/load/data/g.<init>:(Ljava/io/InputStream;I)V
        //   492: astore          4
        //   494: aload           4
        //   496: areturn        
        //   497: astore          5
        //   499: new             Ljava/lang/StringBuilder;
        //   502: dup            
        //   503: invokespecial   java/lang/StringBuilder.<init>:()V
        //   506: astore_3       
        //   507: aload_3        
        //   508: ldc             "NPE opening uri: "
        //   510: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   513: pop            
        //   514: aload_3        
        //   515: aload           9
        //   517: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   520: pop            
        //   521: aload_3        
        //   522: ldc             " -> "
        //   524: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   527: pop            
        //   528: aload_3        
        //   529: aload           4
        //   531: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   534: pop            
        //   535: new             Ljava/io/FileNotFoundException;
        //   538: dup            
        //   539: aload_3        
        //   540: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   543: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   546: aload           5
        //   548: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   551: checkcast       Ljava/io/FileNotFoundException;
        //   554: athrow         
        //   555: aload           4
        //   557: ifnull          567
        //   560: aload           4
        //   562: invokeinterface android/database/Cursor.close:()V
        //   567: aload_3        
        //   568: athrow         
        //   569: astore          4
        //   571: iload_2        
        //   572: istore_1       
        //   573: goto            475
        //   576: astore          4
        //   578: goto            473
        //   581: astore          4
        //   583: goto            471
        //    Exceptions:
        //  throws java.io.FileNotFoundException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  32     45     105    109    Ljava/lang/SecurityException;
        //  32     45     101    105    Any
        //  52     61     89     94     Ljava/lang/SecurityException;
        //  52     61     85     89     Any
        //  64     73     89     94     Ljava/lang/SecurityException;
        //  64     73     85     89     Any
        //  112    121    85     89     Any
        //  124    129    85     89     Any
        //  132    137    85     89     Any
        //  140    148    85     89     Any
        //  151    159    85     89     Any
        //  162    175    85     89     Any
        //  243    254    497    555    Ljava/lang/NullPointerException;
        //  284    296    366    376    Ljava/io/IOException;
        //  284    296    361    366    Ljava/lang/NullPointerException;
        //  284    296    357    473    Any
        //  308    315    366    376    Ljava/io/IOException;
        //  308    315    361    366    Ljava/lang/NullPointerException;
        //  308    315    357    473    Any
        //  327    340    366    376    Ljava/io/IOException;
        //  327    340    361    366    Ljava/lang/NullPointerException;
        //  327    340    357    473    Any
        //  347    352    569    576    Ljava/io/IOException;
        //  380    389    357    473    Any
        //  393    398    357    473    Any
        //  402    407    357    473    Any
        //  411    419    357    473    Any
        //  423    431    357    473    Any
        //  435    448    357    473    Any
        //  453    458    576    581    Ljava/io/IOException;
        //  466    471    581    586    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException
        //     at java.util.Collections$1.remove(Unknown Source)
        //     at java.util.AbstractCollection.removeAll(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3018)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static final class a implements q8.b
    {
        public static final String[] b;
        public final ContentResolver a;
        
        static {
            b = new String[] { "_data" };
        }
        
        public a(final ContentResolver a) {
            this.a = a;
        }
        
        public final Cursor a(final Uri uri) {
            return this.a.query(MediaStore$Images$Thumbnails.EXTERNAL_CONTENT_URI, q8.a.a.b, "kind = 1 AND image_id = ?", new String[] { uri.getLastPathSegment() }, (String)null);
        }
    }
    
    public static final class b implements q8.b
    {
        public static final String[] b;
        public final ContentResolver a;
        
        static {
            b = new String[] { "_data" };
        }
        
        public b(final ContentResolver a) {
            this.a = a;
        }
        
        public final Cursor a(final Uri uri) {
            return this.a.query(MediaStore$Video$Thumbnails.EXTERNAL_CONTENT_URI, q8.a.b.b, "kind = 1 AND video_id = ?", new String[] { uri.getLastPathSegment() }, (String)null);
        }
    }
}
