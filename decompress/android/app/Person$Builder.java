// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import android.annotation.Nullable;
import android.graphics.drawable.Icon;
import android.annotation.NonNull;

public class Person$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @NonNull
    public native Person build();
    
    @NonNull
    public native Person$Builder setBot(final boolean p0);
    
    @NonNull
    public native Person$Builder setIcon(@Nullable final Icon p0);
    
    @NonNull
    public native Person$Builder setImportant(final boolean p0);
    
    @NonNull
    public native Person$Builder setKey(@Nullable final String p0);
    
    @NonNull
    public native Person$Builder setName(@Nullable final CharSequence p0);
    
    @NonNull
    public native Person$Builder setUri(@Nullable final String p0);
}
