// 
// Decompiled by Procyon v0.6.0
// 

package uf;

import q3.e;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Paint;

public final class a
{
    public static final int[] i;
    public static final float[] j;
    public static final int[] k;
    public static final float[] l;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g;
    public Paint h;
    
    static {
        i = new int[3];
        j = new float[] { 0.0f, 0.5f, 1.0f };
        k = new int[4];
        l = new float[] { 0.0f, 0.0f, 0.5f, 1.0f };
    }
    
    public a() {
        this.g = new Path();
        this.h = new Paint();
        this.a = new Paint();
        this.a(-16777216);
        this.h.setColor(0);
        final Paint b = new Paint(4);
        (this.b = b).setStyle(Paint$Style.FILL);
        this.c = new Paint(b);
    }
    
    public final void a(final int n) {
        this.d = q3.e.h(n, 68);
        this.e = q3.e.h(n, 20);
        this.f = q3.e.h(n, 0);
        this.a.setColor(this.d);
    }
}
