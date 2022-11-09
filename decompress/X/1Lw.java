// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.SurfaceView;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.livesetting.linkmic.OneVNLeaveLinkMicV1SwitchSetting;
import android.os.Message;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.view.View$OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import java.util.Objects;
import java.util.Locale;
import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.WeakHandler;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.WeakHandler$IHandler;
import android.widget.FrameLayout;

public class 1lw extends FrameLayout implements b, 0uU, WeakHandler$IHandler
{
    public 1si LIZ;
    public ImageView LIZIZ;
    public HoY LIZJ;
    public TextView LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public View LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public TextView LJIIJJI;
    public ImageView LJIIL;
    public final WeakHandler LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public FH6 LJIILLIIL;
    public boolean LJIIZILJ;
    public ViewGroup LJIJ;
    public ViewGroup LJIJI;
    public Vvh LJIJJ;
    public final String LJIJJLI;
    public 0qc.a LJIL;
    public a LJJ;
    public final DataChannel LJJI;
    public HashMap LJJIFFI;
    
    static {
        Covode.recordClassIndex(8999);
    }
    
    public 1lw(final Vvh ljijj, final String ljijjli, final 0qc.a ljil, final a ljj, final DataChannel ljji) {
        CTM.LIZ((Object)ljijj, (Object)ljijjli);
        super(ljijj.LJ().getContext());
        MethodCollector.i(9165);
        this.LJIJJ = ljijj;
        this.LJIJJLI = ljijjli;
        this.LJIL = ljil;
        this.LJJ = ljj;
        this.LJJI = ljji;
        this.LJIILIIL = new WeakHandler((WeakHandler$IHandler)this);
        this.LJIILLIIL = new FH6();
        MethodCollector.o(9165);
    }
    
    public void LIZ() {
        this.j_();
    }
    
    public void LIZ(final int n) {
        if (n == 1) {
            final ViewGroup ljij = this.LJIJ;
            if (ljij != null) {
                ljij.setVisibility(0);
            }
            final ViewGroup ljiji = this.LJIJI;
            if (ljiji != null) {
                ljiji.setVisibility(8);
            }
            final HoY lizj = this.LIZJ;
            if (lizj == null) {
                n.LIZ("");
            }
            lizj.setVisibility(0);
            this.LJIILIIL.sendEmptyMessageDelayed(0, 1000L);
            return;
        }
        if (n == 2) {
            final ViewGroup ljiji2 = this.LJIJI;
            if (ljiji2 != null) {
                ljiji2.setVisibility(0);
            }
            final ViewGroup ljij2 = this.LJIJ;
            if (ljij2 != null) {
                ljij2.setVisibility(8);
            }
            final HoY lizj2 = this.LIZJ;
            if (lizj2 == null) {
                n.LIZ("");
            }
            else {
                GlD.LIZ((View)lizj2);
            }
            return;
        }
        if (n != 3) {
            if (n == 4) {
                final ViewGroup ljiji3 = this.LJIJI;
                if (ljiji3 != null) {
                    ljiji3.setVisibility(8);
                }
                final ViewGroup ljij3 = this.LJIJ;
                if (ljij3 != null) {
                    ljij3.setVisibility(8);
                }
            }
            return;
        }
        final ViewGroup ljij4 = this.LJIJ;
        if (ljij4 != null) {
            ljij4.setVisibility(0);
        }
        final ViewGroup ljiji4 = this.LJIJI;
        if (ljiji4 != null) {
            ljiji4.setVisibility(8);
        }
        this.LJIILIIL.sendEmptyMessage(1);
        final String liziz = this.LJIJJ.LIZIZ();
        if (liziz != null) {
            1XX.LJI.put(liziz, false);
        }
    }
    
