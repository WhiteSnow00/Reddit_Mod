// 
// Decompiled by Procyon v0.6.0
// 

package md;

import androidx.fragment.app.d0;
import android.content.Context;
import android.app.AlertDialog$Builder;
import lw0.b;
import android.os.Bundle;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import androidx.fragment.app.n;

public class i extends n
{
    public Dialog f;
    public DialogInterface$OnCancelListener g;
    public AlertDialog h;
    
    @Override
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener g = this.g;
        if (g != null) {
            g.onCancel(dialogInterface);
        }
    }
    
    @Override
    public final Dialog onCreateDialog(final Bundle bundle) {
        Object o;
        if ((o = this.f) == null) {
            this.setShowsDialog(false);
            if (this.h == null) {
                final Context context = this.getContext();
                b.R((Object)context);
                this.h = new AlertDialog$Builder(context).create();
            }
            o = this.h;
        }
        return (Dialog)o;
    }
    
    @Override
    public final void show(final d0 d0, final String s) {
        super.show(d0, s);
    }
}
