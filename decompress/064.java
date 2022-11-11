// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Bundle;
import android.content.res.Configuration;
import java.util.List;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.app.Activity;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import android.os.Handler;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public final class 064
{
    public static final Class<?> LIZ;
    public static final Field LIZIZ;
    public static final Field LIZJ;
    public static final Method LIZLLL;
    public static final Method LJ;
    public static final Method LJFF;
    public static final Handler LJI;
    
    static {
        Covode.recordClassIndex(687);
        LJI = new Handler(Looper.getMainLooper());
        final Class<?> clazz = LIZ = LIZLLL();
        LIZIZ = LIZIZ();
        LIZJ = LIZJ();
        LIZLLL = LIZ(clazz);
        LJ = LIZIZ(clazz);
        LJFF = LIZJ(clazz);
    }
    
    public static Method LIZ(final Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        try {
            final Method declaredMethod = clazz.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        }
        finally {
            return null;
        }
    }
    
    public static boolean LIZ() {
        return Build$VERSION.SDK_INT == 26 || Build$VERSION.SDK_INT == 27;
    }
    
    public static boolean LIZ(final Activity activity) {
        public final class 061 implements Runnable
        {
            public final /* synthetic */ Application LIZ;
            public final /* synthetic */ a LIZIZ;
            
            static {
                Covode.recordClassIndex(689);
            }
            
            public 061(final Application liz, final a liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                this.LIZ.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.LIZIZ);
            }
        }
        public final class 060 implements Runnable
        {
            public final /* synthetic */ a LIZ;
            public final /* synthetic */ Object LIZIZ;
            
            static {
                Covode.recordClassIndex(688);
            }
            
            public 060(final a liz, final Object liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                this.LIZ.LIZ = this.LIZIZ;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          28
        //     5: if_icmplt       14
        //     8: aload_0        
        //     9: invokevirtual   android/app/Activity.recreate:()V
        //    12: iconst_1       
        //    13: ireturn        
        //    14: invokestatic    X/064.LIZ:()Z
        //    17: ifeq            28
        //    20: getstatic       X/064.LJFF:Ljava/lang/reflect/Method;
        //    23: ifnonnull       28
        //    26: iconst_0       
        //    27: ireturn        
        //    28: getstatic       X/064.LJ:Ljava/lang/reflect/Method;
        //    31: ifnonnull       42
        //    34: getstatic       X/064.LIZLLL:Ljava/lang/reflect/Method;
        //    37: ifnonnull       42
        //    40: iconst_0       
        //    41: ireturn        
        //    42: getstatic       X/064.LIZJ:Ljava/lang/reflect/Field;
        //    45: aload_0        
        //    46: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    49: astore_1       
        //    50: aload_1        
        //    51: ifnonnull       56
        //    54: iconst_0       
        //    55: ireturn        
        //    56: getstatic       X/064.LIZIZ:Ljava/lang/reflect/Field;
        //    59: aload_0        
        //    60: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    63: astore_2       
        //    64: aload_2        
        //    65: ifnonnull       70
        //    68: iconst_0       
        //    69: ireturn        
        //    70: aload_0        
        //    71: invokevirtual   android/app/Activity.getApplication:()Landroid/app/Application;
        //    74: astore_3       
        //    75: new             LX/063;
        //    78: astore          4
        //    80: aload           4
        //    82: aload_0        
        //    83: invokespecial   X/063.<init>:(Landroid/app/Activity;)V
        //    86: aload_3        
        //    87: aload           4
        //    89: invokevirtual   android/app/Application.registerActivityLifecycleCallbacks:(Landroid/app/Application$ActivityLifecycleCallbacks;)V
        //    92: getstatic       X/064.LJI:Landroid/os/Handler;
        //    95: astore          5
        //    97: new             LX/060;
        //   100: astore          6
        //   102: aload           6
        //   104: aload           4
        //   106: aload_1        
        //   107: invokespecial   X/060.<init>:(LX/063;Ljava/lang/Object;)V
        //   110: aload           5
        //   112: aload           6
        //   114: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   117: pop            
        //   118: invokestatic    X/064.LIZ:()Z
        //   121: ifeq            191
        //   124: getstatic       X/064.LJFF:Ljava/lang/reflect/Method;
        //   127: aload_2        
        //   128: bipush          9
        //   130: anewarray       Ljava/lang/Object;
        //   133: dup            
        //   134: iconst_0       
        //   135: aload_1        
        //   136: aastore        
        //   137: dup            
        //   138: iconst_1       
        //   139: aconst_null    
        //   140: aastore        
        //   141: dup            
        //   142: iconst_2       
        //   143: aconst_null    
        //   144: aastore        
        //   145: dup            
        //   146: iconst_3       
        //   147: iconst_0       
        //   148: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   151: aastore        
        //   152: dup            
        //   153: iconst_4       
        //   154: iconst_0       
        //   155: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   158: aastore        
        //   159: dup            
        //   160: iconst_5       
        //   161: aconst_null    
        //   162: aastore        
        //   163: dup            
        //   164: bipush          6
        //   166: aconst_null    
        //   167: aastore        
        //   168: dup            
        //   169: bipush          7
        //   171: iconst_0       
        //   172: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   175: aastore        
        //   176: dup            
        //   177: bipush          8
        //   179: iconst_0       
        //   180: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   183: aastore        
        //   184: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   187: pop            
        //   188: goto            195
        //   191: aload_0        
        //   192: invokevirtual   android/app/Activity.recreate:()V
        //   195: new             LX/061;
        //   198: astore_0       
        //   199: aload_0        
        //   200: aload_3        
        //   201: aload           4
        //   203: invokespecial   X/061.<init>:(Landroid/app/Application;LX/063;)V
        //   206: aload           5
        //   208: aload_0        
        //   209: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   212: pop            
        //   213: iconst_1       
        //   214: ireturn        
        //   215: astore_1       
        //   216: getstatic       X/064.LJI:Landroid/os/Handler;
        //   219: astore          5
        //   221: new             LX/061;
        //   224: astore_0       
        //   225: aload_0        
        //   226: aload_3        
        //   227: aload           4
        //   229: invokespecial   X/061.<init>:(Landroid/app/Application;LX/063;)V
        //   232: aload           5
        //   234: aload_0        
        //   235: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   238: pop            
        //   239: aload_1        
        //   240: athrow         
        //   241: astore_0       
        //   242: iconst_0       
        //   243: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  42     50     241    244    Any
        //  56     64     241    244    Any
        //  70     118    241    244    Any
        //  118    188    215    241    Any
        //  191    195    215    241    Any
        //  195    213    241    244    Any
        //  216    241    241    244    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    public static boolean LIZ(final Object o, final int n, final Activity activity) {
        public final class 062 implements Runnable
        {
            public final /* synthetic */ Object LIZ;
            public final /* synthetic */ Object LIZIZ;
            
            static {
                Covode.recordClassIndex(690);
            }
            
            public 062(final Object liz, final Object liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                try {
                    if (064.LIZLLL != null) {
                        064.LIZLLL.invoke(this.LIZ, this.LIZIZ, false, "AppCompat recreation");
                        return;
                    }
                    064.LJ.invoke(this.LIZ, this.LIZIZ, false);
                }
                catch (final RuntimeException ex) {
                    if (ex.getClass() != RuntimeException.class || ex.getMessage() == null || !ex.getMessage().startsWith("Unable to stop")) {
                        return;
                    }
                    throw ex;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_2        
        //     4: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //     7: astore_3       
        //     8: aload_3        
        //     9: aload_0        
        //    10: if_acmpne       57
        //    13: aload_2        
        //    14: invokevirtual   java/lang/Object.hashCode:()I
        //    17: iload_1        
        //    18: if_icmpeq       24
        //    21: goto            57
        //    24: getstatic       X/064.LIZIZ:Ljava/lang/reflect/Field;
        //    27: aload_2        
        //    28: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    31: astore_2       
        //    32: getstatic       X/064.LJI:Landroid/os/Handler;
        //    35: astore_0       
        //    36: new             LX/062;
        //    39: astore          4
        //    41: aload           4
        //    43: aload_2        
        //    44: aload_3        
        //    45: invokespecial   X/062.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    48: aload_0        
        //    49: aload           4
        //    51: invokevirtual   android/os/Handler.postAtFrontOfQueue:(Ljava/lang/Runnable;)Z
        //    54: pop            
        //    55: iconst_1       
        //    56: ireturn        
        //    57: iconst_0       
        //    58: ireturn        
        //    59: astore_0       
        //    60: goto            57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      8      59     63     Any
        //  13     21     59     63     Any
        //  24     55     59     63     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    public static Field LIZIZ() {
        try {
            final Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        }
        finally {
            return null;
        }
    }
    
    public static Method LIZIZ(final Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        try {
            final Method declaredMethod = clazz.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        }
        finally {
            return null;
        }
    }
    
    public static Field LIZJ() {
        try {
            final Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        }
        finally {
            return null;
        }
    }
    
    public static Method LIZJ(final Class<?> clazz) {
        if (LIZ() && clazz != null) {
            try {
                final Method declaredMethod = clazz.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            }
            finally {}
        }
        return null;
    }
    
    public static Class<?> LIZLLL() {
        try {
            return Class.forName("android.app.ActivityThread");
        }
        finally {
            return null;
        }
    }
    
    public static final class a implements Application$ActivityLifecycleCallbacks
    {
        public Object LIZ;
        public Activity LIZIZ;
        public final int LIZJ;
        public boolean LIZLLL;
        public boolean LJ;
        public boolean LJFF;
        
        static {
            Covode.recordClassIndex(691);
        }
        
        public a(final Activity liziz) {
            this.LIZIZ = liziz;
            this.LIZJ = liziz.hashCode();
        }
        
        public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        }
        
        public final void onActivityDestroyed(final Activity activity) {
            if (this.LIZIZ == activity) {
                this.LIZIZ = null;
                this.LJ = true;
            }
        }
        
        public final void onActivityPaused(final Activity activity) {
            if (this.LJ && !this.LJFF && !this.LIZLLL && 064.LIZ(this.LIZ, this.LIZJ, activity)) {
                this.LJFF = true;
                this.LIZ = null;
            }
        }
        
        public final void onActivityResumed(final Activity activity) {
        }
        
        public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        public final void onActivityStarted(final Activity activity) {
            if (this.LIZIZ == activity) {
                this.LIZLLL = true;
            }
        }
        
        public final void onActivityStopped(final Activity activity) {
        }
    }
}
