// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.os.Bundle;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 11c
{
    public static boolean LIZ;
    public static final Object LIZIZ;
    public static List<String> LIZJ;
    
    static {
        Covode.recordClassIndex(33130);
        LIZIZ = new Object();
        11c.LIZJ = new ArrayList<String>();
    }
    
    public static void LIZ(final int p0, final Activity p1) {
        public final class 11a implements Runnable
        {
            static {
                Covode.recordClassIndex(33131);
            }
            
            @Override
            public final void run() {
                CMv.LIZ();
            }
        }
        public final class 11b implements Application$ActivityLifecycleCallbacks
        {
            static {
                Covode.recordClassIndex(33132);
            }
            
            public final void onActivityCreated(final Activity activity, final Bundle bundle) {
            }
            
            public final void onActivityDestroyed(final Activity activity) {
            }
            
            public final void onActivityPaused(final Activity activity) {
                MethodCollector.i(4655);
                if (11c.LIZ(activity.getComponentName().getClassName())) {
                    final Object liziz = 11c.LIZIZ;
                    monitorenter(liziz);
                    try {
                        if (!11c.LIZ) {
                            return;
                        }
                        11d.LIZIZ = true;
                        return;
                    }
                    finally {
                        monitorexit(liziz);
                        MethodCollector.o(4655);
                    }
                }
                MethodCollector.o(4655);
            }
            
            public final void onActivityResumed(Activity liziz) {
                MethodCollector.i(4649);
                if (11c.LIZ(liziz.getComponentName().getClassName())) {
                    liziz = (Activity)11c.LIZIZ;
                    monitorenter(liziz);
                    try {
                        if (!11c.LIZ) {
                            return;
                        }
                        11d.LIZIZ = false;
                        return;
                    }
                    finally {
                        monitorexit(liziz);
                        MethodCollector.o(4649);
                    }
                }
                MethodCollector.o(4649);
            }
            
            public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
            }
            
            public final void onActivityStarted(final Activity activity) {
            }
            
            public final void onActivityStopped(final Activity activity) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: getstatic       X/11c.LIZIZ:Ljava/lang/Object;
        //     9: astore_2       
        //    10: aload_2        
        //    11: monitorenter   
        //    12: getstatic       X/11c.LIZ:Z
        //    15: ifeq            34
        //    18: iconst_1       
        //    19: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    22: putstatic       X/11d.LIZIZ:Ljava/lang/Boolean;
        //    25: aload_2        
        //    26: monitorexit    
        //    27: sipush          5694
        //    30: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    33: return         
        //    34: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    37: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //    40: if_acmpeq       82
        //    43: new             Landroid/os/Handler;
        //    46: astore_3       
        //    47: aload_3        
        //    48: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    51: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    54: new             LX/11a;
        //    57: astore          4
        //    59: aload           4
        //    61: invokespecial   X/11a.<init>:()V
        //    64: aload_3        
        //    65: aload           4
        //    67: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    70: pop            
        //    71: iconst_1       
        //    72: putstatic       X/11c.LIZ:Z
        //    75: iload_0        
        //    76: putstatic       X/11d.LIZJ:I
        //    79: goto            88
        //    82: invokestatic    X/CMv.LIZ:()V
        //    85: goto            71
        //    88: iconst_0       
        //    89: istore          5
        //    91: iload_0        
        //    92: bipush          50
        //    94: if_icmpge       113
        //    97: bipush          100
        //    99: getstatic       X/11d.LIZJ:I
        //   102: idiv           
        //   103: putstatic       X/11d.LIZLLL:I
        //   106: iconst_0       
        //   107: putstatic       X/11d.LJFF:Z
        //   110: goto            129
        //   113: bipush          100
        //   115: bipush          100
        //   117: getstatic       X/11d.LIZJ:I
        //   120: isub           
        //   121: idiv           
        //   122: putstatic       X/11d.LIZLLL:I
        //   125: iconst_1       
        //   126: putstatic       X/11d.LJFF:Z
        //   129: getstatic       X/11d.LIZLLL:I
        //   132: iconst_2       
        //   133: irem           
        //   134: iconst_1       
        //   135: if_icmpne       141
        //   138: iconst_1       
        //   139: istore          5
        //   141: iload           5
        //   143: putstatic       X/11d.LJ:Z
        //   146: iconst_1       
        //   147: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   150: putstatic       X/11d.LIZIZ:Ljava/lang/Boolean;
        //   153: aload_1        
        //   154: invokevirtual   android/app/Activity.getApplication:()Landroid/app/Application;
        //   157: astore_1       
        //   158: new             LX/11b;
        //   161: astore          4
        //   163: aload           4
        //   165: invokespecial   X/11b.<init>:()V
        //   168: aload_1        
        //   169: aload           4
        //   171: invokevirtual   android/app/Application.registerActivityLifecycleCallbacks:(Landroid/app/Application$ActivityLifecycleCallbacks;)V
        //   174: aload_2        
        //   175: monitorexit    
        //   176: sipush          5694
        //   179: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   182: return         
        //   183: astore_1       
        //   184: aload_2        
        //   185: monitorexit    
        //   186: sipush          5694
        //   189: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   192: aload_1        
        //   193: athrow         
        //   194: astore_1       
        //   195: goto            174
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  12     27     183    194    Any
        //  34     71     194    198    Ljava/lang/Exception;
        //  34     71     183    194    Any
        //  71     79     194    198    Ljava/lang/Exception;
        //  71     79     183    194    Any
        //  82     85     194    198    Ljava/lang/Exception;
        //  82     85     183    194    Any
        //  97     110    194    198    Ljava/lang/Exception;
        //  97     110    183    194    Any
        //  113    129    194    198    Ljava/lang/Exception;
        //  113    129    183    194    Any
        //  129    138    194    198    Ljava/lang/Exception;
        //  129    138    183    194    Any
        //  141    174    194    198    Ljava/lang/Exception;
        //  141    174    183    194    Any
        //  174    176    183    194    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
    
    public static boolean LIZ(final String s) {
        final List<String> lizj = 11c.LIZJ;
        return lizj != null && lizj.size() != 0 && !TextUtils.isEmpty((CharSequence)s) && 11c.LIZJ.contains(s);
    }
}
