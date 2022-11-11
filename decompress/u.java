// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.net.Network;
import X.4MB;
import X.4ch;
import android.net.ConnectivityManager;
import java.lang.reflect.Field;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;

public final class u
{
    static {
        Covode.recordClassIndex(2710);
    }
    
    public static boolean AFInAppEventType(final NetworkInfo networkInfo) {
        return networkInfo != null && false;
    }
    
    public static Object INVOKEVIRTUAL_com_appsflyer_internal_u_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String ex) {
        MethodCollector.i(3445);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(3445);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    MethodCollector.o(3445);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public static NetworkInfo INVOKEVIRTUAL_com_appsflyer_internal_u_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo(final ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        }
        catch (final Exception ex) {
            4ch.LIZ((Throwable)ex);
            return 4MB.LIZ();
        }
    }
    
    public static NetworkInfo INVOKEVIRTUAL_com_appsflyer_internal_u_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo(final ConnectivityManager connectivityManager, final int n) {
        try {
            return connectivityManager.getNetworkInfo(n);
        }
        catch (final Exception ex) {
            4ch.LIZ((Throwable)ex);
            return 4MB.LIZ();
        }
    }
    
    public static NetworkInfo INVOKEVIRTUAL_com_appsflyer_internal_u_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo(final ConnectivityManager connectivityManager, final Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        }
        catch (final Exception ex) {
            4ch.LIZ((Throwable)ex);
            return 4MB.LIZ();
        }
    }
    
    public static a valueOf(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_1       
        //     3: aconst_null    
        //     4: astore_2       
        //     5: aconst_null    
        //     6: astore_3       
        //     7: aload_1        
        //     8: astore          4
        //    10: aload_0        
        //    11: ldc             "connectivity"
        //    13: invokestatic    com/appsflyer/internal/u.INVOKEVIRTUAL_com_appsflyer_internal_u_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
        //    16: checkcast       Landroid/net/ConnectivityManager;
        //    19: astore          5
        //    21: aload_1        
        //    22: astore          6
        //    24: aload           5
        //    26: ifnull          95
        //    29: aload_1        
        //    30: astore          4
        //    32: aload           5
        //    34: invokevirtual   android/net/ConnectivityManager.getAllNetworks:()[Landroid/net/Network;
        //    37: astore          7
        //    39: aload_1        
        //    40: astore          4
        //    42: aload           7
        //    44: arraylength    
        //    45: istore          8
        //    47: iconst_0       
        //    48: istore          9
        //    50: goto            145
        //    53: aload_1        
        //    54: astore          4
        //    56: aload           5
        //    58: aload           7
        //    60: iload           9
        //    62: aaload         
        //    63: invokestatic    com/appsflyer/internal/u.INVOKEVIRTUAL_com_appsflyer_internal_u_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo:(Landroid/net/ConnectivityManager;Landroid/net/Network;)Landroid/net/NetworkInfo;
        //    66: astore          10
        //    68: aload_1        
        //    69: astore          4
        //    71: aload           10
        //    73: invokestatic    com/appsflyer/internal/u.AFInAppEventType:(Landroid/net/NetworkInfo;)Z
        //    76: ifeq            142
        //    79: aload_1        
        //    80: astore          4
        //    82: iconst_1       
        //    83: aload           10
        //    85: invokevirtual   android/net/NetworkInfo.getType:()I
        //    88: if_icmpne       121
        //    91: ldc             "WIFI"
        //    93: astore          6
        //    95: aload           6
        //    97: astore          4
        //    99: aload_0        
        //   100: ldc             "phone"
        //   102: invokestatic    com/appsflyer/internal/u.INVOKEVIRTUAL_com_appsflyer_internal_u_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
        //   105: checkcast       Landroid/telephony/TelephonyManager;
        //   108: astore          7
        //   110: aload           6
        //   112: astore          4
        //   114: invokestatic    com/tiktok/plugin/client/ClientSettings$Region.getOperatorName:()Ljava/lang/String;
        //   117: astore_1       
        //   118: goto            158
        //   121: aload_1        
        //   122: astore          6
        //   124: aload_1        
        //   125: astore          4
        //   127: aload           10
        //   129: invokevirtual   android/net/NetworkInfo.getType:()I
        //   132: ifne            95
        //   135: ldc             "MOBILE"
        //   137: astore          6
        //   139: goto            95
        //   142: iinc            9, 1
        //   145: aload_1        
        //   146: astore          6
        //   148: iload           9
        //   150: iload           8
        //   152: if_icmpge       95
        //   155: goto            53
        //   158: aload_3        
        //   159: astore_0       
        //   160: invokestatic    com/tiktok/plugin/client/ClientSettings$Region.getOperatorName:()Ljava/lang/String;
        //   163: astore          5
        //   165: aload           5
        //   167: ifnull          190
        //   170: aload           5
        //   172: astore_0       
        //   173: aload_1        
        //   174: astore_2       
        //   175: aload           5
        //   177: astore          4
        //   179: aload           6
        //   181: astore_3       
        //   182: aload           5
        //   184: invokevirtual   java/lang/String.isEmpty:()Z
        //   187: ifeq            254
        //   190: aload           5
        //   192: astore_0       
        //   193: aload_1        
        //   194: astore_2       
        //   195: aload           5
        //   197: astore          4
        //   199: aload           6
        //   201: astore_3       
        //   202: iconst_2       
        //   203: aload           7
        //   205: invokevirtual   android/telephony/TelephonyManager.getPhoneType:()I
        //   208: if_icmpne       254
        //   211: ldc             "CDMA"
        //   213: astore          4
        //   215: aload_1        
        //   216: astore_2       
        //   217: aload           6
        //   219: astore_3       
        //   220: goto            254
        //   223: astore_3       
        //   224: aconst_null    
        //   225: astore_0       
        //   226: aload_2        
        //   227: astore_1       
        //   228: aload           4
        //   230: astore          6
        //   232: goto            240
        //   235: astore          4
        //   237: aload           4
        //   239: astore_3       
        //   240: ldc             "Exception while collecting network info. "
        //   242: aload_3        
        //   243: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   246: aload           6
        //   248: astore_3       
        //   249: aload_0        
        //   250: astore          4
        //   252: aload_1        
        //   253: astore_2       
        //   254: new             Lcom/appsflyer/internal/u$a;
        //   257: dup            
        //   258: aload_3        
        //   259: aload           4
        //   261: aload_2        
        //   262: invokespecial   com/appsflyer/internal/u$a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   265: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     21     223    235    Any
        //  32     39     223    235    Any
        //  42     47     223    235    Any
        //  56     68     223    235    Any
        //  71     79     223    235    Any
        //  82     91     223    235    Any
        //  99     110    223    235    Any
        //  114    118    223    235    Any
        //  127    135    223    235    Any
        //  160    165    235    240    Any
        //  182    190    235    240    Any
        //  202    211    235    240    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0190:
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
    
    public static final class a
    {
        public final String AFInAppEventParameterName;
        public final String AFKeystoreWrapper;
        public final String values;
        
        static {
            Covode.recordClassIndex(2711);
        }
        
        public a(final String afInAppEventParameterName, final String afKeystoreWrapper, final String values) {
            this.AFInAppEventParameterName = afInAppEventParameterName;
            this.AFKeystoreWrapper = afKeystoreWrapper;
            this.values = values;
        }
    }
    
    public static final class b
    {
        public static final u valueOf;
        
        static {
            Covode.recordClassIndex(2712);
            valueOf = new u();
        }
    }
}
