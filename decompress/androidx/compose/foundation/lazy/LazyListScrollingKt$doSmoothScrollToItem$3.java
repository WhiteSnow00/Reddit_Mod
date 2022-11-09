// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import tg2.c;
import n0.j;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Ln0/j;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", l = { 114, 205 }, m = "invokeSuspend")
final class LazyListScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements p<j, c<? super pg2.j>, Object>
{
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public final /* synthetic */ LazyListState $this_doSmoothScrollToItem;
    public float F$0;
    public float F$1;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    
    public LazyListScrollingKt$doSmoothScrollToItem$3(final LazyListState $this_doSmoothScrollToItem, final int $index, final int $scrollOffset, final c<? super LazyListScrollingKt$doSmoothScrollToItem$3> c) {
        this.$this_doSmoothScrollToItem = $this_doSmoothScrollToItem;
        this.$index = $index;
        this.$scrollOffset = $scrollOffset;
        super(2, (c)c);
    }
    
    public static final boolean access$invokeSuspend$isOvershot(final boolean b, final LazyListState lazyListState, final int n, final int n2) {
        final boolean b2 = false;
        if (b) {
            if (lazyListState.f() <= n) {
                boolean b3 = b2;
                if (lazyListState.f() != n) {
                    return b3;
                }
                b3 = b2;
                if (lazyListState.g() <= n2) {
                    return b3;
                }
            }
        }
        else if (lazyListState.f() >= n) {
            boolean b3 = b2;
            if (lazyListState.f() != n) {
                return b3;
            }
            b3 = b2;
            if (lazyListState.g() >= n2) {
                return b3;
            }
        }
        return true;
    }
    
