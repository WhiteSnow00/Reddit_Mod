// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit.service;

import kotlin.Metadata;
import de.greenrobot.event.EventBus;
import com.reddit.domain.model.SubmitPostResult$SubmitError;
import com.reddit.domain.model.SubmitPostResult$ValidationError;
import com.reddit.domain.model.SubmitPostResult$MediaPostCreating;
import com.reddit.domain.model.SubmitPostResult$Success;
import zg2.p;
import mj2.g;
import com.reddit.domain.model.ValidationError;
import com.reddit.domain.model.events.SubmitEvents;
import com.reddit.domain.model.PostSubmitValidationErrors;
import com.reddit.domain.model.DiscussionType;
import ah2.f;
import jw0.c;
import jw0.a;
import ge0.z;
import db0.v;

public final class ImageSubmitServiceDelegate
{
    public final v a;
    public final z b;
    public final a c;
    public final c d;
    public final e20.a e;
    
    public ImageSubmitServiceDelegate(final v a, final z b, final a c, final c d, final e20.a e) {
        f.f((Object)a, "postSubmitFeatures");
        f.f((Object)b, "postSubmitRepository");
        f.f((Object)c, "redditLogger");
        f.f((Object)d, "scenarioLogger");
        f.f((Object)e, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static final Object a(final ImageSubmitServiceDelegate p0, final String p1, final String p2, final String p3, final boolean p4, final boolean p5, final DiscussionType p6, final String p7, final String p8, final String p9, final tg2.c p10) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          11
        //     3: aload_0        
        //     4: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     7: pop            
        //     8: aload           10
        //    10: instanceof      Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1;
        //    13: ifeq            51
        //    16: aload           10
        //    18: checkcast       Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1;
        //    21: astore          12
        //    23: aload           12
        //    25: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1.label:I
        //    28: istore          13
        //    30: iload           13
        //    32: ldc             -2147483648
        //    34: iand           
        //    35: ifeq            51
        //    38: aload           12
        //    40: iload           13
        //    42: ldc             -2147483648
        //    44: iadd           
        //    45: putfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1.label:I
        //    48: goto            64
        //    51: new             Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1;
        //    54: dup            
        //    55: aload           11
        //    57: aload           10
        //    59: invokespecial   com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1.<init>:(Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate;Ltg2/c;)V
        //    62: astore          12
        //    64: aload           12
        //    66: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1.result:Ljava/lang/Object;
        //    69: astore          10
        //    71: getstatic       kotlin/coroutines/intrinsics/CoroutineSingletons.COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
        //    74: astore          14
        //    76: aload           12
        //    78: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1.label:I
        //    81: istore          13
        //    83: iload           13
        //    85: ifeq            145
        //    88: iload           13
        //    90: iconst_1       
        //    91: if_icmpne       135
        //    94: aload           12
        //    96: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1.L$0:Ljava/lang/Object;
        //    99: checkcast       Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate;
        //   102: astore_0       
        //   103: aload           10
        //   105: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   108: aload_0        
        //   109: astore          11
        //   111: aload           10
        //   113: astore_0       
        //   114: goto            258
        //   117: astore_2       
        //   118: ldc             "image"
        //   120: astore_1       
        //   121: aload_0        
        //   122: astore_3       
        //   123: goto            402
        //   126: astore_1       
        //   127: aload_0        
        //   128: astore          11
        //   130: aload_1        
        //   131: astore_0       
        //   132: goto            304
        //   135: new             Ljava/lang/IllegalStateException;
        //   138: dup            
        //   139: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   141: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   144: athrow         
        //   145: aload           10
        //   147: invokestatic    aj2/c.Q0:(Ljava/lang/Object;)V
        //   150: aload           11
        //   152: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate.e:Le20/a;
        //   155: invokeinterface e20/a.c:()Luj2/a;
        //   160: astore          15
        //   162: new             Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$2;
        //   165: astore          16
        //   167: aload           11
        //   169: astore          17
        //   171: aload           11
        //   173: astore          10
        //   175: aload           16
        //   177: aload_0        
        //   178: aload_1        
        //   179: aload_2        
        //   180: aload_3        
        //   181: iload           4
        //   183: iload           5
        //   185: aload           6
        //   187: aload           7
        //   189: aload           8
        //   191: aload           9
        //   193: aconst_null    
        //   194: invokespecial   com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$2.<init>:(Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/reddit/domain/model/DiscussionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltg2/c;)V
        //   197: aload           11
        //   199: astore          17
        //   201: aload           11
        //   203: astore          10
        //   205: aload           12
        //   207: aload           11
        //   209: putfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1.L$0:Ljava/lang/Object;
        //   212: aload           11
        //   214: astore          17
        //   216: aload           11
        //   218: astore          10
        //   220: aload           12
        //   222: iconst_1       
        //   223: putfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$submitPost$1.label:I
        //   226: aload           11
        //   228: astore          17
        //   230: aload           11
        //   232: astore          10
        //   234: aload           15
        //   236: aload           16
        //   238: aload           12
        //   240: invokestatic    mj2/g.l:(Lkotlin/coroutines/CoroutineContext;Lzg2/p;Ltg2/c;)Ljava/lang/Object;
        //   243: astore_1       
        //   244: aload_1        
        //   245: astore_0       
        //   246: aload_1        
        //   247: aload           14
        //   249: if_acmpne       258
        //   252: aload           14
        //   254: astore_0       
        //   255: goto            391
        //   258: aload           11
        //   260: astore          17
        //   262: aload           11
        //   264: astore          10
        //   266: aload_0        
        //   267: checkcast       Lcom/reddit/domain/model/SubmitPostResult;
        //   270: astore_0       
        //   271: aload           11
        //   273: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate.d:Ljw0/c;
        //   276: astore_2       
        //   277: getstatic       com/reddit/logging/Scenario.PostSubmission:Lcom/reddit/logging/Scenario;
        //   280: astore_1       
        //   281: getstatic       com/reddit/logging/Step.End:Lcom/reddit/logging/Step;
        //   284: astore_3       
        //   285: goto            381
        //   288: astore_0       
        //   289: goto            308
        //   292: astore_0       
        //   293: aload           11
        //   295: astore          10
        //   297: ldc             "image"
        //   299: astore_1       
        //   300: goto            397
        //   303: astore_0       
        //   304: aload           11
        //   306: astore          17
        //   308: aload           17
        //   310: astore          10
        //   312: aload           17
        //   314: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate.c:Ljw0/a;
        //   317: astore_2       
        //   318: aload           17
        //   320: astore          10
        //   322: new             Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$OriginalSubmitServiceException;
        //   325: astore_1       
        //   326: aload           17
        //   328: astore          10
        //   330: aload_1        
        //   331: ldc             "Submit image failed"
        //   333: aload_0        
        //   334: invokespecial   com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$OriginalSubmitServiceException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   337: aload           17
        //   339: astore          10
        //   341: aload_2        
        //   342: aload_1        
        //   343: invokeinterface jw0/a.c:(Ljava/lang/Throwable;)V
        //   348: aload           17
        //   350: astore          10
        //   352: getstatic       bv2/a.a:Lbv2/a$b;
        //   355: aload_0        
        //   356: ldc             "SubmitService.submitImage"
        //   358: iconst_0       
        //   359: anewarray       Ljava/lang/Object;
        //   362: invokevirtual   bv2/a$b.f:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   365: aload           17
        //   367: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate.d:Ljw0/c;
        //   370: astore_2       
        //   371: getstatic       com/reddit/logging/Scenario.PostSubmission:Lcom/reddit/logging/Scenario;
        //   374: astore_1       
        //   375: getstatic       com/reddit/logging/Step.End:Lcom/reddit/logging/Step;
        //   378: astore_3       
        //   379: aconst_null    
        //   380: astore_0       
        //   381: aload_2        
        //   382: aload_1        
        //   383: aload_3        
        //   384: ldc             "image"
        //   386: invokeinterface jw0/c.a:(Lcom/reddit/logging/Scenario;Lcom/reddit/logging/Step;Ljava/lang/String;)V
        //   391: aload_0        
        //   392: areturn        
        //   393: astore_0       
        //   394: goto            297
        //   397: aload           10
        //   399: astore_3       
        //   400: aload_0        
        //   401: astore_2       
        //   402: aload_3        
        //   403: getfield        com/reddit/data/postsubmit/service/ImageSubmitServiceDelegate.d:Ljw0/c;
        //   406: getstatic       com/reddit/logging/Scenario.PostSubmission:Lcom/reddit/logging/Scenario;
        //   409: getstatic       com/reddit/logging/Step.End:Lcom/reddit/logging/Step;
        //   412: aload_1        
        //   413: invokeinterface jw0/c.a:(Lcom/reddit/logging/Scenario;Lcom/reddit/logging/Step;Ljava/lang/String;)V
        //   418: aload_2        
        //   419: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  103    108    126    135    Ljava/lang/Exception;
        //  103    108    117    126    Any
        //  150    167    303    304    Ljava/lang/Exception;
        //  150    167    292    297    Any
        //  175    197    288    292    Ljava/lang/Exception;
        //  175    197    393    397    Any
        //  205    212    288    292    Ljava/lang/Exception;
        //  205    212    393    397    Any
        //  220    226    288    292    Ljava/lang/Exception;
        //  220    226    393    397    Any
        //  234    244    288    292    Ljava/lang/Exception;
        //  234    244    393    397    Any
        //  266    271    288    292    Ljava/lang/Exception;
        //  266    271    393    397    Any
        //  312    318    393    397    Any
        //  322    326    393    397    Any
        //  330    337    393    397    Any
        //  341    348    393    397    Any
        //  352    365    393    397    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0258:
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
    
    public static Exception b(final PostSubmitValidationErrors postSubmitValidationErrors) {
        ValidationError validationError;
        if ((validationError = postSubmitValidationErrors.getTitleError()) == null && (validationError = postSubmitValidationErrors.getFlairError()) == null) {
            validationError = postSubmitValidationErrors.getContentError();
        }
        String errorMessage;
        if (validationError != null) {
            errorMessage = validationError.getErrorMessage();
        }
        else {
            errorMessage = null;
        }
        Exception ex;
        if (errorMessage != null) {
            ex = new SubmitEvents.SubmitErrorEvent.ErrorResponseException(errorMessage, postSubmitValidationErrors);
        }
        else {
            ex = new Exception("Response is null");
        }
        return ex;
    }
    
    public final String c(final String s, final String s2, final String s3, final String s4, final String s5, final DiscussionType discussionType, final boolean b, final boolean b2, final String s6, final String s7) {
        f.f((Object)s, "requestId");
        f.f((Object)s2, "subredditName");
        f.f((Object)s3, "title");
        f.f((Object)s7, "imageUrl");
        String s8;
        if (s7.length() > 0) {
            s8 = s7;
        }
        else {
            s8 = null;
        }
        Object o;
        if (s8 != null) {
            o = g.k((p)new ImageSubmitServiceDelegate$processRequest$result$2$1(this, s2, s3, s4, b, b2, discussionType, s5, s6, s7, (tg2.c)null));
        }
        else {
            o = null;
        }
        if (o instanceof SubmitPostResult$Success) {
            return ((SubmitPostResult$MediaPostCreating)((SubmitPostResult$Success)o).getResult()).getWebsocketUrl();
        }
        if (o instanceof SubmitPostResult$ValidationError) {
            this.d(s, b(((SubmitPostResult$ValidationError)o).getPostSubmitValidationErrors()));
        }
        else if (o instanceof SubmitPostResult$SubmitError) {
            this.d(s, new Exception(((SubmitPostResult$SubmitError)o).getError()));
        }
        else if (o == null) {
            this.d(s, new Exception("Response is null"));
        }
        return null;
    }
    
    public final void d(final String s, final Exception ex) {
        final String message = ex.getMessage();
        f.c((Object)message);
        this.c.c((Throwable)new OriginalSubmitServiceException(message, ex));
        EventBus.getDefault().post((Object)new SubmitEvents.SubmitErrorEvent(s, ex));
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/data/postsubmit/service/ImageSubmitServiceDelegate$OriginalSubmitServiceException;", "", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class OriginalSubmitServiceException extends Throwable
    {
        public OriginalSubmitServiceException(final String s, final Throwable t) {
            super(s, t);
        }
    }
}
