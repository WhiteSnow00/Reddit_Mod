// 
// Decompiled by Procyon v0.6.0
// 

package h;

import androidx.fragment.app.Fragment;
import android.app.Dialog;
import android.os.Bundle;

public class n extends androidx.fragment.app.n
{
    public n() {
    }
    
    public n(final int n) {
        super(n);
    }
    
    public Dialog onCreateDialog(final Bundle bundle) {
        return (Dialog)new m(((Fragment)this).getContext(), this.getTheme());
    }
    
    public void setupDialog(final Dialog dialog, final int n) {
        if (dialog instanceof m) {
            final m m = (m)dialog;
            if (n != 1 && n != 2) {
                if (n != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            m.p(1);
        }
        else {
            super.setupDialog(dialog, n);
        }
    }
}
