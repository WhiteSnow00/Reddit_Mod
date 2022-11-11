// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import kotlinx.coroutines.flow.StateFlowImpl;
import bg.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Pair;
import hj2.s;
import hj2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "Landroidx/paging/ConflatedEventBus;", "", "T", "data", "Lhg2/j;", "send", "(Ljava/lang/Object;)V", "Lhj2/e;", "flow", "Lhj2/e;", "getFlow", "()Lhj2/e;", "initialValue", "<init>", "paging-common" }, k = 1, mv = { 1, 5, 1 })
public final class ConflatedEventBus<T>
{
    private final e<T> flow;
    private final s<Pair<Integer, T>> state;
    
    public ConflatedEventBus() {
        this(null, 1, null);
    }
    
    public ConflatedEventBus(final T t) {
        final StateFlowImpl n = d.n((Object)new Pair((Object)Integer.MIN_VALUE, (Object)t));
        this.state = (s<Pair<Integer, T>>)n;
        this.flow = (e<T>)new ConflatedEventBus$special$$inlined$mapNotNull$1(n);
    }
    
    public final e<T> getFlow() {
        return this.flow;
    }
    
    public final void send(final T t) {
        sg2.e.f((Object)t, "data");
        final s<Pair<Integer, T>> state = this.state;
        state.setValue((Object)new Pair((Object)(((Number)((Pair)state.getValue()).getFirst()).intValue() + 1), (Object)t));
    }
}
