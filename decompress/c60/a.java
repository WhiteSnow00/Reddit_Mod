// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import sg2.e;
import b60.b;
import b60.d0;

public final class a
{
    public final b60.a a;
    public final d0 b;
    public final b c;
    
    public a(final b60.a a, final d0 b, final b c) {
        e.f((Object)a, "account");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b) && e.a((Object)this.c, (Object)a.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final d0 b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final b c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AccountSubredditQueryModel(account=");
        r.append(this.a);
        r.append(", subreddit=");
        r.append(this.b);
        r.append(", mutations=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
