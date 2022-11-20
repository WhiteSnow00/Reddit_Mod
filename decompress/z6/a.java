// 
// Decompiled by Procyon v0.6.0
// 

package z6;

import java.net.HttpURLConnection;
import java.io.Closeable;

public final class a implements Closeable
{
    public final HttpURLConnection f;
    
    public a(final HttpURLConnection f) {
        this.f = f;
    }
    
    public final String b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_1       
        //     2: aload_0        
        //     3: getfield        z6/a.f:Ljava/net/HttpURLConnection;
        //     6: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //     9: bipush          100
        //    11: idiv           
        //    12: istore_2       
        //    13: iload_2        
        //    14: iconst_2       
        //    15: if_icmpne       20
        //    18: iconst_1       
        //    19: istore_1       
        //    20: iload_1        
        //    21: ifeq            29
        //    24: aconst_null    
        //    25: astore_3       
        //    26: goto            176
        //    29: new             Ljava/lang/StringBuilder;
        //    32: astore_3       
        //    33: aload_3        
        //    34: invokespecial   java/lang/StringBuilder.<init>:()V
        //    37: aload_3        
        //    38: ldc             "Unable to fetch "
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: aload_3        
        //    45: aload_0        
        //    46: getfield        z6/a.f:Ljava/net/HttpURLConnection;
        //    49: invokevirtual   java/net/URLConnection.getURL:()Ljava/net/URL;
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    55: pop            
        //    56: aload_3        
        //    57: ldc             ". Failed with "
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: pop            
        //    63: aload_3        
        //    64: aload_0        
        //    65: getfield        z6/a.f:Ljava/net/HttpURLConnection;
        //    68: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    71: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    74: pop            
        //    75: aload_3        
        //    76: ldc             "\n"
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: pop            
        //    82: aload_0        
        //    83: getfield        z6/a.f:Ljava/net/HttpURLConnection;
        //    86: astore          6
        //    88: new             Ljava/io/BufferedReader;
        //    91: astore          4
        //    93: new             Ljava/io/InputStreamReader;
        //    96: astore          5
        //    98: aload           5
        //   100: aload           6
        //   102: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //   105: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   108: aload           4
        //   110: aload           5
        //   112: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   115: new             Ljava/lang/StringBuilder;
        //   118: astore          5
        //   120: aload           5
        //   122: invokespecial   java/lang/StringBuilder.<init>:()V
        //   125: aload           4
        //   127: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   130: astore          6
        //   132: aload           6
        //   134: ifnull          156
        //   137: aload           5
        //   139: aload           6
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: pop            
        //   145: aload           5
        //   147: bipush          10
        //   149: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: goto            125
        //   156: aload           4
        //   158: invokevirtual   java/io/BufferedReader.close:()V
        //   161: aload_3        
        //   162: aload           5
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: pop            
        //   171: aload_3        
        //   172: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   175: astore_3       
        //   176: aload_3        
        //   177: areturn        
        //   178: astore_3       
        //   179: aload           4
        //   181: invokevirtual   java/io/BufferedReader.close:()V
        //   184: aload_3        
        //   185: athrow         
        //   186: astore_3       
        //   187: ldc             "get error failed "
        //   189: aload_3        
        //   190: invokestatic    b7/c.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   193: aload_3        
        //   194: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   197: areturn        
        //   198: astore_3       
        //   199: goto            20
        //   202: astore          4
        //   204: goto            161
        //   207: astore          4
        //   209: goto            184
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      13     198    202    Ljava/io/IOException;
        //  29     125    186    198    Ljava/io/IOException;
        //  125    132    178    186    Any
        //  137    153    178    186    Any
        //  156    161    202    207    Ljava/lang/Exception;
        //  161    176    186    198    Ljava/io/IOException;
        //  179    184    207    212    Ljava/lang/Exception;
        //  184    186    186    198    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 108, Size: 108
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
    
    @Override
    public final void close() {
        this.f.disconnect();
    }
}
