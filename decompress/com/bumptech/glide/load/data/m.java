// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import android.content.res.AssetManager;
import java.io.InputStream;

public final class m extends b<InputStream>
{
    public m(final AssetManager assetManager, final String s) {
        super(assetManager, s);
    }
    
    public final Class<InputStream> a() {
        return InputStream.class;
    }
    
    public final void e(final Object o) throws IOException {
        ((InputStream)o).close();
    }
    
    public final Object f(final AssetManager assetManager, final String s) throws IOException {
        return assetManager.open(s);
    }
}
