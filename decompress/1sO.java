// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextDirectionHeuristics;
import android.text.Layout$Alignment;
import android.text.StaticLayout$Builder;
import android.text.Layout;
import android.widget.TextView;
import android.os.Build$VERSION;
import android.text.StaticLayout;
import android.content.res.TypedArray;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Paint;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.widget.TextView$BufferType;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public class 1so extends 1ii
{
    public boolean LIZ;
    public 1ib LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public CharSequence LJI;
    public Drawable LJII;
    public Drawable LJIIIIZZ;
    public ColorStateList LJIIIZ;
    public TextView$BufferType LJIIJ;
    public int LJIIJJI;
    public TextPaint LJIIL;
    public ValueAnimator LJIILIIL;
    public Paint LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public Drawable LJIIZILJ;
    public 1It LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI;
    public 1ic LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    
    static {
        Covode.recordClassIndex(6098);
    }
    
    public 1so(final Context context) {
        this(context, null);
    }
    
    public 1so(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 1so(final Context context, final AttributeSet set, final byte b) {
        super(context, set, (byte)0);
        this.LIZLLL = -1;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIIJ = TextView$BufferType.NORMAL;
        this.LJIJJ = true;
        this.LJIJJLI = Integer.MAX_VALUE;
        this.LJIIJJI = context.getResources().getDimensionPixelSize(2131166073);
        inflate(context, 2131562149, (ViewGroup)this);
        this.LJIJ = (1It)this.findViewById(2131372704);
        this.LIZIZ = (1ib)this.findViewById(2131372778);
        final Drawable liziz = 01s.LIZIZ(this.getContext(), 2131234481);
        if (liziz != null) {
            (this.LJIIZILJ = 08U.LIZIZ(liziz)).mutate();
            this.LJIIZILJ.setState(this.getDrawableState());
        }
        (this.LJIILIIL = ValueAnimator.ofFloat(new float[] { 0.0f, 360.0f })).setRepeatCount(-1);
        this.LJIILIIL.setDuration(1000L);
        this.LJIILIIL.setInterpolator((TimeInterpolator)new LinearInterpolator());
        this.LJIILIIL.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0fc(this));
        (this.LJIL = new 1ic((View)this)).LIZ(set, 0, 0);
        if (set != null) {
            this.LJJIFFI = set.getAttributeResourceValue((String)null, "style", 0);
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842766, 16842804, 16842884, 16842904, 16842964, 16842966, 16842968, 16843039, 16843071, 16843072, 16843087, 2130969061, 2130969062, 2130969064, 2130969640, 2130969641, 2130969654, 2130969658, 2130970596 }, 0, 0);
        this.LIZ(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    private StaticLayout LIZ(final CharSequence charSequence, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return this.LIZIZ(charSequence, n);
        }
        return this.LIZJ(charSequence, n);
    }
    
    private void LIZ(final TypedArray typedArray) {
        this.setMaxWidth(Integer.MAX_VALUE);
        for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            if (index == 4) {
                final Drawable drawable = typedArray.getDrawable(4);
                if (drawable != null) {
                    ((View)this).setBackground(drawable);
                }
            }
            else if (index == 5) {
                this.setPadding(typedArray.getDimensionPixelSize(index, 0), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
                this.LIZJ();
            }
            else if (index == 6) {
                this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), typedArray.getDimensionPixelSize(index, 0), this.getPaddingBottom());
                this.LIZJ();
            }
            else if (index == 1) {
                final int resourceId = typedArray.getResourceId(index, 0);
                if (resourceId != 0) {
                    08p.LIZ(this.LIZIZ, resourceId);
                }
            }
            else if (index == 10) {
                this.setText(typedArray.getText(index));
            }
            else if (index == 3) {
                final ColorStateList liz = 0eN.LIZ(this.getContext(), typedArray, index);
                if (liz != null) {
                    this.LIZIZ.setTextColor(liz);
                }
            }
            else if (index == 0) {
                this.setEnabled(typedArray.getBoolean(index, this.isEnabled()));
            }
            else if (index == 14) {
                final int liz2 = 0eI.LIZ(this.getContext(), typedArray, index);
                if (liz2 != -1) {
                    this.setIcon(liz2);
                }
                else {
                    this.setIcon(null);
                }
            }
            else if (index == 17) {
                final ColorStateList liz3 = 0eN.LIZ(this.getContext(), typedArray, index);
                if ((this.LJIIIZ = liz3) != null) {
                    this.LJIJ.setIconTintList(liz3);
                    final Drawable ljiizilj = this.LJIIZILJ;
                    if (ljiizilj != null) {
                        ljiizilj.setTintList(this.LJIIIZ);
                    }
                }
            }
            else if (index == 16) {
                this.setIconSize(typedArray.getDimensionPixelSize(index, 0));
            }
            else if (index == 9) {
                this.setMinHeight(typedArray.getDimensionPixelSize(index, 0));
            }
            else if (index == 8) {
                this.setMinWidth(typedArray.getDimensionPixelSize(index, 0));
            }
            else if (index == 7) {
                this.setMaxWidth(typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE));
            }
            else if (index == 12) {
                this.LIZLLL = typedArray.getDimensionPixelSize(12, 0);
            }
            else if (index == 11) {
                this.LJ = typedArray.getDimensionPixelSize(11, 0);
            }
            else if (index == 13) {
                this.LJFF = typedArray.getDimensionPixelSize(13, 0);
            }
            else if (index == 18) {
                final int dimensionPixelSize = typedArray.getDimensionPixelSize(18, 0);
                this.LJIILL = dimensionPixelSize;
                this.LJIIZILJ.setBounds(-dimensionPixelSize / 2, -dimensionPixelSize / 2, dimensionPixelSize / 2, dimensionPixelSize / 2);
            }
            else if (index == 15) {
                this.setIconAutoMirrored(typedArray.getBoolean(15, this.LJIJJ));
            }
        }
    }
    
    private boolean LIZ(final Layout layout, final CharSequence charSequence) {
        return layout.getLineCount() == 1 && layout.getLineEnd(layout.getLineCount() - 1) == charSequence.length();
    }
    
    private StaticLayout LIZIZ(final CharSequence charSequence, final int n) {
        return StaticLayout$Builder.obtain(charSequence, 0, charSequence.length(), this.LJIIL, n).setAlignment(Layout$Alignment.ALIGN_NORMAL).setLineSpacing(this.LIZIZ.getLineSpacingExtra(), this.LIZIZ.getLineSpacingMultiplier()).setIncludePad(this.LIZIZ.getIncludeFontPadding()).setBreakStrategy(this.LIZIZ.getBreakStrategy()).setHyphenationFrequency(this.LIZIZ.getHyphenationFrequency()).setMaxLines(this.LIZIZ.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
    }
    
    private StaticLayout LIZJ(final CharSequence charSequence, final int n) {
        return new StaticLayout(charSequence, this.LJIIL, n, Layout$Alignment.ALIGN_NORMAL, this.LIZIZ.getLineSpacingMultiplier(), this.LIZIZ.getLineSpacingExtra(), this.LIZIZ.getIncludeFontPadding());
    }
    
    private void LIZJ() {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.LIZIZ.getLayoutParams();
        int n;
        if (this.LJIIIIZZ == null) {
            n = 0;
        }
        else {
            n = this.LIZJ + this.LJIIJJI;
        }
        final int n2 = this.getMaxWidth() - this.getPaddingLeft() - this.getPaddingRight() - viewGroup$MarginLayoutParams.leftMargin - viewGroup$MarginLayoutParams.rightMargin - n;
        this.LJIJJLI = n2;
        this.LIZIZ.setMaxWidth(n2);
    }
    
    private void LIZLLL() {
        this.LJIJ.setIconAutoMirrored(this.LJIJJ);
    }
    
    private void LJ() {
        this.LIZIZ.setText(this.LJI, this.LJIIJ);
        int n;
        if (TextUtils.isEmpty(this.LJI)) {
            n = 8;
        }
        else {
            n = 0;
        }
        if (this.LIZ) {
            if (n == 8) {
                this.LIZIZ.setVisibility(8);
            }
            this.LJJI = n;
        }
        else {
            this.LIZIZ.setVisibility(n);
        }
        this.requestLayout();
    }
    
    private int getIconExtra() {
        if (this.LJIIIIZZ == null) {
            return 0;
        }
        return this.LIZJ + this.LJIIJJI;
    }
    
    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LJJ = this.LJIJ.getVisibility();
        this.LJJI = this.LIZIZ.getVisibility();
        if (this.LJIJ.getVisibility() == 0) {
            this.LJIJ.setVisibility(4);
        }
        if (this.LIZIZ.getVisibility() == 0) {
            this.LIZIZ.setVisibility(4);
        }
        this.LIZ = true;
        this.LJIILIIL.start();
    }
    
    public final void LIZ(final int ljjiffi) {
        if (this.LJJIFFI != ljjiffi) {
            this.LIZJ(this.LJJIFFI = ljjiffi);
            this.LIZIZ(ljjiffi);
            final 1ic ljil = this.LJIL;
            if (ljil != null) {
                ljil.LIZ(ljjiffi);
            }
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(ljjiffi, new int[] { 16842766, 16842804, 16842884, 16842904, 16842964, 16842966, 16842968, 16843039, 16843071, 16843072, 16843087, 2130969061, 2130969062, 2130969064, 2130969640, 2130969641, 2130969654, 2130969658, 2130970596 });
            this.LIZ(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
    }
    
    public final void LIZIZ() {
        if (!this.LIZ) {
            return;
        }
        this.LJIJ.setVisibility(this.LJJ);
        this.LIZIZ.setVisibility(this.LJJI);
        this.LIZ = false;
        this.LJIILIIL.cancel();
        this.invalidate();
    }
    
    @Override
    public void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.LIZ && this.LJIIZILJ != null) {
            ((View)this).getPaddingEnd();
            canvas.save();
            canvas.translate(this.getMeasuredWidth() / 2.0f, this.getMeasuredHeight() / 2.0f);
            canvas.rotate((float)this.LJIILIIL.getAnimatedValue());
            this.LJIIZILJ.draw(canvas);
            canvas.restore();
        }
    }
    
    @Override
    public void draw(final Canvas canvas) {
        final 1ic ljil = this.LJIL;
        if (ljil == null) {
            super.draw(canvas);
            return;
        }
        final boolean liz = ljil.LIZ(canvas);
        super.draw(canvas);
        this.LJIL.LIZ(canvas, liz);
    }
    
    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            ljiizilj.setState(this.getDrawableState());
            this.LJIIZILJ.invalidateSelf();
        }
        this.invalidate();
    }
    
    public CharSequence getText() {
        return this.LJI;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJIILIIL.cancel();
    }
    
    @Override
    public void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final boolean empty = TextUtils.isEmpty(this.LJI);
        boolean ljiilliil = false;
        Label_0330: {
            if (!empty) {
                final int size = View$MeasureSpec.getSize(n);
                final a layoutParams = (a)this.LIZIZ.getLayoutParams();
                layoutParams.constrainedWidth = true;
                layoutParams.matchConstraintDefaultWidth = 1;
                final TextPaint ljiil = this.LJIIL;
                if (ljiil == null) {
                    this.LJIIL = new TextPaint();
                }
                else {
                    ljiil.reset();
                }
                this.LJIIL.set(this.LIZIZ.getPaint());
                this.LJIIL.setTextSize((float)this.LJ);
                int n3;
                if (mode == Integer.MIN_VALUE) {
                    n3 = Math.min(size, this.getMinWidth());
                }
                else {
                    n3 = Math.min(size, this.getMaxWidth());
                }
                final int width = n3 - this.getPaddingLeft() - this.getPaddingRight() - this.getIconExtra();
                final int n4 = width - this.LIZIZ.getPaddingLeft() - this.LIZIZ.getPaddingRight();
                if (n4 > 0) {
                    if (!this.LIZ((Layout)this.LIZ(this.LJI, n4), this.LJI)) {
                        this.LJIIL.setTextSize((float)this.LIZLLL);
                        if (this.LIZ((Layout)this.LIZ(this.LJI, n4), this.LJI)) {
                            if (layoutParams.width != width) {
                                layoutParams.width = width;
                                this.LIZIZ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            }
                            if (this.LJIJI) {
                                this.LIZIZ.setSingleLine(false);
                                this.LJIJI = false;
                                this.LIZIZ.setLines(1);
                            }
                            if (this.LIZLLL > 0 && this.LJ > 0 && this.LJFF > 0) {
                                final 1ib liziz = this.LIZIZ;
                                Label_0310: {
                                    int n5;
                                    if (Build$VERSION.SDK_INT >= 27) {
                                        n5 = liziz.getAutoSizeTextType();
                                    }
                                    else {
                                        if (!(liziz instanceof 08i)) {
                                            break Label_0310;
                                        }
                                        n5 = liziz.getAutoSizeTextType();
                                    }
                                    if (n5 == 1) {
                                        break Label_0330;
                                    }
                                }
                                08p.LIZ(this.LIZIZ, this.LIZLLL, this.LJ, this.LJFF, 0);
                            }
                        }
                        else {
                            08p.LIZ(this.LIZIZ);
                            final float textSize = this.LIZIZ.getTextSize();
                            final int lizlll = this.LIZLLL;
                            if (textSize != lizlll) {
                                this.LIZIZ.setTextSize(0, (float)lizlll);
                            }
                            if (!this.LJIJI) {
                                this.LIZIZ.setSingleLine(true);
                                this.LJIJI = true;
                            }
                            final int min = Math.min(this.LJIJJLI, size - this.getPaddingLeft() - this.getPaddingRight() - this.getIconExtra());
                            if (this.LIZIZ.getMaxWidth() != min) {
                                this.LIZIZ.setMaxWidth(min);
                            }
                            if (layoutParams.width != -2) {
                                layoutParams.width = -2;
                                this.LIZIZ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            }
                        }
                    }
                    else {
                        08p.LIZ(this.LIZIZ);
                        final float textSize2 = this.LIZIZ.getTextSize();
                        final int lj = this.LJ;
                        if (textSize2 != lj) {
                            this.LIZIZ.setTextSize(0, (float)lj);
                        }
                        if (layoutParams.width != -2) {
                            layoutParams.width = -2;
                            this.LIZIZ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                        }
                        this.LIZIZ.setMaxWidth(size - this.getPaddingLeft() - this.getPaddingRight() - this.getIconExtra());
                        if (!this.LJIJI) {
                            this.LIZIZ.setSingleLine(true);
                            this.LJIJI = true;
                        }
                    }
                }
                else {
                    08p.LIZ(this.LIZIZ);
                }
            }
            else {
                08p.LIZ(this.LIZIZ);
            }
        }
        super.onMeasure(n, n2);
        if (((View)this).getLayoutDirection() == 1) {
            ljiilliil = true;
        }
        this.LJIILLIIL = ljiilliil;
        if (this.LJIILJJIL == null) {
            (this.LJIILJJIL = new Paint(1)).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        }
        LinearGradient shader;
        if (this.LJIILLIIL) {
            shader = new LinearGradient((float)((View)this).getPaddingEnd(), 0.0f, (float)(((View)this).getPaddingEnd() + this.LJIILL * 2), 0.0f, new int[] { -16777216, -16777216, 0 }, new float[] { 0.0f, 0.5f, 1.0f }, Shader$TileMode.CLAMP);
        }
        else {
            shader = new LinearGradient((float)(this.getMeasuredWidth() - ((View)this).getPaddingEnd() - this.LJIILL * 2), 0.0f, (float)(this.getMeasuredWidth() - ((View)this).getPaddingEnd()), 0.0f, new int[] { 0, -16777216, -16777216 }, new float[] { 0.0f, 0.5f, 1.0f }, Shader$TileMode.CLAMP);
        }
        this.LJIILJJIL.setShader((Shader)shader);
    }
    
    public void setIcon(final int n) {
        this.setIcon(0ep.a.LIZ.LIZ(this.getContext(), n));
        this.setIconAutoMirrored(0ep.a.LIZ.LIZ(n, false));
    }
    
    public void setIcon(final Drawable drawable) {
        Drawable liz = drawable;
        if (drawable instanceof 1Iu) {
            liz = ((0eH)drawable).LIZ;
        }
        if (this.LJII != liz) {
            int n;
            if ((this.LJII = liz) != null) {
                this.LJIIIIZZ = liz;
                this.LJIJ.setIcon(liz);
                this.LJIJ.setIconTintList(this.LJIIIZ);
                this.LIZLLL();
                n = 0;
            }
            else {
                this.LJIIIIZZ = null;
                this.LJIJ.setIcon(null);
                n = 8;
            }
            if (this.LIZ) {
                if (n == 8) {
                    this.LJIJ.setVisibility(8);
                }
                this.LJJ = n;
            }
            else {
                this.LJIJ.setVisibility(n);
            }
            this.LIZJ();
            this.requestLayout();
        }
    }
    
    public void setIconAttr(final int n) {
        this.setIcon(0eI.LIZ(this.getContext(), 2131886327, n));
    }
    
    public void setIconAutoMirrored(final boolean ljijj) {
        if (this.LJIJJ != ljijj) {
            this.LJIJJ = ljijj;
            this.LIZLLL();
        }
    }
    
    public void setIconSize(final int height) {
        if (height != this.LIZJ) {
            this.LIZJ = height;
            final ViewGroup$LayoutParams layoutParams = this.LJIJ.getLayoutParams();
            layoutParams.width = height;
            layoutParams.height = height;
            this.LJIJ.setLayoutParams(layoutParams);
            this.LIZJ();
            this.requestLayout();
        }
    }
    
    @Override
    public void setMaxWidth(final int maxWidth) {
        super.setMaxWidth(maxWidth);
        this.LIZJ();
    }
    
    public void setText(final int n) {
        this.LJI = this.getContext().getResources().getText(n);
        this.LJ();
    }
    
    public void setText(final CharSequence lji) {
        this.LJI = lji;
        this.LJ();
    }
}
