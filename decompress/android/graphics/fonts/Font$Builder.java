// 
// Decompiled by Procyon v0.6.0
// 

package android.graphics.fonts;

import android.annotation.Nullable;
import java.io.IOException;
import android.os.ParcelFileDescriptor;
import android.annotation.NonNull;
import android.content.res.Resources;

public final class Font$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public Font$Builder(@NonNull final Resources resources, final int n) {
    }
    
    public Font$Builder(@NonNull final ParcelFileDescriptor parcelFileDescriptor) {
    }
    
    @NonNull
    public native Font build() throws IOException;
    
    @NonNull
    public native Font$Builder setFontVariationSettings(@Nullable final String p0);
    
    @NonNull
    public native Font$Builder setSlant(final int p0);
    
    @NonNull
    public native Font$Builder setTtcIndex(final int p0);
    
    @NonNull
    public native Font$Builder setWeight(final int p0);
}
