// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.graphics.Bitmap$Config;
import ah2.f;
import android.graphics.Bitmap;

public final class d implements w
{
    public final Bitmap a;
    
    public d(final Bitmap a) {
        f.f((Object)a, "bitmap");
        this.a = a;
    }
    
    public final void a() {
        this.a.prepareToDraw();
    }
    
    public final int b() {
        final Bitmap$Config config = this.a.getConfig();
        f.e((Object)config, "bitmap.config");
        return e.c(config);
    }
    
    public final int getHeight() {
        return this.a.getHeight();
    }
    
    public final int getWidth() {
        return this.a.getWidth();
    }
}
