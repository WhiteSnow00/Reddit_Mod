// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostShare;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveInviteFriendFreqCtrl;
import java.util.List;
import android.app.Activity;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorOneVnSetting;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.slot.ISlotService;
import kotlin.jvm.internal.n;
import java.util.Map;
import java.util.LinkedHashMap;
import com.bytedance.covode.number.Covode;
import android.app.Dialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Set;

@0kX(LIZ = "DATA_MULTI_LIVE_INVITER_SHARE_HELPER")
public final class 1Yj implements 0tW
{
    public static final /* synthetic */ SRC[] LIZ;
    public static final a LJI;
    public final Set<Long> LIZIZ;
    public final Room LIZJ;
    public final 1nL LIZLLL;
    public final DataChannel LJ;
    public boolean LJFF;
    public Dialog LJII;
    public Fra LJIIIIZZ;
    public boolean LJIIIZ;
    public final FH6 LJIIJ;
    public final 5DO LJIIJJI;
    public final 5DO LJIIL;
    public final 0kU LJIILIIL;
    public boolean LJIILJJIL;
    
    static {
        Covode.recordClassIndex(9349);
        LIZ = new SRC[] { (SRC)new SRK((Class)1Yj.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguest/opt/business/MultiGuestDataHolder;", 0) };
        LJI = new a((byte)0);
    }
    
    public 1Yj(final Room lizj, final 1nL lizlll, final DataChannel lj, final boolean ljiiljjil) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload_3        
        //     3: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        X/1Yj.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    15: aload_0        
        //    16: aload_2        
        //    17: putfield        X/1Yj.LIZLLL:LX/1nL;
        //    20: aload_0        
        //    21: aload_3        
        //    22: putfield        X/1Yj.LJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    25: aload_0        
        //    26: iload           4
        //    28: putfield        X/1Yj.LJIILJJIL:Z
        //    31: iconst_1       
        //    32: istore          4
        //    34: aload_0        
        //    35: iconst_1       
        //    36: putfield        X/1Yj.LJFF:Z
        //    39: aload_0        
        //    40: getstatic       X/Fra.VIDEO:LX/Fra;
        //    43: putfield        X/1Yj.LJIIIIZZ:LX/Fra;
        //    46: aload_0        
        //    47: iconst_1       
        //    48: putfield        X/1Yj.LJIIIZ:Z
        //    51: aload_0        
        //    52: new             LX/FH6;
        //    55: dup            
        //    56: invokespecial   X/FH6.<init>:()V
        //    59: putfield        X/1Yj.LJIIJ:LX/FH6;
        //    62: aload_0        
        //    63: getstatic       X/25L.LIZ:LX/25L;
        //    66: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    69: putfield        X/1Yj.LJIIJJI:LX/5DO;
        //    72: aload_0        
        //    73: new             Ljava/util/LinkedHashSet;
        //    76: dup            
        //    77: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    80: putfield        X/1Yj.LIZIZ:Ljava/util/Set;
        //    83: aload_0        
        //    84: getstatic       X/25K.LIZ:LX/25K;
        //    87: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    90: putfield        X/1Yj.LJIIL:LX/5DO;
        //    93: aload_0        
        //    94: new             LX/0kU;
        //    97: dup            
        //    98: ldc             "MULTI_GUEST_DATA_HOLDER"
        //   100: invokespecial   X/0kU.<init>:(Ljava/lang/String;)V
        //   103: putfield        X/1Yj.LJIILIIL:LX/0kU;
        //   106: aload_3        
        //   107: ldc             LX/G6q;.class
        //   109: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   112: checkcast       LX/Fra;
        //   115: astore_2       
        //   116: aload_2        
        //   117: astore_1       
        //   118: aload_2        
        //   119: ifnonnull       126
        //   122: getstatic       X/Fra.VIDEO:LX/Fra;
        //   125: astore_1       
        //   126: aload_0        
        //   127: aload_1        
        //   128: putfield        X/1Yj.LJIIIIZZ:LX/Fra;
        //   131: aload_3        
        //   132: ldc             LX/G6l;.class
        //   134: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   137: checkcast       Ljava/lang/Boolean;
        //   140: astore_1       
        //   141: aload_1        
        //   142: ifnull          151
        //   145: aload_1        
        //   146: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   149: istore          4
        //   151: aload_0        
        //   152: iload           4
        //   154: putfield        X/1Yj.LJIIIZ:Z
        //   157: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
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
    
    private final GKo LIZ(final boolean b, String ljiiiizz) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(Gkn.LJFF.LIZ("").LJFF());
        final Room lizj = this.LIZJ;
        final DataChannel lj = this.LJ;
        final boolean b2 = false;
        final String s = "multilive_invite";
        String s2;
        if (b) {
            final User owner = lizj.getOwner();
            CTM.LIZ((Object)"multilive_invite");
            s2 = GCz.LIZ(owner);
            if (s2.length() != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s2);
                sb.append("&share_live_intent=");
                sb.append("multilive_invite");
                s2 = sb.toString();
            }
        }
        else {
            s2 = GCz.LIZ(lizj.getOwner());
        }
        final GKn liz = GCz.LIZ(lizj, lj, s2, ljiiiizz, (Map)linkedHashMap);
        liz.LJJIJLIJ = this.LJIIIZ;
        if (b) {
            ljiiiizz = s;
        }
        else {
            ljiiiizz = "";
        }
        liz.LJJJIL = ljiiiizz;
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean b3 = b2;
        if (this.LIZJ.mRoomAuthStatus != null) {
            final RoomAuthStatus mRoomAuthStatus = this.LIZJ.mRoomAuthStatus;
            n.LIZIZ((Object)mRoomAuthStatus, "");
            b3 = b2;
            if (mRoomAuthStatus.isEnablePromote()) {
                b3 = true;
            }
        }
        linkedHashMap2.put("param_broadcast_room_auth_promote_bool", b3);
        final ISlotService liz2 = 0jR.LIZ(ISlotService.class);
        n.LIZIZ((Object)liz2, "");
        liz.LIZ(liz2.getLiveShareSheetAction((Map)linkedHashMap2, EiA.SLOT_BROADCAST_SHARE));
        final 0Vq liz3 = 0jR.LIZ((Class<0Vq>)IShareService.class);
        n.LIZIZ((Object)liz3, "");
        liz.LIZ(((IShareService)liz3).provideLiveSheetActions(this.LJIIIIZZ, this.LIZJ, this.LJ, true));
        ljiiiizz = null;
        if (FkZ.LIZIZ(this.LJ) != null) {
            final AdLiveEnterRoomConfig liziz = FkZ.LIZIZ(this.LJ);
            if (liziz == null) {
                n.LIZIZ();
            }
            ljiiiizz = liziz.LJIIIIZZ;
        }
        liz.LJJIJIIJI = ljiiiizz;
        liz.LJJIJL = FkZ.LIZ(this.LJ);
        final 0Vq liz4 = 0jR.LIZ((Class<0Vq>)IUserManageService.class);
        n.LIZIZ((Object)liz4, "");
        liz.LJJIJIL = ((IUserManageService)liz4).getReportScene();
        liz.LIZ("show_cancel", Boolean.valueOf(this.LJIIIZ));
        liz.LIZ("layout_scene_version", String.valueOf(LiveAnchorOneVnSetting.INSTANCE.getValue()));
        final GKo liz5 = liz.LIZ();
        n.LIZIZ((Object)liz5, "");
        return liz5;
    }
    
