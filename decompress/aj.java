// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import android.content.Context;
import android.text.TextUtils;
import X.6Tl;
import X.NQO;
import android.content.pm.PackageInfo;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.appsflyer.AFLogger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import X.0II;
import com.appsflyer.AppsFlyerLib;
import android.content.pm.PackageManager;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

public final class aj
{
    public static aj AFInAppEventParameterName;
    public static String valueOf;
    public JSONObject AFInAppEventType;
    public boolean AFKeystoreWrapper;
    public int AFLogger$LogLevel;
    public final List<String> AFVersionDeclaration;
    public boolean AppsFlyer2dXConversionCallback;
    public String getLevel;
    public boolean init;
    public boolean values;
    
    static {
        Covode.recordClassIndex(2603);
        aj.valueOf = "https://%smonitorsdk.%s/remote-debug?app_id=";
    }
    
    public aj() {
        this.AFKeystoreWrapper = true;
        this.AFVersionDeclaration = new ArrayList<String>();
        this.AFLogger$LogLevel = 0;
        this.getLevel = "-1";
        final boolean boolean1 = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
        this.AppsFlyer2dXConversionCallback = boolean1;
        this.values = (true ^ boolean1);
        this.AFLogger$LogLevel = 0;
        this.init = false;
    }
    
    public static aj AFInAppEventParameterName() {
        if (aj.AFInAppEventParameterName == null) {
            aj.AFInAppEventParameterName = new aj();
        }
        return aj.AFInAppEventParameterName;
    }
    
