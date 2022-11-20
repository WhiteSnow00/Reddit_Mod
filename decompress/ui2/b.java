// 
// Decompiled by Procyon v0.6.0
// 

package ui2;

import java.util.HashSet;
import java.util.Set;
import mg2.l;
import java.util.Iterator;
import java.util.List;

public final class b
{
    public static void a(final int n) {
        final Object[] array = new Object[3];
        switch (n) {
            default: {
                array[0] = "nodes";
                break;
            }
            case 22: {
                array[0] = "current";
                break;
            }
            case 10:
            case 14: {
                array[0] = "node";
                break;
            }
            case 9: {
                array[0] = "predicate";
                break;
            }
            case 3:
            case 6:
            case 13:
            case 25: {
                array[0] = "handler";
                break;
            }
            case 2:
            case 12:
            case 16:
            case 19:
            case 24: {
                array[0] = "visited";
                break;
            }
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23: {
                array[0] = "neighbors";
                break;
            }
        }
        array[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (n) {
            default: {
                array[2] = "dfs";
                break;
            }
            case 22:
            case 23:
            case 24:
            case 25: {
                array[2] = "doDfs";
                break;
            }
            case 17:
            case 18:
            case 19:
            case 20:
            case 21: {
                array[2] = "topologicalOrder";
                break;
            }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16: {
                array[2] = "dfsFromNode";
                break;
            }
            case 7:
            case 8:
            case 9: {
                array[2] = "ifAny";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
    
    public static Object b(final List list, final b b, final b$a b$a) {
        final d d = new d();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            c(iterator.next(), b, d, b$a);
        }
        return ((c<N, Object>)b$a).a();
    }
    
    public static void c(final Object o, final b b, final d d, final b$a b$a) {
        if (o == null) {
            a(22);
            throw null;
        }
        if (!d.a.add((N)o)) {
            return;
        }
        if (!((c<Object, R>)b$a).b(o)) {
            return;
        }
        final Iterator<?> iterator = b.e(o).iterator();
        while (iterator.hasNext()) {
            c(iterator.next(), b, d, b$a);
        }
        ((c<Object, R>)b$a).c(o);
    }
    
    public static Boolean d(final List list, final b b, final l l) {
        if (l != null) {
            return (Boolean)b(list, b, (b$a)new a(l, new boolean[1]));
        }
        a(9);
        throw null;
    }
    
    public interface b<N>
    {
        Iterable<? extends N> e(final N p0);
    }
    
    public interface c<N, R>
    {
        R a();
        
        boolean b(final N p0);
        
        void c(final N p0);
    }
    
    public static final class d<N>
    {
        public final Set<N> a;
        
        public d() {
            final HashSet a = new HashSet();
            this.a = a;
        }
    }
}
