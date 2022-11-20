// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.FileNotFoundException;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import android.content.ContentResolver;
import android.net.Uri;

public abstract class l<T> implements d<T>
{
    public final Uri f;
    public final ContentResolver g;
    public T h;
    
    public l(final ContentResolver g, final Uri f) {
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
            d$a.e((Object)(this.h = (T)this.f(this.g, this.f)));
        }
        catch (final FileNotFoundException ex) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", (Throwable)ex);
            }
            d$a.f((Exception)ex);
        }
    }
    
    public abstract void e(final T p0) throws IOException;
    
    public abstract Object f(final ContentResolver p0, final Uri p1) throws FileNotFoundException;
}
