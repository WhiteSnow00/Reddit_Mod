// 
// Decompiled by Procyon v0.6.0
// 

package mc2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class e<T>
{
    public final Class<?> a;
    public final String b;
    public final Class[] c;
    
    public e(final Class<?> a, final String b, final Class... c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Method a(final Class<?> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        mc2/e.b:Ljava/lang/String;
        //     4: astore          5
        //     6: aconst_null    
        //     7: astore          4
        //     9: aload           4
        //    11: astore_3       
        //    12: aload           5
        //    14: ifnull          75
        //    17: aload_0        
        //    18: getfield        mc2/e.c:[Ljava/lang/Class;
        //    21: astore_3       
        //    22: aload_1        
        //    23: aload           5
        //    25: aload_3        
        //    26: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    29: astore_1       
        //    30: aload_1        
        //    31: invokevirtual   java/lang/reflect/Method.getModifiers:()I
        //    34: istore_2       
        //    35: iload_2        
        //    36: iconst_1       
        //    37: iand           
        //    38: ifne            43
        //    41: aconst_null    
        //    42: astore_1       
        //    43: aload_1        
        //    44: ifnull          73
        //    47: aload_0        
        //    48: getfield        mc2/e.a:Ljava/lang/Class;
        //    51: astore_3       
        //    52: aload_3        
        //    53: ifnull          73
        //    56: aload_3        
        //    57: aload_1        
        //    58: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //    61: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    64: ifne            73
        //    67: aload           4
        //    69: astore_3       
        //    70: goto            75
        //    73: aload_1        
        //    74: astore_3       
        //    75: aload_3        
        //    76: areturn        
        //    77: astore_1       
        //    78: goto            41
        //    81: astore_3       
        //    82: goto            43
        //    Signature:
        //  (Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  22     30     77     81     Ljava/lang/NoSuchMethodException;
        //  30     35     81     85     Ljava/lang/NoSuchMethodException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    public final Object b(final T t, final Object... array) throws InvocationTargetException {
        final Method a = this.a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, array);
            }
            catch (final IllegalAccessException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpectedly could not call: ");
                sb.append(a);
                final AssertionError assertionError = new AssertionError((Object)sb.toString());
                assertionError.initCause(ex);
                throw assertionError;
            }
        }
        final StringBuilder t2 = a.t("Method ");
        t2.append(this.b);
        t2.append(" not supported for object ");
        t2.append(t);
        throw new AssertionError((Object)t2.toString());
    }
    
    public final void c(final Object p0, final Object... p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     5: invokevirtual   mc2/e.a:(Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //     8: astore_3       
        //     9: aload_3        
        //    10: ifnonnull       16
        //    13: goto            23
        //    16: aload_3        
        //    17: aload_1        
        //    18: aload_2        
        //    19: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    22: pop            
        //    23: return         
        //    24: astore_1       
        //    25: aload_1        
        //    26: invokevirtual   java/lang/reflect/InvocationTargetException.getTargetException:()Ljava/lang/Throwable;
        //    29: astore_2       
        //    30: aload_2        
        //    31: instanceof      Ljava/lang/RuntimeException;
        //    34: ifeq            42
        //    37: aload_2        
        //    38: checkcast       Ljava/lang/RuntimeException;
        //    41: athrow         
        //    42: new             Ljava/lang/AssertionError;
        //    45: dup            
        //    46: ldc             "Unexpected exception"
        //    48: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //    51: astore_1       
        //    52: aload_1        
        //    53: aload_2        
        //    54: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    57: pop            
        //    58: aload_1        
        //    59: athrow         
        //    60: astore_1       
        //    61: goto            23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  0      9      24     60     Ljava/lang/reflect/InvocationTargetException;
        //  16     23     60     64     Ljava/lang/IllegalAccessException;
        //  16     23     24     60     Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
