// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.LayoutInflater$Factory;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import kotlin.jvm.internal.n;
import android.view.LayoutInflater;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.graphics.drawable.GradientDrawable;

public final class 1i4 extends 1Fc
{
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final GradientDrawable LJIILIIL;
    public final 1ib LJIILJJIL;
    public final 1It LJIILL;
    public final 1It LJIILLIIL;
    public final 1ib LJIIZILJ;
    public final View LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public F2K LJIJJLI;
    public boolean LJIL;
    public 0Xk LJJ;
    public final SRT<0Xk, 0Xf, 2P9> LJJI;
    public final int LJJIIZI;
    public final int LJJIJ;
    public final 5DO LJJIJIIJI;
    
    static {
        Covode.recordClassIndex(5182);
    }
    
    public 1i4() {
        this(null, null, 3);
    }
    
    public 1i4(final Context context, final SRT<? super 0Xk, ? super 0Xf, 2P9> ljji) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   X/1Fc.<init>:(Landroid/content/Context;)V
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        X/1i4.LJJI:LX/SRT;
        //    14: ldc             215.0
        //    16: invokestatic    X/GlD.LIZ:(F)F
        //    19: f2i            
        //    20: istore_3       
        //    21: aload_0        
        //    22: iload_3        
        //    23: putfield        X/1i4.LIZ:I
        //    26: ldc             34.0
        //    28: invokestatic    X/GlD.LIZ:(F)F
        //    31: f2i            
        //    32: istore          4
        //    34: aload_0        
        //    35: iload           4
        //    37: putfield        X/1i4.LIZIZ:I
        //    40: aload_0        
        //    41: ldc             12.0
        //    43: invokestatic    X/GlD.LIZ:(F)F
        //    46: f2i            
        //    47: putfield        X/1i4.LIZJ:I
        //    50: aload_0        
        //    51: ldc             6.0
        //    53: invokestatic    X/GlD.LIZ:(F)F
        //    56: f2i            
        //    57: putfield        X/1i4.LIZLLL:I
        //    60: aload_0        
        //    61: ldc             10.0
        //    63: invokestatic    X/GlD.LIZ:(F)F
        //    66: f2i            
        //    67: putfield        X/1i4.LJ:I
        //    70: aload_0        
        //    71: ldc             6.0
        //    73: invokestatic    X/GlD.LIZ:(F)F
        //    76: f2i            
        //    77: putfield        X/1i4.LJFF:I
        //    80: aload_0        
        //    81: ldc             2131099734
        //    83: invokestatic    X/0cB.LIZIZ:(I)I
        //    86: putfield        X/1i4.LJI:I
        //    89: aload_0        
        //    90: ldc             2131099686
        //    92: invokestatic    X/0cB.LIZIZ:(I)I
        //    95: putfield        X/1i4.LJII:I
        //    98: aload_0        
        //    99: ldc             -13092808
        //   101: putfield        X/1i4.LJIIIIZZ:I
        //   104: aload_0        
        //   105: ldc             2131099727
        //   107: invokestatic    X/0cB.LIZIZ:(I)I
        //   110: putfield        X/1i4.LJIIIZ:I
        //   113: aload_0        
        //   114: iconst_1       
        //   115: putfield        X/1i4.LJIIJ:I
        //   118: aload_0        
        //   119: iconst_1       
        //   120: putfield        X/1i4.LJIIJJI:Z
        //   123: new             Landroid/graphics/drawable/GradientDrawable;
        //   126: dup            
        //   127: invokespecial   android/graphics/drawable/GradientDrawable.<init>:()V
        //   130: astore_2       
        //   131: aload_0        
        //   132: aload_2        
        //   133: putfield        X/1i4.LJIILIIL:Landroid/graphics/drawable/GradientDrawable;
        //   136: aload_0        
        //   137: fconst_1       
        //   138: putfield        X/1i4.LJIJJ:F
        //   141: aload_0        
        //   142: getstatic       X/0Xk.LIVE_TIP_UNKNOWN:LX/0Xk;
        //   145: putfield        X/1i4.LJJ:LX/0Xk;
        //   148: aload_1        
        //   149: invokestatic    X/Ghp.LIZ:(Landroid/content/Context;)Z
        //   152: ifeq            375
        //   155: aload_1        
        //   156: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   159: ldc             2131562382
        //   161: invokestatic    X/1i4.LIZ:(Landroid/view/LayoutInflater;I)Landroid/view/View;
        //   164: astore_1       
        //   165: aload_0        
        //   166: aload_1        
        //   167: putfield        X/1Fc.LJJIII:Landroid/view/View;
        //   170: aload_1        
        //   171: ldc             2131373170
        //   173: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   176: astore          5
        //   178: aload           5
        //   180: ldc             ""
        //   182: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   185: aload_0        
        //   186: aload           5
        //   188: checkcast       LX/1ib;
        //   191: putfield        X/1i4.LJIILJJIL:LX/1ib;
        //   194: aload_1        
        //   195: ldc             2131366915
        //   197: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   200: astore          5
        //   202: aload           5
        //   204: ldc             ""
        //   206: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   209: aload           5
        //   211: checkcast       LX/1It;
        //   214: astore          5
        //   216: aload_0        
        //   217: aload           5
        //   219: putfield        X/1i4.LJIILL:LX/1It;
        //   222: aload_1        
        //   223: ldc             2131366919
        //   225: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   228: astore          6
        //   230: aload           6
        //   232: ldc             ""
        //   234: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   237: aload_0        
        //   238: aload           6
        //   240: checkcast       LX/1It;
        //   243: putfield        X/1i4.LJIILLIIL:LX/1It;
        //   246: aload_1        
        //   247: ldc             2131372931
        //   249: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   252: astore          6
        //   254: aload           6
        //   256: ldc             ""
        //   258: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   261: aload           6
        //   263: checkcast       LX/1ib;
        //   266: astore          6
        //   268: aload_0        
        //   269: aload           6
        //   271: putfield        X/1i4.LJIIZILJ:LX/1ib;
        //   274: aload_0        
        //   275: aload_1        
        //   276: ldc             2131367796
        //   278: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   281: putfield        X/1i4.LJIJ:Landroid/view/View;
        //   284: aload_2        
        //   285: iconst_0       
        //   286: invokevirtual   android/graphics/drawable/GradientDrawable.setShape:(I)V
        //   289: aload_2        
        //   290: ldc             4.0
        //   292: invokestatic    X/GlD.LIZ:(F)F
        //   295: f2i            
        //   296: i2f            
        //   297: invokevirtual   android/graphics/drawable/GradientDrawable.setCornerRadius:(F)V
        //   300: aload_0        
        //   301: iload_3        
        //   302: iload           4
        //   304: invokevirtual   X/1Fc.LIZIZ:(II)V
        //   307: aload_1        
        //   308: new             LX/0Xm;
        //   311: dup            
        //   312: aload_0        
        //   313: invokespecial   X/0Xm.<init>:(LX/1i4;)V
        //   316: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   319: aload           5
        //   321: new             LX/0Xn;
        //   324: dup            
        //   325: aload_0        
        //   326: invokespecial   X/0Xn.<init>:(LX/1i4;)V
        //   329: invokevirtual   X/1It.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   332: aload           6
        //   334: new             LX/0Xo;
        //   337: dup            
        //   338: aload_0        
        //   339: invokespecial   X/0Xo.<init>:(LX/1i4;)V
        //   342: invokevirtual   X/1ib.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   345: aload_0        
        //   346: ldc             8388659
        //   348: aload_0        
        //   349: getfield        X/1i4.LJJIIZI:I
        //   352: aload_0        
        //   353: getfield        X/1i4.LJJIJ:I
        //   356: invokevirtual   X/1Fc.LIZ:(III)V
        //   359: aload_0        
        //   360: new             LX/1rF;
        //   363: dup            
        //   364: aload_0        
        //   365: invokespecial   X/1rF.<init>:(LX/1i4;)V
        //   368: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   371: putfield        X/1i4.LJJIJIIJI:LX/5DO;
        //   374: return         
        //   375: aload_1        
        //   376: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   379: ldc             2131562381
        //   381: invokestatic    X/1i4.LIZ:(Landroid/view/LayoutInflater;I)Landroid/view/View;
        //   384: astore_1       
        //   385: goto            165
        //    Signature:
        //  (Landroid/content/Context;LX/SRT<-LX/0Xk;-LX/0Xf;LX/2P9;>;)V
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
    
