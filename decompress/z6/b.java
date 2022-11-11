// 
// Decompiled by Procyon v0.6.0
// 

package z6;

import android.graphics.drawable.Drawable;
import java.io.InputStream;
import android.content.res.AssetManager;
import android.content.Context;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.Paint;
import android.graphics.ColorFilter;
import java.io.IOException;
import android.text.TextUtils;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.graphics.BitmapFactory$Options;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import c7.g;
import android.graphics.Matrix;
import android.graphics.RectF;
import q6.g0;
import d7.c;
import q6.h;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.LottieDrawable;
import t6.r;
import q6.d0;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.a;

public final class b extends a
{
    public final r6.a C;
    public final Rect D;
    public final Rect E;
    public final d0 F;
    public r G;
    public r H;
    
    public b(final LottieDrawable lottieDrawable, final Layer layer) {
        super(lottieDrawable, layer);
        this.C = new r6.a(3);
        this.D = new Rect();
        this.E = new Rect();
        final String g = layer.g;
        final h f = lottieDrawable.f;
        d0 f2;
        if (f == null) {
            f2 = null;
        }
        else {
            f2 = f.d.get(g);
        }
        this.F = f2;
    }
    
    @Override
    public final void a(final d7.c c, final Object o) {
        super.a(c, o);
        if (o == g0.K) {
            if (c == null) {
                this.G = null;
            }
            else {
                this.G = new r(c, (Object)null);
            }
        }
        else if (o == g0.N) {
            if (c == null) {
                this.H = null;
            }
            else {
                this.H = new r(c, (Object)null);
            }
        }
    }
    
    @Override
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        super.b(rectF, matrix, b);
        if (this.F != null) {
            final float c = c7.g.c();
            final d0 f = this.F;
            rectF.set(0.0f, 0.0f, f.a * c, f.b * c);
            super.n.mapRect(rectF);
        }
    }
    
    @Override
    public final void k(final Canvas canvas, final Matrix matrix, final int alpha) {
        final r h = this.H;
        Bitmap d = null;
        Label_0560: {
            if (h != null) {
                d = (Bitmap)h.f();
                if (d != null) {
                    break Label_0560;
                }
            }
            final String g = super.p.g;
            final LottieDrawable o = super.o;
            v6.b n;
            if (((Drawable)o).getCallback() == null) {
                n = null;
            }
            else {
                final v6.b n2 = o.n;
                if (n2 != null) {
                    final Drawable$Callback callback = ((Drawable)o).getCallback();
                    Context context = null;
                    Label_0109: {
                        if (callback != null) {
                            if (callback instanceof View) {
                                context = ((View)callback).getContext();
                                break Label_0109;
                            }
                        }
                        context = null;
                    }
                    if ((context != null || n2.a != null) && !n2.a.equals(context)) {
                        o.n = null;
                    }
                }
                if (o.n == null) {
                    final Drawable$Callback callback2 = ((Drawable)o).getCallback();
                    final String o2 = o.o;
                    o.getClass();
                    o.n = new v6.b(callback2, o2, (q6.b)null, o.f.d);
                }
                n = o.n;
            }
            Label_0528: {
                Label_0525: {
                    if (n != null) {
                        final d0 d2 = n.c.get(g);
                        if (d2 != null) {
                            final Bitmap d3 = d2.d;
                            if (d3 != null) {
                                d = d3;
                                break Label_0528;
                            }
                            n.getClass();
                            final String c = d2.c;
                            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                            bitmapFactory$Options.inScaled = true;
                            bitmapFactory$Options.inDensity = 160;
                            Label_0483: {
                                if (c.startsWith("data:") && c.indexOf("base64,") > 0) {
                                    try {
                                        final byte[] decode = Base64.decode(c.substring(c.indexOf(44) + 1), 0);
                                        final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, bitmapFactory$Options);
                                        n.a(decodeByteArray, g);
                                        d = decodeByteArray;
                                        break Label_0483;
                                    }
                                    catch (final IllegalArgumentException ex) {
                                        c7.c.c("data URL did not have correct base64 format.", ex);
                                        break Label_0525;
                                    }
                                }
                                try {
                                    if (!TextUtils.isEmpty((CharSequence)n.b)) {
                                        final AssetManager assets = n.a.getAssets();
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(n.b);
                                        sb.append(c);
                                        final InputStream open = assets.open(sb.toString());
                                        try {
                                            final Bitmap e = c7.g.e(d2.a, d2.b, BitmapFactory.decodeStream(open, (Rect)null, bitmapFactory$Options));
                                            n.a(e, g);
                                            d = e;
                                            break Label_0528;
                                        }
                                        catch (final IllegalArgumentException ex2) {
                                            c7.c.c("Unable to decode image.", ex2);
                                            break Label_0525;
                                        }
                                    }
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                catch (final IOException ex3) {
                                    c7.c.c("Unable to open asset.", ex3);
                                }
                            }
                        }
                    }
                }
                d = null;
            }
            if (d == null) {
                final d0 f = this.F;
                if (f != null) {
                    d = f.d;
                }
                else {
                    d = null;
                }
            }
        }
        if (d != null && !d.isRecycled()) {
            if (this.F != null) {
                final float c2 = c7.g.c();
                this.C.setAlpha(alpha);
                final r g2 = this.G;
                if (g2 != null) {
                    ((Paint)this.C).setColorFilter((ColorFilter)g2.f());
                }
                canvas.save();
                canvas.concat(matrix);
                this.D.set(0, 0, d.getWidth(), d.getHeight());
                if (super.o.r) {
                    final Rect e2 = this.E;
                    final d0 f2 = this.F;
                    e2.set(0, 0, (int)(f2.a * c2), (int)(f2.b * c2));
                }
                else {
                    this.E.set(0, 0, (int)(d.getWidth() * c2), (int)(d.getHeight() * c2));
                }
                canvas.drawBitmap(d, this.D, this.E, (Paint)this.C);
                canvas.restore();
            }
        }
    }
}
