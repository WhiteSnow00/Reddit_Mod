// 
// Decompiled by Procyon v0.6.0
// 

package rf;

import android.graphics.Paint;
import android.text.TextPaint;
import android.content.res.Resources$NotFoundException;
import android.util.Log;
import android.util.TypedValue;
import p3.f;
import android.content.res.TypedArray;
import oy0.b;
import android.content.Context;
import android.graphics.Typeface;
import android.content.res.ColorStateList;

public final class d
{
    public final float a;
    public final ColorStateList b;
    public final int c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public boolean k;
    public Typeface l;
    
    public d(final Context context, int n) {
        this.k = false;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, oy0.b.Z);
        this.a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.b = rf.c.a(context, obtainStyledAttributes, 3);
        rf.c.a(context, obtainStyledAttributes, 4);
        rf.c.a(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        n = 12;
        if (!obtainStyledAttributes.hasValue(12)) {
            n = 10;
        }
        this.j = obtainStyledAttributes.getResourceId(n, 0);
        this.e = obtainStyledAttributes.getString(n);
        obtainStyledAttributes.getBoolean(14, false);
        this.f = rf.c.a(context, obtainStyledAttributes, 6);
        this.g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }
    
    public final void a() {
        if (this.l == null) {
            final String e = this.e;
            if (e != null) {
                this.l = Typeface.create(e, this.c);
            }
        }
        if (this.l == null) {
            final int d = this.d;
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        this.l = Typeface.DEFAULT;
                    }
                    else {
                        this.l = Typeface.MONOSPACE;
                    }
                }
                else {
                    this.l = Typeface.SERIF;
                }
            }
            else {
                this.l = Typeface.SANS_SERIF;
            }
            this.l = Typeface.create(this.l, this.c);
        }
    }
    
    public final void b(final Context context, final android.support.v4.media.b b) {
        this.a();
        final int j = this.j;
        if (j == 0) {
            this.k = true;
        }
        if (this.k) {
            b.p2(this.l, true);
            return;
        }
        try {
            final f.e e = new f.e(this, b) {
                public final android.support.v4.media.b a;
                public final d b;
                
                @Override
                public final void c(final int n) {
                    this.b.k = true;
                    this.a.o2(n);
                }
                
                @Override
                public final void d(final Typeface typeface) {
                    final d b = this.b;
                    b.l = Typeface.create(typeface, b.c);
                    final d b2 = this.b;
                    b2.k = true;
                    this.a.p2(b2.l, false);
                }
            };
            final ThreadLocal<TypedValue> a = p3.f.a;
            if (context.isRestricted()) {
                ((f.e)e).a(-4);
            }
            else {
                p3.f.b(context, j, new TypedValue(), 0, (f.e)e, false);
            }
        }
        catch (final Exception ex) {
            final StringBuilder t = a.t("Error loading font ");
            t.append(this.e);
            Log.d("TextAppearance", t.toString(), (Throwable)ex);
            this.k = true;
            b.o2(-3);
        }
        catch (final Resources$NotFoundException ex2) {
            this.k = true;
            b.o2(1);
        }
    }
    
    public final void c(final Context context, final TextPaint textPaint, final android.support.v4.media.b b) {
        this.a();
        this.d(textPaint, this.l);
        this.b(context, (android.support.v4.media.b)new e(this, textPaint, b));
        final ColorStateList b2 = this.b;
        int colorForState;
        if (b2 != null) {
            colorForState = b2.getColorForState(textPaint.drawableState, b2.getDefaultColor());
        }
        else {
            colorForState = -16777216;
        }
        ((Paint)textPaint).setColor(colorForState);
        final float i = this.i;
        final float g = this.g;
        final float h = this.h;
        final ColorStateList f = this.f;
        int colorForState2;
        if (f != null) {
            colorForState2 = f.getColorForState(textPaint.drawableState, f.getDefaultColor());
        }
        else {
            colorForState2 = 0;
        }
        ((Paint)textPaint).setShadowLayer(i, g, h, colorForState2);
    }
    
    public final void d(final TextPaint textPaint, final Typeface typeface) {
        ((Paint)textPaint).setTypeface(typeface);
        final int n = ~typeface.getStyle() & this.c;
        ((Paint)textPaint).setFakeBoldText((n & 0x1) != 0x0);
        float textSkewX;
        if ((n & 0x2) != 0x0) {
            textSkewX = -0.25f;
        }
        else {
            textSkewX = 0.0f;
        }
        ((Paint)textPaint).setTextSkewX(textSkewX);
        ((Paint)textPaint).setTextSize(this.a);
    }
}
