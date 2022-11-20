// 
// Decompiled by Procyon v0.6.0
// 

package zg2;

import hi2.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import ch2.c;
import mg2.l;

public final class e implements l<yh2.e, c>
{
    public final kotlin.reflect.jvm.internal.impl.builtins.c f;
    
    public e(final kotlin.reflect.jvm.internal.impl.builtins.c f) {
        this.f = f;
    }
    
    public final Object invoke(final Object o) {
        final yh2.e e = (yh2.e)o;
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.c l = this.f.l();
        final yh2.c j = kotlin.reflect.jvm.internal.impl.builtins.e.j;
        final MemberScope q = l.D0(j).q();
        if (q == null) {
            kotlin.reflect.jvm.internal.impl.builtins.c.a(11);
            throw null;
        }
        final ch2.e e2 = ((h)q).e(e, NoLookupLocation.FROM_BUILTINS);
        if (e2 == null) {
            final StringBuilder t = a.t("Built-in class ");
            t.append(j.c(e));
            t.append(" is not found");
            throw new AssertionError((Object)t.toString());
        }
        if (e2 instanceof c) {
            return e2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Must be a class descriptor ");
        sb.append(e);
        sb.append(", but was ");
        sb.append(e2);
        throw new AssertionError((Object)sb.toString());
    }
}
