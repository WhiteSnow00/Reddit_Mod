// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;

public final class 1cy implements 0kY, Vv9
{
    public 1cz LIZ;
    public AtomicBoolean LIZIZ;
    public AtomicBoolean LIZJ;
    public 1NP LIZLLL;
    public VvS LJ;
    public FrameLayout LJFF;
    public Fld LJI;
    public ViewGroup$LayoutParams LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public Rect LJIIJ;
    public SRS<? super Rect, 2P9> LJIIJJI;
    public final 5DO LJIIL;
    
    static {
        Covode.recordClassIndex(10267);
    }
    
    public 1cy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //     8: dup            
        //     9: iconst_0       
        //    10: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    13: putfield        X/1cy.LIZIZ:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    16: aload_0        
        //    17: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    20: dup            
        //    21: iconst_0       
        //    22: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    25: putfield        X/1cy.LIZJ:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    28: aload_0        
        //    29: new             Landroid/graphics/Rect;
        //    32: dup            
        //    33: invokespecial   android/graphics/Rect.<init>:()V
        //    36: putfield        X/1cy.LJIIJ:Landroid/graphics/Rect;
        //    39: aload_0        
        //    40: new             LX/29G;
        //    43: dup            
        //    44: aload_0        
        //    45: invokespecial   X/29G.<init>:(LX/1cy;)V
        //    48: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    51: putfield        X/1cy.LJIIL:LX/5DO;
        //    54: return         
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
    
    private final boolean LJ() {
        return this.LIZIZ.get() && this.LIZJ.get();
    }
    
    public final 1cz LIZ(final int n) {
        final 1cz liz = this.LIZ;
        if (liz == null) {
            final 1NP lizlll = this.LIZLLL;
            1ly liz2;
            if (n == 4) {
                liz2 = new 1ly();
                liz2.LIZ("init, ".concat(String.valueOf(lizlll)));
                liz2.LIZLLL = lizlll;
            }
            else {
                liz2 = null;
            }
            return this.LIZ = liz2;
        }
        return liz;
    }
    
