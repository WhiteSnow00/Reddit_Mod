// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import lg.e0;
import java.util.Iterator;
import fc2.f;
import fc2.i;
import fc2.g;
import java.util.ArrayList;

public final class q4
{
    public final ArrayList a;
    public long b;
    public int c;
    public long d;
    
    public q4() {
        this.a = new ArrayList();
        this.b = 0L;
        this.d = 0L;
        this.c = 0;
    }
    
    public q4(final g g) {
        final i p = g.p();
        final ArrayList a = new ArrayList();
        f n;
        if (p.P("most_replies")) {
            n = p.L("most_replies").n();
        }
        else {
            n = null;
        }
        if (n != null) {
            final Iterator<g> iterator = n.iterator();
            while (iterator.hasNext()) {
                a.add(new User((g)iterator.next()));
            }
        }
        this.a = a;
        final boolean p2 = p.P("last_replied_at");
        final long n2 = 0L;
        long x;
        if (p2) {
            x = p.L("last_replied_at").x();
        }
        else {
            x = 0L;
        }
        this.b = x;
        long x2 = n2;
        if (p.P("updated_at")) {
            x2 = p.L("updated_at").x();
        }
        this.d = x2;
        int m;
        if (p.P("reply_count")) {
            m = p.L("reply_count").m();
        }
        else {
            m = 0;
        }
        this.c = m;
    }
    
    public final i a() {
        synchronized (this) {
            final i i = new i();
            final ArrayList a = this.a;
            if (a != null && !a.isEmpty()) {
                final f f = new f();
                for (final User user : this.a) {
                    if (user != null) {
                        f.F(user.a());
                    }
                }
                i.F("most_replies", f);
            }
            i.J("last_replied_at", this.b);
            i.J("updated_at", this.d);
            i.J("reply_count", this.c);
            return i;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null) {
            if (o.getClass() == q4.class) {
                final q4 q4 = (q4)o;
                if (this.b == q4.b && this.c == q4.c && this.a.equals(q4.a)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return e0.J(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ThreadInfo{mostRepliedUsers=");
        r.append(this.a);
        r.append(", lastRepliedAt=");
        r.append(this.b);
        r.append(", replyCount=");
        r.append(this.c);
        r.append(", updatedAt=");
        return b.i(r, this.d, '}');
    }
}
