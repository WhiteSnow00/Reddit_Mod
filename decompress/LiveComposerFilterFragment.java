// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.filter.composerfilter;

import X.44T;
import X.1KD;
import X.2CA;
import androidx.fragment.app.Fragment;
import X.HAM;
import java.util.Iterator;
import java.util.Collection;
import X.2P9;
import X.1Km;
import X.SRS;
import X.F5g;
import X.0II;
import X.CTM;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import X.44V;
import X.GST;
import kotlin.jvm.internal.n;
import X.0gZ;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import X.1iq;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;

public final class LiveComposerFilterFragment extends BaseFragment
{
    public DataChannel LIZ;
    public 1iq LIZIZ;
    public final List<LiveEffect> LIZJ;
    public final String LIZLLL;
    public Integer LJ;
    public HashMap LJFF;
    
    static {
        Covode.recordClassIndex(6308);
    }
    
    public LiveComposerFilterFragment() {
        this.LIZJ = new ArrayList<LiveEffect>();
        final String liz = 0gZ.LIZ();
        n.LIZIZ((Object)liz, "");
        this.LIZLLL = liz;
        final 44V ljiizilj = GST.LJIIZILJ;
        n.LIZIZ((Object)ljiizilj, "");
        this.LJ = (Integer)((44T)ljiizilj).LIZ();
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131561978, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View viewById, final Bundle bundle) {
        public final class 1t6 extends F5g implements SRS<List<? extends 1Km<LiveEffect>>, 2P9>
        {
            public final /* synthetic */ LiveComposerFilterFragment LIZ;
            
            static {
                Covode.recordClassIndex(6313);
            }
            
            public 1t6(final LiveComposerFilterFragment liz) {
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
        //    17: putfield        com/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment.LIZ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    20: aload_2        
        //    21: ifnull          98
        //    24: aload_2        
        //    25: ldc             LX/2CA;.class
        //    27: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    30: checkcast       Ljava/util/List;
        //    33: astore_2       
        //    34: aload_2        
        //    35: ifnull          98
        //    38: aload_2        
        //    39: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    44: astore_3       
        //    45: aload_3        
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            282
        //    54: aload_3        
        //    55: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    60: astore_2       
        //    61: aload_2        
        //    62: checkcast       LX/1Km;
        //    65: getfield        X/1Km.LIZJ:Ljava/lang/String;
        //    68: aload_0        
        //    69: getfield        com/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment.LIZLLL:Ljava/lang/String;
        //    72: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    75: ifeq            45
        //    78: aload_2        
        //    79: checkcast       LX/1Km;
        //    82: astore_2       
        //    83: aload_2        
        //    84: ifnull          98
        //    87: aload_2        
        //    88: getfield        X/1Km.LIZIZ:Ljava/util/List;
        //    91: astore_3       
        //    92: aload_3        
        //    93: astore_2       
        //    94: aload_3        
        //    95: ifnonnull       108
        //    98: getstatic       X/1KD.LJFF:LX/0hB;
        //   101: invokevirtual   X/0hB.LIZ:()LX/1KD;
        //   104: getfield        X/1KD.LIZ:Ljava/util/List;
        //   107: astore_2       
        //   108: aload_0        
        //   109: getfield        com/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment.LIZJ:Ljava/util/List;
        //   112: aload_2        
        //   113: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   118: pop            
        //   119: aload_0        
        //   120: getfield        com/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment.LIZ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   123: astore_2       
        //   124: aload_2        
        //   125: ifnull          144
        //   128: aload_2        
        //   129: aload_0        
        //   130: ldc             LX/2CA;.class
        //   132: new             LX/1t6;
        //   135: dup            
        //   136: aload_0        
        //   137: invokespecial   X/1t6.<init>:(Lcom/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment;)V
        //   140: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   143: pop            
        //   144: aload_1        
        //   145: ldc             2131370172
        //   147: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   150: astore_1       
        //   151: aload_1        
        //   152: ldc             ""
        //   154: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   157: aload_1        
        //   158: checkcast       LX/H2n;
        //   161: astore_1       
        //   162: aload_0        
        //   163: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   166: pop            
        //   167: aload_1        
        //   168: new             Landroidx/recyclerview/widget/LinearLayoutManager;
        //   171: dup            
        //   172: iconst_0       
        //   173: iconst_0       
        //   174: invokespecial   androidx/recyclerview/widget/LinearLayoutManager.<init>:(IZ)V
        //   177: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //   180: aload_0        
        //   181: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   184: astore_2       
        //   185: aload_2        
        //   186: ifnull          225
        //   189: aload_2        
        //   190: ldc             ""
        //   192: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   195: new             LX/1iq;
        //   198: dup            
        //   199: aload_2        
        //   200: new             LX/1Jv;
        //   203: dup            
        //   204: aload_0        
        //   205: invokespecial   X/1Jv.<init>:(Lcom/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment;)V
        //   208: invokespecial   X/1iq.<init>:(Landroid/content/Context;LX/0h8;)V
        //   211: astore_2       
        //   212: aload_2        
        //   213: aload_0        
        //   214: getfield        com/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment.LIZJ:Ljava/util/List;
        //   217: invokevirtual   X/1iq.LIZ:(Ljava/util/List;)V
        //   220: aload_0        
        //   221: aload_2        
        //   222: putfield        com/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment.LIZIZ:LX/1iq;
        //   225: getstatic       X/I4V.LJ:LX/I4V;
        //   228: aload_1        
        //   229: invokevirtual   X/I4V.LIZJ:(Landroidx/recyclerview/widget/RecyclerView;)V
        //   232: aload_1        
        //   233: aload_0        
        //   234: getfield        com/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment.LIZIZ:LX/1iq;
        //   237: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //   240: aload_1        
        //   241: new             LX/0h3;
        //   244: dup            
        //   245: aload_0        
        //   246: aload_1        
        //   247: invokespecial   X/0h3.<init>:(Lcom/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment;LX/H2n;)V
        //   250: invokevirtual   X/H2n.post:(Ljava/lang/Runnable;)Z
        //   253: pop            
        //   254: invokestatic    X/FGP.LIZ:()LX/FGP;
        //   257: aload_0        
        //   258: ldc             LX/0hN;.class
        //   260: getstatic       X/1Jw.LIZ:LX/1Jw;
        //   263: invokevirtual   X/FGP.LIZ:(LX/0CH;Ljava/lang/Class;LX/F9A;)LX/FIc;
        //   266: new             LX/1Jx;
        //   269: dup            
        //   270: aload_0        
        //   271: aload_1        
        //   272: invokespecial   X/1Jx.<init>:(Lcom/bytedance/android/live/effect/filter/composerfilter/LiveComposerFilterFragment;LX/H2n;)V
        //   275: invokeinterface X/FIc.LIZ:(LX/2d6;)LX/2fc;
        //   280: pop            
        //   281: return         
        //   282: aconst_null    
        //   283: astore_2       
        //   284: goto            78
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
