// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import java.util.List;
import p1.h;
import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import mg2.p;
import cj2.j;
import mg2.q;
import p2.b;
import gg2.c;
import cj2.e;
import cj2.y;
import m5.a;
import cj2.w;

public final class StartedWhileSubscribed implements w
{
    public final long a;
    public final long b;
    
    public StartedWhileSubscribed(final long a, final long b) {
        this.a = a;
        this.b = b;
        final int n = 1;
        if (a < 0L) {
            throw new IllegalArgumentException(m5.a.f("stopTimeout(", a, " ms) cannot be negative").toString());
        }
        int n2;
        if (b >= 0L) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            return;
        }
        throw new IllegalArgumentException(m5.a.f("replayExpiration(", b, " ms) cannot be negative").toString());
    }
    
    public final e<SharingCommand> a(final y<Integer> y) {
        return (e<SharingCommand>)p2.b.y((e)new j((p)new StartedWhileSubscribed$command$2((c)null), (e)p2.b.S((e)y, (q)new StartedWhileSubscribed$command$1(this, (c)null))));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof StartedWhileSubscribed) {
            final long a = this.a;
            final StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed)o;
            if (a == startedWhileSubscribed.a && this.b == startedWhileSubscribed.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + Long.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final ListBuilder listBuilder = new ListBuilder(2);
        if (this.a > 0L) {
            final StringBuilder t = a.t("stopTimeout=");
            t.append(this.a);
            t.append("ms");
            ((List<String>)listBuilder).add(t.toString());
        }
        if (this.b < Long.MAX_VALUE) {
            final StringBuilder t2 = a.t("replayExpiration=");
            t2.append(this.b);
            t2.append("ms");
            ((List<String>)listBuilder).add(t2.toString());
        }
        return h.c(a.t("SharingStarted.WhileSubscribed("), CollectionsKt___CollectionsKt.a5((Iterable)listBuilder.build(), (CharSequence)null, (String)null, (String)null, (l)null, 63), ')');
    }
}
