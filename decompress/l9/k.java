// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import android.graphics.drawable.Drawable;
import android.view.View;
import i9.d;
import java.util.Arrays;
import i9.i;
import com.bumptech.glide.h$b;

public final class k<T> implements h$b<T>, i
{
    public int[] a;
    public a b;
    
    public final int[] a() {
        final int[] a = this.a;
        if (a == null) {
            return null;
        }
        return Arrays.copyOf(a, a.length);
    }
    
    public final void b(final int n, final int n2) {
        this.a = new int[] { n, n2 };
        this.b = null;
    }
    
    public static final class a extends d<View, Object>
    {
        public a(final View view) {
            super(view);
        }
        
        public final void a() {
        }
        
        public final void d(final Object o, final j9.d<? super Object> d) {
        }
        
        public final void h(final Drawable drawable) {
        }
    }
}
