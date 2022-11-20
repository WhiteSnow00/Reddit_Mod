// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import android.graphics.Canvas;
import android.content.Context;

public final class l1 extends j0
{
    public l1(final Context context) {
        super(context);
    }
    
    @Override
    public final void dispatchDraw(final Canvas canvas) {
        e.f((Object)canvas, "canvas");
    }
    
    public final void dispatchGetDisplayList() {
    }
}
