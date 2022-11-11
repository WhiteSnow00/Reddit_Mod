// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multicohost.widget;

import X.GK2;
import com.bytedance.android.widget.WidgetManager;
import X.0CC;
import X.W1b;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import X.Fgn;
import X.2Du;
import com.bytedance.android.live.liveinteract.multicohost.service.IMultiCoHostService;
import X.0xd;
import X.1Sz;
import X.1Sv;
import X.1T0;
import X.2El;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import X.0d3;
import org.json.JSONObject;
import X.Gqs;
import X.0pL;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import X.1mg;
import kotlin.jvm.internal.n;
import X.G5l;
import X.SRS;
import X.0CH;
import X.0yB;
import X.1T2;
import X.0xm;
import X.0k3;
import X.GpW;
import X.Gmg;
import android.os.SystemClock;
import X.0py;
import X.0k2;
import X.1NN;
import X.Vwg;
import X.0qY;
import X.CTM;
import X.0pM;
import X.Ipf;
import X.W1I;
import java.util.Map;
import X.IlB;
import X.0jz;
import X.0ba;
import X.0pq;
import X.0mM;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import X.2P9;
import X.1Sy;
import X.1Wh;
import X.VzU;
import X.SRT;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import X.5DO;
import X.6mZ;
import X.1lU;
import com.bytedance.android.live.liveinteract.api.CoHostLiveWidget;

public final class MultiCoHostWidget extends CoHostLiveWidget implements a, 6mZ
{
    public boolean LIZ;
    public long LIZIZ;
    public final 5DO LIZJ;
    public final 5DO LIZLLL;
    public final 5DO LJ;
    public final 5DO LJFF;
    public final 5DO LJI;
    public final 5DO LJII;
    public MatchBaseWidget LJIIIIZZ;
    public final SRT<VzU, 1Wh<1Sy>, 2P9> LJIIIZ;
    
    static {
        Covode.recordClassIndex(8415);
    }
    
    public MultiCoHostWidget() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/liveinteract/api/CoHostLiveWidget.<init>:()V
        //     4: aload_0        
        //     5: new             LX/201;
        //     8: dup            
        //     9: aload_0        
        //    10: invokespecial   X/201.<init>:(Lcom/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget;)V
        //    13: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    16: putfield        com/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget.LIZJ:LX/5DO;
        //    19: aload_0        
        //    20: new             LX/202;
        //    23: dup            
        //    24: aload_0        
        //    25: invokespecial   X/202.<init>:(Lcom/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget;)V
        //    28: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    31: putfield        com/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget.LIZLLL:LX/5DO;
        //    34: aload_0        
        //    35: new             LX/203;
        //    38: dup            
        //    39: aload_0        
        //    40: invokespecial   X/203.<init>:(Lcom/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget;)V
        //    43: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    46: putfield        com/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget.LJ:LX/5DO;
        //    49: aload_0        
        //    50: new             LX/205;
        //    53: dup            
        //    54: aload_0        
        //    55: invokespecial   X/205.<init>:(Lcom/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget;)V
        //    58: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    61: putfield        com/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget.LJFF:LX/5DO;
        //    64: aload_0        
        //    65: getstatic       X/204.LIZ:LX/204;
        //    68: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    71: putfield        com/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget.LJI:LX/5DO;
        //    74: aload_0        
        //    75: getstatic       X/207.LIZ:LX/207;
        //    78: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    81: putfield        com/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget.LJII:LX/5DO;
        //    84: aload_0        
        //    85: new             LX/206;
        //    88: dup            
        //    89: aload_0        
        //    90: invokespecial   X/206.<init>:(Lcom/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget;)V
        //    93: putfield        com/bytedance/android/live/liveinteract/multicohost/widget/MultiCoHostWidget.LJIIIZ:LX/SRT;
        //    96: return         
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
    
    private final ViewGroup LJ() {
        return (ViewGroup)this.LIZJ.getValue();
    }
    
    private final FrameLayout LJFF() {
        return (FrameLayout)this.LIZLLL.getValue();
    }
    
    private final 0mM LJI() {
        return (0mM)this.LJFF.getValue();
    }
    
