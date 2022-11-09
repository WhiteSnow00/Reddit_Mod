// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.IOException;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import java.util.ArrayList;
import java.io.ByteArrayInputStream;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.covode.number.Covode;

public final class 1dh implements 6yp
{
    static {
        Covode.recordClassIndex(10470);
    }
    
    public final 6yx LIZ(final Request request) {
        public final class 1dg implements 6yx
        {
            public final /* synthetic */ Request LIZ;
            public H0J<7F6> LIZIZ;
            
            static {
                Covode.recordClassIndex(10471);
            }
            
            public 1dg(final Request liz) {
                this.LIZ = liz;
            }
            
            public final 6H3 LIZ() {
                public final class 1df implements TypedInput
                {
                    public final /* synthetic */ 7F6 LIZ;
                    
                    static {
                        Covode.recordClassIndex(10472);
                    }
                    
                    public 1df(final 7F6 liz) {
                        this.LIZ = liz;
                    }
                    
                    public final InputStream in() {
                        MethodCollector.i(14314);
                        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.LIZ.LJ);
                        MethodCollector.o(14314);
                        return byteArrayInputStream;
                    }
                    
                    public final long length() {
                        if (this.LIZ.LJ != null) {
                            return this.LIZ.LJ.length;
                        }
                        return 0L;
                    }
                    
                    public final String mimeType() {
                        return this.LIZ.LIZLLL;
                    }
                }
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
                //     6: aload_0        
                //     7: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //    10: invokevirtual   com/bytedance/retrofit2/client/Request.getMethod:()Ljava/lang/String;
                //    13: astore_1       
                //    14: ldc             "GET"
                //    16: aload_1        
                //    17: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                //    20: ifne            49
                //    23: ldc             "POST"
                //    25: aload_1        
                //    26: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                //    29: ifne            49
                //    32: bipush          6
                //    34: ldc             "RetrofitProvider"
                //    36: ldc             "REQUEST NOT GET OR POST"
                //    38: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
                //    41: sipush          9123
                //    44: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
                //    47: aconst_null    
                //    48: areturn        
                //    49: new             Ljava/util/ArrayList;
                //    52: dup            
                //    53: invokespecial   java/util/ArrayList.<init>:()V
                //    56: astore_2       
                //    57: aload_0        
                //    58: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //    61: invokevirtual   com/bytedance/retrofit2/client/Request.getHeaders:()Ljava/util/List;
                //    64: astore_3       
                //    65: aload_3        
                //    66: ifnull          147
                //    69: aload_3        
                //    70: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                //    75: astore          4
                //    77: aload           4
                //    79: invokeinterface java/util/Iterator.hasNext:()Z
                //    84: ifeq            147
                //    87: aload           4
                //    89: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //    94: checkcast       LX/5fU;
                //    97: astore_3       
                //    98: getstatic       com/bytedance/android/livesdk/livesetting/message/LiveMtPbRequestsSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/message/LiveMtPbRequestsSetting;
                //   101: invokevirtual   com/bytedance/android/livesdk/livesetting/message/LiveMtPbRequestsSetting.getValue:()Lcom/bytedance/android/live/network/model/RequestPb;
                //   104: invokevirtual   com/bytedance/android/live/network/model/RequestPb.isEnable:()Z
                //   107: ifne            122
                //   110: aload_3        
                //   111: getfield        X/5fU.LIZ:Ljava/lang/String;
                //   114: ldc             "response-format"
                //   116: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
                //   119: ifne            77
                //   122: aload_2        
                //   123: new             LX/0Vs;
                //   126: dup            
                //   127: aload_3        
                //   128: getfield        X/5fU.LIZ:Ljava/lang/String;
                //   131: aload_3        
                //   132: getfield        X/5fU.LIZIZ:Ljava/lang/String;
                //   135: invokespecial   X/0Vs.<init>:(Ljava/lang/String;Ljava/lang/String;)V
                //   138: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
                //   143: pop            
                //   144: goto            77
                //   147: ldc             "GET"
                //   149: aload_1        
                //   150: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
                //   153: ifeq            287
                //   156: invokestatic    X/0ys.LIZ:()LX/0ys;
                //   159: pop            
                //   160: aload_0        
                //   161: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   164: invokevirtual   com/bytedance/retrofit2/client/Request.getUrl:()Ljava/lang/String;
                //   167: astore_1       
                //   168: aload_0        
                //   169: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   172: invokevirtual   com/bytedance/retrofit2/client/Request.getExtraInfo:()Ljava/lang/Object;
                //   175: astore_3       
                //   176: aload_0        
                //   177: ldc             Lcom/bytedance/android/livesdk/comp/api/network/INetworkService;.class
                //   179: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
                //   182: checkcast       Lcom/bytedance/android/livesdk/comp/api/network/INetworkService;
                //   185: aload_1        
                //   186: aload_2        
                //   187: aload_3        
                //   188: invokeinterface com/bytedance/android/livesdk/comp/api/network/INetworkService.get:(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)LX/H0J;
                //   193: putfield        X/1dg.LIZIZ:LX/H0J;
                //   196: aload_0        
                //   197: getfield        X/1dg.LIZIZ:LX/H0J;
                //   200: astore_2       
                //   201: aload_2        
                //   202: ifnull          552
                //   205: aload_2        
                //   206: invokeinterface X/H0J.LIZ:()Ljava/lang/Object;
                //   211: checkcast       LX/7F6;
                //   214: astore_3       
                //   215: new             Ljava/util/ArrayList;
                //   218: dup            
                //   219: invokespecial   java/util/ArrayList.<init>:()V
                //   222: astore_1       
                //   223: aload_3        
                //   224: getfield        X/7F6.LIZJ:Ljava/util/List;
                //   227: ifnull          480
                //   230: aload_3        
                //   231: getfield        X/7F6.LIZJ:Ljava/util/List;
                //   234: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                //   239: astore          4
                //   241: aload           4
                //   243: invokeinterface java/util/Iterator.hasNext:()Z
                //   248: ifeq            480
                //   251: aload           4
                //   253: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //   258: checkcast       LX/0Vs;
                //   261: astore_2       
                //   262: aload_1        
                //   263: new             LX/5fU;
                //   266: dup            
                //   267: aload_2        
                //   268: invokevirtual   X/0Vs.getName:()Ljava/lang/String;
                //   271: aload_2        
                //   272: invokevirtual   X/0Vs.getValue:()Ljava/lang/String;
                //   275: invokespecial   X/5fU.<init>:(Ljava/lang/String;Ljava/lang/String;)V
                //   278: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
                //   283: pop            
                //   284: goto            241
                //   287: new             Ljava/io/ByteArrayOutputStream;
                //   290: dup            
                //   291: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
                //   294: astore          4
                //   296: aload_0        
                //   297: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   300: invokevirtual   com/bytedance/retrofit2/client/Request.getBody:()Lcom/bytedance/retrofit2/mime/TypedOutput;
                //   303: ifnull          320
                //   306: aload_0        
                //   307: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   310: invokevirtual   com/bytedance/retrofit2/client/Request.getBody:()Lcom/bytedance/retrofit2/mime/TypedOutput;
                //   313: aload           4
                //   315: invokeinterface com/bytedance/retrofit2/mime/TypedOutput.writeTo:(Ljava/io/OutputStream;)V
                //   320: aload_0        
                //   321: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   324: invokevirtual   com/bytedance/retrofit2/client/Request.getBody:()Lcom/bytedance/retrofit2/mime/TypedOutput;
                //   327: instanceof      Lcom/bytedance/retrofit2/mime/MultipartTypedOutput;
                //   330: ifeq            402
                //   333: aload_0        
                //   334: invokestatic    X/0ys.LIZ:()LX/0ys;
                //   337: aload_0        
                //   338: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   341: invokevirtual   com/bytedance/retrofit2/client/Request.getMaxLength:()I
                //   344: aload_0        
                //   345: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   348: invokevirtual   com/bytedance/retrofit2/client/Request.getUrl:()Ljava/lang/String;
                //   351: aload_2        
                //   352: aload_0        
                //   353: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   356: invokevirtual   com/bytedance/retrofit2/client/Request.getBody:()Lcom/bytedance/retrofit2/mime/TypedOutput;
                //   359: invokeinterface com/bytedance/retrofit2/mime/TypedOutput.mimeType:()Ljava/lang/String;
                //   364: aload           4
                //   366: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
                //   369: aload_0        
                //   370: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   373: invokevirtual   com/bytedance/retrofit2/client/Request.getBody:()Lcom/bytedance/retrofit2/mime/TypedOutput;
                //   376: invokeinterface com/bytedance/retrofit2/mime/TypedOutput.length:()J
                //   381: aload_0        
                //   382: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   385: invokevirtual   com/bytedance/retrofit2/client/Request.getBody:()Lcom/bytedance/retrofit2/mime/TypedOutput;
                //   388: invokeinterface com/bytedance/retrofit2/mime/TypedOutput.md5Stub:()Ljava/lang/String;
                //   393: invokevirtual   X/0ys.LIZ:(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;[BJLjava/lang/String;)LX/H0J;
                //   396: putfield        X/1dg.LIZIZ:LX/H0J;
                //   399: goto            196
                //   402: aload_0        
                //   403: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   406: invokevirtual   com/bytedance/retrofit2/client/Request.getBody:()Lcom/bytedance/retrofit2/mime/TypedOutput;
                //   409: ifnull          196
                //   412: invokestatic    X/0ys.LIZ:()LX/0ys;
                //   415: pop            
                //   416: aload_0        
                //   417: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   420: invokevirtual   com/bytedance/retrofit2/client/Request.getUrl:()Ljava/lang/String;
                //   423: astore_1       
                //   424: aload_0        
                //   425: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   428: invokevirtual   com/bytedance/retrofit2/client/Request.getBody:()Lcom/bytedance/retrofit2/mime/TypedOutput;
                //   431: invokeinterface com/bytedance/retrofit2/mime/TypedOutput.mimeType:()Ljava/lang/String;
                //   436: astore_3       
                //   437: aload           4
                //   439: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
                //   442: astore          4
                //   444: aload_0        
                //   445: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   448: invokevirtual   com/bytedance/retrofit2/client/Request.getExtraInfo:()Ljava/lang/Object;
                //   451: astore          5
                //   453: aload_0        
                //   454: ldc             Lcom/bytedance/android/livesdk/comp/api/network/INetworkService;.class
                //   456: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
                //   459: checkcast       Lcom/bytedance/android/livesdk/comp/api/network/INetworkService;
                //   462: aload_1        
                //   463: aload_2        
                //   464: aload_3        
                //   465: aload           4
                //   467: aload           5
                //   469: invokeinterface com/bytedance/android/livesdk/comp/api/network/INetworkService.post:(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;[BLjava/lang/Object;)LX/H0J;
                //   474: putfield        X/1dg.LIZIZ:LX/H0J;
                //   477: goto            196
                //   480: aload_0        
                //   481: getfield        X/1dg.LIZ:Lcom/bytedance/retrofit2/client/Request;
                //   484: invokevirtual   com/bytedance/retrofit2/client/Request.isResponseStreaming:()Z
                //   487: ifeq            529
                //   490: new             LX/1df;
                //   493: dup            
                //   494: aload_3        
                //   495: invokespecial   X/1df.<init>:(LX/7F6;)V
                //   498: astore_2       
                //   499: new             LX/6H3;
                //   502: dup            
                //   503: aload_3        
                //   504: getfield        X/7F6.LIZ:Ljava/lang/String;
                //   507: aload_3        
                //   508: getfield        X/7F6.LIZIZ:I
                //   511: aload_3        
                //   512: getfield        X/7F6.LJFF:Ljava/lang/String;
                //   515: aload_1        
                //   516: aload_2        
                //   517: invokespecial   X/6H3.<init>:(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lcom/bytedance/retrofit2/mime/TypedInput;)V
                //   520: astore_2       
                //   521: sipush          9123
                //   524: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
                //   527: aload_2        
                //   528: areturn        
                //   529: new             Lcom/bytedance/retrofit2/mime/TypedByteArray;
                //   532: dup            
                //   533: aload_3        
                //   534: getfield        X/7F6.LIZLLL:Ljava/lang/String;
                //   537: aload_3        
                //   538: getfield        X/7F6.LJ:[B
                //   541: iconst_0       
                //   542: anewarray       Ljava/lang/String;
                //   545: invokespecial   com/bytedance/retrofit2/mime/TypedByteArray.<init>:(Ljava/lang/String;[B[Ljava/lang/String;)V
                //   548: astore_2       
                //   549: goto            499
                //   552: sipush          9123
                //   555: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
                //   558: aconst_null    
                //   559: areturn        
                // 
                // The error that occurred was:
                // 
                // java.lang.NullPointerException
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:756)
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
            
            public final boolean LIZ(final long n) {
                return false;
            }
            
            public final void LIZIZ() {
                final H0J<7F6> liziz = this.LIZIZ;
                if (liziz != null) {
                    try {
                        liziz.LIZIZ();
                    }
                    catch (final IOException ex) {
                        0II.LIZ(ex);
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   X/1dg.<init>:(Lcom/bytedance/retrofit2/client/Request;)V
        //     8: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
