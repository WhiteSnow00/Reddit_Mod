// 
// Decompiled by Procyon v0.6.0
// 

package ui2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import ng2.k;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;
import kotlin.collections.b;
import ng2.e;
import java.util.AbstractSet;

public final class d<T> extends AbstractSet<T>
{
    public static final int h = 0;
    public Object f;
    public int g;
    
    @Override
    public final boolean add(final T f) {
        final int g = this.g;
        if (g == 0) {
            this.f = f;
        }
        else if (g == 1) {
            if (e.a(this.f, (Object)f)) {
                return false;
            }
            this.f = new Object[] { this.f, f };
        }
        else if (g < 5) {
            final Object f2 = this.f;
            e.d(f2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            final Object[] array = (Object[])f2;
            if (b.c2((Object)f, array)) {
                return false;
            }
            final int g2 = this.g;
            LinkedHashSet f3;
            if (g2 == 4) {
                final Object[] copy = Arrays.copyOf(array, array.length);
                e.f((Object)copy, "elements");
                final LinkedHashSet set = new LinkedHashSet(cg.d.p3(copy.length));
                b.B2((HashSet)set, copy);
                set.add((Object)f);
                f3 = set;
            }
            else {
                final Object[] copy2 = Arrays.copyOf(array, g2 + 1);
                e.e((Object)copy2, "copyOf(this, newSize)");
                copy2[copy2.length - 1] = f;
                f3 = (LinkedHashSet)copy2;
            }
            this.f = f3;
        }
        else {
            final Object f4 = this.f;
            e.d(f4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!k.d(f4).add(f)) {
                return false;
            }
        }
        ++this.g;
        return true;
    }
    
    @Override
    public final void clear() {
        this.f = null;
        this.g = 0;
    }
    
    @Override
    public final boolean contains(final Object o) {
        final int g = this.g;
        boolean b;
        if (g == 0) {
            b = false;
        }
        else if (g == 1) {
            b = e.a(this.f, o);
        }
        else if (g < 5) {
            final Object f = this.f;
            e.d(f, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            b = kotlin.collections.b.c2(o, (Object[])f);
        }
        else {
            final Object f2 = this.f;
            e.d(f2, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
            b = ((Set)f2).contains(o);
        }
        return b;
    }
    
    @Override
    public final Iterator<T> iterator() {
        final int g = this.g;
        Object o;
        if (g == 0) {
            o = Collections.emptySet().iterator();
        }
        else if (g == 1) {
            o = new d.d$b(this.f);
        }
        else if (g < 5) {
            final Object f = this.f;
            e.d(f, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            o = new d.d$a((Object[])f);
        }
        else {
            final Object f2 = this.f;
            e.d(f2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            o = k.d(f2).iterator();
        }
        return (Iterator<T>)o;
    }
    
    @Override
    public final int size() {
        return this.g;
    }
}