    public final c<pg2.j> create(final Object l$0, final c<?> c) {
        final LazyListScrollingKt$doSmoothScrollToItem$3 lazyListScrollingKt$doSmoothScrollToItem$3 = new LazyListScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset, (c<? super LazyListScrollingKt$doSmoothScrollToItem$3>)c);
        lazyListScrollingKt$doSmoothScrollToItem$3.L$0 = l$0;
        return (c<pg2.j>)lazyListScrollingKt$doSmoothScrollToItem$3;
    }
    
    public final Object invoke(final j j, final c<? super pg2.j> c) {
        return ((LazyListScrollingKt$doSmoothScrollToItem$3)this.create(j, c)).invokeSuspend(pg2.j.a);
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.label:I
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifeq            118
        //    13: iload_3        
        //    14: iconst_1       
        //    15: if_icmpeq       43
        //    18: iload_3        
        //    19: iconst_2       
        //    20: if_icmpne       33
        //    23: aload_1        
        //    24: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //    27: aload_0        
        //    28: astore          4
        //    30: goto            913
        //    33: new             Ljava/lang/IllegalStateException;
        //    36: dup            
        //    37: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    39: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    42: athrow         
        //    43: aload_0        
        //    44: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.I$0:I
        //    47: istore_3       
        //    48: aload_0        
        //    49: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.F$1:F
        //    52: fstore          5
        //    54: aload_0        
        //    55: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.F$0:F
        //    58: fstore          6
        //    60: aload_0        
        //    61: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$3:Ljava/lang/Object;
        //    64: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //    67: astore          7
        //    69: aload_0        
        //    70: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$2:Ljava/lang/Object;
        //    73: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //    76: astore          8
        //    78: aload_0        
        //    79: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$1:Ljava/lang/Object;
        //    82: checkcast       Lkotlin/jvm/internal/Ref$BooleanRef;
        //    85: astore          9
        //    87: aload_0        
        //    88: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$0:Ljava/lang/Object;
        //    91: checkcast       Ln0/j;
        //    94: astore          10
        //    96: aload_1        
        //    97: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   100: aload_0        
        //   101: astore_1       
        //   102: aload_2        
        //   103: astore          4
        //   105: goto            695
        //   108: astore          4
        //   110: aload_0        
        //   111: astore_1       
        //   112: aload_2        
        //   113: astore          11
        //   115: goto            779
        //   118: aload_1        
        //   119: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   122: aload_0        
        //   123: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$0:Ljava/lang/Object;
        //   126: checkcast       Ln0/j;
        //   129: astore          10
        //   131: aload_0        
        //   132: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   135: getfield        androidx/compose/foundation/lazy/LazyListState.e:Lz0/l0;
        //   138: invokevirtual   androidx/compose/runtime/SnapshotMutableStateImpl.getValue:()Ljava/lang/Object;
        //   141: checkcast       Lu2/b;
        //   144: getstatic       q0/r.a:F
        //   147: invokeinterface u2/b.M0:(F)F
        //   152: fstore          6
        //   154: aload_0        
        //   155: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   158: getfield        androidx/compose/foundation/lazy/LazyListState.e:Lz0/l0;
        //   161: invokevirtual   androidx/compose/runtime/SnapshotMutableStateImpl.getValue:()Ljava/lang/Object;
        //   164: checkcast       Lu2/b;
        //   167: getstatic       q0/r.b:F
        //   170: invokeinterface u2/b.M0:(F)F
        //   175: fstore          5
        //   177: new             Lkotlin/jvm/internal/Ref$BooleanRef;
        //   180: astore          9
        //   182: aload           9
        //   184: invokespecial   kotlin/jvm/internal/Ref$BooleanRef.<init>:()V
        //   187: aload           9
        //   189: iconst_1       
        //   190: putfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   193: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   196: astore          8
        //   198: aload           8
        //   200: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   203: aload           8
        //   205: fconst_0       
        //   206: fconst_0       
        //   207: bipush          30
        //   209: invokestatic    a80/a.b:(FFI)Ll0/e;
        //   212: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   215: aload_0        
        //   216: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   219: aload_0        
        //   220: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$index:I
        //   223: invokestatic    q0/r.a:(Landroidx/compose/foundation/lazy/LazyListState;I)Lq0/j;
        //   226: astore_1       
        //   227: aload_1        
        //   228: ifnonnull       750
        //   231: aload_0        
        //   232: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$index:I
        //   235: aload_0        
        //   236: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   239: invokevirtual   androidx/compose/foundation/lazy/LazyListState.f:()I
        //   242: if_icmple       250
        //   245: iconst_1       
        //   246: istore_3       
        //   247: goto            252
        //   250: iconst_0       
        //   251: istore_3       
        //   252: new             Lkotlin/jvm/internal/Ref$IntRef;
        //   255: astore          7
        //   257: aload           7
        //   259: invokespecial   kotlin/jvm/internal/Ref$IntRef.<init>:()V
        //   262: aload           7
        //   264: iconst_1       
        //   265: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   268: aload_0        
        //   269: astore_1       
        //   270: aload_2        
        //   271: astore          4
        //   273: aload           9
        //   275: getfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   278: ifeq            931
        //   281: aload_1        
        //   282: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   285: invokevirtual   androidx/compose/foundation/lazy/LazyListState.h:()Lq0/m;
        //   288: invokeinterface q0/m.a:()I
        //   293: ifle            931
        //   296: aload_1        
        //   297: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   300: invokevirtual   androidx/compose/foundation/lazy/LazyListState.h:()Lq0/m;
        //   303: invokeinterface q0/m.b:()Ljava/util/List;
        //   308: astore          12
        //   310: aload           12
        //   312: invokeinterface java/util/List.size:()I
        //   317: istore          13
        //   319: iconst_0       
        //   320: istore          14
        //   322: iconst_0       
        //   323: istore          15
        //   325: iload           14
        //   327: iload           13
        //   329: if_icmpge       374
        //   332: aload           4
        //   334: astore          11
        //   336: aload           10
        //   338: astore          16
        //   340: aload_1        
        //   341: astore_2       
        //   342: aload           12
        //   344: iload           14
        //   346: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   351: checkcast       Lq0/j;
        //   354: invokeinterface q0/j.getSize:()I
        //   359: istore          17
        //   361: iload           15
        //   363: iload           17
        //   365: iadd           
        //   366: istore          15
        //   368: iinc            14, 1
        //   371: goto            325
        //   374: iload           15
        //   376: aload           12
        //   378: invokeinterface java/util/List.size:()I
        //   383: idiv           
        //   384: istore          14
        //   386: aload_1        
        //   387: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$index:I
        //   390: aload_1        
        //   391: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   394: invokevirtual   androidx/compose/foundation/lazy/LazyListState.f:()I
        //   397: isub           
        //   398: iload           14
        //   400: imul           
        //   401: i2f            
        //   402: aload_1        
        //   403: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$scrollOffset:I
        //   406: i2f            
        //   407: fadd           
        //   408: aload_1        
        //   409: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   412: invokevirtual   androidx/compose/foundation/lazy/LazyListState.g:()I
        //   415: i2f            
        //   416: fsub           
        //   417: fstore          18
        //   419: fload           18
        //   421: invokestatic    java/lang/Math.abs:(F)F
        //   424: fload           6
        //   426: fcmpg          
        //   427: ifge            433
        //   430: goto            449
        //   433: iload_3        
        //   434: ifeq            444
        //   437: fload           6
        //   439: fstore          18
        //   441: goto            449
        //   444: fload           6
        //   446: fneg           
        //   447: fstore          18
        //   449: aload           8
        //   451: aload           8
        //   453: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   456: checkcast       Ll0/e;
        //   459: invokestatic    a80/a.z:(Ll0/e;)Ll0/e;
        //   462: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   465: new             Lkotlin/jvm/internal/Ref$FloatRef;
        //   468: astore          19
        //   470: aload           19
        //   472: invokespecial   kotlin/jvm/internal/Ref$FloatRef.<init>:()V
        //   475: aload           8
        //   477: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   480: checkcast       Ll0/e;
        //   483: astore          16
        //   485: new             Ljava/lang/Float;
        //   488: astore          20
        //   490: aload           20
        //   492: fload           18
        //   494: invokespecial   java/lang/Float.<init>:(F)V
        //   497: aload           8
        //   499: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   502: checkcast       Ll0/e;
        //   505: invokevirtual   l0/e.a:()Ljava/lang/Object;
        //   508: checkcast       Ljava/lang/Number;
        //   511: invokevirtual   java/lang/Number.floatValue:()F
        //   514: fconst_0       
        //   515: fcmpg          
        //   516: ifne            525
        //   519: iconst_1       
        //   520: istore          14
        //   522: goto            528
        //   525: iconst_0       
        //   526: istore          14
        //   528: iload           14
        //   530: ifne            539
        //   533: iconst_1       
        //   534: istore          21
        //   536: goto            542
        //   539: iconst_0       
        //   540: istore          21
        //   542: new             Landroidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3$2;
        //   545: astore          12
        //   547: iload_3        
        //   548: ifeq            557
        //   551: iconst_1       
        //   552: istore          22
        //   554: goto            560
        //   557: iconst_0       
        //   558: istore          22
        //   560: aload_1        
        //   561: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$index:I
        //   564: istore          15
        //   566: aload_1        
        //   567: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   570: astore_2       
        //   571: aload_1        
        //   572: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$scrollOffset:I
        //   575: istore          14
        //   577: aload_1        
        //   578: astore          11
        //   580: aload           12
        //   582: fload           18
        //   584: aload           19
        //   586: aload           10
        //   588: aload           9
        //   590: iload           22
        //   592: fload           5
        //   594: aload           7
        //   596: iload           15
        //   598: aload_2        
        //   599: iload           14
        //   601: aload           8
        //   603: invokespecial   androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3$2.<init>:(FLkotlin/jvm/internal/Ref$FloatRef;Ln0/j;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;ILandroidx/compose/foundation/lazy/LazyListState;ILkotlin/jvm/internal/Ref$ObjectRef;)V
        //   606: aload           10
        //   608: astore_2       
        //   609: aload           11
        //   611: aload_2        
        //   612: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$0:Ljava/lang/Object;
        //   615: aload           11
        //   617: aload           9
        //   619: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$1:Ljava/lang/Object;
        //   622: aload           11
        //   624: aload           8
        //   626: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$2:Ljava/lang/Object;
        //   629: aload           11
        //   631: aload           7
        //   633: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$3:Ljava/lang/Object;
        //   636: aload           11
        //   638: fload           6
        //   640: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.F$0:F
        //   643: aload           11
        //   645: fload           5
        //   647: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.F$1:F
        //   650: aload           11
        //   652: iload_3        
        //   653: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.I$0:I
        //   656: aload           11
        //   658: iconst_1       
        //   659: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.label:I
        //   662: aload           16
        //   664: aload           20
        //   666: aconst_null    
        //   667: iload           21
        //   669: aload           12
        //   671: aload           11
        //   673: iconst_2       
        //   674: invokestatic    androidx/compose/animation/core/SuspendAnimationKt.e:(Ll0/e;Ljava/lang/Float;Ll0/d;ZLzg2/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;
        //   677: astore          16
        //   679: aload           16
        //   681: aload           4
        //   683: if_acmpne       689
        //   686: aload           4
        //   688: areturn        
        //   689: aload           11
        //   691: astore_1       
        //   692: aload_2        
        //   693: astore          10
        //   695: aload           4
        //   697: astore          11
        //   699: aload           10
        //   701: astore          16
        //   703: aload_1        
        //   704: astore_2       
        //   705: aload           7
        //   707: aload           7
        //   709: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   712: iconst_1       
        //   713: iadd           
        //   714: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   717: goto            273
        //   720: astore          4
        //   722: aload           16
        //   724: astore          10
        //   726: aload_2        
        //   727: astore_1       
        //   728: goto            779
        //   731: astore_2       
        //   732: goto            740
        //   735: astore_2       
        //   736: goto            732
        //   739: astore_2       
        //   740: aload           4
        //   742: astore          11
        //   744: aload_2        
        //   745: astore          4
        //   747: goto            779
        //   750: new             Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //   753: astore          4
        //   755: aload           4
        //   757: aload_1        
        //   758: aload           8
        //   760: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   763: checkcast       Ll0/e;
        //   766: invokespecial   androidx/compose/foundation/lazy/ItemFoundInScroll.<init>:(Lq0/j;Ll0/e;)V
        //   769: aload           4
        //   771: athrow         
        //   772: astore          4
        //   774: aload_0        
        //   775: astore_1       
        //   776: aload_2        
        //   777: astore          11
        //   779: aload           4
        //   781: invokevirtual   androidx/compose/foundation/lazy/ItemFoundInScroll.getPreviousAnimation:()Ll0/e;
        //   784: invokestatic    a80/a.z:(Ll0/e;)Ll0/e;
        //   787: astore_2       
        //   788: aload           4
        //   790: invokevirtual   androidx/compose/foundation/lazy/ItemFoundInScroll.getItem:()Lq0/j;
        //   793: invokeinterface q0/j.getOffset:()I
        //   798: aload_1        
        //   799: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$scrollOffset:I
        //   802: iadd           
        //   803: i2f            
        //   804: fstore          6
        //   806: new             Lkotlin/jvm/internal/Ref$FloatRef;
        //   809: dup            
        //   810: invokespecial   kotlin/jvm/internal/Ref$FloatRef.<init>:()V
        //   813: astore          4
        //   815: new             Ljava/lang/Float;
        //   818: dup            
        //   819: fload           6
        //   821: invokespecial   java/lang/Float.<init>:(F)V
        //   824: astore          8
        //   826: aload_2        
        //   827: invokevirtual   l0/e.a:()Ljava/lang/Object;
        //   830: checkcast       Ljava/lang/Number;
        //   833: invokevirtual   java/lang/Number.floatValue:()F
        //   836: fconst_0       
        //   837: fcmpg          
        //   838: ifne            846
        //   841: iconst_1       
        //   842: istore_3       
        //   843: goto            848
        //   846: iconst_0       
        //   847: istore_3       
        //   848: new             Landroidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3$4;
        //   851: dup            
        //   852: fload           6
        //   854: aload           4
        //   856: aload           10
        //   858: invokespecial   androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3$4.<init>:(FLkotlin/jvm/internal/Ref$FloatRef;Ln0/j;)V
        //   861: astore          10
        //   863: aload_1        
        //   864: aconst_null    
        //   865: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$0:Ljava/lang/Object;
        //   868: aload_1        
        //   869: aconst_null    
        //   870: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$1:Ljava/lang/Object;
        //   873: aload_1        
        //   874: aconst_null    
        //   875: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$2:Ljava/lang/Object;
        //   878: aload_1        
        //   879: aconst_null    
        //   880: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.L$3:Ljava/lang/Object;
        //   883: aload_1        
        //   884: iconst_2       
        //   885: putfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.label:I
        //   888: aload_1        
        //   889: astore          4
        //   891: aload_2        
        //   892: aload           8
        //   894: aconst_null    
        //   895: iload_3        
        //   896: iconst_1       
        //   897: ixor           
        //   898: aload           10
        //   900: aload_1        
        //   901: iconst_2       
        //   902: invokestatic    androidx/compose/animation/core/SuspendAnimationKt.e:(Ll0/e;Ljava/lang/Float;Ll0/d;ZLzg2/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;
        //   905: aload           11
        //   907: if_acmpne       913
        //   910: aload           11
        //   912: areturn        
        //   913: aload           4
        //   915: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$this_doSmoothScrollToItem:Landroidx/compose/foundation/lazy/LazyListState;
        //   918: aload           4
        //   920: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$index:I
        //   923: aload           4
        //   925: getfield        androidx/compose/foundation/lazy/LazyListScrollingKt$doSmoothScrollToItem$3.$scrollOffset:I
        //   928: invokevirtual   androidx/compose/foundation/lazy/LazyListState.j:(II)V
        //   931: getstatic       pg2/j.a:Lpg2/j;
        //   934: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                
        //  -----  -----  -----  -----  ----------------------------------------------------
        //  96     100    108    118    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  131    227    772    779    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  231    245    772    779    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  252    268    772    779    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  273    319    739    740    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  342    361    720    731    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  374    430    739    740    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  449    519    739    740    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  542    547    739    740    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  560    577    739    740    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  580    606    735    739    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  609    679    731    732    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  705    717    720    731    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        //  750    772    772    779    Landroidx/compose/foundation/lazy/ItemFoundInScroll;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0689:
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
