// 
// Decompiled by Procyon v0.6.0
// 

package w2;

import ng2.e;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

public final class a extends ViewOutlineProvider
{
    public final void getOutline(final View view, final Outline outline) {
        e.f((Object)view, "view");
        e.f((Object)outline, "result");
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
