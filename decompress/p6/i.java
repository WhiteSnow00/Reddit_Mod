// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import java.util.concurrent.Callable;

public final class i implements Callable
{
    public final int f;
    public final String g;
    public final String h;
    public final Object i;
    
    public i(final String g, final String h, final int f, final Object i) {
        this.f = f;
        this.i = i;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        p6/i.f:I
        //     4: istore_2       
        //     5: iconst_0       
        //     6: istore_1       
        //     7: iconst_0       
        //     8: istore_3       
        //     9: iload_2        
        //    10: tableswitch {
        //                0: 141
        //                1: 58
        //                2: 39
        //          default: 36
        //        }
        //    36: goto            928
        //    39: aload_0        
        //    40: getfield        p6/i.i:Ljava/lang/Object;
        //    43: checkcast       Lcom/reddit/domain/usecase/g;
        //    46: aload_0        
        //    47: getfield        p6/i.g:Ljava/lang/String;
        //    50: aload_0        
        //    51: getfield        p6/i.h:Ljava/lang/String;
        //    54: invokestatic    com/reddit/domain/usecase/g.a:(Lcom/reddit/domain/usecase/g;Ljava/lang/String;Ljava/lang/String;)Lcom/reddit/domain/model/UpdateResponse;
        //    57: areturn        
        //    58: aload_0        
        //    59: getfield        p6/i.i:Ljava/lang/Object;
        //    62: checkcast       Lcom/reddit/data/repository/RedditPreferenceRepository;
        //    65: astore          6
        //    67: aload_0        
        //    68: getfield        p6/i.g:Ljava/lang/String;
        //    71: astore          5
        //    73: aload_0        
        //    74: getfield        p6/i.h:Ljava/lang/String;
        //    77: astore          4
        //    79: aload           6
        //    81: ldc             "this$0"
        //    83: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    86: aload           5
        //    88: ldc             "$set"
        //    90: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    93: aload           4
        //    95: ldc             "$value"
        //    97: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //   100: aload           6
        //   102: getfield        com/reddit/data/repository/RedditPreferenceRepository.c:Landroid/content/SharedPreferences;
        //   105: aload           5
        //   107: new             Ljava/util/HashSet;
        //   110: dup            
        //   111: invokespecial   java/util/HashSet.<init>:()V
        //   114: invokeinterface android/content/SharedPreferences.getStringSet:(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
        //   119: astore          5
        //   121: aload           5
        //   123: ifnull          136
        //   126: aload           5
        //   128: aload           4
        //   130: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   135: istore_3       
        //   136: iload_3        
        //   137: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   140: areturn        
        //   141: aload_0        
        //   142: getfield        p6/i.i:Ljava/lang/Object;
        //   145: checkcast       Landroid/content/Context;
        //   148: astore          6
        //   150: aload_0        
        //   151: getfield        p6/i.g:Ljava/lang/String;
        //   154: astore          10
        //   156: aload_0        
        //   157: getfield        p6/i.h:Ljava/lang/String;
        //   160: astore          9
        //   162: getstatic       hg1/a.B:Lz6/e;
        //   165: astore          4
        //   167: aload           4
        //   169: astore          7
        //   171: aload           4
        //   173: ifnonnull       325
        //   176: ldc             Lz6/e;.class
        //   178: monitorenter   
        //   179: getstatic       hg1/a.B:Lz6/e;
        //   182: astore          5
        //   184: aload           5
        //   186: astore          4
        //   188: aload           5
        //   190: ifnonnull       307
        //   193: new             Lz6/e;
        //   196: astore          5
        //   198: aload           6
        //   200: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //   203: astore          7
        //   205: getstatic       hg1/a.C:Lz6/d;
        //   208: astore          6
        //   210: aload           6
        //   212: astore          4
        //   214: aload           6
        //   216: ifnonnull       279
        //   219: ldc             Lz6/d;.class
        //   221: monitorenter   
        //   222: getstatic       hg1/a.C:Lz6/d;
        //   225: astore          6
        //   227: aload           6
        //   229: astore          4
        //   231: aload           6
        //   233: ifnonnull       265
        //   236: new             Lz6/d;
        //   239: astore          4
        //   241: new             Lp6/c;
        //   244: astore          6
        //   246: aload           6
        //   248: aload           7
        //   250: invokespecial   p6/c.<init>:(Landroid/content/Context;)V
        //   253: aload           4
        //   255: aload           6
        //   257: invokespecial   z6/d.<init>:(Lp6/c;)V
        //   260: aload           4
        //   262: putstatic       hg1/a.C:Lz6/d;
        //   265: ldc             Lz6/d;.class
        //   267: monitorexit    
        //   268: goto            279
        //   271: astore          4
        //   273: ldc             Lz6/d;.class
        //   275: monitorexit    
        //   276: aload           4
        //   278: athrow         
        //   279: new             Lz6/b;
        //   282: astore          6
        //   284: aload           6
        //   286: invokespecial   z6/b.<init>:()V
        //   289: aload           5
        //   291: aload           4
        //   293: aload           6
        //   295: invokespecial   z6/e.<init>:(Lz6/d;Lz6/b;)V
        //   298: aload           5
        //   300: putstatic       hg1/a.B:Lz6/e;
        //   303: aload           5
        //   305: astore          4
        //   307: ldc             Lz6/e;.class
        //   309: monitorexit    
        //   310: aload           4
        //   312: astore          7
        //   314: goto            325
        //   317: astore          4
        //   319: ldc             Lz6/e;.class
        //   321: monitorexit    
        //   322: aload           4
        //   324: athrow         
        //   325: aconst_null    
        //   326: astore          8
        //   328: aconst_null    
        //   329: astore          6
        //   331: aload           9
        //   333: ifnonnull       339
        //   336: goto            584
        //   339: aload           7
        //   341: getfield        z6/e.a:Lz6/d;
        //   344: astore          11
        //   346: aload           11
        //   348: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   351: pop            
        //   352: new             Ljava/io/File;
        //   355: astore          4
        //   357: aload           11
        //   359: invokevirtual   z6/d.b:()Ljava/io/File;
        //   362: astore          12
        //   364: getstatic       com/airbnb/lottie/network/FileExtension.JSON:Lcom/airbnb/lottie/network/FileExtension;
        //   367: astore          5
        //   369: aload           4
        //   371: aload           12
        //   373: aload           10
        //   375: aload           5
        //   377: iconst_0       
        //   378: invokestatic    z6/d.a:(Ljava/lang/String;Lcom/airbnb/lottie/network/FileExtension;Z)Ljava/lang/String;
        //   381: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   384: aload           4
        //   386: invokevirtual   java/io/File.exists:()Z
        //   389: ifeq            395
        //   392: goto            433
        //   395: new             Ljava/io/File;
        //   398: astore          4
        //   400: aload           4
        //   402: aload           11
        //   404: invokevirtual   z6/d.b:()Ljava/io/File;
        //   407: aload           10
        //   409: getstatic       com/airbnb/lottie/network/FileExtension.ZIP:Lcom/airbnb/lottie/network/FileExtension;
        //   412: iconst_0       
        //   413: invokestatic    z6/d.a:(Ljava/lang/String;Lcom/airbnb/lottie/network/FileExtension;Z)Ljava/lang/String;
        //   416: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   419: aload           4
        //   421: invokevirtual   java/io/File.exists:()Z
        //   424: ifeq            430
        //   427: goto            433
        //   430: aconst_null    
        //   431: astore          4
        //   433: aload           4
        //   435: ifnonnull       441
        //   438: goto            495
        //   441: new             Ljava/io/FileInputStream;
        //   444: dup            
        //   445: aload           4
        //   447: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   450: astore          11
        //   452: aload           4
        //   454: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   457: ldc             ".zip"
        //   459: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   462: ifeq            470
        //   465: getstatic       com/airbnb/lottie/network/FileExtension.ZIP:Lcom/airbnb/lottie/network/FileExtension;
        //   468: astore          5
        //   470: aload           4
        //   472: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   475: pop            
        //   476: invokestatic    b7/c.a:()V
        //   479: new             Landroid/util/Pair;
        //   482: dup            
        //   483: aload           5
        //   485: aload           11
        //   487: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   490: astore          4
        //   492: goto            498
        //   495: aconst_null    
        //   496: astore          4
        //   498: aload           4
        //   500: ifnonnull       506
        //   503: goto            584
        //   506: aload           4
        //   508: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   511: checkcast       Lcom/airbnb/lottie/network/FileExtension;
        //   514: astore          5
        //   516: aload           4
        //   518: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   521: checkcast       Ljava/io/InputStream;
        //   524: astore          4
        //   526: aload           5
        //   528: getstatic       com/airbnb/lottie/network/FileExtension.ZIP:Lcom/airbnb/lottie/network/FileExtension;
        //   531: if_acmpne       553
        //   534: new             Ljava/util/zip/ZipInputStream;
        //   537: dup            
        //   538: aload           4
        //   540: invokespecial   java/util/zip/ZipInputStream.<init>:(Ljava/io/InputStream;)V
        //   543: aload           10
        //   545: invokestatic    p6/r.h:(Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lp6/i0;
        //   548: astore          4
        //   550: goto            562
        //   553: aload           4
        //   555: aload           10
        //   557: invokestatic    p6/r.d:(Ljava/io/InputStream;Ljava/lang/String;)Lp6/i0;
        //   560: astore          4
        //   562: aload           4
        //   564: getfield        p6/i0.a:Ljava/lang/Object;
        //   567: astore          4
        //   569: aload           4
        //   571: ifnull          584
        //   574: aload           4
        //   576: checkcast       Lp6/h;
        //   579: astore          4
        //   581: goto            587
        //   584: aconst_null    
        //   585: astore          4
        //   587: aload           4
        //   589: ifnull          606
        //   592: new             Lp6/i0;
        //   595: dup            
        //   596: aload           4
        //   598: invokespecial   p6/i0.<init>:(Lp6/h;)V
        //   601: astore          4
        //   603: goto            858
        //   606: invokestatic    b7/c.a:()V
        //   609: invokestatic    b7/c.a:()V
        //   612: aload           6
        //   614: astore          5
        //   616: aload           8
        //   618: astore          4
        //   620: aload           7
        //   622: getfield        z6/e.b:Lz6/b;
        //   625: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   628: pop            
        //   629: aload           6
        //   631: astore          5
        //   633: aload           8
        //   635: astore          4
        //   637: aload           10
        //   639: invokestatic    z6/b.a:(Ljava/lang/String;)Lz6/a;
        //   642: astore          6
        //   644: aload           6
        //   646: astore          5
        //   648: aload           6
        //   650: astore          4
        //   652: aload           6
        //   654: getfield        z6/a.f:Ljava/net/HttpURLConnection;
        //   657: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   660: bipush          100
        //   662: idiv           
        //   663: istore_2       
        //   664: iload_2        
        //   665: iconst_2       
        //   666: if_icmpne       684
        //   669: iconst_1       
        //   670: istore_1       
        //   671: goto            684
        //   674: astore          4
        //   676: goto            903
        //   679: astore          6
        //   681: goto            806
        //   684: iload_1        
        //   685: ifeq            745
        //   688: aload           6
        //   690: astore          5
        //   692: aload           6
        //   694: astore          4
        //   696: aload           7
        //   698: aload           10
        //   700: aload           6
        //   702: getfield        z6/a.f:Ljava/net/HttpURLConnection;
        //   705: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //   708: aload           6
        //   710: getfield        z6/a.f:Ljava/net/HttpURLConnection;
        //   713: invokevirtual   java/net/URLConnection.getContentType:()Ljava/lang/String;
        //   716: aload           9
        //   718: invokevirtual   z6/e.a:(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lp6/i0;
        //   721: astore          7
        //   723: aload           6
        //   725: astore          5
        //   727: aload           6
        //   729: astore          4
        //   731: invokestatic    b7/c.a:()V
        //   734: aload           6
        //   736: astore          4
        //   738: aload           7
        //   740: astore          5
        //   742: goto            830
        //   745: aload           6
        //   747: astore          5
        //   749: aload           6
        //   751: astore          4
        //   753: new             Ljava/lang/IllegalArgumentException;
        //   756: astore          7
        //   758: aload           6
        //   760: astore          5
        //   762: aload           6
        //   764: astore          4
        //   766: aload           7
        //   768: aload           6
        //   770: invokevirtual   z6/a.b:()Ljava/lang/String;
        //   773: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   776: aload           6
        //   778: astore          5
        //   780: aload           6
        //   782: astore          4
        //   784: new             Lp6/i0;
        //   787: dup            
        //   788: aload           7
        //   790: invokespecial   p6/i0.<init>:(Ljava/lang/Throwable;)V
        //   793: astore          7
        //   795: aload           6
        //   797: astore          4
        //   799: aload           7
        //   801: astore          5
        //   803: goto            830
        //   806: aload           4
        //   808: astore          5
        //   810: new             Lp6/i0;
        //   813: dup            
        //   814: aload           6
        //   816: invokespecial   p6/i0.<init>:(Ljava/lang/Throwable;)V
        //   819: astore          6
        //   821: aload           4
        //   823: ifnull          854
        //   826: aload           6
        //   828: astore          5
        //   830: aload           4
        //   832: invokevirtual   z6/a.close:()V
        //   835: goto            847
        //   838: astore          4
        //   840: ldc             "LottieFetchResult close failed "
        //   842: aload           4
        //   844: invokestatic    b7/c.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   847: aload           5
        //   849: astore          4
        //   851: goto            858
        //   854: aload           6
        //   856: astore          4
        //   858: aload           9
        //   860: ifnull          900
        //   863: aload           4
        //   865: getfield        p6/i0.a:Ljava/lang/Object;
        //   868: astore          6
        //   870: aload           6
        //   872: ifnull          900
        //   875: getstatic       v6/f.b:Lv6/f;
        //   878: astore          5
        //   880: aload           6
        //   882: checkcast       Lp6/h;
        //   885: astore          6
        //   887: aload           5
        //   889: getfield        v6/f.a:Lj0/g;
        //   892: aload           9
        //   894: aload           6
        //   896: invokevirtual   j0/g.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   899: pop            
        //   900: aload           4
        //   902: areturn        
        //   903: aload           5
        //   905: ifnull          925
        //   908: aload           5
        //   910: invokevirtual   z6/a.close:()V
        //   913: goto            925
        //   916: astore          5
        //   918: ldc             "LottieFetchResult close failed "
        //   920: aload           5
        //   922: invokestatic    b7/c.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   925: aload           4
        //   927: athrow         
        //   928: aload_0        
        //   929: getfield        p6/i.i:Ljava/lang/Object;
        //   932: checkcast       Lj41/f;
        //   935: astore          6
        //   937: aload_0        
        //   938: getfield        p6/i.g:Ljava/lang/String;
        //   941: astore          4
        //   943: aload_0        
        //   944: getfield        p6/i.h:Ljava/lang/String;
        //   947: astore          5
        //   949: aload           4
        //   951: ldc_w           "$filepath"
        //   954: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //   957: aload           5
        //   959: ldc_w           "$mimetype"
        //   962: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //   965: aload           6
        //   967: getfield        j41/f.b:Lj41/g;
        //   970: aload           4
        //   972: aload           5
        //   974: invokeinterface j41/g.b:(Ljava/lang/String;Ljava/lang/String;)Lcom/reddit/domain/model/FileUploadLease;
        //   979: areturn        
        //   980: astore          4
        //   982: goto            495
        //   985: astore          4
        //   987: goto            684
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  179    184    317    325    Any
        //  193    210    317    325    Any
        //  219    222    317    325    Any
        //  222    227    271    279    Any
        //  236    265    271    279    Any
        //  265    268    271    279    Any
        //  273    276    271    279    Any
        //  276    279    317    325    Any
        //  279    303    317    325    Any
        //  307    310    317    325    Any
        //  319    322    317    325    Any
        //  352    392    980    985    Ljava/io/FileNotFoundException;
        //  395    427    980    985    Ljava/io/FileNotFoundException;
        //  441    452    980    985    Ljava/io/FileNotFoundException;
        //  620    629    679    830    Ljava/lang/Exception;
        //  620    629    674    928    Any
        //  637    644    679    830    Ljava/lang/Exception;
        //  637    644    674    928    Any
        //  652    664    985    990    Ljava/io/IOException;
        //  652    664    679    830    Ljava/lang/Exception;
        //  652    664    674    928    Any
        //  696    723    679    830    Ljava/lang/Exception;
        //  696    723    674    928    Any
        //  731    734    679    830    Ljava/lang/Exception;
        //  731    734    674    928    Any
        //  753    758    679    830    Ljava/lang/Exception;
        //  753    758    674    928    Any
        //  766    776    679    830    Ljava/lang/Exception;
        //  766    776    674    928    Any
        //  784    795    679    830    Ljava/lang/Exception;
        //  784    795    674    928    Any
        //  810    821    674    928    Any
        //  830    835    838    847    Ljava/io/IOException;
        //  908    913    916    925    Ljava/io/IOException;
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
}
