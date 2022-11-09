// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import X.0CH;
import X.15t;
import X.0CG;
import java.util.LinkedHashSet;
import X.0Bp;
import X.CnW;
import com.bytedance.provider.vm.ScopeViewModel;
import X.0Bq;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0CC;
import java.util.Set;
import java.util.HashMap;
import X.0Bw;
import X.0Bu;

public final class SharedViewModelProvider extends 0Bu
{
    public static final 0Bw LIZJ;
    public static final HashMap<String, Set<0CC>> LIZLLL;
    public 0Bw LIZ;
    public HashMap<String, Set<0CC>> LIZIZ;
    
    static {
        Covode.recordClassIndex(1213);
        LIZJ = new 0Bw();
        LIZLLL = new HashMap<String, Set<0CC>>();
    }
    
    public SharedViewModelProvider(final b b) {
        CTM.LIZ((Object)b);
        final 0Bw lizj = SharedViewModelProvider.LIZJ;
        super(lizj, b);
        this.LIZ = lizj;
        this.LIZIZ = SharedViewModelProvider.LIZLLL;
    }
    
    public static 0Bq LIZ(final 0Bu 0Bu, final String s, final Class clazz) {
        if (clazz.equals(ScopeViewModel.class)) {
            return 0Bu.LIZ(s, (Class<0Bq>)clazz);
        }
        final 0Bq liz = 0Bu.LIZ(s, (Class<0Bq>)clazz);
        if (CnW.LIZ) {
            0Bp.LIZ(liz, 0Bu);
        }
        return liz;
    }
    
    public final <T extends 0Bq> T LIZ(final 0CC 0cc, final Class<T> clazz) {
        CTM.LIZ((Object)0cc, (Object)clazz);
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            return this.LIZ(0cc, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName)), clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    public final <T extends 0Bq> T LIZ(final 0CC 0cc, final String s, final Class<T> clazz) {
        CTM.LIZ((Object)0cc, (Object)s, (Object)clazz);
        if (0cc.LIZ() != 0CC.b.DESTROYED) {
            final 0Bq liz = LIZ(this, s, clazz);
            Set value;
            if ((value = this.LIZIZ.get(s)) == null) {
                value = new LinkedHashSet();
            }
            final Set set = value;
            this.LIZIZ.put(s, set);
            if (!set.contains(0cc)) {
                set.add(0cc);
                0cc.LIZ(new ClearUselessViewModelObserver(0cc, s, this.LIZ, this.LIZIZ));
            }
            return (T)liz;
        }
        throw new IllegalStateException("Could not get viewmodel when lifecycle was destroyed");
    }
    
    @Override
    public final <T extends 0Bq> T LIZ(final Class<T> clazz) {
        CTM.LIZ((Object)clazz);
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }
    
    @Override
    public final <T extends 0Bq> T LIZ(final String s, final Class<T> clazz) {
        CTM.LIZ((Object)s, (Object)clazz);
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }
    
    public static final class ClearUselessViewModelObserver implements 15t
    {
        public final 0CC LIZ;
        public final String LIZIZ;
        public final 0Bw LIZJ;
        public final HashMap<String, Set<0CC>> LIZLLL;
        
        static {
            Covode.recordClassIndex(1214);
        }
        
        public ClearUselessViewModelObserver(final 0CC liz, final String liziz, final 0Bw lizj, final HashMap<String, Set<0CC>> lizlll) {
            CTM.LIZ((Object)liz, (Object)liziz, (Object)lizj, (Object)lizlll);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
        }
        
        @Override
        public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
            CTM.LIZ((Object)0ch, (Object)a);
            if (a == 0CC.a.ON_DESTROY) {
                Set value;
                if ((value = this.LIZLLL.get(this.LIZIZ)) == null) {
                    value = new LinkedHashSet();
                }
                final Set set = value;
                set.remove(this.LIZ);
                if (set.isEmpty()) {
                    0Bw.LIZ(this.LIZJ, this.LIZIZ, null);
                    this.LIZLLL.remove(this.LIZIZ);
                }
            }
        }
    }
}
