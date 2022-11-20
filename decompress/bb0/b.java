// 
// Decompiled by Procyon v0.6.0
// 

package bb0;

import ph0.a;
import ng2.e;
import java.util.List;

public final class b
{
    public final String a;
    public final g b;
    public final d c;
    public final f d;
    public final List<h> e;
    public final f f;
    public final f g;
    
    public b(final String a, final g b, final d c, final f d, final List<? extends h> e, final f f, final f g) {
        ng2.e.f((Object)a, "id");
        ng2.e.f((Object)e, "crossPostInfo");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (List<h>)e;
        this.f = f;
        this.g = g;
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
        return ng2.e.a((Object)this.a, (Object)b.a) && ng2.e.a((Object)this.b, (Object)b.b) && ng2.e.a((Object)this.c, (Object)b.c) && ng2.e.a((Object)this.d, (Object)b.d) && ng2.e.a((Object)this.e, (Object)b.e) && ng2.e.a((Object)this.f, (Object)b.f) && ng2.e.a((Object)this.g, (Object)b.g);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final g b = this.b;
        final int n = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final d c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final f d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final int b2 = ph0.a.b((List)this.e, (((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31, 31);
        final f f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final f g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = n;
        }
        else {
            hashCode6 = g.hashCode();
        }
        return (b2 + hashCode5) * 31 + hashCode6;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CreatorStats(id=");
        t.append(this.a);
        t.append(", trends=");
        t.append(this.b);
        t.append(", postInfo=");
        t.append(this.c);
        t.append(", viewTotals=");
        t.append(this.d);
        t.append(", crossPostInfo=");
        t.append(this.e);
        t.append(", shareAllTotals=");
        t.append(this.f);
        t.append(", shareCopyTotals=");
        t.append(this.g);
        t.append(')');
        return t.toString();
    }
}
