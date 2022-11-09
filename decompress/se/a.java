// 
// Decompiled by Procyon v0.6.0
// 

package se;

import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import od.f;

public final class a
{
    public static final f a;
    public static final Object b;
    public static DynamiteModule c;
    public static String d;
    
    static {
        a = f.b;
        b = new Object();
        se.a.c = null;
        se.a.d = "0";
    }
    
    @Deprecated
    public static void a(final Context p0) throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: aload_1        
        //     5: monitorenter   
        //     6: aload_1        
        //     7: monitorenter   
        //     8: getstatic       se/a.c:Lcom/google/android/gms/dynamite/DynamiteModule;
        //    11: astore_2       
        //    12: aload_1        
        //    13: monitorexit    
        //    14: aload_2        
        //    15: ifnull          23
        //    18: iconst_1       
        //    19: istore_3       
        //    20: goto            25
        //    23: iconst_0       
        //    24: istore_3       
        //    25: iload_3        
        //    26: ifeq            32
        //    29: aload_1        
        //    30: monitorexit    
        //    31: return         
        //    32: aload_0        
        //    33: ifnull          430
        //    36: ldc             Lse/a;.class
        //    38: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    41: astore_2       
        //    42: aload_2        
        //    43: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        //    46: aload_2        
        //    47: ldc             "org.chromium.net.CronetEngine"
        //    49: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    52: pop            
        //    53: invokestatic    org/chromium/net/ApiVersion.getApiLevel:()I
        //    56: istore          4
        //    58: getstatic       se/a.a:Lod/f;
        //    61: astore_2       
        //    62: aload_2        
        //    63: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    66: pop            
        //    67: aload_0        
        //    68: ldc             11925000
        //    70: invokestatic    od/g.ensurePlayServicesAvailable:(Landroid/content/Context;I)V
        //    73: aload_0        
        //    74: getstatic       com/google/android/gms/dynamite/DynamiteModule.b:Lcom/google/android/gms/dynamite/b;
        //    77: ldc             "com.google.android.gms.cronet_dynamite"
        //    79: invokestatic    com/google/android/gms/dynamite/DynamiteModule.c:(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
        //    82: astore          5
        //    84: aload           5
        //    86: getfield        com/google/android/gms/dynamite/DynamiteModule.a:Landroid/content/Context;
        //    89: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    92: ldc             "org.chromium.net.impl.ImplVersion"
        //    94: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    97: astore          6
        //    99: aload           6
        //   101: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   104: ldc             Lse/a;.class
        //   106: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   109: if_acmpeq       324
        //   112: aload           6
        //   114: ldc             "getApiLevel"
        //   116: iconst_0       
        //   117: anewarray       Ljava/lang/Class;
        //   120: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   123: astore          7
        //   125: aload           6
        //   127: ldc             "getCronetVersion"
        //   129: iconst_0       
        //   130: anewarray       Ljava/lang/Class;
        //   133: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   136: astore          6
        //   138: aload           7
        //   140: aconst_null    
        //   141: iconst_0       
        //   142: anewarray       Ljava/lang/Object;
        //   145: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   148: checkcast       Ljava/lang/Integer;
        //   151: astore          7
        //   153: aload           7
        //   155: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        //   158: aload           7
        //   160: invokevirtual   java/lang/Integer.intValue:()I
        //   163: istore_3       
        //   164: aload           6
        //   166: aconst_null    
        //   167: iconst_0       
        //   168: anewarray       Ljava/lang/Object;
        //   171: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   174: checkcast       Ljava/lang/String;
        //   177: astore          6
        //   179: aload           6
        //   181: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        //   184: aload           6
        //   186: putstatic       se/a.d:Ljava/lang/String;
        //   189: iload           4
        //   191: iload_3        
        //   192: if_icmple       316
        //   195: aload_2        
        //   196: aload_0        
        //   197: iconst_2       
        //   198: ldc             "cr"
        //   200: invokevirtual   od/f.a:(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
        //   203: astore_2       
        //   204: aload_2        
        //   205: ifnonnull       227
        //   208: ldc             "a"
        //   210: ldc             "Unable to fetch error resolution intent"
        //   212: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   215: pop            
        //   216: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   219: astore_0       
        //   220: aload_0        
        //   221: iconst_2       
        //   222: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   225: aload_0        
        //   226: athrow         
        //   227: new             Lcom/google/android/gms/common/GooglePlayServicesRepairableException;
        //   230: astore          6
        //   232: getstatic       se/a.d:Ljava/lang/String;
        //   235: astore          5
        //   237: aload           5
        //   239: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   242: invokevirtual   java/lang/String.length:()I
        //   245: istore          8
        //   247: new             Ljava/lang/StringBuilder;
        //   250: astore_0       
        //   251: aload_0        
        //   252: iload           8
        //   254: sipush          174
        //   257: iadd           
        //   258: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   261: aload_0        
        //   262: ldc             "Google Play Services update is required. The API Level of the client is "
        //   264: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   267: pop            
        //   268: aload_0        
        //   269: iload           4
        //   271: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   274: pop            
        //   275: aload_0        
        //   276: ldc             ". The API Level of the implementation is "
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: pop            
        //   282: aload_0        
        //   283: iload_3        
        //   284: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   287: pop            
        //   288: aload_0        
        //   289: ldc             ". The Cronet implementation version is "
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: pop            
        //   295: aload_0        
        //   296: aload           5
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: pop            
        //   302: aload           6
        //   304: iconst_2       
        //   305: aload_0        
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: aload_2        
        //   310: invokespecial   com/google/android/gms/common/GooglePlayServicesRepairableException.<init>:(ILjava/lang/String;Landroid/content/Intent;)V
        //   313: aload           6
        //   315: athrow         
        //   316: aload           5
        //   318: putstatic       se/a.c:Lcom/google/android/gms/dynamite/DynamiteModule;
        //   321: aload_1        
        //   322: monitorexit    
        //   323: return         
        //   324: ldc             "a"
        //   326: ldc             "ImplVersion class is missing from Cronet module."
        //   328: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   331: pop            
        //   332: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   335: astore_0       
        //   336: aload_0        
        //   337: bipush          8
        //   339: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   342: aload_0        
        //   343: athrow         
        //   344: astore_2       
        //   345: ldc             "a"
        //   347: ldc             "Unable to read Cronet version from the Cronet module "
        //   349: aload_2        
        //   350: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   353: pop            
        //   354: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   357: astore_0       
        //   358: aload_0        
        //   359: bipush          8
        //   361: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   364: aload_0        
        //   365: aload_2        
        //   366: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   369: checkcast       Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   372: athrow         
        //   373: astore_2       
        //   374: ldc             "a"
        //   376: ldc             "Unable to load Cronet module"
        //   378: aload_2        
        //   379: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   382: pop            
        //   383: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   386: astore_0       
        //   387: aload_0        
        //   388: bipush          8
        //   390: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   393: aload_0        
        //   394: aload_2        
        //   395: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   398: checkcast       Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   401: athrow         
        //   402: astore_2       
        //   403: ldc             "a"
        //   405: ldc             "Cronet API is not available. Have you included all required dependencies?"
        //   407: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   410: pop            
        //   411: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   414: astore_0       
        //   415: aload_0        
        //   416: bipush          10
        //   418: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   421: aload_0        
        //   422: aload_2        
        //   423: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   426: checkcast       Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   429: athrow         
        //   430: new             Ljava/lang/NullPointerException;
        //   433: astore_0       
        //   434: aload_0        
        //   435: ldc             "Context must not be null"
        //   437: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   440: aload_0        
        //   441: athrow         
        //   442: astore_0       
        //   443: goto            451
        //   446: astore_0       
        //   447: aload_1        
        //   448: monitorexit    
        //   449: aload_0        
        //   450: athrow         
        //   451: aload_1        
        //   452: monitorexit    
        //   453: aload_0        
        //   454: athrow         
        //    Exceptions:
        //  throws com.google.android.gms.common.GooglePlayServicesNotAvailableException
        //  throws com.google.android.gms.common.GooglePlayServicesRepairableException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                             
        //  -----  -----  -----  -----  -----------------------------------------------------------------
        //  6      8      442    455    Any
        //  8      14     446    451    Any
        //  29     31     442    455    Any
        //  36     46     442    455    Any
        //  46     58     402    430    Ljava/lang/ClassNotFoundException;
        //  46     58     442    455    Any
        //  58     73     442    455    Any
        //  73     84     373    402    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  73     84     442    455    Any
        //  84     189    344    373    Ljava/lang/Exception;
        //  84     189    442    455    Any
        //  195    204    442    455    Any
        //  208    227    442    455    Any
        //  227    316    442    455    Any
        //  316    323    442    455    Any
        //  324    344    344    373    Ljava/lang/Exception;
        //  324    344    442    455    Any
        //  345    373    442    455    Any
        //  374    402    442    455    Any
        //  403    430    442    455    Any
        //  430    442    442    455    Any
        //  447    449    446    451    Any
        //  449    451    442    455    Any
        //  451    453    442    455    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
