// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.animation.Animation;
import android.view.LayoutInflater$Factory;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.FrameLayout;

public final class 0mT extends FrameLayout
{
    public 2fc LIZ;
    public final 5DO LIZIZ;
    public final 5DO LIZJ;
    public final 5DO LIZLLL;
    public final 5DO LJ;
    public final 5DO LJFF;
    
    static {
        Covode.recordClassIndex(7567);
    }
    
    public 0mT(final Context context) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aconst_null    
        //     7: iconst_0       
        //     8: invokespecial   android/widget/FrameLayout.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    11: sipush          10897
        //    14: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    17: aload_0        
        //    18: new             LX/1wq;
        //    21: dup            
        //    22: aload_0        
        //    23: invokespecial   X/1wq.<init>:(LX/0mT;)V
        //    26: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    29: putfield        X/0mT.LIZIZ:LX/5DO;
        //    32: aload_0        
        //    33: new             LX/1wr;
        //    36: dup            
        //    37: aload_0        
        //    38: invokespecial   X/1wr.<init>:(LX/0mT;)V
        //    41: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    44: putfield        X/0mT.LIZJ:LX/5DO;
        //    47: aload_0        
        //    48: new             LX/1wu;
        //    51: dup            
        //    52: aload_0        
        //    53: invokespecial   X/1wu.<init>:(LX/0mT;)V
        //    56: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    59: putfield        X/0mT.LIZLLL:LX/5DO;
        //    62: aload_0        
        //    63: new             LX/1ws;
        //    66: dup            
        //    67: aload_0        
        //    68: invokespecial   X/1ws.<init>:(LX/0mT;)V
        //    71: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    74: putfield        X/0mT.LJ:LX/5DO;
        //    77: aload_0        
        //    78: new             LX/1wt;
        //    81: dup            
        //    82: aload_0        
        //    83: invokespecial   X/1wt.<init>:(LX/0mT;)V
        //    86: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    89: putfield        X/0mT.LJFF:LX/5DO;
        //    92: aload_0        
        //    93: invokevirtual   X/0mT.getContext:()Landroid/content/Context;
        //    96: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    99: aload_0        
        //   100: invokestatic    X/0mT.LIZ:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
        //   103: pop            
        //   104: sipush          10897
        //   107: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   110: return         
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
    
    public static View LIZ(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        MethodCollector.i(10899);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(2131562406, viewGroup);
                MethodCollector.o(10899);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(2131562406, viewGroup);
        MethodCollector.o(10899);
        return inflate2;
    }
    
    private final Animation getMAnimation1() {
        return (Animation)this.LJ.getValue();
    }
    
    private final Animation getMAnimation2() {
        return (Animation)this.LJFF.getValue();
    }
    
    public final void LIZ() {
        I4y.LIZ(this.getMAnimView1(), 0);
        this.getMAnimView1().startAnimation(this.getMAnimation1());
        I4y.LIZ(this.getMAnimView2(), 0);
        this.getMAnimView2().startAnimation(this.getMAnimation2());
    }
    
    public final View getMAnimView1() {
        return (View)this.LIZIZ.getValue();
    }
    
    public final View getMAnimView2() {
        return (View)this.LIZJ.getValue();
    }
    
    public final 7wT getMUserAvatar() {
        return (7wT)this.LIZLLL.getValue();
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final 2fc liz = this.LIZ;
        if (liz != null) {
            liz.dispose();
        }
        this.getMAnimation1().cancel();
        this.getMAnimation2().cancel();
    }
}
