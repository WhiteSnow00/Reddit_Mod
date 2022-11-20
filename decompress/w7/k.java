// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import com.apollographql.apollo.exception.ApolloParseException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.interceptor.ApolloInterceptor$c;
import okhttp3.Response;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;
import java.util.concurrent.Executor;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import i7.a;
import zd.b;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import j7.h;
import java.util.Map;
import n7.f;
import com.apollographql.apollo.interceptor.ApolloInterceptor;

public final class k implements ApolloInterceptor
{
    public final f<Map<String, Object>> a;
    public final h b;
    public final ScalarTypeAdapters c;
    public final b d;
    public volatile boolean e;
    
    public k(final a a, final f<Map<String, Object>> a2, final h b, final ScalarTypeAdapters c, final b d) {
        this.a = a2;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final ApolloInterceptor$b apolloInterceptor$b, final n n, final Executor executor, final ApolloInterceptor$a apolloInterceptor$a) {
        if (this.e) {
            return;
        }
        n.a(apolloInterceptor$b, executor, (ApolloInterceptor$a)new j(this, apolloInterceptor$b, apolloInterceptor$a));
    }
    
    public final ApolloInterceptor$c b(final h7.k p0, final Response p1) throws ApolloHttpException, ApolloParseException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   okhttp3/Response.request:()Lokhttp3/Request;
        //     4: ldc             "X-APOLLO-CACHE-KEY"
        //     6: invokevirtual   okhttp3/Request.header:(Ljava/lang/String;)Ljava/lang/String;
        //     9: pop            
        //    10: aload_2        
        //    11: invokevirtual   okhttp3/Response.isSuccessful:()Z
        //    14: ifeq            204
        //    17: new             La8/a;
        //    20: astore          5
        //    22: aload           5
        //    24: aload_1        
        //    25: aload_0        
        //    26: getfield        w7/k.b:Lj7/h;
        //    29: aload_0        
        //    30: getfield        w7/k.c:Lcom/apollographql/apollo/api/ScalarTypeAdapters;
        //    33: aload_0        
        //    34: getfield        w7/k.a:Ln7/f;
        //    37: invokespecial   a8/a.<init>:(Lh7/k;Lj7/h;Lcom/apollographql/apollo/api/ScalarTypeAdapters;Ln7/f;)V
        //    40: new             Lq7/a;
        //    43: astore          4
        //    45: aload           4
        //    47: aload_2        
        //    48: invokespecial   q7/a.<init>:(Lokhttp3/Response;)V
        //    51: aload           5
        //    53: aload_2        
        //    54: invokevirtual   okhttp3/Response.body:()Lokhttp3/ResponseBody;
        //    57: invokevirtual   okhttp3/ResponseBody.source:()Lfk2/f;
        //    60: invokevirtual   a8/a.a:(Lfk2/f;)Lh7/n;
        //    63: astore          6
        //    65: aload           6
        //    67: invokevirtual   h7/n.b:()Lh7/n$a;
        //    70: astore          5
        //    72: aload_2        
        //    73: invokevirtual   okhttp3/Response.cacheResponse:()Lokhttp3/Response;
        //    76: ifnull          84
        //    79: iconst_1       
        //    80: istore_3       
        //    81: goto            86
        //    84: iconst_0       
        //    85: istore_3       
        //    86: aload           5
        //    88: iload_3        
        //    89: putfield        h7/n$a.e:Z
        //    92: aload           6
        //    94: getfield        h7/n.g:Lcom/apollographql/apollo/api/a;
        //    97: aload           4
        //    99: invokeinterface com/apollographql/apollo/api/a.b:(Lq7/a;)Lcom/apollographql/apollo/api/a;
        //   104: astore          4
        //   106: aload           4
        //   108: ldc             "executionContext"
        //   110: invokestatic    ng2/e.g:(Ljava/lang/Object;Ljava/lang/String;)V
        //   113: aload           5
        //   115: aload           4
        //   117: putfield        h7/n$a.g:Lcom/apollographql/apollo/api/a;
        //   120: aload           5
        //   122: invokevirtual   h7/n$a.a:()Lh7/n;
        //   125: astore          4
        //   127: aload           4
        //   129: invokevirtual   h7/n.a:()Z
        //   132: pop            
        //   133: new             Lcom/apollographql/apollo/interceptor/ApolloInterceptor$c;
        //   136: dup            
        //   137: aload_2        
        //   138: aload           4
        //   140: aload_0        
        //   141: getfield        w7/k.a:Ln7/f;
        //   144: invokevirtual   n7/f.l:()Ljava/util/Collection;
        //   147: invokespecial   com/apollographql/apollo/interceptor/ApolloInterceptor$c.<init>:(Lokhttp3/Response;Lh7/n;Ljava/util/Collection;)V
        //   150: astore          4
        //   152: aload           4
        //   154: areturn        
        //   155: astore          4
        //   157: aload_0        
        //   158: getfield        w7/k.d:Lzd/b;
        //   161: aload           4
        //   163: ldc             "Failed to parse network response for operation: %s"
        //   165: iconst_1       
        //   166: anewarray       Ljava/lang/Object;
        //   169: dup            
        //   170: iconst_0       
        //   171: aload_1        
        //   172: invokeinterface h7/k.name:()Lh7/l;
        //   177: invokeinterface h7/l.name:()Ljava/lang/String;
        //   182: aastore        
        //   183: invokevirtual   zd/b.P:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   186: aload_2        
        //   187: invokeinterface java/io/Closeable.close:()V
        //   192: new             Lcom/apollographql/apollo/exception/ApolloParseException;
        //   195: dup            
        //   196: ldc             "Failed to parse http response"
        //   198: aload           4
        //   200: invokespecial   com/apollographql/apollo/exception/ApolloParseException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   203: athrow         
        //   204: aload_0        
        //   205: getfield        w7/k.d:Lzd/b;
        //   208: ldc             "Failed to parse network response: %s"
        //   210: iconst_1       
        //   211: anewarray       Ljava/lang/Object;
        //   214: dup            
        //   215: iconst_0       
        //   216: aload_2        
        //   217: aastore        
        //   218: invokevirtual   zd/b.O:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   221: new             Lcom/apollographql/apollo/exception/ApolloHttpException;
        //   224: dup            
        //   225: aload_2        
        //   226: invokespecial   com/apollographql/apollo/exception/ApolloHttpException.<init>:(Lokhttp3/Response;)V
        //   229: athrow         
        //   230: astore_1       
        //   231: goto            192
        //    Exceptions:
        //  throws com.apollographql.apollo.exception.ApolloHttpException
        //  throws com.apollographql.apollo.exception.ApolloParseException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     79     155    204    Ljava/lang/Exception;
        //  86     152    155    204    Ljava/lang/Exception;
        //  186    192    230    234    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0192:
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
    
    public final void dispose() {
        this.e = true;
    }
}
