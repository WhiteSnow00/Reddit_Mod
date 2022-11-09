// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.live.ai.api.pitaya.ILivePitayaService;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.covode.number.Covode;

public final class 0Va
{
    public static boolean LIZ;
    public static final 0Va LIZIZ;
    
    static {
        Covode.recordClassIndex(4841);
        LIZIZ = new 0Va();
    }
    
    public static final void LIZ(final QgG<2P9> qgG, final SRT<? super Integer, ? super PTYError, 2P9> srt) {
        public final class 1qt extends F5g implements SRS<PTYError, 2P9>
        {
            public final /* synthetic */ SRT LIZ;
            
            static {
                Covode.recordClassIndex(4843);
            }
            
            public 1qt(final SRT liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1qs extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ QgG LIZ;
            
            static {
                Covode.recordClassIndex(4842);
            }
            
            public 1qs(final QgG liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: getstatic       X/0Va.LIZ:Z
        //     8: ifeq            19
        //    11: aload_0        
        //    12: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //    17: pop            
        //    18: return         
        //    19: getstatic       com/bytedance/android/livesdk/livesetting/other/LiveClientAISettings.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/other/LiveClientAISettings;
        //    22: invokevirtual   com/bytedance/android/livesdk/livesetting/other/LiveClientAISettings.enable:()Z
        //    25: ifne            42
        //    28: aload_1        
        //    29: bipush          -6
        //    31: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    34: aconst_null    
        //    35: invokeinterface X/SRT.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    40: pop            
        //    41: return         
        //    42: ldc             Lcom/bytedance/android/livesdkapi/host/IHostApp;.class
        //    44: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //    47: checkcast       Lcom/bytedance/android/livesdkapi/host/IHostApp;
        //    50: invokeinterface com/bytedance/android/livesdkapi/host/IHostApp.initPitayaEnv:()Z
        //    55: ifeq            195
        //    58: getstatic       X/0Va.LIZIZ:LX/0Va;
        //    61: astore_2       
        //    62: new             LX/1qs;
        //    65: dup            
        //    66: aload_0        
        //    67: invokespecial   X/1qs.<init>:(LX/QgG;)V
        //    70: astore_0       
        //    71: new             LX/1qt;
        //    74: dup            
        //    75: aload_1        
        //    76: invokespecial   X/1qt.<init>:(LX/SRT;)V
        //    79: astore_3       
        //    80: ldc             "1728"
        //    82: invokestatic    com/bytedance/pitaya/api/PitayaCoreFactory.getCore:(Ljava/lang/String;)Lcom/bytedance/pitaya/api/IPitayaCore;
        //    85: astore          4
        //    87: aload_2        
        //    88: invokevirtual   X/0Va.LIZ:()Lcom/bytedance/android/livesdkapi/host/IHostContext;
        //    91: invokeinterface com/bytedance/android/livesdkapi/host/IHostContext.context:()Landroid/content/Context;
        //    96: astore_1       
        //    97: aload_1        
        //    98: ldc             ""
        //   100: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   103: invokestatic    X/Fwi.LIZ:()Ljava/lang/String;
        //   106: astore          5
        //   108: aload           5
        //   110: ldc             ""
        //   112: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   115: aload_2        
        //   116: invokevirtual   X/0Va.LIZ:()Lcom/bytedance/android/livesdkapi/host/IHostContext;
        //   119: invokeinterface com/bytedance/android/livesdkapi/host/IHostContext.getChannel:()Ljava/lang/String;
        //   124: astore_2       
        //   125: aload_2        
        //   126: ldc             ""
        //   128: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   131: aload           4
        //   133: aload_1        
        //   134: new             Lcom/bytedance/pitaya/api/bean/PTYSetupInfo;
        //   137: dup            
        //   138: ldc             "1728"
        //   140: aload           5
        //   142: aload_2        
        //   143: new             Lcom/bytedance/android/live/ai/api/pitaya/LivePitayaEnv$setUpLivePitayaEnv$1;
        //   146: dup            
        //   147: invokespecial   com/bytedance/android/live/ai/api/pitaya/LivePitayaEnv$setUpLivePitayaEnv$1.<init>:()V
        //   150: new             Lcom/bytedance/android/live/ai/api/pitaya/LivePitayaEnv$setUpLivePitayaEnv$2;
        //   153: dup            
        //   154: invokespecial   com/bytedance/android/live/ai/api/pitaya/LivePitayaEnv$setUpLivePitayaEnv$2.<init>:()V
        //   157: new             Lcom/bytedance/android/live/ai/api/pitaya/LivePitayaEnv$setUpLivePitayaEnv$3;
        //   160: dup            
        //   161: invokespecial   com/bytedance/android/live/ai/api/pitaya/LivePitayaEnv$setUpLivePitayaEnv$3.<init>:()V
        //   164: aconst_null    
        //   165: iconst_0       
        //   166: iconst_0       
        //   167: aconst_null    
        //   168: iconst_0       
        //   169: aconst_null    
        //   170: iconst_0       
        //   171: iconst_0       
        //   172: aconst_null    
        //   173: sipush          32704
        //   176: aconst_null    
        //   177: invokespecial   com/bytedance/pitaya/api/bean/PTYSetupInfo.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/pitaya/api/PTYDIDCallback;Lcom/bytedance/pitaya/api/PTYUIDCallback;Lcom/bytedance/pitaya/api/PTYPackageFilterCallback;Lcom/bytedance/pitaya/api/PTYSettingsCallback;IZLjava/lang/String;ILcom/bytedance/pitaya/api/PTYPyBinderCallback;ZZLcom/bytedance/pitaya/api/PTYCustomURLHost;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   180: new             Lcom/bytedance/android/live/ai/api/pitaya/LivePitayaEnv$setUpLivePitayaEnv$4;
        //   183: dup            
        //   184: aload_0        
        //   185: aload_3        
        //   186: invokespecial   com/bytedance/android/live/ai/api/pitaya/LivePitayaEnv$setUpLivePitayaEnv$4.<init>:(LX/QgG;LX/SRS;)V
        //   189: invokeinterface com/bytedance/pitaya/api/IPitayaCore.setup:(Landroid/content/Context;Lcom/bytedance/pitaya/api/bean/PTYSetupInfo;Lcom/bytedance/pitaya/api/PTYSetupCallback;)V
        //   194: return         
        //   195: aload_1        
        //   196: iconst_m1      
        //   197: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   200: aconst_null    
        //   201: invokeinterface X/SRT.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   206: pop            
        //   207: return         
        //    Signature:
        //  (LX/QgG<LX/2P9;>;LX/SRT<-Ljava/lang/Integer;-Lcom/bytedance/pitaya/api/bean/PTYError;LX/2P9;>;)V
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
    
    public static final 0Vb LIZIZ() {
        return 0jR.LIZ(ILivePitayaService.class).obtainTaskManager();
    }
    
    public final IHostContext LIZ() {
        final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostContext.class);
        n.LIZIZ((Object)liz, "");
        return (IHostContext)liz;
    }
}
