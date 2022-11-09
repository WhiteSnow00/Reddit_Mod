// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.linkroom.widget;

import X.SRN;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.0CC;
import X.0CH;
import X.G8X;
import com.bytedance.android.widget.Widget;
import X.2P9;
import X.SRS;
import X.JOh;
import X.0cB;
import X.1ib;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.G6o;
import X.1Iu;
import X.0cC;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import X.1It;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public final class AudienceBottomLeftLinkWidget extends LiveRecyclableWidget implements 6mZ
{
    public 1It LIZ;
    public boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(7714);
    }
    
    private final Drawable LIZ(final Drawable drawable) {
        drawable.setAlpha(255);
        return drawable;
    }
    
    public final void LIZ() {
        final 1It liz = this.LIZ;
        if (liz != null) {
            final Drawable liz2 = 0cC.LIZ(this.LIZIZ());
            while (true) {
                Label_0049: {
                    if (liz2 == null) {
                        break Label_0049;
                    }
                    final Drawable mutate = liz2.mutate();
                    if (mutate == null) {
                        break Label_0049;
                    }
                    this.LIZ(mutate);
                    liz.setImageDrawable(new 1Iu(mutate));
                    return;
                }
                final Drawable mutate = null;
                continue;
            }
        }
    }
    
    public final int LIZIZ() {
        if (this.LIZIZ) {
            return 2131234473;
        }
        return 2131234472;
    }
    
    public final int getLayoutId() {
        final DataChannel dataChannel = ((LiveWidget)this).dataChannel;
        while (true) {
            Label_0040: {
                if (dataChannel == null) {
                    break Label_0040;
                }
                final Boolean b = (Boolean)dataChannel.LIZIZ((Class)G6o.class);
                if (b == null) {
                    break Label_0040;
                }
                final boolean booleanValue = b;
                this.LIZIZ = booleanValue;
                if (booleanValue) {
                    return 2131562346;
                }
                return 2131562345;
            }
            final boolean booleanValue = false;
            continue;
        }
    }
    
    public final void onInit(final Object[] array) {
        if (this.LIZIZ) {
            ((1ib)((LiveWidget)this).findViewById(2131372442)).setText((CharSequence)0cB.LIZ(2131830848));
        }
        this.LIZ = (1It)((LiveWidget)this).findViewById(2131366182);
        this.LIZ();
    }
    
    public final void onLoad(final Object[] array) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/bytedance/android/widget/Widget.hide:()V
        //     4: aload_0        
        //     5: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //     8: aload_0        
        //     9: ldc             LX/G8X;.class
        //    11: new             LX/2H5;
        //    14: dup            
        //    15: aload_0        
        //    16: invokespecial   X/2H5.<init>:(Lcom/bytedance/android/live/liveinteract/linkroom/widget/AudienceBottomLeftLinkWidget;)V
        //    19: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    22: pop            
        //    23: aload_0        
        //    24: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    27: aload_0        
        //    28: ldc             LX/2D4;.class
        //    30: new             LX/2H6;
        //    33: dup            
        //    34: aload_0        
        //    35: invokespecial   X/2H6.<init>:(Lcom/bytedance/android/live/liveinteract/linkroom/widget/AudienceBottomLeftLinkWidget;)V
        //    38: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    41: pop            
        //    42: return         
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
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public final void onUnload() {
    }
}