    @Override
    public final void LIZ() {
        public final class 298 extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cy LIZ;
            
            static {
                Covode.recordClassIndex(10271);
            }
            
            public 298(final 1cy liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   X/298.<init>:(LX/1cy;)V
        //     8: invokestatic    X/GTi.LIZ:(LX/QgG;)V
        //    11: return         
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
    public final void LIZ(final 1NP 1np) {
        public final class 299 extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cy LIZ;
            public final /* synthetic */ 1NP LIZIZ;
            
            static {
                Covode.recordClassIndex(10272);
            }
            
            public 299(final 1cy liz, final 1NP liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
            
            private void LIZ() {
                this.LIZ.LIZLLL = this.LIZIZ;
                final 1cy liz = this.LIZ;
                final 0Vq liz2 = 0jR.LIZ((Class<0Vq>)ILinkMicService.class);
                n.LIZIZ((Object)liz2, "");
                final ILinkMicService linkMicService = (ILinkMicService)liz2;
                final 1NP lizlll = this.LIZ.LIZLLL;
                if (lizlll != null) {
                    final Context lizj = lizlll.LIZJ;
                    if (lizj != null) {
                        final 1NP lizlll2 = this.LIZ.LIZLLL;
                        if (lizlll2 != null) {
                            final Long liziz = lizlll2.LIZIZ;
                            if (liziz != null) {
                                final long longValue = liziz;
                                final 1NP lizlll3 = this.LIZ.LIZLLL;
                                final VvS vvS = null;
                                a ljff;
                                if (lizlll3 != null) {
                                    ljff = lizlll3.LJFF;
                                }
                                else {
                                    ljff = null;
                                }
                                I5y i5y;
                                if (ljff != null && 0xV.LIZ[ljff.ordinal()] == 1) {
                                    i5y = I5y.SEARCH;
                                }
                                else {
                                    i5y = I5y.COMMON_FEED;
                                }
                                final VvS layoutManager = linkMicService.createLayoutManager(lizj, longValue, false, i5y);
                                VvS lj = vvS;
                                if (layoutManager != null) {
                                    layoutManager.LIZ((SRS)29A.LIZ);
                                    lj = layoutManager;
                                }
                                liz.LJ = lj;
                                this.LIZ.LIZIZ.set(true);
                                final 1cy liz3 = this.LIZ;
                                final StringBuilder sb = new StringBuilder("init ");
                                sb.append(this.LIZIZ);
                                liz3.LIZIZ(sb.toString());
                            }
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
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: new             LX/299;
        //     7: dup            
        //     8: aload_0        
        //     9: aload_1        
        //    10: invokespecial   X/299.<init>:(LX/1cy;LX/1NP;)V
        //    13: invokestatic    X/GTi.LIZ:(LX/QgG;)V
        //    16: return         
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
    public final void LIZ(final Fld fld, final int n, final int n2) {
        public final class 29H extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cy LIZ;
            public final /* synthetic */ Fld LIZIZ;
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ int LIZLLL;
            
            static {
                Covode.recordClassIndex(10280);
            }
            
            public 29H(final 1cy liz, final Fld liziz, final int lizj, final int lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       5
        //     4: return         
        //     5: aload_0        
        //     6: new             LX/29H;
        //     9: dup            
        //    10: aload_0        
        //    11: aload_1        
        //    12: iload_3        
        //    13: iload_2        
        //    14: invokespecial   X/29H.<init>:(LX/1cy;LX/Fld;II)V
        //    17: invokevirtual   X/1cy.LIZ:(LX/QgG;)V
        //    20: return         
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
    
    public final void LIZ(final QgG<2P9> qgG) {
        if (this.LJ()) {
            qgG.invoke();
        }
    }
    
    @Override
    public final void LIZ(final SRS<? super Rect, 2P9> ljiijji) {
        CTM.LIZ((Object)ljiijji);
        this.LJIIJJI = ljiijji;
    }
    
    @Override
    public final void LIZ(final FrameLayout frameLayout, final int n, final int n2, final int n3) {
        public final class 29I extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cy LIZ;
            public final /* synthetic */ FrameLayout LIZIZ;
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ int LIZLLL;
            public final /* synthetic */ int LJ;
            
            static {
                Covode.recordClassIndex(10281);
            }
            
            public 29I(final 1cy liz, final FrameLayout liziz, final int lizj, final int lizlll, final int lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       5
        //     4: return         
        //     5: aload_0        
        //     6: getfield        X/1cy.LIZJ:Ljava/util/concurrent/atomic/AtomicBoolean;
        //     9: iconst_1       
        //    10: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //    13: aload_0        
        //    14: new             LX/29I;
        //    17: dup            
        //    18: aload_0        
        //    19: aload_1        
        //    20: iload           4
        //    22: iload_2        
        //    23: iload_3        
        //    24: invokespecial   X/29I.<init>:(LX/1cy;Landroid/widget/FrameLayout;III)V
        //    27: invokevirtual   X/1cy.LIZ:(LX/QgG;)V
        //    30: return         
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
    public final void LIZ(final String s) {
        public final class 29D extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cy LIZ;
            public final /* synthetic */ String LIZIZ;
            
            static {
                Covode.recordClassIndex(10276);
            }
            
            public 29D(final 1cy liz, final String liziz) {
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
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: new             LX/29D;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   X/29D.<init>:(LX/1cy;Ljava/lang/String;)V
        //    14: invokevirtual   X/1cy.LIZ:(LX/QgG;)V
        //    17: return         
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
    public final Rect LIZIZ() {
        return this.LJIIJ;
    }
    
    public final void LIZIZ(final String s) {
        0ba.LIZ(3, "CommonLinkMicFeedViewManager", s);
    }
    
    public final void LIZJ() {
        public final class 0xU implements Runnable
        {
            public final /* synthetic */ 1cy LIZ;
            
            static {
                Covode.recordClassIndex(10268);
            }
            
            public 0xU(final 1cy liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                final Fld lji = this.LIZ.LJI;
                if (lji != null) {
                    lji.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                }
                final Fld lji2 = this.LIZ.LJI;
                if (lji2 != null) {
                    lji2.setVisibility(0);
                }
                final Fld lji3 = this.LIZ.LJI;
                if (lji3 != null) {
                    lji3.setScaleType(2);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1cy.LJ:LX/VvS;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          15
        //     9: aload_1        
        //    10: invokeinterface X/VvS.LJIIIIZZ:()V
        //    15: aload_0        
        //    16: getfield        X/1cy.LIZ:LX/1cz;
        //    19: astore_1       
        //    20: aload_1        
        //    21: ifnull          30
        //    24: aload_1        
        //    25: invokeinterface X/1cz.LIZIZ:()V
        //    30: aload_0        
        //    31: aconst_null    
        //    32: putfield        X/1cy.LIZ:LX/1cz;
        //    35: aload_0        
        //    36: ldc             "no sei parsed, release window mask."
        //    38: invokevirtual   X/1cy.LIZIZ:(Ljava/lang/String;)V
        //    41: aload_0        
        //    42: getfield        X/1cy.LJII:Landroid/view/ViewGroup$LayoutParams;
        //    45: ifnull          73
        //    48: aload_0        
        //    49: getfield        X/1cy.LJI:LX/Fld;
        //    52: astore_1       
        //    53: aload_1        
        //    54: ifnull          73
        //    57: aload_1        
        //    58: new             LX/0xU;
        //    61: dup            
        //    62: aload_0        
        //    63: invokespecial   X/0xU.<init>:(LX/1cy;)V
        //    66: ldc2_w          20
        //    69: invokevirtual   X/Fld.postDelayed:(Ljava/lang/Runnable;J)Z
        //    72: pop            
        //    73: return         
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
    
    public final int LIZLLL() {
        final 1cz liz = this.LIZ;
        if (liz == null) {
            return 0;
        }
        if (liz instanceof 1ly) {
            return 4;
        }
        return 0;
    }
    
    public final void onLayoutSwitch(final Vva vva, final int n) {
        public final class 29B extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cy LIZ;
            public final /* synthetic */ Vva LIZIZ;
            public final /* synthetic */ int LIZJ;
            
            static {
                Covode.recordClassIndex(10274);
            }
            
            public 29B(final 1cy liz, final Vva liziz, final int lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: new             LX/29B;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: iload_2        
        //    12: invokespecial   X/29B.<init>:(LX/1cy;LX/Vva;I)V
        //    15: invokevirtual   X/1cy.LIZ:(LX/QgG;)V
        //    18: return         
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
    
    public final void onLayoutWindowUpdate(final Vva vva, final int n) {
        CTM.LIZ((Object)vva);
        CTM.LIZ((Object)vva);
    }
    
    public final void onPlayerRangeCalculateFinish(final Vva vva) {
        CTM.LIZ((Object)vva);
        CTM.LIZ((Object)vva);
    }
    
    public final void onPreLayoutSwitch(final Vva vva) {
        public final class 29C extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cy LIZ;
            public final /* synthetic */ Vva LIZIZ;
            
            static {
                Covode.recordClassIndex(10275);
            }
            
            public 29C(final 1cy liz, final Vva liziz) {
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
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: new             LX/29C;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   X/29C.<init>:(LX/1cy;LX/Vva;)V
        //    14: invokevirtual   X/1cy.LIZ:(LX/QgG;)V
        //    17: return         
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
    
    public final void onSeiBattleIdUpdated(final long n) {
    }
    
    public final void onUserJoinedForHost(final Vwg vwg) {
        CTM.LIZ((Object)vwg);
        CTM.LIZ((Object)vwg);
    }
    
    public final void onWindowStateChanged(final Vvh vvh, final Vv3 vv3, final Vv3 vv4, final PZ3 pz3, final 2XZ 2xz) {
        public final class 29E extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cy LIZ;
            public final /* synthetic */ 2XZ LIZIZ;
            public final /* synthetic */ Vvh LIZJ;
            public final /* synthetic */ Vv3 LIZLLL;
            public final /* synthetic */ Vv3 LJ;
            public final /* synthetic */ PZ3 LJFF;
            
            static {
                Covode.recordClassIndex(10277);
            }
            
            public 29E(final 1cy liz, final 2XZ liziz, final Vvh lizj, final Vv3 lizlll, final Vv3 lj, final PZ3 ljff) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
                this.LJFF = ljff;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload_3        
        //     3: aload           4
        //     5: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: ldc             "onWindowStateChanged "
        //    14: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    17: astore          6
        //    19: aload           6
        //    21: aload_0        
        //    22: invokespecial   X/1cy.LJ:()Z
        //    25: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    28: pop            
        //    29: aload           6
        //    31: bipush          32
        //    33: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    36: pop            
        //    37: aload           6
        //    39: aload_1        
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: aload           6
        //    46: bipush          32
        //    48: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    51: pop            
        //    52: aload           6
        //    54: aload           5
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: aload_0        
        //    61: aload           6
        //    63: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    66: invokevirtual   X/1cy.LIZIZ:(Ljava/lang/String;)V
        //    69: aload_0        
        //    70: new             LX/29E;
        //    73: dup            
        //    74: aload_0        
        //    75: aload           5
        //    77: aload_1        
        //    78: aload_2        
        //    79: aload_3        
        //    80: aload           4
        //    82: invokespecial   X/29E.<init>:(LX/1cy;LX/2XZ;LX/Vvh;LX/Vv3;LX/Vv3;LX/PZ3;)V
        //    85: invokevirtual   X/1cy.LIZ:(LX/QgG;)V
        //    88: return         
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