    private final 1lU LJII() {
        return (1lU)this.LJI.getValue();
    }
    
    private final 0pq LJIIIIZZ() {
        return (0pq)this.LJII.getValue();
    }
    
    public final void LIZ() {
        final 1lU ljii = this.LJII();
        0ba.LIZ(4, "MultiCoHostPresenter", "onMicRoomStart");
        if (ljii.LIZ) {
            0jz.LIZLLL().leave(new IlB("leave_with_microom_start", 0L, (Map)null, 0, 14), null);
        }
    }
    
    public final void LIZ(final int n) {
    }
    
    @Override
    public final void LIZ(final 0pM 0pM) {
        CTM.LIZ((Object)0pM);
        0ba.LIZ(4, "MultiCoHostWidget", "onMultiCoHostStateChanged, state = ".concat(String.valueOf(0pM)));
        if (0qY.LIZ[0pM.ordinal()] == 1) {
            this.LJI().LIZJ();
        }
    }
    
    @Override
    public final void LIZ(final Vwg vwg) {
        CTM.LIZ((Object)vwg);
        if (this.LIZ) {
            final 1NN liz = 1NN.LLFF.LIZ();
            if (!liz.LJLIIIL) {
                final 0k2 ljlji = liz.LJLJI;
                if (ljlji == 0k2.INVITER || ljlji == 0k2.APPLY) {
                    liz.LJLLL = 0py.LIZ();
                    liz.LJLLLL = liz.LJLZ;
                }
                else if (ljlji == 0k2.INVITEE) {
                    liz.LJLLL = liz.LJLLLLLL;
                    liz.LJLLLL = 0py.LIZ();
                }
            }
        }
        if (this.LIZ && 1NN.LLFF.LIZ().LJJJJLL <= 0L) {
            1NN.LLFF.LIZ().LJJJJLL = SystemClock.elapsedRealtime();
        }
    }
    
    public final void LIZ(final String s) {
        this.LJII();
        0jz.LIZLLL().onSei(s);
        if (!this.LIZ) {
            final MatchBaseWidget ljiiiizz = this.LJIIIIZZ;
            if (ljiiiizz != null) {
                ljiiiizz.LIZ(s);
            }
        }
    }
    
    public final void LIZ(final Throwable t) {
        Gmg.LIZ((GpW)this, t);
    }
    
    public final void LIZIZ() {
        1NN.LLFF.LIZ().LJZI = 0k3.LJ;
        0xm.LIZ("during_connection", new 0k3(0k3.LJI));
        1T2.LIZJ.LIZ(super.dataChannel, 0yB.LIZ((0CH)this, false, null));
    }
    
    public final Object LIZJ() {
        return null;
    }
    
