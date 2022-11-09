// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.education;

import X.44T;
import com.bytedance.android.widget.Widget;
import X.Giy;
import X.44V;
import X.0a8;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.H25;
import X.GST;
import X.G6A;
import X.0CC;
import X.0CH;
import X.0aG;
import X.F5g;
import android.content.Context;
import X.GIK;
import X.0ba;
import X.2P9;
import com.bytedance.hybrid.spark.SparkContext;
import X.SRS;
import X.0jR;
import com.bytedance.android.live.browser.IHybridContainerService;
import kotlin.n.y;
import X.Giv;
import X.Fra;
import kotlin.jvm.internal.n;
import X.Fk2;
import X.Gkn;
import X.CTM;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNewGameBroadcastEducationScheme;
import android.view.View;
import android.view.View$OnClickListener;
import X.0ZE;
import X.0ZB;
import com.bytedance.covode.number.Covode;
import X.6mZ;
import com.bytedance.android.live.broadcast.banner.BannerWidget;

public final class GameLiveNewBroadcastEducationBannerWidget extends BannerWidget implements 6mZ
{
    public boolean LJI;
    public String LJII;
    
    static {
        Covode.recordClassIndex(5351);
    }
    
    public GameLiveNewBroadcastEducationBannerWidget() {
        super.LIZIZ = 3;
        this.LJII = "game_live_new_broadcast_education_banner";
    }
    
    @Override
    public final String LIZ() {
        return this.LJII;
    }
    
    @Override
    public final void LIZJ() {
        super.LIZJ();
        if (!super.LJ && !this.LJI) {
            this.LJI = true;
            0ZE.LIZ(0ZB.Banner);
        }
    }
    
    @Override
    public final void LIZLLL() {
        super.LIZLLL();
        if (super.LJ && !this.LJI) {
            this.LJI = true;
            0ZE.LIZ(0ZB.Banner);
        }
    }
    
    public final void LJ() {
        public final class 1rg extends F5g implements SRS<0aG, 2P9>
        {
            public final /* synthetic */ GameLiveNewBroadcastEducationBannerWidget LIZ;
            
            static {
                Covode.recordClassIndex(5353);
            }
            
            public 1rg(final GameLiveNewBroadcastEducationBannerWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 0ZA implements View$OnClickListener
        {
            public final /* synthetic */ GameLiveNewBroadcastEducationBannerWidget LIZ;
            
            static {
                Covode.recordClassIndex(5352);
            }
            
            public 0ZA(final GameLiveNewBroadcastEducationBannerWidget liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final GameLiveNewBroadcastEducationBannerWidget liz = this.LIZ;
                final String value = LiveNewGameBroadcastEducationScheme.INSTANCE.getValue();
                if (value.length() > 0) {
                    final 0ZB banner = 0ZB.Banner;
                    CTM.LIZ((Object)banner);
                    final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_takepage_guide_click");
                    final GIK liziz = Fk2.LIZ().LIZIZ();
                    n.LIZIZ((Object)liziz, "");
                    liz2.LIZ("anchor_id", liziz.LIZJ());
                    liz2.LIZ("live_type", Fra.SCREEN_RECORD.logStreamingType);
                    liz2.LIZ("event_page", banner.getValue());
                    liz2.LIZLLL();
                    final String string = ((Giy)Giv.LIZ.LIZJ(y.LIZ(value, "{ENTER_FROM}", 0ZB.Banner.getValue(), false))).LJIIIIZZ().toString();
                    n.LIZIZ((Object)string, "");
                    final IHybridContainerService hybridContainerService = 0jR.LIZ(IHybridContainerService.class);
                    final Context context = ((Widget)liz).context;
                    n.LIZIZ((Object)context, "");
                    hybridContainerService.openSparkContainer(context, string, null);
                    return;
                }
                0ba.LIZ(6, "GameLiveNewBroadcastEducationBannerWidget", "openH5EducationSchemeUrl. ");
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/broadcast/preview/PreviewWidget.LJ:()V
        //     4: aload_0        
        //     5: invokevirtual   com/bytedance/android/widget/Widget.getView:()Landroid/view/View;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ifnull          25
        //    13: aload_1        
        //    14: new             LX/0ZA;
        //    17: dup            
        //    18: aload_0        
        //    19: invokespecial   X/0ZA.<init>:(Lcom/bytedance/android/live/broadcast/education/GameLiveNewBroadcastEducationBannerWidget;)V
        //    22: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    25: aload_0        
        //    26: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    29: astore_1       
        //    30: aload_1        
        //    31: ifnull          50
        //    34: aload_1        
        //    35: aload_0        
        //    36: ldc             LX/G6A;.class
        //    38: new             LX/1rg;
        //    41: dup            
        //    42: aload_0        
        //    43: invokespecial   X/1rg.<init>:(Lcom/bytedance/android/live/broadcast/education/GameLiveNewBroadcastEducationBannerWidget;)V
        //    46: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    49: pop            
        //    50: return         
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
    
    public final int getLayoutId() {
        return 2131562470;
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    @Override
    public final void show() {
        final DataChannel dataChannel = super.dataChannel;
        0aG 0aG;
        if (dataChannel != null) {
            0aG = (0aG)dataChannel.LIZIZ((Class)G6A.class);
        }
        else {
            0aG = null;
        }
        while (true) {
            Label_0156: {
                if (0aG == null) {
                    break Label_0156;
                }
                final 0a8 ljjijil = 0aG.LJJIJIL;
                if (ljjijil == null) {
                    break Label_0156;
                }
                final Boolean liz = ljjijil.LIZ;
                if (liz == null) {
                    break Label_0156;
                }
                final boolean booleanValue = liz;
                Boolean value;
                if (!super.LJ) {
                    final 44V lllii = GST.LLLII;
                    n.LIZIZ((Object)lllii, "");
                    value = (Boolean)((44T)lllii).LIZ();
                }
                else if ((value = (Boolean)GST.y.LIZ()) == null) {
                    value = false;
                }
                if (H25.LJFF) {
                    final StringBuilder sb = new StringBuilder("shouldShowEducationBanner. hadStaredGameLive=");
                    sb.append(booleanValue);
                    sb.append(", hadShowH5=");
                    sb.append(value);
                    0ba.LIZ(4, "GameLiveNewBroadcastEducationBannerWidget", sb.toString());
                }
                if (!booleanValue && !value) {
                    super.show();
                }
                return;
            }
            final boolean booleanValue = true;
            continue;
        }
    }
}
