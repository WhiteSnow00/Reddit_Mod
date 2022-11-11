// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import android.view.ViewPropertyAnimator;
import android.view.View;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import java.util.List;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.animation.TimeInterpolator;

public class 1gh extends 16q
{
    public static TimeInterpolator LJIILIIL;
    public ArrayList<ArrayList<ViewHolder>> LIZ;
    public ArrayList<ArrayList<b>> LIZIZ;
    public ArrayList<ArrayList<a>> LIZJ;
    public ArrayList<ViewHolder> LIZLLL;
    public ArrayList<ViewHolder> LJ;
    public ArrayList<ViewHolder> LJFF;
    public ArrayList<ViewHolder> LJI;
    public ArrayList<ViewHolder> LJIILJJIL;
    public ArrayList<ViewHolder> LJIILL;
    public ArrayList<b> LJIILLIIL;
    public ArrayList<a> LJIIZILJ;
    
    static {
        Covode.recordClassIndex(1609);
    }
    
    public 1gh() {
        this.LJIILJJIL = new ArrayList<ViewHolder>();
        this.LJIILL = new ArrayList<ViewHolder>();
        this.LJIILLIIL = new ArrayList<b>();
        this.LJIIZILJ = new ArrayList<a>();
        this.LIZ = new ArrayList<ArrayList<ViewHolder>>();
        this.LIZIZ = new ArrayList<ArrayList<b>>();
        this.LIZJ = new ArrayList<ArrayList<a>>();
        this.LIZLLL = new ArrayList<ViewHolder>();
        this.LJ = new ArrayList<ViewHolder>();
        this.LJFF = new ArrayList<ViewHolder>();
        this.LJI = new ArrayList<ViewHolder>();
    }
    
    private void LIZ(final a a) {
        if (a.LIZ != null) {
            this.LIZ(a, a.LIZ);
        }
        if (a.LIZIZ != null) {
            this.LIZ(a, a.LIZIZ);
        }
    }
    
