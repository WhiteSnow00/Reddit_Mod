// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1i1 extends 1Eu
{
    public 0z4 LIZ;
    
    static {
        Covode.recordClassIndex(4823);
    }
    
    public 1i1() {
        super(-2);
    }
    
    public 1i1(final 0z4 liz) {
        super(-2);
        this.LIZ = liz;
    }
    
    @Override
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder(" TYPE = ResponseNoDataException ");
        sb.append(super.getMessage());
        return sb.toString();
    }
    
    public final 0z4 getResponse() {
        return this.LIZ;
    }
}
