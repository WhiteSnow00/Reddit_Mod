// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public final class h extends b<ParcelFileDescriptor>
{
    public h(final AssetManager assetManager, final String s) {
        super(assetManager, s);
    }
    
    @Override
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }
    
    @Override
    public final void e(final Object o) throws IOException {
        ((ParcelFileDescriptor)o).close();
    }
    
    @Override
    public final Object f(final AssetManager assetManager, final String s) throws IOException {
        return assetManager.openFd(s).getParcelFileDescriptor();
    }
}
