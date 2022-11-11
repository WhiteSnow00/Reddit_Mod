// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.colorPicker;

import android.widget.CompoundButton;
import android.view.View;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import aa1.a;
import android.util.AttributeSet;
import sg2.e;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.graphics.Paint;
import kotlin.Metadata;
import androidx.appcompat.widget.q;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/colorPicker/ColorRadioButton;", "Landroidx/appcompat/widget/q;", "Lhg2/j;", "init", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "checked", "setChecked", "Landroid/graphics/Paint;", "mainColorPaint", "Landroid/graphics/Paint;", "selectedStrokePaint", "", "radioColor", "I", "getRadioColor", "()I", "setRadioColor", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class ColorRadioButton extends q
{
    private static final float CHECKED_STROKE_WIDTH = 3.0f;
    public static final ColorRadioButton.ColorRadioButton$Companion Companion;
    private static final int HALF = 2;
    private static final int MAIN_COLOR_CIRCLE_PADDING = 20;
    private static final int OUTER_STROKE_PADDING = 15;
    private static final int SELECTED_CIRCLE_PADDING = 5;
    private Paint mainColorPaint;
    private int radioColor;
    private Paint selectedStrokePaint;
    
    static {
        Companion = new ColorRadioButton.ColorRadioButton$Companion((DefaultConstructorMarker)null);
    }
    
    public ColorRadioButton(final Context context) {
        e.f((Object)context, "context");
        this(context, null, 0, 6, null);
    }
    
    public ColorRadioButton(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0, 4, null);
    }
    
    public ColorRadioButton(final Context context, AttributeSet obtainStyledAttributes, final int n) {
        e.f((Object)context, "context");
        super(context, obtainStyledAttributes, n);
        obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, a.n, 0, 0);
        e.e((Object)obtainStyledAttributes, "context.obtainStyledAttr\u2026e.ColorRadioButton, 0, 0)");
        try {
            this.radioColor = ((TypedArray)obtainStyledAttributes).getColor(0, -1);
            ((TypedArray)obtainStyledAttributes).recycle();
            this.init();
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    private final void init() {
        final Paint mainColorPaint = new Paint(1);
        mainColorPaint.setAntiAlias(true);
        mainColorPaint.setDither(true);
        mainColorPaint.setStyle(Paint$Style.FILL);
        mainColorPaint.setColor(this.radioColor);
        this.mainColorPaint = mainColorPaint;
        final Paint selectedStrokePaint = new Paint(1);
        selectedStrokePaint.setStrokeWidth(3.0f);
        selectedStrokePaint.setStyle(Paint$Style.STROKE);
        selectedStrokePaint.setColor(n3.a.getColor(((View)this).getContext(), 2131100618));
        this.selectedStrokePaint = selectedStrokePaint;
    }
    
    public final int getRadioColor() {
        return this.radioColor;
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Paint mainColorPaint = this.mainColorPaint;
        if (mainColorPaint == null) {
            e.n("mainColorPaint");
            throw null;
        }
        mainColorPaint.setColor(-1);
        if (canvas != null) {
            final float n = (float)(((View)this).getWidth() / 2);
            final float n2 = (float)(((View)this).getHeight() / 2);
            final float n3 = (float)(((View)this).getWidth() / 2);
            final float n4 = 15;
            final Paint mainColorPaint2 = this.mainColorPaint;
            if (mainColorPaint2 == null) {
                e.n("mainColorPaint");
                throw null;
            }
            canvas.drawCircle(n, n2, n3 - n4, mainColorPaint2);
        }
        final Paint mainColorPaint3 = this.mainColorPaint;
        if (mainColorPaint3 != null) {
            mainColorPaint3.setColor(this.radioColor);
            if (canvas != null) {
                final float n5 = (float)(((View)this).getWidth() / 2);
                final float n6 = (float)(((View)this).getHeight() / 2);
                final float n7 = (float)(((View)this).getWidth() / 2);
                final float n8 = 20;
                final Paint mainColorPaint4 = this.mainColorPaint;
                if (mainColorPaint4 == null) {
                    e.n("mainColorPaint");
                    throw null;
                }
                canvas.drawCircle(n5, n6, n7 - n8, mainColorPaint4);
            }
            if (((CompoundButton)this).isChecked()) {
                final Paint selectedStrokePaint = this.selectedStrokePaint;
                if (selectedStrokePaint == null) {
                    e.n("selectedStrokePaint");
                    throw null;
                }
                selectedStrokePaint.setColor(n3.a.getColor(((View)this).getContext(), 2131100618));
            }
            else {
                final Paint selectedStrokePaint2 = this.selectedStrokePaint;
                if (selectedStrokePaint2 == null) {
                    e.n("selectedStrokePaint");
                    throw null;
                }
                selectedStrokePaint2.setColor(0);
            }
            if (canvas != null) {
                final float n9 = (float)(((View)this).getWidth() / 2);
                final float n10 = (float)(((View)this).getHeight() / 2);
                final float n11 = (float)(((View)this).getWidth() / 2);
                final float n12 = 5;
                final Paint selectedStrokePaint3 = this.selectedStrokePaint;
                if (selectedStrokePaint3 == null) {
                    e.n("selectedStrokePaint");
                    throw null;
                }
                canvas.drawCircle(n9, n10, n11 - n12, selectedStrokePaint3);
            }
            return;
        }
        e.n("mainColorPaint");
        throw null;
    }
    
    public void setChecked(final boolean checked) {
        super.setChecked(checked);
        ((View)this).invalidate();
    }
    
    public final void setRadioColor(final int radioColor) {
        this.radioColor = radioColor;
    }
}
