// 
// Decompiled by Procyon v0.6.0
// 

package de;

import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;
import gd.a$a$a;
import qd.l;
import com.google.android.gms.common.api.c;
import rd.d;
import android.os.Looper;
import android.content.Context;
import gd.a;
import rd.g;

public final class r extends g<u>
{
    public final gd.a.a L;
    
    public r(final Context context, final Looper looper, final rd.d d, final gd.a.a a, final com.google.android.gms.common.api.c.b b, final com.google.android.gms.common.api.c.c c) {
        super(context, looper, 68, d, (qd.d)b, (l)c);
        Object i = a;
        if (a == null) {
            i = gd.a.a.i;
        }
        final a$a$a a$a$a = new a$a$a((gd.a.a)i);
        a$a$a.c = de.i.a();
        this.L = new gd.a.a(a$a$a);
    }
    
    @Override
    public final Bundle A() {
        final gd.a.a l = this.L;
        l.getClass();
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("consumer_package", l.f);
        ((BaseBundle)bundle).putBoolean("force_save_dialog", l.g);
        ((BaseBundle)bundle).putString("log_session_id", l.h);
        return bundle;
    }
    
    @Override
    public final String D() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
    
    @Override
    public final String E() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
    
    @Override
    public final int m() {
        return 12800000;
    }
}
