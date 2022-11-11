// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import X.5an;
import X.5dv;
import X.5aq;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class ae extends ax<String>
{
    static {
        Covode.recordClassIndex(2580);
    }
    
    public ae(final Context context) {
        super(context, "com.facebook.katana.provider.AttributionIdProvider", new String[] { "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1" });
    }
    
    private String AFKeystoreWrapper() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/appsflyer/internal/ax.AFInAppEventType:Landroid/content/Context;
        //     4: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     7: astore_1       
        //     8: new             Ljava/lang/StringBuilder;
        //    11: astore_2       
        //    12: aload_2        
        //    13: ldc             "content://"
        //    15: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    18: aload_2        
        //    19: aload_0        
        //    20: getfield        com/appsflyer/internal/ax.values:Ljava/lang/String;
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: pop            
        //    27: aload_1        
        //    28: aload_2        
        //    29: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    32: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    35: iconst_1       
        //    36: anewarray       Ljava/lang/String;
        //    39: dup            
        //    40: iconst_0       
        //    41: ldc             "aid"
        //    43: aastore        
        //    44: aconst_null    
        //    45: aconst_null    
        //    46: aconst_null    
        //    47: invokestatic    com/appsflyer/internal/ae.com_appsflyer_internal_ae_android_content_ContentResolver_query:(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    50: astore_1       
        //    51: aload_1        
        //    52: ifnull          87
        //    55: aload_1        
        //    56: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    61: ifeq            87
        //    64: aload_1        
        //    65: aload_1        
        //    66: ldc             "aid"
        //    68: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //    73: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    78: astore_2       
        //    79: aload_1        
        //    80: invokeinterface android/database/Cursor.close:()V
        //    85: aload_2        
        //    86: areturn        
        //    87: aload_1        
        //    88: ifnull          97
        //    91: aload_1        
        //    92: invokeinterface android/database/Cursor.close:()V
        //    97: aconst_null    
        //    98: areturn        
        //    99: astore_2       
        //   100: aconst_null    
        //   101: astore_1       
        //   102: goto            106
        //   105: astore_2       
        //   106: aload_1        
        //   107: ifnull          116
        //   110: aload_1        
        //   111: invokeinterface android/database/Cursor.close:()V
        //   116: aload_2        
        //   117: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      51     99     105    Any
        //  55     79     105    106    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    public static Cursor com_appsflyer_internal_ae_android_content_ContentResolver_query(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        MethodCollector.i(114);
        final 5an liz = new 5aq().LIZ(240004, "android/content/ContentResolver", "query", (Object)contentResolver, new Object[] { uri, array, s, array2, s2 }, "android.database.Cursor", new 5dv(false));
        Cursor query;
        if (liz.LIZ) {
            query = (Cursor)liz.LIZIZ;
        }
        else {
            query = contentResolver.query(uri, array, s, array2, s2);
        }
        MethodCollector.o(114);
        return query;
    }
    
    public final String AFInAppEventType() {
        new PthreadThread((Runnable)super.valueOf, "r/internal/ae").start();
        return super.valueOf();
    }
}
