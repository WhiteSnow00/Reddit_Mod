// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.graphics.PointF;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerProperties;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import X.75k;
import java.net.HttpURLConnection;
import X.764;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import android.webkit.WebView;
import X.75n;
import X.75s;
import X.75j;
import java.net.URLConnection;
import java.net.URL;
import android.text.TextUtils;
import X.6Tl;
import X.NQO;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.HashMap;
import java.util.UUID;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import java.util.Map;

public abstract class am implements Runnable
{
    public static String AFKeystoreWrapper;
    public static long AFLogger$LogLevel;
    public static char[] getLevel;
    public static int onDeepLinkingNative;
    public static int onInstallConversionDataLoadedNative;
    public static String values;
    public final ai AFInAppEventParameterName;
    public String AFInAppEventType;
    public final Map<String, Object> AFVersionDeclaration;
    public final String AppsFlyer2dXConversionCallback;
    public final Context init;
    public final String valueOf;
    
    static {
        Covode.recordClassIndex(2606);
        am.onDeepLinkingNative = 0;
        am.onInstallConversionDataLoadedNative = 1;
        AFInAppEventType();
        am.AFKeystoreWrapper = "v2";
        final StringBuilder sb = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb.append(am.AFKeystoreWrapper);
        am.values = sb.toString();
        am.onDeepLinkingNative = (am.onInstallConversionDataLoadedNative + 121) % 128;
    }
    
    public am(final ai afInAppEventParameterName, final Context init, final String valueOf) {
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.init = init;
        this.valueOf = valueOf;
        this.AppsFlyer2dXConversionCallback = UUID.randomUUID().toString();
        this.AFVersionDeclaration = this.AFKeystoreWrapper();
    }
    
    public static void AFInAppEventType() {
        am.getLevel = new char[] { '\u05ac', (char)(-21985), '\u5ae8', '\u0b02', (char)(-17452), '\u686e', '\u18fb', (char)(-14208), '\u7939', '\u29ac', (char)(-8617), (char)(-28972) };
        am.AFLogger$LogLevel = -2488149479668928620L;
    }
    
