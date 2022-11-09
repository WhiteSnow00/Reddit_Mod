// 
// Decompiled by Procyon v0.6.0
// 

package ge0;

import android.os.Bundle;
import android.accounts.AccountManagerCallback;
import com.reddit.session.Session;
import android.content.Intent;
import com.reddit.session.q$a;
import android.accounts.Account;
import java.util.ArrayList;
import javax.inject.Inject;
import ah2.f;
import com.reddit.session.q;
import fe0.b;
import oa0.d;
import android.content.Context;

public final class e0 implements a
{
    public final Context a;
    public final bt0.a b;
    public final d c;
    public final b d;
    public final q e;
    
    @Inject
    public e0(final Context a, final bt0.a b, final d c, final b d, final q e) {
        f.f((Object)a, "context");
        f.f((Object)b, "appSettings");
        f.f((Object)c, "accountUtilDelegate");
        f.f((Object)d, "myAccountRepositoryProvider");
        f.f((Object)e, "sessionManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final ArrayList P() {
        return this.c.a(this.a);
    }
    
    public final boolean Q(final String s, final String s2) {
        boolean b = false;
        if (s != null) {
            final d c = this.c;
            final Context a = this.a;
            final b d = this.d;
            Account c2;
            if ((c2 = c.c(a, d, c.i(a, d, s, false))) == null) {
                final Account a2 = kx.a.a;
                c2 = new Account(s, "com.reddit.account");
            }
            if (f.a((Object)c2, (Object)this.R())) {
                return b;
            }
            final q e = this.e;
            final String name = c2.name;
            f.e((Object)name, "account.name");
            q$a.b(e, name, s2, (Intent)null, false, 28);
        }
        else {
            q$a.a(this.e);
        }
        b = true;
        return b;
    }
    
    public final Account R() {
        return this.c.h(this.a, (Session)this.e.getActiveSession());
    }
    
    public final boolean S(final String s, final AccountManagerCallback<Bundle> accountManagerCallback) {
        f.f((Object)s, "username");
        final d c = this.c;
        final Context a = this.a;
        final b d = this.d;
        Account c2;
        if ((c2 = c.c(a, d, c.i(a, d, s, false))) == null) {
            final Account a2 = kx.a.a;
            c2 = new Account(s, "com.reddit.account");
        }
        this.b.R1(this.a, s);
        final boolean d2 = this.c.d(this.a, c2, (AccountManagerCallback)accountManagerCallback);
        this.e.c(c2);
        return d2;
    }
}
