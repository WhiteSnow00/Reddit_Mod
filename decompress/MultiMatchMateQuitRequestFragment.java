// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multimatch.business.dialog;

import com.bytedance.android.live.base.model.ImageModel;
import X.0pe;
import X.0pc;
import X.1ci;
import X.0nC;
import X.0n9;
import X.0W3;
import android.widget.ImageView;
import X.0cm;
import X.0II;
import X.CTM;
import X.1mg;
import android.view.View$OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import X.0l6;
import X.0cB;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1ib;
import X.1si;
import X.1so;
import X.1J6;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract;

public final class MultiMatchMateQuitRequestFragment extends AbsView
{
    public 1J6 LIZ;
    public 1so LJ;
    public 1si LJFF;
    public 1ib LJI;
    public 1ib LJII;
    public 1so LJIIIIZZ;
    public HashMap LJIIIZ;
    
    static {
        Covode.recordClassIndex(10029);
    }
    
    @Override
    public final void LIZ() {
        final d liziz = super.LIZIZ;
        if (liziz != null) {
            liziz.dismiss();
        }
    }
    
    @Override
    public final void LIZ(final long n) {
        final 1so ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.setText(0cB.LIZ(2131829223, n));
        }
    }
    
    @Override
    public final boolean LIZIZ() {
        final 1J6 liz = this.LIZ;
        return liz != null && liz.isChecked();
    }
    
    @Override
    public final void LIZJ() {
        final HashMap ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            ljiiiz.clear();
        }
    }
    
    @Override
    public final 0l6.a LJ() {
        final 0l6.a a = new 0l6.a();
        a.LJI = false;
        a.LJIIIZ = false;
        return a;
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        public final class 0wJ implements View$OnClickListener
        {
            public final /* synthetic */ MultiMatchMateQuitRequestFragment LIZ;
            
            static {
                Covode.recordClassIndex(10032);
            }
            
            public 0wJ(final MultiMatchMateQuitRequestFragment liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                1mg.LJIILJJIL.LIZ(1);
                final MultiMatchMateQuitRequestContract.a a = (MultiMatchMateQuitRequestContract.a)this.LIZ.LIZJ;
                if (a != null) {
                    a.LIZJ();
                }
                final d liziz = this.LIZ.LIZIZ;
                if (liziz != null) {
                    liziz.dismiss();
                }
            }
        }
        public final class 0wI implements View$OnClickListener
        {
            public final /* synthetic */ MultiMatchMateQuitRequestFragment LIZ;
            
            static {
                Covode.recordClassIndex(10031);
            }
            
            public 0wI(final MultiMatchMateQuitRequestFragment liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final 1J6 liz = this.LIZ.LIZ;
                boolean b = true;
                if (liz == null || !liz.isChecked()) {
                    b = false;
                }
                final 1mg ljiiljjil = 1mg.LJIILJJIL;
                int n;
                if (b) {
                    n = 3;
                }
                else {
                    n = 2;
                }
                ljiiljjil.LIZ(n);
                final MultiMatchMateQuitRequestContract.a a = (MultiMatchMateQuitRequestContract.a)this.LIZ.LIZJ;
                if (a != null) {
                    a.LIZ(b);
                }
                final d liziz = this.LIZ.LIZIZ;
                if (liziz != null) {
                    liziz.dismiss();
                }
            }
        }
        public final class 0wH implements CompoundButton$OnCheckedChangeListener
        {
            public final /* synthetic */ MultiMatchMateQuitRequestFragment LIZ;
            
            static {
                Covode.recordClassIndex(10030);
            }
            
            public 0wH(final MultiMatchMateQuitRequestFragment liz) {
                this.LIZ = liz;
            }
            
            public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
                if (b) {
                    final 1so lj = this.LIZ.LJ;
                    if (lj != null) {
                        lj.setVisibility(8);
                    }
                    return;
                }
                final 1so lj2 = this.LIZ.LJ;
                if (lj2 != null) {
                    lj2.setVisibility(0);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_1        
        //     5: ldc             2131561879
        //     7: aload_2        
        //     8: iconst_0       
        //     9: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    12: astore_1       
        //    13: aload_0        
        //    14: aload_1        
        //    15: ldc             2131362592
        //    17: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    20: checkcast       LX/1si;
        //    23: putfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment.LJFF:LX/1si;
        //    26: aload_0        
        //    27: aload_1        
        //    28: ldc             2131370402
        //    30: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    33: checkcast       LX/1ib;
        //    36: putfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment.LJI:LX/1ib;
        //    39: aload_0        
        //    40: aload_1        
        //    41: ldc             2131370401
        //    43: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    46: checkcast       LX/1ib;
        //    49: putfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment.LJII:LX/1ib;
        //    52: aload_1        
        //    53: ldc             2131362280
        //    55: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    58: checkcast       LX/1J6;
        //    61: astore_2       
        //    62: aload_0        
        //    63: aload_2        
        //    64: putfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment.LIZ:LX/1J6;
        //    67: aload_2        
        //    68: ifnull          83
        //    71: aload_2        
        //    72: new             LX/0wH;
        //    75: dup            
        //    76: aload_0        
        //    77: invokespecial   X/0wH.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment;)V
        //    80: invokevirtual   X/1J6.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
        //    83: aload_1        
        //    84: ldc             2131370309
        //    86: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    89: checkcast       LX/1so;
        //    92: astore_2       
        //    93: aload_0        
        //    94: aload_2        
        //    95: putfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment.LJIIIIZZ:LX/1so;
        //    98: aload_2        
        //    99: ifnull          114
        //   102: aload_2        
        //   103: new             LX/0wI;
        //   106: dup            
        //   107: aload_0        
        //   108: invokespecial   X/0wI.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment;)V
        //   111: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   114: aload_1        
        //   115: ldc             2131362415
        //   117: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   120: checkcast       LX/1so;
        //   123: astore_2       
        //   124: aload_0        
        //   125: aload_2        
        //   126: putfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment.LJ:LX/1so;
        //   129: aload_2        
        //   130: ifnull          145
        //   133: aload_2        
        //   134: new             LX/0wJ;
        //   137: dup            
        //   138: aload_0        
        //   139: invokespecial   X/0wJ.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchMateQuitRequestFragment;)V
        //   142: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   145: aload_1        
        //   146: areturn        
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
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        final MultiMatchMateQuitRequestContract.a a = (MultiMatchMateQuitRequestContract.a)super.LIZJ;
        if (a != null) {
            a.LIZIZ();
        }
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        final MultiMatchMateQuitRequestContract.a a = (MultiMatchMateQuitRequestContract.a)super.LIZJ;
        if (a != null) {
            a.LIZ();
        }
        final MultiMatchMateQuitRequestContract.a a2 = (MultiMatchMateQuitRequestContract.a)super.LIZJ;
        final String s = null;
        while (true) {
            Label_0174: {
                if (a2 == null) {
                    break Label_0174;
                }
                final 1ci lizlll = a2.LIZLLL();
                if (lizlll == null) {
                    break Label_0174;
                }
                final 0pc lji = lizlll.LJI;
                if (lji == null) {
                    break Label_0174;
                }
                final 0pe liz = lji.LIZ;
                final 1si ljff = this.LJFF;
                ImageModel lizj;
                if (liz != null) {
                    lizj = liz.LIZJ;
                }
                else {
                    lizj = null;
                }
                0cm.LIZ((ImageView)ljff, lizj);
                final 1ib lji2 = this.LJI;
                if (lji2 != null) {
                    String liz2;
                    String liziz;
                    if (liz != null) {
                        liz2 = liz.LIZ;
                        liziz = liz.LIZIZ;
                    }
                    else {
                        liz2 = null;
                        liziz = s;
                    }
                    lji2.setText((CharSequence)0cB.LIZ(2131831005, 0W3.LIZ(liz2, liziz)));
                }
                if (0n9.LIZ.LIZJ() == 0nC.PUNISH) {
                    final 1ib ljii = this.LJII;
                    if (ljii != null) {
                        ljii.setText((CharSequence)0cB.LIZ(2131831003));
                    }
                }
                return;
            }
            final 0pe liz = null;
            continue;
        }
    }
}
