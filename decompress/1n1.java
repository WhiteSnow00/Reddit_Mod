// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.app.Dialog;
import android.view.Window;
import android.widget.FrameLayout;
import android.os.Bundle;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.UserAttr;
import java.util.HashMap;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.usermanage.IUserManageService;
import android.view.ViewGroup;
import android.view.LayoutInflater$Factory;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.live.base.model.user.User;
import android.view.View$OnClickListener;

public final class 1n1 extends GJI implements View$OnClickListener, a, GDN, GD4
{
    public User LIZ;
    public final Room LIZIZ;
    public final boolean LIZJ;
    public final H31 LIZLLL;
    public final 0W5 LJ;
    public final 1eh LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final boolean LJIIJJI;
    public View LJIIL;
    public View LJIILIIL;
    public View LJIILJJIL;
    public final Context LJIILL;
    public final 10b LJIILLIIL;
    public final String LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final String LJIJJ;
    public final Map<String, String> LJIJJLI;
    public final QgG<2P9> LJIL;
    public final QgG<2P9> LJJ;
    public final 0AB LJJI;
    public final QgG<2P9> LJJIFFI;
    
    static {
        Covode.recordClassIndex(10765);
    }
    
    public 1n1(final Context context, final User user, final Room room, final boolean b, final H31 h31, final 0W5 0w5, final 10b 10b, final String s, final boolean b2, final String s2, final Map<String, String> map, final QgG<2P9> qgG, final 0AB 0ab, final byte b3) {
        this(context, user, room, b, h31, 0w5, 10b, s, b2, s2, map, qgG, 0ab);
    }
    
    public 1n1(final Context ljiill, final User liz, final Room liziz, final boolean lizj, final H31 lizlll, final 0W5 lj, final 10b ljiilliil, final String ljiizilj, final boolean ljij, final boolean ljiji, final String ljijj, final Map<String, String> ljijjli, final QgG<2P9> ljil, final QgG<2P9> ljj, final 0AB ljji, final QgG<2P9> ljjiffi) {
        CTM.LIZ((Object)ljiill, (Object)liz, (Object)liziz, (Object)lizlll, (Object)ljiilliil, (Object)ljijj);
        final boolean b = true;
        super(ljiill, true);
        this.LJIILL = ljiill;
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJIILLIIL = ljiilliil;
        this.LJIIZILJ = ljiizilj;
        this.LJIJ = ljij;
        this.LJIJI = ljiji;
        this.LJIJJ = ljijj;
        this.LJIJJLI = ljijjli;
        this.LJIL = ljil;
        this.LJJ = ljj;
        this.LJJI = ljji;
        this.LJJIFFI = ljjiffi;
        final 1eh ljiiiizz = new 1eh();
        ljiiiizz.LIZ((GFD)this);
        this.LJIIIIZZ = ljiiiizz;
        final long id = this.LIZ.getId();
        final GIK liziz2 = Fk2.LIZ().LIZIZ();
        long lizj2;
        if (liziz2 != null) {
            lizj2 = liziz2.LIZJ();
        }
        else {
            lizj2 = 0L;
        }
        this.LJIIJJI = (id == lizj2 && b);
    }
    
    public static View LIZ(final LayoutInflater layoutInflater) {
        MethodCollector.i(9981);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(2131561847, (ViewGroup)null);
                MethodCollector.o(9981);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(2131561847, (ViewGroup)null);
        MethodCollector.o(9981);
        return inflate2;
    }
    
