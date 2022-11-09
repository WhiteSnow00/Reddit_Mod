// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import java.util.Objects;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLivePerceptionSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestUserInfoFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestCheckDeviceDelaySetting;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import java.util.Map;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class 1lg extends a
{
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final 1Uo LIZLLL;
    public 24s LJ;
    public Room LJFF;
    public int LJI;
    public DataChannel LJII;
    public int LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public LiveEffect LJIIL;
    public final FH6 LJIILIIL;
    public boolean LJIILJJIL;
    public List<? extends Rl5> LJIILL;
    
    static {
        Covode.recordClassIndex(8497);
    }
    
    public 1lg(final 24s lj, final Room ljff, final boolean ljiiljjil, final List<? extends Rl5> ljiill, final int lji, final DataChannel ljii) {
        this.LJ = lj;
        this.LJFF = ljff;
        this.LJIILJJIL = ljiiljjil;
        this.LJIILL = ljiill;
        this.LJI = lji;
        this.LJII = ljii;
        this.LIZ = 1;
        this.LJIIJ = 2;
        this.LJIIJJI = "";
        this.LJIILIIL = new FH6();
        this.LIZLLL = (1Uo)1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
    }
    
    private final void LJI() {
        final HashMap hashMap = new HashMap();
        final Room ljff = this.LJFF;
        if (ljff != null) {
            String s;
            if (ljff.getStreamType() == Fra.AUDIO) {
                s = "radio";
            }
            else {
                s = "video";
            }
            hashMap.put("room_type", s);
        }
        hashMap.put("audience_connection_type", "voice");
        final Gkn liz = Gkn.LJFF.LIZ("audience_connection_apply");
        liz.LIZ((Map)hashMap);
        liz.LJ("live_detail");
        liz.LIZJ("live");
        liz.LIZLLL("click");
        liz.LIZ();
        liz.LIZLLL();
    }
    
    @Override
    public final int LIZ() {
        return this.LIZ;
    }
    
    @Override
    public final void LIZ(final int liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final 1ZS 1zs) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        final 1NO liz = 1NO.LIZ();
        if (this.LJIILJJIL) {
            final List<? extends Rl5> ljiill = this.LJIILL;
            if (ljiill == null) {
                n.LIZIZ();
            }
            final int liziz = ((Rl5)ljiill.get(this.LJIIIZ)).LIZIZ;
            liz.LJ = true;
            liz.LJFF = liziz;
        }
        else {
            liz.LJ = false;
            liz.LJFF = 0;
        }
        final 1Uo lizlll = this.LIZLLL;
        final int n = 2;
        int lji;
        if (lizlll != null) {
            lji = lizlll.LJI("apply");
        }
        else {
            lji = 2;
        }
        this.LIZ = lji;
        final 1Uo lizlll2 = this.LIZLLL;
        int ljjiffi = n;
        if (lizlll2 != null) {
            ljjiffi = lizlll2.LJJIFFI;
        }
        if (!LiveSdkMultiGuestCheckDeviceDelaySetting.INSTANCE.enableDelay() || (1zs != null && 1zs.LIZJ == 0)) {
            this.LIZIZ(1zs);
            return;
        }
        final b b = (b)super.LJIIIIZZ;
        Context context;
        if (b != null) {
            context = b.getContext();
        }
        else {
            context = null;
        }
        Activity activity;
        if (0sD.LIZJ.LIZ().LIZ(1zs)) {
            if ((activity = 0cT.LIZ(context)) == null) {
                activity = 0jz.LIZIZ().getTopActivity();
            }
        }
        else {
            Object ljiiiizz;
            if (!((ljiiiizz = super.LJIIIIZZ) instanceof MultiGuestUserInfoFragment)) {
                ljiiiizz = null;
            }
            final Fragment fragment = (Fragment)ljiiiizz;
            if (fragment == null) {
                return;
            }
            activity = fragment.getActivity();
        }
        if (activity != null) {
            if (0sD.LIZJ.LIZ().LIZ(1zs)) {
                0uW.LIZJ.LIZ("connection_button");
            }
            else {
                0uW.LIZJ.LIZ("application_pannel");
            }
            0sK.LJ.LIZ(true, 0, activity, (long)ljjiffi, (SRS<? super Integer, 2P9>)new 20B(this, 1zs), (QgG<2P9>)new 20C(this));
        }
    }
    
    @Override
    public final void LIZ(final LiveEffect ljiil) {
        this.LJIIL = ljiil;
    }
    
    @Override
    public final void LIZ(final String s) {
        String ljiijji;
        if (s == null) {
            ljiijji = "";
        }
        else {
            ljiijji = s;
        }
        this.LJIIJJI = ljiijji;
        final 1NO liz = 1NO.LIZ();
        String lizlll = s;
        if (s == null) {
            lizlll = "";
        }
        liz.LIZLLL = lizlll;
    }
    
    @Override
    public final String LIZIZ() {
        return this.LJIIJJI;
    }
    
    @Override
    public final void LIZIZ(final int ljiij) {
        this.LJIIJ = ljiij;
        0jR.LIZ(IHostConfig.class).LIZIZ().LIZ((H2j)GbP.LIVE_INTERACT_BEAUTY_LEVEL, ljiij);
    }
    
    public final boolean LIZIZ(final 1ZS 1zs) {
        public final class 1U6 implements 0sD.a<Ipg>
        {
            public final /* synthetic */ 1lg LIZ;
            public final /* synthetic */ 1ZS LIZIZ;
            
            static {
                Covode.recordClassIndex(8501);
            }
            
            public 1U6(final 1lg liz, final 1ZS liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ(final Vxk vxk, final Throwable t) {
                CTM.LIZ((Object)vxk);
                final 24s lj = this.LIZ.LJ;
                if (lj != null) {
                    final 0qw.b b = (0qw.b)((GK2)lj).LJJIL;
                    if (b != null) {
                        b.LIZ(new 0qw.b.a(t, 0));
                    }
                }
                final 1lg liz = this.LIZ;
                if (0sD.LIZJ.LIZ().LIZ(this.LIZIZ)) {
                    liz.LIZIZ = false;
                    FlV.LIZ(0jz.LIZ().context(), t, 2131835895);
                    0xo.LIZJ("LinkIn_Guest_Apply_Failed", "throwable:".concat(String.valueOf(t)));
                }
                this.LIZ.LIZIZ = false;
                if (this.LIZ.LJIIIIZZ == null) {
                    return;
                }
                final 0qb.b b2 = (0qb.b)this.LIZ.LJIIIIZZ;
                if (b2 != null) {
                    b2.LIZ(t);
                }
                0xo.LIZJ("LinkIn_Guest_Apply_Failed", "throwable:".concat(String.valueOf(t)));
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc_w           "roomId:"
        //     7: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    10: astore_2       
        //    11: aload_0        
        //    12: getfield        X/1lg.LJFF:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    15: astore_3       
        //    16: aconst_null    
        //    17: astore          4
        //    19: aload_3        
        //    20: ifnull          194
        //    23: aload_3        
        //    24: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //    27: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    30: astore_3       
        //    31: aload_2        
        //    32: aload_3        
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    36: pop            
        //    37: aload_2        
        //    38: ldc_w           "; ownerUid:"
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: pop            
        //    45: aload_0        
        //    46: getfield        X/1lg.LJFF:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    49: astore_3       
        //    50: aload_3        
        //    51: ifnull          189
        //    54: aload_3        
        //    55: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //    58: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    61: astore_3       
        //    62: aload_2        
        //    63: aload_3        
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    67: pop            
        //    68: aload_2        
        //    69: ldc_w           "; type:"
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: pop            
        //    76: aload_2        
        //    77: aload_0        
        //    78: getfield        X/1lg.LIZ:I
        //    81: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    84: pop            
        //    85: ldc_w           "LinkIn_Guest_Apply"
        //    88: aload_2        
        //    89: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    92: invokestatic    X/0xo.LIZJ:(Ljava/lang/String;Ljava/lang/String;)V
        //    95: aload_0        
        //    96: getfield        X/1lg.LJFF:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    99: astore_3       
        //   100: aload_3        
        //   101: ifnull          287
        //   104: aload_3        
        //   105: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   108: lstore          5
        //   110: aload_0        
        //   111: getfield        X/1lg.LIZ:I
        //   114: i2l            
        //   115: lstore          7
        //   117: getstatic       X/1Za.LJIIJ:LX/0ut;
        //   120: invokevirtual   X/0ut.LIZ:()LX/0us;
        //   123: astore_3       
        //   124: aload_3        
        //   125: ifnull          183
        //   128: aload_3        
        //   129: invokeinterface X/0us.LIZIZ:()I
        //   134: istore          9
        //   136: aload           4
        //   138: astore_3       
        //   139: aload_1        
        //   140: ifnull          151
        //   143: aload_1        
        //   144: getfield        X/1ZS.LIZLLL:Z
        //   147: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   150: astore_3       
        //   151: new             Lcom/bytedance/android/livesdk/chatroom/model/multiguestv3/BizApplyParams;
        //   154: dup            
        //   155: lload           7
        //   157: lload           5
        //   159: iload           9
        //   161: aload_3        
        //   162: invokestatic    X/GTi.LIZ:(Ljava/lang/Boolean;)Z
        //   165: invokespecial   com/bytedance/android/livesdk/chatroom/model/multiguestv3/BizApplyParams.<init>:(JJIZ)V
        //   168: astore_3       
        //   169: getstatic       X/0b5.LIZIZ:Lcom/google/gson/Gson;
        //   172: aload_3        
        //   173: invokevirtual   com/google/gson/Gson.LIZIZ:(Ljava/lang/Object;)Ljava/lang/String;
        //   176: astore_3       
        //   177: aload_3        
        //   178: ifnonnull       199
        //   181: iconst_1       
        //   182: ireturn        
        //   183: iconst_0       
        //   184: istore          9
        //   186: goto            136
        //   189: aconst_null    
        //   190: astore_3       
        //   191: goto            62
        //   194: aconst_null    
        //   195: astore_3       
        //   196: goto            31
        //   199: getstatic       X/0sD.LIZJ:LX/0sC;
        //   202: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   205: invokevirtual   X/0sD.LIZ:()LX/0s9;
        //   208: astore_2       
        //   209: aload_2        
        //   210: ifnull          275
        //   213: aload_1        
        //   214: ifnull          281
        //   217: aload_1        
        //   218: getfield        X/1ZS.LIZ:Ljava/lang/Integer;
        //   221: astore          4
        //   223: aload           4
        //   225: ifnull          281
        //   228: aload           4
        //   230: invokevirtual   java/lang/Integer.intValue:()I
        //   233: istore          9
        //   235: aload_2        
        //   236: new             LX/Rlf;
        //   239: dup            
        //   240: lconst_0       
        //   241: lconst_0       
        //   242: iload           9
        //   244: lconst_0       
        //   245: getstatic       X/0sD.LIZJ:LX/0sC;
        //   248: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   251: aload_3        
        //   252: invokevirtual   X/0sD.LIZJ:(Ljava/lang/String;)Ljava/util/Map;
        //   255: aconst_null    
        //   256: bipush          67
        //   258: invokespecial   X/Rlf.<init>:(JJIJLjava/util/Map;Ljava/util/Map;I)V
        //   261: new             LX/1U6;
        //   264: dup            
        //   265: aload_0        
        //   266: aload_1        
        //   267: invokespecial   X/1U6.<init>:(LX/1lg;LX/1ZS;)V
        //   270: invokeinterface X/0s9.LIZ:(LX/Rlf;LX/0sB;)V
        //   275: aload_0        
        //   276: invokespecial   X/1lg.LJI:()V
        //   279: iconst_0       
        //   280: ireturn        
        //   281: iconst_m1      
        //   282: istore          9
        //   284: goto            235
        //   287: iconst_1       
        //   288: ireturn        
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
    public final ImageModel LIZJ() {
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        final 0W5 liz = liziz.LIZ();
        n.LIZIZ((Object)liz, "");
        return liz.getAvatarThumb();
    }
    
    @Override
    public final boolean LIZLLL() {
        return this.LJIILJJIL;
    }
    
    @Override
    public final void LJ() {
        public final class 1U5 implements 0sD.a<RnJ>
        {
            public final /* synthetic */ 1lg LIZ;
            public final /* synthetic */ boolean LIZIZ;
            
            static {
                Covode.recordClassIndex(8500);
            }
            
            public 1U5(final 1lg liz) {
                this.LIZ = liz;
                this.LIZIZ = true;
            }
            
            @Override
            public final void LIZ(final Vxk vxk, final Throwable t) {
                CTM.LIZ((Object)vxk);
                this.LIZ.LIZJ = false;
                if (t instanceof 1Ev) {
                    final 0qb.b b = (0qb.b)this.LIZ.LJIIIIZZ;
                    if (b != null) {
                        b.LIZIZ(t);
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1lg.LJFF:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //     4: ifnull          14
        //     7: aload_0        
        //     8: getfield        X/1lg.LIZJ:Z
        //    11: ifeq            15
        //    14: return         
        //    15: aload_0        
        //    16: getfield        X/1lg.LIZLLL:LX/1Uo;
        //    19: astore_1       
        //    20: aload_1        
        //    21: ifnull          179
        //    24: aload_1        
        //    25: ldc_w           "reply"
        //    28: invokevirtual   X/1Uo.LJI:(Ljava/lang/String;)I
        //    31: istore_2       
        //    32: aload_0        
        //    33: iload_2        
        //    34: putfield        X/1lg.LIZ:I
        //    37: invokestatic    X/1NO.LIZ:()LX/1NO;
        //    40: aload_0        
        //    41: getfield        X/1lg.LJIIJ:I
        //    44: putfield        X/1NO.LIZIZ:I
        //    47: invokestatic    X/1NO.LIZ:()LX/1NO;
        //    50: aload_0        
        //    51: getfield        X/1lg.LJIIL:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //    54: putfield        X/1NO.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //    57: invokestatic    X/1NO.LIZ:()LX/1NO;
        //    60: aload_0        
        //    61: getfield        X/1lg.LJIIJJI:Ljava/lang/String;
        //    64: putfield        X/1NO.LIZLLL:Ljava/lang/String;
        //    67: aload_0        
        //    68: iconst_1       
        //    69: putfield        X/1lg.LIZIZ:Z
        //    72: new             Lcom/bytedance/android/livesdk/chatroom/model/multiguestv3/BizReplyParams;
        //    75: dup            
        //    76: aload_0        
        //    77: getfield        X/1lg.LIZ:I
        //    80: i2l            
        //    81: iconst_2       
        //    82: iconst_0       
        //    83: invokespecial   com/bytedance/android/livesdk/chatroom/model/multiguestv3/BizReplyParams.<init>:(JIB)V
        //    86: astore_1       
        //    87: getstatic       X/0b5.LIZIZ:Lcom/google/gson/Gson;
        //    90: aload_1        
        //    91: invokevirtual   com/google/gson/Gson.LIZIZ:(Ljava/lang/Object;)Ljava/lang/String;
        //    94: astore_1       
        //    95: aload_0        
        //    96: getfield        X/1lg.LJFF:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    99: astore_3       
        //   100: aload_3        
        //   101: ifnull          14
        //   104: aload_3        
        //   105: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   108: lstore          4
        //   110: aload_3        
        //   111: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   114: lstore          6
        //   116: getstatic       X/0sD.LIZJ:LX/0sC;
        //   119: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   122: astore_3       
        //   123: aload_1        
        //   124: ldc             ""
        //   126: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   129: new             LX/PSy;
        //   132: dup            
        //   133: lload           4
        //   135: lload           6
        //   137: iconst_1       
        //   138: aload_3        
        //   139: aload_1        
        //   140: invokevirtual   X/0sD.LIZJ:(Ljava/lang/String;)Ljava/util/Map;
        //   143: invokespecial   X/PSy.<init>:(JJILjava/util/Map;)V
        //   146: astore_1       
        //   147: getstatic       X/0sD.LIZJ:LX/0sC;
        //   150: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   153: invokevirtual   X/0sD.LIZ:()LX/0s9;
        //   156: astore_3       
        //   157: aload_3        
        //   158: ifnull          14
        //   161: aload_3        
        //   162: aload_1        
        //   163: new             LX/1U5;
        //   166: dup            
        //   167: aload_0        
        //   168: invokespecial   X/1U5.<init>:(LX/1lg;)V
        //   171: invokeinterface X/0s9.LIZ:(LX/PSy;LX/0sB;)V
        //   176: goto            14
        //   179: iconst_2       
        //   180: istore_2       
        //   181: goto            32
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
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
    public final void h_() {
        super.h_();
        this.LJIILIIL.LIZ();
    }
}
