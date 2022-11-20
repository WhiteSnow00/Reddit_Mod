// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import android.annotation.NonNull;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

public final class RemoteAction implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public RemoteAction(@NonNull final Icon icon, @NonNull final CharSequence charSequence, @NonNull final CharSequence charSequence2, @NonNull final PendingIntent pendingIntent) {
    }
    
    @NonNull
    public native PendingIntent getActionIntent();
    
    @NonNull
    public native CharSequence getContentDescription();
    
    @NonNull
    public native Icon getIcon();
    
    @NonNull
    public native CharSequence getTitle();
    
    public native boolean isEnabled();
    
    public native void setEnabled(final boolean p0);
}
