// 
// Decompiled by Procyon v0.6.0
// 

package a5;

import android.widget.RemoteViews;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.core.app.NotificationCompat$Style;

public final class b extends NotificationCompat$Style
{
    public int[] a;
    public MediaSessionCompat$Token b;
    
    public b() {
        this.a = null;
    }
    
    public final void apply(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        a5.a.d(notificationBuilderWithBuilderAccessor.getBuilder(), a5.a.b(a5.a.a(), this.a, this.b));
    }
    
    public final RemoteViews makeBigContentView(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }
    
    public final RemoteViews makeContentView(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }
}
