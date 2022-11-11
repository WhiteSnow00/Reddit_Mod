// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

public class 178 extends h
{
    public static final int[] LIZIZ;
    public Drawable LIZ;
    public int LIZJ;
    public final Rect LIZLLL;
    
    static {
        Covode.recordClassIndex(1630);
        LIZIZ = new int[] { 16843284 };
    }
    
    public 178(final Context context, final int lizj) {
        this.LIZLLL = new Rect();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(178.LIZIZ);
        this.LIZ = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (lizj == 0 || lizj == 1) {
            this.LIZJ = lizj;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final RecyclerView recyclerView, final t t) {
        if (recyclerView.getLayoutManager() != null && this.LIZ != null) {
            final int lizj = this.LIZJ;
            final int n = 0;
            int i = 0;
            if (lizj == 1) {
                canvas.save();
                int paddingLeft;
                int width;
                if (recyclerView.getClipToPadding()) {
                    paddingLeft = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                }
                else {
                    width = recyclerView.getWidth();
                    paddingLeft = 0;
                }
                while (i < recyclerView.getChildCount()) {
                    final View child = recyclerView.getChildAt(i);
                    RecyclerView.LIZ(child, this.LIZLLL);
                    final int n2 = this.LIZLLL.bottom + Math.round(child.getTranslationY());
                    this.LIZ.setBounds(paddingLeft, n2 - this.LIZ.getIntrinsicHeight(), width, n2);
                    this.LIZ.draw(canvas);
                    ++i;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            int paddingTop;
            int height;
            if (recyclerView.getClipToPadding()) {
                paddingTop = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            }
            else {
                height = recyclerView.getHeight();
                paddingTop = 0;
            }
            for (int childCount = recyclerView.getChildCount(), j = n; j < childCount; ++j) {
                final View child2 = recyclerView.getChildAt(j);
                recyclerView.getLayoutManager();
                RecyclerView.LIZ(child2, this.LIZLLL);
                final int n3 = this.LIZLLL.right + Math.round(child2.getTranslationX());
                this.LIZ.setBounds(n3 - this.LIZ.getIntrinsicWidth(), paddingTop, n3, height);
                this.LIZ.draw(canvas);
            }
            canvas.restore();
        }
    }
    
    @Override
    public void LIZ(final Rect rect, final View view, final RecyclerView recyclerView, final t t) {
        final Drawable liz = this.LIZ;
        if (liz == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (this.LIZJ == 1) {
            rect.set(0, 0, 0, liz.getIntrinsicHeight());
            return;
        }
        rect.set(0, 0, liz.getIntrinsicWidth(), 0);
    }
    
    public final void LIZ(final Drawable liz) {
        if (liz != null) {
            this.LIZ = liz;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }
}
