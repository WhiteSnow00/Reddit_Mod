// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Locale;
import com.bytedance.covode.number.Covode;
import android.os.LocaleList;

public final class 14F implements 06Z
{
    public final LocaleList LIZ;
    
    static {
        Covode.recordClassIndex(732);
    }
    
    public 14F(final LocaleList liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final Object LIZ() {
        return this.LIZ;
    }
    
    @Override
    public final Locale LIZIZ() {
        return this.LIZ.get(0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.LIZ.equals(((06Z)o).LIZ());
    }
    
    @Override
    public final int hashCode() {
        return this.LIZ.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.LIZ.toString();
    }
}