    private final 2Tq LJ() {
        return (2Tq)this.LJIIL.getValue();
    }
    
    @Override
    public final void LIZ() {
        if (!GKz.LIZ()) {
            return;
        }
        final GKo liz = this.LIZ(true, "invitation_plus");
        final 1Yf 1Yf = new 1Yf(liz);
        final 0Vq liz2 = 0jR.LIZ((Class<0Vq>)IShareService.class);
        n.LIZIZ((Object)liz2, "");
        final Boolean liz3 = ((IShareService)liz2).share().LIZ();
        n.LIZIZ((Object)liz3, "");
        if (liz3) {
            final 0Vq liz4 = 0jR.LIZ((Class<0Vq>)IShareService.class);
            n.LIZIZ((Object)liz4, "");
            ((IShareService)liz4).share().LIZJ((Activity)this.LIZLLL, liz, (Jz6)1Yf);
        }
        else {
            final Dialog ljii = this.LJII;
            if (ljii != null && ljii.isShowing()) {
                final Dialog ljii2 = this.LJII;
                if (ljii2 != null) {
                    ljii2.dismiss();
                }
            }
            final IShareService liz5 = 0jR.LIZ(IShareService.class);
            n.LIZIZ((Object)liz5, "");
            final Dialog liziz = liz5.share().LIZIZ((Activity)this.LIZLLL, liz, (Jz6)1Yf);
            if ((this.LJII = liziz) != null) {
                GTi.LIZ(liziz);
            }
        }
        final 44V lllz = GST.LLLZ;
        n.LIZIZ((Object)lllz, "");
        if (!(boolean)((44T)lllz).LIZ()) {
            Hf4.LIZ(0cB.LJ(), 2131831257);
            final 44V lllz2 = GST.LLLZ;
            n.LIZIZ((Object)lllz2, "");
            ((44T)lllz2).LIZ((Object)true);
        }
    }
    
