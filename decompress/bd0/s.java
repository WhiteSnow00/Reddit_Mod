// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import al0.g7;
import sg2.e;
import java.util.ArrayList;
import al0.b;
import java.util.List;

public final class s
{
    public final String a;
    public final String b;
    public final String c;
    public final List<r> d;
    public final boolean e;
    
    public s(final String a, final String b, final List d, final String c, final boolean e) {
        al0.b.q(a, "subredditKindWithId", b, "subredditName", c, "userKindWithId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static s a(final s s, final ArrayList list) {
        final String a = s.a;
        final String b = s.b;
        final String c = s.c;
        final boolean e = s.e;
        sg2.e.f((Object)a, "subredditKindWithId");
        sg2.e.f((Object)b, "subredditName");
        sg2.e.f((Object)c, "userKindWithId");
        return new s(a, b, list, c, e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof s)) {
            return false;
        }
        final s s = (s)o;
        return sg2.e.a((Object)this.a, (Object)s.a) && sg2.e.a((Object)this.b, (Object)s.b) && sg2.e.a((Object)this.c, (Object)s.c) && sg2.e.a((Object)this.d, (Object)s.d) && this.e == s.e;
    }
    
    @Override
    public final int hashCode() {
        final int c = aw.b.c((List)this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        return c + e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("UserAchievementFlairs(subredditKindWithId=");
        r.append(this.a);
        r.append(", subredditName=");
        r.append(this.b);
        r.append(", userKindWithId=");
        r.append(this.c);
        r.append(", userAchievementFlairs=");
        r.append(this.d);
        r.append(", areFlairsHidden=");
        return g7.m(r, this.e, ')');
    }
}
