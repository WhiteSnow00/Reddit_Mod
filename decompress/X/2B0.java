// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.airbnb.epoxy.SimpleEpoxyController;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import com.airbnb.epoxy.PoolReference;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public class 2B0 extends RecyclerView
{
    public static final 0IY LJJJJLI;
    public boolean LJJJ;
    public final 1B9 LJJJI;
    public 0J4 LJJJIL;
    public RecyclerView.a<?> LJJJJ;
    public boolean LJJJJI;
    public int LJJJJIZL;
    public final Runnable LJJJJJ;
    public final List<1Au<?>> LJJJJJL;
    public final List<b<?, ?, ?>> LJJJJL;
    
    static {
        Covode.recordClassIndex(2107);
        LJJJJLI = new 0IY();
    }
    
    public 2B0(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 2B0(final Context context, final AttributeSet set, final char c) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: iconst_0       
        //     8: invokespecial   androidx/recyclerview/widget/RecyclerView.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    11: aload_0        
        //    12: new             LX/1B9;
        //    15: dup            
        //    16: invokespecial   X/1B9.<init>:()V
        //    19: putfield        X/2B0.LJJJI:LX/1B9;
        //    22: aload_0        
        //    23: iconst_1       
        //    24: putfield        X/2B0.LJJJJI:Z
        //    27: aload_0        
        //    28: sipush          2000
        //    31: putfield        X/2B0.LJJJJIZL:I
        //    34: aload_0        
        //    35: new             LX/0IP;
        //    38: dup            
        //    39: aload_0        
        //    40: invokespecial   X/0IP.<init>:(LX/2B0;)V
        //    43: putfield        X/2B0.LJJJJJ:Ljava/lang/Runnable;
        //    46: aload_0        
        //    47: new             Ljava/util/ArrayList;
        //    50: dup            
        //    51: invokespecial   java/util/ArrayList.<init>:()V
        //    54: putfield        X/2B0.LJJJJJL:Ljava/util/List;
        //    57: aload_0        
        //    58: new             Ljava/util/ArrayList;
        //    61: dup            
        //    62: invokespecial   java/util/ArrayList.<init>:()V
        //    65: putfield        X/2B0.LJJJJL:Ljava/util/List;
        //    68: aload_2        
        //    69: ifnull          102
        //    72: aload_1        
        //    73: aload_2        
        //    74: iconst_1       
        //    75: newarray        I
        //    77: dup            
        //    78: iconst_0       
        //    79: ldc             2130969732
        //    81: iastore        
        //    82: iconst_0       
        //    83: iconst_0       
        //    84: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
        //    87: astore_1       
        //    88: aload_0        
        //    89: aload_1        
        //    90: iconst_0       
        //    91: iconst_0       
        //    92: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //    95: invokevirtual   X/2B0.setItemSpacingPx:(I)V
        //    98: aload_1        
        //    99: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   102: aload_0        
        //   103: invokespecial   X/2B0.LJIILLIIL:()V
        //   106: aload_0        
        //   107: new             LX/0Qw;
        //   110: dup            
        //   111: invokespecial   X/0Qw.<init>:()V
        //   114: invokevirtual   androidx/recyclerview/widget/RecyclerView.addOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
        //   117: return         
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
    
    private final void LJIILL() {
        final Iterator<Object> iterator = this.LJJJJJL.iterator();
        while (iterator.hasNext()) {
            this.LIZIZ((n)iterator.next());
        }
        this.LJJJJJL.clear();
        final RecyclerView.a adapter = this.getAdapter();
        if (adapter == null) {
            return;
        }
        kotlin.jvm.internal.n.LIZ((Object)adapter, "");
        for (final b b : this.LJJJJL) {
            1Au 1Au;
            if (adapter instanceof 1gp) {
                final 1gp 1gp = (1gp)adapter;
                final QgG<P> lizlll = b.LIZLLL;
                final SRT<Context, RuntimeException, 2P9> liziz = b.LIZIZ;
                final int liz = b.LIZ;
                final List liz2 = FIT.LIZ((Object)b.LIZJ);
                CTM.LIZ((Object)1gp, (Object)lizlll, (Object)liziz, (Object)liz2);
                1Au = new 1Au(1gp, lizlll, liziz, liz, liz2);
            }
            else {
                final 0J4 ljjjil = this.LJJJIL;
                if (ljjjil == null) {
                    continue;
                }
                final QgG<P> lizlll2 = b.LIZLLL;
                final SRT<Context, RuntimeException, 2P9> liziz2 = b.LIZIZ;
                final int liz3 = b.LIZ;
                final List liz4 = FIT.LIZ((Object)b.LIZJ);
                CTM.LIZ((Object)ljjjil, (Object)lizlll2, (Object)liziz2, (Object)liz4);
                1Au = new 1Au(ljjjil, lizlll2, liziz2, liz3, liz4);
            }
            this.LJJJJJL.add(1Au);
            this.LIZ((n)1Au);
        }
    }
    
    private void LJIILLIIL() {
        this.setClipToPadding(false);
        final 0IY ljjjjli = 2B0.LJJJJLI;
        final Context context = this.getContext();
        kotlin.jvm.internal.n.LIZ((Object)context, "");
        final 1nX 1nX = new 1nX(this);
        CTM.LIZ((Object)context, (Object)1nX);
        final Iterator<PoolReference> iterator = ljjjjli.LIZ.iterator();
        kotlin.jvm.internal.n.LIZ((Object)iterator, "");
        0CG 0cg = null;
        while (iterator.hasNext()) {
            final PoolReference next = iterator.next();
            kotlin.jvm.internal.n.LIZ((Object)next, "");
            final PoolReference poolReference = next;
            if (poolReference.LIZ() == context) {
                if (0cg != null) {
                    throw new IllegalStateException("A pool was already found");
                }
                0cg = (0CG)poolReference;
            }
            else {
                if (!0Im.LIZ(poolReference.LIZ())) {
                    continue;
                }
                poolReference.LIZ.clear();
                iterator.remove();
            }
        }
        PoolReference poolReference2;
        if ((poolReference2 = (PoolReference)0cg) == null) {
            poolReference2 = new PoolReference(context, (RecycledViewPool)((QgG)1nX).invoke(), ljjjjli);
            final 0CC liz = ljjjjli.LIZ(context);
            if (liz != null) {
                liz.LIZ((0CG)poolReference2);
            }
            ljjjjli.LIZ.add(poolReference2);
        }
        this.setRecycledViewPool(poolReference2.LIZ);
    }
    
    private final void LJIIZILJ() {
        final i layoutManager = this.getLayoutManager();
        final 0J4 ljjjil = this.LJJJIL;
        if (layoutManager instanceof GridLayoutManager && ljjjil != null) {
            final int spanCount = ljjjil.getSpanCount();
            final GridLayoutManager gridLayoutManager = (GridLayoutManager)layoutManager;
            if (spanCount != gridLayoutManager.LIZIZ || gridLayoutManager.LJI != ljjjil.getSpanSizeLookup()) {
                ljjjil.setSpanCount(gridLayoutManager.LIZIZ);
                gridLayoutManager.LIZ(ljjjil.getSpanSizeLookup());
            }
        }
    }
    
    private final void LJIJ() {
        this.LJJJJ = null;
        if (this.LJJJ) {
            this.removeCallbacks(this.LJJJJJ);
            this.LJJJ = false;
        }
    }
    
    private final void LJIJI() {
        if (0Im.LIZ(this.getContext())) {
            this.getRecycledViewPool().clear();
        }
    }
    
    @Override
    public final void LIZ(final RecyclerView.a<?> a, final boolean b) {
        super.LIZ((RecyclerView.a)a, b);
        this.LJIJ();
        this.LJIILL();
    }
    
    public final void LJIILJJIL() {
        final RecyclerView.a adapter = this.getAdapter();
        if (adapter != null) {
            this.LIZ((RecyclerView.a)null, true);
            this.LJJJJ = adapter;
        }
        this.LJIJI();
    }
    
    public final 1B9 getSpacingDecorator() {
        return this.LJJJI;
    }
    
    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final RecyclerView.a<?> ljjjj = this.LJJJJ;
        if (ljjjj != null) {
            this.LIZ((RecyclerView.a)ljjjj, false);
        }
        this.LJIJ();
    }
    
    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Iterator<Object> iterator = this.LJJJJJL.iterator();
        while (iterator.hasNext()) {
            for (Object o : iterator.next().LIZ.LIZ) {}
        }
        if (this.LJJJJI) {
            final int ljjjjizl = this.LJJJJIZL;
            if (ljjjjizl > 0) {
                this.LJJJ = true;
                this.postDelayed(this.LJJJJJ, (long)ljjjjizl);
            }
            else {
                this.LJIILJJIL();
            }
        }
        this.LJIJI();
    }
    
    @Override
    public void requestLayout() {
        this.LJIIZILJ();
        super.requestLayout();
    }
    
    @Override
    public void setAdapter(final RecyclerView.a<?> adapter) {
        super.setAdapter((RecyclerView.a)adapter);
        this.LJIJ();
        this.LJIILL();
    }
    
    public final void setController(final 0J4 ljjjil) {
        CTM.LIZ((Object)ljjjil);
        this.LJJJIL = ljjjil;
        this.setAdapter((RecyclerView.a)ljjjil.getAdapter());
        this.LJIIZILJ();
    }
    
    public final void setControllerAndBuildModels(final 0J4 controller) {
        CTM.LIZ((Object)controller);
        controller.requestModelBuild();
        this.setController(controller);
    }
    
    public final void setDelayMsWhenRemovingAdapterOnDetach(final int ljjjjizl) {
        this.LJJJJIZL = ljjjjizl;
    }
    
    public final void setItemSpacingDp(final int n) {
        final float n2 = (float)n;
        final Resources resources = this.getResources();
        n.LIZ((Object)resources, "");
        this.setItemSpacingPx((int)TypedValue.applyDimension(1, n2, resources.getDisplayMetrics()));
    }
    
    public void setItemSpacingPx(final int liz) {
        this.LIZJ((h)this.LJJJI);
        this.LJJJI.LIZ = liz;
        if (liz > 0) {
            this.LIZIZ((h)this.LJJJI);
        }
    }
    
    public final void setItemSpacingRes(final int n) {
        this.setItemSpacingPx(this.getResources().getDimensionPixelOffset(n));
    }
    
    public void setLayoutManager(final i layoutManager) {
        super.setLayoutManager(layoutManager);
        this.LJIIZILJ();
    }
    
    public void setLayoutParams(ViewGroup$LayoutParams layoutParams) {
        CTM.LIZ((Object)layoutParams);
        boolean b;
        if (this.getLayoutParams() == null) {
            b = true;
        }
        else {
            b = false;
        }
        super.setLayoutParams(layoutParams);
        if (b && this.getLayoutManager() == null) {
            layoutParams = this.getLayoutParams();
            LinearLayoutManager layoutManager;
            if (layoutParams.height == -1 || layoutParams.height == 0) {
                if (layoutParams.width == -1 || layoutParams.width == 0) {
                    this.setHasFixedSize(true);
                }
                this.getContext();
                layoutManager = new LinearLayoutManager();
            }
            else {
                this.getContext();
                layoutManager = new LinearLayoutManager(0, false);
            }
            this.setLayoutManager((i)layoutManager);
        }
    }
    
    public void setModels(final List<? extends 0J7<?>> models) {
        CTM.LIZ((Object)models);
        0J4 ljjjil;
        if (!((ljjjil = this.LJJJIL) instanceof SimpleEpoxyController)) {
            ljjjil = null;
        }
        SimpleEpoxyController controller;
        if ((controller = (SimpleEpoxyController)ljjjil) == null) {
            controller = new SimpleEpoxyController();
            this.setController(controller);
        }
        controller.setModels(models);
    }
    
    public final void setRemoveAdapterWhenDetachedFromWindow(final boolean ljjjji) {
        this.LJJJJI = ljjjji;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(2112);
        }
        
        void LIZ(final 0J4 p0);
    }
    
    public static final class b<T extends 0J7<?>, U, P extends 0IS>
    {
        public final int LIZ;
        public final SRT<Context, RuntimeException, 2P9> LIZIZ;
        public final 0IQ<T, U, P> LIZJ;
        public final QgG<P> LIZLLL;
        
        static {
            Covode.recordClassIndex(2113);
        }
    }
}
