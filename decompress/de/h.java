// 
// Decompiled by Procyon v0.6.0
// 

package de;

import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import qd.l;
import id.d;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;
import rd.g;

public final class h extends g<de.c>
{
    public final Bundle L;
    
    public h(final Context context, final Looper looper, final id.d d, final rd.d d2, final qd.d d3, final l l) {
        super(context, looper, 212, d2, d3, l);
        d.getClass();
        final Bundle i = new Bundle();
        ((BaseBundle)i).putString("session_id", d.f);
        this.L = i;
    }
    
    @Override
    public final Bundle A() {
        return this.L;
    }
    
    @Override
    public final String D() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }
    
    @Override
    public final String E() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }
    
    @Override
    public final boolean F() {
        return true;
    }
    
    @Override
    public final int m() {
        return 17895000;
    }
    
    @Override
    public final od.d[] y() {
        return de.j.c;
    }
}
