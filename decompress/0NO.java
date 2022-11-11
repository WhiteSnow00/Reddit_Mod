// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Collection;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import kotlin.jvm.internal.n;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import android.view.View;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

public final class 0no extends FrameLayout
{
    public SRS<? super Boolean, 2P9> LIZ;
    public boolean LIZIZ;
    public AnimatorSet LIZJ;
    public a LIZLLL;
    public final List<a> LJ;
    public final List<a> LJFF;
    public ArrayList<Integer> LJI;
    public Boolean LJII;
    public final 5DO LJIIIIZZ;
    public HashMap LJIIIZ;
    
    static {
        Covode.recordClassIndex(7932);
    }
    
    public 0no(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 0no(final Context context, final AttributeSet set, final char c) {
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
        //     8: invokespecial   android/widget/FrameLayout.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    11: sipush          9221
        //    14: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    17: aload_0        
        //    18: iconst_3       
        //    19: anewarray       Ljava/lang/Integer;
        //    22: dup            
        //    23: iconst_0       
        //    24: ldc             2131234813
        //    26: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    29: aastore        
        //    30: dup            
        //    31: iconst_1       
        //    32: ldc             2131234814
        //    34: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    37: aastore        
        //    38: dup            
        //    39: iconst_2       
        //    40: ldc             2131234815
        //    42: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    45: aastore        
        //    46: invokestatic    X/Ey9.LIZLLL:([Ljava/lang/Object;)Ljava/util/ArrayList;
        //    49: putfield        X/0no.LJI:Ljava/util/ArrayList;
        //    52: aload_0        
        //    53: new             LX/1xW;
        //    56: dup            
        //    57: aload_0        
        //    58: invokespecial   X/1xW.<init>:(LX/0no;)V
        //    61: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    64: putfield        X/0no.LJIIIIZZ:LX/5DO;
        //    67: aload_0        
        //    68: new             Ljava/util/ArrayList;
        //    71: dup            
        //    72: invokespecial   java/util/ArrayList.<init>:()V
        //    75: putfield        X/0no.LJ:Ljava/util/List;
        //    78: aload_0        
        //    79: new             Ljava/util/ArrayList;
        //    82: dup            
        //    83: invokespecial   java/util/ArrayList.<init>:()V
        //    86: putfield        X/0no.LJFF:Ljava/util/List;
        //    89: aload_1        
        //    90: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    93: ldc             2131562187
        //    95: aload_0        
        //    96: iconst_1       
        //    97: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   100: pop            
        //   101: aload_0        
        //   102: ldc             2131367369
        //   104: invokespecial   X/0no.LIZIZ:(I)Landroid/view/View;
        //   107: checkcast       Landroid/widget/LinearLayout;
        //   110: new             Lcom/bytedance/android/live/liveinteract/match/ui/view/BattleMvpContainerLayout$1;
        //   113: dup            
        //   114: aload_0        
        //   115: invokespecial   com/bytedance/android/live/liveinteract/match/ui/view/BattleMvpContainerLayout$1.<init>:(LX/0no;)V
        //   118: invokevirtual   android/widget/LinearLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   121: aload_0        
        //   122: ldc             2131367428
        //   124: invokespecial   X/0no.LIZIZ:(I)Landroid/view/View;
        //   127: checkcast       Landroid/widget/LinearLayout;
        //   130: new             Lcom/bytedance/android/live/liveinteract/match/ui/view/BattleMvpContainerLayout$2;
        //   133: dup            
        //   134: aload_0        
        //   135: invokespecial   com/bytedance/android/live/liveinteract/match/ui/view/BattleMvpContainerLayout$2.<init>:(LX/0no;)V
        //   138: invokevirtual   android/widget/LinearLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   141: sipush          9221
        //   144: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   147: return         
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
    
    private View LIZIZ(final int n) {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJIIIZ.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LJIIIZ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZ() {
        this.LIZIZ();
        this.LIZ(true, null);
        this.LIZ(false, null);
        this.getMMvpImageView().setVisibility(8);
    }
    
    public final void LIZ(final int n) {
        if (n <= 0) {
            this.setAlpha(1.0f);
        }
        final LinearLayout linearLayout = (LinearLayout)this.LIZIZ(2131367369);
        n.LIZIZ((Object)linearLayout, "");
        final int measuredWidth = linearLayout.getMeasuredWidth();
        final LinearLayout linearLayout2 = (LinearLayout)this.LIZIZ(2131367428);
        n.LIZIZ((Object)linearLayout2, "");
        if (0cB.LIZJ() - measuredWidth - linearLayout2.getMeasuredWidth() - 0cB.LIZ(12.0f) < n) {
            this.setAlpha(0.2f);
            return;
        }
        this.setAlpha(1.0f);
    }
    
    public final void LIZ(final boolean b) {
        public final class 0nm implements Runnable
        {
            public final /* synthetic */ 0no LIZ;
            public final /* synthetic */ boolean LIZIZ;
            
            static {
                Covode.recordClassIndex(7937);
            }
            
            public 0nm(final 0no liz, final boolean liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                final 0no liz = this.LIZ;
                a lizlll;
                if (this.LIZIZ) {
                    lizlll = (a)Qsi.LJIIJJI((List)liz.LJ);
                }
                else {
                    lizlll = (a)Qsi.LJIIJJI((List)liz.LJFF);
                }
                liz.LIZLLL = lizlll;
                final a lizlll2 = this.LIZ.LIZLLL;
                if (lizlll2 != null && lizlll2.LIZ) {
                    return;
                }
                final a lizlll3 = this.LIZ.LIZLLL;
                if (lizlll3 != null) {
                    final View lj = lizlll3.LJ;
                    if (lj != null && lj.findViewById(2131367192) != null) {
                        this.LIZ.getMMvpImageView().setVisibility(0);
                        0cb.LIZ((View)this.LIZ.getMMvpImageView(), "tiktok_live_interaction_resource", "ttlive_pk_army_mvp.png");
                        final 0no liz2 = this.LIZ;
                        final a lizlll4 = liz2.LIZLLL;
                        if (lizlll4 == null) {
                            n.LIZIZ();
                        }
                        final View viewById = lizlll4.LJ.findViewById(2131367192);
                        n.LIZIZ((Object)viewById, "");
                        final 1xX 1xX = new 1xX(liz2);
                        final 1xY 1xY = new 1xY(liz2);
                        final 1xZ 1xZ = new 1xZ(1xY, 1xX);
                        final 1xa 1xa = new 1xa(liz2, 1xY, 1xX);
                        final 1xb 1xb = new 1xb(1xX);
                        new 1xc(liz2).LIZ();
                        liz2.LIZIZ = false;
                        liz2.LIZJ = new AnimatorSet();
                        final AnimatorSet lizj = liz2.LIZJ;
                        if (lizj != null) {
                            lizj.playSequentially(new Animator[] { (Animator)1xZ.LIZ(), (Animator)1xa.LIZ(viewById), (Animator)1xb.LIZ() });
                        }
                        final AnimatorSet lizj2 = liz2.LIZJ;
                        if (lizj2 != null) {
                            ((Animator)lizj2).addListener((Animator$AnimatorListener)new 0nn(liz2));
                        }
                        final AnimatorSet lizj3 = liz2.LIZJ;
                        if (lizj3 != null) {
                            lizj3.start();
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
        //     1: iload_1        
        //     2: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //     5: putfield        X/0no.LJII:Ljava/lang/Boolean;
        //     8: aload_0        
        //     9: new             LX/0nm;
        //    12: dup            
        //    13: aload_0        
        //    14: iload_1        
        //    15: invokespecial   X/0nm.<init>:(LX/0no;Z)V
        //    18: ldc2_w          3800
        //    21: invokevirtual   X/0no.postDelayed:(Ljava/lang/Runnable;J)Z
        //    24: pop            
        //    25: return         
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
    
    public final void LIZ(final boolean b, final List<BattleUserArmy> list) {
        MethodCollector.i(8589);
        final ArrayList list2 = new ArrayList();
        if (list != null) {
            final List lj = Qsi.LJ((Iterable)list, 3);
            if (lj != null) {
                list2.addAll(lj);
            }
        }
        if (list2.size() < 3) {
            BattleUserArmy battleUserArmy;
            if (b) {
                battleUserArmy = BattleUserArmy.LJFF;
            }
            else {
                battleUserArmy = BattleUserArmy.LJI;
            }
            list2.add(battleUserArmy);
        }
        int n;
        if (b) {
            n = 2131367369;
        }
        else {
            n = 2131367428;
        }
        final LinearLayout linearLayout = (LinearLayout)this.LIZIZ(n);
        List<a> list3;
        if (b) {
            list3 = this.LJ;
        }
        else {
            list3 = this.LJFF;
        }
        linearLayout.removeAllViews();
        final Iterator iterator = list2.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n2 < 0) {
                Ey9.LIZ();
            }
            final BattleUserArmy battleUserArmy2 = (BattleUserArmy)next;
            a a;
            if ((a = (a)Qsi.LIZIZ((List)list3, n2)) == null) {
                final View liz = 0II.LIZ(LayoutInflater.from(this.getContext()), 2131562188, (ViewGroup)linearLayout, false);
                kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
                a = new a(liz);
                list3.add(a);
            }
            final ViewGroup$LayoutParams layoutParams = a.LJ.getLayoutParams();
            final boolean b2 = layoutParams instanceof ViewGroup$MarginLayoutParams;
            boolean b3 = true;
            if (b2) {
                if (n2 == list2.size() - 1) {
                    ((ViewGroup$MarginLayoutParams)layoutParams).setMarginStart(0cB.LIZ(0.0f));
                }
                else {
                    ((ViewGroup$MarginLayoutParams)layoutParams).setMarginStart(0cB.LIZ(6.0f) * -1);
                }
                a.LJ.setLayoutParams(layoutParams);
            }
            linearLayout.addView(a.LJ, 0);
            if (!kotlin.jvm.internal.n.LIZ((Object)this.LJII, (Object)b) || n2 != 0 || !this.LIZIZ) {
                b3 = false;
            }
            final Integer value = this.LJI.get(n2);
            kotlin.jvm.internal.n.LIZIZ((Object)value, "");
            a.LIZ(battleUserArmy2, value.intValue(), b3);
            ++n2;
        }
        MethodCollector.o(8589);
    }
    
    public final void LIZIZ() {
        MethodCollector.i(8582);
        ((LinearLayout)this.LIZIZ(2131367369)).removeAllViews();
        ((LinearLayout)this.LIZIZ(2131367428)).removeAllViews();
        this.LIZLLL = null;
        this.LJII = null;
        this.LIZIZ = false;
        this.LJ.clear();
        this.LJFF.clear();
        MethodCollector.o(8582);
    }
    
    public final 1si getMMvpImageView() {
        return (1si)this.LJIIIIZZ.getValue();
    }
    
    public final void setClickCallback(final SRS<? super Boolean, 2P9> liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public static final class a
    {
        public boolean LIZ;
        public final 7wT LIZIZ;
        public final AppCompatImageView LIZJ;
        public final 1si LIZLLL;
        public final View LJ;
        
        static {
            Covode.recordClassIndex(7935);
        }
        
        public a(final View lj) {
            CTM.LIZ((Object)lj);
            this.LJ = lj;
            final View viewById = lj.findViewById(2131367192);
            n.LIZIZ((Object)viewById, "");
            this.LIZIZ = (7wT)viewById;
            final View viewById2 = lj.findViewById(2131367194);
            n.LIZIZ((Object)viewById2, "");
            this.LIZJ = (AppCompatImageView)viewById2;
            this.LIZLLL = (1si)lj.findViewById(2131367193);
        }
        
        public final void LIZ(final BattleUserArmy battleUserArmy, final int imageResource, final boolean b) {
            CTM.LIZ((Object)battleUserArmy);
            if (n.LIZ((Object)battleUserArmy, (Object)BattleUserArmy.LJFF)) {
                this.LIZ = true;
                ((AppCompatImageView)this.LIZIZ).setImageResource(2131234811);
            }
            else if (n.LIZ((Object)battleUserArmy, (Object)BattleUserArmy.LJI)) {
                this.LIZ = true;
                ((AppCompatImageView)this.LIZIZ).setImageResource(2131234812);
            }
            else {
                this.LIZ = false;
                HFv.LIZ((ImageView)this.LIZIZ, battleUserArmy.LIZLLL, this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 2131234398);
            }
            this.LIZJ.setImageResource(imageResource);
            this.LIZ(b);
        }
        
        public final void LIZ(final boolean b) {
            int visibility = 0;
            boolean b2;
            if (b && !this.LIZ) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            final 1si lizlll = this.LIZLLL;
            n.LIZIZ((Object)lizlll, "");
            if (!b2) {
                visibility = 8;
            }
            lizlll.setVisibility(visibility);
            if (b2) {
                0cb.LIZ((View)this.LIZLLL, "tiktok_live_interaction_resource", "ttlive_pk_army_mvp.png");
            }
        }
    }
}
