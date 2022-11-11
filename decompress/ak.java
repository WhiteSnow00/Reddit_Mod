// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import X.608;
import X.4F0;
import com.bytedance.ies.abmock.SettingsManager;
import X.609;
import X.NIJ;
import X.5ek;
import X.46U;
import android.os.Build$VERSION;
import X.3xs;
import android.content.SharedPreferences$Editor;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.AFLogger;
import java.security.SecureRandom;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.io.File;
import com.bytedance.covode.number.Covode;

public final class ak
{
    public static String AFKeystoreWrapper;
    
    static {
        Covode.recordClassIndex(2604);
    }
    
    public static String AFInAppEventParameterName(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: aconst_null    
        //     3: astore_2       
        //     4: aconst_null    
        //     5: astore_3       
        //     6: aload_2        
        //     7: astore          4
        //     9: new             Ljava/io/RandomAccessFile;
        //    12: astore          5
        //    14: aload_2        
        //    15: astore          4
        //    17: aload           5
        //    19: aload_0        
        //    20: ldc             "r"
        //    22: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    25: aload_3        
        //    26: astore_0       
        //    27: aload           5
        //    29: invokevirtual   java/io/RandomAccessFile.length:()J
        //    32: l2i            
        //    33: newarray        B
        //    35: astore          4
        //    37: aload           4
        //    39: astore_0       
        //    40: aload           5
        //    42: aload           4
        //    44: invokevirtual   java/io/RandomAccessFile.readFully:([B)V
        //    47: aload           4
        //    49: astore_0       
        //    50: aload           5
        //    52: invokevirtual   java/io/RandomAccessFile.close:()V
        //    55: aload           5
        //    57: invokevirtual   java/io/RandomAccessFile.close:()V
        //    60: aload           4
        //    62: astore_0       
        //    63: goto            121
        //    66: astore_3       
        //    67: goto            76
        //    70: astore_3       
        //    71: aconst_null    
        //    72: astore_0       
        //    73: aload_1        
        //    74: astore          5
        //    76: aload           5
        //    78: astore          4
        //    80: ldc             "Exception while reading InstallationFile: "
        //    82: aload_3        
        //    83: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    86: aload           5
        //    88: ifnull          108
        //    91: aload           5
        //    93: invokevirtual   java/io/RandomAccessFile.close:()V
        //    96: goto            108
        //    99: astore          4
        //   101: ldc             "Exception while trying to close the InstallationFile"
        //   103: aload           4
        //   105: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   108: goto            121
        //   111: astore_0       
        //   112: ldc             "Exception while trying to close the InstallationFile"
        //   114: aload_0        
        //   115: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   118: aload           4
        //   120: astore_0       
        //   121: aload_0        
        //   122: ifnull          134
        //   125: new             Ljava/lang/String;
        //   128: dup            
        //   129: aload_0        
        //   130: invokespecial   java/lang/String.<init>:([B)V
        //   133: areturn        
        //   134: iconst_0       
        //   135: newarray        B
        //   137: astore_0       
        //   138: goto            125
        //   141: astore_0       
        //   142: goto            150
        //   145: astore_0       
        //   146: aload           5
        //   148: astore          4
        //   150: aload           4
        //   152: ifnull          172
        //   155: aload           4
        //   157: invokevirtual   java/io/RandomAccessFile.close:()V
        //   160: goto            172
        //   163: astore          4
        //   165: ldc             "Exception while trying to close the InstallationFile"
        //   167: aload           4
        //   169: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   172: aload_0        
        //   173: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      14     70     76     Ljava/io/IOException;
        //  9      14     141    145    Any
        //  17     25     70     76     Ljava/io/IOException;
        //  17     25     141    145    Any
        //  27     37     66     70     Ljava/io/IOException;
        //  27     37     145    150    Any
        //  40     47     66     70     Ljava/io/IOException;
        //  40     47     145    150    Any
        //  50     55     66     70     Ljava/io/IOException;
        //  50     55     145    150    Any
        //  55     60     111    121    Ljava/io/IOException;
        //  80     86     141    145    Any
        //  91     96     99     108    Ljava/io/IOException;
        //  155    160    163    172    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
    
    public static String AFInAppEventParameterName(final WeakReference<Context> weakReference) {
        synchronized (ak.class) {
            MethodCollector.i(4327);
            if (weakReference.get() == null) {
                final String afKeystoreWrapper = ak.AFKeystoreWrapper;
                MethodCollector.o(4327);
                return afKeystoreWrapper;
            }
            if (ak.AFKeystoreWrapper == null) {
                final Object value = weakReference.get();
                String string = null;
                if (value != null) {
                    string = ai.values(weakReference.get()).getString("AF_INSTALLATION", (String)null);
                }
                Label_0222: {
                    if (string == null) {
                        try {
                            final File file = new File(INVOKEVIRTUAL_com_appsflyer_internal_ak_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(weakReference.get()), "AF_INSTALLATION");
                            if (!file.exists()) {
                                final long currentTimeMillis = System.currentTimeMillis();
                                final StringBuilder sb = new StringBuilder();
                                sb.append(currentTimeMillis);
                                sb.append("-");
                                sb.append(Math.abs(new SecureRandom().nextLong()));
                                ak.AFKeystoreWrapper = sb.toString();
                            }
                            else {
                                ak.AFKeystoreWrapper = AFInAppEventParameterName(file);
                                INVOKEVIRTUAL_com_appsflyer_internal_ak_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                            }
                            final String afKeystoreWrapper2 = ak.AFKeystoreWrapper;
                            final SharedPreferences$Editor edit = ai.values(weakReference.get()).edit();
                            edit.putString("AF_INSTALLATION", afKeystoreWrapper2);
                            INVOKEINTERFACE_com_appsflyer_internal_ak_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
                            break Label_0222;
                        }
                        catch (final Exception ex) {
                            AFLogger.valueOf("Error getting AF unique ID", ex);
                            break Label_0222;
                        }
                    }
                    ak.AFKeystoreWrapper = string;
                }
                if (ak.AFKeystoreWrapper != null) {
                    AppsFlyerProperties.getInstance().set("uid", ak.AFKeystoreWrapper);
                }
            }
            final String afKeystoreWrapper3 = ak.AFKeystoreWrapper;
            MethodCollector.o(4327);
            return afKeystoreWrapper3;
        }
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_internal_ak_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
        if (!3xs.LIZ() || Build$VERSION.SDK_INT < 26) {
            sharedPreferences$Editor.apply();
            return;
        }
        if (!sharedPreferences$Editor.getClass().getName().equals("android.app.SharedPreferencesImpl$EditorImpl")) {
            sharedPreferences$Editor.apply();
            return;
        }
        final Object liz = 46U.LIZ((Object)sharedPreferences$Editor);
        if (liz == null || !46U.LIZIZ((Object)sharedPreferences$Editor, liz)) {
            sharedPreferences$Editor.apply();
            if (liz == null) {
                return;
            }
        }
        46U.LIZ((Object)sharedPreferences$Editor, liz);
    }
    
    public static File INVOKEVIRTUAL_com_appsflyer_internal_ak_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(final Context context) {
        if (5ek.LIZJ == null || !5ek.LJ) {
            return 5ek.LIZJ = context.getFilesDir();
        }
        return 5ek.LIZJ;
    }
    
    public static boolean INVOKEVIRTUAL_com_appsflyer_internal_ak_com_ss_android_ugc_aweme_storage_FileLancet_delete(final File file) {
        MethodCollector.i(7343);
        while (true) {
            try {
                609 liz;
                if (NIJ.LIZIZ()) {
                    liz = (609)SettingsManager.LIZ().LIZ("storage_intercepter_key", (Class)609.class, (Object)4F0.LIZ);
                }
                else {
                    liz = 4F0.LIZ;
                }
                if (608.LIZ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_delete_log", 608.LIZ(liz));
                }
                if (608.LIZJ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_handle", 608.LIZ(liz));
                    MethodCollector.o(7343);
                    return false;
                }
                final boolean delete = file.delete();
                MethodCollector.o(7343);
                return delete;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
