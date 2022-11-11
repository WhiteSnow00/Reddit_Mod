// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import com.bytedance.covode.number.Covode;

public final class 0Of extends RuntimeException
{
    public final String LIZ;
    public final String LIZIZ;
    public final Throwable LIZJ;
    
    static {
        Covode.recordClassIndex(3998);
    }
    
    public 0Of(final String liz, final String liziz, final Throwable lizj) {
        CTM.LIZ((Object)liz, (Object)liziz);
        super(liz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final String getCode() {
        return this.LIZIZ;
    }
    
    public final String getMsg() {
        return this.LIZ;
    }
    
    public final Throwable getT() {
        return this.LIZJ;
    }
}
