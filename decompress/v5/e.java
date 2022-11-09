// 
// Decompiled by Procyon v0.6.0
// 

package v5;

import j0.i;
import android.graphics.drawable.VectorDrawable;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import android.graphics.Path$FillType;
import android.graphics.PathMeasure;
import android.graphics.Path;
import j0.b;
import java.util.ArrayList;
import p3.c;
import android.content.res.TypedArray;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import q3.h;
import java.util.ArrayDeque;
import p3.k;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import r3.a;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

public final class e extends v5.d
{
    public static final PorterDuff$Mode o;
    public g g;
    public PorterDuffColorFilter h;
    public ColorFilter i;
    public boolean j;
    public boolean k;
    public final float[] l;
    public final Matrix m;
    public final Rect n;
    
    static {
        o = PorterDuff$Mode.SRC_IN;
    }
    
    public e() {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = new g();
    }
    
    public e(final g g) {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = g;
        this.h = this.a(g.c, g.d);
    }
    
    public final PorterDuffColorFilter a(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    public final boolean canApplyTheme() {
        final Drawable f = super.f;
        if (f != null) {
            r3.a.b.b(f);
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        final Drawable f = super.f;
        if (f != null) {
            f.draw(canvas);
            return;
        }
        this.copyBounds(this.n);
        if (this.n.width() > 0) {
            if (this.n.height() > 0) {
                Object colorFilter;
                if ((colorFilter = this.i) == null) {
                    colorFilter = this.h;
                }
                canvas.getMatrix(this.m);
                this.m.getValues(this.l);
                final float[] l = this.l;
                final int n = 0;
                float abs = Math.abs(l[0]);
                float abs2 = Math.abs(this.l[4]);
                final float abs3 = Math.abs(this.l[1]);
                final float abs4 = Math.abs(this.l[3]);
                if (abs3 != 0.0f || abs4 != 0.0f) {
                    abs = (abs2 = 1.0f);
                }
                final int n2 = (int)(this.n.width() * abs);
                final int n3 = (int)(this.n.height() * abs2);
                final int min = Math.min(2048, n2);
                final int min2 = Math.min(2048, n3);
                if (min > 0) {
                    if (min2 > 0) {
                        final int save = canvas.save();
                        final Rect n4 = this.n;
                        canvas.translate((float)n4.left, (float)n4.top);
                        if (this.isAutoMirrored() && r3.a.c.a(this) == 1) {
                            canvas.translate((float)this.n.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                        this.n.offsetTo(0, 0);
                        final g g = this.g;
                        final Bitmap f2 = g.f;
                        if (f2 == null || min != f2.getWidth() || min2 != g.f.getHeight()) {
                            g.f = Bitmap.createBitmap(min, min2, Bitmap$Config.ARGB_8888);
                            g.k = true;
                        }
                        if (!this.k) {
                            final g g2 = this.g;
                            g2.f.eraseColor(0);
                            final Canvas canvas2 = new Canvas(g2.f);
                            final f b = g2.b;
                            b.a(b.g, v5.e.f.p, canvas2, min, min2);
                        }
                        else {
                            final g g3 = this.g;
                            if (g3.k || g3.g != g3.c || g3.h != g3.d || g3.j != g3.e || g3.i != g3.b.getRootAlpha()) {
                                final g g4 = this.g;
                                g4.f.eraseColor(0);
                                final Canvas canvas3 = new Canvas(g4.f);
                                final f b2 = g4.b;
                                b2.a(b2.g, v5.e.f.p, canvas3, min, min2);
                                final g g5 = this.g;
                                g5.g = g5.c;
                                g5.h = g5.d;
                                g5.i = g5.b.getRootAlpha();
                                g5.j = g5.e;
                                g5.k = false;
                            }
                        }
                        final g g6 = this.g;
                        final Rect n5 = this.n;
                        int n6 = n;
                        if (g6.b.getRootAlpha() < 255) {
                            n6 = 1;
                        }
                        Paint i;
                        if (n6 == 0 && colorFilter == null) {
                            i = null;
                        }
                        else {
                            if (g6.l == null) {
                                (g6.l = new Paint()).setFilterBitmap(true);
                            }
                            g6.l.setAlpha(g6.b.getRootAlpha());
                            g6.l.setColorFilter((ColorFilter)colorFilter);
                            i = g6.l;
                        }
                        canvas.drawBitmap(g6.f, (Rect)null, n5, i);
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }
    
    public final int getAlpha() {
        final Drawable f = super.f;
        if (f != null) {
            return r3.a.a.a(f);
        }
        return this.g.b.getRootAlpha();
    }
    
    public final int getChangingConfigurations() {
        final Drawable f = super.f;
        if (f != null) {
            return f.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.g.getChangingConfigurations();
    }
    
    public final ColorFilter getColorFilter() {
        final Drawable f = super.f;
        if (f != null) {
            return r3.a.b.c(f);
        }
        return this.i;
    }
    
    public final Drawable$ConstantState getConstantState() {
        if (super.f != null) {
            return new h(super.f.getConstantState());
        }
        this.g.a = this.getChangingConfigurations();
        return this.g;
    }
    
    public final int getIntrinsicHeight() {
        final Drawable f = super.f;
        if (f != null) {
            return f.getIntrinsicHeight();
        }
        return (int)this.g.b.i;
    }
    
    public final int getIntrinsicWidth() {
        final Drawable f = super.f;
        if (f != null) {
            return f.getIntrinsicWidth();
        }
        return (int)this.g.b.h;
    }
    
    public final int getOpacity() {
        final Drawable f = super.f;
        if (f != null) {
            return f.getOpacity();
        }
        return -3;
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) throws XmlPullParserException, IOException {
        final Drawable f = super.f;
        if (f != null) {
            f.inflate(resources, xmlPullParser, set);
            return;
        }
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final Drawable f = super.f;
        if (f != null) {
            r3.a.b.d(f, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        final g g = this.g;
        g.b = new f();
        final TypedArray h = p3.k.h(resources, resources$Theme, set, v5.a.a);
        final g g2 = this.g;
        final f b = g2.b;
        final int e = p3.k.e(h, xmlPullParser, "tintMode", 6, -1);
        final PorterDuff$Mode src_IN = PorterDuff$Mode.SRC_IN;
        int n = 3;
        PorterDuff$Mode d;
        if (e != 3) {
            d = src_IN;
            if (e != 5) {
                if (e != 9) {
                    switch (e) {
                        default: {
                            d = src_IN;
                            break;
                        }
                        case 16: {
                            d = PorterDuff$Mode.ADD;
                            break;
                        }
                        case 15: {
                            d = PorterDuff$Mode.SCREEN;
                            break;
                        }
                        case 14: {
                            d = PorterDuff$Mode.MULTIPLY;
                            break;
                        }
                    }
                }
                else {
                    d = PorterDuff$Mode.SRC_ATOP;
                }
            }
        }
        else {
            d = PorterDuff$Mode.SRC_OVER;
        }
        g2.d = d;
        final ColorStateList b2 = p3.k.b(h, xmlPullParser, resources$Theme);
        if (b2 != null) {
            g2.c = b2;
        }
        boolean e2 = g2.e;
        if (p3.k.g(xmlPullParser, "autoMirrored")) {
            e2 = h.getBoolean(5, e2);
        }
        g2.e = e2;
        b.j = p3.k.d(h, xmlPullParser, "viewportWidth", 7, b.j);
        final float d2 = p3.k.d(h, xmlPullParser, "viewportHeight", 8, b.k);
        b.k = d2;
        if (b.j <= 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append(h.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        }
        if (d2 <= 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(h.getPositionDescription());
            sb2.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        b.h = h.getDimension(3, b.h);
        final float dimension = h.getDimension(2, b.i);
        b.i = dimension;
        if (b.h <= 0.0f) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(h.getPositionDescription());
            sb3.append("<vector> tag requires width > 0");
            throw new XmlPullParserException(sb3.toString());
        }
        if (dimension <= 0.0f) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(h.getPositionDescription());
            sb4.append("<vector> tag requires height > 0");
            throw new XmlPullParserException(sb4.toString());
        }
        b.setAlpha(p3.k.d(h, xmlPullParser, "alpha", 4, b.getAlpha()));
        int n2 = 0;
        final String string = h.getString(0);
        if (string != null) {
            b.m = string;
            ((i)b.o).put((Object)string, (Object)b);
        }
        h.recycle();
        g.a = this.getChangingConfigurations();
        int n3 = 1;
        g.k = true;
        final g g3 = this.g;
        final f b3 = g3.b;
        final ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(b3.g);
        int n4 = xmlPullParser.getEventType();
        final int n5 = xmlPullParser.getDepth() + 1;
        int n6 = 1;
        while (n4 != n3 && (xmlPullParser.getDepth() >= n5 || n4 != n)) {
            int n8;
            int n9;
            int n10;
            if (n4 == 2) {
                final String name = xmlPullParser.getName();
                final c c = arrayDeque.peek();
                if ("path".equals(name)) {
                    final b b4 = new b();
                    final TypedArray h2 = p3.k.h(resources, resources$Theme, set, v5.a.c);
                    if (p3.k.g(xmlPullParser, "pathData")) {
                        final String string2 = h2.getString(0);
                        if (string2 != null) {
                            ((e)b4).b = string2;
                        }
                        final String string3 = h2.getString(2);
                        if (string3 != null) {
                            ((e)b4).a = q3.h.c(string3);
                        }
                        b4.g = p3.k.c(h2, xmlPullParser, resources$Theme, "fillColor", 1);
                        b4.i = p3.k.d(h2, xmlPullParser, "fillAlpha", 12, b4.i);
                        final int e3 = p3.k.e(h2, xmlPullParser, "strokeLineCap", 8, -1);
                        Paint$Cap m = b4.m;
                        if (e3 != 0) {
                            if (e3 != 1) {
                                if (e3 == 2) {
                                    m = Paint$Cap.SQUARE;
                                }
                            }
                            else {
                                m = Paint$Cap.ROUND;
                            }
                        }
                        else {
                            m = Paint$Cap.BUTT;
                        }
                        b4.m = m;
                        final int e4 = p3.k.e(h2, xmlPullParser, "strokeLineJoin", 9, -1);
                        Paint$Join n7 = b4.n;
                        if (e4 != 0) {
                            if (e4 != 1) {
                                if (e4 == 2) {
                                    n7 = Paint$Join.BEVEL;
                                }
                            }
                            else {
                                n7 = Paint$Join.ROUND;
                            }
                        }
                        else {
                            n7 = Paint$Join.MITER;
                        }
                        b4.n = n7;
                        b4.o = p3.k.d(h2, xmlPullParser, "strokeMiterLimit", 10, b4.o);
                        b4.e = p3.k.c(h2, xmlPullParser, resources$Theme, "strokeColor", 3);
                        b4.h = p3.k.d(h2, xmlPullParser, "strokeAlpha", 11, b4.h);
                        b4.f = p3.k.d(h2, xmlPullParser, "strokeWidth", 4, b4.f);
                        b4.k = p3.k.d(h2, xmlPullParser, "trimPathEnd", 6, b4.k);
                        b4.l = p3.k.d(h2, xmlPullParser, "trimPathOffset", 7, b4.l);
                        b4.j = p3.k.d(h2, xmlPullParser, "trimPathStart", 5, b4.j);
                        ((e)b4).c = p3.k.e(h2, xmlPullParser, "fillType", 13, ((e)b4).c);
                    }
                    h2.recycle();
                    c.b.add(b4);
                    if (((e)b4).getPathName() != null) {
                        ((i)b3.o).put((Object)((e)b4).getPathName(), (Object)b4);
                    }
                    g3.a |= ((e)b4).d;
                    n6 = 0;
                }
                else if ("clip-path".equals(name)) {
                    final a a = new a();
                    if (p3.k.g(xmlPullParser, "pathData")) {
                        final TypedArray h3 = p3.k.h(resources, resources$Theme, set, v5.a.d);
                        final String string4 = h3.getString(0);
                        if (string4 != null) {
                            ((e)a).b = string4;
                        }
                        final String string5 = h3.getString(1);
                        if (string5 != null) {
                            ((e)a).a = q3.h.c(string5);
                        }
                        ((e)a).c = p3.k.e(h3, xmlPullParser, "fillType", 2, 0);
                        h3.recycle();
                    }
                    c.b.add(a);
                    if (((e)a).getPathName() != null) {
                        ((i)b3.o).put((Object)((e)a).getPathName(), (Object)a);
                    }
                    g3.a |= ((e)a).d;
                }
                else if ("group".equals(name)) {
                    final c c2 = new c();
                    final TypedArray h4 = p3.k.h(resources, resources$Theme, set, v5.a.b);
                    c2.c = p3.k.d(h4, xmlPullParser, "rotation", 5, c2.c);
                    c2.d = h4.getFloat(1, c2.d);
                    c2.e = h4.getFloat(2, c2.e);
                    c2.f = p3.k.d(h4, xmlPullParser, "scaleX", 3, c2.f);
                    c2.g = p3.k.d(h4, xmlPullParser, "scaleY", 4, c2.g);
                    c2.h = p3.k.d(h4, xmlPullParser, "translateX", 6, c2.h);
                    c2.i = p3.k.d(h4, xmlPullParser, "translateY", 7, c2.i);
                    final String string6 = h4.getString(0);
                    if (string6 != null) {
                        c2.l = string6;
                    }
                    c2.c();
                    h4.recycle();
                    c.b.add(c2);
                    arrayDeque.push(c2);
                    if (c2.getGroupName() != null) {
                        ((i)b3.o).put((Object)c2.getGroupName(), (Object)c2);
                    }
                    g3.a |= c2.k;
                }
                n2 = 0;
                n8 = 3;
                n9 = 1;
                n10 = n6;
            }
            else {
                final int n11 = n;
                final int n12 = n3;
                final int n13 = n2 = n2;
                n8 = n11;
                n9 = n12;
                n10 = n6;
                if (n4 == n11) {
                    n2 = n13;
                    n8 = n11;
                    n9 = n12;
                    n10 = n6;
                    if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        n10 = n6;
                        n9 = n12;
                        n8 = n11;
                        n2 = n13;
                    }
                }
            }
            n4 = xmlPullParser.next();
            final int n14 = n9;
            n = n8;
            n3 = n14;
            n6 = n10;
        }
        if (n6 == 0) {
            this.h = this.a(g.c, g.d);
            return;
        }
        throw new XmlPullParserException("no path defined");
    }
    
    public final void invalidateSelf() {
        final Drawable f = super.f;
        if (f != null) {
            f.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        final Drawable f = super.f;
        if (f != null) {
            return r3.a.a.d(f);
        }
        return this.g.e;
    }
    
    public final boolean isStateful() {
        final Drawable f = super.f;
        if (f != null) {
            return f.isStateful();
        }
        if (!super.isStateful()) {
            final g g = this.g;
            if (g != null) {
                final f b = g.b;
                if (b.n == null) {
                    b.n = b.g.a();
                }
                if (b.n) {
                    return true;
                }
                final ColorStateList c = this.g.c;
                if (c != null && c.isStateful()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final Drawable mutate() {
        final Drawable f = super.f;
        if (f != null) {
            f.mutate();
            return this;
        }
        if (!this.j && super.mutate() == this) {
            this.g = new g(this.g);
            this.j = true;
        }
        return this;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        final Drawable f = super.f;
        if (f != null) {
            f.setBounds(bounds);
        }
    }
    
    public final boolean onStateChange(final int[] state) {
        final Drawable f = super.f;
        if (f != null) {
            return f.setState(state);
        }
        final boolean b = false;
        final g g = this.g;
        final ColorStateList c = g.c;
        final boolean b2 = true;
        boolean b3 = b;
        if (c != null) {
            final PorterDuff$Mode d = g.d;
            b3 = b;
            if (d != null) {
                this.h = this.a(c, d);
                this.invalidateSelf();
                b3 = true;
            }
        }
        final f b4 = g.b;
        if (b4.n == null) {
            b4.n = b4.g.a();
        }
        if (b4.n) {
            final boolean b5 = g.b.g.b(state);
            g.k |= b5;
            if (b5) {
                this.invalidateSelf();
                b3 = b2;
            }
        }
        return b3;
    }
    
    public final void scheduleSelf(final Runnable runnable, final long n) {
        final Drawable f = super.f;
        if (f != null) {
            f.scheduleSelf(runnable, n);
            return;
        }
        super.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int n) {
        final Drawable f = super.f;
        if (f != null) {
            f.setAlpha(n);
            return;
        }
        if (this.g.b.getRootAlpha() != n) {
            this.g.b.setRootAlpha(n);
            this.invalidateSelf();
        }
    }
    
    public final void setAutoMirrored(final boolean e) {
        final Drawable f = super.f;
        if (f != null) {
            r3.a.a.e(f, e);
            return;
        }
        this.g.e = e;
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        final Drawable f = super.f;
        if (f != null) {
            f.setColorFilter(colorFilter);
            return;
        }
        this.i = colorFilter;
        this.invalidateSelf();
    }
    
    public final void setTint(final int n) {
        final Drawable f = super.f;
        if (f != null) {
            r3.a.a(f, n);
            return;
        }
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public final void setTintList(final ColorStateList c) {
        final Drawable f = super.f;
        if (f != null) {
            r3.a.b.h(f, c);
            return;
        }
        final g g = this.g;
        if (g.c != c) {
            g.c = c;
            this.h = this.a(c, g.d);
            this.invalidateSelf();
        }
    }
    
    public final void setTintMode(final PorterDuff$Mode d) {
        final Drawable f = super.f;
        if (f != null) {
            r3.a.b.i(f, d);
            return;
        }
        final g g = this.g;
        if (g.d != d) {
            g.d = d;
            this.h = this.a(g.c, d);
            this.invalidateSelf();
        }
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        final Drawable f = super.f;
        if (f != null) {
            return f.setVisible(b, b2);
        }
        return super.setVisible(b, b2);
    }
    
    public final void unscheduleSelf(final Runnable runnable) {
        final Drawable f = super.f;
        if (f != null) {
            f.unscheduleSelf(runnable);
            return;
        }
        super.unscheduleSelf(runnable);
    }
    
    public static final class a extends e
    {
        public a() {
        }
        
        public a(final a a) {
            super((e)a);
        }
    }
    
    public static final class b extends e
    {
        public p3.c e;
        public float f;
        public p3.c g;
        public float h;
        public float i;
        public float j;
        public float k;
        public float l;
        public Paint$Cap m;
        public Paint$Join n;
        public float o;
        
        public b() {
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint$Cap.BUTT;
            this.n = Paint$Join.MITER;
            this.o = 4.0f;
        }
        
        public b(final b b) {
            super((e)b);
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint$Cap.BUTT;
            this.n = Paint$Join.MITER;
            this.o = 4.0f;
            this.e = b.e;
            this.f = b.f;
            this.h = b.h;
            this.g = b.g;
            super.c = b.c;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.l = b.l;
            this.m = b.m;
            this.n = b.n;
            this.o = b.o;
        }
        
        @Override
        public final boolean a() {
            return this.g.b() || this.e.b();
        }
        
        @Override
        public final boolean b(final int[] array) {
            final p3.c g = this.g;
            final boolean b = g.b();
            int n = 1;
            boolean b3 = false;
            Label_0060: {
                if (b) {
                    final ColorStateList b2 = g.b;
                    final int colorForState = b2.getColorForState(array, b2.getDefaultColor());
                    if (colorForState != g.c) {
                        g.c = colorForState;
                        b3 = true;
                        break Label_0060;
                    }
                }
                b3 = false;
            }
            final p3.c e = this.e;
            if (e.b()) {
                final ColorStateList b4 = e.b;
                final int colorForState2 = b4.getColorForState(array, b4.getDefaultColor());
                if (colorForState2 != e.c) {
                    e.c = colorForState2;
                    return (n | (b3 ? 1 : 0)) != 0x0;
                }
            }
            n = 0;
            return (n | (b3 ? 1 : 0)) != 0x0;
        }
        
        public float getFillAlpha() {
            return this.i;
        }
        
        public int getFillColor() {
            return this.g.c;
        }
        
        public float getStrokeAlpha() {
            return this.h;
        }
        
        public int getStrokeColor() {
            return this.e.c;
        }
        
        public float getStrokeWidth() {
            return this.f;
        }
        
        public float getTrimPathEnd() {
            return this.k;
        }
        
        public float getTrimPathOffset() {
            return this.l;
        }
        
        public float getTrimPathStart() {
            return this.j;
        }
        
        public void setFillAlpha(final float i) {
            this.i = i;
        }
        
        public void setFillColor(final int c) {
            this.g.c = c;
        }
        
        public void setStrokeAlpha(final float h) {
            this.h = h;
        }
        
        public void setStrokeColor(final int c) {
            this.e.c = c;
        }
        
        public void setStrokeWidth(final float f) {
            this.f = f;
        }
        
        public void setTrimPathEnd(final float k) {
            this.k = k;
        }
        
        public void setTrimPathOffset(final float l) {
            this.l = l;
        }
        
        public void setTrimPathStart(final float j) {
            this.j = j;
        }
    }
    
    public static final class c extends d
    {
        public final Matrix a;
        public final ArrayList<d> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public int k;
        public String l;
        
        public c() {
            this.a = new Matrix();
            this.b = new ArrayList<d>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.l = null;
        }
        
        public c(c c, final j0.b<String, Object> b) {
            this.a = new Matrix();
            this.b = new ArrayList<d>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            final Matrix j = new Matrix();
            this.j = j;
            this.l = null;
            this.c = c.c;
            this.d = c.d;
            this.e = c.e;
            this.f = c.f;
            this.g = c.g;
            this.h = c.h;
            this.i = c.i;
            final String l = c.l;
            this.l = l;
            this.k = c.k;
            if (l != null) {
                ((i)b).put((Object)l, (Object)this);
            }
            j.set(c.j);
            final ArrayList<d> b2 = c.b;
            for (int i = 0; i < b2.size(); ++i) {
                final Object value = b2.get(i);
                if (value instanceof c) {
                    c = (c)value;
                    this.b.add(new c(c, b));
                }
                else {
                    e e;
                    if (value instanceof b) {
                        e = new b((b)value);
                    }
                    else {
                        if (!(value instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        e = new a((a)value);
                    }
                    this.b.add(e);
                    final String b3 = e.b;
                    if (b3 != null) {
                        ((i)b).put((Object)b3, (Object)e);
                    }
                }
            }
        }
        
        @Override
        public final boolean a() {
            for (int i = 0; i < this.b.size(); ++i) {
                if (this.b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final boolean b(final int[] array) {
            int i = 0;
            boolean b = false;
            while (i < this.b.size()) {
                b |= this.b.get(i).b(array);
                ++i;
            }
            return b;
        }
        
        public final void c() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }
        
        public String getGroupName() {
            return this.l;
        }
        
        public Matrix getLocalMatrix() {
            return this.j;
        }
        
        public float getPivotX() {
            return this.d;
        }
        
        public float getPivotY() {
            return this.e;
        }
        
        public float getRotation() {
            return this.c;
        }
        
        public float getScaleX() {
            return this.f;
        }
        
        public float getScaleY() {
            return this.g;
        }
        
        public float getTranslateX() {
            return this.h;
        }
        
        public float getTranslateY() {
            return this.i;
        }
        
        public void setPivotX(final float d) {
            if (d != this.d) {
                this.d = d;
                this.c();
            }
        }
        
        public void setPivotY(final float e) {
            if (e != this.e) {
                this.e = e;
                this.c();
            }
        }
        
        public void setRotation(final float c) {
            if (c != this.c) {
                this.c = c;
                this.c();
            }
        }
        
        public void setScaleX(final float f) {
            if (f != this.f) {
                this.f = f;
                this.c();
            }
        }
        
        public void setScaleY(final float g) {
            if (g != this.g) {
                this.g = g;
                this.c();
            }
        }
        
        public void setTranslateX(final float h) {
            if (h != this.h) {
                this.h = h;
                this.c();
            }
        }
        
        public void setTranslateY(final float i) {
            if (i != this.i) {
                this.i = i;
                this.c();
            }
        }
    }
    
    public abstract static class d
    {
        public boolean a() {
            return false;
        }
        
        public boolean b(final int[] array) {
            return false;
        }
    }
    
    public abstract static class e extends d
    {
        public q3.h.b[] a;
        public String b;
        public int c;
        public int d;
        
        public e() {
            this.a = null;
            this.c = 0;
        }
        
        public e(final e e) {
            this.a = null;
            this.c = 0;
            this.b = e.b;
            this.d = e.d;
            this.a = q3.h.d(e.a);
        }
        
        public q3.h.b[] getPathData() {
            return this.a;
        }
        
        public String getPathName() {
            return this.b;
        }
        
        public void setPathData(final q3.h.b[] array) {
            if (!q3.h.a(this.a, array)) {
                this.a = q3.h.d(array);
            }
            else {
                final q3.h.b[] a = this.a;
                for (int i = 0; i < array.length; ++i) {
                    a[i].a = array[i].a;
                    int n = 0;
                    while (true) {
                        final float[] b = array[i].b;
                        if (n >= b.length) {
                            break;
                        }
                        a[i].b[n] = b[n];
                        ++n;
                    }
                }
            }
        }
    }
    
    public static final class f
    {
        public static final Matrix p;
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public final c g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public String m;
        public Boolean n;
        public final j0.b<String, Object> o;
        
        static {
            p = new Matrix();
        }
        
        public f() {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            this.o = (j0.b<String, Object>)new j0.b();
            this.g = new c();
            this.a = new Path();
            this.b = new Path();
        }
        
        public f(final f f) {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            final j0.b o = new j0.b();
            this.o = (j0.b<String, Object>)o;
            this.g = new c(f.g, (j0.b<String, Object>)o);
            this.a = new Path(f.a);
            this.b = new Path(f.b);
            this.h = f.h;
            this.i = f.i;
            this.j = f.j;
            this.k = f.k;
            this.l = f.l;
            this.m = f.m;
            final String m = f.m;
            if (m != null) {
                ((i)o).put((Object)m, (Object)this);
            }
            this.n = f.n;
        }
        
        public final void a(final c c, final Matrix matrix, final Canvas canvas, final int n, final int n2) {
            c.a.set(matrix);
            c.a.preConcat(c.j);
            canvas.save();
            f f = this;
            for (int i = 0; i < c.b.size(); ++i) {
                final d d = c.b.get(i);
                if (d instanceof c) {
                    this.a((c)d, c.a, canvas, n, n2);
                }
                else if (d instanceof e) {
                    final e e = (e)d;
                    final float n3 = n / f.j;
                    final float n4 = n2 / f.k;
                    final float min = Math.min(n3, n4);
                    final Matrix a = c.a;
                    f.c.set(a);
                    f.c.postScale(n3, n4);
                    final float[] array2;
                    final float[] array = array2 = new float[4];
                    array2[0] = 0.0f;
                    array2[2] = (array2[1] = 1.0f);
                    array2[3] = 0.0f;
                    a.mapVectors(array);
                    final float n5 = (float)Math.hypot(array[0], array[1]);
                    final float n6 = (float)Math.hypot(array[2], array[3]);
                    final float n7 = array[0];
                    final float n8 = array[1];
                    final float n9 = array[2];
                    final float n10 = array[3];
                    final float max = Math.max(n5, n6);
                    float n11;
                    if (max > 0.0f) {
                        n11 = Math.abs(n7 * n10 - n8 * n9) / max;
                    }
                    else {
                        n11 = 0.0f;
                    }
                    if (n11 != 0.0f) {
                        final Path a2 = this.a;
                        e.getClass();
                        a2.reset();
                        final q3.h.b[] a3 = e.a;
                        if (a3 != null) {
                            q3.h.b.b(a3, a2);
                        }
                        final Path a4 = this.a;
                        this.b.reset();
                        if (e instanceof a) {
                            final Path b = this.b;
                            Path$FillType fillType;
                            if (e.c == 0) {
                                fillType = Path$FillType.WINDING;
                            }
                            else {
                                fillType = Path$FillType.EVEN_ODD;
                            }
                            b.setFillType(fillType);
                            this.b.addPath(a4, this.c);
                            canvas.clipPath(this.b);
                        }
                        else {
                            final b b2 = (b)e;
                            final float j = b2.j;
                            if (j != 0.0f || b2.k != 1.0f) {
                                final float l = b2.l;
                                final float k = b2.k;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(this.a, false);
                                final float length = this.f.getLength();
                                final float n12 = (j + l) % 1.0f * length;
                                final float n13 = (k + l) % 1.0f * length;
                                a4.reset();
                                if (n12 > n13) {
                                    this.f.getSegment(n12, length, a4, true);
                                    this.f.getSegment(0.0f, n13, a4, true);
                                }
                                else {
                                    this.f.getSegment(n12, n13, a4, true);
                                }
                                a4.rLineTo(0.0f, 0.0f);
                            }
                            this.b.addPath(a4, this.c);
                            final p3.c g = b2.g;
                            if (g.a != null || g.c != 0) {
                                if (this.e == null) {
                                    (this.e = new Paint(1)).setStyle(Paint$Style.FILL);
                                }
                                final Paint e2 = this.e;
                                final Shader a5 = g.a;
                                if (a5 != null) {
                                    a5.setLocalMatrix(this.c);
                                    e2.setShader(a5);
                                    e2.setAlpha(Math.round(b2.i * 255.0f));
                                }
                                else {
                                    e2.setShader((Shader)null);
                                    e2.setAlpha(255);
                                    final int c2 = g.c;
                                    final float m = b2.i;
                                    final PorterDuff$Mode o = v5.e.o;
                                    e2.setColor((c2 & 0xFFFFFF) | (int)(Color.alpha(c2) * m) << 24);
                                }
                                e2.setColorFilter((ColorFilter)null);
                                final Path b3 = this.b;
                                Path$FillType fillType2;
                                if (b2.c == 0) {
                                    fillType2 = Path$FillType.WINDING;
                                }
                                else {
                                    fillType2 = Path$FillType.EVEN_ODD;
                                }
                                b3.setFillType(fillType2);
                                canvas.drawPath(this.b, e2);
                            }
                            final p3.c e3 = b2.e;
                            if (e3.a != null || e3.c != 0) {
                                if (this.d == null) {
                                    (this.d = new Paint(1)).setStyle(Paint$Style.STROKE);
                                }
                                boolean b4 = true;
                                final Paint d2 = this.d;
                                final Paint$Join n14 = b2.n;
                                if (n14 != null) {
                                    d2.setStrokeJoin(n14);
                                }
                                final Paint$Cap m2 = b2.m;
                                if (m2 != null) {
                                    d2.setStrokeCap(m2);
                                }
                                d2.setStrokeMiter(b2.o);
                                final Shader a6 = e3.a;
                                if (a6 == null) {
                                    b4 = false;
                                }
                                if (b4) {
                                    a6.setLocalMatrix(this.c);
                                    d2.setShader(a6);
                                    d2.setAlpha(Math.round(b2.h * 255.0f));
                                }
                                else {
                                    d2.setShader((Shader)null);
                                    d2.setAlpha(255);
                                    final int c3 = e3.c;
                                    final float h = b2.h;
                                    final PorterDuff$Mode o2 = v5.e.o;
                                    d2.setColor((c3 & 0xFFFFFF) | (int)(Color.alpha(c3) * h) << 24);
                                }
                                d2.setColorFilter((ColorFilter)null);
                                d2.setStrokeWidth(b2.f * (n11 * min));
                                canvas.drawPath(this.b, d2);
                            }
                        }
                    }
                    f = this;
                }
            }
            canvas.restore();
        }
        
        public float getAlpha() {
            return this.getRootAlpha() / 255.0f;
        }
        
        public int getRootAlpha() {
            return this.l;
        }
        
        public void setAlpha(final float n) {
            this.setRootAlpha((int)(n * 255.0f));
        }
        
        public void setRootAlpha(final int l) {
            this.l = l;
        }
    }
    
    public static final class g extends Drawable$ConstantState
    {
        public int a;
        public f b;
        public ColorStateList c;
        public PorterDuff$Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff$Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;
        
        public g() {
            this.c = null;
            this.d = e.o;
            this.b = new f();
        }
        
        public g(final g g) {
            this.c = null;
            this.d = e.o;
            if (g != null) {
                this.a = g.a;
                final f b = new f(g.b);
                this.b = b;
                if (g.b.e != null) {
                    b.e = new Paint(g.b.e);
                }
                if (g.b.d != null) {
                    this.b.d = new Paint(g.b.d);
                }
                this.c = g.c;
                this.d = g.d;
                this.e = g.e;
            }
        }
        
        public int getChangingConfigurations() {
            return this.a;
        }
        
        public final Drawable newDrawable() {
            return new e(this);
        }
        
        public final Drawable newDrawable(final Resources resources) {
            return new e(this);
        }
    }
    
    public static final class h extends Drawable$ConstantState
    {
        public final Drawable$ConstantState a;
        
        public h(final Drawable$ConstantState a) {
            this.a = a;
        }
        
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }
        
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }
        
        public final Drawable newDrawable() {
            final e e = new e();
            e.f = this.a.newDrawable();
            return e;
        }
        
        public final Drawable newDrawable(final Resources resources) {
            final e e = new e();
            e.f = this.a.newDrawable(resources);
            return e;
        }
        
        public final Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
            final e e = new e();
            e.f = this.a.newDrawable(resources, resources$Theme);
            return e;
        }
    }
}
