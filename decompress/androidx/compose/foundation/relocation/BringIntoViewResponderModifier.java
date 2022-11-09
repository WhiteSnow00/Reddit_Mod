// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.relocation;

import d2.e;
import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.p;
import mj2.g;
import c2.l;
import t0.a;
import mj2.z0;
import n1.d;
import kotlin.Pair;
import t0.f;
import d2.c;
import t0.b;

public final class BringIntoViewResponderModifier extends b implements c<t0.c>, t0.c
{
    public f i;
    public Pair<n1.d, ? extends z0> j;
    public Pair<n1.d, ? extends z0> k;
    
    public BringIntoViewResponderModifier(final a a) {
        ah2.f.f((Object)a, "defaultParent");
        super(a);
    }
    
    public static final Object b(final BringIntoViewResponderModifier bringIntoViewResponderModifier, final Pair k, final l l, final tg2.c c) {
        bringIntoViewResponderModifier.k = (Pair<n1.d, ? extends z0>)k;
        final n1.d d = (n1.d)k.getFirst();
        final f i = bringIntoViewResponderModifier.i;
        if (i != null) {
            Object o = g.e((p)new BringIntoViewResponderModifier$dispatchRequest$2(bringIntoViewResponderModifier, i.b(d), l, d, null), c);
            if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
                o = j.a;
            }
            return o;
        }
        ah2.f.n("responder");
        throw null;
    }
    
    @Override
    public final Object a(final n1.d d, final l l, final tg2.c<? super j> c) {
        final Object e = mj2.g.e((p)new BringIntoViewResponderModifier$bringChildIntoView.BringIntoViewResponderModifier$bringChildIntoView$2(this, l, d, (tg2.c)null), (tg2.c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return pg2.j.a;
    }
    
    @Override
    public final e<t0.c> getKey() {
        return BringIntoViewKt.a;
    }
    
    @Override
    public final Object getValue() {
        return this;
    }
}
