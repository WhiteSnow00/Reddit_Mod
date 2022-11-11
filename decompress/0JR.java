// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public class 0jR
{
    public static final ConcurrentHashMap<Class<? extends 0Vq>, 0Vq> LIZ;
    
    static {
        Covode.recordClassIndex(6915);
        LIZ = new ConcurrentHashMap<Class<? extends 0Vq>, 0Vq>();
    }
    
    public static <T extends 0Vq> T LIZ(final Class<T> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //     7: checkcast       LX/0Vq;
        //    10: astore_1       
        //    11: aload_1        
        //    12: astore_2       
        //    13: aload_1        
        //    14: ifnonnull       93
        //    17: aload_0        
        //    18: ldc             "_service_impl_temp"
        //    20: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
        //    23: checkcast       LX/0Vq;
        //    26: astore_2       
        //    27: aload_0        
        //    28: aload_2        
        //    29: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;LX/0Vq;)V
        //    32: aload_2        
        //    33: invokeinterface X/0Vq.onInit:()V
        //    38: aload_2        
        //    39: astore_1       
        //    40: aload_1        
        //    41: astore_2       
        //    42: aload_1        
        //    43: ifnonnull       93
        //    46: aload_0        
        //    47: ldc             "_service_dummy_temp"
        //    49: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
        //    52: checkcast       LX/0Vq;
        //    55: astore_2       
        //    56: aload_0        
        //    57: aload_2        
        //    58: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;LX/0Vq;)V
        //    61: aload_2        
        //    62: invokeinterface X/0Vq.onInit:()V
        //    67: aload_2        
        //    68: astore_1       
        //    69: aload_1        
        //    70: astore_2       
        //    71: aload_1        
        //    72: ifnonnull       93
        //    75: getstatic       X/HmH.LIZIZ:LX/HmH;
        //    78: invokevirtual   X/HmH.LIZ:()Z
        //    81: pop            
        //    82: getstatic       X/0jR.LIZ:Ljava/util/concurrent/ConcurrentHashMap;
        //    85: aload_0        
        //    86: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    89: checkcast       LX/0Vq;
        //    92: astore_2       
        //    93: aload_2        
        //    94: areturn        
        //    95: astore_2       
        //    96: goto            40
        //    99: astore_1       
        //   100: goto            38
        //   103: astore_2       
        //   104: goto            69
        //   107: astore_1       
        //   108: goto            67
        //   111: astore_0       
        //   112: aload_1        
        //   113: astore_2       
        //   114: goto            93
        //    Signature:
        //  <T::LX/0Vq;>(Ljava/lang/Class<TT;>;)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     27     95     99     Ljava/lang/Exception;
        //  27     38     99     103    Ljava/lang/Exception;
        //  46     56     103    107    Ljava/lang/Exception;
        //  56     67     107    111    Ljava/lang/Exception;
        //  75     93     111    117    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 63, Size: 63
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
    
    public static <T> T LIZ(Class<T> string, final String s) {
        final StringBuilder sb = new StringBuilder("com.bytedance.android.live.service.temp.");
        sb.append(((Class)string).getSimpleName());
        sb.append(s);
        string = sb.toString();
        try {
            final Constructor<?> declaredConstructor = Class.forName(string).getDeclaredConstructor((Class<?>[])new Class[0]);
            declaredConstructor.setAccessible(true);
            return (T)declaredConstructor.newInstance(new Object[0]);
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException("InvocationTargetException:".concat(String.valueOf(string)));
        }
        catch (final NoSuchMethodException ex2) {
            throw new RuntimeException("NoSuchMethodException:".concat(String.valueOf(string)));
        }
        catch (final InstantiationException ex3) {
            throw new RuntimeException("InstantiationException:".concat(String.valueOf(string)));
        }
        catch (final IllegalAccessException ex4) {
            throw new RuntimeException("IllegalAccessException:".concat(String.valueOf(string)));
        }
        catch (final ClassNotFoundException ex5) {
            throw new RuntimeException("ClassNotFoundException:".concat(String.valueOf(string)));
        }
    }
    
    public static <T extends 0Vq> void LIZ(final Class<T> clazz, final T t) {
        if (clazz != null && t != null) {
            0jR.LIZ.put(clazz, t);
        }
    }
}
