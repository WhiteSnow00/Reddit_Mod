// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.filter;

import X.2d6;
import X.1Jq;
import X.F9A;
import X.0CH;
import X.1Jp;
import X.0hN;
import X.FGP;
import X.0h1;
import X.I4V;
import X.1Jo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import X.H2n;
import kotlin.jvm.internal.n;
import X.1KJ;
import X.2C8;
import androidx.fragment.app.Fragment;
import X.HAM;
import java.util.Collection;
import X.2P9;
import X.SRS;
import X.F5g;
import X.0II;
import X.CTM;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1ip;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.effect.model.FilterModel;
import java.util.List;
import com.bytedance.android.livesdk.ui.BaseFragment;

public final class LiveFilterFragment extends BaseFragment
{
    public final List<FilterModel> LIZ;
    public DataChannel LIZIZ;
    public 1ip LIZJ;
    public HashMap LIZLLL;
    
    static {
        Covode.recordClassIndex(6295);
    }
    
    public LiveFilterFragment() {
        this.LIZ = new ArrayList<FilterModel>();
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131561978, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View viewById, final Bundle bundle) {
        public final class 1t5 extends F5g implements SRS<List<? extends FilterModel>, 2P9>
        {
            public final /* synthetic */ LiveFilterFragment LIZ;
            
            static {
                Covode.recordClassIndex(6300);
            }
            
            public 1t5(final LiveFilterFragment liz) {
                this.LIZ = liz;
                super(1);
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
        //     7: invokespecial   com/bytedance/android/livesdk/ui/BaseFragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    10: aload_0        
        //    11: invokestatic    X/HAM.LIZ:(Landroidx/fragment/app/Fragment;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    14: astore_2       
        //    15: aload_0        
        //    16: aload_2        
        //    17: putfield        com/bytedance/android/live/effect/filter/LiveFilterFragment.LIZIZ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    20: aload_0        
        //    21: getfield        com/bytedance/android/live/effect/filter/LiveFilterFragment.LIZ:Ljava/util/List;
        //    24: astore_3       
        //    25: aload_2        
        //    26: ifnull          48
        //    29: aload_2        
        //    30: ldc             LX/2C8;.class
        //    32: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    35: checkcast       Ljava/util/List;
        //    38: astore          4
        //    40: aload           4
        //    42: astore_2       
        //    43: aload           4
        //    45: ifnonnull       61
        //    48: getstatic       X/0hE.LIZ:LX/1KJ;
        //    51: getfield        X/1KJ.LIZ:Ljava/util/List;
        //    54: astore_2       
        //    55: aload_2        
        //    56: ldc             ""
        //    58: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    61: aload_3        
        //    62: aload_2        
        //    63: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    68: pop            
        //    69: aload_1        
        //    70: ldc             2131370172
        //    72: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    75: astore_1       
        //    76: aload_1        
        //    77: ldc             ""
        //    79: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    82: aload_1        
        //    83: checkcast       LX/H2n;
        //    86: astore_2       
        //    87: aload_0        
        //    88: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //    91: pop            
        //    92: aload_2        
        //    93: new             Landroidx/recyclerview/widget/LinearLayoutManager;
        //    96: dup            
        //    97: iconst_0       
        //    98: iconst_0       
        //    99: invokespecial   androidx/recyclerview/widget/LinearLayoutManager.<init>:(IZ)V
        //   102: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //   105: new             LX/1ip;
        //   108: dup            
        //   109: aload_0        
        //   110: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   113: new             LX/1Jo;
        //   116: dup            
        //   117: aload_0        
        //   118: invokespecial   X/1Jo.<init>:(Lcom/bytedance/android/live/effect/filter/LiveFilterFragment;)V
        //   121: invokespecial   X/1ip.<init>:(Landroid/content/Context;LX/0h2;)V
        //   124: astore_1       
        //   125: aload_0        
        //   126: aload_1        
        //   127: putfield        com/bytedance/android/live/effect/filter/LiveFilterFragment.LIZJ:LX/1ip;
        //   130: aload_1        
        //   131: aload_0        
        //   132: getfield        com/bytedance/android/live/effect/filter/LiveFilterFragment.LIZ:Ljava/util/List;
        //   135: invokevirtual   X/1ip.LIZ:(Ljava/util/List;)V
        //   138: getstatic       X/I4V.LJ:LX/I4V;
        //   141: aload_2        
        //   142: invokevirtual   X/I4V.LIZJ:(Landroidx/recyclerview/widget/RecyclerView;)V
        //   145: aload_2        
        //   146: aload_0        
        //   147: getfield        com/bytedance/android/live/effect/filter/LiveFilterFragment.LIZJ:LX/1ip;
        //   150: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //   153: aload_2        
        //   154: new             LX/0h1;
        //   157: dup            
        //   158: aload_0        
        //   159: aload_2        
        //   160: invokespecial   X/0h1.<init>:(Lcom/bytedance/android/live/effect/filter/LiveFilterFragment;LX/H2n;)V
        //   163: invokevirtual   X/H2n.post:(Ljava/lang/Runnable;)Z
        //   166: pop            
        //   167: invokestatic    X/FGP.LIZ:()LX/FGP;
        //   170: aload_0        
        //   171: ldc             LX/0hN;.class
        //   173: getstatic       X/1Jp.LIZ:LX/1Jp;
        //   176: invokevirtual   X/FGP.LIZ:(LX/0CH;Ljava/lang/Class;LX/F9A;)LX/FIc;
        //   179: new             LX/1Jq;
        //   182: dup            
        //   183: aload_0        
        //   184: aload_2        
        //   185: invokespecial   X/1Jq.<init>:(Lcom/bytedance/android/live/effect/filter/LiveFilterFragment;LX/H2n;)V
        //   188: invokeinterface X/FIc.LIZ:(LX/2d6;)LX/2fc;
        //   193: pop            
        //   194: aload_0        
        //   195: getfield        com/bytedance/android/live/effect/filter/LiveFilterFragment.LIZIZ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   198: astore_1       
        //   199: aload_1        
        //   200: ifnull          219
        //   203: aload_1        
        //   204: aload_0        
        //   205: ldc             LX/2C8;.class
        //   207: new             LX/1t5;
        //   210: dup            
        //   211: aload_0        
        //   212: invokespecial   X/1t5.<init>:(Lcom/bytedance/android/live/effect/filter/LiveFilterFragment;)V
        //   215: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   218: pop            
        //   219: return         
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
