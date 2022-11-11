// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.app;

import X.0AB;
import X.0AO;
import android.content.DialogInterface;
import X.0e2;
import com.bytedance.covode.number.Covode;
import androidx.fragment.app.DialogFragment;

public class LiveControllableDialogFragment extends DialogFragment
{
    static {
        Covode.recordClassIndex(5908);
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
            return super.show(0ao, s);
        }
        return -1;
    }
    
    @Override
    public void show(final 0AB 0ab, final String s) {
        if (!0e2.a.LIZ.LIZIZ()) {
            super.show(0ab, s);
        }
    }
    
    @Override
    public void showNow(final 0AB 0ab, final String s) {
        if (!0e2.a.LIZ.LIZIZ()) {
            super.showNow(0ab, s);
        }
    }
}
