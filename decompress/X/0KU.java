// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0kU<T>
{
    public T LIZ;
    public final String LIZIZ;
    
    static {
        Covode.recordClassIndex(7148);
    }
    
    public 0kU(final String liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
    }
    
    public final T LIZ(Object value, final SRC<?> src) {
        CTM.LIZ(value, (Object)src);
        if (this.LIZ == null) {
            final 1jw liz = 1jw.LIZ;
            final String liziz = this.LIZIZ;
            CTM.LIZ((Object)this, (Object)liziz);
            if (!((value = liz.LIZ().get(liziz)) instanceof Object)) {
                value = null;
            }
            this.LIZ = (T)value;
        }
        return this.LIZ;
    }
}
