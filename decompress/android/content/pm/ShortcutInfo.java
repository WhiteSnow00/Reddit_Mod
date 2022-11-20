// 
// Decompiled by Procyon v0.6.0
// 

package android.content.pm;

import android.os.UserHandle;
import android.content.Intent;
import android.annotation.NonNull;
import android.os.PersistableBundle;
import java.util.Set;
import android.annotation.Nullable;
import android.content.ComponentName;
import android.os.Parcelable;

public final class ShortcutInfo implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @Nullable
    public native ComponentName getActivity();
    
    @Nullable
    public native Set<String> getCategories();
    
    @Nullable
    public native CharSequence getDisabledMessage();
    
    @Nullable
    public native PersistableBundle getExtras();
    
    @NonNull
    public native String getId();
    
    @Nullable
    public native Intent[] getIntents();
    
    public native long getLastChangedTimestamp();
    
    @Nullable
    public native CharSequence getLongLabel();
    
    @NonNull
    public native String getPackage();
    
    public native int getRank();
    
    @Nullable
    public native CharSequence getShortLabel();
    
    public native UserHandle getUserHandle();
    
    public native boolean hasKeyFieldsOnly();
    
    public native boolean isDeclaredInManifest();
    
    public native boolean isDynamic();
    
    public native boolean isEnabled();
    
    public native boolean isImmutable();
    
    public native boolean isPinned();
}
