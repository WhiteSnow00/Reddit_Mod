// 
// Decompiled by Procyon v0.6.0
// 

package vc2;

import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.Certificate;
import java.util.List;

public final class a extends c
{
    public final e a;
    
    public a(final e a) {
        this.a = a;
    }
    
    public final List<Certificate> a(final List<Certificate> p0, final String p1) throws SSLPeerUnverifiedException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   java/util/ArrayDeque.<init>:(Ljava/util/Collection;)V
        //     8: astore_3       
        //     9: new             Ljava/util/ArrayList;
        //    12: dup            
        //    13: invokespecial   java/util/ArrayList.<init>:()V
        //    16: astore_1       
        //    17: aload_1        
        //    18: aload_3        
        //    19: invokevirtual   java/util/ArrayDeque.removeFirst:()Ljava/lang/Object;
        //    22: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    25: pop            
        //    26: iconst_0       
        //    27: istore          4
        //    29: iload           4
        //    31: istore          5
        //    33: iload           4
        //    35: bipush          9
        //    37: if_icmpge       279
        //    40: aload_1        
        //    41: aload_1        
        //    42: invokevirtual   java/util/ArrayList.size:()I
        //    45: iconst_1       
        //    46: isub           
        //    47: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    50: checkcast       Ljava/security/cert/X509Certificate;
        //    53: astore_2       
        //    54: aload_0        
        //    55: getfield        vc2/a.a:Lvc2/e;
        //    58: aload_2        
        //    59: invokeinterface vc2/e.findByIssuerAndSignature:(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;
        //    64: astore          6
        //    66: aload           6
        //    68: ifnull          148
        //    71: aload_1        
        //    72: invokevirtual   java/util/ArrayList.size:()I
        //    75: iconst_1       
        //    76: if_icmpgt       88
        //    79: aload_2        
        //    80: aload           6
        //    82: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    85: ifne            95
        //    88: aload_1        
        //    89: aload           6
        //    91: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    94: pop            
        //    95: aload           6
        //    97: invokevirtual   java/security/cert/X509Certificate.getIssuerDN:()Ljava/security/Principal;
        //   100: aload           6
        //   102: invokevirtual   java/security/cert/X509Certificate.getSubjectDN:()Ljava/security/Principal;
        //   105: invokeinterface java/security/Principal.equals:(Ljava/lang/Object;)Z
        //   110: ifne            116
        //   113: goto            132
        //   116: aload           6
        //   118: aload           6
        //   120: invokevirtual   java/security/cert/Certificate.getPublicKey:()Ljava/security/PublicKey;
        //   123: invokevirtual   java/security/cert/Certificate.verify:(Ljava/security/PublicKey;)V
        //   126: iconst_1       
        //   127: istore          5
        //   129: goto            135
        //   132: iconst_0       
        //   133: istore          5
        //   135: iload           5
        //   137: ifeq            142
        //   140: aload_1        
        //   141: areturn        
        //   142: iconst_1       
        //   143: istore          5
        //   145: goto            233
        //   148: aload_3        
        //   149: invokevirtual   java/util/ArrayDeque.iterator:()Ljava/util/Iterator;
        //   152: astore          6
        //   154: aload           6
        //   156: invokeinterface java/util/Iterator.hasNext:()Z
        //   161: ifeq            239
        //   164: aload           6
        //   166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   171: checkcast       Ljava/security/cert/X509Certificate;
        //   174: astore          7
        //   176: aload_2        
        //   177: invokevirtual   java/security/cert/X509Certificate.getIssuerDN:()Ljava/security/Principal;
        //   180: aload           7
        //   182: invokevirtual   java/security/cert/X509Certificate.getSubjectDN:()Ljava/security/Principal;
        //   185: invokeinterface java/security/Principal.equals:(Ljava/lang/Object;)Z
        //   190: ifne            196
        //   193: goto            211
        //   196: aload_2        
        //   197: aload           7
        //   199: invokevirtual   java/security/cert/Certificate.getPublicKey:()Ljava/security/PublicKey;
        //   202: invokevirtual   java/security/cert/Certificate.verify:(Ljava/security/PublicKey;)V
        //   205: iconst_1       
        //   206: istore          8
        //   208: goto            214
        //   211: iconst_0       
        //   212: istore          8
        //   214: iload           8
        //   216: ifeq            154
        //   219: aload           6
        //   221: invokeinterface java/util/Iterator.remove:()V
        //   226: aload_1        
        //   227: aload           7
        //   229: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   232: pop            
        //   233: iinc            4, 1
        //   236: goto            33
        //   239: iload           5
        //   241: ifeq            246
        //   244: aload_1        
        //   245: areturn        
        //   246: new             Ljava/lang/StringBuilder;
        //   249: dup            
        //   250: invokespecial   java/lang/StringBuilder.<init>:()V
        //   253: astore_1       
        //   254: aload_1        
        //   255: ldc             "Failed to find a trusted cert that signed "
        //   257: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   260: pop            
        //   261: aload_1        
        //   262: aload_2        
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   266: pop            
        //   267: new             Ljavax/net/ssl/SSLPeerUnverifiedException;
        //   270: dup            
        //   271: aload_1        
        //   272: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   275: invokespecial   javax/net/ssl/SSLPeerUnverifiedException.<init>:(Ljava/lang/String;)V
        //   278: athrow         
        //   279: new             Ljava/lang/StringBuilder;
        //   282: dup            
        //   283: invokespecial   java/lang/StringBuilder.<init>:()V
        //   286: astore_2       
        //   287: aload_2        
        //   288: ldc             "Certificate chain too long: "
        //   290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   293: pop            
        //   294: aload_2        
        //   295: aload_1        
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   299: pop            
        //   300: new             Ljavax/net/ssl/SSLPeerUnverifiedException;
        //   303: dup            
        //   304: aload_2        
        //   305: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   308: invokespecial   javax/net/ssl/SSLPeerUnverifiedException.<init>:(Ljava/lang/String;)V
        //   311: athrow         
        //   312: astore_2       
        //   313: goto            132
        //   316: astore          9
        //   318: goto            211
        //    Exceptions:
        //  throws javax.net.ssl.SSLPeerUnverifiedException
        //    Signature:
        //  (Ljava/util/List<Ljava/security/cert/Certificate;>;Ljava/lang/String;)Ljava/util/List<Ljava/security/cert/Certificate;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  116    126    312    316    Ljava/security/GeneralSecurityException;
        //  196    205    316    321    Ljava/security/GeneralSecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0196:
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
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof a) || !((a)o).a.equals(this.a)) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
}
