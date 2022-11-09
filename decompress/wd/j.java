// 
// Decompiled by Procyon v0.6.0
// 

package wd;

import java.lang.reflect.Method;

public final class j
{
    public static final Method a;
    public static final Method b;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: pop            
        //     4: aconst_null    
        //     5: astore_0       
        //     6: ldc             Landroid/os/WorkSource;.class
        //     8: ldc             "add"
        //    10: iconst_1       
        //    11: anewarray       Ljava/lang/Class;
        //    14: dup            
        //    15: iconst_0       
        //    16: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    19: aastore        
        //    20: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    23: astore_1       
        //    24: goto            30
        //    27: astore_1       
        //    28: aconst_null    
        //    29: astore_1       
        //    30: aload_1        
        //    31: putstatic       wd/j.a:Ljava/lang/reflect/Method;
        //    34: ldc             Landroid/os/WorkSource;.class
        //    36: ldc             "add"
        //    38: iconst_2       
        //    39: anewarray       Ljava/lang/Class;
        //    42: dup            
        //    43: iconst_0       
        //    44: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    47: aastore        
        //    48: dup            
        //    49: iconst_1       
        //    50: ldc             Ljava/lang/String;.class
        //    52: aastore        
        //    53: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    56: astore_1       
        //    57: aload_1        
        //    58: putstatic       wd/j.b:Ljava/lang/reflect/Method;
        //    61: ldc             Landroid/os/WorkSource;.class
        //    63: ldc             "size"
        //    65: iconst_0       
        //    66: anewarray       Ljava/lang/Class;
        //    69: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    72: pop            
        //    73: ldc             Landroid/os/WorkSource;.class
        //    75: ldc             "get"
        //    77: iconst_1       
        //    78: anewarray       Ljava/lang/Class;
        //    81: dup            
        //    82: iconst_0       
        //    83: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    86: aastore        
        //    87: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    90: pop            
        //    91: ldc             Landroid/os/WorkSource;.class
        //    93: ldc             "getName"
        //    95: iconst_1       
        //    96: anewarray       Ljava/lang/Class;
        //    99: dup            
        //   100: iconst_0       
        //   101: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   104: aastore        
        //   105: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   108: pop            
        //   109: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   112: bipush          28
        //   114: if_icmplt       122
        //   117: iconst_1       
        //   118: istore_2       
        //   119: goto            124
        //   122: iconst_0       
        //   123: istore_2       
        //   124: iload_2        
        //   125: ifeq            153
        //   128: ldc             Landroid/os/WorkSource;.class
        //   130: ldc             "createWorkChain"
        //   132: iconst_0       
        //   133: anewarray       Ljava/lang/Class;
        //   136: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   139: pop            
        //   140: goto            153
        //   143: astore_1       
        //   144: ldc             "WorkSourceUtil"
        //   146: ldc             "Missing WorkChain API createWorkChain"
        //   148: aload_1        
        //   149: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   152: pop            
        //   153: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   156: bipush          28
        //   158: if_icmplt       166
        //   161: iconst_1       
        //   162: istore_2       
        //   163: goto            168
        //   166: iconst_0       
        //   167: istore_2       
        //   168: iload_2        
        //   169: ifeq            211
        //   172: ldc             "android.os.WorkSource$WorkChain"
        //   174: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   177: ldc             "addNode"
        //   179: iconst_2       
        //   180: anewarray       Ljava/lang/Class;
        //   183: dup            
        //   184: iconst_0       
        //   185: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   188: aastore        
        //   189: dup            
        //   190: iconst_1       
        //   191: ldc             Ljava/lang/String;.class
        //   193: aastore        
        //   194: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   197: pop            
        //   198: goto            211
        //   201: astore_1       
        //   202: ldc             "WorkSourceUtil"
        //   204: ldc             "Missing WorkChain class"
        //   206: aload_1        
        //   207: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   210: pop            
        //   211: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   214: bipush          28
        //   216: if_icmplt       224
        //   219: iconst_1       
        //   220: istore_2       
        //   221: goto            226
        //   224: iconst_0       
        //   225: istore_2       
        //   226: iload_2        
        //   227: ifeq            245
        //   230: ldc             Landroid/os/WorkSource;.class
        //   232: ldc             "isEmpty"
        //   234: iconst_0       
        //   235: anewarray       Ljava/lang/Class;
        //   238: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   241: iconst_1       
        //   242: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   245: return         
        //   246: astore_1       
        //   247: aload_0        
        //   248: astore_1       
        //   249: goto            57
        //   252: astore_1       
        //   253: goto            73
        //   256: astore_1       
        //   257: goto            91
        //   260: astore_1       
        //   261: goto            109
        //   264: astore_1       
        //   265: goto            245
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      24     27     30     Ljava/lang/Exception;
        //  34     57     246    252    Ljava/lang/Exception;
        //  61     73     252    256    Ljava/lang/Exception;
        //  73     91     256    260    Ljava/lang/Exception;
        //  91     109    260    264    Ljava/lang/Exception;
        //  128    140    143    153    Ljava/lang/Exception;
        //  172    198    201    211    Ljava/lang/Exception;
        //  230    245    264    268    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 147, Size: 147
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
