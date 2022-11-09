// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collections;
import java.util.Arrays;
import java.util.LinkedList;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0gU
{
    public static final List<0g4> LJIIIIZZ;
    public static final List<String> LJIIIZ;
    public final List<0g4> LIZ;
    public final List<String> LIZIZ;
    public final 0g5 LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final String LJFF;
    public boolean LJI;
    public boolean LJII;
    
    static {
        Covode.recordClassIndex(6203);
        final List<0g4> list = LJIIIIZZ = new LinkedList<0g4>();
        final List<String> list2 = LJIIIZ = new LinkedList<String>();
        final Integer value = 3;
        final Integer value2 = 1;
        final Integer value3 = 2;
        list.add(new 0g4("beauty", Arrays.asList(value2, value3, value)));
        list.add(new 0g4(0gZ.LIZLLL, Arrays.asList(value2, value3, value)));
        list.add(new 0g4("effect_gift", Arrays.asList(value2, value)));
        list.add(new 0g4("livegame", Collections.singletonList(value)));
        list.add(new 0g4(0gZ.LIZ, Collections.singletonList(value3)));
        list.add(new 0g4(0gZ.LIZIZ, Arrays.asList(value2, value3)));
        list.add(new 0g4(0gZ.LIZJ, Arrays.asList(value2, value3)));
        list.add(new 0g4(0gZ.LIZ(), Arrays.asList(value2, value3, value)));
        list.add(new 0g4("liveguestbeauty", Arrays.asList(value2, value3, value)));
        list2.add(0gZ.LIZLLL);
        list2.add("makeupforever");
    }
    
    public 0gU(final a a) {
        this.LJI = true;
        this.LJII = true;
        this.LIZJ = a.LIZLLL;
        Object liziz;
        if (a.LIZIZ == null) {
            liziz = Collections.emptyList();
        }
        else {
            liziz = a.LIZIZ;
        }
        this.LIZIZ = (List<String>)liziz;
        Object lizlll;
        if (a.LIZJ == null) {
            lizlll = Collections.emptyList();
        }
        else {
            lizlll = a.LIZJ;
        }
        this.LIZLLL = (List<String>)lizlll;
        List<0g4> liz;
        if (a.LIZ == null || a.LIZ.isEmpty()) {
            liz = 0gU.LJIIIIZZ;
        }
        else {
            liz = a.LIZ;
        }
        this.LIZ = liz;
        this.LJ = 0gU.LJIIIZ;
        this.LJFF = a.LJ;
        this.LJI = a.LJFF;
        this.LJII = a.LJI;
    }
    
    public static final class a
    {
        public List<0g4> LIZ;
        public List<String> LIZIZ;
        public List<String> LIZJ;
        public 0g5 LIZLLL;
        public String LJ;
        public boolean LJFF;
        public boolean LJI;
        
        static {
            Covode.recordClassIndex(6204);
        }
        
        public a() {
            this.LJFF = true;
            this.LJI = true;
        }
        
        public final 0gU LIZ() {
            return new 0gU(this);
        }
    }
}
