// 
// Decompiled by Procyon v0.6.0
// 

package android.content.pm;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.PersistableBundle;
import java.util.Set;
import android.content.ComponentName;
import android.annotation.NonNull;
import android.content.Context;

public class ShortcutInfo$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public ShortcutInfo$Builder(final Context context, final String s) {
    }
    
    @NonNull
    public native ShortcutInfo build();
    
    @NonNull
    public native ShortcutInfo$Builder setActivity(@NonNull final ComponentName p0);
    
    @NonNull
    public native ShortcutInfo$Builder setCategories(final Set<String> p0);
    
    @NonNull
    public native ShortcutInfo$Builder setDisabledMessage(@NonNull final CharSequence p0);
    
    @NonNull
    public native ShortcutInfo$Builder setExtras(@NonNull final PersistableBundle p0);
    
    @NonNull
    public native ShortcutInfo$Builder setIcon(final Icon p0);
    
    @NonNull
    public native ShortcutInfo$Builder setIntent(@NonNull final Intent p0);
    
    @NonNull
    public native ShortcutInfo$Builder setIntents(@NonNull final Intent[] p0);
    
    @NonNull
    public native ShortcutInfo$Builder setLongLabel(@NonNull final CharSequence p0);
    
    @NonNull
    public native ShortcutInfo$Builder setRank(final int p0);
    
    @NonNull
    public native ShortcutInfo$Builder setShortLabel(@NonNull final CharSequence p0);
}
