// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import android.annotation.Nullable;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

public final class Person implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @Nullable
    public native Icon getIcon();
    
    @Nullable
    public native String getKey();
    
    @Nullable
    public native CharSequence getName();
    
    @Nullable
    public native String getUri();
    
    public native boolean isBot();
    
    public native boolean isImportant();
}
