// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.host.IHostSlot;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public class 0jJ
{
    public static 0jJ LIZIZ;
    public final a LIZ;
    
    static {
        Covode.recordClassIndex(6828);
    }
    
    public 0jJ() {
        this.LIZ = new a();
    }
    
    public static 0jJ LIZ() {
        MethodCollector.i(1400);
        if (0jJ.LIZIZ == null) {
            monitorenter(0jJ.class);
            try {
                if (0jJ.LIZIZ == null) {
                    0jJ.LIZIZ = new 0jJ();
                }
                monitorexit(0jJ.class);
            }
            finally {
                monitorexit(0jJ.class);
                MethodCollector.o(1400);
            }
        }
        final 0jJ liziz = 0jJ.LIZIZ;
        MethodCollector.o(1400);
        return liziz;
    }
    
    private List<Hki> LIZ(final List<Ei7> list) {
        final ArrayList list2 = new ArrayList();
        if (list == null) {
            return list2;
        }
        for (final Ei7 liz : list) {
            final Hki hki = new Hki();
            hki.LIZ = liz;
            list2.add(hki);
        }
        return list2;
    }
    
    public final List<Hki> LIZ(final Eel eel) {
        final a liz = this.LIZ;
        liz.LIZ();
        return this.LIZ(liz.LIZIZ.get(eel));
    }
    
    public final List<Hki> LIZ(final EiA eiA) {
        final a liz = this.LIZ;
        liz.LIZ();
        return this.LIZ(liz.LIZ.get(eiA));
    }
    
    public final EgC LIZIZ(final EiA eiA) {
        final a liz = this.LIZ;
        liz.LIZ();
        return liz.LIZJ.get(eiA);
    }
    
    public static final class a
    {
        public Map<EiA, List<Ei7>> LIZ;
        public Map<Eel, List<Ei7>> LIZIZ;
        public Map<EiA, EgC> LIZJ;
        public Map<String, Ei7> LIZLLL;
        public Map<String, EgC> LJ;
        public volatile boolean LJFF;
        
        static {
            Covode.recordClassIndex(6829);
        }
        
        public a() {
            this.LIZ = new HashMap<EiA, List<Ei7>>();
            this.LIZIZ = new HashMap<Eel, List<Ei7>>();
            this.LIZJ = new HashMap<EiA, EgC>();
            this.LIZLLL = new HashMap<String, Ei7>();
            this.LJ = new HashMap<String, EgC>();
            this.LJFF = false;
        }
        
        public final a LIZ() {
            if (!this.LJFF) {
                0jR.LIZ(IHostSlot.class).LIZ();
            }
            this.LJFF = true;
            return this;
        }
        
        public final Ei7 LIZ(final String s) {
            this.LIZ();
            return this.LIZLLL.get(s);
        }
    }
}
