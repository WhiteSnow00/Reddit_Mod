// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.dialog;

import X.0bf;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import X.2Fl;
import X.21f;
import android.view.View$OnClickListener;
import X.0s3;
import X.GlD;
import X.21e;
import X.21b;
import X.Fk2;
import X.HFv;
import android.widget.ImageView;
import X.1ib;
import X.0W3;
import X.CTM;
import X.0xj;
import X.2E2;
import X.1Xy;
import X.2Ea;
import X.0rb;
import X.Fgf;
import X.0sK;
import X.0uW;
import X.0xy;
import X.1NN;
import X.H8A;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import X.Gqy;
import kotlin.jvm.internal.n;
import X.1Xf;
import X.QgG;
import X.21g;
import X.0t4;
import X.Hf4;
import X.0cB;
import X.0sD;
import X.GCe;
import X.2P9;
import X.SRS;
import X.F5g;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0tO;
import X.G69;
import X.Fjw;
import X.FlV;
import X.0ba;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.view.View;
import X.FpL;
import android.os.Bundle;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import X.1jw;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1J6;
import X.0kW;
import X.1Uo;
import X.1Xb;
import X.0rg;
import X.1so;
import X.0rf;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class MultiGuestV3GuestBeInvitedDialog extends LiveDialogFragment implements 0rf
{
    public static final Companion LJII;
    public 1so LIZ;
    public 0rg<MultiGuestV3GuestBeInvitedDialog> LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public 1Xb LJFF;
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LJI;
    public 1J6 LJIIIIZZ;
    public HashMap LJIIIZ;
    
    static {
        Covode.recordClassIndex(8770);
        LJII = new Companion((byte)0);
    }
    
    public MultiGuestV3GuestBeInvitedDialog() {
        this.LIZLLL = "";
        this.LJ = "";
        1jw.LIZ.LIZ(this);
    }
    
    private final Activity LIZ(final Context context) {
        while (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                continue;
            }
            return null;
        }
        return (Activity)context;
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
        return true;
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561833);
        fpL.LIZIZ = 2131887299;
        fpL.LJIIIIZZ = -1;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJIIIZ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJIIIZ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZ(final String s) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final 0rg<MultiGuestV3GuestBeInvitedDialog> liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.LIZ(room.getOwnerUserId(), s, 10012);
            }
            final StringBuilder sb = new StringBuilder("onLeave: ");
            sb.append(room.getOwnerUserId());
            sb.append(", ");
            sb.append(s);
            0ba.LIZIZ(sb.toString());
        }
    }
    
    public final void LIZ(final Throwable t) {
        FlV.LIZ(((Fragment)this).getContext(), t, 2131835895);
        ((DialogFragment)this).dismiss();
        this.LIZJ = false;
        final Fjw liziz = Fjw.LIZIZ();
        final StringBuilder sb = new StringBuilder("doRequestReplyAnchor:");
        String message;
        if (t != null) {
            message = t.getMessage();
        }
        else {
            message = null;
        }
        sb.append(message);
        ((0bf)liziz).LIZIZ("invite_issue_check", sb.toString());
    }
    
    public final void LIZ(final boolean b) {
        ((DialogFragment)this).dismiss();
        this.LIZJ = false;
        if (b) {
            final DataChannel ljil = super.LJIL;
            if (ljil != null) {
                final DataChannel ljil2 = super.LJIL;
                Room room;
                if (ljil2 != null) {
                    room = (Room)ljil2.LIZIZ((Class)G69.class);
                }
                else {
                    room = null;
                }
                0tO.LIZ(room, ljil, false);
            }
        }
    }
    
    public final void LIZIZ() {
        final HashMap ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            ljiiiz.clear();
        }
    }
    
    public final void LIZIZ(final int n) {
        public final class 21a extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ MultiGuestV3GuestBeInvitedDialog LIZ;
            
            static {
                Covode.recordClassIndex(8773);
            }
            
            public 21a(final MultiGuestV3GuestBeInvitedDialog liz, final int n) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          248
        //     9: aload_0        
        //    10: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //    13: astore_2       
        //    14: aload_2        
        //    15: ifnonnull       21
        //    18: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //    21: aload_2        
        //    22: ldc             ""
        //    24: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    27: aload_0        
        //    28: aload_2        
        //    29: invokespecial   com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LIZ:(Landroid/content/Context;)Landroid/app/Activity;
        //    32: astore_3       
        //    33: aload_3        
        //    34: ifnull          232
        //    37: getstatic       X/Gqy.LINK_MIC:LX/Gqy;
        //    40: invokestatic    com/bytedance/android/livesdk/utils/LiveAppBundleUtils.isPluginAvailable:(LX/Gqy;)Z
        //    43: ifne            73
        //    46: getstatic       X/Gqy.LINK_MIC:LX/Gqy;
        //    49: aconst_null    
        //    50: iconst_0       
        //    51: bipush          6
        //    53: aconst_null    
        //    54: invokestatic    com/bytedance/android/livesdk/utils/LiveAppBundleUtils.ensurePluginAvailable$default:(LX/Gqy;LX/H8A;ZILjava/lang/Object;)V
        //    57: new             Ljava/lang/IllegalStateException;
        //    60: astore_2       
        //    61: aload_2        
        //    62: ldc_w           "Check failed."
        //    65: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    68: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    71: aload_2        
        //    72: athrow         
        //    73: getstatic       X/1NN.LLFF:LX/0k5;
        //    76: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    79: invokevirtual   X/1NN.LIZ:()I
        //    82: iconst_2       
        //    83: if_icmpeq       100
        //    86: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //    89: ldc_w           2131830549
        //    92: invokestatic    X/Hf4.LIZ:(Landroid/content/Context;I)V
        //    95: aload_0        
        //    96: invokevirtual   androidx/fragment/app/DialogFragment.dismiss:()V
        //    99: return         
        //   100: invokestatic    X/GCe.LIZ:()LX/GCe;
        //   103: getfield        X/GCe.LJJI:I
        //   106: getstatic       X/0sD.LIZJ:LX/0sC;
        //   109: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   112: invokevirtual   X/0sD.LJIIIZ:()I
        //   115: if_icmplt       151
        //   118: getstatic       X/0sD.LIZJ:LX/0sC;
        //   121: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   124: invokevirtual   X/0sD.LJIIIZ:()I
        //   127: ifeq            151
        //   130: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //   133: ldc_w           2131830587
        //   136: invokestatic    X/Hf4.LIZ:(Landroid/content/Context;I)V
        //   139: aload_0        
        //   140: ldc_w           "leave_source_reply_pos_limit"
        //   143: invokevirtual   com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LIZ:(Ljava/lang/String;)V
        //   146: aload_0        
        //   147: invokevirtual   androidx/fragment/app/DialogFragment.dismiss:()V
        //   150: return         
        //   151: ldc_w           "anchor_invite_guest"
        //   154: putstatic       X/0xy.LIZIZ:Ljava/lang/String;
        //   157: getstatic       X/0uW.LIZJ:LX/0uW;
        //   160: ldc_w           "anchor_invite_guest"
        //   163: invokevirtual   X/0uW.LIZ:(Ljava/lang/String;)V
        //   166: getstatic       X/0sK.LJ:LX/0sK;
        //   169: astore_2       
        //   170: aload_0        
        //   171: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   174: astore          4
        //   176: aload_0        
        //   177: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LJI:LX/1Uo;
        //   180: astore          5
        //   182: aload           5
        //   184: ifnonnull       192
        //   187: ldc             ""
        //   189: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   192: aload_2        
        //   193: aload           4
        //   195: iconst_1       
        //   196: aload_3        
        //   197: aload           5
        //   199: getfield        X/1Uo.LJJIFFI:I
        //   202: i2l            
        //   203: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   206: new             LX/21a;
        //   209: dup            
        //   210: aload_0        
        //   211: iload_1        
        //   212: invokespecial   X/21a.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog;I)V
        //   215: aconst_null    
        //   216: invokevirtual   X/0sK.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;ILandroid/app/Activity;Ljava/lang/Long;LX/SRS;LX/QgG;)V
        //   219: getstatic       X/0uW.LIZJ:LX/0uW;
        //   222: ldc_w           "anchor_invite_guest"
        //   225: ldc_w           "0"
        //   228: invokevirtual   X/0uW.LIZ:(Ljava/lang/String;Ljava/lang/String;)V
        //   231: return         
        //   232: new             Ljava/lang/IllegalStateException;
        //   235: astore_2       
        //   236: aload_2        
        //   237: ldc_w           "Required value was null."
        //   240: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   243: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   246: aload_2        
        //   247: athrow         
        //   248: new             Ljava/lang/IllegalStateException;
        //   251: astore_2       
        //   252: aload_2        
        //   253: ldc_w           "Required value was null."
        //   256: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   259: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   262: aload_2        
        //   263: athrow         
        //   264: astore_2       
        //   265: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   268: ldc             LX/HQ5;.class
        //   270: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   273: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   276: astore_2       
        //   277: aload_2        
        //   278: ifnull          317
        //   281: aload_0        
        //   282: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LIZIZ:LX/0rg;
        //   285: astore          4
        //   287: aload           4
        //   289: ifnull          307
        //   292: aload           4
        //   294: aload_2        
        //   295: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   298: aload_2        
        //   299: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   302: invokeinterface X/0rg.LIZIZ:(JJ)V
        //   307: iconst_4       
        //   308: ldc_w           "MultiGuestV3GuestBeInvitedDialog"
        //   311: ldc_w           "refuse onPluginNotAvailable"
        //   314: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   317: aload_0        
        //   318: invokevirtual   androidx/fragment/app/DialogFragment.dismiss:()V
        //   321: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      264    322    Ljava/lang/IllegalStateException;
        //  9      14     264    322    Ljava/lang/IllegalStateException;
        //  18     21     264    322    Ljava/lang/IllegalStateException;
        //  21     33     264    322    Ljava/lang/IllegalStateException;
        //  37     73     264    322    Ljava/lang/IllegalStateException;
        //  232    248    264    322    Ljava/lang/IllegalStateException;
        //  248    264    264    322    Ljava/lang/IllegalStateException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
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
    
    public final void LIZJ() {
        0tO.LIZ((Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class), super.LJIL, true);
        final 1Uo lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.LJFF("reply");
        final DataChannel ljil = super.LJIL;
        if (ljil != null) {
            final Fgf fgf = new Fgf(1);
            fgf.LIZIZ = 0rb.a.GO_LIVE;
            ljil.LIZJ((Class)2Ea.class, (Object)fgf);
        }
        ((DialogFragment)this).dismiss();
        this.LIZJ = false;
    }
    
    public final void LIZLLL() {
        this.LIZJ = false;
    }
    
    public final boolean LJ() {
        return this.LJJI();
    }
    
    public final boolean LJFF() {
        final 1J6 ljiiiizz = this.LJIIIIZZ;
        return ljiiiizz != null && ljiiiizz.isChecked();
    }
    
    public final void dismiss() {
        super.dismiss();
        final 1J6 ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz == null || !ljiiiizz.isChecked()) {
            return;
        }
        try {
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room != null) {
                final long id = room.getId();
                if (id != 0L) {
                    final 0rg<MultiGuestV3GuestBeInvitedDialog> liziz = this.LIZIZ;
                    if (liziz != null) {
                        liziz.LIZ(id);
                    }
                    return;
                }
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        catch (final Exception ex) {}
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final DataChannel ljil = super.LJIL;
        1Xy liziz;
        if (ljil != null) {
            liziz = new 1Xy(this, ljil);
        }
        else {
            liziz = null;
        }
        this.LIZIZ = liziz;
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final DataChannel ljil = super.LJIL;
        if (ljil != null) {
            ljil.LIZIZ((Class)2E2.class, (Object)false);
        }
        final 0rg<MultiGuestV3GuestBeInvitedDialog> liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ();
        }
    }
    
    public final void onStart() {
        super.onStart();
        0xj.LIZIZ("show", "0");
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 21h extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiGuestV3GuestBeInvitedDialog LIZ;
            
            static {
                Covode.recordClassIndex(8782);
            }
            
            public 21h(final MultiGuestV3GuestBeInvitedDialog liz) {
                this.LIZ = liz;
                super(1);
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
        //    15: aload_2        
        //    16: ifnull          27
        //    19: aload_2        
        //    20: ldc_w           "OnLinkMicBuiltListener"
        //    23: invokestatic    com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LIZ:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;
        //    26: pop            
        //    27: aload_0        
        //    28: invokevirtual   androidx/fragment/app/Fragment.getArguments:()Landroid/os/Bundle;
        //    31: astore_2       
        //    32: aload_2        
        //    33: ifnull          45
        //    36: aload_2        
        //    37: ldc_w           "isJoinDirectInvitedDialog"
        //    40: iconst_0       
        //    41: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //    44: pop            
        //    45: aload_0        
        //    46: invokevirtual   androidx/fragment/app/Fragment.getArguments:()Landroid/os/Bundle;
        //    49: astore_2       
        //    50: aload_2        
        //    51: ifnull          70
        //    54: aload_2        
        //    55: ldc_w           "beInvitedSharePlatform"
        //    58: ldc             ""
        //    60: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    63: astore_3       
        //    64: aload_3        
        //    65: astore_2       
        //    66: aload_3        
        //    67: ifnonnull       73
        //    70: ldc             ""
        //    72: astore_2       
        //    73: aload_0        
        //    74: aload_2        
        //    75: putfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LIZLLL:Ljava/lang/String;
        //    78: aload_0        
        //    79: invokevirtual   androidx/fragment/app/Fragment.getArguments:()Landroid/os/Bundle;
        //    82: astore_2       
        //    83: aload_2        
        //    84: ifnull          103
        //    87: aload_2        
        //    88: ldc_w           "anchorInvitationPosition"
        //    91: ldc             ""
        //    93: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    96: astore_3       
        //    97: aload_3        
        //    98: astore_2       
        //    99: aload_3        
        //   100: ifnonnull       106
        //   103: ldc             ""
        //   105: astore_2       
        //   106: aload_0        
        //   107: aload_2        
        //   108: putfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LJ:Ljava/lang/String;
        //   111: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   114: ldc             LX/HQ5;.class
        //   116: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   119: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   122: astore_2       
        //   123: aload_2        
        //   124: ifnonnull       132
        //   127: aload_0        
        //   128: invokevirtual   androidx/fragment/app/DialogFragment.dismiss:()V
        //   131: return         
        //   132: aload_2        
        //   133: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   136: lstore          4
        //   138: aload_2        
        //   139: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   142: lstore          6
        //   144: aload_2        
        //   145: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   148: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;)Ljava/lang/String;
        //   151: astore_3       
        //   152: aload_0        
        //   153: aload_1        
        //   154: ldc_w           2131363341
        //   157: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   160: checkcast       LX/1J6;
        //   163: putfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LJIIIIZZ:LX/1J6;
        //   166: aload_1        
        //   167: ldc_w           2131366612
        //   170: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   173: astore_2       
        //   174: aload_2        
        //   175: ldc             ""
        //   177: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   180: aload_2        
        //   181: checkcast       LX/1ib;
        //   184: ldc_w           2131830558
        //   187: iconst_1       
        //   188: anewarray       Ljava/lang/Object;
        //   191: dup            
        //   192: iconst_0       
        //   193: aload_3        
        //   194: aastore        
        //   195: invokestatic    X/0cB.LIZ:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   198: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   201: aload_1        
        //   202: ldc_w           2131362292
        //   205: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   208: checkcast       Landroid/widget/ImageView;
        //   211: astore_2       
        //   212: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   215: ldc             LX/HQ5;.class
        //   217: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   220: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   223: astore_3       
        //   224: aload_3        
        //   225: ifnull          237
        //   228: aload_3        
        //   229: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   232: astore_3       
        //   233: aload_3        
        //   234: ifnonnull       457
        //   237: aload_1        
        //   238: ldc_w           2131365860
        //   241: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   244: checkcast       Landroid/widget/ImageView;
        //   247: astore_2       
        //   248: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //   251: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //   254: astore_3       
        //   255: aload_3        
        //   256: ifnull          270
        //   259: aload_3        
        //   260: invokeinterface X/GIK.LIZ:()LX/0W5;
        //   265: astore_3       
        //   266: aload_3        
        //   267: ifnonnull       419
        //   270: new             LX/21b;
        //   273: dup            
        //   274: aload_0        
        //   275: lload           4
        //   277: lload           6
        //   279: invokespecial   X/21b.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog;JJ)V
        //   282: astore          8
        //   284: new             LX/21e;
        //   287: dup            
        //   288: aload_0        
        //   289: invokespecial   X/21e.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog;)V
        //   292: astore_2       
        //   293: aload_1        
        //   294: ldc_w           2131373462
        //   297: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   300: checkcast       LX/1so;
        //   303: astore_3       
        //   304: aload_3        
        //   305: ldc             ""
        //   307: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   310: aload_3        
        //   311: invokestatic    X/GlD.LIZJ:(Landroid/view/View;)V
        //   314: aload_3        
        //   315: new             LX/0s3;
        //   318: dup            
        //   319: aload           8
        //   321: invokespecial   X/0s3.<init>:(LX/21b;)V
        //   324: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   327: aload_1        
        //   328: ldc_w           2131372944
        //   331: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   334: checkcast       LX/1so;
        //   337: astore_1       
        //   338: aload_1        
        //   339: ldc             ""
        //   341: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   344: aload_1        
        //   345: invokestatic    X/GlD.LIZJ:(Landroid/view/View;)V
        //   348: aload_2        
        //   349: iconst_0       
        //   350: aload_1        
        //   351: getstatic       X/21f.LIZ:LX/21f;
        //   354: invokevirtual   X/21e.LIZ:(ILandroid/view/View;LX/QgG;)V
        //   357: aload_0        
        //   358: aload_1        
        //   359: putfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog.LIZ:LX/1so;
        //   362: aload_1        
        //   363: ifnull          371
        //   366: aload_1        
        //   367: iconst_0       
        //   368: invokevirtual   X/1so.setEnabled:(Z)V
        //   371: aload_0        
        //   372: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   375: astore_1       
        //   376: aload_1        
        //   377: ifnull          397
        //   380: aload_1        
        //   381: aload_0        
        //   382: ldc_w           LX/2Fl;.class
        //   385: new             LX/21h;
        //   388: dup            
        //   389: aload_0        
        //   390: invokespecial   X/21h.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog;)V
        //   393: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   396: pop            
        //   397: aload_0        
        //   398: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   401: astore_1       
        //   402: aload_1        
        //   403: ifnull          418
        //   406: aload_1        
        //   407: ldc_w           LX/2E2;.class
        //   410: iconst_1       
        //   411: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   414: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   417: pop            
        //   418: return         
        //   419: aload_3        
        //   420: ldc             ""
        //   422: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   425: aload_3        
        //   426: invokeinterface X/0W5.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   431: astore_3       
        //   432: aload_2        
        //   433: ldc             ""
        //   435: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   438: aload_2        
        //   439: aload_3        
        //   440: aload_2        
        //   441: invokevirtual   android/widget/ImageView.getWidth:()I
        //   444: aload_2        
        //   445: invokevirtual   android/widget/ImageView.getHeight:()I
        //   448: ldc_w           2131234398
        //   451: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //   454: goto            270
        //   457: aload_3        
        //   458: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   461: astore_3       
        //   462: aload_2        
        //   463: ldc             ""
        //   465: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   468: aload_2        
        //   469: aload_3        
        //   470: aload_2        
        //   471: invokevirtual   android/widget/ImageView.getWidth:()I
        //   474: aload_2        
        //   475: invokevirtual   android/widget/ImageView.getHeight:()I
        //   478: ldc_w           2131234398
        //   481: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //   484: goto            237
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
            Covode.recordClassIndex(8771);
        }
        
        public final MultiGuestV3GuestBeInvitedDialog LIZ(final OnInviteResultListener onInviteResultListener, final boolean b, final String s, final String s2, final 1Xb ljff) {
            CTM.LIZ((Object)onInviteResultListener, (Object)s, (Object)s2);
            final MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = new MultiGuestV3GuestBeInvitedDialog((byte)0);
            final Bundle arguments = new Bundle();
            arguments.putParcelable("OnLinkMicBuiltListener", (Parcelable)onInviteResultListener);
            arguments.putBoolean("isJoinDirectInvitedDialog", b);
            arguments.putString("beInvitedSharePlatform", s);
            arguments.putString("anchorInvitationPosition", s2);
            ((Fragment)multiGuestV3GuestBeInvitedDialog).setArguments(arguments);
            multiGuestV3GuestBeInvitedDialog.LJFF = ljff;
            return multiGuestV3GuestBeInvitedDialog;
        }
        
        public interface OnInviteResultListener extends Parcelable
        {
            default static {
                Covode.recordClassIndex(8772);
            }
        }
    }
}
