// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.input;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment;
import X.0cB;
import X.0b9;
import android.view.View$OnClickListener;
import X.0hI;
import android.widget.TextView$OnEditorActionListener;
import X.0hH;
import android.text.TextWatcher;
import X.0hG;
import android.view.Window;
import android.app.Dialog;
import X.0eU;
import X.1J7;
import kotlin.jvm.internal.n;
import android.content.Context;
import X.0et;
import android.view.LayoutInflater;
import android.os.Bundle;
import X.0g5;
import X.0gU;
import X.1im;
import X.CTM;
import android.content.DialogInterface;
import android.view.View;
import X.0gz;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0gV;
import X.2P9;
import X.SRS;
import X.0bB;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class EffectTextInputFragment extends LiveDialogFragment implements 0bB
{
    public int LIZ;
    public SRS<? super Boolean, 2P9> LIZIZ;
    public 0gV LIZJ;
    public boolean LIZLLL;
    public HashMap LJ;
    
    static {
        Covode.recordClassIndex(6364);
    }
    
    public EffectTextInputFragment() {
        this.LIZ = 50;
    }
    
    private final void LIZLLL() {
        if (this.LIZLLL) {
            ((DialogFragment)this).dismiss();
        }
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131562199);
        0gz.LIZ(fpL);
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJ == null) {
            this.LJ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZ(final boolean b, final int n) {
        if (super.LJIJJLI) {
            if (b) {
                this.LIZLLL = true;
                return;
            }
            this.LIZLLL();
            this.LIZLLL = false;
        }
    }
    
    public final void LIZIZ() {
        final HashMap lj = this.LJ;
        if (lj != null) {
            lj.clear();
        }
    }
    
    public final void onDestroyView() {
        this.LIZLLL();
        super.onDestroyView();
        this.LIZIZ();
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        final 0gU liz = 1im.LIZJ.LIZ().LIZ;
        if (liz != null) {
            final 0g5 lizj = liz.LIZJ;
            if (lizj != null) {
                lizj.LIZIZ();
            }
        }
        final SRS<? super Boolean, 2P9> liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.invoke((Object)false);
        }
        super.onDismiss(dialogInterface);
    }
    
    public final LayoutInflater onGetLayoutInflater(final Bundle bundle) {
        final LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(0et.LIZ((Context)((Fragment)this).getActivity()));
        n.LIZIZ((Object)cloneInContext, "");
        return cloneInContext;
    }
    
    public final void onStart() {
        super.onStart();
        ((1J7)this.LIZ(2131364715)).requestFocus();
        final Dialog dialog = ((DialogFragment)this).getDialog();
        if (dialog != null) {
            final Window window = dialog.getWindow();
            if (window != null) {
                0eU.LIZ(window);
            }
        }
        final Dialog dialog2 = ((DialogFragment)this).getDialog();
        if (dialog2 != null) {
            final Window window2 = dialog2.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(5);
            }
        }
        final SRS<? super Boolean, 2P9> liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.invoke((Object)true);
        }
    }
    
    public final void onViewCreated(View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        final 1J7 1j7 = (1J7)this.LIZ(2131364715);
        if (1j7 != null) {
            1j7.addTextChangedListener((TextWatcher)new 0hG());
        }
        final 1J7 1j8 = (1J7)this.LIZ(2131364715);
        if (1j8 != null) {
            1j8.setOnEditorActionListener((TextView$OnEditorActionListener)new 0hH(this));
        }
        view = ((Fragment)this).getView();
        if (view != null) {
            view.setOnClickListener((View$OnClickListener)new 0hI(this));
        }
        ((0b9)this.LIZ(2131368183)).setWindowInsetsEnable(true);
        ((0b9)this.LIZ(2131368183)).setWindowInsetsKeyboardObserver(this);
        if (0cB.LJI()) {
            final 1J7 1j9 = (1J7)this.LIZ(2131364715);
            if (1j9 != null) {
                1j9.setGravity(8388629);
            }
            return;
        }
        final 1J7 1j10 = (1J7)this.LIZ(2131364715);
        if (1j10 != null) {
            1j10.setGravity(8388627);
        }
    }
}
