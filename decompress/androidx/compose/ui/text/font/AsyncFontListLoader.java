// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.CoroutineContext;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext$b;
import mj2.z$a;
import mj2.z;
import kotlinx.coroutines.TimeoutKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import a80.a;
import z0.l0;
import n2.p;
import pg2.j;
import n2.y;
import zg2.l;
import n2.w;
import n2.f;
import java.util.List;
import z0.e1;

public final class AsyncFontListLoader implements e1<Object>
{
    public final List<f> f;
    public final w g;
    public final b h;
    public final l<y.b, j> i;
    public final p j;
    public final l0 k;
    public boolean l;
    
    public AsyncFontListLoader(final List<? extends f> f, final Object o, final w g, final b h, final l<? super y.b, j> i, final p j) {
        ah2.f.f(o, "initialType");
        ah2.f.f((Object)h, "asyncTypefaceCache");
        ah2.f.f((Object)i, "onCompletion");
        this.f = (List<f>)f;
        this.g = g;
        this.h = h;
        this.i = (l<y.b, j>)i;
        this.j = j;
        this.k = a.n0(o);
        this.l = true;
    }
    
    public final Object a(final c<? super j> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;
        //     4: ifeq            37
        //     7: aload_1        
        //     8: checkcast       Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;
        //    11: astore_2       
        //    12: aload_2        
        //    13: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //    16: istore_3       
        //    17: iload_3        
        //    18: ldc             -2147483648
        //    20: iand           
        //    21: ifeq            37
        //    24: aload_2        
        //    25: iload_3        
        //    26: ldc             -2147483648
        //    28: iadd           
        //    29: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //    32: aload_2        
        //    33: astore_1       
        //    34: goto            47
        //    37: new             Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;
        //    40: dup            
        //    41: aload_0        
        //    42: aload_1        
        //    43: invokespecial   androidx/compose/ui/text/font/AsyncFontListLoader$load$1.<init>:(Landroidx/compose/ui/text/font/AsyncFontListLoader;Ltg2/c;)V
        //    46: astore_1       
        //    47: aload_1        
        //    48: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.result:Ljava/lang/Object;
        //    51: astore          4
        //    53: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //    56: astore          5
        //    58: aload_1        
        //    59: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //    62: istore_3       
        //    63: iload_3        
        //    64: ifeq            192
        //    67: iload_3        
        //    68: iconst_1       
        //    69: if_icmpeq       128
        //    72: iload_3        
        //    73: iconst_2       
        //    74: if_icmpne       118
        //    77: aload_1        
        //    78: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$1:I
        //    81: istore          6
        //    83: aload_1        
        //    84: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$0:I
        //    87: istore_3       
        //    88: aload_1        
        //    89: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$1:Ljava/lang/Object;
        //    92: checkcast       Ljava/util/List;
        //    95: astore          7
        //    97: aload_1        
        //    98: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$0:Ljava/lang/Object;
        //   101: checkcast       Landroidx/compose/ui/text/font/AsyncFontListLoader;
        //   104: astore_2       
        //   105: aload           4
        //   107: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   110: goto            573
        //   113: astore          8
        //   115: goto            672
        //   118: new             Ljava/lang/IllegalStateException;
        //   121: dup            
        //   122: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   124: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   127: athrow         
        //   128: aload_1        
        //   129: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$1:I
        //   132: istore          6
        //   134: aload_1        
        //   135: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$0:I
        //   138: istore_3       
        //   139: aload_1        
        //   140: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$2:Ljava/lang/Object;
        //   143: checkcast       Ln2/f;
        //   146: astore          9
        //   148: aload_1        
        //   149: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$1:Ljava/lang/Object;
        //   152: checkcast       Ljava/util/List;
        //   155: astore          7
        //   157: aload_1        
        //   158: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$0:Ljava/lang/Object;
        //   161: checkcast       Landroidx/compose/ui/text/font/AsyncFontListLoader;
        //   164: astore_2       
        //   165: aload_1        
        //   166: astore          8
        //   168: aload_2        
        //   169: astore          10
        //   171: aload           4
        //   173: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   176: goto            368
        //   179: aload           10
        //   181: astore_2       
        //   182: aload           8
        //   184: astore_1       
        //   185: aload           7
        //   187: astore          8
        //   189: goto            672
        //   192: aload           4
        //   194: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   197: aload_0        
        //   198: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.f:Ljava/util/List;
        //   201: astore          8
        //   203: aload           8
        //   205: invokeinterface java/util/List.size:()I
        //   210: istore          6
        //   212: aload_0        
        //   213: astore_2       
        //   214: iconst_0       
        //   215: istore_3       
        //   216: iload_3        
        //   217: iload           6
        //   219: if_icmpge       625
        //   222: aload           8
        //   224: iload_3        
        //   225: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   230: checkcast       Ln2/f;
        //   233: astore          11
        //   235: aload           11
        //   237: invokeinterface n2/f.a:()I
        //   242: iconst_2       
        //   243: if_icmpne       252
        //   246: iconst_1       
        //   247: istore          12
        //   249: goto            255
        //   252: iconst_0       
        //   253: istore          12
        //   255: aload_1        
        //   256: astore          10
        //   258: iload           6
        //   260: istore          13
        //   262: iload_3        
        //   263: istore          14
        //   265: aload_2        
        //   266: astore          7
        //   268: aload           8
        //   270: astore          9
        //   272: iload           12
        //   274: ifeq            598
        //   277: aload_2        
        //   278: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.h:Landroidx/compose/ui/text/font/b;
        //   281: astore          10
        //   283: aload_2        
        //   284: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.j:Ln2/p;
        //   287: astore          7
        //   289: new             Landroidx/compose/ui/text/font/AsyncFontListLoader$load$2$typeface$1;
        //   292: astore          9
        //   294: aload           9
        //   296: aload_2        
        //   297: aload           11
        //   299: aconst_null    
        //   300: invokespecial   androidx/compose/ui/text/font/AsyncFontListLoader$load$2$typeface$1.<init>:(Landroidx/compose/ui/text/font/AsyncFontListLoader;Ln2/f;Ltg2/c;)V
        //   303: aload_1        
        //   304: aload_2        
        //   305: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$0:Ljava/lang/Object;
        //   308: aload_1        
        //   309: aload           8
        //   311: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$1:Ljava/lang/Object;
        //   314: aload_1        
        //   315: aload           11
        //   317: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$2:Ljava/lang/Object;
        //   320: aload_1        
        //   321: iload_3        
        //   322: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$0:I
        //   325: aload_1        
        //   326: iload           6
        //   328: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$1:I
        //   331: aload_1        
        //   332: iconst_1       
        //   333: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //   336: aload           10
        //   338: aload           11
        //   340: aload           7
        //   342: aload           9
        //   344: aload_1        
        //   345: invokevirtual   androidx/compose/ui/text/font/b.b:(Ln2/f;Ln2/p;Lzg2/l;Ltg2/c;)Ljava/lang/Object;
        //   348: astore          4
        //   350: aload           4
        //   352: aload           5
        //   354: if_acmpne       360
        //   357: aload           5
        //   359: areturn        
        //   360: aload           11
        //   362: astore          9
        //   364: aload           8
        //   366: astore          7
        //   368: aload           4
        //   370: ifnull          483
        //   373: aload_1        
        //   374: astore          8
        //   376: aload_2        
        //   377: astore          10
        //   379: aload_2        
        //   380: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.g:Ln2/w;
        //   383: astore          7
        //   385: aload_1        
        //   386: astore          8
        //   388: aload_2        
        //   389: astore          10
        //   391: aload           7
        //   393: getfield        n2/w.d:I
        //   396: aload           4
        //   398: aload           9
        //   400: aload           7
        //   402: getfield        n2/w.b:Ln2/m;
        //   405: aload           7
        //   407: getfield        n2/w.c:I
        //   410: invokestatic    at1/a.T1:(ILjava/lang/Object;Ln2/f;Ln2/m;I)Ljava/lang/Object;
        //   413: astore          7
        //   415: aload_1        
        //   416: astore          8
        //   418: aload_2        
        //   419: astore          10
        //   421: aload_2        
        //   422: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.k:Lz0/l0;
        //   425: aload           7
        //   427: invokevirtual   androidx/compose/runtime/SnapshotMutableStateImpl.setValue:(Ljava/lang/Object;)V
        //   430: aload_1        
        //   431: astore          8
        //   433: aload_2        
        //   434: astore          10
        //   436: getstatic       pg2/j.a:Lpg2/j;
        //   439: astore          7
        //   441: aload_1        
        //   442: invokeinterface tg2/c.getContext:()Lkotlin/coroutines/CoroutineContext;
        //   447: invokestatic    at1/a.V0:(Lkotlin/coroutines/CoroutineContext;)Z
        //   450: istore          15
        //   452: aload_2        
        //   453: iconst_0       
        //   454: putfield        androidx/compose/ui/text/font/AsyncFontListLoader.l:Z
        //   457: aload_2        
        //   458: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.i:Lzg2/l;
        //   461: new             Ln2/y$b;
        //   464: dup            
        //   465: aload_2        
        //   466: invokevirtual   androidx/compose/ui/text/font/AsyncFontListLoader.getValue:()Ljava/lang/Object;
        //   469: iload           15
        //   471: invokespecial   n2/y$b.<init>:(Ljava/lang/Object;Z)V
        //   474: invokeinterface zg2/l.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   479: pop            
        //   480: aload           7
        //   482: areturn        
        //   483: aload_1        
        //   484: astore          8
        //   486: aload_2        
        //   487: astore          10
        //   489: aload_1        
        //   490: aload_2        
        //   491: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$0:Ljava/lang/Object;
        //   494: aload_1        
        //   495: astore          8
        //   497: aload_2        
        //   498: astore          10
        //   500: aload_1        
        //   501: aload           7
        //   503: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$1:Ljava/lang/Object;
        //   506: aload_1        
        //   507: astore          8
        //   509: aload_2        
        //   510: astore          10
        //   512: aload_1        
        //   513: aconst_null    
        //   514: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$2:Ljava/lang/Object;
        //   517: aload_1        
        //   518: astore          8
        //   520: aload_2        
        //   521: astore          10
        //   523: aload_1        
        //   524: iload_3        
        //   525: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$0:I
        //   528: aload_1        
        //   529: astore          8
        //   531: aload_2        
        //   532: astore          10
        //   534: aload_1        
        //   535: iload           6
        //   537: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$1:I
        //   540: aload_1        
        //   541: astore          8
        //   543: aload_2        
        //   544: astore          10
        //   546: aload_1        
        //   547: iconst_2       
        //   548: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //   551: aload_1        
        //   552: astore          8
        //   554: aload_2        
        //   555: astore          10
        //   557: aload_1        
        //   558: invokestatic    a4/u1.L1:(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
        //   561: astore          9
        //   563: aload           9
        //   565: aload           5
        //   567: if_acmpne       573
        //   570: aload           5
        //   572: areturn        
        //   573: aload           7
        //   575: astore          9
        //   577: aload_1        
        //   578: astore          10
        //   580: iload           6
        //   582: istore          13
        //   584: iload_3        
        //   585: istore          14
        //   587: aload_2        
        //   588: astore          7
        //   590: goto            598
        //   593: astore          7
        //   595: goto            179
        //   598: iload           14
        //   600: iconst_1       
        //   601: iadd           
        //   602: istore_3       
        //   603: aload           10
        //   605: astore_1       
        //   606: iload           13
        //   608: istore          6
        //   610: aload           7
        //   612: astore_2       
        //   613: aload           9
        //   615: astore          8
        //   617: goto            216
        //   620: astore          8
        //   622: goto            672
        //   625: aload_1        
        //   626: invokeinterface tg2/c.getContext:()Lkotlin/coroutines/CoroutineContext;
        //   631: invokestatic    at1/a.V0:(Lkotlin/coroutines/CoroutineContext;)Z
        //   634: istore          15
        //   636: aload_2        
        //   637: iconst_0       
        //   638: putfield        androidx/compose/ui/text/font/AsyncFontListLoader.l:Z
        //   641: aload_2        
        //   642: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.i:Lzg2/l;
        //   645: new             Ln2/y$b;
        //   648: dup            
        //   649: aload_2        
        //   650: invokevirtual   androidx/compose/ui/text/font/AsyncFontListLoader.getValue:()Ljava/lang/Object;
        //   653: iload           15
        //   655: invokespecial   n2/y$b.<init>:(Ljava/lang/Object;Z)V
        //   658: invokeinterface zg2/l.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   663: pop            
        //   664: getstatic       pg2/j.a:Lpg2/j;
        //   667: areturn        
        //   668: astore          8
        //   670: aload_0        
        //   671: astore_2       
        //   672: aload_1        
        //   673: invokeinterface tg2/c.getContext:()Lkotlin/coroutines/CoroutineContext;
        //   678: invokestatic    at1/a.V0:(Lkotlin/coroutines/CoroutineContext;)Z
        //   681: istore          15
        //   683: aload_2        
        //   684: iconst_0       
        //   685: putfield        androidx/compose/ui/text/font/AsyncFontListLoader.l:Z
        //   688: aload_2        
        //   689: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.i:Lzg2/l;
        //   692: new             Ln2/y$b;
        //   695: dup            
        //   696: aload_2        
        //   697: invokevirtual   androidx/compose/ui/text/font/AsyncFontListLoader.getValue:()Ljava/lang/Object;
        //   700: iload           15
        //   702: invokespecial   n2/y$b.<init>:(Ljava/lang/Object;Z)V
        //   705: invokeinterface zg2/l.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   710: pop            
        //   711: aload           8
        //   713: athrow         
        //    Signature:
        //  (Ltg2/c<-Lpg2/j;>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  105    110    113    118    Any
        //  171    176    593    192    Any
        //  197    212    668    672    Any
        //  222    246    620    625    Any
        //  277    350    620    625    Any
        //  379    385    593    192    Any
        //  391    415    593    192    Any
        //  421    430    593    192    Any
        //  436    441    593    192    Any
        //  489    494    593    192    Any
        //  500    506    593    192    Any
        //  512    517    593    192    Any
        //  523    528    593    192    Any
        //  534    540    593    192    Any
        //  546    551    593    192    Any
        //  557    563    593    192    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0216:
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
    
    public final Object g(final f l$0, c<Object> f) {
        AsyncFontListLoader$loadWithTimeoutOrNull.AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1 = null;
        Label_0048: {
            if (f instanceof AsyncFontListLoader$loadWithTimeoutOrNull.AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull.AsyncFontListLoader$loadWithTimeoutOrNull$1)f;
                final int label = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull.AsyncFontListLoader$loadWithTimeoutOrNull$1(this, (c)f);
        }
        final Object result = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
        final Object o = null;
        Object c = null;
        Label_0108: {
            if (label2 == 0) {
                break Label_0108;
            }
            Label_0098: {
                if (label2 != 1) {
                    break Label_0098;
                }
                f = (f)asyncFontListLoader$loadWithTimeoutOrNull$1.L$0;
                try {
                    aj2.c.Q0(result);
                    c = result;
                    Label_0170: {
                        return c;
                    }
                    aj2.c.Q0(result);
                    f = l$0;
                    f = l$0;
                    final AsyncFontListLoader$loadWithTimeoutOrNull.AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull.AsyncFontListLoader$loadWithTimeoutOrNull$2(this, l$0, (c)null);
                    f = l$0;
                    asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = l$0;
                    f = l$0;
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
                    f = l$0;
                    iftrue(Label_0170:)((c = TimeoutKt.c(15000L, (zg2.p)asyncFontListLoader$loadWithTimeoutOrNull$2, (c)asyncFontListLoader$loadWithTimeoutOrNull$1)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final Exception ex) {
                    final CoroutineContext context = ((c)asyncFontListLoader$loadWithTimeoutOrNull$1).getContext();
                    final int o2 = z.O3;
                    final z z = (z)context.get((CoroutineContext$b)z$a.f);
                    c = o;
                    if (z != null) {
                        final CoroutineContext context2 = ((c)asyncFontListLoader$loadWithTimeoutOrNull$1).getContext();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unable to load font ");
                        sb.append(f);
                        z.y(context2, (Throwable)new IllegalStateException(sb.toString(), ex));
                        c = o;
                    }
                }
                catch (final CancellationException ex2) {
                    if (!at1.a.V0(((c)asyncFontListLoader$loadWithTimeoutOrNull$1).getContext())) {
                        throw ex2;
                    }
                    c = o;
                }
            }
        }
        return c;
    }
    
    @Override
    public final Object getValue() {
        return ((SnapshotMutableStateImpl<Object>)this.k).getValue();
    }
}
