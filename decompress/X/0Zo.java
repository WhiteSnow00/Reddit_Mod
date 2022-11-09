// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Handler;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.g.t;

public abstract class 0zO<MODEL extends t<? extends H31>>
{
    public final int LIZ;
    public MODEL LIZIZ;
    public PinMessageViewModel LIZJ;
    public H31 LIZLLL;
    public 1e7<MODEL> LJ;
    public boolean LJFF;
    public final SRS<Boolean, 2P9> LJI;
    public final ImageView LJII;
    public final View LJIIIIZZ;
    public final 10r LJIIIZ;
    public 10h LJIIJ;
    public boolean LJIIJJI;
    public final 5DO LJIIL;
    public final 5DO LJIILIIL;
    public final 5DO LJIILJJIL;
    public final 5DO LJIILL;
    public final 5DO LJIILLIIL;
    public final 5DO LJIIZILJ;
    public final View LJIJ;
    
    static {
        Covode.recordClassIndex(10533);
    }
    
    public 0zO(final View ljiiiizz, final 10r ljiiiz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        X/0zO.LJIIIIZZ:Landroid/view/View;
        //    13: aload_0        
        //    14: aload_2        
        //    15: putfield        X/0zO.LJIIIZ:LX/10r;
        //    18: aload_0        
        //    19: ldc             16.0
        //    21: invokestatic    X/0cB.LIZ:(F)I
        //    24: putfield        X/0zO.LIZ:I
        //    27: aload_0        
        //    28: new             LX/29r;
        //    31: dup            
        //    32: aload_0        
        //    33: invokespecial   X/29r.<init>:(LX/0zO;)V
        //    36: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    39: putfield        X/0zO.LJIIL:LX/5DO;
        //    42: aload_0        
        //    43: getstatic       X/29s.LIZ:LX/29s;
        //    46: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    49: putfield        X/0zO.LJIILIIL:LX/5DO;
        //    52: aload_0        
        //    53: new             LX/29o;
        //    56: dup            
        //    57: aload_0        
        //    58: invokespecial   X/29o.<init>:(LX/0zO;)V
        //    61: putfield        X/0zO.LJI:LX/SRS;
        //    64: aload_0        
        //    65: new             LX/29p;
        //    68: dup            
        //    69: aload_0        
        //    70: invokespecial   X/29p.<init>:(LX/0zO;)V
        //    73: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    76: putfield        X/0zO.LJIILJJIL:LX/5DO;
        //    79: aload_0        
        //    80: new             LX/29t;
        //    83: dup            
        //    84: aload_0        
        //    85: invokespecial   X/29t.<init>:(LX/0zO;)V
        //    88: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    91: putfield        X/0zO.LJIILL:LX/5DO;
        //    94: aload_0        
        //    95: new             LX/29v;
        //    98: dup            
        //    99: aload_0        
        //   100: invokespecial   X/29v.<init>:(LX/0zO;)V
        //   103: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   106: putfield        X/0zO.LJIILLIIL:LX/5DO;
        //   109: aload_0        
        //   110: new             LX/29q;
        //   113: dup            
        //   114: aload_0        
        //   115: invokespecial   X/29q.<init>:(LX/0zO;)V
        //   118: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   121: putfield        X/0zO.LJIIZILJ:LX/5DO;
        //   124: aload_1        
        //   125: ldc             2131363581
        //   127: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   130: astore_2       
        //   131: aload_2        
        //   132: new             LX/0zK;
        //   135: dup            
        //   136: aload_0        
        //   137: invokespecial   X/0zK.<init>:(LX/0zO;)V
        //   140: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   143: aload_0        
        //   144: aload_2        
        //   145: putfield        X/0zO.LJIJ:Landroid/view/View;
        //   148: aload_1        
        //   149: ldc             2131369293
        //   151: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   154: checkcast       Landroid/widget/ImageView;
        //   157: astore_2       
        //   158: aload_2        
        //   159: new             LX/0zL;
        //   162: dup            
        //   163: aload_0        
        //   164: invokespecial   X/0zL.<init>:(LX/0zO;)V
        //   167: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   170: aload_0        
        //   171: aload_2        
        //   172: putfield        X/0zO.LJII:Landroid/widget/ImageView;
        //   175: aload_1        
        //   176: ldc             2131370500
        //   178: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   181: checkcast       LX/05a;
        //   184: iconst_2       
        //   185: newarray        I
        //   187: dup            
        //   188: iconst_0       
        //   189: ldc             2131363581
        //   191: iastore        
        //   192: dup            
        //   193: iconst_1       
        //   194: ldc             2131369293
        //   196: iastore        
        //   197: invokevirtual   X/05a.setReferencedIds:([I)V
        //   200: return         
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
    
    public final Runnable LIZ() {
        return (Runnable)this.LJIIL.getValue();
    }
    
    public void LIZ(final 1e7<MODEL> 1e7) {
        CTM.LIZ((Object)1e7);
        this.LJIIJJI = 1e7.LIZ.LJ;
        final boolean lizj = 1e7.LIZ.LIZJ;
        this.LJFF = lizj;
        if (this.LJIIJJI) {
            if (!lizj) {
                GTi.LIZ(this.LJIJ, true);
                return;
            }
            final View ljij = this.LJIJ;
            n.LIZIZ((Object)ljij, "");
            ljij.setVisibility(4);
        }
        else {
            if (lizj) {
                final View ljij2 = this.LJIJ;
                n.LIZIZ((Object)ljij2, "");
                ljij2.setVisibility(4);
                return;
            }
            GTi.LIZ(this.LJIJ, false);
        }
    }
    
    public void LIZ(final 1e7<MODEL> lj, final Object o) {
        CTM.LIZ((Object)lj, o);
        if ((n.LIZ((Object)this.LJ, (Object)lj) ^ true) && !lj.LJII) {
            this.LIZIZ().removeCallbacks(this.LIZ());
        }
        ++lj.LJI;
        this.LJ = lj;
        this.LIZIZ = lj.LIZIZ;
        this.LIZLLL = lj.LIZIZ.LJIILIIL;
        this.LJFF = lj.LIZ.LIZJ;
        this.LJIIJJI = lj.LIZ.LJ;
        this.LJIIJ = lj.LIZ;
        if (lj.LIZ.LIZ() != -1L) {
            final String value = String.valueOf(lj.LIZ.LIZ());
            CTM.LIZ((Object)value);
            final 1e9 lj2 = this.LJ();
            final StringBuilder sb = new StringBuilder();
            sb.append(value);
            sb.append('s');
            final String string = sb.toString();
            CTM.LIZ((Object)string);
            if (lj2.LJII().LIZ != 0) {
                lj2.LJII().LJFF = string;
                ((0zr<106>)lj2).LJII().LJIIIIZZ = -1;
            }
            this.LIZLLL().requestLayout();
            this.LIZLLL().invalidate();
        }
    }
    
    public final void LIZ(final String s) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_pin_comment_platform_click");
        final 10r ljiiiz = this.LJIIIZ;
        final User user = null;
        DataChannel ljiizilj;
        if (ljiiiz != null) {
            ljiizilj = ljiiiz.LJIIZILJ;
        }
        else {
            ljiizilj = null;
        }
        liz.LIZ(ljiizilj);
        final 10r ljiiiz2 = this.LJIIIZ;
        Room ljiill;
        if (ljiiiz2 != null) {
            ljiill = ljiiiz2.LJIILL;
        }
        else {
            ljiill = null;
        }
        final 10r ljiiiz3 = this.LJIIIZ;
        DataChannel ljiizilj2;
        if (ljiiiz3 != null) {
            ljiizilj2 = ljiiiz3.LJIIZILJ;
        }
        else {
            ljiizilj2 = null;
        }
        liz.LIZ("admin_type", Fsd.LIZ(ljiill, ljiizilj2));
        final 10r ljiiiz4 = this.LJIIIZ;
        Boolean value;
        if (ljiiiz4 != null) {
            value = ljiiiz4.LIZLLL;
        }
        else {
            value = null;
        }
        String s2;
        if (GTi.LIZ(value)) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        liz.LIZ("is_extended_comment_filed", s2);
        final 10r ljiiiz5 = this.LJIIIZ;
        Room ljiill2;
        if (ljiiiz5 != null) {
            ljiill2 = ljiiiz5.LJIILL;
        }
        else {
            ljiill2 = null;
        }
        final 10h ljiij = this.LJIIJ;
        User liziz = user;
        if (ljiij != null) {
            liziz = ljiij.LIZIZ;
        }
        liz.LIZ("pin_user", Fsd.LIZ(ljiill2, liziz));
        liz.LIZ("click_type", s);
        liz.LIZLLL();
    }
    
