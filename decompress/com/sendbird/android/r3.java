// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import lg.e0;
import java.util.Iterator;
import fc2.f;
import fc2.i;
import fc2.g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

public final class r3 implements Comparable<r3>
{
    public final String f;
    public long g;
    public final ArrayList h;
    public final ConcurrentHashMap i;
    
    public r3(final ReactionEvent reactionEvent) {
        final ArrayList h = new ArrayList();
        this.h = h;
        final ConcurrentHashMap i = new ConcurrentHashMap();
        this.i = i;
        this.f = reactionEvent.b;
        this.g = reactionEvent.e;
        h.add(reactionEvent.c);
        i.put(reactionEvent.c, reactionEvent.e);
    }
    
    public r3(final g g) {
        this.h = new ArrayList();
        this.i = new ConcurrentHashMap();
        final i p = g.p();
        this.f = p.L("key").C();
        long x;
        if (p.P("latest_updated_at")) {
            x = p.L("latest_updated_at").x();
        }
        else {
            x = 0L;
        }
        this.g = x;
        if (p.P("user_ids")) {
            final f m = p.M("user_ids");
            for (int i = 0; i < m.size(); ++i) {
                if (m.J(i) != null) {
                    final String c = m.J(i).C();
                    this.h.add(c);
                    this.i.put(c, this.g);
                }
            }
        }
    }
    
    public final i a() {
        final i i = new i();
        i.K("key", this.f);
        i.J("latest_updated_at", this.g);
        synchronized (this.h) {
            if (this.h.size() > 0) {
                final f f = new f();
                for (final String s : this.h) {
                    if (s != null) {
                        f.I(s);
                    }
                }
                i.F("user_ids", f);
            }
            return i;
        }
    }
    
    @Override
    public final int compareTo(final Object o) {
        return (int)(this.g - ((r3)o).g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o.getClass() == r3.class && this.f.equals(((r3)o).f);
    }
    
    @Override
    public final int hashCode() {
        return e0.J(new Object[] { this.f });
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Reaction{key='");
        a.z(r, this.f, '\'', ", updatedAt=");
        r.append(this.g);
        r.append(", userIds=");
        r.append(this.h);
        r.append('}');
        return r.toString();
    }
}
