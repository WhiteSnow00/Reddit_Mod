// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

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
import com.bytedance.covode.number.Covode;

public final class bj
{
    public final int AFInAppEventType;
    
    static {
        Covode.recordClassIndex(2642);
    }
    
    public bj(final int afInAppEventType) {
        this.AFInAppEventType = afInAppEventType;
    }
    
    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_bj_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(final URL url) {
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
    
    public static String valueOf(final HttpURLConnection p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aconst_null    
        //     7: astore_2       
        //     8: aconst_null    
        //     9: astore_3       
        //    10: aconst_null    
        //    11: astore          4
        //    13: iload_1        
        //    14: ifeq            26
        //    17: aload_0        
        //    18: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //    21: astore          5
        //    23: goto            32
        //    26: aload_0        
        //    27: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //    30: astore          5
        //    32: aload           5
        //    34: ifnonnull       46
        //    37: sipush          3205
        //    40: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    43: ldc             ""
        //    45: areturn        
        //    46: new             Ljava/lang/StringBuilder;
        //    49: astore          6
        //    51: aload           6
        //    53: invokespecial   java/lang/StringBuilder.<init>:()V
        //    56: new             Ljava/io/InputStreamReader;
        //    59: astore          7
        //    61: aload           7
        //    63: aload           5
        //    65: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    68: new             Ljava/io/BufferedReader;
        //    71: astore          5
        //    73: aload           5
        //    75: aload           7
        //    77: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    80: iconst_1       
        //    81: istore          8
        //    83: aload           5
        //    85: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    88: astore_3       
        //    89: aload_3        
        //    90: ifnull          119
        //    93: iload           8
        //    95: ifne            106
        //    98: aload           6
        //   100: bipush          10
        //   102: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload           6
        //   108: aload_3        
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: pop            
        //   113: iconst_0       
        //   114: istore          8
        //   116: goto            83
        //   119: aload           6
        //   121: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   124: astore_3       
        //   125: aload           7
        //   127: invokevirtual   java/io/Reader.close:()V
        //   130: aload           5
        //   132: invokevirtual   java/io/Reader.close:()V
        //   135: sipush          3205
        //   138: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   141: aload_3        
        //   142: areturn        
        //   143: astore_0       
        //   144: aconst_null    
        //   145: astore          5
        //   147: goto            458
        //   150: astore_3       
        //   151: aconst_null    
        //   152: astore          5
        //   154: goto            158
        //   157: astore_3       
        //   158: aload_3        
        //   159: astore          6
        //   161: aload           5
        //   163: astore          4
        //   165: aload           7
        //   167: astore_3       
        //   168: goto            214
        //   171: astore_3       
        //   172: aconst_null    
        //   173: astore          5
        //   175: goto            179
        //   178: astore_3       
        //   179: aload_3        
        //   180: astore          6
        //   182: aload           5
        //   184: astore          4
        //   186: aload           7
        //   188: astore_3       
        //   189: goto            371
        //   192: astore_0       
        //   193: aconst_null    
        //   194: astore          5
        //   196: aload_3        
        //   197: astore          7
        //   199: goto            458
        //   202: astore          6
        //   204: aconst_null    
        //   205: astore          7
        //   207: aload           4
        //   209: astore_3       
        //   210: aload           7
        //   212: astore          4
        //   214: aload           4
        //   216: astore          5
        //   218: aload_3        
        //   219: astore          7
        //   221: new             Ljava/lang/StringBuilder;
        //   224: astore_2       
        //   225: aload           4
        //   227: astore          5
        //   229: aload_3        
        //   230: astore          7
        //   232: aload_2        
        //   233: ldc             "Could not read connection response from: "
        //   235: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   238: aload           4
        //   240: astore          5
        //   242: aload_3        
        //   243: astore          7
        //   245: aload_2        
        //   246: aload_0        
        //   247: invokevirtual   java/net/URLConnection.getURL:()Ljava/net/URL;
        //   250: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: pop            
        //   257: aload           4
        //   259: astore          5
        //   261: aload_3        
        //   262: astore          7
        //   264: aload_2        
        //   265: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   268: aload           6
        //   270: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   273: aload           4
        //   275: astore          5
        //   277: aload_3        
        //   278: astore          7
        //   280: new             Lcom/appsflyer/internal/br;
        //   283: astore_0       
        //   284: aload           4
        //   286: astore          5
        //   288: aload_3        
        //   289: astore          7
        //   291: new             Ljava/lang/StringBuilder;
        //   294: astore_2       
        //   295: aload           4
        //   297: astore          5
        //   299: aload_3        
        //   300: astore          7
        //   302: aload_2        
        //   303: ldc             "Could not read connection response: "
        //   305: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   308: aload           4
        //   310: astore          5
        //   312: aload_3        
        //   313: astore          7
        //   315: aload_2        
        //   316: aload           6
        //   318: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   321: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   324: pop            
        //   325: aload           4
        //   327: astore          5
        //   329: aload_3        
        //   330: astore          7
        //   332: aload_0        
        //   333: aload_2        
        //   334: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   337: aload           6
        //   339: invokespecial   com/appsflyer/internal/br.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   342: aload           4
        //   344: astore          5
        //   346: aload_3        
        //   347: astore          7
        //   349: sipush          3205
        //   352: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   355: aload           4
        //   357: astore          5
        //   359: aload_3        
        //   360: astore          7
        //   362: aload_0        
        //   363: athrow         
        //   364: astore          6
        //   366: aconst_null    
        //   367: astore          4
        //   369: aload_2        
        //   370: astore_3       
        //   371: aload           4
        //   373: astore          5
        //   375: aload_3        
        //   376: astore          7
        //   378: new             Ljava/lang/StringBuilder;
        //   381: astore_2       
        //   382: aload           4
        //   384: astore          5
        //   386: aload_3        
        //   387: astore          7
        //   389: aload_2        
        //   390: ldc             "Could not read connection response from: "
        //   392: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   395: aload           4
        //   397: astore          5
        //   399: aload_3        
        //   400: astore          7
        //   402: aload_2        
        //   403: aload_0        
        //   404: invokevirtual   java/net/URLConnection.getURL:()Ljava/net/URL;
        //   407: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   410: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   413: pop            
        //   414: aload           4
        //   416: astore          5
        //   418: aload_3        
        //   419: astore          7
        //   421: aload_2        
        //   422: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   425: aload           6
        //   427: invokestatic    com/appsflyer/AFLogger.valueOf:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   430: aload           4
        //   432: astore          5
        //   434: aload_3        
        //   435: astore          7
        //   437: sipush          3205
        //   440: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   443: aload           4
        //   445: astore          5
        //   447: aload_3        
        //   448: astore          7
        //   450: aload           6
        //   452: athrow         
        //   453: astore_0       
        //   454: goto            458
        //   457: astore_0       
        //   458: aload           7
        //   460: ifnull          468
        //   463: aload           7
        //   465: invokevirtual   java/io/Reader.close:()V
        //   468: aload           5
        //   470: ifnull          478
        //   473: aload           5
        //   475: invokevirtual   java/io/Reader.close:()V
        //   478: sipush          3205
        //   481: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   484: aload_0        
        //   485: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     23     364    371    Ljava/io/IOException;
        //  17     23     202    214    Ljava/lang/Exception;
        //  17     23     192    202    Any
        //  26     32     364    371    Ljava/io/IOException;
        //  26     32     202    214    Ljava/lang/Exception;
        //  26     32     192    202    Any
        //  46     68     364    371    Ljava/io/IOException;
        //  46     68     202    214    Ljava/lang/Exception;
        //  46     68     192    202    Any
        //  68     80     171    178    Ljava/io/IOException;
        //  68     80     150    157    Ljava/lang/Exception;
        //  68     80     143    150    Any
        //  83     89     178    179    Ljava/io/IOException;
        //  83     89     157    158    Ljava/lang/Exception;
        //  83     89     457    458    Any
        //  98     106    178    179    Ljava/io/IOException;
        //  98     106    157    158    Ljava/lang/Exception;
        //  98     106    457    458    Any
        //  106    113    178    179    Ljava/io/IOException;
        //  106    113    157    158    Ljava/lang/Exception;
        //  106    113    457    458    Any
        //  119    125    178    179    Ljava/io/IOException;
        //  119    125    157    158    Ljava/lang/Exception;
        //  119    125    457    458    Any
        //  221    225    453    457    Any
        //  232    238    453    457    Any
        //  245    257    453    457    Any
        //  264    273    453    457    Any
        //  280    284    453    457    Any
        //  291    295    453    457    Any
        //  302    308    453    457    Any
        //  315    325    453    457    Any
        //  332    342    453    457    Any
        //  349    355    453    457    Any
        //  362    364    453    457    Any
        //  378    382    453    457    Any
        //  389    395    453    457    Any
        //  402    414    453    457    Any
        //  421    430    453    457    Any
        //  437    443    453    457    Any
        //  450    453    453    457    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
    
    public final bm<String> valueOf(final v p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: new             Ljava/lang/StringBuilder;
        //     9: astore_2       
        //    10: aload_2        
        //    11: ldc             "HTTP: url: "
        //    13: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    16: aload_2        
        //    17: aload_1        
        //    18: getfield        com/appsflyer/internal/v.AFKeystoreWrapper:Ljava/lang/String;
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    24: pop            
        //    25: aload_2        
        //    26: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    29: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //    32: aload_1        
        //    33: getfield        com/appsflyer/internal/v.AFInAppEventType:[B
        //    36: ifnull          74
        //    39: new             Ljava/lang/StringBuilder;
        //    42: astore_2       
        //    43: aload_2        
        //    44: ldc             "HTTP: data: "
        //    46: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    49: new             Ljava/lang/String;
        //    52: astore_3       
        //    53: aload_3        
        //    54: aload_1        
        //    55: getfield        com/appsflyer/internal/v.AFInAppEventType:[B
        //    58: invokespecial   java/lang/String.<init>:([B)V
        //    61: aload_2        
        //    62: aload_3        
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    66: pop            
        //    67: aload_2        
        //    68: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    71: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //    74: new             Ljava/net/URL;
        //    77: astore_2       
        //    78: aload_2        
        //    79: aload_1        
        //    80: getfield        com/appsflyer/internal/v.AFKeystoreWrapper:Ljava/lang/String;
        //    83: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    86: aload_2        
        //    87: invokestatic    com/appsflyer/internal/bj.INVOKEVIRTUAL_com_appsflyer_internal_bj_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection:(Ljava/net/URL;)Ljava/net/URLConnection;
        //    90: checkcast       Ljava/net/HttpURLConnection;
        //    93: astore_3       
        //    94: aload_3        
        //    95: aload_1        
        //    96: getfield        com/appsflyer/internal/v.valueOf:Ljava/lang/String;
        //    99: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //   102: aload_3        
        //   103: aload_0        
        //   104: getfield        com/appsflyer/internal/bj.AFInAppEventType:I
        //   107: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //   110: aload_3        
        //   111: aload_0        
        //   112: getfield        com/appsflyer/internal/bj.AFInAppEventType:I
        //   115: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //   118: aload_3        
        //   119: ldc             "Content-Type"
        //   121: ldc             "application/json"
        //   123: invokevirtual   java/net/URLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   126: aload_1        
        //   127: getfield        com/appsflyer/internal/v.values:Ljava/util/Map;
        //   130: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   135: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   140: astore          4
        //   142: aload           4
        //   144: invokeinterface java/util/Iterator.hasNext:()Z
        //   149: ifeq            188
        //   152: aload           4
        //   154: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   159: checkcast       Ljava/util/Map$Entry;
        //   162: astore_2       
        //   163: aload_3        
        //   164: aload_2        
        //   165: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   170: checkcast       Ljava/lang/String;
        //   173: aload_2        
        //   174: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   179: checkcast       Ljava/lang/String;
        //   182: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   185: goto            142
        //   188: aload_1        
        //   189: getfield        com/appsflyer/internal/v.AFInAppEventType:[B
        //   192: astore_2       
        //   193: iconst_1       
        //   194: istore          5
        //   196: aload_2        
        //   197: ifnull          279
        //   200: aload_1        
        //   201: getfield        com/appsflyer/internal/v.AFInAppEventType:[B
        //   204: astore_1       
        //   205: aload_3        
        //   206: iconst_1       
        //   207: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //   210: new             Ljava/lang/StringBuilder;
        //   213: astore_2       
        //   214: aload_2        
        //   215: invokespecial   java/lang/StringBuilder.<init>:()V
        //   218: aload_2        
        //   219: aload_1        
        //   220: arraylength    
        //   221: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   224: pop            
        //   225: aload_3        
        //   226: ldc             "Content-Length"
        //   228: aload_2        
        //   229: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   232: invokevirtual   java/net/URLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   235: new             Ljava/io/BufferedOutputStream;
        //   238: astore_2       
        //   239: aload_2        
        //   240: aload_3        
        //   241: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   244: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   247: aload_2        
        //   248: aload_1        
        //   249: invokevirtual   java/io/OutputStream.write:([B)V
        //   252: goto            275
        //   255: astore_1       
        //   256: goto            263
        //   259: astore_1       
        //   260: goto            267
        //   263: aload_2        
        //   264: invokevirtual   java/io/OutputStream.close:()V
        //   267: sipush          4909
        //   270: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   273: aload_1        
        //   274: athrow         
        //   275: aload_2        
        //   276: invokevirtual   java/io/OutputStream.close:()V
        //   279: aload_3        
        //   280: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   283: istore          6
        //   285: iload           6
        //   287: bipush          100
        //   289: idiv           
        //   290: iconst_2       
        //   291: if_icmpne       374
        //   294: aload_3        
        //   295: iload           5
        //   297: invokestatic    com/appsflyer/internal/bj.valueOf:(Ljava/net/HttpURLConnection;Z)Ljava/lang/String;
        //   300: astore_2       
        //   301: new             Ljava/lang/StringBuilder;
        //   304: astore_1       
        //   305: aload_1        
        //   306: ldc_w           "HTTP: response code: "
        //   309: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   312: aload_1        
        //   313: iload           6
        //   315: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   318: pop            
        //   319: aload_1        
        //   320: ldc_w           " "
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: pop            
        //   327: aload_1        
        //   328: aload_3        
        //   329: invokevirtual   java/net/HttpURLConnection.getResponseMessage:()Ljava/lang/String;
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   335: pop            
        //   336: aload_1        
        //   337: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   340: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //   343: ldc_w           "HTTP: response body: "
        //   346: aload_2        
        //   347: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   350: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   353: invokestatic    com/appsflyer/AFLogger.AFInAppEventType:(Ljava/lang/String;)V
        //   356: new             Lcom/appsflyer/internal/bm;
        //   359: dup            
        //   360: aload_2        
        //   361: aload_3        
        //   362: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   365: iload           5
        //   367: invokespecial   com/appsflyer/internal/bm.<init>:(Ljava/lang/Object;IZ)V
        //   370: astore_1       
        //   371: goto            380
        //   374: iconst_0       
        //   375: istore          5
        //   377: goto            294
        //   380: aload_3        
        //   381: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   384: sipush          4909
        //   387: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   390: aload_1        
        //   391: areturn        
        //   392: astore_2       
        //   393: goto            409
        //   396: astore_1       
        //   397: aload_1        
        //   398: astore_2       
        //   399: aload_3        
        //   400: ifnull          409
        //   403: aload_3        
        //   404: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   407: aload_1        
        //   408: astore_2       
        //   409: sipush          4909
        //   412: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   415: aload_2        
        //   416: athrow         
        //    Signature:
        //  (Lcom/appsflyer/internal/v;)Lcom/appsflyer/internal/bm<Ljava/lang/String;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      74     392    396    Any
        //  74     94     392    396    Any
        //  94     142    396    409    Any
        //  142    185    396    409    Any
        //  188    193    396    409    Any
        //  200    235    396    409    Any
        //  235    247    259    263    Any
        //  247    252    255    259    Any
        //  263    267    396    409    Any
        //  267    275    396    409    Any
        //  275    279    396    409    Any
        //  279    294    396    409    Any
        //  294    371    396    409    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0142:
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
