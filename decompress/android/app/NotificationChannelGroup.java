// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import java.util.List;
import android.os.Parcelable;

public final class NotificationChannelGroup implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public NotificationChannelGroup(final String s, final CharSequence charSequence) {
    }
    
    public native List<NotificationChannel> getChannels();
    
    public native String getId();
    
    public native CharSequence getName();
}
