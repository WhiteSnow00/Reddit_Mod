// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import java.lang.reflect.AccessibleObject;
import X.0CC;
import X.0CH;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import android.app.Activity;
import java.lang.reflect.Field;
import X.15t;

public final class ImmLeaksCleaner implements 15t
{
    public static int LIZ;
    public static Field LIZIZ;
    public static Field LIZJ;
    public static Field LIZLLL;
    public Activity LJ;
    
    static {
        Covode.recordClassIndex(204);
    }
    
    public ImmLeaksCleaner(final Activity lj) {
        this.LJ = lj;
    }
    
    public static Object LIZ(Activity activity, String declaredField) {
        Label_0158: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                if (!2JT.LIZ) {
                    break Label_0158;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = activity.getSystemService((String)declaredField);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                            ((AccessibleObject)declaredField).setAccessible(true);
                            ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                        }
                        catch (final Exception declaredField) {
                            6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return activity;
                }
            }
            Label_0149: {
                if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                    break Label_0149;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    activity = (Activity)activity.getSystemService((String)declaredField);
                    return activity;
                    activity = (Activity)activity.getSystemService((String)declaredField);
                    return activity;
                    activity = (Activity)activity.getSystemService((String)declaredField);
                    return activity;
                }
                finally {
                    return activity.getSystemService((String)declaredField);
                }
            }
        }
    }
    
    @Override
    public final void onStateChanged(final 0CH p0, final 0CC.a p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       X/0CA.ON_DESTROY:LX/0CA;
        //     4: if_acmpeq       8
        //     7: return         
        //     8: getstatic       androidx/activity/ImmLeaksCleaner.LIZ:I
        //    11: ifne            73
        //    14: iconst_2       
        //    15: putstatic       androidx/activity/ImmLeaksCleaner.LIZ:I
        //    18: ldc             Landroid/view/inputmethod/InputMethodManager;.class
        //    20: ldc             "mServedView"
        //    22: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    25: astore_1       
        //    26: aload_1        
        //    27: putstatic       androidx/activity/ImmLeaksCleaner.LIZJ:Ljava/lang/reflect/Field;
        //    30: aload_1        
        //    31: iconst_1       
        //    32: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    35: ldc             Landroid/view/inputmethod/InputMethodManager;.class
        //    37: ldc             "mNextServedView"
        //    39: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    42: astore_1       
        //    43: aload_1        
        //    44: putstatic       androidx/activity/ImmLeaksCleaner.LIZLLL:Ljava/lang/reflect/Field;
        //    47: aload_1        
        //    48: iconst_1       
        //    49: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    52: ldc             Landroid/view/inputmethod/InputMethodManager;.class
        //    54: ldc             "mH"
        //    56: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    59: astore_1       
        //    60: aload_1        
        //    61: putstatic       androidx/activity/ImmLeaksCleaner.LIZIZ:Ljava/lang/reflect/Field;
        //    64: aload_1        
        //    65: iconst_1       
        //    66: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    69: iconst_1       
        //    70: putstatic       androidx/activity/ImmLeaksCleaner.LIZ:I
        //    73: getstatic       androidx/activity/ImmLeaksCleaner.LIZ:I
        //    76: iconst_1       
        //    77: if_icmpne       174
        //    80: aload_0        
        //    81: getfield        androidx/activity/ImmLeaksCleaner.LJ:Landroid/app/Activity;
        //    84: ldc             "input_method"
        //    86: invokestatic    androidx/activity/ImmLeaksCleaner.LIZ:(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/Object;
        //    89: checkcast       Landroid/view/inputmethod/InputMethodManager;
        //    92: astore_2       
        //    93: getstatic       androidx/activity/ImmLeaksCleaner.LIZIZ:Ljava/lang/reflect/Field;
        //    96: aload_2        
        //    97: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   100: astore_1       
        //   101: aload_1        
        //   102: ifnonnull       106
        //   105: return         
        //   106: aload_1        
        //   107: monitorenter   
        //   108: getstatic       androidx/activity/ImmLeaksCleaner.LIZJ:Ljava/lang/reflect/Field;
        //   111: aload_2        
        //   112: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   115: checkcast       Landroid/view/View;
        //   118: astore_3       
        //   119: aload_3        
        //   120: ifnonnull       126
        //   123: aload_1        
        //   124: monitorexit    
        //   125: return         
        //   126: aload_3        
        //   127: invokevirtual   android/view/View.isAttachedToWindow:()Z
        //   130: ifeq            136
        //   133: aload_1        
        //   134: monitorexit    
        //   135: return         
        //   136: getstatic       androidx/activity/ImmLeaksCleaner.LIZLLL:Ljava/lang/reflect/Field;
        //   139: aload_2        
        //   140: aconst_null    
        //   141: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   144: goto            167
        //   147: astore_2       
        //   148: aload_1        
        //   149: monitorexit    
        //   150: return         
        //   151: astore_2       
        //   152: aload_1        
        //   153: monitorexit    
        //   154: return         
        //   155: astore_2       
        //   156: aload_1        
        //   157: monitorexit    
        //   158: goto            166
        //   161: astore_2       
        //   162: aload_1        
        //   163: monitorexit    
        //   164: aload_2        
        //   165: athrow         
        //   166: return         
        //   167: aload_1        
        //   168: monitorexit    
        //   169: aload_2        
        //   170: invokevirtual   android/view/inputmethod/InputMethodManager.isActive:()Z
        //   173: pop            
        //   174: return         
        //   175: astore_1       
        //   176: goto            73
        //   179: astore_1       
        //   180: goto            174
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  14     73     175    179    Ljava/lang/NoSuchFieldException;
        //  93     101    179    183    Ljava/lang/IllegalAccessException;
        //  108    119    155    161    Ljava/lang/IllegalAccessException;
        //  108    119    151    155    Ljava/lang/ClassCastException;
        //  108    119    161    166    Any
        //  126    135    161    166    Any
        //  136    144    147    151    Ljava/lang/IllegalAccessException;
        //  136    144    161    166    Any
        //  148    150    161    166    Any
        //  156    158    161    166    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0106:
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
