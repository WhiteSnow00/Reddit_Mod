// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView.s;
import android.util.DisplayMetrics;
import android.content.Context;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class 16s extends l
{
    public RecyclerView LIZ;
    public Scroller LIZIZ;
    public final n LIZJ;
    
    static {
        Covode.recordClassIndex(1567);
    }
    
    public 16s() {
        this.LIZJ = new 16r(this);
    }
    
    public abstract int LIZ(final i p0, final int p1, final int p2);
    
    public abstract View LIZ(final i p0);
    
    public final void LIZ() {
        final RecyclerView liz = this.LIZ;
        if (liz == null) {
            return;
        }
        final i layoutManager = liz.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        final View liz2 = this.LIZ(layoutManager);
        if (liz2 == null) {
            return;
        }
        final int[] liz3 = this.LIZ(layoutManager, liz2);
        if (liz3[0] != 0 || liz3[1] != 0) {
            this.LIZ.LIZ(liz3[0], liz3[1]);
        }
    }
    
    public void LIZ(final RecyclerView liz) {
        final RecyclerView liz2 = this.LIZ;
        if (liz2 == liz) {
            return;
        }
        if (liz2 != null) {
            liz2.LIZIZ(this.LIZJ);
            this.LIZ.setOnFlingListener((l)null);
        }
        if ((this.LIZ = liz) != null) {
            if (liz.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.LIZ.LIZ(this.LIZJ);
            this.LIZ.setOnFlingListener((l)this);
            this.LIZIZ = new Scroller(this.LIZ.getContext(), (Interpolator)new DecelerateInterpolator());
            this.LIZ();
        }
    }
    
    @Override
    public final boolean LIZ(int liz, final int n) {
        final i layoutManager = this.LIZ.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (this.LIZ.getAdapter() == null) {
            return false;
        }
        final int minFlingVelocity = this.LIZ.getMinFlingVelocity();
        if ((Math.abs(n) > minFlingVelocity || Math.abs(liz) > minFlingVelocity) && layoutManager instanceof s.b) {
            final s liziz = this.LIZIZ(layoutManager);
            if (liziz != null) {
                liz = this.LIZ(layoutManager, liz, n);
                if (liz != -1) {
                    liziz.LJI = liz;
                    layoutManager.LIZ(liziz);
                    return true;
                }
            }
        }
        return false;
    }
    
    public abstract int[] LIZ(final i p0, final View p1);
    
    public s LIZIZ(final i i) {
        return this.LIZJ(i);
    }
    
    public final int[] LIZIZ(final int n, final int n2) {
        this.LIZIZ.fling(0, 0, n, n2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[] { this.LIZIZ.getFinalX(), this.LIZIZ.getFinalY() };
    }
    
    public 17G LIZJ(final i i) {
        public final class 1gg extends 17G
        {
            public final /* synthetic */ 16s LJFF;
            
            static {
                Covode.recordClassIndex(1569);
            }
            
            public 1gg(final 16s ljff, final Context context) {
                this.LJFF = ljff;
                super(context);
            }
            
            @Override
            public final float LIZ(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
            
            @Override
            public final void LIZ(final View view, final t t, final a a) {
                if (this.LJFF.LIZ == null) {
                    return;
                }
                final 16s ljff = this.LJFF;
                final int[] liz = ljff.LIZ(ljff.LIZ.getLayoutManager(), view);
                final int n = liz[0];
                final int n2 = liz[1];
                final int liz2 = this.LIZ(Math.max(Math.abs(n), Math.abs(n2)));
                if (liz2 > 0) {
                    a.LIZ(n, n2, liz2, (Interpolator)super.LIZIZ);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      LX/0EV;
        //     4: ifne            9
        //     7: aconst_null    
        //     8: areturn        
        //     9: new             LX/1gg;
        //    12: dup            
        //    13: aload_0        
        //    14: aload_0        
        //    15: getfield        X/16s.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //    18: invokevirtual   androidx/recyclerview/widget/RecyclerView.getContext:()Landroid/content/Context;
        //    21: invokespecial   X/1gg.<init>:(LX/16s;Landroid/content/Context;)V
        //    24: areturn        
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
