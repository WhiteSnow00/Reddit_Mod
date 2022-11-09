// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ah2.f;

public final class b
{
    public final String a;
    public final Boolean b;
    
    public b(final String a, final Boolean b) {
        f.f((Object)a, "parentAccountId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return f.a((Object)this.a, (Object)b.a) && f.a((Object)this.b, (Object)b.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Boolean b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("AccountMutationsDataModel(parentAccountId=");
        k.append(this.a);
        k.append(", hasBeenVisited=");
        return d.m(k, this.b, ')');
    }
}
