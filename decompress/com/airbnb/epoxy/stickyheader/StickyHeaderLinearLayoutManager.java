// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.epoxy.stickyheader;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import X.2P9;
import android.os.Parcelable;
import X.CTM;
import X.F5g;
import X.RjR;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import X.5u3;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import kotlin.jvm.internal.n;
import X.QgG;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import android.view.View;
import java.util.List;
import X.1B2;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager
{
    public 1B2 LIZ;
    public final List<Integer> LIZIZ;
    public View LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public float LJI;
    public float LJII;
    public final StickyHeaderLinearLayoutManager.a LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(2190);
    }
    
    private final <T> T LIZ(final QgG<? extends T> qgG) {
        final View lizj = this.LIZJ;
        if (lizj != null) {
            ((RecyclerView.i)this).LJIIIZ(lizj);
        }
        final Object invoke = qgG.invoke();
        final View lizj2 = this.LIZJ;
        if (lizj2 != null) {
            ((RecyclerView.i)this).LJIIJ(lizj2);
        }
        return (T)invoke;
    }
    
    private final void LIZ(final RecyclerView.a<?> a) {
        final 1B2 liz = this.LIZ;
        if (liz != null) {
            ((RecyclerView.a)liz).unregisterAdapterDataObserver((RecyclerView.c)this.LJIIIIZZ);
        }
        if (a instanceof 1B2) {
            final 1B2 liz2 = (1B2)a;
            if ((this.LIZ = liz2) != null) {
                ((RecyclerView.a)liz2).registerAdapterDataObserver((RecyclerView.c)this.LJIIIIZZ);
            }
            ((RecyclerView.c)this.LJIIIIZZ).LIZ();
            return;
        }
        this.LIZ = null;
        this.LIZIZ.clear();
    }
    
    private final void LIZ(final o o, final int lizlll) {
        final View liziz = o.LIZIZ(lizlll);
        n.LIZ((Object)liziz, "");
        final 1B2 liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(liziz);
        }
        ((RecyclerView.i)this).LJ(liziz);
        this.LIZ(liziz);
        ((RecyclerView.i)this).LJIIJJI(liziz);
        this.LIZJ = liziz;
        this.LIZLLL = lizlll;
    }
    
    private final void LIZ(final o o, final View view, final int lizlll) {
        public final class 0J9 implements ViewTreeObserver$OnGlobalLayoutListener
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ View LIZIZ;
            
            static {
                Covode.recordClassIndex(2194);
            }
            
            public 0J9(final StickyHeaderLinearLayoutManager liz, final View liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onGlobalLayout() {
                this.LIZIZ.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                if (this.LIZ.LJ != -1) {
                    final StickyHeaderLinearLayoutManager liz = this.LIZ;
                    liz.LIZ(liz.LJ, this.LIZ.LJFF);
                    this.LIZ.LJ(-1, Integer.MIN_VALUE);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: iload_3        
        //     3: invokevirtual   X/0ES.LIZ:(Landroid/view/View;I)V
        //     6: aload_0        
        //     7: iload_3        
        //     8: putfield        com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZLLL:I
        //    11: aload_0        
        //    12: aload_2        
        //    13: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(Landroid/view/View;)V
        //    16: aload_0        
        //    17: getfield        com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LJ:I
        //    20: iconst_m1      
        //    21: if_icmpeq       40
        //    24: aload_2        
        //    25: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    28: new             LX/0J9;
        //    31: dup            
        //    32: aload_0        
        //    33: aload_2        
        //    34: invokespecial   X/0J9.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroid/view/View;)V
        //    37: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
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
    
    private final void LIZ(final o o, final boolean b) {
        final int size = this.LIZIZ.size();
        final int ljiji = ((RecyclerView.i)this).LJIJI();
        if (size > 0 && ljiji > 0) {
            int n = 0;
            while (true) {
                final View view = null;
                if (n >= ljiji) {
                    break;
                }
                final View lji = ((RecyclerView.i)this).LJI(n);
                if (lji == null) {
                    kotlin.jvm.internal.n.LIZ();
                }
                final ViewGroup$LayoutParams layoutParams = lji.getLayoutParams();
                if (layoutParams == null) {
                    throw new 5u3("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                final j j = (j)layoutParams;
                if (this.LIZ(lji, j)) {
                    final int aq_ = j.aq_();
                    if (aq_ == -1) {
                        break;
                    }
                    int ljiijji = this.LJIIJJI(aq_);
                    int intValue;
                    if (ljiijji != -1) {
                        intValue = this.LIZIZ.get(ljiijji).intValue();
                    }
                    else {
                        intValue = -1;
                    }
                    ++ljiijji;
                    int intValue2;
                    if (size > ljiijji) {
                        intValue2 = this.LIZIZ.get(ljiijji).intValue();
                    }
                    else {
                        intValue2 = -1;
                    }
                    if (intValue != -1 && (intValue != aq_ || this.LIZIZ(lji)) && intValue2 != intValue + 1) {
                        final View lizj = this.LIZJ;
                        if (lizj != null) {
                            final int ljii = ((RecyclerView.i)this).LJII(lizj);
                            final 1B2 liz = this.LIZ;
                            if (liz == null || ljii != ((RecyclerView.a)liz).getItemViewType(intValue)) {
                                this.LIZLLL(o);
                            }
                        }
                        if (this.LIZJ == null) {
                            this.LIZ(o, intValue);
                        }
                        Label_0300: {
                            if (!b) {
                                final View lizj2 = this.LIZJ;
                                if (lizj2 == null) {
                                    kotlin.jvm.internal.n.LIZ();
                                }
                                if (((RecyclerView.i)this).LJI(lizj2) == intValue) {
                                    break Label_0300;
                                }
                            }
                            final View lizj3 = this.LIZJ;
                            if (lizj3 == null) {
                                kotlin.jvm.internal.n.LIZ();
                            }
                            this.LIZ(o, lizj3, intValue);
                        }
                        final View lizj4 = this.LIZJ;
                        if (lizj4 != null) {
                            View view2 = view;
                            if (intValue2 != -1) {
                                final View lji2 = ((RecyclerView.i)this).LJI(n + (intValue2 - aq_));
                                view2 = view;
                                if (lji2 != this.LIZJ) {
                                    view2 = lji2;
                                }
                            }
                            lizj4.setTranslationX(this.LIZJ(lizj4, view2));
                            lizj4.setTranslationY(this.LIZIZ(lizj4, view2));
                        }
                        return;
                    }
                    break;
                }
                else {
                    ++n;
                }
            }
        }
        if (this.LIZJ != null) {
            this.LIZLLL(o);
        }
    }
    
    private final void LIZ(final View view) {
        ((RecyclerView.i)this).LJIILIIL(view);
        if (super.LJIIIZ != 1) {
            view.layout(0, ((RecyclerView.i)this).LJIJJLI(), view.getMeasuredWidth(), super.LJJIJL - ((RecyclerView.i)this).LJJ());
            return;
        }
        view.layout(((RecyclerView.i)this).LJIJJ(), 0, super.LJJIJIL - ((RecyclerView.i)this).LJIL(), view.getMeasuredHeight());
    }
    
    private final boolean LIZ(final View view, final j j) {
        if (!j.ap_() && !j.ao_()) {
            if (super.LJIIIZ != 1) {
                if (super.LJIIJJI) {
                    return view.getLeft() + view.getTranslationX() <= super.LJJIJIL + this.LJI;
                }
                return view.getRight() - view.getTranslationX() >= this.LJI;
            }
            else {
                if (super.LJIIJJI) {
                    return view.getTop() + view.getTranslationY() <= super.LJJIJL + this.LJII;
                }
                if (view.getBottom() - view.getTranslationY() >= this.LJII) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final float LIZIZ(final View view, final View view2) {
        if (super.LJIIIZ != 1) {
            return this.LJII;
        }
        float ljii;
        final float n = ljii = this.LJII;
        if (super.LJIIJJI) {
            ljii = n + (super.LJJIJL - view.getHeight());
        }
        float n2 = ljii;
        if (view2 != null) {
            Object layoutParams = view2.getLayoutParams();
            final boolean b = layoutParams instanceof ViewGroup$MarginLayoutParams;
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = null;
            if (!b) {
                layoutParams = null;
            }
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams2 = (ViewGroup$MarginLayoutParams)layoutParams;
            int topMargin = 0;
            int bottomMargin;
            if (viewGroup$MarginLayoutParams2 != null) {
                bottomMargin = viewGroup$MarginLayoutParams2.bottomMargin;
            }
            else {
                bottomMargin = 0;
            }
            Object layoutParams2 = view2.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup$MarginLayoutParams)) {
                layoutParams2 = viewGroup$MarginLayoutParams;
            }
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams3 = (ViewGroup$MarginLayoutParams)layoutParams2;
            if (viewGroup$MarginLayoutParams3 != null) {
                topMargin = viewGroup$MarginLayoutParams3.topMargin;
            }
            if (super.LJIIJJI) {
                n2 = RjR.LIZIZ((float)(view2.getBottom() + bottomMargin), ljii);
            }
            else {
                n2 = RjR.LIZJ((float)(view2.getTop() - topMargin - view.getHeight()), ljii);
            }
        }
        return n2;
    }
    
    private final boolean LIZIZ(final View view) {
        if (super.LJIIIZ != 1) {
            if (super.LJIIJJI) {
                return view.getRight() - view.getTranslationX() > super.LJJIJIL + this.LJI;
            }
            return view.getLeft() + view.getTranslationX() < this.LJI;
        }
        else {
            if (super.LJIIJJI) {
                return view.getBottom() - view.getTranslationY() > super.LJJIJL + this.LJII;
            }
            return view.getTop() + view.getTranslationY() < this.LJII;
        }
    }
    
    private final float LIZJ(final View view, final View view2) {
        if (super.LJIIIZ != 0) {
            return this.LJI;
        }
        float lji;
        final float n = lji = this.LJI;
        if (super.LJIIJJI) {
            lji = n + (super.LJJIJIL - view.getWidth());
        }
        float n2 = lji;
        if (view2 != null) {
            Object layoutParams = view2.getLayoutParams();
            final boolean b = layoutParams instanceof ViewGroup$MarginLayoutParams;
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = null;
            if (!b) {
                layoutParams = null;
            }
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams2 = (ViewGroup$MarginLayoutParams)layoutParams;
            int rightMargin = 0;
            int leftMargin;
            if (viewGroup$MarginLayoutParams2 != null) {
                leftMargin = viewGroup$MarginLayoutParams2.leftMargin;
            }
            else {
                leftMargin = 0;
            }
            Object layoutParams2 = view2.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup$MarginLayoutParams)) {
                layoutParams2 = viewGroup$MarginLayoutParams;
            }
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams3 = (ViewGroup$MarginLayoutParams)layoutParams2;
            if (viewGroup$MarginLayoutParams3 != null) {
                rightMargin = viewGroup$MarginLayoutParams3.rightMargin;
            }
            if (super.LJIIJJI) {
                n2 = RjR.LIZIZ((float)(view2.getRight() + rightMargin), lji);
            }
            else {
                n2 = RjR.LIZJ((float)(view2.getLeft() - leftMargin - view.getWidth()), lji);
            }
        }
        return n2;
    }
    
    private final void LJFF(final int n, int n2) {
        this.LJ(-1, Integer.MIN_VALUE);
        final int ljiijji = this.LJIIJJI(n);
        if (ljiijji == -1 || this.LIZ(n) != -1) {
            super.LIZ(n, n2);
            return;
        }
        final int n3 = n - 1;
        if (this.LIZ(n3) != -1) {
            super.LIZ(n3, n2);
            return;
        }
        if (this.LIZJ != null && ljiijji == this.LIZ(this.LIZLLL)) {
            if (n2 == Integer.MIN_VALUE) {
                n2 = 0;
            }
            final View lizj = this.LIZJ;
            if (lizj == null) {
                n.LIZ();
            }
            super.LIZ(n, n2 + lizj.getHeight());
            return;
        }
        this.LJ(n, n2);
        super.LIZ(n, n2);
    }
    
    private final int LJIIJJI(final int n) {
        int n2 = this.LIZIZ.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = (i + n2) / 2;
            if (this.LIZIZ.get(n3).intValue() <= n) {
                if (n3 < this.LIZIZ.size() - 1) {
                    final List<Integer> liziz = this.LIZIZ;
                    i = n3 + 1;
                    if (liziz.get(i).intValue() <= n) {
                        continue;
                    }
                }
                return n3;
            }
            n2 = n3 - 1;
        }
        return -1;
    }
    
    public final int LIZ(final int n) {
        int n2 = this.LIZIZ.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = (i + n2) / 2;
            if (this.LIZIZ.get(n3).intValue() > n) {
                n2 = n3 - 1;
            }
            else {
                if (this.LIZIZ.get(n3).intValue() >= n) {
                    return n3;
                }
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    @Override
    public final int LIZ(final int intValue, final o o, final t t) {
        public final class 1nh extends F5g implements QgG<Integer>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ int LIZIZ;
            public final /* synthetic */ o LIZJ;
            public final /* synthetic */ t LIZLLL;
            
            static {
                Covode.recordClassIndex(2204);
            }
            
            public 1nh(final StickyHeaderLinearLayoutManager liz, final int liziz, final o lizj, final t lizlll) {
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
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: new             LX/1nh;
        //     8: dup            
        //     9: aload_0        
        //    10: iload_1        
        //    11: aload_2        
        //    12: aload_3        
        //    13: invokespecial   X/1nh.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILX/0ES;LX/0EX;)V
        //    16: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    19: checkcast       Ljava/lang/Number;
        //    22: invokevirtual   java/lang/Number.intValue:()I
        //    25: istore_1       
        //    26: iload_1        
        //    27: ifeq            36
        //    30: aload_0        
        //    31: aload_2        
        //    32: iconst_0       
        //    33: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/0ES;Z)V
        //    36: iload_1        
        //    37: ireturn        
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
    
    @Override
    public final View LIZ(final View view, final int n, final o o, final t t) {
        public final class 1nf extends F5g implements QgG<View>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ View LIZIZ;
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ o LIZLLL;
            public final /* synthetic */ t LJ;
            
            static {
                Covode.recordClassIndex(2202);
            }
            
            public 1nf(final StickyHeaderLinearLayoutManager liz, final View liziz, final int lizj, final o lizlll, final t lj) {
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
        //     1: aload_3        
        //     2: aload           4
        //     4: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //     7: aload_0        
        //     8: new             LX/1nf;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: iload_2        
        //    15: aload_3        
        //    16: aload           4
        //    18: invokespecial   X/1nf.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroid/view/View;ILX/0ES;LX/0EX;)V
        //    21: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    24: checkcast       Landroid/view/View;
        //    27: areturn        
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
    public final void LIZ(final int n, final int n2) {
        this.LJFF(n, n2);
    }
    
    @Override
    public final void LIZ(final RecyclerView.a<?> a, final RecyclerView.a<?> a2) {
        super.LIZ(a, a2);
        this.LIZ(a2);
    }
    
    @Override
    public final void LIZ(final Parcelable parcelable) {
        Object o = parcelable;
        if (!(parcelable instanceof SavedState)) {
            o = null;
        }
        final SavedState savedState = (SavedState)o;
        if (savedState != null) {
            this.LJ = savedState.LIZIZ;
            this.LJFF = savedState.LIZJ;
            super.LIZ(savedState.LIZ);
        }
    }
    
    @Override
    public final int LIZIZ(final int intValue, final o o, final t t) {
        public final class 1ni extends F5g implements QgG<Integer>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ int LIZIZ;
            public final /* synthetic */ o LIZJ;
            public final /* synthetic */ t LIZLLL;
            
            static {
                Covode.recordClassIndex(2205);
            }
            
            public 1ni(final StickyHeaderLinearLayoutManager liz, final int liziz, final o lizj, final t lizlll) {
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
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: new             LX/1ni;
        //     8: dup            
        //     9: aload_0        
        //    10: iload_1        
        //    11: aload_2        
        //    12: aload_3        
        //    13: invokespecial   X/1ni.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILX/0ES;LX/0EX;)V
        //    16: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    19: checkcast       Ljava/lang/Number;
        //    22: invokevirtual   java/lang/Number.intValue:()I
        //    25: istore_1       
        //    26: iload_1        
        //    27: ifeq            36
        //    30: aload_0        
        //    31: aload_2        
        //    32: iconst_0       
        //    33: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/0ES;Z)V
        //    36: iload_1        
        //    37: ireturn        
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
    
    @Override
    public final int LIZIZ(final t t) {
        public final class 1na extends F5g implements QgG<Integer>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ t LIZIZ;
            
            static {
                Covode.recordClassIndex(2197);
            }
            
            public 1na(final StickyHeaderLinearLayoutManager liz, final t liziz) {
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
        //     5: new             LX/1na;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   X/1na.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;LX/0EX;)V
        //    14: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    17: checkcast       Ljava/lang/Number;
        //    20: invokevirtual   java/lang/Number.intValue:()I
        //    23: ireturn        
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
    
    @Override
    public final int LIZJ(final t t) {
        public final class 1ne extends F5g implements QgG<Integer>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ t LIZIZ;
            
            static {
                Covode.recordClassIndex(2201);
            }
            
            public 1ne(final StickyHeaderLinearLayoutManager liz, final t liziz) {
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
        //     5: new             LX/1ne;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   X/1ne.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;LX/0EX;)V
        //    14: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    17: checkcast       Ljava/lang/Number;
        //    20: invokevirtual   java/lang/Number.intValue:()I
        //    23: ireturn        
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
    
    @Override
    public final void LIZJ(final o o, final t t) {
        public final class 1ng extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ o LIZIZ;
            public final /* synthetic */ t LIZJ;
            
            static {
                Covode.recordClassIndex(2203);
            }
            
            public 1ng(final StickyHeaderLinearLayoutManager liz, final o liziz, final t lizj) {
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
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: new             LX/1ng;
        //     9: dup            
        //    10: aload_0        
        //    11: aload_1        
        //    12: aload_2        
        //    13: invokespecial   X/1ng.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;LX/0ES;LX/0EX;)V
        //    16: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    19: pop            
        //    20: aload_2        
        //    21: getfield        X/0EX.LJI:Z
        //    24: ifne            33
        //    27: aload_0        
        //    28: aload_1        
        //    29: iconst_1       
        //    30: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/0ES;Z)V
        //    33: return         
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
    public final void LIZJ(final RecyclerView recyclerView) {
        CTM.LIZ((Object)recyclerView);
        super.LIZJ(recyclerView);
        this.LIZ(recyclerView.getAdapter());
    }
    
    @Override
    public final int LIZLLL(final t t) {
        public final class 1nZ extends F5g implements QgG<Integer>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ t LIZIZ;
            
            static {
                Covode.recordClassIndex(2196);
            }
            
            public 1nZ(final StickyHeaderLinearLayoutManager liz, final t liziz) {
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
        //     5: new             LX/1nZ;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   X/1nZ.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;LX/0EX;)V
        //    14: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    17: checkcast       Ljava/lang/Number;
        //    20: invokevirtual   java/lang/Number.intValue:()I
        //    23: ireturn        
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
    
    @Override
    public final PointF LIZLLL(final int n) {
        public final class 1nb extends F5g implements QgG<PointF>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ int LIZIZ;
            
            static {
                Covode.recordClassIndex(2198);
            }
            
            public 1nb(final StickyHeaderLinearLayoutManager liz, final int liziz) {
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
        //     1: new             LX/1nb;
        //     4: dup            
        //     5: aload_0        
        //     6: iload_1        
        //     7: invokespecial   X/1nb.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)V
        //    10: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    13: checkcast       Landroid/graphics/PointF;
        //    16: areturn        
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
    
    public final void LIZLLL(final o o) {
        final View lizj = this.LIZJ;
        if (lizj == null) {
            return;
        }
        this.LIZJ = null;
        this.LIZLLL = -1;
        lizj.setTranslationX(0.0f);
        lizj.setTranslationY(0.0f);
        final 1B2 liz = this.LIZ;
        if (liz != null) {
            liz.LIZIZ(lizj);
        }
        ((RecyclerView.i)this).LJIIL(lizj);
        ((RecyclerView.i)this).LJFF(lizj);
        if (o != null) {
            o.LIZ(lizj);
        }
    }
    
    @Override
    public final int LJ(final t t) {
        public final class 1nd extends F5g implements QgG<Integer>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ t LIZIZ;
            
            static {
                Covode.recordClassIndex(2200);
            }
            
            public 1nd(final StickyHeaderLinearLayoutManager liz, final t liziz) {
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
        //     5: new             LX/1nd;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   X/1nd.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;LX/0EX;)V
        //    14: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    17: checkcast       Ljava/lang/Number;
        //    20: invokevirtual   java/lang/Number.intValue:()I
        //    23: ireturn        
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
    
    @Override
    public final Parcelable LJ() {
        return (Parcelable)new SavedState(super.LJ(), this.LJ, this.LJFF);
    }
    
    @Override
    public final void LJ(final int n) {
        this.LJFF(n, Integer.MIN_VALUE);
    }
    
    public final void LJ(final int lj, final int ljff) {
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    @Override
    public final int LJFF(final t t) {
        public final class 1nY extends F5g implements QgG<Integer>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ t LIZIZ;
            
            static {
                Covode.recordClassIndex(2195);
            }
            
            public 1nY(final StickyHeaderLinearLayoutManager liz, final t liziz) {
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
        //     5: new             LX/1nY;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   X/1nY.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;LX/0EX;)V
        //    14: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    17: checkcast       Ljava/lang/Number;
        //    20: invokevirtual   java/lang/Number.intValue:()I
        //    23: ireturn        
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
    
    @Override
    public final int LJI(final t t) {
        public final class 1nc extends F5g implements QgG<Integer>
        {
            public final /* synthetic */ StickyHeaderLinearLayoutManager LIZ;
            public final /* synthetic */ t LIZIZ;
            
            static {
                Covode.recordClassIndex(2199);
            }
            
            public 1nc(final StickyHeaderLinearLayoutManager liz, final t liziz) {
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
        //     5: new             LX/1nc;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   X/1nc.<init>:(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;LX/0EX;)V
        //    14: invokespecial   com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager.LIZ:(LX/QgG;)Ljava/lang/Object;
        //    17: checkcast       Ljava/lang/Number;
        //    20: invokevirtual   java/lang/Number.intValue:()I
        //    23: ireturn        
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
    
    public final int LJIIJ(final int n) {
        int n2 = this.LIZIZ.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = (i + n2) / 2;
            if (n3 > 0) {
                final List<Integer> liziz = this.LIZIZ;
                final int n4 = n3 - 1;
                if (liziz.get(n4).intValue() >= n) {
                    n2 = n4;
                    continue;
                }
            }
            if (this.LIZIZ.get(n3).intValue() >= n) {
                return n3;
            }
            i = n3 + 1;
        }
        return -1;
    }
    
    public static final class SavedState implements Parcelable
    {
        public static final Parcelable$Creator CREATOR;
        public final Parcelable LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        
        static {
            Covode.recordClassIndex(2191);
            CREATOR = (Parcelable$Creator)new SavedState.a();
        }
        
        public SavedState(final Parcelable liz, final int liziz, final int lizj) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof SavedState) {
                    final SavedState savedState = (SavedState)o;
                    if (n.LIZ((Object)this.LIZ, (Object)savedState.LIZ) && this.LIZIZ == savedState.LIZIZ && this.LIZJ == savedState.LIZJ) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final Parcelable liz = this.LIZ;
            int hashCode;
            if (liz != null) {
                hashCode = liz.hashCode();
            }
            else {
                hashCode = 0;
            }
            return (hashCode * 31 + this.LIZIZ) * 31 + this.LIZJ;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("SavedState(superState=");
            sb.append(this.LIZ);
            sb.append(", scrollPosition=");
            sb.append(this.LIZIZ);
            sb.append(", scrollOffset=");
            sb.append(this.LIZJ);
            sb.append(")");
            return sb.toString();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            CTM.LIZ((Object)parcel);
            parcel.writeParcelable(this.LIZ, n);
            parcel.writeInt(this.LIZIZ);
            parcel.writeInt(this.LIZJ);
        }
    }
}
