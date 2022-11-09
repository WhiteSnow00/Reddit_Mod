// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.ui.dialog;

import androidx.fragment.app.DialogFragment;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import X.0AB;
import android.view.View$OnClickListener;
import android.os.Bundle;
import X.2GU;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.FpL;
import X.2P9;
import X.QgG;
import android.app.Dialog;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;
import kotlin.jvm.internal.n;
import X.0AO;
import androidx.fragment.app.Fragment;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import X.CTM;
import X.SRF;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0CH;
import X.1OY;
import X.BHo;
import X.5DO;
import X.GK4;
import android.view.View;
import X.SRC;
import X.0l6;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class LinkDialog extends LiveDialogFragment implements InteractDialogFragmentBaseContract.c, d, 0l6.c
{
    public static final /* synthetic */ SRC[] LIZ;
    public View LIZIZ;
    public final GK4 LIZJ;
    public final 5DO LIZLLL;
    public final BHo LJ;
    public 1OY.a LJFF;
    public InteractDialogFragmentBaseContract.b LJI;
    public final 0CH LJII;
    public HashMap LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(7483);
        LIZ = new SRC[] { (SRC)new SRF((Class)LinkDialog.class, "mDialogParams", "getMDialogParams()Lcom/bytedance/android/live/liveinteract/cohost/business/contract/LinkDialogContract$LinkDialogParams;", 0) };
    }
    
    public LinkDialog(final 0CH ljii) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LJII:LX/0CH;
        //    13: aload_0        
        //    14: getstatic       X/GK4.PANEL_LINK:LX/GK4;
        //    17: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LIZJ:LX/GK4;
        //    20: aload_0        
        //    21: new             LX/1wN;
        //    24: dup            
        //    25: aload_0        
        //    26: invokespecial   X/1wN.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog;)V
        //    29: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    32: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LIZLLL:LX/5DO;
        //    35: aload_0        
        //    36: new             LX/1wM;
        //    39: dup            
        //    40: new             LX/0l3;
        //    43: dup            
        //    44: invokespecial   X/0l3.<init>:()V
        //    47: aload_0        
        //    48: invokespecial   X/1wM.<init>:(Ljava/lang/Object;Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog;)V
        //    51: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LJ:LX/BHo;
        //    54: return         
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
    
    public static Object LIZ(Context context, String declaredField) {
        MethodCollector.i(12143);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)declaredField);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                            ((AccessibleObject)declaredField).setAccessible(true);
                            ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                        }
                        catch (final Exception declaredField) {
                            6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(12143);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)declaredField);
                    MethodCollector.o(12143);
                    return context;
                    context = (Context)context.getSystemService((String)declaredField);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)declaredField);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    private final void LJIIIZ() {
        this.LJIIJ();
        final AbsView<?> liziz = this.LJI().LIZIZ();
        if (liziz == null) {
            return;
        }
        final 0AO liz = ((Fragment)this).getChildFragmentManager().LIZ();
        liz.LIZ(2130772220, 2130772221, 2130772220, 2130772221);
        liz.LIZ((String)null);
        liz.LIZ(2131365523, liziz);
        liz.LIZIZ();
    }
    
    private final void LJIIJ() {
        if (!super.LJIJJLI) {
            return;
        }
        final Context context = ((Fragment)this).getContext();
        if (context == null) {
            return;
        }
        n.LIZIZ((Object)context, "");
        final Dialog dialog = ((DialogFragment)this).getDialog();
        if (dialog != null) {
            final View currentFocus = dialog.getCurrentFocus();
            if (currentFocus != null) {
                n.LIZIZ((Object)currentFocus, "");
                final Object liz = LIZ(context, "input_method");
                Objects.requireNonNull(liz, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                final InputMethodManager inputMethodManager = (InputMethodManager)liz;
                if (inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
    }
    
    public final boolean D_() {
        if (this.LJII().LIZJ) {
            if (this.LJI().LIZ()) {
                ((Fragment)this).getChildFragmentManager().LIZJ();
            }
            final QgG<2P9> ljii = this.LJII().LJII;
            if (ljii != null) {
                ljii.invoke();
            }
            return true;
        }
        if (!this.LJII().LJI) {
            return true;
        }
        final QgG<2P9> ljii2 = this.LJII().LJII;
        if (ljii2 != null) {
            ljii2.invoke();
        }
        return false;
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561988);
        fpL.LIZIZ = 2131887299;
        fpL.LJIIIIZZ = -1;
        fpL.LJFF = 0.0f;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJIIIIZZ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJIIIIZZ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZ(final 1OY.a a, final InteractDialogFragmentBaseContract.b b) {
        CTM.LIZ((Object)a);
        if (this.LJI().LIZ(a, b)) {
            this.LJIIIZ();
        }
    }
    
    public final void LIZ(final 0l6.a a) {
        if (a != null) {
            this.LIZIZ(a);
            return;
        }
        try {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        catch (final IllegalArgumentException ex) {}
    }
    
    public final InteractDialogFragmentBaseContract.c LIZIZ(final 1OY.a ljff, final InteractDialogFragmentBaseContract.b lji) {
        CTM.LIZ((Object)ljff);
        this.LJFF = ljff;
        this.LJI = lji;
        return this;
    }
    
    public final void LIZIZ() {
        final HashMap ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.clear();
        }
    }
    
    public final void LIZIZ(final 0l6.a a) {
        this.LJ.LIZ((Object)this, LinkDialog.LIZ[0], (Object)a);
    }
    
    public final 1OY.a LIZLLL() {
        final 1OY.a ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        return ljff;
    }
    
    public final 0CH LJ() {
        return this.LJII;
    }
    
    public final DataChannel LJFF() {
        return super.LJIL;
    }
    
    public final 0l6.b LJI() {
        return (0l6.b)this.LIZLLL.getValue();
    }
    
    public final 0l6.a LJII() {
        return (0l6.a)this.LJ.LIZ((Object)this, LinkDialog.LIZ[0]);
    }
    
    public final GK4 d_() {
        return this.LIZJ;
    }
    
    public final void dismiss() {
        final DataChannel ljil = super.LJIL;
        if (ljil != null) {
            ljil.LIZJ((Class)2GU.class);
        }
        super.dismiss();
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.LJI().LIZJ();
    }
    
    public final void onViewCreated(final View liziz, final Bundle bundle) {
        public final class 1PQ implements 0AB.c
        {
            public final /* synthetic */ LinkDialog LIZ;
            public final /* synthetic */ View LIZIZ;
            
            static {
                Covode.recordClassIndex(7486);
            }
            
            public 1PQ(final LinkDialog liz, final View liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ() {
                final AbsView<?> liziz = this.LIZ.LJI().LIZIZ();
                if (liziz != null && liziz.isViewValid() && ((DialogFragment)this.LIZ).getDialog() != null) {
                    final LinkDialog liz = this.LIZ;
                    final 0l6.a lj = liziz.LJ();
                    n.LIZIZ((Object)lj, "");
                    liz.LIZIZ(lj);
                    if (this.LIZ.LJII().LJIIIZ) {
                        final View viewById = this.LIZIZ.findViewById(2131372360);
                        if (viewById != null) {
                            viewById.setVisibility(0);
                        }
                        final View viewById2 = this.LIZIZ.findViewById(2131374229);
                        if (viewById2 != null) {
                            viewById2.setVisibility(0);
                        }
                        return;
                    }
                    final View viewById3 = this.LIZIZ.findViewById(2131372360);
                    if (viewById3 != null) {
                        viewById3.setVisibility(8);
                    }
                    final View viewById4 = this.LIZIZ.findViewById(2131374229);
                    if (viewById4 != null) {
                        viewById4.setVisibility(8);
                    }
                    final View viewById5 = this.LIZIZ.findViewById(2131365523);
                    if (viewById5 != null) {
                        viewById5.setBackgroundResource(2131234025);
                    }
                }
            }
        }
        public final class 0m1 implements View$OnClickListener
        {
            public final /* synthetic */ LinkDialog LIZ;
            
            static {
                Covode.recordClassIndex(7487);
            }
            
            public 0m1(final LinkDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                if (this.LIZ.LJII().LJI) {
                    ((DialogFragment)this.LIZ).dismiss();
                    final QgG<2P9> ljiiiizz = this.LIZ.LJII().LJIIIIZZ;
                    if (ljiiiizz != null) {
                        ljiiiizz.invoke();
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
        //     7: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LIZIZ:Landroid/view/View;
        //    15: aload_0        
        //    16: invokevirtual   androidx/fragment/app/Fragment.getChildFragmentManager:()LX/0AB;
        //    19: new             LX/1PQ;
        //    22: dup            
        //    23: aload_0        
        //    24: aload_1        
        //    25: invokespecial   X/1PQ.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog;Landroid/view/View;)V
        //    28: invokevirtual   X/0AB.LIZ:(LX/0AA;)V
        //    31: aload_1        
        //    32: ldc_w           2131369044
        //    35: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    38: new             LX/0m1;
        //    41: dup            
        //    42: aload_0        
        //    43: invokespecial   X/0m1.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog;)V
        //    46: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    49: aload_0        
        //    50: invokevirtual   com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LJI:()LX/0l4;
        //    53: astore_1       
        //    54: aload_0        
        //    55: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LJFF:LX/0kv;
        //    58: astore_2       
        //    59: aload_2        
        //    60: ifnonnull       69
        //    63: ldc_w           ""
        //    66: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    69: aload_1        
        //    70: aload_2        
        //    71: aload_0        
        //    72: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LJI:LX/0l0;
        //    75: invokeinterface X/0l4.LIZ:(LX/0kv;LX/0l0;)Z
        //    80: pop            
        //    81: aload_0        
        //    82: invokespecial   com/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog.LJIIIZ:()V
        //    85: return         
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
}
