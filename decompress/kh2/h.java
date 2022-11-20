// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import ch2.g;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import ah0.b;
import ch2.a0;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result;
import ch2.c;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

public final class h implements ExternalOverridabilityCondition
{
    public ExternalOverridabilityCondition$Result a(final a a, final a a2, final c c) {
        e.f((Object)a, "superDescriptor");
        e.f((Object)a2, "subDescriptor");
        if (!(a2 instanceof a0) || !(a instanceof a0)) {
            return ExternalOverridabilityCondition$Result.UNKNOWN;
        }
        final a0 a3 = (a0)a2;
        final yh2.e name = ((g)a3).getName();
        final a0 a4 = (a0)a;
        if (!e.a((Object)name, (Object)((g)a4).getName())) {
            return ExternalOverridabilityCondition$Result.UNKNOWN;
        }
        if (b.J0(a3) && b.J0(a4)) {
            return ExternalOverridabilityCondition$Result.OVERRIDABLE;
        }
        if (!b.J0(a3) && !b.J0(a4)) {
            return ExternalOverridabilityCondition$Result.UNKNOWN;
        }
        return ExternalOverridabilityCondition$Result.INCOMPATIBLE;
    }
    
    public ExternalOverridabilityCondition$Contract b() {
        return ExternalOverridabilityCondition$Contract.BOTH;
    }
}
