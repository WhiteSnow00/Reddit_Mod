// 
// Decompiled by Procyon v0.6.0
// 

package android.graphics;

import android.annotation.NonNull;
import java.io.FileDescriptor;

public final class Typeface$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public Typeface$Builder(@NonNull final FileDescriptor fileDescriptor) {
    }
    
    public native Typeface build();
    
    public native Typeface$Builder setItalic(final boolean p0);
    
    public native Typeface$Builder setWeight(final int p0);
}
