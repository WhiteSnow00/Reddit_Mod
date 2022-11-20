// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.a;
import com.google.android.gms.internal.firebase-auth-api.h0;
import java.io.IOException;
import com.google.android.gms.internal.firebase-auth-api.t0;
import android.preference.PreferenceManager;
import android.content.Context;
import android.content.SharedPreferences$Editor;

public final class x5 implements w2
{
    public final SharedPreferences$Editor f;
    
    public x5(Context applicationContext, final String s) {
        applicationContext = applicationContext.getApplicationContext();
        if (s == null) {
            this.f = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            return;
        }
        this.f = applicationContext.getSharedPreferences(s, 0).edit();
    }
    
    public final void a(final t0 t0) throws IOException {
        if (this.f.putString("GenericIdpKeyset", fa.b(((a)t0).j())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
    
    public final void b(final h0 h0) throws IOException {
        if (this.f.putString("GenericIdpKeyset", fa.b(((a)h0).j())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
}
