// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.List;

public final class 1Ca implements 0OQ
{
    public List<LinkedHashMap<Long, Long>> LIZ;
    public List<LinkedHashMap<Long, Long>> LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public double LJFF;
    
    static {
        Covode.recordClassIndex(3967);
    }
    
    public 1Ca() {
        this.LIZ = new ArrayList<LinkedHashMap<Long, Long>>();
        this.LIZIZ = new ArrayList<LinkedHashMap<Long, Long>>();
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0.0;
    }
    
    public final long LIZ() {
        if (this.LIZJ == 0L && !this.LIZ.isEmpty()) {
            final Iterator<LinkedHashMap<Long, Long>> iterator = this.LIZ.iterator();
            while (iterator.hasNext()) {
                final Iterator iterator2 = iterator.next().entrySet().iterator();
                while (iterator2.hasNext()) {
                    this.LIZJ += ((Map.Entry<K, Long>)iterator2.next()).getValue();
                }
            }
        }
        return this.LIZJ;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("cputime:{deltaTime:");
        sb.append(this.LIZLLL);
        sb.append(" usage:");
        sb.append(this.LJFF);
        sb.append(" totaltime:");
        sb.append(this.LIZ());
        sb.append("}");
        return sb.toString();
    }
}
