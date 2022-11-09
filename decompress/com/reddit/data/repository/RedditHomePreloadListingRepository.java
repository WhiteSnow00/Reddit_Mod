// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import pg2.j;
import tg2.c;
import javax.inject.Inject;
import pj2.u;
import kotlinx.coroutines.channels.BufferOverflow;
import ah2.f;
import kotlinx.coroutines.flow.h;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import of0.f0;
import ge0.a0;
import fd0.b;
import ew.a;
import db0.c0;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import ge0.m;

public final class RedditHomePreloadListingRepository implements m
{
    public final RemoteGqlLinkDataSource a;
    public final c0 b;
    public final a c;
    public final b d;
    public final a0 e;
    public final f0 f;
    public final gv.a g;
    public boolean h;
    public SortType i;
    public SortTimeFrame j;
    public ListingViewMode k;
    public final h l;
    
    @Inject
    public RedditHomePreloadListingRepository(final RemoteGqlLinkDataSource a, final c0 b, final a c, final b d, final a0 e, final f0 f, final gv.a g) {
        ah2.f.f((Object)a, "remoteGql");
        ah2.f.f((Object)b, "startupFeatures");
        ah2.f.f((Object)c, "adContextBuilder");
        ah2.f.f((Object)d, "onboardingChainingRepository");
        ah2.f.f((Object)e, "preferenceRepository");
        ah2.f.f((Object)f, "listingSortUseCase");
        ah2.f.f((Object)g, "adsFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.l = u.g(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }
    
    public final Object a(final c<? super j> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lcom/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1;
        //     4: ifeq            35
        //     7: aload_1        
        //     8: checkcast       Lcom/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1;
        //    11: astore_2       
        //    12: aload_2        
        //    13: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.label:I
        //    16: istore_3       
        //    17: iload_3        
        //    18: ldc             -2147483648
        //    20: iand           
        //    21: ifeq            35
        //    24: aload_2        
        //    25: iload_3        
        //    26: ldc             -2147483648
        //    28: iadd           
        //    29: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.label:I
        //    32: goto            45
        //    35: new             Lcom/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1;
        //    38: dup            
        //    39: aload_0        
        //    40: aload_1        
        //    41: invokespecial   com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.<init>:(Lcom/reddit/data/repository/RedditHomePreloadListingRepository;Ltg2/c;)V
        //    44: astore_2       
        //    45: aload_2        
        //    46: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.result:Ljava/lang/Object;
        //    49: astore          4
        //    51: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //    54: astore          5
        //    56: aload_2        
        //    57: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.label:I
        //    60: istore_3       
        //    61: iload_3        
        //    62: ifeq            218
        //    65: iload_3        
        //    66: iconst_1       
        //    67: if_icmpeq       139
        //    70: iload_3        
        //    71: iconst_2       
        //    72: if_icmpeq       119
        //    75: iload_3        
        //    76: iconst_3       
        //    77: if_icmpeq       103
        //    80: iload_3        
        //    81: iconst_4       
        //    82: if_icmpne       93
        //    85: aload           4
        //    87: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //    90: goto            658
        //    93: new             Ljava/lang/IllegalStateException;
        //    96: dup            
        //    97: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    99: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   102: athrow         
        //   103: aload_2        
        //   104: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$0:Ljava/lang/Object;
        //   107: checkcast       Lcom/reddit/data/repository/RedditHomePreloadListingRepository;
        //   110: astore_1       
        //   111: aload           4
        //   113: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   116: goto            658
        //   119: aload_2        
        //   120: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$0:Ljava/lang/Object;
        //   123: checkcast       Lcom/reddit/data/repository/RedditHomePreloadListingRepository;
        //   126: astore          6
        //   128: aload           6
        //   130: astore_1       
        //   131: aload           4
        //   133: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   136: goto            511
        //   139: aload_2        
        //   140: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$6:Ljava/lang/Object;
        //   143: checkcast       Lcom/reddit/listing/common/ListingViewMode;
        //   146: astore          6
        //   148: aload_2        
        //   149: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$5:Ljava/lang/Object;
        //   152: checkcast       Ljava/util/List;
        //   155: astore          7
        //   157: aload_2        
        //   158: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$4:Ljava/lang/Object;
        //   161: checkcast       Ljava/lang/Integer;
        //   164: astore          8
        //   166: aload_2        
        //   167: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$3:Ljava/lang/Object;
        //   170: checkcast       Lcom/reddit/listing/model/sort/SortTimeFrame;
        //   173: astore          9
        //   175: aload_2        
        //   176: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$2:Ljava/lang/Object;
        //   179: checkcast       Lcom/reddit/listing/model/sort/SortType;
        //   182: astore          10
        //   184: aload_2        
        //   185: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$1:Ljava/lang/Object;
        //   188: checkcast       Lcom/reddit/data/remote/RemoteGqlLinkDataSource;
        //   191: astore          11
        //   193: aload_2        
        //   194: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$0:Ljava/lang/Object;
        //   197: checkcast       Lcom/reddit/data/repository/RedditHomePreloadListingRepository;
        //   200: astore_1       
        //   201: aload           4
        //   203: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   206: aload           6
        //   208: astore          12
        //   210: goto            430
        //   213: astore          6
        //   215: goto            579
        //   218: aload           4
        //   220: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   223: aload_0        
        //   224: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.f:Lof0/f0;
        //   227: new             Lof0/f0$b;
        //   230: dup            
        //   231: ldc             "frontpage"
        //   233: new             Lof0/f0$a;
        //   236: dup            
        //   237: getstatic       com/reddit/listing/model/sort/SortType.BEST:Lcom/reddit/listing/model/sort/SortType;
        //   240: invokestatic    vu0/c.b:(Lcom/reddit/listing/model/sort/SortType;)I
        //   243: getstatic       com/reddit/listing/model/sort/SortTimeFrame.ALL:Lcom/reddit/listing/model/sort/SortTimeFrame;
        //   246: invokestatic    vu0/c.a:(Lcom/reddit/listing/model/sort/SortTimeFrame;)I
        //   249: invokespecial   of0/f0$a.<init>:(II)V
        //   252: invokespecial   of0/f0$b.<init>:(Ljava/lang/String;Lof0/f0$a;)V
        //   255: invokeinterface of0/f0.b:(Lof0/f0$b;)Lof0/f0$a;
        //   260: astore_1       
        //   261: aload_0        
        //   262: aload_1        
        //   263: getfield        of0/f0$a.a:I
        //   266: invokestatic    vu0/c.d:(I)Lcom/reddit/listing/model/sort/SortType;
        //   269: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository.i:Lcom/reddit/listing/model/sort/SortType;
        //   272: aload_0        
        //   273: aload_1        
        //   274: getfield        of0/f0$a.b:I
        //   277: invokestatic    vu0/c.c:(I)Lcom/reddit/listing/model/sort/SortTimeFrame;
        //   280: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository.j:Lcom/reddit/listing/model/sort/SortTimeFrame;
        //   283: aload_0        
        //   284: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.e:Lge0/a0;
        //   287: astore_1       
        //   288: aload_0        
        //   289: aload_1        
        //   290: ldc             "frontpage"
        //   292: aload_1        
        //   293: invokeinterface ge0/a0.C3:()Lcom/reddit/listing/common/ListingViewMode;
        //   298: invokeinterface ge0/a0.V3:(Ljava/lang/String;Lcom/reddit/listing/common/ListingViewMode;)Lcom/reddit/listing/common/ListingViewMode;
        //   303: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository.k:Lcom/reddit/listing/common/ListingViewMode;
        //   306: aload_0        
        //   307: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.a:Lcom/reddit/data/remote/RemoteGqlLinkDataSource;
        //   310: astore          6
        //   312: aload_0        
        //   313: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.i:Lcom/reddit/listing/model/sort/SortType;
        //   316: astore          10
        //   318: aload_0        
        //   319: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.j:Lcom/reddit/listing/model/sort/SortTimeFrame;
        //   322: astore          9
        //   324: new             Ljava/lang/Integer;
        //   327: astore          8
        //   329: aload           8
        //   331: bipush          7
        //   333: invokespecial   java/lang/Integer.<init>:(I)V
        //   336: aload_0        
        //   337: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.d:Lfd0/b;
        //   340: invokeinterface fd0/b.b:()Ljava/util/List;
        //   345: astore          7
        //   347: aload_0        
        //   348: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.k:Lcom/reddit/listing/common/ListingViewMode;
        //   351: astore          12
        //   353: aload_0        
        //   354: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.c:Lew/a;
        //   357: astore_1       
        //   358: aload_2        
        //   359: aload_0        
        //   360: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$0:Ljava/lang/Object;
        //   363: aload_2        
        //   364: aload           6
        //   366: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$1:Ljava/lang/Object;
        //   369: aload_2        
        //   370: aload           10
        //   372: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$2:Ljava/lang/Object;
        //   375: aload_2        
        //   376: aload           9
        //   378: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$3:Ljava/lang/Object;
        //   381: aload_2        
        //   382: aload           8
        //   384: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$4:Ljava/lang/Object;
        //   387: aload_2        
        //   388: aload           7
        //   390: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$5:Ljava/lang/Object;
        //   393: aload_2        
        //   394: aload           12
        //   396: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$6:Ljava/lang/Object;
        //   399: aload_2        
        //   400: iconst_1       
        //   401: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.label:I
        //   404: aload_1        
        //   405: aconst_null    
        //   406: aload_2        
        //   407: invokeinterface ew/a.a:(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;
        //   412: astore          4
        //   414: aload           4
        //   416: aload           5
        //   418: if_acmpne       424
        //   421: aload           5
        //   423: areturn        
        //   424: aload_0        
        //   425: astore_1       
        //   426: aload           6
        //   428: astore          11
        //   430: aload           4
        //   432: checkcast       Ldv/a;
        //   435: astore          6
        //   437: aload_2        
        //   438: aload_1        
        //   439: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$0:Ljava/lang/Object;
        //   442: aload_2        
        //   443: aconst_null    
        //   444: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$1:Ljava/lang/Object;
        //   447: aload_2        
        //   448: aconst_null    
        //   449: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$2:Ljava/lang/Object;
        //   452: aload_2        
        //   453: aconst_null    
        //   454: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$3:Ljava/lang/Object;
        //   457: aload_2        
        //   458: aconst_null    
        //   459: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$4:Ljava/lang/Object;
        //   462: aload_2        
        //   463: aconst_null    
        //   464: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$5:Ljava/lang/Object;
        //   467: aload_2        
        //   468: aconst_null    
        //   469: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$6:Ljava/lang/Object;
        //   472: aload_2        
        //   473: iconst_2       
        //   474: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.label:I
        //   477: aload           11
        //   479: aload           10
        //   481: aload           9
        //   483: aload           8
        //   485: aload           7
        //   487: aload           12
        //   489: aload           6
        //   491: iconst_0       
        //   492: aload_2        
        //   493: invokevirtual   com/reddit/data/remote/RemoteGqlLinkDataSource.f:(Lcom/reddit/listing/model/sort/SortType;Lcom/reddit/listing/model/sort/SortTimeFrame;Ljava/lang/Integer;Ljava/util/List;Lcom/reddit/listing/common/ListingViewMode;Ldv/a;ZLtg2/c;)Ljava/lang/Object;
        //   496: astore          4
        //   498: aload           4
        //   500: aload           5
        //   502: if_acmpne       508
        //   505: aload           5
        //   507: areturn        
        //   508: aload_1        
        //   509: astore          6
        //   511: aload           6
        //   513: astore_1       
        //   514: aload           4
        //   516: checkcast       Lcom/reddit/domain/model/listing/Listing;
        //   519: astore          4
        //   521: aload           6
        //   523: astore_1       
        //   524: aload           6
        //   526: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.l:Lkotlinx/coroutines/flow/h;
        //   529: astore          12
        //   531: aload           6
        //   533: astore_1       
        //   534: aload_2        
        //   535: aload           6
        //   537: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$0:Ljava/lang/Object;
        //   540: aload           6
        //   542: astore_1       
        //   543: aload_2        
        //   544: iconst_3       
        //   545: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.label:I
        //   548: aload           6
        //   550: astore_1       
        //   551: aload           12
        //   553: aload           4
        //   555: aload_2        
        //   556: invokevirtual   kotlinx/coroutines/flow/h.emit:(Ljava/lang/Object;Ltg2/c;)Ljava/lang/Object;
        //   559: astore          6
        //   561: aload           6
        //   563: aload           5
        //   565: if_acmpne       658
        //   568: aload           5
        //   570: areturn        
        //   571: astore          6
        //   573: goto            579
        //   576: astore_1       
        //   577: aload_0        
        //   578: astore_1       
        //   579: aload_1        
        //   580: getfield        com/reddit/data/repository/RedditHomePreloadListingRepository.l:Lkotlinx/coroutines/flow/h;
        //   583: astore          6
        //   585: new             Lcom/reddit/domain/model/listing/Listing;
        //   588: dup            
        //   589: aconst_null    
        //   590: aconst_null    
        //   591: aconst_null    
        //   592: aconst_null    
        //   593: aconst_null    
        //   594: iconst_0       
        //   595: aconst_null    
        //   596: bipush          127
        //   598: aconst_null    
        //   599: invokespecial   com/reddit/domain/model/listing/Listing.<init>:(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   602: astore_1       
        //   603: aload_2        
        //   604: aconst_null    
        //   605: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$0:Ljava/lang/Object;
        //   608: aload_2        
        //   609: aconst_null    
        //   610: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$1:Ljava/lang/Object;
        //   613: aload_2        
        //   614: aconst_null    
        //   615: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$2:Ljava/lang/Object;
        //   618: aload_2        
        //   619: aconst_null    
        //   620: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$3:Ljava/lang/Object;
        //   623: aload_2        
        //   624: aconst_null    
        //   625: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$4:Ljava/lang/Object;
        //   628: aload_2        
        //   629: aconst_null    
        //   630: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$5:Ljava/lang/Object;
        //   633: aload_2        
        //   634: aconst_null    
        //   635: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.L$6:Ljava/lang/Object;
        //   638: aload_2        
        //   639: iconst_4       
        //   640: putfield        com/reddit/data/repository/RedditHomePreloadListingRepository$initiatePreload$1.label:I
        //   643: aload           6
        //   645: aload_1        
        //   646: aload_2        
        //   647: invokevirtual   kotlinx/coroutines/flow/h.emit:(Ljava/lang/Object;Ltg2/c;)Ljava/lang/Object;
        //   650: aload           5
        //   652: if_acmpne       658
        //   655: aload           5
        //   657: areturn        
        //   658: getstatic       pg2/j.a:Lpg2/j;
        //   661: areturn        
        //   662: astore          6
        //   664: goto            579
        //   667: astore          6
        //   669: goto            573
        //    Signature:
        //  (Ltg2/c<-Lpg2/j;>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  111    116    662    667    Ljava/lang/Exception;
        //  131    136    662    667    Ljava/lang/Exception;
        //  201    206    213    218    Ljava/lang/Exception;
        //  306    414    576    579    Ljava/lang/Exception;
        //  430    477    571    573    Ljava/lang/Exception;
        //  477    498    667    672    Ljava/lang/Exception;
        //  514    521    662    667    Ljava/lang/Exception;
        //  524    531    662    667    Ljava/lang/Exception;
        //  534    540    662    667    Ljava/lang/Exception;
        //  543    548    662    667    Ljava/lang/Exception;
        //  551    561    662    667    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0508:
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
    
    public final h b() {
        return this.l;
    }
    
    public final boolean c(final SortType sortType, final SortTimeFrame sortTimeFrame, final ListingViewMode listingViewMode) {
        ah2.f.f((Object)sortType, "sort");
        return !this.h && this.i == sortType && this.j == sortTimeFrame && this.k == listingViewMode;
    }
    
    public final void dispose() {
        this.h = true;
        this.i = null;
        this.j = null;
        this.k = null;
    }
}