    @Override
    public final void LIZLLL() {
        0ba.LIZ(4, "MultiCoHostWidget", "onCoHostLinked, will load match widget as a sub widget");
        0ba.LIZ(4, "MultiCoHostWidget", "loadMatchWidget ");
        if (this.LJIIIIZZ == null) {
            this.enableSubWidgetManager();
            final DataChannel dataChannel = super.dataChannel;
            Object liziz;
            if (dataChannel != null) {
                liziz = dataChannel.LIZIZ((Class)G5l.class);
            }
            else {
                liziz = null;
            }
            int n = 1;
            MatchBaseWidget ljiiiizz2;
            if (kotlin.jvm.internal.n.LIZ(liziz, (Object)true)) {
                final View view = ((Widget)this).getView();
                if (view == null) {
                    kotlin.jvm.internal.n.LIZIZ();
                }
                kotlin.jvm.internal.n.LIZIZ((Object)view, "");
                final 0pq ljiiiizz = this.LJIIIIZZ();
                CTM.LIZ((Object)view, (Object)ljiiiizz);
                1mg.LJIILJJIL.LIZ(true);
                ljiiiizz2 = new MultiMatchAnchorWidget(view, (byte)0);
                ljiiiizz2.LIZ = ljiiiizz;
            }
            else {
                final 1mg ljiiljjil = 1mg.LJIILJJIL;
                final long lj = 1NN.LLFF.LIZ().LJ;
                final 0pL support_MULTI = 0pL.SUPPORT_MULTI;
                1mg.LJIIL = Gqs.LIZ();
                final JSONObject jsonObject = new JSONObject();
                0d3.LIZ(jsonObject, "channel_id", lj);
                if (support_MULTI != 0pL.SUPPORT_MULTI) {
                    n = 0;
                }
                0d3.LIZ(jsonObject, "is_sdk", n);
                final JSONObject jsonObject2 = new JSONObject();
                0d3.LIZ(jsonObject2, "cost", Gqs.LIZ() - 1mg.LJIIL);
                1mg.LIZIZ(ljiiljjil, "coHost_identified", jsonObject, null, jsonObject2, false, 20);
                final View view2 = ((Widget)this).getView();
                if (view2 == null) {
                    kotlin.jvm.internal.n.LIZIZ();
                }
                kotlin.jvm.internal.n.LIZIZ((Object)view2, "");
                final 0pq ljiiiizz3 = this.LJIIIIZZ();
                CTM.LIZ((Object)view2, (Object)ljiiiizz3);
                1mg.LJIILJJIL.LIZ(false);
                ljiiiizz2 = new MultiMatchAudienceWidget(view2, (byte)0);
                ljiiiizz2.LIZ = ljiiiizz3;
            }
            this.LJIIIIZZ = ljiiiizz2;
            ((WidgetManager)super.subWidgetManager).load((Widget)this.LJIIIIZZ);
            final StringBuilder sb = new StringBuilder("loadMatchWidget , sub widget ");
            final MatchBaseWidget ljiiiizz4 = this.LJIIIIZZ;
            String canonicalName = null;
            Label_0172: {
                if (ljiiiizz4 != null) {
                    final Class<? extends MatchBaseWidget> class1 = ljiiiizz4.getClass();
                    if (class1 != null && (canonicalName = class1.getCanonicalName()) != null) {
                        break Label_0172;
                    }
                }
                canonicalName = "baseWidget";
            }
            sb.append(canonicalName);
            sb.append(" loaded");
            0ba.LIZ(4, "MultiCoHostWidget", sb.toString());
        }
        else {
            0ba.LIZ(4, "MultiCoHostWidget", "loadMatchWidget , sub widget already loaded");
        }
        if (1NN.LLFF.LIZ().LJ != 0L) {
            this.LIZIZ = 1NN.LLFF.LIZ().LJ;
        }
    }
    
    public final String LJIIL() {
        return this.getClass().getName();
    }
    
    public final int getLayoutId() {
        return 2131562491;
    }
    
