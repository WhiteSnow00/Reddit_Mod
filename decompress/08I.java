// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;

public interface 08i
{
    public static final boolean LIZLLL = Build$VERSION.SDK_INT >= 27;
    
    default static {
        Covode.recordClassIndex(919);
    }
    
    int getAutoSizeMaxTextSize();
    
    int getAutoSizeTextType();
    
    void setAutoSizeTextTypeUniformWithConfiguration(final int p0, final int p1, final int p2, final int p3);
    
    void setAutoSizeTextTypeUniformWithPresetSizes(final int[] p0, final int p1);
    
    void setAutoSizeTextTypeWithDefaults(final int p0);
}
