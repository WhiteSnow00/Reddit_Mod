// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import android.text.TextUtils;
import webcast.data.MsgFilter;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import android.graphics.Bitmap$Config;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.GiftMessage;

public class 2HS extends 2Gk<GiftMessage> implements 10R, 11K
{
    static {
        Covode.recordClassIndex(10863);
    }
    
    public 2HS(final GiftMessage giftMessage) {
        super((H31)giftMessage);
    }
    
    @Override
    public final void LIZ(final a a) {
        public final class 1f8 implements HZG
        {
            public final /* synthetic */ a LIZ;
            public final /* synthetic */ 2HS LIZIZ;
            
            static {
                Covode.recordClassIndex(10864);
            }
            
            public 1f8(final 2HS liziz, final a liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            public final void LIZ(Bitmap copy) {
                MethodCollector.i(9854);
                if (copy == null) {
                    MethodCollector.o(9854);
                    return;
                }
                copy = copy.copy(Bitmap$Config.ARGB_8888, true);
                final a liz = this.LIZ;
                if (liz != null) {
                    liz.LIZ(copy, (2Gk<? extends H31>)this.LIZIZ);
                }
                MethodCollector.o(9854);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/2Gk.LJIILIIL:LX/H31;
        //     4: getfield        X/HDi.baseMessage:Lcom/bytedance/android/livesdkapi/message/CommonMessageData;
        //     7: ifnull          23
        //    10: aload_0        
        //    11: getfield        X/2Gk.LJIILIIL:LX/H31;
        //    14: getfield        X/HDi.baseMessage:Lcom/bytedance/android/livesdkapi/message/CommonMessageData;
        //    17: getfield        com/bytedance/android/livesdkapi/message/CommonMessageData.LJIIIZ:Lcom/bytedance/android/livesdk/model/message/common/Text;
        //    20: ifnonnull       24
        //    23: return         
        //    24: aload_0        
        //    25: getfield        X/2Gk.LJIILIIL:LX/H31;
        //    28: getfield        X/HDi.baseMessage:Lcom/bytedance/android/livesdkapi/message/CommonMessageData;
        //    31: getfield        com/bytedance/android/livesdkapi/message/CommonMessageData.LJIIIZ:Lcom/bytedance/android/livesdk/model/message/common/Text;
        //    34: astore_2       
        //    35: aload_2        
        //    36: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZIZ:Ljava/lang/String;
        //    39: astore_3       
        //    40: aload_2        
        //    41: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZ:Ljava/lang/String;
        //    44: ifnull          60
        //    47: invokestatic    X/VR3.LIZ:()LX/VR3;
        //    50: aload_2        
        //    51: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZ:Ljava/lang/String;
        //    54: invokevirtual   X/VR3.LIZ:(Ljava/lang/String;)Ljava/lang/String;
        //    57: ifnonnull       64
        //    60: aload_3        
        //    61: ifnull          23
        //    64: aload_2        
        //    65: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZLLL:Ljava/util/List;
        //    68: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    73: astore          4
        //    75: aload           4
        //    77: invokeinterface java/util/Iterator.hasNext:()Z
        //    82: ifeq            23
        //    85: aload           4
        //    87: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    92: checkcast       Lcom/bytedance/android/livesdk/model/message/common/TextPiece;
        //    95: astore          5
        //    97: aload           5
        //    99: getfield        com/bytedance/android/livesdk/model/message/common/TextPiece.LIZ:I
        //   102: getstatic       X/HYX.GIFT:LX/HYX;
        //   105: invokevirtual   X/HYX.getPieceType:()I
        //   108: if_icmpne       75
        //   111: aload           5
        //   113: getfield        com/bytedance/android/livesdk/model/message/common/TextPiece.LJ:Lcom/bytedance/android/livesdk/model/message/common/TextPieceGift;
        //   116: ifnull          75
        //   119: aload_0        
        //   120: getfield        X/2Gk.LJIILIIL:LX/H31;
        //   123: checkcast       Lcom/bytedance/android/livesdk/model/message/GiftMessage;
        //   126: getfield        com/bytedance/android/livesdk/model/message/GiftMessage.LJIIZILJ:Lcom/bytedance/android/livesdk/model/Gift;
        //   129: astore          6
        //   131: aload           6
        //   133: ifnonnull       137
        //   136: return         
        //   137: aload           6
        //   139: getfield        com/bytedance/android/livesdk/model/Gift.LIZIZ:Lcom/bytedance/android/live/base/model/ImageModel;
        //   142: astore_3       
        //   143: aload_3        
        //   144: astore_2       
        //   145: aload           6
        //   147: getfield        com/bytedance/android/livesdk/model/Gift.LJJJI:Ljava/util/List;
        //   150: ifnull          225
        //   153: aload           6
        //   155: getfield        com/bytedance/android/livesdk/model/Gift.LJJJI:Ljava/util/List;
        //   158: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   163: astore          6
        //   165: aload_3        
        //   166: astore_2       
        //   167: aload           6
        //   169: invokeinterface java/util/Iterator.hasNext:()Z
        //   174: ifeq            225
        //   177: aload           6
        //   179: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   184: checkcast       Lcom/bytedance/android/livesdk/gift/model/GiftColorInfo;
        //   187: astore          7
        //   189: aload           7
        //   191: getfield        com/bytedance/android/livesdk/gift/model/GiftColorInfo.LIZ:Ljava/lang/Long;
        //   194: invokevirtual   java/lang/Long.longValue:()J
        //   197: aload           5
        //   199: getfield        com/bytedance/android/livesdk/model/message/common/TextPiece.LJ:Lcom/bytedance/android/livesdk/model/message/common/TextPieceGift;
        //   202: getfield        com/bytedance/android/livesdk/model/message/common/TextPieceGift.LIZLLL:J
        //   205: lcmp           
        //   206: ifne            165
        //   209: aload_3        
        //   210: astore_2       
        //   211: aload           7
        //   213: getfield        com/bytedance/android/livesdk/gift/model/GiftColorInfo.LJ:Lcom/bytedance/android/live/base/model/ImageModel;
        //   216: ifnull          225
        //   219: aload           7
        //   221: getfield        com/bytedance/android/livesdk/gift/model/GiftColorInfo.LJ:Lcom/bytedance/android/live/base/model/ImageModel;
        //   224: astore_2       
        //   225: ldc             Lcom/bytedance/android/livesdkapi/host/IHostFrescoHelper;.class
        //   227: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   230: checkcast       Lcom/bytedance/android/livesdkapi/host/IHostFrescoHelper;
        //   233: aload_2        
        //   234: new             LX/1f8;
        //   237: dup            
        //   238: aload_0        
        //   239: aload_1        
        //   240: invokespecial   X/1f8.<init>:(LX/2HS;LX/10Z;)V
        //   243: invokeinterface com/bytedance/android/livesdkapi/host/IHostFrescoHelper.LIZ:(Lcom/bytedance/android/live/base/model/ImageModel;LX/HZG;)LX/GfU;
        //   248: pop            
        //   249: goto            75
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
    
    @Override
    public final void LIZ(final UserProfileEvent userProfileEvent) {
        if (super.LIZLLL != null && super.LIZLLL.LJ == HCo.ExtendedGift) {
            userProfileEvent.mEventPage = "live_gift_record";
        }
    }
    
    @Override
    public final User LIZIZ() {
        return ((GiftMessage)super.LJIILIIL).LIZIZ;
    }
    
    @Override
    public final void LIZIZ(final 10r 10r) {
        super.LIZIZ(10r);
        final ISubscribeService subscribeService = 0jR.LIZ(ISubscribeService.class);
        if (0jR.LIZ(IGiftService.class).isSubscriptionGift(((GiftMessage)super.LJIILIIL).LIZLLL) && 10r.LJIIZILJ != null && 10r.LJIILL != null) {
            subscribeService.sendSubscribeGuideIfNeed(10r.LJIIIZ, 10r.LJIIZILJ, 10r.LJIILL);
        }
    }
    
    @Override
    public final CharSequence LIZJ(final User user) {
        if (this.LJJIJL()) {
            return 0W3.LIZIZ(user);
        }
        return 0W3.LIZ(user);
    }
    
    @Override
    public final MsgFilter LIZJ() {
        return ((GiftMessage)super.LJIILIIL).LJIJJLI;
    }
    
    @Override
    public final boolean LJIILLIIL() {
        return !this.LJJIJL();
    }
    
    @Override
    public final CharSequence LJJIZ() {
        return super.LJJIZ();
    }
    
    @Override
    public final boolean LJJJJ() {
        return true;
    }
    
    @Override
    public final CharSequence p_() {
        final String s = null;
        String substring;
        try {
            String string;
            if (this.LIZIZ() != null) {
                string = this.LIZJ(this.LIZIZ()).toString();
            }
            else {
                string = "";
            }
            final String ljff = ((HDi)super.LJIILIIL).baseMessage.LJFF;
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(":");
            substring = s;
            if (ljff.startsWith(sb.toString())) {
                substring = ljff.substring(string.length() + 1);
            }
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
            substring = s;
        }
        String ljff2 = substring;
        if (TextUtils.isEmpty((CharSequence)substring)) {
            ljff2 = ((HDi)super.LJIILIIL).baseMessage.LJFF;
        }
        final 10q textMessageConfig = 0jR.LIZ(IPublicScreenService.class).getTextMessageConfig();
        int liziz;
        if (textMessageConfig == null) {
            liziz = 0;
        }
        else {
            liziz = textMessageConfig.LIZIZ();
        }
        int n;
        if (textMessageConfig == null) {
            n = 0;
        }
        else {
            n = 2131100831;
        }
        return (CharSequence)11M.LIZIZ(((GiftMessage)super.LJIILIIL).LIZIZ, "\uff1a", ljff2, liziz, n, (HYY)this);
    }
    
    @Override
    public final boolean v_() {
        return true;
    }
    
    @Override
    public final int y_() {
        return 2131234700;
    }
}
