// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import android.content.Context;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class cj extends cl
{
    public final Map<String, Object> AFInAppEventParameterName;
    
    static {
        Covode.recordClassIndex(2673);
    }
    
    public cj(final Runnable runnable) {
        super("google", runnable);
        this.AFInAppEventParameterName = new HashMap<String, Object>();
    }
    
    public static boolean values(final Context context) {
        ai.valueOf();
        if (ai.AFInAppEventParameterName(ai.values(context), "appsFlyerCount", false) > 0) {
            AFLogger.AFInAppEventParameterName("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (ac.AFKeystoreWrapper(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.AFInAppEventType("Install referrer is allowed");
                return true;
            }
            AFLogger.AFInAppEventType("Install referrer is not allowed");
            return false;
        }
        catch (final ClassNotFoundException ex) {
            final StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            AFLogger.AFInAppEventParameterName(sb.toString());
            return false;
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), t);
            return false;
        }
    }
    
    @Override
    public final void AFKeystoreWrapper(final Context context) {
        if (!values(context)) {
            return;
        }
        this.AFInAppEventType();
        try {
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            AFLogger.AFInAppEventType("Connecting to Install Referrer Library...");
            build.startConnection(new InstallReferrerStateListener() {
                static {
                    Covode.recordClassIndex(2674);
                }
                
                @Override
                public final void onInstallReferrerServiceDisconnected() {
                    AFLogger.AFInAppEventType("Install Referrer service disconnected");
                }
                
                @Override
                public final void onInstallReferrerSetupFinished(final int p0) {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //     4: getfield        com/appsflyer/internal/cj.AFInAppEventParameterName:Ljava/util/Map;
                    //     7: ldc             "code"
                    //     9: iload_1        
                    //    10: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
                    //    13: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //    18: pop            
                    //    19: aload_0        
                    //    20: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //    23: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //    26: ldc             "api_ver"
                    //    28: aload_0        
                    //    29: getfield        com/appsflyer/internal/cj$2.val$context:Landroid/content/Context;
                    //    32: ldc             "com.android.vending"
                    //    34: invokestatic    com/appsflyer/internal/ac.valueOf:(Landroid/content/Context;Ljava/lang/String;)J
                    //    37: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
                    //    40: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //    45: pop            
                    //    46: aload_0        
                    //    47: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //    50: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //    53: ldc             "api_ver_name"
                    //    55: aload_0        
                    //    56: getfield        com/appsflyer/internal/cj$2.val$context:Landroid/content/Context;
                    //    59: ldc             "com.android.vending"
                    //    61: invokestatic    com/appsflyer/internal/ac.values:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
                    //    64: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //    69: pop            
                    //    70: iload_1        
                    //    71: iconst_m1      
                    //    72: if_icmpeq       552
                    //    75: iload_1        
                    //    76: ifeq            194
                    //    79: iload_1        
                    //    80: iconst_1       
                    //    81: if_icmpeq       169
                    //    84: iload_1        
                    //    85: iconst_2       
                    //    86: if_icmpeq       144
                    //    89: iload_1        
                    //    90: iconst_3       
                    //    91: if_icmpeq       119
                    //    94: ldc             "responseCode not found."
                    //    96: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
                    //    99: ldc             "Install Referrer collected locally"
                    //   101: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
                    //   104: aload_0        
                    //   105: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   108: invokevirtual   com/appsflyer/internal/cl.AFKeystoreWrapper:()V
                    //   111: aload_0        
                    //   112: getfield        com/appsflyer/internal/cj$2.val$referrerClient:Lcom/android/installreferrer/api/InstallReferrerClient;
                    //   115: invokevirtual   com/android/installreferrer/api/InstallReferrerClient.endConnection:()V
                    //   118: return         
                    //   119: ldc             "InstallReferrer DEVELOPER_ERROR"
                    //   121: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
                    //   124: aload_0        
                    //   125: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   128: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   131: ldc             "response"
                    //   133: ldc             "DEVELOPER_ERROR"
                    //   135: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   140: pop            
                    //   141: goto            99
                    //   144: ldc             "InstallReferrer FEATURE_NOT_SUPPORTED"
                    //   146: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
                    //   149: aload_0        
                    //   150: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   153: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   156: ldc             "response"
                    //   158: ldc             "FEATURE_NOT_SUPPORTED"
                    //   160: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   165: pop            
                    //   166: goto            99
                    //   169: aload_0        
                    //   170: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   173: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   176: ldc             "response"
                    //   178: ldc             "SERVICE_UNAVAILABLE"
                    //   180: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   185: pop            
                    //   186: ldc             "InstallReferrer not supported"
                    //   188: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
                    //   191: goto            99
                    //   194: aload_0        
                    //   195: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   198: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   201: ldc             "response"
                    //   203: ldc             "OK"
                    //   205: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   210: pop            
                    //   211: ldc             "InstallReferrer connected"
                    //   213: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
                    //   216: aload_0        
                    //   217: getfield        com/appsflyer/internal/cj$2.val$referrerClient:Lcom/android/installreferrer/api/InstallReferrerClient;
                    //   220: invokevirtual   com/android/installreferrer/api/InstallReferrerClient.isReady:()Z
                    //   223: ifeq            478
                    //   226: aload_0        
                    //   227: getfield        com/appsflyer/internal/cj$2.val$referrerClient:Lcom/android/installreferrer/api/InstallReferrerClient;
                    //   230: invokevirtual   com/android/installreferrer/api/InstallReferrerClient.getInstallReferrer:()Lcom/android/installreferrer/api/ReferrerDetails;
                    //   233: astore_2       
                    //   234: aload_2        
                    //   235: invokevirtual   com/android/installreferrer/api/ReferrerDetails.getInstallReferrer:()Ljava/lang/String;
                    //   238: astore_3       
                    //   239: aload_3        
                    //   240: ifnull          275
                    //   243: aload_0        
                    //   244: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   247: getfield        com/appsflyer/internal/cj.AFInAppEventParameterName:Ljava/util/Map;
                    //   250: ldc             "val"
                    //   252: aload_3        
                    //   253: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   258: pop            
                    //   259: aload_0        
                    //   260: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   263: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   266: ldc             "referrer"
                    //   268: aload_3        
                    //   269: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   274: pop            
                    //   275: aload_2        
                    //   276: invokevirtual   com/android/installreferrer/api/ReferrerDetails.getReferrerClickTimestampSeconds:()J
                    //   279: lstore          4
                    //   281: aload_0        
                    //   282: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   285: getfield        com/appsflyer/internal/cj.AFInAppEventParameterName:Ljava/util/Map;
                    //   288: ldc             "clk"
                    //   290: lload           4
                    //   292: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
                    //   295: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   300: pop            
                    //   301: aload_0        
                    //   302: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   305: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   308: ldc             "click_ts"
                    //   310: lload           4
                    //   312: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
                    //   315: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   320: pop            
                    //   321: aload_2        
                    //   322: invokevirtual   com/android/installreferrer/api/ReferrerDetails.getInstallBeginTimestampSeconds:()J
                    //   325: lstore          4
                    //   327: aload_0        
                    //   328: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   331: getfield        com/appsflyer/internal/cj.AFInAppEventParameterName:Ljava/util/Map;
                    //   334: ldc             "install"
                    //   336: lload           4
                    //   338: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
                    //   341: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   346: pop            
                    //   347: aload_0        
                    //   348: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   351: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   354: ldc             "install_begin_ts"
                    //   356: lload           4
                    //   358: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
                    //   361: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   366: pop            
                    //   367: new             Ljava/util/HashMap;
                    //   370: astore_3       
                    //   371: aload_3        
                    //   372: invokespecial   java/util/HashMap.<init>:()V
                    //   375: aload_2        
                    //   376: invokevirtual   com/android/installreferrer/api/ReferrerDetails.getGooglePlayInstantParam:()Z
                    //   379: istore          6
                    //   381: aload_0        
                    //   382: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   385: getfield        com/appsflyer/internal/cj.AFInAppEventParameterName:Ljava/util/Map;
                    //   388: ldc             "instant"
                    //   390: iload           6
                    //   392: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
                    //   395: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   400: pop            
                    //   401: aload_3        
                    //   402: ldc             "instant"
                    //   404: iload           6
                    //   406: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
                    //   409: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   412: pop            
                    //   413: aload_3        
                    //   414: ldc             "click_server_ts"
                    //   416: aload_2        
                    //   417: invokevirtual   com/android/installreferrer/api/ReferrerDetails.getReferrerClickTimestampServerSeconds:()J
                    //   420: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
                    //   423: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   426: pop            
                    //   427: aload_3        
                    //   428: ldc             "install_begin_server_ts"
                    //   430: aload_2        
                    //   431: invokevirtual   com/android/installreferrer/api/ReferrerDetails.getInstallBeginTimestampServerSeconds:()J
                    //   434: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
                    //   437: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   440: pop            
                    //   441: aload_3        
                    //   442: ldc             "install_version"
                    //   444: aload_2        
                    //   445: invokevirtual   com/android/installreferrer/api/ReferrerDetails.getInstallVersion:()Ljava/lang/String;
                    //   448: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   451: pop            
                    //   452: aload_3        
                    //   453: invokevirtual   java/util/HashMap.isEmpty:()Z
                    //   456: ifne            99
                    //   459: aload_0        
                    //   460: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   463: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   466: ldc             "google_custom"
                    //   468: aload_3        
                    //   469: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   474: pop            
                    //   475: goto            99
                    //   478: ldc             "ReferrerClient: InstallReferrer is not ready"
                    //   480: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
                    //   483: aload_0        
                    //   484: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   487: getfield        com/appsflyer/internal/cj.AFInAppEventParameterName:Ljava/util/Map;
                    //   490: ldc             "err"
                    //   492: ldc             "ReferrerClient: InstallReferrer is not ready"
                    //   494: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   499: pop            
                    //   500: goto            99
                    //   503: astore_3       
                    //   504: new             Ljava/lang/StringBuilder;
                    //   507: dup            
                    //   508: ldc             "Failed to get install referrer: "
                    //   510: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   513: astore_2       
                    //   514: aload_2        
                    //   515: aload_3        
                    //   516: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
                    //   519: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                    //   522: pop            
                    //   523: aload_2        
                    //   524: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                    //   527: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
                    //   530: aload_0        
                    //   531: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   534: getfield        com/appsflyer/internal/cj.AFInAppEventParameterName:Ljava/util/Map;
                    //   537: ldc             "err"
                    //   539: aload_3        
                    //   540: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
                    //   543: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   548: pop            
                    //   549: goto            99
                    //   552: ldc             "InstallReferrer SERVICE_DISCONNECTED"
                    //   554: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
                    //   557: aload_0        
                    //   558: getfield        com/appsflyer/internal/cj$2.this$0:Lcom/appsflyer/internal/cj;
                    //   561: getfield        com/appsflyer/internal/cl.values:Ljava/util/Map;
                    //   564: ldc             "response"
                    //   566: ldc             "SERVICE_DISCONNECTED"
                    //   568: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   573: pop            
                    //   574: goto            99
                    //   577: astore          7
                    //   579: goto            413
                    //   582: astore_2       
                    //   583: goto            452
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type                         
                    //  -----  -----  -----  -----  -----------------------------
                    //  211    239    503    552    Any
                    //  243    275    503    552    Any
                    //  275    375    503    552    Any
                    //  375    413    577    582    Ljava/lang/NoSuchMethodError;
                    //  375    413    503    552    Any
                    //  413    452    582    586    Ljava/lang/NoSuchMethodError;
                    //  413    452    503    552    Any
                    //  452    475    503    552    Any
                    //  478    500    503    552    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IndexOutOfBoundsException: Index: 257, Size: 257
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
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1151)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
            });
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("referrerClient -> startConnection", t);
        }
    }
}
