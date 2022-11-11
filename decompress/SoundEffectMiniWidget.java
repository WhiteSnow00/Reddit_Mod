// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.soundeffect;

import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.2CW;
import X.G69;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.0CC;
import X.2CN;
import X.F2r;
import X.BFk;
import X.F0v;
import X.Cye;
import X.2CX;
import X.0CI;
import android.view.View$OnClickListener;
import X.0i7;
import X.SRT;
import X.1to;
import X.H2o;
import X.1MW;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import X.0CH;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSoundEffectSetting;
import X.0cB;
import X.0Bu;
import X.0Bv;
import X.1MV;
import X.0iE;
import X.0iC;
import X.GTi;
import X.CTM;
import X.2P9;
import X.SRS;
import X.F5g;
import X.0gy;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import X.HAG;
import android.view.View;
import X.H2n;
import X.1jO;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public final class SoundEffectMiniWidget extends LiveWidget implements 6mZ
{
    public SoundEffectViewModel LIZ;
    public 1jO LIZIZ;
    public H2n LIZJ;
    public View LIZLLL;
    public HAG LJ;
    public long LJFF;
    
    static {
        Covode.recordClassIndex(6634);
    }
    
    public final int getLayoutId() {
        return 2131561950;
    }
    
    public final void hide() {
        super.hide();
        final HAG lj = this.LJ;
        if (lj != null) {
            lj.LIZJ = false;
        }
        0gy.LIZ.LIZ(super.dataChannel, true, this.LJFF);
    }
    
    public final void onCreate() {
        public final class 1tp extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ SoundEffectMiniWidget LIZ;
            
            static {
                Covode.recordClassIndex(6640);
            }
            
            public 1tp(final SoundEffectMiniWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/ies/sdk/widgets/LiveWidget.onCreate:()V
        //     4: aload_0        
        //     5: getfield        com/bytedance/android/widget/Widget.context:Landroid/content/Context;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ifnull          59
        //    13: aload_1        
        //    14: invokestatic    X/GTi.LIZ:(Landroid/content/Context;)LX/1nL;
        //    17: astore_1       
        //    18: aload_1        
        //    19: ifnull          59
        //    22: aload_0        
        //    23: aload_1        
        //    24: new             LX/1MV;
        //    27: dup            
        //    28: new             LX/0iC;
        //    31: dup            
        //    32: invokespecial   X/0iC.<init>:()V
        //    35: new             LX/0iE;
        //    38: dup            
        //    39: invokespecial   X/0iE.<init>:()V
        //    42: invokespecial   X/1MV.<init>:(LX/0iC;LX/0iE;)V
        //    45: invokestatic    X/0Bv.LIZ:(LX/1nL;LX/0Bs;)LX/0Bu;
        //    48: ldc             Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;.class
        //    50: invokevirtual   X/0Bu.LIZ:(Ljava/lang/Class;)LX/0Bq;
        //    53: checkcast       Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //    56: putfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LIZ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //    59: aload_0        
        //    60: invokevirtual   com/bytedance/android/widget/Widget.getView:()Landroid/view/View;
        //    63: astore_1       
        //    64: aload_1        
        //    65: ifnull          73
        //    68: aload_1        
        //    69: iconst_1       
        //    70: invokevirtual   android/view/View.setEnabled:(Z)V
        //    73: invokestatic    X/0cB.LJI:()Z
        //    76: ifeq            379
        //    79: aload_0        
        //    80: ldc             2131362762
        //    82: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //    85: ldc             2131234171
        //    87: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //    90: aload_0        
        //    91: aload_0        
        //    92: ldc             2131370703
        //    94: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //    97: checkcast       LX/H2n;
        //   100: putfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LIZJ:LX/H2n;
        //   103: aload_0        
        //   104: aload_0        
        //   105: ldc             2131363579
        //   107: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //   110: putfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LIZLLL:Landroid/view/View;
        //   113: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting;
        //   116: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting.miniPanelWithName:()Z
        //   119: ifeq            372
        //   122: ldc             2131561957
        //   124: istore_2       
        //   125: aload_0        
        //   126: new             LX/1jO;
        //   129: dup            
        //   130: aload_0        
        //   131: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   134: iconst_1       
        //   135: aload_0        
        //   136: aload_0        
        //   137: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LIZ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   140: iload_2        
        //   141: invokespecial   X/1jO.<init>:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;ZLX/0CH;Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;I)V
        //   144: putfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LIZIZ:LX/1jO;
        //   147: aload_0        
        //   148: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LIZJ:LX/H2n;
        //   151: astore_3       
        //   152: aload_3        
        //   153: ifnull          281
        //   156: aload_3        
        //   157: aconst_null    
        //   158: invokevirtual   androidx/recyclerview/widget/RecyclerView.setItemAnimator:(LX/0EI;)V
        //   161: aload_0        
        //   162: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LIZIZ:LX/1jO;
        //   165: astore_1       
        //   166: aload_1        
        //   167: ifnonnull       175
        //   170: ldc             ""
        //   172: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   175: aload_3        
        //   176: aload_1        
        //   177: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //   180: aload_3        
        //   181: invokevirtual   X/H2n.getContext:()Landroid/content/Context;
        //   184: pop            
        //   185: aload_3        
        //   186: new             Landroidx/recyclerview/widget/LinearLayoutManager;
        //   189: dup            
        //   190: iconst_0       
        //   191: iconst_0       
        //   192: invokespecial   androidx/recyclerview/widget/LinearLayoutManager.<init>:(IZ)V
        //   195: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //   198: aload_3        
        //   199: iconst_1       
        //   200: invokevirtual   androidx/recyclerview/widget/RecyclerView.setHasFixedSize:(Z)V
        //   203: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting;
        //   206: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting.miniPanelWithName:()Z
        //   209: ifeq            352
        //   212: aload_3        
        //   213: new             LX/1MW;
        //   216: dup            
        //   217: ldc             12.0
        //   219: ldc             62.0
        //   221: ldc             7.0
        //   223: invokespecial   X/1MW.<init>:(FFF)V
        //   226: invokevirtual   androidx/recyclerview/widget/RecyclerView.LIZ:(LX/0EJ;)V
        //   229: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting;
        //   232: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveSoundEffectSetting.miniPanelWithName:()Z
        //   235: ifeq            345
        //   238: getstatic       X/H2o.EFFECT_SOUND_MINI_V1:LX/H2o;
        //   241: astore_1       
        //   242: aload_3        
        //   243: aload_1        
        //   244: iconst_1       
        //   245: invokevirtual   X/H2n.LIZ:(LX/H2o;Z)Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;
        //   248: astore_1       
        //   249: aload_1        
        //   250: ifnull          260
        //   253: aload_1        
        //   254: iconst_0       
        //   255: bipush          7
        //   257: invokevirtual   androidx/recyclerview/widget/RecyclerView$RecycledViewPool.setMaxRecycledViews:(II)V
        //   260: aload_0        
        //   261: new             LX/HAG;
        //   264: dup            
        //   265: iconst_0       
        //   266: aload_3        
        //   267: new             LX/1to;
        //   270: dup            
        //   271: aload_0        
        //   272: invokespecial   X/1to.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget;)V
        //   275: invokespecial   X/HAG.<init>:(ILandroidx/recyclerview/widget/RecyclerView;LX/SRT;)V
        //   278: putfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LJ:LX/HAG;
        //   281: aload_0        
        //   282: invokevirtual   com/bytedance/android/widget/Widget.hide:()V
        //   285: aload_0        
        //   286: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget.LIZLLL:Landroid/view/View;
        //   289: astore_1       
        //   290: aload_1        
        //   291: ifnull          306
        //   294: aload_1        
        //   295: new             LX/0i7;
        //   298: dup            
        //   299: aload_0        
        //   300: invokespecial   X/0i7.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget;)V
        //   303: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   306: aload_0        
        //   307: invokestatic    X/0CI.LIZ:(LX/0CH;)LX/15r;
        //   310: aconst_null    
        //   311: new             LX/2CX;
        //   314: dup            
        //   315: aload_0        
        //   316: aconst_null    
        //   317: invokespecial   X/2CX.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget;LX/Cye;)V
        //   320: iconst_3       
        //   321: invokestatic    X/F0v.LIZ:(LX/BFk;LX/F2r;LX/SRT;I)LX/F2K;
        //   324: pop            
        //   325: aload_0        
        //   326: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   329: aload_0        
        //   330: ldc             LX/2CN;.class
        //   332: new             LX/1tp;
        //   335: dup            
        //   336: aload_0        
        //   337: invokespecial   X/1tp.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectMiniWidget;)V
        //   340: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   343: pop            
        //   344: return         
        //   345: getstatic       X/H2o.EFFECT_SOUND_MINI_V2:LX/H2o;
        //   348: astore_1       
        //   349: goto            242
        //   352: aload_3        
        //   353: new             LX/1MW;
        //   356: dup            
        //   357: ldc             12.0
        //   359: ldc             62.0
        //   361: ldc             8.0
        //   363: invokespecial   X/1MW.<init>:(FFF)V
        //   366: invokevirtual   androidx/recyclerview/widget/RecyclerView.LIZ:(LX/0EJ;)V
        //   369: goto            229
        //   372: ldc_w           2131561958
        //   375: istore_2       
        //   376: goto            125
        //   379: aload_0        
        //   380: ldc             2131362762
        //   382: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //   385: ldc_w           2131234170
        //   388: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   391: goto            90
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
    
    public final void onDestroy() {
        super.onDestroy();
        0gy.LIZ.LIZ(super.dataChannel, true, this.LJFF);
    }
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public final void show() {
        super.show();
        final DataChannel dataChannel = super.dataChannel;
        while (true) {
            Label_0085: {
                if (dataChannel == null) {
                    break Label_0085;
                }
                final Room room = (Room)dataChannel.LIZIZ((Class)G69.class);
                if (room == null) {
                    break Label_0085;
                }
                final long id = room.getId();
                F0v.LIZ((BFk)0CI.LIZ((0CH)this), (F2r)null, (SRT)new 2CW(this, id, null), 3);
                final HAG lj = this.LJ;
                if (lj != null) {
                    lj.LIZ();
                }
                0gy.LIZ.LIZ(super.dataChannel, true);
                this.LJFF = System.currentTimeMillis();
                return;
            }
            final long id = 0L;
            continue;
        }
    }
}