    public static void AFInAppEventParameterName(final String s, final PackageManager packageManager) {
        try {
            if (aj.AFInAppEventParameterName == null) {
                aj.AFInAppEventParameterName = new aj();
            }
            aj.AFInAppEventParameterName.AFInAppEventType(s, packageManager);
            if (aj.AFInAppEventParameterName == null) {
                aj.AFInAppEventParameterName = new aj();
            }
            final String afVersionDeclaration = aj.AFInAppEventParameterName.AFVersionDeclaration();
            final bz bz = new bz();
            bz.onInstallConversionDataLoadedNative = afVersionDeclaration;
            bz.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
            final StringBuilder sb = new StringBuilder();
            sb.append(0II.LIZ(aj.valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }));
            sb.append(s);
            bz.valueOf(sb.toString());
            new PthreadThread((Runnable)new ah(bz), "r/internal/aj").start();
        }
        finally {
            final Throwable t;
            AFLogger.valueOf(t);
        }
    }
    
    private void AFInAppEventType(final String p0, final PackageManager p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: sipush          330
        //     5: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     8: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //    11: astore_3       
        //    12: invokestatic    com/appsflyer/internal/ai.valueOf:()Lcom/appsflyer/internal/ai;
        //    15: astore          4
        //    17: aload_3        
        //    18: ldc             "remote_debug_static_data"
        //    20: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    23: astore          5
        //    25: aload           5
        //    27: ifnull          48
        //    30: new             Lorg/json/JSONObject;
        //    33: astore_1       
        //    34: aload_1        
        //    35: aload           5
        //    37: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    40: aload_0        
        //    41: aload_1        
        //    42: putfield        com/appsflyer/internal/aj.AFInAppEventType:Lorg/json/JSONObject;
        //    45: goto            183
        //    48: new             Lorg/json/JSONObject;
        //    51: astore          5
        //    53: aload           5
        //    55: invokespecial   org/json/JSONObject.<init>:()V
        //    58: aload_0        
        //    59: aload           5
        //    61: putfield        com/appsflyer/internal/aj.AFInAppEventType:Lorg/json/JSONObject;
        //    64: aload_0        
        //    65: getstatic       android/os/Build.BRAND:Ljava/lang/String;
        //    68: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //    71: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //    74: aload_3        
        //    75: ldc             "advertiserId"
        //    77: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    80: aload           4
        //    82: getfield        com/appsflyer/internal/ai.AFVersionDeclaration:Ljava/lang/String;
        //    85: aload           4
        //    87: getfield        com/appsflyer/internal/ai.getLevel:Ljava/lang/String;
        //    90: invokespecial   com/appsflyer/internal/aj.values:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    93: new             Ljava/lang/StringBuilder;
        //    96: astore          5
        //    98: aload           5
        //   100: ldc             "6.4.0."
        //   102: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   105: aload           5
        //   107: getstatic       com/appsflyer/internal/ai.AFInAppEventParameterName:Ljava/lang/String;
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: pop            
        //   114: aload_0        
        //   115: aload           5
        //   117: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   120: aload_3        
        //   121: ldc             "AppsFlyerKey"
        //   123: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   126: aload_3        
        //   127: ldc             "KSAppsFlyerId"
        //   129: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   132: aload_3        
        //   133: ldc             "uid"
        //   135: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   138: invokespecial   com/appsflyer/internal/aj.AFKeystoreWrapper:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   141: aload_0        
        //   142: aload_1        
        //   143: aload_2        
        //   144: aload_1        
        //   145: iconst_0       
        //   146: invokestatic    com/appsflyer/internal/aj.INVOKEVIRTUAL_com_appsflyer_internal_aj_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo:(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   149: getfield        android/content/pm/PackageInfo.versionCode:I
        //   152: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   155: aload_3        
        //   156: ldc             "channel"
        //   158: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   161: aload_3        
        //   162: ldc             "preInstallName"
        //   164: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   167: invokespecial   com/appsflyer/internal/aj.AFInAppEventType:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   170: aload_3        
        //   171: ldc             "remote_debug_static_data"
        //   173: aload_0        
        //   174: getfield        com/appsflyer/internal/aj.AFInAppEventType:Lorg/json/JSONObject;
        //   177: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   180: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   183: aload_0        
        //   184: getfield        com/appsflyer/internal/aj.AFInAppEventType:Lorg/json/JSONObject;
        //   187: ldc             "launch_counter"
        //   189: aload_0        
        //   190: getfield        com/appsflyer/internal/aj.getLevel:Ljava/lang/String;
        //   193: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   196: pop            
        //   197: sipush          330
        //   200: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   203: aload_0        
        //   204: monitorexit    
        //   205: return         
        //   206: astore_1       
        //   207: aload_1        
        //   208: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   211: sipush          330
        //   214: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   217: aload_0        
        //   218: monitorexit    
        //   219: return         
        //   220: astore_1       
        //   221: aload_0        
        //   222: monitorexit    
        //   223: aload_1        
        //   224: athrow         
        //   225: astore_1       
        //   226: goto            183
        //   229: astore_1       
        //   230: goto            170
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  2      25     220    225    Any
        //  30     45     225    229    Any
        //  48     141    220    225    Any
        //  141    170    229    233    Any
        //  170    183    220    225    Any
        //  183    197    206    220    Lorg/json/JSONException;
        //  183    197    220    225    Any
        //  197    203    220    225    Any
        //  207    217    220    225    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
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
    
    private void AFInAppEventType(final String s, final String s2, final String s3, final String s4) {
        synchronized (this) {
            MethodCollector.i(3320);
            while (true) {
                if (s != null) {
                    try {
                        if (s.length() > 0) {
                            this.AFInAppEventType.put("app_id", (Object)s);
                        }
                        if (s2 != null && s2.length() > 0) {
                            this.AFInAppEventType.put("app_version", (Object)s2);
                        }
                        if (s3 != null && s3.length() > 0) {
                            this.AFInAppEventType.put("channel", (Object)s3);
                        }
                        if (s4 != null && s4.length() > 0) {
                            this.AFInAppEventType.put("preInstall", (Object)s4);
                        }
                    }
                    finally {
                        MethodCollector.o(3320);
                        return;
                    }
                    MethodCollector.o(3320);
                    return;
                }
                continue;
            }
        }
    }
    
    public static String[] AFInAppEventType(final String s, final StackTraceElement[] array) {
        int i = 1;
        if (array == null) {
            return new String[] { s };
        }
        final String[] array2 = new String[array.length + 1];
        array2[0] = s;
        while (i < array.length) {
            array2[i] = array[i].toString();
            ++i;
        }
        return array2;
    }
    
    private void AFKeystoreWrapper(final String s, final String s2, final String s3, final String s4) {
        synchronized (this) {
            MethodCollector.i(266);
            try {
                this.AFInAppEventType.put("sdk_version", (Object)s);
                if (s2 != null && s2.length() > 0) {
                    this.AFInAppEventType.put("devkey", (Object)s2);
                }
                if (s3 != null && s3.length() > 0) {
                    this.AFInAppEventType.put("originalAppsFlyerId", (Object)s3);
                }
                if (s4 != null && s4.length() > 0) {
                    this.AFInAppEventType.put("uid", (Object)s4);
                }
                MethodCollector.o(266);
            }
            finally {
                MethodCollector.o(266);
            }
        }
    }
    
    private boolean AFLogger$LogLevel() {
        return this.values && (this.AFKeystoreWrapper || this.init);
    }
    
    private String AFVersionDeclaration() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: sipush          5990
        //     5: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     8: aconst_null    
        //     9: astore_1       
        //    10: aload_1        
        //    11: astore_2       
        //    12: aload_0        
        //    13: getfield        com/appsflyer/internal/aj.AFInAppEventType:Lorg/json/JSONObject;
        //    16: astore_3       
        //    17: aload_1        
        //    18: astore_2       
        //    19: new             Lorg/json/JSONArray;
        //    22: astore          4
        //    24: aload_1        
        //    25: astore_2       
        //    26: aload           4
        //    28: aload_0        
        //    29: getfield        com/appsflyer/internal/aj.AFVersionDeclaration:Ljava/util/List;
        //    32: invokespecial   org/json/JSONArray.<init>:(Ljava/util/Collection;)V
        //    35: aload_1        
        //    36: astore_2       
        //    37: aload_3        
        //    38: ldc_w           "data"
        //    41: aload           4
        //    43: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    46: pop            
        //    47: aload_1        
        //    48: astore_2       
        //    49: aload_0        
        //    50: getfield        com/appsflyer/internal/aj.AFInAppEventType:Lorg/json/JSONObject;
        //    53: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //    56: astore_1       
        //    57: aload_1        
        //    58: astore_2       
        //    59: aload_0        
        //    60: invokespecial   com/appsflyer/internal/aj.init:()V
        //    63: aload_1        
        //    64: astore_2       
        //    65: sipush          5990
        //    68: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    71: aload_0        
        //    72: monitorexit    
        //    73: aload_2        
        //    74: areturn        
        //    75: astore_2       
        //    76: aload_0        
        //    77: monitorexit    
        //    78: aload_2        
        //    79: athrow         
        //    80: astore_1       
        //    81: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  2      8      75     80     Any
        //  12     17     80     84     Lorg/json/JSONException;
        //  12     17     75     80     Any
        //  19     24     80     84     Lorg/json/JSONException;
        //  19     24     75     80     Any
        //  26     35     80     84     Lorg/json/JSONException;
        //  26     35     75     80     Any
        //  37     47     80     84     Lorg/json/JSONException;
        //  37     47     75     80     Any
        //  49     57     80     84     Lorg/json/JSONException;
        //  49     57     75     80     Any
        //  59     63     80     84     Lorg/json/JSONException;
        //  59     63     75     80     Any
        //  65     71     75     80     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public static PackageInfo INVOKEVIRTUAL_com_appsflyer_internal_aj_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(final PackageManager packageManager, final String s, final int n) {
        final Context liz = NQO.LJJ.LIZ();
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 128) {
            if (6Tl.LIZIZ == null) {
                6Tl.LIZIZ = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LIZIZ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 0) {
            if (6Tl.LIZLLL == null) {
                6Tl.LIZLLL = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LIZLLL;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 64) {
            if (6Tl.LJ == null) {
                6Tl.LJ = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LJ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 8) {
            if (6Tl.LJFF == null) {
                6Tl.LJFF = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LJFF;
        }
        return packageManager.getPackageInfo(s, n);
    }
    
    private void init() {
        synchronized (this) {
            MethodCollector.i(4714);
            this.AFVersionDeclaration.clear();
            this.AFLogger$LogLevel = 0;
            MethodCollector.o(4714);
        }
    }
    
    private void values(final String s, final String s2, final String s3, final String s4, final String s5, final String s6) {
        synchronized (this) {
            MethodCollector.i(4650);
            try {
                this.AFInAppEventType.put("brand", (Object)s);
                this.AFInAppEventType.put("model", (Object)s2);
                this.AFInAppEventType.put("platform", (Object)"Android");
                this.AFInAppEventType.put("platform_version", (Object)s3);
                if (s4 != null && s4.length() > 0) {
                    this.AFInAppEventType.put("advertiserId", (Object)s4);
                }
                if (s5 != null && s5.length() > 0) {
                    this.AFInAppEventType.put("imei", (Object)s5);
                }
                if (s6 != null && s6.length() > 0) {
                    this.AFInAppEventType.put("android_id", (Object)s6);
                }
                MethodCollector.o(4650);
            }
            finally {
                MethodCollector.o(4650);
            }
        }
    }
    
    public final void AFInAppEventType() {
        synchronized (this) {
            MethodCollector.i(4654);
            this.init = true;
            this.AFInAppEventType("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(System.currentTimeMillis()), new String[0]);
            MethodCollector.o(4654);
        }
    }
    
    public final void AFInAppEventType(final String getLevel) {
        synchronized (this) {
            MethodCollector.i(4007);
            this.getLevel = getLevel;
            MethodCollector.o(4007);
        }
    }
    
    public final void AFInAppEventType(String s, final String s2, final String... array) {
        synchronized (this) {
            MethodCollector.i(5018);
            if (!this.AFLogger$LogLevel() || this.AFLogger$LogLevel >= 98304) {
                MethodCollector.o(5018);
                return;
            }
            try {
                final long currentTimeMillis = System.currentTimeMillis();
                final String join = TextUtils.join((CharSequence)", ", (Object[])array);
                if (s != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(currentTimeMillis);
                    sb.append(" ");
                    sb.append(Thread.currentThread().getId());
                    sb.append(" _/AppsFlyer_6.4.0 [");
                    sb.append(s);
                    sb.append("] ");
                    sb.append(s2);
                    sb.append(" ");
                    sb.append(join);
                    s = sb.toString();
                }
                else {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(currentTimeMillis);
                    sb2.append(" ");
                    sb2.append(Thread.currentThread().getId());
                    sb2.append(" ");
                    sb2.append(s2);
                    sb2.append("/AppsFlyer_6.4.0 ");
                    sb2.append(join);
                    s = sb2.toString();
                }
                this.AFVersionDeclaration.add(s);
                this.AFLogger$LogLevel += s.length() << 1;
                MethodCollector.o(5018);
            }
            finally {
                MethodCollector.o(5018);
            }
        }
    }
    
    public final void AFKeystoreWrapper() {
        synchronized (this) {
            MethodCollector.i(273);
            this.AFInAppEventType = null;
            aj.AFInAppEventParameterName = null;
            MethodCollector.o(273);
        }
    }
    
    public final boolean getLevel() {
        return this.init;
    }
    
    public final void valueOf() {
        synchronized (this) {
            MethodCollector.i(57);
            this.AFKeystoreWrapper = false;
            this.init();
            MethodCollector.o(57);
        }
    }
    
    public final void values() {
        synchronized (this) {
            MethodCollector.i(78);
            this.AFInAppEventType("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(System.currentTimeMillis()), new String[0]);
            this.init = false;
            this.AFKeystoreWrapper = false;
            MethodCollector.o(78);
        }
    }
}
