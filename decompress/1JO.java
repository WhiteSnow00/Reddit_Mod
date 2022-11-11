// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.List;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.n;
import android.view.View;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class 1jO extends 1Jk<1ME, 0gn>
{
    public final DataChannel LIZIZ;
    public final boolean LIZJ;
    public final 0CH LIZLLL;
    public final SoundEffectViewModel LJ;
    public final int LJFF;
    
    static {
        Covode.recordClassIndex(6661);
    }
    
    public 1jO(final DataChannel liziz, final boolean lizj, final 0CH lizlll, final SoundEffectViewModel lj, final int ljff) {
        CTM.LIZ((Object)lizlll);
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    public static ViewHolder LIZ(final 1jO p0, final ViewGroup p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_1        
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    10: new             LX/1ME;
        //    13: dup            
        //    14: aload_1        
        //    15: aload_0        
        //    16: getfield        X/1jO.LJFF:I
        //    19: invokespecial   X/1ME.<init>:(Landroid/view/ViewGroup;I)V
        //    22: astore_0       
        //    23: aload_0        
        //    24: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    27: ldc             2131372584
        //    29: aload_1        
        //    30: invokevirtual   java/lang/Object.hashCode:()I
        //    33: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    36: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    39: aload_0        
        //    40: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    43: ifnull          59
        //    46: aload_0        
        //    47: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    50: ldc             2131363869
        //    52: aload_1        
        //    53: invokestatic    X/2sV.LIZ:(Landroid/view/View;)Landroidx/fragment/app/Fragment;
        //    56: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    59: aload_0        
        //    60: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    63: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    66: ifnull          197
        //    69: iconst_1       
        //    70: istore_3       
        //    71: invokestatic    com/bytedance/ies/abmock/SettingsManager.LIZ:()Lcom/bytedance/ies/abmock/SettingsManager;
        //    74: ldc             "catch_onCreateViewHolder_crash"
        //    76: iconst_1       
        //    77: invokevirtual   com/bytedance/ies/abmock/SettingsManager.LIZ:(Ljava/lang/String;Z)Z
        //    80: istore          4
        //    82: iload           4
        //    84: ifeq            197
        //    87: new             Ljava/lang/StringBuffer;
        //    90: astore          5
        //    92: aload           5
        //    94: invokespecial   java/lang/StringBuffer.<init>:()V
        //    97: aload           5
        //    99: ldc             "onCreateViewHolder getParent() != null crash hook, holder "
        //   101: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   104: pop            
        //   105: aload           5
        //   107: aload_0        
        //   108: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   111: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   114: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   117: pop            
        //   118: aload           5
        //   120: ldc             " parent "
        //   122: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   125: pop            
        //   126: aload           5
        //   128: aload_1        
        //   129: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   132: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   135: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   138: pop            
        //   139: aload           5
        //   141: ldc             " viewType "
        //   143: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   146: pop            
        //   147: aload           5
        //   149: iload_2        
        //   150: invokevirtual   java/lang/StringBuffer.append:(I)Ljava/lang/StringBuffer;
        //   153: pop            
        //   154: aload           5
        //   156: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   159: invokestatic    X/VYh.LIZ:(Ljava/lang/String;)V
        //   162: aload_0        
        //   163: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   166: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   169: checkcast       Landroid/view/ViewGroup;
        //   172: astore_1       
        //   173: aload_1        
        //   174: ifnull          197
        //   177: aload_1        
        //   178: aload_0        
        //   179: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   182: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //   185: goto            197
        //   188: astore_1       
        //   189: aload_1        
        //   190: invokestatic    X/3Z3.LIZ:(Ljava/lang/Exception;)V
        //   193: aload_1        
        //   194: invokestatic    X/4ch.LIZ:(Ljava/lang/Exception;)V
        //   197: aload_0        
        //   198: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   201: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   204: putstatic       X/2ex.LIZ:Ljava/lang/String;
        //   207: sipush          7120
        //   210: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   213: aload_0        
        //   214: areturn        
        //   215: astore          5
        //   217: iload_3        
        //   218: istore          4
        //   220: goto            82
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  59     69     188    197    Ljava/lang/Exception;
        //  71     82     215    223    Ljava/lang/Exception;
        //  87     173    188    197    Ljava/lang/Exception;
        //  177    185    188    197    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0082:
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
    
    private void LIZ(final 1ME 1me, final 0gn 0gn) {
        CTM.LIZ((Object)1me, (Object)0gn);
        GTi.LIZIZ(1me.LIZLLL);
        final TextView lizj = 1me.LIZJ;
        if (lizj != null) {
            lizj.setEllipsize(TextUtils$TruncateAt.MARQUEE);
        }
        final TextView lizj2 = 1me.LIZJ;
        if (lizj2 != null) {
            lizj2.setSelected(true);
        }
    }
    
    private void LIZIZ(final 1ME 1me, final 0gn 0gn) {
        CTM.LIZ((Object)1me, (Object)0gn);
        GTi.LIZJ(1me.LIZLLL);
        final TextView lizj = 1me.LIZJ;
        if (lizj != null) {
            lizj.setEllipsize((TextUtils$TruncateAt)null);
        }
        final TextView lizj2 = 1me.LIZJ;
        if (lizj2 != null) {
            lizj2.setSelected(false);
        }
    }
    
    private void LIZJ(final 1ME 1me, final 0gn 0gn) {
        CTM.LIZ((Object)1me, (Object)0gn);
        GTi.LIZJ(1me.LIZ);
        GTi.LIZIZ((View)1me.LIZIZ);
        final 7kA liziz = 1me.LIZIZ;
        if (liziz != null) {
            liziz.setProgress(90);
        }
    }
    
    private void LIZLLL(final 1ME 1me, final 0gn 0gn) {
        CTM.LIZ((Object)1me, (Object)0gn);
        GTi.LIZJ(1me.LIZ);
        GTi.LIZJ((View)1me.LIZIZ);
    }
    
    private void LJ(final 1ME 1me, final 0gn 0gn) {
        CTM.LIZ((Object)1me, (Object)0gn);
        GTi.LIZIZ(1me.LIZ);
        GTi.LIZJ((View)1me.LIZIZ);
    }
    
    public final void LIZ(final List<0gn> list) {
        CTM.LIZ((Object)list);
        final 0FM.d liz = 0FM.LIZ((0FM.a)new 1MJ(super.LIZ, list), true);
        n.LIZIZ((Object)liz, "");
        liz.LIZ(this);
        super.LIZ.clear();
        super.LIZ.addAll(list);
    }
}
