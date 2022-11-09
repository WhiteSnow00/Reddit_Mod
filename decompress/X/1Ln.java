// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.os.Message;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.Objects;
import java.util.Locale;
import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import kotlin.jvm.internal.n;
import android.view.View$OnClickListener;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.animation.Animator;
import com.bytedance.common.utility.collection.WeakHandler;
import android.view.SurfaceView;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.common.utility.collection.WeakHandler$IHandler;
import android.widget.FrameLayout;

public abstract class 1ln extends FrameLayout implements b, 0uU, WeakHandler$IHandler
{
    public int LIZ;
    public final 0qc.a LIZIZ;
    public final DataChannel LIZJ;
    public 1si LIZLLL;
    public ImageView LJ;
    public TextView LJFF;
    public 1si LJI;
    public TextView LJII;
    public View LJIIIIZZ;
    public 0yJ LJIIIZ;
    public HoY LJIIJ;
    public View LJIIJJI;
    public View LJIIL;
    public TextView LJIILIIL;
    public TextView LJIILJJIL;
    public ImageView LJIILL;
    public ProgressBar LJIILLIIL;
    public TextView LJIIZILJ;
    public View LJIJ;
    public SurfaceView LJIJI;
    public final WeakHandler LJIJJ;
    public Animator LJIJJLI;
    public final long LJIL;
    public int LJJ;
    public long LJJI;
    public final boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public boolean LJJIIJZLJL;
    public FH6 LJJIIZ;
    public boolean LJJIIZI;
    public volatile int LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public final String LJJIJIL;
    public a LJJIJL;
    public HashMap LJJIJLIJ;
    
    static {
        Covode.recordClassIndex(8653);
    }
    
    public 1ln(final Context context, final String ljjijil, final 0qc.a liziz, final a ljjijl, final DataChannel lizj) {
        CTM.LIZ((Object)context, (Object)ljjijil, (Object)liziz);
        super(context);
        this.LJJIJIL = ljjijil;
        this.LIZIZ = liziz;
        this.LJJIJL = ljjijl;
        this.LIZJ = lizj;
        this.LJIJJ = new WeakHandler((WeakHandler$IHandler)this);
        final long ljil = 0yD.LIZ.LIZ("guest_pre_push_time_mills");
        this.LJIL = ljil;
        this.LJJ = 5;
        this.LIZ = 5;
        final long n = 5000;
        long ljji;
        if (1L <= ljil && n > ljil) {
            ljji = 5000 - ljil;
        }
        else {
            ljji = 0L;
        }
        this.LJJI = ljji;
        this.LJJIFFI = (ljji > 0L && ljji < 5000);
        this.LJJIIZ = new FH6();
        this.LJJIJ = -1;
    }
    
