// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;

public final class 2HZ extends 2Gk<RedEnvelopMessage>
{
    static {
        Covode.recordClassIndex(10877);
    }
    
    public 2HZ(final RedEnvelopMessage redEnvelopMessage) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   X/2Gk.<init>:(LX/H31;)V
        //     9: aload_1        
        //    10: ldc             Lcom/bytedance/android/live/gift/IGiftService;.class
        //    12: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //    15: checkcast       Lcom/bytedance/android/live/gift/IGiftService;
        //    18: invokeinterface com/bytedance/android/live/gift/IGiftService.enableRedEnvelope:()Z
        //    23: putfield        com/bytedance/android/livesdk/model/message/redenvelope/RedEnvelopMessage.LIZJ:Z
        //    26: aload_1        
        //    27: getfield        X/HDi.baseMessage:Lcom/bytedance/android/livesdkapi/message/CommonMessageData;
        //    30: astore_1       
        //    31: aload_1        
        //    32: ifnull          148
        //    35: aload_1        
        //    36: getfield        com/bytedance/android/livesdkapi/message/CommonMessageData.LJIIIZ:Lcom/bytedance/android/livesdk/model/message/common/Text;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnull          148
        //    44: aload_1        
        //    45: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZLLL:Ljava/util/List;
        //    48: astore_1       
        //    49: aload_1        
        //    50: ifnull          148
        //    53: aload_1        
        //    54: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    59: astore_2       
        //    60: aload_2        
        //    61: invokeinterface java/util/Iterator.hasNext:()Z
        //    66: ifeq            148
        //    69: aload_2        
        //    70: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    75: checkcast       Lcom/bytedance/android/livesdk/model/message/common/TextPiece;
        //    78: astore_1       
        //    79: aload_1        
        //    80: ldc             ""
        //    82: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    85: aload_1        
        //    86: getfield        com/bytedance/android/livesdk/model/message/common/TextPiece.LIZ:I
        //    89: getstatic       X/HYX.IMAGE:LX/HYX;
        //    92: invokevirtual   X/HYX.getPieceType:()I
        //    95: if_icmpne       60
        //    98: ldc             Lcom/bytedance/android/livesdkapi/host/IHostFrescoHelper;.class
        //   100: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   103: checkcast       Lcom/bytedance/android/livesdkapi/host/IHostFrescoHelper;
        //   106: astore_3       
        //   107: aload_3        
        //   108: ifnull          60
        //   111: aload_1        
        //   112: getfield        com/bytedance/android/livesdk/model/message/common/TextPiece.LJII:Lcom/bytedance/android/livesdk/model/message/common/TextPieceImage;
        //   115: astore_1       
        //   116: aload_1        
        //   117: ifnull          143
        //   120: aload_1        
        //   121: getfield        com/bytedance/android/livesdk/model/message/common/TextPieceImage.LIZ:Lcom/bytedance/android/live/base/model/ImageModel;
        //   124: astore_1       
        //   125: aload_3        
        //   126: aload_1        
        //   127: new             LX/1f9;
        //   130: dup            
        //   131: invokespecial   X/1f9.<init>:()V
        //   134: invokeinterface com/bytedance/android/livesdkapi/host/IHostFrescoHelper.LIZ:(Lcom/bytedance/android/live/base/model/ImageModel;LX/HZG;)LX/GfU;
        //   139: pop            
        //   140: goto            60
        //   143: aconst_null    
        //   144: astore_1       
        //   145: goto            125
        //   148: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    public final User LIZIZ() {
        return null;
    }
    
    @Override
    public final CharSequence p_() {
        return null;
    }
    
    @Override
    public final int y_() {
        return 2131234839;
    }
}
