// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView.s;
import android.util.DisplayMetrics;
import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class 1gk extends 16s
{
    public 0Fj LIZIZ;
    public 0Fj LIZJ;
    
    static {
        Covode.recordClassIndex(1668);
    }
    
    private int LIZ(final View view, final 0Fj 0Fj) {
        return 0Fj.LIZ(view) + 0Fj.LJ(view) / 2 - (0Fj.LIZIZ() + 0Fj.LJ() / 2);
    }
    
    private View LIZ(final i i, final 0Fj 0Fj) {
        final int ljiji = i.LJIJI();
        View view = null;
        if (ljiji == 0) {
            return null;
        }
        final int liziz = 0Fj.LIZIZ();
        final int n = 0Fj.LJ() / 2;
        int n2 = Integer.MAX_VALUE;
        int n3;
        for (int j = 0; j < ljiji; ++j, n2 = n3) {
            final View lji = i.LJI(j);
            final int abs = Math.abs(0Fj.LIZ(lji) + 0Fj.LJ(lji) / 2 - (liziz + n));
            if (abs < (n3 = n2)) {
                view = lji;
                n3 = abs;
            }
        }
        return view;
    }
    
    private 0Fj LIZLLL(final i i) {
        final 0Fj liziz = this.LIZIZ;
        if (liziz == null || liziz.LIZ != i) {
            this.LIZIZ = 0Fj.LIZIZ(i);
        }
        return this.LIZIZ;
    }
    
    private 0Fj LJ(final i i) {
        final 0Fj lizj = this.LIZJ;
        if (lizj == null || lizj.LIZ != i) {
            this.LIZJ = 0Fj.LIZ(i);
        }
        return this.LIZJ;
    }
    
    @Override
    public int LIZ(final i i, int n, int n2) {
        final int ljjiii = i.LJJIII();
        if (ljjiii == 0) {
            return -1;
        }
        final boolean lji = i.LJI();
        View view = null;
        0Fj 0Fj;
        if (lji) {
            0Fj = this.LIZLLL(i);
        }
        else {
            if (!i.LJFF()) {
                return -1;
            }
            0Fj = this.LJ(i);
        }
        if (0Fj != null) {
            final int ljiji = i.LJIJI();
            final int n3 = 0;
            View view2 = null;
            int n4 = Integer.MIN_VALUE;
            int n5 = Integer.MAX_VALUE;
            int n6;
            int n7;
            View view3;
            View view4;
            for (int j = 0; j < ljiji; ++j, n5 = n6, n4 = n7, view2 = view3, view = view4) {
                final View lji2 = i.LJI(j);
                n6 = n5;
                n7 = n4;
                view3 = view2;
                view4 = view;
                if (lji2 != null) {
                    final int liz = this.LIZ(lji2, 0Fj);
                    int n8 = n4;
                    View view5 = view2;
                    if (liz <= 0) {
                        if (liz > (n8 = n4)) {
                            view2 = lji2;
                            n8 = liz;
                        }
                        n6 = n5;
                        n7 = n8;
                        view3 = view2;
                        view4 = view;
                        if (liz < 0) {
                            continue;
                        }
                        view5 = view2;
                    }
                    n6 = n5;
                    n7 = n8;
                    view3 = view5;
                    view4 = view;
                    if (liz < n5) {
                        n6 = liz;
                        view4 = lji2;
                        view3 = view5;
                        n7 = n8;
                    }
                }
            }
            final boolean ljff = i.LJFF();
            int n9 = 1;
            Label_0302: {
                Label_0284: {
                    if (ljff) {
                        if (n <= 0) {
                            break Label_0284;
                        }
                    }
                    else if (n2 <= 0) {
                        break Label_0284;
                    }
                    n = 1;
                    if (view != null) {
                        return i.LJI(view);
                    }
                    view = view2;
                    break Label_0302;
                }
                n = 0;
                if (view2 != null) {
                    return i.LJI(view2);
                }
            }
            if (view == null) {
                return -1;
            }
            final int lji3 = i.LJI(view);
            final int ljjiii2 = i.LJJIII();
            n2 = n3;
            Label_0377: {
                if (i instanceof s.b) {
                    final PointF lizlll = ((s.b)i).LIZLLL(ljjiii2 - 1);
                    n2 = n3;
                    if (lizlll != null) {
                        if (lizlll.x >= 0.0f) {
                            n2 = n3;
                            if (lizlll.y >= 0.0f) {
                                break Label_0377;
                            }
                        }
                        n2 = 1;
                    }
                }
            }
            if (n2 == n) {
                n9 = -1;
            }
            n = lji3 + n9;
            if (n < 0 || n >= ljjiii) {
                return -1;
            }
            return n;
        }
        return -1;
    }
    
    @Override
    public View LIZ(final i i) {
        if (i.LJI()) {
            return this.LIZ(i, this.LIZLLL(i));
        }
        if (i.LJFF()) {
            return this.LIZ(i, this.LJ(i));
        }
        return null;
    }
    
    @Override
    public int[] LIZ(final i i, final View view) {
        final int[] array = new int[2];
        if (i.LJFF()) {
            array[0] = this.LIZ(view, this.LJ(i));
        }
        else {
            array[0] = 0;
        }
        if (i.LJI()) {
            array[1] = this.LIZ(view, this.LIZLLL(i));
        }
        else {
            array[1] = 0;
        }
        return array;
    }
    
    @Override
    public final s LIZIZ(final i i) {
        public final class 1gj extends 17G
        {
            public final /* synthetic */ 1gk LJFF;
            
            static {
                Covode.recordClassIndex(1669);
            }
            
            public 1gj(final 1gk ljff, final Context context) {
                this.LJFF = ljff;
                super(context);
            }
            
            @Override
            public final float LIZ(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
            
            @Override
            public final void LIZ(final View view, final t t, final a a) {
                final 1gk ljff = this.LJFF;
                final int[] liz = ljff.LIZ(ljff.LIZ.getLayoutManager(), view);
                final int n = liz[0];
                final int n2 = liz[1];
                final int liz2 = this.LIZ(Math.max(Math.abs(n), Math.abs(n2)));
                if (liz2 > 0) {
                    a.LIZ(n, n2, liz2, (Interpolator)super.LIZIZ);
                }
            }
            
            @Override
            public final int LIZIZ(final int n) {
                return Math.min(100, super.LIZIZ(n));
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
        //     9: new             LX/1gj;
        //    12: dup            
        //    13: aload_0        
        //    14: aload_0        
        //    15: getfield        X/16s.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //    18: invokevirtual   androidx/recyclerview/widget/RecyclerView.getContext:()Landroid/content/Context;
        //    21: invokespecial   X/1gj.<init>:(LX/1gk;Landroid/content/Context;)V
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
