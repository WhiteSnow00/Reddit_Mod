// 
// Decompiled by Procyon v0.6.0
// 

package b70;

import sg2.e;
import com.reddit.domain.targeting.LowFrequencyData;
import javax.inject.Inject;
import bf0.a;

public final class c implements a
{
    public final g a;
    public final f b;
    
    @Inject
    public c(final g a, final f b) {
        this.a = a;
        this.b = b;
    }
    
    public final LowFrequencyData a() {
        LowFrequencyData a;
        if ((a = this.b.a()) == null) {
            final LowFrequencyData a2 = this.a.a();
            if ((a = a2) != null) {
                this.b.b(a2);
                a = a2;
            }
        }
        return a;
    }
    
    public final void b(final LowFrequencyData lowFrequencyData) {
        e.f((Object)lowFrequencyData, "lowFrequencyData");
        this.b.b(lowFrequencyData);
        this.a.b(lowFrequencyData);
    }
}
