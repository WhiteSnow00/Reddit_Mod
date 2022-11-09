// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.ArrayList;

public final class 05l<T>
{
    public final 07T.a<ArrayList<T>> LIZ;
    public final 050<T, ArrayList<T>> LIZIZ;
    public final ArrayList<T> LIZJ;
    public final HashSet<T> LIZLLL;
    
    static {
        Covode.recordClassIndex(655);
    }
    
    public 05l() {
        this.LIZ = new 07T.b<ArrayList<T>>(10);
        this.LIZIZ = new 050<T, ArrayList<T>>();
        this.LIZJ = new ArrayList<T>();
        this.LIZLLL = new HashSet<T>();
    }
    
    private void LIZ(final T t, final ArrayList<T> list, final HashSet<T> set) {
        if (list.contains(t)) {
            return;
        }
        if (!set.contains(t)) {
            set.add(t);
            final ArrayList list2 = this.LIZIZ.get(t);
            if (list2 != null) {
                for (int i = 0; i < list2.size(); ++i) {
                    this.LIZ(list2.get(i), (ArrayList<Object>)list, (HashSet<Object>)set);
                }
            }
            set.remove(t);
            list.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
    
    public final ArrayList<T> LIZ() {
        this.LIZJ.clear();
        this.LIZLLL.clear();
        for (int size = this.LIZIZ.size(), i = 0; i < size; ++i) {
            this.LIZ(this.LIZIZ.LIZIZ(i), this.LIZJ, this.LIZLLL);
        }
        return this.LIZJ;
    }
    
    public final void LIZ(final T t) {
        if (!this.LIZIZ.containsKey(t)) {
            this.LIZIZ.put(t, null);
        }
    }
    
    public final List LIZIZ(final T t) {
        return this.LIZIZ.get(t);
    }
}
