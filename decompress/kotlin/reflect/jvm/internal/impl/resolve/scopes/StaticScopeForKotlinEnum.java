// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import mg2.l;
import hi2.d;
import java.util.Iterator;
import zd.b;
import java.util.List;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import mg2.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.jvm.internal.PropertyReference1;
import ug2.f;
import kotlin.jvm.internal.PropertyReference1Impl;
import ng2.h;
import ni2.e;
import ch2.c;
import ug2.k;
import hi2.g;

public final class StaticScopeForKotlinEnum extends g
{
    public static final k<Object>[] d;
    public final c b;
    public final e c;
    
    static {
        d = new k[] { (k)h.c((PropertyReference1)new PropertyReference1Impl((f)h.a((Class)StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;")) };
    }
    
    public StaticScopeForKotlinEnum(final ni2.h h, final c b) {
        ng2.e.f((Object)h, "storageManager");
        ng2.e.f((Object)b, "containingClass");
        (this.b = b).getKind();
        final ClassKind class1 = ClassKind.CLASS;
        this.c = (e)h.h((a)new StaticScopeForKotlinEnum$functions.StaticScopeForKotlinEnum$functions$2(this));
    }
    
    @Override
    public final Collection c(final yh2.e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        final List list = (List)zd.b.f0(this.c, StaticScopeForKotlinEnum.d[0]);
        final ui2.c c = new ui2.c();
        for (final Object next : list) {
            if (ng2.e.a((Object)((ch2.g)next).getName(), (Object)e)) {
                c.add(next);
            }
        }
        return c;
    }
    
    @Override
    public final ch2.e e(final yh2.e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return null;
    }
    
    @Override
    public final Collection g(final d d, final l l) {
        ng2.e.f((Object)d, "kindFilter");
        ng2.e.f((Object)l, "nameFilter");
        return (List)zd.b.f0(this.c, StaticScopeForKotlinEnum.d[0]);
    }
}
