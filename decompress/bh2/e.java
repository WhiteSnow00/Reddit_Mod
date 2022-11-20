// 
// Decompiled by Procyon v0.6.0
// 

package bh2;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import java.util.Iterator;
import java.util.Collection;
import oi2.t;
import java.util.ArrayList;
import ch2.c;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import ui2.b;

public final class e<N> implements b
{
    public final JvmBuiltInsCustomizer f;
    
    public e(final JvmBuiltInsCustomizer f) {
        this.f = f;
    }
    
    @Override
    public final Iterable e(final Object o) {
        final Collection e = ((ch2.e)o).n().e();
        ng2.e.e((Object)e, "it.typeConstructor.supertypes");
        final JvmBuiltInsCustomizer f = this.f;
        final ArrayList list = new ArrayList();
        final Iterator iterator = e.iterator();
        while (iterator.hasNext()) {
            final ch2.e f2 = ((t)iterator.next()).I0().f();
            LazyJavaClassDescriptor f3 = null;
            Object a;
            if (f2 != null) {
                a = f2.a();
            }
            else {
                a = null;
            }
            ch2.c c;
            if (a instanceof ch2.c) {
                c = (ch2.c)a;
            }
            else {
                c = null;
            }
            if (c != null) {
                f3 = f.f(c);
            }
            if (f3 != null) {
                list.add(f3);
            }
        }
        return list;
    }
}
