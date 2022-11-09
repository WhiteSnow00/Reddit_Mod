// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import eg.g1;
import eg.u1;
import ig.k0;
import dg.k;

public final class m
{
    public static final k c;
    public final c a;
    public final k0<u1> b;
    
    static {
        c = new k("PatchSliceTaskHandler");
    }
    
    public m(final c a, final k0<u1> b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final g1 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/play/core/assetpacks/m.a:Lcom/google/android/play/core/assetpacks/c;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        eg/s0.b:Ljava/lang/String;
        //     9: astore_3       
        //    10: aload_2        
        //    11: aload_1        
        //    12: getfield        eg/g1.d:I
        //    15: aload_3        
        //    16: aload_1        
        //    17: getfield        eg/g1.e:J
        //    20: invokevirtual   com/google/android/play/core/assetpacks/c.j:(ILjava/lang/String;J)Ljava/io/File;
        //    23: astore_2       
        //    24: aload_0        
        //    25: getfield        com/google/android/play/core/assetpacks/m.a:Lcom/google/android/play/core/assetpacks/c;
        //    28: astore          4
        //    30: aload_1        
        //    31: getfield        eg/s0.b:Ljava/lang/String;
        //    34: astore_3       
        //    35: aload_1        
        //    36: getfield        eg/g1.d:I
        //    39: istore          5
        //    41: aload_1        
        //    42: getfield        eg/g1.e:J
        //    45: lstore          6
        //    47: aload_1        
        //    48: getfield        eg/g1.i:Ljava/lang/String;
        //    51: astore          8
        //    53: aload           4
        //    55: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    58: pop            
        //    59: new             Ljava/io/File;
        //    62: dup            
        //    63: new             Ljava/io/File;
        //    66: dup            
        //    67: aload           4
        //    69: iload           5
        //    71: aload_3        
        //    72: lload           6
        //    74: invokevirtual   com/google/android/play/core/assetpacks/c.j:(ILjava/lang/String;J)Ljava/io/File;
        //    77: ldc             "_metadata"
        //    79: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    82: aload           8
        //    84: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    87: astore          4
        //    89: aload_1        
        //    90: getfield        eg/g1.k:Ljava/io/InputStream;
        //    93: astore_3       
        //    94: aload_1        
        //    95: getfield        eg/g1.h:I
        //    98: iconst_2       
        //    99: if_icmpeq       105
        //   102: goto            117
        //   105: new             Ljava/util/zip/GZIPInputStream;
        //   108: dup            
        //   109: aload_3        
        //   110: sipush          8192
        //   113: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;I)V
        //   116: astore_3       
        //   117: new             Lcom/google/android/play/core/assetpacks/d;
        //   120: astore          8
        //   122: aload           8
        //   124: aload_2        
        //   125: aload           4
        //   127: invokespecial   com/google/android/play/core/assetpacks/d.<init>:(Ljava/io/File;Ljava/io/File;)V
        //   130: aload_0        
        //   131: getfield        com/google/android/play/core/assetpacks/m.a:Lcom/google/android/play/core/assetpacks/c;
        //   134: astore_2       
        //   135: aload_1        
        //   136: getfield        eg/s0.b:Ljava/lang/String;
        //   139: astore          4
        //   141: aload_1        
        //   142: getfield        eg/g1.f:I
        //   145: istore          5
        //   147: aload_1        
        //   148: getfield        eg/g1.g:J
        //   151: lstore          6
        //   153: aload_2        
        //   154: iload           5
        //   156: aload           4
        //   158: aload_1        
        //   159: getfield        eg/g1.i:Ljava/lang/String;
        //   162: lload           6
        //   164: invokevirtual   com/google/android/play/core/assetpacks/c.k:(ILjava/lang/String;Ljava/lang/String;J)Ljava/io/File;
        //   167: astore          4
        //   169: aload           4
        //   171: invokevirtual   java/io/File.exists:()Z
        //   174: ifne            183
        //   177: aload           4
        //   179: invokevirtual   java/io/File.mkdirs:()Z
        //   182: pop            
        //   183: new             Lcom/google/android/play/core/assetpacks/o;
        //   186: astore          9
        //   188: aload           9
        //   190: aload_0        
        //   191: getfield        com/google/android/play/core/assetpacks/m.a:Lcom/google/android/play/core/assetpacks/c;
        //   194: aload_1        
        //   195: getfield        eg/s0.b:Ljava/lang/String;
        //   198: aload_1        
        //   199: getfield        eg/g1.f:I
        //   202: aload_1        
        //   203: getfield        eg/g1.g:J
        //   206: aload_1        
        //   207: getfield        eg/g1.i:Ljava/lang/String;
        //   210: invokespecial   com/google/android/play/core/assetpacks/o.<init>:(Lcom/google/android/play/core/assetpacks/c;Ljava/lang/String;IJLjava/lang/String;)V
        //   213: new             Leg/j0;
        //   216: astore_2       
        //   217: aload_2        
        //   218: aload           4
        //   220: aload           9
        //   222: invokespecial   eg/j0.<init>:(Ljava/io/File;Lcom/google/android/play/core/assetpacks/o;)V
        //   225: aload           8
        //   227: aload_3        
        //   228: aload_2        
        //   229: aload_1        
        //   230: getfield        eg/g1.j:J
        //   233: invokestatic    ig/h0.a:(Lcom/google/android/play/core/assetpacks/d;Ljava/io/InputStream;Leg/j0;J)V
        //   236: aload           9
        //   238: iconst_0       
        //   239: invokevirtual   com/google/android/play/core/assetpacks/o.g:(I)V
        //   242: aload_3        
        //   243: invokevirtual   java/io/InputStream.close:()V
        //   246: getstatic       com/google/android/play/core/assetpacks/m.c:Ldg/k;
        //   249: ldc             "Patching and extraction finished for slice %s of pack %s."
        //   251: iconst_2       
        //   252: anewarray       Ljava/lang/Object;
        //   255: dup            
        //   256: iconst_0       
        //   257: aload_1        
        //   258: getfield        eg/g1.i:Ljava/lang/String;
        //   261: aastore        
        //   262: dup            
        //   263: iconst_1       
        //   264: aload_1        
        //   265: getfield        eg/s0.b:Ljava/lang/String;
        //   268: aastore        
        //   269: invokevirtual   dg/k.j:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   272: aload_0        
        //   273: getfield        com/google/android/play/core/assetpacks/m.b:Lig/k0;
        //   276: invokeinterface ig/k0.zza:()Ljava/lang/Object;
        //   281: checkcast       Leg/u1;
        //   284: aload_1        
        //   285: getfield        eg/s0.c:I
        //   288: iconst_0       
        //   289: aload_1        
        //   290: getfield        eg/s0.b:Ljava/lang/String;
        //   293: aload_1        
        //   294: getfield        eg/g1.i:Ljava/lang/String;
        //   297: invokeinterface eg/u1.g:(IILjava/lang/String;Ljava/lang/String;)V
        //   302: aload_1        
        //   303: getfield        eg/g1.k:Ljava/io/InputStream;
        //   306: invokevirtual   java/io/InputStream.close:()V
        //   309: return         
        //   310: astore_3       
        //   311: getstatic       com/google/android/play/core/assetpacks/m.c:Ldg/k;
        //   314: ldc             "Could not close file for slice %s of pack %s."
        //   316: iconst_2       
        //   317: anewarray       Ljava/lang/Object;
        //   320: dup            
        //   321: iconst_0       
        //   322: aload_1        
        //   323: getfield        eg/g1.i:Ljava/lang/String;
        //   326: aastore        
        //   327: dup            
        //   328: iconst_1       
        //   329: aload_1        
        //   330: getfield        eg/s0.b:Ljava/lang/String;
        //   333: aastore        
        //   334: invokevirtual   dg/k.k:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   337: return         
        //   338: astore_2       
        //   339: aload_3        
        //   340: invokevirtual   java/io/InputStream.close:()V
        //   343: aload_2        
        //   344: athrow         
        //   345: astore_3       
        //   346: getstatic       com/google/android/play/core/assetpacks/m.c:Ldg/k;
        //   349: ldc             "IOException during patching %s."
        //   351: iconst_1       
        //   352: anewarray       Ljava/lang/Object;
        //   355: dup            
        //   356: iconst_0       
        //   357: aload_3        
        //   358: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   361: aastore        
        //   362: invokevirtual   dg/k.h:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   365: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   368: dup            
        //   369: ldc             "Error patching slice %s of pack %s."
        //   371: iconst_2       
        //   372: anewarray       Ljava/lang/Object;
        //   375: dup            
        //   376: iconst_0       
        //   377: aload_1        
        //   378: getfield        eg/g1.i:Ljava/lang/String;
        //   381: aastore        
        //   382: dup            
        //   383: iconst_1       
        //   384: aload_1        
        //   385: getfield        eg/s0.b:Ljava/lang/String;
        //   388: aastore        
        //   389: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   392: aload_3        
        //   393: aload_1        
        //   394: getfield        eg/s0.c:I
        //   397: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;Ljava/lang/Exception;I)V
        //   400: athrow         
        //   401: astore_3       
        //   402: goto            343
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  89     102    345    401    Ljava/io/IOException;
        //  105    117    345    401    Ljava/io/IOException;
        //  117    183    338    345    Any
        //  183    242    338    345    Any
        //  242    246    345    401    Ljava/io/IOException;
        //  302    309    310    338    Ljava/io/IOException;
        //  339    343    401    405    Any
        //  343    345    345    401    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0343:
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
