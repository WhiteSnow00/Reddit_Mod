// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.game.partnership.widget;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.0b0;
import X.0jR;
import com.bytedance.android.live.browser.IBrowserService;
import X.0CC;
import X.0CH;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;
import kotlin.jvm.internal.n;
import X.G1h;
import java.util.Map;
import X.FJ3;
import X.8si;
import X.Fqb;
import X.G6q;
import X.Fra;
import X.Fwf;
import X.8sj;
import X.FkZ;
import X.0ZG;
import X.2P9;
import X.SRS;
import X.F5g;
import X.GqT;
import com.bytedance.android.widget.Widget;
import X.CTM;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.1BF;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;

public final class GamePartnershipAudienceEntranceWidget extends RoomRecycleWidget implements 6mZ
{
    public 1BF LIZ;
    public 1BF LIZIZ;
    public Room LIZJ;
    public boolean LIZLLL;
    
    static {
        Covode.recordClassIndex(5378);
    }
    
    public final void LIZ(final View view) {
        CTM.LIZ((Object)view);
        view.setVisibility(0);
    }
    
    public final void LIZIZ(final View view) {
        CTM.LIZ((Object)view);
        view.setVisibility(4);
    }
    
    public final int getLayoutId() {
        return 2131562472;
    }
    
    public final void hide() {
        if (((Widget)this).contentView == null) {
            this.LIZLLL = false;
        }
        final View contentView = ((Widget)this).contentView;
        if (contentView != null) {
            contentView.setVisibility(8);
        }
        final GqT widgetCallback = ((Widget)this).widgetCallback;
        if (widgetCallback != null) {
            widgetCallback.onHide((Widget)this);
        }
    }
    
    public final boolean needRecycle() {
        return false;
    }
    
