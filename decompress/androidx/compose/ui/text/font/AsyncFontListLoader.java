// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.CoroutineContext;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext$b;
import zi2.a0$a;
import zi2.a0;
import zi2.c0;
import mg2.p;
import kotlinx.coroutines.TimeoutKt;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import ah0.b;
import ng2.e;
import z0.k0;
import n2.r;
import cg2.j;
import n2.a0$b;
import mg2.l;
import n2.y;
import n2.f;
import java.util.List;
import z0.c1;

public final class AsyncFontListLoader implements c1<Object>
{
    public final List<f> f;
    public final y g;
    public final a h;
    public final l<a0$b, j> i;
    public final r j;
    public final k0 k;
    public boolean l;
    
    public AsyncFontListLoader(final List<? extends f> f, final Object o, final y g, final a h, final l<? super a0$b, j> i, final r j) {
        e.f(o, "initialType");
        e.f((Object)h, "asyncTypefaceCache");
        e.f((Object)i, "onCompletion");
        this.f = (List<f>)f;
        this.g = g;
        this.h = h;
        this.i = (l<a0$b, j>)i;
        this.j = j;
        this.k = b.Z0(o);
        this.l = true;
    }
    
    public final Object a(final c<? super j> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;
        //     4: ifeq            41
        //     7: aload_1        
        //     8: checkcast       Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;
        //    11: astore          8
        //    13: aload           8
        //    15: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //    18: istore_2       
        //    19: iload_2        
        //    20: ldc             -2147483648
        //    22: iand           
        //    23: ifeq            41
        //    26: aload           8
        //    28: iload_2        
        //    29: ldc             -2147483648
        //    31: iadd           
        //    32: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //    35: aload           8
        //    37: astore_1       
        //    38: goto            51
        //    41: new             Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;
        //    44: dup            
        //    45: aload_0        
        //    46: aload_1        
        //    47: invokespecial   androidx/compose/ui/text/font/AsyncFontListLoader$load$1.<init>:(Landroidx/compose/ui/text/font/AsyncFontListLoader;Lgg2/c;)V
        //    50: astore_1       
        //    51: aload_1        
        //    52: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.result:Ljava/lang/Object;
        //    55: astore          12
        //    57: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //    60: astore          14
        //    62: aload_1        
        //    63: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //    66: istore_2       
        //    67: iload_2        
        //    68: ifeq            198
        //    71: iload_2        
        //    72: iconst_1       
        //    73: if_icmpeq       132
        //    76: iload_2        
        //    77: iconst_2       
        //    78: if_icmpne       122
        //    81: aload_1        
        //    82: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$1:I
        //    85: istore_3       
        //    86: aload_1        
        //    87: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$0:I
        //    90: istore_2       
        //    91: aload_1        
        //    92: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$1:Ljava/lang/Object;
        //    95: checkcast       Ljava/util/List;
        //    98: astore          11
        //   100: aload_1        
        //   101: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$0:Ljava/lang/Object;
        //   104: checkcast       Landroidx/compose/ui/text/font/AsyncFontListLoader;
        //   107: astore          8
        //   109: aload           12
        //   111: invokestatic    cg/d.b4:(Ljava/lang/Object;)V
        //   114: goto            593
        //   117: astore          9
        //   119: goto            696
        //   122: new             Ljava/lang/IllegalStateException;
        //   125: dup            
        //   126: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   128: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   131: athrow         
        //   132: aload_1        
        //   133: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$1:I
        //   136: istore_3       
        //   137: aload_1        
        //   138: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$0:I
        //   141: istore_2       
        //   142: aload_1        
        //   143: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$2:Ljava/lang/Object;
        //   146: checkcast       Ln2/f;
        //   149: astore          13
        //   151: aload_1        
        //   152: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$1:Ljava/lang/Object;
        //   155: checkcast       Ljava/util/List;
        //   158: astore          11
        //   160: aload_1        
        //   161: getfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$0:Ljava/lang/Object;
        //   164: checkcast       Landroidx/compose/ui/text/font/AsyncFontListLoader;
        //   167: astore          8
        //   169: aload_1        
        //   170: astore          9
        //   172: aload           8
        //   174: astore          10
        //   176: aload           12
        //   178: invokestatic    cg/d.b4:(Ljava/lang/Object;)V
        //   181: goto            372
        //   184: aload           10
        //   186: astore          8
        //   188: aload           9
        //   190: astore_1       
        //   191: aload           11
        //   193: astore          9
        //   195: goto            696
        //   198: aload           12
        //   200: invokestatic    cg/d.b4:(Ljava/lang/Object;)V
        //   203: aload_0        
        //   204: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.f:Ljava/util/List;
        //   207: astore          9
        //   209: aload           9
        //   211: invokeinterface java/util/List.size:()I
        //   216: istore_3       
        //   217: aload_0        
        //   218: astore          8
        //   220: iconst_0       
        //   221: istore_2       
        //   222: iload_2        
        //   223: iload_3        
        //   224: if_icmpge       645
        //   227: aload           9
        //   229: iload_2        
        //   230: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   235: checkcast       Ln2/f;
        //   238: astore          13
        //   240: aload           13
        //   242: invokeinterface n2/f.a:()I
        //   247: iconst_2       
        //   248: if_icmpne       257
        //   251: iconst_1       
        //   252: istore          6
        //   254: goto            260
        //   257: iconst_0       
        //   258: istore          6
        //   260: aload_1        
        //   261: astore          10
        //   263: iload_3        
        //   264: istore          4
        //   266: iload_2        
        //   267: istore          5
        //   269: aload           8
        //   271: astore          11
        //   273: aload           9
        //   275: astore          12
        //   277: iload           6
        //   279: ifeq            618
        //   282: aload           8
        //   284: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.h:Landroidx/compose/ui/text/font/a;
        //   287: astore          12
        //   289: aload           8
        //   291: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.j:Ln2/r;
        //   294: astore          10
        //   296: new             Landroidx/compose/ui/text/font/AsyncFontListLoader$load$2$typeface$1;
        //   299: astore          11
        //   301: aload           11
        //   303: aload           8
        //   305: aload           13
        //   307: aconst_null    
        //   308: invokespecial   androidx/compose/ui/text/font/AsyncFontListLoader$load$2$typeface$1.<init>:(Landroidx/compose/ui/text/font/AsyncFontListLoader;Ln2/f;Lgg2/c;)V
        //   311: aload_1        
        //   312: aload           8
        //   314: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$0:Ljava/lang/Object;
        //   317: aload_1        
        //   318: aload           9
        //   320: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$1:Ljava/lang/Object;
        //   323: aload_1        
        //   324: aload           13
        //   326: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$2:Ljava/lang/Object;
        //   329: aload_1        
        //   330: iload_2        
        //   331: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$0:I
        //   334: aload_1        
        //   335: iload_3        
        //   336: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$1:I
        //   339: aload_1        
        //   340: iconst_1       
        //   341: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //   344: aload           12
        //   346: aload           13
        //   348: aload           10
        //   350: aload           11
        //   352: aload_1        
        //   353: invokevirtual   androidx/compose/ui/text/font/a.b:(Ln2/f;Ln2/r;Lmg2/l;Lgg2/c;)Ljava/lang/Object;
        //   356: astore          12
        //   358: aload           12
        //   360: aload           14
        //   362: if_acmpne       368
        //   365: aload           14
        //   367: areturn        
        //   368: aload           9
        //   370: astore          11
        //   372: aload           12
        //   374: ifnull          496
        //   377: aload_1        
        //   378: astore          9
        //   380: aload           8
        //   382: astore          10
        //   384: aload           8
        //   386: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.g:Ln2/y;
        //   389: astore          11
        //   391: aload_1        
        //   392: astore          9
        //   394: aload           8
        //   396: astore          10
        //   398: aload           11
        //   400: getfield        n2/y.d:I
        //   403: aload           12
        //   405: aload           13
        //   407: aload           11
        //   409: getfield        n2/y.b:Ln2/o;
        //   412: aload           11
        //   414: getfield        n2/y.c:I
        //   417: invokestatic    dg/l0.c1:(ILjava/lang/Object;Ln2/f;Ln2/o;I)Ljava/lang/Object;
        //   420: astore          11
        //   422: aload_1        
        //   423: astore          9
        //   425: aload           8
        //   427: astore          10
        //   429: aload           8
        //   431: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.k:Lz0/k0;
        //   434: aload           11
        //   436: invokevirtual   androidx/compose/runtime/SnapshotMutableStateImpl.setValue:(Ljava/lang/Object;)V
        //   439: aload_1        
        //   440: astore          9
        //   442: aload           8
        //   444: astore          10
        //   446: getstatic       cg2/j.a:Lcg2/j;
        //   449: astore          11
        //   451: aload_1        
        //   452: invokeinterface gg2/c.getContext:()Lkotlin/coroutines/CoroutineContext;
        //   457: invokestatic    ah0/b.E0:(Lkotlin/coroutines/CoroutineContext;)Z
        //   460: istore          7
        //   462: aload           8
        //   464: iconst_0       
        //   465: putfield        androidx/compose/ui/text/font/AsyncFontListLoader.l:Z
        //   468: aload           8
        //   470: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.i:Lmg2/l;
        //   473: new             Ln2/a0$b;
        //   476: dup            
        //   477: aload           8
        //   479: invokevirtual   androidx/compose/ui/text/font/AsyncFontListLoader.getValue:()Ljava/lang/Object;
        //   482: iload           7
        //   484: invokespecial   n2/a0$b.<init>:(Ljava/lang/Object;Z)V
        //   487: invokeinterface mg2/l.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   492: pop            
        //   493: aload           11
        //   495: areturn        
        //   496: aload_1        
        //   497: astore          9
        //   499: aload           8
        //   501: astore          10
        //   503: aload_1        
        //   504: aload           8
        //   506: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$0:Ljava/lang/Object;
        //   509: aload_1        
        //   510: astore          9
        //   512: aload           8
        //   514: astore          10
        //   516: aload_1        
        //   517: aload           11
        //   519: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$1:Ljava/lang/Object;
        //   522: aload_1        
        //   523: astore          9
        //   525: aload           8
        //   527: astore          10
        //   529: aload_1        
        //   530: aconst_null    
        //   531: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.L$2:Ljava/lang/Object;
        //   534: aload_1        
        //   535: astore          9
        //   537: aload           8
        //   539: astore          10
        //   541: aload_1        
        //   542: iload_2        
        //   543: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$0:I
        //   546: aload_1        
        //   547: astore          9
        //   549: aload           8
        //   551: astore          10
        //   553: aload_1        
        //   554: iload_3        
        //   555: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.I$1:I
        //   558: aload_1        
        //   559: astore          9
        //   561: aload           8
        //   563: astore          10
        //   565: aload_1        
        //   566: iconst_2       
        //   567: putfield        androidx/compose/ui/text/font/AsyncFontListLoader$load$1.label:I
        //   570: aload_1        
        //   571: astore          9
        //   573: aload           8
        //   575: astore          10
        //   577: aload_1        
        //   578: invokestatic    zg/a.A0:(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
        //   581: astore          12
        //   583: aload           12
        //   585: aload           14
        //   587: if_acmpne       593
        //   590: aload           14
        //   592: areturn        
        //   593: aload           11
        //   595: astore          12
        //   597: aload_1        
        //   598: astore          10
        //   600: iload_3        
        //   601: istore          4
        //   603: iload_2        
        //   604: istore          5
        //   606: aload           8
        //   608: astore          11
        //   610: goto            618
        //   613: astore          11
        //   615: goto            184
        //   618: iload           5
        //   620: iconst_1       
        //   621: iadd           
        //   622: istore_2       
        //   623: aload           10
        //   625: astore_1       
        //   626: iload           4
        //   628: istore_3       
        //   629: aload           11
        //   631: astore          8
        //   633: aload           12
        //   635: astore          9
        //   637: goto            222
        //   640: astore          9
        //   642: goto            696
        //   645: aload_1        
        //   646: invokeinterface gg2/c.getContext:()Lkotlin/coroutines/CoroutineContext;
        //   651: invokestatic    ah0/b.E0:(Lkotlin/coroutines/CoroutineContext;)Z
        //   654: istore          7
        //   656: aload           8
        //   658: iconst_0       
        //   659: putfield        androidx/compose/ui/text/font/AsyncFontListLoader.l:Z
        //   662: aload           8
        //   664: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.i:Lmg2/l;
        //   667: new             Ln2/a0$b;
        //   670: dup            
        //   671: aload           8
        //   673: invokevirtual   androidx/compose/ui/text/font/AsyncFontListLoader.getValue:()Ljava/lang/Object;
        //   676: iload           7
        //   678: invokespecial   n2/a0$b.<init>:(Ljava/lang/Object;Z)V
        //   681: invokeinterface mg2/l.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   686: pop            
        //   687: getstatic       cg2/j.a:Lcg2/j;
        //   690: areturn        
        //   691: astore          9
        //   693: aload_0        
        //   694: astore          8
        //   696: aload_1        
        //   697: invokeinterface gg2/c.getContext:()Lkotlin/coroutines/CoroutineContext;
        //   702: invokestatic    ah0/b.E0:(Lkotlin/coroutines/CoroutineContext;)Z
        //   705: istore          7
        //   707: aload           8
        //   709: iconst_0       
        //   710: putfield        androidx/compose/ui/text/font/AsyncFontListLoader.l:Z
        //   713: aload           8
        //   715: getfield        androidx/compose/ui/text/font/AsyncFontListLoader.i:Lmg2/l;
        //   718: new             Ln2/a0$b;
        //   721: dup            
        //   722: aload           8
        //   724: invokevirtual   androidx/compose/ui/text/font/AsyncFontListLoader.getValue:()Ljava/lang/Object;
        //   727: iload           7
        //   729: invokespecial   n2/a0$b.<init>:(Ljava/lang/Object;Z)V
        //   732: invokeinterface mg2/l.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   737: pop            
        //   738: aload           9
        //   740: athrow         
        //    Signature:
        //  (Lgg2/c<-Lcg2/j;>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  109    114    117    122    Any
        //  176    181    613    198    Any
        //  203    217    691    696    Any
        //  227    251    640    645    Any
        //  282    358    640    645    Any
        //  384    391    613    198    Any
        //  398    422    613    198    Any
        //  429    439    613    198    Any
        //  446    451    613    198    Any
        //  503    509    613    198    Any
        //  516    522    613    198    Any
        //  529    534    613    198    Any
        //  541    546    613    198    Any
        //  553    558    613    198    Any
        //  565    570    613    198    Any
        //  577    583    613    198    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0222:
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
    
    public final Object getValue() {
        return ((SnapshotMutableStateImpl)this.k).getValue();
    }
    
    public final Object i(final f l$0, c<Object> o) {
        Label_0051: {
            if (o instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                final Object o2 = o;
                final int label = ((AsyncFontListLoader$loadWithTimeoutOrNull$1)o2).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((AsyncFontListLoader$loadWithTimeoutOrNull$1)o2).label = label + Integer.MIN_VALUE;
                    o = o2;
                    break Label_0051;
                }
            }
            o = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, (c)o);
        }
        final Object result = ((AsyncFontListLoader$loadWithTimeoutOrNull$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((AsyncFontListLoader$loadWithTimeoutOrNull$1)o).label;
        final Object o3 = null;
        Object c = null;
        Label_0109: {
            if (label2 == 0) {
                break Label_0109;
            }
            Label_0099: {
                if (label2 != 1) {
                    break Label_0099;
                }
                Object o2 = ((AsyncFontListLoader$loadWithTimeoutOrNull$1)o).L$0;
                try {
                    d.b4(result);
                    c = result;
                    Label_0176: {
                        return c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    d.b4(result);
                    o2 = l$0;
                    o2 = l$0;
                    final AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, l$0, (c)null);
                    o2 = l$0;
                    ((AsyncFontListLoader$loadWithTimeoutOrNull$1)o).L$0 = l$0;
                    o2 = l$0;
                    ((AsyncFontListLoader$loadWithTimeoutOrNull$1)o).label = 1;
                    o2 = l$0;
                    iftrue(Label_0176:)((c = TimeoutKt.c(15000L, (mg2.p<? super c0, ? super c<? super Object>, ?>)asyncFontListLoader$loadWithTimeoutOrNull$2, (c<? super Object>)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final Exception ex) {
                    final CoroutineContext context = ((c)o).getContext();
                    final int c2 = a0.c4;
                    final a0 a0 = (a0)context.get((CoroutineContext$b)a0$a.f);
                    c = o3;
                    if (a0 != null) {
                        final CoroutineContext context2 = ((c)o).getContext();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unable to load font ");
                        sb.append(o2);
                        a0.t(context2, new IllegalStateException(sb.toString(), ex));
                        c = o3;
                    }
                }
                catch (final CancellationException ex2) {
                    if (!b.E0(((c)o).getContext())) {
                        throw ex2;
                    }
                    c = o3;
                }
            }
        }
        return c;
    }
}
