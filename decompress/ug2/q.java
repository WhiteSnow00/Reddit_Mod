// 
// Decompiled by Procyon v0.6.0
// 

package ug2;

import kotlin.NotImplementedError;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.a;
import java.util.ArrayList;
import dg2.m;
import ng2.e;
import java.lang.reflect.Type;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;

public final class q implements TypeVariable<GenericDeclaration>, Type
{
    public final o f;
    
    public q(final o f) {
        e.f((Object)f, "typeParameter");
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof TypeVariable && e.a((Object)this.getName(), (Object)((TypeVariable)o).getName())) {
            this.getGenericDeclaration();
            throw null;
        }
        return false;
    }
    
    @Override
    public final Type[] getBounds() {
        final List upperBounds = this.f.getUpperBounds();
        final ArrayList list = new ArrayList(m.u4((Iterable)upperBounds, 10));
        final Iterator iterator = upperBounds.iterator();
        while (iterator.hasNext()) {
            list.add((Object)a.b((n)iterator.next(), true));
        }
        final Object[] array = list.toArray((Object[])new Type[0]);
        e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Type[])array;
    }
    
    @Override
    public final GenericDeclaration getGenericDeclaration() {
        final StringBuilder t = a.t("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        t.append(this.f);
        throw new NotImplementedError(b.l("An operation is not implemented: ", t.toString()));
    }
    
    @Override
    public final String getName() {
        return this.f.getName();
    }
    
    @Override
    public final String getTypeName() {
        return this.getName();
    }
    
    @Override
    public final int hashCode() {
        this.getName().hashCode();
        this.getGenericDeclaration();
        throw null;
    }
    
    @Override
    public final String toString() {
        return this.getName();
    }
}
