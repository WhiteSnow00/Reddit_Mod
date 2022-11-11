// 
// Decompiled by Procyon v0.6.0
// 

package th2;

import sg2.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import rg2.l;
import java.util.Set;
import hg2.j;
import hh2.c;
import zi2.b$a;

public final class b extends b$a<c, j>
{
    public final /* synthetic */ c a;
    public final /* synthetic */ Set<Object> b;
    public final /* synthetic */ l<MemberScope, Collection<Object>> c;
    
    public b(final LazyJavaClassDescriptor a, final Set b, final l c) {
        this.a = (c)a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean b(final Object o) {
        final c c = (c)o;
        e.f((Object)c, "current");
        if (c != this.a) {
            final MemberScope r0 = c.r0();
            e.e((Object)r0, "current.staticScope");
            if (r0 instanceof th2.c) {
                this.b.addAll(this.c.invoke(r0));
                return false;
            }
        }
        return true;
    }
}