    private void LIZ(final List<ViewHolder> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            ((ViewHolder)list.get(i)).itemView.animate().cancel();
        }
    }
    
    private void LIZ(final List<a> list, final ViewHolder viewHolder) {
        for (int i = list.size() - 1; i >= 0; --i) {
            final a a = list.get(i);
            if (this.LIZ(a, viewHolder) && a.LIZ == null && a.LIZIZ == null) {
                list.remove(a);
            }
        }
    }
    
    private boolean LIZ(final a a, final ViewHolder viewHolder) {
        if (a.LIZIZ == viewHolder) {
            a.LIZIZ = null;
        }
        else {
            if (a.LIZ != viewHolder) {
                return false;
            }
            a.LIZ = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        ((RecyclerView.f)this).LJI(viewHolder);
        return true;
    }
    
    private void LJIIJ(final ViewHolder viewHolder) {
        if (1gh.LJIILIIL == null) {
            1gh.LJIILIIL = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(1gh.LJIILIIL);
        ((RecyclerView.f)this).LIZJ(viewHolder);
    }
    
    @Override
    public void LIZ() {
        public final class 0F5 implements Runnable
        {
            public final /* synthetic */ ArrayList LIZ;
            public final /* synthetic */ 1gh LIZIZ;
            
            static {
                Covode.recordClassIndex(1612);
            }
            
            public 0F5(final 1gh liziz, final ArrayList liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                for (final ViewHolder viewHolder : this.LIZ) {
                    final 1gh liziz = this.LIZIZ;
                    final View itemView = viewHolder.itemView;
                    final ViewPropertyAnimator animate = itemView.animate();
                    liziz.LIZLLL.add(viewHolder);
                    animate.alpha(1.0f).setDuration(liziz.LJIIIIZZ).setListener((Animator$AnimatorListener)new 0F7(liziz, viewHolder, itemView, animate)).start();
                }
                this.LIZ.clear();
                this.LIZIZ.LIZ.remove(this.LIZ);
            }
        }
        public final class 0F4 implements Runnable
        {
            public final /* synthetic */ ArrayList LIZ;
            public final /* synthetic */ 1gh LIZIZ;
            
            static {
                Covode.recordClassIndex(1611);
            }
            
            public 0F4(final 1gh liziz, final ArrayList liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                for (final a a : this.LIZ) {
                    final 1gh liziz = this.LIZIZ;
                    final ViewHolder liz = a.LIZ;
                    View itemView = null;
                    View itemView2;
                    if (liz == null) {
                        itemView2 = null;
                    }
                    else {
                        itemView2 = liz.itemView;
                    }
                    final ViewHolder liziz2 = a.LIZIZ;
                    if (liziz2 != null) {
                        itemView = liziz2.itemView;
                    }
                    if (itemView2 != null) {
                        final ViewPropertyAnimator setDuration = itemView2.animate().setDuration(liziz.LJIIJJI);
                        liziz.LJI.add(a.LIZ);
                        setDuration.translationX((float)(a.LJ - a.LIZJ));
                        setDuration.translationY((float)(a.LJFF - a.LIZLLL));
                        setDuration.alpha(0.0f).setListener((Animator$AnimatorListener)new 0F9(liziz, a, setDuration, itemView2)).start();
                    }
                    if (itemView != null) {
                        final ViewPropertyAnimator animate = itemView.animate();
                        liziz.LJI.add(a.LIZIZ);
                        animate.translationX(0.0f).translationY(0.0f).setDuration(liziz.LJIIJJI).alpha(1.0f).setListener((Animator$AnimatorListener)new 0FA(liziz, a, animate, itemView)).start();
                    }
                }
                this.LIZ.clear();
                this.LIZIZ.LIZJ.remove(this.LIZ);
            }
        }
        public final class 0F3 implements Runnable
        {
            public final /* synthetic */ ArrayList LIZ;
            public final /* synthetic */ 1gh LIZIZ;
            
            static {
                Covode.recordClassIndex(1610);
            }
            
            public 0F3(final 1gh liziz, final ArrayList liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                for (final b b : this.LIZ) {
                    final 1gh liziz = this.LIZIZ;
                    final ViewHolder liz = b.LIZ;
                    final int liziz2 = b.LIZIZ;
                    final int lizj = b.LIZJ;
                    final int lizlll = b.LIZLLL;
                    final int lj = b.LJ;
                    final View itemView = liz.itemView;
                    final int n = lizlll - liziz2;
                    final int n2 = lj - lizj;
                    if (n != 0) {
                        itemView.animate().translationX(0.0f);
                    }
                    if (n2 != 0) {
                        itemView.animate().translationY(0.0f);
                    }
                    final ViewPropertyAnimator animate = itemView.animate();
                    liziz.LJ.add(liz);
                    animate.setDuration(liziz.LJIIJ).setListener((Animator$AnimatorListener)new 0F8(liziz, liz, n, itemView, n2, animate)).start();
                }
                this.LIZ.clear();
                this.LIZIZ.LIZIZ.remove(this.LIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1gh.LJIILJJIL:Ljava/util/ArrayList;
        //     4: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //     7: iconst_1       
        //     8: ixor           
        //     9: istore_1       
        //    10: aload_0        
        //    11: getfield        X/1gh.LJIILLIIL:Ljava/util/ArrayList;
        //    14: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    17: iconst_1       
        //    18: ixor           
        //    19: istore_2       
        //    20: aload_0        
        //    21: getfield        X/1gh.LJIIZILJ:Ljava/util/ArrayList;
        //    24: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    27: iconst_1       
        //    28: ixor           
        //    29: istore_3       
        //    30: aload_0        
        //    31: getfield        X/1gh.LJIILL:Ljava/util/ArrayList;
        //    34: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    37: iconst_1       
        //    38: ixor           
        //    39: istore          4
        //    41: iload_1        
        //    42: ifne            59
        //    45: iload_2        
        //    46: ifne            59
        //    49: iload           4
        //    51: ifne            59
        //    54: iload_3        
        //    55: ifne            59
        //    58: return         
        //    59: aload_0        
        //    60: getfield        X/1gh.LJIILJJIL:Ljava/util/ArrayList;
        //    63: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    66: astore          5
        //    68: aload           5
        //    70: invokeinterface java/util/Iterator.hasNext:()Z
        //    75: ifeq            150
        //    78: aload           5
        //    80: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    85: checkcast       Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //    88: astore          6
        //    90: aload           6
        //    92: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    95: astore          7
        //    97: aload           7
        //    99: invokevirtual   android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
        //   102: astore          8
        //   104: aload_0        
        //   105: getfield        X/1gh.LJFF:Ljava/util/ArrayList;
        //   108: aload           6
        //   110: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   113: pop            
        //   114: aload           8
        //   116: aload_0        
        //   117: getfield        X/0EI.LJIIIZ:J
        //   120: invokevirtual   android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
        //   123: fconst_0       
        //   124: invokevirtual   android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
        //   127: new             LX/0F6;
        //   130: dup            
        //   131: aload_0        
        //   132: aload           6
        //   134: aload           8
        //   136: aload           7
        //   138: invokespecial   X/0F6.<init>:(LX/1gh;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
        //   141: invokevirtual   android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
        //   144: invokevirtual   android/view/ViewPropertyAnimator.start:()V
        //   147: goto            68
        //   150: aload_0        
        //   151: getfield        X/1gh.LJIILJJIL:Ljava/util/ArrayList;
        //   154: invokevirtual   java/util/ArrayList.clear:()V
        //   157: iload_2        
        //   158: ifeq            237
        //   161: new             Ljava/util/ArrayList;
        //   164: dup            
        //   165: invokespecial   java/util/ArrayList.<init>:()V
        //   168: astore          6
        //   170: aload           6
        //   172: aload_0        
        //   173: getfield        X/1gh.LJIILLIIL:Ljava/util/ArrayList;
        //   176: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   179: pop            
        //   180: aload_0        
        //   181: getfield        X/1gh.LIZIZ:Ljava/util/ArrayList;
        //   184: aload           6
        //   186: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   189: pop            
        //   190: aload_0        
        //   191: getfield        X/1gh.LJIILLIIL:Ljava/util/ArrayList;
        //   194: invokevirtual   java/util/ArrayList.clear:()V
        //   197: new             LX/0F3;
        //   200: dup            
        //   201: aload_0        
        //   202: aload           6
        //   204: invokespecial   X/0F3.<init>:(LX/1gh;Ljava/util/ArrayList;)V
        //   207: astore          7
        //   209: iload_1        
        //   210: ifeq            475
        //   213: aload           6
        //   215: iconst_0       
        //   216: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   219: checkcast       LX/0FC;
        //   222: getfield        X/0FC.LIZ:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //   225: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   228: aload           7
        //   230: aload_0        
        //   231: getfield        X/0EI.LJIIIZ:J
        //   234: invokevirtual   android/view/View.postOnAnimationDelayed:(Ljava/lang/Runnable;J)V
        //   237: iload_3        
        //   238: ifeq            317
        //   241: new             Ljava/util/ArrayList;
        //   244: dup            
        //   245: invokespecial   java/util/ArrayList.<init>:()V
        //   248: astore          7
        //   250: aload           7
        //   252: aload_0        
        //   253: getfield        X/1gh.LJIIZILJ:Ljava/util/ArrayList;
        //   256: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   259: pop            
        //   260: aload_0        
        //   261: getfield        X/1gh.LIZJ:Ljava/util/ArrayList;
        //   264: aload           7
        //   266: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   269: pop            
        //   270: aload_0        
        //   271: getfield        X/1gh.LJIIZILJ:Ljava/util/ArrayList;
        //   274: invokevirtual   java/util/ArrayList.clear:()V
        //   277: new             LX/0F4;
        //   280: dup            
        //   281: aload_0        
        //   282: aload           7
        //   284: invokespecial   X/0F4.<init>:(LX/1gh;Ljava/util/ArrayList;)V
        //   287: astore          6
        //   289: iload_1        
        //   290: ifeq            467
        //   293: aload           7
        //   295: iconst_0       
        //   296: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   299: checkcast       LX/0FB;
        //   302: getfield        X/0FB.LIZ:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //   305: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   308: aload           6
        //   310: aload_0        
        //   311: getfield        X/0EI.LJIIIZ:J
        //   314: invokevirtual   android/view/View.postOnAnimationDelayed:(Ljava/lang/Runnable;J)V
        //   317: iload           4
        //   319: ifeq            446
        //   322: new             Ljava/util/ArrayList;
        //   325: dup            
        //   326: invokespecial   java/util/ArrayList.<init>:()V
        //   329: astore          7
        //   331: aload           7
        //   333: aload_0        
        //   334: getfield        X/1gh.LJIILL:Ljava/util/ArrayList;
        //   337: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   340: pop            
        //   341: aload_0        
        //   342: getfield        X/1gh.LIZ:Ljava/util/ArrayList;
        //   345: aload           7
        //   347: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   350: pop            
        //   351: aload_0        
        //   352: getfield        X/1gh.LJIILL:Ljava/util/ArrayList;
        //   355: invokevirtual   java/util/ArrayList.clear:()V
        //   358: new             LX/0F5;
        //   361: dup            
        //   362: aload_0        
        //   363: aload           7
        //   365: invokespecial   X/0F5.<init>:(LX/1gh;Ljava/util/ArrayList;)V
        //   368: astore          6
        //   370: iload_1        
        //   371: ifne            382
        //   374: iload_2        
        //   375: ifne            382
        //   378: iload_3        
        //   379: ifeq            459
        //   382: lconst_0       
        //   383: lstore          9
        //   385: iload_1        
        //   386: ifeq            453
        //   389: aload_0        
        //   390: getfield        X/0EI.LJIIIZ:J
        //   393: lstore          11
        //   395: iload_2        
        //   396: ifeq            447
        //   399: aload_0        
        //   400: getfield        X/0EI.LJIIJ:J
        //   403: lstore          13
        //   405: iload_3        
        //   406: ifeq            415
        //   409: aload_0        
        //   410: getfield        X/0EI.LJIIJJI:J
        //   413: lstore          9
        //   415: lload           13
        //   417: lload           9
        //   419: invokestatic    java/lang/Math.max:(JJ)J
        //   422: lstore          13
        //   424: aload           7
        //   426: iconst_0       
        //   427: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   430: checkcast       Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //   433: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   436: aload           6
        //   438: lload           11
        //   440: lload           13
        //   442: ladd           
        //   443: invokevirtual   android/view/View.postOnAnimationDelayed:(Ljava/lang/Runnable;J)V
        //   446: return         
        //   447: lconst_0       
        //   448: lstore          13
        //   450: goto            405
        //   453: lconst_0       
        //   454: lstore          11
        //   456: goto            395
        //   459: aload           6
        //   461: invokevirtual   X/0F5.run:()V
        //   464: goto            446
        //   467: aload           6
        //   469: invokevirtual   X/0F4.run:()V
        //   472: goto            317
        //   475: aload           7
        //   477: invokevirtual   X/0F3.run:()V
        //   480: goto            237
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
    
    @Override
    public boolean LIZ(final ViewHolder viewHolder) {
        this.LJIIJ(viewHolder);
        this.LJIILJJIL.add(viewHolder);
        return true;
    }
    
    @Override
    public boolean LIZ(final ViewHolder viewHolder, int n, int n2, final int n3, final int n4) {
        final View itemView = viewHolder.itemView;
        n += (int)viewHolder.itemView.getTranslationX();
        final int n5 = n2 + (int)viewHolder.itemView.getTranslationY();
        this.LJIIJ(viewHolder);
        final int n6 = n3 - n;
        n2 = n4 - n5;
        Label_0083: {
            if (n6 == 0) {
                if (n2 == 0) {
                    ((RecyclerView.f)this).LJI(viewHolder);
                    return false;
                }
            }
            else {
                itemView.setTranslationX((float)(-n6));
                if (n2 == 0) {
                    break Label_0083;
                }
            }
            itemView.setTranslationY((float)(-n2));
        }
        this.LJIILLIIL.add(new b(viewHolder, n, n5, n3, n4));
        return true;
    }
    
    @Override
    public boolean LIZ(final ViewHolder viewHolder, final ViewHolder viewHolder2, final int n, final int n2, final int n3, final int n4) {
        if (viewHolder == viewHolder2) {
            return this.LIZ(viewHolder, n, n2, n3, n4);
        }
        final float translationX = viewHolder.itemView.getTranslationX();
        final float translationY = viewHolder.itemView.getTranslationY();
        final float alpha = viewHolder.itemView.getAlpha();
        this.LJIIJ(viewHolder);
        final int n5 = (int)(n3 - n - translationX);
        final int n6 = (int)(n4 - n2 - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            this.LJIIJ(viewHolder2);
            viewHolder2.itemView.setTranslationX((float)(-n5));
            viewHolder2.itemView.setTranslationY((float)(-n6));
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.LJIIZILJ.add(new a(viewHolder, viewHolder2, n, n2, n3, n4));
        return true;
    }
    
    @Override
    public final boolean LIZ(final ViewHolder viewHolder, final List<Object> list) {
        return !list.isEmpty() || super.LIZ(viewHolder, list);
    }
    
    @Override
    public boolean LIZIZ() {
        return !this.LJIILL.isEmpty() || !this.LJIIZILJ.isEmpty() || !this.LJIILLIIL.isEmpty() || !this.LJIILJJIL.isEmpty() || !this.LJ.isEmpty() || !this.LJFF.isEmpty() || !this.LIZLLL.isEmpty() || !this.LJI.isEmpty() || !this.LIZIZ.isEmpty() || !this.LIZ.isEmpty() || !this.LIZJ.isEmpty();
    }
    
    @Override
    public boolean LIZIZ(final ViewHolder viewHolder) {
        this.LJIIJ(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.LJIILL.add(viewHolder);
        return true;
    }
    
    public final void LIZJ() {
        if (!((RecyclerView.f)this).LIZIZ()) {
            ((RecyclerView.f)this).LJ();
        }
    }
    
    @Override
    public void LIZJ(final ViewHolder viewHolder) {
        final View itemView = viewHolder.itemView;
        itemView.animate().cancel();
        for (int i = this.LJIILLIIL.size() - 1; i >= 0; --i) {
            if (this.LJIILLIIL.get(i).LIZ == viewHolder) {
                itemView.setTranslationY(0.0f);
                itemView.setTranslationX(0.0f);
                ((RecyclerView.f)this).LJI(viewHolder);
                this.LJIILLIIL.remove(i);
            }
        }
        this.LIZ(this.LJIIZILJ, viewHolder);
        if (this.LJIILJJIL.remove(viewHolder)) {
            itemView.setAlpha(1.0f);
            ((RecyclerView.f)this).LJI(viewHolder);
        }
        if (this.LJIILL.remove(viewHolder)) {
            itemView.setAlpha(1.0f);
            this.LJIIIIZZ(viewHolder);
        }
        for (int j = this.LIZJ.size() - 1; j >= 0; --j) {
            final ArrayList list = this.LIZJ.get(j);
            this.LIZ(list, viewHolder);
            if (list.isEmpty()) {
                this.LIZJ.remove(j);
            }
        }
        for (int k = this.LIZIZ.size() - 1; k >= 0; --k) {
            final ArrayList list2 = this.LIZIZ.get(k);
            int l = list2.size() - 1;
            while (l >= 0) {
                if (((b)list2.get(l)).LIZ == viewHolder) {
                    itemView.setTranslationY(0.0f);
                    itemView.setTranslationX(0.0f);
                    ((RecyclerView.f)this).LJI(viewHolder);
                    list2.remove(l);
                    if (list2.isEmpty()) {
                        this.LIZIZ.remove(k);
                        break;
                    }
                    break;
                }
                else {
                    --l;
                }
            }
        }
        for (int n = this.LIZ.size() - 1; n >= 0; --n) {
            final ArrayList list3 = this.LIZ.get(n);
            if (list3.remove(viewHolder)) {
                itemView.setAlpha(1.0f);
                this.LJIIIIZZ(viewHolder);
                if (list3.isEmpty()) {
                    this.LIZ.remove(n);
                }
            }
        }
        this.LJFF.remove(viewHolder);
        this.LIZLLL.remove(viewHolder);
        this.LJI.remove(viewHolder);
        this.LJ.remove(viewHolder);
        this.LIZJ();
    }
    
    @Override
    public void LIZLLL() {
        for (int i = this.LJIILLIIL.size() - 1; i >= 0; --i) {
            final b b = this.LJIILLIIL.get(i);
            final View itemView = b.LIZ.itemView;
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            ((RecyclerView.f)this).LJI(b.LIZ);
            this.LJIILLIIL.remove(i);
        }
        for (int j = this.LJIILJJIL.size() - 1; j >= 0; --j) {
            ((RecyclerView.f)this).LJI(this.LJIILJJIL.get(j));
            this.LJIILJJIL.remove(j);
        }
        for (int k = this.LJIILL.size() - 1; k >= 0; --k) {
            final ViewHolder viewHolder = this.LJIILL.get(k);
            viewHolder.itemView.setAlpha(1.0f);
            this.LJIIIIZZ(viewHolder);
            this.LJIILL.remove(k);
        }
        for (int l = this.LJIIZILJ.size() - 1; l >= 0; --l) {
            this.LIZ(this.LJIIZILJ.get(l));
        }
        this.LJIIZILJ.clear();
        if (!((RecyclerView.f)this).LIZIZ()) {
            return;
        }
        for (int n = this.LIZIZ.size() - 1; n >= 0; --n) {
            final ArrayList list = this.LIZIZ.get(n);
            for (int n2 = list.size() - 1; n2 >= 0; --n2) {
                final b b2 = (b)list.get(n2);
                final View itemView2 = b2.LIZ.itemView;
                itemView2.setTranslationY(0.0f);
                itemView2.setTranslationX(0.0f);
                ((RecyclerView.f)this).LJI(b2.LIZ);
                list.remove(n2);
                if (list.isEmpty()) {
                    this.LIZIZ.remove(list);
                }
            }
        }
        for (int n3 = this.LIZ.size() - 1; n3 >= 0; --n3) {
            final ArrayList list2 = this.LIZ.get(n3);
            for (int n4 = list2.size() - 1; n4 >= 0; --n4) {
                final ViewHolder viewHolder2 = (ViewHolder)list2.get(n4);
                viewHolder2.itemView.setAlpha(1.0f);
                this.LJIIIIZZ(viewHolder2);
                list2.remove(n4);
                if (list2.isEmpty()) {
                    this.LIZ.remove(list2);
                }
            }
        }
        for (int n5 = this.LIZJ.size() - 1; n5 >= 0; --n5) {
            final ArrayList list3 = this.LIZJ.get(n5);
            for (int n6 = list3.size() - 1; n6 >= 0; --n6) {
                this.LIZ((a)list3.get(n6));
                if (list3.isEmpty()) {
                    this.LIZJ.remove(list3);
                }
            }
        }
        this.LIZ(this.LJFF);
        this.LIZ(this.LJ);
        this.LIZ(this.LIZLLL);
        this.LIZ(this.LJI);
        ((RecyclerView.f)this).LJ();
    }
    
    public static final class a
    {
        public ViewHolder LIZ;
        public ViewHolder LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public int LJ;
        public int LJFF;
        
        static {
            Covode.recordClassIndex(1618);
        }
        
        public a(final ViewHolder liz, final ViewHolder liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        public a(final ViewHolder viewHolder, final ViewHolder viewHolder2, final int lizj, final int lizlll, final int lj, final int ljff) {
            this(viewHolder, viewHolder2);
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
            this.LJFF = ljff;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.LIZ);
            sb.append(", newHolder=");
            sb.append(this.LIZIZ);
            sb.append(", fromX=");
            sb.append(this.LIZJ);
            sb.append(", fromY=");
            sb.append(this.LIZLLL);
            sb.append(", toX=");
            sb.append(this.LJ);
            sb.append(", toY=");
            sb.append(this.LJFF);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public ViewHolder LIZ;
        public int LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public int LJ;
        
        static {
            Covode.recordClassIndex(1619);
        }
        
        public b(final ViewHolder liz, final int liziz, final int lizj, final int lizlll, final int lj) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
        }
    }
}
