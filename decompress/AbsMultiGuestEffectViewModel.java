// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment.effect;

import java.util.List;
import X.HPI;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import X.HP3;
import X.0vc;
import X.1JQ;
import X.0g8;
import X.CTM;
import X.0CH;
import com.bytedance.covode.number.Covode;
import X.0Wg;
import X.5DO;
import com.bytedance.android.live.liveinteract.api.viewmodel.ViewModelExt;

public abstract class AbsMultiGuestEffectViewModel extends ViewModelExt
{
    public final 5DO LIZ;
    public MultiGuestEffectSwitchFragment.b LIZIZ;
    public boolean LIZJ;
    public final 0Wg LIZLLL;
    public final 5DO LJ;
    public final 5DO LJFF;
    public final 5DO LJI;
    public final 5DO LJII;
    public final 5DO LJIIIIZZ;
    public final 5DO LJIIIZ;
    public final 5DO LJIIJ;
    
    static {
        Covode.recordClassIndex(9670);
    }
    
    public AbsMultiGuestEffectViewModel(final 0CH 0ch, final 0Wg lizlll) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   com/bytedance/android/live/liveinteract/api/viewmodel/ViewModelExt.<init>:()V
        //     8: aload_0        
        //     9: aload_2        
        //    10: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LIZLLL:LX/0Wg;
        //    13: aload_0        
        //    14: new             LX/26h;
        //    17: dup            
        //    18: aload_0        
        //    19: invokespecial   X/26h.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel;)V
        //    22: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    25: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJ:LX/5DO;
        //    28: aload_0        
        //    29: aload_0        
        //    30: invokestatic    X/0kg.LIZ:(Lcom/bytedance/android/live/liveinteract/api/viewmodel/ViewModelExt;)LX/5DO;
        //    33: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJFF:LX/5DO;
        //    36: aload_0        
        //    37: aload_0        
        //    38: invokestatic    X/0kg.LIZ:(Lcom/bytedance/android/live/liveinteract/api/viewmodel/ViewModelExt;)LX/5DO;
        //    41: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJI:LX/5DO;
        //    44: aload_0        
        //    45: aload_0        
        //    46: invokestatic    X/0kg.LIZ:(Lcom/bytedance/android/live/liveinteract/api/viewmodel/ViewModelExt;)LX/5DO;
        //    49: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJII:LX/5DO;
        //    52: aload_0        
        //    53: aload_0        
        //    54: invokestatic    X/0kg.LIZ:(Lcom/bytedance/android/live/liveinteract/api/viewmodel/ViewModelExt;)LX/5DO;
        //    57: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LIZ:LX/5DO;
        //    60: aload_0        
        //    61: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    64: aload_0        
        //    65: new             LX/HPI;
        //    68: dup            
        //    69: invokespecial   X/HPI.<init>:()V
        //    72: invokestatic    X/3Oy.LIZ:(Ljava/lang/Object;)LX/5DO;
        //    75: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJIIIIZZ:LX/5DO;
        //    78: aload_0        
        //    79: aload_0        
        //    80: invokestatic    X/0kg.LIZ:(Lcom/bytedance/android/live/liveinteract/api/viewmodel/ViewModelExt;)LX/5DO;
        //    83: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJIIIZ:LX/5DO;
        //    86: aload_0        
        //    87: aload_0        
        //    88: invokestatic    X/0kg.LIZ:(Lcom/bytedance/android/live/liveinteract/api/viewmodel/ViewModelExt;)LX/5DO;
        //    91: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/effect/AbsMultiGuestEffectViewModel.LJIIJ:LX/5DO;
        //    94: return         
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
    
    public final 0g8 LIZIZ() {
        final 0Wg lizlll = this.LIZLLL;
        final 0g8 0g8 = null;
        Object attachedComposerManager;
        if (lizlll != null) {
            attachedComposerManager = lizlll.getAttachedComposerManager();
        }
        else {
            attachedComposerManager = null;
        }
        if (!(attachedComposerManager instanceof 0g8)) {
            attachedComposerManager = 0g8;
        }
        return (0g8)attachedComposerManager;
    }
    
    public final 1JQ LIZJ() {
        final 0Wg lizlll = this.LIZLLL;
        final 1JQ 1jq = null;
        Object attachedComposerManager;
        if (lizlll != null) {
            attachedComposerManager = lizlll.getAttachedComposerManager();
        }
        else {
            attachedComposerManager = null;
        }
        if (!(attachedComposerManager instanceof 1JQ)) {
            attachedComposerManager = 1jq;
        }
        return (1JQ)attachedComposerManager;
    }
    
    public final 0vc LIZLLL() {
        return (0vc)this.LJ.getValue();
    }
    
    public final HP3<LiveEffect> LJ() {
        return (HP3<LiveEffect>)this.LJFF.getValue();
    }
    
    public final HP3<LiveEffect> LJFF() {
        return (HP3<LiveEffect>)this.LJI.getValue();
    }
    
    public final HP3<LiveEffect> LJI() {
        return (HP3<LiveEffect>)this.LJII.getValue();
    }
    
    public final HPI<List<LiveEffect>> LJII() {
        return (HPI<List<LiveEffect>>)this.LJIIIIZZ.getValue();
    }
    
    public final HP3<Boolean> LJIIIIZZ() {
        return (HP3<Boolean>)this.LJIIIZ.getValue();
    }
    
    public final HP3<Boolean> LJIIIZ() {
        return (HP3<Boolean>)this.LJIIJ.getValue();
    }
}
