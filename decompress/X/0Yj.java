// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.Map;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArraySet;

public final class 0yj
{
    public static final CopyOnWriteArraySet<0yi> LIZ;
    public static final 0yj LIZIZ;
    
    static {
        Covode.recordClassIndex(10435);
        LIZIZ = new 0yj();
        LIZ = new CopyOnWriteArraySet<0yi>();
    }
    
    public final void LIZ(final Map<String, String> map) {
        final Iterator<Object> iterator = 0yj.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ(map);
        }
    }
}
