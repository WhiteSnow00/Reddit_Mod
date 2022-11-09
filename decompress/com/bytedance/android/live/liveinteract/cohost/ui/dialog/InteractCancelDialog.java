// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.ui.dialog;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import X.2Es;
import X.H0H;
import kotlin.jvm.internal.n;
import X.1ib;
import X.CTM;
import X.2P9;
import X.SRS;
import X.F5g;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0xy;
import X.1NN;
import X.2Em;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.view.View;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0yJ;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class InteractCancelDialog extends LiveDialogFragment
{
    public 0yJ LIZ;
    public HashMap LIZIZ;
    
    static {
        Covode.recordClassIndex(7474);
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561786);
        fpL.LIZIZ = 2131887250;
        fpL.LJI = 80;
        fpL.LJIIIIZZ = -2;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZIZ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LIZIZ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final HashMap liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.clear();
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final 0yJ liz = this.LIZ;
        if (liz != null) {
            liz.LIZIZ();
        }
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 1wL extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ InteractCancelDialog LIZ;
            
            static {
                Covode.recordClassIndex(7476);
            }
            
            public 1wL(final InteractCancelDialog liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1wK extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ InteractCancelDialog LIZ;
            
            static {
                Covode.recordClassIndex(7475);
            }
            
            public 1wK(final InteractCancelDialog liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 0lx implements View$OnClickListener
        {
            public final /* synthetic */ InteractCancelDialog LIZ;
            
            static {
                Covode.recordClassIndex(7478);
            }
            
            public 0lx(final InteractCancelDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                ((DialogFragment)this.LIZ).dismiss();
                0xy.LIZ(1NN.LLFF.LIZ().LJIILL, "popup", "keep_waiting");
            }
        }
        public final class 0lw implements View$OnClickListener
        {
            public final /* synthetic */ InteractCancelDialog LIZ;
            
            static {
                Covode.recordClassIndex(7477);
            }
            
            public 0lw(final InteractCancelDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final DataChannel ljil = this.LIZ.LJIL;
                if (ljil != null) {
                    ljil.LIZJ((Class)2Em.class);
                }
                0xy.LIZ(1NN.LLFF.LIZ().LJIILL, "popup", "withdraw");
                ((DialogFragment)this.LIZ).dismiss();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    10: aload_0        
        //    11: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    14: astore_2       
        //    15: aload_2        
        //    16: ifnull          51
        //    19: aload_2        
        //    20: aload_0        
        //    21: ldc             LX/2Es;.class
        //    23: new             LX/1wK;
        //    26: dup            
        //    27: aload_0        
        //    28: invokespecial   X/1wK.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractCancelDialog;)V
        //    31: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    34: pop            
        //    35: aload_2        
        //    36: aload_0        
        //    37: ldc             LX/2Eu;.class
        //    39: new             LX/1wL;
        //    42: dup            
        //    43: aload_0        
        //    44: invokespecial   X/1wL.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractCancelDialog;)V
        //    47: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    50: pop            
        //    51: aload_1        
        //    52: ldc             2131372709
        //    54: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    57: checkcast       LX/0yJ;
        //    60: astore_1       
        //    61: aload_0        
        //    62: aload_1        
        //    63: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractCancelDialog.LIZ:LX/0yJ;
        //    66: aload_1        
        //    67: ifnull          74
        //    70: aload_1        
        //    71: invokevirtual   X/0yJ.LIZ:()V
        //    74: aload_0        
        //    75: ldc             2131373346
        //    77: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    80: checkcast       LX/1ib;
        //    83: astore_1       
        //    84: aload_1        
        //    85: ldc             ""
        //    87: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    90: aload_1        
        //    91: getstatic       X/1NN.LLFF:LX/0k5;
        //    94: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    97: getfield        X/1NN.LJJLI:Lcom/bytedance/android/live/base/model/user/User;
        //   100: invokestatic    X/0W3.LIZJ:(Lcom/bytedance/android/live/base/model/user/User;)Ljava/lang/String;
        //   103: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   106: getstatic       X/1NN.LLFF:LX/0k5;
        //   109: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   112: getfield        X/1NN.LJJLI:Lcom/bytedance/android/live/base/model/user/User;
        //   115: astore_1       
        //   116: aload_1        
        //   117: ifnull          336
        //   120: aload_1        
        //   121: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   124: ifnull          336
        //   127: aload_1        
        //   128: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   131: getfield        com/bytedance/android/live/base/model/ImageModel.mUrls:Ljava/util/List;
        //   134: astore_1       
        //   135: aload_1        
        //   136: ldc             ""
        //   138: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   141: aload_1        
        //   142: invokeinterface java/util/Collection.isEmpty:()Z
        //   147: iconst_1       
        //   148: ixor           
        //   149: ifeq            336
        //   152: aload_0        
        //   153: ldc             2131372708
        //   155: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   158: checkcast       Landroid/widget/ImageView;
        //   161: astore_2       
        //   162: getstatic       X/1NN.LLFF:LX/0k5;
        //   165: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   168: getfield        X/1NN.LJJLI:Lcom/bytedance/android/live/base/model/user/User;
        //   171: astore_1       
        //   172: aload_1        
        //   173: ifnull          331
        //   176: aload_1        
        //   177: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   180: astore_1       
        //   181: aload_0        
        //   182: ldc             2131372708
        //   184: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   187: checkcast       LX/7wT;
        //   190: astore_3       
        //   191: aload_3        
        //   192: ldc             ""
        //   194: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   197: aload_3        
        //   198: invokevirtual   X/7wT.getWidth:()I
        //   201: istore          4
        //   203: aload_0        
        //   204: ldc             2131372708
        //   206: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   209: checkcast       LX/7wT;
        //   212: astore_3       
        //   213: aload_3        
        //   214: ldc             ""
        //   216: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   219: aload_2        
        //   220: aload_1        
        //   221: iload           4
        //   223: aload_3        
        //   224: invokevirtual   X/7wT.getHeight:()I
        //   227: ldc             2131234398
        //   229: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //   232: aload_0        
        //   233: ldc             2131372994
        //   235: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   238: checkcast       LX/1so;
        //   241: new             LX/0lw;
        //   244: dup            
        //   245: aload_0        
        //   246: invokespecial   X/0lw.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractCancelDialog;)V
        //   249: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   252: aload_0        
        //   253: ldc             2131373109
        //   255: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   258: checkcast       LX/1so;
        //   261: new             LX/0lx;
        //   264: dup            
        //   265: aload_0        
        //   266: invokespecial   X/0lx.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractCancelDialog;)V
        //   269: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   272: getstatic       X/1NN.LLFF:LX/0k5;
        //   275: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   278: getfield        X/1NN.LJIILL:LX/0kf;
        //   281: astore_2       
        //   282: new             Ljava/util/HashMap;
        //   285: dup            
        //   286: invokespecial   java/util/HashMap.<init>:()V
        //   289: astore_1       
        //   290: aload_1        
        //   291: aload_2        
        //   292: iconst_0       
        //   293: invokestatic    X/0xg.LIZ:(Ljava/util/Map;LX/0kf;Z)V
        //   296: aload_1        
        //   297: invokestatic    X/0xy.LIZ:(Ljava/util/Map;)V
        //   300: aload_1        
        //   301: ldc             "event_type"
        //   303: getstatic       X/1NN.LLFF:LX/0k5;
        //   306: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   309: getfield        X/1NN.LJIILL:LX/0kf;
        //   312: invokevirtual   X/0kf.getType:()I
        //   315: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   318: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   323: pop            
        //   324: ldc             "cancel_connection_popup_show"
        //   326: aload_1        
        //   327: invokestatic    X/0xy.LIZ:(Ljava/lang/String;Ljava/util/Map;)V
        //   330: return         
        //   331: aconst_null    
        //   332: astore_1       
        //   333: goto            181
        //   336: aload_0        
        //   337: ldc             2131372708
        //   339: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   342: checkcast       Landroid/widget/ImageView;
        //   345: ldc             2131234398
        //   347: iconst_m1      
        //   348: iconst_m1      
        //   349: invokestatic    X/0cm.LIZ:(Landroid/widget/ImageView;III)V
        //   352: goto            232
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
}
