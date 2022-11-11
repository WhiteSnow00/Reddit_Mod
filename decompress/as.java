// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class as
{
    static {
        Covode.recordClassIndex(2620);
    }
    
    public static JSONObject valueOf(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: new             Lorg/json/JSONObject;
        //     5: astore_2       
        //     6: aload_2        
        //     7: aload_0        
        //     8: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    11: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //    14: ldc             "disableProxy"
        //    16: iconst_0       
        //    17: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //    20: istore_3       
        //    21: aload_2        
        //    22: ldc             "monitor"
        //    24: iconst_0       
        //    25: invokevirtual   org/json/JSONObject.optBoolean:(Ljava/lang/String;Z)Z
        //    28: ifeq            38
        //    31: iload_3        
        //    32: ifne            38
        //    35: goto            53
        //    38: invokestatic    com/appsflyer/internal/aj.AFInAppEventParameterName:()Lcom/appsflyer/internal/aj;
        //    41: invokevirtual   com/appsflyer/internal/aj.valueOf:()V
        //    44: invokestatic    com/appsflyer/internal/aj.AFInAppEventParameterName:()Lcom/appsflyer/internal/aj;
        //    47: invokevirtual   com/appsflyer/internal/aj.values:()V
        //    50: goto            59
        //    53: invokestatic    com/appsflyer/internal/aj.AFInAppEventParameterName:()Lcom/appsflyer/internal/aj;
        //    56: invokevirtual   com/appsflyer/internal/aj.AFInAppEventType:()V
        //    59: aload_2        
        //    60: astore_0       
        //    61: aload_2        
        //    62: ldc             "ol_id"
        //    64: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //    67: ifeq            176
        //    70: aload_2        
        //    71: ldc             "ol_scheme"
        //    73: aconst_null    
        //    74: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    77: astore_0       
        //    78: aload_2        
        //    79: ldc             "ol_domain"
        //    81: aconst_null    
        //    82: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    85: astore_1       
        //    86: aload_2        
        //    87: ldc             "ol_ver"
        //    89: aconst_null    
        //    90: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    93: astore          4
        //    95: aload_0        
        //    96: ifnull          108
        //    99: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   102: ldc             "onelinkScheme"
        //   104: aload_0        
        //   105: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   108: aload_1        
        //   109: ifnull          121
        //   112: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   115: ldc             "onelinkDomain"
        //   117: aload_1        
        //   118: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   121: aload_2        
        //   122: astore_0       
        //   123: aload           4
        //   125: ifnull          176
        //   128: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   131: ldc             "onelinkVersion"
        //   133: aload           4
        //   135: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   138: aload_2        
        //   139: astore_0       
        //   140: goto            176
        //   143: astore          4
        //   145: aload_1        
        //   146: astore_0       
        //   147: goto            154
        //   150: astore          4
        //   152: aload_2        
        //   153: astore_0       
        //   154: aload           4
        //   156: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   159: aload           4
        //   161: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   164: invokestatic    com/appsflyer/internal/aj.AFInAppEventParameterName:()Lcom/appsflyer/internal/aj;
        //   167: invokevirtual   com/appsflyer/internal/aj.valueOf:()V
        //   170: invokestatic    com/appsflyer/internal/aj.AFInAppEventParameterName:()Lcom/appsflyer/internal/aj;
        //   173: invokevirtual   com/appsflyer/internal/aj.values:()V
        //   176: aload_0        
        //   177: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      11     143    150    Any
        //  11     31     150    154    Any
        //  38     50     150    154    Any
        //  53     59     150    154    Any
        //  61     95     150    154    Any
        //  99     108    150    154    Any
        //  112    121    150    154    Any
        //  128    138    150    154    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
