// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment.effect;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import X.1JQ;
import X.1JR;
import X.0AB;
import X.T0r;
import java.util.Iterator;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0CH;
import X.0g8;
import java.util.Map;
import X.FJ3;
import X.0uY;
import X.0jR;
import com.bytedance.android.live.effect.api.IEffectService;
import X.GTi;
import X.0up;
import java.util.Collection;
import X.1mX;
import androidx.viewpager.widget.PagerAdapter;
import X.1mY;
import X.T0s;
import X.Stv;
import X.26k;
import X.Ey9;
import X.SRr;
import X.1Zf;
import X.GlD;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautySetting;
import X.Ghp;
import X.0cB;
import X.3dF;
import X.0Bu;
import X.0Bv;
import X.1Zg;
import androidx.fragment.app.Fragment;
import X.HAM;
import kotlin.jvm.internal.n;
import X.0II;
import X.CTM;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import X.1ZU;
import java.util.List;
import X.B2G;
import X.SRF;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.5DO;
import X.0Gh;
import X.T0p;
import X.BHo;
import X.0Wg;
import android.widget.ImageView;
import X.1ib;
import X.SRo;
import X.SRC;
import com.bytedance.android.livesdk.ui.BaseFragment;

public final class MultiGuestEffectSwitchFragment extends BaseFragment
{
    public static final /* synthetic */ SRC[] LIZ;
    public static final MultiGuestEffectSwitchFragment.a LJIIIZ;
    public SRo LIZIZ;
    public 1ib LIZJ;
    public ImageView LIZLLL;
    public MultiGuestEffectViewModel LJ;
    public c LJFF;
    public b LJI;
    public int LJII;
    public 0Wg LJIIIIZZ;
    public final BHo LJIIJ;
    public T0p LJIIJJI;
    public 0Gh LJIIL;
    public final 5DO LJIILIIL;
    public HashMap LJIILJJIL;
    
    static {
        Covode.recordClassIndex(9676);
        LIZ = new SRC[] { (SRC)new SRF((Class)MultiGuestEffectSwitchFragment.class, "isFromLinkedPreviewPage", "isFromLinkedPreviewPage()Z", 0) };
        LJIIIZ = new MultiGuestEffectSwitchFragment.a((byte)0);
    }
    
    public MultiGuestEffectSwitchFragment() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/livesdk/ui/BaseFragment.<init>:()V
        //     4: aload_0        
        //     5: getstatic       X/B2G.LIZ:LX/B2G;
        //     8: invokevirtual   X/B2G.LIZ:()LX/BHo;
        //    11: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestEffectSwitchFragment.LJIIJ:LX/BHo;
        //    14: aload_0        
        //    15: new             LX/26l;
        //    18: dup            
        //    19: aload_0        
        //    20: invokespecial   X/26l.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestEffectSwitchFragment;)V
        //    23: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    26: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestEffectSwitchFragment.LJIILIIL:LX/5DO;
        //    29: return         
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
    
    public static final MultiGuestEffectSwitchFragment LIZ(final 0Wg 0Wg, final c c, final boolean b, final b b2) {
        return MultiGuestEffectSwitchFragment.LJIIIZ.LIZ(0Wg, c, b, b2);
    }
    
    public final void LIZ(final boolean b) {
        this.LJIIJ.LIZ((Object)this, MultiGuestEffectSwitchFragment.LIZ[0], (Object)b);
    }
    
    public final boolean LIZ() {
        return (boolean)this.LJIIJ.LIZ((Object)this, MultiGuestEffectSwitchFragment.LIZ[0]);
    }
    
