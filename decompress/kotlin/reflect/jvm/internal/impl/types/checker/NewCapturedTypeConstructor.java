// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import ti2.t;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.builtins.c;
import ui2.d;
import kotlin.collections.EmptyList;
import sg2.e;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.builders.ListBuilder;
import kotlin.LazyThreadSafetyMode;
import hg2.f;
import hh2.j0;
import ti2.v0;
import java.util.List;
import rg2.a;
import ti2.n0;
import gi2.b;

public final class NewCapturedTypeConstructor implements b
{
    public final n0 a;
    public a<? extends List<? extends v0>> b;
    public final NewCapturedTypeConstructor c;
    public final j0 d;
    public final f e;
    public v0 f;
    
    public NewCapturedTypeConstructor() {
        throw null;
    }
    
    public NewCapturedTypeConstructor(final n0 a, final a<? extends List<? extends v0>> b, final NewCapturedTypeConstructor c, final j0 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, (a)new NewCapturedTypeConstructor$boundSupertypes.NewCapturedTypeConstructor$boundSupertypes$2(this));
    }
    
    public final n0 b() {
        return this.a;
    }
    
    public final List<v0> c() {
        final ListBuilder listBuilder = new ListBuilder();
        final v0 f = this.f;
        if (f != null) {
            ((List)listBuilder).add(f);
        }
        final List list = this.e.getValue();
        if (list != null) {
            ((List)listBuilder).addAll(list);
        }
        return listBuilder.build();
    }
    
    public final void d(final v0 f, final ArrayList list) {
        this.f = f;
        this.b = new NewCapturedTypeConstructor$initializeSupertypes$2(list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!sg2.e.a((Object)NewCapturedTypeConstructor.class, (Object)class1)) {
            return false;
        }
        sg2.e.d(o, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor)o;
        NewCapturedTypeConstructor c;
        if ((c = this.c) == null) {
            c = this;
        }
        final NewCapturedTypeConstructor c2 = newCapturedTypeConstructor.c;
        if (c2 != null) {
            newCapturedTypeConstructor = c2;
        }
        if (c != newCapturedTypeConstructor) {
            b = false;
        }
        return b;
    }
    
    public final hh2.e f() {
        return null;
    }
    
    public final boolean g() {
        return false;
    }
    
    public final List<j0> getParameters() {
        return (List<j0>)EmptyList.INSTANCE;
    }
    
    public final NewCapturedTypeConstructor h(final d d) {
        sg2.e.f((Object)d, "kotlinTypeRefiner");
        final n0 a = this.a.a(d);
        sg2.e.e((Object)a, "projection.refine(kotlinTypeRefiner)");
        Object o;
        if (this.b != null) {
            o = new NewCapturedTypeConstructor$refine$1.NewCapturedTypeConstructor$refine$1$1(this, d);
        }
        else {
            o = null;
        }
        NewCapturedTypeConstructor c;
        if ((c = this.c) == null) {
            c = this;
        }
        return new NewCapturedTypeConstructor(a, (a<? extends List<? extends v0>>)o, c, this.d);
    }
    
    @Override
    public final int hashCode() {
        final NewCapturedTypeConstructor c = this.c;
        int n;
        if (c != null) {
            n = c.hashCode();
        }
        else {
            n = super.hashCode();
        }
        return n;
    }
    
    public final c o() {
        final t type = this.a.getType();
        sg2.e.e((Object)type, "projection.type");
        return TypeUtilsKt.g(type);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CapturedType(");
        r.append(this.a);
        r.append(')');
        return r.toString();
    }
}
