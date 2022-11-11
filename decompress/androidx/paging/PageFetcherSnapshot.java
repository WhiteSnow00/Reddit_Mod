// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import c5.l;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import c5.k;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.sync.MutexImpl;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import c5.b0;
import c5.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import c5.o;
import hj2.f;
import rg2.q;
import c5.x;
import ej2.z0;
import lg2.c;
import lw0.b;
import kotlinx.coroutines.channels.BufferOverflow;
import a4.a0;
import c5.v;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import ej2.b1;
import c5.p;
import kotlinx.coroutines.channels.AbstractChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import c5.h;
import rg2.a;
import c5.u;
import c5.w;
import hg2.j;
import hj2.e;
import c5.r;

public final class PageFetcherSnapshot<Key, Value>
{
    public final Key a;
    public final PagingSource<Key, Value> b;
    public final r c;
    public final e<j> d;
    public final boolean e;
    public final w<Key, Value> f;
    public final u<Key, Value> g;
    public final rg2.a<j> h;
    public final h i;
    public final AtomicBoolean j;
    public final AbstractChannel k;
    public final p.a<Key, Value> l;
    public final b1 m;
    public final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 n;
    
    public PageFetcherSnapshot(final Object a, final PagingSource b, final r c, final e d, final boolean e, final v f, final u g, final rg2.a h) {
        sg2.e.f((Object)b, "pagingSource");
        sg2.e.f((Object)c, "config");
        sg2.e.f((Object)d, "retryFlow");
        this.a = (Key)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        if (c.f == Integer.MIN_VALUE || b.a()) {
            this.i = new h();
            this.j = new AtomicBoolean(false);
            this.k = a0.g(-2, null, 6);
            this.l = (p.a<Key, Value>)new p.a(c);
            final b1 m = lw0.b.m();
            this.m = m;
            this.n = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1((rg2.p)new PageFetcherSnapshot$pageEventFlow$2(this, (c)null), (e)SimpleChannelFlowKt.a((rg2.p<? super x<Object>, ? super c<? super j>, ?>)new CancelableChannelFlowKt$cancelableChannelFlow$1((z0)m, (rg2.p)new PageFetcherSnapshot$pageEventFlow$1(this, (c)null), (c)null)));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }
    
    public static final Object a(final PageFetcherSnapshot pageFetcherSnapshot, final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, final LoadType loadType, final c c) {
        pageFetcherSnapshot.getClass();
        final e<Object> a = FlowExtKt.a((e<?>)flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, (q<? super f<? super Object>, ? super Object, ? super c<? super j>, ?>)new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1((c)null, pageFetcherSnapshot, loadType));
        final PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, (c)null);
        sg2.e.f((Object)a, "<this>");
        Object o = kotlinx.coroutines.flow.a.b((e)new hj2.v((rg2.p)new FlowExtKt$simpleRunningReduce$1((e)a, (q)pageFetcherSnapshot$collectAsGenerationalViewportHints$3, (c)null)), -1).a(new o(pageFetcherSnapshot, loadType), c);
        if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o = j.a;
        }
        return o;
    }
    
    public static final Object b(final PageFetcherSnapshot p0, final LoadType p1, final g p2, final c p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aload_0        
        //     4: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     7: pop            
        //     8: aload_3        
        //     9: instanceof      Landroidx/paging/PageFetcherSnapshot$doLoad$1;
        //    12: ifeq            46
        //    15: aload_3        
        //    16: checkcast       Landroidx/paging/PageFetcherSnapshot$doLoad$1;
        //    19: astore_0       
        //    20: aload_0        
        //    21: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //    24: istore          5
        //    26: iload           5
        //    28: ldc             -2147483648
        //    30: iand           
        //    31: ifeq            46
        //    34: aload_0        
        //    35: iload           5
        //    37: ldc             -2147483648
        //    39: iadd           
        //    40: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //    43: goto            57
        //    46: new             Landroidx/paging/PageFetcherSnapshot$doLoad$1;
        //    49: dup            
        //    50: aload           4
        //    52: aload_3        
        //    53: invokespecial   androidx/paging/PageFetcherSnapshot$doLoad$1.<init>:(Landroidx/paging/PageFetcherSnapshot;Llg2/c;)V
        //    56: astore_0       
        //    57: aload_0        
        //    58: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.result:Ljava/lang/Object;
        //    61: astore          6
        //    63: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //    66: astore          7
        //    68: aload_0        
        //    69: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //    72: tableswitch {
        //                0: 1055
        //                1: 996
        //                2: 919
        //                3: 841
        //                4: 769
        //                5: 670
        //                6: 611
        //                7: 562
        //                8: 448
        //                9: 336
        //               10: 242
        //               11: 146
        //          default: 136
        //        }
        //   136: new             Ljava/lang/IllegalStateException;
        //   139: dup            
        //   140: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   142: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   145: athrow         
        //   146: aload_0        
        //   147: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.I$1:I
        //   150: istore          8
        //   152: aload_0        
        //   153: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.I$0:I
        //   156: istore          5
        //   158: aload_0        
        //   159: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //   162: checkcast       Loj2/c;
        //   165: astore          9
        //   167: aload_0        
        //   168: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //   171: checkcast       Lc5/p$a;
        //   174: astore          10
        //   176: aload_0        
        //   177: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   180: checkcast       Lkotlin/jvm/internal/Ref$BooleanRef;
        //   183: astore          11
        //   185: aload_0        
        //   186: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   189: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   192: astore          12
        //   194: aload_0        
        //   195: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   198: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   201: astore          13
        //   203: aload_0        
        //   204: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   207: checkcast       Lc5/g;
        //   210: astore          4
        //   212: aload_0        
        //   213: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   216: checkcast       Landroidx/paging/LoadType;
        //   219: astore_3       
        //   220: aload_0        
        //   221: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   224: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   227: astore_2       
        //   228: aload           6
        //   230: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   233: aload_0        
        //   234: astore_1       
        //   235: aload           10
        //   237: astore          6
        //   239: goto            3614
        //   242: aload_0        
        //   243: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //   246: checkcast       Loj2/c;
        //   249: astore          9
        //   251: aload_0        
        //   252: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //   255: checkcast       Landroidx/paging/PagingSource$b;
        //   258: astore          10
        //   260: aload_0        
        //   261: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //   264: checkcast       Landroidx/paging/PagingSource$a;
        //   267: astore          14
        //   269: aload_0        
        //   270: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   273: checkcast       Lkotlin/jvm/internal/Ref$BooleanRef;
        //   276: astore          11
        //   278: aload_0        
        //   279: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   282: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   285: astore          12
        //   287: aload_0        
        //   288: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   291: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   294: astore          13
        //   296: aload_0        
        //   297: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   300: checkcast       Lc5/g;
        //   303: astore          4
        //   305: aload_0        
        //   306: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   309: checkcast       Landroidx/paging/LoadType;
        //   312: astore_3       
        //   313: aload_0        
        //   314: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   317: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   320: astore_2       
        //   321: aload           9
        //   323: astore_1       
        //   324: aload           6
        //   326: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   329: aload           10
        //   331: astore          6
        //   333: goto            3369
        //   336: aload_0        
        //   337: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$9:Ljava/lang/Object;
        //   340: checkcast       Lc5/p;
        //   343: astore          13
        //   345: aload_0        
        //   346: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //   349: checkcast       Loj2/c;
        //   352: astore_2       
        //   353: aload_0        
        //   354: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //   357: checkcast       Landroidx/paging/PagingSource$b;
        //   360: astore          4
        //   362: aload_0        
        //   363: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //   366: checkcast       Landroidx/paging/PagingSource$a;
        //   369: astore          15
        //   371: aload_0        
        //   372: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   375: checkcast       Lkotlin/jvm/internal/Ref$BooleanRef;
        //   378: astore          12
        //   380: aload_0        
        //   381: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   384: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   387: astore          11
        //   389: aload_0        
        //   390: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   393: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   396: astore          9
        //   398: aload_0        
        //   399: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   402: checkcast       Lc5/g;
        //   405: astore          16
        //   407: aload_0        
        //   408: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   411: checkcast       Landroidx/paging/LoadType;
        //   414: astore          10
        //   416: aload_0        
        //   417: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   420: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   423: astore          14
        //   425: aload_2        
        //   426: astore_1       
        //   427: aload           6
        //   429: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   432: aload_0        
        //   433: astore_3       
        //   434: aload           15
        //   436: astore_0       
        //   437: aload           16
        //   439: astore          6
        //   441: goto            3020
        //   444: astore_0       
        //   445: goto            3772
        //   448: aload_0        
        //   449: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$10:Ljava/lang/Object;
        //   452: checkcast       Loj2/c;
        //   455: astore_2       
        //   456: aload_0        
        //   457: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$9:Ljava/lang/Object;
        //   460: checkcast       Lc5/p$a;
        //   463: astore          15
        //   465: aload_0        
        //   466: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //   469: checkcast       Landroidx/paging/LoadType;
        //   472: astore          14
        //   474: aload_0        
        //   475: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //   478: checkcast       Landroidx/paging/PagingSource$b;
        //   481: astore_1       
        //   482: aload_0        
        //   483: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //   486: checkcast       Landroidx/paging/PagingSource$a;
        //   489: astore          9
        //   491: aload_0        
        //   492: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   495: checkcast       Lkotlin/jvm/internal/Ref$BooleanRef;
        //   498: astore          11
        //   500: aload_0        
        //   501: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   504: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   507: astore          12
        //   509: aload_0        
        //   510: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   513: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   516: astore          13
        //   518: aload_0        
        //   519: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   522: checkcast       Lc5/g;
        //   525: astore          4
        //   527: aload_0        
        //   528: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   531: checkcast       Landroidx/paging/LoadType;
        //   534: astore_3       
        //   535: aload_0        
        //   536: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   539: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   542: astore          10
        //   544: aload           6
        //   546: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   549: aload_1        
        //   550: astore          6
        //   552: aload_0        
        //   553: astore_1       
        //   554: aload_2        
        //   555: astore_0       
        //   556: aload           10
        //   558: astore_2       
        //   559: goto            2768
        //   562: aload_0        
        //   563: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   566: checkcast       Lc5/p;
        //   569: astore_3       
        //   570: aload_0        
        //   571: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   574: checkcast       Loj2/c;
        //   577: astore_1       
        //   578: aload_0        
        //   579: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   582: checkcast       Lc5/g;
        //   585: astore_2       
        //   586: aload_0        
        //   587: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   590: checkcast       Landroidx/paging/LoadType;
        //   593: astore          4
        //   595: aload_1        
        //   596: astore_0       
        //   597: aload           6
        //   599: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   602: goto            2553
        //   605: astore_1       
        //   606: aload_0        
        //   607: astore_2       
        //   608: goto            2596
        //   611: aload_0        
        //   612: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   615: checkcast       Loj2/c;
        //   618: astore_1       
        //   619: aload_0        
        //   620: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   623: checkcast       Lc5/p$a;
        //   626: astore          13
        //   628: aload_0        
        //   629: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   632: checkcast       Landroidx/paging/PagingSource$b;
        //   635: astore          9
        //   637: aload_0        
        //   638: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   641: checkcast       Lc5/g;
        //   644: astore_2       
        //   645: aload_0        
        //   646: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   649: checkcast       Landroidx/paging/LoadType;
        //   652: astore          4
        //   654: aload_0        
        //   655: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   658: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   661: astore_3       
        //   662: aload           6
        //   664: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   667: goto            2461
        //   670: aload_0        
        //   671: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$9:Ljava/lang/Object;
        //   674: checkcast       Loj2/c;
        //   677: astore          14
        //   679: aload_0        
        //   680: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //   683: checkcast       Lc5/p$a;
        //   686: astore          10
        //   688: aload_0        
        //   689: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //   692: checkcast       Landroidx/paging/PagingSource$b;
        //   695: astore          9
        //   697: aload_0        
        //   698: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //   701: checkcast       Landroidx/paging/PagingSource$a;
        //   704: astore          11
        //   706: aload_0        
        //   707: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   710: checkcast       Lkotlin/jvm/internal/Ref$BooleanRef;
        //   713: astore          13
        //   715: aload_0        
        //   716: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   719: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   722: astore          4
        //   724: aload_0        
        //   725: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   728: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   731: astore          12
        //   733: aload_0        
        //   734: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   737: checkcast       Lc5/g;
        //   740: astore_2       
        //   741: aload_0        
        //   742: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   745: checkcast       Landroidx/paging/LoadType;
        //   748: astore_1       
        //   749: aload_0        
        //   750: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   753: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   756: astore_3       
        //   757: aload           6
        //   759: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   762: aload           14
        //   764: astore          6
        //   766: goto            2186
        //   769: aload_0        
        //   770: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //   773: checkcast       Landroidx/paging/PagingSource$a;
        //   776: astore          11
        //   778: aload_0        
        //   779: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   782: checkcast       Lkotlin/jvm/internal/Ref$BooleanRef;
        //   785: astore          13
        //   787: aload_0        
        //   788: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   791: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   794: astore          4
        //   796: aload_0        
        //   797: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   800: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   803: astore          12
        //   805: aload_0        
        //   806: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   809: checkcast       Lc5/g;
        //   812: astore_2       
        //   813: aload_0        
        //   814: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   817: checkcast       Landroidx/paging/LoadType;
        //   820: astore_1       
        //   821: aload_0        
        //   822: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   825: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   828: astore_3       
        //   829: aload           6
        //   831: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   834: aload           6
        //   836: astore          9
        //   838: goto            1907
        //   841: aload_0        
        //   842: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //   845: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   848: astore_2       
        //   849: aload_0        
        //   850: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //   853: astore          9
        //   855: aload_0        
        //   856: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   859: checkcast       Loj2/c;
        //   862: astore_1       
        //   863: aload_0        
        //   864: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   867: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   870: astore          13
        //   872: aload_0        
        //   873: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   876: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   879: astore          4
        //   881: aload_0        
        //   882: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   885: checkcast       Lc5/g;
        //   888: astore          12
        //   890: aload_0        
        //   891: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   894: checkcast       Landroidx/paging/LoadType;
        //   897: astore_3       
        //   898: aload_0        
        //   899: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   902: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   905: astore          11
        //   907: aload           6
        //   909: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   912: goto            1727
        //   915: astore_0       
        //   916: goto            3788
        //   919: aload_0        
        //   920: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //   923: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   926: astore_2       
        //   927: aload_0        
        //   928: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //   931: checkcast       Loj2/c;
        //   934: astore_1       
        //   935: aload_0        
        //   936: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //   939: checkcast       Lc5/p$a;
        //   942: astore          9
        //   944: aload_0        
        //   945: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //   948: checkcast       Lkotlin/jvm/internal/Ref$ObjectRef;
        //   951: astore          13
        //   953: aload_0        
        //   954: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //   957: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   960: astore          4
        //   962: aload_0        
        //   963: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //   966: checkcast       Lc5/g;
        //   969: astore          12
        //   971: aload_0        
        //   972: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //   975: checkcast       Landroidx/paging/LoadType;
        //   978: astore_3       
        //   979: aload_0        
        //   980: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //   983: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   986: astore          11
        //   988: aload           6
        //   990: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   993: goto            1599
        //   996: aload_0        
        //   997: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  1000: checkcast       Loj2/c;
        //  1003: astore          13
        //  1005: aload_0        
        //  1006: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  1009: checkcast       Lc5/p$a;
        //  1012: astore          11
        //  1014: aload_0        
        //  1015: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  1018: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //  1021: astore          4
        //  1023: aload_0        
        //  1024: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  1027: checkcast       Lc5/g;
        //  1030: astore_1       
        //  1031: aload_0        
        //  1032: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  1035: checkcast       Landroidx/paging/LoadType;
        //  1038: astore_2       
        //  1039: aload_0        
        //  1040: getfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  1043: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //  1046: astore_3       
        //  1047: aload           6
        //  1049: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //  1052: goto            1179
        //  1055: aload           6
        //  1057: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //  1060: aload_1        
        //  1061: getstatic       androidx/paging/LoadType.REFRESH:Landroidx/paging/LoadType;
        //  1064: if_acmpeq       1073
        //  1067: iconst_1       
        //  1068: istore          5
        //  1070: goto            1076
        //  1073: iconst_0       
        //  1074: istore          5
        //  1076: iload           5
        //  1078: ifeq            3821
        //  1081: new             Lkotlin/jvm/internal/Ref$IntRef;
        //  1084: dup            
        //  1085: invokespecial   kotlin/jvm/internal/Ref$IntRef.<init>:()V
        //  1088: astore          12
        //  1090: aload           4
        //  1092: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //  1095: astore          11
        //  1097: aload           11
        //  1099: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //  1102: astore          13
        //  1104: aload_0        
        //  1105: aload           4
        //  1107: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  1110: aload_0        
        //  1111: aload_1        
        //  1112: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  1115: aload_0        
        //  1116: aload_2        
        //  1117: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  1120: aload_0        
        //  1121: aload           12
        //  1123: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  1126: aload_0        
        //  1127: aload           11
        //  1129: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  1132: aload_0        
        //  1133: aload           13
        //  1135: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  1138: aload_0        
        //  1139: iconst_1       
        //  1140: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  1143: aload           13
        //  1145: aconst_null    
        //  1146: aload_0        
        //  1147: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  1150: aload           7
        //  1152: if_acmpne       1161
        //  1155: aload           7
        //  1157: astore_0       
        //  1158: goto            3785
        //  1161: aload_2        
        //  1162: astore          9
        //  1164: aload           4
        //  1166: astore_3       
        //  1167: aload_1        
        //  1168: astore_2       
        //  1169: aload           9
        //  1171: astore_1       
        //  1172: aload           12
        //  1174: astore          4
        //  1176: goto            1052
        //  1179: aload           11
        //  1181: getfield        c5/p$a.b:Lc5/p;
        //  1184: astore          12
        //  1186: getstatic       androidx/paging/PageFetcherSnapshot$a.a:[I
        //  1189: aload_2        
        //  1190: invokevirtual   java/lang/Enum.ordinal:()I
        //  1193: iaload         
        //  1194: istore          5
        //  1196: iload           5
        //  1198: iconst_1       
        //  1199: if_icmpeq       3797
        //  1202: iload           5
        //  1204: iconst_2       
        //  1205: if_icmpeq       1337
        //  1208: iload           5
        //  1210: iconst_3       
        //  1211: if_icmpeq       1217
        //  1214: goto            1479
        //  1217: aload           12
        //  1219: getfield        c5/p.d:I
        //  1222: aload_1        
        //  1223: getfield        c5/g.b:Lc5/b0;
        //  1226: getfield        c5/b0.d:I
        //  1229: iadd           
        //  1230: iconst_1       
        //  1231: iadd           
        //  1232: istore          8
        //  1234: iload           8
        //  1236: istore          5
        //  1238: iload           8
        //  1240: ifge            1272
        //  1243: aload           4
        //  1245: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1248: istore          5
        //  1250: aload           4
        //  1252: aload_3        
        //  1253: getfield        androidx/paging/PageFetcherSnapshot.c:Lc5/r;
        //  1256: getfield        c5/r.a:I
        //  1259: iload           8
        //  1261: ineg           
        //  1262: imul           
        //  1263: iload           5
        //  1265: iadd           
        //  1266: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1269: iconst_0       
        //  1270: istore          5
        //  1272: aload           12
        //  1274: getfield        c5/p.c:Ljava/util/ArrayList;
        //  1277: invokestatic    lw0/b.L0:(Ljava/util/List;)I
        //  1280: istore          8
        //  1282: iload           5
        //  1284: iload           8
        //  1286: if_icmpgt       1479
        //  1289: aload           4
        //  1291: aload           4
        //  1293: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1296: aload           12
        //  1298: getfield        c5/p.c:Ljava/util/ArrayList;
        //  1301: iload           5
        //  1303: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1306: checkcast       Landroidx/paging/PagingSource$b$b;
        //  1309: getfield        androidx/paging/PagingSource$b$b.a:Ljava/util/List;
        //  1312: invokeinterface java/util/List.size:()I
        //  1317: iadd           
        //  1318: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1321: iload           5
        //  1323: iload           8
        //  1325: if_icmpne       1331
        //  1328: goto            1479
        //  1331: iinc            5, 1
        //  1334: goto            1289
        //  1337: aload           12
        //  1339: getfield        c5/p.d:I
        //  1342: aload_1        
        //  1343: getfield        c5/g.b:Lc5/b0;
        //  1346: getfield        c5/b0.c:I
        //  1349: iadd           
        //  1350: iconst_1       
        //  1351: isub           
        //  1352: istore          8
        //  1354: iload           8
        //  1356: istore          5
        //  1358: iload           8
        //  1360: aload           12
        //  1362: getfield        c5/p.c:Ljava/util/ArrayList;
        //  1365: invokestatic    lw0/b.L0:(Ljava/util/List;)I
        //  1368: if_icmple       1423
        //  1371: aload           4
        //  1373: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1376: istore          5
        //  1378: aload_3        
        //  1379: getfield        androidx/paging/PageFetcherSnapshot.c:Lc5/r;
        //  1382: getfield        c5/r.a:I
        //  1385: istore          17
        //  1387: iload           8
        //  1389: aload           12
        //  1391: getfield        c5/p.c:Ljava/util/ArrayList;
        //  1394: invokestatic    lw0/b.L0:(Ljava/util/List;)I
        //  1397: iload           17
        //  1399: iload           5
        //  1401: invokestatic    aw/b.b:(IIII)I
        //  1404: istore          5
        //  1406: aload           4
        //  1408: iload           5
        //  1410: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1413: aload           12
        //  1415: getfield        c5/p.c:Ljava/util/ArrayList;
        //  1418: invokestatic    lw0/b.L0:(Ljava/util/List;)I
        //  1421: istore          5
        //  1423: iload           5
        //  1425: iflt            1479
        //  1428: iconst_0       
        //  1429: istore          8
        //  1431: aload           4
        //  1433: aload           4
        //  1435: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1438: aload           12
        //  1440: getfield        c5/p.c:Ljava/util/ArrayList;
        //  1443: iload           8
        //  1445: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1448: checkcast       Landroidx/paging/PagingSource$b$b;
        //  1451: getfield        androidx/paging/PagingSource$b$b.a:Ljava/util/List;
        //  1454: invokeinterface java/util/List.size:()I
        //  1459: iadd           
        //  1460: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1463: iload           8
        //  1465: iload           5
        //  1467: if_icmpne       1473
        //  1470: goto            1479
        //  1473: iinc            8, 1
        //  1476: goto            1431
        //  1479: getstatic       hg2/j.a:Lhg2/j;
        //  1482: astore          12
        //  1484: aload           13
        //  1486: aconst_null    
        //  1487: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1492: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //  1495: dup            
        //  1496: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //  1499: astore          13
        //  1501: aload_3        
        //  1502: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //  1505: astore          9
        //  1507: aload           9
        //  1509: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //  1512: astore          6
        //  1514: aload_0        
        //  1515: aload_3        
        //  1516: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  1519: aload_0        
        //  1520: aload_2        
        //  1521: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  1524: aload_0        
        //  1525: aload_1        
        //  1526: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  1529: aload_0        
        //  1530: aload           4
        //  1532: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  1535: aload_0        
        //  1536: aload           13
        //  1538: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  1541: aload_0        
        //  1542: aload           9
        //  1544: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  1547: aload_0        
        //  1548: aload           6
        //  1550: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  1553: aload_0        
        //  1554: aload           13
        //  1556: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //  1559: aload_0        
        //  1560: iconst_2       
        //  1561: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  1564: aload           6
        //  1566: aconst_null    
        //  1567: aload_0        
        //  1568: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  1571: aload           7
        //  1573: if_acmpne       1582
        //  1576: aload           7
        //  1578: astore_0       
        //  1579: goto            3785
        //  1582: aload_3        
        //  1583: astore          11
        //  1585: aload_2        
        //  1586: astore_3       
        //  1587: aload           13
        //  1589: astore_2       
        //  1590: aload_2        
        //  1591: astore          13
        //  1593: aload_1        
        //  1594: astore          12
        //  1596: aload           6
        //  1598: astore_1       
        //  1599: aload           9
        //  1601: getfield        c5/p$a.b:Lc5/p;
        //  1604: astore          6
        //  1606: aload           11
        //  1608: aload           6
        //  1610: aload_3        
        //  1611: aload           12
        //  1613: getfield        c5/g.a:I
        //  1616: aload           12
        //  1618: getfield        c5/g.b:Lc5/b0;
        //  1621: aload_3        
        //  1622: invokevirtual   c5/b0.a:(Landroidx/paging/LoadType;)I
        //  1625: aload           4
        //  1627: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1630: iadd           
        //  1631: invokevirtual   androidx/paging/PageFetcherSnapshot.h:(Lc5/p;Landroidx/paging/LoadType;II)Ljava/lang/Object;
        //  1634: astore          9
        //  1636: aload           9
        //  1638: ifnonnull       1653
        //  1641: aconst_null    
        //  1642: astore          6
        //  1644: aload_1        
        //  1645: astore          9
        //  1647: aload           12
        //  1649: astore_1       
        //  1650: goto            1737
        //  1653: aload_0        
        //  1654: aload           11
        //  1656: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  1659: aload_0        
        //  1660: aload_3        
        //  1661: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  1664: aload_0        
        //  1665: aload           12
        //  1667: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  1670: aload_0        
        //  1671: aload           4
        //  1673: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  1676: aload_0        
        //  1677: aload           13
        //  1679: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  1682: aload_0        
        //  1683: aload_1        
        //  1684: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  1687: aload_0        
        //  1688: aload           9
        //  1690: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  1693: aload_0        
        //  1694: aload_2        
        //  1695: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //  1698: aload_0        
        //  1699: iconst_3       
        //  1700: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  1703: aload           11
        //  1705: aload           6
        //  1707: aload_3        
        //  1708: aload_0        
        //  1709: invokevirtual   androidx/paging/PageFetcherSnapshot.j:(Lc5/p;Landroidx/paging/LoadType;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
        //  1712: astore          6
        //  1714: aload           6
        //  1716: aload           7
        //  1718: if_acmpne       1727
        //  1721: aload           7
        //  1723: astore_0       
        //  1724: goto            3785
        //  1727: aload           9
        //  1729: astore          6
        //  1731: aload_1        
        //  1732: astore          9
        //  1734: aload           12
        //  1736: astore_1       
        //  1737: aload           9
        //  1739: aconst_null    
        //  1740: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1745: aload_2        
        //  1746: aload           6
        //  1748: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //  1751: new             Lkotlin/jvm/internal/Ref$BooleanRef;
        //  1754: dup            
        //  1755: invokespecial   kotlin/jvm/internal/Ref$BooleanRef.<init>:()V
        //  1758: astore          9
        //  1760: aload           11
        //  1762: astore_2       
        //  1763: aload_3        
        //  1764: astore          11
        //  1766: aload           4
        //  1768: astore          12
        //  1770: aload           13
        //  1772: astore_3       
        //  1773: aload           9
        //  1775: astore          4
        //  1777: aload_3        
        //  1778: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //  1781: astore          13
        //  1783: aload           13
        //  1785: ifnull          3781
        //  1788: aload_2        
        //  1789: aload           11
        //  1791: aload           13
        //  1793: invokevirtual   androidx/paging/PageFetcherSnapshot.g:(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$a;
        //  1796: astore          10
        //  1798: aload_2        
        //  1799: getfield        androidx/paging/PageFetcherSnapshot.b:Landroidx/paging/PagingSource;
        //  1802: astore          13
        //  1804: aload_0        
        //  1805: aload_2        
        //  1806: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  1809: aload_0        
        //  1810: aload           11
        //  1812: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  1815: aload_0        
        //  1816: aload_1        
        //  1817: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  1820: aload_0        
        //  1821: aload           12
        //  1823: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  1826: aload_0        
        //  1827: aload_3        
        //  1828: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  1831: aload_0        
        //  1832: aload           4
        //  1834: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  1837: aload_0        
        //  1838: aload           10
        //  1840: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  1843: aload_0        
        //  1844: aconst_null    
        //  1845: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //  1848: aload_0        
        //  1849: aconst_null    
        //  1850: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //  1853: aload_0        
        //  1854: iconst_4       
        //  1855: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  1858: aload           13
        //  1860: aload           10
        //  1862: aload_0        
        //  1863: invokevirtual   androidx/paging/PagingSource.d:(Landroidx/paging/PagingSource$a;Llg2/c;)Ljava/lang/Object;
        //  1866: astore          6
        //  1868: aload           6
        //  1870: aload           7
        //  1872: if_acmpne       1881
        //  1875: aload           7
        //  1877: astore_0       
        //  1878: goto            3785
        //  1881: aload           11
        //  1883: astore          9
        //  1885: aload           4
        //  1887: astore          13
        //  1889: aload           10
        //  1891: astore          11
        //  1893: aload_3        
        //  1894: astore          4
        //  1896: aload_2        
        //  1897: astore_3       
        //  1898: aload_1        
        //  1899: astore_2       
        //  1900: aload           9
        //  1902: astore_1       
        //  1903: aload           6
        //  1905: astore          9
        //  1907: aload           9
        //  1909: checkcast       Landroidx/paging/PagingSource$b;
        //  1912: astore          9
        //  1914: aload           9
        //  1916: instanceof      Landroidx/paging/PagingSource$b$b;
        //  1919: ifeq            2336
        //  1922: getstatic       androidx/paging/PageFetcherSnapshot$a.a:[I
        //  1925: aload_1        
        //  1926: invokevirtual   java/lang/Enum.ordinal:()I
        //  1929: iaload         
        //  1930: istore          5
        //  1932: iload           5
        //  1934: iconst_2       
        //  1935: if_icmpeq       1968
        //  1938: iload           5
        //  1940: iconst_3       
        //  1941: if_icmpne       1957
        //  1944: aload           9
        //  1946: checkcast       Landroidx/paging/PagingSource$b$b;
        //  1949: getfield        androidx/paging/PagingSource$b$b.c:Ljava/lang/Object;
        //  1952: astore          6
        //  1954: goto            1978
        //  1957: new             Ljava/lang/IllegalArgumentException;
        //  1960: dup            
        //  1961: ldc_w           "Use doInitialLoad for LoadType == REFRESH"
        //  1964: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //  1967: athrow         
        //  1968: aload           9
        //  1970: checkcast       Landroidx/paging/PagingSource$b$b;
        //  1973: getfield        androidx/paging/PagingSource$b$b.b:Ljava/lang/Object;
        //  1976: astore          6
        //  1978: aload_3        
        //  1979: getfield        androidx/paging/PageFetcherSnapshot.b:Landroidx/paging/PagingSource;
        //  1982: invokevirtual   androidx/paging/PagingSource.b:()Z
        //  1985: ifne            2010
        //  1988: aload           6
        //  1990: aload           4
        //  1992: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //  1995: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1998: ifne            2004
        //  2001: goto            2010
        //  2004: iconst_0       
        //  2005: istore          5
        //  2007: goto            2013
        //  2010: iconst_1       
        //  2011: istore          5
        //  2013: iload           5
        //  2015: ifne            2093
        //  2018: aload_1        
        //  2019: getstatic       androidx/paging/LoadType.PREPEND:Landroidx/paging/LoadType;
        //  2022: if_acmpne       2032
        //  2025: ldc_w           "prevKey"
        //  2028: astore_0       
        //  2029: goto            2036
        //  2032: ldc_w           "nextKey"
        //  2035: astore_0       
        //  2036: ldc_w           "The same value, "
        //  2039: invokestatic    a.r:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2042: astore_1       
        //  2043: aload_1        
        //  2044: aload           4
        //  2046: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //  2049: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2052: pop            
        //  2053: aload_1        
        //  2054: ldc_w           ", was passed as the "
        //  2057: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2060: pop            
        //  2061: aload_1        
        //  2062: aload_0        
        //  2063: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2066: pop            
        //  2067: aload_1        
        //  2068: ldc_w           " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
        //  2071: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2074: pop            
        //  2075: new             Ljava/lang/IllegalStateException;
        //  2078: dup            
        //  2079: aload_1        
        //  2080: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2083: invokestatic    kotlin/text/a.y0:(Ljava/lang/String;)Ljava/lang/String;
        //  2086: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  2089: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  2092: athrow         
        //  2093: aload_3        
        //  2094: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //  2097: astore          10
        //  2099: aload           10
        //  2101: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //  2104: astore          6
        //  2106: aload_0        
        //  2107: aload_3        
        //  2108: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  2111: aload_0        
        //  2112: aload_1        
        //  2113: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  2116: aload_0        
        //  2117: aload_2        
        //  2118: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  2121: aload_0        
        //  2122: aload           12
        //  2124: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  2127: aload_0        
        //  2128: aload           4
        //  2130: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  2133: aload_0        
        //  2134: aload           13
        //  2136: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  2139: aload_0        
        //  2140: aload           11
        //  2142: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  2145: aload_0        
        //  2146: aload           9
        //  2148: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //  2151: aload_0        
        //  2152: aload           10
        //  2154: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //  2157: aload_0        
        //  2158: aload           6
        //  2160: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$9:Ljava/lang/Object;
        //  2163: aload_0        
        //  2164: iconst_5       
        //  2165: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  2168: aload           6
        //  2170: aconst_null    
        //  2171: aload_0        
        //  2172: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  2175: aload           7
        //  2177: if_acmpne       2186
        //  2180: aload           7
        //  2182: astore_0       
        //  2183: goto            3785
        //  2186: aload           10
        //  2188: getfield        c5/p$a.b:Lc5/p;
        //  2191: aload_2        
        //  2192: getfield        c5/g.a:I
        //  2195: aload_1        
        //  2196: aload           9
        //  2198: checkcast       Landroidx/paging/PagingSource$b$b;
        //  2201: invokevirtual   c5/p.e:(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$b$b;)Z
        //  2204: istore          18
        //  2206: aload           6
        //  2208: aconst_null    
        //  2209: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  2214: iload           18
        //  2216: ifne            2222
        //  2219: goto            3781
        //  2222: aload           12
        //  2224: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  2227: istore          5
        //  2229: aload           9
        //  2231: checkcast       Landroidx/paging/PagingSource$b$b;
        //  2234: astore          6
        //  2236: aload           12
        //  2238: aload           6
        //  2240: getfield        androidx/paging/PagingSource$b$b.a:Ljava/util/List;
        //  2243: invokeinterface java/util/List.size:()I
        //  2248: iload           5
        //  2250: iadd           
        //  2251: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  2254: aload_1        
        //  2255: getstatic       androidx/paging/LoadType.PREPEND:Landroidx/paging/LoadType;
        //  2258: if_acmpne       2269
        //  2261: aload           6
        //  2263: getfield        androidx/paging/PagingSource$b$b.b:Ljava/lang/Object;
        //  2266: ifnull          2284
        //  2269: aload_1        
        //  2270: getstatic       androidx/paging/LoadType.APPEND:Landroidx/paging/LoadType;
        //  2273: if_acmpne       2290
        //  2276: aload           6
        //  2278: getfield        androidx/paging/PagingSource$b$b.c:Ljava/lang/Object;
        //  2281: ifnonnull       2290
        //  2284: aload           13
        //  2286: iconst_1       
        //  2287: putfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //  2290: aload           11
        //  2292: astore          14
        //  2294: aload_0        
        //  2295: astore          6
        //  2297: aload           9
        //  2299: astore          16
        //  2301: aload_3        
        //  2302: astore          15
        //  2304: aload           13
        //  2306: astore          11
        //  2308: aload           4
        //  2310: astore          10
        //  2312: aload           12
        //  2314: astore          13
        //  2316: aload_2        
        //  2317: astore          4
        //  2319: aload_1        
        //  2320: astore          12
        //  2322: goto            2605
        //  2325: astore_0       
        //  2326: aload           6
        //  2328: aconst_null    
        //  2329: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  2334: aload_0        
        //  2335: athrow         
        //  2336: aload           11
        //  2338: astore          14
        //  2340: aload_0        
        //  2341: astore          6
        //  2343: aload           9
        //  2345: astore          16
        //  2347: aload_3        
        //  2348: astore          15
        //  2350: aload           13
        //  2352: astore          11
        //  2354: aload           4
        //  2356: astore          10
        //  2358: aload           12
        //  2360: astore          13
        //  2362: aload_2        
        //  2363: astore          4
        //  2365: aload_1        
        //  2366: astore          12
        //  2368: aload           9
        //  2370: instanceof      Landroidx/paging/PagingSource$b$a;
        //  2373: ifeq            2605
        //  2376: aload_3        
        //  2377: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //  2380: astore          12
        //  2382: aload           12
        //  2384: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //  2387: astore          13
        //  2389: aload_0        
        //  2390: aload_3        
        //  2391: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  2394: aload_0        
        //  2395: aload_1        
        //  2396: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  2399: aload_0        
        //  2400: aload_2        
        //  2401: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  2404: aload_0        
        //  2405: aload           9
        //  2407: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  2410: aload_0        
        //  2411: aload           12
        //  2413: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  2416: aload_0        
        //  2417: aload           13
        //  2419: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  2422: aload_0        
        //  2423: aconst_null    
        //  2424: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  2427: aload_0        
        //  2428: bipush          6
        //  2430: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  2433: aload           13
        //  2435: aconst_null    
        //  2436: aload_0        
        //  2437: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  2440: aload           7
        //  2442: if_acmpne       2451
        //  2445: aload           7
        //  2447: astore_0       
        //  2448: goto            3785
        //  2451: aload_1        
        //  2452: astore          4
        //  2454: aload           13
        //  2456: astore_1       
        //  2457: aload           12
        //  2459: astore          13
        //  2461: aload           13
        //  2463: getfield        c5/p$a.b:Lc5/p;
        //  2466: astore          13
        //  2468: new             Lc5/k$a;
        //  2471: astore          12
        //  2473: aload           12
        //  2475: aload           9
        //  2477: checkcast       Landroidx/paging/PagingSource$b$a;
        //  2480: getfield        androidx/paging/PagingSource$b$a.a:Ljava/lang/Throwable;
        //  2483: invokespecial   c5/k$a.<init>:(Ljava/lang/Throwable;)V
        //  2486: aload_0        
        //  2487: aload           4
        //  2489: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  2492: aload_0        
        //  2493: aload_2        
        //  2494: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  2497: aload_0        
        //  2498: aload_1        
        //  2499: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  2502: aload_0        
        //  2503: aload           13
        //  2505: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  2508: aload_0        
        //  2509: aconst_null    
        //  2510: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  2513: aload_0        
        //  2514: aconst_null    
        //  2515: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  2518: aload_0        
        //  2519: bipush          7
        //  2521: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  2524: aload_3        
        //  2525: aload           13
        //  2527: aload           4
        //  2529: aload           12
        //  2531: aload_0        
        //  2532: invokevirtual   androidx/paging/PageFetcherSnapshot.i:(Lc5/p;Landroidx/paging/LoadType;Lc5/k$a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
        //  2535: astore_0       
        //  2536: aload_0        
        //  2537: aload           7
        //  2539: if_acmpne       2548
        //  2542: aload           7
        //  2544: astore_0       
        //  2545: goto            3785
        //  2548: aload           13
        //  2550: astore_0       
        //  2551: aload_0        
        //  2552: astore_3       
        //  2553: aload_1        
        //  2554: astore_0       
        //  2555: aload_3        
        //  2556: getfield        c5/p.k:Ljava/util/LinkedHashMap;
        //  2559: aload           4
        //  2561: aload_2        
        //  2562: getfield        c5/g.b:Lc5/b0;
        //  2565: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2570: pop            
        //  2571: aload_1        
        //  2572: astore_0       
        //  2573: getstatic       hg2/j.a:Lhg2/j;
        //  2576: astore_2       
        //  2577: aload_1        
        //  2578: aconst_null    
        //  2579: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  2584: getstatic       hg2/j.a:Lhg2/j;
        //  2587: astore_0       
        //  2588: goto            3785
        //  2591: astore_0       
        //  2592: aload_1        
        //  2593: astore_2       
        //  2594: aload_0        
        //  2595: astore_1       
        //  2596: aload_2        
        //  2597: aconst_null    
        //  2598: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  2603: aload_1        
        //  2604: athrow         
        //  2605: getstatic       androidx/paging/PageFetcherSnapshot$a.a:[I
        //  2608: aload           12
        //  2610: invokevirtual   java/lang/Enum.ordinal:()I
        //  2613: iaload         
        //  2614: iconst_2       
        //  2615: if_icmpne       2625
        //  2618: getstatic       androidx/paging/LoadType.APPEND:Landroidx/paging/LoadType;
        //  2621: astore_0       
        //  2622: goto            2629
        //  2625: getstatic       androidx/paging/LoadType.PREPEND:Landroidx/paging/LoadType;
        //  2628: astore_0       
        //  2629: aload           15
        //  2631: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //  2634: astore_3       
        //  2635: aload_3        
        //  2636: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //  2639: astore_1       
        //  2640: aload           6
        //  2642: aload           15
        //  2644: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  2647: aload           6
        //  2649: aload           12
        //  2651: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  2654: aload           6
        //  2656: aload           4
        //  2658: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  2661: aload           6
        //  2663: aload           13
        //  2665: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  2668: aload           6
        //  2670: aload           10
        //  2672: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  2675: aload           6
        //  2677: aload           11
        //  2679: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  2682: aload           6
        //  2684: aload           14
        //  2686: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  2689: aload           6
        //  2691: aload           16
        //  2693: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //  2696: aload           6
        //  2698: aload_0        
        //  2699: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //  2702: aload           6
        //  2704: aload_3        
        //  2705: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$9:Ljava/lang/Object;
        //  2708: aload           6
        //  2710: aload_1        
        //  2711: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$10:Ljava/lang/Object;
        //  2714: aload           6
        //  2716: bipush          8
        //  2718: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  2721: aload_1        
        //  2722: aconst_null    
        //  2723: aload           6
        //  2725: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  2728: aload           7
        //  2730: if_acmpne       2739
        //  2733: aload           7
        //  2735: astore_0       
        //  2736: goto            3785
        //  2739: aload           15
        //  2741: astore_2       
        //  2742: aload           14
        //  2744: astore          9
        //  2746: aload_0        
        //  2747: astore          14
        //  2749: aload_3        
        //  2750: astore          15
        //  2752: aload           12
        //  2754: astore_3       
        //  2755: aload           10
        //  2757: astore          12
        //  2759: aload_1        
        //  2760: astore_0       
        //  2761: aload           6
        //  2763: astore_1       
        //  2764: aload           16
        //  2766: astore          6
        //  2768: aload_0        
        //  2769: astore          10
        //  2771: aload           15
        //  2773: getfield        c5/p$a.b:Lc5/p;
        //  2776: astore          16
        //  2778: aload_0        
        //  2779: astore          10
        //  2781: aload           16
        //  2783: aload           14
        //  2785: aload           4
        //  2787: getfield        c5/g.b:Lc5/b0;
        //  2790: invokevirtual   c5/p.c:(Landroidx/paging/LoadType;Lc5/b0;)Landroidx/paging/PageEvent$a;
        //  2793: astore          15
        //  2795: aload           15
        //  2797: ifnonnull       2822
        //  2800: aload           11
        //  2802: astore          14
        //  2804: aload           12
        //  2806: astore          11
        //  2808: aload           13
        //  2810: astore          12
        //  2812: aload           4
        //  2814: astore          13
        //  2816: aload_3        
        //  2817: astore          4
        //  2819: goto            3071
        //  2822: aload_0        
        //  2823: astore          10
        //  2825: aload           16
        //  2827: aload           15
        //  2829: invokevirtual   c5/p.b:(Landroidx/paging/PageEvent$a;)V
        //  2832: aload_0        
        //  2833: astore          10
        //  2835: aload_2        
        //  2836: getfield        androidx/paging/PageFetcherSnapshot.k:Lkotlinx/coroutines/channels/AbstractChannel;
        //  2839: astore          14
        //  2841: aload_0        
        //  2842: astore          10
        //  2844: aload_1        
        //  2845: aload_2        
        //  2846: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  2849: aload_0        
        //  2850: astore          10
        //  2852: aload_1        
        //  2853: aload_3        
        //  2854: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  2857: aload_0        
        //  2858: astore          10
        //  2860: aload_1        
        //  2861: aload           4
        //  2863: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  2866: aload_0        
        //  2867: astore          10
        //  2869: aload_1        
        //  2870: aload           13
        //  2872: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  2875: aload_0        
        //  2876: astore          10
        //  2878: aload_1        
        //  2879: aload           12
        //  2881: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  2884: aload_0        
        //  2885: astore          10
        //  2887: aload_1        
        //  2888: aload           11
        //  2890: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  2893: aload_0        
        //  2894: astore          10
        //  2896: aload_1        
        //  2897: aload           9
        //  2899: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  2902: aload_0        
        //  2903: astore          10
        //  2905: aload_1        
        //  2906: aload           6
        //  2908: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //  2911: aload_0        
        //  2912: astore          10
        //  2914: aload_1        
        //  2915: aload_0        
        //  2916: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //  2919: aload_0        
        //  2920: astore          10
        //  2922: aload_1        
        //  2923: aload           16
        //  2925: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$9:Ljava/lang/Object;
        //  2928: aload_0        
        //  2929: astore          10
        //  2931: aload_1        
        //  2932: aconst_null    
        //  2933: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$10:Ljava/lang/Object;
        //  2936: aload_0        
        //  2937: astore          10
        //  2939: aload_1        
        //  2940: bipush          9
        //  2942: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  2945: aload_0        
        //  2946: astore          10
        //  2948: aload           14
        //  2950: aload           15
        //  2952: aload_1        
        //  2953: invokevirtual   gj2/a.x:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  2956: astore          14
        //  2958: aload           14
        //  2960: aload           7
        //  2962: if_acmpne       2971
        //  2965: aload           7
        //  2967: astore_0       
        //  2968: goto            3785
        //  2971: aload           6
        //  2973: astore          19
        //  2975: aload_0        
        //  2976: astore          15
        //  2978: aload           9
        //  2980: astore_0       
        //  2981: aload           11
        //  2983: astore          20
        //  2985: aload_2        
        //  2986: astore          14
        //  2988: aload_3        
        //  2989: astore          10
        //  2991: aload           4
        //  2993: astore          6
        //  2995: aload           13
        //  2997: astore          9
        //  2999: aload           12
        //  3001: astore          11
        //  3003: aload           20
        //  3005: astore          12
        //  3007: aload           19
        //  3009: astore          4
        //  3011: aload_1        
        //  3012: astore_3       
        //  3013: aload           15
        //  3015: astore_2       
        //  3016: aload           16
        //  3018: astore          13
        //  3020: aload_2        
        //  3021: astore_1       
        //  3022: getstatic       hg2/j.a:Lhg2/j;
        //  3025: astore          16
        //  3027: aload           14
        //  3029: astore          15
        //  3031: aload           6
        //  3033: astore_1       
        //  3034: aload           12
        //  3036: astore          14
        //  3038: aload           13
        //  3040: astore          16
        //  3042: aload           4
        //  3044: astore          6
        //  3046: aload_0        
        //  3047: astore          19
        //  3049: aload_2        
        //  3050: astore_0       
        //  3051: aload           15
        //  3053: astore_2       
        //  3054: aload           10
        //  3056: astore          4
        //  3058: aload_1        
        //  3059: astore          13
        //  3061: aload           9
        //  3063: astore          12
        //  3065: aload           19
        //  3067: astore          9
        //  3069: aload_3        
        //  3070: astore_1       
        //  3071: aload_0        
        //  3072: astore          10
        //  3074: aload_2        
        //  3075: aload           16
        //  3077: aload           4
        //  3079: aload           13
        //  3081: getfield        c5/g.a:I
        //  3084: aload           13
        //  3086: getfield        c5/g.b:Lc5/b0;
        //  3089: aload           4
        //  3091: invokevirtual   c5/b0.a:(Landroidx/paging/LoadType;)I
        //  3094: aload           12
        //  3096: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  3099: iadd           
        //  3100: invokevirtual   androidx/paging/PageFetcherSnapshot.h:(Lc5/p;Landroidx/paging/LoadType;II)Ljava/lang/Object;
        //  3103: astore_3       
        //  3104: aload_0        
        //  3105: astore          10
        //  3107: aload           11
        //  3109: aload_3        
        //  3110: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //  3113: aload_3        
        //  3114: ifnonnull       3185
        //  3117: aload_0        
        //  3118: astore          10
        //  3120: aload           16
        //  3122: getfield        c5/p.l:Lc5/n;
        //  3125: aload           4
        //  3127: invokevirtual   c5/n.a:(Landroidx/paging/LoadType;)Lc5/k;
        //  3130: instanceof      Lc5/k$a;
        //  3133: ifne            3185
        //  3136: aload_0        
        //  3137: astore          10
        //  3139: aload           16
        //  3141: getfield        c5/p.l:Lc5/n;
        //  3144: astore          15
        //  3146: aload_0        
        //  3147: astore          10
        //  3149: aload           14
        //  3151: getfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //  3154: ifeq            3167
        //  3157: aload_0        
        //  3158: astore          10
        //  3160: getstatic       c5/k$c.b:Lc5/k$c;
        //  3163: astore_3       
        //  3164: goto            3174
        //  3167: aload_0        
        //  3168: astore          10
        //  3170: getstatic       c5/k$c.c:Lc5/k$c;
        //  3173: astore_3       
        //  3174: aload_0        
        //  3175: astore          10
        //  3177: aload           15
        //  3179: aload           4
        //  3181: aload_3        
        //  3182: invokevirtual   c5/n.b:(Landroidx/paging/LoadType;Lc5/k;)V
        //  3185: aload_0        
        //  3186: astore          10
        //  3188: aload           16
        //  3190: aload           6
        //  3192: checkcast       Landroidx/paging/PagingSource$b$b;
        //  3195: aload           4
        //  3197: invokevirtual   c5/p.f:(Landroidx/paging/PagingSource$b$b;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent$Insert;
        //  3200: astore          16
        //  3202: aload_0        
        //  3203: astore          10
        //  3205: aload_2        
        //  3206: getfield        androidx/paging/PageFetcherSnapshot.k:Lkotlinx/coroutines/channels/AbstractChannel;
        //  3209: astore_3       
        //  3210: aload_0        
        //  3211: astore          10
        //  3213: aload_1        
        //  3214: aload_2        
        //  3215: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  3218: aload_0        
        //  3219: astore          10
        //  3221: aload_1        
        //  3222: aload           4
        //  3224: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  3227: aload_0        
        //  3228: astore          10
        //  3230: aload_1        
        //  3231: aload           13
        //  3233: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  3236: aload_0        
        //  3237: astore          10
        //  3239: aload_1        
        //  3240: aload           12
        //  3242: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  3245: aload_0        
        //  3246: astore          10
        //  3248: aload_1        
        //  3249: aload           11
        //  3251: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  3254: aload_0        
        //  3255: astore          10
        //  3257: aload_1        
        //  3258: aload           14
        //  3260: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  3263: aload_0        
        //  3264: astore          10
        //  3266: aload_1        
        //  3267: aload           9
        //  3269: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  3272: aload_0        
        //  3273: astore          10
        //  3275: aload_1        
        //  3276: aload           6
        //  3278: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //  3281: aload_0        
        //  3282: astore          10
        //  3284: aload_1        
        //  3285: aload_0        
        //  3286: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //  3289: aload_0        
        //  3290: astore          10
        //  3292: aload_1        
        //  3293: aconst_null    
        //  3294: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$9:Ljava/lang/Object;
        //  3297: aload_0        
        //  3298: astore          10
        //  3300: aload_1        
        //  3301: aconst_null    
        //  3302: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$10:Ljava/lang/Object;
        //  3305: aload_0        
        //  3306: astore          10
        //  3308: aload_1        
        //  3309: bipush          10
        //  3311: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  3314: aload_0        
        //  3315: astore          10
        //  3317: aload_3        
        //  3318: aload           16
        //  3320: aload_1        
        //  3321: invokevirtual   gj2/a.x:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  3324: astore_3       
        //  3325: aload_3        
        //  3326: aload           7
        //  3328: if_acmpne       3337
        //  3331: aload           7
        //  3333: astore_0       
        //  3334: goto            3785
        //  3337: aload_0        
        //  3338: astore          10
        //  3340: aload           4
        //  3342: astore_3       
        //  3343: aload           13
        //  3345: astore          4
        //  3347: aload           12
        //  3349: astore          13
        //  3351: aload           11
        //  3353: astore          12
        //  3355: aload           14
        //  3357: astore          11
        //  3359: aload           9
        //  3361: astore          14
        //  3363: aload_1        
        //  3364: astore_0       
        //  3365: aload           10
        //  3367: astore          9
        //  3369: aload           9
        //  3371: astore_1       
        //  3372: getstatic       hg2/j.a:Lhg2/j;
        //  3375: astore          10
        //  3377: aload           9
        //  3379: aconst_null    
        //  3380: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  3385: aload           14
        //  3387: instanceof      Landroidx/paging/PagingSource$a$b;
        //  3390: ifeq            3410
        //  3393: aload           6
        //  3395: checkcast       Landroidx/paging/PagingSource$b$b;
        //  3398: getfield        androidx/paging/PagingSource$b$b.b:Ljava/lang/Object;
        //  3401: ifnonnull       3410
        //  3404: iconst_1       
        //  3405: istore          5
        //  3407: goto            3413
        //  3410: iconst_0       
        //  3411: istore          5
        //  3413: aload           14
        //  3415: instanceof      Landroidx/paging/PagingSource$a$a;
        //  3418: ifeq            3438
        //  3421: aload           6
        //  3423: checkcast       Landroidx/paging/PagingSource$b$b;
        //  3426: getfield        androidx/paging/PagingSource$b$b.c:Ljava/lang/Object;
        //  3429: ifnonnull       3438
        //  3432: iconst_1       
        //  3433: istore          8
        //  3435: goto            3441
        //  3438: iconst_0       
        //  3439: istore          8
        //  3441: aload_0        
        //  3442: astore          9
        //  3444: aload           11
        //  3446: astore          19
        //  3448: aload           12
        //  3450: astore          15
        //  3452: aload           13
        //  3454: astore          16
        //  3456: aload           4
        //  3458: astore          14
        //  3460: aload_3        
        //  3461: astore          10
        //  3463: aload_2        
        //  3464: astore          6
        //  3466: aload_2        
        //  3467: getfield        androidx/paging/PageFetcherSnapshot.f:Lc5/w;
        //  3470: ifnull          3727
        //  3473: iload           5
        //  3475: ifne            3508
        //  3478: aload_0        
        //  3479: astore          9
        //  3481: aload           11
        //  3483: astore          19
        //  3485: aload           12
        //  3487: astore          15
        //  3489: aload           13
        //  3491: astore          16
        //  3493: aload           4
        //  3495: astore          14
        //  3497: aload_3        
        //  3498: astore          10
        //  3500: aload_2        
        //  3501: astore          6
        //  3503: iload           8
        //  3505: ifeq            3727
        //  3508: aload_2        
        //  3509: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //  3512: astore          6
        //  3514: aload           6
        //  3516: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //  3519: astore          10
        //  3521: aload_0        
        //  3522: aload_2        
        //  3523: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$0:Ljava/lang/Object;
        //  3526: aload_0        
        //  3527: aload_3        
        //  3528: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$1:Ljava/lang/Object;
        //  3531: aload_0        
        //  3532: aload           4
        //  3534: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$2:Ljava/lang/Object;
        //  3537: aload_0        
        //  3538: aload           13
        //  3540: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$3:Ljava/lang/Object;
        //  3543: aload_0        
        //  3544: aload           12
        //  3546: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$4:Ljava/lang/Object;
        //  3549: aload_0        
        //  3550: aload           11
        //  3552: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$5:Ljava/lang/Object;
        //  3555: aload_0        
        //  3556: aload           6
        //  3558: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$6:Ljava/lang/Object;
        //  3561: aload_0        
        //  3562: aload           10
        //  3564: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$7:Ljava/lang/Object;
        //  3567: aload_0        
        //  3568: aconst_null    
        //  3569: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.L$8:Ljava/lang/Object;
        //  3572: aload_0        
        //  3573: iload           5
        //  3575: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.I$0:I
        //  3578: aload_0        
        //  3579: iload           8
        //  3581: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.I$1:I
        //  3584: aload_0        
        //  3585: bipush          11
        //  3587: putfield        androidx/paging/PageFetcherSnapshot$doLoad$1.label:I
        //  3590: aload_0        
        //  3591: astore_1       
        //  3592: aload           10
        //  3594: astore          9
        //  3596: aload           10
        //  3598: aconst_null    
        //  3599: aload_0        
        //  3600: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  3603: aload           7
        //  3605: if_acmpne       3614
        //  3608: aload           7
        //  3610: astore_0       
        //  3611: goto            3785
        //  3614: aload           6
        //  3616: getfield        c5/p$a.b:Lc5/p;
        //  3619: aload_2        
        //  3620: getfield        androidx/paging/PageFetcherSnapshot.i:Lc5/h;
        //  3623: getfield        c5/h.a:Lc5/h$b;
        //  3626: getfield        c5/h$b.c:Lc5/b0$a;
        //  3629: invokevirtual   c5/p.a:(Lc5/b0$a;)Lc5/u;
        //  3632: astore_0       
        //  3633: aload           9
        //  3635: aconst_null    
        //  3636: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  3641: iload           5
        //  3643: ifeq            3659
        //  3646: aload_2        
        //  3647: getfield        androidx/paging/PageFetcherSnapshot.f:Lc5/w;
        //  3650: getstatic       androidx/paging/LoadType.PREPEND:Landroidx/paging/LoadType;
        //  3653: aload_0        
        //  3654: invokeinterface c5/w.b:(Landroidx/paging/LoadType;Lc5/u;)V
        //  3659: aload_1        
        //  3660: astore          9
        //  3662: aload           11
        //  3664: astore          19
        //  3666: aload           12
        //  3668: astore          15
        //  3670: aload           13
        //  3672: astore          16
        //  3674: aload           4
        //  3676: astore          14
        //  3678: aload_3        
        //  3679: astore          10
        //  3681: aload_2        
        //  3682: astore          6
        //  3684: iload           8
        //  3686: ifeq            3727
        //  3689: aload_2        
        //  3690: getfield        androidx/paging/PageFetcherSnapshot.f:Lc5/w;
        //  3693: getstatic       androidx/paging/LoadType.APPEND:Landroidx/paging/LoadType;
        //  3696: aload_0        
        //  3697: invokeinterface c5/w.b:(Landroidx/paging/LoadType;Lc5/u;)V
        //  3702: aload_2        
        //  3703: astore          6
        //  3705: aload_3        
        //  3706: astore          10
        //  3708: aload           4
        //  3710: astore          14
        //  3712: aload           13
        //  3714: astore          16
        //  3716: aload           12
        //  3718: astore          15
        //  3720: aload           11
        //  3722: astore          19
        //  3724: aload_1        
        //  3725: astore          9
        //  3727: aload           19
        //  3729: astore          4
        //  3731: aload           15
        //  3733: astore_3       
        //  3734: aload           16
        //  3736: astore          12
        //  3738: aload           14
        //  3740: astore_1       
        //  3741: aload           10
        //  3743: astore          11
        //  3745: aload           6
        //  3747: astore_2       
        //  3748: goto            3762
        //  3751: astore_0       
        //  3752: aload           9
        //  3754: aconst_null    
        //  3755: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  3760: aload_0        
        //  3761: athrow         
        //  3762: aload           9
        //  3764: astore_0       
        //  3765: goto            1777
        //  3768: astore_0       
        //  3769: aload           10
        //  3771: astore_1       
        //  3772: aload_1        
        //  3773: aconst_null    
        //  3774: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  3779: aload_0        
        //  3780: athrow         
        //  3781: getstatic       hg2/j.a:Lhg2/j;
        //  3784: astore_0       
        //  3785: aload_0        
        //  3786: areturn        
        //  3787: astore_0       
        //  3788: aload_1        
        //  3789: aconst_null    
        //  3790: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  3795: aload_0        
        //  3796: athrow         
        //  3797: new             Ljava/lang/IllegalStateException;
        //  3800: astore_0       
        //  3801: aload_0        
        //  3802: ldc_w           "Use doInitialLoad for LoadType == REFRESH"
        //  3805: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  3808: aload_0        
        //  3809: athrow         
        //  3810: astore_0       
        //  3811: aload           13
        //  3813: aconst_null    
        //  3814: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  3819: aload_0        
        //  3820: athrow         
        //  3821: new             Ljava/lang/IllegalArgumentException;
        //  3824: dup            
        //  3825: ldc_w           "Use doInitialLoad for LoadType == REFRESH"
        //  3828: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  3831: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //  3834: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  324    329    444    448    Any
        //  427    432    444    448    Any
        //  597    602    605    611    Any
        //  907    912    915    919    Any
        //  1179   1196   3810   3821   Any
        //  1217   1234   3810   3821   Any
        //  1243   1269   3810   3821   Any
        //  1272   1282   3810   3821   Any
        //  1289   1321   3810   3821   Any
        //  1337   1354   3810   3821   Any
        //  1358   1406   3810   3821   Any
        //  1413   1423   3810   3821   Any
        //  1431   1463   3810   3821   Any
        //  1479   1484   3810   3821   Any
        //  1599   1636   3787   3788   Any
        //  1653   1714   3787   3788   Any
        //  2186   2206   2325   2336   Any
        //  2461   2536   2591   2596   Any
        //  2555   2571   605    611    Any
        //  2573   2577   605    611    Any
        //  2771   2778   3768   3772   Any
        //  2781   2795   3768   3772   Any
        //  2825   2832   3768   3772   Any
        //  2835   2841   3768   3772   Any
        //  2844   2849   3768   3772   Any
        //  2852   2857   3768   3772   Any
        //  2860   2866   3768   3772   Any
        //  2869   2875   3768   3772   Any
        //  2878   2884   3768   3772   Any
        //  2887   2893   3768   3772   Any
        //  2896   2902   3768   3772   Any
        //  2905   2911   3768   3772   Any
        //  2914   2919   3768   3772   Any
        //  2922   2928   3768   3772   Any
        //  2931   2936   3768   3772   Any
        //  2939   2945   3768   3772   Any
        //  2948   2958   3768   3772   Any
        //  3022   3027   444    448    Any
        //  3074   3104   3768   3772   Any
        //  3107   3113   3768   3772   Any
        //  3120   3136   3768   3772   Any
        //  3139   3146   3768   3772   Any
        //  3149   3157   3768   3772   Any
        //  3160   3164   3768   3772   Any
        //  3170   3174   3768   3772   Any
        //  3177   3185   3768   3772   Any
        //  3188   3202   3768   3772   Any
        //  3205   3210   3768   3772   Any
        //  3213   3218   3768   3772   Any
        //  3221   3227   3768   3772   Any
        //  3230   3236   3768   3772   Any
        //  3239   3245   3768   3772   Any
        //  3248   3254   3768   3772   Any
        //  3257   3263   3768   3772   Any
        //  3266   3272   3768   3772   Any
        //  3275   3281   3768   3772   Any
        //  3284   3289   3768   3772   Any
        //  3292   3297   3768   3772   Any
        //  3300   3305   3768   3772   Any
        //  3308   3314   3768   3772   Any
        //  3317   3325   3768   3772   Any
        //  3372   3377   444    448    Any
        //  3614   3633   3751   3762   Any
        //  3797   3810   3810   3821   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.StackOverflowError
        //     at java.util.Vector.contains(Unknown Source)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:828)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2535)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1341)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2535)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1072)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1067)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1067)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2535)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:373)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
    
    public static final Object c(final PageFetcherSnapshot pageFetcherSnapshot, final LoadType loadType, final b0 b0, final PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1$1 continuationImpl) {
        pageFetcherSnapshot.getClass();
        final int n = a.a[loadType.ordinal()];
        final boolean b2 = true;
        Object o;
        if (n == 1) {
            o = pageFetcherSnapshot.f((c)continuationImpl);
            if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
                o = j.a;
            }
        }
        else {
            if (b0 == null) {
                throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
            }
            final h i = pageFetcherSnapshot.i;
            i.getClass();
            sg2.e.f((Object)b0, "viewportHint");
            int n2 = b2 ? 1 : 0;
            if (loadType != LoadType.PREPEND) {
                if (loadType == LoadType.APPEND) {
                    n2 = (b2 ? 1 : 0);
                }
                else {
                    n2 = 0;
                }
            }
            if (n2 == 0) {
                throw new IllegalArgumentException(sg2.e.l((Object)loadType, "invalid load type for reset: ").toString());
            }
            i.a.a(null, new HintHandler$forceSetHint$2(loadType, b0));
            o = j.a;
        }
        return o;
    }
    
    public static final void d(final PageFetcherSnapshot pageFetcherSnapshot, final ej2.b0 b0) {
        if (pageFetcherSnapshot.c.f != Integer.MIN_VALUE) {
            final Iterator iterator = b.s1((Object[])new LoadType[] { LoadType.APPEND, LoadType.PREPEND }).iterator();
            while (iterator.hasNext()) {
                ej2.g.i(b0, (CoroutineContext)null, (CoroutineStart)null, (rg2.p)new PageFetcherSnapshot$startConsumingHints$1$1(pageFetcherSnapshot, (LoadType)iterator.next(), (c)null), 3);
            }
        }
        ej2.g.i(b0, (CoroutineContext)null, (CoroutineStart)null, (rg2.p)new PageFetcherSnapshot$startConsumingHints$2(pageFetcherSnapshot, (c)null), 3);
        ej2.g.i(b0, (CoroutineContext)null, (CoroutineStart)null, (rg2.p)new PageFetcherSnapshot$startConsumingHints$3(pageFetcherSnapshot, (c)null), 3);
    }
    
    public final Object e(c<? super u<Key, Value>> c) {
        PageFetcherSnapshot$currentPagingState.PageFetcherSnapshot$currentPagingState$1 pageFetcherSnapshot$currentPagingState$2 = null;
        Label_0047: {
            if (c instanceof PageFetcherSnapshot$currentPagingState.PageFetcherSnapshot$currentPagingState$1) {
                final PageFetcherSnapshot$currentPagingState.PageFetcherSnapshot$currentPagingState$1 pageFetcherSnapshot$currentPagingState$1 = (PageFetcherSnapshot$currentPagingState.PageFetcherSnapshot$currentPagingState$1)c;
                final int label = pageFetcherSnapshot$currentPagingState$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pageFetcherSnapshot$currentPagingState$1.label = label + Integer.MIN_VALUE;
                    pageFetcherSnapshot$currentPagingState$2 = pageFetcherSnapshot$currentPagingState$1;
                    break Label_0047;
                }
            }
            pageFetcherSnapshot$currentPagingState$2 = new PageFetcherSnapshot$currentPagingState.PageFetcherSnapshot$currentPagingState$1(this, c);
        }
        final Object result = pageFetcherSnapshot$currentPagingState$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = pageFetcherSnapshot$currentPagingState$2.label;
        p.a<Key, Value> l;
        PageFetcherSnapshot pageFetcherSnapshot;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final oj2.c c2 = (oj2.c)pageFetcherSnapshot$currentPagingState$2.L$2;
            l = (p.a<Key, Value>)pageFetcherSnapshot$currentPagingState$2.L$1;
            pageFetcherSnapshot = (PageFetcherSnapshot)pageFetcherSnapshot$currentPagingState$2.L$0;
            yd.b.k0(result);
            c = (c)c2;
        }
        else {
            yd.b.k0(result);
            l = this.l;
            final MutexImpl a = l.a;
            pageFetcherSnapshot$currentPagingState$2.L$0 = this;
            pageFetcherSnapshot$currentPagingState$2.L$1 = l;
            pageFetcherSnapshot$currentPagingState$2.L$2 = a;
            pageFetcherSnapshot$currentPagingState$2.label = 1;
            if (a.b(null, (c<? super j>)pageFetcherSnapshot$currentPagingState$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pageFetcherSnapshot = this;
            c = (c)a;
        }
        try {
            return l.b.a(pageFetcherSnapshot.i.a.c);
        }
        finally {
            ((oj2.c)c).a((Object)null);
        }
    }
    
    public final Object f(final c<? super j> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;
        //     4: ifeq            35
        //     7: aload_1        
        //     8: checkcast       Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;
        //    11: astore_2       
        //    12: aload_2        
        //    13: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //    16: istore_3       
        //    17: iload_3        
        //    18: ldc             -2147483648
        //    20: iand           
        //    21: ifeq            35
        //    24: aload_2        
        //    25: iload_3        
        //    26: ldc             -2147483648
        //    28: iadd           
        //    29: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //    32: goto            45
        //    35: new             Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;
        //    38: dup            
        //    39: aload_0        
        //    40: aload_1        
        //    41: invokespecial   androidx/paging/PageFetcherSnapshot$doInitialLoad$1.<init>:(Landroidx/paging/PageFetcherSnapshot;Llg2/c;)V
        //    44: astore_2       
        //    45: aload_2        
        //    46: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.result:Ljava/lang/Object;
        //    49: astore          4
        //    51: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //    54: astore          5
        //    56: aload_2        
        //    57: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //    60: tableswitch {
        //                0: 470
        //                1: 432
        //                2: 400
        //                3: 380
        //                4: 333
        //                5: 286
        //                6: 245
        //                7: 198
        //                8: 151
        //                9: 126
        //          default: 116
        //        }
        //   116: new             Ljava/lang/IllegalStateException;
        //   119: dup            
        //   120: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   122: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   125: athrow         
        //   126: aload_2        
        //   127: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   130: checkcast       Loj2/c;
        //   133: astore          6
        //   135: aload           6
        //   137: astore_1       
        //   138: aload           4
        //   140: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   143: goto            1405
        //   146: astore          6
        //   148: goto            1425
        //   151: aload_2        
        //   152: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //   155: checkcast       Loj2/c;
        //   158: astore_1       
        //   159: aload_2        
        //   160: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   163: checkcast       Lc5/p$a;
        //   166: astore          7
        //   168: aload_2        
        //   169: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   172: checkcast       Landroidx/paging/PagingSource$b;
        //   175: astore          8
        //   177: aload_2        
        //   178: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   181: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   184: astore          6
        //   186: aload           4
        //   188: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   191: aload           7
        //   193: astore          4
        //   195: goto            1322
        //   198: aload_2        
        //   199: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //   202: checkcast       Loj2/c;
        //   205: astore          6
        //   207: aload_2        
        //   208: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   211: checkcast       Lc5/p$a;
        //   214: astore          8
        //   216: aload_2        
        //   217: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   220: checkcast       Landroidx/paging/PagingSource$b;
        //   223: astore          7
        //   225: aload_2        
        //   226: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   229: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   232: astore_1       
        //   233: aload           4
        //   235: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   238: aload           7
        //   240: astore          4
        //   242: goto            1148
        //   245: aload_2        
        //   246: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   249: checkcast       Loj2/c;
        //   252: astore_1       
        //   253: aload_2        
        //   254: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   257: checkcast       Landroidx/paging/PagingSource$b;
        //   260: astore          8
        //   262: aload_2        
        //   263: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   266: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   269: astore          7
        //   271: aload_1        
        //   272: astore          6
        //   274: aload           4
        //   276: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   279: aload           7
        //   281: astore          4
        //   283: goto            1016
        //   286: aload_2        
        //   287: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //   290: checkcast       Loj2/c;
        //   293: astore_1       
        //   294: aload_2        
        //   295: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   298: checkcast       Lc5/p$a;
        //   301: astore          7
        //   303: aload_2        
        //   304: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   307: checkcast       Landroidx/paging/PagingSource$b;
        //   310: astore          8
        //   312: aload_2        
        //   313: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   316: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   319: astore          6
        //   321: aload           4
        //   323: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   326: aload           6
        //   328: astore          4
        //   330: goto            916
        //   333: aload_2        
        //   334: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //   337: checkcast       Loj2/c;
        //   340: astore          8
        //   342: aload_2        
        //   343: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   346: checkcast       Lc5/p$a;
        //   349: astore          7
        //   351: aload_2        
        //   352: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   355: checkcast       Landroidx/paging/PagingSource$b;
        //   358: astore_1       
        //   359: aload_2        
        //   360: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   363: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   366: astore          6
        //   368: aload           4
        //   370: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   373: aload           8
        //   375: astore          4
        //   377: goto            749
        //   380: aload_2        
        //   381: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   384: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   387: astore          6
        //   389: aload           4
        //   391: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   394: aload           4
        //   396: astore_1       
        //   397: goto            670
        //   400: aload_2        
        //   401: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   404: checkcast       Loj2/c;
        //   407: astore_1       
        //   408: aload_2        
        //   409: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   412: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   415: astore          8
        //   417: aload_1        
        //   418: astore          6
        //   420: aload           4
        //   422: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   425: aload           8
        //   427: astore          4
        //   429: goto            597
        //   432: aload_2        
        //   433: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   436: checkcast       Loj2/c;
        //   439: astore_1       
        //   440: aload_2        
        //   441: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   444: checkcast       Lc5/p$a;
        //   447: astore          8
        //   449: aload_2        
        //   450: getfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   453: checkcast       Landroidx/paging/PageFetcherSnapshot;
        //   456: astore          6
        //   458: aload           4
        //   460: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   463: aload           6
        //   465: astore          4
        //   467: goto            525
        //   470: aload           4
        //   472: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   475: aload_0        
        //   476: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //   479: astore          8
        //   481: aload           8
        //   483: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //   486: astore_1       
        //   487: aload_2        
        //   488: aload_0        
        //   489: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   492: aload_2        
        //   493: aload           8
        //   495: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   498: aload_2        
        //   499: aload_1        
        //   500: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   503: aload_2        
        //   504: iconst_1       
        //   505: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //   508: aload_1        
        //   509: aconst_null    
        //   510: aload_2        
        //   511: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //   514: aload           5
        //   516: if_acmpne       522
        //   519: aload           5
        //   521: areturn        
        //   522: aload_0        
        //   523: astore          4
        //   525: aload_1        
        //   526: astore          6
        //   528: aload           8
        //   530: getfield        c5/p$a.b:Lc5/p;
        //   533: astore          8
        //   535: aload_1        
        //   536: astore          6
        //   538: getstatic       androidx/paging/LoadType.REFRESH:Landroidx/paging/LoadType;
        //   541: astore          7
        //   543: aload_1        
        //   544: astore          6
        //   546: aload_2        
        //   547: aload           4
        //   549: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   552: aload_1        
        //   553: astore          6
        //   555: aload_2        
        //   556: aload_1        
        //   557: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   560: aload_1        
        //   561: astore          6
        //   563: aload_2        
        //   564: aconst_null    
        //   565: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   568: aload_1        
        //   569: astore          6
        //   571: aload_2        
        //   572: iconst_2       
        //   573: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //   576: aload_1        
        //   577: astore          6
        //   579: aload           4
        //   581: aload           8
        //   583: aload           7
        //   585: aload_2        
        //   586: invokevirtual   androidx/paging/PageFetcherSnapshot.j:(Lc5/p;Landroidx/paging/LoadType;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
        //   589: aload           5
        //   591: if_acmpne       597
        //   594: aload           5
        //   596: areturn        
        //   597: aload_1        
        //   598: astore          6
        //   600: getstatic       hg2/j.a:Lhg2/j;
        //   603: astore          8
        //   605: aload_1        
        //   606: aconst_null    
        //   607: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //   612: aload           4
        //   614: getstatic       androidx/paging/LoadType.REFRESH:Landroidx/paging/LoadType;
        //   617: aload           4
        //   619: getfield        androidx/paging/PageFetcherSnapshot.a:Ljava/lang/Object;
        //   622: invokevirtual   androidx/paging/PageFetcherSnapshot.g:(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$a;
        //   625: astore_1       
        //   626: aload           4
        //   628: getfield        androidx/paging/PageFetcherSnapshot.b:Landroidx/paging/PagingSource;
        //   631: astore          6
        //   633: aload_2        
        //   634: aload           4
        //   636: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   639: aload_2        
        //   640: aconst_null    
        //   641: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   644: aload_2        
        //   645: iconst_3       
        //   646: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //   649: aload           6
        //   651: aload_1        
        //   652: aload_2        
        //   653: invokevirtual   androidx/paging/PagingSource.d:(Landroidx/paging/PagingSource$a;Llg2/c;)Ljava/lang/Object;
        //   656: astore_1       
        //   657: aload_1        
        //   658: aload           5
        //   660: if_acmpne       666
        //   663: aload           5
        //   665: areturn        
        //   666: aload           4
        //   668: astore          6
        //   670: aload_1        
        //   671: checkcast       Landroidx/paging/PagingSource$b;
        //   674: astore          8
        //   676: aload           8
        //   678: instanceof      Landroidx/paging/PagingSource$b$b;
        //   681: ifeq            1252
        //   684: aload           6
        //   686: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //   689: astore          7
        //   691: aload           7
        //   693: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //   696: astore          9
        //   698: aload_2        
        //   699: aload           6
        //   701: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   704: aload_2        
        //   705: aload           8
        //   707: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   710: aload_2        
        //   711: aload           7
        //   713: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   716: aload_2        
        //   717: aload           9
        //   719: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //   722: aload_2        
        //   723: iconst_4       
        //   724: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //   727: aload           9
        //   729: astore          4
        //   731: aload           8
        //   733: astore_1       
        //   734: aload           9
        //   736: aconst_null    
        //   737: aload_2        
        //   738: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //   741: aload           5
        //   743: if_acmpne       749
        //   746: aload           5
        //   748: areturn        
        //   749: aload           7
        //   751: getfield        c5/p$a.b:Lc5/p;
        //   754: astore          7
        //   756: getstatic       androidx/paging/LoadType.REFRESH:Landroidx/paging/LoadType;
        //   759: astore          8
        //   761: aload           7
        //   763: iconst_0       
        //   764: aload           8
        //   766: aload_1        
        //   767: checkcast       Landroidx/paging/PagingSource$b$b;
        //   770: invokevirtual   c5/p.e:(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$b$b;)Z
        //   773: istore          10
        //   775: aload           7
        //   777: getfield        c5/p.l:Lc5/n;
        //   780: aload           8
        //   782: getstatic       c5/k$c.c:Lc5/k$c;
        //   785: invokevirtual   c5/n.b:(Landroidx/paging/LoadType;Lc5/k;)V
        //   788: aload_1        
        //   789: checkcast       Landroidx/paging/PagingSource$b$b;
        //   792: getfield        androidx/paging/PagingSource$b$b.b:Ljava/lang/Object;
        //   795: ifnonnull       812
        //   798: aload           7
        //   800: getfield        c5/p.l:Lc5/n;
        //   803: getstatic       androidx/paging/LoadType.PREPEND:Landroidx/paging/LoadType;
        //   806: getstatic       c5/k$c.b:Lc5/k$c;
        //   809: invokevirtual   c5/n.b:(Landroidx/paging/LoadType;Lc5/k;)V
        //   812: aload_1        
        //   813: checkcast       Landroidx/paging/PagingSource$b$b;
        //   816: getfield        androidx/paging/PagingSource$b$b.c:Ljava/lang/Object;
        //   819: ifnonnull       836
        //   822: aload           7
        //   824: getfield        c5/p.l:Lc5/n;
        //   827: getstatic       androidx/paging/LoadType.APPEND:Landroidx/paging/LoadType;
        //   830: getstatic       c5/k$c.b:Lc5/k$c;
        //   833: invokevirtual   c5/n.b:(Landroidx/paging/LoadType;Lc5/k;)V
        //   836: aload           4
        //   838: aconst_null    
        //   839: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //   844: iload           10
        //   846: ifeq            1048
        //   849: aload           6
        //   851: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //   854: astore          7
        //   856: aload           7
        //   858: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //   861: astore          9
        //   863: aload_2        
        //   864: aload           6
        //   866: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   869: aload_2        
        //   870: aload_1        
        //   871: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   874: aload_2        
        //   875: aload           7
        //   877: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   880: aload_2        
        //   881: aload           9
        //   883: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //   886: aload_2        
        //   887: iconst_5       
        //   888: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //   891: aload           9
        //   893: aconst_null    
        //   894: aload_2        
        //   895: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //   898: aload           5
        //   900: if_acmpne       906
        //   903: aload           5
        //   905: areturn        
        //   906: aload           6
        //   908: astore          4
        //   910: aload_1        
        //   911: astore          8
        //   913: aload           9
        //   915: astore_1       
        //   916: aload_1        
        //   917: astore          6
        //   919: aload           7
        //   921: getfield        c5/p$a.b:Lc5/p;
        //   924: astore          9
        //   926: aload_1        
        //   927: astore          6
        //   929: aload           4
        //   931: getfield        androidx/paging/PageFetcherSnapshot.k:Lkotlinx/coroutines/channels/AbstractChannel;
        //   934: astore          7
        //   936: aload_1        
        //   937: astore          6
        //   939: aload           9
        //   941: aload           8
        //   943: checkcast       Landroidx/paging/PagingSource$b$b;
        //   946: getstatic       androidx/paging/LoadType.REFRESH:Landroidx/paging/LoadType;
        //   949: invokevirtual   c5/p.f:(Landroidx/paging/PagingSource$b$b;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent$Insert;
        //   952: astore          9
        //   954: aload_1        
        //   955: astore          6
        //   957: aload_2        
        //   958: aload           4
        //   960: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //   963: aload_1        
        //   964: astore          6
        //   966: aload_2        
        //   967: aload           8
        //   969: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //   972: aload_1        
        //   973: astore          6
        //   975: aload_2        
        //   976: aload_1        
        //   977: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //   980: aload_1        
        //   981: astore          6
        //   983: aload_2        
        //   984: aconst_null    
        //   985: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //   988: aload_1        
        //   989: astore          6
        //   991: aload_2        
        //   992: bipush          6
        //   994: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //   997: aload_1        
        //   998: astore          6
        //  1000: aload           7
        //  1002: aload           9
        //  1004: aload_2        
        //  1005: invokevirtual   gj2/a.x:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  1008: aload           5
        //  1010: if_acmpne       1016
        //  1013: aload           5
        //  1015: areturn        
        //  1016: aload_1        
        //  1017: astore          6
        //  1019: getstatic       hg2/j.a:Lhg2/j;
        //  1022: astore          7
        //  1024: aload_1        
        //  1025: aconst_null    
        //  1026: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1031: aload           8
        //  1033: astore_1       
        //  1034: goto            1052
        //  1037: astore_1       
        //  1038: aload           6
        //  1040: aconst_null    
        //  1041: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1046: aload_1        
        //  1047: athrow         
        //  1048: aload           6
        //  1050: astore          4
        //  1052: aload           4
        //  1054: getfield        androidx/paging/PageFetcherSnapshot.f:Lc5/w;
        //  1057: ifnull          1440
        //  1060: aload_1        
        //  1061: checkcast       Landroidx/paging/PagingSource$b$b;
        //  1064: astore          6
        //  1066: aload           6
        //  1068: getfield        androidx/paging/PagingSource$b$b.b:Ljava/lang/Object;
        //  1071: ifnull          1082
        //  1074: aload           6
        //  1076: getfield        androidx/paging/PagingSource$b$b.c:Ljava/lang/Object;
        //  1079: ifnonnull       1440
        //  1082: aload           4
        //  1084: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //  1087: astore          8
        //  1089: aload           8
        //  1091: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //  1094: astore          6
        //  1096: aload_2        
        //  1097: aload           4
        //  1099: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //  1102: aload_2        
        //  1103: aload_1        
        //  1104: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //  1107: aload_2        
        //  1108: aload           8
        //  1110: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //  1113: aload_2        
        //  1114: aload           6
        //  1116: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //  1119: aload_2        
        //  1120: bipush          7
        //  1122: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //  1125: aload           6
        //  1127: aconst_null    
        //  1128: aload_2        
        //  1129: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  1132: aload           5
        //  1134: if_acmpne       1140
        //  1137: aload           5
        //  1139: areturn        
        //  1140: aload           4
        //  1142: astore_2       
        //  1143: aload_1        
        //  1144: astore          4
        //  1146: aload_2        
        //  1147: astore_1       
        //  1148: aload           8
        //  1150: getfield        c5/p$a.b:Lc5/p;
        //  1153: aload_1        
        //  1154: getfield        androidx/paging/PageFetcherSnapshot.i:Lc5/h;
        //  1157: getfield        c5/h.a:Lc5/h$b;
        //  1160: getfield        c5/h$b.c:Lc5/b0$a;
        //  1163: invokevirtual   c5/p.a:(Lc5/b0$a;)Lc5/u;
        //  1166: astore          8
        //  1168: aload           6
        //  1170: aconst_null    
        //  1171: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1176: aload           4
        //  1178: checkcast       Landroidx/paging/PagingSource$b$b;
        //  1181: astore          6
        //  1183: aload           6
        //  1185: getfield        androidx/paging/PagingSource$b$b.b:Ljava/lang/Object;
        //  1188: ifnonnull       1205
        //  1191: aload_1        
        //  1192: getfield        androidx/paging/PageFetcherSnapshot.f:Lc5/w;
        //  1195: getstatic       androidx/paging/LoadType.PREPEND:Landroidx/paging/LoadType;
        //  1198: aload           8
        //  1200: invokeinterface c5/w.b:(Landroidx/paging/LoadType;Lc5/u;)V
        //  1205: aload           6
        //  1207: getfield        androidx/paging/PagingSource$b$b.c:Ljava/lang/Object;
        //  1210: ifnonnull       1440
        //  1213: aload_1        
        //  1214: getfield        androidx/paging/PageFetcherSnapshot.f:Lc5/w;
        //  1217: getstatic       androidx/paging/LoadType.APPEND:Landroidx/paging/LoadType;
        //  1220: aload           8
        //  1222: invokeinterface c5/w.b:(Landroidx/paging/LoadType;Lc5/u;)V
        //  1227: goto            1440
        //  1230: astore_1       
        //  1231: aload           6
        //  1233: aconst_null    
        //  1234: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1239: aload_1        
        //  1240: athrow         
        //  1241: astore_1       
        //  1242: aload           4
        //  1244: aconst_null    
        //  1245: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1250: aload_1        
        //  1251: athrow         
        //  1252: aload           8
        //  1254: instanceof      Landroidx/paging/PagingSource$b$a;
        //  1257: ifeq            1440
        //  1260: aload           6
        //  1262: getfield        androidx/paging/PageFetcherSnapshot.l:Lc5/p$a;
        //  1265: astore          4
        //  1267: aload           4
        //  1269: getfield        c5/p$a.a:Lkotlinx/coroutines/sync/MutexImpl;
        //  1272: astore          7
        //  1274: aload_2        
        //  1275: aload           6
        //  1277: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //  1280: aload_2        
        //  1281: aload           8
        //  1283: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //  1286: aload_2        
        //  1287: aload           4
        //  1289: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //  1292: aload_2        
        //  1293: aload           7
        //  1295: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //  1298: aload_2        
        //  1299: bipush          8
        //  1301: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //  1304: aload           7
        //  1306: astore_1       
        //  1307: aload           7
        //  1309: aconst_null    
        //  1310: aload_2        
        //  1311: invokevirtual   kotlinx/coroutines/sync/MutexImpl.b:(Ljava/lang/Object;Llg2/c;)Ljava/lang/Object;
        //  1314: aload           5
        //  1316: if_acmpne       1322
        //  1319: aload           5
        //  1321: areturn        
        //  1322: aload           4
        //  1324: getfield        c5/p$a.b:Lc5/p;
        //  1327: astore          4
        //  1329: new             Lc5/k$a;
        //  1332: astore          7
        //  1334: aload           7
        //  1336: aload           8
        //  1338: checkcast       Landroidx/paging/PagingSource$b$a;
        //  1341: getfield        androidx/paging/PagingSource$b$a.a:Ljava/lang/Throwable;
        //  1344: invokespecial   c5/k$a.<init>:(Ljava/lang/Throwable;)V
        //  1347: getstatic       androidx/paging/LoadType.REFRESH:Landroidx/paging/LoadType;
        //  1350: astore          8
        //  1352: aload_2        
        //  1353: aload_1        
        //  1354: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$0:Ljava/lang/Object;
        //  1357: aload_2        
        //  1358: aconst_null    
        //  1359: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$1:Ljava/lang/Object;
        //  1362: aload_2        
        //  1363: aconst_null    
        //  1364: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$2:Ljava/lang/Object;
        //  1367: aload_2        
        //  1368: aconst_null    
        //  1369: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.L$3:Ljava/lang/Object;
        //  1372: aload_2        
        //  1373: bipush          9
        //  1375: putfield        androidx/paging/PageFetcherSnapshot$doInitialLoad$1.label:I
        //  1378: aload           6
        //  1380: aload           4
        //  1382: aload           8
        //  1384: aload           7
        //  1386: aload_2        
        //  1387: invokevirtual   androidx/paging/PageFetcherSnapshot.i:(Lc5/p;Landroidx/paging/LoadType;Lc5/k$a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
        //  1390: astore          6
        //  1392: aload           6
        //  1394: aload           5
        //  1396: if_acmpne       1402
        //  1399: aload           5
        //  1401: areturn        
        //  1402: aload_1        
        //  1403: astore          6
        //  1405: aload           6
        //  1407: astore_1       
        //  1408: getstatic       hg2/j.a:Lhg2/j;
        //  1411: astore          4
        //  1413: aload           6
        //  1415: aconst_null    
        //  1416: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1421: getstatic       hg2/j.a:Lhg2/j;
        //  1424: areturn        
        //  1425: goto            1430
        //  1428: astore          6
        //  1430: aload_1        
        //  1431: aconst_null    
        //  1432: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1437: aload           6
        //  1439: athrow         
        //  1440: getstatic       hg2/j.a:Lhg2/j;
        //  1443: areturn        
        //  1444: astore_1       
        //  1445: aload           6
        //  1447: aconst_null    
        //  1448: invokeinterface oj2/c.a:(Ljava/lang/Object;)V
        //  1453: aload_1        
        //  1454: athrow         
        //    Signature:
        //  (Llg2/c<-Lhg2/j;>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  138    143    146    151    Any
        //  274    279    1037   1048   Any
        //  420    425    1444   1455   Any
        //  528    535    1444   1455   Any
        //  538    543    1444   1455   Any
        //  546    552    1444   1455   Any
        //  555    560    1444   1455   Any
        //  563    568    1444   1455   Any
        //  571    576    1444   1455   Any
        //  579    594    1444   1455   Any
        //  600    605    1444   1455   Any
        //  749    812    1241   1252   Any
        //  812    836    1241   1252   Any
        //  919    926    1037   1048   Any
        //  929    936    1037   1048   Any
        //  939    954    1037   1048   Any
        //  957    963    1037   1048   Any
        //  966    972    1037   1048   Any
        //  975    980    1037   1048   Any
        //  983    988    1037   1048   Any
        //  991    997    1037   1048   Any
        //  1000   1013   1037   1048   Any
        //  1019   1024   1037   1048   Any
        //  1148   1168   1230   1241   Any
        //  1322   1392   1428   1430   Any
        //  1408   1413   146    151    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0432:
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
    
    public final PagingSource.a<Key> g(final LoadType loadType, final Key key) {
        int n;
        if (loadType == LoadType.REFRESH) {
            n = this.c.d;
        }
        else {
            n = this.c.a;
        }
        final boolean c = this.c.c;
        sg2.e.f((Object)loadType, "loadType");
        final int n2 = androidx.paging.g.a[loadType.ordinal()];
        Object o;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (key == null) {
                    throw new IllegalArgumentException("key cannot be null for append".toString());
                }
                o = new PagingSource$a$a((Object)key, n, c);
            }
            else {
                if (key == null) {
                    throw new IllegalArgumentException("key cannot be null for prepend".toString());
                }
                o = new PagingSource$a$b((Object)key, n, c);
            }
        }
        else {
            o = new PagingSource$a$c((Object)key, n, c);
        }
        return (PagingSource.a<Key>)o;
    }
    
    public final Key h(final p<Key, Value> p4, final LoadType loadType, final int n, final int n2) {
        p4.getClass();
        final int n3 = p.b.a[loadType.ordinal()];
        if (n3 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        int n4;
        if (n3 != 2) {
            if (n3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n4 = p4.h;
        }
        else {
            n4 = p4.g;
        }
        if (n != n4) {
            return null;
        }
        if (p4.l.a(loadType) instanceof k.a) {
            return null;
        }
        if (n2 >= this.c.b) {
            return null;
        }
        Object o;
        if (loadType == LoadType.PREPEND) {
            o = ((PagingSource$b$b)CollectionsKt___CollectionsKt.A3((List)p4.c)).b;
        }
        else {
            o = ((PagingSource$b$b)CollectionsKt___CollectionsKt.K3((List)p4.c)).c;
        }
        return (Key)o;
    }
    
    public final Object i(final p p4, final LoadType loadType, final k.a a, final ContinuationImpl continuationImpl) {
        if (sg2.e.a((Object)p4.l.a(loadType), (Object)a)) {
            return hg2.j.a;
        }
        p4.l.b(loadType, a);
        final Object x = ((gj2.a)this.k).x((Object)new PageEvent$b(p4.l.d(), (l)null), (c)continuationImpl);
        if (x == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x;
        }
        return hg2.j.a;
    }
    
    public final Object j(final p p3, final LoadType loadType, final ContinuationImpl continuationImpl) {
        final k a = p3.l.a(loadType);
        final k.b b = c5.k.b.b;
        if (sg2.e.a((Object)a, (Object)b)) {
            return hg2.j.a;
        }
        p3.l.b(loadType, b);
        final Object x = ((gj2.a)this.k).x((Object)new PageEvent$b(p3.l.d(), (l)null), (c)continuationImpl);
        if (x == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x;
        }
        return hg2.j.a;
    }
}