    public void LIZ(int imageResource, final long n) {
        int n2 = 1;
        Label_0043: {
            if (imageResource != 1) {
                final DataChannel ljji = this.LJJI;
                if (ljji != null) {
                    final Integer n3 = (Integer)ljji.LIZIZ((Class)2G3.class);
                    if (n3 != null && n3 == 1) {
                        n2 = n2;
                        break Label_0043;
                    }
                }
                n2 = 0;
            }
        }
        final ImageView ljiil = this.LJIIL;
        if (ljiil == null) {
            n.LIZ("");
        }
        if (n2 != 0) {
            imageResource = 2131234437;
        }
        else {
            imageResource = 2131234438;
        }
        ljiil.setImageResource(imageResource);
        final String liz = GKY.LIZ(n);
        n.LIZIZ((Object)liz, "");
        final Locale root = Locale.ROOT;
        n.LIZIZ((Object)root, "");
        Objects.requireNonNull(liz, "null cannot be cast to non-null type java.lang.String");
        final String upperCase = liz.toUpperCase(root);
        n.LIZIZ((Object)upperCase, "");
        final TextView ljiijji = this.LJIIJJI;
        if (ljiijji == null) {
            n.LIZ("");
        }
        if (n.LIZ((Object)upperCase, (Object)ljiijji.getText().toString())) {
            return;
        }
        final TextView ljiijji2 = this.LJIIJJI;
        if (ljiijji2 == null) {
            n.LIZ("");
        }
        ljiijji2.setText((CharSequence)upperCase);
    }
    
    public void LIZ(final User user) {
    }
    
    public void LIZ(final boolean b) {
        if (b && !this.LJ) {
            final View ljiiiz = this.LJIIIZ;
            if (ljiiiz == null) {
                n.LIZ("");
            }
            final 0qc.a ljil = this.LJIL;
            int visibility;
            if (ljil != null && ljil.LJFF()) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            ljiiiz.setVisibility(visibility);
            final View ljiij = this.LJIIJ;
            if (ljiij == null) {
                n.LIZ("");
            }
            ljiij.setVisibility(0);
            return;
        }
        final View ljiiiz2 = this.LJIIIZ;
        if (ljiiiz2 == null) {
            n.LIZ("");
        }
        ljiiiz2.setVisibility(8);
        final View ljiij2 = this.LJIIJ;
        if (ljiij2 == null) {
            n.LIZ("");
        }
        ljiij2.setVisibility(8);
    }
    
    public View LIZIZ(final int n) {
        if (this.LJJIFFI == null) {
            this.LJJIFFI = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJJIFFI.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LJJIFFI.put(n, viewById);
        }
        return viewById;
    }
    
