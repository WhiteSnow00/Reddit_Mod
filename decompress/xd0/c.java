// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import ng2.e;
import com.reddit.domain.model.Account;

public final class c
{
    public final Account a;
    public final boolean b;
    
    public c(final Account a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return e.a((Object)this.a, (Object)c.a) && this.b == c.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("AccountResponse(account=");
        t.append(this.a);
        t.append(", isFromCache=");
        return d.n(t, this.b, ')');
    }
}
