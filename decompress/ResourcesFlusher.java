// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.os.Build$VERSION;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public class ResourcesFlusher
{
    public static Field sDrawableCacheField;
    public static boolean sDrawableCacheFieldFetched;
    public static Field sResourcesImplField;
    public static boolean sResourcesImplFieldFetched;
    public static Class<?> sThemedResourceCacheClazz;
    public static boolean sThemedResourceCacheClazzFetched;
    public static Field sThemedResourceCache_mUnthemedEntriesField;
    public static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;
    
    static {
        Covode.recordClassIndex(254);
    }
    
    public static void flush(final Resources resources) {
        if (Build$VERSION.SDK_INT >= 28) {
            return;
        }
        if (Build$VERSION.SDK_INT >= 24) {
            flushNougats(resources);
            return;
        }
        if (Build$VERSION.SDK_INT >= 23) {
            flushMarshmallows(resources);
            return;
        }
        flushLollipops(resources);
    }
    
    public static void flushLollipops(final Resources p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            27
        //     6: ldc             Landroid/content/res/Resources;.class
        //     8: ldc             "mDrawableCache"
        //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    13: astore_1       
        //    14: aload_1        
        //    15: putstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheField:Ljava/lang/reflect/Field;
        //    18: aload_1        
        //    19: iconst_1       
        //    20: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    23: iconst_1       
        //    24: putstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheFieldFetched:Z
        //    27: getstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheField:Ljava/lang/reflect/Field;
        //    30: astore_2       
        //    31: aload_2        
        //    32: ifnull          56
        //    35: aconst_null    
        //    36: astore_1       
        //    37: aload_2        
        //    38: aload_0        
        //    39: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    42: checkcast       Ljava/util/Map;
        //    45: astore_0       
        //    46: aload_0        
        //    47: ifnull          56
        //    50: aload_0        
        //    51: invokeinterface java/util/Map.clear:()V
        //    56: return         
        //    57: astore_1       
        //    58: goto            23
        //    61: astore_0       
        //    62: aload_1        
        //    63: astore_0       
        //    64: goto            46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      23     57     61     Ljava/lang/NoSuchFieldException;
        //  37     46     61     67     Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    public static void flushMarshmallows(final Resources p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            27
        //     6: ldc             Landroid/content/res/Resources;.class
        //     8: ldc             "mDrawableCache"
        //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    13: astore_1       
        //    14: aload_1        
        //    15: putstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheField:Ljava/lang/reflect/Field;
        //    18: aload_1        
        //    19: iconst_1       
        //    20: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    23: iconst_1       
        //    24: putstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheFieldFetched:Z
        //    27: aconst_null    
        //    28: astore_1       
        //    29: getstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheField:Ljava/lang/reflect/Field;
        //    32: astore_2       
        //    33: aload_2        
        //    34: ifnull          47
        //    37: aload_2        
        //    38: aload_0        
        //    39: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    42: astore_0       
        //    43: aload_0        
        //    44: ifnonnull       48
        //    47: return         
        //    48: aload_0        
        //    49: invokestatic    androidx/appcompat/app/ResourcesFlusher.flushThemedResourcesCache:(Ljava/lang/Object;)V
        //    52: return         
        //    53: astore_1       
        //    54: goto            23
        //    57: astore_0       
        //    58: aload_1        
        //    59: astore_0       
        //    60: goto            43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      23     53     57     Ljava/lang/NoSuchFieldException;
        //  37     43     57     63     Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    public static void flushNougats(final Resources p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            27
        //     6: ldc             Landroid/content/res/Resources;.class
        //     8: ldc             "mResourcesImpl"
        //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    13: astore_1       
        //    14: aload_1        
        //    15: putstatic       androidx/appcompat/app/ResourcesFlusher.sResourcesImplField:Ljava/lang/reflect/Field;
        //    18: aload_1        
        //    19: iconst_1       
        //    20: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    23: iconst_1       
        //    24: putstatic       androidx/appcompat/app/ResourcesFlusher.sResourcesImplFieldFetched:Z
        //    27: getstatic       androidx/appcompat/app/ResourcesFlusher.sResourcesImplField:Ljava/lang/reflect/Field;
        //    30: astore_2       
        //    31: aload_2        
        //    32: ifnonnull       36
        //    35: return         
        //    36: aconst_null    
        //    37: astore_1       
        //    38: aload_2        
        //    39: aload_0        
        //    40: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    43: astore_0       
        //    44: aload_0        
        //    45: ifnonnull       51
        //    48: goto            103
        //    51: getstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheFieldFetched:Z
        //    54: ifne            80
        //    57: aload_0        
        //    58: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    61: ldc             "mDrawableCache"
        //    63: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    66: astore_2       
        //    67: aload_2        
        //    68: putstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheField:Ljava/lang/reflect/Field;
        //    71: aload_2        
        //    72: iconst_1       
        //    73: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    76: iconst_1       
        //    77: putstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheFieldFetched:Z
        //    80: getstatic       androidx/appcompat/app/ResourcesFlusher.sDrawableCacheField:Ljava/lang/reflect/Field;
        //    83: astore_2       
        //    84: aload_2        
        //    85: ifnull          102
        //    88: aload_2        
        //    89: aload_0        
        //    90: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    93: astore_0       
        //    94: aload_0        
        //    95: ifnull          102
        //    98: aload_0        
        //    99: invokestatic    androidx/appcompat/app/ResourcesFlusher.flushThemedResourcesCache:(Ljava/lang/Object;)V
        //   102: return         
        //   103: return         
        //   104: astore_1       
        //   105: goto            23
        //   108: astore_0       
        //   109: goto            103
        //   112: astore_2       
        //   113: goto            76
        //   116: astore_0       
        //   117: aload_1        
        //   118: astore_0       
        //   119: goto            94
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      23     104    108    Ljava/lang/NoSuchFieldException;
        //  38     44     108    112    Ljava/lang/IllegalAccessException;
        //  57     76     112    116    Ljava/lang/NoSuchFieldException;
        //  88     94     116    122    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
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
    
    public static void flushThemedResourcesCache(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            18
        //     6: ldc             "android.content.res.ThemedResourceCache"
        //     8: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    11: putstatic       androidx/appcompat/app/ResourcesFlusher.sThemedResourceCacheClazz:Ljava/lang/Class;
        //    14: iconst_1       
        //    15: putstatic       androidx/appcompat/app/ResourcesFlusher.sThemedResourceCacheClazzFetched:Z
        //    18: getstatic       androidx/appcompat/app/ResourcesFlusher.sThemedResourceCacheClazz:Ljava/lang/Class;
        //    21: astore_1       
        //    22: aload_1        
        //    23: ifnonnull       27
        //    26: return         
        //    27: getstatic       androidx/appcompat/app/ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched:Z
        //    30: ifne            53
        //    33: aload_1        
        //    34: ldc             "mUnthemedEntries"
        //    36: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    39: astore_1       
        //    40: aload_1        
        //    41: putstatic       androidx/appcompat/app/ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField:Ljava/lang/reflect/Field;
        //    44: aload_1        
        //    45: iconst_1       
        //    46: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    49: iconst_1       
        //    50: putstatic       androidx/appcompat/app/ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched:Z
        //    53: getstatic       androidx/appcompat/app/ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField:Ljava/lang/reflect/Field;
        //    56: astore_2       
        //    57: aload_2        
        //    58: ifnonnull       62
        //    61: return         
        //    62: aconst_null    
        //    63: astore_1       
        //    64: aload_2        
        //    65: aload_0        
        //    66: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    69: checkcast       Landroid/util/LongSparseArray;
        //    72: astore_0       
        //    73: aload_0        
        //    74: ifnull          81
        //    77: aload_0        
        //    78: invokevirtual   android/util/LongSparseArray.clear:()V
        //    81: return         
        //    82: astore_1       
        //    83: goto            14
        //    86: astore_1       
        //    87: goto            49
        //    90: astore_0       
        //    91: aload_1        
        //    92: astore_0       
        //    93: goto            73
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      14     82     86     Ljava/lang/ClassNotFoundException;
        //  33     49     86     90     Ljava/lang/NoSuchFieldException;
        //  64     73     90     96     Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 50, Size: 50
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
}
