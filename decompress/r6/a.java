// 
// Decompiled by Procyon v0.6.0
// 

package r6;

import android.os.LocaleList;
import android.graphics.PointF;
import c7.f;
import android.os.Build$VERSION;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;

public final class a extends Paint
{
    public a() {
    }
    
    public a(final int n) {
        super(n);
    }
    
    public a(final PorterDuff$Mode porterDuff$Mode) {
        this.setXfermode((Xfermode)new PorterDuffXfermode(porterDuff$Mode));
    }
    
    public a(final PorterDuff$Mode porterDuff$Mode, final int n) {
        super(1);
        this.setXfermode((Xfermode)new PorterDuffXfermode(porterDuff$Mode));
    }
    
    public final void setAlpha(final int n) {
        if (Build$VERSION.SDK_INT < 30) {
            final int color = this.getColor();
            final PointF a = f.a;
            this.setColor(Math.max(0, Math.min(255, n)) << 24 | (color & 0xFFFFFF));
        }
        else {
            final PointF a2 = f.a;
            super.setAlpha(Math.max(0, Math.min(255, n)));
        }
    }
    
    public final void setTextLocales(final LocaleList list) {
    }
}
