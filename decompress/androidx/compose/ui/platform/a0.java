// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

public final class a0 implements k1
{
    public final ViewConfiguration a;
    
    public a0(final ViewConfiguration a) {
        this.a = a;
    }
    
    public final long a() {
        return 40L;
    }
    
    public final float b() {
        return (float)this.a.getScaledTouchSlop();
    }
    
    public final long c() {
        return ViewConfiguration.getDoubleTapTimeout();
    }
    
    public final long d() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
