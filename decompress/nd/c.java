// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.Activity;
import android.content.Context;
import android.app.AlertDialog$Builder;
import mg.d0;
import android.os.Bundle;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.app.DialogFragment;

public final class c extends DialogFragment
{
    public Dialog f;
    public DialogInterface$OnCancelListener g;
    public AlertDialog h;
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener g = this.g;
        if (g != null) {
            g.onCancel(dialogInterface);
        }
    }
    
    public final Dialog onCreateDialog(final Bundle bundle) {
        Object o;
        if ((o = this.f) == null) {
            this.setShowsDialog(false);
            if (this.h == null) {
                final Activity activity = ((Fragment)this).getActivity();
                d0.y((Object)activity);
                this.h = new AlertDialog$Builder((Context)activity).create();
            }
            o = this.h;
        }
        return (Dialog)o;
    }
    
    public final void show(final FragmentManager fragmentManager, final String s) {
        super.show(fragmentManager, s);
    }
}
