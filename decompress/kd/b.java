// 
// Decompiled by Procyon v0.6.0
// 

package kd;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import od.c;

public final class b implements c
{
    public Status f;
    public GoogleSignInAccount g;
    
    public b(final GoogleSignInAccount g, final Status f) {
        this.g = g;
        this.f = f;
    }
    
    public final Status getStatus() {
        return this.f;
    }
}
