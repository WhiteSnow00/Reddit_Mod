// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import ah2.f;
import kotlin.coroutines.CoroutineContext$a;
import zg2.p;
import a80.a;
import z0.l0;
import j1.e;

public final class s0 implements e
{
    public final l0 f;
    
    public s0() {
        this.f = a.n0(1.0f);
    }
    
    public final float K() {
        return ((SnapshotMutableStateImpl<Number>)this.f).getValue().floatValue();
    }
    
    public final <R> R fold(final R r, final p<? super R, ? super CoroutineContext$a, ? extends R> p2) {
        ah2.f.f((Object)p2, "operation");
        return (R)p2.invoke((Object)r, (Object)this);
    }
    
    public final <E extends CoroutineContext$a> E get(final CoroutineContext$b<E> coroutineContext$b) {
        ah2.f.f((Object)coroutineContext$b, "key");
        return (E)CoroutineContext$a$a.a((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext minusKey(final CoroutineContext$b<?> coroutineContext$b) {
        ah2.f.f((Object)coroutineContext$b, "key");
        return CoroutineContext$a$a.b((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext plus(final CoroutineContext coroutineContext) {
        ah2.f.f((Object)coroutineContext, "context");
        return CoroutineContext$DefaultImpls.a((CoroutineContext)this, coroutineContext);
    }
}
