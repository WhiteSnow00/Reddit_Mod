// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewParent;
import java.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import android.view.ViewPropertyAnimator;
import android.view.View;
import kotlin.jvm.internal.n;
import java.util.List;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import android.animation.TimeInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class 1n7 extends 16q
{
    public ArrayList<ArrayList<ViewHolder>> LIZ;
    public ArrayList<ArrayList<b>> LIZIZ;
    public ArrayList<ArrayList<a>> LIZJ;
    public ArrayList<ViewHolder> LIZLLL;
    public ArrayList<ViewHolder> LJ;
    public ArrayList<ViewHolder> LJFF;
    public ArrayList<ViewHolder> LJI;
    public final long LJIILIIL;
    public final long LJIILJJIL;
    public QgG<2P9> LJIILL;
    public final boolean LJIILLIIL;
    public TimeInterpolator LJIIZILJ;
    public final ArrayList<ViewHolder> LJIJ;
    public final ArrayList<ViewHolder> LJIJI;
    public final ArrayList<b> LJIJJ;
    public final ArrayList<a> LJIJJLI;
    
    static {
        Covode.recordClassIndex(10816);
    }
    
    public 1n7() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/16q.<init>:()V
        //     4: aload_0        
        //     5: new             Landroid/view/animation/AccelerateDecelerateInterpolator;
        //     8: dup            
        //     9: invokespecial   android/view/animation/AccelerateDecelerateInterpolator.<init>:()V
        //    12: putfield        X/1n7.LJIIZILJ:Landroid/animation/TimeInterpolator;
        //    15: aload_0        
        //    16: new             Ljava/util/ArrayList;
        //    19: dup            
        //    20: invokespecial   java/util/ArrayList.<init>:()V
        //    23: putfield        X/1n7.LJIJ:Ljava/util/ArrayList;
        //    26: aload_0        
        //    27: new             Ljava/util/ArrayList;
        //    30: dup            
        //    31: invokespecial   java/util/ArrayList.<init>:()V
        //    34: putfield        X/1n7.LJIJI:Ljava/util/ArrayList;
        //    37: aload_0        
        //    38: new             Ljava/util/ArrayList;
        //    41: dup            
        //    42: invokespecial   java/util/ArrayList.<init>:()V
        //    45: putfield        X/1n7.LJIJJ:Ljava/util/ArrayList;
        //    48: aload_0        
        //    49: new             Ljava/util/ArrayList;
        //    52: dup            
        //    53: invokespecial   java/util/ArrayList.<init>:()V
        //    56: putfield        X/1n7.LJIJJLI:Ljava/util/ArrayList;
        //    59: aload_0        
        //    60: new             Ljava/util/ArrayList;
        //    63: dup            
        //    64: invokespecial   java/util/ArrayList.<init>:()V
        //    67: putfield        X/1n7.LIZ:Ljava/util/ArrayList;
        //    70: aload_0        
        //    71: new             Ljava/util/ArrayList;
        //    74: dup            
        //    75: invokespecial   java/util/ArrayList.<init>:()V
        //    78: putfield        X/1n7.LIZIZ:Ljava/util/ArrayList;
        //    81: aload_0        
        //    82: new             Ljava/util/ArrayList;
        //    85: dup            
        //    86: invokespecial   java/util/ArrayList.<init>:()V
        //    89: putfield        X/1n7.LIZJ:Ljava/util/ArrayList;
        //    92: aload_0        
        //    93: new             Ljava/util/ArrayList;
        //    96: dup            
        //    97: invokespecial   java/util/ArrayList.<init>:()V
        //   100: putfield        X/1n7.LIZLLL:Ljava/util/ArrayList;
        //   103: aload_0        
        //   104: new             Ljava/util/ArrayList;
        //   107: dup            
        //   108: invokespecial   java/util/ArrayList.<init>:()V
        //   111: putfield        X/1n7.LJ:Ljava/util/ArrayList;
        //   114: aload_0        
        //   115: new             Ljava/util/ArrayList;
        //   118: dup            
        //   119: invokespecial   java/util/ArrayList.<init>:()V
        //   122: putfield        X/1n7.LJFF:Ljava/util/ArrayList;
        //   125: aload_0        
        //   126: new             Ljava/util/ArrayList;
        //   129: dup            
        //   130: invokespecial   java/util/ArrayList.<init>:()V
        //   133: putfield        X/1n7.LJI:Ljava/util/ArrayList;
        //   136: aload_0        
        //   137: ldc2_w          300
        //   140: putfield        X/1n7.LJIILIIL:J
        //   143: aload_0        
        //   144: ldc2_w          300
        //   147: putfield        X/1n7.LJIILJJIL:J
        //   150: aload_0        
        //   151: getstatic       X/2Ah.LIZ:LX/2Ah;
        //   154: putfield        X/1n7.LJIILL:LX/QgG;
        //   157: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
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
    
    private final void LIZ(final a a) {
        if (a.LIZ != null) {
            this.LIZ(a, a.LIZ);
        }
        if (a.LIZIZ != null) {
            this.LIZ(a, a.LIZIZ);
        }
    }
    
    private void LIZ(final List<? extends ViewHolder> list) {
        CTM.LIZ((Object)list);
        int size = list.size();
        while (--size >= 0) {
            final ViewHolder value = list.get(size);
            if (value == null) {
                n.LIZIZ();
            }
            value.itemView.animate().cancel();
        }
    }
    
    private final void LIZ(final List<a> list, final ViewHolder viewHolder) {
        int size = list.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final a a = list.get(n);
            size = n;
            if (!this.LIZ(a, viewHolder)) {
                continue;
            }
            size = n;
            if (a.LIZ != null) {
                continue;
            }
            size = n;
            if (a.LIZIZ != null) {
                continue;
            }
            list.remove(a);
            size = n;
        }
    }
    
    private final boolean LIZ(final a a, final ViewHolder viewHolder) {
        if (a.LIZIZ == viewHolder) {
            a.LIZIZ = null;
        }
        else {
            if (a.LIZ != viewHolder) {
                return false;
            }
            a.LIZ = null;
        }
        if (viewHolder != null) {
            final View itemView = viewHolder.itemView;
            if (itemView != null) {
                itemView.setAlpha(1.0f);
            }
            if (viewHolder != null) {
                final View itemView2 = viewHolder.itemView;
                if (itemView2 != null) {
                    itemView2.setTranslationX(0.0f);
                }
                final View itemView3 = viewHolder.itemView;
                if (itemView3 != null) {
                    itemView3.setTranslationY(0.0f);
                }
            }
        }
        ((RecyclerView.f)this).LJI(viewHolder);
        return true;
    }
    
    private final void LJIIJ(final ViewHolder viewHolder) {
        final ViewPropertyAnimator animate = viewHolder.itemView.animate();
        n.LIZIZ((Object)animate, "");
        animate.setInterpolator(this.LJIIZILJ);
        ((RecyclerView.f)this).LIZJ(viewHolder);
    }
    
    @Override
    public final void LIZ() {
        public final class 11D implements Runnable
        {
            public final /* synthetic */ 1n7 LIZ;
            public final /* synthetic */ ArrayList LIZIZ;
            
            static {
                Covode.recordClassIndex(10827);
            }
            
            public 11D(final 1n7 liz, final ArrayList liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                for (final b b : this.LIZIZ) {
                    final 1n7 liz = this.LIZ;
                    final ViewHolder liz2 = b.LIZ;
                    final int liziz = b.LIZIZ;
                    final int lizj = b.LIZJ;
                    final int lizlll = b.LIZLLL;
                    final int lj = b.LJ;
                    final View itemView = liz2.itemView;
                    n.LIZIZ((Object)itemView, "");
                    final int n = lizlll - liziz;
                    final int n2 = lj - lizj;
                    if (n != 0) {
                        itemView.animate().translationX(0.0f);
                    }
                    if (n2 != 0) {
                        itemView.animate().translationY(0.0f);
                    }
                    final ViewPropertyAnimator animate = itemView.animate();
                    liz.LJ.add(liz2);
                    animate.setDuration(liz.LJIILJJIL).setListener((Animator$AnimatorListener)new 119(liz2, n, itemView, n2, animate)).start();
                }
                this.LIZIZ.clear();
                this.LIZ.LIZIZ.remove(this.LIZIZ);
            }
        }
        public final class 11C implements Runnable
        {
            public final /* synthetic */ 1n7 LIZ;
            public final /* synthetic */ ArrayList LIZIZ;
            
            static {
                Covode.recordClassIndex(10826);
            }
            
            public 11C(final 1n7 liz, final ArrayList liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                for (final a a : this.LIZIZ) {
                    final 1n7 liz = this.LIZ;
                    CTM.LIZ((Object)a);
                    final ViewHolder liz2 = a.LIZ;
                    View itemView = null;
                    View itemView2;
                    if (liz2 != null) {
                        itemView2 = liz2.itemView;
                    }
                    else {
                        itemView2 = null;
                    }
                    final ViewHolder liziz = a.LIZIZ;
                    if (liziz != null) {
                        itemView = liziz.itemView;
                    }
                    if (itemView2 != null) {
                        final ViewPropertyAnimator setDuration = itemView2.animate().setDuration(liz.LJIIJJI);
                        liz.LJI.add(a.LIZ);
                        setDuration.translationX((float)(a.LJ - a.LIZJ));
                        setDuration.translationY((float)(a.LJFF - a.LIZLLL));
                        setDuration.alpha(0.0f).setListener((Animator$AnimatorListener)new 117(a, setDuration, itemView2)).start();
                    }
                    if (itemView != null) {
                        final ViewPropertyAnimator animate = itemView.animate();
                        liz.LJI.add(a.LIZIZ);
                        animate.translationX(0.0f).translationY(0.0f).setDuration(liz.LJIIJJI).alpha(1.0f).setListener((Animator$AnimatorListener)new 118(a, animate, itemView)).start();
                    }
                }
                this.LIZIZ.clear();
                this.LIZ.LIZJ.remove(this.LIZIZ);
            }
        }
        public final class 11B implements Runnable
        {
            public final /* synthetic */ 1n7 LIZ;
            public final /* synthetic */ ArrayList LIZIZ;
            
            static {
                Covode.recordClassIndex(10825);
            }
            
            public 11B(final 1n7 liz, final ArrayList liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                for (final ViewHolder viewHolder : this.LIZIZ) {
                    final 1n7 liz = this.LIZ;
                    CTM.LIZ((Object)viewHolder);
                    final View itemView = viewHolder.itemView;
                    n.LIZIZ((Object)itemView, "");
                    final ViewPropertyAnimator animate = itemView.animate();
                    n.LIZIZ((Object)animate, "");
                    animate.getInterpolator();
                    liz.LIZLLL.add(viewHolder);
                    animate.translationY(0.0f).setDuration(liz.LJIILIIL).setListener((Animator$AnimatorListener)new 116(viewHolder, itemView, animate)).start();
                }
                this.LIZIZ.clear();
                this.LIZ.LIZ.remove(this.LIZIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1n7.LJIJ:Ljava/util/ArrayList;
        //     4: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //     7: iconst_1       
        //     8: ixor           
        //     9: istore_1       
        //    10: aload_0        
        //    11: getfield        X/1n7.LJIJJ:Ljava/util/ArrayList;
        //    14: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    17: iconst_1       
        //    18: ixor           
        //    19: istore_2       
        //    20: aload_0        
        //    21: getfield        X/1n7.LJIJJLI:Ljava/util/ArrayList;
        //    24: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    27: iconst_1       
        //    28: ixor           
        //    29: istore_3       
        //    30: aload_0        
        //    31: getfield        X/1n7.LJIJI:Ljava/util/ArrayList;
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
        //    60: getfield        X/1n7.LJIJ:Ljava/util/ArrayList;
        //    63: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    66: astore          5
        //    68: aload           5
        //    70: invokeinterface java/util/Iterator.hasNext:()Z
        //    75: ifeq            157
        //    78: aload           5
        //    80: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    85: checkcast       Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //    88: astore          6
        //    90: aload           6
        //    92: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    95: astore          7
        //    97: aload           7
        //    99: ldc             ""
        //   101: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   104: aload           7
        //   106: invokevirtual   android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
        //   109: astore          8
        //   111: aload_0        
        //   112: getfield        X/1n7.LJFF:Ljava/util/ArrayList;
        //   115: aload           6
        //   117: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   120: pop            
        //   121: aload           8
        //   123: aload_0        
        //   124: getfield        X/0EI.LJIIIZ:J
        //   127: invokevirtual   android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
        //   130: fconst_0       
        //   131: invokevirtual   android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
        //   134: new             LX/11A;
        //   137: dup            
        //   138: aload_0        
        //   139: aload           6
        //   141: aload           8
        //   143: aload           7
        //   145: invokespecial   X/11A.<init>:(LX/1n7;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
        //   148: invokevirtual   android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
        //   151: invokevirtual   android/view/ViewPropertyAnimator.start:()V
        //   154: goto            68
        //   157: aload_0        
        //   158: getfield        X/1n7.LJIJ:Ljava/util/ArrayList;
        //   161: invokevirtual   java/util/ArrayList.clear:()V
        //   164: iload_2        
        //   165: ifeq            255
        //   168: new             Ljava/util/ArrayList;
        //   171: dup            
        //   172: invokespecial   java/util/ArrayList.<init>:()V
        //   175: astore          8
        //   177: aload           8
        //   179: aload_0        
        //   180: getfield        X/1n7.LJIJJ:Ljava/util/ArrayList;
        //   183: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   186: pop            
        //   187: aload_0        
        //   188: getfield        X/1n7.LIZIZ:Ljava/util/ArrayList;
        //   191: aload           8
        //   193: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   196: pop            
        //   197: aload_0        
        //   198: getfield        X/1n7.LJIJJ:Ljava/util/ArrayList;
        //   201: invokevirtual   java/util/ArrayList.clear:()V
        //   204: new             LX/11D;
        //   207: dup            
        //   208: aload_0        
        //   209: aload           8
        //   211: invokespecial   X/11D.<init>:(LX/1n7;Ljava/util/ArrayList;)V
        //   214: astore          5
        //   216: iload_1        
        //   217: ifeq            475
        //   220: aload           8
        //   222: iconst_0       
        //   223: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   226: checkcast       LX/115;
        //   229: getfield        X/115.LIZ:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //   232: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   235: astore          8
        //   237: aload           8
        //   239: ldc             ""
        //   241: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   244: aload           8
        //   246: aload           5
        //   248: aload_0        
        //   249: getfield        X/0EI.LJIIIZ:J
        //   252: invokevirtual   android/view/View.postOnAnimationDelayed:(Ljava/lang/Runnable;J)V
        //   255: iload_3        
        //   256: ifeq            347
        //   259: new             Ljava/util/ArrayList;
        //   262: dup            
        //   263: invokespecial   java/util/ArrayList.<init>:()V
        //   266: astore          8
        //   268: aload           8
        //   270: aload_0        
        //   271: getfield        X/1n7.LJIJJLI:Ljava/util/ArrayList;
        //   274: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   277: pop            
        //   278: aload_0        
        //   279: getfield        X/1n7.LIZJ:Ljava/util/ArrayList;
        //   282: aload           8
        //   284: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   287: pop            
        //   288: aload_0        
        //   289: getfield        X/1n7.LJIJJLI:Ljava/util/ArrayList;
        //   292: invokevirtual   java/util/ArrayList.clear:()V
        //   295: new             LX/11C;
        //   298: dup            
        //   299: aload_0        
        //   300: aload           8
        //   302: invokespecial   X/11C.<init>:(LX/1n7;Ljava/util/ArrayList;)V
        //   305: astore          5
        //   307: iload_1        
        //   308: ifeq            465
        //   311: aload           8
        //   313: iconst_0       
        //   314: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   317: checkcast       LX/114;
        //   320: getfield        X/114.LIZ:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //   323: astore          8
        //   325: aload           8
        //   327: ifnonnull       333
        //   330: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   333: aload           8
        //   335: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   338: aload           5
        //   340: aload_0        
        //   341: getfield        X/0EI.LJIIIZ:J
        //   344: invokevirtual   android/view/View.postOnAnimationDelayed:(Ljava/lang/Runnable;J)V
        //   347: iload           4
        //   349: ifeq            445
        //   352: new             Ljava/util/ArrayList;
        //   355: dup            
        //   356: invokespecial   java/util/ArrayList.<init>:()V
        //   359: astore          8
        //   361: aload           8
        //   363: aload_0        
        //   364: getfield        X/1n7.LJIJI:Ljava/util/ArrayList;
        //   367: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   370: pop            
        //   371: aload_0        
        //   372: getfield        X/1n7.LIZ:Ljava/util/ArrayList;
        //   375: aload           8
        //   377: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   380: pop            
        //   381: aload_0        
        //   382: getfield        X/1n7.LJIJI:Ljava/util/ArrayList;
        //   385: invokevirtual   java/util/ArrayList.clear:()V
        //   388: new             LX/11B;
        //   391: dup            
        //   392: aload_0        
        //   393: aload           8
        //   395: invokespecial   X/11B.<init>:(LX/1n7;Ljava/util/ArrayList;)V
        //   398: astore          5
        //   400: iload_1        
        //   401: ifne            456
        //   404: iload_2        
        //   405: ifne            412
        //   408: iload_3        
        //   409: ifeq            446
        //   412: lconst_0       
        //   413: lstore          9
        //   415: aload           8
        //   417: iconst_0       
        //   418: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   421: checkcast       Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        //   424: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   427: astore          8
        //   429: aload           8
        //   431: ldc             ""
        //   433: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   436: aload           8
        //   438: aload           5
        //   440: lload           9
        //   442: invokevirtual   android/view/View.postOnAnimationDelayed:(Ljava/lang/Runnable;J)V
        //   445: return         
        //   446: aload           5
        //   448: invokeinterface java/lang/Runnable.run:()V
        //   453: goto            445
        //   456: aload_0        
        //   457: getfield        X/0EI.LJIIIZ:J
        //   460: lstore          9
        //   462: goto            415
        //   465: aload           5
        //   467: invokeinterface java/lang/Runnable.run:()V
        //   472: goto            347
        //   475: aload           5
        //   477: invokeinterface java/lang/Runnable.run:()V
        //   482: goto            255
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
    
    public final void LIZ(final QgG<2P9> ljiill) {
        CTM.LIZ((Object)ljiill);
        this.LJIILL = ljiill;
    }
    
    @Override
    public final boolean LIZ(final ViewHolder viewHolder) {
        CTM.LIZ((Object)viewHolder);
        this.LJIIJ(viewHolder);
        this.LJIJ.add(viewHolder);
        return true;
    }
    
    @Override
    public final boolean LIZ(final ViewHolder viewHolder, int n, int n2, final int n3, final int n4) {
        CTM.LIZ((Object)viewHolder);
        final View itemView = viewHolder.itemView;
        n.LIZIZ((Object)itemView, "");
        final View itemView2 = viewHolder.itemView;
        n.LIZIZ((Object)itemView2, "");
        n += (int)itemView2.getTranslationX();
        final View itemView3 = viewHolder.itemView;
        n.LIZIZ((Object)itemView3, "");
        n2 += (int)itemView3.getTranslationY();
        this.LJIIJ(viewHolder);
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        Label_0118: {
            if (n5 == 0) {
                if (n6 == 0) {
                    ((RecyclerView.f)this).LJI(viewHolder);
                    return false;
                }
            }
            else {
                itemView.setTranslationX(-(float)n5);
                if (n6 == 0) {
                    break Label_0118;
                }
            }
            itemView.setTranslationY(-(float)n6);
        }
        this.LJIJJ.add(new b(viewHolder, n, n2, n3, n4));
        return true;
    }
    
    @Override
    public final boolean LIZ(final ViewHolder viewHolder, final ViewHolder viewHolder2, final int n, final int n2, final int n3, final int n4) {
        CTM.LIZ((Object)viewHolder);
        if (viewHolder == viewHolder2) {
            return this.LIZ(viewHolder, n, n2, n3, n4);
        }
        final View itemView = viewHolder.itemView;
        n.LIZIZ((Object)itemView, "");
        final float translationX = itemView.getTranslationX();
        final View itemView2 = viewHolder.itemView;
        n.LIZIZ((Object)itemView2, "");
        final float translationY = itemView2.getTranslationY();
        final View itemView3 = viewHolder.itemView;
        n.LIZIZ((Object)itemView3, "");
        final float alpha = itemView3.getAlpha();
        this.LJIIJ(viewHolder);
        final int n5 = (int)(n3 - n - translationX);
        final int n6 = (int)(n4 - n2 - translationY);
        final View itemView4 = viewHolder.itemView;
        n.LIZIZ((Object)itemView4, "");
        itemView4.setTranslationX(translationX);
        final View itemView5 = viewHolder.itemView;
        n.LIZIZ((Object)itemView5, "");
        itemView5.setTranslationY(translationY);
        final View itemView6 = viewHolder.itemView;
        n.LIZIZ((Object)itemView6, "");
        itemView6.setAlpha(alpha);
        if (viewHolder2 != null) {
            this.LJIIJ(viewHolder2);
            final View itemView7 = viewHolder2.itemView;
            n.LIZIZ((Object)itemView7, "");
            itemView7.setTranslationX(-(float)n5);
            final View itemView8 = viewHolder2.itemView;
            n.LIZIZ((Object)itemView8, "");
            itemView8.setTranslationY(-(float)n6);
            final View itemView9 = viewHolder2.itemView;
            n.LIZIZ((Object)itemView9, "");
            itemView9.setAlpha(0.0f);
        }
        this.LJIJJLI.add(new a(viewHolder, viewHolder2, n, n2, n3, n4));
        return true;
    }
    
    @Override
    public final boolean LIZ(final ViewHolder viewHolder, final List<?> list) {
        CTM.LIZ((Object)viewHolder, (Object)list);
        return !list.isEmpty() || super.LIZ(viewHolder, (List<Object>)list);
    }
    
    @Override
    public final boolean LIZIZ() {
        return !this.LJIJI.isEmpty() || !this.LJIJJLI.isEmpty() || !this.LJIJJ.isEmpty() || !this.LJIJ.isEmpty() || !this.LJ.isEmpty() || !this.LJFF.isEmpty() || !this.LIZLLL.isEmpty() || !this.LJI.isEmpty() || !this.LIZIZ.isEmpty() || !this.LIZ.isEmpty() || !this.LIZJ.isEmpty();
    }
    
    @Override
    public final boolean LIZIZ(final ViewHolder viewHolder) {
        CTM.LIZ((Object)viewHolder);
        this.LJIIJ(viewHolder);
        if (this.LJIJI.isEmpty()) {
            final View itemView = viewHolder.itemView;
            n.LIZIZ((Object)itemView, "");
            final ViewParent parent = itemView.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            final int bottom = ((View)parent).getBottom();
            final View itemView2 = viewHolder.itemView;
            n.LIZIZ((Object)itemView2, "");
            final int bottom2 = itemView2.getBottom();
            final View itemView3 = viewHolder.itemView;
            n.LIZIZ((Object)itemView3, "");
            final View itemView4 = viewHolder.itemView;
            n.LIZIZ((Object)itemView4, "");
            itemView3.setTranslationY((float)(bottom - bottom2 + itemView4.getHeight()));
        }
        else {
            final ViewHolder viewHolder2 = (ViewHolder)Qsi.LJIIL((List)this.LJIJI);
            final View itemView5 = viewHolder.itemView;
            n.LIZIZ((Object)itemView5, "");
            final View itemView6 = viewHolder2.itemView;
            n.LIZIZ((Object)itemView6, "");
            final float translationY = itemView6.getTranslationY();
            final View itemView7 = viewHolder.itemView;
            n.LIZIZ((Object)itemView7, "");
            itemView5.setTranslationY(translationY + itemView7.getHeight());
        }
        this.LJIJI.add(viewHolder);
        return true;
    }
    
    public final void LIZJ() {
        if (!((RecyclerView.f)this).LIZIZ()) {
            ((RecyclerView.f)this).LJ();
        }
    }
    
    @Override
    public final void LIZJ(final ViewHolder viewHolder) {
        CTM.LIZ((Object)viewHolder);
        final View itemView = viewHolder.itemView;
        n.LIZIZ((Object)itemView, "");
        itemView.animate().cancel();
        int size = this.LJIJJ.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final b value = this.LJIJJ.get(n);
            kotlin.jvm.internal.n.LIZIZ((Object)value, "");
            size = n;
            if (value.LIZ != viewHolder) {
                continue;
            }
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            ((RecyclerView.f)this).LJI(viewHolder);
            this.LJIJJ.remove(n);
            size = n;
        }
        this.LIZ(this.LJIJJLI, viewHolder);
        if (this.LJIJ.remove(viewHolder)) {
            itemView.setAlpha(1.0f);
            ((RecyclerView.f)this).LJI(viewHolder);
        }
        if (this.LJIJI.remove(viewHolder)) {
            itemView.setTranslationY(0.0f);
            this.LJIIIIZZ(viewHolder);
        }
        int size2 = this.LIZJ.size();
        while (true) {
            final int n2 = size2 - 1;
            if (n2 < 0) {
                break;
            }
            final ArrayList<a> value2 = this.LIZJ.get(n2);
            n.LIZIZ((Object)value2, "");
            final ArrayList<a> list = value2;
            this.LIZ(list, viewHolder);
            size2 = n2;
            if (!list.isEmpty()) {
                continue;
            }
            this.LIZJ.remove(n2);
            size2 = n2;
        }
        int size3 = this.LIZIZ.size();
    Label_0246:
        while (true) {
            final int n3 = size3 - 1;
            if (n3 < 0) {
                break;
            }
            final ArrayList<b> value3 = this.LIZIZ.get(n3);
            n.LIZIZ((Object)value3, "");
            final ArrayList<b> list2 = value3;
            int size4 = list2.size();
            Object value4;
            int n4;
            do {
                n4 = size4 - 1;
                size3 = n3;
                if (n4 < 0) {
                    continue Label_0246;
                }
                value4 = list2.get(n4);
                n.LIZIZ(value4, "");
                size4 = n4;
            } while (((b)value4).LIZ != viewHolder);
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            ((RecyclerView.f)this).LJI(viewHolder);
            list2.remove(n4);
            size3 = n3;
            if (!list2.isEmpty()) {
                continue;
            }
            this.LIZIZ.remove(n3);
            size3 = n3;
        }
        int size5 = this.LIZ.size();
        while (true) {
            final int n5 = size5 - 1;
            if (n5 < 0) {
                break;
            }
            final ArrayList<ViewHolder> value5 = this.LIZ.get(n5);
            n.LIZIZ((Object)value5, "");
            final ArrayList<ViewHolder> list3 = value5;
            size5 = n5;
            if (!list3.remove(viewHolder)) {
                continue;
            }
            itemView.setTranslationY(0.0f);
            this.LJIIIIZZ(viewHolder);
            size5 = n5;
            if (!list3.isEmpty()) {
                continue;
            }
            this.LIZ.remove(n5);
            size5 = n5;
        }
        if (this.LJFF.remove(viewHolder) && this.LJIILLIIL) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.LIZLLL.remove(viewHolder) && this.LJIILLIIL) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.LJI.remove(viewHolder) && this.LJIILLIIL) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (!this.LJ.remove(viewHolder) || !this.LJIILLIIL) {
            this.LIZJ();
            return;
        }
        throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
    }
    
    @Override
    public final void LIZLLL() {
        for (int i = this.LJIJJ.size() - 1; i >= 0; --i) {
            final b value = this.LJIJJ.get(i);
            n.LIZIZ((Object)value, "");
            final b b = value;
            final View itemView = b.LIZ.itemView;
            n.LIZIZ((Object)itemView, "");
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            ((RecyclerView.f)this).LJI(b.LIZ);
            this.LJIJJ.remove(i);
        }
        for (int j = this.LJIJ.size() - 1; j >= 0; --j) {
            final ViewHolder value2 = this.LJIJ.get(j);
            n.LIZIZ((Object)value2, "");
            ((RecyclerView.f)this).LJI(value2);
            this.LJIJ.remove(j);
        }
        for (int k = this.LJIJI.size() - 1; k >= 0; --k) {
            final ViewHolder value3 = this.LJIJI.get(k);
            n.LIZIZ((Object)value3, "");
            final ViewHolder viewHolder = value3;
            final View itemView2 = viewHolder.itemView;
            n.LIZIZ((Object)itemView2, "");
            itemView2.setTranslationY(0.0f);
            this.LJIIIIZZ(viewHolder);
            this.LJIJI.remove(k);
        }
        for (int l = this.LJIJJLI.size() - 1; l >= 0; --l) {
            final a value4 = this.LJIJJLI.get(l);
            n.LIZIZ((Object)value4, "");
            this.LIZ(value4);
        }
        this.LJIJJLI.clear();
        if (!((RecyclerView.f)this).LIZIZ()) {
            return;
        }
        for (int n = this.LIZIZ.size() - 1; n >= 0; --n) {
            final ArrayList<b> value5 = this.LIZIZ.get(n);
            n.LIZIZ((Object)value5, "");
            final ArrayList<b> list = value5;
            for (int n2 = list.size() - 1; n2 >= 0; --n2) {
                final Object value6 = list.get(n2);
                n.LIZIZ(value6, "");
                final b b2 = (b)value6;
                final View itemView3 = b2.LIZ.itemView;
                n.LIZIZ((Object)itemView3, "");
                itemView3.setTranslationY(0.0f);
                itemView3.setTranslationX(0.0f);
                ((RecyclerView.f)this).LJI(b2.LIZ);
                list.remove(n2);
                if (list.isEmpty()) {
                    this.LIZIZ.remove(list);
                }
            }
        }
        for (int n3 = this.LIZ.size() - 1; n3 >= 0; --n3) {
            final ArrayList<ViewHolder> value7 = this.LIZ.get(n3);
            n.LIZIZ((Object)value7, "");
            final ArrayList<ViewHolder> list2 = value7;
            for (int n4 = list2.size() - 1; n4 >= 0; --n4) {
                final Object value8 = list2.get(n4);
                n.LIZIZ(value8, "");
                final ViewHolder viewHolder2 = (ViewHolder)value8;
                final View itemView4 = viewHolder2.itemView;
                n.LIZIZ((Object)itemView4, "");
                itemView4.setTranslationY(0.0f);
                this.LJIIIIZZ(viewHolder2);
                list2.remove(n4);
                if (list2.isEmpty()) {
                    this.LIZ.remove(list2);
                }
            }
        }
        for (int n5 = this.LIZJ.size() - 1; n5 >= 0; --n5) {
            final ArrayList<a> value9 = this.LIZJ.get(n5);
            n.LIZIZ((Object)value9, "");
            final ArrayList<a> list3 = value9;
            for (int n6 = list3.size() - 1; n6 >= 0; --n6) {
                final Object value10 = list3.get(n6);
                n.LIZIZ(value10, "");
                this.LIZ((a)value10);
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
    
    @Override
    public final void LJIIIZ(final ViewHolder viewHolder) {
        super.LJIIIZ(viewHolder);
        this.LJIILL.invoke();
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
            Covode.recordClassIndex(10817);
        }
        
        public a(final ViewHolder liz, final ViewHolder liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        public a(final ViewHolder viewHolder, final ViewHolder viewHolder2, final int lizj, final int lizlll, final int lj, final int ljff) {
            CTM.LIZ((Object)viewHolder);
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
            Covode.recordClassIndex(10818);
        }
        
        public b(final ViewHolder liz, final int liziz, final int lizj, final int lizlll, final int lj) {
            CTM.LIZ((Object)liz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
        }
    }
}
