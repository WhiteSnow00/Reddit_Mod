// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import java.util.List;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectSecondLevelPanelConfigSetting;
import android.widget.LinearLayout;
import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostAction;
import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import android.view.View;
import android.widget.FrameLayout;

public final class 0hj extends FrameLayout
{
    public View LIZ;
    public NaviAvatarListPresenter LIZIZ;
    public RecyclerView LIZJ;
    public final 5DO LIZLLL;
    public final 5DO LJ;
    
    static {
        Covode.recordClassIndex(6507);
    }
    
    public 0hj(final Context context) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aconst_null    
        //     7: iconst_0       
        //     8: invokespecial   android/widget/FrameLayout.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    11: sipush          1960
        //    14: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    17: aload_0        
        //    18: getstatic       X/1tX.LIZ:LX/1tX;
        //    21: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    24: putfield        X/0hj.LIZLLL:LX/5DO;
        //    27: aload_0        
        //    28: new             LX/1tW;
        //    31: dup            
        //    32: invokespecial   X/1tW.<init>:()V
        //    35: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    38: putfield        X/0hj.LJ:LX/5DO;
        //    41: aload_1        
        //    42: ldc             2131562266
        //    44: aload_0        
        //    45: invokestatic    android/widget/FrameLayout.inflate:(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
        //    48: pop            
        //    49: aload_0        
        //    50: invokespecial   X/0hj.LIZ:()V
        //    53: sipush          1960
        //    56: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    59: return         
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
    
