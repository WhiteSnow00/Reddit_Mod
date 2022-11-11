// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import android.widget.ImageView;
import java.util.Collection;
import kotlin.jvm.internal.n;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import android.view.View$OnClickListener;
import android.view.View;
import android.text.TextUtils$TruncateAt;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

public final class 1iq extends 1Jk<b, LiveEffect>
{
    public int LIZIZ;
    public final a LIZJ;
    public final Context LIZLLL;
    
    static {
        Covode.recordClassIndex(6326);
    }
    
    public 1iq(final Context lizlll, final a lizj) {
        CTM.LIZ((Object)lizlll);
        this.LIZLLL = lizlll;
        this.LIZJ = lizj;
    }
    
    public static ViewHolder LIZ(final 1iq p0, final ViewGroup p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_1        
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    10: aload_0        
        //    11: getfield        X/1iq.LIZLLL:Landroid/content/Context;
        //    14: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    17: ldc             2131561955
        //    19: aload_1        
        //    20: iconst_0       
        //    21: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    24: astore_0       
        //    25: aload_0        
        //    26: ldc             ""
        //    28: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    31: new             LX/1K4;
        //    34: dup            
        //    35: aload_0        
        //    36: invokespecial   X/1K4.<init>:(Landroid/view/View;)V
        //    39: astore_0       
        //    40: aload_0        
        //    41: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    44: ldc             2131372584
        //    46: aload_1        
        //    47: invokevirtual   java/lang/Object.hashCode:()I
        //    50: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    53: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    56: aload_0        
        //    57: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    60: ifnull          76
        //    63: aload_0        
        //    64: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    67: ldc             2131363869
        //    69: aload_1        
        //    70: invokestatic    X/2sV.LIZ:(Landroid/view/View;)Landroidx/fragment/app/Fragment;
        //    73: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    76: aload_0        
        //    77: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    80: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    83: ifnull          214
        //    86: iconst_1       
        //    87: istore_3       
        //    88: invokestatic    com/bytedance/ies/abmock/SettingsManager.LIZ:()Lcom/bytedance/ies/abmock/SettingsManager;
        //    91: ldc             "catch_onCreateViewHolder_crash"
        //    93: iconst_1       
        //    94: invokevirtual   com/bytedance/ies/abmock/SettingsManager.LIZ:(Ljava/lang/String;Z)Z
        //    97: istore          4
        //    99: iload           4
        //   101: ifeq            214
        //   104: new             Ljava/lang/StringBuffer;
        //   107: astore          5
        //   109: aload           5
        //   111: invokespecial   java/lang/StringBuffer.<init>:()V
        //   114: aload           5
        //   116: ldc             "onCreateViewHolder getParent() != null crash hook, holder "
        //   118: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   121: pop            
        //   122: aload           5
        //   124: aload_0        
        //   125: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   128: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   131: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   134: pop            
        //   135: aload           5
        //   137: ldc             " parent "
        //   139: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   142: pop            
        //   143: aload           5
        //   145: aload_1        
        //   146: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   149: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   152: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   155: pop            
        //   156: aload           5
        //   158: ldc             " viewType "
        //   160: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   163: pop            
        //   164: aload           5
        //   166: iload_2        
        //   167: invokevirtual   java/lang/StringBuffer.append:(I)Ljava/lang/StringBuffer;
        //   170: pop            
        //   171: aload           5
        //   173: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   176: invokestatic    X/VYh.LIZ:(Ljava/lang/String;)V
        //   179: aload_0        
        //   180: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   183: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   186: checkcast       Landroid/view/ViewGroup;
        //   189: astore_1       
        //   190: aload_1        
        //   191: ifnull          214
        //   194: aload_1        
        //   195: aload_0        
        //   196: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   199: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //   202: goto            214
        //   205: astore_1       
        //   206: aload_1        
        //   207: invokestatic    X/3Z3.LIZ:(Ljava/lang/Exception;)V
        //   210: aload_1        
        //   211: invokestatic    X/4ch.LIZ:(Ljava/lang/Exception;)V
        //   214: aload_0        
        //   215: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   218: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   221: putstatic       X/2ex.LIZ:Ljava/lang/String;
        //   224: sipush          660
        //   227: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   230: aload_0        
        //   231: areturn        
        //   232: astore          5
        //   234: iload_3        
        //   235: istore          4
        //   237: goto            99
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  76     86     205    214    Ljava/lang/Exception;
        //  88     99     232    240    Ljava/lang/Exception;
        //  104    190    205    214    Ljava/lang/Exception;
        //  194    202    205    214    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0099:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    private void LIZ(final b b, final LiveEffect liveEffect) {
        CTM.LIZ((Object)b, (Object)liveEffect);
        GTi.LIZIZ(b.LIZIZ);
        b.LIZLLL.setEllipsize(TextUtils$TruncateAt.MARQUEE);
        b.LIZLLL.setSelected(true);
        b.LIZLLL.setTextColor(0cB.LIZIZ(2131100564));
    }
    
    private void LIZIZ(final b b, final LiveEffect liveEffect) {
        CTM.LIZ((Object)b, (Object)liveEffect);
        GTi.LIZJ(b.LIZIZ);
        b.LIZLLL.setEllipsize((TextUtils$TruncateAt)null);
        b.LIZLLL.setSelected(false);
        b.LIZLLL.setTextColor(0cB.LIZIZ(2131100708));
    }
    
    public final void LIZ(final List<? extends LiveEffect> list) {
        CTM.LIZ((Object)list);
        final 44V ljiizilj = GST.LJIIZILJ;
        n.LIZIZ((Object)ljiizilj, "");
        final Object liz = ((44T)ljiizilj).LIZ();
        n.LIZIZ(liz, "");
        this.LIZIZ = ((Number)liz).intValue();
        final 0FM.d liz2 = 0FM.LIZ((0FM.a)new 1Lw(super.LIZ, list), true);
        n.LIZIZ((Object)liz2, "");
        liz2.LIZ(this);
        super.LIZ.clear();
        super.LIZ.addAll(list);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(6327);
        }
        
        void LIZ(final int p0);
    }
    
    public static final class b extends ViewHolder
    {
        public final View LIZ;
        public final View LIZIZ;
        public final 1si LIZJ;
        public final TextView LIZLLL;
        public final View LJ;
        public final ImageView LJFF;
        
        static {
            Covode.recordClassIndex(6328);
        }
        
        public b(View viewById) {
            CTM.LIZ((Object)viewById);
            super(viewById);
            final View viewById2 = viewById.findViewById(2131362875);
            n.LIZIZ((Object)viewById2, "");
            this.LIZIZ = viewById2;
            final View viewById3 = viewById.findViewById(2131366790);
            n.LIZIZ((Object)viewById3, "");
            this.LIZJ = (1si)viewById3;
            final View viewById4 = viewById.findViewById(2131373343);
            n.LIZIZ((Object)viewById4, "");
            this.LIZLLL = (TextView)viewById4;
            final View viewById5 = viewById.findViewById(2131367000);
            n.LIZIZ((Object)viewById5, "");
            this.LIZ = viewById5;
            final View viewById6 = viewById.findViewById(2131366651);
            n.LIZIZ((Object)viewById6, "");
            this.LJ = viewById6;
            viewById = viewById.findViewById(2131367036);
            n.LIZIZ((Object)viewById, "");
            this.LJFF = (ImageView)viewById;
        }
        
        public final void LIZ() {
            this.LJ.setVisibility(4);
        }
    }
}
