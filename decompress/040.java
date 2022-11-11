// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ActionMode$Callback;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Region$Op;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable$Callback;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import androidx.appcompat.widget.u;
import android.text.method.TransformationMethod;
import android.text.Layout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.widget.CompoundButton;

public class 040 extends CompoundButton
{
    public static final Property<040, Float> LIZJ;
    public static final int[] LJJJ;
    public float LIZ;
    public ObjectAnimator LIZIZ;
    public Drawable LIZLLL;
    public ColorStateList LJ;
    public PorterDuff$Mode LJFF;
    public boolean LJI;
    public boolean LJII;
    public Drawable LJIIIIZZ;
    public ColorStateList LJIIIZ;
    public PorterDuff$Mode LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public CharSequence LJIIZILJ;
    public CharSequence LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public float LJIL;
    public float LJJ;
    public VelocityTracker LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public final TextPaint LJJIJIIJI;
    public ColorStateList LJJIJIIJIL;
    public Layout LJJIJIL;
    public Layout LJJIJL;
    public TransformationMethod LJJIJLIJ;
    public final u LJJIL;
    public final Rect LJJIZ;
    
    static {
        Covode.recordClassIndex(496);
        LIZJ = new 03z(Float.class, "thumbPos");
        LJJJ = new int[] { 16842912 };
    }
    
    public 040(final Context context, final AttributeSet set) {
        this(context, set, 2130971137);
    }
    
    public 040(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.LJJI = VelocityTracker.obtain();
        this.LJJIZ = new Rect();
        boolean fakeBoldText = true;
        final TextPaint ljjijiiji = new TextPaint(1);
        this.LJJIJIIJI = ljjijiiji;
        ljjijiiji.density = this.getResources().getDisplayMetrics().density;
        final 043 liz = 043.LIZ(context, set, new int[] { 16843044, 16843045, 16843074, 2130970977, 2130971017, 2130971135, 2130971136, 2130971138, 2130971234, 2130971235, 2130971236, 2130971284, 2130971285, 2130971286 }, n, 0);
        final Drawable liz2 = liz.LIZ(2);
        this.LIZLLL = liz2;
        if (liz2 != null) {
            liz2.setCallback((Drawable$Callback)this);
        }
        final Drawable liz3 = liz.LIZ(11);
        if ((this.LJIIIIZZ = liz3) != null) {
            liz3.setCallback((Drawable$Callback)this);
        }
        this.LJIIZILJ = liz.LIZJ(0);
        this.LJIJ = liz.LIZJ(1);
        this.LJIJI = liz.LIZ(3, true);
        this.LJIILIIL = liz.LIZLLL(8, 0);
        this.LJIILJJIL = liz.LIZLLL(5, 0);
        this.LJIILL = liz.LIZLLL(6, 0);
        this.LJIILLIIL = liz.LIZ(4, false);
        final ColorStateList lj = liz.LJ(9);
        if (lj != null) {
            this.LJ = lj;
            this.LJI = true;
        }
        final PorterDuff$Mode liz4 = 04a.LIZ(liz.LIZ(10, -1), null);
        if (this.LJFF != liz4) {
            this.LJFF = liz4;
            this.LJII = true;
        }
        if (this.LJI || this.LJII) {
            this.LIZIZ();
        }
        final ColorStateList lj2 = liz.LJ(12);
        if (lj2 != null) {
            this.LJIIIZ = lj2;
            this.LJIIJJI = true;
        }
        final PorterDuff$Mode liz5 = 04a.LIZ(liz.LIZ(13, -1), null);
        if (this.LJIIJ != liz5) {
            this.LJIIJ = liz5;
            this.LJIIL = true;
        }
        if (this.LJIIJJI || this.LJIIL) {
            this.LIZ();
        }
        final int ljff = liz.LJFF(7, 0);
        if (ljff != 0) {
            final 043 liz6 = 043.LIZ(context, ljff, new int[] { 16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, 2130969583, 2130969592, 2130971189, 2130971220 });
            final ColorStateList lj3 = liz6.LJ(3);
            if (lj3 != null) {
                this.LJJIJIIJIL = lj3;
            }
            else {
                this.LJJIJIIJIL = this.getTextColors();
            }
            final int lizlll = liz6.LIZLLL(0, 0);
            if (lizlll != 0) {
                final float textSize = (float)lizlll;
                if (textSize != ljjijiiji.getTextSize()) {
                    ljjijiiji.setTextSize(textSize);
                    this.requestLayout();
                }
            }
            final int liz7 = liz6.LIZ(1, -1);
            final int liz8 = liz6.LIZ(2, -1);
            Typeface switchTypeface;
            if (liz7 != 1) {
                if (liz7 != 2) {
                    if (liz7 != 3) {
                        switchTypeface = null;
                    }
                    else {
                        switchTypeface = Typeface.MONOSPACE;
                    }
                }
                else {
                    switchTypeface = Typeface.SERIF;
                }
            }
            else {
                switchTypeface = Typeface.SANS_SERIF;
            }
            float textSkewX = 0.0f;
            if (liz8 > 0) {
                Typeface switchTypeface2;
                if (switchTypeface == null) {
                    switchTypeface2 = Typeface.defaultFromStyle(liz8);
                }
                else {
                    switchTypeface2 = Typeface.create(switchTypeface, liz8);
                }
                this.setSwitchTypeface(switchTypeface2);
                int style;
                if (switchTypeface2 != null) {
                    style = switchTypeface2.getStyle();
                }
                else {
                    style = 0;
                }
                final int n2 = ~style & liz8;
                if ((n2 & 0x1) == 0x0) {
                    fakeBoldText = false;
                }
                ljjijiiji.setFakeBoldText(fakeBoldText);
                if ((n2 & 0x2) != 0x0) {
                    textSkewX = -0.25f;
                }
                ljjijiiji.setTextSkewX(textSkewX);
            }
            else {
                ljjijiiji.setFakeBoldText(false);
                ljjijiiji.setTextSkewX(0.0f);
                this.setSwitchTypeface(switchTypeface);
            }
            if (liz6.LIZ(14, false)) {
                this.LJJIJLIJ = (TransformationMethod)new 02Q(this.getContext());
            }
            else {
                this.LJJIJLIJ = null;
            }
            liz6.LIZ.recycle();
        }
        (this.LJJIL = new u((TextView)this)).LIZ(set, n);
        liz.LIZ.recycle();
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.LJIJJLI = value.getScaledTouchSlop();
        this.LJJIFFI = value.getScaledMinimumFlingVelocity();
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }
    
