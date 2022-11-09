// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View$OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public final class 1L7 extends a<1L9>
{
    public final List<1L4> LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public final DataChannel LIZLLL;
    public final SRS<1L4, 2P9> LJ;
    
    static {
        Covode.recordClassIndex(6475);
    }
    
    public 1L7(final DataChannel lizlll, final SRS<? super 1L4, 2P9> lj) {
        CTM.LIZ((Object)lj);
        this.LIZLLL = lizlll;
        this.LJ = (SRS<1L4, 2P9>)lj;
        this.LIZ = new ArrayList<1L4>();
        this.LIZIZ = 0hc.LJIIIZ;
    }
    
    public static ViewHolder LIZ(final ViewGroup p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_0        
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    10: aload_0        
        //    11: invokevirtual   android/view/ViewGroup.getContext:()Landroid/content/Context;
        //    14: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    17: ldc             2131562262
        //    19: aload_0        
        //    20: iconst_0       
        //    21: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    24: astore_2       
        //    25: aload_2        
        //    26: ldc             ""
        //    28: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    31: new             LX/1L9;
        //    34: dup            
        //    35: aload_2        
        //    36: invokespecial   X/1L9.<init>:(Landroid/view/View;)V
        //    39: astore_2       
        //    40: aload_2        
        //    41: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    44: ldc             2131372584
        //    46: aload_0        
        //    47: invokevirtual   java/lang/Object.hashCode:()I
        //    50: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    53: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    56: aload_2        
        //    57: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    60: ifnull          76
        //    63: aload_2        
        //    64: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    67: ldc             2131363869
        //    69: aload_0        
        //    70: invokestatic    X/2sV.LIZ:(Landroid/view/View;)Landroidx/fragment/app/Fragment;
        //    73: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    76: aload_2        
        //    77: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    80: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    83: ifnull          216
        //    86: iconst_1       
        //    87: istore_3       
        //    88: invokestatic    com/bytedance/ies/abmock/SettingsManager.LIZ:()Lcom/bytedance/ies/abmock/SettingsManager;
        //    91: ldc             "catch_onCreateViewHolder_crash"
        //    93: iconst_1       
        //    94: invokevirtual   com/bytedance/ies/abmock/SettingsManager.LIZ:(Ljava/lang/String;Z)Z
        //    97: istore          4
        //    99: iload           4
        //   101: istore_3       
        //   102: iload_3        
        //   103: ifeq            216
        //   106: new             Ljava/lang/StringBuffer;
        //   109: astore          5
        //   111: aload           5
        //   113: invokespecial   java/lang/StringBuffer.<init>:()V
        //   116: aload           5
        //   118: ldc             "onCreateViewHolder getParent() != null crash hook, holder "
        //   120: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   123: pop            
        //   124: aload           5
        //   126: aload_2        
        //   127: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   130: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   133: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   136: pop            
        //   137: aload           5
        //   139: ldc             " parent "
        //   141: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   144: pop            
        //   145: aload           5
        //   147: aload_0        
        //   148: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   151: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   154: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   157: pop            
        //   158: aload           5
        //   160: ldc             " viewType "
        //   162: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   165: pop            
        //   166: aload           5
        //   168: iload_1        
        //   169: invokevirtual   java/lang/StringBuffer.append:(I)Ljava/lang/StringBuffer;
        //   172: pop            
        //   173: aload           5
        //   175: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   178: invokestatic    X/VYh.LIZ:(Ljava/lang/String;)V
        //   181: aload_2        
        //   182: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   185: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   188: checkcast       Landroid/view/ViewGroup;
        //   191: astore_0       
        //   192: aload_0        
        //   193: ifnull          216
        //   196: aload_0        
        //   197: aload_2        
        //   198: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   201: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //   204: goto            216
        //   207: astore_0       
        //   208: aload_0        
        //   209: invokestatic    X/3Z3.LIZ:(Ljava/lang/Exception;)V
        //   212: aload_0        
        //   213: invokestatic    X/4ch.LIZ:(Ljava/lang/Exception;)V
        //   216: aload_2        
        //   217: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   220: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   223: putstatic       X/2ex.LIZ:Ljava/lang/String;
        //   226: sipush          3712
        //   229: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   232: aload_2        
        //   233: areturn        
        //   234: astore          5
        //   236: goto            102
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  76     86     207    216    Ljava/lang/Exception;
        //  88     99     234    239    Ljava/lang/Exception;
        //  106    192    207    216    Ljava/lang/Exception;
        //  196    204    207    216    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0102:
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
    
    public final void LIZ(final boolean lizj, final long n) {
        if (lizj) {
            if (this.LIZIZ != n) {
                return;
            }
        }
        else if (!this.LIZJ) {
            return;
        }
        this.LIZJ = lizj;
        ((RecyclerView.a)this).notifyDataSetChanged();
    }
    
    @Override
    public final int getItemCount() {
        return this.LIZ.size();
    }
}