    public void LIZ() {
        public final class 0rR implements View$OnClickListener
        {
            public final /* synthetic */ 1ln LIZ;
            
            static {
                Covode.recordClassIndex(8659);
            }
            
            public 0rR(final 1ln liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final 1ln liz = this.LIZ;
                final Ht9 ht9 = new Ht9(liz.getContext());
                final String value = HdY.WINDOW.value;
                n.LIZIZ((Object)value, "");
                1ml.LIZ(value);
                ht9.LIZ(2131829530);
                ht9.LIZIZ(2131831457);
                ht9.LIZ(2131829529, (DialogInterface$OnClickListener)new 0rO(liz), false);
                ht9.LIZIZ(2131835674, (DialogInterface$OnClickListener)0rP.LIZ, false);
                final HtA liz2 = ht9.LIZ();
                ((0eC)liz2).show();
                KN6.LIZ.LIZ((Dialog)liz2);
                1ml.LIZLLL();
            }
        }
        public final class 0rQ implements View$OnClickListener
        {
            public final /* synthetic */ 1ln LIZ;
            
            static {
                Covode.recordClassIndex(8658);
            }
            
            public 0rQ(final 1ln liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.LIZIZ();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: ldc             2131369587
        //     4: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //     7: checkcast       LX/1si;
        //    10: putfield        X/1ln.LIZLLL:LX/1si;
        //    13: aload_0        
        //    14: aload_0        
        //    15: ldc             2131369586
        //    17: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //    20: checkcast       Landroid/widget/ImageView;
        //    23: putfield        X/1ln.LJ:Landroid/widget/ImageView;
        //    26: aload_0        
        //    27: aload_0        
        //    28: ldc             2131369589
        //    30: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //    33: checkcast       Landroid/widget/TextView;
        //    36: putfield        X/1ln.LJFF:Landroid/widget/TextView;
        //    39: aload_0        
        //    40: aload_0        
        //    41: ldc             2131369590
        //    43: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //    46: checkcast       LX/1si;
        //    49: putfield        X/1ln.LJI:LX/1si;
        //    52: aload_0        
        //    53: aload_0        
        //    54: ldc             2131369592
        //    56: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //    59: checkcast       Landroid/widget/TextView;
        //    62: putfield        X/1ln.LJII:Landroid/widget/TextView;
        //    65: aload_0        
        //    66: aload_0        
        //    67: ldc             2131369588
        //    69: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //    72: putfield        X/1ln.LJIIIIZZ:Landroid/view/View;
        //    75: aload_0        
        //    76: aload_0        
        //    77: ldc             2131369591
        //    79: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //    82: checkcast       LX/0yJ;
        //    85: putfield        X/1ln.LJIIIZ:LX/0yJ;
        //    88: aload_0        
        //    89: aload_0        
        //    90: ldc             2131368000
        //    92: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //    95: checkcast       LX/HoY;
        //    98: putfield        X/1ln.LJIIJ:LX/HoY;
        //   101: aload_0        
        //   102: ldc             2131368958
        //   104: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //   107: astore_1       
        //   108: aload_0        
        //   109: aload_1        
        //   110: putfield        X/1ln.LJIIJJI:Landroid/view/View;
        //   113: aload_1        
        //   114: ifnull          129
        //   117: aload_1        
        //   118: new             LX/0rQ;
        //   121: dup            
        //   122: aload_0        
        //   123: invokespecial   X/0rQ.<init>:(LX/1ln;)V
        //   126: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   129: aload_0        
        //   130: ldc             2131368946
        //   132: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //   135: astore_1       
        //   136: aload_0        
        //   137: aload_1        
        //   138: putfield        X/1ln.LJIIL:Landroid/view/View;
        //   141: aload_1        
        //   142: ifnull          157
        //   145: aload_1        
        //   146: new             LX/0rR;
        //   149: dup            
        //   150: aload_0        
        //   151: invokespecial   X/0rR.<init>:(LX/1ln;)V
        //   154: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   157: aload_0        
        //   158: aload_0        
        //   159: ldc             2131368951
        //   161: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //   164: checkcast       Landroid/widget/TextView;
        //   167: putfield        X/1ln.LJIILIIL:Landroid/widget/TextView;
        //   170: aload_0        
        //   171: aload_0        
        //   172: ldc             2131368959
        //   174: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //   177: checkcast       Landroid/widget/TextView;
        //   180: putfield        X/1ln.LJIILJJIL:Landroid/widget/TextView;
        //   183: aload_0        
        //   184: aload_0        
        //   185: ldc             2131368960
        //   187: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //   190: checkcast       Landroid/widget/ImageView;
        //   193: putfield        X/1ln.LJIILL:Landroid/widget/ImageView;
        //   196: aload_0        
        //   197: aload_0        
        //   198: ldc             2131368956
        //   200: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //   203: checkcast       Landroid/widget/ProgressBar;
        //   206: putfield        X/1ln.LJIILLIIL:Landroid/widget/ProgressBar;
        //   209: aload_0        
        //   210: aload_0        
        //   211: ldc             2131368948
        //   213: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //   216: checkcast       Landroid/widget/TextView;
        //   219: putfield        X/1ln.LJIIZILJ:Landroid/widget/TextView;
        //   222: aload_0        
        //   223: aload_0        
        //   224: ldc             2131368947
        //   226: invokevirtual   X/1ln.findViewById:(I)Landroid/view/View;
        //   229: putfield        X/1ln.LJIJ:Landroid/view/View;
        //   232: aload_0        
        //   233: iconst_1       
        //   234: putfield        X/1ln.LJJIJIIJI:Z
        //   237: return         
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
    
    public void LIZ(final int ljjiij) {
        this.LJJIIJ = ljjiij;
        if (ljjiij != 0) {
            if (ljjiij == 1) {
                final View ljiiiizz = this.LJIIIIZZ;
                if (ljiiiizz != null) {
                    ljiiiizz.setVisibility(0);
                }
                final View ljij = this.LJIJ;
                if (ljij != null) {
                    ljij.setVisibility(8);
                }
                final TextView ljff = this.LJFF;
                if (ljff != null) {
                    ljff.setVisibility(8);
                }
                final 1si lji = this.LJI;
                if (lji != null) {
                    lji.setVisibility(8);
                }
                final TextView ljii = this.LJII;
                if (ljii != null) {
                    ljii.setText(2131829338);
                }
                final 0yJ ljiiiz = this.LJIIIZ;
                if (ljiiiz != null) {
                    ljiiiz.setVisibility(0);
                }
                final 0yJ ljiiiz2 = this.LJIIIZ;
                if (ljiiiz2 != null) {
                    ljiiiz2.LIZ();
                }
                final HoY ljiij = this.LJIIJ;
                if (ljiij != null) {
                    ljiij.setVisibility(0);
                }
                this.LJIJJ.sendEmptyMessageDelayed(0, 1000L);
                return;
            }
            if (ljjiij == 2) {
                final View ljiiiizz2 = this.LJIIIIZZ;
                if (ljiiiizz2 != null) {
                    ljiiiizz2.setVisibility(8);
                }
                final View ljij2 = this.LJIJ;
                if (ljij2 != null) {
                    ljij2.setVisibility(0);
                }
                return;
            }
            if (ljjiij == 3) {
                final View ljiiiizz3 = this.LJIIIIZZ;
                if (ljiiiizz3 != null) {
                    ljiiiizz3.setVisibility(0);
                }
                final View ljij3 = this.LJIJ;
                if (ljij3 != null) {
                    ljij3.setVisibility(8);
                }
                final TextView ljff2 = this.LJFF;
                if (ljff2 != null) {
                    ljff2.setVisibility(8);
                }
                final 1si lji2 = this.LJI;
                if (lji2 != null) {
                    lji2.setVisibility(8);
                }
                final TextView ljii2 = this.LJII;
                if (ljii2 != null) {
                    ljii2.setText(2131829535);
                }
                if (this.LJJIJIIJIL) {
                    this.LJIJJ.sendEmptyMessage(1);
                    return;
                }
                this.LJIJJ.sendEmptyMessageDelayed(1, 1500L);
            }
        }
        else {
            final View ljiiiizz4 = this.LJIIIIZZ;
            if (ljiiiizz4 != null) {
                ljiiiizz4.setVisibility(0);
            }
            final View ljij4 = this.LJIJ;
            if (ljij4 != null) {
                ljij4.setVisibility(8);
            }
            final TextView ljff3 = this.LJFF;
            if (ljff3 != null) {
                ljff3.setVisibility(0);
            }
            final 1si lji3 = this.LJI;
            if (lji3 != null) {
                lji3.setVisibility(0);
            }
            final TextView ljii3 = this.LJII;
            if (ljii3 != null) {
                ljii3.setText(2131829338);
            }
            final TextView ljff4 = this.LJFF;
            if (ljff4 != null) {
                ljff4.setText((CharSequence)String.valueOf(this.LJJ));
            }
            final 0yJ ljiiiz3 = this.LJIIIZ;
            if (ljiiiz3 != null) {
                ljiiiz3.setVisibility(8);
            }
            final HoY ljiij2 = this.LJIIJ;
            if (ljiij2 != null) {
                ljiij2.setVisibility(8);
            }
            this.LJIJJ.sendEmptyMessageDelayed(0, 1000L);
            if (this.LJJIFFI) {
                this.LJIJJ.sendEmptyMessageDelayed(3, this.LJJI);
            }
        }
    }
    
    public final void LIZ(int imageResource, final long n) {
        Object text = null;
        int n2 = 1;
        Label_0047: {
            if (imageResource != 1) {
                final DataChannel lizj = this.LIZJ;
                if (lizj != null) {
                    final Integer n3 = (Integer)lizj.LIZIZ((Class)2G3.class);
                    if (n3 != null && n3 == 1) {
                        n2 = n2;
                        break Label_0047;
                    }
                }
                n2 = 0;
            }
        }
        final ImageView ljiill = this.LJIILL;
        if (ljiill != null) {
            if (n2 != 0) {
                imageResource = 2131234437;
            }
            else {
                imageResource = 2131234438;
            }
            ljiill.setImageResource(imageResource);
        }
        final String liz = GKY.LIZ(n);
        n.LIZIZ((Object)liz, "");
        final Locale root = Locale.ROOT;
        n.LIZIZ((Object)root, "");
        Objects.requireNonNull(liz, "null cannot be cast to non-null type java.lang.String");
        final String upperCase = liz.toUpperCase(root);
        n.LIZIZ((Object)upperCase, "");
        final TextView ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            text = ljiiljjil.getText();
        }
        if (n.LIZ((Object)upperCase, (Object)String.valueOf(text))) {
            return;
        }
        final TextView ljiiljjil2 = this.LJIILJJIL;
        if (ljiiljjil2 != null) {
            ljiiljjil2.setText((CharSequence)upperCase);
        }
    }
    
    public final void LIZ(SurfaceView ljiji) {
        if (ljiji == null) {
            return;
        }
        this.removeView((View)this.LJIJI);
        this.LJIJI = ljiji;
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
        final SurfaceView ljiji2 = this.LJIJI;
        if (ljiji2 != null) {
            ljiji2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        ljiji = this.LJIJI;
        Object parent;
        if (ljiji != null) {
            parent = ljiji.getParent();
        }
        else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            if (parent == this) {
                return;
            }
            ((ViewGroup)parent).removeView((View)this.LJIJI);
        }
        ljiji = this.LJIJI;
        final int n = 0;
        this.addView((View)ljiji, 0);
        final DataChannel lizj = this.LIZJ;
        int booleanValue = n;
        if (lizj != null) {
            final Boolean b = (Boolean)lizj.LIZIZ((Class)G5l.class);
            booleanValue = n;
            if (b != null) {
                booleanValue = (((boolean)b) ? 1 : 0);
            }
        }
        final int ljjiij = this.LJJIIJ;
        if (ljjiij == 1 || (booleanValue != 0 && ljjiij == 0)) {
            this.LIZ(2);
        }
    }
    
    public void LIZ(final User user) {
        final SDe sDe = null;
        ImageModel avatarThumb;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        }
        else {
            avatarThumb = null;
        }
        final ImageView lj = this.LJ;
        if (lj == null) {
            return;
        }
        if (this.LIZLLL == null) {
            return;
        }
        int height = 0;
        final int width = lj.getWidth();
        final ImageView lj2 = this.LJ;
        if (lj2 != null) {
            height = lj2.getHeight();
        }
        HFv.LIZ(lj, avatarThumb, width, height, 2131234398);
        final HZ0 ljiij = new HZ0(5, 0.74698794f);
        if (avatarThumb != null && avatarThumb.getUrls() != null && avatarThumb.getUrls().size() != 0) {
            final G18 liz = 0cp.LIZ();
            0cq.LIZ(liz, avatarThumb);
            liz.LIZ(0.74698794f);
            liz.LIZ((View)this.LIZLLL);
        }
        else {
            final S8f liz2 = S8f.LIZ(Ql3.LIZ(2131234398));
            liz2.LJIIJ = (Qys)ljiij;
            final S8e liz3 = liz2.LIZ();
            final SAp liziz = SBH.LIZIZ();
            ((SDU)liziz).LIZIZ((Object)liz3);
            final 1si lizlll = this.LIZLLL;
            SDe controller = sDe;
            if (lizlll != null) {
                controller = ((SEd)lizlll).getController();
            }
            ((SDU)liziz).LIZ(controller);
            final SDT lizj = ((SDU)liziz).LIZJ();
            final 1si lizlll2 = this.LIZLLL;
            if (lizlll2 != null) {
                ((SEd)lizlll2).setController((SDe)lizj);
            }
        }
        final TextView ljiiliil = this.LJIILIIL;
        if (ljiiliil != null) {
            ljiiliil.setText((CharSequence)0W3.LIZ(user));
        }
    }
    
    public void LIZ(final boolean b) {
        if (b && !this.LJJII) {
            final View ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                int visibility;
                if (this.LIZIZ.LJFF()) {
                    visibility = 4;
                }
                else {
                    visibility = 0;
                }
                ljiijji.setVisibility(visibility);
            }
            final View ljiil = this.LJIIL;
            if (ljiil != null) {
                ljiil.setVisibility(0);
            }
            return;
        }
        final View ljiijji2 = this.LJIIJJI;
        if (ljiijji2 != null) {
            ljiijji2.setVisibility(8);
        }
        final View ljiil2 = this.LJIIL;
        if (ljiil2 != null) {
            ljiil2.setVisibility(8);
        }
    }
    