    private Map<String, Object> AFKeystoreWrapper() {
        final HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.4.0");
        hashMap.put("counter", ai.AFInAppEventParameterName(ai.values(this.init), "appsFlyerCount", false));
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build$VERSION.SDK_INT));
        while (true) {
            try {
                hashMap.put("app_version_name", INVOKEVIRTUAL_com_appsflyer_internal_am_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(this.init.getPackageManager(), this.init.getPackageName(), 0).versionName);
                am.onInstallConversionDataLoadedNative = (am.onDeepLinkingNative + 109) % 128;
                hashMap.put("app_id", this.init.getPackageName());
                hashMap.put("platformextension", new an().AFKeystoreWrapper());
                am.onDeepLinkingNative = (am.onInstallConversionDataLoadedNative + 91) % 128;
                return hashMap;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public static PackageInfo INVOKEVIRTUAL_com_appsflyer_internal_am_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(final PackageManager packageManager, final String s, final int n) {
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
    
    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_am_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(final URL url) {
        final 75n ljiil = 75j.LIZLLL.LJIIL(new 75n((Object)url, (WebView)null, (JSONObject)null, 75s.CONTINUE));
        if (ljiil.LJFF == 75s.INTERCEPT && ljiil.LIZIZ != null) {
            final URLConnection urlConnection = (URLConnection)ljiil.LIZIZ;
            Object o;
            if (urlConnection instanceof HttpsURLConnection) {
                o = new 764((HttpsURLConnection)urlConnection);
            }
            else {
                o = urlConnection;
                if (urlConnection instanceof HttpURLConnection) {
                    o = new 75k((HttpURLConnection)urlConnection);
                }
            }
            return (URLConnection)o;
        }
        if (ljiil.LJFF != 75s.EXCEPTION || ljiil.LJ == null) {
            final URLConnection openConnection = url.openConnection();
            Object o2;
            if (openConnection instanceof HttpsURLConnection) {
                o2 = new 764((HttpsURLConnection)openConnection);
            }
            else {
                o2 = openConnection;
                if (openConnection instanceof HttpURLConnection) {
                    o2 = new 75k((HttpURLConnection)openConnection);
                }
            }
            return (URLConnection)o2;
        }
        throw ljiil.LJ;
    }
    
    public static String valueOf(int n, final int n2, final char c) {
        final char[] array = new char[n2];
        am.onInstallConversionDataLoadedNative = (am.onDeepLinkingNative + 103) % 128;
        for (int i = 0; i < n2; ++i) {
            array[i] = (char)((long)am.getLevel[n + i] ^ i * am.AFLogger$LogLevel ^ (long)c);
        }
        final String s = new String(array);
        n = am.onDeepLinkingNative + 53;
        am.onInstallConversionDataLoadedNative = n % 128;
        return s;
    }
    
    public abstract void AFKeystoreWrapper(final HttpsURLConnection p0);
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: aload_0        
        //     5: invokevirtual   com/appsflyer/internal/am.valueOf:()Ljava/lang/String;
        //     8: astore_2       
        //     9: ldc_w           "oneLinkUrl: "
        //    12: aload_2        
        //    13: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    16: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    19: invokestatic    com/appsflyer/AFLogger.AFInAppEventParameterName:(Ljava/lang/String;)V
        //    22: new             Ljava/net/URL;
        //    25: astore_3       
        //    26: aload_3        
        //    27: aload_2        
        //    28: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    31: aload_3        
        //    32: invokestatic    com/appsflyer/internal/am.INVOKEVIRTUAL_com_appsflyer_internal_am_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection:(Ljava/net/URL;)Ljava/net/URLConnection;
        //    35: checkcast       Ljavax/net/ssl/HttpsURLConnection;
        //    38: astore_3       
        //    39: aload_3        
        //    40: ldc_w           "content-type"
        //    43: ldc_w           "application/json"
        //    46: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //    49: aload_3        
        //    50: sipush          3000
        //    53: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //    56: aload_3        
        //    57: sipush          3000
        //    60: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //    63: aload_3        
        //    64: aload_0        
        //    65: getfield        com/appsflyer/internal/am.valueOf:Ljava/lang/String;
        //    68: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //    71: aload_0        
        //    72: aload_3        
        //    73: invokevirtual   com/appsflyer/internal/am.AFKeystoreWrapper:(Ljavax/net/ssl/HttpsURLConnection;)V
        //    76: aload_3        
        //    77: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    80: istore          4
        //    82: aload_3        
        //    83: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Ljava/net/HttpURLConnection;)Ljava/lang/String;
        //    86: astore_3       
        //    87: iload           4
        //    89: sipush          200
        //    92: if_icmpeq       135
        //    95: new             Ljava/lang/StringBuilder;
        //    98: astore_1       
        //    99: aload_1        
        //   100: ldc_w           "Response code = "
        //   103: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   106: aload_1        
        //   107: iload           4
        //   109: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   112: pop            
        //   113: aload_1        
        //   114: ldc_w           " content = "
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: pop            
        //   121: aload_1        
        //   122: aload_3        
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: pop            
        //   127: aload_1        
        //   128: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   131: astore_1       
        //   132: goto            228
        //   135: getstatic       com/appsflyer/internal/am.onDeepLinkingNative:I
        //   138: bipush          19
        //   140: iadd           
        //   141: istore          4
        //   143: iload           4
        //   145: sipush          128
        //   148: irem           
        //   149: putstatic       com/appsflyer/internal/am.onInstallConversionDataLoadedNative:I
        //   152: ldc_w           "Status 200 ok"
        //   155: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   158: goto            228
        //   161: astore_1       
        //   162: ldc_w           ""
        //   165: astore_3       
        //   166: goto            170
        //   169: astore_1       
        //   170: ldc_w           "Error while calling "
        //   173: aload_2        
        //   174: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   177: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   180: aload_1        
        //   181: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   184: new             Ljava/lang/StringBuilder;
        //   187: dup            
        //   188: ldc_w           "Error while calling "
        //   191: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   194: astore          5
        //   196: aload           5
        //   198: aload_2        
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: pop            
        //   203: aload           5
        //   205: ldc_w           " stacktrace: "
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: pop            
        //   212: aload           5
        //   214: aload_1        
        //   215: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: pop            
        //   222: aload           5
        //   224: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   227: astore_1       
        //   228: aload_1        
        //   229: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   232: ifne            253
        //   235: ldc_w           "Connection error: "
        //   238: aload_1        
        //   239: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   242: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   245: invokestatic    com/appsflyer/AFLogger.AFLogger$LogLevel:(Ljava/lang/String;)V
        //   248: aload_0        
        //   249: invokevirtual   com/appsflyer/internal/am.values:()V
        //   252: return         
        //   253: getstatic       com/appsflyer/internal/am.onInstallConversionDataLoadedNative:I
        //   256: bipush          45
        //   258: iadd           
        //   259: istore          4
        //   261: iload           4
        //   263: sipush          128
        //   266: irem           
        //   267: putstatic       com/appsflyer/internal/am.onDeepLinkingNative:I
        //   270: ldc_w           "Connection call succeeded: "
        //   273: aload_3        
        //   274: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   277: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   280: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   283: aload_0        
        //   284: aload_3        
        //   285: invokevirtual   com/appsflyer/internal/am.values:(Ljava/lang/String;)V
        //   288: getstatic       com/appsflyer/internal/am.onInstallConversionDataLoadedNative:I
        //   291: bipush          87
        //   293: iadd           
        //   294: istore          4
        //   296: iload           4
        //   298: sipush          128
        //   301: irem           
        //   302: putstatic       com/appsflyer/internal/am.onDeepLinkingNative:I
        //   305: iload           4
        //   307: iconst_2       
        //   308: irem           
        //   309: ifne            313
        //   312: return         
        //   313: new             Ljava/lang/NullPointerException;
        //   316: astore_3       
        //   317: aload_3        
        //   318: ldc_w           "hashCode"
        //   321: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   324: aload_3        
        //   325: athrow         
        //   326: astore_3       
        //   327: aload_3        
        //   328: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  22     87     161    169    Any
        //  95     132    169    170    Any
        //  152    158    169    170    Any
        //  313    326    326    329    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0135:
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
    
    public abstract String valueOf();
    
    public abstract void values();
    
    public abstract void values(final String p0);
    
    public final void values(final HttpsURLConnection httpsURLConnection, final String... array) {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(array));
        list.add(1, am.AFKeystoreWrapper);
        final String join = TextUtils.join((CharSequence)"\u2063", list.toArray());
        final StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
        sb.append(this.AppsFlyer2dXConversionCallback);
        sb.append(am.AFKeystoreWrapper);
        httpsURLConnection.setRequestProperty(valueOf(lcmp(ViewConfiguration.getZoomControlsTimeout(), 0L) - 1, fcmpl(PointF.length(0.0f, 0.0f), 0.0f) + 12, (char)(1516 - TextUtils.lastIndexOf((CharSequence)"", '0', 0, 0))).intern(), ah.valueOf(join, sb.toString()));
        am.onDeepLinkingNative = (am.onInstallConversionDataLoadedNative + 41) % 128;
    }
}
