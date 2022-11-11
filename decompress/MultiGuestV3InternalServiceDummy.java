// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.internal;

import X.Vwc;
import X.Vwg;
import X.Vvu;
import X.VvR;
import X.1Wh;
import X.VzU;
import X.SRT;
import X.2P9;
import X.L76;
import X.LLU;
import X.W0N;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.bpea.basics.Cert;
import X.W1b;
import X.RnJ;
import X.PSy;
import X.RnI;
import X.VxH;
import X.VvO;
import X.Ipf;
import X.IlB;
import X.L6x;
import android.graphics.Rect;
import X.6uH;
import java.util.List;
import X.Vvh;
import X.Vva;
import X.Vvl;
import X.8si;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import android.view.SurfaceView;
import X.Vv9;
import X.59t;
import X.SRS;
import X.Vvi;
import X.VvS;
import X.Qmr;
import X.RmJ;
import X.2Ij;
import X.Qmq;
import X.2P1;
import X.Rlc;
import X.VxG;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.QgG;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import X.Qmt;
import X.W1m;
import X.Qmw;
import X.2U9;
import X.Qms;
import X.2SD;
import kotlin.jvm.internal.n;
import java.util.Map;
import X.Rld;
import X.FAE;
import X.W0g;
import X.Iph;
import X.IYK;
import X.Ipg;
import X.W1I;
import X.Rlf;
import X.CTM;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import X.1dl;
import X.FBF;
import X.1Wc;
import com.bytedance.covode.number.Covode;

public class MultiGuestV3InternalServiceDummy implements IMultiGuestV3InternalService
{
    static {
        Covode.recordClassIndex(8874);
    }
    
    @Override
    public void adjustResolutionWhenFallBack() {
    }
    
    @Override
    public FBF<1dl<GuestMicCameraManageResponse>> anchorMuteGuest(final 1Wc 1Wc) {
        CTM.LIZ((Object)1Wc);
        return null;
    }
    
    @Override
    public void apply(final Rlf rlf, final W1I<Ipg> w1I) {
        CTM.LIZ((Object)rlf);
    }
    
    @Override
    public void cancelApply(final IYK iyk, final W1I<Iph> w1I) {
        CTM.LIZ((Object)iyk);
    }
    
    @Override
    public FAE<Rld> cancelInvite(final W0g w0g) {
        CTM.LIZ((Object)w0g);
        final FAE liz = FAE.LIZ((Object)new Rld((Map)null));
        n.LIZIZ((Object)liz, "");
        return (FAE<Rld>)liz;
    }
    
    @Override
    public void changeMaxPosition(final 2SD 2sd, final W1I<Qms> w1I) {
        CTM.LIZ((Object)2sd);
    }
    
    @Override
    public String channelId() {
        return "";
    }
    
    @Override
    public void createChannel(final 2U9 2u9, final W1I<Qmw> w1I) {
        CTM.LIZ((Object)2u9);
    }
    
    @Override
    public void destroyChannel(final W1m w1m, final W1I<Qmt> w1I) {
        CTM.LIZ((Object)w1m);
    }
    
    @Override
    public void detach() {
    }
    
    @Override
    public void disposeCancelInviteDisposable(final long n) {
    }
    
    @Override
    public Set<Long> getHasAppliedUidSetWhenIsAnchor() {
        return new HashSet<Long>();
    }
    
    @Override
    public Set<Long> getHasInvitedUidSetWhenIsAnchor() {
        return new HashSet<Long>();
    }
    
    @Override
    public int getLinkMicState() {
        return 0;
    }
    
    @Override
    public Map<String, String> getSceneLayoutIdMap() {
        return new HashMap<String, String>();
    }
    
    @Override
    public void hookJoinChannel(final QgG<Boolean> qgG) {
        CTM.LIZ((Object)qgG);
    }
    
    @Override
    public void init(final Room room, final String s, final Context context) {
        CTM.LIZ((Object)room);
    }
    
    @Override
    public FAE<Rlc> invite(final VxG vxG) {
        CTM.LIZ((Object)vxG);
        final FAE liz = FAE.LIZ((Object)new Rlc((Map)null));
        n.LIZIZ((Object)liz, "");
        return (FAE<Rlc>)liz;
    }
    
    @Override
    public void invite(final VxG vxG, final W1I<Rlc> w1I) {
        CTM.LIZ((Object)vxG);
    }
    
    @Override
    public boolean isRtcEngineOn() {
        return false;
    }
    
    @Override
    public boolean isRtcLocked() {
        return false;
    }
    
