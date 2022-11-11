// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.concurrent.atomic.AtomicReference;
import ie.w0;

public final class z5 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ q7 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ l6 k;
    public final /* synthetic */ Object l;
    
    public z5(final l6 k, final String g, final String h, final q7 i, final boolean j, final w0 l) {
        this.f = 0;
        this.k = k;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.l = l;
    }
    
    public z5(final l6 k, final AtomicReference l, final String g, final String h, final q7 i, final boolean j) {
        this.f = 1;
        this.k = k;
        this.l = l;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pe/z5.f:I
        //     4: tableswitch {
        //                0: 27
        //          default: 24
        //        }
        //    24: goto            370
        //    27: new             Landroid/os/Bundle;
        //    30: dup            
        //    31: invokespecial   android/os/Bundle.<init>:()V
        //    34: astore_1       
        //    35: aload_0        
        //    36: getfield        pe/z5.k:Lpe/l6;
        //    39: astore_2       
        //    40: aload_2        
        //    41: getfield        pe/l6.i:Lpe/u2;
        //    44: astore_3       
        //    45: aload_3        
        //    46: ifnonnull       102
        //    49: aload_2        
        //    50: getfield        z0/d1.f:Ljava/lang/Object;
        //    53: checkcast       Lpe/h4;
        //    56: invokevirtual   pe/h4.h:()Lpe/d3;
        //    59: getfield        pe/d3.k:Lpe/b3;
        //    62: aload_0        
        //    63: getfield        pe/z5.g:Ljava/lang/String;
        //    66: ldc             "Failed to get user properties; not connected to service"
        //    68: aload_0        
        //    69: getfield        pe/z5.h:Ljava/lang/String;
        //    72: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //    75: aload_0        
        //    76: getfield        pe/z5.k:Lpe/l6;
        //    79: getfield        z0/d1.f:Ljava/lang/Object;
        //    82: checkcast       Lpe/h4;
        //    85: invokevirtual   pe/h4.y:()Lpe/n7;
        //    88: aload_0        
        //    89: getfield        pe/z5.l:Ljava/lang/Object;
        //    92: checkcast       Lie/w0;
        //    95: aload_1        
        //    96: invokevirtual   pe/n7.g0:(Lie/w0;Landroid/os/Bundle;)V
        //    99: goto            342
        //   102: aload_0        
        //   103: getfield        pe/z5.i:Lpe/q7;
        //   106: invokestatic    lw0/b.R:(Ljava/lang/Object;)V
        //   109: aload_3        
        //   110: aload_0        
        //   111: getfield        pe/z5.g:Ljava/lang/String;
        //   114: aload_0        
        //   115: getfield        pe/z5.h:Ljava/lang/String;
        //   118: aload_0        
        //   119: getfield        pe/z5.j:Z
        //   122: aload_0        
        //   123: getfield        pe/z5.i:Lpe/q7;
        //   126: invokeinterface pe/u2.n0:(Ljava/lang/String;Ljava/lang/String;ZLpe/q7;)Ljava/util/List;
        //   131: astore_2       
        //   132: new             Landroid/os/Bundle;
        //   135: astore_3       
        //   136: aload_3        
        //   137: invokespecial   android/os/Bundle.<init>:()V
        //   140: aload_2        
        //   141: ifnonnull       147
        //   144: goto            254
        //   147: aload_2        
        //   148: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   153: astore          4
        //   155: aload           4
        //   157: invokeinterface java/util/Iterator.hasNext:()Z
        //   162: ifeq            254
        //   165: aload           4
        //   167: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   172: checkcast       Lpe/j7;
        //   175: astore_2       
        //   176: aload_2        
        //   177: getfield        pe/j7.j:Ljava/lang/String;
        //   180: astore          5
        //   182: aload           5
        //   184: ifnull          200
        //   187: aload_3        
        //   188: aload_2        
        //   189: getfield        pe/j7.g:Ljava/lang/String;
        //   192: aload           5
        //   194: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   197: goto            155
        //   200: aload_2        
        //   201: getfield        pe/j7.i:Ljava/lang/Long;
        //   204: astore          5
        //   206: aload           5
        //   208: ifnull          227
        //   211: aload_3        
        //   212: aload_2        
        //   213: getfield        pe/j7.g:Ljava/lang/String;
        //   216: aload           5
        //   218: invokevirtual   java/lang/Long.longValue:()J
        //   221: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //   224: goto            155
        //   227: aload_2        
        //   228: getfield        pe/j7.l:Ljava/lang/Double;
        //   231: astore          5
        //   233: aload           5
        //   235: ifnull          155
        //   238: aload_3        
        //   239: aload_2        
        //   240: getfield        pe/j7.g:Ljava/lang/String;
        //   243: aload           5
        //   245: invokevirtual   java/lang/Double.doubleValue:()D
        //   248: invokevirtual   android/os/BaseBundle.putDouble:(Ljava/lang/String;D)V
        //   251: goto            155
        //   254: aload_3        
        //   255: astore_1       
        //   256: aload_0        
        //   257: getfield        pe/z5.k:Lpe/l6;
        //   260: invokevirtual   pe/l6.X:()V
        //   263: aload_0        
        //   264: getfield        pe/z5.k:Lpe/l6;
        //   267: getfield        z0/d1.f:Ljava/lang/Object;
        //   270: checkcast       Lpe/h4;
        //   273: astore_1       
        //   274: goto            327
        //   277: astore_2       
        //   278: goto            288
        //   281: astore_3       
        //   282: goto            344
        //   285: astore_2       
        //   286: aload_1        
        //   287: astore_3       
        //   288: aload_3        
        //   289: astore_1       
        //   290: aload_0        
        //   291: getfield        pe/z5.k:Lpe/l6;
        //   294: getfield        z0/d1.f:Ljava/lang/Object;
        //   297: checkcast       Lpe/h4;
        //   300: invokevirtual   pe/h4.h:()Lpe/d3;
        //   303: getfield        pe/d3.k:Lpe/b3;
        //   306: aload_0        
        //   307: getfield        pe/z5.g:Ljava/lang/String;
        //   310: ldc             "Failed to get user properties; remote exception"
        //   312: aload_2        
        //   313: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   316: aload_0        
        //   317: getfield        pe/z5.k:Lpe/l6;
        //   320: getfield        z0/d1.f:Ljava/lang/Object;
        //   323: checkcast       Lpe/h4;
        //   326: astore_1       
        //   327: aload_1        
        //   328: invokevirtual   pe/h4.y:()Lpe/n7;
        //   331: aload_0        
        //   332: getfield        pe/z5.l:Ljava/lang/Object;
        //   335: checkcast       Lie/w0;
        //   338: aload_3        
        //   339: invokevirtual   pe/n7.g0:(Lie/w0;Landroid/os/Bundle;)V
        //   342: return         
        //   343: astore_3       
        //   344: aload_0        
        //   345: getfield        pe/z5.k:Lpe/l6;
        //   348: getfield        z0/d1.f:Ljava/lang/Object;
        //   351: checkcast       Lpe/h4;
        //   354: invokevirtual   pe/h4.y:()Lpe/n7;
        //   357: aload_0        
        //   358: getfield        pe/z5.l:Ljava/lang/Object;
        //   361: checkcast       Lie/w0;
        //   364: aload_1        
        //   365: invokevirtual   pe/n7.g0:(Lie/w0;Landroid/os/Bundle;)V
        //   368: aload_3        
        //   369: athrow         
        //   370: aload_0        
        //   371: getfield        pe/z5.l:Ljava/lang/Object;
        //   374: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   377: astore_1       
        //   378: aload_1        
        //   379: monitorenter   
        //   380: aload_0        
        //   381: getfield        pe/z5.k:Lpe/l6;
        //   384: astore_3       
        //   385: aload_3        
        //   386: getfield        pe/l6.i:Lpe/u2;
        //   389: astore_2       
        //   390: aload_2        
        //   391: ifnonnull       449
        //   394: aload_3        
        //   395: getfield        z0/d1.f:Ljava/lang/Object;
        //   398: checkcast       Lpe/h4;
        //   401: invokevirtual   pe/h4.h:()Lpe/d3;
        //   404: getfield        pe/d3.k:Lpe/b3;
        //   407: aconst_null    
        //   408: ldc             "(legacy) Failed to get user properties; not connected to service"
        //   410: aload_0        
        //   411: getfield        pe/z5.g:Ljava/lang/String;
        //   414: aload_0        
        //   415: getfield        pe/z5.h:Ljava/lang/String;
        //   418: invokevirtual   pe/b3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   421: aload_0        
        //   422: getfield        pe/z5.l:Ljava/lang/Object;
        //   425: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   428: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   431: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   434: aload_0        
        //   435: getfield        pe/z5.l:Ljava/lang/Object;
        //   438: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   441: invokevirtual   java/lang/Object.notify:()V
        //   444: aload_1        
        //   445: monitorexit    
        //   446: goto            604
        //   449: aconst_null    
        //   450: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   453: ifeq            498
        //   456: aload_0        
        //   457: getfield        pe/z5.i:Lpe/q7;
        //   460: invokestatic    lw0/b.R:(Ljava/lang/Object;)V
        //   463: aload_0        
        //   464: getfield        pe/z5.l:Ljava/lang/Object;
        //   467: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   470: aload_2        
        //   471: aload_0        
        //   472: getfield        pe/z5.g:Ljava/lang/String;
        //   475: aload_0        
        //   476: getfield        pe/z5.h:Ljava/lang/String;
        //   479: aload_0        
        //   480: getfield        pe/z5.j:Z
        //   483: aload_0        
        //   484: getfield        pe/z5.i:Lpe/q7;
        //   487: invokeinterface pe/u2.n0:(Ljava/lang/String;Ljava/lang/String;ZLpe/q7;)Ljava/util/List;
        //   492: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   495: goto            527
        //   498: aload_0        
        //   499: getfield        pe/z5.l:Ljava/lang/Object;
        //   502: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   505: aload_2        
        //   506: aconst_null    
        //   507: aload_0        
        //   508: getfield        pe/z5.g:Ljava/lang/String;
        //   511: aload_0        
        //   512: getfield        pe/z5.h:Ljava/lang/String;
        //   515: aload_0        
        //   516: getfield        pe/z5.j:Z
        //   519: invokeinterface pe/u2.k1:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
        //   524: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   527: aload_0        
        //   528: getfield        pe/z5.k:Lpe/l6;
        //   531: invokevirtual   pe/l6.X:()V
        //   534: aload_0        
        //   535: getfield        pe/z5.l:Ljava/lang/Object;
        //   538: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   541: astore_3       
        //   542: goto            598
        //   545: astore_3       
        //   546: goto            605
        //   549: astore_3       
        //   550: aload_0        
        //   551: getfield        pe/z5.k:Lpe/l6;
        //   554: getfield        z0/d1.f:Ljava/lang/Object;
        //   557: checkcast       Lpe/h4;
        //   560: invokevirtual   pe/h4.h:()Lpe/d3;
        //   563: getfield        pe/d3.k:Lpe/b3;
        //   566: aconst_null    
        //   567: ldc             "(legacy) Failed to get user properties; remote exception"
        //   569: aload_0        
        //   570: getfield        pe/z5.g:Ljava/lang/String;
        //   573: aload_3        
        //   574: invokevirtual   pe/b3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   577: aload_0        
        //   578: getfield        pe/z5.l:Ljava/lang/Object;
        //   581: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   584: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   587: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   590: aload_0        
        //   591: getfield        pe/z5.l:Ljava/lang/Object;
        //   594: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   597: astore_3       
        //   598: aload_3        
        //   599: invokevirtual   java/lang/Object.notify:()V
        //   602: aload_1        
        //   603: monitorexit    
        //   604: return         
        //   605: aload_0        
        //   606: getfield        pe/z5.l:Ljava/lang/Object;
        //   609: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   612: invokevirtual   java/lang/Object.notify:()V
        //   615: aload_3        
        //   616: athrow         
        //   617: astore_3       
        //   618: aload_1        
        //   619: monitorexit    
        //   620: aload_3        
        //   621: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  35     45     285    288    Landroid/os/RemoteException;
        //  35     45     281    285    Any
        //  49     75     285    288    Landroid/os/RemoteException;
        //  49     75     281    285    Any
        //  102    140    285    288    Landroid/os/RemoteException;
        //  102    140    281    285    Any
        //  147    155    285    288    Landroid/os/RemoteException;
        //  147    155    281    285    Any
        //  155    182    285    288    Landroid/os/RemoteException;
        //  155    182    281    285    Any
        //  187    197    285    288    Landroid/os/RemoteException;
        //  187    197    281    285    Any
        //  200    206    285    288    Landroid/os/RemoteException;
        //  200    206    281    285    Any
        //  211    224    285    288    Landroid/os/RemoteException;
        //  211    224    281    285    Any
        //  227    233    285    288    Landroid/os/RemoteException;
        //  227    233    281    285    Any
        //  238    251    285    288    Landroid/os/RemoteException;
        //  238    251    281    285    Any
        //  256    263    277    281    Landroid/os/RemoteException;
        //  256    263    343    344    Any
        //  290    316    343    344    Any
        //  380    390    549    598    Landroid/os/RemoteException;
        //  380    390    545    549    Any
        //  394    434    549    598    Landroid/os/RemoteException;
        //  394    434    545    549    Any
        //  434    446    617    622    Any
        //  449    495    549    598    Landroid/os/RemoteException;
        //  449    495    545    549    Any
        //  498    527    549    598    Landroid/os/RemoteException;
        //  498    527    545    549    Any
        //  527    534    549    598    Landroid/os/RemoteException;
        //  527    534    545    549    Any
        //  534    542    617    622    Any
        //  550    590    545    549    Any
        //  590    598    617    622    Any
        //  598    604    617    622    Any
        //  605    617    617    622    Any
        //  618    620    617    622    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0449:
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
