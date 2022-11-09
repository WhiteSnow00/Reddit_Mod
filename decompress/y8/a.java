// 
// Decompiled by Procyon v0.6.0
// 

package y8;

import android.graphics.Bitmap;
import a9.b;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import r8.l;
import p8.g;
import android.content.res.Resources;
import s8.d;
import a9.e;
import p8.h;

public final class a implements h
{
    public final /* synthetic */ int a;
    public final h b;
    public final Object c;
    
    public a(final e b, final d c) {
        this.a = 1;
        this.b = (h)b;
        this.c = c;
    }
    
    public a(final Resources c, final h b) {
        this.a = 0;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final l a(final Object o, final int n, final int n2, final g g) {
        final int a = this.a;
        final l l = null;
        final l i = null;
        switch (a) {
            default: {
                final l c = ((e)this.b).c((Uri)o);
                l a2;
                if (c == null) {
                    a2 = l;
                }
                else {
                    a2 = k.a((d)this.c, (Drawable)((b)c).get(), n, n2);
                }
                return a2;
            }
            case 0: {
                final l<Bitmap> a3 = this.b.a(o, n, n2, g);
                final Resources resources = (Resources)this.c;
                l j;
                if (a3 == null) {
                    j = i;
                }
                else {
                    j = new q(resources, a3);
                }
                return j;
            }
        }
    }
    
    @Override
    public final boolean b(final Object o, final g g) {
        switch (this.a) {
            default: {
                return "android.resource".equals(((Uri)o).getScheme());
            }
            case 0: {
                return this.b.b(o, g);
            }
        }
    }
}
