// 
// Decompiled by Procyon v0.6.0
// 

package j9;

import com.bumptech.glide.load.DataSource;
import android.graphics.drawable.Drawable;

public final class a implements e<Drawable>
{
    public final int a;
    public b b;
    
    public a(final int a) {
        this.a = a;
    }
    
    @Override
    public final d a(final DataSource dataSource) {
        Object o;
        if (dataSource == DataSource.MEMORY_CACHE) {
            o = c.a;
        }
        else {
            if (this.b == null) {
                this.b = new b(this.a, false);
            }
            o = this.b;
        }
        return (d)o;
    }
}
