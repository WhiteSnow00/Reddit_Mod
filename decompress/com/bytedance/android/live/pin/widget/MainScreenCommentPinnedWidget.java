// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.pin.widget;

import com.bytedance.android.widget.Widget;
import X.0CC;
import X.0CH;
import X.0cB;
import android.view.ViewGroup$MarginLayoutParams;
import X.1e0;
import android.view.View;
import X.10r;
import X.0II;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.1e5;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.dialogoeventbserver.LiveDialogStatusEventObserverManager;
import com.bytedance.android.live.pin.PinMessageViewModel;
import X.0Bp;
import X.CnW;
import X.0Bu;
import X.0Bv;
import X.Gh3;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import X.1JM;
import X.0Bf;
import com.bytedance.covode.number.Covode;
import X.6mZ;

public final class MainScreenCommentPinnedWidget extends BaseCommentPinnedWidget implements 6mZ
{
    static {
        Covode.recordClassIndex(10607);
    }
    
    @Override
    public final void LIZIZ() {
        public final class 1eC<T> implements 0Bf
        {
            public final /* synthetic */ MainScreenCommentPinnedWidget LIZ;
            
            static {
                Covode.recordClassIndex(10608);
            }
            
            public 1eC(final MainScreenCommentPinnedWidget liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/widget/Widget.widgetCallback:LX/GqT;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          64
        //     9: aload_1        
        //    10: invokeinterface X/GqT.getFragment:()Landroidx/fragment/app/Fragment;
        //    15: astore_2       
        //    16: aload_2        
        //    17: ifnull          64
        //    20: aload_2        
        //    21: invokevirtual   androidx/fragment/app/Fragment.getActivity:()LX/1nL;
        //    24: ifnull          64
        //    27: aload_1        
        //    28: invokeinterface X/GqT.getFragment:()Landroidx/fragment/app/Fragment;
        //    33: astore_2       
        //    34: aload_2        
        //    35: aconst_null    
        //    36: invokestatic    X/0Bv.LIZ:(Landroidx/fragment/app/Fragment;LX/0Bs;)LX/0Bu;
        //    39: astore_1       
        //    40: getstatic       X/CnW.LIZ:Z
        //    43: ifeq            51
        //    46: aload_1        
        //    47: aload_2        
        //    48: invokestatic    X/0Bp.LIZ:(LX/0Bu;Landroidx/fragment/app/Fragment;)V
        //    51: aload_0        
        //    52: aload_1        
        //    53: ldc             Lcom/bytedance/android/live/pin/PinMessageViewModel;.class
        //    55: invokevirtual   X/0Bu.LIZ:(Ljava/lang/Class;)LX/0Bq;
        //    58: checkcast       Lcom/bytedance/android/live/pin/PinMessageViewModel;
        //    61: putfield        com/bytedance/android/live/pin/widget/BaseCommentPinnedWidget.LIZJ:Lcom/bytedance/android/live/pin/PinMessageViewModel;
        //    64: aload_0        
        //    65: getfield        com/bytedance/android/widget/Widget.widgetCallback:LX/GqT;
        //    68: astore_3       
        //    69: aload_3        
        //    70: ifnull          134
        //    73: getstatic       com/bytedance/android/live/dialogoeventbserver/LiveDialogStatusEventObserverManager.LJ:LX/0fp;
        //    76: astore_2       
        //    77: aload_0        
        //    78: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    81: astore_1       
        //    82: aload_1        
        //    83: ldc             ""
        //    85: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    88: aload_3        
        //    89: invokeinterface X/GqT.getFragment:()Landroidx/fragment/app/Fragment;
        //    94: astore_3       
        //    95: aload_3        
        //    96: ldc             ""
        //    98: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   101: aload_2        
        //   102: aload_1        
        //   103: aload_3        
        //   104: invokevirtual   X/0fp.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;Landroidx/fragment/app/Fragment;)Lcom/bytedance/android/live/dialogoeventbserver/LiveDialogStatusEventObserverManager;
        //   107: astore_1       
        //   108: aload_1        
        //   109: ifnull          134
        //   112: aload_1        
        //   113: getfield        com/bytedance/android/live/dialogoeventbserver/LiveDialogStatusEventObserverManager.LIZIZ:LX/15z;
        //   116: astore_1       
        //   117: aload_1        
        //   118: ifnull          134
        //   121: aload_1        
        //   122: aload_0        
        //   123: new             LX/1eC;
        //   126: dup            
        //   127: aload_0        
        //   128: invokespecial   X/1eC.<init>:(Lcom/bytedance/android/live/pin/widget/MainScreenCommentPinnedWidget;)V
        //   131: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   134: return         
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
    public final 1e5 LIZJ() {
        MethodCollector.i(9825);
        Object view = ((Widget)this).getView();
        final boolean b = view instanceof ViewGroup;
        final 10r 10r = null;
        if (!b) {
            view = null;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        if (viewGroup != null) {
            final View liz = 0II.LIZ(LayoutInflater.from(((Widget)this).context), 2131562177, viewGroup, false);
            viewGroup.addView(liz);
            n.LIZIZ((Object)liz, "");
            final PinMessageViewModel lizj = super.LIZJ;
            10r liz2 = 10r;
            if (lizj != null) {
                liz2 = lizj.LIZ;
            }
            final 1e5 1e5 = new 1e5(liz, liz2);
            MethodCollector.o(9825);
            return 1e5;
        }
        MethodCollector.o(9825);
        return null;
    }
    
    @Override
    public final 1e0 LIZLLL() {
        MethodCollector.i(9827);
        Object view = ((Widget)this).getView();
        final boolean b = view instanceof ViewGroup;
        final 10r 10r = null;
        if (!b) {
            view = null;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        if (viewGroup != null) {
            final View liz = 0II.LIZ(LayoutInflater.from(((Widget)this).context), 2131562176, viewGroup, false);
            viewGroup.addView(liz);
            n.LIZIZ((Object)liz, "");
            final PinMessageViewModel lizj = super.LIZJ;
            10r liz2 = 10r;
            if (lizj != null) {
                liz2 = lizj.LIZ;
            }
            final 1e0 1e0 = new 1e0(liz, liz2);
            MethodCollector.o(9827);
            return 1e0;
        }
        MethodCollector.o(9827);
        return null;
    }
    
    public final int getLayoutId() {
        return 2131562186;
    }
    
    @Override
    public final void onLoad(final Object[] array) {
        super.onLoad(array);
        final View view = ((Widget)this).getView();
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = null;
        Object layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ViewGroup$MarginLayoutParams)) {
            layoutParams = viewGroup$MarginLayoutParams;
        }
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams2 = (ViewGroup$MarginLayoutParams)layoutParams;
        if (viewGroup$MarginLayoutParams2 != null) {
            viewGroup$MarginLayoutParams2.setMarginStart(0cB.LIZ(8.0f));
            viewGroup$MarginLayoutParams2.setMarginEnd(viewGroup$MarginLayoutParams2.getMarginStart());
            final View view2 = ((Widget)this).getView();
            if (view2 != null) {
                view2.requestLayout();
            }
        }
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
