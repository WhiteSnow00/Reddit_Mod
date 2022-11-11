// 
// Decompiled by Procyon v0.6.0
// 

package h;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.n;

public class o extends n
{
    public o() {
    }
    
    public o(final int n) {
        super(n);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return (Dialog)new h.n(this.getContext(), this.getTheme());
    }
    
    @Override
    public void setupDialog(final Dialog dialog, final int n) {
        if (dialog instanceof h.n) {
            final h.n n2 = (h.n)dialog;
            if (n != 1 && n != 2) {
                if (n != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            n2.v(1);
        }
        else {
            super.setupDialog(dialog, n);
        }
    }
}
