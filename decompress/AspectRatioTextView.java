// 
// Decompiled by Procyon v0.6.0
// 

package com.yalantis.ucrop.view.widget;

import android.view.View;
import android.widget.TextView;
import android.graphics.Canvas;
import java.util.Locale;
import android.text.TextUtils;
import android.content.res.ColorStateList;
import n3.a;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import a4.a0;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.appcompat.widget.AppCompatTextView;

public class AspectRatioTextView extends AppCompatTextView
{
    public final Rect m;
    public Paint n;
    public int o;
    public String p;
    public float q;
    public float r;
    
    public AspectRatioTextView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AspectRatioTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        this.m = new Rect();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a0.Q);
        ((TextView)this).setGravity(1);
        this.p = obtainStyledAttributes.getString(0);
        this.q = obtainStyledAttributes.getFloat(1, 0.0f);
        this.r = obtainStyledAttributes.getFloat(2, 0.0f);
        this.o = ((View)this).getContext().getResources().getDimensionPixelSize(2131167012);
        (this.n = new Paint(1)).setStyle(Paint$Style.FILL);
        this.c();
        this.a(((View)this).getResources().getColor(2131100757));
        obtainStyledAttributes.recycle();
    }
    
    public final void a(final int color) {
        final Paint n = this.n;
        if (n != null) {
            n.setColor(color);
        }
        ((TextView)this).setTextColor(new ColorStateList(new int[][] { { 16842913 }, { 0 } }, new int[] { color, a.getColor(((View)this).getContext(), 2131100756) }));
    }
    
    public final void c() {
        if (!TextUtils.isEmpty((CharSequence)this.p)) {
            ((TextView)this).setText((CharSequence)this.p);
        }
        else {
            ((TextView)this).setText((CharSequence)String.format(Locale.US, "%d:%d", (int)this.q, (int)this.r));
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (((View)this).isSelected()) {
            canvas.getClipBounds(this.m);
            final Rect m = this.m;
            final float n = (m.right - m.left) / 2.0f;
            final float n2 = (float)m.bottom;
            final float n3 = m.top / 2.0f;
            final int o = this.o;
            canvas.drawCircle(n, n2 - n3 - o * 1.5f, o / 2.0f, this.n);
        }
    }
    
    public void setActiveColor(final int n) {
        this.a(n);
        ((View)this).invalidate();
    }
    
    public void setAspectRatio(final le2.a a) {
        this.p = a.f;
        this.q = a.g;
        this.r = a.h;
        this.c();
    }
}
