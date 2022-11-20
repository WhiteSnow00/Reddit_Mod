// 
// Decompiled by Procyon v0.6.0
// 

package re;

import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import nd.f;

public final class a
{
    public static final f a;
    public static final Object b;
    public static DynamiteModule c;
    public static String d;
    
    static {
        a = f.b;
        b = new Object();
        re.a.c = null;
        re.a.d = "0";
    }
    
    @Deprecated
    public static void a(final Context p0) throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          4
        //     5: aload           4
        //     7: monitorenter   
        //     8: aload           4
        //    10: monitorenter   
        //    11: getstatic       re/a.c:Lcom/google/android/gms/dynamite/DynamiteModule;
        //    14: astore          5
        //    16: aload           4
        //    18: monitorexit    
        //    19: aload           5
        //    21: ifnull          29
        //    24: iconst_1       
        //    25: istore_1       
        //    26: goto            31
        //    29: iconst_0       
        //    30: istore_1       
        //    31: iload_1        
        //    32: ifeq            39
        //    35: aload           4
        //    37: monitorexit    
        //    38: return         
        //    39: aload_0        
        //    40: ifnull          456
        //    43: ldc             Lre/a;.class
        //    45: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    48: astore          5
        //    50: aload           5
        //    52: invokestatic    mg/d0.y:(Ljava/lang/Object;)V
        //    55: aload           5
        //    57: ldc             "org.chromium.net.CronetEngine"
        //    59: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    62: pop            
        //    63: invokestatic    org/chromium/net/ApiVersion.getApiLevel:()I
        //    66: istore_2       
        //    67: getstatic       re/a.a:Lnd/f;
        //    70: astore          6
        //    72: aload           6
        //    74: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    77: pop            
        //    78: aload_0        
        //    79: ldc             11925000
        //    81: invokestatic    nd/g.ensurePlayServicesAvailable:(Landroid/content/Context;I)V
        //    84: aload_0        
        //    85: getstatic       com/google/android/gms/dynamite/DynamiteModule.b:Lcom/google/android/gms/dynamite/b;
        //    88: ldc             "com.google.android.gms.cronet_dynamite"
        //    90: invokestatic    com/google/android/gms/dynamite/DynamiteModule.c:(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
        //    93: astore          5
        //    95: aload           5
        //    97: getfield        com/google/android/gms/dynamite/DynamiteModule.a:Landroid/content/Context;
        //   100: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //   103: ldc             "org.chromium.net.impl.ImplVersion"
        //   105: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //   108: astore          8
        //   110: aload           8
        //   112: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   115: ldc             Lre/a;.class
        //   117: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   120: if_acmpeq       342
        //   123: aload           8
        //   125: ldc             "getApiLevel"
        //   127: iconst_0       
        //   128: anewarray       Ljava/lang/Class;
        //   131: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   134: astore          7
        //   136: aload           8
        //   138: ldc             "getCronetVersion"
        //   140: iconst_0       
        //   141: anewarray       Ljava/lang/Class;
        //   144: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   147: astore          8
        //   149: aload           7
        //   151: aconst_null    
        //   152: iconst_0       
        //   153: anewarray       Ljava/lang/Object;
        //   156: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   159: checkcast       Ljava/lang/Integer;
        //   162: astore          7
        //   164: aload           7
        //   166: invokestatic    mg/d0.y:(Ljava/lang/Object;)V
        //   169: aload           7
        //   171: invokevirtual   java/lang/Integer.intValue:()I
        //   174: istore_1       
        //   175: aload           8
        //   177: aconst_null    
        //   178: iconst_0       
        //   179: anewarray       Ljava/lang/Object;
        //   182: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   185: checkcast       Ljava/lang/String;
        //   188: astore          7
        //   190: aload           7
        //   192: invokestatic    mg/d0.y:(Ljava/lang/Object;)V
        //   195: aload           7
        //   197: putstatic       re/a.d:Ljava/lang/String;
        //   200: iload_2        
        //   201: iload_1        
        //   202: if_icmple       333
        //   205: aload           6
        //   207: aload_0        
        //   208: iconst_2       
        //   209: ldc             "cr"
        //   211: invokevirtual   nd/f.a:(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
        //   214: astore          6
        //   216: aload           6
        //   218: ifnonnull       240
        //   221: ldc             "a"
        //   223: ldc             "Unable to fetch error resolution intent"
        //   225: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   228: pop            
        //   229: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   232: astore_0       
        //   233: aload_0        
        //   234: iconst_2       
        //   235: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   238: aload_0        
        //   239: athrow         
        //   240: new             Lcom/google/android/gms/common/GooglePlayServicesRepairableException;
        //   243: astore          5
        //   245: getstatic       re/a.d:Ljava/lang/String;
        //   248: astore_0       
        //   249: aload_0        
        //   250: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   253: invokevirtual   java/lang/String.length:()I
        //   256: istore_3       
        //   257: new             Ljava/lang/StringBuilder;
        //   260: astore          7
        //   262: aload           7
        //   264: iload_3        
        //   265: sipush          174
        //   268: iadd           
        //   269: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   272: aload           7
        //   274: ldc             "Google Play Services update is required. The API Level of the client is "
        //   276: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   279: pop            
        //   280: aload           7
        //   282: iload_2        
        //   283: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   286: pop            
        //   287: aload           7
        //   289: ldc             ". The API Level of the implementation is "
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: pop            
        //   295: aload           7
        //   297: iload_1        
        //   298: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   301: pop            
        //   302: aload           7
        //   304: ldc             ". The Cronet implementation version is "
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: pop            
        //   310: aload           7
        //   312: aload_0        
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: pop            
        //   317: aload           5
        //   319: iconst_2       
        //   320: aload           7
        //   322: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   325: aload           6
        //   327: invokespecial   com/google/android/gms/common/GooglePlayServicesRepairableException.<init>:(ILjava/lang/String;Landroid/content/Intent;)V
        //   330: aload           5
        //   332: athrow         
        //   333: aload           5
        //   335: putstatic       re/a.c:Lcom/google/android/gms/dynamite/DynamiteModule;
        //   338: aload           4
        //   340: monitorexit    
        //   341: return         
        //   342: ldc             "a"
        //   344: ldc             "ImplVersion class is missing from Cronet module."
        //   346: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   349: pop            
        //   350: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   353: astore_0       
        //   354: aload_0        
        //   355: bipush          8
        //   357: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   360: aload_0        
        //   361: athrow         
        //   362: astore          5
        //   364: ldc             "a"
        //   366: ldc             "Unable to read Cronet version from the Cronet module "
        //   368: aload           5
        //   370: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   373: pop            
        //   374: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   377: astore_0       
        //   378: aload_0        
        //   379: bipush          8
        //   381: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   384: aload_0        
        //   385: aload           5
        //   387: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   390: checkcast       Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   393: athrow         
        //   394: astore          5
        //   396: ldc             "a"
        //   398: ldc             "Unable to load Cronet module"
        //   400: aload           5
        //   402: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   405: pop            
        //   406: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   409: astore_0       
        //   410: aload_0        
        //   411: bipush          8
        //   413: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   416: aload_0        
        //   417: aload           5
        //   419: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   422: checkcast       Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   425: athrow         
        //   426: astore          5
        //   428: ldc             "a"
        //   430: ldc             "Cronet API is not available. Have you included all required dependencies?"
        //   432: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   435: pop            
        //   436: new             Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   439: astore_0       
        //   440: aload_0        
        //   441: bipush          10
        //   443: invokespecial   com/google/android/gms/common/GooglePlayServicesNotAvailableException.<init>:(I)V
        //   446: aload_0        
        //   447: aload           5
        //   449: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   452: checkcast       Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //   455: athrow         
        //   456: new             Ljava/lang/NullPointerException;
        //   459: astore_0       
        //   460: aload_0        
        //   461: ldc             "Context must not be null"
        //   463: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   466: aload_0        
        //   467: athrow         
        //   468: astore_0       
        //   469: goto            478
        //   472: astore_0       
        //   473: aload           4
        //   475: monitorexit    
        //   476: aload_0        
        //   477: athrow         
        //   478: aload           4
        //   480: monitorexit    
        //   481: aload_0        
        //   482: athrow         
        //    Exceptions:
        //  throws com.google.android.gms.common.GooglePlayServicesNotAvailableException
        //  throws com.google.android.gms.common.GooglePlayServicesRepairableException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                             
        //  -----  -----  -----  -----  -----------------------------------------------------------------
        //  8      11     468    483    Any
        //  11     19     472    478    Any
        //  35     38     468    483    Any
        //  43     55     468    483    Any
        //  55     67     426    456    Ljava/lang/ClassNotFoundException;
        //  55     67     468    483    Any
        //  67     84     468    483    Any
        //  84     95     394    426    Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;
        //  84     95     468    483    Any
        //  95     200    362    394    Ljava/lang/Exception;
        //  95     200    468    483    Any
        //  205    216    468    483    Any
        //  221    240    468    483    Any
        //  240    333    468    483    Any
        //  333    341    468    483    Any
        //  342    362    362    394    Ljava/lang/Exception;
        //  342    362    468    483    Any
        //  364    394    468    483    Any
        //  396    426    468    483    Any
        //  428    456    468    483    Any
        //  456    468    468    483    Any
        //  473    476    472    478    Any
        //  476    478    468    483    Any
        //  478    481    468    483    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
