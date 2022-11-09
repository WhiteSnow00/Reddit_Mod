// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.Iterator;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class 0Di
{
    public static ArrayList<ViewGroup> LIZ;
    public static 0Dg LIZIZ;
    public static ThreadLocal<WeakReference<13j<ViewGroup, ArrayList<0Dg>>>> LIZJ;
    
    static {
        Covode.recordClassIndex(1456);
        0Di.LIZIZ = new 1gJ();
        0Di.LIZJ = new ThreadLocal<WeakReference<13j<ViewGroup, ArrayList<0Dg>>>>();
        0Di.LIZ = new ArrayList<ViewGroup>();
    }
    
    public static 13j<ViewGroup, ArrayList<0Dg>> LIZ() {
        final WeakReference weakReference = 0Di.LIZJ.get();
        if (weakReference != null) {
            final 13j 13j = (13j)weakReference.get();
            if (13j != null) {
                return 13j;
            }
        }
        final 13j<ViewGroup, ArrayList<0Dg>> 13j2 = new 13j<ViewGroup, ArrayList<0Dg>>();
        0Di.LIZJ.set(new WeakReference<13j<ViewGroup, ArrayList<0Dg>>>(13j2));
        return 13j2;
    }
    
    public static void LIZ(final ViewGroup viewGroup) {
        LIZ(viewGroup, null);
    }
    
    public static void LIZ(final ViewGroup viewGroup, 0Dg ljff) {
        if (!0Di.LIZ.contains(viewGroup) && ((View)viewGroup).isLaidOut()) {
            0Di.LIZ.add(viewGroup);
            0Dg liziz;
            if ((liziz = ljff) == null) {
                liziz = 0Di.LIZIZ;
            }
            ljff = liziz.LJFF();
            LIZJ(viewGroup, ljff);
            viewGroup.setTag(2131372599, (Object)null);
            LIZIZ(viewGroup, ljff);
        }
    }
    
    public static void LIZIZ(final ViewGroup viewGroup, final 0Dg 0Dg) {
        if (0Dg != null && viewGroup != null) {
            final a a = new a(0Dg, viewGroup);
            viewGroup.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)a);
            viewGroup.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)a);
        }
    }
    
    public static void LIZJ(final ViewGroup viewGroup, final 0Dg 0Dg) {
        final ArrayList list = LIZ().get(viewGroup);
        if (list != null && list.size() > 0) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((0Dg)iterator.next()).LIZLLL((View)viewGroup);
            }
        }
        if (0Dg != null) {
            0Dg.LIZ(viewGroup, true);
        }
        final 0DZ liz = 0DZ.LIZ(viewGroup);
        if (liz != null && 0DZ.LIZ(liz.LIZ) == liz && liz.LIZIZ != null) {
            liz.LIZIZ.run();
        }
    }
    
    public static final class a implements View$OnAttachStateChangeListener, ViewTreeObserver$OnPreDrawListener
    {
        public 0Dg LIZ;
        public ViewGroup LIZIZ;
        
        static {
            Covode.recordClassIndex(1457);
        }
        
        public a(final 0Dg liz, final ViewGroup liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        private void LIZ() {
            this.LIZIZ.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            this.LIZIZ.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        }
        
        public final boolean onPreDraw() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   X/0Dh.LIZ:()V
            //     4: getstatic       X/0Di.LIZ:Ljava/util/ArrayList;
            //     7: aload_0        
            //     8: getfield        X/0Dh.LIZIZ:Landroid/view/ViewGroup;
            //    11: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
            //    14: ifne            19
            //    17: iconst_1       
            //    18: ireturn        
            //    19: invokestatic    X/0Di.LIZ:()LX/13j;
            //    22: astore_1       
            //    23: aload_1        
            //    24: aload_0        
            //    25: getfield        X/0Dh.LIZIZ:Landroid/view/ViewGroup;
            //    28: invokevirtual   X/050.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //    31: checkcast       Ljava/util/ArrayList;
            //    34: astore_2       
            //    35: aconst_null    
            //    36: astore_3       
            //    37: aload_2        
            //    38: ifnonnull       140
            //    41: new             Ljava/util/ArrayList;
            //    44: dup            
            //    45: invokespecial   java/util/ArrayList.<init>:()V
            //    48: astore          4
            //    50: aload_1        
            //    51: aload_0        
            //    52: getfield        X/0Dh.LIZIZ:Landroid/view/ViewGroup;
            //    55: aload           4
            //    57: invokevirtual   X/050.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //    60: pop            
            //    61: aload           4
            //    63: aload_0        
            //    64: getfield        X/0Dh.LIZ:LX/0Dg;
            //    67: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //    70: pop            
            //    71: aload_0        
            //    72: getfield        X/0Dh.LIZ:LX/0Dg;
            //    75: new             LX/1gX;
            //    78: dup            
            //    79: aload_0        
            //    80: aload_1        
            //    81: invokespecial   X/1gX.<init>:(LX/0Dh;LX/13j;)V
            //    84: invokevirtual   X/0Dg.LIZ:(LX/0Df;)LX/0Dg;
            //    87: pop            
            //    88: aload_0        
            //    89: getfield        X/0Dh.LIZ:LX/0Dg;
            //    92: aload_0        
            //    93: getfield        X/0Dh.LIZIZ:Landroid/view/ViewGroup;
            //    96: iconst_0       
            //    97: invokevirtual   X/0Dg.LIZ:(Landroid/view/ViewGroup;Z)V
            //   100: aload_3        
            //   101: ifnull          165
            //   104: aload_3        
            //   105: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
            //   108: astore          4
            //   110: aload           4
            //   112: invokeinterface java/util/Iterator.hasNext:()Z
            //   117: ifeq            165
            //   120: aload           4
            //   122: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   127: checkcast       LX/0Dg;
            //   130: aload_0        
            //   131: getfield        X/0Dh.LIZIZ:Landroid/view/ViewGroup;
            //   134: invokevirtual   X/0Dg.LJ:(Landroid/view/View;)V
            //   137: goto            110
            //   140: aload_2        
            //   141: astore          4
            //   143: aload_2        
            //   144: invokevirtual   java/util/ArrayList.size:()I
            //   147: ifle            61
            //   150: new             Ljava/util/ArrayList;
            //   153: dup            
            //   154: aload_2        
            //   155: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //   158: astore_3       
            //   159: aload_2        
            //   160: astore          4
            //   162: goto            61
            //   165: aload_0        
            //   166: getfield        X/0Dh.LIZ:LX/0Dg;
            //   169: aload_0        
            //   170: getfield        X/0Dh.LIZIZ:Landroid/view/ViewGroup;
            //   173: invokevirtual   X/0Dg.LIZ:(Landroid/view/ViewGroup;)V
            //   176: iconst_1       
            //   177: ireturn        
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        
        public final void onViewAttachedToWindow(final View view) {
        }
        
        public final void onViewDetachedFromWindow(final View view) {
            this.LIZ();
            0Di.LIZ.remove(this.LIZIZ);
            final ArrayList list = 0Di.LIZ().get(this.LIZIZ);
            if (list != null && list.size() > 0) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((0Dg)iterator.next()).LJ((View)this.LIZIZ);
                }
            }
            this.LIZ.LIZ(true);
        }
    }
}
