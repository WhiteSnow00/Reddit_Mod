// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import android.annotation.Nullable;
import android.graphics.drawable.Icon;
import android.annotation.NonNull;

public final class Notification$BubbleMetadata$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @Deprecated
    public Notification$BubbleMetadata$Builder() {
    }
    
    public Notification$BubbleMetadata$Builder(@NonNull final PendingIntent pendingIntent, @NonNull final Icon icon) {
    }
    
    public Notification$BubbleMetadata$Builder(@NonNull final String s) {
    }
    
    @NonNull
    public native Notification$BubbleMetadata build();
    
    @NonNull
    public native Notification$BubbleMetadata$Builder setAutoExpandBubble(final boolean p0);
    
    @NonNull
    public native Notification$BubbleMetadata$Builder setDeleteIntent(@Nullable final PendingIntent p0);
    
    @NonNull
    public native Notification$BubbleMetadata$Builder setDesiredHeight(final int p0);
    
    @NonNull
    public native Notification$BubbleMetadata$Builder setDesiredHeightResId(final int p0);
    
    @NonNull
    public native Notification$BubbleMetadata$Builder setIcon(@NonNull final Icon p0);
    
    @NonNull
    public native Notification$BubbleMetadata$Builder setIntent(@NonNull final PendingIntent p0);
    
    @NonNull
    public native Notification$BubbleMetadata$Builder setSuppressNotification(final boolean p0);
}
