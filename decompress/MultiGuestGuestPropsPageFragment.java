// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment.effect;

import androidx.lifecycle.LiveData;
import X.1Zm;
import X.1Zl;
import X.1Zk;
import X.1Zj;
import X.1Zi;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import X.0Bf;
import X.0CH;
import X.1Zh;
import X.HP3;
import X.0gk;
import X.0vc;
import X.0II;
import X.CTM;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0de;
import X.1TV;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.Fragment;

public final class MultiGuestGuestPropsPageFragment extends Fragment
{
    public RecyclerView LIZ;
    public 1TV LIZIZ;
    public AbsMultiGuestEffectViewModel LIZJ;
    public 0de LIZLLL;
    public HashMap LJ;
    
    static {
        Covode.recordClassIndex(9692);
    }
    
    @Override
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131562246, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 1Zn implements a
        {
            public final /* synthetic */ MultiGuestGuestPropsPageFragment LIZ;
            
            static {
                Covode.recordClassIndex(9699);
            }
            
            public 1Zn(final MultiGuestGuestPropsPageFragment liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ() {
                final AbsMultiGuestEffectViewModel lizj = this.LIZ.LIZJ;
                if (lizj != null) {
                    final 0vc lizlll = lizj.LIZLLL();
                    if (lizlll != null) {
                        final AbsMultiGuestEffectViewModel lizlll2 = lizlll.LIZLLL;
                        if (lizlll2 != null) {
                            final HP3<Boolean> ljiiiizz = lizlll2.LJIIIIZZ();
                            if (ljiiiizz != null) {
                                ((LiveData<Boolean>)ljiiiizz).setValue(Boolean.valueOf(true));
                            }
                        }
                        lizlll.LIZ().LIZ(0vc.LJFF.LIZ(), (0gk.b)lizlll.LIZIZ);
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: invokespecial   androidx/fragment/app/Fragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    10: aload_1        
        //    11: ldc             2131369910
        //    13: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    16: checkcast       LX/0de;
        //    19: astore_2       
        //    20: aload_0        
        //    21: aload_2        
        //    22: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZLLL:LX/0de;
        //    25: aload_2        
        //    26: ifnull          35
        //    29: aload_2        
        //    30: ldc             "CONTENT"
        //    32: invokevirtual   X/0de.LIZ:(Ljava/lang/String;)V
        //    35: aload_0        
        //    36: aload_1        
        //    37: ldc             2131371760
        //    39: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    42: checkcast       Landroidx/recyclerview/widget/RecyclerView;
        //    45: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZ:Landroidx/recyclerview/widget/RecyclerView;
        //    48: aload_0        
        //    49: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZJ:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;
        //    52: astore_1       
        //    53: aload_1        
        //    54: ifnull          79
        //    57: aload_1        
        //    58: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJII:()LX/HPI;
        //    61: astore_1       
        //    62: aload_1        
        //    63: ifnull          79
        //    66: aload_1        
        //    67: aload_0        
        //    68: new             LX/1Zh;
        //    71: dup            
        //    72: aload_0        
        //    73: invokespecial   X/1Zh.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment;)V
        //    76: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //    79: aload_0        
        //    80: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZJ:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;
        //    83: astore_1       
        //    84: aload_1        
        //    85: ifnull          110
        //    88: aload_1        
        //    89: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJIIIIZZ:()LX/HP3;
        //    92: astore_1       
        //    93: aload_1        
        //    94: ifnull          110
        //    97: aload_1        
        //    98: aload_0        
        //    99: new             LX/1Zi;
        //   102: dup            
        //   103: aload_0        
        //   104: invokespecial   X/1Zi.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment;)V
        //   107: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   110: aload_0        
        //   111: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZJ:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;
        //   114: astore_1       
        //   115: aload_1        
        //   116: ifnull          141
        //   119: aload_1        
        //   120: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJIIIZ:()LX/HP3;
        //   123: astore_1       
        //   124: aload_1        
        //   125: ifnull          141
        //   128: aload_1        
        //   129: aload_0        
        //   130: new             LX/1Zj;
        //   133: dup            
        //   134: aload_0        
        //   135: invokespecial   X/1Zj.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment;)V
        //   138: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   141: aload_0        
        //   142: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZJ:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;
        //   145: astore_1       
        //   146: aload_1        
        //   147: ifnull          172
        //   150: aload_1        
        //   151: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJ:()LX/HP3;
        //   154: astore_1       
        //   155: aload_1        
        //   156: ifnull          172
        //   159: aload_1        
        //   160: aload_0        
        //   161: new             LX/1Zk;
        //   164: dup            
        //   165: aload_0        
        //   166: invokespecial   X/1Zk.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment;)V
        //   169: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   172: aload_0        
        //   173: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZJ:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;
        //   176: astore_1       
        //   177: aload_1        
        //   178: ifnull          203
        //   181: aload_1        
        //   182: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJFF:()LX/HP3;
        //   185: astore_1       
        //   186: aload_1        
        //   187: ifnull          203
        //   190: aload_1        
        //   191: aload_0        
        //   192: new             LX/1Zl;
        //   195: dup            
        //   196: aload_0        
        //   197: invokespecial   X/1Zl.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment;)V
        //   200: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   203: aload_0        
        //   204: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZJ:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;
        //   207: astore_1       
        //   208: aload_1        
        //   209: ifnull          234
        //   212: aload_1        
        //   213: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJI:()LX/HP3;
        //   216: astore_1       
        //   217: aload_1        
        //   218: ifnull          234
        //   221: aload_1        
        //   222: aload_0        
        //   223: new             LX/1Zm;
        //   226: dup            
        //   227: aload_0        
        //   228: invokespecial   X/1Zm.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment;)V
        //   231: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   234: aload_0        
        //   235: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZJ:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;
        //   238: astore_1       
        //   239: aload_1        
        //   240: ifnull          297
        //   243: aload_1        
        //   244: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LIZLLL:()LX/0vc;
        //   247: astore_1       
        //   248: aload_1        
        //   249: ifnull          297
        //   252: aload_1        
        //   253: getfield        X/0vc.LIZLLL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;
        //   256: astore_2       
        //   257: aload_2        
        //   258: ifnull          278
        //   261: aload_2        
        //   262: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJIIIIZZ:()LX/HP3;
        //   265: astore_2       
        //   266: aload_2        
        //   267: ifnull          278
        //   270: aload_2        
        //   271: iconst_1       
        //   272: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   275: invokevirtual   androidx/lifecycle/LiveData.setValue:(Ljava/lang/Object;)V
        //   278: aload_1        
        //   279: invokevirtual   X/0vc.LIZ:()LX/0gk;
        //   282: getstatic       X/0vc.LJFF:LX/0vb;
        //   285: invokevirtual   X/0vb.LIZ:()Ljava/lang/String;
        //   288: aload_1        
        //   289: getfield        X/0vc.LIZIZ:LX/1Zt;
        //   292: invokeinterface X/0gk.LIZ:(Ljava/lang/String;LX/0gj;)V
        //   297: aload_0        
        //   298: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment.LIZLLL:LX/0de;
        //   301: astore_1       
        //   302: aload_1        
        //   303: ifnull          318
        //   306: aload_1        
        //   307: new             LX/1Zn;
        //   310: dup            
        //   311: aload_0        
        //   312: invokespecial   X/1Zn.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/MultiGuestGuestPropsPageFragment;)V
        //   315: invokevirtual   X/0de.setErrorClickListener:(LX/0dd;)V
        //   318: return         
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
}
