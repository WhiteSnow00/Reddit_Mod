// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import kotlin.jvm.internal.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Collections;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public final class 0zn<T>
{
    public final ArrayList<T> LIZ;
    public final LinkedList<T> LIZIZ;
    public final List<T> LIZJ;
    public final List<T> LIZLLL;
    public final Set<a<T>> LJ;
    public boolean LJFF;
    
    static {
        Covode.recordClassIndex(10624);
    }
    
    public 0zn(final int n) {
        final ArrayList liz = new ArrayList(n);
        this.LIZ = liz;
        final LinkedList liziz = new LinkedList();
        this.LIZIZ = liziz;
        this.LIZJ = (List<T>)Collections.unmodifiableList((List<?>)liz);
        this.LIZLLL = (List<T>)Collections.unmodifiableList((List<?>)liziz);
        this.LJ = new LinkedHashSet<a<T>>();
    }
    
    private final boolean LIZ(final Set<a<T>> set, final T t) {
        if (this.LJ.size() == 0) {
            return false;
        }
        final Iterator<Object> iterator = (Iterator<Object>)set.iterator();
        boolean b = false;
    Label_0021:
        while (true) {
            b = true;
            while (iterator.hasNext()) {
                final a a = iterator.next();
                if (b && a.LIZ(t)) {
                    continue Label_0021;
                }
                b = false;
            }
            break;
        }
        return b;
    }
    
    private final void LJ() {
        this.LIZIZ.clear();
        if (this.LJFF) {
            for (final T next : this.LIZ) {
                if (!this.LIZLLL(next)) {
                    this.LIZIZ.add(next);
                }
            }
        }
    }
    
    public final int LIZ(final T t) {
        if (this.LJFF) {
            return this.LIZIZ.indexOf(t);
        }
        return this.LIZ.indexOf(t);
    }
    
    public final T LIZ(final int n) {
        return this.LIZ.get(n);
    }
    
    public final T LIZ(int index, final T t) {
        final T value = this.LIZ.get(index);
        this.LIZ.set(index, t);
        if (this.LJFF) {
            index = this.LIZIZ.indexOf(value);
            if (index != -1) {
                this.LIZIZ.set(index, t);
            }
        }
        return value;
    }
    
    public final List<T> LIZ() {
        if (this.LJFF) {
            final List<T> lizlll = this.LIZLLL;
            n.LIZIZ((Object)lizlll, "");
            return lizlll;
        }
        final List<T> lizj = this.LIZJ;
        n.LIZIZ((Object)lizj, "");
        return lizj;
    }
    
    public final void LIZ(final a<T> a) {
        CTM.LIZ((Object)a);
        this.LJFF = true;
        this.LJ.add(a);
        this.LJ();
    }
    
    public final void LIZ(final a<T> a, final a<T> a2) {
        CTM.LIZ((Object)a, (Object)a2);
        this.LJ.remove(a);
        this.LJ.add(a2);
        this.LJFF = true;
        this.LJ();
    }
    
    public final boolean LIZ(final Collection<? extends T> collection) {
        CTM.LIZ((Object)collection);
        boolean addAll;
        boolean b = addAll = this.LIZ.addAll(collection);
        if (this.LJFF) {
            final Iterator<? extends T> iterator = collection.iterator();
            while (true) {
                addAll = b;
                if (!iterator.hasNext()) {
                    break;
                }
                final T next = iterator.next();
                if (this.LIZLLL(next)) {
                    continue;
                }
                b = (this.LIZIZ.add(next) || b);
            }
        }
        return addAll;
    }
    
    public final T LIZIZ(final int n) {
        if (this.LJFF) {
            return this.LIZIZ.get(n);
        }
        return this.LIZ.get(n);
    }
    
    public final List<T> LIZIZ() {
        final List<T> lizj = this.LIZJ;
        n.LIZIZ((Object)lizj, "");
        return lizj;
    }
    
    public final void LIZIZ(final a<T> a) {
        CTM.LIZ((Object)a);
        this.LJ.remove(a);
        this.LJFF = (this.LJ.isEmpty() ^ true);
        this.LJ();
    }
    
    public final boolean LIZIZ(final T t) {
        boolean add;
        final boolean b = add = this.LIZ.add(t);
        if (this.LJFF) {
            add = b;
            if (!this.LIZLLL(t)) {
                add = (this.LIZIZ.add(t) && b);
            }
        }
        return add;
    }
    
    public final List<T> LIZJ(final int n) {
        final List<T> subList = this.LIZ.subList(0, n);
        n.LIZIZ((Object)subList, "");
        return subList;
    }
    
    public final boolean LIZJ() {
        if (this.LJFF) {
            return this.LIZIZ.isEmpty();
        }
        return this.LIZ.isEmpty();
    }
    
    public final boolean LIZJ(final T t) {
        boolean remove;
        final boolean b = remove = this.LIZ.remove(t);
        if (this.LJFF) {
            remove = b;
            if (!this.LIZLLL(t)) {
                remove = (this.LIZIZ.remove(t) && b);
            }
        }
        return remove;
    }
    
    public final int LIZLLL() {
        if (this.LJFF) {
            return this.LIZIZ.size();
        }
        return this.LIZ.size();
    }
    
    public final boolean LIZLLL(final T t) {
        return this.LJFF && this.LIZ(this.LJ, t);
    }
    
    public interface a<T>
    {
        default static {
            Covode.recordClassIndex(10625);
        }
        
        boolean LIZ(final T p0);
    }
}
