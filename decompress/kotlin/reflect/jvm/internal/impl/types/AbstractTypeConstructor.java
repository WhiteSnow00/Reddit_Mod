// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import lw0.b;
import java.util.List;
import hh2.h0;
import kotlin.collections.EmptyList;
import ti2.t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import ti2.k0;
import rg2.l;
import rg2.a;
import si2.h;
import si2.e;
import ti2.g;

public abstract class AbstractTypeConstructor extends g
{
    public final e<a> b;
    
    public AbstractTypeConstructor(final h h) {
        sg2.e.f((Object)h, "storageManager");
        this.b = (e<a>)h.a((rg2.a)new AbstractTypeConstructor$supertypes.AbstractTypeConstructor$supertypes$1(this), (l)AbstractTypeConstructor$supertypes.AbstractTypeConstructor$supertypes$2.INSTANCE, (l)new AbstractTypeConstructor$supertypes.AbstractTypeConstructor$supertypes$3(this));
    }
    
    public static final Collection d(AbstractTypeConstructor abstractTypeConstructor, final k0 k0, final boolean b) {
        abstractTypeConstructor.getClass();
        if (k0 instanceof AbstractTypeConstructor) {
            abstractTypeConstructor = (AbstractTypeConstructor)k0;
        }
        else {
            abstractTypeConstructor = null;
        }
        Collection collection;
        if (abstractTypeConstructor != null) {
            collection = CollectionsKt___CollectionsKt.W3((Iterable)abstractTypeConstructor.j(b), (Collection)((rg2.a<a>)abstractTypeConstructor.b).invoke().a);
        }
        else {
            collection = k0.e();
            sg2.e.e((Object)collection, "supertypes");
        }
        return collection;
    }
    
    public abstract Collection<t> h();
    
    public t i() {
        return null;
    }
    
    public Collection<t> j(final boolean b) {
        return (Collection<t>)EmptyList.INSTANCE;
    }
    
    public abstract h0 k();
    
    public final List<t> l() {
        return (List<t>)((rg2.a<a>)this.b).invoke().b;
    }
    
    public List<t> m(final List<t> list) {
        sg2.e.f((Object)list, "supertypes");
        return list;
    }
    
    public void n(final t t) {
        sg2.e.f((Object)t, "type");
    }
    
    public static final class a
    {
        public final Collection<t> a;
        public List<? extends t> b;
        
        public a(final Collection<? extends t> a) {
            sg2.e.f((Object)a, "allSupertypes");
            this.a = (Collection<t>)a;
            this.b = b.r1((Object)vi2.h.d);
        }
    }
}
