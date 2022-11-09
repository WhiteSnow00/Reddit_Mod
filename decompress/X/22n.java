// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import android.view.View$OnClickListener;
import android.net.Uri;
import java.util.List;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorOneVnSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.AnchorMuteGuestAbtestEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.live.base.model.ImageModel;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.n;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.android.live.base.model.user.User;

public final class 22n extends 1lw implements a, 0su
{
    public User LJII;
    public boolean LJIIIIZZ;
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LJIIIZ;
    public 0k8 LJIIJ;
    public Vwg LJIIJJI;
    public Vv3 LJIIL;
    public int LJIILIIL;
    public final 5DO LJIILJJIL;
    public HashMap LJIILL;
    
    static {
        Covode.recordClassIndex(9049);
    }
    
    public 22n(final Vvh vvh, final String s, final 0qc.a a, final a a2, final DataChannel dataChannel, final 0k8 ljiij, final Vwg ljiijji) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: aload_1        
        //     7: aload_2        
        //     8: aload_3        
        //     9: aload           4
        //    11: aload           5
        //    13: invokespecial   X/1lw.<init>:(LX/Vvh;Ljava/lang/String;LX/1TY;LX/0sj;Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //    16: sipush          9207
        //    19: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    22: aload_0        
        //    23: aload           6
        //    25: putfield        X/22n.LJIIJ:LX/0k8;
        //    28: aload_0        
        //    29: aload           7
        //    31: putfield        X/22n.LJIIJJI:LX/Vwg;
        //    34: aload_0        
        //    35: aload_1        
        //    36: invokeinterface X/Vvh.LIZJ:()LX/Vv3;
        //    41: putfield        X/22n.LJIIL:LX/Vv3;
        //    44: aload_0        
        //    45: iconst_m1      
        //    46: putfield        X/22n.LJIILIIL:I
        //    49: aload_0        
        //    50: new             LX/22m;
        //    53: dup            
        //    54: aload_0        
        //    55: invokespecial   X/22m.<init>:(LX/22n;)V
        //    58: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    61: putfield        X/22n.LJIILJJIL:LX/5DO;
        //    64: getstatic       X/1jw.LIZ:LX/1jw;
        //    67: aload_0        
        //    68: invokevirtual   X/1Na.LIZ:(Ljava/lang/Object;)V
        //    71: aload_0        
        //    72: invokevirtual   X/22n.getContext:()Landroid/content/Context;
        //    75: aload_0        
        //    76: invokevirtual   X/1lw.getWindowLayoutId:()I
        //    79: aload_0        
        //    80: invokestatic    android/widget/FrameLayout.inflate:(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
        //    83: ifnull          97
        //    86: aload_0        
        //    87: invokevirtual   X/1lw.LIZIZ:()V
        //    90: sipush          9207
        //    93: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    96: return         
        //    97: new             Ljava/lang/NullPointerException;
        //   100: dup            
        //   101: ldc             "null cannot be cast to non-null type android.view.ViewGroup"
        //   103: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   106: astore_1       
        //   107: sipush          9207
        //   110: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   113: aload_1        
        //   114: athrow         
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
    
    private final void LIZ(final float n, final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0cB.LIZ(n);
        view.setLayoutParams(layoutParams);
    }
    
