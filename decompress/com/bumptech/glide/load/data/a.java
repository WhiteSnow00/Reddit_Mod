// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.FileNotFoundException;
import androidx.appcompat.widget.s0;
import java.io.IOException;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;

public final class a extends l<AssetFileDescriptor>
{
    public a(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }
    
    public final void e(final Object o) throws IOException {
        ((AssetFileDescriptor)o).close();
    }
    
    public final Object f(final ContentResolver contentResolver, final Uri uri) throws FileNotFoundException {
        final AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(s0.k("FileDescriptor is null for: ", uri));
    }
}
