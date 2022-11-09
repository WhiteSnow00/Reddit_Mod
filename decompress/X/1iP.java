// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import java.util.Collection;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import android.view.View$OnClickListener;
import java.util.List;
import com.bytedance.android.live.base.model.ImageModel;
import android.text.TextUtils$TruncateAt;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import com.bytedance.android.live.effect.model.FilterModel;

public final class 1ip extends 1Jk<b, FilterModel>
{
    public final a LIZIZ;
    public int LIZJ;
    public final Context LIZLLL;
    
    static {
        Covode.recordClassIndex(6305);
    }
    
    public 1ip(final Context lizlll, final a liziz) {
        this.LIZLLL = lizlll;
        this.LIZIZ = liziz;
    }
    
    public static ViewHolder LIZ(final 1ip p0, final ViewGroup p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: new             LX/1Ju;
        //     9: dup            
        //    10: aload_0        
        //    11: getfield        X/1ip.LIZLLL:Landroid/content/Context;
        //    14: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    17: ldc             2131561955
        //    19: aload_1        
        //    20: iconst_0       
        //    21: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    24: invokespecial   X/1Ju.<init>:(Landroid/view/View;)V
        //    27: astore_0       
        //    28: aload_0        
        //    29: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    32: ldc             2131372584
        //    34: aload_1        
        //    35: invokevirtual   java/lang/Object.hashCode:()I
        //    38: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    41: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    44: aload_0        
        //    45: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    48: ifnull          64
        //    51: aload_0        
        //    52: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    55: ldc             2131363869
        //    57: aload_1        
        //    58: invokestatic    X/2sV.LIZ:(Landroid/view/View;)Landroidx/fragment/app/Fragment;
        //    61: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //    64: aload_0        
        //    65: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //    68: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    71: ifnull          204
        //    74: iconst_1       
        //    75: istore_3       
        //    76: invokestatic    com/bytedance/ies/abmock/SettingsManager.LIZ:()Lcom/bytedance/ies/abmock/SettingsManager;
        //    79: ldc             "catch_onCreateViewHolder_crash"
        //    81: iconst_1       
        //    82: invokevirtual   com/bytedance/ies/abmock/SettingsManager.LIZ:(Ljava/lang/String;Z)Z
        //    85: istore          4
        //    87: iload           4
        //    89: istore_3       
        //    90: iload_3        
        //    91: ifeq            204
        //    94: new             Ljava/lang/StringBuffer;
        //    97: astore          5
        //    99: aload           5
        //   101: invokespecial   java/lang/StringBuffer.<init>:()V
        //   104: aload           5
        //   106: ldc             "onCreateViewHolder getParent() != null crash hook, holder "
        //   108: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   111: pop            
        //   112: aload           5
        //   114: aload_0        
        //   115: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   118: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   121: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   124: pop            
        //   125: aload           5
        //   127: ldc             " parent "
        //   129: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   132: pop            
        //   133: aload           5
        //   135: aload_1        
        //   136: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   139: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   142: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   145: pop            
        //   146: aload           5
        //   148: ldc             " viewType "
        //   150: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   153: pop            
        //   154: aload           5
        //   156: iload_2        
        //   157: invokevirtual   java/lang/StringBuffer.append:(I)Ljava/lang/StringBuffer;
        //   160: pop            
        //   161: aload           5
        //   163: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   166: invokestatic    X/VYh.LIZ:(Ljava/lang/String;)V
        //   169: aload_0        
        //   170: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   173: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //   176: checkcast       Landroid/view/ViewGroup;
        //   179: astore_1       
        //   180: aload_1        
        //   181: ifnull          204
        //   184: aload_1        
        //   185: aload_0        
        //   186: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   189: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //   192: goto            204
        //   195: astore_1       
        //   196: aload_1        
        //   197: invokestatic    X/3Z3.LIZ:(Ljava/lang/Exception;)V
        //   200: aload_1        
        //   201: invokestatic    X/4ch.LIZ:(Ljava/lang/Exception;)V
        //   204: aload_0        
        //   205: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   208: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   211: putstatic       X/2ex.LIZ:Ljava/lang/String;
        //   214: sipush          4557
        //   217: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   220: aload_0        
        //   221: areturn        
        //   222: astore          5
        //   224: goto            90
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  64     74     195    204    Ljava/lang/Exception;
        //  76     87     222    227    Ljava/lang/Exception;
        //  94     180    195    204    Ljava/lang/Exception;
        //  184    192    195    204    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
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
    
    private void LIZ(final b b) {
        b.LIZIZ.setVisibility(0);
        b.LIZLLL.setEllipsize(TextUtils$TruncateAt.MARQUEE);
        b.LIZLLL.setSelected(true);
        b.LIZLLL.setTextColor(0cB.LIZIZ(2131100564));
    }
    
    private void LIZIZ(final b b) {
        b.LIZIZ.setVisibility(4);
        b.LIZLLL.setEllipsize((TextUtils$TruncateAt)null);
        b.LIZLLL.setSelected(false);
        b.LIZLLL.setTextColor(0cB.LIZIZ(2131100708));
    }
    
    public final void LIZ(final List<FilterModel> list) {
        this.LIZJ = (int)((44T)GST.LJIIZILJ).LIZ();
        0FM.LIZ((0FM.a)new 1Lu(super.LIZ, list), true).LIZ(this);
        super.LIZ.clear();
        super.LIZ.addAll(list);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(6306);
        }
        
        void LIZ(final int p0);
    }
    
    public static final class b extends ViewHolder
    {
        public final View LIZ;
        public View LIZIZ;
        public 1si LIZJ;
        public TextView LIZLLL;
        public ImageView LJ;
        public View LJFF;
        
        static {
            Covode.recordClassIndex(6307);
        }
        
        public b(final View view) {
            super(view);
            this.LIZIZ = view.findViewById(2131362875);
            this.LIZJ = (1si)view.findViewById(2131366790);
            this.LIZLLL = (TextView)view.findViewById(2131373343);
            this.LIZ = view.findViewById(2131367000);
            this.LJFF = view.findViewById(2131366651);
            this.LJ = (ImageView)view.findViewById(2131367036);
        }
        
        public final void LIZ() {
            this.LJFF.setVisibility(4);
        }
    }
}
