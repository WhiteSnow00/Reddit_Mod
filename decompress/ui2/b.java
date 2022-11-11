// 
// Decompiled by Procyon v0.6.0
// 

package ui2;

import ti2.x;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import ti2.t;
import sg2.e;
import wi2.g;
import wi2.f;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$a;

public final class b extends TypeCheckerState$b$a
{
    public final /* synthetic */ a a;
    public final /* synthetic */ TypeSubstitutor b;
    
    public b(final a a, final TypeSubstitutor b) {
        this.a = a;
        this.b = b;
    }
    
    public final g a(final TypeCheckerState typeCheckerState, final f f) {
        e.f((Object)typeCheckerState, "state");
        e.f((Object)f, "type");
        final a a = this.a;
        final TypeSubstitutor b = this.b;
        final g x1 = a.x1(f);
        e.d((Object)x1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        final t i = b.i((t)x1, Variance.INVARIANT);
        e.e((Object)i, "substitutor.safeSubstitu\u2026VARIANT\n                )");
        final x e = a.e((f)i);
        sg2.e.c((Object)e);
        return (g)e;
    }
}
