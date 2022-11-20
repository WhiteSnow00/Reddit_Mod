// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.app.Notification$Action;
import android.graphics.RenderEffect;
import android.view.View;
import android.app.Notification$BigPictureStyle;

public final class n1
{
    public static /* bridge */ void a(final Notification$BigPictureStyle notification$BigPictureStyle, final boolean b) {
        notification$BigPictureStyle.showBigPictureWhenCollapsed(b);
    }
    
    public static /* bridge */ void b(final View view, final RenderEffect renderEffect) {
        view.setRenderEffect(renderEffect);
    }
    
    public static /* bridge */ boolean c(final Notification$Action notification$Action) {
        return notification$Action.isAuthenticationRequired();
    }
}