    public static View LIZ(final LayoutInflater layoutInflater, final int n) {
        MethodCollector.i(7840);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(n, (ViewGroup)null);
                MethodCollector.o(7840);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(n, (ViewGroup)null);
        MethodCollector.o(7840);
        return inflate2;
    }
    
    private void LIZ(final boolean b) {
        if (b != this.LJIIJ()) {
            if (b) {
                this.LJI();
                return;
            }
            this.LJIIIIZZ();
        }
    }
    
    private final void LIZ(final boolean b, final boolean b2) {
        float alpha = 1.0f;
        float alpha2;
        if (b) {
            alpha2 = 1.0f;
        }
        else {
            alpha2 = 0.0f;
        }
        final View ljjiii = super.LJJIII;
        if (ljjiii != null) {
            alpha = ljjiii.getAlpha();
        }
        this.LJIJI = alpha;
        if (b2) {
            final View ljjiii2 = super.LJJIII;
            n.LIZIZ((Object)ljjiii2, "");
            ljjiii2.setAlpha(alpha2);
            this.LIZ(b);
            return;
        }
        final ValueAnimator ljiijji = this.LJIIJJI();
        n.LIZIZ((Object)ljiijji, "");
        if (ljiijji.isRunning()) {
            this.LJIIJJI().cancel();
        }
        this.LIZ(true);
        this.LJIJJ = alpha2 - this.LJIJI;
        this.LJIIJJI().start();
    }
    
