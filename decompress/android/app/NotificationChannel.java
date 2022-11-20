// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import android.net.Uri;
import android.media.AudioAttributes;
import android.os.Parcelable;

public final class NotificationChannel implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public NotificationChannel(final String s, final CharSequence charSequence, final int n) {
    }
    
    public native boolean canBypassDnd();
    
    public native boolean canShowBadge();
    
    public native void enableLights(final boolean p0);
    
    public native void enableVibration(final boolean p0);
    
    public native AudioAttributes getAudioAttributes();
    
    public native String getDescription();
    
    public native String getGroup();
    
    public native String getId();
    
    public native int getImportance();
    
    public native int getLightColor();
    
    public native int getLockscreenVisibility();
    
    public native CharSequence getName();
    
    public native Uri getSound();
    
    public native long[] getVibrationPattern();
    
    public native void setDescription(final String p0);
    
    public native void setGroup(final String p0);
    
    public native void setLightColor(final int p0);
    
    public native void setName(final CharSequence p0);
    
    public native void setShowBadge(final boolean p0);
    
    public native void setSound(final Uri p0, final AudioAttributes p1);
    
    public native void setVibrationPattern(final long[] p0);
    
    public native boolean shouldShowLights();
    
    public native boolean shouldVibrate();
}
