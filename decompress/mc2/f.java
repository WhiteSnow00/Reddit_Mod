// 
// Decompiled by Procyon v0.6.0
// 

package mc2;

import java.util.logging.Level;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
import pc2.b;
import pc2.e;
import pc2.a;
import pc2.c;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocket;
import com.sendbird.android.shadow.okhttp3.Protocol;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class f
{
    public static final f a;
    public static final Logger b;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: ldc             "com.android.org.conscrypt.SSLParametersImpl"
        //     5: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //     8: pop            
        //     9: goto            19
        //    12: astore_2       
        //    13: ldc             "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
        //    15: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    18: pop            
        //    19: new             Lmc2/e;
        //    22: astore          7
        //    24: aload           7
        //    26: aconst_null    
        //    27: ldc             "setUseSessionTickets"
        //    29: iconst_1       
        //    30: anewarray       Ljava/lang/Class;
        //    33: dup            
        //    34: iconst_0       
        //    35: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    38: aastore        
        //    39: invokespecial   mc2/e.<init>:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
        //    42: new             Lmc2/e;
        //    45: astore          6
        //    47: aload           6
        //    49: aconst_null    
        //    50: ldc             "setHostname"
        //    52: iconst_1       
        //    53: anewarray       Ljava/lang/Class;
        //    56: dup            
        //    57: iconst_0       
        //    58: ldc             Ljava/lang/String;.class
        //    60: aastore        
        //    61: invokespecial   mc2/e.<init>:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
        //    64: ldc             "GMSCore_OpenSSL"
        //    66: invokestatic    java/security/Security.getProvider:(Ljava/lang/String;)Ljava/security/Provider;
        //    69: astore_2       
        //    70: aload_2        
        //    71: ifnull          77
        //    74: goto            83
        //    77: ldc             "android.net.Network"
        //    79: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    82: pop            
        //    83: iconst_1       
        //    84: istore_0       
        //    85: goto            91
        //    88: astore_2       
        //    89: iconst_0       
        //    90: istore_0       
        //    91: iload_0        
        //    92: ifeq            134
        //    95: new             Lmc2/e;
        //    98: astore_3       
        //    99: aload_3        
        //   100: ldc             [B.class
        //   102: ldc             "getAlpnSelectedProtocol"
        //   104: iconst_0       
        //   105: anewarray       Ljava/lang/Class;
        //   108: invokespecial   mc2/e.<init>:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
        //   111: new             Lmc2/e;
        //   114: astore_2       
        //   115: aload_2        
        //   116: aconst_null    
        //   117: ldc             "setAlpnProtocols"
        //   119: iconst_1       
        //   120: anewarray       Ljava/lang/Class;
        //   123: dup            
        //   124: iconst_0       
        //   125: ldc             [B.class
        //   127: aastore        
        //   128: invokespecial   mc2/e.<init>:(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
        //   131: goto            138
        //   134: aconst_null    
        //   135: astore_3       
        //   136: aconst_null    
        //   137: astore_2       
        //   138: new             Lmc2/a;
        //   141: astore          5
        //   143: aload           5
        //   145: aload           7
        //   147: aload           6
        //   149: aload_3        
        //   150: aload_2        
        //   151: invokespecial   mc2/a.<init>:(Lmc2/e;Lmc2/e;Lmc2/e;Lmc2/e;)V
        //   154: aload           5
        //   156: astore_2       
        //   157: goto            163
        //   160: astore_2       
        //   161: aconst_null    
        //   162: astore_2       
        //   163: aload_2        
        //   164: ifnull          170
        //   167: goto            403
        //   170: ldc             "conscrypt"
        //   172: ldc             "okhttp.platform"
        //   174: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   177: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   180: ifeq            188
        //   183: iconst_1       
        //   184: istore_1       
        //   185: goto            202
        //   188: ldc             "Conscrypt"
        //   190: invokestatic    java/security/Security.getProviders:()[Ljava/security/Provider;
        //   193: iconst_0       
        //   194: aaload         
        //   195: invokevirtual   java/security/Provider.getName:()Ljava/lang/String;
        //   198: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   201: istore_1       
        //   202: iload_1        
        //   203: ifeq            235
        //   206: invokestatic    org/conscrypt/Conscrypt.isAvailable:()Z
        //   209: ifne            215
        //   212: goto            226
        //   215: new             Lmc2/b;
        //   218: dup            
        //   219: invokespecial   mc2/b.<init>:()V
        //   222: astore_2       
        //   223: goto            228
        //   226: aconst_null    
        //   227: astore_2       
        //   228: aload_2        
        //   229: ifnull          235
        //   232: goto            403
        //   235: ldc             Ljavax/net/ssl/SSLParameters;.class
        //   237: ldc             "setApplicationProtocols"
        //   239: iconst_1       
        //   240: anewarray       Ljava/lang/Class;
        //   243: dup            
        //   244: iconst_0       
        //   245: ldc             [Ljava/lang/String;.class
        //   247: aastore        
        //   248: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   251: astore_3       
        //   252: ldc             Ljavax/net/ssl/SSLSocket;.class
        //   254: ldc             "getApplicationProtocol"
        //   256: iconst_0       
        //   257: anewarray       Ljava/lang/Class;
        //   260: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   263: astore          5
        //   265: new             Lmc2/c;
        //   268: astore_2       
        //   269: aload_2        
        //   270: aload_3        
        //   271: aload           5
        //   273: invokespecial   mc2/c.<init>:(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
        //   276: goto            282
        //   279: astore_2       
        //   280: aconst_null    
        //   281: astore_2       
        //   282: aload_2        
        //   283: ifnull          289
        //   286: goto            403
        //   289: ldc             "org.eclipse.jetty.alpn.ALPN"
        //   291: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   294: astore_2       
        //   295: ldc             "org.eclipse.jetty.alpn.ALPN$Provider"
        //   297: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   300: astore          6
        //   302: ldc             "org.eclipse.jetty.alpn.ALPN$ClientProvider"
        //   304: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   307: astore          5
        //   309: ldc             "org.eclipse.jetty.alpn.ALPN$ServerProvider"
        //   311: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   314: astore_3       
        //   315: aload_2        
        //   316: ldc             "put"
        //   318: iconst_2       
        //   319: anewarray       Ljava/lang/Class;
        //   322: dup            
        //   323: iconst_0       
        //   324: ldc             Ljavax/net/ssl/SSLSocket;.class
        //   326: aastore        
        //   327: dup            
        //   328: iconst_1       
        //   329: aload           6
        //   331: aastore        
        //   332: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   335: astore          6
        //   337: aload_2        
        //   338: ldc             "get"
        //   340: iconst_1       
        //   341: anewarray       Ljava/lang/Class;
        //   344: dup            
        //   345: iconst_0       
        //   346: ldc             Ljavax/net/ssl/SSLSocket;.class
        //   348: aastore        
        //   349: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   352: astore          7
        //   354: aload_2        
        //   355: ldc             "remove"
        //   357: iconst_1       
        //   358: anewarray       Ljava/lang/Class;
        //   361: dup            
        //   362: iconst_0       
        //   363: ldc             Ljavax/net/ssl/SSLSocket;.class
        //   365: aastore        
        //   366: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   369: astore          8
        //   371: new             Lmc2/d;
        //   374: astore_2       
        //   375: aload_2        
        //   376: aload           6
        //   378: aload           7
        //   380: aload           8
        //   382: aload           5
        //   384: aload_3        
        //   385: invokespecial   mc2/d.<init>:(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
        //   388: aload_2        
        //   389: ifnull          395
        //   392: goto            403
        //   395: new             Lmc2/f;
        //   398: dup            
        //   399: invokespecial   mc2/f.<init>:()V
        //   402: astore_2       
        //   403: aload_2        
        //   404: putstatic       mc2/f.a:Lmc2/f;
        //   407: ldc             Lfc2/u;.class
        //   409: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   412: invokestatic    java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
        //   415: putstatic       mc2/f.b:Ljava/util/logging/Logger;
        //   418: return         
        //   419: astore_2       
        //   420: goto            226
        //   423: astore_2       
        //   424: aload           4
        //   426: astore_2       
        //   427: goto            388
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  3      9      12     19     Ljava/lang/ClassNotFoundException;
        //  13     19     160    163    Ljava/lang/ClassNotFoundException;
        //  19     70     160    163    Ljava/lang/ClassNotFoundException;
        //  77     83     88     91     Ljava/lang/ClassNotFoundException;
        //  95     131    160    163    Ljava/lang/ClassNotFoundException;
        //  138    154    160    163    Ljava/lang/ClassNotFoundException;
        //  206    212    419    423    Ljava/lang/ClassNotFoundException;
        //  215    223    419    423    Ljava/lang/ClassNotFoundException;
        //  235    276    279    282    Ljava/lang/NoSuchMethodException;
        //  289    388    423    430    Ljava/lang/ClassNotFoundException;
        //  289    388    423    430    Ljava/lang/NoSuchMethodException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0289:
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
    
    public static ArrayList b(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                list2.add(protocol.toString());
            }
        }
        return list2;
    }
    
    public void a(final SSLSocket sslSocket) {
    }
    
    public c c(final X509TrustManager x509TrustManager) {
        return (c)new a(this.d(x509TrustManager));
    }
    
    public e d(final X509TrustManager x509TrustManager) {
        return (e)new b(x509TrustManager.getAcceptedIssuers());
    }
    
    public void e(final SSLSocketFactory sslSocketFactory) {
    }
    
    public void f(final SSLSocket sslSocket, final String s, final List<Protocol> list) {
    }
    
    public void g(final Socket socket, final InetSocketAddress inetSocketAddress, final int n) throws IOException {
        socket.connect(inetSocketAddress, n);
    }
    
    public SSLContext h() {
        while (true) {
            if (!"1.7".equals(System.getProperty("java.specification.version"))) {
                break Label_0021;
            }
            try {
                return SSLContext.getInstance("TLSv1.2");
                try {
                    return SSLContext.getInstance("TLS");
                }
                catch (final NoSuchAlgorithmException ex) {
                    throw new IllegalStateException("No TLS provider", ex);
                }
            }
            catch (final NoSuchAlgorithmException ex2) {
                continue;
            }
            break;
        }
    }
    
    public String i(final SSLSocket sslSocket) {
        return null;
    }
    
    public Object j() {
        if (f.b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }
    
    public boolean k(final String s) {
        return true;
    }
    
    public void l(final int n, final String s, final Throwable t) {
        Level level;
        if (n == 5) {
            level = Level.WARNING;
        }
        else {
            level = Level.INFO;
        }
        f.b.log(level, s, t);
    }
    
    public void m(final String s, final Object o) {
        String l = s;
        if (o == null) {
            l = b.l(s, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        this.l(5, l, (Throwable)o);
    }
    
    @Override
    public final String toString() {
        return this.getClass().getSimpleName();
    }
}