    @Override
    public final void LIZ(final long n, final boolean b, final QgG<2P9> qgG, final SRS<? super Long, 2P9> srs) {
        public final class 1Yg<T> implements 2d6
        {
            public final /* synthetic */ 1Yj LIZ;
            public final /* synthetic */ boolean LIZIZ;
            public final /* synthetic */ long LIZJ;
            public final /* synthetic */ SRS LIZLLL;
            
            static {
                Covode.recordClassIndex(9352);
            }
            
            public 1Yg(final 1Yj liz, final boolean liziz, final long lizj, final SRS lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload           5
        //     4: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     7: aload_0        
        //     8: invokespecial   X/1Yj.LJ:()LX/2Tq;
        //    11: invokevirtual   X/2Tq.LIZ:()Z
        //    14: ifeq            27
        //    17: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //    20: ldc_w           2131830583
        //    23: invokestatic    X/Hf4.LIZ:(Landroid/content/Context;I)V
        //    26: return         
        //    27: aload           4
        //    29: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //    34: pop            
        //    35: aload_0        
        //    36: invokespecial   X/1Yj.LJ:()LX/2Tq;
        //    39: invokevirtual   X/2Tq.LIZIZ:()V
        //    42: ldc_w           Lcom/bytedance/android/livesdkapi/host/IHostShare;.class
        //    45: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //    48: astore          4
        //    50: aload           4
        //    52: ldc             ""
        //    54: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    57: aload           4
        //    59: checkcast       Lcom/bytedance/android/livesdkapi/host/IHostShare;
        //    62: aload_0        
        //    63: getfield        X/1Yj.LIZLLL:LX/1nL;
        //    66: lload_1        
        //    67: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    70: aload_0        
        //    71: iload_3        
        //    72: ldc_w           "invitation_tab_friends"
        //    75: invokespecial   X/1Yj.LIZ:(ZLjava/lang/String;)LX/GKo;
        //    78: new             LX/1Yg;
        //    81: dup            
        //    82: aload_0        
        //    83: iload_3        
        //    84: lload_1        
        //    85: aload           5
        //    87: invokespecial   X/1Yg.<init>:(LX/1Yj;ZJLX/SRS;)V
        //    90: invokeinterface com/bytedance/android/livesdkapi/host/IHostShare.shareSingleMessage:(Landroid/app/Activity;Ljava/lang/String;LX/GKo;LX/2d6;)V
        //    95: return         
        //    Signature:
        //  (JZLX/QgG<LX/2P9;>;LX/SRS<-Ljava/lang/Long;LX/2P9;>;)V
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
    
    public final void LIZ(final List<Long> list, final long n) {
        public final class 1Yi<T> implements 2d6
        {
            public final /* synthetic */ 1Yj LIZ;
            
            static {
                Covode.recordClassIndex(9357);
            }
            
            public 1Yi(final 1Yj liz) {
                this.LIZ = liz;
            }
        }
        public final class 1Yh<T> implements 2d6
        {
            public final /* synthetic */ 1Yj LIZ;
            
            static {
                Covode.recordClassIndex(9356);
            }
            
            public 1Yh(final 1Yj liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface java/util/List.isEmpty:()Z
        //     6: ifeq            10
        //     9: return         
        //    10: new             Ljava/util/LinkedHashMap;
        //    13: dup            
        //    14: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    17: astore          4
        //    19: aload_0        
        //    20: getfield        X/1Yj.LJFF:Z
        //    23: ifeq            59
        //    26: aload_0        
        //    27: getfield        X/1Yj.LJIILJJIL:Z
        //    30: invokestatic    X/0sM.LIZ:(Z)Ljava/lang/Long;
        //    33: astore          5
        //    35: aload           5
        //    37: ifnull          59
        //    40: aload           4
        //    42: ldc_w           "channel_id"
        //    45: aload           5
        //    47: invokevirtual   java/lang/Number.longValue:()J
        //    50: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    53: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    58: pop            
        //    59: aload_0        
        //    60: getfield        X/1Yj.LJIIJ:LX/FH6;
        //    63: invokestatic    X/0yr.LIZ:()LX/0yr;
        //    66: ldc_w           Lcom/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi;.class
        //    69: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    72: checkcast       Lcom/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi;
        //    75: lload_2        
        //    76: aload_1        
        //    77: ldc_w           ","
        //    80: ldc_w           "["
        //    83: ldc_w           "]"
        //    86: iconst_0       
        //    87: aconst_null    
        //    88: aconst_null    
        //    89: bipush          56
        //    91: invokestatic    X/Qsi.LIZ:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LX/SRS;I)Ljava/lang/String;
        //    94: aload           4
        //    96: invokeinterface com/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi.sendMultiLiveShareInvitation:(JLjava/lang/String;Ljava/util/Map;)LX/FBF;
        //   101: getstatic       X/FGw.LIZJ:LX/FFV;
        //   104: invokestatic    X/FAr.LIZIZ:(LX/FFV;)LX/FFV;
        //   107: invokevirtual   X/FBF.LIZIZ:(LX/FFV;)LX/FBF;
        //   110: getstatic       X/F8V.LIZ:LX/FFV;
        //   113: invokestatic    X/F8U.LIZ:(LX/FFV;)LX/FFV;
        //   116: invokevirtual   X/FBF.LIZ:(LX/FFV;)LX/FBF;
        //   119: new             LX/1Yh;
        //   122: dup            
        //   123: aload_0        
        //   124: invokespecial   X/1Yh.<init>:(LX/1Yj;)V
        //   127: new             LX/1Yi;
        //   130: dup            
        //   131: aload_0        
        //   132: invokespecial   X/1Yi.<init>:(LX/1Yj;)V
        //   135: invokevirtual   X/FBF.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   138: invokevirtual   X/FH6.LIZ:(LX/2fc;)Z
        //   141: pop            
        //   142: return         
        //    Signature:
        //  (Ljava/util/List<Ljava/lang/Long;>;J)V
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
    
    @Override
    public final void LIZIZ() {
        this.LJIIJ.LIZ();
        this.LJ().LIZ.clear();
        this.LIZJ().removeCallbacksAndMessages((Object)null);
        this.LIZIZ.clear();
    }
    
    public final Handler LIZJ() {
        return (Handler)this.LJIIJJI.getValue();
    }
    
    public final 1Uo LIZLLL() {
        return this.LJIILIIL.LIZ(this, 1Yj.LIZ[0]);
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(9350);
        }
        
        public final 0tW LIZ() {
            return 1jw.LIZ.LIZIZ("DATA_MULTI_LIVE_INVITER_SHARE_HELPER");
        }
        
        public final 0tW LIZ(final Room room, final 1nL 1nL, final DataChannel dataChannel, final boolean b) {
            if (room == null) {
                return null;
            }
            if (1nL == null) {
                return null;
            }
            if (dataChannel == null) {
                return null;
            }
            final 1Yj 1Yj = new 1Yj(room, 1nL, dataChannel, b, (byte)0);
            0kT.a.LIZ(1jw.LIZ, 1Yj);
            return 1Yj;
        }
    }
}