    private final void LIZIZ(final boolean b) {
        final boolean lizj = this.LIZJ;
        final 2fc 2fc = null;
        Boolean value = null;
        int visibility = 8;
        if (!lizj || this.LJIIJJI || this.LJIIJ) {
            final 1JF 1jf = (1JF)((Dialog)this).findViewById(2131361916);
            if (1jf != null) {
                1jf.setVisibility(0);
            }
            final View viewById = ((Dialog)this).findViewById(2131368000);
            if (viewById != null) {
                viewById.setVisibility(8);
            }
            final 1Ih 1Ih = (1Ih)((Dialog)this).findViewById(2131370385);
            if (1Ih != null) {
                int visibility2;
                if (!this.LJIIJJI) {
                    visibility2 = 0;
                }
                else {
                    visibility2 = 8;
                }
                1Ih.setVisibility(visibility2);
            }
            final 1Ih 1Ih2 = (1Ih)((Dialog)this).findViewById(2131367256);
            if (1Ih2 != null) {
                int visibility3;
                if (this.LIZJ && !this.LJIIJJI) {
                    visibility3 = 0;
                }
                else {
                    visibility3 = 8;
                }
                1Ih2.setVisibility(visibility3);
            }
            final boolean b2 = this.LIZIZ.getOwnerUserId() == this.LIZ.getId();
            while (true) {
                Label_0367: {
                    if (!this.LIZJ) {
                        if (!0jR.LIZ(IUserManageService.class).hasAdminMutePermission()) {
                            break Label_0367;
                        }
                        final UserAttr userAttr = this.LIZ.getUserAttr();
                        if (userAttr != null) {
                            value = userAttr.LIZIZ;
                        }
                        if (!GTi.LIZJ(value) || !GTi.LIZJ(Boolean.valueOf(b2))) {
                            break Label_0367;
                        }
                    }
                    if (this.LJIIJJI) {
                        break Label_0367;
                    }
                    final int n = 1;
                    final 1Ih 1Ih3 = (1Ih)((Dialog)this).findViewById(2131368498);
                    if (1Ih3 != null) {
                        if (n != 0) {
                            visibility = 0;
                        }
                        1Ih3.setVisibility(visibility);
                    }
                    if (n != 0) {
                        final 1Ih 1Ih4 = (1Ih)((Dialog)this).findViewById(2131368498);
                        if (1Ih4 != null) {
                            final UserAttr userAttr2 = this.LIZ.getUserAttr();
                            int n2;
                            if (userAttr2 != null && userAttr2.LIZ) {
                                n2 = 2131829317;
                            }
                            else {
                                n2 = 2131829311;
                            }
                            1Ih4.setText(0cB.LIZ(n2));
                        }
                    }
                    final String liz = 0W3.LIZ(this.LIZ);
                    final 1Ih 1Ih5 = (1Ih)((Dialog)this).findViewById(2131370357);
                    if (1Ih5 != null) {
                        1Ih5.setText(0cB.LIZ(2131829312, liz));
                    }
                    return;
                }
                final int n = 0;
                continue;
            }
        }
        final String s = "";
        if (b) {
            final 1JF 1jf2 = (1JF)((Dialog)this).findViewById(2131361916);
            if (1jf2 != null) {
                1jf2.setVisibility(8);
            }
            final View viewById2 = ((Dialog)this).findViewById(2131368000);
            if (viewById2 != null) {
                viewById2.setVisibility(0);
            }
            final View ljiiliil = this.LJIILIIL;
            if (ljiiliil == null) {
                n.LIZ("");
            }
            ljiiliil.setVisibility(8);
            final View ljiil = this.LJIIL;
            if (ljiil == null) {
                n.LIZ("");
            }
            ljiil.setVisibility(0);
            return;
        }
        final 1JF 1jf3 = (1JF)((Dialog)this).findViewById(2131361916);
        if (1jf3 != null) {
            1jf3.setVisibility(8);
        }
        final View viewById3 = ((Dialog)this).findViewById(2131368000);
        if (viewById3 != null) {
            viewById3.setVisibility(0);
        }
        final View ljiiliil2 = this.LJIILIIL;
        if (ljiiliil2 == null) {
            n.LIZ("");
        }
        ljiiliil2.setVisibility(0);
        final View ljiil2 = this.LJIIL;
        if (ljiil2 == null) {
            n.LIZ("");
        }
        ljiil2.setVisibility(8);
        final HashMap hashMap = new HashMap();
        hashMap.put("target_uid", String.valueOf(this.LIZ.getId()));
        final GIK liziz = Fk2.LIZ().LIZIZ();
        String liz2;
        if (liziz == null || (liz2 = liziz.LIZ(this.LIZ.getId())) == null) {
            liz2 = "";
        }
        hashMap.put("sec_target_uid", liz2);
        hashMap.put("packed_level", "2");
        hashMap.put("current_room_id", String.valueOf(this.LIZIZ.getId()));
        hashMap.put("request_from", "admin");
        final User owner = this.LIZIZ.getOwner();
        String value2;
        if (owner == null || (value2 = String.valueOf(owner.getId())) == null) {
            value2 = "0";
        }
        hashMap.put("anchor_id", value2);
        final GIK liziz2 = Fk2.LIZ().LIZIZ();
        String liz3 = s;
        if (liziz2 != null) {
            liz3 = liziz2.LIZ(this.LIZIZ.getOwnerUserId());
            if (liz3 == null) {
                liz3 = s;
            }
        }
        hashMap.put("sec_anchor_id", liz3);
        final 1eh ljiiiizz = this.LJIIIIZZ;
        CTM.LIZ((Object)hashMap);
        final GIK liziz3 = Fk2.LIZ().LIZIZ();
        2fc liz4 = 2fc;
        if (liziz3 != null) {
            final FAE liz5 = liziz3.LIZ(hashMap);
            liz4 = 2fc;
            if (liz5 != null) {
                final FAE liz6 = liz5.LIZ(F8U.LIZ(F8V.LIZ));
                liz4 = 2fc;
                if (liz6 != null) {
                    liz4 = liz6.LIZ((2d6)new 1ef(ljiiiizz), (2d6)new 1eg(ljiiiizz));
                }
            }
        }
        ljiiiizz.LIZ = liz4;
    }
    
    public final void LIZ() {
        if (this.LJJI == null) {
            return;
        }
        final H31 lizlll = this.LIZLLL;
        String liziz;
        if (lizlll instanceof ChatMessage) {
            liziz = ((ChatMessage)lizlll).LIZIZ;
        }
        else {
            liziz = "";
        }
        final IAdminSettingService adminSettingService = 0jR.LIZ(IAdminSettingService.class);
        final long id = this.LIZIZ.getId();
        n.LIZIZ((Object)liziz, "");
        adminSettingService.checkFastAddBlockKeywordsDialog(id, liziz, this.LJJI, "LiveFastAddBlockKeywordsDialog");
    }
    
    public final void LIZ(final 0W5 0w5) {
        if (!this.LJIIIZ) {
            return;
        }
        if (0w5 == null || 0w5.getId() <= 0L) {
            new IllegalArgumentException("User is invalid");
            this.LIZIZ();
            return;
        }
        final User from = User.from(0w5);
        if (from != null) {
            this.LIZ = from;
            this.LJIIJ = true;
            this.LIZIZ(false);
            return;
        }
        new IllegalArgumentException("User is invalid");
        this.LIZIZ();
    }
    
