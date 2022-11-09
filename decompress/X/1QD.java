// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1qd extends 1hn
{
    static {
        Covode.recordClassIndex(4547);
    }
    
    @Override
    public final 0Sq LIZ(final 0Sp p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aload_1        
        //     4: ifnonnull       17
        //     7: ldc             "request is null"
        //     9: invokestatic    X/0Ru.LIZ:(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;
        //    12: aconst_null    
        //    13: invokestatic    X/0Sq.LIZ:(Ljava/lang/Throwable;LX/0Sp;)LX/0Sq;
        //    16: areturn        
        //    17: aload_1        
        //    18: getfield        X/0Sp.LIZIZ:Ljava/lang/String;
        //    21: astore          5
        //    23: aload_1        
        //    24: getfield        X/0Sp.LIZLLL:Ljava/util/Map;
        //    27: astore          6
        //    29: aload           5
        //    31: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    34: ifeq            47
        //    37: ldc             "empty url"
        //    39: invokestatic    X/0Ru.LIZ:(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;
        //    42: aconst_null    
        //    43: invokestatic    X/0Sq.LIZ:(Ljava/lang/Throwable;LX/0Sp;)LX/0Sq;
        //    46: areturn        
        //    47: new             Ljava/net/URL;
        //    50: astore          7
        //    52: aload           7
        //    54: aload           5
        //    56: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    59: new             LX/75n;
        //    62: astore          5
        //    64: aload           5
        //    66: aload           7
        //    68: aconst_null    
        //    69: aconst_null    
        //    70: getstatic       X/75s.CONTINUE:LX/75s;
        //    73: invokespecial   X/75n.<init>:(Ljava/lang/Object;Landroid/webkit/WebView;Lorg/json/JSONObject;LX/75s;)V
        //    76: getstatic       X/75j.LIZLLL:LX/75j;
        //    79: aload           5
        //    81: invokevirtual   X/75j.LJIIL:(LX/75n;)LX/75n;
        //    84: astore          5
        //    86: aload           5
        //    88: getfield        X/75n.LJFF:LX/75s;
        //    91: getstatic       X/75s.INTERCEPT:LX/75s;
        //    94: if_acmpne       170
        //    97: aload           5
        //    99: getfield        X/75n.LIZIZ:Ljava/lang/Object;
        //   102: ifnull          170
        //   105: aload           5
        //   107: getfield        X/75n.LIZIZ:Ljava/lang/Object;
        //   110: checkcast       Ljava/net/URLConnection;
        //   113: astore          5
        //   115: aload           5
        //   117: instanceof      Ljavax/net/ssl/HttpsURLConnection;
        //   120: ifeq            141
        //   123: new             LX/764;
        //   126: astore          7
        //   128: aload           7
        //   130: aload           5
        //   132: checkcast       Ljavax/net/ssl/HttpsURLConnection;
        //   135: invokespecial   X/764.<init>:(Ljavax/net/ssl/HttpsURLConnection;)V
        //   138: goto            247
        //   141: aload           5
        //   143: astore          7
        //   145: aload           5
        //   147: instanceof      Ljava/net/HttpURLConnection;
        //   150: ifeq            247
        //   153: new             LX/75k;
        //   156: dup            
        //   157: aload           5
        //   159: checkcast       Ljava/net/HttpURLConnection;
        //   162: invokespecial   X/75k.<init>:(Ljava/net/HttpURLConnection;)V
        //   165: astore          7
        //   167: goto            247
        //   170: aload           5
        //   172: getfield        X/75n.LJFF:LX/75s;
        //   175: getstatic       X/75s.EXCEPTION:LX/75s;
        //   178: if_acmpne       189
        //   181: aload           5
        //   183: getfield        X/75n.LJ:Ljava/lang/RuntimeException;
        //   186: ifnonnull       505
        //   189: aload           7
        //   191: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //   194: astore          5
        //   196: aload           5
        //   198: instanceof      Ljavax/net/ssl/HttpsURLConnection;
        //   201: ifeq            221
        //   204: new             LX/764;
        //   207: dup            
        //   208: aload           5
        //   210: checkcast       Ljavax/net/ssl/HttpsURLConnection;
        //   213: invokespecial   X/764.<init>:(Ljavax/net/ssl/HttpsURLConnection;)V
        //   216: astore          7
        //   218: goto            247
        //   221: aload           5
        //   223: astore          7
        //   225: aload           5
        //   227: instanceof      Ljava/net/HttpURLConnection;
        //   230: ifeq            247
        //   233: new             LX/75k;
        //   236: dup            
        //   237: aload           5
        //   239: checkcast       Ljava/net/HttpURLConnection;
        //   242: invokespecial   X/75k.<init>:(Ljava/net/HttpURLConnection;)V
        //   245: astore          7
        //   247: aload           7
        //   249: checkcast       Ljava/net/HttpURLConnection;
        //   252: astore          5
        //   254: iload_2        
        //   255: i2l            
        //   256: lconst_0       
        //   257: lcmp           
        //   258: ifle            273
        //   261: aload           5
        //   263: iload_2        
        //   264: invokevirtual   java/net/HttpURLConnection.setConnectTimeout:(I)V
        //   267: aload           5
        //   269: iload_2        
        //   270: invokevirtual   java/net/HttpURLConnection.setReadTimeout:(I)V
        //   273: aload           5
        //   275: iload_3        
        //   276: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //   279: aload           5
        //   281: iconst_0       
        //   282: invokevirtual   java/net/HttpURLConnection.setUseCaches:(Z)V
        //   285: aload           5
        //   287: aload_1        
        //   288: getfield        X/0Sp.LIZJ:Ljava/lang/String;
        //   291: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //   294: aload           6
        //   296: ifnull          439
        //   299: aload           6
        //   301: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   306: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   311: astore          7
        //   313: aload           7
        //   315: invokeinterface java/util/Iterator.hasNext:()Z
        //   320: ifeq            439
        //   323: aload           7
        //   325: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   330: checkcast       Ljava/lang/String;
        //   333: astore          4
        //   335: aload           6
        //   337: aload           4
        //   339: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   344: checkcast       Ljava/util/List;
        //   347: astore          8
        //   349: aload           8
        //   351: ifnull          313
        //   354: aload           8
        //   356: invokeinterface java/util/List.size:()I
        //   361: ifeq            313
        //   364: new             Ljava/lang/StringBuilder;
        //   367: astore          9
        //   369: aload           9
        //   371: invokespecial   java/lang/StringBuilder.<init>:()V
        //   374: aload           8
        //   376: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   381: astore          8
        //   383: aload           8
        //   385: invokeinterface java/util/Iterator.hasNext:()Z
        //   390: ifeq            412
        //   393: aload           9
        //   395: aload           8
        //   397: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   402: checkcast       Ljava/lang/String;
        //   405: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   408: pop            
        //   409: goto            383
        //   412: aload           9
        //   414: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   417: astore          9
        //   419: aload           9
        //   421: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   424: ifne            313
        //   427: aload           5
        //   429: aload           4
        //   431: aload           9
        //   433: invokevirtual   java/net/HttpURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   436: goto            313
        //   439: iconst_0       
        //   440: invokestatic    android/net/TrafficStats.setThreadStatsTag:(I)V
        //   443: aload           5
        //   445: invokevirtual   java/net/HttpURLConnection.connect:()V
        //   448: new             LX/0Sq;
        //   451: dup            
        //   452: aload           5
        //   454: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   457: aload           5
        //   459: invokevirtual   java/net/HttpURLConnection.getResponseMessage:()Ljava/lang/String;
        //   462: aload           5
        //   464: invokevirtual   java/net/HttpURLConnection.getHeaderFields:()Ljava/util/Map;
        //   467: aload_1        
        //   468: aconst_null    
        //   469: invokespecial   X/0Sq.<init>:(ILjava/lang/String;Ljava/util/Map;LX/0Sp;Ljava/lang/Throwable;)V
        //   472: astore          7
        //   474: iconst_1       
        //   475: anewarray       Ljava/io/Closeable;
        //   478: dup            
        //   479: iconst_0       
        //   480: aload           5
        //   482: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   485: aastore        
        //   486: invokestatic    X/0Rz.LIZ:([Ljava/io/Closeable;)V
        //   489: aload           7
        //   491: areturn        
        //   492: astore          7
        //   494: aload           7
        //   496: astore          4
        //   498: aload           5
        //   500: astore          7
        //   502: goto            521
        //   505: aload           5
        //   507: getfield        X/75n.LJ:Ljava/lang/RuntimeException;
        //   510: athrow         
        //   511: astore          5
        //   513: aload           4
        //   515: astore          7
        //   517: aload           5
        //   519: astore          4
        //   521: aload           4
        //   523: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   526: pop            
        //   527: aload           4
        //   529: aload_1        
        //   530: invokestatic    X/0Sq.LIZ:(Ljava/lang/Throwable;LX/0Sp;)LX/0Sq;
        //   533: astore_1       
        //   534: aload           7
        //   536: ifnull          554
        //   539: iconst_1       
        //   540: anewarray       Ljava/io/Closeable;
        //   543: dup            
        //   544: iconst_0       
        //   545: aload           7
        //   547: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   550: aastore        
        //   551: invokestatic    X/0Rz.LIZ:([Ljava/io/Closeable;)V
        //   554: aload_1        
        //   555: areturn        
        //   556: astore_1       
        //   557: aload           7
        //   559: ifnull          577
        //   562: iconst_1       
        //   563: anewarray       Ljava/io/Closeable;
        //   566: dup            
        //   567: iconst_0       
        //   568: aload           7
        //   570: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   573: aastore        
        //   574: invokestatic    X/0Rz.LIZ:([Ljava/io/Closeable;)V
        //   577: aload_1        
        //   578: athrow         
        //   579: astore_1       
        //   580: goto            489
        //   583: astore          7
        //   585: goto            554
        //   588: astore          7
        //   590: goto            577
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  47     138    511    521    Any
        //  145    167    511    521    Any
        //  170    189    511    521    Any
        //  189    218    511    521    Any
        //  225    247    511    521    Any
        //  247    254    511    521    Any
        //  261    273    492    505    Any
        //  273    294    492    505    Any
        //  299    313    492    505    Any
        //  313    349    492    505    Any
        //  354    383    492    505    Any
        //  383    409    492    505    Any
        //  412    436    492    505    Any
        //  439    474    492    505    Any
        //  474    489    579    583    Any
        //  505    511    511    521    Any
        //  521    534    556    579    Any
        //  539    554    583    588    Any
        //  562    577    588    593    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 257, Size: 257
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
