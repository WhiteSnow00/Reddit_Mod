// 
// Decompiled by Procyon v0.6.0
// 

package g82;

import p1.h;

public final class e
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    
    public e(final String a, final String b, final String c, final String d) {
        ng2.e.f((Object)a, "subredditName");
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
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return ng2.e.a((Object)this.a, (Object)e.a) && ng2.e.a((Object)this.b, (Object)e.b) && ng2.e.a((Object)this.c, (Object)e.c) && ng2.e.a((Object)this.d, (Object)e.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("StructuredStyleDataModel(subredditName=");
        t.append(this.a);
        t.append(", highlightColor=");
        t.append(this.b);
        t.append(", sidebarWidgetHeaderColor=");
        t.append(this.c);
        t.append(", sidebarWidgetBackgroundColor=");
        return h.c(t, this.d, ')');
    }
}
