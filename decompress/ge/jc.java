// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import android.content.pm.PackageManager$NameNotFoundException;
import lq0.k;
import android.util.Log;
import ud.a;
import lw0.b;
import android.content.Context;

public final class jc
{
    public final String a;
    public final String b;
    
    public jc(final Context context, final String a) {
        lw0.b.O(a);
        this.a = a;
        try {
            final byte[] a2 = ud.a.a(context, a);
            if (a2 == null) {
                Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(a)));
                this.b = null;
                return;
            }
            this.b = k.i(a2);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(a)));
            this.b = null;
        }
    }
}
