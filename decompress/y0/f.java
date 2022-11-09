// 
// Decompiled by Procyon v0.6.0
// 

package y0;

import ei2.s;
import eg.u1;
import ig.k0;
import ig.l0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import ph2.c;
import ee.i;
import ee.h;
import ee.e;
import androidx.compose.material.ripple.a;
import yh2.d$a;
import yh2.d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import qc2.b;
import java.util.Map;
import android.content.res.Resources;
import java.util.LinkedHashMap;
import ig.m0;
import qd.m;

public final class f implements m, m0
{
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    
    public f(final int f) {
        this.f = f;
        if (f != 1) {
            this.g = new LinkedHashMap();
            this.h = new LinkedHashMap();
            return;
        }
    }
    
    public f(final Map g) {
        this.f = 5;
        this.h = b.a;
        this.g = g;
    }
    
    public f(final LazyJavaPackageFragmentProvider g) {
        final d$a a = d.a;
        this.f = 6;
        this.g = g;
        this.h = a;
    }
    
    public final void a(final a a) {
        ah2.f.f((Object)a, "indicationInstance");
        final g g = ((Map)this.g).get(a);
        if (g != null) {
            final a a2 = ((Map)this.h).remove(g);
        }
        ((Map)this.g).remove(a);
    }
    
    public final void accept(final Object o, final Object o2) {
        ((h)o).C().D((String)this.h, new i((xe.h)o2));
    }
    
    public final c b(final ei2.g g) {
        final li2.c d = g.d();
        c v = null;
        final c c = null;
        if (d != null) {
            g.w();
            if (LightClassOriginKind.SOURCE == null) {
                ((d$a)this.h).getClass();
                return null;
            }
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a a = g.A();
        if (a != null) {
            final c b = this.b((ei2.g)a);
            Object g2;
            if (b != null) {
                g2 = b.G();
            }
            else {
                g2 = null;
            }
            Object f;
            if (g2 != null) {
                f = ((ui2.h)g2).f(((s)g).getName(), NoLookupLocation.FROM_JAVA_LOADER);
            }
            else {
                f = null;
            }
            c c2 = c;
            if (f instanceof c) {
                c2 = (c)f;
            }
            return c2;
        }
        if (d == null) {
            return null;
        }
        final LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = (LazyJavaPackageFragmentProvider)this.g;
        final li2.c e = d.e();
        ah2.f.e((Object)e, "fqName.parent()");
        final LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment)CollectionsKt___CollectionsKt.s1(lazyJavaPackageFragmentProvider.a(e));
        if (lazyJavaPackageFragment != null) {
            final LazyJavaPackageScope d2 = lazyJavaPackageFragment.o.d;
            d2.getClass();
            v = d2.v(((s)g).getName(), g);
        }
        return v;
    }
    
    @Override
    public final boolean equals(final Object o) {
        switch (this.f) {
            default: {
                return super.equals(o);
            }
            case 1: {
                final boolean b = o instanceof z3.c;
                boolean b2 = true;
                if (b) {
                    final z3.c c = (z3.c)o;
                    c.getClass();
                    if (this.g == null) {
                        c.getClass();
                        if (this.h == null) {
                            return b2;
                        }
                    }
                }
                b2 = false;
                return b2;
            }
        }
    }
    
    @Override
    public final int hashCode() {
        switch (this.f) {
            default: {
                return super.hashCode();
            }
            case 1: {
                final Object g = this.g;
                int hashCode = 0;
                int hashCode2;
                if (g == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = g.hashCode();
                }
                final Object h = this.h;
                if (h != null) {
                    hashCode = h.hashCode();
                }
                return hashCode2 ^ hashCode;
            }
        }
    }
    
    @Override
    public final String toString() {
        switch (this.f) {
            default: {
                return super.toString();
            }
            case 5: {
                return this.g.toString();
            }
            case 1: {
                final StringBuilder k = a.k("Pair{");
                k.append(this.g);
                k.append(" ");
                k.append(this.h);
                k.append("}");
                return k.toString();
            }
        }
    }
}
