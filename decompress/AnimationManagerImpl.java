// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.mask.animation;

import X.0sM;
import X.0CC;
import X.0Bg;
import X.0jz;
import X.0sp;
import X.0ba;
import X.0sH;
import android.text.TextUtils;
import android.animation.Animator;
import android.view.View;
import X.1XN;
import X.GlD;
import X.0CG;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0CH;
import X.1Wt;
import X.2P9;
import X.1Wu;
import X.1Wh;
import X.VzU;
import X.SRT;
import X.5DO;
import android.view.ViewGroup;
import X.6mZ;
import X.1XM;
import X.0so;

public final class AnimationManagerImpl implements 0so, 1XM, 6mZ
{
    public ViewGroup LIZ;
    public final 5DO LIZIZ;
    public final 5DO LIZJ;
    public final 5DO LIZLLL;
    public final 5DO LJ;
    public final SRT<VzU, 1Wh<1Wu>, 2P9> LJFF;
    public final SRT<VzU, 1Wh<1Wt>, 2P9> LJI;
    public final 5DO LJII;
    public boolean LJIIIIZZ;
    public final 0CH LJIIIZ;
    
    static {
        Covode.recordClassIndex(9007);
    }
    
    public AnimationManagerImpl(final ViewGroup liz, final 0CH ljiiiz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LIZ:Landroid/view/ViewGroup;
        //    13: aload_0        
        //    14: aload_2        
        //    15: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJIIIZ:LX/0CH;
        //    18: aload_2        
        //    19: invokeinterface X/0CH.getLifecycle:()LX/0CC;
        //    24: aload_0        
        //    25: invokevirtual   X/0CC.LIZ:(LX/0CG;)V
        //    28: aload_0        
        //    29: new             LX/22P;
        //    32: dup            
        //    33: aload_0        
        //    34: invokespecial   X/22P.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl;)V
        //    37: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    40: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LIZIZ:LX/5DO;
        //    43: aload_0        
        //    44: new             LX/22O;
        //    47: dup            
        //    48: aload_0        
        //    49: invokespecial   X/22O.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl;)V
        //    52: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    55: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LIZJ:LX/5DO;
        //    58: aload_0        
        //    59: new             LX/22T;
        //    62: dup            
        //    63: aload_0        
        //    64: invokespecial   X/22T.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl;)V
        //    67: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    70: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LIZLLL:LX/5DO;
        //    73: aload_0        
        //    74: new             LX/22Q;
        //    77: dup            
        //    78: aload_0        
        //    79: invokespecial   X/22Q.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl;)V
        //    82: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    85: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJ:LX/5DO;
        //    88: aload_0        
        //    89: new             LX/22S;
        //    92: dup            
        //    93: aload_0        
        //    94: invokespecial   X/22S.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl;)V
        //    97: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJFF:LX/SRT;
        //   100: aload_0        
        //   101: new             LX/22R;
        //   104: dup            
        //   105: aload_0        
        //   106: invokespecial   X/22R.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl;)V
        //   109: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJI:LX/SRT;
        //   112: aload_0        
        //   113: getstatic       X/22N.LIZ:LX/22N;
        //   116: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   119: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJII:LX/5DO;
        //   122: aload_0        
        //   123: iconst_1       
        //   124: putfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJIIIIZZ:Z
        //   127: return         
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
    
    private final void LIZ(final 0so 0so, final 0so 0so2) {
        final View liz = this.LIZ();
        if (liz != null) {
            GlD.LIZJ(liz);
        }
        if (this.LJIIIIZZ) {
            this.LJ().setDuration(800L);
            this.LJFF().setDuration(600L);
        }
        else {
            this.LJ().setDuration(400L);
            this.LJFF().setDuration(300L);
        }
        final 1XN 1xn = new 1XN(this.LJ(), "AnimationManager_FadeOut");
        final 1XN 1xn2 = new 1XN(this.LJFF(), "AnimationManager_FadeIn", 100L);
        this.LIZJ().LIZ(1xn, 0so);
        this.LIZJ().LIZ(1xn2, 0so2);
    }
    
    private final Animator LJ() {
        return (Animator)this.LIZIZ.getValue();
    }
    
    private final Animator LJFF() {
        return (Animator)this.LIZJ.getValue();
    }
    
    public final View LIZ() {
        return (View)this.LIZLLL.getValue();
    }
    
    @Override
    public final void LIZ(final 1XN 1xn) {
        CTM.LIZ((Object)1xn);
        final StringBuilder sb = new StringBuilder("after ");
        sb.append(1xn.LIZIZ);
        this.LIZ(sb.toString());
        if (TextUtils.equals((CharSequence)1xn.LIZIZ, (CharSequence)"AnimationManager_FadeOut")) {
            final View liz = this.LIZ();
            if (liz != null) {
                GlD.LIZ(liz);
            }
        }
    }
    
    @Override
    public final void LIZ(final 1XN 1xn, final int n) {
        CTM.LIZ((Object)1xn);
        final StringBuilder sb = new StringBuilder("reject ");
        sb.append(1xn.LIZIZ);
        sb.append(' ');
        sb.append(n);
        this.LIZ(sb.toString());
    }
    
    public final void LIZ(final String s) {
        if (0sH.LIZ.LIZ()) {
            0ba.LIZ(4, "AnimationManager", s);
        }
    }
    
    @Override
    public final void LIZ(final boolean ljiiiizz) {
        this.LJIIIIZZ = ljiiiizz;
    }
    
    public final View LIZIZ() {
        return (View)this.LJ.getValue();
    }
    
    public final 0sp LIZJ() {
        return (0sp)this.LJII.getValue();
    }
    
    public final void LIZLLL() {
        this.LIZ(this, this);
    }
    
    @0Bg(LIZ = 0CC.a.ON_CREATE)
    public final void onCreate() {
        0jz.LIZJ().subscribe(1Wu.class, this.LJFF).subscribe(1Wt.class, this.LJI);
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    public final void onDestroy() {
        public final class 1XL implements 0so
        {
            public final /* synthetic */ AnimationManagerImpl LIZ;
            
            static {
                Covode.recordClassIndex(9012);
            }
            
            public 1XL(final AnimationManagerImpl liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(final 1XN 1xn) {
                CTM.LIZ((Object)1xn);
                this.LIZ.LIZ(1xn);
                final View liz = this.LIZ.LIZ();
                if (liz != null) {
                    0sM.LIZ(liz);
                }
                final View liziz = this.LIZ.LIZIZ();
                if (liziz != null) {
                    0sM.LIZ(liziz);
                }
                this.LIZ.LIZJ().LIZ();
            }
            
            @Override
            public final void LIZ(final 1XN 1xn, final int n) {
                CTM.LIZ((Object)1xn);
                this.LIZ.LIZ(1xn, n);
                final View liz = this.LIZ.LIZ();
                if (liz != null) {
                    0sM.LIZ(liz);
                }
                final View liziz = this.LIZ.LIZIZ();
                if (liziz != null) {
                    0sM.LIZ(liziz);
                }
                this.LIZ.LIZJ().LIZ();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc             LX/1Wu;.class
        //     5: aload_0        
        //     6: getfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJFF:LX/SRT;
        //     9: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.unsubscribe:(Ljava/lang/Class;LX/SRT;)Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //    14: ldc             LX/1Wt;.class
        //    16: aload_0        
        //    17: getfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJI:LX/SRT;
        //    20: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.unsubscribe:(Ljava/lang/Class;LX/SRT;)Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //    25: pop            
        //    26: aload_0        
        //    27: aload_0        
        //    28: new             LX/1XL;
        //    31: dup            
        //    32: aload_0        
        //    33: invokespecial   X/1XL.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl;)V
        //    36: invokespecial   com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LIZ:(LX/0so;LX/0so;)V
        //    39: aload_0        
        //    40: getfield        com/bytedance/android/live/liveinteract/multiguestv3/mask/animation/AnimationManagerImpl.LJIIIZ:LX/0CH;
        //    43: invokeinterface X/0CH.getLifecycle:()LX/0CC;
        //    48: aload_0        
        //    49: invokevirtual   X/0CC.LIZIZ:(LX/0CG;)V
        //    52: return         
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
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_CREATE) {
            this.onCreate();
            return;
        }
        if (a == 0CC.a.ON_DESTROY) {
            this.onDestroy();
        }
    }
}
