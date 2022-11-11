// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.graphics.Bitmap$Config;
import sg2.e;
import android.graphics.Bitmap;

public final class d implements w
{
    public final Bitmap a;
    
    public d(final Bitmap a) {
        e.f((Object)a, "bitmap");
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.prepareToDraw();
    }
    
    @Override
    public final int b() {
        final Bitmap$Config config = this.a.getConfig();
        e.e((Object)config, "bitmap.config");
        return o1.e.c(config);
    }
    
    @Override
    public final int getHeight() {
        return this.a.getHeight();
    }
    
    @Override
    public final int getWidth() {
        return this.a.getWidth();
    }
}
