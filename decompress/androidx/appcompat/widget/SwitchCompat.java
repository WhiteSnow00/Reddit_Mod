// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import a4.l0$b;
import android.view.accessibility.AccessibilityRecord;
import android.animation.Animator;
import android.graphics.Paint;
import android.text.InputFilter;
import android.os.IBinder;
import java.util.WeakHashMap;
import a4.l0$g;
import a4.j0;
import android.view.MotionEvent;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Region$Op;
import e4.j;
import android.view.ActionMode$Callback;
import android.text.TextUtils;
import androidx.emoji2.text.f$e;
import androidx.emoji2.text.f;
import android.graphics.Canvas;
import android.text.Layout$Alignment;
import android.text.Layout;
import android.text.method.TransformationMethod;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable$Callback;
import a4.l0;
import mg.d0;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.util.Property;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.animation.ObjectAnimator;
import j.a;
import android.text.StaticLayout;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.view.VelocityTracker;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton
{
    public static final SwitchCompat$a W;
    public static final int[] a0;
    public float A;
    public float B;
    public VelocityTracker C;
    public int D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final TextPaint N;
    public ColorStateList O;
    public StaticLayout P;
    public StaticLayout Q;
    public a R;
    public ObjectAnimator S;
    public l T;
    public SwitchCompat.SwitchCompat$c U;
    public final Rect V;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff$Mode h;
    public boolean i;
    public boolean j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff$Mode m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public CharSequence w;
    public boolean x;
    public int y;
    public int z;
    
    static {
        W = new Property<SwitchCompat, Float>() {
            public final Object get(final Object o) {
                return ((SwitchCompat)o).E;
            }
            
            public final void set(final Object o, final Object o2) {
                ((SwitchCompat)o).setThumbPosition((float)o2);
            }
        };
        a0 = new int[] { 16842912 };
    }
    
    public SwitchCompat(final Context context, final AttributeSet set) {
        super(context, set, 2130969863);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.C = VelocityTracker.obtain();
        boolean fakeBoldText = true;
        this.M = true;
        this.V = new Rect();
        t0.a(((View)this).getContext(), (View)this);
        final TextPaint n = new TextPaint(1);
        this.N = n;
        n.density = ((View)this).getResources().getDisplayMetrics().density;
        final int[] t = d0.T;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, t, 2130969863, 0);
        final y0 y0 = new y0(context, obtainStyledAttributes);
        l0.k((View)this, context, t, set, obtainStyledAttributes, 2130969863);
        final Drawable e = y0.e(2);
        this.f = e;
        if (e != null) {
            e.setCallback((Drawable$Callback)this);
        }
        final Drawable e2 = y0.e(11);
        if ((this.k = e2) != null) {
            e2.setCallback((Drawable$Callback)this);
        }
        this.setTextOnInternal(y0.k(0));
        this.setTextOffInternal(y0.k(1));
        this.x = y0.a(3, true);
        this.p = y0.d(8, 0);
        this.q = y0.d(5, 0);
        this.r = y0.d(6, 0);
        this.s = y0.a(4, false);
        final ColorStateList b = y0.b(9);
        if (b != null) {
            this.g = b;
            this.i = true;
        }
        final PorterDuff$Mode c = androidx.appcompat.widget.d0.c(y0.h(10, -1), null);
        if (this.h != c) {
            this.h = c;
            this.j = true;
        }
        if (this.i || this.j) {
            this.a();
        }
        final ColorStateList b2 = y0.b(12);
        if (b2 != null) {
            this.l = b2;
            this.n = true;
        }
        final PorterDuff$Mode c2 = androidx.appcompat.widget.d0.c(y0.h(13, -1), null);
        if (this.m != c2) {
            this.m = c2;
            this.o = true;
        }
        if (this.n || this.o) {
            this.b();
        }
        final int i = y0.i(7, 0);
        if (i != 0) {
            final y0 y2 = new y0(context, context.obtainStyledAttributes(i, d0.U));
            final ColorStateList b3 = y2.b(3);
            if (b3 != null) {
                this.O = b3;
            }
            else {
                this.O = ((TextView)this).getTextColors();
            }
            final int d = y2.d(0, 0);
            if (d != 0) {
                final float textSize = (float)d;
                if (textSize != ((Paint)n).getTextSize()) {
                    ((Paint)n).setTextSize(textSize);
                    ((View)this).requestLayout();
                }
            }
            final int h = y2.h(1, -1);
            final int h2 = y2.h(2, -1);
            Typeface switchTypeface;
            if (h != 1) {
                if (h != 2) {
                    if (h != 3) {
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
            if (h2 > 0) {
                Typeface switchTypeface2;
                if (switchTypeface == null) {
                    switchTypeface2 = Typeface.defaultFromStyle(h2);
                }
                else {
                    switchTypeface2 = Typeface.create(switchTypeface, h2);
                }
                this.setSwitchTypeface(switchTypeface2);
                int style;
                if (switchTypeface2 != null) {
                    style = switchTypeface2.getStyle();
                }
                else {
                    style = 0;
                }
                final int n2 = ~style & h2;
                if ((n2 & 0x1) == 0x0) {
                    fakeBoldText = false;
                }
                ((Paint)n).setFakeBoldText(fakeBoldText);
                if ((n2 & 0x2) != 0x0) {
                    textSkewX = -0.25f;
                }
                ((Paint)n).setTextSkewX(textSkewX);
            }
            else {
                ((Paint)n).setFakeBoldText(false);
                ((Paint)n).setTextSkewX(0.0f);
                this.setSwitchTypeface(switchTypeface);
            }
            if (y2.a(14, false)) {
                this.R = new a(((View)this).getContext());
            }
            else {
                this.R = null;
            }
            this.setTextOnInternal(this.t);
            this.setTextOffInternal(this.v);
            y2.n();
        }
        new w((TextView)this).f(set, 2130969863);
        y0.n();
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.z = value.getScaledTouchSlop();
        this.D = value.getScaledMinimumFlingVelocity();
        this.getEmojiTextViewHelper().b(set, 2130969863);
        ((View)this).refreshDrawableState();
        this.setChecked(this.isChecked());
    }
    
    private l getEmojiTextViewHelper() {
        if (this.T == null) {
            this.T = new l((TextView)this);
        }
        return this.T;
    }
    
    private boolean getTargetCheckedState() {
        return this.E > 0.5f;
    }
    
    private int getThumbOffset() {
        float e;
        if (g1.a((View)this)) {
            e = 1.0f - this.E;
        }
        else {
            e = this.E;
        }
        return (int)(e * this.getThumbScrollRange() + 0.5f);
    }
    
    private int getThumbScrollRange() {
        final Drawable k = this.k;
        if (k != null) {
            final Rect v = this.V;
            k.getPadding(v);
            final Drawable f = this.f;
            Rect rect;
            if (f != null) {
                rect = androidx.appcompat.widget.d0.b(f);
            }
            else {
                rect = androidx.appcompat.widget.d0.c;
            }
            return this.F - this.H - v.left - v.right - rect.left - rect.right;
        }
        return 0;
    }
    
    private void setTextOffInternal(final CharSequence v) {
        this.v = v;
        final TransformationMethod e = this.getEmojiTextViewHelper().b.a.e((TransformationMethod)this.R);
        CharSequence transformation = v;
        if (e != null) {
            transformation = e.getTransformation(v, (View)this);
        }
        this.w = transformation;
        this.Q = null;
        if (this.x) {
            this.e();
        }
    }
    
    private void setTextOnInternal(final CharSequence t) {
        this.t = t;
        final TransformationMethod e = this.getEmojiTextViewHelper().b.a.e((TransformationMethod)this.R);
        CharSequence transformation = t;
        if (e != null) {
            transformation = e.getTransformation(t, (View)this);
        }
        this.u = transformation;
        this.P = null;
        if (this.x) {
            this.e();
        }
    }
    
    public final void a() {
        final Drawable f = this.f;
        if (f != null && (this.i || this.j)) {
            final Drawable mutate = f.mutate();
            this.f = mutate;
            if (this.i) {
                r3.a.b.h(mutate, this.g);
            }
            if (this.j) {
                r3.a.b.i(this.f, this.h);
            }
            if (this.f.isStateful()) {
                this.f.setState(((View)this).getDrawableState());
            }
        }
    }
    
    public final void b() {
        final Drawable k = this.k;
        if (k != null && (this.n || this.o)) {
            final Drawable mutate = k.mutate();
            this.k = mutate;
            if (this.n) {
                r3.a.b.h(mutate, this.l);
            }
            if (this.o) {
                r3.a.b.i(this.k, this.m);
            }
            if (this.k.isStateful()) {
                this.k.setState(((View)this).getDrawableState());
            }
        }
    }
    
    public final StaticLayout c(final CharSequence charSequence) {
        final TextPaint n = this.N;
        int n2;
        if (charSequence != null) {
            n2 = (int)Math.ceil(Layout.getDesiredWidth(charSequence, n));
        }
        else {
            n2 = 0;
        }
        return new StaticLayout(charSequence, n, n2, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }
    
    public final void d() {
        this.setTextOnInternal(this.t);
        this.setTextOffInternal(this.v);
        ((View)this).requestLayout();
    }
    
    public final void draw(final Canvas canvas) {
        final Rect v = this.V;
        int i = this.I;
        final int j = this.J;
        int k = this.K;
        final int l = this.L;
        final int n = this.getThumbOffset() + i;
        final Drawable f = this.f;
        Rect rect;
        if (f != null) {
            rect = androidx.appcompat.widget.d0.b(f);
        }
        else {
            rect = androidx.appcompat.widget.d0.c;
        }
        final Drawable m = this.k;
        int n2 = n;
        if (m != null) {
            m.getPadding(v);
            final int left = v.left;
            final int n3 = n + left;
            int n5 = 0;
            int n6 = 0;
            int n9 = 0;
            Label_0258: {
                int n7;
                if (rect != null) {
                    final int left2 = rect.left;
                    int n4 = i;
                    if (left2 > left) {
                        n4 = i + (left2 - left);
                    }
                    final int top = rect.top;
                    final int top2 = v.top;
                    if (top > top2) {
                        n5 = top - top2 + j;
                    }
                    else {
                        n5 = j;
                    }
                    final int right = rect.right;
                    final int right2 = v.right;
                    n6 = k;
                    if (right > right2) {
                        n6 = k - (right - right2);
                    }
                    final int bottom = rect.bottom;
                    final int bottom2 = v.bottom;
                    i = n4;
                    k = n6;
                    n7 = n5;
                    if (bottom > bottom2) {
                        final int n8 = l - (bottom - bottom2);
                        i = n4;
                        n9 = n8;
                        break Label_0258;
                    }
                }
                else {
                    n7 = j;
                }
                n9 = l;
                n5 = n7;
                n6 = k;
            }
            this.k.setBounds(i, n5, n6, n9);
            n2 = n3;
        }
        final Drawable f2 = this.f;
        if (f2 != null) {
            f2.getPadding(v);
            final int n10 = n2 - v.left;
            final int n11 = n2 + this.H + v.right;
            this.f.setBounds(n10, j, n11, l);
            final Drawable background = ((View)this).getBackground();
            if (background != null) {
                r3.a.b.f(background, n10, j, n11, l);
            }
        }
        super.draw(canvas);
    }
    
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable f = this.f;
        if (f != null) {
            r3.a.b.e(f, n, n2);
        }
        final Drawable k = this.k;
        if (k != null) {
            r3.a.b.e(k, n, n2);
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = ((View)this).getDrawableState();
        final Drawable f = this.f;
        int n2;
        final int n = n2 = 0;
        if (f != null) {
            n2 = n;
            if (f.isStateful()) {
                n2 = ((false | f.setState(drawableState)) ? 1 : 0);
            }
        }
        final Drawable k = this.k;
        int n3 = n2;
        if (k != null) {
            n3 = n2;
            if (k.isStateful()) {
                n3 = (n2 | (k.setState(drawableState) ? 1 : 0));
            }
        }
        if (n3 != 0) {
            ((View)this).invalidate();
        }
    }
    
    public final void e() {
        if (this.U == null) {
            if (this.T.b.a.b()) {
                if (androidx.emoji2.text.f.j != null) {
                    final f a = androidx.emoji2.text.f.a();
                    final int b = a.b();
                    if (b == 3 || b == 0) {
                        a.g((f$e)(this.U = new SwitchCompat.SwitchCompat$c(this)));
                    }
                }
            }
        }
    }
    
    public int getCompoundPaddingLeft() {
        if (!g1.a((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int n = super.getCompoundPaddingLeft() + this.F;
        if (!TextUtils.isEmpty(((TextView)this).getText())) {
            n += this.r;
        }
        return n;
    }
    
    public int getCompoundPaddingRight() {
        if (g1.a((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int n = super.getCompoundPaddingRight() + this.F;
        if (!TextUtils.isEmpty(((TextView)this).getText())) {
            n += this.r;
        }
        return n;
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return e4.j.e(super.getCustomSelectionActionModeCallback());
    }
    
    public boolean getShowText() {
        return this.x;
    }
    
    public boolean getSplitTrack() {
        return this.s;
    }
    
    public int getSwitchMinWidth() {
        return this.q;
    }
    
    public int getSwitchPadding() {
        return this.r;
    }
    
    public CharSequence getTextOff() {
        return this.v;
    }
    
    public CharSequence getTextOn() {
        return this.t;
    }
    
    public Drawable getThumbDrawable() {
        return this.f;
    }
    
    public final float getThumbPosition() {
        return this.E;
    }
    
    public int getThumbTextPadding() {
        return this.p;
    }
    
    public ColorStateList getThumbTintList() {
        return this.g;
    }
    
    public PorterDuff$Mode getThumbTintMode() {
        return this.h;
    }
    
    public Drawable getTrackDrawable() {
        return this.k;
    }
    
    public ColorStateList getTrackTintList() {
        return this.l;
    }
    
    public PorterDuff$Mode getTrackTintMode() {
        return this.m;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable f = this.f;
        if (f != null) {
            f.jumpToCurrentState();
        }
        final Drawable k = this.k;
        if (k != null) {
            k.jumpToCurrentState();
        }
        final ObjectAnimator s = this.S;
        if (s != null && ((Animator)s).isStarted()) {
            ((Animator)this.S).end();
            this.S = null;
        }
    }
    
    public final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, SwitchCompat.a0);
        }
        return onCreateDrawableState;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Rect v = this.V;
        final Drawable k = this.k;
        if (k != null) {
            k.getPadding(v);
        }
        else {
            v.setEmpty();
        }
        final int j = this.J;
        final int l = this.L;
        final int top = v.top;
        final int bottom = v.bottom;
        final Drawable f = this.f;
        if (k != null) {
            if (this.s && f != null) {
                final Rect b = androidx.appcompat.widget.d0.b(f);
                f.copyBounds(v);
                v.left += b.left;
                v.right -= b.right;
                final int save = canvas.save();
                canvas.clipRect(v, Region$Op.DIFFERENCE);
                k.draw(canvas);
                canvas.restoreToCount(save);
            }
            else {
                k.draw(canvas);
            }
        }
        final int save2 = canvas.save();
        if (f != null) {
            f.draw(canvas);
        }
        StaticLayout staticLayout;
        if (this.getTargetCheckedState()) {
            staticLayout = this.P;
        }
        else {
            staticLayout = this.Q;
        }
        if (staticLayout != null) {
            final int[] drawableState = ((View)this).getDrawableState();
            final ColorStateList o = this.O;
            if (o != null) {
                ((Paint)this.N).setColor(o.getColorForState(drawableState, 0));
            }
            this.N.drawableState = drawableState;
            int width;
            if (f != null) {
                final Rect bounds = f.getBounds();
                width = bounds.left + bounds.right;
            }
            else {
                width = ((View)this).getWidth();
            }
            canvas.translate((float)(width / 2 - ((Layout)staticLayout).getWidth() / 2), (float)((j + top + (l - bottom)) / 2 - ((Layout)staticLayout).getHeight() / 2));
            ((Layout)staticLayout).draw(canvas);
        }
        canvas.restoreToCount(save2);
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"android.widget.Switch");
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.Switch");
        if (Build$VERSION.SDK_INT < 30) {
            CharSequence text;
            if (this.isChecked()) {
                text = this.t;
            }
            else {
                text = this.v;
            }
            if (!TextUtils.isEmpty(text)) {
                final CharSequence text2 = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text2)) {
                    accessibilityNodeInfo.setText(text);
                }
                else {
                    final StringBuilder text3 = new StringBuilder();
                    text3.append(text2);
                    text3.append(' ');
                    text3.append(text);
                    accessibilityNodeInfo.setText((CharSequence)text3);
                }
            }
        }
    }
    
    public final void onLayout(final boolean b, int j, int l, int i, int k) {
        super.onLayout(b, j, l, i, k);
        final Drawable f = this.f;
        j = 0;
        if (f != null) {
            final Rect v = this.V;
            final Drawable m = this.k;
            if (m != null) {
                m.getPadding(v);
            }
            else {
                v.setEmpty();
            }
            final Rect b2 = androidx.appcompat.widget.d0.b(this.f);
            l = Math.max(0, b2.left - v.left);
            j = Math.max(0, b2.right - v.right);
        }
        else {
            l = 0;
        }
        if (g1.a((View)this)) {
            i = ((View)this).getPaddingLeft() + l;
            k = this.F + i - l - j;
        }
        else {
            k = ((View)this).getWidth() - ((View)this).getPaddingRight() - j;
            i = k - this.F + l + j;
        }
        j = (((TextView)this).getGravity() & 0x70);
        if (j != 16) {
            if (j != 80) {
                j = ((View)this).getPaddingTop();
                l = this.G + j;
            }
            else {
                l = ((View)this).getHeight() - ((View)this).getPaddingBottom();
                j = l - this.G;
            }
        }
        else {
            j = ((View)this).getPaddingTop();
            j = (((View)this).getHeight() + j - ((View)this).getPaddingBottom()) / 2;
            l = this.G;
            j -= l / 2;
            l += j;
        }
        this.I = i;
        this.J = j;
        this.L = l;
        this.K = k;
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.x) {
            if (this.P == null) {
                this.P = this.c(this.u);
            }
            if (this.Q == null) {
                this.Q = this.c(this.w);
            }
        }
        final Rect v = this.V;
        final Drawable f = this.f;
        final int n3 = 0;
        int n4;
        int intrinsicHeight;
        if (f != null) {
            f.getPadding(v);
            n4 = this.f.getIntrinsicWidth() - v.left - v.right;
            intrinsicHeight = this.f.getIntrinsicHeight();
        }
        else {
            n4 = 0;
            intrinsicHeight = 0;
        }
        int n5;
        if (this.x) {
            n5 = this.p * 2 + Math.max(((Layout)this.P).getWidth(), ((Layout)this.Q).getWidth());
        }
        else {
            n5 = 0;
        }
        this.H = Math.max(n5, n4);
        final Drawable k = this.k;
        int intrinsicHeight2;
        if (k != null) {
            k.getPadding(v);
            intrinsicHeight2 = this.k.getIntrinsicHeight();
        }
        else {
            v.setEmpty();
            intrinsicHeight2 = n3;
        }
        final int left = v.left;
        final int right = v.right;
        final Drawable f2 = this.f;
        int max = right;
        int max2 = left;
        if (f2 != null) {
            final Rect b = androidx.appcompat.widget.d0.b(f2);
            max2 = Math.max(left, b.left);
            max = Math.max(right, b.right);
        }
        int f3;
        if (this.M) {
            f3 = Math.max(this.q, this.H * 2 + max2 + max);
        }
        else {
            f3 = this.q;
        }
        final int max3 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.F = f3;
        this.G = max3;
        super.onMeasure(n, n2);
        if (((View)this).getMeasuredHeight() < max3) {
            ((View)this).setMeasuredDimension(((View)this).getMeasuredWidthAndState(), max3);
        }
    }
    
    public final void onPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence;
        if (this.isChecked()) {
            charSequence = this.t;
        }
        else {
            charSequence = this.v;
        }
        if (charSequence != null) {
            ((AccessibilityRecord)accessibilityEvent).getText().add(charSequence);
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.C.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final boolean b = false;
        if (actionMasked != 0) {
            final float n = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
                else {
                    final int y = this.y;
                    if (y != 1) {
                        if (y != 2) {
                            return super.onTouchEvent(motionEvent);
                        }
                        final float x = motionEvent.getX();
                        final int thumbScrollRange = this.getThumbScrollRange();
                        final float n2 = x - this.A;
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
                        if (g1.a((View)this)) {
                            n4 = -n3;
                        }
                        final float e = this.E;
                        float thumbPosition = n4 + e;
                        if (thumbPosition < 0.0f) {
                            thumbPosition = n;
                        }
                        else if (thumbPosition > 1.0f) {
                            thumbPosition = 1.0f;
                        }
                        if (thumbPosition != e) {
                            this.A = x;
                            this.setThumbPosition(thumbPosition);
                        }
                        return true;
                    }
                    else {
                        final float x2 = motionEvent.getX();
                        final float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.A) > this.z || Math.abs(y2 - this.B) > this.z) {
                            this.y = 2;
                            ((View)this).getParent().requestDisallowInterceptTouchEvent(true);
                            this.A = x2;
                            this.B = y2;
                            return true;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            if (this.y == 2) {
                this.y = 0;
                final boolean b2 = motionEvent.getAction() == 1 && ((View)this).isEnabled();
                final boolean checked = this.isChecked();
                boolean targetCheckedState;
                if (b2) {
                    this.C.computeCurrentVelocity(1000);
                    final float xVelocity = this.C.getXVelocity();
                    if (Math.abs(xVelocity) > this.D) {
                        targetCheckedState = (g1.a((View)this) ? (xVelocity < 0.0f) : (xVelocity > 0.0f));
                    }
                    else {
                        targetCheckedState = this.getTargetCheckedState();
                    }
                }
                else {
                    targetCheckedState = checked;
                }
                if (targetCheckedState != checked) {
                    ((View)this).playSoundEffect(0);
                }
                this.setChecked(targetCheckedState);
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.y = 0;
            this.C.clear();
        }
        else {
            final float x3 = motionEvent.getX();
            final float y3 = motionEvent.getY();
            if (((View)this).isEnabled()) {
                int n5;
                if (this.f == null) {
                    n5 = (b ? 1 : 0);
                }
                else {
                    final int thumbOffset = this.getThumbOffset();
                    this.f.getPadding(this.V);
                    final int j = this.J;
                    final int z = this.z;
                    final int n6 = this.I + thumbOffset - z;
                    final int h = this.H;
                    final Rect v = this.V;
                    final int left = v.left;
                    final int right = v.right;
                    final int l = this.L;
                    n5 = (b ? 1 : 0);
                    if (x3 > n6) {
                        n5 = (b ? 1 : 0);
                        if (x3 < h + n6 + left + right + z) {
                            n5 = (b ? 1 : 0);
                            if (y3 > j - z) {
                                n5 = (b ? 1 : 0);
                                if (y3 < l + z) {
                                    n5 = 1;
                                }
                            }
                        }
                    }
                }
                if (n5 != 0) {
                    this.y = 1;
                    this.A = x3;
                    this.B = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public void setChecked(final boolean checked) {
        super.setChecked(checked);
        final boolean checked2 = this.isChecked();
        if (checked2) {
            if (Build$VERSION.SDK_INT >= 30) {
                CharSequence charSequence;
                if ((charSequence = this.t) == null) {
                    charSequence = ((View)this).getResources().getString(2131951636);
                }
                final WeakHashMap a = l0.a;
                ((l0$b)new j0((Class)CharSequence.class)).e((View)this, (Object)charSequence);
            }
        }
        else if (Build$VERSION.SDK_INT >= 30) {
            CharSequence charSequence2;
            if ((charSequence2 = this.v) == null) {
                charSequence2 = ((View)this).getResources().getString(2131951635);
            }
            final WeakHashMap a2 = l0.a;
            ((l0$b)new j0((Class)CharSequence.class)).e((View)this, (Object)charSequence2);
        }
        final IBinder windowToken = ((View)this).getWindowToken();
        float thumbPosition = 1.0f;
        if (windowToken != null) {
            final WeakHashMap a3 = l0.a;
            if (l0$g.c((View)this)) {
                if (!checked2) {
                    thumbPosition = 0.0f;
                }
                (this.S = ObjectAnimator.ofFloat((Object)this, (Property)SwitchCompat.W, new float[] { thumbPosition })).setDuration(250L);
                b.a(this.S, true);
                this.S.start();
                return;
            }
        }
        final ObjectAnimator s = this.S;
        if (s != null) {
            ((Animator)s).cancel();
        }
        if (!checked2) {
            thumbPosition = 0.0f;
        }
        this.setThumbPosition(thumbPosition);
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(e4.j.f(actionMode$Callback, (TextView)this));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
        this.setTextOnInternal(this.t);
        this.setTextOffInternal(this.v);
        ((View)this).requestLayout();
    }
    
    public final void setEnforceSwitchWidth(final boolean m) {
        this.M = m;
        ((View)this).invalidate();
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setShowText(final boolean x) {
        if (this.x != x) {
            this.x = x;
            ((View)this).requestLayout();
            if (x) {
                this.e();
            }
        }
    }
    
    public void setSplitTrack(final boolean s) {
        this.s = s;
        ((View)this).invalidate();
    }
    
    public void setSwitchMinWidth(final int q) {
        this.q = q;
        ((View)this).requestLayout();
    }
    
    public void setSwitchPadding(final int r) {
        this.r = r;
        ((View)this).requestLayout();
    }
    
    public void setSwitchTypeface(final Typeface typeface) {
        if ((((Paint)this.N).getTypeface() != null && !((Paint)this.N).getTypeface().equals((Object)typeface)) || (((Paint)this.N).getTypeface() == null && typeface != null)) {
            ((Paint)this.N).setTypeface(typeface);
            ((View)this).requestLayout();
            ((View)this).invalidate();
        }
    }
    
    public void setTextOff(CharSequence textOffInternal) {
        this.setTextOffInternal(textOffInternal);
        ((View)this).requestLayout();
        if (!this.isChecked() && Build$VERSION.SDK_INT >= 30) {
            if ((textOffInternal = this.v) == null) {
                textOffInternal = ((View)this).getResources().getString(2131951635);
            }
            final WeakHashMap a = l0.a;
            ((l0$b)new j0((Class)CharSequence.class)).e((View)this, (Object)textOffInternal);
        }
    }
    
    public void setTextOn(CharSequence textOnInternal) {
        this.setTextOnInternal(textOnInternal);
        ((View)this).requestLayout();
        if (this.isChecked() && Build$VERSION.SDK_INT >= 30) {
            if ((textOnInternal = this.t) == null) {
                textOnInternal = ((View)this).getResources().getString(2131951636);
            }
            final WeakHashMap a = l0.a;
            ((l0$b)new j0((Class)CharSequence.class)).e((View)this, (Object)textOnInternal);
        }
    }
    
    public void setThumbDrawable(final Drawable f) {
        final Drawable f2 = this.f;
        if (f2 != null) {
            f2.setCallback((Drawable$Callback)null);
        }
        if ((this.f = f) != null) {
            f.setCallback((Drawable$Callback)this);
        }
        ((View)this).requestLayout();
    }
    
    public void setThumbPosition(final float e) {
        this.E = e;
        ((View)this).invalidate();
    }
    
    public void setThumbResource(final int n) {
        this.setThumbDrawable(vl.a.U1(((View)this).getContext(), n));
    }
    
    public void setThumbTextPadding(final int p) {
        this.p = p;
        ((View)this).requestLayout();
    }
    
    public void setThumbTintList(final ColorStateList g) {
        this.g = g;
        this.i = true;
        this.a();
    }
    
    public void setThumbTintMode(final PorterDuff$Mode h) {
        this.h = h;
        this.j = true;
        this.a();
    }
    
    public void setTrackDrawable(final Drawable k) {
        final Drawable i = this.k;
        if (i != null) {
            i.setCallback((Drawable$Callback)null);
        }
        if ((this.k = k) != null) {
            k.setCallback((Drawable$Callback)this);
        }
        ((View)this).requestLayout();
    }
    
    public void setTrackResource(final int n) {
        this.setTrackDrawable(vl.a.U1(((View)this).getContext(), n));
    }
    
    public void setTrackTintList(final ColorStateList l) {
        this.l = l;
        this.n = true;
        this.b();
    }
    
    public void setTrackTintMode(final PorterDuff$Mode m) {
        this.m = m;
        this.o = true;
        this.b();
    }
    
    public final void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f || drawable == this.k;
    }
    
    public static final class b
    {
        public static void a(final ObjectAnimator objectAnimator, final boolean autoCancel) {
            objectAnimator.setAutoCancel(autoCancel);
        }
    }
}