    private final ValueAnimator LJIIJJI() {
        return (ValueAnimator)this.LJJIJIIJI.getValue();
    }
    
    public final void LIZ() {
        final 0Xk ljj = this.LJJ;
        this.LJJ = 0Xk.LIVE_TIP_UNKNOWN;
        this.LJIIJ = 1;
        this.LJ();
        if (ljj != 0Xk.LIVE_TIP_UNKNOWN) {
            final SRT<0Xk, 0Xf, 2P9> ljji = this.LJJI;
            if (ljji != null) {
                ljji.invoke((Object)ljj, (Object)0Xf.USER_CLICK);
            }
        }
    }
    
    public final void LIZIZ() {
        this.LJIIJJI = false;
        this.LJ();
        if (this.LJIIJ != 0) {
            final SRT<0Xk, 0Xf, 2P9> ljji = this.LJJI;
            if (ljji != null) {
                ljji.invoke((Object)this.LJJ, (Object)0Xf.CHANGE_STATE);
            }
        }
    }
    
    public final void LIZJ() {
        this.LJIIJJI = true;
        this.LJ();
        if (this.LJIIJ != 0) {
            final SRT<0Xk, 0Xf, 2P9> ljji = this.LJJI;
            if (ljji != null) {
                ljji.invoke((Object)this.LJJ, (Object)0Xf.CHANGE_STATE);
            }
        }
    }
    
    public final void LIZLLL() {
        if (this.LJIIJ == 0) {
            this.LJFF();
        }
    }
    
    public final void LJ() {
        final StringBuilder sb = new StringBuilder("hide(). !isShow=");
        sb.append(this.LJIIJ() ^ true);
        0ba.LIZ(4, "FloatTipView", sb.toString());
        if (!this.LJIIJ()) {
            return;
        }
        this.LIZ(false, true);
    }
    
    public final void LJFF() {
        0ba.LIZ(4, "FloatTipView", "show().");
        this.LIZ(true, false);
    }
}
