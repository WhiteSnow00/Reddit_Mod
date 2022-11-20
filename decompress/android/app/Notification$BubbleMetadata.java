// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import android.graphics.drawable.Icon;
import android.annotation.Nullable;
import android.os.Parcelable;

public final class Notification$BubbleMetadata implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public native boolean getAutoExpandBubble();
    
    @Nullable
    public native PendingIntent getDeleteIntent();
    
    public native int getDesiredHeight();
    
    public native int getDesiredHeightResId();
    
    @Nullable
    public native Icon getIcon();
    
    @Nullable
    public native PendingIntent getIntent();
    
    public native boolean isNotificationSuppressed();
}
