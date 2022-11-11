// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

public class e implements d
{
    public final void clearMemory() {
    }
    
    public final Bitmap get(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return Bitmap.createBitmap(n, n2, bitmap$Config);
    }
    
    public final Bitmap getDirty(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return Bitmap.createBitmap(n, n2, bitmap$Config);
    }
    
    public void put(final Bitmap bitmap) {
        bitmap.recycle();
    }
    
    public final void trimMemory(final int n) {
    }
}
