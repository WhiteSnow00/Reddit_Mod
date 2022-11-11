// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.date;

import android.view.View;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Paint$Align;
import n3.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;

public class TextViewWithCircularIndicator extends AppCompatTextView
{
    public Paint m;
    public int n;
    public final String o;
    public boolean p;
    
    public TextViewWithCircularIndicator(final Context context, final AttributeSet set) {
        super(context, set);
        this.m = new Paint();
        this.n = a.getColor(context, 2131100172);
        this.o = context.getResources().getString(2131955701);
        this.m.setFakeBoldText(true);
        this.m.setAntiAlias(true);
        this.m.setColor(this.n);
        this.m.setTextAlign(Paint$Align.CENTER);
        this.m.setStyle(Paint$Style.FILL);
        this.m.setAlpha(255);
    }
    
    public CharSequence getContentDescription() {
        CharSequence charSequence = this.getText();
        if (this.p) {
            charSequence = String.format(this.o, charSequence);
        }
        return charSequence;
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.p) {
            final int width = ((View)this).getWidth();
            final int height = ((View)this).getHeight();
            canvas.drawCircle((float)(width / 2), (float)(height / 2), (float)(Math.min(width, height) / 2), this.m);
        }
        ((View)this).setSelected(this.p);
        super.onDraw(canvas);
    }
}
