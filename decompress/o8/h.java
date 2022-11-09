// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import android.graphics.Bitmap;
import android.util.LruCache;

public final class h extends LruCache<Integer, Bitmap>
{
    public final /* synthetic */ i a;
    
    public h(final i a, final int n) {
        this.a = a;
        super(n);
    }
    
    public final void entryRemoved(final boolean b, final Object o, final Object o2, final Object o3) {
        final Integer n = (Integer)o;
        final Bitmap bitmap = (Bitmap)o2;
        final Bitmap bitmap2 = (Bitmap)o3;
        if (bitmap != null) {
            this.a.c.c(bitmap);
        }
    }
}