    private final void LIZ(final View view, final float n) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0cB.LIZ(n);
        layoutParams.width = 0cB.LIZ(n);
        view.setLayoutParams(layoutParams);
    }
    
    private final boolean LIZ(final String s) {
        final 1Uo ljiiiz = this.LJIIIZ;
        if (ljiiiz == null) {
            n.LIZ("");
        }
        else {
            final Boolean lizj = ljiiiz.LIZJ(s);
            if (lizj != null) {
                return lizj;
            }
        }
        if (this.LIZIZ(s) == 2) {
            final 1Uo ljiiiz2 = this.LJIIIZ;
            if (ljiiiz2 == null) {
                n.LIZ("");
            }
            else {
                ljiiiz2.LIZ(s, true);
            }
            return true;
        }
        if (this.LJII()) {
            final 1Uo ljiiiz3 = this.LJIIIZ;
            Boolean value;
            if (ljiiiz3 == null) {
                n.LIZ("");
                value = null;
            }
            else {
                value = ljiiiz3.LIZIZ;
            }
            if (!value) {
                return true;
            }
        }
        return false;
    }
    
    private final int LIZIZ(final String s) {
        final 0ql liz = 0ql.LIZ;
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        final User liziz2 = liziz.LIZIZ();
        n.LIZIZ((Object)liziz2, "");
        final boolean liz2 = liz.LIZ(liziz2);
        final 1XE 1xe = null;
        Object o = null;
        if (liz2) {
            final Object liz3 = 1jw.LIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (liz3 instanceof 1XD) {
                o = liz3;
            }
            final 1XD 1xd = (1XD)o;
            if (1xd != null) {
                final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> ljff = 1xd.LJFF();
                if (ljff != null) {
                    final LinkPlayerInfo liz4 = 0sc.LIZ(ljff, s);
                    if (liz4 != null) {
                        return liz4.LJFF;
                    }
                }
            }
            return 1;
        }
        Object liz5 = 1jw.LIZ.LIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (!(liz5 instanceof 1XE)) {
            liz5 = 1xe;
        }
        final 1XE 1xe2 = (1XE)liz5;
        if (1xe2 != null) {
            final 0sh<LinkListUser, LinkMessage> ljff2 = 1xe2.LJFF();
            if (ljff2 != null) {
                final LinkListUser lizlll = 0sc.LIZLLL(ljff2, s);
                if (lizlll != null) {
                    return lizlll.LIZJ;
                }
            }
        }
        return 1;
    }
    
    private final void LJIIIZ() {
        final ConstraintLayout.a layoutParams = new ConstraintLayout.a(0cB.LIZ(12.0f), 0cB.LIZ(12.0f));
        layoutParams.startToStart = 2131367391;
        layoutParams.topToTop = 2131367391;
        final 1JD 1jd = (1JD)this.LIZIZ(2131368960);
        n.LIZIZ((Object)1jd, "");
        1jd.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        final ConstraintLayout.a layoutParams2 = new ConstraintLayout.a(-2, -2);
        layoutParams2.bottomToBottom = 2131367391;
        layoutParams2.startToStart = 2131367391;
        final 1sp 1sp = (1sp)this.LIZIZ(2131368951);
        n.LIZIZ((Object)1sp, "");
        1sp.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
    }
    
    private final void LJIIJ() {
        final ConstraintLayout.a layoutParams = new ConstraintLayout.a(-2, -2);
        layoutParams.topToTop = 2131367391;
        layoutParams.startToStart = 2131367391;
        layoutParams.bottomToTop = 2131368960;
        final 1sp 1sp = (1sp)this.LIZIZ(2131368951);
        n.LIZIZ((Object)1sp, "");
        1sp.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        final ConstraintLayout.a layoutParams2 = new ConstraintLayout.a(0cB.LIZ(12.0f), 0cB.LIZ(12.0f));
        layoutParams2.startToStart = 2131367391;
        layoutParams2.topToBottom = 2131368951;
        layoutParams2.topMargin = 0cB.LIZ(2.0f);
        final 1JD 1jd = (1JD)this.LIZIZ(2131368960);
        n.LIZIZ((Object)1jd, "");
        1jd.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
    }
    
    private final void LJIIJJI() {
        public final class 0sx implements Runnable
        {
            public final /* synthetic */ 22n LIZ;
            
            static {
                Covode.recordClassIndex(9057);
            }
            
            public 0sx(final 22n liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                final User ljii = this.LIZ.LJII;
                ImageModel avatarThumb;
                if (ljii != null) {
                    avatarThumb = ljii.getAvatarThumb();
                }
                else {
                    avatarThumb = null;
                }
                this.LIZ.LIZ(avatarThumb);
                final 22n liz = this.LIZ;
                final 1si 1si = (1si)liz.LIZIZ(2131368955);
                n.LIZIZ((Object)1si, "");
                liz.LIZ(avatarThumb, 1si);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: new             LX/0sx;
        //     4: dup            
        //     5: aload_0        
        //     6: invokespecial   X/0sx.<init>:(LX/22n;)V
        //     9: invokestatic    X/0sM.LIZ:(Landroid/view/View;Ljava/lang/Runnable;)V
        //    12: return         
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
    
    private final void LJIIL() {
        final DataChannel mDataChannel = this.getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.LIZJ((Class)2FY.class, (Object)new 1Ws(null, "selfie_window"));
        }
    }
    
    private final String getAnchorName() {
        final DataChannel mDataChannel = this.getMDataChannel();
        Label_0034: {
            if (mDataChannel == null) {
                break Label_0034;
            }
            final Room room = (Room)mDataChannel.LIZIZ((Class)G69.class);
            if (room == null) {
                break Label_0034;
            }
            final User owner = room.getOwner();
            return 0W3.LIZLLL(owner);
        }
        final User owner = null;
        return 0W3.LIZLLL(owner);
    }
    
    @Override
    public final void LIZ() {
        final 0ql liz = 0ql.LIZ;
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        final User liziz2 = liziz.LIZIZ();
        n.LIZIZ((Object)liziz2, "");
        if (liz.LIZ(liziz2)) {
            super.LIZ();
            return;
        }
        if (AnchorMuteGuestAbtestEnableSetting.INSTANCE.getValue() == 0) {
            final User ljii = this.LJII;
            if (ljii != null) {
                final long id = ljii.getId();
                final GIK liziz3 = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz3, "");
                if (id == liziz3.LIZJ()) {
                    this.LJIIL();
                    return;
                }
            }
            this.j_();
            return;
        }
        if (LiveAnchorOneVnSetting.INSTANCE.enable1vn()) {
            final User ljii2 = this.LJII;
            if (ljii2 != null) {
                final long id2 = ljii2.getId();
                final GIK liziz4 = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz4, "");
                if (id2 == liziz4.LIZJ() && 0ql.a.LJFF) {
                    this.LJIIL();
                    return;
                }
            }
        }
        this.j_();
    }
    
    @Override
    public final void LIZ(final int n) {
        super.LIZ(n);
        if (n == 1 && !this.LIZ(this.getInteractId())) {
            this.getMPrepareAvatar().setVisibility(8);
        }
        if (!this.LJI()) {
            final 1si mAvatarBackground = this.getMAvatarBackground();
            if (mAvatarBackground != null) {
                mAvatarBackground.setVisibility(8);
            }
        }
    }
    
    @Override
    public final void LIZ(final int n, final long n2) {
        super.LIZ(n, n2);
    }
    
    @Override
    public final void LIZ(final 1lw 1lw) {
        CTM.LIZ((Object)1lw);
    }
    
    @Override
    public final void LIZ(final Vvh window) {
        MethodCollector.i(9203);
        CTM.LIZ((Object)window);
        0sM.LIZ((View)this);
        this.setWindow(window);
        window.LJ().removeAllViews();
        window.LJ().addView((View)this);
        MethodCollector.o(9203);
    }
    
    public final void LIZ(final ImageModel imageModel) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            final G18 liz = 0cp.LIZ();
            0cq.LIZ(liz, imageModel);
            liz.LIZIZ(2131234398);
            final 1si 1si = (1si)this.LIZIZ(2131368952);
            n.LIZIZ((Object)1si, "");
            final int width = 1si.getWidth();
            final 1si 1si2 = (1si)this.LIZIZ(2131368952);
            n.LIZIZ((Object)1si2, "");
            liz.LIZ(width, 1si2.getHeight());
            liz.LIZ(Boolean.valueOf(true));
            liz.LIZ(this.LIZIZ(2131368952));
            return;
        }
        final ImageView imageView = (ImageView)this.LIZIZ(2131368952);
        final 1si 1si3 = (1si)this.LIZIZ(2131368952);
        n.LIZIZ((Object)1si3, "");
        final int width2 = 1si3.getWidth();
        final 1si 1si4 = (1si)this.LIZIZ(2131368952);
        n.LIZIZ((Object)1si4, "");
        HFv.LIZ(imageView, imageModel, width2, 1si4.getHeight(), 2131234398);
    }
    
    public final void LIZ(final ImageModel imageModel, final 1si 1si) {
        final Qya qya = new Qya(5);
        if (0cp.LIZ(imageModel)) {
            while (true) {
                Label_0083: {
                    if (imageModel == null) {
                        break Label_0083;
                    }
                    final List<String> urls = imageModel.getUrls();
                    if (urls == null) {
                        break Label_0083;
                    }
                    final String s = (String)Qsi.LJIIJJI((List)urls);
                    final S8f liz = S8f.LIZ(Uri.parse(s));
                    liz.LJIIJ = (Qys)qya;
                    final S8e liz2 = liz.LIZ();
                    final SAp liziz = SBH.LIZIZ();
                    ((SDU)liziz).LIZIZ((Object)liz2);
                    ((SDU)liziz).LIZ(((SEd)1si).getController());
                    ((SEd)1si).setController((SDe)((SDU)liziz).LIZJ());
                    return;
                }
                final String s = null;
                continue;
            }
        }
        final S8f liz3 = S8f.LIZ(Ql3.LIZ(2131234398));
        liz3.LJIIJ = (Qys)qya;
        final S8e liz4 = liz3.LIZ();
        final SAp liziz2 = SBH.LIZIZ();
        ((SDU)liziz2).LIZIZ((Object)liz4);
        ((SDU)liziz2).LIZ(((SEd)1si).getController());
        ((SEd)1si).setController((SDe)((SDU)liziz2).LIZJ());
    }
    
    @Override
    public final void LIZ(final User ljii) {
        public final class 0sy implements Runnable
        {
            public final /* synthetic */ 22n LIZ;
            public final /* synthetic */ User LIZIZ;
            
            static {
                Covode.recordClassIndex(9059);
            }
            
            public 0sy(final 22n liz, final User liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                final User liziz = this.LIZIZ;
                ImageModel avatarThumb;
                if (liziz != null) {
                    avatarThumb = liziz.getAvatarThumb();
                }
                else {
                    avatarThumb = null;
                }
                this.LIZ.LIZ(avatarThumb);
                final 22n liz = this.LIZ;
                final 1si 1si = (1si)liz.LIZIZ(2131368955);
                n.LIZIZ((Object)1si, "");
                liz.LIZ(avatarThumb, 1si);
                final 22n liz2 = this.LIZ;
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    final G18 liz3 = 0cp.LIZ();
                    0cq.LIZ(liz3, avatarThumb);
                    liz3.LIZIZ(2131234398);
                    liz3.LIZ(liz2.getMPrepareAvatar().getWidth(), liz2.getMPrepareAvatar().getHeight());
                    liz3.LIZ(Boolean.valueOf(true));
                    liz3.LIZ((View)liz2.getMPrepareAvatar());
                }
                else if (liz2.getMPrepareAvatar() != null) {
                    HFv.LIZ(liz2.getMPrepareAvatar(), avatarThumb, liz2.getMPrepareAvatar().getWidth(), liz2.getMPrepareAvatar().getHeight(), 2131234398);
                }
                final 22n liz4 = this.LIZ;
                liz4.LIZ(avatarThumb, liz4.getMAvatarBackground());
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokespecial   X/1lw.LIZ:(Lcom/bytedance/android/live/base/model/user/User;)V
        //     5: aload_0        
        //     6: new             LX/0sy;
        //     9: dup            
        //    10: aload_0        
        //    11: aload_1        
        //    12: invokespecial   X/0sy.<init>:(LX/22n;Lcom/bytedance/android/live/base/model/user/User;)V
        //    15: invokestatic    X/0sM.LIZ:(Landroid/view/View;Ljava/lang/Runnable;)V
        //    18: aload_0        
        //    19: invokevirtual   X/1lw.getMOnlineName:()Landroid/widget/TextView;
        //    22: astore_2       
        //    23: aload_2        
        //    24: ifnull          35
        //    27: aload_2        
        //    28: aload_1        
        //    29: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;)Ljava/lang/String;
        //    32: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    35: aload_0        
        //    36: aload_1        
        //    37: putfield        X/22n.LJII:Lcom/bytedance/android/live/base/model/user/User;
        //    40: return         
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
    public final void LIZ(final boolean b) {
    }
    
    @Override
    public final View LIZIZ(final int n) {
        if (this.LJIILL == null) {
            this.LJIILL = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJIILL.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LJIILL.put(n, viewById);
        }
        return viewById;
    }
    
    @Override
    public final void LIZIZ() {
        super.LIZIZ();
        if (this.LJI()) {
            final 1si mAvatarBackground = this.getMAvatarBackground();
            if (mAvatarBackground != null) {
                mAvatarBackground.setVisibility(0);
            }
        }
        else {
            final 1si mAvatarBackground2 = this.getMAvatarBackground();
            if (mAvatarBackground2 != null) {
                mAvatarBackground2.setVisibility(8);
            }
        }
        super.LJI = this.findViewById(2131368953);
        final View lji = super.LJI;
        if (lji != null) {
            lji.setOnClickListener((View$OnClickListener)new 0sk(this));
        }
        this.LJIIIIZZ();
    }
    
    public final void LIZIZ(final boolean b) {
        final 1JD 1jd = (1JD)this.LIZIZ(2131368954);
        if (1jd != null) {
            final Integer value = 8;
            value.intValue();
            int intValue;
            if (b && value != null) {
                intValue = value;
            }
            else {
                intValue = 0;
            }
            1jd.setVisibility(intValue);
        }
        this.LJIIIIZZ();
    }
    
    @Override
    public final Long LIZJ() {
        final Vwg ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            return ljiijji.LIZIZ;
        }
        return null;
    }
    
    public final void LIZJ(final boolean b) {
        if (b) {
            final 1si 1si = (1si)this.LIZIZ(2131368952);
            n.LIZIZ((Object)1si, "");
            1si.setVisibility(8);
            final 1si 1si2 = (1si)this.LIZIZ(2131368955);
            n.LIZIZ((Object)1si2, "");
            1si2.setVisibility(8);
            return;
        }
        final 1si 1si3 = (1si)this.LIZIZ(2131368952);
        n.LIZIZ((Object)1si3, "");
        1si3.setVisibility(0);
        final 1si 1si4 = (1si)this.LIZIZ(2131368955);
        n.LIZIZ((Object)1si4, "");
        1si4.setVisibility(0);
        this.LJIIJJI();
    }
    
    @Override
    public final void LIZLLL() {
        final boolean lji = this.LJI();
        boolean mNeedPrepareLoading = true;
        if ((!lji && this.LJII()) || this.getMHasLoadingFinished$liveinteract_impl_release()) {
            mNeedPrepareLoading = false;
        }
        this.setMNeedPrepareLoading(mNeedPrepareLoading);
    }
    
    @Override
    public final void LJFF() {
        if (this.LJI()) {
            0uW.LIZJ.LIZLLL("anchor", "connection_windows");
            final String liz = 0cB.LIZ(2131829540, 0W3.LIZ(this.LJII));
            if (this.LJII != null) {
                final LiveDialog.a a = new LiveDialog.a((Context)0jz.LIZIZ().getTopActivity());
                a.LIZJ = liz;
                a.LIZJ(2131829541);
                a.LIZ(2131829529, (LiveDialog.b)new 1XV(this));
                a.LIZIZ(2131831455, (LiveDialog.b)1XW.LIZ);
                final LiveDialog liziz = a.LIZIZ();
                liziz.show();
                KN6.LIZ.LIZ((Dialog)liziz);
            }
            return;
        }
        0uW.LIZJ.LIZLLL("guest", "connection_windows");
        final DataChannel mDataChannel = this.getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.LIZJ((Class)2Fs.class, (Object)8sj.LIZ((Object)"profile_page", (Object)10001));
        }
    }
    
    public final void LJIIIIZZ() {
        if (this.LJIIJ == 0k8.NORMAL) {
            return;
        }
        final 1JD 1jd = (1JD)this.LIZIZ(2131368953);
        n.LIZIZ((Object)1jd, "");
        Object layoutParams;
        if (!((layoutParams = 1jd.getLayoutParams()) instanceof ConstraintLayout.a)) {
            layoutParams = null;
        }
        final ConstraintLayout.a layoutParams2 = (ConstraintLayout.a)layoutParams;
        final 1JD 1jd2 = (1JD)this.LIZIZ(2131368954);
        n.LIZIZ((Object)1jd2, "");
        Object layoutParams3;
        if (!((layoutParams3 = 1jd2.getLayoutParams()) instanceof ConstraintLayout.a)) {
            layoutParams3 = null;
        }
        final ConstraintLayout.a layoutParams4 = (ConstraintLayout.a)layoutParams3;
        Label_0514: {
            Object layoutParams5;
            if (this.LJIIJ == 0k8.GRID_FIX || this.LJIIJ == 0k8.GRID) {
                layoutParams5 = new ConstraintLayout.a(-2, -2);
                ((ConstraintLayout.a)layoutParams5).setMarginStart(0cB.LIZ(8.0f));
                ((ConstraintLayout.a)layoutParams5).setMarginEnd(0cB.LIZ(4.0f));
                ((ConstraintLayout.a)layoutParams5).topMargin = 0cB.LIZ(8.0f);
                ((ConstraintLayout.a)layoutParams5).startToStart = 2131368947;
                ((ConstraintLayout.a)layoutParams5).topToTop = 2131368947;
                ((ConstraintLayout.a)layoutParams5).constrainedWidth = true;
                ((ConstraintLayout.a)layoutParams5).horizontalBias = 0.0f;
                ((ConstraintLayout.a)layoutParams5).endToStart = 2131368954;
                if (layoutParams2 != null) {
                    layoutParams2.setMarginEnd(0cB.LIZ(8.0f));
                    layoutParams2.topMargin = 0cB.LIZ(8.0f);
                }
                if (layoutParams4 != null) {
                    layoutParams4.setMarginEnd(0cB.LIZ(8.0f));
                    layoutParams4.topMargin = 0cB.LIZ(8.0f);
                }
                final 1sp 1sp = (1sp)this.LIZIZ(2131368959);
                n.LIZIZ((Object)1sp, "");
                1sp.setTextSize(12.0f);
                final 1sp 1sp2 = (1sp)this.LIZIZ(2131368951);
                n.LIZIZ((Object)1sp2, "");
                1sp2.setTextSize(12.0f);
                final View liziz = this.LIZIZ(2131368961);
                n.LIZIZ((Object)liziz, "");
                liziz.setVisibility(0);
                final View liziz2 = this.LIZIZ(2131368945);
                n.LIZIZ((Object)liziz2, "");
                liziz2.setVisibility(8);
                final View liziz3 = this.LIZIZ(2131368961);
                n.LIZIZ((Object)liziz3, "");
                this.LIZ(48.0f, liziz3);
                this.LJIIJ();
                final ViewGroup$LayoutParams layoutParams6 = this.getWindow().LJ().getLayoutParams();
                int width;
                if (layoutParams6 != null) {
                    width = layoutParams6.width;
                }
                else {
                    width = 0;
                }
                if (width >= 0cB.LIZ(106.0f)) {
                    final 1JD 1jd3 = (1JD)this.LIZIZ(2131368954);
                    n.LIZIZ((Object)1jd3, "");
                    this.LIZ((View)1jd3, 20.0f);
                    final 1JD 1jd4 = (1JD)this.LIZIZ(2131368953);
                    n.LIZIZ((Object)1jd4, "");
                    this.LIZ((View)1jd4, 20.0f);
                    final 1si 1si = (1si)this.LIZIZ(2131368952);
                    n.LIZIZ((Object)1si, "");
                    this.LIZ((View)1si, 60.0f);
                    final 1si 1si2 = (1si)this.LIZIZ(2131368962);
                    n.LIZIZ((Object)1si2, "");
                    this.LIZ((View)1si2, 96.0f);
                }
                else {
                    final 1JD 1jd5 = (1JD)this.LIZIZ(2131368954);
                    n.LIZIZ((Object)1jd5, "");
                    this.LIZ((View)1jd5, 16.0f);
                    final 1JD 1jd6 = (1JD)this.LIZIZ(2131368953);
                    n.LIZIZ((Object)1jd6, "");
                    this.LIZ((View)1jd6, 16.0f);
                    final 1si 1si3 = (1si)this.LIZIZ(2131368952);
                    n.LIZIZ((Object)1si3, "");
                    this.LIZ((View)1si3, 40.0f);
                    final 1si 1si4 = (1si)this.LIZIZ(2131368962);
                    n.LIZIZ((Object)1si4, "");
                    this.LIZ((View)1si4, 64.0f);
                }
            }
            else {
                if (this.LJIIJ != 0k8.FLOATING && this.LJIIJ != 0k8.FLOATING_FIX) {
                    break Label_0514;
                }
                final ConstraintLayout.a a = new ConstraintLayout.a(-2, -1);
                a.bottomToBottom = 2131368947;
                a.startToStart = 2131368947;
                a.topToTop = 2131368947;
                a.constrainedWidth = true;
                a.horizontalBias = 0.0f;
                a.endToStart = 2131368954;
                final View liziz4 = this.LIZIZ(2131368961);
                n.LIZIZ((Object)liziz4, "");
                liziz4.setVisibility(0);
                final View liziz5 = this.LIZIZ(2131368945);
                n.LIZIZ((Object)liziz5, "");
                liziz5.setVisibility(0);
                final View liziz6 = this.LIZIZ(2131368961);
                n.LIZIZ((Object)liziz6, "");
                this.LIZ(30.0f, liziz6);
                final View liziz7 = this.LIZIZ(2131368945);
                n.LIZIZ((Object)liziz7, "");
                this.LIZ(30.0f, liziz7);
                this.LJIIIZ();
                final ViewGroup$LayoutParams layoutParams7 = this.getWindow().LJ().getLayoutParams();
                int width2;
                if (layoutParams7 != null) {
                    width2 = layoutParams7.width;
                }
                else {
                    width2 = 0;
                }
                if (width2 >= 0cB.LIZ(106.0f)) {
                    a.setMarginStart(0cB.LIZ(8.0f));
                    a.topMargin = 0cB.LIZ(8.0f);
                    a.setMarginEnd(0cB.LIZ(4.0f));
                    a.bottomMargin = 0cB.LIZ(8.0f);
                    final 1sp 1sp3 = (1sp)this.LIZIZ(2131368959);
                    n.LIZIZ((Object)1sp3, "");
                    1sp3.setTextSize(12.0f);
                    final 1sp 1sp4 = (1sp)this.LIZIZ(2131368951);
                    n.LIZIZ((Object)1sp4, "");
                    1sp4.setTextSize(12.0f);
                    final 1JD 1jd7 = (1JD)this.LIZIZ(2131368954);
                    n.LIZIZ((Object)1jd7, "");
                    this.LIZ((View)1jd7, 16.0f);
                    final 1JD 1jd8 = (1JD)this.LIZIZ(2131368953);
                    n.LIZIZ((Object)1jd8, "");
                    this.LIZ((View)1jd8, 16.0f);
                    final 1si 1si5 = (1si)this.LIZIZ(2131368952);
                    n.LIZIZ((Object)1si5, "");
                    this.LIZ((View)1si5, 60.0f);
                    final 1si 1si6 = (1si)this.LIZIZ(2131368962);
                    n.LIZIZ((Object)1si6, "");
                    this.LIZ((View)1si6, 96.0f);
                    if (layoutParams2 != null) {
                        layoutParams2.setMarginEnd(0cB.LIZ(7.0f));
                        layoutParams2.topMargin = 0cB.LIZ(8.0f);
                    }
                    layoutParams5 = a;
                    if (layoutParams4 != null) {
                        layoutParams4.setMarginEnd(0cB.LIZ(7.0f));
                        layoutParams4.topMargin = 0cB.LIZ(8.0f);
                        layoutParams5 = a;
                    }
                }
                else {
                    a.setMarginStart(0cB.LIZ(4.0f));
                    a.topMargin = 0cB.LIZ(4.0f);
                    a.setMarginEnd(0cB.LIZ(2.0f));
                    a.bottomMargin = 0cB.LIZ(4.0f);
                    final 1sp 1sp5 = (1sp)this.LIZIZ(2131368959);
                    n.LIZIZ((Object)1sp5, "");
                    1sp5.setTextSize(10.0f);
                    final 1sp 1sp6 = (1sp)this.LIZIZ(2131368951);
                    n.LIZIZ((Object)1sp6, "");
                    1sp6.setTextSize(10.0f);
                    final 1JD 1jd9 = (1JD)this.LIZIZ(2131368954);
                    n.LIZIZ((Object)1jd9, "");
                    this.LIZ((View)1jd9, 14.0f);
                    final 1JD 1jd10 = (1JD)this.LIZIZ(2131368953);
                    n.LIZIZ((Object)1jd10, "");
                    this.LIZ((View)1jd10, 14.0f);
                    final 1si 1si7 = (1si)this.LIZIZ(2131368952);
                    n.LIZIZ((Object)1si7, "");
                    this.LIZ((View)1si7, 40.0f);
                    final 1si 1si8 = (1si)this.LIZIZ(2131368962);
                    n.LIZIZ((Object)1si8, "");
                    this.LIZ((View)1si8, 64.0f);
                    if (layoutParams2 != null) {
                        layoutParams2.setMarginEnd(0cB.LIZ(3.0f));
                        layoutParams2.topMargin = 0cB.LIZ(4.0f);
                    }
                    layoutParams5 = a;
                    if (layoutParams4 != null) {
                        layoutParams4.setMarginEnd(0cB.LIZ(3.0f));
                        layoutParams4.topMargin = 0cB.LIZ(4.0f);
                        layoutParams5 = a;
                    }
                }
            }
            ((ConstraintLayout.a)layoutParams5).constrainedWidth = true;
            ((ConstraintLayout.a)layoutParams5).horizontalBias = 0.0f;
            ((ConstraintLayout.a)layoutParams5).horizontalChainStyle = 0;
            final ConstraintLayout constraintLayout = (ConstraintLayout)this.LIZIZ(2131367391);
            n.LIZIZ((Object)constraintLayout, "");
            constraintLayout.setLayoutParams((ViewGroup$LayoutParams)layoutParams5);
        }
        final ConstraintLayout constraintLayout2 = (ConstraintLayout)this.LIZIZ(2131367391);
        n.LIZIZ((Object)constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        if (layoutParams2 != null) {
            final 1JD 1jd11 = (1JD)this.LIZIZ(2131368953);
            n.LIZIZ((Object)1jd11, "");
            1jd11.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        }
        if (layoutParams4 != null) {
            final 1JD 1jd12 = (1JD)this.LIZIZ(2131368954);
            n.LIZIZ((Object)1jd12, "");
            1jd12.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
        }
    }
    
    public final 1Uo getMDataHolder() {
        final 1Uo ljiiiz = this.LJIIIZ;
        if (ljiiiz == null) {
            n.LIZ("");
        }
        return ljiiiz;
    }
    
    public final 0k8 getMType() {
        return this.LJIIJ;
    }
    
    public final Vwg getMUser() {
        return this.LJIIJJI;
    }
    
    public final int getPosition() {
        return this.LJIILIIL;
    }
    
    public final Vv3 getState() {
        return this.LJIIL;
    }
    
    public final 0r4 getTalkVolumeAnimHandler() {
        return (0r4)this.LJIILJJIL.getValue();
    }
    
    @Override
    public final void onAttachedToWindow() {
        public final class 22h extends F5g implements SRS<Boolean, 2P9>
        {
            public final /* synthetic */ 22n LIZ;
            
            static {
                Covode.recordClassIndex(9052);
            }
            
            public 22h(final 22n liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 22l extends F5g implements SRS<1NR, 2P9>
        {
            public final /* synthetic */ 22n LIZ;
            
            static {
                Covode.recordClassIndex(9056);
            }
            
            public 22l(final 22n liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 22k extends F5g implements SRS<1aM, 2P9>
        {
            public final /* synthetic */ 22n LIZ;
            
            static {
                Covode.recordClassIndex(9055);
            }
            
            public 22k(final 22n liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 22j extends F5g implements SRS<1aH, 2P9>
        {
            public final /* synthetic */ 22n LIZ;
            
            static {
                Covode.recordClassIndex(9054);
            }
            
            public 22j(final 22n liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 22i extends F5g implements SRS<Boolean, 2P9>
        {
            public final /* synthetic */ 22n LIZ;
            
            static {
                Covode.recordClassIndex(9053);
            }
            
            public 22i(final 22n liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/1lw.onAttachedToWindow:()V
        //     4: aload_0        
        //     5: invokevirtual   X/1lw.getMDataChannel:()Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ifnull          71
        //    13: aload_0        
        //    14: invokevirtual   X/1lw.LJII:()Z
        //    17: ifeq            181
        //    20: aload_1        
        //    21: aload_0        
        //    22: ldc_w           LX/2G9;.class
        //    25: new             LX/22h;
        //    28: dup            
        //    29: aload_0        
        //    30: invokespecial   X/22h.<init>:(LX/22n;)V
        //    33: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    36: pop            
        //    37: aload_1        
        //    38: aload_0        
        //    39: ldc_w           LX/2GA;.class
        //    42: new             LX/22i;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   X/22i.<init>:(LX/22n;)V
        //    50: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    53: pop            
        //    54: aload_1        
        //    55: aload_0        
        //    56: ldc_w           LX/2ET;.class
        //    59: new             LX/22l;
        //    62: dup            
        //    63: aload_0        
        //    64: invokespecial   X/22l.<init>:(LX/22n;)V
        //    67: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    70: pop            
        //    71: aload_0        
        //    72: aload_0        
        //    73: aload_0        
        //    74: invokevirtual   X/1lw.getInteractId:()Ljava/lang/String;
        //    77: invokespecial   X/22n.LIZ:(Ljava/lang/String;)Z
        //    80: iconst_1       
        //    81: ixor           
        //    82: invokevirtual   X/22n.LIZJ:(Z)V
        //    85: aload_0        
        //    86: getfield        X/22n.LJIIIZ:LX/1Uo;
        //    89: astore_1       
        //    90: aload_1        
        //    91: ifnonnull       160
        //    94: ldc             ""
        //    96: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    99: iconst_0       
        //   100: istore_2       
        //   101: aload_0        
        //   102: iload_2        
        //   103: iconst_1       
        //   104: ixor           
        //   105: invokevirtual   X/22n.LIZIZ:(Z)V
        //   108: aload_0        
        //   109: getstatic       X/0sD.LIZJ:LX/0sC;
        //   112: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   115: invokevirtual   X/0sD.LJIIIIZZ:()LX/0k8;
        //   118: putfield        X/22n.LJIIJ:LX/0k8;
        //   121: aload_0        
        //   122: invokevirtual   X/22n.LJIIIIZZ:()V
        //   125: aload_0        
        //   126: invokevirtual   X/1lw.getMDataChannel:()Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   129: astore_1       
        //   130: aload_1        
        //   131: ifnull          146
        //   134: aload_1        
        //   135: ldc_w           LX/2GG;.class
        //   138: iconst_3       
        //   139: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   142: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZJ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   145: pop            
        //   146: getstatic       X/0qj.LJIIIIZZ:Z
        //   149: ifeq            159
        //   152: getstatic       X/0ql.LIZ:LX/0ql;
        //   155: aload_0        
        //   156: invokevirtual   X/0ql.LIZ:(Landroid/view/View;)V
        //   159: return         
        //   160: aload_1        
        //   161: aload_0        
        //   162: invokevirtual   X/1lw.getInteractId:()Ljava/lang/String;
        //   165: invokevirtual   X/1Uo.LJ:(Ljava/lang/String;)Ljava/lang/Boolean;
        //   168: astore_1       
        //   169: aload_1        
        //   170: ifnull          99
        //   173: aload_1        
        //   174: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   177: istore_2       
        //   178: goto            101
        //   181: aload_1        
        //   182: aload_0        
        //   183: ldc_w           LX/2GC;.class
        //   186: new             LX/22j;
        //   189: dup            
        //   190: aload_0        
        //   191: invokespecial   X/22j.<init>:(LX/22n;)V
        //   194: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   197: pop            
        //   198: aload_1        
        //   199: aload_0        
        //   200: ldc_w           LX/2GD;.class
        //   203: new             LX/22k;
        //   206: dup            
        //   207: aload_0        
        //   208: invokespecial   X/22k.<init>:(LX/22n;)V
        //   211: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   214: pop            
        //   215: goto            54
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
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final DataChannel mDataChannel = this.getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.LIZIZ((Object)this);
        }
        if (this.LJIIIIZZ) {
            this.getTalkVolumeAnimHandler().LIZ = true;
        }
    }
    
    public final void setMDataHolder(final 1Uo ljiiiz) {
        CTM.LIZ((Object)ljiiiz);
        this.LJIIIZ = ljiiiz;
    }
    
    public final void setMType(final 0k8 ljiij) {
        this.LJIIJ = ljiij;
    }
    
    public final void setMUser(final Vwg ljiijji) {
        this.LJIIJJI = ljiijji;
    }
    
    public final void setPosition(final int ljiiliil) {
        this.LJIILIIL = ljiiliil;
    }
    
    public final void setState(final Vv3 ljiil) {
        CTM.LIZ((Object)ljiil);
        this.LJIIL = ljiil;
    }
}
