// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1Cv implements 0P1
{
    public final String LIZ;
    
    static {
        Covode.recordClassIndex(4056);
    }
    
    public 1Cv() {
        this.LIZ = "DefaultReportWay";
    }
    
    @Override
    public final String LIZ() {
        return this.LIZ;
    }
    
    @Override
    public final void LIZ(final 0Of 0Of) {
        CTM.LIZ((Object)0Of);
        final StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        sb.append(" {e.msg} ");
        sb.append(0Of.getCode());
        throw new RuntimeException(sb.toString());
    }
    
    @Override
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
    }
}
