// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.q;
import ej2.f;
import android.view.View;
import kotlin.jvm.internal.Ref$ObjectRef;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import zi2.c0;
import kotlin.Metadata;
import androidx.lifecycle.o;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2", "Landroidx/lifecycle/o;", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements o
{
    public final c0 f;
    public final PausableMonotonicFrameClock g;
    public final Recomposer h;
    public final Ref$ObjectRef<r0> i;
    public final View j;
    
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(final f f, final PausableMonotonicFrameClock g, final Recomposer h, final Ref$ObjectRef i, final View j) {
        this.f = (c0)f;
        this.g = g;
        this.h = h;
        this.i = (Ref$ObjectRef<r0>)i;
        this.j = j;
    }
    
    public final void f(final q p0, final Lifecycle$Event p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_2        
        //     4: invokevirtual   java/lang/Enum.ordinal:()I
        //     7: iaload         
        //     8: istore          4
        //    10: iload           4
        //    12: iconst_1       
        //    13: if_icmpeq       236
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload           4
        //    20: iconst_2       
        //    21: if_icmpeq       89
        //    24: iload           4
        //    26: iconst_3       
        //    27: if_icmpeq       49
        //    30: iload           4
        //    32: iconst_4       
        //    33: if_icmpeq       39
        //    36: goto            271
        //    39: aload_0        
        //    40: getfield        androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.h:Landroidx/compose/runtime/Recomposer;
        //    43: invokevirtual   androidx/compose/runtime/Recomposer.t:()V
        //    46: goto            271
        //    49: aload_0        
        //    50: getfield        androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.g:Landroidx/compose/runtime/PausableMonotonicFrameClock;
        //    53: astore_1       
        //    54: aload_1        
        //    55: ifnull          271
        //    58: aload_1        
        //    59: getfield        androidx/compose/runtime/PausableMonotonicFrameClock.g:Lz0/z;
        //    62: astore_2       
        //    63: aload_2        
        //    64: getfield        z0/z.a:Ljava/lang/Object;
        //    67: astore_1       
        //    68: aload_1        
        //    69: monitorenter   
        //    70: aload_2        
        //    71: iconst_0       
        //    72: putfield        z0/z.d:Z
        //    75: getstatic       cg2/j.a:Lcg2/j;
        //    78: astore_2       
        //    79: aload_1        
        //    80: monitorexit    
        //    81: goto            271
        //    84: astore_2       
        //    85: aload_1        
        //    86: monitorexit    
        //    87: aload_2        
        //    88: athrow         
        //    89: aload_0        
        //    90: getfield        androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.g:Landroidx/compose/runtime/PausableMonotonicFrameClock;
        //    93: astore_1       
        //    94: aload_1        
        //    95: ifnull          271
        //    98: aload_1        
        //    99: getfield        androidx/compose/runtime/PausableMonotonicFrameClock.g:Lz0/z;
        //   102: astore_2       
        //   103: aload_2        
        //   104: getfield        z0/z.a:Ljava/lang/Object;
        //   107: astore_1       
        //   108: aload_1        
        //   109: monitorenter   
        //   110: aload_2        
        //   111: getfield        z0/z.a:Ljava/lang/Object;
        //   114: astore          6
        //   116: aload           6
        //   118: monitorenter   
        //   119: aload_2        
        //   120: getfield        z0/z.d:Z
        //   123: istore          5
        //   125: aload           6
        //   127: monitorexit    
        //   128: iload           5
        //   130: ifeq            138
        //   133: aload_1        
        //   134: monitorexit    
        //   135: goto            271
        //   138: aload_2        
        //   139: getfield        z0/z.b:Ljava/util/List;
        //   142: astore          6
        //   144: aload_2        
        //   145: aload_2        
        //   146: getfield        z0/z.c:Ljava/util/List;
        //   149: putfield        z0/z.b:Ljava/util/List;
        //   152: aload_2        
        //   153: aload           6
        //   155: putfield        z0/z.c:Ljava/util/List;
        //   158: aload_2        
        //   159: iconst_1       
        //   160: putfield        z0/z.d:Z
        //   163: aload           6
        //   165: invokeinterface java/util/List.size:()I
        //   170: istore          4
        //   172: iload_3        
        //   173: iload           4
        //   175: if_icmpge       206
        //   178: aload           6
        //   180: iload_3        
        //   181: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   186: checkcast       Lgg2/c;
        //   189: getstatic       cg2/j.a:Lcg2/j;
        //   192: invokestatic    kotlin/Result.constructor-impl:(Ljava/lang/Object;)Ljava/lang/Object;
        //   195: invokeinterface gg2/c.resumeWith:(Ljava/lang/Object;)V
        //   200: iinc            3, 1
        //   203: goto            172
        //   206: aload           6
        //   208: invokeinterface java/util/List.clear:()V
        //   213: getstatic       cg2/j.a:Lcg2/j;
        //   216: astore_2       
        //   217: aload_1        
        //   218: monitorexit    
        //   219: goto            271
        //   222: astore_2       
        //   223: goto            232
        //   226: astore_2       
        //   227: aload           6
        //   229: monitorexit    
        //   230: aload_2        
        //   231: athrow         
        //   232: aload_1        
        //   233: monitorexit    
        //   234: aload_2        
        //   235: athrow         
        //   236: aload_0        
        //   237: getfield        androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.f:Lzi2/c0;
        //   240: aconst_null    
        //   241: getstatic       kotlinx/coroutines/CoroutineStart.UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;
        //   244: new             Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
        //   247: dup            
        //   248: aload_0        
        //   249: getfield        androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.i:Lkotlin/jvm/internal/Ref$ObjectRef;
        //   252: aload_0        
        //   253: getfield        androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.h:Landroidx/compose/runtime/Recomposer;
        //   256: aload_1        
        //   257: aload_0        
        //   258: aload_0        
        //   259: getfield        androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.j:Landroid/view/View;
        //   262: aconst_null    
        //   263: invokespecial   androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/Recomposer;Landroidx/lifecycle/q;Landroidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;Landroid/view/View;Lgg2/c;)V
        //   266: iconst_1       
        //   267: invokestatic    zi2/g.g:(Lzi2/c0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lmg2/p;I)Lzi2/q1;
        //   270: pop            
        //   271: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  70     79     84     89     Any
        //  110    119    222    226    Any
        //  119    125    226    232    Any
        //  125    128    222    226    Any
        //  138    172    222    226    Any
        //  178    200    222    226    Any
        //  206    217    222    226    Any
        //  227    232    222    226    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0138:
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
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[Lifecycle$Event.values().length];
            a2[((Enum)Lifecycle$Event.ON_CREATE).ordinal()] = 1;
            a2[((Enum)Lifecycle$Event.ON_START).ordinal()] = 2;
            a2[((Enum)Lifecycle$Event.ON_STOP).ordinal()] = 3;
            a2[((Enum)Lifecycle$Event.ON_DESTROY).ordinal()] = 4;
            a2[((Enum)Lifecycle$Event.ON_PAUSE).ordinal()] = 5;
            a2[((Enum)Lifecycle$Event.ON_RESUME).ordinal()] = 6;
            a2[((Enum)Lifecycle$Event.ON_ANY).ordinal()] = 7;
            a = a2;
        }
    }
}
