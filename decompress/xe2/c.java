// 
// Decompiled by Procyon v0.6.0
// 

package xe2;

import android.content.DialogInterface;
import org.json.JSONObject;
import android.content.DialogInterface$OnClickListener;

public final class c implements DialogInterface$OnClickListener
{
    public final /* synthetic */ JSONObject f;
    
    public c(final JSONObject f) {
        this.f = f;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        xe2.f.b(xe2.f.a("r", this.f));
    }
}
