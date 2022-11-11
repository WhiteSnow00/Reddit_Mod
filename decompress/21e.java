// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.n;
import android.view.View$OnClickListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multiguestv3.dialog.MultiGuestV3GuestBeInvitedDialog;
import android.view.View;

public final class 21e extends F5g implements SRU<Integer, View, QgG<? extends 2P9>, 2P9>
{
    public final /* synthetic */ MultiGuestV3GuestBeInvitedDialog LIZ;
    
    static {
        Covode.recordClassIndex(8776);
    }
    
    public 21e(final MultiGuestV3GuestBeInvitedDialog liz) {
        this.LIZ = liz;
        super(3);
    }
    
    public final void LIZ(final int n, final View view, final QgG<2P9> qgG) {
        public final class 0s4 implements View$OnClickListener
        {
            public final /* synthetic */ 21e LIZ;
            public final /* synthetic */ 0r0 LIZIZ;
            public final /* synthetic */ 0r0.a LIZJ;
            public final /* synthetic */ int LIZLLL;
            public final /* synthetic */ QgG LJ;
            
            static {
                Covode.recordClassIndex(8777);
            }
            
            public 0s4(final 21e liz, final 0r0 liziz, final 0r0.a lizj, final int lizlll, final QgG lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
            }
            
            public final void onClick(final View view) {
                if (this.LIZIZ.LIZ(this.LIZJ)) {
                    return;
                }
                ((0bf)Fjw.LIZIZ()).LIZIZ("invite_issue_check", "replyAnchorWithAgree");
                this.LIZ.LIZ.LIZIZ(this.LIZLLL);
                final QgG lj = this.LJ;
                if (lj != null) {
                    lj.invoke();
                }
            }
        }
        public final class 21d extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 21e LIZ;
            
            static {
                Covode.recordClassIndex(8779);
            }
            
            public 21d(final 21e liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 21c extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ 21e LIZ;
            public final /* synthetic */ int LIZIZ;
            
            static {
                Covode.recordClassIndex(8778);
            }
            
            public 21c(final 21e liz, final int liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: new             LX/1U9;
        //     7: dup            
        //     8: invokespecial   X/1U9.<init>:()V
        //    11: astore          4
        //    13: aload_0        
        //    14: getfield        X/21e.LIZ:Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog;
        //    17: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //    20: astore          5
        //    22: aload           5
        //    24: ifnonnull       30
        //    27: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //    30: aload_2        
        //    31: new             LX/0s4;
        //    34: dup            
        //    35: aload_0        
        //    36: aload           4
        //    38: new             LX/0qz;
        //    41: dup            
        //    42: aload           5
        //    44: aload_0        
        //    45: getfield        X/21e.LIZ:Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestV3GuestBeInvitedDialog;
        //    48: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    51: new             LX/21c;
        //    54: dup            
        //    55: aload_0        
        //    56: iload_1        
        //    57: invokespecial   X/21c.<init>:(LX/21e;I)V
        //    60: new             LX/21d;
        //    63: dup            
        //    64: aload_0        
        //    65: invokespecial   X/21d.<init>:(LX/21e;)V
        //    68: iload_1        
        //    69: iconst_0       
        //    70: bipush          32
        //    72: invokespecial   X/0qz.<init>:(Landroid/content/Context;Lcom/bytedance/ies/sdk/datachannel/DataChannel;LX/SRS;LX/QgG;III)V
        //    75: iload_1        
        //    76: aload_3        
        //    77: invokespecial   X/0s4.<init>:(LX/21e;LX/0r0;LX/0qz;ILX/QgG;)V
        //    80: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    83: return         
        //    Signature:
        //  (ILandroid/view/View;LX/QgG<LX/2P9;>;)V
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
}