    public final List<1ZU> LIZIZ() {
        return (List)this.LJIILIIL.getValue();
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131560688, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        final 0Wg ljiiiizz = this.LJIIIIZZ;
        CTM.LIZ((Object)this);
        final 0CH viewLifecycleOwner = this.getViewLifecycleOwner();
        n.LIZIZ((Object)viewLifecycleOwner, "");
        final DataChannel liz = HAM.LIZ((Fragment)this);
        MultiGuestEffectViewModel lj;
        if (this.isAdded()) {
            lj = 0Bv.LIZ(this, new 1Zg(liz, viewLifecycleOwner, ljiiiizz)).LIZ(MultiGuestEffectViewModel.class);
        }
        else {
            lj = null;
        }
        this.LJ = lj;
        if (lj != null) {
            lj.LIZIZ = this.LJI;
        }
        final MultiGuestEffectViewModel lj2 = this.LJ;
        if (lj2 != null) {
            lj2.LIZJ = this.LIZ();
        }
        this.LJIIJJI = (T0p)view.findViewById(2131364760);
        this.LJIIL = (0Gh)view.findViewById(2131364763);
        this.LIZLLL = (ImageView)view.findViewById(2131370412);
        this.LIZJ = (1ib)view.findViewById(2131364191);
        final SRo liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(100, 0, 0, true);
            final Context context = this.getContext();
            if (context != null) {
                n.LIZIZ((Object)context, "");
                final Integer liz2 = 3dF.LIZ(context, 2130971362);
                int intValue;
                if (liz2 != null) {
                    intValue = liz2;
                }
                else {
                    intValue = -65536;
                }
                final int liziz2 = 0cB.LIZIZ(2131100943);
                final Integer liz3 = 3dF.LIZ(context, 2130971328);
                int intValue2;
                if (liz3 != null) {
                    intValue2 = liz3;
                }
                else {
                    intValue2 = -1;
                }
                liziz.LIZ(intValue, liziz2, intValue2);
            }
            if (Ghp.LIZ(this.getContext())) {
                liziz.setScaleX(-1.0f);
            }
            if (!MultiGuestBeautySetting.useNewBeautySmallItem()) {
                GlD.LIZ((View)liziz);
            }
            liziz.setVisibilityListener((SRr)new 1Zf());
        }
        final ImageView lizlll = this.LIZLLL;
        if (lizlll != null && MultiGuestBeautySetting.useNewBeautySmallItem()) {
            GlD.LIZJ((View)lizlll);
        }
        final T0p ljiijji = this.LJIIJJI;
        final 0Gh ljiil = this.LJIIL;
        if (ljiijji != null && ljiil != null) {
            final Iterator<1ZU> iterator = this.LIZIZ().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final 1ZU next = iterator.next();
                if (n < 0) {
                    Ey9.LIZ();
                }
                final 1ZU 1zu = next;
                final T0r tab = ljiijji.newTab();
                26k.LIZ.LIZ(tab, 1zu);
                if (n == 0) {
                    final MultiGuestEffectSwitchFragment.a liz4 = MultiGuestEffectSwitchFragment.e.LIZ;
                    kotlin.jvm.internal.n.LIZIZ((Object)tab, "");
                    liz4.LIZ(tab);
                }
                else {
                    final MultiGuestEffectSwitchFragment.a liz5 = MultiGuestEffectSwitchFragment.e.LIZ;
                    kotlin.jvm.internal.n.LIZIZ((Object)tab, "");
                    liz5.LIZIZ(tab);
                }
                ljiijji.addTab(tab);
                ++n;
            }
            ljiijji.addOnTabSelectedListener((Stv)new MultiGuestEffectSwitchFragment.e(ljiil));
            ljiil.addOnPageChangeListener((0Gh.e)new T0s(ljiijji));
            ljiijji.setSelectedTabIndicatorColor(0);
        }
        final T0p ljiijji2 = this.LJIIJJI;
        final 0Gh ljiil2 = this.LJIIL;
        final ImageView lizlll2 = this.LIZLLL;
        if (ljiijji2 != null && ljiil2 != null) {
            final 0AB childFragmentManager = this.getChildFragmentManager();
            n.LIZIZ((Object)childFragmentManager, "");
            final 1mY adapter = new 1mY(childFragmentManager);
            ljiil2.setAdapter(adapter);
            GlD.LIZJ((View)ljiil2);
            ljiil2.addOnPageChangeListener((0Gh.e)new 1mX(lizlll2));
            final List<1ZU> liziz3 = this.LIZIZ();
            CTM.LIZ((Object)liziz3);
            adapter.LIZLLL().clear();
            adapter.LIZLLL().addAll(liziz3);
            adapter.LIZJ();
            ljiil2.setCurrentItem(0);
            if (this.LIZIZ().isEmpty() ^ true) {
                this.LJII = this.LIZIZ().get(0).LIZ;
            }
            final b lji = this.LJI;
            if (lji != null) {
                ((b)lji).LIZ(this.LJII, true);
            }
            if (!0up.LIZ.LIZ(this.LJII)) {
                GTi.LIZ((View)lizlll2);
            }
        }
        if (GTi.LIZIZ(Boolean.valueOf(MultiGuestBeautySetting.useNewBeautySmallItem()))) {
            final ImageView lizlll3 = this.LIZLLL;
            if (lizlll3 != null) {
                GlD.LIZ((View)lizlll3);
            }
        }
        if (MultiGuestBeautySetting.useNewBeautySmallItem()) {
            final IEffectService liz6 = 0jR.LIZ(IEffectService.class);
            n.LIZIZ((Object)liz6, "");
            final 1JR multiGuestBeautyLogManager = liz6.getMultiGuestBeautyLogManager();
            if (multiGuestBeautyLogManager != null) {
                final Map lizlll4 = FJ3.LIZLLL((Map)0uY.LIZ());
                if (this.LIZ()) {
                    lizlll4.put("event_page", "video_anchor_connect_detail");
                }
                else {
                    lizlll4.put("event_page", "video_anchor_connect_page");
                }
                multiGuestBeautyLogManager.LIZ(lizlll4);
                final MultiGuestEffectViewModel lj3 = this.LJ;
                if (lj3 != null) {
                    final 1JQ lizj = lj3.LIZJ();
                    if (lizj != null) {
                        multiGuestBeautyLogManager.LIZ(lizj);
                    }
                }
            }
        }
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(9679);
        }
        
        void LIZ();
        
        void LIZIZ();
        
        SRo LIZJ();
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(9678);
        }
        
        LiveEffect LIZ();
        
        void LIZ(final int p0);
        
        void LIZ(final int p0, final boolean p1);
        
        void LIZ(final LiveEffect p0);
        
        int LIZIZ();
    }
}
