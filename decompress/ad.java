// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import X.6rk;
import com.appsflyer.oaid.OaidClient$Info;
import com.appsflyer.oaid.OaidClient;
import X.5an;
import X.5dv;
import X.5aq;
import X.6Tl;
import com.google.android.gms.common.GoogleApiAvailability;
import X.2bx;
import android.text.TextUtils;
import android.content.Context;
import com.appsflyer.AFLogger;
import android.provider.Settings$Secure;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import android.content.ContentResolver;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import com.android.billingclient.api.Purchase;
import java.util.List;
import com.appsflyer.compat.function.Function;
import com.appsflyer.compat.function.Consumer;

public final class ad
{
    public static String AFInAppEventParameterName;
    public static Boolean AFKeystoreWrapper;
    public final Consumer<String> AFInAppEventType;
    public final boolean init;
    public final Consumer<String> valueOf;
    public final Function<List<Purchase>, Map<String, String>> values;
    
    static {
        Covode.recordClassIndex(2579);
    }
    
    public ad() {
    }
    
    public ad(final Function<List<Purchase>, Map<String, String>> values, final Consumer<String> afInAppEventType, final Consumer<String> valueOf, final boolean init) {
        this.values = values;
        this.AFInAppEventType = afInAppEventType;
        this.valueOf = valueOf;
        this.init = init;
    }
    
    public static c.d.b AFInAppEventParameterName(final ContentResolver contentResolver) {
        final boolean values = values();
        final c.d.b b = null;
        if (!values) {
            return null;
        }
        if (contentResolver == null) {
            return null;
        }
        c.d.b b2 = b;
        if (AppsFlyerProperties.getInstance().getString("amazon_aid") == null) {
            b2 = b;
            if ("Amazon".equals(Build.MANUFACTURER)) {
                final int int1 = Settings$Secure.getInt(contentResolver, "limit_ad_tracking", 2);
                if (int1 == 0) {
                    b2 = new c.d.b(INVOKESTATIC_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(contentResolver, "advertising_id"), Boolean.FALSE);
                }
                else if (int1 == 2) {
                    b2 = b;
                }
                else {
                    String s = null;
                    try {
                        INVOKESTATIC_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(contentResolver, "advertising_id");
                    }
                    finally {
                        final Throwable t;
                        AFLogger.valueOf("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", t);
                        s = "";
                    }
                    b2 = new c.d.b(s, Boolean.TRUE);
                }
            }
        }
        return b2;
    }
    
