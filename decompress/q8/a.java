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
        return new a(uri, new c(com.bumptech.glide.c.b(context).i.d(), b, com.bumptech.glide.c.b(context).j, context.getContentResolver()));
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
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        q8/a.f:Landroid/net/Uri;
        //     9: astore_2       
        //    10: aload_1        
        //    11: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    14: pop            
        //    15: iconst_0       
        //    16: istore_3       
        //    17: aconst_null    
        //    18: astore          4
        //    20: aconst_null    
        //    21: astore          5
        //    23: aconst_null    
        //    24: astore          6
        //    26: aconst_null    
        //    27: astore          7
        //    29: aload_1        
        //    30: getfield        q8/c.a:Lq8/b;
        //    33: aload_2        
        //    34: invokeinterface q8/b.a:(Landroid/net/Uri;)Landroid/database/Cursor;
        //    39: astore          8
        //    41: aload           8
        //    43: ifnull          98
        //    46: aload           8
        //    48: astore          6
        //    50: aload           8
        //    52: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    57: ifeq            98
        //    60: aload           8
        //    62: astore          6
        //    64: aload           8
        //    66: iconst_0       
        //    67: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    72: astore          9
        //    74: aload           8
        //    76: invokeinterface android/database/Cursor.close:()V
        //    81: aload           9
        //    83: astore          8
        //    85: goto            202
        //    88: astore          8
        //    90: goto            588
        //    93: astore          9
        //    95: goto            116
        //    98: aload           8
        //   100: ifnull          199
        //   103: goto            192
        //   106: astore          8
        //   108: goto            588
        //   111: astore          9
        //   113: aconst_null    
        //   114: astore          8
        //   116: aload           8
        //   118: astore          6
        //   120: ldc             "ThumbStreamOpener"
        //   122: iconst_3       
        //   123: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   126: ifeq            187
        //   129: aload           8
        //   131: astore          6
        //   133: new             Ljava/lang/StringBuilder;
        //   136: astore          10
        //   138: aload           8
        //   140: astore          6
        //   142: aload           10
        //   144: invokespecial   java/lang/StringBuilder.<init>:()V
        //   147: aload           8
        //   149: astore          6
        //   151: aload           10
        //   153: ldc             "Failed to query for thumbnail for Uri: "
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: pop            
        //   159: aload           8
        //   161: astore          6
        //   163: aload           10
        //   165: aload_2        
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   169: pop            
        //   170: aload           8
        //   172: astore          6
        //   174: ldc             "ThumbStreamOpener"
        //   176: aload           10
        //   178: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   181: aload           9
        //   183: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   186: pop            
        //   187: aload           8
        //   189: ifnull          199
        //   192: aload           8
        //   194: invokeinterface android/database/Cursor.close:()V
        //   199: aconst_null    
        //   200: astore          8
        //   202: aload           8
        //   204: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   207: ifeq            216
        //   210: aconst_null    
        //   211: astore          8
        //   213: goto            280
        //   216: new             Ljava/io/File;
        //   219: dup            
        //   220: aload           8
        //   222: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   225: astore          8
        //   227: iload_3        
        //   228: istore          11
        //   230: aload           8
        //   232: invokevirtual   java/io/File.exists:()Z
        //   235: ifeq            254
        //   238: iload_3        
        //   239: istore          11
        //   241: lconst_0       
        //   242: aload           8
        //   244: invokevirtual   java/io/File.length:()J
        //   247: lcmp           
        //   248: ifge            254
        //   251: iconst_1       
        //   252: istore          11
        //   254: iload           11
        //   256: ifne            262
        //   259: goto            210
        //   262: aload           8
        //   264: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   267: astore          6
        //   269: aload_1        
        //   270: getfield        q8/c.c:Landroid/content/ContentResolver;
        //   273: aload           6
        //   275: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   278: astore          8
        //   280: aload           8
        //   282: ifnull          496
        //   285: aload_0        
        //   286: getfield        q8/a.g:Lq8/c;
        //   289: astore_1       
        //   290: aload_0        
        //   291: getfield        q8/a.f:Landroid/net/Uri;
        //   294: astore_2       
        //   295: aload_1        
        //   296: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   299: pop            
        //   300: aload           7
        //   302: astore          6
        //   304: aload           4
        //   306: astore          9
        //   308: aload_1        
        //   309: getfield        q8/c.c:Landroid/content/ContentResolver;
        //   312: aload_2        
        //   313: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   316: astore          4
        //   318: aload           4
        //   320: astore          6
        //   322: aload           4
        //   324: astore          9
        //   326: aload           4
        //   328: astore          5
        //   330: aload_1        
        //   331: getfield        q8/c.d:Ljava/util/List;
        //   334: astore          7
        //   336: aload           4
        //   338: astore          6
        //   340: aload           4
        //   342: astore          9
        //   344: aload           4
        //   346: astore          5
        //   348: aload_1        
        //   349: getfield        q8/c.b:Ls8/b;
        //   352: aload           4
        //   354: aload           7
        //   356: invokestatic    com/bumptech/glide/load/d.a:(Ls8/b;Ljava/io/InputStream;Ljava/util/List;)I
        //   359: istore_3       
        //   360: iload_3        
        //   361: istore          11
        //   363: aload           4
        //   365: ifnull          499
        //   368: aload           4
        //   370: invokevirtual   java/io/InputStream.close:()V
        //   373: iload_3        
        //   374: istore          11
        //   376: goto            499
        //   379: astore          8
        //   381: goto            483
        //   384: astore          5
        //   386: goto            399
        //   389: astore          6
        //   391: aload           5
        //   393: astore          9
        //   395: aload           6
        //   397: astore          5
        //   399: aload           9
        //   401: astore          6
        //   403: ldc             "ThumbStreamOpener"
        //   405: iconst_3       
        //   406: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   409: ifeq            470
        //   412: aload           9
        //   414: astore          6
        //   416: new             Ljava/lang/StringBuilder;
        //   419: astore          4
        //   421: aload           9
        //   423: astore          6
        //   425: aload           4
        //   427: invokespecial   java/lang/StringBuilder.<init>:()V
        //   430: aload           9
        //   432: astore          6
        //   434: aload           4
        //   436: ldc             "Failed to open uri: "
        //   438: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   441: pop            
        //   442: aload           9
        //   444: astore          6
        //   446: aload           4
        //   448: aload_2        
        //   449: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   452: pop            
        //   453: aload           9
        //   455: astore          6
        //   457: ldc             "ThumbStreamOpener"
        //   459: aload           4
        //   461: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   464: aload           5
        //   466: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   469: pop            
        //   470: aload           9
        //   472: ifnull          496
        //   475: aload           9
        //   477: invokevirtual   java/io/InputStream.close:()V
        //   480: goto            496
        //   483: aload           6
        //   485: ifnull          493
        //   488: aload           6
        //   490: invokevirtual   java/io/InputStream.close:()V
        //   493: aload           8
        //   495: athrow         
        //   496: iconst_m1      
        //   497: istore          11
        //   499: aload           8
        //   501: astore          6
        //   503: iload           11
        //   505: iconst_m1      
        //   506: if_icmpeq       522
        //   509: new             Lcom/bumptech/glide/load/data/g;
        //   512: dup            
        //   513: aload           8
        //   515: iload           11
        //   517: invokespecial   com/bumptech/glide/load/data/g.<init>:(Ljava/io/InputStream;I)V
        //   520: astore          6
        //   522: aload           6
        //   524: areturn        
        //   525: astore          9
        //   527: new             Ljava/lang/StringBuilder;
        //   530: dup            
        //   531: invokespecial   java/lang/StringBuilder.<init>:()V
        //   534: astore          8
        //   536: aload           8
        //   538: ldc             "NPE opening uri: "
        //   540: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   543: pop            
        //   544: aload           8
        //   546: aload_2        
        //   547: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   550: pop            
        //   551: aload           8
        //   553: ldc             " -> "
        //   555: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   558: pop            
        //   559: aload           8
        //   561: aload           6
        //   563: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   566: pop            
        //   567: new             Ljava/io/FileNotFoundException;
        //   570: dup            
        //   571: aload           8
        //   573: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   576: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   579: aload           9
        //   581: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   584: checkcast       Ljava/io/FileNotFoundException;
        //   587: athrow         
        //   588: aload           6
        //   590: ifnull          600
        //   593: aload           6
        //   595: invokeinterface android/database/Cursor.close:()V
        //   600: aload           8
        //   602: athrow         
        //   603: astore          6
        //   605: iload_3        
        //   606: istore          11
        //   608: goto            499
        //   611: astore          6
        //   613: goto            496
        //   616: astore          6
        //   618: goto            493
        //    Exceptions:
        //  throws java.io.FileNotFoundException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  29     41     111    116    Ljava/lang/SecurityException;
        //  29     41     106    111    Any
        //  50     60     93     98     Ljava/lang/SecurityException;
        //  50     60     88     93     Any
        //  64     74     93     98     Ljava/lang/SecurityException;
        //  64     74     88     93     Any
        //  120    129    88     93     Any
        //  133    138    88     93     Any
        //  142    147    88     93     Any
        //  151    159    88     93     Any
        //  163    170    88     93     Any
        //  174    187    88     93     Any
        //  269    280    525    588    Ljava/lang/NullPointerException;
        //  308    318    389    399    Ljava/io/IOException;
        //  308    318    384    389    Ljava/lang/NullPointerException;
        //  308    318    379    496    Any
        //  330    336    389    399    Ljava/io/IOException;
        //  330    336    384    389    Ljava/lang/NullPointerException;
        //  330    336    379    496    Any
        //  348    360    389    399    Ljava/io/IOException;
        //  348    360    384    389    Ljava/lang/NullPointerException;
        //  348    360    379    496    Any
        //  368    373    603    611    Ljava/io/IOException;
        //  403    412    379    496    Any
        //  416    421    379    496    Any
        //  425    430    379    496    Any
        //  434    442    379    496    Any
        //  446    453    379    496    Any
        //  457    470    379    496    Any
        //  475    480    611    616    Ljava/io/IOException;
        //  488    493    616    621    Ljava/io/IOException;
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
    
    public static final class a implements b
    {
        public static final String[] b;
        public final ContentResolver a;
        
        static {
            b = new String[] { "_data" };
        }
        
        public a(final ContentResolver a) {
            this.a = a;
        }
        
        @Override
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
        
        @Override
        public final Cursor a(final Uri uri) {
            return this.a.query(MediaStore$Video$Thumbnails.EXTERNAL_CONTENT_URI, q8.a.b.b, "kind = 1 AND video_id = ?", new String[] { uri.getLastPathSegment() }, (String)null);
        }
    }
}