    public final void LIZ(final boolean b) {
        public final class 29u extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 0zO LIZ;
            public final /* synthetic */ boolean LIZIZ;
            
            static {
                Covode.recordClassIndex(10543);
            }
            
            public 29u(final 0zO liz, final boolean liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0zO.LJIIIIZZ:Landroid/view/View;
        //     4: iconst_1       
        //     5: invokestatic    X/GTi.LIZ:(Landroid/view/View;Z)V
        //     8: aload_0        
        //     9: invokevirtual   X/0zO.LIZJ:()LX/2HD;
        //    12: new             LX/29u;
        //    15: dup            
        //    16: aload_0        
        //    17: iload_1        
        //    18: invokespecial   X/29u.<init>:(LX/0zO;Z)V
        //    21: invokevirtual   X/2HD.setMeasureListener:(LX/QgG;)V
        //    24: return         
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
    
    public final Handler LIZIZ() {
        return (Handler)this.LJIILIIL.getValue();
    }
    
    public abstract 2HD LIZJ();
    
    public abstract View LIZLLL();
    
    public final 1e9 LJ() {
        return (1e9)this.LJIILJJIL.getValue();
    }
    
    public final 1e9 LJFF() {
        return (1e9)this.LJIILL.getValue();
    }
    
    public final 1e9 LJI() {
        return (1e9)this.LJIILLIIL.getValue();
    }
    
    public final 1mr LJII() {
        return (1mr)this.LJIIZILJ.getValue();
    }
    
    public final void LJIIIIZZ() {
        GTi.LIZ(this.LJIIIIZZ, false);
        this.LJI().LJI();
    }
}
