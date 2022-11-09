// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1i0 extends 1Eu
{
    static {
        Covode.recordClassIndex(4822);
    }
    
    public 1i0() {
        super(-1);
    }
    
    @Override
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder(" TYPE = EmptyResponseException ");
        sb.append(super.getMessage());
        return sb.toString();
    }
}
