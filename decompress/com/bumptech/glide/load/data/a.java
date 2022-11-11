// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.FileNotFoundException;
import al0.f0;
import java.io.IOException;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;

public final class a extends l<AssetFileDescriptor>
{
    public a(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    @Override
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }
    
    @Override
    public final void e(final Object o) throws IOException {
        ((AssetFileDescriptor)o).close();
    }
    
    @Override
    public final Object f(final ContentResolver contentResolver, final Uri uri) throws FileNotFoundException {
        final AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(f0.k("FileDescriptor is null for: ", uri));
    }
}
