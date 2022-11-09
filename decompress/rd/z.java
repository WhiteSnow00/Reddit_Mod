// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.content.ActivityNotFoundException;
import android.util.Log;
import android.os.Build;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

public abstract class z implements DialogInterface$OnClickListener
{
    public abstract void a();
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        try {
            try {
                this.a();
                dialogInterface.dismiss();
                return;
            }
            finally {}
        }
        catch (final ActivityNotFoundException ex) {
            String s = "Failed to start resolution intent.";
            if (Build.FINGERPRINT.contains("generic")) {
                s = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", s, (Throwable)ex);
            dialogInterface.dismiss();
            return;
        }
        dialogInterface.dismiss();
    }
}