    public void LIZIZ() {
        public final class 0sn implements View$OnClickListener
        {
            public final /* synthetic */ 1lw LIZ;
            
            static {
                Covode.recordClassIndex(9005);
            }
            
            public 0sn(final 1lw liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.LJFF();
            }
        }
        public final class 0sm implements View$OnClickListener
        {
            public final /* synthetic */ 1lw LIZ;
            
            static {
                Covode.recordClassIndex(9004);
            }
            
            public 0sm(final 1lw liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.k_();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           2131369587
        //     4: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //     7: astore_1       
        //     8: aload_1        
        //     9: ldc             ""
        //    11: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0        
        //    15: aload_1        
        //    16: checkcast       LX/1si;
        //    19: putfield        X/1lw.LIZ:LX/1si;
        //    22: aload_0        
        //    23: ldc_w           2131369586
        //    26: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //    29: astore_1       
        //    30: aload_1        
        //    31: ldc             ""
        //    33: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    36: aload_0        
        //    37: aload_1        
        //    38: checkcast       Landroid/widget/ImageView;
        //    41: putfield        X/1lw.LIZIZ:Landroid/widget/ImageView;
        //    44: aload_0        
        //    45: aload_0        
        //    46: ldc_w           2131369588
        //    49: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //    52: checkcast       Landroid/view/ViewGroup;
        //    55: putfield        X/1lw.LJIJ:Landroid/view/ViewGroup;
        //    58: aload_0        
        //    59: ldc_w           2131368000
        //    62: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //    65: astore_1       
        //    66: aload_1        
        //    67: ldc             ""
        //    69: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    72: aload_0        
        //    73: aload_1        
        //    74: checkcast       LX/HoY;
        //    77: putfield        X/1lw.LIZJ:LX/HoY;
        //    80: aload_0        
        //    81: ldc_w           2131368958
        //    84: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //    87: astore_1       
        //    88: aload_1        
        //    89: ldc             ""
        //    91: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    94: aload_0        
        //    95: aload_1        
        //    96: putfield        X/1lw.LJIIIZ:Landroid/view/View;
        //    99: aload_1        
        //   100: ifnonnull       108
        //   103: ldc             ""
        //   105: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   108: aload_1        
        //   109: new             LX/0sm;
        //   112: dup            
        //   113: aload_0        
        //   114: invokespecial   X/0sm.<init>:(LX/1lw;)V
        //   117: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   120: aload_0        
        //   121: ldc_w           2131368946
        //   124: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //   127: astore_1       
        //   128: aload_1        
        //   129: ldc             ""
        //   131: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   134: aload_0        
        //   135: aload_1        
        //   136: putfield        X/1lw.LJIIJ:Landroid/view/View;
        //   139: aload_1        
        //   140: ifnonnull       148
        //   143: ldc             ""
        //   145: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   148: aload_1        
        //   149: new             LX/0sn;
        //   152: dup            
        //   153: aload_0        
        //   154: invokespecial   X/0sn.<init>:(LX/1lw;)V
        //   157: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   160: aload_0        
        //   161: ldc_w           2131368951
        //   164: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //   167: astore_1       
        //   168: aload_1        
        //   169: ldc             ""
        //   171: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   174: aload_0        
        //   175: aload_1        
        //   176: checkcast       Landroid/widget/TextView;
        //   179: putfield        X/1lw.LIZLLL:Landroid/widget/TextView;
        //   182: aload_0        
        //   183: ldc_w           2131368959
        //   186: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //   189: astore_1       
        //   190: aload_1        
        //   191: ldc             ""
        //   193: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   196: aload_0        
        //   197: aload_1        
        //   198: checkcast       Landroid/widget/TextView;
        //   201: putfield        X/1lw.LJIIJJI:Landroid/widget/TextView;
        //   204: aload_0        
        //   205: ldc_w           2131368960
        //   208: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //   211: astore_1       
        //   212: aload_1        
        //   213: ldc             ""
        //   215: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   218: aload_0        
        //   219: aload_1        
        //   220: checkcast       Landroid/widget/ImageView;
        //   223: putfield        X/1lw.LJIIL:Landroid/widget/ImageView;
        //   226: aload_0        
        //   227: aload_0        
        //   228: ldc_w           2131368947
        //   231: invokevirtual   X/1lw.findViewById:(I)Landroid/view/View;
        //   234: checkcast       Landroid/view/ViewGroup;
        //   237: putfield        X/1lw.LJIJI:Landroid/view/ViewGroup;
        //   240: aload_0        
        //   241: iconst_1       
        //   242: putfield        X/1lw.LJIIZILJ:Z
        //   245: return         
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
    
    public final boolean LJ() {
        return this.LJIILL;
    }
    
    public void LJFF() {
    }
    
    public final boolean LJI() {
        final DataChannel ljji = this.LJJI;
        while (true) {
            Label_0055: {
                if (ljji == null) {
                    break Label_0055;
                }
                final Room room = (Room)ljji.LIZIZ((Class)G69.class);
                if (room == null) {
                    break Label_0055;
                }
                final long ownerUserId = room.getOwnerUserId();
                final GIK liziz = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz, "");
                return ownerUserId == liziz.LIZJ();
            }
            final long ownerUserId = 0L;
            continue;
        }
    }
    
    public final boolean LJII() {
        final 0qc.a ljil = this.LJIL;
        if (ljil == null || !ljil.LJ()) {
            final long lizlll = this.LJIJJ.LIZLLL();
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            if (lizlll != liziz.LIZJ()) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean getAdjustParent() {
        return this.LJIILL;
    }
    
    public final boolean getHasInit() {
        return this.LJIIZILJ;
    }
    
    public final String getInteractId() {
        return this.LJIJJLI;
    }
    
    public final boolean getMAttachedToWindow$liveinteract_impl_release() {
        return this.LJFF;
    }
    
    public final 1si getMAvatarBackground() {
        final 1si liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz;
    }
    
    public final boolean getMCurrentUserIsLinkedGuest() {
        return this.LJ;
    }
    
    public final DataChannel getMDataChannel() {
        return this.LJJI;
    }
    
    public final boolean getMHasCountDownFinished$liveinteract_impl_release() {
        return this.LJII;
    }
    
    public final boolean getMHasLoadingFinished$liveinteract_impl_release() {
        return this.LJIIIIZZ;
    }
    
    public final HoY getMLoadingView() {
        final HoY lizj = this.LIZJ;
        if (lizj == null) {
            n.LIZ("");
        }
        return lizj;
    }
    
    public final boolean getMNeedPrepareLoading() {
        return this.LJIILJJIL;
    }
    
    public final TextView getMOnlineName() {
        final TextView lizlll = this.LIZLLL;
        if (lizlll == null) {
            n.LIZ("");
        }
        return lizlll;
    }
    
    public final ImageView getMPrepareAvatar() {
        final ImageView liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        return liziz;
    }
    
    public final ViewGroup getMPrepareViewContainer$liveinteract_impl_release() {
        return this.LJIJ;
    }
    
    public final 0qc.a getMPresenter() {
        return this.LJIL;
    }
    
    public final Vvh getWindow() {
        return this.LJIJJ;
    }
    
    public int getWindowLayoutId() {
        return 2131562400;
    }
    
    public void handleMsg(final Message message) {
        CTM.LIZ((Object)message);
        final int what = message.what;
        if (what != 0) {
            if (what == 1) {
                if (this.LJII()) {
                    final DataChannel ljji = this.LJJI;
                    if (ljji != null) {
                        ljji.LIZJ((Class)2Ea.class, (Object)new Fgf(5));
                    }
                    this.LIZ(4);
                    if (!OneVNLeaveLinkMicV1SwitchSetting.INSTANCE.getValue()) {
                        final a ljj = this.LJJ;
                        if (ljj != null) {
                            ljj.LIZ(this);
                        }
                    }
                }
                else {
                    this.LIZ(4);
                    final a ljj2 = this.LJJ;
                    if (ljj2 != null) {
                        ljj2.LIZ(this);
                    }
                    5ob.LIZ.LIZ(this.LJIJJLI);
                    final DataChannel ljji2 = this.LJJI;
                    if (ljji2 != null) {
                        ljji2.LIZJ((Class)2Fh.class);
                    }
                }
            }
            return;
        }
        this.LJII = true;
        final DataChannel ljji3 = this.LJJI;
        if (ljji3 != null) {
            ljji3.LIZIZ((Class)2GV.class, (Object)this.LJIJJLI);
        }
        if (n.LIZ((Object)1XX.LJI.get(this.LJIJJ.LIZIZ()), (Object)true) ^ true) {
            this.LIZ(1);
            return;
        }
        this.LIZ(2);
    }
    
    public final void j_() {
        final DataChannel ljji = this.LJJI;
        if (ljji != null) {
            final Room room = (Room)ljji.LIZIZ((Class)G69.class);
            if (room != null) {
                final RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                boolean b = false;
                while (true) {
                    Label_0251: {
                        if (roomAuthStatus == null) {
                            break Label_0251;
                        }
                        final RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                        n.LIZIZ((Object)roomAuthStatus2, "");
                        if (!roomAuthStatus2.isEnableGift()) {
                            break Label_0251;
                        }
                        final boolean b2 = true;
                        final Boolean b3 = (Boolean)this.LJJI.LIZIZ((Class)G5l.class);
                        final boolean b4 = b3 != null && b3;
                        final IWalletCenter walletCenter = 0jR.LIZ(IWalletService.class).walletCenter();
                        n.LIZIZ((Object)walletCenter, "");
                        if (walletCenter.LIZIZ() > 0L) {
                            b = true;
                        }
                        final H5c liz = H5b.LIZ(b4, b, b2);
                        if (liz != H5c.GREY && liz != H5c.HIDE) {
                            final 0qc.a ljil = this.LJIL;
                            User liz2 = null;
                            if (ljil != null && ljil.LIZ() != null) {
                                final 0qc.a ljil2 = this.LJIL;
                                if (ljil2 != null) {
                                    liz2 = ljil2.LIZ();
                                }
                                final HDy hDy = new HDy(liz2);
                                hDy.LIZIZ = "anchor_link_guest";
                                hDy.LJFF = 0ql.LIZ.LJ();
                                this.LJJI.LIZJ((Class)2Dh.class, (Object)hDy);
                            }
                            return;
                        }
                        if (room.getRoomAuthStatus() == null) {
                            return;
                        }
                        final RoomAuthStatus roomAuthStatus3 = room.getRoomAuthStatus();
                        n.LIZIZ((Object)roomAuthStatus3, "");
                        if (roomAuthStatus3.getRoomAuthOffReasons() == null) {
                            return;
                        }
                        final RoomAuthStatus roomAuthStatus4 = room.getRoomAuthStatus();
                        n.LIZIZ((Object)roomAuthStatus4, "");
                        final RoomAuthOffReasons roomAuthOffReasons = roomAuthStatus4.getRoomAuthOffReasons();
                        n.LIZIZ((Object)roomAuthOffReasons, "");
                        if (roomAuthOffReasons.getGift() != null) {
                            final RoomAuthStatus roomAuthStatus5 = room.getRoomAuthStatus();
                            n.LIZIZ((Object)roomAuthStatus5, "");
                            final RoomAuthOffReasons roomAuthOffReasons2 = roomAuthStatus5.getRoomAuthOffReasons();
                            n.LIZIZ((Object)roomAuthOffReasons2, "");
                            Hf4.LIZ(0cB.LJ(), roomAuthOffReasons2.getGift(), 0L);
                            this.LJJI.LIZJ((Class)2Da.class, (Object)true);
                            return;
                        }
                        return;
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
        }
    }
    
    public final void k_() {
        if (this.LJIJJ.LJIIIIZZ() != null && this.LJIJJ.LJIIIIZZ() instanceof 0Wg) {
            final SurfaceView ljiiiizz = this.LJIJJ.LJIIIIZZ();
            Objects.requireNonNull(ljiiiizz, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.api.widget.IInteractVideoView");
            ((0Wg)ljiiiizz).LIZ((Cert)TokenCert.Companion.with("bpea-linkmic_basemask_switchCamera"));
        }
    }
    
    public void onAttachedToWindow() {
        public final class 1XK<T> implements 2d6
        {
            public final /* synthetic */ 1lw LIZ;
            
            static {
                Covode.recordClassIndex(9006);
            }
            
            public 1XK(final 1lw liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   android/widget/FrameLayout.onAttachedToWindow:()V
        //     4: getstatic       X/0qj.LJIIIIZZ:Z
        //     7: ifne            223
        //    10: aload_0        
        //    11: new             LX/0sl;
        //    14: dup            
        //    15: aload_0        
        //    16: invokespecial   X/0sl.<init>:(LX/1lw;)V
        //    19: invokevirtual   X/1lw.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    22: aload_0        
        //    23: iconst_1       
        //    24: putfield        X/1lw.LJFF:Z
        //    27: aload_0        
        //    28: getfield        X/1lw.LJIL:LX/1TY;
        //    31: astore_1       
        //    32: aload_1        
        //    33: ifnull          41
        //    36: aload_1        
        //    37: aload_0        
        //    38: invokevirtual   X/0xQ.LIZ:(LX/0xR;)V
        //    41: aload_0        
        //    42: getfield        X/1lw.LJIL:LX/1TY;
        //    45: astore_1       
        //    46: aload_1        
        //    47: ifnull          54
        //    50: aload_1        
        //    51: invokevirtual   X/1TY.LIZIZ:()V
        //    54: aload_0        
        //    55: getfield        X/1lw.LJIILJJIL:Z
        //    58: ifeq            194
        //    61: aload_0        
        //    62: getfield        X/1lw.LJIIIIZZ:Z
        //    65: ifne            194
        //    68: aload_0        
        //    69: iconst_1       
        //    70: invokevirtual   X/1lw.LIZ:(I)V
        //    73: aload_0        
        //    74: invokevirtual   X/1lw.getContext:()Landroid/content/Context;
        //    77: invokestatic    X/Ghp.LIZ:(Landroid/content/Context;)Z
        //    80: ifeq            165
        //    83: aload_0        
        //    84: getfield        X/1lw.LIZLLL:Landroid/widget/TextView;
        //    87: astore_1       
        //    88: aload_1        
        //    89: ifnonnull       97
        //    92: ldc             ""
        //    94: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    97: aload_1        
        //    98: iconst_1       
        //    99: invokevirtual   android/widget/TextView.setLayoutDirection:(I)V
        //   102: aload_0        
        //   103: getfield        X/1lw.LIZLLL:Landroid/widget/TextView;
        //   106: astore_1       
        //   107: aload_1        
        //   108: ifnonnull       116
        //   111: ldc             ""
        //   113: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   116: aload_1        
        //   117: iconst_4       
        //   118: invokevirtual   android/widget/TextView.setTextDirection:(I)V
        //   121: aload_0        
        //   122: ldc_w           2131368947
        //   125: invokevirtual   X/1lw.LIZIZ:(I)Landroid/view/View;
        //   128: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //   131: astore_1       
        //   132: aload_1        
        //   133: ldc             ""
        //   135: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   138: aload_1        
        //   139: iconst_1       
        //   140: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setLayoutDirection:(I)V
        //   143: aload_0        
        //   144: ldc_w           2131368947
        //   147: invokevirtual   X/1lw.LIZIZ:(I)Landroid/view/View;
        //   150: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //   153: astore_1       
        //   154: aload_1        
        //   155: ldc             ""
        //   157: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   160: aload_1        
        //   161: iconst_4       
        //   162: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setTextDirection:(I)V
        //   165: aload_0        
        //   166: getfield        X/1lw.LJIILLIIL:LX/FH6;
        //   169: invokestatic    X/FGP.LIZ:()LX/FGP;
        //   172: ldc_w           LX/Fgq;.class
        //   175: invokevirtual   X/FGP.LIZ:(Ljava/lang/Class;)LX/FBF;
        //   178: new             LX/1XK;
        //   181: dup            
        //   182: aload_0        
        //   183: invokespecial   X/1XK.<init>:(LX/1lw;)V
        //   186: invokevirtual   X/FBF.LIZLLL:(LX/2d6;)LX/2fc;
        //   189: invokevirtual   X/FH6.LIZ:(LX/2fc;)Z
        //   192: pop            
        //   193: return         
        //   194: aload_0        
        //   195: iconst_2       
        //   196: invokevirtual   X/1lw.LIZ:(I)V
        //   199: aload_0        
        //   200: getfield        X/1lw.LJJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   203: astore_1       
        //   204: aload_1        
        //   205: ifnull          73
        //   208: aload_1        
        //   209: ldc_w           LX/2GV;.class
        //   212: aload_0        
        //   213: getfield        X/1lw.LJIJJLI:Ljava/lang/String;
        //   216: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   219: pop            
        //   220: goto            73
        //   223: aload_0        
        //   224: getfield        X/1lw.LJJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   227: astore_1       
        //   228: aload_1        
        //   229: ifnull          22
        //   232: aload_1        
        //   233: aload_0        
        //   234: ldc_w           LX/GtM;.class
        //   237: new             LX/22M;
        //   240: dup            
        //   241: aload_0        
        //   242: invokespecial   X/22M.<init>:(LX/1lw;)V
        //   245: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   248: pop            
        //   249: goto            22
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
    
    public void onDetachedFromWindow() {
        if (this.LJIILL) {
            super.onDetachedFromWindow();
            return;
        }
        this.LJFF = false;
        this.LJIILIIL.removeCallbacksAndMessages((Object)null);
        this.LJIIZILJ = false;
        final 0qc.a ljil = this.LJIL;
        if (ljil != null) {
            ljil.h_();
        }
        this.LJIILLIIL.LIZ();
        this.LJJ = null;
        super.onDetachedFromWindow();
    }
    
    public final void setAdjustParent(final boolean ljiill) {
        this.LJIILL = ljiill;
    }
    
    public final void setCurrentUserIsLinkedGuest(final boolean lj) {
        this.LJ = lj;
    }
    
    public final void setHasInit(final boolean ljiizilj) {
        this.LJIIZILJ = ljiizilj;
    }
    
    public final void setMAttachedToWindow$liveinteract_impl_release(final boolean ljff) {
        this.LJFF = ljff;
    }
    
    public final void setMAvatarBackground(final 1si liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final void setMCurrentUserIsLinkedGuest(final boolean lj) {
        this.LJ = lj;
    }
    
    public final void setMHasCountDownFinished$liveinteract_impl_release(final boolean ljii) {
        this.LJII = ljii;
    }
    
    public final void setMHasLoadingFinished$liveinteract_impl_release(final boolean ljiiiizz) {
        this.LJIIIIZZ = ljiiiizz;
    }
    
    public final void setMLoadingView(final HoY lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
    }
    
    public final void setMNeedPrepareLoading(final boolean ljiiljjil) {
        this.LJIILJJIL = ljiiljjil;
    }
    
    public final void setMOnlineName(final TextView lizlll) {
        CTM.LIZ((Object)lizlll);
        this.LIZLLL = lizlll;
    }
    
    public final void setMPrepareAvatar(final ImageView liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
    }
    
    public final void setMPrepareViewContainer$liveinteract_impl_release(final ViewGroup ljij) {
        this.LJIJ = ljij;
    }
    
    public final void setMPresenter(final 0qc.a ljil) {
        this.LJIL = ljil;
    }
    
    public void setVisibility(final boolean b) {
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        this.setVisibility(visibility);
    }
    
    public final void setWindow(final Vvh ljijj) {
        CTM.LIZ((Object)ljijj);
        this.LJIJJ = ljijj;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(9000);
        }
        
        void LIZ(final 1lw p0);
    }
}
