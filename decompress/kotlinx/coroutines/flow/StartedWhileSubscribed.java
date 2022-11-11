// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import java.util.List;
import al0.f0;
import rg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import rg2.p;
import hj2.j;
import rg2.q;
import lg2.c;
import hj2.e;
import hj2.a0;
import xv.a;
import hj2.y;

public final class StartedWhileSubscribed implements y
{
    public final long a;
    public final long b;
    
    public StartedWhileSubscribed(final long a, final long b) {
        this.a = a;
        this.b = b;
        final int n = 1;
        if (a < 0L) {
            throw new IllegalArgumentException(xv.a.a("stopTimeout(", a, " ms) cannot be negative").toString());
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
        throw new IllegalArgumentException(xv.a.a("replayExpiration(", b, " ms) cannot be negative").toString());
    }
    
    @Override
    public final e<SharingCommand> a(final a0<Integer> a0) {
        return kotlinx.coroutines.flow.a.r((e)new j((p)new StartedWhileSubscribed$command$2((c)null), (e)kotlinx.coroutines.flow.a.O((e)a0, (q)new StartedWhileSubscribed$command$1(this, (c)null))));
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
            final StringBuilder r = a.r("stopTimeout=");
            r.append(this.a);
            r.append("ms");
            ((List<String>)listBuilder).add(r.toString());
        }
        if (this.b < Long.MAX_VALUE) {
            final StringBuilder r2 = a.r("replayExpiration=");
            r2.append(this.b);
            r2.append("ms");
            ((List<String>)listBuilder).add(r2.toString());
        }
        return f0.n(a.r("SharingStarted.WhileSubscribed("), CollectionsKt___CollectionsKt.I3((Iterable)listBuilder.build(), (CharSequence)null, (String)null, (String)null, (l)null, 63), ')');
    }
}
