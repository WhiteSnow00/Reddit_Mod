// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class 0Vr extends IOException
{
    public int LIZ;
    public String LIZIZ;
    public int statusCode;
    
    static {
        Covode.recordClassIndex(4914);
    }
    
    public 0Vr(final int statusCode, final int liz, final String liziz) {
        this.statusCode = statusCode;
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public 0Vr(final int statusCode, final int liz, final String liziz, final String s, final Throwable t) {
        super(s, t);
        this.statusCode = statusCode;
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final int getCronetError() {
        return this.LIZ;
    }
    
    @Override
    public final String getMessage() {
        return this.LIZIZ;
    }
    
    public final int getStatusCode() {
        return this.statusCode;
    }
}
