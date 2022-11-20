// 
// Decompiled by Procyon v0.6.0
// 

package va2;

import com.reddit.vault.screens.home.VaultScreen;

public final class d
{
    public final c a;
    public final e b;
    public final a c;
    
    public d(final VaultScreen a, final VaultScreen b, final a c) {
        ng2.e.f((Object)a, "view");
        ng2.e.f((Object)b, "presentationHandler");
        this.a = (c)a;
        this.b = (e)b;
        this.c = c;
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
        return ng2.e.a((Object)this.a, (Object)d.a) && ng2.e.a((Object)this.b, (Object)d.b) && ng2.e.a((Object)this.c, (Object)d.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("VaultDependencies(view=");
        t.append(this.a);
        t.append(", presentationHandler=");
        t.append(this.b);
        t.append(", params=");
        t.append(this.c);
        t.append(')');
        return t.toString();
    }
}
