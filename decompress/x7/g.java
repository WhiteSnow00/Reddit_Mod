// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import a8.e;

public final class g implements Runnable
{
    public final /* synthetic */ e f;
    public final /* synthetic */ a$g g;
    
    public g(final a$g g, final e f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        x7/g.g:Lx7/a$g;
        //     4: getfield        x7/a$g.a:Lx7/a;
        //     7: astore_1       
        //     8: aload_0        
        //     9: getfield        x7/g.f:La8/e;
        //    12: astore_2       
        //    13: aload_1        
        //    14: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    17: pop            
        //    18: aload_2        
        //    19: instanceof      La8/e$b;
        //    22: istore_3       
        //    23: iconst_1       
        //    24: istore          4
        //    26: iload_3        
        //    27: ifeq            166
        //    30: aload_1        
        //    31: monitorenter   
        //    32: aload_1        
        //    33: getfield        x7/a.b:Lcom/apollographql/apollo/subscription/SubscriptionManagerState;
        //    36: astore          5
        //    38: aload_1        
        //    39: getfield        x7/a.c:Lx7/a$e;
        //    42: iconst_1       
        //    43: invokevirtual   x7/a$e.a:(I)V
        //    46: aload_1        
        //    47: getfield        x7/a.b:Lcom/apollographql/apollo/subscription/SubscriptionManagerState;
        //    50: getstatic       com/apollographql/apollo/subscription/SubscriptionManagerState.CONNECTED:Lcom/apollographql/apollo/subscription/SubscriptionManagerState;
        //    53: if_acmpne       146
        //    56: aload_1        
        //    57: getstatic       com/apollographql/apollo/subscription/SubscriptionManagerState.ACTIVE:Lcom/apollographql/apollo/subscription/SubscriptionManagerState;
        //    60: putfield        x7/a.b:Lcom/apollographql/apollo/subscription/SubscriptionManagerState;
        //    63: aload_1        
        //    64: getfield        x7/a.a:Ljava/util/LinkedHashMap;
        //    67: invokevirtual   java/util/LinkedHashMap.values:()Ljava/util/Collection;
        //    70: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    75: astore          6
        //    77: aload           6
        //    79: invokeinterface java/util/Iterator.hasNext:()Z
        //    84: ifeq            146
        //    87: aload           6
        //    89: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    94: checkcast       Lx7/a$f;
        //    97: astore          7
        //    99: aload_1        
        //   100: getfield        x7/a.e:La8/g;
        //   103: astore          8
        //   105: new             La8/c$b;
        //   108: astore_2       
        //   109: aload_2        
        //   110: aload           7
        //   112: getfield        x7/a$f.a:Ljava/util/UUID;
        //   115: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   118: aload           7
        //   120: getfield        x7/a$f.b:Lh7/p;
        //   123: aload_1        
        //   124: getfield        x7/a.d:Lcom/apollographql/apollo/api/ScalarTypeAdapters;
        //   127: aload_1        
        //   128: getfield        x7/a.n:Z
        //   131: iconst_0       
        //   132: invokespecial   a8/c$b.<init>:(Ljava/lang/String;Lh7/p;Lcom/apollographql/apollo/api/ScalarTypeAdapters;ZZ)V
        //   135: aload           8
        //   137: aload_2        
        //   138: invokeinterface a8/g.c:(La8/c;)V
        //   143: goto            77
        //   146: aload_1        
        //   147: monitorexit    
        //   148: aload_1        
        //   149: aload           5
        //   151: aload_1        
        //   152: getfield        x7/a.b:Lcom/apollographql/apollo/subscription/SubscriptionManagerState;
        //   155: invokevirtual   x7/a.d:(Lcom/apollographql/apollo/subscription/SubscriptionManagerState;Lcom/apollographql/apollo/subscription/SubscriptionManagerState;)V
        //   158: goto            817
        //   161: astore_2       
        //   162: aload_1        
        //   163: monitorexit    
        //   164: aload_2        
        //   165: athrow         
        //   166: aload_2        
        //   167: instanceof      La8/e$e;
        //   170: ifeq            467
        //   173: aload_2        
        //   174: checkcast       La8/e$e;
        //   177: astore          7
        //   179: aload           7
        //   181: getfield        a8/e$e.a:Ljava/lang/String;
        //   184: astore_2       
        //   185: aload_2        
        //   186: ifnull          192
        //   189: goto            195
        //   192: ldc             ""
        //   194: astore_2       
        //   195: aload_1        
        //   196: monitorenter   
        //   197: aload_1        
        //   198: getfield        x7/a.a:Ljava/util/LinkedHashMap;
        //   201: aload_2        
        //   202: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
        //   205: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   208: checkcast       Lx7/a$f;
        //   211: astore          8
        //   213: goto            225
        //   216: astore_2       
        //   217: goto            463
        //   220: astore          8
        //   222: aconst_null    
        //   223: astore          8
        //   225: aload_1        
        //   226: monitorexit    
        //   227: aload           8
        //   229: ifnull          817
        //   232: aload_1        
        //   233: getfield        x7/a.i:Lrg2/a;
        //   236: invokeinterface rg2/a.invoke:()Ljava/lang/Object;
        //   241: checkcast       Ln7/f;
        //   244: astore          5
        //   246: aload           8
        //   248: getfield        x7/a$f.b:Lh7/p;
        //   251: invokeinterface h7/k.g:()Lj7/h;
        //   256: astore          6
        //   258: new             Lz7/a;
        //   261: dup            
        //   262: aload           8
        //   264: getfield        x7/a$f.b:Lh7/p;
        //   267: aload           6
        //   269: aload_1        
        //   270: getfield        x7/a.d:Lcom/apollographql/apollo/api/ScalarTypeAdapters;
        //   273: aload           5
        //   275: invokespecial   z7/a.<init>:(Lh7/k;Lj7/h;Lcom/apollographql/apollo/api/ScalarTypeAdapters;Ln7/f;)V
        //   278: astore          6
        //   280: aload           6
        //   282: aload           7
        //   284: getfield        a8/e$e.b:Ljava/util/Map;
        //   287: invokevirtual   z7/a.a:(Ljava/util/Map;)Lh7/n;
        //   290: astore          7
        //   292: aload           5
        //   294: invokevirtual   n7/f.l:()Ljava/util/Collection;
        //   297: astore_2       
        //   298: aload           8
        //   300: getfield        x7/a$f.c:Lx7/i$a;
        //   303: astore_1       
        //   304: new             Lx7/j;
        //   307: dup            
        //   308: aload           8
        //   310: getfield        x7/a$f.b:Lh7/p;
        //   313: aload           7
        //   315: aload_2        
        //   316: invokespecial   x7/j.<init>:(Lh7/p;Lh7/n;Ljava/util/Collection;)V
        //   319: astore          8
        //   321: aload_1        
        //   322: checkcast       Lcom/apollographql/apollo/internal/d$b;
        //   325: astore          5
        //   327: aload           5
        //   329: getfield        com/apollographql/apollo/internal/d$b.a:Lcom/apollographql/apollo/ApolloSubscriptionCall$a;
        //   332: astore_1       
        //   333: aload_1        
        //   334: ifnull          817
        //   337: aload           5
        //   339: getfield        com/apollographql/apollo/internal/d$b.b:Lcom/apollographql/apollo/internal/d;
        //   342: astore          5
        //   344: aload           5
        //   346: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   349: pop            
        //   350: aload_2        
        //   351: invokeinterface java/util/Collection.isEmpty:()Z
        //   356: ifne            394
        //   359: aload           5
        //   361: getfield        com/apollographql/apollo/internal/d.d:Lcom/apollographql/apollo/ApolloSubscriptionCall$CachePolicy;
        //   364: getstatic       com/apollographql/apollo/ApolloSubscriptionCall$CachePolicy.NO_CACHE:Lcom/apollographql/apollo/ApolloSubscriptionCall$CachePolicy;
        //   367: if_acmpne       373
        //   370: goto            394
        //   373: aload           5
        //   375: getfield        com/apollographql/apollo/internal/d.e:Ljava/util/concurrent/Executor;
        //   378: new             Ls7/i;
        //   381: dup            
        //   382: aload           5
        //   384: aload           8
        //   386: invokespecial   s7/i.<init>:(Lcom/apollographql/apollo/internal/d;Lx7/j;)V
        //   389: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //   394: aload_1        
        //   395: aload           7
        //   397: invokeinterface com/apollographql/apollo/ApolloSubscriptionCall$a.c:(Lh7/n;)V
        //   402: goto            817
        //   405: astore          8
        //   407: aload_1        
        //   408: aload_2        
        //   409: invokevirtual   x7/a.f:(Ljava/lang/String;)Lx7/a$f;
        //   412: astore_1       
        //   413: aload_1        
        //   414: ifnull          817
        //   417: new             Lcom/apollographql/apollo/internal/subscription/ApolloSubscriptionException;
        //   420: dup            
        //   421: ldc             "Failed to parse server message"
        //   423: aload           8
        //   425: invokespecial   com/apollographql/apollo/internal/subscription/ApolloSubscriptionException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   428: astore_2       
        //   429: aload_1        
        //   430: getfield        x7/a$f.c:Lx7/i$a;
        //   433: checkcast       Lcom/apollographql/apollo/internal/d$b;
        //   436: astore_1       
        //   437: aload_1        
        //   438: getfield        com/apollographql/apollo/internal/d$b.a:Lcom/apollographql/apollo/ApolloSubscriptionCall$a;
        //   441: astore          8
        //   443: aload           8
        //   445: ifnull          456
        //   448: aload           8
        //   450: aload_2        
        //   451: invokeinterface com/apollographql/apollo/ApolloSubscriptionCall$a.a:(Lcom/apollographql/apollo/exception/ApolloException;)V
        //   456: aload_1        
        //   457: invokevirtual   com/apollographql/apollo/internal/d$b.a:()V
        //   460: goto            817
        //   463: aload_1        
        //   464: monitorexit    
        //   465: aload_2        
        //   466: athrow         
        //   467: aload_2        
        //   468: instanceof      La8/e$f;
        //   471: ifeq            686
        //   474: aload_2        
        //   475: checkcast       La8/e$f;
        //   478: astore          8
        //   480: aload           8
        //   482: getfield        a8/e$f.a:Ljava/lang/String;
        //   485: astore_2       
        //   486: aload_2        
        //   487: ifnull          493
        //   490: goto            496
        //   493: ldc             ""
        //   495: astore_2       
        //   496: aload_1        
        //   497: aload_2        
        //   498: invokevirtual   x7/a.f:(Ljava/lang/String;)Lx7/a$f;
        //   501: astore_2       
        //   502: aload_2        
        //   503: ifnonnull       509
        //   506: goto            817
        //   509: aload_1        
        //   510: getfield        x7/a.n:Z
        //   513: ifeq            563
        //   516: aload           8
        //   518: getfield        a8/e$f.b:Ljava/util/Map;
        //   521: invokestatic    z7/a.c:(Ljava/util/Map;)Lh7/f;
        //   524: astore          7
        //   526: iload           4
        //   528: istore          9
        //   530: ldc             "PersistedQueryNotFound"
        //   532: aload           7
        //   534: getfield        h7/f.a:Ljava/lang/String;
        //   537: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   540: ifne            566
        //   543: ldc             "PersistedQueryNotSupported"
        //   545: aload           7
        //   547: getfield        h7/f.a:Ljava/lang/String;
        //   550: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   553: ifeq            563
        //   556: iload           4
        //   558: istore          9
        //   560: goto            566
        //   563: iconst_0       
        //   564: istore          9
        //   566: iload           9
        //   568: ifeq            640
        //   571: aload_1        
        //   572: monitorenter   
        //   573: aload_1        
        //   574: getfield        x7/a.a:Ljava/util/LinkedHashMap;
        //   577: aload_2        
        //   578: getfield        x7/a$f.a:Ljava/util/UUID;
        //   581: aload_2        
        //   582: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   587: pop            
        //   588: aload_1        
        //   589: getfield        x7/a.e:La8/g;
        //   592: astore          8
        //   594: new             La8/c$b;
        //   597: astore          7
        //   599: aload           7
        //   601: aload_2        
        //   602: getfield        x7/a$f.a:Ljava/util/UUID;
        //   605: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   608: aload_2        
        //   609: getfield        x7/a$f.b:Lh7/p;
        //   612: aload_1        
        //   613: getfield        x7/a.d:Lcom/apollographql/apollo/api/ScalarTypeAdapters;
        //   616: iconst_1       
        //   617: iconst_1       
        //   618: invokespecial   a8/c$b.<init>:(Ljava/lang/String;Lh7/p;Lcom/apollographql/apollo/api/ScalarTypeAdapters;ZZ)V
        //   621: aload           8
        //   623: aload           7
        //   625: invokeinterface a8/g.c:(La8/c;)V
        //   630: aload_1        
        //   631: monitorexit    
        //   632: goto            817
        //   635: astore_2       
        //   636: aload_1        
        //   637: monitorexit    
        //   638: aload_2        
        //   639: athrow         
        //   640: new             Lcom/apollographql/apollo/internal/subscription/ApolloSubscriptionServerException;
        //   643: dup            
        //   644: aload           8
        //   646: getfield        a8/e$f.b:Ljava/util/Map;
        //   649: invokespecial   com/apollographql/apollo/internal/subscription/ApolloSubscriptionServerException.<init>:(Ljava/util/Map;)V
        //   652: astore          8
        //   654: aload_2        
        //   655: getfield        x7/a$f.c:Lx7/i$a;
        //   658: checkcast       Lcom/apollographql/apollo/internal/d$b;
        //   661: astore_1       
        //   662: aload_1        
        //   663: getfield        com/apollographql/apollo/internal/d$b.a:Lcom/apollographql/apollo/ApolloSubscriptionCall$a;
        //   666: astore_2       
        //   667: aload_2        
        //   668: ifnull          679
        //   671: aload_2        
        //   672: aload           8
        //   674: invokeinterface com/apollographql/apollo/ApolloSubscriptionCall$a.a:(Lcom/apollographql/apollo/exception/ApolloException;)V
        //   679: aload_1        
        //   680: invokevirtual   com/apollographql/apollo/internal/d$b.a:()V
        //   683: goto            817
        //   686: aload_2        
        //   687: instanceof      La8/e$a;
        //   690: ifeq            754
        //   693: aload_2        
        //   694: checkcast       La8/e$a;
        //   697: getfield        a8/e$a.a:Ljava/lang/String;
        //   700: astore_2       
        //   701: aload_2        
        //   702: ifnull          708
        //   705: goto            711
        //   708: ldc             ""
        //   710: astore_2       
        //   711: aload_1        
        //   712: aload_2        
        //   713: invokevirtual   x7/a.f:(Ljava/lang/String;)Lx7/a$f;
        //   716: astore_2       
        //   717: aload_2        
        //   718: ifnull          817
        //   721: aload_2        
        //   722: getfield        x7/a$f.c:Lx7/i$a;
        //   725: checkcast       Lcom/apollographql/apollo/internal/d$b;
        //   728: astore_2       
        //   729: aload_2        
        //   730: getfield        com/apollographql/apollo/internal/d$b.a:Lcom/apollographql/apollo/ApolloSubscriptionCall$a;
        //   733: astore          8
        //   735: aload           8
        //   737: ifnull          747
        //   740: aload           8
        //   742: invokeinterface com/apollographql/apollo/ApolloSubscriptionCall$a.onCompleted:()V
        //   747: aload_2        
        //   748: invokevirtual   com/apollographql/apollo/internal/d$b.a:()V
        //   751: goto            817
        //   754: aload_2        
        //   755: instanceof      La8/e$c;
        //   758: ifeq            770
        //   761: aload_1        
        //   762: iconst_1       
        //   763: invokevirtual   x7/a.c:(Z)Ljava/util/Collection;
        //   766: pop            
        //   767: goto            817
        //   770: aload_2        
        //   771: instanceof      La8/e$d;
        //   774: ifeq            817
        //   777: aload_1        
        //   778: getfield        x7/a.h:J
        //   781: lconst_0       
        //   782: lcmp           
        //   783: ifgt            789
        //   786: goto            817
        //   789: aload_1        
        //   790: monitorenter   
        //   791: aload_1        
        //   792: getfield        x7/a.c:Lx7/a$e;
        //   795: iconst_3       
        //   796: aload_1        
        //   797: getfield        x7/a.l:Lx7/a$c;
        //   800: aload_1        
        //   801: getfield        x7/a.h:J
        //   804: invokevirtual   x7/a$e.b:(ILjava/lang/Runnable;J)V
        //   807: aload_1        
        //   808: monitorexit    
        //   809: goto            817
        //   812: astore_2       
        //   813: aload_1        
        //   814: monitorexit    
        //   815: aload_2        
        //   816: athrow         
        //   817: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  32     77     161    166    Any
        //  77     143    161    166    Any
        //  146    148    161    166    Any
        //  162    164    161    166    Any
        //  197    213    220    225    Ljava/lang/IllegalArgumentException;
        //  197    213    216    467    Any
        //  225    227    216    467    Any
        //  280    292    405    463    Ljava/lang/Exception;
        //  463    465    216    467    Any
        //  573    632    635    640    Any
        //  636    638    635    640    Any
        //  791    809    812    817    Any
        //  813    815    812    817    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0373:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
