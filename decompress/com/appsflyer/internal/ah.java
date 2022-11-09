// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
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
import java.util.Formatter;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import com.bytedance.covode.number.Covode;

public class ah implements Runnable
{
    public final bu values;
    
    static {
        Covode.recordClassIndex(2589);
    }
    
    public ah() {
    }
    
    public ah(final bu values) {
        this.values = values;
    }
    
    public static String AFInAppEventParameterName(String values) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(values.getBytes());
            values = values(instance.digest());
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(values.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.valueOf(sb.toString(), ex);
            values = null;
        }
        return values;
    }
    
    public static String AFInAppEventParameterName(final byte[] array) {
        final Formatter formatter = new Formatter();
        for (int length = array.length, i = 0; i < length; ++i) {
            formatter.format("%02x", array[i]);
        }
        final String string = formatter.toString();
        formatter.close();
        return string;
    }
    
    public static String AFInAppEventType(String afInAppEventParameterName) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(afInAppEventParameterName.getBytes("UTF-8"));
            afInAppEventParameterName = AFInAppEventParameterName(instance.digest());
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(afInAppEventParameterName.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.valueOf(sb.toString(), ex);
            afInAppEventParameterName = null;
        }
        return afInAppEventParameterName;
    }
    
    public static String AFKeystoreWrapper(String afInAppEventParameterName) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(afInAppEventParameterName.getBytes("UTF-8"));
            afInAppEventParameterName = AFInAppEventParameterName(instance.digest());
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(afInAppEventParameterName.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.valueOf(sb.toString(), ex);
            afInAppEventParameterName = null;
        }
        return afInAppEventParameterName;
    }
    
    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_ah_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(final URL url) {
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
    
    public static String valueOf(final String ex, final String s) {
        try {
            final Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(s.getBytes(), "HmacSHA256"));
            return values(instance.doFinal(((String)ex).getBytes())).toLowerCase();
        }
        catch (final NoSuchAlgorithmException ex) {}
        catch (final InvalidKeyException ex2) {}
        AFLogger.values(ex.getMessage(), ex);
        return ex.getMessage();
    }
    
    public static String values(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(Integer.toString((array[i] & 0xFF) + 256, 16).substring(1));
        }
        return sb.toString();
    }
    
    public HttpURLConnection AFInAppEventParameterName() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_1       
        //     3: sipush          401
        //     6: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     9: aload_0        
        //    10: getfield        com/appsflyer/internal/ah.values:Lcom/appsflyer/internal/bu;
        //    13: getfield        com/appsflyer/internal/j.onAppOpenAttributionNative:Ljava/lang/String;
        //    16: astore_2       
        //    17: aload_0        
        //    18: getfield        com/appsflyer/internal/ah.values:Lcom/appsflyer/internal/bu;
        //    21: invokevirtual   com/appsflyer/internal/bu.AFVersionDeclaration:()Ljava/lang/String;
        //    24: astore_3       
        //    25: aload_0        
        //    26: getfield        com/appsflyer/internal/ah.values:Lcom/appsflyer/internal/bu;
        //    29: invokevirtual   com/appsflyer/internal/bu.getLevel:()Z
        //    32: istore          4
        //    34: aload_0        
        //    35: getfield        com/appsflyer/internal/ah.values:Lcom/appsflyer/internal/bu;
        //    38: invokevirtual   com/appsflyer/internal/bu.init:()Z
        //    41: istore          5
        //    43: aload_0        
        //    44: getfield        com/appsflyer/internal/ah.values:Lcom/appsflyer/internal/bu;
        //    47: invokevirtual   com/appsflyer/internal/bu.AFLogger$LogLevel:()Z
        //    50: istore          6
        //    52: aload_0        
        //    53: getfield        com/appsflyer/internal/ah.values:Lcom/appsflyer/internal/bu;
        //    56: invokevirtual   com/appsflyer/internal/j.AFInAppEventType:()Z
        //    59: istore          7
        //    61: aload_3        
        //    62: invokevirtual   java/lang/String.getBytes:()[B
        //    65: astore          8
        //    67: aconst_null    
        //    68: astore          9
        //    70: iload           4
        //    72: ifeq            83
        //    75: sipush          401
        //    78: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    81: aconst_null    
        //    82: areturn        
        //    83: iconst_0       
        //    84: istore          10
        //    86: new             Ljava/net/URL;
        //    89: astore          11
        //    91: aload           11
        //    93: aload_2        
        //    94: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    97: iload           6
        //    99: ifeq            233
        //   102: invokestatic    com/appsflyer/internal/aj.AFInAppEventParameterName:()Lcom/appsflyer/internal/aj;
        //   105: ldc_w           "server_request"
        //   108: aload           11
        //   110: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   113: iconst_1       
        //   114: anewarray       Ljava/lang/String;
        //   117: dup            
        //   118: iconst_0       
        //   119: aload_3        
        //   120: aastore        
        //   121: invokevirtual   com/appsflyer/internal/aj.AFInAppEventType:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
        //   124: aload_3        
        //   125: ldc             "UTF-8"
        //   127: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //   130: arraylength    
        //   131: istore          12
        //   133: new             Ljava/lang/StringBuilder;
        //   136: astore          13
        //   138: aload           13
        //   140: ldc_w           "call = "
        //   143: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   146: aload           13
        //   148: aload           11
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   153: pop            
        //   154: aload           13
        //   156: ldc_w           "; size = "
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: pop            
        //   163: aload           13
        //   165: iload           12
        //   167: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   170: pop            
        //   171: aload           13
        //   173: ldc_w           " byte"
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: pop            
        //   180: iload           12
        //   182: iconst_1       
        //   183: if_icmple       189
        //   186: goto            196
        //   189: ldc             ""
        //   191: astore          14
        //   193: goto            201
        //   196: ldc_w           "s"
        //   199: astore          14
        //   201: aload           13
        //   203: aload           14
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: pop            
        //   209: aload           13
        //   211: ldc_w           "; body = "
        //   214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   217: pop            
        //   218: aload           13
        //   220: aload_3        
        //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   224: pop            
        //   225: aload           13
        //   227: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   230: invokestatic    com/appsflyer/internal/al.values:(Ljava/lang/String;)V
        //   233: ldc_w           "AppsFlyer"
        //   236: invokevirtual   java/lang/Object.hashCode:()I
        //   239: invokestatic    android/net/TrafficStats.setThreadStatsTag:(I)V
        //   242: aload           11
        //   244: invokestatic    com/appsflyer/internal/ah.INVOKEVIRTUAL_com_appsflyer_internal_ah_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection:(Ljava/net/URL;)Ljava/net/URLConnection;
        //   247: checkcast       Ljava/net/HttpURLConnection;
        //   250: astore_3       
        //   251: aload_1        
        //   252: astore          9
        //   254: aload_3        
        //   255: sipush          30000
        //   258: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //   261: aload_1        
        //   262: astore          9
        //   264: aload_3        
        //   265: sipush          30000
        //   268: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //   271: aload_1        
        //   272: astore          9
        //   274: aload_3        
        //   275: ldc_w           "POST"
        //   278: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //   281: aload_1        
        //   282: astore          9
        //   284: aload_3        
        //   285: iconst_1       
        //   286: invokevirtual   java/net/URLConnection.setDoInput:(Z)V
        //   289: aload_1        
        //   290: astore          9
        //   292: aload_3        
        //   293: iconst_1       
        //   294: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //   297: iload           7
        //   299: ifeq            352
        //   302: ldc_w           "application/octet-stream"
        //   305: astore          14
        //   307: aload_1        
        //   308: astore          9
        //   310: aload_3        
        //   311: ldc_w           "Content-Type"
        //   314: aload           14
        //   316: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   319: aload_1        
        //   320: astore          9
        //   322: aload_3        
        //   323: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   326: astore          13
        //   328: aload           8
        //   330: astore          14
        //   332: iload           7
        //   334: ifeq            589
        //   337: aload_1        
        //   338: astore          9
        //   340: aload_0        
        //   341: getfield        com/appsflyer/internal/ah.values:Lcom/appsflyer/internal/bu;
        //   344: getfield        com/appsflyer/internal/j.AppsFlyer2dXConversionCallback:Ljava/lang/String;
        //   347: astore          14
        //   349: goto            360
        //   352: ldc_w           "application/json"
        //   355: astore          14
        //   357: goto            307
        //   360: sipush          30709
        //   363: lconst_0       
        //   364: invokestatic    android/widget/ExpandableListView.getPackedPositionChild:(J)I
        //   367: isub           
        //   368: i2c            
        //   369: invokestatic    android/media/AudioTrack.getMinVolume:()F
        //   372: fconst_0       
        //   373: fcmpl          
        //   374: bipush          24
        //   376: iadd           
        //   377: iconst_0       
        //   378: invokestatic    android/graphics/Color.green:(I)I
        //   381: bipush          24
        //   383: iadd           
        //   384: invokestatic    com/appsflyer/internal/d.values:(CII)Ljava/lang/Object;
        //   387: checkcast       Ljava/lang/Class;
        //   390: ldc_w           "AFKeystoreWrapper"
        //   393: iconst_1       
        //   394: anewarray       Ljava/lang/Class;
        //   397: dup            
        //   398: iconst_0       
        //   399: ldc             Ljava/lang/String;.class
        //   401: aastore        
        //   402: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   405: aconst_null    
        //   406: iconst_1       
        //   407: anewarray       Ljava/lang/Object;
        //   410: dup            
        //   411: iconst_0       
        //   412: aload           14
        //   414: aastore        
        //   415: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   418: astore          14
        //   420: invokestatic    android/view/ViewConfiguration.getDoubleTapTimeout:()I
        //   423: bipush          16
        //   425: ishr           
        //   426: sipush          30710
        //   429: iadd           
        //   430: i2c            
        //   431: bipush          24
        //   433: ldc             ""
        //   435: ldc             ""
        //   437: invokestatic    android/text/TextUtils.indexOf:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
        //   440: isub           
        //   441: bipush          23
        //   443: iconst_0       
        //   444: iconst_0       
        //   445: invokestatic    android/widget/ExpandableListView.getPackedPositionForChild:(II)J
        //   448: lconst_0       
        //   449: lcmp           
        //   450: isub           
        //   451: invokestatic    com/appsflyer/internal/d.values:(CII)Ljava/lang/Object;
        //   454: checkcast       Ljava/lang/Class;
        //   457: ldc_w           "valueOf"
        //   460: iconst_1       
        //   461: anewarray       Ljava/lang/Class;
        //   464: dup            
        //   465: iconst_0       
        //   466: ldc_w           [B.class
        //   469: aastore        
        //   470: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   473: aload           14
        //   475: iconst_1       
        //   476: anewarray       Ljava/lang/Object;
        //   479: dup            
        //   480: iconst_0       
        //   481: aload           8
        //   483: aastore        
        //   484: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   487: checkcast       [B
        //   490: astore          14
        //   492: goto            589
        //   495: astore          14
        //   497: aload_1        
        //   498: astore          9
        //   500: aload           14
        //   502: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   505: astore          8
        //   507: aload           8
        //   509: ifnull          527
        //   512: aload_1        
        //   513: astore          9
        //   515: sipush          401
        //   518: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   521: aload_1        
        //   522: astore          9
        //   524: aload           8
        //   526: athrow         
        //   527: aload_1        
        //   528: astore          9
        //   530: sipush          401
        //   533: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   536: aload_1        
        //   537: astore          9
        //   539: aload           14
        //   541: athrow         
        //   542: astore          8
        //   544: aload_1        
        //   545: astore          9
        //   547: aload           8
        //   549: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   552: astore          14
        //   554: aload           14
        //   556: ifnull          574
        //   559: aload_1        
        //   560: astore          9
        //   562: sipush          401
        //   565: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   568: aload_1        
        //   569: astore          9
        //   571: aload           14
        //   573: athrow         
        //   574: aload_1        
        //   575: astore          9
        //   577: sipush          401
        //   580: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   583: aload_1        
        //   584: astore          9
        //   586: aload           8
        //   588: athrow         
        //   589: aload_1        
        //   590: astore          9
        //   592: aload           13
        //   594: aload           14
        //   596: invokevirtual   java/io/OutputStream.write:([B)V
        //   599: aload_1        
        //   600: astore          9
        //   602: aload           13
        //   604: invokevirtual   java/io/OutputStream.close:()V
        //   607: aload_1        
        //   608: astore          9
        //   610: aload_3        
        //   611: invokevirtual   java/net/URLConnection.connect:()V
        //   614: aload_1        
        //   615: astore          9
        //   617: aload_3        
        //   618: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   621: istore          12
        //   623: aload_1        
        //   624: astore          14
        //   626: iload           5
        //   628: ifeq            647
        //   631: aload_1        
        //   632: astore          9
        //   634: invokestatic    com/appsflyer/internal/ai.valueOf:()Lcom/appsflyer/internal/ai;
        //   637: pop            
        //   638: aload_1        
        //   639: astore          9
        //   641: aload_3        
        //   642: invokestatic    com/appsflyer/internal/ai.AFInAppEventParameterName:(Ljava/net/HttpURLConnection;)Ljava/lang/String;
        //   645: astore          14
        //   647: iload           6
        //   649: ifeq            687
        //   652: aload           14
        //   654: astore          9
        //   656: invokestatic    com/appsflyer/internal/aj.AFInAppEventParameterName:()Lcom/appsflyer/internal/aj;
        //   659: ldc_w           "server_response"
        //   662: aload           11
        //   664: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   667: iconst_2       
        //   668: anewarray       Ljava/lang/String;
        //   671: dup            
        //   672: iconst_0       
        //   673: iload           12
        //   675: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   678: aastore        
        //   679: dup            
        //   680: iconst_1       
        //   681: aload           14
        //   683: aastore        
        //   684: invokevirtual   com/appsflyer/internal/aj.AFInAppEventType:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
        //   687: aload           14
        //   689: astore_1       
        //   690: aload_3        
        //   691: astore          9
        //   693: iload           12
        //   695: sipush          200
        //   698: if_icmpne       750
        //   701: aload           14
        //   703: astore          9
        //   705: ldc_w           "Status 200 ok"
        //   708: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   711: goto            759
        //   714: astore          8
        //   716: aload           9
        //   718: astore          14
        //   720: goto            731
        //   723: astore          8
        //   725: aload_3        
        //   726: astore          14
        //   728: aload           9
        //   730: astore_1       
        //   731: ldc_w           "Error while calling "
        //   734: aload_2        
        //   735: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   738: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   741: aload           8
        //   743: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   746: aload           14
        //   748: astore          9
        //   750: iconst_1       
        //   751: istore          10
        //   753: aload           9
        //   755: astore_3       
        //   756: aload_1        
        //   757: astore          14
        //   759: new             Ljava/lang/StringBuilder;
        //   762: dup            
        //   763: ldc_w           "Connection "
        //   766: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   769: astore          9
        //   771: iload           10
        //   773: ifeq            820
        //   776: ldc_w           "error"
        //   779: astore_1       
        //   780: aload           9
        //   782: aload_1        
        //   783: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   786: pop            
        //   787: aload           9
        //   789: ldc_w           ": "
        //   792: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   795: pop            
        //   796: aload           9
        //   798: aload           14
        //   800: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   803: pop            
        //   804: aload           9
        //   806: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   809: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;)V
        //   812: sipush          401
        //   815: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   818: aload_3        
        //   819: areturn        
        //   820: ldc_w           "call succeeded"
        //   823: astore_1       
        //   824: goto            780
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  86     97     714    723    Any
        //  102    180    714    723    Any
        //  201    233    714    723    Any
        //  233    251    714    723    Any
        //  254    261    723    731    Any
        //  264    271    723    731    Any
        //  274    281    723    731    Any
        //  284    289    723    731    Any
        //  292    297    723    731    Any
        //  310    319    723    731    Any
        //  322    328    723    731    Any
        //  340    349    723    731    Any
        //  360    420    542    589    Any
        //  420    492    495    542    Any
        //  500    507    723    731    Any
        //  515    521    723    731    Any
        //  524    527    723    731    Any
        //  530    536    723    731    Any
        //  539    542    723    731    Any
        //  547    554    723    731    Any
        //  562    568    723    731    Any
        //  571    574    723    731    Any
        //  577    583    723    731    Any
        //  586    589    723    731    Any
        //  592    599    723    731    Any
        //  602    607    723    731    Any
        //  610    614    723    731    Any
        //  617    623    723    731    Any
        //  634    638    723    731    Any
        //  641    647    723    731    Any
        //  656    687    723    731    Any
        //  705    711    723    731    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0307:
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
    
    @Override
    public void run() {
        final HttpURLConnection afInAppEventParameterName = this.AFInAppEventParameterName();
        if (afInAppEventParameterName != null) {
            afInAppEventParameterName.disconnect();
        }
    }
}