    public View LIZIZ(final int n) {
        if (this.LJJIJLIJ == null) {
            this.LJJIJLIJ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJJIJLIJ.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LJJIJLIJ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final SurfaceView ljiji = this.LJIJI;
        if (ljiji != null && ljiji instanceof 0Wg) {
            Objects.requireNonNull(ljiji, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.api.widget.IInteractVideoView");
            final 0Wg 0Wg = (0Wg)ljiji;
            final PrivacyCert$Builder with = PrivacyCert$Builder.Companion.with("bpea-378");
            with.usage("");
            with.tag("guest link reverse camera");
            with.policies(new 6E8[] { PrivacyPolicyStore.getVideoPrivacyPolicy() });
            0Wg.LIZ((Cert)with.build());
        }
    }
    
    public void LIZJ() {
        this.LJJIII = true;
    }
    
    public final void LIZLLL() {
        if (!this.LJJIIZI) {
            return;
        }
        this.LIZ(3);
    }
    
    public final boolean LJ() {
        return this.LJJIIJZLJL;
    }
    
    public final boolean getAdjustParent() {
        return this.LJJIIJZLJL;
    }
    
    public final boolean getHasInit() {
        return this.LJJIJIIJI;
    }
    
    public final String getInteractId() {
        return this.LJJIJIL;
    }
    
    public final 1si getMAvatarBackground() {
        return this.LIZLLL;
    }
    
    public final 1si getMCountDownBackGround() {
        return this.LJI;
    }
    
    public final boolean getMCurrentUserIsLinkedGuest() {
        return this.LJJII;
    }
    
    public final DataChannel getMDataChannel() {
        return this.LIZJ;
    }
    
    public final WeakHandler getMHandler() {
        return this.LJIJJ;
    }
    
    public final HoY getMLoadingView() {
        return this.LJIIJ;
    }
    
    public final boolean getMNeedPrepareCountDown() {
        return this.LJJIII;
    }
    
    public final View getMOnlineCameraSwitch() {
        return this.LJIIJJI;
    }
    
    public final View getMOnlineClose() {
        return this.LJIIL;
    }
    
    public final View getMOnlineContainer() {
        return this.LJIJ;
    }
    
    public final TextView getMOnlineCountDown() {
        return this.LJIIZILJ;
    }
    
    public final TextView getMOnlineName() {
        return this.LJIILIIL;
    }
    
    public final ProgressBar getMOnlineProgress() {
        return this.LJIILLIIL;
    }
    
    public final TextView getMOnlineTicket() {
        return this.LJIILJJIL;
    }
    
    public final ImageView getMOnlineTicketIcon() {
        return this.LJIILL;
    }
    
    public final ImageView getMPrepareAvatar() {
        return this.LJ;
    }
    
    public final View getMPrepareContainer() {
        return this.LJIIIIZZ;
    }
    
    public final TextView getMPrepareCountDown() {
        return this.LJFF;
    }
    
    public final TextView getMPrepareHint() {
        return this.LJII;
    }
    
    public final 0qc.a getMPresenter() {
        return this.LIZIZ;
    }
    
    public final Animator getMProgressAnimator() {
        return this.LJIJJLI;
    }
    
    public final SurfaceView getMSurfaceView() {
        return this.LJIJI;
    }
    
    public final 0yJ getMWaveEffectView() {
        return this.LJIIIZ;
    }
    
    public final boolean getMultiLiveEnable() {
        return this.LJJIJIIJIL;
    }
    
    public final int getPosInMultiLive() {
        return this.LJJIJ;
    }
    
    public final 0qc.a getPresenter() {
        return this.LIZIZ;
    }
    
    public abstract int getWindowLayoutId();
    
    public void handleMsg(final Message message) {
        CTM.LIZ((Object)message);
        final int what = message.what;
        if (what != 0) {
            if (what != 1) {
                if (what != 2) {
                    if (what == 3 && this.LJJIFFI) {
                        final DataChannel lizj = this.LIZJ;
                        if (lizj != null) {
                            lizj.LIZIZ((Class)2GW.class, (Object)this.LJJIJIL);
                        }
                    }
                }
                else {
                    final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.LJIIZILJ, View.SCALE_X, new float[] { 1.0f, 2.0f, 1.0f });
                    n.LIZIZ((Object)ofFloat, "");
                    ofFloat.setRepeatCount(5);
                    ofFloat.setDuration(1000L);
                    ofFloat.addListener((Animator$AnimatorListener)new 0rN());
                    final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.LJIIZILJ, View.SCALE_Y, new float[] { 1.0f, 2.0f, 1.0f });
                    n.LIZIZ((Object)ofFloat2, "");
                    ofFloat2.setRepeatCount(5);
                    ofFloat2.setDuration(1000L);
                    final AnimatorSet set = new AnimatorSet();
                    set.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
                    set.start();
                }
                return;
            }
            if (this.LIZIZ.LJ()) {
                final DataChannel lizj2 = this.LIZJ;
                if (lizj2 != null) {
                    lizj2.LIZJ((Class)2Ea.class, (Object)new Fgf(5));
                }
                return;
            }
            final a ljjijl = this.LJJIJL;
            if (ljjijl != null) {
                ljjijl.LIZ(this);
            }
            5ob.LIZ.LIZ(this.LJJIJIL);
            final DataChannel lizj3 = this.LIZJ;
            if (lizj3 != null) {
                lizj3.LIZJ((Class)2Fh.class);
            }
        }
        else {
            final int ljj = this.LJJ - 1;
            if ((this.LJJ = ljj) > 0) {
                final TextView ljff = this.LJFF;
                if (ljff != null) {
                    ljff.setText((CharSequence)String.valueOf(ljj));
                }
                this.LJIJJ.sendEmptyMessageDelayed(0, 1000L);
                return;
            }
            final DataChannel lizj4 = this.LIZJ;
            if (lizj4 != null) {
                lizj4.LIZIZ((Class)2GV.class, (Object)this.LJJIJIL);
            }
            if (this.LJIJI == null) {
                this.LIZ(1);
                return;
            }
            this.LIZ(2);
        }
    }
    
