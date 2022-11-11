// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.datasource.remote;

import com.reddit.queries.j5$c;
import lg2.c;
import g22.j3;
import javax.inject.Inject;
import sg2.e;
import cw0.a;
import j60.b;

public final class RemoteStorefrontDataSource
{
    public final b a;
    public final a b;
    
    @Inject
    public RemoteStorefrontDataSource(final b a, final a b) {
        e.f((Object)a, "gqlClient");
        e.f((Object)b, "logger");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final int p0, final j3 p1, final String p2, final String p3, final c<? super q20.c<j5$c, ? extends j60.a>> p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: instanceof      Lcom/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1;
        //     5: ifeq            47
        //     8: aload           5
        //    10: checkcast       Lcom/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1;
        //    13: astore          6
        //    15: aload           6
        //    17: getfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1.label:I
        //    20: istore          7
        //    22: iload           7
        //    24: ldc             -2147483648
        //    26: iand           
        //    27: ifeq            47
        //    30: aload           6
        //    32: iload           7
        //    34: ldc             -2147483648
        //    36: iadd           
        //    37: putfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1.label:I
        //    40: aload           6
        //    42: astore          5
        //    44: goto            59
        //    47: new             Lcom/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1;
        //    50: dup            
        //    51: aload_0        
        //    52: aload           5
        //    54: invokespecial   com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1.<init>:(Lcom/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource;Llg2/c;)V
        //    57: astore          5
        //    59: aload           5
        //    61: getfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1.result:Ljava/lang/Object;
        //    64: astore          6
        //    66: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //    69: astore          8
        //    71: aload           5
        //    73: getfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1.label:I
        //    76: istore          7
        //    78: iload           7
        //    80: ifeq            126
        //    83: iload           7
        //    85: iconst_1       
        //    86: if_icmpne       116
        //    89: aload           5
        //    91: getfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1.L$0:Ljava/lang/Object;
        //    94: checkcast       Lcom/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource;
        //    97: astore_3       
        //    98: aload_3        
        //    99: astore_2       
        //   100: aload           6
        //   102: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   105: aload           6
        //   107: astore          4
        //   109: goto            199
        //   112: astore_3       
        //   113: goto            224
        //   116: new             Ljava/lang/IllegalStateException;
        //   119: dup            
        //   120: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   122: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   125: athrow         
        //   126: aload           6
        //   128: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   131: new             Lcom/reddit/queries/j5;
        //   134: dup            
        //   135: aload_2        
        //   136: invokestatic    h7/h$a.c:(Ljava/lang/Object;)Lh7/h;
        //   139: aload_3        
        //   140: invokestatic    aa1/a.D:(Ljava/lang/String;)Lh7/h;
        //   143: aload           4
        //   145: invokestatic    aa1/a.D:(Ljava/lang/String;)Lh7/h;
        //   148: iload_1        
        //   149: invokestatic    a.g:(I)Lh7/h;
        //   152: invokespecial   com/reddit/queries/j5.<init>:(Lh7/h;Lh7/h;Lh7/h;Lh7/h;)V
        //   155: astore_2       
        //   156: aload_0        
        //   157: getfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource.a:Lj60/b;
        //   160: astore_3       
        //   161: aload           5
        //   163: aload_0        
        //   164: putfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1.L$0:Ljava/lang/Object;
        //   167: aload           5
        //   169: iconst_1       
        //   170: putfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource$fetchPaginatedListings$1.label:I
        //   173: bipush          14
        //   175: aload_2        
        //   176: aload_3        
        //   177: aconst_null    
        //   178: aconst_null    
        //   179: aload           5
        //   181: aconst_null    
        //   182: invokestatic    mr0/e$a.b:(ILh7/k;Lmr0/e;Lcom/reddit/network/common/RetryAlgo;Ljava/util/Map;Llg2/c;Lokhttp3/OkHttpClient;)Ljava/lang/Object;
        //   185: astore          4
        //   187: aload           4
        //   189: aload           8
        //   191: if_acmpne       197
        //   194: aload           8
        //   196: areturn        
        //   197: aload_0        
        //   198: astore_3       
        //   199: aload_3        
        //   200: astore_2       
        //   201: new             Lq20/d;
        //   204: astore          5
        //   206: aload_3        
        //   207: astore_2       
        //   208: aload           5
        //   210: aload           4
        //   212: invokespecial   q20/d.<init>:(Ljava/lang/Object;)V
        //   215: aload           5
        //   217: astore_2       
        //   218: goto            265
        //   221: astore_3       
        //   222: aload_0        
        //   223: astore_2       
        //   224: aload_2        
        //   225: getfield        com/reddit/data/snoovatar/datasource/remote/RemoteStorefrontDataSource.b:Lcw0/a;
        //   228: aload_3        
        //   229: invokeinterface cw0/a.b:(Ljava/lang/Throwable;)V
        //   234: new             Lq20/b;
        //   237: dup            
        //   238: new             Lj60/a$a;
        //   241: dup            
        //   242: aload_3        
        //   243: invokespecial   j60/a$a.<init>:(Ljava/lang/Exception;)V
        //   246: invokespecial   q20/b.<init>:(Ljava/lang/Object;)V
        //   249: astore_2       
        //   250: goto            265
        //   253: astore_2       
        //   254: new             Lq20/b;
        //   257: dup            
        //   258: getstatic       j60/a$b.a:Lj60/a$b;
        //   261: invokespecial   q20/b.<init>:(Ljava/lang/Object;)V
        //   264: astore_2       
        //   265: aload_2        
        //   266: areturn        
        //   267: astore_2       
        //   268: aload_2        
        //   269: athrow         
        //    Signature:
        //  (ILg22/j3;Ljava/lang/String;Ljava/lang/String;Llg2/c<-Lq20/c<Lcom/reddit/queries/j5$c;+Lj60/a;>;>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  100    105    267    270    Ljava/util/concurrent/CancellationException;
        //  100    105    253    265    Ljava/io/IOException;
        //  100    105    112    116    Ljava/lang/Exception;
        //  156    187    267    270    Ljava/util/concurrent/CancellationException;
        //  156    187    253    265    Ljava/io/IOException;
        //  156    187    221    224    Ljava/lang/Exception;
        //  201    206    267    270    Ljava/util/concurrent/CancellationException;
        //  201    206    253    265    Ljava/io/IOException;
        //  201    206    112    116    Ljava/lang/Exception;
        //  208    215    267    270    Ljava/util/concurrent/CancellationException;
        //  208    215    253    265    Ljava/io/IOException;
        //  208    215    112    116    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.generateNameForVariable(NameVariables.java:252)
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.assignNamesToVariables(NameVariables.java:175)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.nameVariables(AstMethodBodyBuilder.java:1482)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.populateVariables(AstMethodBodyBuilder.java:1408)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