    @Override
    public void joinChannel(final 2P1 2p1, final W1I<Qmq> w1I) {
        CTM.LIZ((Object)2p1);
        CTM.LIZ((Object)2p1);
    }
    
    public void joinDirect(final 2Ij 2Ij, final W1I<Object> w1I) {
        CTM.LIZ((Object)2Ij);
        CTM.LIZ((Object)2Ij);
    }
    
    @Override
    public void kickOut(final RmJ rmJ, final W1I<Qmr> w1I) {
        CTM.LIZ((Object)rmJ);
    }
    
    @Override
    public VvS layoutManager() {
        public final class 1WH implements VvS
        {
            static {
                Covode.recordClassIndex(8875);
            }
            
            public final Vvi LIZ() {
                return new Vvi(1);
            }
            
            public final void LIZ(final float n, final int n2) {
            }
            
            public final void LIZ(final int n) {
            }
            
            public final void LIZ(final long n) {
            }
            
            public final void LIZ(final SRS<? super 59t, Integer> srs) {
            }
            
            public final void LIZ(final Vv9 vv9) {
                CTM.LIZ((Object)vv9);
            }
            
            public final void LIZ(final Vvi vvi) {
                CTM.LIZ((Object)vvi);
            }
            
            public final void LIZ(final SurfaceView surfaceView) {
            }
            
            public final void LIZ(final View view) {
                CTM.LIZ((Object)view);
                CTM.LIZ((Object)view);
            }
            
            public final void LIZ(final ViewGroup viewGroup, final FrameLayout frameLayout, final 8si<Integer, Integer> 8si) {
                CTM.LIZ((Object)viewGroup);
            }
            
            public final void LIZ(final String s) {
                CTM.LIZ((Object)s);
            }
            
            public final void LIZ(final String s, final Vvl vvl) {
            }
            
            public final int LIZIZ(final String s) {
                CTM.LIZ((Object)s);
                return 0;
            }
            
            public final void LIZIZ() {
            }
            
            public final void LIZIZ(final int n) {
            }
            
            public final void LIZIZ(final Vv9 vv9) {
                CTM.LIZ((Object)vv9);
            }
            
            public final Vva LIZJ() {
                public final class 1WG implements Vva
                {
                    static {
                        Covode.recordClassIndex(8876);
                    }
                    
                    public final Vvh LIZ(final String s) {
                        CTM.LIZ((Object)s);
                        return null;
                    }
                    
                    public final boolean LIZ() {
                        return true;
                    }
                    
                    public final List<Vvh> getAllLayoutWindows() {
                        return (List<Vvh>)6uH.INSTANCE;
                    }
                    
                    public final Rect getContainerActualRange() {
                        return new Rect();
                    }
                    
                    public final Rect getContainerAllRange() {
                        return new Rect();
                    }
                    
                    public final String getLayoutName() {
                        return "";
                    }
                    
                    public final String getLayoutType() {
                        return "";
                    }
                    
                    public final Rect getPlayerRange() {
                        return new Rect();
                    }
                }
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: invokespecial   X/1WG.<init>:()V
                //     7: areturn        
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
            
            public final void LIZJ(final String s) {
                CTM.LIZ((Object)s);
            }
            
            public final void LIZLLL() {
            }
            
            public final void LJ() {
            }
            
            public final L6x LJFF() {
                return null;
            }
            
            public final void LJI() {
            }
            
            public final void LJII() {
            }
            
            public final void LJIIIIZZ() {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   X/1WH.<init>:()V
        //     7: areturn        
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
    
    @Override
    public void leaveChannel(final IlB ilB, final W1I<Ipf> w1I) {
        CTM.LIZ((Object)ilB);
    }
    
    @Override
    public VvO micPositionManager() {
        return null;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void onLinkControlWidgetCreate(final Room room, final Context context) {
    }
    
    @Override
    public void onLinkControlWidgetDestroy() {
    }
    
    @Override
    public void permitApply(final VxH vxH, final W1I<RnI> w1I) {
        CTM.LIZ((Object)vxH);
    }
    
    @Override
    public void replyInvite(final PSy pSy, final W1I<RnJ> w1I) {
        CTM.LIZ((Object)pSy);
    }
    
    @Override
    public W1b rtcManager() {
        public final class 1WI implements W1b
        {
            static {
                Covode.recordClassIndex(8877);
            }
            
            public final void LIZ() {
            }
            
            public final void LIZ(final Cert cert) {
            }
            
            public final void LIZ(final String s) {
                CTM.LIZ((Object)s);
            }
            
            public final void LIZ(final String s, final String s2) {
                CTM.LIZ((Object)s, (Object)s2);
            }
            
            public final void LIZ(final String s, final boolean b) {
                CTM.LIZ((Object)s);
                CTM.LIZ((Object)s);
            }
            
            public final void LIZ(final boolean b) {
            }
            
            public final void LIZ(final boolean b, final ImageModel imageModel) {
            }
            
            public final boolean LIZ(final W0N w0N) {
                CTM.LIZ((Object)w0N);
                return false;
            }
            
            public final void LIZIZ() {
            }
            
            public final void LIZIZ(final Cert cert) {
            }
            
            public final void LIZIZ(final String s) {
                CTM.LIZ((Object)s);
            }
            
            public final void LIZIZ(final boolean b) {
            }
            
            public final void LIZJ() {
            }
            
            public final void LIZJ(final boolean b) {
            }
            
            public final List<String> LIZLLL() {
                return null;
            }
            
            public final void LIZLLL(final boolean b) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   X/1WI.<init>:()V
        //     7: areturn        
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
    
    @Override
    public int scene() {
        return 0;
    }
    
    @Override
    public LLU selfLinkInfo() {
        return null;
    }
    
    @Override
    public void sendSeiToSDK(final String s, final SRS<? super L76, 2P9> srs) {
        CTM.LIZ((Object)srs);
    }
    
    @Override
    public <T> IMultiGuestV3InternalService subscribe(final Class<T> clazz, final SRT<? super VzU, ? super 1Wh<T>, 2P9> srt) {
        CTM.LIZ((Object)clazz, (Object)srt);
        return this;
    }
    
    @Override
    public <T> IMultiGuestV3InternalService unsubscribe(final Class<T> clazz, final SRT<? super VzU, ? super 1Wh<T>, 2P9> srt) {
        CTM.LIZ((Object)clazz, (Object)srt);
        return this;
    }
    
    @Override
    public <T> void unsubscribeCreateChannelMsg() {
    }
    
    @Override
    public void updateLayoutParam(final String s) {
        CTM.LIZ((Object)s);
        CTM.LIZ((Object)s);
    }
    
    @Override
    public void updateLiveConfig(final W0N w0N) {
        CTM.LIZ((Object)w0N);
    }
    
    @Override
    public VvR userManager() {
        public final class 1WJ implements VvR
        {
            static {
                Covode.recordClassIndex(8878);
            }
            
            public final Vvu LIZ(final String s) {
                CTM.LIZ((Object)s);
                return new Vvu();
            }
            
            public final Vwg LIZ(final long n) {
                return null;
            }
            
            public final List<Vwg> LIZ() {
                return (List<Vwg>)6uH.INSTANCE;
            }
            
            public final void LIZ(final L76 l76) {
                CTM.LIZ((Object)l76);
                CTM.LIZ((Object)l76);
            }
            
            public final void LIZ(final Vwc vwc) {
                CTM.LIZ((Object)vwc);
                CTM.LIZ((Object)vwc);
            }
            
            public final void LIZ(final Vwg vwg) {
                CTM.LIZ((Object)vwg);
                CTM.LIZ((Object)vwg);
            }
            
            public final void LIZ(final List<Vwg> list) {
                CTM.LIZ((Object)list);
                CTM.LIZ((Object)list);
            }
            
            public final void LIZ(final List<Vwg> list, final int n) {
                CTM.LIZ((Object)list);
            }
            
            public final Vwg LIZIZ(final long n) {
                return null;
            }
            
            public final Vwg LIZIZ(final String s) {
                CTM.LIZ((Object)s);
                CTM.LIZ((Object)s);
                return null;
            }
            
            public final List<Vwg> LIZIZ() {
                return (List<Vwg>)6uH.INSTANCE;
            }
            
            public final void LIZIZ(final Vwg vwg) {
                CTM.LIZ((Object)vwg);
                CTM.LIZ((Object)vwg);
            }
            
            public final Vwg LIZJ(final long n) {
                return null;
            }
            
            public final Vwg LIZJ(final String s) {
                CTM.LIZ((Object)s);
                CTM.LIZ((Object)s);
                return null;
            }
            
            public final List<Vwg> LIZJ() {
                return (List<Vwg>)6uH.INSTANCE;
            }
            
            public final Vwg LIZLLL(final String s) {
                CTM.LIZ((Object)s);
                CTM.LIZ((Object)s);
                return null;
            }
            
            public final List<Vwg> LIZLLL() {
                return (List<Vwg>)6uH.INSTANCE;
            }
            
            public final void LJ() {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   X/1WJ.<init>:()V
        //     7: areturn        
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
}
