// 
// Decompiled by Procyon v0.6.0
// 

package v80;

public final class a
{
    public static final int[] a;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: arraylength    
        //     4: newarray        I
        //     6: astore_0       
        //     7: aload_0        
        //     8: putstatic       v80/a.a:[I
        //    11: aload_0        
        //    12: getstatic       com/google/protobuf/GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;
        //    15: invokevirtual   java/lang/Enum.ordinal:()I
        //    18: iconst_1       
        //    19: iastore        
        //    20: getstatic       v80/a.a:[I
        //    23: getstatic       com/google/protobuf/GeneratedMessageLite$MethodToInvoke.NEW_BUILDER:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;
        //    26: invokevirtual   java/lang/Enum.ordinal:()I
        //    29: iconst_2       
        //    30: iastore        
        //    31: getstatic       v80/a.a:[I
        //    34: getstatic       com/google/protobuf/GeneratedMessageLite$MethodToInvoke.BUILD_MESSAGE_INFO:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;
        //    37: invokevirtual   java/lang/Enum.ordinal:()I
        //    40: iconst_3       
        //    41: iastore        
        //    42: getstatic       v80/a.a:[I
        //    45: getstatic       com/google/protobuf/GeneratedMessageLite$MethodToInvoke.GET_DEFAULT_INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;
        //    48: invokevirtual   java/lang/Enum.ordinal:()I
        //    51: iconst_4       
        //    52: iastore        
        //    53: getstatic       v80/a.a:[I
        //    56: getstatic       com/google/protobuf/GeneratedMessageLite$MethodToInvoke.GET_PARSER:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;
        //    59: invokevirtual   java/lang/Enum.ordinal:()I
        //    62: iconst_5       
        //    63: iastore        
        //    64: getstatic       v80/a.a:[I
        //    67: getstatic       com/google/protobuf/GeneratedMessageLite$MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;
        //    70: invokevirtual   java/lang/Enum.ordinal:()I
        //    73: bipush          6
        //    75: iastore        
        //    76: getstatic       v80/a.a:[I
        //    79: getstatic       com/google/protobuf/GeneratedMessageLite$MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED:Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;
        //    82: invokevirtual   java/lang/Enum.ordinal:()I
        //    85: bipush          7
        //    87: iastore        
        //    88: return         
        //    89: astore_0       
        //    90: goto            20
        //    93: astore_0       
        //    94: goto            31
        //    97: astore_0       
        //    98: goto            42
        //   101: astore_0       
        //   102: goto            53
        //   105: astore_0       
        //   106: goto            64
        //   109: astore_0       
        //   110: goto            76
        //   113: astore_0       
        //   114: goto            88
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  11     20     89     93     Ljava/lang/NoSuchFieldError;
        //  20     31     93     97     Ljava/lang/NoSuchFieldError;
        //  31     42     97     101    Ljava/lang/NoSuchFieldError;
        //  42     53     101    105    Ljava/lang/NoSuchFieldError;
        //  53     64     105    109    Ljava/lang/NoSuchFieldError;
        //  64     76     109    113    Ljava/lang/NoSuchFieldError;
        //  76     88     113    117    Ljava/lang/NoSuchFieldError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 56, Size: 56
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
