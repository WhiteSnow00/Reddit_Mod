// 
// Decompiled by Procyon v0.6.0
// 

package ap0;

import com.reddit.frontpage.presentation.subreddit.pager.SubredditPagerScreen;
import rs1.g;
import d32.j;
import rg2.a;
import rs1.e;

public final class k
{
    public final e a;
    public final String b;
    public final a<j> c;
    public final js0.a d;
    public final n51.k e;
    public final g f;
    
    public k(final SubredditPagerScreen a, final a c, final js0.a d, final n51.k e, final g f) {
        sg2.e.f((Object)a, "view");
        this.a = (e)a;
        this.b = "subreddit_listing";
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k)) {
            return false;
        }
        final k k = (k)o;
        return sg2.e.a((Object)this.a, (Object)k.a) && sg2.e.a((Object)this.b, (Object)k.b) && sg2.e.a((Object)this.c, (Object)k.c) && sg2.e.a((Object)this.d, (Object)k.d) && sg2.e.a((Object)this.e, (Object)k.e) && sg2.e.a((Object)this.f, (Object)k.f);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.b, this.a.hashCode() * 31, 31);
        final int hashCode = this.c.hashCode();
        final int hashCode2 = this.d.hashCode();
        final n51.k e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        return this.f.hashCode() + ((hashCode2 + (hashCode + c) * 31) * 31 + hashCode3) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditPagerScreenDependencies(view=");
        r.append(this.a);
        r.append(", sourcePage=");
        r.append(this.b);
        r.append(", recentChatsAnalyticsDelegate=");
        r.append(this.c);
        r.append(", incognitoAuthParams=");
        r.append(this.d);
        r.append(", notificationDeeplinkParams=");
        r.append(this.e);
        r.append(", subredditPagerParams=");
        r.append(this.f);
        r.append(')');
        return r.toString();
    }
}
