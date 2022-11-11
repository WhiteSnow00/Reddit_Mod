// 
// Decompiled by Procyon v0.6.0
// 

package m3;

import android.util.Log;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Handler;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public final class f
{
    public static final Class<?> a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //     7: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    10: putstatic       m3/f.g:Landroid/os/Handler;
        //    13: aconst_null    
        //    14: astore_0       
        //    15: ldc             "android.app.ActivityThread"
        //    17: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    20: astore_1       
        //    21: goto            27
        //    24: astore_1       
        //    25: aconst_null    
        //    26: astore_1       
        //    27: aload_1        
        //    28: putstatic       m3/f.a:Ljava/lang/Class;
        //    31: ldc             Landroid/app/Activity;.class
        //    33: ldc             "mMainThread"
        //    35: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    38: astore_1       
        //    39: aload_1        
        //    40: iconst_1       
        //    41: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    44: goto            50
        //    47: astore_1       
        //    48: aconst_null    
        //    49: astore_1       
        //    50: aload_1        
        //    51: putstatic       m3/f.b:Ljava/lang/reflect/Field;
        //    54: ldc             Landroid/app/Activity;.class
        //    56: ldc             "mToken"
        //    58: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    61: astore_1       
        //    62: aload_1        
        //    63: iconst_1       
        //    64: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    67: goto            73
        //    70: astore_1       
        //    71: aconst_null    
        //    72: astore_1       
        //    73: aload_1        
        //    74: putstatic       m3/f.c:Ljava/lang/reflect/Field;
        //    77: getstatic       m3/f.a:Ljava/lang/Class;
        //    80: astore_1       
        //    81: aload_1        
        //    82: ifnonnull       88
        //    85: goto            123
        //    88: aload_1        
        //    89: ldc             "performStopActivity"
        //    91: iconst_3       
        //    92: anewarray       Ljava/lang/Class;
        //    95: dup            
        //    96: iconst_0       
        //    97: ldc             Landroid/os/IBinder;.class
        //    99: aastore        
        //   100: dup            
        //   101: iconst_1       
        //   102: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   105: aastore        
        //   106: dup            
        //   107: iconst_2       
        //   108: ldc             Ljava/lang/String;.class
        //   110: aastore        
        //   111: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   114: astore_1       
        //   115: aload_1        
        //   116: iconst_1       
        //   117: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   120: goto            125
        //   123: aconst_null    
        //   124: astore_1       
        //   125: aload_1        
        //   126: putstatic       m3/f.d:Ljava/lang/reflect/Method;
        //   129: getstatic       m3/f.a:Ljava/lang/Class;
        //   132: astore_1       
        //   133: aload_1        
        //   134: ifnonnull       140
        //   137: goto            170
        //   140: aload_1        
        //   141: ldc             "performStopActivity"
        //   143: iconst_2       
        //   144: anewarray       Ljava/lang/Class;
        //   147: dup            
        //   148: iconst_0       
        //   149: ldc             Landroid/os/IBinder;.class
        //   151: aastore        
        //   152: dup            
        //   153: iconst_1       
        //   154: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   157: aastore        
        //   158: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   161: astore_1       
        //   162: aload_1        
        //   163: iconst_1       
        //   164: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   167: goto            172
        //   170: aconst_null    
        //   171: astore_1       
        //   172: aload_1        
        //   173: putstatic       m3/f.e:Ljava/lang/reflect/Method;
        //   176: getstatic       m3/f.a:Ljava/lang/Class;
        //   179: astore_2       
        //   180: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   183: istore_3       
        //   184: iload_3        
        //   185: bipush          26
        //   187: if_icmpeq       204
        //   190: iload_3        
        //   191: bipush          27
        //   193: if_icmpne       199
        //   196: goto            204
        //   199: iconst_0       
        //   200: istore_3       
        //   201: goto            206
        //   204: iconst_1       
        //   205: istore_3       
        //   206: aload_0        
        //   207: astore_1       
        //   208: iload_3        
        //   209: ifeq            294
        //   212: aload_2        
        //   213: ifnonnull       221
        //   216: aload_0        
        //   217: astore_1       
        //   218: goto            294
        //   221: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   224: astore_1       
        //   225: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   228: astore          4
        //   230: aload_2        
        //   231: ldc             "requestRelaunchActivity"
        //   233: bipush          9
        //   235: anewarray       Ljava/lang/Class;
        //   238: dup            
        //   239: iconst_0       
        //   240: ldc             Landroid/os/IBinder;.class
        //   242: aastore        
        //   243: dup            
        //   244: iconst_1       
        //   245: ldc             Ljava/util/List;.class
        //   247: aastore        
        //   248: dup            
        //   249: iconst_2       
        //   250: ldc             Ljava/util/List;.class
        //   252: aastore        
        //   253: dup            
        //   254: iconst_3       
        //   255: aload_1        
        //   256: aastore        
        //   257: dup            
        //   258: iconst_4       
        //   259: aload           4
        //   261: aastore        
        //   262: dup            
        //   263: iconst_5       
        //   264: ldc             Landroid/content/res/Configuration;.class
        //   266: aastore        
        //   267: dup            
        //   268: bipush          6
        //   270: ldc             Landroid/content/res/Configuration;.class
        //   272: aastore        
        //   273: dup            
        //   274: bipush          7
        //   276: aload           4
        //   278: aastore        
        //   279: dup            
        //   280: bipush          8
        //   282: aload           4
        //   284: aastore        
        //   285: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   288: astore_1       
        //   289: aload_1        
        //   290: iconst_1       
        //   291: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   294: aload_1        
        //   295: putstatic       m3/f.f:Ljava/lang/reflect/Method;
        //   298: return         
        //   299: astore_1       
        //   300: goto            123
        //   303: astore_1       
        //   304: goto            170
        //   307: astore_1       
        //   308: aload_0        
        //   309: astore_1       
        //   310: goto            294
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  15     21     24     27     Any
        //  31     44     47     50     Any
        //  54     67     70     73     Any
        //  88     120    299    303    Any
        //  140    167    303    307    Any
        //  221    294    307    313    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 185, Size: 185
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public static final class a implements Application$ActivityLifecycleCallbacks
    {
        public Object f;
        public Activity g;
        public final int h;
        public boolean i;
        public boolean j;
        public boolean k;
        
        public a(final Activity g) {
            this.i = false;
            this.j = false;
            this.k = false;
            this.g = g;
            this.h = g.hashCode();
        }
        
        public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        }
        
        public final void onActivityDestroyed(final Activity activity) {
            if (this.g == activity) {
                this.g = null;
                this.j = true;
            }
        }
        
        public final void onActivityPaused(final Activity activity) {
            if (this.j && !this.k && !this.i) {
                final Object f = this.f;
                final int h = this.h;
                final int n = 0;
                int n2 = 0;
                try {
                    final Object value = m3.f.c.get(activity);
                    if (value == f) {
                        if (activity.hashCode() == h) {
                            m3.f.g.postAtFrontOfQueue((Runnable)new e(m3.f.b.get(activity), value));
                        }
                    }
                }
                finally {
                    final Throwable t;
                    Log.e("ActivityRecreator", "Exception while fetching field values", t);
                    n2 = n;
                }
                if (n2 != 0) {
                    this.k = true;
                    this.f = null;
                }
            }
        }
        
        public final void onActivityResumed(final Activity activity) {
        }
        
        public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        public final void onActivityStarted(final Activity activity) {
            if (this.g == activity) {
                this.i = true;
            }
        }
        
        public final void onActivityStopped(final Activity activity) {
        }
    }
}
