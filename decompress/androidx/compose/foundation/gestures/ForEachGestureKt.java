// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import zg2.p;
import z1.v;
import java.util.List;
import z1.k;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import androidx.compose.ui.input.pointer.PointerEventPass;
import z1.o;
import ah2.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import z1.c;

public final class ForEachGestureKt
{
    public static final Object a(c l$0, final tg2.c<? super j> c) {
        Object o = null;
        Label_0046: {
            if (c instanceof ForEachGestureKt$awaitAllPointersUp$3) {
                final ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3)c;
                final int label = forEachGestureKt$awaitAllPointersUp$3.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    forEachGestureKt$awaitAllPointersUp$3.label = label + Integer.MIN_VALUE;
                    o = forEachGestureKt$awaitAllPointersUp$3;
                    break Label_0046;
                }
            }
            o = new ForEachGestureKt$awaitAllPointersUp$3((tg2.c)c);
        }
        Object o2 = ((ForEachGestureKt$awaitAllPointersUp$3)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((ForEachGestureKt$awaitAllPointersUp$3)o).label;
        while (true) {
        Label_0166:
            while (true) {
                if (label2 == 0) {
                    aj2.c.Q0(o2);
                    f.f((Object)l$0, "<this>");
                    final List<o> a = l$0.B0().a;
                    final int size = a.size();
                    int i = 0;
                    while (true) {
                        while (i < size) {
                            if (((o)a.get(i)).d) {
                                final int n = 1;
                                if ((n ^ 0x1) == 0x0) {
                                    break Label_0166;
                                }
                                return j.a;
                            }
                            else {
                                ++i;
                            }
                        }
                        final int n = 0;
                        continue;
                    }
                }
                Label_0203: {
                    if (label2 == 1) {
                        l$0 = (c)((ForEachGestureKt$awaitAllPointersUp$3)o).L$0;
                        aj2.c.Q0(o2);
                        break Label_0203;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    final PointerEventPass final1 = PointerEventPass.Final;
                    ((ForEachGestureKt$awaitAllPointersUp$3)o).L$0 = l$0;
                    ((ForEachGestureKt$awaitAllPointersUp$3)o).label = 1;
                    if ((o2 = l$0.P(final1, (BaseContinuationImpl)o)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                final List<o> a2 = ((k)o2).a;
                final int size2 = a2.size();
                int j = 0;
                while (j < size2) {
                    if (((o)a2.get(j)).d) {
                        final boolean b = true;
                        if (!b) {
                            return pg2.j.a;
                        }
                        continue Label_0166;
                    }
                    else {
                        ++j;
                    }
                }
                break;
            }
            final boolean b = false;
            continue;
        }
    }
    
    public static final Object b(final v p0, final p<? super v, ? super tg2.c<? super j>, ?> p1, final tg2.c<? super j> p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;
        //     4: ifeq            40
        //     7: aload_2        
        //     8: checkcast       Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;
        //    11: astore_3       
        //    12: aload_3        
        //    13: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.label:I
        //    16: istore          4
        //    18: iload           4
        //    20: ldc             -2147483648
        //    22: iand           
        //    23: ifeq            40
        //    26: aload_3        
        //    27: iload           4
        //    29: ldc             -2147483648
        //    31: iadd           
        //    32: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.label:I
        //    35: aload_3        
        //    36: astore_2       
        //    37: goto            49
        //    40: new             Landroidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1;
        //    43: dup            
        //    44: aload_2        
        //    45: invokespecial   androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.<init>:(Ltg2/c;)V
        //    48: astore_2       
        //    49: aload_2        
        //    50: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.result:Ljava/lang/Object;
        //    53: astore          5
        //    55: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //    58: astore          6
        //    60: aload_2        
        //    61: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.label:I
        //    64: istore          4
        //    66: iload           4
        //    68: ifeq            234
        //    71: iload           4
        //    73: iconst_1       
        //    74: if_icmpeq       187
        //    77: iload           4
        //    79: iconst_2       
        //    80: if_icmpeq       131
        //    83: iload           4
        //    85: iconst_3       
        //    86: if_icmpne       121
        //    89: aload_2        
        //    90: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$2:Ljava/lang/Object;
        //    93: checkcast       Lkotlin/coroutines/CoroutineContext;
        //    96: astore_3       
        //    97: aload_2        
        //    98: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$1:Ljava/lang/Object;
        //   101: checkcast       Lzg2/p;
        //   104: astore_1       
        //   105: aload_2        
        //   106: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$0:Ljava/lang/Object;
        //   109: checkcast       Lz1/v;
        //   112: astore_0       
        //   113: aload           5
        //   115: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   118: goto            184
        //   121: new             Ljava/lang/IllegalStateException;
        //   124: dup            
        //   125: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   127: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   130: athrow         
        //   131: aload_2        
        //   132: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$2:Ljava/lang/Object;
        //   135: checkcast       Lkotlin/coroutines/CoroutineContext;
        //   138: astore          7
        //   140: aload_2        
        //   141: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$1:Ljava/lang/Object;
        //   144: checkcast       Lzg2/p;
        //   147: astore          8
        //   149: aload_2        
        //   150: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$0:Ljava/lang/Object;
        //   153: checkcast       Lz1/v;
        //   156: astore          9
        //   158: aload_2        
        //   159: astore          10
        //   161: aload           9
        //   163: astore_3       
        //   164: aload           7
        //   166: astore_1       
        //   167: aload           8
        //   169: astore_0       
        //   170: aload           5
        //   172: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   175: aload           8
        //   177: astore_1       
        //   178: aload           7
        //   180: astore_3       
        //   181: aload           9
        //   183: astore_0       
        //   184: goto            246
        //   187: aload_2        
        //   188: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$2:Ljava/lang/Object;
        //   191: checkcast       Lkotlin/coroutines/CoroutineContext;
        //   194: astore          7
        //   196: aload_2        
        //   197: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$1:Ljava/lang/Object;
        //   200: checkcast       Lzg2/p;
        //   203: astore          9
        //   205: aload_2        
        //   206: getfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$0:Ljava/lang/Object;
        //   209: checkcast       Lz1/v;
        //   212: astore          8
        //   214: aload_2        
        //   215: astore          10
        //   217: aload           8
        //   219: astore_3       
        //   220: aload           7
        //   222: astore_1       
        //   223: aload           9
        //   225: astore_0       
        //   226: aload           5
        //   228: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   231: goto            302
        //   234: aload           5
        //   236: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   239: aload_2        
        //   240: invokeinterface tg2/c.getContext:()Lkotlin/coroutines/CoroutineContext;
        //   245: astore_3       
        //   246: aload_3        
        //   247: invokestatic    at1/a.V0:(Lkotlin/coroutines/CoroutineContext;)Z
        //   250: ifeq            597
        //   253: aload_2        
        //   254: aload_0        
        //   255: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$0:Ljava/lang/Object;
        //   258: aload_2        
        //   259: aload_1        
        //   260: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$1:Ljava/lang/Object;
        //   263: aload_2        
        //   264: aload_3        
        //   265: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$2:Ljava/lang/Object;
        //   268: aload_2        
        //   269: iconst_1       
        //   270: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.label:I
        //   273: aload_1        
        //   274: aload_0        
        //   275: aload_2        
        //   276: invokeinterface zg2/p.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   281: astore          9
        //   283: aload           9
        //   285: aload           6
        //   287: if_acmpne       293
        //   290: aload           6
        //   292: areturn        
        //   293: aload_1        
        //   294: astore          9
        //   296: aload_3        
        //   297: astore          7
        //   299: aload_0        
        //   300: astore          8
        //   302: aload_2        
        //   303: astore          10
        //   305: aload           8
        //   307: astore_3       
        //   308: aload           7
        //   310: astore_1       
        //   311: aload           9
        //   313: astore_0       
        //   314: aload_2        
        //   315: aload           8
        //   317: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$0:Ljava/lang/Object;
        //   320: aload_2        
        //   321: astore          10
        //   323: aload           8
        //   325: astore_3       
        //   326: aload           7
        //   328: astore_1       
        //   329: aload           9
        //   331: astore_0       
        //   332: aload_2        
        //   333: aload           9
        //   335: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$1:Ljava/lang/Object;
        //   338: aload_2        
        //   339: astore          10
        //   341: aload           8
        //   343: astore_3       
        //   344: aload           7
        //   346: astore_1       
        //   347: aload           9
        //   349: astore_0       
        //   350: aload_2        
        //   351: aload           7
        //   353: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$2:Ljava/lang/Object;
        //   356: aload_2        
        //   357: astore          10
        //   359: aload           8
        //   361: astore_3       
        //   362: aload           7
        //   364: astore_1       
        //   365: aload           9
        //   367: astore_0       
        //   368: aload_2        
        //   369: iconst_2       
        //   370: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.label:I
        //   373: aload_2        
        //   374: astore          10
        //   376: aload           8
        //   378: astore_3       
        //   379: aload           7
        //   381: astore_1       
        //   382: aload           9
        //   384: astore_0       
        //   385: new             Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$2;
        //   388: astore          5
        //   390: aload_2        
        //   391: astore          10
        //   393: aload           8
        //   395: astore_3       
        //   396: aload           7
        //   398: astore_1       
        //   399: aload           9
        //   401: astore_0       
        //   402: aload           5
        //   404: aconst_null    
        //   405: invokespecial   androidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$2.<init>:(Ltg2/c;)V
        //   408: aload_2        
        //   409: astore          10
        //   411: aload           8
        //   413: astore_3       
        //   414: aload           7
        //   416: astore_1       
        //   417: aload           9
        //   419: astore_0       
        //   420: aload           8
        //   422: aload           5
        //   424: aload_2        
        //   425: invokeinterface z1/v.F0:(Lzg2/p;Ltg2/c;)Ljava/lang/Object;
        //   430: astore          5
        //   432: aload_2        
        //   433: astore          10
        //   435: aload           8
        //   437: astore_3       
        //   438: aload           7
        //   440: astore_1       
        //   441: aload           9
        //   443: astore_0       
        //   444: aload           5
        //   446: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //   449: if_acmpne       459
        //   452: aload           5
        //   454: astore          10
        //   456: goto            480
        //   459: aload_2        
        //   460: astore          10
        //   462: aload           8
        //   464: astore_3       
        //   465: aload           7
        //   467: astore_1       
        //   468: aload           9
        //   470: astore_0       
        //   471: getstatic       pg2/j.a:Lpg2/j;
        //   474: astore          5
        //   476: aload           5
        //   478: astore          10
        //   480: aload           8
        //   482: astore_0       
        //   483: aload           7
        //   485: astore_3       
        //   486: aload           9
        //   488: astore_1       
        //   489: aload           10
        //   491: aload           6
        //   493: if_acmpne       184
        //   496: aload           6
        //   498: areturn        
        //   499: astore          7
        //   501: aload           10
        //   503: astore_2       
        //   504: aload_3        
        //   505: astore          9
        //   507: aload_1        
        //   508: astore_3       
        //   509: aload_0        
        //   510: astore_1       
        //   511: goto            519
        //   514: astore          7
        //   516: aload_0        
        //   517: astore          9
        //   519: aload_3        
        //   520: invokestatic    at1/a.V0:(Lkotlin/coroutines/CoroutineContext;)Z
        //   523: ifeq            594
        //   526: aload_2        
        //   527: aload           9
        //   529: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$0:Ljava/lang/Object;
        //   532: aload_2        
        //   533: aload_1        
        //   534: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$1:Ljava/lang/Object;
        //   537: aload_2        
        //   538: aload_3        
        //   539: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.L$2:Ljava/lang/Object;
        //   542: aload_2        
        //   543: iconst_3       
        //   544: putfield        androidx/compose/foundation/gestures/ForEachGestureKt$forEachGesture$1.label:I
        //   547: aload           9
        //   549: new             Landroidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$2;
        //   552: dup            
        //   553: aconst_null    
        //   554: invokespecial   androidx/compose/foundation/gestures/ForEachGestureKt$awaitAllPointersUp$2.<init>:(Ltg2/c;)V
        //   557: aload_2        
        //   558: invokeinterface z1/v.F0:(Lzg2/p;Ltg2/c;)Ljava/lang/Object;
        //   563: astore          7
        //   565: aload           7
        //   567: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //   570: if_acmpne       576
        //   573: goto            581
        //   576: getstatic       pg2/j.a:Lpg2/j;
        //   579: astore          7
        //   581: aload           9
        //   583: astore_0       
        //   584: aload           7
        //   586: aload           6
        //   588: if_acmpne       184
        //   591: aload           6
        //   593: areturn        
        //   594: aload           7
        //   596: athrow         
        //   597: getstatic       pg2/j.a:Lpg2/j;
        //   600: areturn        
        //    Signature:
        //  (Lz1/v;Lzg2/p<-Lz1/v;-Ltg2/c<-Lpg2/j;>;*>;Ltg2/c<-Lpg2/j;>;)Ljava/lang/Object; [from metadata: (Lz1/v;Lzg2/p<-Lz1/v;-Ltg2/c<-Lpg2/j;>;+Ljava/lang/Object;>;Ltg2/c<-Lpg2/j;>;)Ljava/lang/Object;]
        //  
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  170    175    499    514    Ljava/util/concurrent/CancellationException;
        //  226    231    499    514    Ljava/util/concurrent/CancellationException;
        //  253    283    514    519    Ljava/util/concurrent/CancellationException;
        //  314    320    499    514    Ljava/util/concurrent/CancellationException;
        //  332    338    499    514    Ljava/util/concurrent/CancellationException;
        //  350    356    499    514    Ljava/util/concurrent/CancellationException;
        //  368    373    499    514    Ljava/util/concurrent/CancellationException;
        //  385    390    499    514    Ljava/util/concurrent/CancellationException;
        //  402    408    499    514    Ljava/util/concurrent/CancellationException;
        //  420    432    499    514    Ljava/util/concurrent/CancellationException;
        //  444    452    499    514    Ljava/util/concurrent/CancellationException;
        //  471    476    499    514    Ljava/util/concurrent/CancellationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0293:
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
