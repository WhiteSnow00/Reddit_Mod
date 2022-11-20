// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

public final class y implements k1
{
    public final ViewConfiguration a;
    
    public y(final ViewConfiguration a) {
        this.a = a;
    }
    
    @Override
    public final long a() {
        return 40L;
    }
    
    @Override
    public final float b() {
        return (float)this.a.getScaledTouchSlop();
    }
    
    @Override
    public final long c() {
        return ViewConfiguration.getDoubleTapTimeout();
    }
    
    @Override
    public final long d() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