    public static c.d.b AFInAppEventType(final Context p0, final Map<String, Object> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            8
        //     6: aconst_null    
        //     7: areturn        
        //     8: ldc             "Trying to fetch GAID.."
        //    10: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: astore_2       
        //    21: iconst_m1      
        //    22: istore_3       
        //    23: invokestatic    com/google/android/gms/common/GoogleApiAvailability.getInstance:()Lcom/google/android/gms/common/GoogleApiAvailability;
        //    26: aload_0        
        //    27: invokestatic    com/appsflyer/internal/ad.INVOKEVIRTUAL_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_isGooglePlayServicesAvailable:(Lcom/google/android/gms/common/GoogleApiAvailability;Landroid/content/Context;)I
        //    30: istore          4
        //    32: ldc             "com.google.android.gms.a.a.a"
        //    34: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    37: pop            
        //    38: aload_0        
        //    39: invokestatic    com/google/android/gms/a/a/a.LIZ:(Landroid/content/Context;)Lcom/google/android/gms/a/a/a$a;
        //    42: astore          5
        //    44: aload           5
        //    46: ifnull          89
        //    49: aload           5
        //    51: getfield        com/google/android/gms/a/a/a$a.LIZ:Ljava/lang/String;
        //    54: astore          6
        //    56: aload           5
        //    58: getfield        com/google/android/gms/a/a/a$a.LIZIZ:Z
        //    61: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    64: astore          5
        //    66: aload           6
        //    68: ifnull          79
        //    71: aload           6
        //    73: invokevirtual   java/lang/String.length:()I
        //    76: ifne            362
        //    79: aload_2        
        //    80: ldc             "emptyOrNull |"
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: pop            
        //    86: goto            362
        //    89: aload_2        
        //    90: ldc             "gpsAdInfo-null |"
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: pop            
        //    96: new             Ljava/lang/IllegalStateException;
        //    99: astore          5
        //   101: aload           5
        //   103: ldc             "GpsAdIndo is null"
        //   105: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   108: aload           5
        //   110: athrow         
        //   111: astore          5
        //   113: aconst_null    
        //   114: astore          6
        //   116: goto            121
        //   119: astore          5
        //   121: aconst_null    
        //   122: astore          7
        //   124: iconst_0       
        //   125: istore          8
        //   127: aload           5
        //   129: astore          9
        //   131: aload           7
        //   133: astore          5
        //   135: goto            143
        //   138: astore          9
        //   140: iconst_1       
        //   141: istore          8
        //   143: aload           9
        //   145: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   148: aload           9
        //   150: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   153: aload_2        
        //   154: aload           9
        //   156: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   159: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   165: pop            
        //   166: aload_2        
        //   167: ldc             " |"
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: pop            
        //   173: ldc             "WARNING: Google Play Services is missing."
        //   175: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   178: iload           8
        //   180: istore          10
        //   182: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   185: ldc             "enableGpsFallback"
        //   187: iconst_1       
        //   188: invokevirtual   com/appsflyer/AppsFlyerProperties.getBoolean:(Ljava/lang/String;Z)Z
        //   191: ifeq            365
        //   194: aload_0        
        //   195: invokestatic    com/appsflyer/internal/aa.values:(Landroid/content/Context;)Lcom/appsflyer/internal/aa$d;
        //   198: astore          5
        //   200: aload           5
        //   202: getfield        com/appsflyer/internal/aa$d.valueOf:Ljava/lang/String;
        //   205: astore          9
        //   207: aload           5
        //   209: invokevirtual   com/appsflyer/internal/aa$d.valueOf:()Z
        //   212: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   215: astore          7
        //   217: aload           9
        //   219: ifnull          242
        //   222: aload           7
        //   224: astore          5
        //   226: aload           9
        //   228: astore          6
        //   230: iload           8
        //   232: istore          10
        //   234: aload           9
        //   236: invokevirtual   java/lang/String.length:()I
        //   239: ifne            365
        //   242: aload_2        
        //   243: ldc             "emptyOrNull (bypass) |"
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: pop            
        //   249: aload           7
        //   251: astore          5
        //   253: aload           9
        //   255: astore          6
        //   257: iload           8
        //   259: istore          10
        //   261: goto            365
        //   264: astore          9
        //   266: aload           9
        //   268: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   271: aload           9
        //   273: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   276: aload_2        
        //   277: aload           9
        //   279: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   282: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   288: pop            
        //   289: aload_2        
        //   290: ldc             " |"
        //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   295: pop            
        //   296: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   299: ldc             "advertiserId"
        //   301: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   304: astore          6
        //   306: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   309: ldc             "advertiserIdEnabled"
        //   311: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   314: invokestatic    java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        //   317: iconst_1       
        //   318: ixor           
        //   319: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   322: astore          5
        //   324: aload           9
        //   326: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
        //   329: ifnull          347
        //   332: aload           9
        //   334: invokevirtual   java/lang/Throwable.getLocalizedMessage:()Ljava/lang/String;
        //   337: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   340: iload           8
        //   342: istore          10
        //   344: goto            365
        //   347: aload           9
        //   349: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   352: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   355: iload           8
        //   357: istore          10
        //   359: goto            365
        //   362: iconst_1       
        //   363: istore          10
        //   365: aload_0        
        //   366: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   369: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   372: ldc             "android.app.ReceiverRestrictedContext"
        //   374: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   377: ifeq            415
        //   380: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   383: ldc             "advertiserId"
        //   385: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   388: astore          6
        //   390: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   393: ldc             "advertiserIdEnabled"
        //   395: invokevirtual   com/appsflyer/AppsFlyerProperties.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   398: invokestatic    java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        //   401: iconst_1       
        //   402: ixor           
        //   403: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   406: astore          5
        //   408: aload_2        
        //   409: ldc             "context = android.app.ReceiverRestrictedContext |"
        //   411: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   414: pop            
        //   415: aload_2        
        //   416: invokevirtual   java/lang/StringBuilder.length:()I
        //   419: ifle            463
        //   422: new             Ljava/lang/StringBuilder;
        //   425: dup            
        //   426: invokespecial   java/lang/StringBuilder.<init>:()V
        //   429: astore_0       
        //   430: aload_0        
        //   431: iload           4
        //   433: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   436: pop            
        //   437: aload_0        
        //   438: ldc             ": "
        //   440: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   443: pop            
        //   444: aload_0        
        //   445: aload_2        
        //   446: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   449: pop            
        //   450: aload_1        
        //   451: ldc             "gaidError"
        //   453: aload_0        
        //   454: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   457: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   462: pop            
        //   463: aload           6
        //   465: ifnull          545
        //   468: aload           5
        //   470: ifnull          545
        //   473: aload_1        
        //   474: ldc             "advertiserId"
        //   476: aload           6
        //   478: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   483: pop            
        //   484: aload_1        
        //   485: ldc             "advertiserIdEnabled"
        //   487: aload           5
        //   489: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   492: iconst_1       
        //   493: ixor           
        //   494: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //   497: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   502: pop            
        //   503: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   506: ldc             "advertiserId"
        //   508: aload           6
        //   510: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   513: invokestatic    com/appsflyer/AppsFlyerProperties.getInstance:()Lcom/appsflyer/AppsFlyerProperties;
        //   516: ldc             "advertiserIdEnabled"
        //   518: aload           5
        //   520: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   523: iconst_1       
        //   524: ixor           
        //   525: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //   528: invokevirtual   com/appsflyer/AppsFlyerProperties.set:(Ljava/lang/String;Ljava/lang/String;)V
        //   531: aload_1        
        //   532: ldc             "isGaidWithGps"
        //   534: iload           10
        //   536: invokestatic    java/lang/String.valueOf:(Z)Ljava/lang/String;
        //   539: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   544: pop            
        //   545: new             Lcom/appsflyer/internal/c$d$b;
        //   548: dup            
        //   549: aload           6
        //   551: aload           5
        //   553: invokespecial   com/appsflyer/internal/c$d$b.<init>:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   556: areturn        
        //   557: astore          5
        //   559: iload_3        
        //   560: istore          4
        //   562: goto            32
        //    Signature:
        //  (Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Lcom/appsflyer/internal/c$d$b;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  23     32     557    565    Any
        //  32     44     111    119    Any
        //  49     56     111    119    Any
        //  56     66     119    121    Any
        //  71     79     138    143    Any
        //  79     86     138    143    Any
        //  89     111    111    119    Any
        //  194    217    264    362    Any
        //  234    242    264    362    Any
        //  242    249    264    362    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 261, Size: 261
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
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
    
    public static String INVOKESTATIC_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(final ContentResolver contentResolver, final String s) {
        if (TextUtils.equals((CharSequence)s, (CharSequence)"android_id")) {
            if (TextUtils.isEmpty((CharSequence)2bx.LIZ)) {
                2bx.LIZ = com_appsflyer_internal_ad_android_provider_Settings$Secure_getString(contentResolver, s);
            }
            return 2bx.LIZ;
        }
        return com_appsflyer_internal_ad_android_provider_Settings$Secure_getString(contentResolver, s);
    }
    
    public static int INVOKEVIRTUAL_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_isGooglePlayServicesAvailable(final GoogleApiAvailability googleApiAvailability, final Context context) {
        if (!6Tl.LJIIIZ || 6Tl.LJI < 0) {
            return 6Tl.LJI = ((6rk)googleApiAvailability).isGooglePlayServicesAvailable(context);
        }
        return 6Tl.LJI;
    }
    
    public static String com_appsflyer_internal_ad_android_provider_Settings$Secure_getString(final ContentResolver contentResolver, final String s) {
        final 5aq 5aq = new 5aq();
        final Object[] array = { contentResolver, s };
        final 5dv 5dv = new 5dv(false);
        final 5an liz = 5aq.LIZ(102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, "java.lang.String", 5dv);
        if (liz.LIZ) {
            5aq.LIZ((Object)null, 102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, 5dv, false);
            return (String)liz.LIZIZ;
        }
        final String string = Settings$Secure.getString(contentResolver, s);
        5aq.LIZ((Object)string, 102004, "android/provider/Settings$Secure", "getString", (Object)Settings$Secure.class, array, 5dv, true);
        return string;
    }
    
    public static c.d.b values(Context id) {
        final AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
        Object afInAppEventParameterName = ad.AFInAppEventParameterName;
        Label_0129: {
            if (afInAppEventParameterName == null) {
                break Label_0129;
            }
            boolean b = true;
        Label_0020_Outer:
            while (true) {
            Label_0022_Outer:
                while (true) {
                Label_0120_Outer:
                    while (true) {
                        OaidClient$Info fetch = null;
                        Label_0078: {
                            Block_6: {
                                if (b) {
                                    id = (Context)afInAppEventParameterName;
                                }
                                else {
                                    final Boolean afKeystoreWrapper = ad.AFKeystoreWrapper;
                                    if (afKeystoreWrapper != null && afKeystoreWrapper) {
                                        break Label_0078;
                                    }
                                    if (ad.AFKeystoreWrapper == null && instance.getBoolean("collectOAID", true)) {
                                        break Block_6;
                                    }
                                    break Label_0022_Outer;
                                }
                                afInAppEventParameterName = null;
                                if (id != null) {
                                    final c.d.b b2 = new c.d.b((String)id, (Boolean)afInAppEventParameterName);
                                    b2.valueOf = b;
                                    return b2;
                                }
                                break Label_0022_Outer;
                            }
                            try {
                                final OaidClient oaidClient = new OaidClient(id);
                                oaidClient.setLogging(instance.isEnableLog());
                                fetch = oaidClient.fetch();
                                if (fetch != null) {
                                    id = (Context)fetch.getId();
                                    final OaidClient$Info oaidClient$Info = fetch;
                                    oaidClient$Info.getLat();
                                    continue;
                                }
                                break Label_0022_Outer;
                            }
                            finally {
                                final Context context;
                                id = context;
                                id = null;
                            }
                        }
                        while (true) {
                            try {
                                final OaidClient$Info oaidClient$Info = fetch;
                                oaidClient$Info.getLat();
                                continue Label_0120_Outer;
                                AFLogger.AFInAppEventType("No OAID library");
                                continue Label_0022_Outer;
                                b = false;
                                continue Label_0020_Outer;
                                return null;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public static boolean values() {
        final Boolean afKeystoreWrapper = ad.AFKeystoreWrapper;
        return afKeystoreWrapper == null || afKeystoreWrapper;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ad ad = (ad)o;
            if (this.init != ad.init) {
                return false;
            }
            final Function<List<Purchase>, Map<String, String>> values = this.values;
            Label_0074: {
                if (values != null) {
                    if (values.equals(ad.values)) {
                        break Label_0074;
                    }
                }
                else if (ad.values == null) {
                    break Label_0074;
                }
                return false;
            }
            final Consumer<String> afInAppEventType = this.AFInAppEventType;
            Label_0106: {
                if (afInAppEventType != null) {
                    if (afInAppEventType.equals(ad.AFInAppEventType)) {
                        break Label_0106;
                    }
                }
                else if (ad.AFInAppEventType == null) {
                    break Label_0106;
                }
                return false;
            }
            final Consumer<String> valueOf = this.valueOf;
            final Consumer<String> valueOf2 = ad.valueOf;
            if (valueOf != null) {
                return valueOf.equals(valueOf2);
            }
            if (valueOf2 == null) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Function<List<Purchase>, Map<String, String>> values = this.values;
        int hashCode = 0;
        int hashCode2;
        if (values != null) {
            hashCode2 = values.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Consumer<String> afInAppEventType = this.AFInAppEventType;
        int hashCode3;
        if (afInAppEventType != null) {
            hashCode3 = afInAppEventType.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Consumer<String> valueOf = this.valueOf;
        if (valueOf != null) {
            hashCode = valueOf.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31 + (this.init ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ArsFeatureParams{additionalParameters=");
        sb.append(this.values);
        sb.append(", success=");
        sb.append(this.AFInAppEventType);
        sb.append(", failure=");
        sb.append(this.valueOf);
        sb.append(", sandbox=");
        sb.append(this.init);
        sb.append('}');
        return sb.toString();
    }
}
