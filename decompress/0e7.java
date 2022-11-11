// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.Layout$Alignment;
import android.text.StaticLayout$Builder;
import android.os.Build$VERSION;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.text.TextPaint;
import android.graphics.Paint;
import android.view.ViewGroup;

public final class 0e7 extends ViewGroup
{
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public Paint LIZLLL;
    public final TextPaint LJ;
    public int LJFF;
    public int LJI;
    
    static {
        Covode.recordClassIndex(5928);
    }
    
    public 0e7(final Context context) {
        super(context);
        MethodCollector.i(394);
        this.LJ = new TextPaint();
        this.setWillNotDraw(false);
        this.LIZJ = this.getContext().getResources().getDimensionPixelSize(2131165792);
        (this.LIZLLL = new Paint(1)).setColor(0eI.LIZ((View)this, 2130971360));
        this.LIZLLL.setStrokeWidth((float)this.LIZJ);
        this.LJFF = this.getContext().getResources().getDimensionPixelSize(2131165773);
        this.LJI = this.getContext().getResources().getDimensionPixelSize(2131165772);
        MethodCollector.o(394);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final int childCount = this.getChildCount();
        if (childCount > 0) {
            canvas.drawRect(0.0f, (float)this.LJI, (float)this.getWidth(), (float)(this.LJI + this.LIZJ), this.LIZLLL);
            final int liziz = this.LIZIZ;
            int i = 1;
            final int n = 1;
            if (liziz == 1) {
                final int n2 = (this.getWidth() - (childCount - 1) * this.LIZJ) / childCount;
                for (int j = n; j < childCount; ++j) {
                    final int lizj = this.LIZJ;
                    final float n3 = (float)(j * n2 + (j - 1) * lizj);
                    final int lji = this.LJI;
                    canvas.drawRect(n3, (float)(lji + lizj), n3 + lizj, (float)(lji + lizj + this.LJFF), this.LIZLLL);
                }
                return;
            }
            while (i < childCount) {
                final View child = this.getChildAt(i - 1);
                canvas.drawRect(0.0f, (float)child.getBottom(), (float)this.getWidth(), (float)(child.getBottom() + this.LIZJ), this.LIZLLL);
                ++i;
            }
        }
    }
    
    public final void onLayout(final boolean b, int n, int layoutDirection, final int n2, int n3) {
        final int childCount = this.getChildCount();
        layoutDirection = ((View)this).getLayoutDirection();
        n3 = 0;
        if (layoutDirection == 1) {
            layoutDirection = 1;
        }
        else {
            layoutDirection = 0;
        }
        if (childCount > 0) {
            if (this.LIZIZ == 1) {
                final int n4 = this.LJI + this.LIZJ;
                final int ljff = this.LJFF;
                do {
                    final View child = this.getChildAt(n3);
                    int n5;
                    if (layoutDirection != 0) {
                        n5 = (child.getMeasuredWidth() + this.LIZJ) * n3;
                    }
                    else {
                        n5 = n2 - n - (n3 + 1) * child.getMeasuredWidth() - this.LIZJ * n3;
                    }
                    child.layout(n5, n4, child.getMeasuredWidth() + n5, ljff + n4);
                } while (++n3 < childCount);
                return;
            }
            layoutDirection = this.LJI + this.LIZJ;
            n = 0;
            do {
                final View child2 = this.getChildAt(n);
                child2.layout(0, layoutDirection, child2.getMeasuredWidth(), child2.getMeasuredHeight() + layoutDirection);
                layoutDirection += child2.getMeasuredHeight() + this.LIZJ;
            } while (++n < childCount);
        }
    }
    
    public final void onMeasure(int i, int n) {
        MethodCollector.i(2374);
        final int childCount = this.getChildCount();
        if (childCount <= 0) {
            super.onMeasure(i, n);
            MethodCollector.o(2374);
            return;
        }
        final int size = View$MeasureSpec.getSize(i);
        final int n2 = (size - (this.getChildCount() - 1) * this.LIZJ) / this.getChildCount();
        i = this.LIZ;
        final int n3 = 0;
        final int n4 = 0;
        if (i == 0) {
            n = 0;
            while (true) {
                final TextView textView = (TextView)this.getChildAt(n);
                final int n5 = n2 - textView.getPaddingLeft() - textView.getPaddingRight();
                final CharSequence text = textView.getText();
                if (n5 > 0 && !TextUtils.isEmpty(text)) {
                    this.LJ.reset();
                    this.LJ.set(textView.getPaint());
                    final TextPaint lj = this.LJ;
                    if (Build$VERSION.SDK_INT >= 27) {
                        i = textView.getAutoSizeMaxTextSize();
                    }
                    else if (textView instanceof 08i) {
                        i = ((08i)textView).getAutoSizeMaxTextSize();
                    }
                    else {
                        i = -1;
                    }
                    lj.setTextSize((float)i);
                    final TextPaint lj2 = this.LJ;
                    StaticLayout build;
                    if (Build$VERSION.SDK_INT >= 23) {
                        build = StaticLayout$Builder.obtain(text, 0, text.length(), lj2, n5).setAlignment(Layout$Alignment.ALIGN_NORMAL).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(textView.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
                    }
                    else {
                        build = new StaticLayout(text, lj2, n5, Layout$Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                    }
                    if (((Layout)build).getLineCount() != 1 || ((Layout)build).getLineEnd(((Layout)build).getLineCount() - 1) != text.length()) {
                        this.LIZIZ = 2;
                        break;
                    }
                }
                if (++n < childCount) {
                    continue;
                }
                this.LIZIZ = 1;
                break;
            }
        }
        else {
            this.LIZIZ = i;
        }
        i = n3;
        if (this.LIZIZ == 1) {
            i = n4;
            do {
                this.getChildAt(i).measure(View$MeasureSpec.makeMeasureSpec(n2, 1073741824), View$MeasureSpec.makeMeasureSpec(this.LJFF, 1073741824));
            } while (++i < childCount);
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(size, 1073741824), View$MeasureSpec.makeMeasureSpec(this.LJI + this.LIZJ + this.LJFF, 1073741824));
            MethodCollector.o(2374);
            return;
        }
        do {
            this.getChildAt(i).measure(View$MeasureSpec.makeMeasureSpec(size, 1073741824), View$MeasureSpec.makeMeasureSpec(this.LJFF, 1073741824));
            ++i;
        } while (i < childCount);
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(size, 1073741824), View$MeasureSpec.makeMeasureSpec(this.LJI + (this.LIZJ + this.LJFF) * childCount, 1073741824));
        MethodCollector.o(2374);
    }
    
    public final void setOrientation(final int liz) {
        this.LIZ = liz;
        this.requestLayout();
    }
}
