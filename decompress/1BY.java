// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.util.Collection;
import android.view.ViewGroup;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public final class 1by extends RecyclerView.a<a>
{
    public boolean LIZ;
    public final 0wL LIZIZ;
    public final List<0pc> LIZJ;
    
    static {
        Covode.recordClassIndex(10033);
    }
    
    public 1by(final 0wL liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        this.LIZJ = new ArrayList<0pc>();
    }
    
    public static ViewHolder LIZ(final 1by p0, final ViewGroup p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_1        
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    10: aload_1        
        //    11: invokevirtual   android/view/ViewGroup.getContext:()Landroid/content/Context;
        //    14: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    17: ldc             2131562244
        //    19: aload_1        
        //    20: iconst_0       
        //    21: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    24: astore_3       
        //    25: aload_3        
        //    26: ldc             ""
        //    28: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    31: new             LX/1bx;
        //    34: dup            
        //    35: aload_0        
        //    36: aload_3        
        //    37: invokespecial   X/1bx.<init>:(LX/1by;Landroid/view/View;)V
        //    40: astore_0       
        //    41: aload_0        
        //    42: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    45: ldc             2131372584
        //    47: aload_1        
        //    48: invokevirtual   java/lang/Object.hashCode:()I
        //    51: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    54: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    57: aload_0        
        //    58: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    61: ifnull          77
        //    64: aload_0        
        //    65: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    68: ldc             2131363869
        //    70: aload_1        
        //    71: invokestatic    X/2sV.LIZ:(Landroid/view/View;)Landroidx/fragment/app/Fragment;
        //    74: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    77: aload_0        
        //    78: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    81: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    84: ifnull          207
        //    87: iconst_1       
        //    88: istore          4
        //    90: invokestatic    com/bytedance/ies/abmock/SettingsManager.LIZ:()Lcom/bytedance/ies/abmock/SettingsManager;
        //    93: ldc             "catch_onCreateViewHolder_crash"
        //    95: iconst_1       
        //    96: invokevirtual   com/bytedance/ies/abmock/SettingsManager.LIZ:(Ljava/lang/String;Z)Z
        //    99: istore          5
        //   101: iload           5
        //   103: ifeq            207
        //   106: new             Ljava/lang/StringBuffer;
        //   109: astore_3       
        //   110: aload_3        
        //   111: invokespecial   java/lang/StringBuffer.<init>:()V
        //   114: aload_3        
        //   115: ldc             "onCreateViewHolder getParent() != null crash hook, holder "
        //   117: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   120: pop            
        //   121: aload_3        
        //   122: aload_0        
        //   123: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   126: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   129: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   132: pop            
        //   133: aload_3        
        //   134: ldc             " parent "
        //   136: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   139: pop            
        //   140: aload_3        
        //   141: aload_1        
        //   142: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   145: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   148: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   151: pop            
        //   152: aload_3        
        //   153: ldc             " viewType "
        //   155: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   158: pop            
        //   159: aload_3        
        //   160: iload_2        
        //   161: invokevirtual   java/lang/StringBuffer.append:(I)Ljava/lang/StringBuffer;
        //   164: pop            
        //   165: aload_3        
        //   166: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   169: invokestatic    X/VYh.LIZ:(Ljava/lang/String;)V
        //   172: aload_0        
        //   173: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   176: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   179: checkcast       Landroid/view/ViewGroup;
        //   182: astore_1       
        //   183: aload_1        
        //   184: ifnull          207
        //   187: aload_1        
        //   188: aload_0        
        //   189: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   192: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //   195: goto            207
        //   198: astore_1       
        //   199: aload_1        
        //   200: invokestatic    X/3Z3.LIZ:(Ljava/lang/Exception;)V
        //   203: aload_1        
        //   204: invokestatic    X/4ch.LIZ:(Ljava/lang/Exception;)V
        //   207: aload_0        
        //   208: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   211: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   214: putstatic       X/2ex.LIZ:Ljava/lang/String;
        //   217: sipush          9754
        //   220: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   223: aload_0        
        //   224: areturn        
        //   225: astore_3       
        //   226: iload           4
        //   228: istore          5
        //   230: goto            101
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  77     87     198    207    Ljava/lang/Exception;
        //  90     101    225    233    Ljava/lang/Exception;
        //  106    183    198    207    Ljava/lang/Exception;
        //  187    195    198    207    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0101:
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
    
    public final void LIZ(final List<0pc> list) {
        this.LIZJ.clear();
        if (list.isEmpty()) {
            return;
        }
        this.LIZJ.addAll(list);
        ((RecyclerView.a)this).notifyDataSetChanged();
    }
    
    @Override
    public final int getItemCount() {
        return this.LIZJ.size();
    }
    
    public final class a extends ViewHolder
    {
        public final 1si LIZ;
        public final 1ib LIZIZ;
        
        static {
            Covode.recordClassIndex(10034);
        }
        
        public a(final View view) {
            CTM.LIZ((Object)view);
            super(view);
            final View viewById = view.findViewById(2131362592);
            n.LIZIZ((Object)viewById, "");
            this.LIZ = (1si)viewById;
            final View viewById2 = view.findViewById(2131364403);
            n.LIZIZ((Object)viewById2, "");
            this.LIZIZ = (1ib)viewById2;
        }
    }
}
