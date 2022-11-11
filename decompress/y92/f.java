// 
// Decompiled by Procyon v0.6.0
// 

package y92;

import sg2.e;

public final class f
{
    public final Integer a;
    public final CharSequence b;
    public final CharSequence c;
    
    public f(final Integer a, final CharSequence b, final CharSequence c) {
        e.f((Object)b, "title");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return e.a((Object)this.a, (Object)f.a) && e.a((Object)this.b, (Object)f.b) && e.a((Object)this.c, (Object)f.c);
    }
    
    @Override
    public final int hashCode() {
        final Integer a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final int hashCode3 = this.b.hashCode();
        final CharSequence c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode3 + hashCode2 * 31) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("LearnMorePage(image=");
        r.append(this.a);
        r.append(", title=");
        r.append((Object)this.b);
        r.append(", body=");
        r.append((Object)this.c);
        r.append(')');
        return r.toString();
    }
}
