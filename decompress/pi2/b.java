// 
// Decompiled by Procyon v0.6.0
// 

package pi2;

import ri2.l;
import oi2.x;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import oi2.t;
import ng2.e;
import ri2.g;
import ri2.f;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$a;

public final class b extends TypeCheckerState$b$a
{
    public final a a;
    public final TypeSubstitutor b;
    
    public b(final a a, final TypeSubstitutor b) {
        this.a = a;
        this.b = b;
    }
    
    public final g a(final TypeCheckerState typeCheckerState, final f f) {
        e.f((Object)typeCheckerState, "state");
        e.f((Object)f, "type");
        final a a = this.a;
        final TypeSubstitutor b = this.b;
        final g k = ((l)a).K(f);
        e.d((Object)k, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        final t i = b.i((t)k, Variance.INVARIANT);
        e.e((Object)i, "substitutor.safeSubstitu\u2026VARIANT\n                )");
        final x d = a.d((f)i);
        e.c((Object)d);
        return (g)d;
    }
}
