// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import sg2.e;

public final class t
{
    public final i a;
    public final q b;
    public final d c;
    public final m d;
    
    public t() {
        this(null, null, null, null, 15);
    }
    
    public t(final i a, final q b, final d c, final m d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t)) {
            return false;
        }
        final t t = (t)o;
        return e.a((Object)this.a, (Object)t.a) && e.a((Object)this.b, (Object)t.b) && e.a((Object)this.c, (Object)t.c) && e.a((Object)this.d, (Object)t.d);
    }
    
    @Override
    public final int hashCode() {
        final i a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final q b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final d c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final m d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TransitionData(fade=");
        r.append(this.a);
        r.append(", slide=");
        r.append(this.b);
        r.append(", changeSize=");
        r.append(this.c);
        r.append(", scale=");
        r.append(this.d);
        r.append(')');
        return r.toString();
    }
}
