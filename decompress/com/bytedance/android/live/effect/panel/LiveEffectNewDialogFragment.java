// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.panel;

import X.F0R;
import X.44T;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import android.view.View$OnTouchListener;
import X.0hp;
import android.view.GestureDetector$OnGestureListener;
import X.0ho;
import X.SRp;
import X.1jF;
import X.SRo;
import X.Ghp;
import X.F2r;
import X.F0v;
import X.2CH;
import X.0CH;
import X.0CI;
import X.1Ld;
import android.view.View$OnClickListener;
import X.0hq;
import X.Ji9;
import X.T0p;
import X.1jG;
import androidx.viewpager.widget.PagerAdapter;
import X.0Gh;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectSecondLevelPanelConfigSetting;
import X.0de;
import X.0Bu;
import X.1M0;
import X.0i3;
import X.0Wn;
import X.F0H;
import X.0hy;
import X.F1j;
import X.F1i;
import kotlin.d.b.a.a;
import X.Cye;
import X.BFk;
import X.SRT;
import X.F5e;
import X.2P9;
import X.SRS;
import X.QgG;
import X.F5g;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import X.Gaz;
import X.44V;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.1Jd;
import X.1JX;
import X.Gqs;
import java.util.Map;
import X.FJ3;
import X.0jR;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import X.1Jj;
import X.GTi;
import X.Gkn;
import android.os.SystemClock;
import X.1Jc;
import X.2C0;
import X.GST;
import X.Gh3;
import X.2X1;
import X.GOu;
import X.1K3;
import X.CTM;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import X.0gZ;
import X.0fx;
import X.0iM;
import kotlin.n.y;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import android.view.View;
import X.0gz;
import X.FpL;
import kotlin.jvm.internal.n;
import X.0cB;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.GK4;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import android.view.VelocityTracker;
import android.view.GestureDetector;
import X.1jI;
import X.0hs;
import X.0hu;
import X.0hr;
import android.view.View$OnLayoutChangeListener;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class LiveEffectNewDialogFragment extends LiveDialogFragment implements View$OnLayoutChangeListener
{
    public 0hr<?> LIZ;
    public 0hu LIZIZ;
    public 0hs LIZJ;
    public String LIZLLL;
    public String LJ;
    public 1jI LJFF;
    public GestureDetector LJI;
    public VelocityTracker LJII;
    public final float LJIIIIZZ;
    public boolean LJIIIZ;
    public LiveSmallItemBeautyViewModel LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public final GK4 LJIILIIL;
    public HashMap LJIILJJIL;
    
    static {
        Covode.recordClassIndex(6535);
    }
    
    public LiveEffectNewDialogFragment() {
        int lizj;
        if (0cB.LJI()) {
            lizj = -0cB.LIZJ();
        }
        else {
            lizj = 0cB.LIZJ();
        }
        this.LJIIIIZZ = (float)lizj;
        this.LJIILIIL = GK4.PANEL_BEAUTY_FILTER;
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561850);
        0gz.LIZ(fpL);
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJIILJJIL.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJIILJJIL.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final HashMap ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ljiiljjil.clear();
        }
    }
    
    public final void LIZLLL() {
        final boolean inExperiment = LiveBeautyReverseExperiment.INSTANCE.isInExperiment();
        final boolean b = false;
        if (inExperiment) {
            final ImageView imageView = (ImageView)this.LIZ(2131370412);
            n.LIZIZ((Object)imageView, "");
            imageView.setVisibility(8);
            final ImageView imageView2 = (ImageView)this.LIZ(2131370412);
            n.LIZIZ((Object)imageView2, "");
            imageView2.setEnabled(false);
            return;
        }
        final String lj = this.LJ;
        if (lj != null && y.LIZIZ(lj, "beauty", false) && 0iM.LIZIZ()) {
            final ImageView imageView3 = (ImageView)this.LIZ(2131370412);
            n.LIZIZ((Object)imageView3, "");
            imageView3.setEnabled(false);
            return;
        }
        final ImageView imageView4 = (ImageView)this.LIZ(2131370412);
        n.LIZIZ((Object)imageView4, "");
        final List<LiveEffect> liziz = 0fx.LIZ.LIZ().LIZIZ(0gZ.LIZLLL);
        n.LIZIZ((Object)liziz, "");
        final ArrayList list = new ArrayList();
        for (final LiveEffect next : liziz) {
            if (n.LIZ((Object)next.effectPanelName, (Object)this.LIZLLL)) {
                list.add(next);
            }
        }
        final List list2 = list;
        boolean enabled = b;
        Label_0293: {
            if (!list2.isEmpty()) {
                final Iterator iterator2 = list2.iterator();
                LiveEffect liveEffect;
                do {
                    enabled = b;
                    if (!iterator2.hasNext()) {
                        break Label_0293;
                    }
                    liveEffect = (LiveEffect)iterator2.next();
                } while (!liveEffect.isExclusive && !0fx.LIZ.LIZ().LIZ(liveEffect));
                enabled = true;
            }
        }
        imageView4.setEnabled(enabled);
    }
    
    public final GK4 d_() {
        return this.LJIILIIL;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        0fx.LIZ.LIZ().LJFF();
        1K3.LJIIIZ = false;
        final 0hr<?> liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        liz.LIZIZ();
        if (this.LIZIZ == null) {
            n.LIZ("");
        }
        final VelocityTracker ljii = this.LJII;
        if (ljii != null) {
            ljii.clear();
        }
        final VelocityTracker ljii2 = this.LJII;
        if (ljii2 != null) {
            ljii2.recycle();
        }
        this.LJII = null;
        super.onDismiss(dialogInterface);
        final View liz2 = this.LIZ(2131364399);
        if (liz2 != null) {
            liz2.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        }
        final DataChannel ljil = super.LJIL;
        if (ljil != null) {
            ljil.LIZIZ((Class)GOu.class, (Object)new Gh3(false, 0, ((Fragment)this).hashCode(), 2X1.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        final DataChannel ljil2 = super.LJIL;
        final 44V llllzi = GST.LLLLZI;
        n.LIZIZ((Object)llllzi, "");
        ((44T)llllzi).LIZ((Object)false);
        if (ljil2 != null) {
            ljil2.LIZJ((Class)2C0.class);
        }
        final 1Jc ljiiiz = 1Jc.LJIIIZ;
        ljiiiz.LIZ(false);
        final DataChannel ljil3 = super.LJIL;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long ljiil = this.LJIIL;
        final Gkn liz3 = Gkn.LJFF.LIZ("livesdk_live_take_beauty_panel_duration");
        liz3.LIZ(ljil3);
        liz3.LIZ("use_time", uptimeMillis - ljiil);
        String s;
        if (GTi.LIZJ()) {
            s = "live_take_page";
        }
        else {
            s = "live_take_detail";
        }
        liz3.LIZ("event_page", s);
        liz3.LIZLLL();
        if (GTi.LIZLLL() && GTi.LIZIZ(Boolean.valueOf(1Jc.LJ))) {
            1Jj.LIZ.LIZIZ(2L);
            final IBroadcastService liz4 = 0jR.LIZ(IBroadcastService.class);
            n.LIZIZ((Object)liz4, "");
            final String broadcastScene = liz4.getBroadcastScene();
            n.LIZIZ((Object)broadcastScene, "");
            1Jc.LJIIIIZZ = broadcastScene;
            final Iterator iterator = FJ3.LIZ((Map)1Jc.LIZIZ, (Map)1Jc.LIZJ).entrySet().iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final Map.Entry<K, 1Jc.a> entry = (Map.Entry<K, 1Jc.a>)iterator.next();
                final LiveEffect lizlll = entry.getValue().LIZLLL;
                final long effectId = lizlll.effectId;
                String name;
                if ((name = lizlll.getName()) == null) {
                    name = "";
                }
                final String resourceId = lizlll.getResourceId();
                final long n = Gqs.LIZ() / 1000L;
                String effectPanelKey;
                if ((effectPanelKey = lizlll.effectPanelKey) == null) {
                    effectPanelKey = "";
                }
                final Gaz smallItemConfig = lizlll.getSmallItemConfig();
                Integer value;
                if (smallItemConfig != null) {
                    value = smallItemConfig.LJI;
                }
                else {
                    value = null;
                }
                final Gaz smallItemConfig2 = lizlll.getSmallItemConfig();
                Integer value2;
                if (smallItemConfig2 != null) {
                    value2 = smallItemConfig2.LJII;
                }
                else {
                    value2 = null;
                }
                Long n2;
                if (kotlin.jvm.internal.n.LIZ((Object)value, (Object)value2)) {
                    n2 = 1L;
                }
                else {
                    n2 = 2L;
                }
                1Jj.LIZ.LIZ(2L, new 1JX(effectId, name, resourceId, 2L, n, null, 0L, effectPanelKey, n2, 1L, entry.getValue().LIZIZ, null, 1Jc.LJIIIIZZ, null, 24576));
                b = true;
            }
            for (final Map.Entry<Object, V> entry2 : FJ3.LIZ((Map)1Jc.LIZJ, (Map)1Jc.LIZLLL).entrySet()) {
                final boolean contains = 1Jc.LJII.contains(entry2.getKey());
                final LiveEffect lizlll2 = ((1Jc.a)entry2.getValue()).LIZLLL;
                final 1Jc.a a = 1Jc.LIZ.get(entry2.getKey());
                if (a == null || a.LIZIZ == 0.0f) {
                    continue;
                }
                final long effectId2 = lizlll2.effectId;
                String name2;
                if ((name2 = lizlll2.getName()) == null) {
                    name2 = "";
                }
                final String resourceId2 = lizlll2.getResourceId();
                final long n3 = a.LJFF / 1000L;
                final long n4 = Gqs.LIZ() / 1000L;
                String effectPanelKey2;
                if ((effectPanelKey2 = lizlll2.effectPanelKey) == null) {
                    effectPanelKey2 = "";
                }
                Long n5;
                if (a.LJ) {
                    n5 = 1L;
                }
                else {
                    n5 = 2L;
                }
                Long n6;
                if (contains) {
                    n6 = 2L;
                }
                else {
                    n6 = 1L;
                }
                1Jj.LIZ.LIZ(2L, new 1JX(effectId2, name2, resourceId2, 2L, n3, n4, 0L, effectPanelKey2, n5, n6, a.LIZIZ, null, 1Jc.LJIIIIZZ, null, 24576));
                b = true;
            }
            if (b) {
                1Jc.LJ = true;
                1Jj.LIZ.LIZ(2L);
            }
        }
        ljiiiz.LIZ(super.LJIL, false);
        ljiiiz.LIZIZ(super.LJIL, false);
        ljiiiz.LIZ(super.LJIL);
        final DataChannel ljil4 = super.LJIL;
        final 44V lllj = GST.LLLJ;
        n.LIZIZ((Object)lllj, "");
        if (!GTi.LIZIZ((Boolean)((44T)lllj).LIZ())) {
            final Iterator<Map.Entry<Long, 1Jc.a>> iterator3 = 1Jc.LIZLLL.entrySet().iterator();
            boolean b2 = false;
            while (iterator3.hasNext()) {
                final Map.Entry<K, 1Jc.a> entry3 = (Map.Entry<K, 1Jc.a>)iterator3.next();
                final String effectPanelKey3 = entry3.getValue().LIZLLL.effectPanelKey;
                if (effectPanelKey3 != null && y.LIZIZ(effectPanelKey3, "beauty", false)) {
                    final 44V ljjii = GST.LJJII;
                    n.LIZIZ((Object)ljjii, "");
                    if (GTi.LIZ((Boolean)((44T)ljjii).LIZ())) {
                        if (!(1Jc.LIZ.isEmpty() ^ true) || !GTi.LIZIZ(Boolean.valueOf(b2))) {
                            continue;
                        }
                        final 1Jc ljiiiz2 = 1Jc.LJIIIZ;
                        final String effectPanelKey4 = entry3.getValue().LIZLLL.effectPanelKey;
                        final Gkn liz5 = Gkn.LJFF.LIZ("livesdk_live_take_beauty_close");
                        liz5.LIZ(ljil4);
                        liz5.LIZ("tab_name", effectPanelKey4);
                        liz5.LIZ("effect_id", 0cB.LIZ(2131829159));
                        liz5.LIZ("resource_id", 0cB.LIZ(2131829159));
                        liz5.LIZ("beauty_type", 0cB.LIZ(2131829159));
                        liz5.LIZ("beauty_type_name", 0cB.LIZ(2131829159));
                        liz5.LIZ("beauty_type_name_tier2", "");
                        liz5.LIZ("impr_position", "");
                        liz5.LIZ("beauty_status", Boolean.valueOf(ljiiiz2.LIZJ()));
                        liz5.LIZLLL();
                        b2 = true;
                    }
                    else {
                        final 1Jc ljiiiz3 = 1Jc.LJIIIZ;
                        final Gkn liz6 = Gkn.LJFF.LIZ("livesdk_live_take_beauty_close");
                        liz6.LIZ(ljil4);
                        ljiiiz3.LIZ(liz6, entry3.getValue().LIZLLL);
                        liz6.LIZ("beauty_status", Boolean.valueOf(1Jc.LJIIIZ.LIZJ()));
                        liz6.LIZLLL();
                    }
                }
                else {
                    final 1Jc ljiiiz4 = 1Jc.LJIIIZ;
                    final Gkn liz7 = Gkn.LJFF.LIZ("livesdk_live_take_beauty_close");
                    liz7.LIZ(ljil4);
                    ljiiiz4.LIZ(liz7, entry3.getValue().LIZLLL);
                    liz7.LIZ("beauty_status", Boolean.valueOf(1Jc.LJIIIZ.LIZJ()));
                    liz7.LIZLLL();
                }
            }
        }
        ljiiiz.LIZ();
        final 1Jd ljff = 1Jd.LJFF;
        ljff.LIZ(false);
        if (!n.LIZ((Object)1Jd.LIZIZ, (Object)1Jd.LIZ) && 1Jd.LIZLLL && GTi.LIZLLL() && GTi.LIZIZ(Boolean.valueOf(1Jd.LJ))) {
            if (1Jd.LIZIZ != null || 1Jd.LIZ != null) {
                1Jd.LJ = true;
            }
            1Jj.LIZ.LIZIZ(3L);
            1Jj.LIZ.LIZ(1Jd.LIZIZ, false);
            1Jj.LIZ.LIZ(1Jd.LIZ, true);
            1Jj.LIZ.LIZ(3L);
        }
        ljff.LIZ(super.LJIL, false, this.LJIIIZ);
        ljff.LIZIZ(super.LJIL, false, this.LJIIIZ);
        ljff.LIZ(super.LJIL);
        final DataChannel ljil5 = super.LJIL;
        Label_1650: {
            if (1Jd.LIZ == null || 1Jd.LIZIZ != null) {
                if (1Jd.LIZ == null) {
                    break Label_1650;
                }
                final 1Jd.a liz8 = 1Jd.LIZ;
                if (liz8 == null) {
                    n.LIZIZ();
                }
                if (liz8.LIZJ == 0.0f || 1Jd.LIZIZ == null) {
                    break Label_1650;
                }
                final 1Jd.a liziz = 1Jd.LIZIZ;
                if (liziz == null) {
                    n.LIZIZ();
                }
                if (liziz.LIZJ != 0.0f) {
                    break Label_1650;
                }
            }
            final Gkn liz9 = Gkn.LJFF.LIZ("live_take_filter_close");
            liz9.LIZ(ljil5);
            final 1Jd.a liziz2 = 1Jd.LIZIZ;
            String liziz3;
            if (liziz2 != null) {
                liziz3 = liziz2.LIZIZ;
            }
            else {
                liziz3 = null;
            }
            liz9.LIZ("resource_id", liziz3);
            final 1Jd.a liziz4 = 1Jd.LIZIZ;
            String liz10;
            if (liziz4 != null) {
                liz10 = liziz4.LIZ;
            }
            else {
                liz10 = null;
            }
            liz9.LIZ("filter_id", liz10);
            liz9.LIZLLL();
        }
        ljff.LIZ();
    }
    
    public final void onLayoutChange(View view, int height, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        view = ((Fragment)this).getView();
        if (view != null) {
            n.LIZIZ((Object)view, "");
            height = view.getHeight();
            view = this.LIZ(2131364399);
            n.LIZIZ((Object)view, "");
            height -= view.getHeight();
            if (this.LJIIJJI != height) {
                this.LJIIJJI = height;
                final DataChannel ljil = super.LJIL;
                if (ljil != null) {
                    ljil.LIZIZ((Class)GOu.class, (Object)new Gh3(true, height, ((Fragment)this).hashCode(), 2X1.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
                }
            }
        }
    }
    
    public final void onStart() {
        super.onStart();
        0gz.LIZ((DialogFragment)this);
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 2CI extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
        {
            public int LIZ;
            public final /* synthetic */ LiveEffectNewDialogFragment LIZIZ;
            
            static {
                Covode.recordClassIndex(6551);
            }
            
            public 2CI(final LiveEffectNewDialogFragment liziz, final Cye cye) {
                this.LIZIZ = liziz;
                super(2, cye);
            }
            
            public final Cye<2P9> create(final Object o, final Cye<?> cye) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
                //     4: new             LX/2CI;
                //     7: dup            
                //     8: aload_0        
                //     9: getfield        X/2CI.LIZIZ:Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;
                //    12: aload_2        
                //    13: invokespecial   X/2CI.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;LX/Cye;)V
                //    16: areturn        
                //    Signature:
                //  (Ljava/lang/Object;LX/Cye<*>;)LX/Cye<LX/2P9;>;
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:756)
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
            
            public final Object invoke(final Object o, final Object o2) {
                return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
            }
            
            public final Object invokeSuspend(final Object o) {
                final F1i coroutine_SUSPENDED = F1i.COROUTINE_SUSPENDED;
                final int liz = this.LIZ;
                if (liz != 0) {
                    if (liz != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    F1j.LIZ(o);
                }
                else {
                    F1j.LIZ(o);
                    final LiveSmallItemBeautyViewModel ljiij = this.LIZIZ.LJIIJ;
                    if (ljiij != null) {
                        final F0H<0hy> liz2 = ljiij.LIZ;
                        if (liz2 != null) {
                            final 0hy.a liz3 = 0hy.a.LIZ;
                            this.LIZ = 1;
                            if (((F0R)liz2).LIZ((Object)liz3, (Cye)this) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                    }
                }
                return 2P9.LIZ;
            }
        }
        public final class 1tc extends F5g implements SRS<Boolean, 2P9>
        {
            public final /* synthetic */ LiveEffectNewDialogFragment LIZ;
            
            static {
                Covode.recordClassIndex(6550);
            }
            
            public 1tc(final LiveEffectNewDialogFragment liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1tb extends F5g implements SRS<LiveEffect, 2P9>
        {
            public final /* synthetic */ LiveEffectNewDialogFragment LIZ;
            
            static {
                Covode.recordClassIndex(6549);
            }
            
            public 1tb(final LiveEffectNewDialogFragment liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1ta extends F5g implements QgG<String>
        {
            public final /* synthetic */ LiveEffectNewDialogFragment LIZ;
            
            static {
                Covode.recordClassIndex(6548);
            }
            
            public 1ta(final LiveEffectNewDialogFragment liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 1tZ extends F5g implements QgG<String>
        {
            public final /* synthetic */ LiveEffectNewDialogFragment LIZ;
            
            static {
                Covode.recordClassIndex(6547);
            }
            
            public 1tZ(final LiveEffectNewDialogFragment liz) {
                this.LIZ = liz;
                super(0);
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
        //    10: ldc_w           2131830531
        //    13: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //    16: putstatic       X/0gZ.LJIIIZ:Ljava/lang/String;
        //    19: aload_0        
        //    20: invokevirtual   androidx/fragment/app/Fragment.getActivity:()LX/1nL;
        //    23: ifnull          59
        //    26: aload_0        
        //    27: getstatic       X/0Wn.LIZ:LX/0Wn;
        //    30: new             LX/1M0;
        //    33: dup            
        //    34: new             LX/0i3;
        //    37: dup            
        //    38: invokespecial   X/0i3.<init>:()V
        //    41: invokespecial   X/1M0.<init>:(LX/0i3;)V
        //    44: invokevirtual   X/0Wn.LIZ:(LX/0Bs;)LX/0Bu;
        //    47: ldc_w           Lcom/bytedance/android/live/effect/smallitem/LiveSmallItemBeautyViewModel;.class
        //    50: invokevirtual   X/0Bu.LIZ:(Ljava/lang/Class;)LX/0Bq;
        //    53: checkcast       Lcom/bytedance/android/live/effect/smallitem/LiveSmallItemBeautyViewModel;
        //    56: putfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LJIIJ:Lcom/bytedance/android/live/effect/smallitem/LiveSmallItemBeautyViewModel;
        //    59: aload_0        
        //    60: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //    63: putfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LJIIL:J
        //    66: aload_0        
        //    67: ldc_w           2131364399
        //    70: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    73: aload_0        
        //    74: invokevirtual   android/view/View.addOnLayoutChangeListener:(Landroid/view/View$OnLayoutChangeListener;)V
        //    77: aload_0        
        //    78: ldc_w           2131364759
        //    81: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    84: checkcast       LX/0de;
        //    87: astore_1       
        //    88: aload_1        
        //    89: ldc             ""
        //    91: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    94: aload_1        
        //    95: invokevirtual   X/0de.getBackground:()Landroid/graphics/drawable/Drawable;
        //    98: astore_1       
        //    99: aload_1        
        //   100: ldc             ""
        //   102: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   105: aload_1        
        //   106: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting;
        //   109: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting.getValue:()LX/GOr;
        //   112: getfield        X/GOr.LIZ:F
        //   115: ldc_w           255.0
        //   118: fmul           
        //   119: f2i            
        //   120: invokevirtual   android/graphics/drawable/Drawable.setAlpha:(I)V
        //   123: aload_0        
        //   124: invokevirtual   androidx/fragment/app/Fragment.getChildFragmentManager:()LX/0AB;
        //   127: astore_1       
        //   128: aload_1        
        //   129: ldc             ""
        //   131: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   134: aload_0        
        //   135: new             LX/1jI;
        //   138: dup            
        //   139: aload_1        
        //   140: invokespecial   X/1jI.<init>:(LX/0AB;)V
        //   143: putfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LJFF:LX/1jI;
        //   146: aload_0        
        //   147: ldc_w           2131364755
        //   150: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   153: checkcast       LX/0Gh;
        //   156: astore_1       
        //   157: aload_1        
        //   158: ldc             ""
        //   160: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   163: aload_1        
        //   164: aload_0        
        //   165: getfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LJFF:LX/1jI;
        //   168: invokevirtual   X/0Gh.setAdapter:(Landroidx/viewpager/widget/PagerAdapter;)V
        //   171: aload_0        
        //   172: ldc_w           2131364755
        //   175: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   178: checkcast       LX/0Gh;
        //   181: new             LX/1jG;
        //   184: dup            
        //   185: aload_0        
        //   186: invokespecial   X/1jG.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   189: invokevirtual   X/0Gh.addOnPageChangeListener:(LX/0Gd;)V
        //   192: aload_0        
        //   193: ldc_w           2131364760
        //   196: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   199: checkcast       LX/T0p;
        //   202: astore_2       
        //   203: aload_2        
        //   204: ldc             ""
        //   206: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   209: aload_0        
        //   210: ldc_w           2131364755
        //   213: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   216: checkcast       LX/Ji9;
        //   219: astore_1       
        //   220: aload_1        
        //   221: ldc             ""
        //   223: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   226: aload_0        
        //   227: new             LX/0hs;
        //   230: dup            
        //   231: aload_2        
        //   232: aload_1        
        //   233: aload_0        
        //   234: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   237: invokespecial   X/0hs.<init>:(LX/T0p;LX/0Gh;Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //   240: putfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LIZJ:LX/0hs;
        //   243: aload_0        
        //   244: ldc             2131370412
        //   246: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   249: checkcast       Landroid/widget/ImageView;
        //   252: new             LX/0hq;
        //   255: dup            
        //   256: aload_0        
        //   257: invokespecial   X/0hq.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   260: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   263: aload_0        
        //   264: ldc_w           2131364759
        //   267: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   270: checkcast       LX/0de;
        //   273: new             LX/1Ld;
        //   276: dup            
        //   277: aload_0        
        //   278: invokespecial   X/1Ld.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   281: invokevirtual   X/0de.setErrorClickListener:(LX/0dd;)V
        //   284: aload_0        
        //   285: invokestatic    X/0CI.LIZ:(LX/0CH;)LX/15r;
        //   288: aconst_null    
        //   289: new             LX/2CH;
        //   292: dup            
        //   293: aload_0        
        //   294: aconst_null    
        //   295: invokespecial   X/2CH.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;LX/Cye;)V
        //   298: iconst_3       
        //   299: invokestatic    X/F0v.LIZ:(LX/BFk;LX/F2r;LX/SRT;I)LX/F2K;
        //   302: pop            
        //   303: aload_0        
        //   304: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   307: invokestatic    X/Ghp.LIZ:(Landroid/content/Context;)Z
        //   310: ifeq            337
        //   313: aload_0        
        //   314: ldc_w           2131371451
        //   317: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   320: checkcast       LX/SRo;
        //   323: astore_1       
        //   324: aload_1        
        //   325: ldc             ""
        //   327: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   330: aload_1        
        //   331: ldc_w           -1.0
        //   334: invokevirtual   X/SRo.setScaleX:(F)V
        //   337: aload_0        
        //   338: ldc_w           2131371451
        //   341: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   344: checkcast       LX/SRo;
        //   347: ldc_w           2131100567
        //   350: invokestatic    X/0cB.LIZIZ:(I)I
        //   353: ldc_w           2131100565
        //   356: invokestatic    X/0cB.LIZIZ:(I)I
        //   359: ldc_w           2131100566
        //   362: invokestatic    X/0cB.LIZIZ:(I)I
        //   365: invokevirtual   X/SRo.LIZ:(III)V
        //   368: aload_0        
        //   369: ldc_w           2131371451
        //   372: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   375: checkcast       LX/SRo;
        //   378: new             LX/1jF;
        //   381: dup            
        //   382: aload_0        
        //   383: invokespecial   X/1jF.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   386: invokevirtual   X/SRo.setOnLevelChangeListener:(LX/SRp;)V
        //   389: aload_0        
        //   390: new             Landroid/view/GestureDetector;
        //   393: dup            
        //   394: aload_0        
        //   395: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   398: new             LX/0ho;
        //   401: dup            
        //   402: aload_0        
        //   403: invokespecial   X/0ho.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   406: invokespecial   android/view/GestureDetector.<init>:(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
        //   409: putfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LJI:Landroid/view/GestureDetector;
        //   412: aload_0        
        //   413: ldc_w           2131364399
        //   416: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   419: new             LX/0hp;
        //   422: dup            
        //   423: aload_0        
        //   424: invokespecial   X/0hp.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   427: invokevirtual   android/view/View.setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
        //   430: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveComposerFilterSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveComposerFilterSetting;
        //   433: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveComposerFilterSetting.isComposerSupported:()Z
        //   436: ifeq            706
        //   439: aload_0        
        //   440: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   443: astore_3       
        //   444: aload_0        
        //   445: astore_1       
        //   446: aload_1        
        //   447: ldc_w           2131371451
        //   450: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   453: checkcast       LX/SRo;
        //   456: astore_2       
        //   457: aload_2        
        //   458: ldc             ""
        //   460: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   463: new             LX/1K2;
        //   466: dup            
        //   467: aload_3        
        //   468: aload_1        
        //   469: aload_2        
        //   470: new             LX/1tZ;
        //   473: dup            
        //   474: aload_1        
        //   475: invokespecial   X/1tZ.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   478: invokespecial   X/1K2.<init>:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;Landroidx/fragment/app/Fragment;LX/SRo;LX/QgG;)V
        //   481: astore_2       
        //   482: aload_0        
        //   483: astore_1       
        //   484: aload_1        
        //   485: aload_2        
        //   486: putfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LIZ:LX/0hr;
        //   489: aload_1        
        //   490: getfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LJIIJ:Lcom/bytedance/android/live/effect/smallitem/LiveSmallItemBeautyViewModel;
        //   493: astore          4
        //   495: aload_1        
        //   496: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   499: astore_2       
        //   500: aload_1        
        //   501: getfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LJFF:LX/1jI;
        //   504: astore          5
        //   506: aload_1        
        //   507: ldc_w           2131371451
        //   510: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   513: checkcast       LX/SRo;
        //   516: astore_3       
        //   517: aload_3        
        //   518: ldc             ""
        //   520: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   523: aload_1        
        //   524: ldc             2131370412
        //   526: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   529: checkcast       Landroid/widget/ImageView;
        //   532: astore          6
        //   534: aload           6
        //   536: ldc             ""
        //   538: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   541: aload_1        
        //   542: ldc_w           2131364191
        //   545: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   548: checkcast       LX/1ib;
        //   551: astore          7
        //   553: aload           7
        //   555: ldc             ""
        //   557: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   560: aload_1        
        //   561: new             LX/0hu;
        //   564: dup            
        //   565: aload           4
        //   567: aload_2        
        //   568: aload_1        
        //   569: aload           5
        //   571: aload_3        
        //   572: aload           6
        //   574: aload           7
        //   576: invokespecial   X/0hu.<init>:(Lcom/bytedance/android/live/effect/smallitem/LiveSmallItemBeautyViewModel;Lcom/bytedance/ies/sdk/datachannel/DataChannel;Landroidx/fragment/app/Fragment;LX/1jI;LX/SRo;Landroid/widget/ImageView;Landroid/widget/TextView;)V
        //   579: putfield        com/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment.LIZIZ:LX/0hu;
        //   582: aload_1        
        //   583: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   586: astore_3       
        //   587: aload_1        
        //   588: astore_2       
        //   589: aload_3        
        //   590: ifnull          629
        //   593: aload_3        
        //   594: aload_1        
        //   595: ldc_w           LX/2CF;.class
        //   598: new             LX/1tb;
        //   601: dup            
        //   602: aload_1        
        //   603: invokespecial   X/1tb.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   606: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   609: pop            
        //   610: aload_3        
        //   611: aload_1        
        //   612: ldc_w           LX/2CD;.class
        //   615: new             LX/1tc;
        //   618: dup            
        //   619: aload_1        
        //   620: invokespecial   X/1tc.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   623: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   626: pop            
        //   627: aload_1        
        //   628: astore_2       
        //   629: ldc_w           Lcom/bytedance/android/livesdkapi/host/IHostContext;.class
        //   632: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   635: astore_1       
        //   636: aload_1        
        //   637: ldc             ""
        //   639: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   642: aload_1        
        //   643: checkcast       Lcom/bytedance/android/livesdkapi/host/IHostContext;
        //   646: invokeinterface com/bytedance/android/livesdkapi/host/IHostContext.isLocalTest:()Z
        //   651: ifeq            693
        //   654: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveShowEffectDebugViewSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveShowEffectDebugViewSetting;
        //   657: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveShowEffectDebugViewSetting.enable:()Z
        //   660: ifeq            693
        //   663: aload_2        
        //   664: ldc_w           2131364191
        //   667: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   670: invokestatic    X/GTi.LIZIZ:(Landroid/view/View;)V
        //   673: aload_2        
        //   674: invokestatic    X/0CI.LIZ:(LX/0CH;)LX/15r;
        //   677: aconst_null    
        //   678: new             LX/2CI;
        //   681: dup            
        //   682: aload_2        
        //   683: aconst_null    
        //   684: invokespecial   X/2CI.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;LX/Cye;)V
        //   687: iconst_3       
        //   688: invokestatic    X/F0v.LIZ:(LX/BFk;LX/F2r;LX/SRT;I)LX/F2K;
        //   691: pop            
        //   692: return         
        //   693: aload_2        
        //   694: ldc_w           2131364191
        //   697: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   700: invokestatic    X/GTi.LIZ:(Landroid/view/View;)V
        //   703: goto            673
        //   706: aload_0        
        //   707: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   710: astore_3       
        //   711: aload_0        
        //   712: astore_1       
        //   713: aload_1        
        //   714: ldc_w           2131371451
        //   717: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   720: checkcast       LX/SRo;
        //   723: astore_2       
        //   724: aload_2        
        //   725: ldc             ""
        //   727: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   730: new             LX/1Ln;
        //   733: dup            
        //   734: aload_3        
        //   735: aload_1        
        //   736: aload_2        
        //   737: new             LX/1ta;
        //   740: dup            
        //   741: aload_1        
        //   742: invokespecial   X/1ta.<init>:(Lcom/bytedance/android/live/effect/panel/LiveEffectNewDialogFragment;)V
        //   745: invokespecial   X/1Ln.<init>:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;Landroidx/fragment/app/Fragment;LX/SRo;LX/QgG;)V
        //   748: astore_2       
        //   749: goto            482
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