    public final void onInit(final Object[] array) {
        public final class 1ru extends F5g implements SRS<View, 2P9>
        {
            public final /* synthetic */ GamePartnershipAudienceEntranceWidget LIZ;
            
            static {
                Covode.recordClassIndex(5379);
            }
            
            public 1ru(final GamePartnershipAudienceEntranceWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/widget/Widget.contentView:Landroid/view/View;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          21
        //     9: aload_1        
        //    10: new             LX/1ru;
        //    13: dup            
        //    14: aload_0        
        //    15: invokespecial   X/1ru.<init>:(Lcom/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget;)V
        //    18: invokestatic    X/GTi.LIZ:(Landroid/view/View;LX/SRS;)V
        //    21: aload_0        
        //    22: getfield        com/bytedance/android/widget/Widget.contentView:Landroid/view/View;
        //    25: astore_1       
        //    26: aconst_null    
        //    27: astore_2       
        //    28: aload_1        
        //    29: ifnull          278
        //    32: aload_1        
        //    33: ldc             2131365622
        //    35: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    38: checkcast       LX/1BF;
        //    41: astore_1       
        //    42: aload_0        
        //    43: aload_1        
        //    44: putfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZ:LX/1BF;
        //    47: aload_0        
        //    48: getfield        com/bytedance/android/widget/Widget.contentView:Landroid/view/View;
        //    51: astore_1       
        //    52: aload_1        
        //    53: ifnull          273
        //    56: aload_1        
        //    57: ldc             2131365621
        //    59: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    62: checkcast       LX/1BF;
        //    65: astore_1       
        //    66: aload_0        
        //    67: aload_1        
        //    68: putfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZIZ:LX/1BF;
        //    71: aload_0        
        //    72: getfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZLLL:Z
        //    75: ifeq            266
        //    78: aload_0        
        //    79: invokevirtual   com/bytedance/android/widget/Widget.show:()V
        //    82: aload_0        
        //    83: getfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZ:LX/1BF;
        //    86: ldc             "gamelive_audience_gamepad_card_show_lottie.zip"
        //    88: iconst_0       
        //    89: invokestatic    X/0cb.LIZ:(LX/1BF;Ljava/lang/String;Z)V
        //    92: aload_0        
        //    93: getfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZIZ:LX/1BF;
        //    96: ldc             "gamelive_audience_gamepad_card_hide_lottie.zip"
        //    98: iconst_0       
        //    99: invokestatic    X/0cb.LIZ:(LX/1BF;Ljava/lang/String;Z)V
        //   102: aload_0        
        //   103: getfield        com/bytedance/android/widget/Widget.widgetCallback:LX/GqT;
        //   106: astore_1       
        //   107: aload_1        
        //   108: ifnull          120
        //   111: aload_1        
        //   112: invokeinterface X/GqT.getFragment:()Landroidx/fragment/app/Fragment;
        //   117: ifnonnull       203
        //   120: aload_0        
        //   121: getfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZ:LX/1BF;
        //   124: astore_1       
        //   125: aload_1        
        //   126: ifnull          141
        //   129: aload_1        
        //   130: new             LX/0ZI;
        //   133: dup            
        //   134: aload_0        
        //   135: invokespecial   X/0ZI.<init>:(Lcom/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget;)V
        //   138: invokevirtual   X/1BF.LIZ:(Landroid/animation/Animator$AnimatorListener;)V
        //   141: aload_0        
        //   142: getfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZIZ:LX/1BF;
        //   145: astore_1       
        //   146: aload_1        
        //   147: ifnull          162
        //   150: aload_1        
        //   151: new             LX/0ZJ;
        //   154: dup            
        //   155: aload_0        
        //   156: invokespecial   X/0ZJ.<init>:(Lcom/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget;)V
        //   159: invokevirtual   X/1BF.LIZ:(Landroid/animation/Animator$AnimatorListener;)V
        //   162: aload_0        
        //   163: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   166: astore_3       
        //   167: aload_2        
        //   168: astore_1       
        //   169: aload_3        
        //   170: ifnull          183
        //   173: aload_3        
        //   174: ldc             LX/G69;.class
        //   176: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   179: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   182: astore_1       
        //   183: aload_0        
        //   184: aload_1        
        //   185: putfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   188: aload_0        
        //   189: getfield        com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZ:LX/1BF;
        //   192: astore_1       
        //   193: aload_1        
        //   194: ifnull          202
        //   197: aload_0        
        //   198: aload_1        
        //   199: invokevirtual   com/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget.LIZ:(Landroid/view/View;)V
        //   202: return         
        //   203: aload_0        
        //   204: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   207: astore_3       
        //   208: aload_3        
        //   209: ifnull          120
        //   212: aload_0        
        //   213: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   216: astore_1       
        //   217: aload_1        
        //   218: ifnull          261
        //   221: aload_1        
        //   222: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:()LX/0CH;
        //   225: astore_1       
        //   226: aload_3        
        //   227: aload_1        
        //   228: ldc             LX/G8I;.class
        //   230: new             LX/1rv;
        //   233: dup            
        //   234: aload_0        
        //   235: invokespecial   X/1rv.<init>:(Lcom/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget;)V
        //   238: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   241: pop            
        //   242: aload_3        
        //   243: aload_0        
        //   244: ldc             LX/GNH;.class
        //   246: new             LX/1rw;
        //   249: dup            
        //   250: aload_0        
        //   251: invokespecial   X/1rw.<init>:(Lcom/bytedance/android/live/broadcast/game/partnership/widget/GamePartnershipAudienceEntranceWidget;)V
        //   254: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   257: pop            
        //   258: goto            120
        //   261: aconst_null    
        //   262: astore_1       
        //   263: goto            226
        //   266: aload_0        
        //   267: invokevirtual   com/bytedance/android/widget/Widget.hide:()V
        //   270: goto            82
        //   273: aconst_null    
        //   274: astore_1       
        //   275: goto            66
        //   278: aconst_null    
        //   279: astore_1       
        //   280: goto            42
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
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public final void onUnload() {
        super.onUnload();
        final 1BF liz = this.LIZ;
        if (liz != null) {
            liz.LJFF();
        }
        final 1BF liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LJFF();
        }
        final IBrowserService browserService = 0jR.LIZ(IBrowserService.class);
        if (browserService != null) {
            final 0b0 hybridDialogManager = browserService.getHybridDialogManager();
            if (hybridDialogManager != null) {
                hybridDialogManager.LIZ();
            }
        }
    }
    
    public final void show() {
        if (((Widget)this).contentView == null) {
            this.LIZLLL = true;
        }
        final View contentView = ((Widget)this).contentView;
        if (contentView != null) {
            contentView.setVisibility(0);
        }
        final GqT widgetCallback = ((Widget)this).widgetCallback;
        if (widgetCallback != null) {
            widgetCallback.onShow((Widget)this);
        }
        final G1h liz = G1h.LIZ;
        final DataChannel dataChannel = ((LiveWidget)this).dataChannel;
        n.LIZIZ((Object)dataChannel, "");
        liz.LIZ(dataChannel);
    }
}