    public final void onCreate() {
        super.onCreate();
        final DataChannel dataChannel = super.dataChannel;
        final boolean b = false;
        while (true) {
            Label_0433: {
                if (dataChannel == null) {
                    break Label_0433;
                }
                final Boolean b2 = (Boolean)dataChannel.LIZIZ((Class)G5l.class);
                if (b2 == null) {
                    break Label_0433;
                }
                final boolean booleanValue = b2;
                this.LIZ = booleanValue;
                super.dataChannel.LIZ((Class)2El.class, (Object)true);
                this.LJII().LIZ((1lU.a)this);
                final StringBuilder sb = new StringBuilder("onCreate, layoutContainer = ");
                sb.append(this.LJ());
                sb.append("  layoutLinkMicContainer = ");
                sb.append(this.LJFF());
                0ba.LIZ(4, "MultiCoHostWidget", sb.toString());
                final 0pq ljiiiizz = this.LJIIIIZZ();
                final DataChannel dataChannel2 = super.dataChannel;
                n.LIZIZ((Object)dataChannel2, "");
                final FrameLayout ljff = this.LJFF();
                final FrameLayout ljff2 = (FrameLayout)this.LJ.getValue();
                CTM.LIZ((Object)dataChannel2, (Object)ljff, (Object)ljff2);
                ljiiiizz.LIZJ = dataChannel2;
                ljiiiizz.LIZLLL = ljff;
                ljiiiizz.LJFF = ljff2;
                final Boolean b3 = (Boolean)dataChannel2.LIZIZ((Class)G5l.class);
                boolean booleanValue2 = b;
                if (b3 != null) {
                    booleanValue2 = b3;
                }
                ljiiiizz.LIZIZ = booleanValue2;
                0jz.LIZLLL().subscribe(1T0.class, ljiiiizz.LJI);
                0jz.LIZLLL().subscribe(1Sy.class, ljiiiizz.LJIIIZ);
                0jz.LIZLLL().subscribe(1Sv.class, ljiiiizz.LJIIIIZZ);
                0jz.LIZLLL().subscribe(1Sz.class, ljiiiizz.LJII);
                final 1lU ljii = this.LJII();
                final ViewGroup lj = this.LJ();
                final FrameLayout ljff3 = this.LJFF();
                CTM.LIZ((Object)lj, (Object)ljff3);
                0ba.LIZ(4, "MultiCoHostPresenter", "startCoHostUI");
                final IMultiCoHostService lizlll = 0jz.LIZLLL();
                final a a = (a)((GK2)ljii).LJJIL;
                n.LIZIZ((Object)a, "");
                lizlll.startCoHostUI(lj, ljff3, (0CH)a);
                0jz.LIZLLL().subscribe(1Sy.class, this.LJIIIZ);
                if (1NN.LLFF.LIZ().LJ != 0L) {
                    this.LIZIZ = 1NN.LLFF.LIZ().LJ;
                }
                final int size = 0jz.LIZLLL().getCoHostLinkedUserList().size();
                final boolean liz = this.LIZ;
                final long liziz = this.LIZIZ;
                if (0xd.LJ.LIZ(size)) {
                    0xm.LIZ(liz, liziz);
                }
                final 0mM lji = this.LJI();
                if (lji != null) {
                    lji.LIZ();
                }
                return;
            }
            final boolean booleanValue = false;
            continue;
        }
    }
    
    public final void onDestroy() {
        0ba.LIZ(4, "MultiCoHostWidget", "unloadMatchWidget , sub widget unload");
        final RecyclableWidgetManager subWidgetManager = super.subWidgetManager;
        if (subWidgetManager != null) {
            ((WidgetManager)subWidgetManager).unload((Widget)this.LJIIIIZZ);
        }
        this.LJIIIIZZ = null;
        super.onDestroy();
        0ba.LIZ(4, "MultiCoHostWidget", "onDestroy");
        final DataChannel dataChannel = super.dataChannel;
        if (dataChannel != null) {
            dataChannel.LIZ((Class)2El.class, (Object)false);
        }
        final DataChannel dataChannel2 = super.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LIZIZ((Class)2Du.class, (Object)new Fgn(1));
        }
        0jz.LIZLLL().unsubscribe(1Sy.class, this.LJIIIZ);
        ((GK2)this.LJII()).LIZ();
        final 0pq ljiiiizz = this.LJIIIIZZ();
        ljiiiizz.LIZJ = null;
        ljiiiizz.LIZLLL = null;
        ljiiiizz.LJFF = null;
        0jz.LIZLLL().unsubscribe(1T0.class, ljiiiizz.LJI);
        0jz.LIZLLL().unsubscribe(1Sy.class, ljiiiizz.LJIIIZ);
        0jz.LIZLLL().unsubscribe(1Sv.class, ljiiiizz.LJIIIIZZ);
        0jz.LIZLLL().unsubscribe(1Sz.class, ljiiiizz.LJII);
    }
    
    public final void onPause() {
        super.onPause();
        final VzU linkSession = 0jz.LIZLLL().getLinkSession();
        if (linkSession != null) {
            final W1b ljiijji = linkSession.LJIIJJI();
            if (ljiijji != null) {
                ljiijji.LIZ();
            }
        }
    }
    
    public final void onResume() {
        super.onResume();
        final VzU linkSession = 0jz.LIZLLL().getLinkSession();
        if (linkSession != null) {
            final W1b ljiijji = linkSession.LJIIJJI();
            if (ljiijji != null) {
                ljiijji.LIZIZ();
            }
        }
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
