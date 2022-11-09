// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.internal;

import X.VvR;
import X.QgD;
import X.L76;
import X.SRS;
import X.LLU;
import X.W1b;
import X.1Uo;
import X.RnJ;
import X.PSy;
import X.RnI;
import X.VxH;
import X.VvO;
import X.Ipf;
import X.IlB;
import X.VvS;
import X.Qmr;
import X.RmJ;
import X.Qmq;
import X.2P1;
import X.Rlc;
import X.VxG;
import X.VwV;
import X.QgG;
import java.util.Enumeration;
import java.util.Collections;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceInviteRefactorSetting;
import com.bytedance.android.live.base.model.user.User;
import java.util.Iterator;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import X.0sh;
import X.6uF;
import X.Qsi;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;
import X.6Jd;
import X.1XD;
import java.util.Set;
import X.Qmt;
import X.W1m;
import X.1WZ;
import X.0sR;
import X.RnM;
import X.0jz;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceRefactorSetting;
import X.Vxk;
import X.Qmw;
import X.2U9;
import X.Qms;
import X.2SD;
import X.Rld;
import X.FAE;
import X.W0g;
import X.Iph;
import X.IYK;
import X.Ipg;
import X.W1I;
import X.Rlf;
import X.FCD;
import X.FC5;
import X.0yr;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import X.CTM;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import X.1dl;
import X.FBF;
import X.1Wc;
import X.L72;
import X.Fk2;
import X.Vv9;
import X.VzT;
import X.1jw;
import X.L6w;
import X.W1j;
import X.Vw5;
import java.util.Objects;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorOneVnSetting;
import X.0Vq;
import X.0jR;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceSessionFix;
import X.VwU;
import kotlin.jvm.internal.n;
import X.1WP;
import X.1WO;
import android.util.ArrayMap;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import X.5DO;
import X.W0N;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import X.RnQ;
import X.2P9;
import X.1Wh;
import X.SRT;
import java.util.List;
import java.util.Map;
import X.VzU;
import X.VwO;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public class MultiGuestV3InternalServiceImpl implements IMultiGuestV3InternalService
{
    public Room LIZ;
    public VwO LIZIZ;
    public VzU LIZJ;
    public Map<Class<?>, List<SRT<VzU, 1Wh<?>, 2P9>>> LIZLLL;
    public Map<Class<?>, List<SRT<VzU, 1Wh<RnQ>, 2P9>>> LJ;
    public ILinkMicService LJFF;
    public WeakReference<Context> LJI;
    public W0N LJII;
    public boolean LJIIIIZZ;
    public final 5DO LJIIIZ;
    public final 5DO LJIIJ;
    
    static {
        Covode.recordClassIndex(8879);
    }
    
    public MultiGuestV3InternalServiceImpl() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/HashMap;
        //     8: dup            
        //     9: invokespecial   java/util/HashMap.<init>:()V
        //    12: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZLLL:Ljava/util/Map;
        //    15: aload_0        
        //    16: new             Landroid/util/ArrayMap;
        //    19: dup            
        //    20: invokespecial   android/util/ArrayMap.<init>:()V
        //    23: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJ:Ljava/util/Map;
        //    26: aload_0        
        //    27: new             LX/21v;
        //    30: dup            
        //    31: aload_0        
        //    32: invokespecial   X/21v.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl;)V
        //    35: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    38: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJIIIZ:LX/5DO;
        //    41: aload_0        
        //    42: new             LX/21w;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   X/21w.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl;)V
        //    50: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    53: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJIIJ:LX/5DO;
        //    56: return         
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
    
    private final 1WO LIZLLL() {
        return (1WO)this.LJIIIZ.getValue();
    }
    
    private final 1WP LJ() {
        return (1WP)this.LJIIJ.getValue();
    }
    
    public final VzU LIZ() {
        if (this.LIZJ == null) {
            if (this.LIZIZ != null) {
                final VwO liziz = this.LIZIZ;
                if (liziz == null) {
                    n.LIZ("");
                }
                this.LIZJ = VwU.LIZ(liziz);
            }
            else if (LinkMicMultiGuestV3ServiceSessionFix.getValue() && this.LIZ != null) {
                final WeakReference<Context> lji = this.LJI;
                if (lji != null) {
                    final Context context = lji.get();
                    if (context != null) {
                        final 0Vq liz = 0jR.LIZ((Class<0Vq>)ILinkMicService.class);
                        n.LIZIZ((Object)liz, "");
                        final ILinkMicService ljff = (ILinkMicService)liz;
                        if ((this.LJFF = ljff) == null) {
                            n.LIZ("");
                        }
                        final Vw5 builder = ljff.builder();
                        if (builder != null) {
                            final Room liz2 = this.LIZ;
                            if (liz2 == null) {
                                n.LIZ("");
                            }
                            builder.LIZ(liz2);
                            builder.LIZ(LiveAnchorOneVnSetting.INSTANCE.getValue());
                            n.LIZIZ((Object)context, "");
                            final VwO liz3 = builder.LIZ(context);
                            if ((this.LIZIZ = liz3) == null) {
                                n.LIZ("");
                            }
                            this.LIZJ = VwU.LIZ(liz3);
                        }
                    }
                }
            }
        }
        final VzU lizj = this.LIZJ;
        Objects.requireNonNull(lizj, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicSession");
        return lizj;
    }
    
    public final void LIZIZ() {
        public final class 1WN implements W1j
        {
            static {
                Covode.recordClassIndex(8883);
            }
            
            public final L6w LIZ() {
                Object liz;
                if (!((liz = 1jw.LIZ.LIZ("LIVE_VIDEO_CLIENT_FACTORY")) instanceof L6w)) {
                    liz = null;
                }
                return (L6w)liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZ:()LX/VzU;
        //     4: aload_0        
        //     5: invokespecial   com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJ:()LX/1WP;
        //     8: invokeinterface X/VzU.LIZ:(LX/VzT;)V
        //    13: aload_0        
        //    14: invokevirtual   com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZ:()LX/VzU;
        //    17: invokeinterface X/VzU.LJIIIZ:()LX/VvS;
        //    22: aload_0        
        //    23: invokespecial   com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZLLL:()LX/1WO;
        //    26: invokeinterface X/VvS.LIZ:(LX/Vv9;)V
        //    31: aload_0        
        //    32: getfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    35: astore_1       
        //    36: aload_1        
        //    37: ifnonnull       45
        //    40: ldc             ""
        //    42: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    45: aload_1        
        //    46: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //    49: lstore_2       
        //    50: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //    53: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //    56: astore_1       
        //    57: aload_1        
        //    58: ldc             ""
        //    60: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    63: lload_2        
        //    64: aload_1        
        //    65: invokeinterface X/GIK.LIZJ:()J
        //    70: lcmp           
        //    71: ifne            197
        //    74: iconst_1       
        //    75: istore          4
        //    77: new             LX/L72;
        //    80: dup            
        //    81: invokespecial   X/L72.<init>:()V
        //    84: astore          5
        //    86: aload_0        
        //    87: getfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    90: astore_1       
        //    91: aload_1        
        //    92: ifnonnull       100
        //    95: ldc             ""
        //    97: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   100: aload_1        
        //   101: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getStreamUrl:()Lcom/bytedance/android/livesdkapi/depend/model/live/StreamUrl;
        //   104: astore_1       
        //   105: aload_1        
        //   106: ifnull          192
        //   109: aload_1        
        //   110: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/StreamUrl.LIZ:()Ljava/lang/String;
        //   113: astore_1       
        //   114: aload           5
        //   116: aload_1        
        //   117: putfield        X/L72.LIZ:Ljava/lang/String;
        //   120: aload           5
        //   122: aconst_null    
        //   123: putfield        X/L72.LIZIZ:LX/L6x;
        //   126: aload_0        
        //   127: new             LX/W0N;
        //   130: dup            
        //   131: iload           4
        //   133: aload           5
        //   135: invokevirtual   X/L72.LIZ:()LX/L71;
        //   138: new             LX/1WN;
        //   141: dup            
        //   142: invokespecial   X/1WN.<init>:()V
        //   145: iconst_0       
        //   146: ldc             "#2F173A"
        //   148: aconst_null    
        //   149: bipush          88
        //   151: invokespecial   X/W0N.<init>:(ZLX/L71;LX/W1j;ZLjava/lang/String;LX/QgG;I)V
        //   154: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJII:LX/W0N;
        //   157: aload_0        
        //   158: invokevirtual   com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZ:()LX/VzU;
        //   161: invokeinterface X/VzU.LJIIJJI:()LX/W1b;
        //   166: astore          5
        //   168: aload_0        
        //   169: getfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJII:LX/W0N;
        //   172: astore_1       
        //   173: aload_1        
        //   174: ifnonnull       182
        //   177: ldc             ""
        //   179: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   182: aload           5
        //   184: aload_1        
        //   185: invokeinterface X/W1b.LIZ:(LX/W0N;)Z
        //   190: pop            
        //   191: return         
        //   192: aconst_null    
        //   193: astore_1       
        //   194: goto            114
        //   197: iconst_0       
        //   198: istore          4
        //   200: goto            77
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
        this.LIZLLL.clear();
        final VzU lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZIZ((VzT)this.LJ());
        }
        final VzU lizj2 = this.LIZJ;
        if (lizj2 != null) {
            lizj2.LJIILJJIL();
        }
        this.LIZJ = null;
    }
    
    @Override
    public void adjustResolutionWhenFallBack() {
        this.LIZ().LJIIJJI().LIZJ();
    }
    
    @Override
    public FBF<1dl<GuestMicCameraManageResponse>> anchorMuteGuest(final 1Wc 1Wc) {
        CTM.LIZ((Object)1Wc);
        return (FBF<1dl<GuestMicCameraManageResponse>>)0yr.LIZ().LIZ(MultiLiveApi.class).anchorMuteGuest(1Wc.LIZ, 1Wc.LIZIZ, 1Wc.LIZJ, 1Wc.LIZLLL, 1Wc.LJ).LIZ((FCD)new FC5());
    }
    
    @Override
    public void apply(final Rlf rlf, final W1I<Ipg> w1I) {
        CTM.LIZ((Object)rlf);
        this.LIZ().LIZ(rlf, (W1I)w1I);
    }
    
    @Override
    public void cancelApply(final IYK iyk, final W1I<Iph> w1I) {
        CTM.LIZ((Object)iyk);
        this.LIZ().LIZ(iyk, (W1I)w1I);
    }
    
    @Override
    public FAE<Rld> cancelInvite(final W0g w0g) {
        CTM.LIZ((Object)w0g);
        return (FAE<Rld>)this.LIZ().LIZ(w0g);
    }
    
    @Override
    public void changeMaxPosition(final 2SD 2sd, final W1I<Qms> w1I) {
        CTM.LIZ((Object)2sd);
        this.LIZ().LIZ(2sd, (W1I)w1I);
    }
    
    @Override
    public String channelId() {
        return this.LIZ().LJI();
    }
    
    @Override
    public void createChannel(final 2U9 2u9, final W1I<Qmw> w1I) {
        public final class 1WK implements W1I<Qmw>
        {
            public final /* synthetic */ W1I LIZ;
            
            static {
                Covode.recordClassIndex(8880);
            }
            
            public 1WK(final W1I liz) {
                this.LIZ = liz;
            }
            
            public final void LIZ(final Vxk vxk, final Throwable t) {
                CTM.LIZ((Object)vxk);
                final W1I liz = this.LIZ;
                if (liz != null) {
                    liz.LIZ(vxk, t);
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
        //     5: invokevirtual   com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZ:()LX/VzU;
        //     8: aload_1        
        //     9: new             LX/1WK;
        //    12: dup            
        //    13: aload_2        
        //    14: invokespecial   X/1WK.<init>:(LX/W1I;)V
        //    17: invokeinterface X/VzU.LIZ:(LX/2U9;LX/W1I;)V
        //    22: return         
        //    Signature:
        //  (LX/2U9;LX/W1I<LX/Qmw;>;)V
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
    public void destroyChannel(final W1m w1m, final W1I<Qmt> w1I) {
        public final class 1WL implements W1I<Qmt>
        {
            public final /* synthetic */ W1I LIZ;
            
            static {
                Covode.recordClassIndex(8881);
            }
            
            public 1WL(final W1I liz) {
                this.LIZ = liz;
            }
            
            public final void LIZ(final Vxk vxk, final Throwable t) {
                CTM.LIZ((Object)vxk);
                final W1I liz = this.LIZ;
                if (liz != null) {
                    liz.LIZ(vxk, t);
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
        //     5: invokevirtual   com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZ:()LX/VzU;
        //     8: aload_1        
        //     9: new             LX/1WL;
        //    12: dup            
        //    13: aload_2        
        //    14: invokespecial   X/1WL.<init>:(LX/W1I;)V
        //    17: invokeinterface X/VzU.LIZ:(LX/W1m;LX/W1I;)V
        //    22: return         
        //    Signature:
        //  (LX/W1m;LX/W1I<LX/Qmt;>;)V
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
    public void detach() {
        if (!this.LJIIIIZZ) {
            return;
        }
        this.LIZJ();
        if (this.LIZIZ != null) {
            final VwO liziz = this.LIZIZ;
            if (liziz == null) {
                n.LIZ("");
            }
            liziz.LIZ();
        }
        this.LJIIIIZZ = false;
    }
    
    @Override
    public void disposeCancelInviteDisposable(final long n) {
        this.LIZ().LIZ(n);
    }
    
    @Override
    public Set<Long> getHasAppliedUidSetWhenIsAnchor() {
        Object liz;
        if (!((liz = 1jw.LIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER")) instanceof 1XD)) {
            liz = null;
        }
        final 1XD 1xd = (1XD)liz;
        if (1xd != null) {
            final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> ljff = 1xd.LJFF();
            if (ljff != null) {
                final List<LinkPlayerInfo> lizlll = ljff.LIZLLL();
                if (lizlll != null) {
                    final ArrayList list = new ArrayList(6Jd.LIZ((Iterable)lizlll, 10));
                    final Iterator<Object> iterator = lizlll.iterator();
                    while (iterator.hasNext()) {
                        final User lizj = iterator.next().LIZJ;
                        n.LIZIZ((Object)lizj, "");
                        list.add((Object)lizj.getId());
                    }
                    final Object o;
                    if ((o = Qsi.LJIILJJIL((Iterable)list)) != null) {
                        return (Set<Long>)o;
                    }
                }
            }
        }
        Object o = 6uF.INSTANCE;
        return (Set<Long>)o;
    }
    
    @Override
    public Set<Long> getHasInvitedUidSetWhenIsAnchor() {
        if (LinkMicMultiGuestV3ServiceInviteRefactorSetting.getValue()) {
            final Enumeration<Long> keys = 0sR.LIZJ.keys();
            n.LIZIZ((Object)keys, "");
            final ArrayList<Object> list = Collections.list((Enumeration<Object>)keys);
            n.LIZIZ((Object)list, "");
            return Qsi.LJIILJJIL((Iterable)list);
        }
        return this.LIZ().LJIJ();
    }
    
    @Override
    public int getLinkMicState() {
        return this.LIZ().LJIILIIL();
    }
    
    @Override
    public Map<String, String> getSceneLayoutIdMap() {
        return this.LIZ().LJIIZILJ();
    }
    
    @Override
    public void hookJoinChannel(final QgG<Boolean> qgG) {
        CTM.LIZ((Object)qgG);
        this.LIZ().LIZ((QgG)qgG);
    }
    
    @Override
    public void init(final Room liz, final String s, final Context context) {
        public final class 1WM implements VwV
        {
            public final /* synthetic */ MultiGuestV3InternalServiceImpl LIZ;
            
            static {
                Covode.recordClassIndex(8882);
            }
            
            public 1WM(final MultiGuestV3InternalServiceImpl liz) {
                this.LIZ = liz;
            }
            
            public final void onSessionCreate(final VzU lizj) {
                CTM.LIZ((Object)lizj);
                if (lizj.LJII() == 4) {
                    this.LIZ.LIZJ = lizj;
                    this.LIZ.LIZIZ();
                }
            }
            
            public final void onSessionDestroy(final VzU vzU) {
                CTM.LIZ((Object)vzU);
                if (vzU.LJII() == 4) {
                    this.LIZ.LIZJ();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_3        
        //     5: ifnonnull       9
        //     8: return         
        //     9: invokestatic    com/bytedance/android/livesdk/livesetting/linkmic/LinkMicMultiGuestV3ServiceRefactorSetting.getValue:()Z
        //    12: ifne            107
        //    15: aload_0        
        //    16: aload_1        
        //    17: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    20: ldc             Lcom/bytedance/android/livesdk/comp/api/linkcore/api/ILinkMicService;.class
        //    22: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //    25: astore          4
        //    27: aload           4
        //    29: ldc             ""
        //    31: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    34: aload           4
        //    36: checkcast       Lcom/bytedance/android/livesdk/comp/api/linkcore/api/ILinkMicService;
        //    39: astore          4
        //    41: aload_0        
        //    42: aload           4
        //    44: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJFF:Lcom/bytedance/android/livesdk/comp/api/linkcore/api/ILinkMicService;
        //    47: aload           4
        //    49: ifnonnull       57
        //    52: ldc             ""
        //    54: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    57: aload           4
        //    59: invokeinterface com/bytedance/android/livesdk/comp/api/linkcore/api/ILinkMicService.builder:()LX/Vw5;
        //    64: astore          4
        //    66: aload           4
        //    68: ifnonnull       72
        //    71: return         
        //    72: aload           4
        //    74: aload_1        
        //    75: invokeinterface X/Vw5.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)LX/Vw5;
        //    80: pop            
        //    81: aload           4
        //    83: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveAnchorOneVnSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveAnchorOneVnSetting;
        //    86: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveAnchorOneVnSetting.getValue:()I
        //    89: invokeinterface X/Vw5.LIZ:(I)LX/Vw5;
        //    94: pop            
        //    95: aload_0        
        //    96: aload           4
        //    98: aload_3        
        //    99: invokeinterface X/Vw5.LIZ:(Landroid/content/Context;)LX/VwO;
        //   104: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZIZ:LX/VwO;
        //   107: aload_0        
        //   108: new             Ljava/util/HashMap;
        //   111: dup            
        //   112: invokespecial   java/util/HashMap.<init>:()V
        //   115: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZLLL:Ljava/util/Map;
        //   118: aload_0        
        //   119: new             Landroid/util/ArrayMap;
        //   122: dup            
        //   123: invokespecial   android/util/ArrayMap.<init>:()V
        //   126: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJ:Ljava/util/Map;
        //   129: aload_0        
        //   130: iconst_1       
        //   131: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LJIIIIZZ:Z
        //   134: aload_0        
        //   135: getfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZIZ:LX/VwO;
        //   138: astore_1       
        //   139: aload_1        
        //   140: ifnonnull       148
        //   143: ldc             ""
        //   145: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   148: aload_0        
        //   149: aload_1        
        //   150: iconst_4       
        //   151: aload_2        
        //   152: invokeinterface X/VwO.LIZ:(ILjava/lang/String;)LX/VzU;
        //   157: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZJ:LX/VzU;
        //   160: aload_0        
        //   161: invokevirtual   com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZIZ:()V
        //   164: aload_0        
        //   165: getfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl.LIZIZ:LX/VwO;
        //   168: astore_1       
        //   169: aload_1        
        //   170: ifnonnull       178
        //   173: ldc             ""
        //   175: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   178: aload_1        
        //   179: new             LX/1WM;
        //   182: dup            
        //   183: aload_0        
        //   184: invokespecial   X/1WM.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceImpl;)V
        //   187: invokeinterface X/VwO.LIZ:(LX/VwV;)V
        //   192: return         
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
    public FAE<Rlc> invite(final VxG vxG) {
        CTM.LIZ((Object)vxG);
        return (FAE<Rlc>)this.LIZ().LIZ(vxG);
    }
    
    @Override
    public void invite(final VxG vxG, final W1I<Rlc> w1I) {
        CTM.LIZ((Object)vxG);
        this.LIZ().LIZ(vxG, (W1I)w1I);
    }
    
    @Override
    public boolean isRtcEngineOn() {
        return this.LIZ().LJIILL();
    }
    
    @Override
    public boolean isRtcLocked() {
        return this.LIZ().LJIILLIIL();
    }
    
    @Override
    public void joinChannel(final 2P1 2p1, final W1I<Qmq> w1I) {
        CTM.LIZ((Object)2p1);
        this.LIZ().LIZ(2p1, (W1I)w1I);
    }
    
    @Override
    public void kickOut(final RmJ rmJ, final W1I<Qmr> w1I) {
        CTM.LIZ((Object)rmJ);
        this.LIZ().LIZ(rmJ, (W1I)w1I);
    }
    
    @Override
    public VvS layoutManager() {
        return this.LIZ().LJIIIZ();
    }
    
    @Override
    public void leaveChannel(final IlB ilB, final W1I<Ipf> w1I) {
        CTM.LIZ((Object)ilB);
        this.LIZ().LIZ(ilB, (W1I)w1I);
    }
    
    @Override
    public VvO micPositionManager() {
        return this.LIZ().LJIIL();
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void onLinkControlWidgetCreate(final Room room, final Context context) {
        if (LinkMicMultiGuestV3ServiceSessionFix.getValue()) {
            if (room != null) {
                this.LIZ = room;
            }
            if (context != null) {
                this.LJI = new WeakReference<Context>(context);
            }
        }
        if (LinkMicMultiGuestV3ServiceRefactorSetting.getValue() && room != null && context != null) {
            this.LIZ = room;
            final 0Vq liz = 0jR.LIZ((Class<0Vq>)ILinkMicService.class);
            n.LIZIZ((Object)liz, "");
            final ILinkMicService ljff = (ILinkMicService)liz;
            if ((this.LJFF = ljff) == null) {
                n.LIZ("");
            }
            final Vw5 builder = ljff.builder();
            if (builder == null) {
                return;
            }
            builder.LIZ(room);
            builder.LIZ(LiveAnchorOneVnSetting.INSTANCE.getValue());
            this.LIZIZ = builder.LIZ(context);
        }
    }
    
    @Override
    public void onLinkControlWidgetDestroy() {
    }
    
    @Override
    public void permitApply(final VxH vxH, final W1I<RnI> w1I) {
        CTM.LIZ((Object)vxH);
        this.LIZ().LIZ(vxH, (W1I)w1I);
    }
    
    @Override
    public void replyInvite(final PSy pSy, final W1I<RnJ> w1I) {
        CTM.LIZ((Object)pSy);
        if (pSy.LIZJ == 1) {
            Object liz;
            if (!((liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER")) instanceof 1Uo)) {
                liz = null;
            }
            final 1Uo 1Uo = (1Uo)liz;
            if (1Uo != null) {
                1Uo.LJJIIZI = "invite";
            }
        }
        this.LIZ().LIZ(pSy, (W1I)w1I);
    }
    
    @Override
    public W1b rtcManager() {
        return this.LIZ().LJIIJJI();
    }
    
    @Override
    public int scene() {
        return this.LIZ().LJII();
    }
    
    @Override
    public LLU selfLinkInfo() {
        return this.LIZ().LJIIIIZZ();
    }
    
    @Override
    public void sendSeiToSDK(final String s, final SRS<? super L76, 2P9> srs) {
        CTM.LIZ((Object)srs);
        if (this.LIZIZ != null) {
            final VwO liziz = this.LIZIZ;
            if (liziz == null) {
                n.LIZ("");
            }
            liziz.LIZ(s, (SRS)srs);
        }
    }
    
    @Override
    public <T> IMultiGuestV3InternalService subscribe(final Class<T> clazz, final SRT<? super VzU, ? super 1Wh<T>, 2P9> srt) {
        CTM.LIZ((Object)clazz, (Object)srt);
        if (!this.LIZLLL.containsKey(clazz)) {
            this.LIZLLL.put(clazz, new ArrayList<SRT<VzU, 1Wh<?>, 2P9>>());
        }
        if (QgD.LIZ((Object)srt, 2) && srt != null) {
            final List list = this.LIZLLL.get(clazz);
            if (list != null) {
                list.add(srt);
            }
        }
        if (n.LIZ((Object)clazz, (Object)RnQ.class) && QgD.LIZ((Object)srt, 2) && srt != null) {
            if (!this.LJ.containsKey(RnQ.class)) {
                this.LJ.put(RnQ.class, new ArrayList<SRT<VzU, 1Wh<RnQ>, 2P9>>());
            }
            if (QgD.LIZ((Object)srt, 2)) {
                final List list2 = this.LJ.get(RnQ.class);
                if (list2 != null) {
                    list2.add(srt);
                }
            }
        }
        return this;
    }
    
    @Override
    public <T> IMultiGuestV3InternalService unsubscribe(final Class<T> clazz, final SRT<? super VzU, ? super 1Wh<T>, 2P9> srt) {
        CTM.LIZ((Object)clazz, (Object)srt);
        final List list = this.LIZLLL.get(clazz);
        if (list != null) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            QgD.LIZIZ((Object)list).remove(srt);
        }
        return this;
    }
    
    @Override
    public <T> void unsubscribeCreateChannelMsg() {
        if (this.LJ.containsKey(RnQ.class)) {
            final List list = this.LJ.get(RnQ.class);
            if (list != null) {
                list.clear();
            }
        }
    }
    
    @Override
    public void updateLayoutParam(final String s) {
        CTM.LIZ((Object)s);
        this.LIZ().LJI(s);
    }
    
    @Override
    public void updateLiveConfig(final W0N ljii) {
        CTM.LIZ((Object)ljii);
        final W0N ljii2 = this.LJII;
        if (ljii2 == null) {
            n.LIZ("");
        }
        if (n.LIZ((Object)ljii, (Object)ljii2) ^ true) {
            this.LJII = ljii;
            this.LIZ().LJIIJJI().LIZ(ljii);
        }
    }
    
    @Override
    public VvR userManager() {
        return this.LIZ().LJIIJ();
    }
}
