// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import zg2.a;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import pj2.f;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@" }, d2 = { "T", "Lpj2/f;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = { 134, 138, 160 }, m = "invokeSuspend")
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements p<f<Object>, c<? super j>, Object>
{
    public final /* synthetic */ a<Object> $block;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(final a<Object> $block, final c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> c) {
        this.$block = $block;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, (c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1>)c);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = l$0;
        return (c<j>)snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }
    
    public final Object invoke(final f<Object> f, final c<? super j> c) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1)this.create(f, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.label:I
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifeq            206
        //    13: iload_3        
        //    14: iconst_1       
        //    15: if_icmpeq       133
        //    18: iload_3        
        //    19: iconst_2       
        //    20: if_icmpeq       41
        //    23: iload_3        
        //    24: iconst_3       
        //    25: if_icmpne       31
        //    28: goto            133
        //    31: new             Ljava/lang/IllegalStateException;
        //    34: dup            
        //    35: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    37: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    40: athrow         
        //    41: aload_0        
        //    42: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.I$0:I
        //    45: istore_3       
        //    46: aload_0        
        //    47: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$5:Ljava/lang/Object;
        //    50: astore          4
        //    52: aload_0        
        //    53: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$4:Ljava/lang/Object;
        //    56: checkcast       Li1/c;
        //    59: astore          5
        //    61: aload_0        
        //    62: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$3:Ljava/lang/Object;
        //    65: checkcast       Loj2/e;
        //    68: astore          6
        //    70: aload_0        
        //    71: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$2:Ljava/lang/Object;
        //    74: checkcast       Lzg2/l;
        //    77: astore          7
        //    79: aload_0        
        //    80: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$1:Ljava/lang/Object;
        //    83: checkcast       Ljava/util/Set;
        //    86: astore          8
        //    88: aload_0        
        //    89: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0:Ljava/lang/Object;
        //    92: checkcast       Lpj2/f;
        //    95: astore          9
        //    97: aload_1        
        //    98: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   101: aload_1        
        //   102: astore          10
        //   104: aload           5
        //   106: astore_1       
        //   107: aload_0        
        //   108: astore          11
        //   110: aload           7
        //   112: astore          5
        //   114: aload           10
        //   116: astore          7
        //   118: aload           9
        //   120: astore          10
        //   122: goto            546
        //   125: astore_1       
        //   126: aload           5
        //   128: astore          10
        //   130: goto            996
        //   133: aload_0        
        //   134: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$5:Ljava/lang/Object;
        //   137: astore          9
        //   139: aload_0        
        //   140: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$4:Ljava/lang/Object;
        //   143: checkcast       Li1/c;
        //   146: astore          8
        //   148: aload_0        
        //   149: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$3:Ljava/lang/Object;
        //   152: checkcast       Loj2/e;
        //   155: astore          4
        //   157: aload_0        
        //   158: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$2:Ljava/lang/Object;
        //   161: checkcast       Lzg2/l;
        //   164: astore          5
        //   166: aload_0        
        //   167: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$1:Ljava/lang/Object;
        //   170: checkcast       Ljava/util/Set;
        //   173: astore          6
        //   175: aload_0        
        //   176: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0:Ljava/lang/Object;
        //   179: checkcast       Lpj2/f;
        //   182: astore          11
        //   184: aload           8
        //   186: astore          10
        //   188: aload_1        
        //   189: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   192: aload           9
        //   194: astore_1       
        //   195: aload           8
        //   197: astore          10
        //   199: aload           4
        //   201: astore          8
        //   203: goto            403
        //   206: aload_1        
        //   207: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   210: aload_0        
        //   211: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0:Ljava/lang/Object;
        //   214: checkcast       Lpj2/f;
        //   217: astore          11
        //   219: new             Ljava/util/LinkedHashSet;
        //   222: dup            
        //   223: invokespecial   java/util/LinkedHashSet.<init>:()V
        //   226: astore          6
        //   228: new             Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1;
        //   231: dup            
        //   232: aload           6
        //   234: invokespecial   androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1.<init>:(Ljava/util/Set;)V
        //   237: astore          5
        //   239: ldc             2147483647
        //   241: aconst_null    
        //   242: bipush          6
        //   244: invokestatic    yl/a.b:(ILkotlinx/coroutines/channels/BufferOverflow;I)Lkotlinx/coroutines/channels/AbstractChannel;
        //   247: astore          8
        //   249: new             Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1;
        //   252: dup            
        //   253: aload           8
        //   255: invokespecial   androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1.<init>:(Loj2/e;)V
        //   258: invokestatic    i1/f$a.c:(Lzg2/p;)Li1/e;
        //   261: astore_1       
        //   262: aload_1        
        //   263: astore          10
        //   265: invokestatic    androidx/compose/runtime/snapshots/SnapshotKt.i:()Li1/f;
        //   268: aload           5
        //   270: invokevirtual   i1/f.r:(Lzg2/l;)Li1/f;
        //   273: astore          9
        //   275: aload_1        
        //   276: astore          10
        //   278: aload_0        
        //   279: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.$block:Lzg2/a;
        //   282: astore          4
        //   284: aload           9
        //   286: invokevirtual   i1/f.i:()Li1/f;
        //   289: astore          10
        //   291: aload           4
        //   293: invokeinterface zg2/a.invoke:()Ljava/lang/Object;
        //   298: astore          4
        //   300: aload           10
        //   302: invokestatic    i1/f.o:(Li1/f;)V
        //   305: aload_1        
        //   306: astore          10
        //   308: aload           9
        //   310: invokevirtual   i1/f.c:()V
        //   313: aload_1        
        //   314: astore          10
        //   316: aload_0        
        //   317: aload           11
        //   319: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0:Ljava/lang/Object;
        //   322: aload_1        
        //   323: astore          10
        //   325: aload_0        
        //   326: aload           6
        //   328: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$1:Ljava/lang/Object;
        //   331: aload_1        
        //   332: astore          10
        //   334: aload_0        
        //   335: aload           5
        //   337: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$2:Ljava/lang/Object;
        //   340: aload_1        
        //   341: astore          10
        //   343: aload_0        
        //   344: aload           8
        //   346: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$3:Ljava/lang/Object;
        //   349: aload_1        
        //   350: astore          10
        //   352: aload_0        
        //   353: aload_1        
        //   354: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$4:Ljava/lang/Object;
        //   357: aload_1        
        //   358: astore          10
        //   360: aload_0        
        //   361: aload           4
        //   363: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$5:Ljava/lang/Object;
        //   366: aload_1        
        //   367: astore          10
        //   369: aload_0        
        //   370: iconst_1       
        //   371: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.label:I
        //   374: aload_1        
        //   375: astore          10
        //   377: aload           11
        //   379: aload           4
        //   381: aload_0        
        //   382: invokeinterface pj2/f.emit:(Ljava/lang/Object;Ltg2/c;)Ljava/lang/Object;
        //   387: astore          9
        //   389: aload           9
        //   391: aload_2        
        //   392: if_acmpne       397
        //   395: aload_2        
        //   396: areturn        
        //   397: aload_1        
        //   398: astore          10
        //   400: aload           4
        //   402: astore_1       
        //   403: aload           11
        //   405: astore          4
        //   407: aload           6
        //   409: astore          11
        //   411: aload           5
        //   413: astore          6
        //   415: aload           8
        //   417: astore          5
        //   419: aload           10
        //   421: astore          9
        //   423: aload_1        
        //   424: astore          8
        //   426: aload_0        
        //   427: astore          10
        //   429: aload           9
        //   431: astore_1       
        //   432: aload           10
        //   434: aload           4
        //   436: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0:Ljava/lang/Object;
        //   439: aload           10
        //   441: aload           11
        //   443: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$1:Ljava/lang/Object;
        //   446: aload           10
        //   448: aload           6
        //   450: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$2:Ljava/lang/Object;
        //   453: aload           10
        //   455: aload           5
        //   457: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$3:Ljava/lang/Object;
        //   460: aload           10
        //   462: aload_1        
        //   463: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$4:Ljava/lang/Object;
        //   466: aload           10
        //   468: aload           8
        //   470: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$5:Ljava/lang/Object;
        //   473: aload           10
        //   475: iconst_0       
        //   476: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.I$0:I
        //   479: aload           10
        //   481: iconst_2       
        //   482: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.label:I
        //   485: aload           5
        //   487: aload           10
        //   489: invokeinterface oj2/p.m:(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
        //   494: astore          12
        //   496: aload           12
        //   498: aload_2        
        //   499: if_acmpne       504
        //   502: aload_2        
        //   503: areturn        
        //   504: aload           4
        //   506: astore          7
        //   508: aload           6
        //   510: astore          9
        //   512: aload           5
        //   514: astore          6
        //   516: aload           8
        //   518: astore          4
        //   520: aload           10
        //   522: astore          13
        //   524: iconst_0       
        //   525: istore_3       
        //   526: aload           7
        //   528: astore          10
        //   530: aload           12
        //   532: astore          7
        //   534: aload           11
        //   536: astore          8
        //   538: aload           9
        //   540: astore          5
        //   542: aload           13
        //   544: astore          11
        //   546: aload           7
        //   548: checkcast       Ljava/util/Set;
        //   551: astore          9
        //   553: iload_3        
        //   554: ifne            694
        //   557: aload           8
        //   559: invokeinterface java/util/Set.size:()I
        //   564: aload           9
        //   566: invokeinterface java/util/Set.size:()I
        //   571: if_icmpge       626
        //   574: aload           8
        //   576: invokeinterface java/util/Collection.isEmpty:()Z
        //   581: ifeq            587
        //   584: goto            680
        //   587: aload           8
        //   589: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   594: astore          7
        //   596: aload           7
        //   598: invokeinterface java/util/Iterator.hasNext:()Z
        //   603: ifeq            680
        //   606: aload           9
        //   608: aload           7
        //   610: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   615: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   620: ifeq            596
        //   623: goto            675
        //   626: aload           9
        //   628: invokeinterface java/util/Collection.isEmpty:()Z
        //   633: ifeq            639
        //   636: goto            680
        //   639: aload           9
        //   641: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   646: astore          9
        //   648: aload           9
        //   650: invokeinterface java/util/Iterator.hasNext:()Z
        //   655: ifeq            680
        //   658: aload           8
        //   660: aload           9
        //   662: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   667: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   672: ifeq            648
        //   675: iconst_1       
        //   676: istore_3       
        //   677: goto            682
        //   680: iconst_0       
        //   681: istore_3       
        //   682: iload_3        
        //   683: ifeq            689
        //   686: goto            694
        //   689: iconst_0       
        //   690: istore_3       
        //   691: goto            696
        //   694: iconst_1       
        //   695: istore_3       
        //   696: aload           6
        //   698: invokeinterface oj2/p.j:()Ljava/lang/Object;
        //   703: astore          9
        //   705: aload           9
        //   707: instanceof      Loj2/h$b;
        //   710: ifne            716
        //   713: goto            719
        //   716: aconst_null    
        //   717: astore          9
        //   719: aload           9
        //   721: checkcast       Ljava/util/Set;
        //   724: astore          9
        //   726: aload           9
        //   728: ifnonnull       933
        //   731: iload_3        
        //   732: ifeq            890
        //   735: aload           8
        //   737: invokeinterface java/util/Set.clear:()V
        //   742: invokestatic    androidx/compose/runtime/snapshots/SnapshotKt.i:()Li1/f;
        //   745: aload           5
        //   747: invokevirtual   i1/f.r:(Lzg2/l;)Li1/f;
        //   750: astore          7
        //   752: aload           11
        //   754: getfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.$block:Lzg2/a;
        //   757: astore          9
        //   759: aload           7
        //   761: invokevirtual   i1/f.i:()Li1/f;
        //   764: astore          13
        //   766: aload           9
        //   768: invokeinterface zg2/a.invoke:()Ljava/lang/Object;
        //   773: astore          9
        //   775: aload           13
        //   777: invokestatic    i1/f.o:(Li1/f;)V
        //   780: aload           7
        //   782: invokevirtual   i1/f.c:()V
        //   785: aload           9
        //   787: aload           4
        //   789: invokestatic    ah2/f.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   792: ifne            890
        //   795: aload           11
        //   797: aload           10
        //   799: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0:Ljava/lang/Object;
        //   802: aload           11
        //   804: aload           8
        //   806: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$1:Ljava/lang/Object;
        //   809: aload           11
        //   811: aload           5
        //   813: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$2:Ljava/lang/Object;
        //   816: aload           11
        //   818: aload           6
        //   820: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$3:Ljava/lang/Object;
        //   823: aload           11
        //   825: aload_1        
        //   826: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$4:Ljava/lang/Object;
        //   829: aload           11
        //   831: aload           9
        //   833: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$5:Ljava/lang/Object;
        //   836: aload           11
        //   838: iconst_3       
        //   839: putfield        androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.label:I
        //   842: aload           10
        //   844: aload           9
        //   846: aload           11
        //   848: invokeinterface pj2/f.emit:(Ljava/lang/Object;Ltg2/c;)Ljava/lang/Object;
        //   853: astore          7
        //   855: aload           9
        //   857: astore          4
        //   859: aload           7
        //   861: aload_2        
        //   862: if_acmpne       890
        //   865: aload_2        
        //   866: areturn        
        //   867: astore          10
        //   869: goto            882
        //   872: astore          10
        //   874: aload           13
        //   876: invokestatic    i1/f.o:(Li1/f;)V
        //   879: aload           10
        //   881: athrow         
        //   882: aload           7
        //   884: invokevirtual   i1/f.c:()V
        //   887: aload           10
        //   889: athrow         
        //   890: aload           11
        //   892: astore          13
        //   894: aload           5
        //   896: astore          11
        //   898: aload           8
        //   900: astore          7
        //   902: aload           10
        //   904: astore          9
        //   906: aload           4
        //   908: astore          8
        //   910: aload           13
        //   912: astore          10
        //   914: aload           6
        //   916: astore          5
        //   918: aload           11
        //   920: astore          6
        //   922: aload           7
        //   924: astore          11
        //   926: aload           9
        //   928: astore          4
        //   930: goto            432
        //   933: goto            553
        //   936: astore          10
        //   938: aload_1        
        //   939: astore          8
        //   941: aload           10
        //   943: astore_1       
        //   944: aload           8
        //   946: astore          10
        //   948: goto            996
        //   951: astore          10
        //   953: aload_1        
        //   954: astore          8
        //   956: aload           10
        //   958: astore_1       
        //   959: aload           8
        //   961: astore          10
        //   963: goto            996
        //   966: astore          8
        //   968: goto            981
        //   971: astore          8
        //   973: aload           10
        //   975: invokestatic    i1/f.o:(Li1/f;)V
        //   978: aload           8
        //   980: athrow         
        //   981: aload_1        
        //   982: astore          10
        //   984: aload           9
        //   986: invokevirtual   i1/f.c:()V
        //   989: aload_1        
        //   990: astore          10
        //   992: aload           8
        //   994: athrow         
        //   995: astore_1       
        //   996: aload           10
        //   998: invokeinterface i1/c.dispose:()V
        //  1003: aload_1        
        //  1004: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  97     101    125    133    Any
        //  188    192    995    996    Any
        //  265    275    995    996    Any
        //  278    284    995    996    Any
        //  284    291    966    995    Any
        //  291    300    971    981    Any
        //  300    305    966    995    Any
        //  308    313    995    996    Any
        //  316    322    995    996    Any
        //  325    331    995    996    Any
        //  334    340    995    996    Any
        //  343    349    995    996    Any
        //  352    357    995    996    Any
        //  360    366    995    996    Any
        //  369    374    995    996    Any
        //  377    389    995    996    Any
        //  432    496    951    966    Any
        //  546    553    936    951    Any
        //  557    584    936    951    Any
        //  587    596    936    951    Any
        //  596    623    936    951    Any
        //  626    636    936    951    Any
        //  639    648    936    951    Any
        //  648    675    936    951    Any
        //  696    713    936    951    Any
        //  719    726    936    951    Any
        //  735    759    936    951    Any
        //  759    766    867    872    Any
        //  766    775    872    882    Any
        //  775    780    867    872    Any
        //  780    855    936    951    Any
        //  874    882    867    872    Any
        //  882    890    936    951    Any
        //  973    981    966    995    Any
        //  984    989    995    996    Any
        //  992    995    995    996    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0397:
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
