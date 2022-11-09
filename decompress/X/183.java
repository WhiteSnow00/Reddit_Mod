// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 183 implements 0Hv
{
    public boolean LIZ;
    
    static {
        Covode.recordClassIndex(1892);
    }
    
    @Override
    public final boolean getEnabled() {
        return this.LIZ;
    }
    
    @Override
    public final void logDebug(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        this.getEnabled();
    }
    
    @Override
    public final void logError(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
    }
    
    @Override
    public final void logError(final String s, final String s2, final Throwable t) {
        CTM.LIZ((Object)s, (Object)s2, (Object)t);
    }
}
