// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.beauty;

import X.44T;
import X.0cB;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import androidx.fragment.app.Fragment;
import com.bytedance.android.widget.WidgetManager;
import X.1NI;
import X.0II;
import X.CTM;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import X.44V;
import X.GGc;
import X.1it;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.GST;
import X.0WY;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.5DO;
import X.1Kk;
import X.0gA;
import com.bytedance.android.live.effect.widget.BeautyIconWidget;
import X.SRo;
import X.SRp;
import com.bytedance.android.livesdk.ui.BaseFragment;

public final class LiveBeautyFragment extends BaseFragment implements SRp
{
    public SRo LIZ;
    public BeautyIconWidget LIZIZ;
    public 0gA LIZJ;
    public 1Kk LIZLLL;
    public final 5DO LJ;
    public final 5DO LJFF;
    public final 5DO LJI;
    public HashMap LJII;
    
    static {
        Covode.recordClassIndex(6254);
    }
    
    public LiveBeautyFragment() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/livesdk/ui/BaseFragment.<init>:()V
        //     4: aload_0        
        //     5: new             LX/1su;
        //     8: dup            
        //     9: aload_0        
        //    10: invokespecial   X/1su.<init>:(Lcom/bytedance/android/live/effect/beauty/LiveBeautyFragment;)V
        //    13: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    16: putfield        com/bytedance/android/live/effect/beauty/LiveBeautyFragment.LJ:LX/5DO;
        //    19: aload_0        
        //    20: new             LX/1ss;
        //    23: dup            
        //    24: aload_0        
        //    25: invokespecial   X/1ss.<init>:(Lcom/bytedance/android/live/effect/beauty/LiveBeautyFragment;)V
        //    28: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    31: putfield        com/bytedance/android/live/effect/beauty/LiveBeautyFragment.LJFF:LX/5DO;
        //    34: aload_0        
        //    35: new             LX/1st;
        //    38: dup            
        //    39: aload_0        
        //    40: invokespecial   X/1st.<init>:(Lcom/bytedance/android/live/effect/beauty/LiveBeautyFragment;)V
        //    43: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    46: putfield        com/bytedance/android/live/effect/beauty/LiveBeautyFragment.LJI:LX/5DO;
        //    49: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final BeautyIconWidget LIZ() {
        return (BeautyIconWidget)this.LJ.getValue();
    }
    
    public final void LIZ(final int n) {
        final BeautyIconWidget liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        if (n.LIZ((Object)liziz, (Object)this.LIZ())) {
            final 0gA lizj = this.LIZJ;
            if (lizj != null) {
                lizj.LIZ(n / 100.0f);
            }
            return;
        }
        if (n.LIZ((Object)liziz, (Object)this.LIZIZ())) {
            final 0gA lizj2 = this.LIZJ;
            if (lizj2 != null) {
                lizj2.LIZIZ(n / 100.0f);
            }
            return;
        }
        if (n.LIZ((Object)liziz, (Object)this.LIZJ())) {
            final 0gA lizj3 = this.LIZJ;
            if (lizj3 != null) {
                lizj3.LIZJ(n / 100.0f);
            }
        }
    }
    
    public final BeautyIconWidget LIZIZ() {
        return (BeautyIconWidget)this.LJFF.getValue();
    }
    
    public final void LIZIZ(final int n) {
        final 1Kk lizlll = this.LIZLLL;
        String lizj;
        if (lizlll != null) {
            lizj = lizlll.LIZJ;
        }
        else {
            lizj = null;
        }
        String s;
        if (n.LIZ((Object)lizj, (Object)"live_take_detail")) {
            s = "broadcast";
        }
        else {
            s = "preview";
        }
        final GGc liz = 0WY.LIZ.LIZ("ttlive_change_beauty");
        liz.LIZIZ(s);
        final BeautyIconWidget liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        if (n.LIZ((Object)liziz, (Object)this.LIZ())) {
            final 44V ljil = GST.LJIL;
            n.LIZIZ((Object)ljil, "");
            ((44T)ljil).LIZ((Object)(n / 100.0f));
            final 44V ljil2 = GST.LJIL;
            n.LIZIZ((Object)ljil2, "");
            liz.LIZ("beauty_skin", (Float)((44T)ljil2).LIZ());
        }
        else if (n.LIZ((Object)liziz, (Object)this.LIZIZ())) {
            final 44V ljj = GST.LJJ;
            n.LIZIZ((Object)ljj, "");
            ((44T)ljj).LIZ((Object)(n / 100.0f));
            final 44V ljj2 = GST.LJJ;
            n.LIZIZ((Object)ljj2, "");
            liz.LIZ("big_eyes", (Float)((44T)ljj2).LIZ());
        }
        else if (n.LIZ((Object)liziz, (Object)this.LIZJ())) {
            final 44V ljji = GST.LJJI;
            n.LIZIZ((Object)ljji, "");
            ((44T)ljji).LIZ((Object)(n / 100.0f));
            final 44V ljji2 = GST.LJJI;
            n.LIZIZ((Object)ljji2, "");
            liz.LIZ("face_lift", (Float)((44T)ljji2).LIZ());
        }
        liz.LIZ();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            1it.a.LIZ.LIZ(room.getId());
        }
    }
    
    public final BeautyIconWidget LIZJ() {
        return (BeautyIconWidget)this.LJI.getValue();
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131561995, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        final WidgetManager of = WidgetManager.of((Fragment)this, view, (FluencyOpt)1NI.LIZ);
        of.load(2131371463, (Widget)this.LIZ());
        of.load(2131365020, (Widget)this.LIZIZ());
        of.load(2131370413, (Widget)this.LIZJ());
        this.LIZIZ = this.LIZ();
        this.LIZ().LIZ(2131234372, 2131836026, true);
        this.LIZIZ().LIZ(2131234368, 2131830648, false);
        this.LIZJ().LIZ(2131234371, 2131835753, false);
        final SRo liz = this.LIZ;
        if (liz != null) {
            liz.setOnLevelChangeListener((SRp)this);
        }
        final SRo liz2 = this.LIZ;
        if (liz2 != null) {
            liz2.LIZ(0cB.LIZIZ(2131100567), 0cB.LIZIZ(2131100565), 0cB.LIZIZ(2131100566));
        }
        final SRo liz3 = this.LIZ;
        if (liz3 != null) {
            liz3.LIZ(100, 0, 0, true);
        }
        final SRo liz4 = this.LIZ;
        if (liz4 != null) {
            final 44V ljil = GST.LJIL;
            n.LIZIZ((Object)ljil, "");
            liz4.setPercent((int)(((Number)((44T)ljil).LIZ()).floatValue() * 100.0f));
        }
    }
}
