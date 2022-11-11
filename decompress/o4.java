// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.net.Uri;
import android.content.Context;
import com.google.android.gms.internal.measurement.zzif;

public final class o4
{
    public static volatile zzif a;
    public static final Object b;
    
    static {
        o4.a = zzif.zzc();
        b = new Object();
    }
    
    public static boolean a(final Context p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //     4: astore_1       
        //     5: ldc             "com.google.android.gms.phenotype"
        //     7: aload_1        
        //     8: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    11: istore_2       
        //    12: iconst_0       
        //    13: istore_3       
        //    14: iload_2        
        //    15: ifne            35
        //    18: ldc             "PhenotypeClientHelper"
        //    20: aload_1        
        //    21: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    24: ldc             " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
        //    26: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    29: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    32: pop            
        //    33: iconst_0       
        //    34: ireturn        
        //    35: getstatic       ke/o4.a:Lcom/google/android/gms/internal/measurement/zzif;
        //    38: invokevirtual   com/google/android/gms/internal/measurement/zzif.zzb:()Z
        //    41: ifeq            57
        //    44: getstatic       ke/o4.a:Lcom/google/android/gms/internal/measurement/zzif;
        //    47: invokevirtual   com/google/android/gms/internal/measurement/zzif.zza:()Ljava/lang/Object;
        //    50: checkcast       Ljava/lang/Boolean;
        //    53: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    56: ireturn        
        //    57: getstatic       ke/o4.b:Ljava/lang/Object;
        //    60: astore_1       
        //    61: aload_1        
        //    62: monitorenter   
        //    63: getstatic       ke/o4.a:Lcom/google/android/gms/internal/measurement/zzif;
        //    66: invokevirtual   com/google/android/gms/internal/measurement/zzif.zzb:()Z
        //    69: ifeq            89
        //    72: getstatic       ke/o4.a:Lcom/google/android/gms/internal/measurement/zzif;
        //    75: invokevirtual   com/google/android/gms/internal/measurement/zzif.zza:()Ljava/lang/Object;
        //    78: checkcast       Ljava/lang/Boolean;
        //    81: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    84: istore_2       
        //    85: aload_1        
        //    86: monitorexit    
        //    87: iload_2        
        //    88: ireturn        
        //    89: ldc             "com.google.android.gms"
        //    91: aload_0        
        //    92: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    95: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    98: ifeq            104
        //   101: goto            164
        //   104: aload_0        
        //   105: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   108: astore          4
        //   110: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   113: bipush          29
        //   115: if_icmpge       124
        //   118: iconst_0       
        //   119: istore          5
        //   121: goto            128
        //   124: ldc             268435456
        //   126: istore          5
        //   128: aload           4
        //   130: ldc             "com.google.android.gms.phenotype"
        //   132: iload           5
        //   134: invokevirtual   android/content/pm/PackageManager.resolveContentProvider:(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
        //   137: astore          4
        //   139: iload_3        
        //   140: istore_2       
        //   141: aload           4
        //   143: ifnull          192
        //   146: ldc             "com.google.android.gms"
        //   148: aload           4
        //   150: getfield        android/content/pm/ProviderInfo.packageName:Ljava/lang/String;
        //   153: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   156: ifne            164
        //   159: iload_3        
        //   160: istore_2       
        //   161: goto            192
        //   164: aload_0        
        //   165: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   168: astore_0       
        //   169: aload_0        
        //   170: ldc             "com.google.android.gms"
        //   172: iconst_0       
        //   173: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   176: astore_0       
        //   177: iload_3        
        //   178: istore_2       
        //   179: aload_0        
        //   180: getfield        android/content/pm/ApplicationInfo.flags:I
        //   183: sipush          129
        //   186: iand           
        //   187: ifeq            192
        //   190: iconst_1       
        //   191: istore_2       
        //   192: iload_2        
        //   193: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   196: invokestatic    com/google/android/gms/internal/measurement/zzif.zzd:(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzif;
        //   199: putstatic       ke/o4.a:Lcom/google/android/gms/internal/measurement/zzif;
        //   202: aload_1        
        //   203: monitorexit    
        //   204: getstatic       ke/o4.a:Lcom/google/android/gms/internal/measurement/zzif;
        //   207: invokevirtual   com/google/android/gms/internal/measurement/zzif.zza:()Ljava/lang/Object;
        //   210: checkcast       Ljava/lang/Boolean;
        //   213: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   216: ireturn        
        //   217: astore_0       
        //   218: aload_1        
        //   219: monitorexit    
        //   220: aload_0        
        //   221: athrow         
        //   222: astore_0       
        //   223: iload_3        
        //   224: istore_2       
        //   225: goto            192
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  63     87     217    222    Any
        //  89     101    217    222    Any
        //  104    118    217    222    Any
        //  128    139    217    222    Any
        //  146    159    217    222    Any
        //  164    169    217    222    Any
        //  169    177    222    228    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  169    177    217    222    Any
        //  179    190    217    222    Any
        //  192    204    217    222    Any
        //  218    220    217    222    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0192:
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
