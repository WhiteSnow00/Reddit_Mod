// 
// Decompiled by Procyon v0.6.0
// 

package android.content.pm;

import android.annotation.NonNull;
import java.util.List;

public class ShortcutManager
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @NonNull
    public native List<ShortcutInfo> getDynamicShortcuts();
    
    public native int getIconMaxHeight();
    
    public native int getIconMaxWidth();
    
    public native int getMaxShortcutCountPerActivity();
    
    @NonNull
    public native List<ShortcutInfo> getPinnedShortcuts();
    
    public native boolean setDynamicShortcuts(@NonNull final List<ShortcutInfo> p0);
}
