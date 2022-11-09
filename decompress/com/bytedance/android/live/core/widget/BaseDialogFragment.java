// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.core.widget;

import android.content.DialogInterface$OnKeyListener;
import X.0dn;
import android.view.View;
import java.util.Iterator;
import X.GAP;
import android.os.Bundle;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import X.1nL;
import com.bytedance.covode.number.Covode;
import X.Kcv;
import android.content.DialogInterface$OnDismissListener;
import com.bytedance.android.live.BaseDialogFragmentV2;

public class BaseDialogFragment extends BaseDialogFragmentV2
{
    public boolean LIZ;
    public DialogInterface$OnDismissListener LIZIZ;
    public Kcv<Object> LIZJ;
    
    static {
        Covode.recordClassIndex(5857);
    }
    
    public BaseDialogFragment() {
        this.LIZJ = (Kcv<Object>)new Kcv();
    }
    
    public static void LIZ(final 1nL 1nL, final DialogFragment dialogFragment) {
        final String canonicalName = dialogFragment.getClass().getCanonicalName();
        if (1nL != null) {
            dialogFragment.show(1nL.getSupportFragmentManager(), canonicalName);
        }
    }
    
    public String LIZ() {
        return String.valueOf(this.hashCode());
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        try {
            this.dismiss();
        }
        catch (final IllegalStateException ex) {
            this.dismissAllowingStateLoss();
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.LIZ = false;
        GAP.LIZ().LIZIZ();
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.LIZ = false;
        if (!this.LIZJ.LIZ.isEmpty()) {
            final Iterator iterator = this.LIZJ.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
            this.LIZJ.LIZ.clear();
        }
        GAP.LIZ().LIZJ();
    }
    
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        this.LIZ = false;
    }
    
    @Override
    public void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        final DialogInterface$OnDismissListener liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.onDismiss(dialogInterface);
        }
    }
    
    @Override
    public void onPause() {
        super.onPause();
        if (!this.LIZJ.LIZ.isEmpty()) {
            final Iterator iterator = this.LIZJ.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        }
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (!this.LIZJ.LIZ.isEmpty()) {
            final Iterator iterator = this.LIZJ.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }
    
    @Override
    public void onStop() {
        super.onStop();
        if (!this.LIZJ.LIZ.isEmpty()) {
            final Iterator iterator = this.LIZJ.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        }
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LIZ = true;
        this.getDialog().setOnKeyListener((DialogInterface$OnKeyListener)new 0dn(this));
    }
}
