// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import sg2.e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import ti2.k0;
import ti2.j0;
import ti2.n0;
import java.util.List;
import ti2.x;
import ui2.d;
import rg2.l;
import kotlin.jvm.internal.Lambda;

final class KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1 extends Lambda implements l<ui2.d, x>
{
    public final /* synthetic */ List<n0> $arguments;
    public final /* synthetic */ j0 $attributes;
    public final /* synthetic */ k0 $constructor;
    public final /* synthetic */ MemberScope $memberScope;
    public final /* synthetic */ boolean $nullable;
    
    public KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(final k0 $constructor, final List<? extends n0> $arguments, final j0 $attributes, final boolean $nullable, final MemberScope $memberScope) {
        this.$constructor = $constructor;
        this.$arguments = (List<n0>)$arguments;
        this.$attributes = $attributes;
        this.$nullable = $nullable;
        this.$memberScope = $memberScope;
        super(1);
    }
    
    public final x invoke(final ui2.d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        final int a = KotlinTypeFactory.a;
        KotlinTypeFactory.a(this.$constructor, d, this.$arguments);
        return null;
    }
}
