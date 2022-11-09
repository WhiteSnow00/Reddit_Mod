// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 1h3 extends 1BN<0Ji>
{
    public final 0Ji LJ;
    
    static {
        Covode.recordClassIndex(2256);
    }
    
    public 1h3(final List<0LG<0Ji>> list) {
        super(list);
        int length = 0;
        final 0Ji 0Ji = (0Ji)list.get(0).LIZIZ;
        if (0Ji != null) {
            length = 0Ji.LIZIZ.length;
        }
        this.LJ = new 0Ji(new float[length], new int[length]);
    }
}
