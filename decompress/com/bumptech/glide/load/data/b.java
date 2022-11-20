// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import android.content.res.AssetManager;

public abstract class b<T> implements d<T>
{
    public final String f;
    public final AssetManager g;
    public T h;
    
    public b(final AssetManager g, final String f) {
        this.g = g;
        this.f = f;
    }
    
    public final void b() {
        final T h = this.h;
        if (h == null) {
            return;
        }
        try {
            this.e(h);
        }
        catch (final IOException ex) {}
    }
    
    public final DataSource c() {
        return DataSource.LOCAL;
    }
    
    public final void cancel() {
    }
    
    public final void d(final Priority priority, final d$a<? super T> d$a) {
        try {
            d$a.e((Object)(this.h = this.f(this.g, this.f)));
        }
        catch (final IOException ex) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", (Throwable)ex);
            }
            d$a.f((Exception)ex);
        }
    }
    
    public abstract void e(final T p0) throws IOException;
    
    public abstract T f(final AssetManager p0, final String p1) throws IOException;
}
