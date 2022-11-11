// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.dialog;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import X.HFv;
import android.widget.ImageView;
import X.0eu;
import X.Fk2;
import X.0W3;
import android.widget.TextView;
import kotlin.jvm.internal.n;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.CTM;
import X.2P9;
import X.SRS;
import X.F5g;
import android.view.View$OnClickListener;
import android.view.View;
import X.FpL;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1so;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class MultiGuestFollowAndApplyDialog extends LiveDialogFragment
{
    public 1so LIZ;
    public OnFollowRequestListener LIZIZ;
    public HashMap LIZJ;
    
    static {
        Covode.recordClassIndex(8759);
    }
    
    public static Object LIZ(final Bundle bundle, final String s) {
        try {
            return bundle.get(s);
        }
        catch (final Exception | OutOfMemoryError exception | OutOfMemoryError) {
            return null;
        }
    }
    
    public final boolean D_() {
        final OnFollowRequestListener liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(false);
        }
        return super.D_();
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561869);
        fpL.LIZIZ = 2131887299;
        fpL.LJIIIIZZ = -1;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZJ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LIZJ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final HashMap lizj = this.LIZJ;
        if (lizj != null) {
            lizj.clear();
        }
    }
    
    public final void onViewCreated(final View view, final Bundle arguments) {
        public final class 21Z extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiGuestFollowAndApplyDialog LIZ;
            
            static {
                Covode.recordClassIndex(8765);
            }
            
            public 21Z(final MultiGuestFollowAndApplyDialog liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 21Y extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiGuestFollowAndApplyDialog LIZ;
            
            static {
                Covode.recordClassIndex(8764);
            }
            
            public 21Y(final MultiGuestFollowAndApplyDialog liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 0rz implements View$OnClickListener
        {
            public final /* synthetic */ MultiGuestFollowAndApplyDialog LIZ;
            
            static {
                Covode.recordClassIndex(8763);
            }
            
            public 0rz(final MultiGuestFollowAndApplyDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final OnFollowRequestListener liziz = this.LIZ.LIZIZ;
                if (liziz != null) {
                    liziz.LIZ(false);
                }
            }
        }
        public final class 0ry implements View$OnClickListener
        {
            public final /* synthetic */ MultiGuestFollowAndApplyDialog LIZ;
            
            static {
                Covode.recordClassIndex(8762);
            }
            
            public 0ry(final MultiGuestFollowAndApplyDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final OnFollowRequestListener liziz = this.LIZ.LIZIZ;
                if (liziz != null) {
                    liziz.LIZ(true);
                }
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
        //    11: invokevirtual   androidx/fragment/app/Fragment.getArguments:()Landroid/os/Bundle;
        //    14: astore_2       
        //    15: aconst_null    
        //    16: astore_3       
        //    17: aload_2        
        //    18: ifnull          71
        //    21: aload_2        
        //    22: ldc             "OnLinkMicBuiltListener"
        //    24: invokestatic    com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog.LIZ:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;
        //    27: astore_2       
        //    28: aload_2        
        //    29: instanceof      Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog$Companion$OnFollowRequestListener;
        //    32: ifne            68
        //    35: aload_3        
        //    36: astore_2       
        //    37: aload_0        
        //    38: aload_2        
        //    39: checkcast       Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog$Companion$OnFollowRequestListener;
        //    42: putfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog.LIZIZ:Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog$Companion$OnFollowRequestListener;
        //    45: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //    48: ldc             LX/HQ5;.class
        //    50: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    53: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    56: astore          4
        //    58: aload           4
        //    60: ifnonnull       76
        //    63: aload_0        
        //    64: invokevirtual   androidx/fragment/app/DialogFragment.dismiss:()V
        //    67: return         
        //    68: goto            37
        //    71: aconst_null    
        //    72: astore_2       
        //    73: goto            28
        //    76: aload_1        
        //    77: ldc             2131367645
        //    79: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    82: astore_2       
        //    83: aload_2        
        //    84: ldc             ""
        //    86: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    89: aload_2        
        //    90: checkcast       Landroid/widget/TextView;
        //    93: astore          5
        //    95: aload           4
        //    97: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   100: ldc             "..."
        //   102: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;Ljava/lang/String;)Ljava/lang/String;
        //   105: astore          6
        //   107: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //   110: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //   113: astore_2       
        //   114: aload_2        
        //   115: ifnull          142
        //   118: aload_2        
        //   119: invokeinterface X/GIK.LIZIZ:()Lcom/bytedance/android/live/base/model/user/User;
        //   124: astore_2       
        //   125: aload_2        
        //   126: ifnull          142
        //   129: aload_2        
        //   130: ldc             "..."
        //   132: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;Ljava/lang/String;)Ljava/lang/String;
        //   135: astore_3       
        //   136: aload_3        
        //   137: astore_2       
        //   138: aload_3        
        //   139: ifnonnull       145
        //   142: ldc             ""
        //   144: astore_2       
        //   145: aload_0        
        //   146: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   149: invokestatic    X/0eu.LIZ:(Landroid/content/Context;)Z
        //   152: ifeq            397
        //   155: new             Ljava/lang/StringBuilder;
        //   158: dup            
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: astore_3       
        //   163: aload_3        
        //   164: aload           6
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: pop            
        //   170: aload_3        
        //   171: ldc             " & "
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: pop            
        //   177: aload_3        
        //   178: aload_2        
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: pop            
        //   183: aload_3        
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: astore_2       
        //   188: aload           5
        //   190: aload_2        
        //   191: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   194: aload_1        
        //   195: ldc             2131362292
        //   197: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   200: checkcast       Landroid/widget/ImageView;
        //   203: astore_2       
        //   204: aload           4
        //   206: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   209: astore_3       
        //   210: aload_3        
        //   211: ifnonnull       368
        //   214: aload_1        
        //   215: ldc             2131365860
        //   217: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   220: checkcast       Landroid/widget/ImageView;
        //   223: astore_2       
        //   224: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //   227: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //   230: astore_3       
        //   231: aload_3        
        //   232: ifnull          246
        //   235: aload_3        
        //   236: invokeinterface X/GIK.LIZ:()LX/0W5;
        //   241: astore_3       
        //   242: aload_3        
        //   243: ifnonnull       331
        //   246: aload_1        
        //   247: ldc             2131367643
        //   249: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   252: checkcast       LX/1so;
        //   255: astore_2       
        //   256: aload_2        
        //   257: ifnull          277
        //   260: aload_0        
        //   261: aload_2        
        //   262: putfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog.LIZ:LX/1so;
        //   265: aload_2        
        //   266: new             LX/0ry;
        //   269: dup            
        //   270: aload_0        
        //   271: invokespecial   X/0ry.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog;)V
        //   274: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   277: aload_1        
        //   278: new             LX/0rz;
        //   281: dup            
        //   282: aload_0        
        //   283: invokespecial   X/0rz.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog;)V
        //   286: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   289: aload_0        
        //   290: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   293: astore_1       
        //   294: aload_1        
        //   295: ifnull          330
        //   298: aload_1        
        //   299: aload_0        
        //   300: ldc             LX/2Fl;.class
        //   302: new             LX/21Y;
        //   305: dup            
        //   306: aload_0        
        //   307: invokespecial   X/21Y.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog;)V
        //   310: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   313: pop            
        //   314: aload_1        
        //   315: aload_0        
        //   316: ldc             LX/2DO;.class
        //   318: new             LX/21Z;
        //   321: dup            
        //   322: aload_0        
        //   323: invokespecial   X/21Z.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog;)V
        //   326: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   329: pop            
        //   330: return         
        //   331: aload_3        
        //   332: ldc             ""
        //   334: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   337: aload_3        
        //   338: invokeinterface X/0W5.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   343: astore_3       
        //   344: aload_2        
        //   345: ldc             ""
        //   347: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   350: aload_2        
        //   351: aload_3        
        //   352: aload_2        
        //   353: invokevirtual   android/widget/ImageView.getWidth:()I
        //   356: aload_2        
        //   357: invokevirtual   android/widget/ImageView.getHeight:()I
        //   360: ldc             2131234398
        //   362: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //   365: goto            246
        //   368: aload_3        
        //   369: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   372: astore_3       
        //   373: aload_2        
        //   374: ldc             ""
        //   376: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   379: aload_2        
        //   380: aload_3        
        //   381: aload_2        
        //   382: invokevirtual   android/widget/ImageView.getWidth:()I
        //   385: aload_2        
        //   386: invokevirtual   android/widget/ImageView.getHeight:()I
        //   389: ldc             2131234398
        //   391: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //   394: goto            214
        //   397: new             Ljava/lang/StringBuilder;
        //   400: dup            
        //   401: invokespecial   java/lang/StringBuilder.<init>:()V
        //   404: astore_3       
        //   405: aload_3        
        //   406: aload_2        
        //   407: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   410: pop            
        //   411: aload_3        
        //   412: ldc             " & "
        //   414: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   417: pop            
        //   418: aload_3        
        //   419: aload           6
        //   421: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   424: pop            
        //   425: aload_3        
        //   426: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   429: astore_2       
        //   430: goto            188
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
    
    public static final class Companion
    {
        static {
            Covode.recordClassIndex(8760);
        }
        
        public interface OnFollowRequestListener extends Parcelable
        {
            default static {
                Covode.recordClassIndex(8761);
            }
            
            void LIZ(final boolean p0);
        }
    }
}
