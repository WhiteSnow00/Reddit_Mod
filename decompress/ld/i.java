// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.IInterface;
import android.os.IBinder;
import android.content.Intent;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions$a;
import qd.l;
import com.google.android.gms.common.api.c;
import rd.d;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import rd.g;

public final class i extends g<s>
{
    public final GoogleSignInOptions L;
    
    public i(final Context context, final Looper looper, final rd.d d, final GoogleSignInOptions googleSignInOptions, final com.google.android.gms.common.api.c.b b, final com.google.android.gms.common.api.c.c c) {
        super(context, looper, 91, d, (qd.d)b, (l)c);
        GoogleSignInOptions$a googleSignInOptions$a;
        if (googleSignInOptions != null) {
            googleSignInOptions$a = new GoogleSignInOptions$a(googleSignInOptions);
        }
        else {
            googleSignInOptions$a = new GoogleSignInOptions$a();
        }
        googleSignInOptions$a.i = de.i.a();
        if (!d.c.isEmpty()) {
            final Iterator<Scope> iterator = d.c.iterator();
            while (iterator.hasNext()) {
                googleSignInOptions$a.a.add(iterator.next());
                googleSignInOptions$a.a.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.L = googleSignInOptions$a.a();
    }
    
    @Override
    public final String D() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }
    
    @Override
    public final String E() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
    
    @Override
    public final int m() {
        return 12451000;
    }
    
    @Override
    public final Intent o() {
        return ld.h.a(super.m, this.L);
    }
}