    private void LIZ() {
        public final class 1tV extends F5g implements SRS<View, 2P9>
        {
            public final /* synthetic */ 0hj LIZ;
            
            static {
                Covode.recordClassIndex(6510);
            }
            
            public 1tV(final 0hj liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1tU extends F5g implements SRT<Integer, 1LC, 2P9>
        {
            public final /* synthetic */ 0hj LIZ;
            
            static {
                Covode.recordClassIndex(6509);
            }
            
            public 1tU(final 0hj liz) {
                this.LIZ = liz;
                super(2);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             2131370656
        //     3: invokevirtual   X/0hj.findViewById:(I)Landroid/view/View;
        //     6: astore_1       
        //     7: aload_1        
        //     8: ldc             ""
        //    10: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: aload_1        
        //    14: checkcast       Landroid/widget/LinearLayout;
        //    17: invokevirtual   android/widget/LinearLayout.getBackground:()Landroid/graphics/drawable/Drawable;
        //    20: astore_1       
        //    21: aload_1        
        //    22: ldc             ""
        //    24: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    27: aload_1        
        //    28: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting;
        //    31: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting.getValue:()LX/GOr;
        //    34: getfield        X/GOr.LIZ:F
        //    37: ldc             255.0
        //    39: fmul           
        //    40: f2i            
        //    41: invokevirtual   android/graphics/drawable/Drawable.setAlpha:(I)V
        //    44: aload_0        
        //    45: aload_0        
        //    46: ldc             2131369370
        //    48: invokevirtual   X/0hj.findViewById:(I)Landroid/view/View;
        //    51: putfield        X/0hj.LIZ:Landroid/view/View;
        //    54: aload_0        
        //    55: aload_0        
        //    56: ldc             2131370265
        //    58: invokevirtual   X/0hj.findViewById:(I)Landroid/view/View;
        //    61: checkcast       Landroidx/recyclerview/widget/RecyclerView;
        //    64: putfield        X/0hj.LIZJ:Landroidx/recyclerview/widget/RecyclerView;
        //    67: aload_0        
        //    68: getfield        X/0hj.LIZ:Landroid/view/View;
        //    71: astore_1       
        //    72: aload_1        
        //    73: ifnull          88
        //    76: aload_1        
        //    77: new             LX/1tV;
        //    80: dup            
        //    81: aload_0        
        //    82: invokespecial   X/1tV.<init>:(LX/0hj;)V
        //    85: invokestatic    X/GTi.LIZ:(Landroid/view/View;LX/SRS;)V
        //    88: aload_0        
        //    89: getfield        X/0hj.LIZJ:Landroidx/recyclerview/widget/RecyclerView;
        //    92: astore_2       
        //    93: aload_2        
        //    94: ifnull          143
        //    97: aload_2        
        //    98: new             LX/1LP;
        //   101: dup            
        //   102: invokespecial   X/1LP.<init>:()V
        //   105: invokevirtual   androidx/recyclerview/widget/RecyclerView.LIZ:(LX/0EJ;)V
        //   108: aload_2        
        //   109: aload_0        
        //   110: invokespecial   X/0hj.getLinearLayoutManager:()Landroidx/recyclerview/widget/LinearLayoutManager;
        //   113: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //   116: aload_0        
        //   117: invokespecial   X/0hj.getMAdapter:()LX/1LO;
        //   120: astore_1       
        //   121: aload_1        
        //   122: new             LX/1tU;
        //   125: dup            
        //   126: aload_0        
        //   127: invokespecial   X/1tU.<init>:(LX/0hj;)V
        //   130: putfield        X/1LO.LIZIZ:LX/SRT;
        //   133: aload_2        
        //   134: aload_1        
        //   135: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //   138: aload_2        
        //   139: iconst_1       
        //   140: invokevirtual   androidx/recyclerview/widget/RecyclerView.setHasFixedSize:(Z)V
        //   143: return         
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
    
    private final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager)this.LJ.getValue();
    }
    
    private final 1LO getMAdapter() {
        return (1LO)this.LIZLLL.getValue();
    }
    
    public final void setAvatarList(final List<1LC> liz) {
        if (liz != null) {
            final 1LO mAdapter = this.getMAdapter();
            CTM.LIZ((Object)liz);
            mAdapter.LIZ = liz;
            ((RecyclerView.a)mAdapter).notifyDataSetChanged();
        }
    }
    
    public final void setFragment(final Fragment fragment) {
        CTM.LIZ((Object)fragment);
    }
    
    public final void setLoadingIndex(final Integer lizlll) {
        final 1LO mAdapter = this.getMAdapter();
        final Integer lizlll2 = mAdapter.LIZLLL;
        final Integer value = -1;
        if (lizlll2 != null) {
            ((RecyclerView.a)mAdapter).notifyItemChanged(lizlll2.intValue(), value);
        }
        if ((mAdapter.LIZLLL = lizlll) != null) {
            ((RecyclerView.a)mAdapter).notifyItemChanged(lizlll.intValue(), value);
        }
    }
    
    public final void setPresenter(final NaviAvatarListPresenter liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
    }
    
    public final void setSelectedIndex(final Integer lizj) {
        if (lizj != null) {
            final int intValue = lizj.intValue();
            if (intValue < this.getLinearLayoutManager().LJIIJ() || intValue > this.getLinearLayoutManager().LJIIL()) {
                final RecyclerView lizj2 = this.LIZJ;
                if (lizj2 != null) {
                    lizj2.LIZJ(lizj);
                }
            }
        }
        final 1LO mAdapter = this.getMAdapter();
        final Integer lizj3 = mAdapter.LIZJ;
        if (lizj3 != null) {
            ((RecyclerView.a)mAdapter).notifyItemChanged(lizj3.intValue(), -1);
        }
        if ((mAdapter.LIZJ = lizj) != null) {
            ((RecyclerView.a)mAdapter).notifyItemChanged(lizj.intValue(), -1);
        }
    }
    
    public static final class a extends h
    {
        static {
            Covode.recordClassIndex(6508);
        }
        
        @Override
        public final void LIZ(final Rect rect, final View view, final RecyclerView recyclerView, final t t) {
            CTM.LIZ((Object)rect, (Object)view, (Object)recyclerView, (Object)t);
            boolean b;
            if (((View)recyclerView).getLayoutDirection() == 1) {
                b = true;
            }
            else {
                b = false;
            }
            final int lizlll = recyclerView.LIZLLL(view);
            if (lizlll == 0) {
                if (b) {
                    rect.right = 0cB.LIZLLL(2131166119);
                }
                else {
                    rect.left = 0cB.LIZLLL(2131166119);
                }
            }
            else if (b) {
                rect.right = 0cB.LIZLLL(2131166118);
            }
            else {
                rect.left = 0cB.LIZLLL(2131166118);
            }
            final i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null && lizlll == layoutManager.LJJIII() - 1) {
                if (b) {
                    rect.left = 0cB.LIZLLL(2131166119);
                    return;
                }
                rect.right = 0cB.LIZLLL(2131166119);
            }
        }
    }
}