    private Layout LIZ(CharSequence transformation) {
        final CharSequence charSequence = transformation;
        final TransformationMethod ljjijlij = this.LJJIJLIJ;
        transformation = charSequence;
        if (ljjijlij != null) {
            transformation = ljjijlij.getTransformation(charSequence, (View)this);
        }
        final TextPaint ljjijiiji = this.LJJIJIIJI;
        int n;
        if (transformation != null) {
            n = (int)Math.ceil(Layout.getDesiredWidth(transformation, ljjijiiji));
        }
        else {
            n = 0;
        }
        return (Layout)new StaticLayout(transformation, ljjijiiji, n, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }
    
    private void LIZ() {
        final Drawable ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null && (this.LJIIJJI || this.LJIIL)) {
            final Drawable mutate = 08U.LIZIZ(ljiiiizz).mutate();
            this.LJIIIIZZ = mutate;
            if (this.LJIIJJI) {
                mutate.setTintList(this.LJIIIZ);
            }
            if (this.LJIIL) {
                this.LJIIIIZZ.setTintMode(this.LJIIJ);
            }
            if (this.LJIIIIZZ.isStateful()) {
                this.LJIIIIZZ.setState(this.getDrawableState());
            }
        }
    }
    
    private void LIZIZ() {
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null && (this.LJI || this.LJII)) {
            final Drawable mutate = 08U.LIZIZ(lizlll).mutate();
            this.LIZLLL = mutate;
            if (this.LJI) {
                mutate.setTintList(this.LJ);
            }
            if (this.LJII) {
                this.LIZLLL.setTintMode(this.LJFF);
            }
            if (this.LIZLLL.isStateful()) {
                this.LIZLLL.setState(this.getDrawableState());
            }
        }
    }
    
    private boolean getTargetCheckedState() {
        return this.LIZ > 0.5f;
    }
    
    private int getThumbOffset() {
        float liz;
        if (04A.LIZ((View)this)) {
            liz = 1.0f - this.LIZ;
        }
        else {
            liz = this.LIZ;
        }
        return (int)(liz * this.getThumbScrollRange() + 0.5f);
    }
    
    private int getThumbScrollRange() {
        final Drawable ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            final Rect ljjiz = this.LJJIZ;
            ljiiiizz.getPadding(ljjiz);
            final Drawable lizlll = this.LIZLLL;
            Rect rect;
            if (lizlll != null) {
                rect = 04a.LIZ(lizlll);
            }
            else {
                rect = 04a.LIZ;
            }
            return this.LJJII - this.LJJIIJ - ljjiz.left - ljjiz.right - rect.left - rect.right;
        }
        return 0;
    }
    
    public void draw(final Canvas canvas) {
        final Rect ljjiz = this.LJJIZ;
        int ljjiijzljl = this.LJJIIJZLJL;
        final int ljjiiz = this.LJJIIZ;
        int ljjiizi = this.LJJIIZI;
        final int ljjij = this.LJJIJ;
        final int n = this.getThumbOffset() + ljjiijzljl;
        final Drawable lizlll = this.LIZLLL;
        Rect rect;
        if (lizlll != null) {
            rect = 04a.LIZ(lizlll);
        }
        else {
            rect = 04a.LIZ;
        }
        final Drawable ljiiiizz = this.LJIIIIZZ;
        int n2 = n;
        Label_0240: {
            if (ljiiiizz != null) {
                ljiiiizz.getPadding(ljjiz);
                final int n3 = n + ljjiz.left;
                while (true) {
                    int n4 = 0;
                    Label_0337: {
                        if (rect == null) {
                            n4 = ljjiiz;
                            break Label_0337;
                        }
                        int n5 = ljjiijzljl;
                        if (rect.left > ljjiz.left) {
                            n5 = ljjiijzljl + (rect.left - ljjiz.left);
                        }
                        int n6;
                        if (rect.top > ljjiz.top) {
                            n6 = rect.top - ljjiz.top + ljjiiz;
                        }
                        else {
                            n6 = ljjiiz;
                        }
                        int n7 = ljjiizi;
                        if (rect.right > ljjiz.right) {
                            n7 = ljjiizi - (rect.right - ljjiz.right);
                        }
                        n4 = n6;
                        ljjiizi = n7;
                        ljjiijzljl = n5;
                        if (rect.bottom <= ljjiz.bottom) {
                            break Label_0337;
                        }
                        final int n8 = ljjij - (rect.bottom - ljjiz.bottom);
                        ljjiijzljl = n5;
                        final int n9 = n8;
                        this.LJIIIIZZ.setBounds(ljjiijzljl, n6, n7, n9);
                        n2 = n3;
                        break Label_0240;
                    }
                    final int n9 = ljjij;
                    int n6 = n4;
                    int n7 = ljjiizi;
                    continue;
                }
            }
        }
        final Drawable lizlll2 = this.LIZLLL;
        if (lizlll2 != null) {
            lizlll2.getPadding(ljjiz);
            final int n10 = n2 - ljjiz.left;
            final int n11 = n2 + this.LJJIIJ + ljjiz.right;
            this.LIZLLL.setBounds(n10, ljjiiz, n11, ljjij);
            final Drawable background = this.getBackground();
            if (background != null) {
                08U.LIZ(background, n10, ljjiiz, n11, ljjij);
            }
        }
        super.draw(canvas);
    }
    
    public void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.setHotspot(n, n2);
        }
        final Drawable ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.setHotspot(n, n2);
        }
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable lizlll = this.LIZLLL;
        int n2;
        final int n = n2 = 0;
        if (lizlll != null) {
            n2 = n;
            if (lizlll.isStateful()) {
                n2 = ((false | lizlll.setState(drawableState)) ? 1 : 0);
            }
        }
        final Drawable ljiiiizz = this.LJIIIIZZ;
        int n3 = n2;
        if (ljiiiizz != null) {
            n3 = n2;
            if (ljiiiizz.isStateful()) {
                n3 = (n2 | (ljiiiizz.setState(drawableState) ? 1 : 0));
            }
        }
        if (n3 != 0) {
            this.invalidate();
        }
    }
    
    public int getCompoundPaddingLeft() {
        if (!04A.LIZ((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int n = super.getCompoundPaddingLeft() + this.LJJII;
        if (!TextUtils.isEmpty(this.getText())) {
            n += this.LJIILL;
        }
        return n;
    }
    
    public int getCompoundPaddingRight() {
        if (04A.LIZ((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int n = super.getCompoundPaddingRight() + this.LJJII;
        if (!TextUtils.isEmpty(this.getText())) {
            n += this.LJIILL;
        }
        return n;
    }
    
    public boolean getShowText() {
        return this.LJIJI;
    }
    
    public boolean getSplitTrack() {
        return this.LJIILLIIL;
    }
    
    public int getSwitchMinWidth() {
        return this.LJIILJJIL;
    }
    
    public int getSwitchPadding() {
        return this.LJIILL;
    }
    
    public CharSequence getTextOff() {
        return this.LJIJ;
    }
    
    public CharSequence getTextOn() {
        return this.LJIIZILJ;
    }
    
    public Drawable getThumbDrawable() {
        return this.LIZLLL;
    }
    
    public int getThumbTextPadding() {
        return this.LJIILIIL;
    }
    
    public ColorStateList getThumbTintList() {
        return this.LJ;
    }
    
    public PorterDuff$Mode getThumbTintMode() {
        return this.LJFF;
    }
    
    public Drawable getTrackDrawable() {
        return this.LJIIIIZZ;
    }
    
    public ColorStateList getTrackTintList() {
        return this.LJIIIZ;
    }
    
    public PorterDuff$Mode getTrackTintMode() {
        return this.LJIIJ;
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.jumpToCurrentState();
        }
        final Drawable ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.jumpToCurrentState();
        }
        final ObjectAnimator liziz = this.LIZIZ;
        if (liziz != null && liziz.isStarted()) {
            this.LIZIZ.end();
            this.LIZIZ = null;
        }
    }
    
    public int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, 040.LJJJ);
        }
        return onCreateDrawableState;
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Rect ljjiz = this.LJJIZ;
        final Drawable ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.getPadding(ljjiz);
        }
        else {
            ljjiz.setEmpty();
        }
        final int ljjiiz = this.LJJIIZ;
        final int ljjij = this.LJJIJ;
        final int top = ljjiz.top;
        final int bottom = ljjiz.bottom;
        final Drawable lizlll = this.LIZLLL;
        if (ljiiiizz != null) {
            if (this.LJIILLIIL && lizlll != null) {
                final Rect liz = 04a.LIZ(lizlll);
                lizlll.copyBounds(ljjiz);
                ljjiz.left += liz.left;
                ljjiz.right -= liz.right;
                final int save = canvas.save();
                canvas.clipRect(ljjiz, Region$Op.DIFFERENCE);
                ljiiiizz.draw(canvas);
                canvas.restoreToCount(save);
            }
            else {
                ljiiiizz.draw(canvas);
            }
        }
        final int save2 = canvas.save();
        if (lizlll != null) {
            lizlll.draw(canvas);
        }
        Layout layout;
        if (this.getTargetCheckedState()) {
            layout = this.LJJIJIL;
        }
        else {
            layout = this.LJJIJL;
        }
        if (layout != null) {
            final int[] drawableState = this.getDrawableState();
            final ColorStateList ljjijiijil = this.LJJIJIIJIL;
            if (ljjijiijil != null) {
                this.LJJIJIIJI.setColor(ljjijiijil.getColorForState(drawableState, 0));
            }
            this.LJJIJIIJI.drawableState = drawableState;
            int width;
            if (lizlll != null) {
                final Rect bounds = lizlll.getBounds();
                width = bounds.left + bounds.right;
            }
            else {
                width = this.getWidth();
            }
            canvas.translate((float)(width / 2 - layout.getWidth() / 2), (float)((ljjiiz + top + (ljjij - bottom)) / 2 - layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"android.widget.Switch");
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.Switch");
        CharSequence text;
        if (this.isChecked()) {
            text = this.LJIIZILJ;
        }
        else {
            text = this.LJIJ;
        }
        if (!TextUtils.isEmpty(text)) {
            final CharSequence text2 = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text2)) {
                accessibilityNodeInfo.setText(text);
                return;
            }
            final StringBuilder text3 = new StringBuilder();
            text3.append(text2);
            text3.append(' ');
            text3.append(text);
            accessibilityNodeInfo.setText((CharSequence)text3);
        }
    }
    
    public void onLayout(final boolean b, int ljjiiz, int max, int ljjiijzljl, int ljjij) {
        super.onLayout(b, ljjiiz, max, ljjiijzljl, ljjij);
        final Drawable lizlll = this.LIZLLL;
        max = 0;
        if (lizlll != null) {
            final Rect ljjiz = this.LJJIZ;
            final Drawable ljiiiizz = this.LJIIIIZZ;
            if (ljiiiizz != null) {
                ljiiiizz.getPadding(ljjiz);
            }
            else {
                ljjiz.setEmpty();
            }
            final Rect liz = 04a.LIZ(this.LIZLLL);
            ljjiiz = Math.max(0, liz.left - ljjiz.left);
            max = Math.max(0, liz.right - ljjiz.right);
        }
        else {
            ljjiiz = 0;
        }
        if (04A.LIZ((View)this)) {
            ljjiijzljl = this.getPaddingLeft() + ljjiiz;
            max = this.LJJII + ljjiijzljl - ljjiiz - max;
        }
        else {
            ljjij = this.getWidth() - this.getPaddingRight() - max;
            ljjiijzljl = ljjij - this.LJJII + ljjiiz + max;
            max = ljjij;
        }
        ljjiiz = (this.getGravity() & 0x70);
        Label_0154: {
            if (ljjiiz != 16) {
                if (ljjiiz == 80) {
                    ljjij = this.getHeight() - this.getPaddingBottom();
                    ljjiiz = ljjij - this.LJJIII;
                    break Label_0154;
                }
                ljjiiz = this.getPaddingTop();
                ljjij = this.LJJIII;
            }
            else {
                ljjiiz = (this.getPaddingTop() + this.getHeight() - this.getPaddingBottom()) / 2;
                ljjij = this.LJJIII;
                ljjiiz -= ljjij / 2;
            }
            ljjij += ljjiiz;
        }
        this.LJJIIJZLJL = ljjiijzljl;
        this.LJJIIZ = ljjiiz;
        this.LJJIJ = ljjij;
        this.LJJIIZI = max;
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.LJIJI) {
            if (this.LJJIJIL == null) {
                this.LJJIJIL = this.LIZ(this.LJIIZILJ);
            }
            if (this.LJJIJL == null) {
                this.LJJIJL = this.LIZ(this.LJIJ);
            }
        }
        final Rect ljjiz = this.LJJIZ;
        final Drawable lizlll = this.LIZLLL;
        final int n3 = 0;
        int n4;
        int intrinsicHeight;
        if (lizlll != null) {
            lizlll.getPadding(ljjiz);
            n4 = this.LIZLLL.getIntrinsicWidth() - ljjiz.left - ljjiz.right;
            intrinsicHeight = this.LIZLLL.getIntrinsicHeight();
        }
        else {
            n4 = 0;
            intrinsicHeight = 0;
        }
        int n5;
        if (this.LJIJI) {
            n5 = Math.max(this.LJJIJIL.getWidth(), this.LJJIJL.getWidth()) + this.LJIILIIL * 2;
        }
        else {
            n5 = 0;
        }
        this.LJJIIJ = Math.max(n5, n4);
        final Drawable ljiiiizz = this.LJIIIIZZ;
        int intrinsicHeight2;
        if (ljiiiizz != null) {
            ljiiiizz.getPadding(ljjiz);
            intrinsicHeight2 = this.LJIIIIZZ.getIntrinsicHeight();
        }
        else {
            ljjiz.setEmpty();
            intrinsicHeight2 = n3;
        }
        final int left = ljjiz.left;
        final int right = ljjiz.right;
        final Drawable lizlll2 = this.LIZLLL;
        int max = right;
        int max2 = left;
        if (lizlll2 != null) {
            final Rect liz = 04a.LIZ(lizlll2);
            max2 = Math.max(left, liz.left);
            max = Math.max(right, liz.right);
        }
        final int max3 = Math.max(this.LJIILJJIL, this.LJJIIJ * 2 + max2 + max);
        final int max4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.LJJII = max3;
        this.LJJIII = max4;
        super.onMeasure(n, n2);
        if (this.getMeasuredHeight() < max4) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), max4);
        }
    }
    
    public void onPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence;
        if (this.isChecked()) {
            charSequence = this.LJIIZILJ;
        }
        else {
            charSequence = this.LJIJ;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.LJJI.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            final float n = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
                else {
                    final int ljijj = this.LJIJJ;
                    if (ljijj == 0) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (ljijj != 1) {
                        if (ljijj != 2) {
                            return super.onTouchEvent(motionEvent);
                        }
                        final float x = motionEvent.getX();
                        final int thumbScrollRange = this.getThumbScrollRange();
                        final float n2 = x - this.LJIL;
                        float n3;
                        if (thumbScrollRange != 0) {
                            n3 = n2 / thumbScrollRange;
                        }
                        else if (n2 > 0.0f) {
                            n3 = 1.0f;
                        }
                        else {
                            n3 = -1.0f;
                        }
                        float n4 = n3;
                        if (04A.LIZ((View)this)) {
                            n4 = -n3;
                        }
                        final float liz = this.LIZ;
                        float thumbPosition = n4 + liz;
                        if (thumbPosition < 0.0f) {
                            thumbPosition = n;
                        }
                        else if (thumbPosition > 1.0f) {
                            thumbPosition = 1.0f;
                        }
                        if (thumbPosition != liz) {
                            this.LJIL = x;
                            this.setThumbPosition(thumbPosition);
                        }
                        return true;
                    }
                    else {
                        final float x2 = motionEvent.getX();
                        final float y = motionEvent.getY();
                        if (Math.abs(x2 - this.LJIL) > this.LJIJJLI || Math.abs(y - this.LJJ) > this.LJIJJLI) {
                            this.LJIJJ = 2;
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.LJIL = x2;
                            this.LJJ = y;
                            return true;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            if (this.LJIJJ == 2) {
                this.LJIJJ = 0;
                int n5;
                if (motionEvent.getAction() == 1 && this.isEnabled()) {
                    n5 = 1;
                }
                else {
                    n5 = 0;
                }
                final boolean checked = this.isChecked();
                boolean targetCheckedState;
                if (n5 != 0) {
                    this.LJJI.computeCurrentVelocity(1000);
                    final float xVelocity = this.LJJI.getXVelocity();
                    if (Math.abs(xVelocity) > this.LJJIFFI) {
                        targetCheckedState = (04A.LIZ((View)this) ? (xVelocity < 0.0f) : (xVelocity > 0.0f));
                    }
                    else {
                        targetCheckedState = this.getTargetCheckedState();
                    }
                }
                else {
                    targetCheckedState = checked;
                }
                if (targetCheckedState != checked) {
                    this.playSoundEffect(0);
                }
                this.setChecked(targetCheckedState);
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.LJIJJ = 0;
            this.LJJI.clear();
        }
        else {
            final float x3 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            if (this.isEnabled() && this.LIZLLL != null) {
                final int thumbOffset = this.getThumbOffset();
                this.LIZLLL.getPadding(this.LJJIZ);
                final int ljjiiz = this.LJJIIZ;
                final int ljijjli = this.LJIJJLI;
                final int n6 = this.LJJIIJZLJL + thumbOffset - ljijjli;
                final int ljjiij = this.LJJIIJ;
                final int left = this.LJJIZ.left;
                final int right = this.LJJIZ.right;
                final int ljijjli2 = this.LJIJJLI;
                final int ljjij = this.LJJIJ;
                if (x3 > n6 && x3 < ljjiij + n6 + left + right + ljijjli2 && y2 > ljjiiz - ljijjli && y2 < ljjij + ljijjli2) {
                    this.LJIJJ = 1;
                    this.LJIL = x3;
                    this.LJJ = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setChecked(final boolean checked) {
        super.setChecked(checked);
        final boolean checked2 = this.isChecked();
        final IBinder windowToken = this.getWindowToken();
        float thumbPosition = 1.0f;
        if (windowToken != null && ((View)this).isLaidOut()) {
            if (!checked2) {
                thumbPosition = 0.0f;
            }
            (this.LIZIZ = ObjectAnimator.ofFloat((Object)this, (Property)040.LIZJ, new float[] { thumbPosition })).setDuration(250L);
            this.LIZIZ.setAutoCancel(true);
            this.LIZIZ.start();
            return;
        }
        final ObjectAnimator liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.cancel();
        }
        if (!checked2) {
            thumbPosition = 0.0f;
        }
        this.setThumbPosition(thumbPosition);
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(08p.LIZ((TextView)this, actionMode$Callback));
    }
    
    public void setShowText(final boolean ljiji) {
        if (this.LJIJI != ljiji) {
            this.LJIJI = ljiji;
            this.requestLayout();
        }
    }
    
    public void setSplitTrack(final boolean ljiilliil) {
        this.LJIILLIIL = ljiilliil;
        this.invalidate();
    }
    
    public void setSwitchMinWidth(final int ljiiljjil) {
        this.LJIILJJIL = ljiiljjil;
        this.requestLayout();
    }
    
    public void setSwitchPadding(final int ljiill) {
        this.LJIILL = ljiill;
        this.requestLayout();
    }
    
    public void setSwitchTypeface(final Typeface typeface) {
        if ((this.LJJIJIIJI.getTypeface() != null && !this.LJJIJIIJI.getTypeface().equals((Object)typeface)) || (this.LJJIJIIJI.getTypeface() == null && typeface != null)) {
            this.LJJIJIIJI.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public void setTextOff(final CharSequence ljij) {
        this.LJIJ = ljij;
        this.requestLayout();
    }
    
    public void setTextOn(final CharSequence ljiizilj) {
        this.LJIIZILJ = ljiizilj;
        this.requestLayout();
    }
    
    public void setThumbDrawable(final Drawable lizlll) {
        final Drawable lizlll2 = this.LIZLLL;
        if (lizlll2 != null) {
            lizlll2.setCallback((Drawable$Callback)null);
        }
        if ((this.LIZLLL = lizlll) != null) {
            lizlll.setCallback((Drawable$Callback)this);
        }
        this.requestLayout();
    }
    
    public void setThumbPosition(final float liz) {
        this.LIZ = liz;
        this.invalidate();
    }
    
    public void setThumbResource(final int n) {
        this.setThumbDrawable(01s.LIZIZ(this.getContext(), n));
    }
    
    public void setThumbTextPadding(final int ljiiliil) {
        this.LJIILIIL = ljiiliil;
        this.requestLayout();
    }
    
    public void setThumbTintList(final ColorStateList lj) {
        this.LJ = lj;
        this.LJI = true;
        this.LIZIZ();
    }
    
    public void setThumbTintMode(final PorterDuff$Mode ljff) {
        this.LJFF = ljff;
        this.LJII = true;
        this.LIZIZ();
    }
    
    public void setTrackDrawable(final Drawable ljiiiizz) {
        final Drawable ljiiiizz2 = this.LJIIIIZZ;
        if (ljiiiizz2 != null) {
            ljiiiizz2.setCallback((Drawable$Callback)null);
        }
        if ((this.LJIIIIZZ = ljiiiizz) != null) {
            ljiiiizz.setCallback((Drawable$Callback)this);
        }
        this.requestLayout();
    }
    
    public void setTrackResource(final int n) {
        this.setTrackDrawable(01s.LIZIZ(this.getContext(), n));
    }
    
    public void setTrackTintList(final ColorStateList ljiiiz) {
        this.LJIIIZ = ljiiiz;
        this.LJIIJJI = true;
        this.LIZ();
    }
    
    public void setTrackTintMode(final PorterDuff$Mode ljiij) {
        this.LJIIJ = ljiij;
        this.LJIIL = true;
        this.LIZ();
    }
    
    public void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }
    
    public boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.LIZLLL || drawable == this.LJIIIIZZ;
    }
}
