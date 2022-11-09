// 
// Decompiled by Procyon v0.6.0
// 

package ce;

import android.os.IInterface;
import android.os.IBinder;
import android.accounts.Account;
import rd.u;
import android.text.TextUtils;
import qd.l;
import gd.c;
import rd.d;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;
import rd.g;

public final class a extends g<b>
{
    public final Bundle L;
    
    public a(final Context context, final Looper looper, final rd.d d, final gd.c c, final com.google.android.gms.common.api.c.b b, final com.google.android.gms.common.api.c.c c2) {
        super(context, looper, 16, d, (qd.d)b, (l)c2);
        if (c == null) {
            this.L = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }
    
    @Override
    public final Bundle A() {
        return this.L;
    }
    
    @Override
    public final String D() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }
    
    @Override
    public final String E() {
        return "com.google.android.gms.auth.service.START";
    }
    
    @Override
    public final boolean g() {
        final rd.d i = super.I;
        final Account a = i.a;
        String name;
        if (a != null) {
            name = a.name;
        }
        else {
            name = null;
        }
        if (!TextUtils.isEmpty((CharSequence)name)) {
            if (i.d.get(gd.b.a) != null) {
                throw null;
            }
            if (!i.b.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int m() {
        return 12451000;
    }
}
