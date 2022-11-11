// 
// Decompiled by Procyon v0.6.0
// 

package he2;

import java.util.Calendar;
import android.os.Parcelable;

public interface a extends Parcelable
{
    boolean I(final int p0, final int p1, final int p2);
    
    default int S0() {
        return this.V0().get(1);
    }
    
    Calendar V0();
    
    default int d0() {
        return this.y0().get(1);
    }
    
    Calendar v0(final Calendar p0);
    
    Calendar y0();
}
