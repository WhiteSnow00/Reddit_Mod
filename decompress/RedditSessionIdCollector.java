// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.detector;

import java.util.Iterator;
import java.util.Collection;
import pg2.j;
import ng.f0;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.a;
import pg2.f;
import v40.e;

public final class RedditSessionIdCollector implements e
{
    @Deprecated
    public static final Object c;
    @Deprecated
    public static final f<v40.f> d;
    public final int a;
    public final f b;
    
    static {
        c = new Object();
        d = a.b((zg2.a)RedditSessionIdCollector$Companion$sessionIdStorage.RedditSessionIdCollector$Companion$sessionIdStorage$2.INSTANCE);
    }
    
    @Inject
    public RedditSessionIdCollector(final int a) {
        this.a = a;
        this.b = kotlin.a.b((zg2.a)RedditSessionIdCollector$sessionIds.RedditSessionIdCollector$sessionIds$2.INSTANCE);
    }
    
    public final void a(String s) {
        synchronized (RedditSessionIdCollector.c) {
            ((LinkedHashSet)this.b.getValue()).add(f0.f2(s));
            if (((LinkedHashSet)this.b.getValue()).size() > this.a) {
                final Object next = ((LinkedHashSet)this.b.getValue()).iterator().next();
                ah2.f.e(next, "sessionIds.iterator().next()");
                s = (String)next;
                ((LinkedHashSet)this.b.getValue()).remove(s);
            }
            final j a = j.a;
        }
    }
    
    public final boolean contains(String f2) {
        ah2.f.f((Object)f2, "sessionId");
        synchronized (RedditSessionIdCollector.c) {
            f2 = f0.f2(f2);
            final LinkedHashSet set = (LinkedHashSet)this.b.getValue();
            final boolean b = set instanceof Collection;
            final boolean b2 = false;
            boolean b3;
            if (b && set.isEmpty()) {
                b3 = b2;
            }
            else {
                final Iterator iterator = set.iterator();
                do {
                    b3 = b2;
                    if (iterator.hasNext()) {
                        continue;
                    }
                    return b3;
                } while (!ah2.f.a((Object)iterator.next(), (Object)f2));
                b3 = true;
            }
            return b3;
        }
    }
}
