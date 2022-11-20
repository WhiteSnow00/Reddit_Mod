// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import com.reddit.session.Session;
import ey0.d;
import kotlin.Metadata;
import cg2.j;
import gg2.c;
import zi2.c0;
import mg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@hg2.c(c = "com.reddit.matrix.data.repository.UserSessionRepositoryImpl$onRequestBearerToken$1", f = "UserSessionRepositoryImpl.kt", l = { 108, 114, 119 }, m = "invokeSuspend")
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lzi2/c0;", "Lcg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class UserSessionRepositoryImpl$onRequestBearerToken$1 extends SuspendLambda implements p<c0, c<? super j>, Object>
{
    public final d $newUser;
    public final Session $session;
    public int label;
    public final UserSessionRepositoryImpl this$0;
    
    public UserSessionRepositoryImpl$onRequestBearerToken$1(final UserSessionRepositoryImpl this$0, final Session $session, final d $newUser, final c<? super UserSessionRepositoryImpl$onRequestBearerToken$1> c) {
        this.this$0 = this$0;
        this.$session = $session;
        this.$newUser = $newUser;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new UserSessionRepositoryImpl$onRequestBearerToken$1(this.this$0, this.$session, this.$newUser, (c<? super UserSessionRepositoryImpl$onRequestBearerToken$1>)c);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        return this.invoke((c0)o, (c<? super j>)o2);
    }
    
    public final Object invoke(final c0 c0, final c<? super j> c2) {
        return ((UserSessionRepositoryImpl$onRequestBearerToken$1)this.create(c0, c2)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          4
        //     5: aload_0        
        //     6: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.label:I
        //     9: istore_2       
        //    10: iload_2        
        //    11: ifeq            60
        //    14: iload_2        
        //    15: iconst_1       
        //    16: if_icmpeq       53
        //    19: iload_2        
        //    20: iconst_2       
        //    21: if_icmpeq       46
        //    24: iload_2        
        //    25: iconst_3       
        //    26: if_icmpne       36
        //    29: aload_1        
        //    30: invokestatic    cg/d.b4:(Ljava/lang/Object;)V
        //    33: goto            405
        //    36: new             Ljava/lang/IllegalStateException;
        //    39: dup            
        //    40: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    42: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    45: athrow         
        //    46: aload_1        
        //    47: invokestatic    cg/d.b4:(Ljava/lang/Object;)V
        //    50: goto            343
        //    53: aload_1        
        //    54: invokestatic    cg/d.b4:(Ljava/lang/Object;)V
        //    57: goto            278
        //    60: aload_1        
        //    61: invokestatic    cg/d.b4:(Ljava/lang/Object;)V
        //    64: new             Lorg/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig$a;
        //    67: dup            
        //    68: invokespecial   org/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig$a.<init>:()V
        //    71: astore_3       
        //    72: ldc             "https://matrix.redditspace.com"
        //    74: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    77: astore_1       
        //    78: aload_1        
        //    79: ldc             "parse(\"https://matrix.redditspace.com\")"
        //    81: invokestatic    ng2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //    84: aload_1        
        //    85: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //    88: ldc             "http"
        //    90: invokestatic    ng2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    93: ifne            125
        //    96: aload_1        
        //    97: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //   100: ldc             "https"
        //   102: invokestatic    ng2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   105: ifeq            111
        //   108: goto            125
        //   111: new             Ljava/lang/RuntimeException;
        //   114: dup            
        //   115: ldc             "Invalid homeserver URI: "
        //   117: aload_1        
        //   118: invokestatic    a.l:(Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;
        //   121: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   124: athrow         
        //   125: aload_1        
        //   126: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   129: astore          5
        //   131: aload           5
        //   133: ldc             "hsUri.toString()"
        //   135: invokestatic    ng2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   138: aload           5
        //   140: invokestatic    zg/a.C:(Ljava/lang/String;)Ljava/lang/String;
        //   143: astore          5
        //   145: aload           5
        //   147: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   150: astore          5
        //   152: aload           5
        //   154: ldc             "{\n                Uri.pa\u2026e(hsString)\n            }"
        //   156: invokestatic    ng2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   159: new             Lorg/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig;
        //   162: dup            
        //   163: aload           5
        //   165: aconst_null    
        //   166: aconst_null    
        //   167: aconst_null    
        //   168: aload_3        
        //   169: getfield        org/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig$a.a:Ljava/util/ArrayList;
        //   172: iconst_0       
        //   173: aload_3        
        //   174: getfield        org/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig$a.b:Ljava/util/ArrayList;
        //   177: aload_3        
        //   178: getfield        org/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig$a.c:Ljava/util/ArrayList;
        //   181: aload_3        
        //   182: getfield        org/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig$a.d:Z
        //   185: iconst_0       
        //   186: iconst_0       
        //   187: iconst_2       
        //   188: aconst_null    
        //   189: invokespecial   org/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig.<init>:(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;ZLjava/util/List;Ljava/util/List;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   192: astore_1       
        //   193: getstatic       jn2/a.d:Ljn2/a;
        //   196: astore_3       
        //   197: aload_0        
        //   198: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.this$0:Lcom/reddit/matrix/data/repository/UserSessionRepositoryImpl;
        //   201: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl.a:Landroid/content/Context;
        //   204: invokestatic    jn2/a$a.a:(Landroid/content/Context;)Ljn2/a;
        //   207: getfield        jn2/a.a:Lkn2/a;
        //   210: astore          5
        //   212: aload           5
        //   214: ifnull          286
        //   217: aload_0        
        //   218: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.$session:Lcom/reddit/session/Session;
        //   221: invokeinterface com/reddit/session/Session.getToken:()Ljava/lang/String;
        //   226: astore_3       
        //   227: aload_0        
        //   228: iconst_1       
        //   229: putfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.label:I
        //   232: aload           5
        //   234: checkcast       Lorg/matrix/android/sdk/internal/auth/DefaultAuthenticationService;
        //   237: getfield        org/matrix/android/sdk/internal/auth/DefaultAuthenticationService.f:Lyp2/b;
        //   240: astore          6
        //   242: new             Lyp2/b$a;
        //   245: astore          5
        //   247: aload           5
        //   249: aload_1        
        //   250: aload_3        
        //   251: aconst_null    
        //   252: invokespecial   yp2/b$a.<init>:(Lorg/matrix/android/sdk/api/auth/data/HomeServerConnectionConfig;Ljava/lang/String;Ljava/lang/String;)V
        //   255: aload           6
        //   257: checkcast       Lorg/matrix/android/sdk/internal/auth/login/DefaultRedditLoginTask;
        //   260: aload           5
        //   262: aload_0        
        //   263: invokevirtual   org/matrix/android/sdk/internal/auth/login/DefaultRedditLoginTask.b:(Ljava/lang/Object;Lgg2/c;)Ljava/lang/Object;
        //   266: astore_3       
        //   267: aload_3        
        //   268: astore_1       
        //   269: aload_3        
        //   270: aload           4
        //   272: if_acmpne       278
        //   275: aload           4
        //   277: areturn        
        //   278: aload_1        
        //   279: checkcast       Lvn2/a;
        //   282: astore_1       
        //   283: goto            345
        //   286: ldc             "authenticationService"
        //   288: invokestatic    ng2/e.n:(Ljava/lang/String;)V
        //   291: aconst_null    
        //   292: athrow         
        //   293: astore_1       
        //   294: aload_0        
        //   295: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.this$0:Lcom/reddit/matrix/data/repository/UserSessionRepositoryImpl;
        //   298: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl.b:Ld20/a;
        //   301: invokeinterface d20/a.b:()Lkotlinx/coroutines/CoroutineDispatcher;
        //   306: astore_1       
        //   307: new             Lcom/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1$1;
        //   310: dup            
        //   311: aload_0        
        //   312: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.this$0:Lcom/reddit/matrix/data/repository/UserSessionRepositoryImpl;
        //   315: aload_0        
        //   316: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.$newUser:Ley0/d;
        //   319: aconst_null    
        //   320: invokespecial   com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1$1.<init>:(Lcom/reddit/matrix/data/repository/UserSessionRepositoryImpl;Ley0/d;Lgg2/c;)V
        //   323: astore_3       
        //   324: aload_0        
        //   325: iconst_2       
        //   326: putfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.label:I
        //   329: aload_1        
        //   330: aload_3        
        //   331: aload_0        
        //   332: invokestatic    zi2/g.j:(Lkotlin/coroutines/CoroutineContext;Lmg2/p;Lgg2/c;)Ljava/lang/Object;
        //   335: aload           4
        //   337: if_acmpne       343
        //   340: aload           4
        //   342: areturn        
        //   343: aconst_null    
        //   344: astore_1       
        //   345: aload_1        
        //   346: ifnull          405
        //   349: aload_0        
        //   350: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.this$0:Lcom/reddit/matrix/data/repository/UserSessionRepositoryImpl;
        //   353: astore          6
        //   355: aload_0        
        //   356: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.$newUser:Ley0/d;
        //   359: astore          5
        //   361: aload           6
        //   363: getfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl.b:Ld20/a;
        //   366: invokeinterface d20/a.b:()Lkotlinx/coroutines/CoroutineDispatcher;
        //   371: astore_3       
        //   372: new             Lcom/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1$2$1;
        //   375: dup            
        //   376: aload           6
        //   378: aload           5
        //   380: aload_1        
        //   381: aconst_null    
        //   382: invokespecial   com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1$2$1.<init>:(Lcom/reddit/matrix/data/repository/UserSessionRepositoryImpl;Ley0/d;Lvn2/a;Lgg2/c;)V
        //   385: astore_1       
        //   386: aload_0        
        //   387: iconst_3       
        //   388: putfield        com/reddit/matrix/data/repository/UserSessionRepositoryImpl$onRequestBearerToken$1.label:I
        //   391: aload_3        
        //   392: aload_1        
        //   393: aload_0        
        //   394: invokestatic    zi2/g.j:(Lkotlin/coroutines/CoroutineContext;Lmg2/p;Lgg2/c;)Ljava/lang/Object;
        //   397: aload           4
        //   399: if_acmpne       405
        //   402: aload           4
        //   404: areturn        
        //   405: getstatic       cg2/j.a:Lcg2/j;
        //   408: areturn        
        //   409: astore_3       
        //   410: new             Ljava/lang/RuntimeException;
        //   413: dup            
        //   414: ldc             "Invalid homeserver URI: "
        //   416: aload_1        
        //   417: invokestatic    a.l:(Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;
        //   420: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   423: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  53     57     293    343    Any
        //  145    159    409    424    Ljava/lang/Exception;
        //  193    212    293    343    Any
        //  217    267    293    343    Any
        //  278    283    293    343    Any
        //  286    293    293    343    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0278:
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
