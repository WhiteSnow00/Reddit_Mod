// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live;

import X.0AB;
import androidx.fragment.app.Fragment;
import X.0AO;
import android.content.DialogInterface;
import X.0e2;
import X.0ba;
import java.lang.reflect.Field;
import com.bytedance.covode.number.Covode;
import androidx.fragment.app.DialogFragment;

public class BaseDialogFragmentV2 extends DialogFragment
{
    static {
        Covode.recordClassIndex(4813);
    }
    
    private void LIZ(final String s, final Object o) {
        try {
            final Field declaredField = BaseDialogFragmentV2.class.getSuperclass().getDeclaredField(s);
            declaredField.setAccessible(true);
            declaredField.set(this, o);
        }
        catch (final Exception ex) {}
    }
    
    @Override
    public void dismiss() {
        if (this.getFragmentManager() == null) {
            0ba.LIZ(3, "BaseDialogFragmentV2", "dismiss:${this} not associate with a fragment manager");
            return;
        }
        super.dismiss();
    }
    
    @Override
    public void dismissAllowingStateLoss() {
        if (this.getFragmentManager() == null) {
            0ba.LIZ(3, "BaseDialogFragmentV2", "dismissAllowingStateLoss:${this} not associate with a fragment manager");
            return;
        }
        super.dismissAllowingStateLoss();
    }
    
    @Override
    public void onDestroyView() {
        0e2.a.LIZ.LIZIZ((DialogInterface)this.getDialog());
        super.onDestroyView();
    }
    
    @Override
    public void onStart() {
        super.onStart();
        0e2.a.LIZ.LIZ((DialogInterface)this.getDialog());
    }
    
    @Override
    public int show(final 0AO 0ao, final String s) {
        if (!0e2.a.LIZ.LIZIZ()) {
            this.LIZ("mDismissed", false);
            this.LIZ("mShownByMe", true);
            0ao.LIZ(this, s);
            this.LIZ("mViewDestroyed", false);
            final int lizj = 0ao.LIZJ();
            this.LIZ("mBackStackId", lizj);
            return lizj;
        }
        return -1;
    }
    
    @Override
    public void show(final 0AB 0ab, final String s) {
        if (!0e2.a.LIZ.LIZIZ()) {
            this.LIZ("mDismissed", false);
            this.LIZ("mShownByMe", true);
            final 0AO liz = 0ab.LIZ();
            liz.LIZ(this, s);
            liz.LIZJ();
        }
    }
    
    @Override
    public void showNow(0AB liz, final String s) {
        if (!0e2.a.LIZ.LIZIZ()) {
            this.LIZ("mDismissed", false);
            this.LIZ("mShownByMe", true);
            liz = (0AB)liz.LIZ();
            ((0AO)liz).LIZ(this, s);
            try {
                ((0AO)liz).LJ();
            }
            finally {
                ((0AO)liz).LIZJ();
            }
        }
    }
}
