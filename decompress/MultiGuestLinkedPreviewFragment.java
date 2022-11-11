// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment.preview;

import androidx.fragment.app.DialogFragment;
import X.HPe;
import androidx.lifecycle.LiveData;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import X.2GA;
import X.0vm;
import X.1Uo;
import X.HPJ;
import X.0uW;
import X.2Fs;
import X.8si;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.2G9;
import X.SSb;
import kotlin.jvm.internal.n;
import X.2P9;
import X.SRS;
import X.F5g;
import X.0Bf;
import X.0Wg;
import X.1JQ;
import android.view.View$OnClickListener;
import X.GTi;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import X.HPI;
import X.0ba;
import X.GlD;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0Bp;
import X.CnW;
import X.0Bu;
import androidx.fragment.app.Fragment;
import X.0Bv;
import X.CTM;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1so;
import X.1Wk;

public final class MultiGuestLinkedPreviewFragment extends AbsMultiGuestNewPreviewFragment
{
    public 1Wk LJIILL;
    public 1so LJIILLIIL;
    public MultiGuestLinkedPreviewViewModel LJIIZILJ;
    public String LJIJ;
    public long LJIJI;
    public boolean LJIJJ;
    public HashMap LJJII;
    
    static {
        Covode.recordClassIndex(9751);
    }
    
    public MultiGuestLinkedPreviewFragment() {
        this.LJIJ = "outside";
        this.LJIJI = System.currentTimeMillis();
    }
    
    @Override
    public final View LIZ(final int n) {
        if (this.LJJII == null) {
            this.LJJII = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJJII.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJJII.put(n, viewById);
        }
        return viewById;
    }
    
    @Override
    public final void LIZ(final View view) {
        CTM.LIZ((Object)view);
        super.LIZ(view);
        this.LJIILLIIL = (1so)view.findViewById(2131370725);
    }
    
    @Override
    public final void LIZIZ() {
        final HashMap ljjii = this.LJJII;
        if (ljjii != null) {
            ljjii.clear();
        }
    }
    
    @Override
    public final boolean LJIIIZ() {
        return true;
    }
    
    @Override
    public final AbsMultiGuestNewPreviewViewModel LJIIJ() {
        return this.LJIIZILJ;
    }
    
    @Override
    public final void LJIIJJI() {
        final 0Bu liz = 0Bv.LIZ((Fragment)this, null);
        if (CnW.LIZ) {
            0Bp.LIZ(liz, (Fragment)this);
        }
        this.LJIIZILJ = liz.LIZ(MultiGuestLinkedPreviewViewModel.class);
        final DataChannel ljil = super.LJIL;
        if (ljil != null) {
            final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
            if (ljiizilj != null) {
                CTM.LIZ((Object)ljil);
                ljiizilj.LIZIZ = ljil;
            }
        }
    }
    
