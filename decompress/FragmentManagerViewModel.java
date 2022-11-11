// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import X.0Bw;
import java.util.HashMap;
import java.util.HashSet;
import X.0Bu;
import X.0Bq;

public class FragmentManagerViewModel extends 0Bq
{
    public static final 0Bu.b LJFF;
    public final HashSet<Fragment> LIZ;
    public final HashMap<String, FragmentManagerViewModel> LIZIZ;
    public final HashMap<String, 0Bw> LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public boolean LJI;
    
    static {
        Covode.recordClassIndex(1043);
        LJFF = new 0Bu.b() {
            static {
                Covode.recordClassIndex(1044);
            }
            
            @Override
            public final <T extends 0Bq> T LIZ(final Class<T> clazz) {
                return (T)new FragmentManagerViewModel(true);
            }
        };
    }
    
    public FragmentManagerViewModel(final boolean lizlll) {
        this.LIZ = new HashSet<Fragment>();
        this.LIZIZ = new HashMap<String, FragmentManagerViewModel>();
        this.LIZJ = new HashMap<String, 0Bw>();
        this.LJ = false;
        this.LJI = false;
        this.LIZLLL = lizlll;
    }
    
    public static FragmentManagerViewModel LIZ(final 0Bw 0Bw) {
        return new 0Bu(0Bw, FragmentManagerViewModel.LJFF).LIZ(FragmentManagerViewModel.class);
    }
    
    public final boolean LIZ(final Fragment fragment) {
        return this.LIZ.add(fragment);
    }
    
    public final boolean LIZIZ(final Fragment fragment) {
        if (!this.LIZ.contains(fragment)) {
            return true;
        }
        if (this.LIZLLL) {
            return this.LJ;
        }
        return !this.LJI;
    }
    
    public final boolean LIZJ(final Fragment fragment) {
        return this.LIZ.remove(fragment);
    }
    
    public final void LIZLLL(final Fragment fragment) {
        final 0Bq 0Bq = this.LIZIZ.get(fragment.mWho);
        if (0Bq != null) {
            0Bq.onCleared();
            this.LIZIZ.remove(fragment.mWho);
        }
        final 0Bw 0Bw = this.LIZJ.get(fragment.mWho);
        if (0Bw != null) {
            X.0Bw.LIZIZ(0Bw);
            this.LIZJ.remove(fragment.mWho);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel)o;
            if (this.LIZ.equals(fragmentManagerViewModel.LIZ) && this.LIZIZ.equals(fragmentManagerViewModel.LIZIZ) && this.LIZJ.equals(fragmentManagerViewModel.LIZJ)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.LIZ.hashCode() * 31 + this.LIZIZ.hashCode()) * 31 + this.LIZJ.hashCode();
    }
    
    @Override
    public void onCleared() {
        this.LJ = true;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        final Iterator<Fragment> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator<String> iterator2 = this.LIZIZ.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append(iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator<String> iterator3 = this.LIZJ.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append(iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