    public final void LIZ(final GDP gdp, final Exception ex) {
    }
    
    public final void LIZ(final Exception ex) {
        if (!this.LJIIIZ) {
            return;
        }
        FlV.LIZ(this.LJIILL, (Throwable)ex, 2131835950);
    }
    
    public final void LIZ(final String s) {
        public final class 1ed<T> implements 2d6
        {
            public final /* synthetic */ 1n1 LIZ;
            public final /* synthetic */ String LIZIZ;
            
            static {
                Covode.recordClassIndex(10770);
            }
            
            public 1ed(final 1n1 liz, final String liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //     5: checkcast       Lcom/bytedance/android/live/usermanage/IUserManageService;
        //     8: invokeinterface com/bytedance/android/live/usermanage/IUserManageService.getMuteDuration:()LX/FAE;
        //    13: new             LX/1ed;
        //    16: dup            
        //    17: aload_0        
        //    18: aload_1        
        //    19: invokespecial   X/1ed.<init>:(LX/1n1;Ljava/lang/String;)V
        //    22: invokevirtual   X/FAE.LJ:(LX/2d6;)LX/2fc;
        //    25: pop            
        //    26: return         
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
    
    public final void LIZ(final boolean b) {
        this.LIZ();
        if (!this.LJIIIZ) {
            return;
        }
        this.LIZIZ(false);
    }
    
    public final void LIZIZ() {
        if (!this.LJIIIZ) {
            return;
        }
        this.LJIIJ = false;
        this.LIZIZ(true);
    }
    
    public final void LIZJ() {
    }
    
    public final void LIZLLL() {
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJIIIZ = true;
    }
    
    public final void onClick(final View view) {
        public final class 1ec<T> implements 2d6
        {
            public final /* synthetic */ 1n1 LIZ;
            public final /* synthetic */ IUserManageService LIZIZ;
            
            static {
                Covode.recordClassIndex(10767);
            }
            
            public 1ec(final 1n1 liz, final IUserManageService liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        public final class 1eb implements GEY
        {
            public final /* synthetic */ 1n1 LIZ;
            
            static {
                Covode.recordClassIndex(10766);
            }
            
            public 1eb(final 1n1 liz) {
                this.LIZ = liz;
            }
            
            public final void LIZ() {
                this.LIZ.LIZ();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          397
        //     4: aload_1        
        //     5: invokevirtual   android/view/View.getId:()I
        //     8: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    11: astore_2       
        //    12: ldc_w           ""
        //    15: astore_1       
        //    16: aload_2        
        //    17: ifnonnull       163
        //    20: iconst_0       
        //    21: istore_3       
        //    22: aload_2        
        //    23: ifnonnull       35
        //    26: ldc_w           "anchor"
        //    29: astore_1       
        //    30: aload_2        
        //    31: ifnonnull       402
        //    34: return         
        //    35: aload_2        
        //    36: invokevirtual   java/lang/Integer.intValue:()I
        //    39: ldc_w           2131370357
        //    42: if_icmpne       132
        //    45: aload_0        
        //    46: getfield        X/1n1.LIZ:Lcom/bytedance/android/live/base/model/user/User;
        //    49: astore_2       
        //    50: new             LX/GCd;
        //    53: dup            
        //    54: iconst_1       
        //    55: aload_2        
        //    56: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;)Ljava/lang/String;
        //    59: ldc_w           ""
        //    62: iconst_0       
        //    63: invokespecial   X/GCd.<init>:(ILjava/lang/String;Ljava/lang/String;Z)V
        //    66: astore_1       
        //    67: aload_1        
        //    68: ldc_w           "message"
        //    71: putfield        X/GCd.LJIIIIZZ:Ljava/lang/String;
        //    74: aload_1        
        //    75: aload_2        
        //    76: putfield        X/GCd.LIZLLL:Lcom/bytedance/android/live/base/model/user/User;
        //    79: getstatic       com/bytedance/android/livesdk/chatroom/event/ISendCommentEvent$Sender.REPLY:Lcom/bytedance/android/livesdk/chatroom/event/ISendCommentEvent$Sender;
        //    82: astore          4
        //    84: aload           4
        //    86: invokevirtual   com/bytedance/android/livesdk/chatroom/event/ISendCommentEvent$Sender.getLogArgs:()Ljava/util/Map;
        //    89: invokeinterface java/util/Map.clear:()V
        //    94: aload_0        
        //    95: getfield        X/1n1.LJIJJLI:Ljava/util/Map;
        //    98: astore_2       
        //    99: aload_2        
        //   100: ifnull          109
        //   103: aload           4
        //   105: aload_2        
        //   106: invokevirtual   com/bytedance/android/livesdk/chatroom/event/ISendCommentEvent$Sender.setLogArgs:(Ljava/util/Map;)V
        //   109: aload_1        
        //   110: aload           4
        //   112: putfield        X/GCd.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/event/ISendCommentEvent$Sender;
        //   115: invokestatic    X/FGP.LIZ:()LX/FGP;
        //   118: aload_1        
        //   119: invokevirtual   X/FGP.LIZ:(Ljava/lang/Object;)V
        //   122: invokestatic    X/GAP.LIZ:()LX/GAP;
        //   125: iconst_1       
        //   126: invokevirtual   X/GAP.LIZ:(Z)V
        //   129: goto            875
        //   132: aload_2        
        //   133: invokevirtual   java/lang/Integer.intValue:()I
        //   136: ldc_w           2131369289
        //   139: if_icmpne       26
        //   142: aload_0        
        //   143: getfield        X/1n1.LJJ:LX/QgG;
        //   146: astore_1       
        //   147: aload_1        
        //   148: ifnull          158
        //   151: aload_1        
        //   152: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //   157: pop            
        //   158: aload_0        
        //   159: invokevirtual   X/1n1.dismiss:()V
        //   162: return         
        //   163: aload_2        
        //   164: invokevirtual   java/lang/Integer.intValue:()I
        //   167: ldc             2131370385
        //   169: if_icmpne       20
        //   172: getstatic       X/Fwf.LIZ:LX/Fwf;
        //   175: invokevirtual   X/Fwf.LIZ:()Ljava/lang/String;
        //   178: astore          5
        //   180: getstatic       X/Fwf.LIZ:LX/Fwf;
        //   183: invokevirtual   X/Fwf.LIZLLL:()Ljava/lang/String;
        //   186: astore          6
        //   188: ldc             Lcom/bytedance/android/live/usermanage/IUserManageService;.class
        //   190: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   193: checkcast       Lcom/bytedance/android/live/usermanage/IUserManageService;
        //   196: astore          4
        //   198: aload_0        
        //   199: getfield        X/1n1.LJIILL:Landroid/content/Context;
        //   202: astore_2       
        //   203: aload_0        
        //   204: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   207: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   210: lstore          7
        //   212: aload_0        
        //   213: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   216: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   219: lstore          9
        //   221: aload_0        
        //   222: getfield        X/1n1.LIZ:Lcom/bytedance/android/live/base/model/user/User;
        //   225: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   228: lstore          11
        //   230: aload_0        
        //   231: getfield        X/1n1.LIZ:Lcom/bytedance/android/live/base/model/user/User;
        //   234: invokevirtual   com/bytedance/android/live/base/model/user/User.getSecUid:()Ljava/lang/String;
        //   237: astore          13
        //   239: aload_0        
        //   240: getfield        X/1n1.LIZLLL:LX/H31;
        //   243: invokevirtual   X/H31.getMessageId:()J
        //   246: lstore          14
        //   248: aload_0        
        //   249: getfield        X/1n1.LIZLLL:LX/H31;
        //   252: astore          16
        //   254: aload           16
        //   256: instanceof      Lcom/bytedance/android/livesdk/model/message/ChatMessage;
        //   259: ifeq            271
        //   262: aload           16
        //   264: checkcast       Lcom/bytedance/android/livesdk/model/message/ChatMessage;
        //   267: getfield        com/bytedance/android/livesdk/model/message/ChatMessage.LIZIZ:Ljava/lang/String;
        //   270: astore_1       
        //   271: new             LX/G7Y;
        //   274: dup            
        //   275: lload           7
        //   277: lload           9
        //   279: lload           11
        //   281: aload           13
        //   283: ldc_w           "comment"
        //   286: lload           14
        //   288: aload_1        
        //   289: getstatic       X/Fwf.LIZ:LX/Fwf;
        //   292: invokevirtual   X/Fwf.LJIIJJI:()Ljava/lang/String;
        //   295: aload           5
        //   297: aload           6
        //   299: aload_0        
        //   300: getfield        X/1n1.LJIILLIIL:LX/10b;
        //   303: getfield        X/10b.LIZ:Ljava/lang/String;
        //   306: ldc_w           "1"
        //   309: new             LX/Fl1;
        //   312: dup            
        //   313: aconst_null    
        //   314: ldc_w           "user_live_duration"
        //   317: invokespecial   X/Fl1.<init>:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;Ljava/lang/String;)V
        //   320: aload_0        
        //   321: getfield        X/1n1.LJIIZILJ:Ljava/lang/String;
        //   324: invokespecial   X/G7Y.<init>:(JJJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LX/Fl1;Ljava/lang/String;)V
        //   327: astore_1       
        //   328: aload_1        
        //   329: ldc             Lcom/bytedance/android/live/usermanage/IUserManageService;.class
        //   331: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   334: checkcast       Lcom/bytedance/android/live/usermanage/IUserManageService;
        //   337: invokeinterface com/bytedance/android/live/usermanage/IUserManageService.getReportScene:()Ljava/lang/String;
        //   342: putfield        X/G7Y.LJJ:Ljava/lang/String;
        //   345: aload_1        
        //   346: aload_0        
        //   347: getfield        X/1n1.LJIILLIIL:LX/10b;
        //   350: getfield        X/10b.LIZJ:Ljava/lang/String;
        //   353: putfield        X/G7Y.LJIILL:Ljava/lang/String;
        //   356: aload_1        
        //   357: aload_0        
        //   358: getfield        X/1n1.LJIILLIIL:LX/10b;
        //   361: getfield        X/10b.LJ:J
        //   364: putfield        X/G7Y.LJIJI:J
        //   367: aload_1        
        //   368: aload_0        
        //   369: getfield        X/1n1.LJIILLIIL:LX/10b;
        //   372: getfield        X/10b.LIZLLL:J
        //   375: putfield        X/G7Y.LJIJJ:J
        //   378: aload           4
        //   380: aload_2        
        //   381: aload_1        
        //   382: invokeinterface com/bytedance/android/live/usermanage/IUserManageService.report:(Landroid/content/Context;LX/G7Y;)V
        //   387: aload_0        
        //   388: ldc_w           "report"
        //   391: invokevirtual   X/1n1.LIZ:(Ljava/lang/String;)V
        //   394: goto            875
        //   397: aconst_null    
        //   398: astore_2       
        //   399: goto            12
        //   402: aload_2        
        //   403: invokevirtual   java/lang/Integer.intValue:()I
        //   406: ldc             2131368498
        //   408: if_icmpne       590
        //   411: aload_0        
        //   412: getfield        X/1n1.LIZ:Lcom/bytedance/android/live/base/model/user/User;
        //   415: invokevirtual   com/bytedance/android/live/base/model/user/User.getUserAttr:()Lcom/bytedance/android/livesdk/model/UserAttr;
        //   418: ifnull          443
        //   421: aload_0        
        //   422: getfield        X/1n1.LIZ:Lcom/bytedance/android/live/base/model/user/User;
        //   425: invokevirtual   com/bytedance/android/live/base/model/user/User.getUserAttr:()Lcom/bytedance/android/livesdk/model/UserAttr;
        //   428: astore_2       
        //   429: aload_2        
        //   430: ldc_w           ""
        //   433: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   436: aload_2        
        //   437: getfield        com/bytedance/android/livesdk/model/UserAttr.LIZ:Z
        //   440: ifne            445
        //   443: iconst_1       
        //   444: istore_3       
        //   445: ldc             Lcom/bytedance/android/live/usermanage/IUserManageService;.class
        //   447: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   450: checkcast       Lcom/bytedance/android/live/usermanage/IUserManageService;
        //   453: astore_2       
        //   454: iload_3        
        //   455: ifeq            482
        //   458: aload_2        
        //   459: invokeinterface com/bytedance/android/live/usermanage/IUserManageService.getMuteDuration:()LX/FAE;
        //   464: new             LX/1ec;
        //   467: dup            
        //   468: aload_0        
        //   469: aload_2        
        //   470: invokespecial   X/1ec.<init>:(LX/1n1;Lcom/bytedance/android/live/usermanage/IUserManageService;)V
        //   473: invokevirtual   X/FAE.LJ:(LX/2d6;)LX/2fc;
        //   476: pop            
        //   477: aload_0        
        //   478: invokevirtual   X/1n1.dismiss:()V
        //   481: return         
        //   482: aload_2        
        //   483: aload_0        
        //   484: getfield        X/1n1.LIZ:Lcom/bytedance/android/live/base/model/user/User;
        //   487: aload_0        
        //   488: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   491: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   494: aload_0        
        //   495: invokeinterface com/bytedance/android/live/usermanage/IUserManageService.unmuteUser:(Lcom/bytedance/android/live/base/model/user/User;JLX/GD4;)V
        //   500: getstatic       X/Gkn.LJFF:LX/Gkq;
        //   503: ldc_w           "livesdk_unmute_comment"
        //   506: invokevirtual   X/Gkq.LIZ:(Ljava/lang/String;)LX/Gkn;
        //   509: astore_2       
        //   510: aload_2        
        //   511: invokevirtual   X/Gkn.LIZ:()LX/Gkn;
        //   514: pop            
        //   515: aload_0        
        //   516: getfield        X/1n1.LIZJ:Z
        //   519: ifeq            583
        //   522: aload_2        
        //   523: ldc_w           "admin_type"
        //   526: aload_1        
        //   527: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   530: pop            
        //   531: aload_2        
        //   532: ldc_w           "anchor_id"
        //   535: aload_0        
        //   536: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   539: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   542: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;J)LX/Gkn;
        //   545: pop            
        //   546: aload_2        
        //   547: ldc_w           "room_id"
        //   550: aload_0        
        //   551: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   554: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   557: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;J)LX/Gkn;
        //   560: pop            
        //   561: aload_2        
        //   562: ldc_w           "to_user_id"
        //   565: aload_0        
        //   566: getfield        X/1n1.LIZ:Lcom/bytedance/android/live/base/model/user/User;
        //   569: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   572: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;J)LX/Gkn;
        //   575: pop            
        //   576: aload_2        
        //   577: invokevirtual   X/Gkn.LIZLLL:()V
        //   580: goto            477
        //   583: ldc_w           "admin"
        //   586: astore_1       
        //   587: goto            522
        //   590: aload_2        
        //   591: invokevirtual   java/lang/Integer.intValue:()I
        //   594: ldc             2131367256
        //   596: if_icmpne       887
        //   599: aload_0        
        //   600: getfield        X/1n1.LIZ:Lcom/bytedance/android/live/base/model/user/User;
        //   603: astore_2       
        //   604: ldc             Lcom/bytedance/android/live/usermanage/IUserManageService;.class
        //   606: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   609: checkcast       Lcom/bytedance/android/live/usermanage/IUserManageService;
        //   612: aload_0        
        //   613: getfield        X/1n1.LJIILL:Landroid/content/Context;
        //   616: aload_0        
        //   617: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   620: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   623: aload_0        
        //   624: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   627: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   630: aload_2        
        //   631: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   634: new             LX/1eb;
        //   637: dup            
        //   638: aload_0        
        //   639: invokespecial   X/1eb.<init>:(LX/1n1;)V
        //   642: invokeinterface com/bytedance/android/live/usermanage/IUserManageService.getEnsureKickOutDialog:(Landroid/content/Context;JJJLX/GEY;)Landroid/app/Dialog;
        //   647: astore          4
        //   649: aload           4
        //   651: ifnull          729
        //   654: aload           4
        //   656: invokevirtual   android/app/Dialog.show:()V
        //   659: aload           4
        //   661: invokevirtual   android/app/Dialog.getWindow:()Landroid/view/Window;
        //   664: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   667: astore          13
        //   669: aload           13
        //   671: ifnull          721
        //   674: aload           13
        //   676: ldc_w           2131374348
        //   679: invokevirtual   android/view/View.getTag:(I)Ljava/lang/Object;
        //   682: checkcast       Ljava/lang/Boolean;
        //   685: astore          5
        //   687: aload           5
        //   689: ifnull          721
        //   692: aload           5
        //   694: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   697: ifeq            721
        //   700: aload           4
        //   702: invokestatic    X/0RT.LIZ:(Landroid/app/Dialog;)V
        //   705: aload           13
        //   707: ldc_w           2131374349
        //   710: aload           13
        //   712: invokevirtual   java/lang/Object.hashCode:()I
        //   715: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   718: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //   721: getstatic       X/KN6.LIZ:LX/KN6;
        //   724: aload           4
        //   726: invokevirtual   X/KN6.LIZ:(Landroid/app/Dialog;)V
        //   729: new             Ljava/util/HashMap;
        //   732: dup            
        //   733: invokespecial   java/util/HashMap.<init>:()V
        //   736: astore          4
        //   738: aload           4
        //   740: ldc_w           "anchor_id"
        //   743: aload_0        
        //   744: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   747: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   750: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   753: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   758: pop            
        //   759: aload_0        
        //   760: getfield        X/1n1.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   763: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getIdStr:()Ljava/lang/String;
        //   766: astore          5
        //   768: aload           5
        //   770: ldc_w           ""
        //   773: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   776: aload           4
        //   778: ldc_w           "room_id"
        //   781: aload           5
        //   783: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   788: pop            
        //   789: aload_0        
        //   790: getfield        X/1n1.LIZJ:Z
        //   793: ifeq            880
        //   796: aload           4
        //   798: ldc_w           "admin_type"
        //   801: aload_1        
        //   802: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   807: pop            
        //   808: aload           4
        //   810: ldc_w           "user_id"
        //   813: aload_2        
        //   814: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   817: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   820: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   825: pop            
        //   826: getstatic       X/Gkn.LJFF:LX/Gkq;
        //   829: ldc_w           "blocked_list_click"
        //   832: invokevirtual   X/Gkq.LIZ:(Ljava/lang/String;)LX/Gkn;
        //   835: astore_1       
        //   836: aload_1        
        //   837: invokevirtual   X/Gkn.LIZ:()LX/Gkn;
        //   840: pop            
        //   841: aload_1        
        //   842: aload           4
        //   844: invokevirtual   X/Gkn.LIZ:(Ljava/util/Map;)LX/Gkn;
        //   847: pop            
        //   848: aload_1        
        //   849: ldc_w           "relation"
        //   852: invokevirtual   X/Gkn.LIZJ:(Ljava/lang/String;)LX/Gkn;
        //   855: pop            
        //   856: aload_1        
        //   857: ldc_w           "click"
        //   860: invokevirtual   X/Gkn.LIZLLL:(Ljava/lang/String;)LX/Gkn;
        //   863: pop            
        //   864: aload_1        
        //   865: invokevirtual   X/Gkn.LIZLLL:()V
        //   868: aload_0        
        //   869: ldc_w           "block"
        //   872: invokevirtual   X/1n1.LIZ:(Ljava/lang/String;)V
        //   875: aload_0        
        //   876: invokevirtual   X/1n1.dismiss:()V
        //   879: return         
        //   880: ldc_w           "admin"
        //   883: astore_1       
        //   884: goto            796
        //   887: aload_2        
        //   888: invokevirtual   java/lang/Integer.intValue:()I
        //   891: ldc_w           2131370442
        //   894: if_icmpne       903
        //   897: aload_0        
        //   898: iconst_0       
        //   899: invokespecial   X/1n1.LIZIZ:(Z)V
        //   902: return         
        //   903: aload_2        
        //   904: invokevirtual   java/lang/Integer.intValue:()I
        //   907: ldc_w           2131372604
        //   910: if_icmpne       934
        //   913: aload_0        
        //   914: getfield        X/1n1.LJIL:LX/QgG;
        //   917: astore_1       
        //   918: aload_1        
        //   919: ifnull          929
        //   922: aload_1        
        //   923: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //   928: pop            
        //   929: aload_0        
        //   930: invokevirtual   X/1n1.dismiss:()V
        //   933: return         
        //   934: aload_2        
        //   935: invokevirtual   java/lang/Integer.intValue:()I
        //   938: ldc_w           2131362414
        //   941: if_icmpne       879
        //   944: getstatic       X/Gkn.LJFF:LX/Gkq;
        //   947: ldc_w           "livesdk_comment_filter_long_press_approve"
        //   950: invokevirtual   X/Gkq.LIZ:(Ljava/lang/String;)LX/Gkn;
        //   953: astore_2       
        //   954: aload_2        
        //   955: invokevirtual   X/Gkn.LIZ:()LX/Gkn;
        //   958: pop            
        //   959: aload_0        
        //   960: getfield        X/1n1.LIZJ:Z
        //   963: ifeq            1013
        //   966: aload_2        
        //   967: ldc_w           "admin_type"
        //   970: aload_1        
        //   971: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   974: pop            
        //   975: aload_2        
        //   976: ldc_w           "msg_id"
        //   979: aload_0        
        //   980: getfield        X/1n1.LIZLLL:LX/H31;
        //   983: invokevirtual   X/H31.getMessageId:()J
        //   986: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;J)LX/Gkn;
        //   989: pop            
        //   990: aload_2        
        //   991: invokevirtual   X/Gkn.LIZLLL:()V
        //   994: aload_0        
        //   995: getfield        X/1n1.LJJIFFI:LX/QgG;
        //   998: astore_1       
        //   999: aload_1        
        //  1000: ifnull          875
        //  1003: aload_1        
        //  1004: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //  1009: pop            
        //  1010: goto            875
        //  1013: ldc_w           "admin"
        //  1016: astore_1       
        //  1017: goto            966
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:426)
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
    
    public final void onCreate(final Bundle bundle) {
        public final class 10y implements View$OnClickListener
        {
            public final /* synthetic */ 1n1 LIZ;
            
            static {
                Covode.recordClassIndex(10769);
            }
            
            public 10y(final 1n1 liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.dismiss();
            }
        }
        public final class 10x implements View$OnClickListener
        {
            public final /* synthetic */ 1n1 LIZ;
            
            static {
                Covode.recordClassIndex(10768);
            }
            
            public 10x(final 1n1 liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.cancel();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: invokevirtual   X/1n1.getLayoutInflater:()Landroid/view/LayoutInflater;
        //     5: invokestatic    X/1n1.LIZ:(Landroid/view/LayoutInflater;)Landroid/view/View;
        //     8: invokevirtual   X/1n1.setContentView:(Landroid/view/View;)V
        //    11: aload_0        
        //    12: ldc_w           2131372580
        //    15: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //    18: checkcast       Landroid/widget/FrameLayout;
        //    21: new             LX/10x;
        //    24: dup            
        //    25: aload_0        
        //    26: invokespecial   X/10x.<init>:(LX/1n1;)V
        //    29: invokevirtual   android/widget/FrameLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    32: aload_0        
        //    33: invokevirtual   X/1n1.getContext:()Landroid/content/Context;
        //    36: ldc_w           2131234109
        //    39: invokevirtual   android/content/Context.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    42: astore_1       
        //    43: aload_1        
        //    44: ifnull          496
        //    47: aload_1        
        //    48: invokevirtual   android/graphics/drawable/Drawable.mutate:()Landroid/graphics/drawable/Drawable;
        //    51: pop            
        //    52: aload_1        
        //    53: aload_0        
        //    54: invokevirtual   X/1n1.getContext:()Landroid/content/Context;
        //    57: ldc_w           2130971360
        //    60: invokestatic    X/0eI.LIZ:(Landroid/content/Context;I)I
        //    63: invokevirtual   android/graphics/drawable/Drawable.setTint:(I)V
        //    66: aload_0        
        //    67: ldc_w           2131368540
        //    70: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //    73: checkcast       Landroid/widget/LinearLayout;
        //    76: astore_2       
        //    77: aload_2        
        //    78: ldc_w           ""
        //    81: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    84: aload_2        
        //    85: aload_1        
        //    86: invokevirtual   android/widget/LinearLayout.setDividerDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    89: aload_0        
        //    90: ldc_w           2131370442
        //    93: invokevirtual   X/1n1.findViewById:(I)Landroid/view/View;
        //    96: astore_1       
        //    97: aload_1        
        //    98: ldc_w           ""
        //   101: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   104: aload_0        
        //   105: aload_1        
        //   106: putfield        X/1n1.LJIIL:Landroid/view/View;
        //   109: aload_0        
        //   110: ldc_w           2131369289
        //   113: invokevirtual   X/1n1.findViewById:(I)Landroid/view/View;
        //   116: astore_1       
        //   117: aload_1        
        //   118: ldc_w           ""
        //   121: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   124: aload_0        
        //   125: aload_1        
        //   126: putfield        X/1n1.LJIILJJIL:Landroid/view/View;
        //   129: aload_0        
        //   130: ldc_w           2131369832
        //   133: invokevirtual   X/1n1.findViewById:(I)Landroid/view/View;
        //   136: astore_1       
        //   137: aload_1        
        //   138: ldc_w           ""
        //   141: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   144: aload_0        
        //   145: aload_1        
        //   146: putfield        X/1n1.LJIILIIL:Landroid/view/View;
        //   149: aload_0        
        //   150: getfield        X/1n1.LJIIL:Landroid/view/View;
        //   153: astore_1       
        //   154: aload_1        
        //   155: ifnonnull       164
        //   158: ldc_w           ""
        //   161: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   164: aload_1        
        //   165: aload_0        
        //   166: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   169: aload_0        
        //   170: ldc_w           2131363264
        //   173: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   176: checkcast       LX/1Ih;
        //   179: astore_1       
        //   180: aload_1        
        //   181: ifnull          196
        //   184: aload_1        
        //   185: new             LX/10y;
        //   188: dup            
        //   189: aload_0        
        //   190: invokespecial   X/10y.<init>:(LX/1n1;)V
        //   193: invokevirtual   X/1Ih.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   196: aload_0        
        //   197: ldc             2131370385
        //   199: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   202: checkcast       LX/1Ih;
        //   205: astore_1       
        //   206: aload_1        
        //   207: ifnull          215
        //   210: aload_1        
        //   211: aload_0        
        //   212: invokevirtual   X/1Ih.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   215: aload_0        
        //   216: ldc_w           2131370357
        //   219: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   222: checkcast       LX/1Ih;
        //   225: astore_1       
        //   226: aload_1        
        //   227: ifnull          235
        //   230: aload_1        
        //   231: aload_0        
        //   232: invokevirtual   X/1Ih.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   235: aload_0        
        //   236: getfield        X/1n1.LJIILJJIL:Landroid/view/View;
        //   239: astore_1       
        //   240: aload_1        
        //   241: ifnonnull       250
        //   244: ldc_w           ""
        //   247: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   250: aload_1        
        //   251: aload_0        
        //   252: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   255: aload_0        
        //   256: ldc             2131368498
        //   258: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   261: checkcast       LX/1Ih;
        //   264: astore_1       
        //   265: aload_1        
        //   266: ifnull          274
        //   269: aload_1        
        //   270: aload_0        
        //   271: invokevirtual   X/1Ih.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   274: aload_0        
        //   275: ldc             2131367256
        //   277: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   280: checkcast       LX/1Ih;
        //   283: astore_1       
        //   284: aload_1        
        //   285: ifnull          293
        //   288: aload_1        
        //   289: aload_0        
        //   290: invokevirtual   X/1Ih.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   293: aload_0        
        //   294: ldc_w           2131372604
        //   297: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   300: checkcast       LX/1Ih;
        //   303: aload_0        
        //   304: invokevirtual   X/1Ih.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   307: aload_0        
        //   308: ldc_w           2131362414
        //   311: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   314: checkcast       LX/1Ih;
        //   317: aload_0        
        //   318: invokevirtual   X/1Ih.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   321: aload_0        
        //   322: iconst_0       
        //   323: invokespecial   X/1n1.LIZIZ:(Z)V
        //   326: aload_0        
        //   327: getfield        X/1n1.LJIJ:Z
        //   330: ifeq            469
        //   333: aload_0        
        //   334: ldc_w           2131372604
        //   337: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   340: checkcast       LX/1Ih;
        //   343: astore_1       
        //   344: aload_1        
        //   345: ldc_w           ""
        //   348: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   351: aload_1        
        //   352: iconst_0       
        //   353: invokevirtual   X/1Ih.setVisibility:(I)V
        //   356: aload_0        
        //   357: ldc_w           2131372604
        //   360: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   363: checkcast       LX/1Ih;
        //   366: aload_0        
        //   367: getfield        X/1n1.LJIJJ:Ljava/lang/String;
        //   370: invokevirtual   X/1Ih.setText:(Ljava/lang/CharSequence;)V
        //   373: aload_0        
        //   374: getfield        X/1n1.LIZLLL:LX/H31;
        //   377: astore_1       
        //   378: aload_1        
        //   379: instanceof      Lcom/bytedance/android/livesdk/model/message/ChatMessage;
        //   382: ifeq            442
        //   385: aload_1        
        //   386: checkcast       Lcom/bytedance/android/livesdk/model/message/ChatMessage;
        //   389: invokevirtual   com/bytedance/android/livesdk/model/message/ChatMessage.LIZ:()Z
        //   392: ifeq            442
        //   395: aload_0        
        //   396: ldc_w           2131362414
        //   399: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   402: checkcast       LX/1Ih;
        //   405: astore_1       
        //   406: aload_1        
        //   407: ldc_w           ""
        //   410: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   413: aload_1        
        //   414: iconst_0       
        //   415: invokevirtual   X/1Ih.setVisibility:(I)V
        //   418: aload_0        
        //   419: getfield        X/1n1.LJIILJJIL:Landroid/view/View;
        //   422: astore_1       
        //   423: aload_1        
        //   424: ifnonnull       433
        //   427: ldc_w           ""
        //   430: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   433: aload_1        
        //   434: aload_0        
        //   435: getfield        X/1n1.LJIJI:Z
        //   438: invokestatic    X/GTi.LIZ:(Landroid/view/View;Z)V
        //   441: return         
        //   442: aload_0        
        //   443: ldc_w           2131362414
        //   446: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   449: checkcast       LX/1Ih;
        //   452: astore_1       
        //   453: aload_1        
        //   454: ldc_w           ""
        //   457: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   460: aload_1        
        //   461: bipush          8
        //   463: invokevirtual   X/1Ih.setVisibility:(I)V
        //   466: goto            418
        //   469: aload_0        
        //   470: ldc_w           2131372604
        //   473: invokevirtual   android/app/Dialog.findViewById:(I)Landroid/view/View;
        //   476: checkcast       LX/1Ih;
        //   479: astore_1       
        //   480: aload_1        
        //   481: ldc_w           ""
        //   484: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   487: aload_1        
        //   488: bipush          8
        //   490: invokevirtual   X/1Ih.setVisibility:(I)V
        //   493: goto            373
        //   496: aconst_null    
        //   497: astore_1       
        //   498: goto            66
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
    
    public final void onDetachedFromWindow() {
        this.LJIIIZ = false;
        this.LJIIIIZZ.LIZ();
        super.onDetachedFromWindow();
    }
    
    public final void onStart() {
        super.onStart();
        final Window window = this.getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        final Window window2 = this.getWindow();
        if (window2 != null) {
            window2.clearFlags(1024);
        }
        final Window window3 = this.getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        final Window window4 = this.getWindow();
        if (window4 != null) {
            window4.setNavigationBarColor(0eI.LIZ(this.getContext(), 2130971333));
        }
        final Window window5 = this.getWindow();
        if (window5 != null) {
            window5.setLayout(-1, -1);
        }
    }
}