    @Override
    public final void LJIIL() {
        super.LJIIL();
        final 1so ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            GlD.LIZJ((View)ljiilliil);
        }
        final 1so ljiij = super.LJIIJ;
        if (ljiij != null) {
            GlD.LIZJ((View)ljiij);
        }
    }
    
    @Override
    public final void LJIILIIL() {
        super.LJIILIIL();
        final 1Wk ljiill = this.LJIILL;
        final boolean b = ljiill != null && ljiill.LJ;
        final int n = 2;
        if (b) {
            final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
            if (ljiizilj != null) {
                final HPI<Integer> liziz = ljiizilj.LIZIZ();
                if (liziz != null) {
                    ((LiveData<Integer>)liziz).setValue(Integer.valueOf(2));
                }
            }
        }
        else {
            final MultiGuestLinkedPreviewViewModel ljiizilj2 = this.LJIIZILJ;
            if (ljiizilj2 != null) {
                final HPI<Integer> liziz2 = ljiizilj2.LIZIZ();
                if (liziz2 != null) {
                    ((LiveData<Integer>)liziz2).setValue(Integer.valueOf(1));
                }
            }
        }
        final MultiGuestLinkedPreviewViewModel ljiizilj3 = this.LJIIZILJ;
        int intValue = n;
        if (ljiizilj3 != null) {
            final HPI<Integer> liziz3 = ljiizilj3.LIZIZ();
            intValue = n;
            if (liziz3 != null) {
                final Integer n2 = ((LiveData<Integer>)liziz3).getValue();
                intValue = n;
                if (n2 != null) {
                    intValue = n2;
                }
            }
        }
        super.LJIILJJIL = intValue;
        final StringBuilder sb = new StringBuilder("initPreviewModeAtFirst originPreviewMode=");
        sb.append(super.LJIILJJIL);
        sb.append(" openData=");
        sb.append(this.LJIILL);
        0ba.LIZ(3, "MultiGuestLinkedPreviewFragment", sb.toString());
    }
    
    @Override
    public final void LJIILJJIL() {
        final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            final 1Wk ljiill = this.LJIILL;
            boolean ljff = false;
            final boolean b = ljiill != null && ljiill.LJ;
            this.LJFF();
            final 1Wk ljiill2 = this.LJIILL;
            if (ljiill2 != null) {
                ljff = ljiill2.LJFF;
            }
            final 1Wk ljiill3 = this.LJIILL;
            int lji;
            if (ljiill3 != null) {
                lji = ljiill3.LJI;
            }
            else {
                lji = 2;
            }
            final 1Wk ljiill4 = this.LJIILL;
            LiveEffect ljii;
            if (ljiill4 != null) {
                ljii = ljiill4.LJII;
            }
            else {
                ljii = null;
            }
            ljiizilj.LIZ(b, ljff, lji, ljii);
        }
    }
    
    @Override
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        final 1so ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            GTi.LIZ((View)ljiilliil, (View$OnClickListener)this);
        }
        final 0Wg lj = this.LJ();
        final 1JQ 1jq = null;
        Object attachedComposerManager;
        if (lj != null) {
            attachedComposerManager = lj.getAttachedComposerManager();
        }
        else {
            attachedComposerManager = null;
        }
        if (!(attachedComposerManager instanceof 1JQ)) {
            attachedComposerManager = 1jq;
        }
        final 1JQ 1jq2 = (1JQ)attachedComposerManager;
        if (1jq2 != null) {
            1jq2.LIZ(false);
        }
    }
    
    @Override
    public final void LJIIZILJ() {
        public final class 26u extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ MultiGuestLinkedPreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9753);
            }
            
            public 26u(final MultiGuestLinkedPreviewFragment liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 26t extends F5g implements SRS<Boolean, 2P9>
        {
            public final /* synthetic */ MultiGuestLinkedPreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9752);
            }
            
            public 26t(final MultiGuestLinkedPreviewFragment liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1aG<T> implements 0Bf
        {
            public final /* synthetic */ MultiGuestLinkedPreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9754);
            }
            
            public 1aG(final MultiGuestLinkedPreviewFragment liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/AbsMultiGuestNewPreviewFragment.LJIIZILJ:()V
        //     4: aload_0        
        //     5: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ifnull          46
        //    13: aload_1        
        //    14: aload_0        
        //    15: ldc             LX/2G9;.class
        //    17: new             LX/26t;
        //    20: dup            
        //    21: aload_0        
        //    22: invokespecial   X/26t.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestLinkedPreviewFragment;)V
        //    25: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    28: pop            
        //    29: aload_1        
        //    30: aload_0        
        //    31: ldc_w           LX/2FN;.class
        //    34: new             LX/26u;
        //    37: dup            
        //    38: aload_0        
        //    39: invokespecial   X/26u.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestLinkedPreviewFragment;)V
        //    42: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    45: pop            
        //    46: aload_0        
        //    47: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestLinkedPreviewFragment.LJIIZILJ:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestLinkedPreviewViewModel;
        //    50: astore_1       
        //    51: aload_1        
        //    52: ifnull          77
        //    55: aload_1        
        //    56: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/AbsMultiGuestNewPreviewViewModel.LJFF:()LX/HP3;
        //    59: astore_1       
        //    60: aload_1        
        //    61: ifnull          77
        //    64: aload_1        
        //    65: aload_0        
        //    66: new             LX/1aG;
        //    69: dup            
        //    70: aload_0        
        //    71: invokespecial   X/1aG.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestLinkedPreviewFragment;)V
        //    74: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //    77: return         
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
    
    @Override
    public final void LJIJ() {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null && room.getOwner() != null) {
            final 8si 8si = new 8si((Object)"setting_panel", (Object)10002);
            final DataChannel ljil = super.LJIL;
            if (ljil != null) {
                ljil.LIZJ((Class)2Fs.class, (Object)8si);
            }
        }
    }
    
    @Override
    public final boolean LJIJJ() {
        final boolean ljijj = super.LJIJJ();
        final 0uW lizj = 0uW.LIZJ;
        final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
        while (true) {
            Label_0056: {
                if (ljiizilj == null) {
                    break Label_0056;
                }
                final HPJ<AbsMultiGuestNewPreviewViewModel.b> lizj2 = ljiizilj.LIZJ();
                if (lizj2 == null) {
                    break Label_0056;
                }
                final AbsMultiGuestNewPreviewViewModel.b b = (AbsMultiGuestNewPreviewViewModel.b)((HPe)lizj2).getValue();
                if (b == null) {
                    break Label_0056;
                }
                final boolean liz = b.LIZ;
                0uW.LIZ(lizj, liz, "link_management_panel");
                return ljijj;
            }
            final boolean liz = false;
            continue;
        }
    }
    
    @Override
    public final boolean LJIJJLI() {
        final boolean ljijjli = super.LJIJJLI();
        if (ljijjli) {
            final DataChannel ljil = super.LJIL;
            if (ljil != null) {
                final 1Uo ljff = this.LJFF();
                ljil.LIZJ((Class)2G9.class, (Object)(ljff == null || ljff.LIZ));
            }
            final 1Uo ljff2 = this.LJFF();
            if (ljff2 != null) {
                0uW.LIZJ.LIZ(ljff2.LJJIIZI, ljff2.LJIJI, ljff2.LIZ ^ true, "guest_connection_panel");
            }
        }
        return ljijjli;
    }
    
    public final void LJIL() {
        final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            final HPJ<AbsMultiGuestNewPreviewViewModel.b> lizj = ljiizilj.LIZJ();
            if (lizj != null) {
                final AbsMultiGuestNewPreviewViewModel.b b = (AbsMultiGuestNewPreviewViewModel.b)((HPe)lizj).getValue();
                if (b != null) {
                    final 0uW lizj2 = 0uW.LIZJ;
                    final 1Wk ljiill = this.LJIILL;
                    final String s = "";
                    String ljiiiz;
                    if (ljiill == null || (ljiiiz = ljiill.LJIIIZ) == null) {
                        ljiiiz = "";
                    }
                    final 1Wk ljiill2 = this.LJIILL;
                    String ljiiiizz = s;
                    if (ljiill2 != null) {
                        ljiiiizz = ljiill2.LJIIIIZZ;
                        if (ljiiiizz == null) {
                            ljiiiizz = s;
                        }
                    }
                    final String lji = this.LJI();
                    final LiveEffect lizlll = b.LIZLLL;
                    final long n = b.LIZJ;
                    final 1Uo ljff = this.LJFF();
                    lizj2.LIZ(ljiiiz, ljiiiizz, lji, lizlll, n, (ljff != null && ljff.LIZ) ^ true, b.LIZ ^ true, b.LIZIZ ^ true);
                }
            }
        }
    }
    
    public final void dismiss() {
        Label_0126: {
            if (this.LJIJJ) {
                final 1Wk ljiill = this.LJIILL;
                final boolean b = false;
                final boolean b2 = ljiill != null && ljiill.LIZ;
                final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
                while (true) {
                    Label_0137: {
                        if (ljiizilj == null) {
                            break Label_0137;
                        }
                        final HPJ<AbsMultiGuestNewPreviewViewModel.b> lizj = ljiizilj.LIZJ();
                        if (lizj == null) {
                            break Label_0137;
                        }
                        final AbsMultiGuestNewPreviewViewModel.b b3 = (AbsMultiGuestNewPreviewViewModel.b)((HPe)lizj).getValue();
                        if (b3 == null) {
                            break Label_0137;
                        }
                        final boolean liz = b3.LIZ;
                        final boolean b4 = GTi.LIZIZ(Boolean.valueOf(b2)) && GTi.LIZ(Boolean.valueOf(liz));
                        boolean b5 = b;
                        if (GTi.LIZ(Boolean.valueOf(b2))) {
                            b5 = b;
                            if (GTi.LIZIZ(Boolean.valueOf(liz))) {
                                b5 = true;
                            }
                        }
                        0vm.LIZ(super.LJIL, b4, b5, liz);
                        break Label_0126;
                    }
                    final boolean liz = false;
                    continue;
                }
            }
        }
        super.dismiss();
    }
    
    @Override
    public final void onClick(final View view) {
        super.onClick(view);
        final 1JQ 1jq = null;
        if (view != null) {
            final Integer value = view.getId();
            if (value != null) {
                if (value == 2131370725) {
                    final 0Wg lj = this.LJ();
                    Object attachedComposerManager;
                    if (lj != null) {
                        attachedComposerManager = lj.getAttachedComposerManager();
                    }
                    else {
                        attachedComposerManager = null;
                    }
                    if (!(attachedComposerManager instanceof 1JQ)) {
                        attachedComposerManager = 1jq;
                    }
                    final 1JQ 1jq2 = (1JQ)attachedComposerManager;
                    if (1jq2 != null) {
                        1jq2.LIZ(true);
                    }
                    final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
                    if (ljiizilj != null) {
                        ljiizilj.LJI();
                    }
                    this.LJIJ = "confirm_icon";
                    this.LJIJJ = true;
                    final MultiGuestLinkedPreviewViewModel ljiizilj2 = this.LJIIZILJ;
                    if (ljiizilj2 != null) {
                        ljiizilj2.LJII();
                    }
                    ((DialogFragment)this).dismiss();
                }
            }
        }
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null && !ljiizilj.LJ) {
            final 1Wk ljiill = this.LJIILL;
            if (ljiill != null && ljiill.LIZ) {
                final 1Uo ljff = this.LJFF();
                if (ljff != null) {
                    ljff.LIZIZ = true;
                }
                final DataChannel ljil = super.LJIL;
                if (ljil != null) {
                    ljil.LIZJ((Class)2GA.class, (Object)true);
                }
            }
        }
        final MultiGuestLinkedPreviewViewModel ljiizilj2 = this.LJIIZILJ;
        if (ljiizilj2 != null) {
            final HPJ<AbsMultiGuestNewPreviewViewModel.b> lizj = ljiizilj2.LIZJ();
            if (lizj != null) {
                final AbsMultiGuestNewPreviewViewModel.b b = (AbsMultiGuestNewPreviewViewModel.b)((HPe)lizj).getValue();
                if (b != null) {
                    final 0uW lizj2 = 0uW.LIZJ;
                    final LiveEffect lizlll = b.LIZLLL;
                    final long n = b.LIZJ;
                    final 1Uo ljff2 = this.LJFF();
                    lizj2.LIZ(lizlll, n, (ljff2 != null && ljff2.LIZ) ^ true, b.LIZ ^ true, b.LIZIZ ^ true, this.LJIJ, System.currentTimeMillis() - this.LJIJI);
                }
            }
        }
    }
    
    @Override
    public final void onPause() {
        super.onPause();
        final MultiGuestLinkedPreviewViewModel ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            final HPI<Integer> liziz = ljiizilj.LIZIZ();
            if (liziz != null) {
                final Integer n = ((LiveData<Integer>)liziz).getValue();
                if (n != null) {
                    if (n == 2) {
                        this.LIZ(false, (Cert)TokenCert.Companion.with("bpea-multiguest_new_link_preview_pause_camera"));
                    }
                }
            }
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.LJIJI = System.currentTimeMillis();
        this.LJIL();
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        final 1Wk ljiill = this.LJIILL;
        if (ljiill != null && ljiill.LIZ) {
            final 1Uo ljff = this.LJFF();
            if (ljff != null) {
                ljff.LIZIZ = false;
            }
            final DataChannel ljil = super.LJIL;
            if (ljil != null) {
                ljil.LIZJ((Class)2GA.class, (Object)false);
            }
        }
    }
}
