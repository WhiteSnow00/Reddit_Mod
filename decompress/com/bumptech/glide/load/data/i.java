// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import java.io.FileNotFoundException;
import androidx.appcompat.widget.s0;
import java.io.IOException;
import android.net.Uri;
import android.content.ContentResolver;
import android.os.ParcelFileDescriptor;

public final class i extends l<ParcelFileDescriptor>
{
    public i(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }
    
    public final void e(final Object o) throws IOException {
        ((ParcelFileDescriptor)o).close();
    }
    
    public final Object f(final ContentResolver contentResolver, final Uri uri) throws FileNotFoundException {
        final AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(s0.k("FileDescriptor is null for: ", uri));
    }
}
