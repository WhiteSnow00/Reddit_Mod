// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import X.12a;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment
{
    static {
        Covode.recordClassIndex(251);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return new 12a(this.getContext(), this.getTheme());
    }
    
    @Override
    public void setupDialog(final Dialog dialog, final int n) {
        if (dialog instanceof 12a) {
            final 12a 12a = (12a)dialog;
            Label_0037: {
                if (n == 1 || n == 2) {
                    break Label_0037;
                }
                if (n == 3) {
                    dialog.getWindow().addFlags(24);
                    break Label_0037;
                }
                return;
            }
            12a.eD_();
            return;
        }
        super.setupDialog(dialog, n);
    }
}
