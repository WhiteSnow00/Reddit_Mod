// 
// Decompiled by Procyon v0.6.0
// 

package m92;

import ng2.e;
import com.reddit.vault.feature.registration.securevault.SecureVaultScreen;
import com.reddit.vault.h;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;

public final class d
{
    public final a a;
    public final c b;
    public final MasterKeyScreen$a c;
    public final h d;
    
    public d(final a a, final SecureVaultScreen b, final SecureVaultScreen c, final h d) {
        e.f((Object)b, "view");
        e.f((Object)c, "masterKeyListener");
        this.a = a;
        this.b = (c)b;
        this.c = (MasterKeyScreen$a)c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return e.a((Object)this.a, (Object)d.a) && e.a((Object)this.b, (Object)d.b) && e.a((Object)this.c, (Object)d.c) && e.a((Object)this.d, (Object)d.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final h d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        return (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + hashCode4;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SecureVaultDependencies(params=");
        t.append(this.a);
        t.append(", view=");
        t.append(this.b);
        t.append(", masterKeyListener=");
        t.append(this.c);
        t.append(", vaultEventListener=");
        t.append(this.d);
        t.append(')');
        return t.toString();
    }
}
