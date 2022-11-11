// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import hh2.g;
import hh2.v;
import hh2.t;
import hh2.c;
import hh2.e;
import si2.h;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

public abstract class b extends AbstractTypeConstructor
{
    public b(final h h) {
        if (h != null) {
            super(h);
            return;
        }
        p(0);
        throw null;
    }
    
    public static /* synthetic */ void p(final int n) {
        String s;
        if (n != 1 && n != 3 && n != 4) {
            s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            s = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 1 && n != 3 && n != 4) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] array = new Object[n2];
        Label_0092: {
            if (n != 1) {
                if (n == 2) {
                    array[0] = "classifier";
                    break Label_0092;
                }
                if (n != 3 && n != 4) {
                    array[0] = "storageManager";
                    break Label_0092;
                }
            }
            array[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (n != 1) {
            if (n != 3 && n != 4) {
                array[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            else {
                array[1] = "getAdditionalNeighboursInSupertypeGraph";
            }
        }
        else {
            array[1] = "getBuiltIns";
        }
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4) {
                    array[2] = "<init>";
                }
            }
            else {
                array[2] = "isSameClassifier";
            }
        }
        final String format = String.format(s, array);
        RuntimeException ex;
        if (n != 1 && n != 3 && n != 4) {
            ex = new IllegalArgumentException(format);
        }
        else {
            ex = new IllegalStateException(format);
        }
        throw ex;
    }
    
    @Override
    public final boolean c(final e e) {
        final boolean b = e instanceof c;
        final boolean b2 = true;
        if (b) {
            final c q = this.q();
            sg2.e.f((Object)q, "first");
            boolean b3 = false;
            Label_0195: {
                Label_0169: {
                    if (sg2.e.a((Object)((hh2.g)q).getName(), (Object)((hh2.g)e).getName())) {
                        hh2.g g = ((hh2.h)q).b();
                        hh2.g g2 = ((hh2.h)e).b();
                        while (g != null && g2 != null) {
                            if (g instanceof t) {
                                b3 = (g2 instanceof t);
                                break Label_0195;
                            }
                            if (g2 instanceof t) {
                                break Label_0169;
                            }
                            if (g instanceof v) {
                                if (g2 instanceof v && sg2.e.a((Object)((v)g).d(), (Object)((v)g2).d())) {
                                    break;
                                }
                                break Label_0169;
                            }
                            else {
                                if (g2 instanceof v) {
                                    break Label_0169;
                                }
                                if (!sg2.e.a((Object)g.getName(), (Object)g2.getName())) {
                                    break Label_0169;
                                }
                                g = g.b();
                                g2 = g2.b();
                            }
                        }
                        b3 = true;
                        break Label_0195;
                    }
                }
                b3 = false;
            }
            if (b3) {
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public final ti2.t i() {
        if (kotlin.reflect.jvm.internal.impl.builtins.c.I(this.q())) {
            return null;
        }
        return (ti2.t)this.o().f();
    }
    
    @Override
    public final Collection<ti2.t> j(final boolean b) {
        final hh2.g b2 = this.q().b();
        if (b2 instanceof c) {
            final zi2.c c = new zi2.c();
            final c c2 = (c)b2;
            c.add((Object)c2.q());
            final c s0 = c2.s0();
            if (b && s0 != null) {
                c.add((Object)s0.q());
            }
            return (Collection<ti2.t>)c;
        }
        final List<Object> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return (Collection<ti2.t>)emptyList;
        }
        p(3);
        throw null;
    }
    
    public final kotlin.reflect.jvm.internal.impl.builtins.c o() {
        final kotlin.reflect.jvm.internal.impl.builtins.c e = DescriptorUtilsKt.e((hh2.g)this.q());
        if (e != null) {
            return e;
        }
        p(1);
        throw null;
    }
    
    public abstract c q();
}
