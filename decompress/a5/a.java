// 
// Decompiled by Procyon v0.6.0
// 

package a5;

import android.app.Notification$Style;
import android.app.Notification$Builder;
import android.media.session.MediaSession$Token;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.app.Notification$MediaStyle;

public final class a
{
    public static Notification$MediaStyle a() {
        return new Notification$MediaStyle();
    }
    
    public static Notification$MediaStyle b(final Notification$MediaStyle notification$MediaStyle, final int[] array, final MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (array != null) {
            e(notification$MediaStyle, array);
        }
        if (mediaSessionCompat$Token != null) {
            c(notification$MediaStyle, (MediaSession$Token)mediaSessionCompat$Token.g);
        }
        return notification$MediaStyle;
    }
    
    public static void c(final Notification$MediaStyle notification$MediaStyle, final MediaSession$Token mediaSession) {
        notification$MediaStyle.setMediaSession(mediaSession);
    }
    
    public static void d(final Notification$Builder notification$Builder, final Notification$MediaStyle style) {
        notification$Builder.setStyle((Notification$Style)style);
    }
    
    public static void e(final Notification$MediaStyle notification$MediaStyle, final int... showActionsInCompactView) {
        notification$MediaStyle.setShowActionsInCompactView(showActionsInCompactView);
    }
}
