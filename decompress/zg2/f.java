// 
// Decompiled by Procyon v0.6.0
// 

package zg2;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c;
import mg2.a;

public final class f implements a<Void>
{
    public final c f;
    public final kotlin.reflect.jvm.internal.impl.builtins.c g;
    
    public f(final JvmBuiltIns g, final c f) {
        this.g = (kotlin.reflect.jvm.internal.impl.builtins.c)g;
        this.f = f;
    }
    
    public final Object invoke() {
        final kotlin.reflect.jvm.internal.impl.builtins.c g = this.g;
        if (g.a == null) {
            g.a = this.f;
            return null;
        }
        final StringBuilder t = a.t("Built-ins module is already set: ");
        t.append(this.g.a);
        t.append(" (attempting to reset to ");
        t.append(this.f);
        t.append(")");
        throw new AssertionError((Object)t.toString());
    }
}
