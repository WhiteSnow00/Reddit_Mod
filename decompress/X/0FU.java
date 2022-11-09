// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import java.util.Collection;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public final class 0fu
{
    public static final 0fu LIZ;
    public static final String LIZIZ;
    public static final List<String> LIZJ;
    public static final List<String> LIZLLL;
    public static final Map<String, List<String>> LJ;
    public static final Map<String, List<String>> LJFF;
    public static final HashMap<String, String> LJI;
    
    static {
        Covode.recordClassIndex(6155);
        LIZ = new 0fu();
        LIZIZ = "beauty_group";
        final Map<String, List<String>> map = LJ = FJ4.LIZ(8sj.LIZ((Object)"beauty_group", (Object)Qsi.LIZLLL((Collection)(LIZJ = FIT.LIZ((Object)0gZ.LIZLLL)), (Iterable)(LIZLLL = FIT.LIZ((Object)"liveguestbeauty")))));
        LJFF = FJ3.LIZIZ(new 8si[] { 8sj.LIZ((Object)"broadcast", (Object)FIT.LIZ((Object)0gZ.LIZLLL)), 8sj.LIZ((Object)"guest_linkmic", (Object)FIT.LIZ((Object)"liveguestbeauty")) });
        LJI = new HashMap<String, String>();
        for (final Object next : map.keySet()) {
            final List list = 0fu.LJ.get(next);
            if (list != null) {
                for (final Object next2 : list) {
                    final HashMap<String, String> lji = 0fu.LJI;
                    n.LIZIZ(next2, "");
                    lji.put((String)next2, (String)next);
                }
            }
        }
    }
    
    public final Set<String> LIZ(final String s) {
        CTM.LIZ((Object)s);
        final Map<String, List<String>> ljff = 0fu.LJFF;
        if (!ljff.containsKey(s)) {
            return (Set<String>)6uF.INSTANCE;
        }
        Object instance;
        if ((instance = ljff.get(s)) == null) {
            instance = 6uH.INSTANCE;
        }
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator iterator = ((Iterable)instance).iterator();
        while (iterator.hasNext()) {
            final String value = 0fu.LJI.get(iterator.next());
            if (value != null) {
                final List list = 0fu.LJ.get(value);
                if (list == null) {
                    continue;
                }
                set.addAll(list);
            }
        }
        set.addAll((Collection)instance);
        return set;
    }
}
