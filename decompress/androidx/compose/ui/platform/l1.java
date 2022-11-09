// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ah2.f;
import android.graphics.Canvas;
import android.content.Context;

public final class l1 extends l0
{
    public l1(final Context context) {
        super(context);
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        f.f((Object)canvas, "canvas");
    }
    
    public final void dispatchGetDisplayList() {
    }
}