    public void onAttachedToWindow() {
        public final class 1Uw<T> implements 2d6
        {
            public final /* synthetic */ 1ln LIZ;
            
            static {
                Covode.recordClassIndex(8661);
            }
            
            public 1Uw(final 1ln liz) {
                this.LIZ = liz;
            }
        }
        public final class 0rS implements View$OnClickListener
        {
            public final /* synthetic */ 1ln LIZ;
            
            static {
                Covode.recordClassIndex(8660);
            }
            
            public 0rS(final 1ln liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final 1ln liz = this.LIZ;
                final DataChannel lizj = liz.LIZJ;
                if (lizj != null) {
                    final Room room = (Room)lizj.LIZIZ((Class)G69.class);
                    if (room != null) {
                        final RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                        boolean b = false;
                        while (true) {
                            Label_0255: {
                                if (roomAuthStatus == null) {
                                    break Label_0255;
                                }
                                final RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                                n.LIZIZ((Object)roomAuthStatus2, "");
                                if (!roomAuthStatus2.isEnableGift()) {
                                    break Label_0255;
                                }
                                final boolean b2 = true;
                                final Boolean b3 = (Boolean)liz.LIZJ.LIZIZ((Class)G5l.class);
                                final boolean b4 = b3 != null && b3;
                                final IWalletCenter walletCenter = 0jR.LIZ(IWalletService.class).walletCenter();
                                n.LIZIZ((Object)walletCenter, "");
                                if (walletCenter.LIZIZ() > 0L) {
                                    b = true;
                                }
                                final H5c liz2 = H5b.LIZ(b4, b, b2);
                                if (liz2 != H5c.GREY && liz2 != H5c.HIDE) {
                                    if (liz.LIZIZ.LIZ() != null) {
                                        final HDy hDy = new HDy(liz.LIZIZ.LIZ());
                                        hDy.LIZIZ = "anchor_link_guest";
                                        liz.LIZJ.LIZJ((Class)2Dh.class, (Object)hDy);
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
                                    liz.LIZJ.LIZJ((Class)2Da.class, (Object)true);
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
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   android/widget/FrameLayout.onAttachedToWindow:()V
        //     4: aload_0        
        //     5: getfield        X/1ln.LJJIIJZLJL:Z
        //     8: ifeq            19
        //    11: aload_0        
        //    12: getfield        X/1ln.LJJIJIIJI:Z
        //    15: ifeq            19
        //    18: return         
        //    19: aload_0        
        //    20: invokevirtual   X/1ln.getContext:()Landroid/content/Context;
        //    23: aload_0        
        //    24: invokevirtual   X/1ln.getWindowLayoutId:()I
        //    27: aload_0        
        //    28: invokestatic    android/widget/FrameLayout.inflate:(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
        //    31: pop            
        //    32: aload_0        
        //    33: new             LX/0rS;
        //    36: dup            
        //    37: aload_0        
        //    38: invokespecial   X/0rS.<init>:(LX/1ln;)V
        //    41: invokevirtual   X/1ln.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    44: aload_0        
        //    45: invokevirtual   X/1ln.LIZ:()V
        //    48: aload_0        
        //    49: iconst_1       
        //    50: putfield        X/1ln.LJJIIZI:Z
        //    53: aload_0        
        //    54: getfield        X/1ln.LIZIZ:LX/1TY;
        //    57: aload_0        
        //    58: invokevirtual   X/0xQ.LIZ:(LX/0xR;)V
        //    61: aload_0        
        //    62: getfield        X/1ln.LJJIII:Z
        //    65: ifeq            140
        //    68: aload_0        
        //    69: iconst_0       
        //    70: invokevirtual   X/1ln.LIZ:(I)V
        //    73: aload_0        
        //    74: invokevirtual   X/1ln.getContext:()Landroid/content/Context;
        //    77: invokestatic    X/Ghp.LIZ:(Landroid/content/Context;)Z
        //    80: ifeq            111
        //    83: aload_0        
        //    84: getfield        X/1ln.LJIILIIL:Landroid/widget/TextView;
        //    87: astore_1       
        //    88: aload_1        
        //    89: ifnull          97
        //    92: aload_1        
        //    93: iconst_1       
        //    94: invokevirtual   android/widget/TextView.setLayoutDirection:(I)V
        //    97: aload_0        
        //    98: getfield        X/1ln.LJIILIIL:Landroid/widget/TextView;
        //   101: astore_1       
        //   102: aload_1        
        //   103: ifnull          111
        //   106: aload_1        
        //   107: iconst_4       
        //   108: invokevirtual   android/widget/TextView.setTextDirection:(I)V
        //   111: aload_0        
        //   112: getfield        X/1ln.LJJIIZ:LX/FH6;
        //   115: invokestatic    X/FGP.LIZ:()LX/FGP;
        //   118: ldc_w           LX/Fgq;.class
        //   121: invokevirtual   X/FGP.LIZ:(Ljava/lang/Class;)LX/FBF;
        //   124: new             LX/1Uw;
        //   127: dup            
        //   128: aload_0        
        //   129: invokespecial   X/1Uw.<init>:(LX/1ln;)V
        //   132: invokevirtual   X/FBF.LIZLLL:(LX/2d6;)LX/2fc;
        //   135: invokevirtual   X/FH6.LIZ:(LX/2fc;)Z
        //   138: pop            
        //   139: return         
        //   140: aload_0        
        //   141: iconst_2       
        //   142: invokevirtual   X/1ln.LIZ:(I)V
        //   145: aload_0        
        //   146: getfield        X/1ln.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   149: astore_1       
        //   150: aload_1        
        //   151: ifnull          73
        //   154: aload_1        
        //   155: ldc_w           LX/2GV;.class
        //   158: aload_0        
        //   159: getfield        X/1ln.LJJIJIL:Ljava/lang/String;
        //   162: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   165: pop            
        //   166: goto            73
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
    
    public void onDetachedFromWindow() {
        if (this.LJJIIJZLJL) {
            super.onDetachedFromWindow();
            return;
        }
        this.LJJIIZI = false;
        final Animator ljijjli = this.LJIJJLI;
        if (ljijjli != null && ljijjli.isRunning()) {
            final Animator ljijjli2 = this.LJIJJLI;
            if (ljijjli2 != null) {
                ljijjli2.cancel();
            }
        }
        this.LJIJJ.removeCallbacksAndMessages((Object)null);
        this.LJJIJIIJI = false;
        this.LIZIZ.h_();
        this.LJJIIZ.LIZ();
        this.LJJIJL = null;
        super.onDetachedFromWindow();
    }
    
    public final void setAdjustParent(final boolean ljjiijzljl) {
        this.LJJIIJZLJL = ljjiijzljl;
    }
    
    public final void setCurrentUserIsLinkedGuest(final boolean ljjii) {
        this.LJJII = ljjii;
    }
    
    public final void setHasInit(final boolean ljjijiiji) {
        this.LJJIJIIJI = ljjijiiji;
    }
    
    public final void setMAvatarBackground(final 1si lizlll) {
        this.LIZLLL = lizlll;
    }
    
    public final void setMCountDownBackGround(final 1si lji) {
        this.LJI = lji;
    }
    
    public final void setMCurrentUserIsLinkedGuest(final boolean ljjii) {
        this.LJJII = ljjii;
    }
    
    public final void setMLoadingView(final HoY ljiij) {
        this.LJIIJ = ljiij;
    }
    
    public final void setMNeedPrepareCountDown(final boolean ljjiii) {
        this.LJJIII = ljjiii;
    }
    
    public final void setMOnlineCameraSwitch(final View ljiijji) {
        this.LJIIJJI = ljiijji;
    }
    
    public final void setMOnlineClose(final View ljiil) {
        this.LJIIL = ljiil;
    }
    
    public final void setMOnlineContainer(final View ljij) {
        this.LJIJ = ljij;
    }
    
    public final void setMOnlineCountDown(final TextView ljiizilj) {
        this.LJIIZILJ = ljiizilj;
    }
    
    public final void setMOnlineName(final TextView ljiiliil) {
        this.LJIILIIL = ljiiliil;
    }
    
    public final void setMOnlineProgress(final ProgressBar ljiilliil) {
        this.LJIILLIIL = ljiilliil;
    }
    
    public final void setMOnlineTicket(final TextView ljiiljjil) {
        this.LJIILJJIL = ljiiljjil;
    }
    
    public final void setMOnlineTicketIcon(final ImageView ljiill) {
        this.LJIILL = ljiill;
    }
    
    public final void setMPrepareAvatar(final ImageView lj) {
        this.LJ = lj;
    }
    
    public final void setMPrepareContainer(final View ljiiiizz) {
        this.LJIIIIZZ = ljiiiizz;
    }
    
    public final void setMPrepareCountDown(final TextView ljff) {
        this.LJFF = ljff;
    }
    
    public final void setMPrepareHint(final TextView ljii) {
        this.LJII = ljii;
    }
    
    public final void setMProgressAnimator(final Animator ljijjli) {
        this.LJIJJLI = ljijjli;
    }
    
    public final void setMSurfaceView(final SurfaceView ljiji) {
        this.LJIJI = ljiji;
    }
    
    public final void setMWaveEffectView(final 0yJ ljiiiz) {
        this.LJIIIZ = ljiiiz;
    }
    
    public final void setMultiLiveEnable(final boolean ljjijiijil) {
        this.LJJIJIIJIL = ljjijiijil;
    }
    
    public final void setPosInMultiLive(final int ljjij) {
        this.LJJIJ = ljjij;
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
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(8654);
        }
        
        void LIZ(final 1ln p0);
    }
}
