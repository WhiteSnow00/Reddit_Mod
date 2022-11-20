// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.Paint;
import q3.p;
import q3.i;
import android.graphics.Typeface;
import android.text.TextDirectionHeuristic;
import e4.j$c;
import e4.j$b;
import android.text.TextDirectionHeuristics;
import android.graphics.Paint$FontMetricsInt;
import dg.l0;
import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import d4.a;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ActionMode$Callback;
import java.util.concurrent.ExecutionException;
import y3.d$a;
import e4.j;
import android.os.Build$VERSION;
import android.view.textclassifier.TextClassifier;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import y3.d;
import java.util.concurrent.Future;
import android.widget.TextView;

public class AppCompatTextView extends TextView
{
    private final e mBackgroundTintHelper;
    private l mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<d> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final v mTextClassifierHelper;
    private final w mTextHelper;
    
    public AppCompatTextView(final Context context) {
        this(context, null);
    }
    
    public AppCompatTextView(final Context context, final AttributeSet set) {
        this(context, set, 16842884);
    }
    
    public AppCompatTextView(final Context context, final AttributeSet set, final int n) {
        v0.a(context);
        super(context, set, n);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        t0.a(((View)this).getContext(), (View)this);
        (this.mBackgroundTintHelper = new e((View)this)).d(set, n);
        final w mTextHelper = new w((TextView)this);
        (this.mTextHelper = mTextHelper).f(set, n);
        mTextHelper.b();
        this.mTextClassifierHelper = new v((TextView)this);
        this.getEmojiTextViewHelper().b(set, n);
    }
    
    public static int access$001(final AppCompatTextView appCompatTextView) {
        return appCompatTextView.getAutoSizeMaxTextSize();
    }
    
    public static void access$1001(final AppCompatTextView appCompatTextView, final int firstBaselineToTopHeight) {
        appCompatTextView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
    }
    
    public static int access$101(final AppCompatTextView appCompatTextView) {
        return appCompatTextView.getAutoSizeMinTextSize();
    }
    
    public static void access$1101(final AppCompatTextView appCompatTextView, final int lastBaselineToBottomHeight) {
        appCompatTextView.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
    }
    
    public static int access$201(final AppCompatTextView appCompatTextView) {
        return appCompatTextView.getAutoSizeStepGranularity();
    }
    
    public static int[] access$301(final AppCompatTextView appCompatTextView) {
        return appCompatTextView.getAutoSizeTextAvailableSizes();
    }
    
    public static int access$401(final AppCompatTextView appCompatTextView) {
        return appCompatTextView.getAutoSizeTextType();
    }
    
    public static TextClassifier access$501(final AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextClassifier();
    }
    
    public static void access$601(final AppCompatTextView appCompatTextView, final int n, final int n2, final int n3, final int n4) {
        appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
    }
    
    public static void access$701(final AppCompatTextView appCompatTextView, final int[] array, final int n) {
        appCompatTextView.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
    }
    
    public static void access$801(final AppCompatTextView appCompatTextView, final int autoSizeTextTypeWithDefaults) {
        appCompatTextView.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
    }
    
    public static void access$901(final AppCompatTextView appCompatTextView, final TextClassifier textClassifier) {
        appCompatTextView.setTextClassifier(textClassifier);
    }
    
    private void consumeTextFutureAndSetBlocking() {
        final Future<d> mPrecomputedTextFuture = this.mPrecomputedTextFuture;
        if (mPrecomputedTextFuture == null) {
            return;
        }
        try {
            this.mPrecomputedTextFuture = null;
            final d d = mPrecomputedTextFuture.get();
            if (Build$VERSION.SDK_INT >= 29) {
                d.getClass();
                this.setText((CharSequence)null);
                return;
            }
            final d$a a = j.a((TextView)this);
            d.getClass();
            a.a((d$a)null);
            throw null;
        }
        catch (final InterruptedException | ExecutionException ex) {}
    }
    
    private l getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new l((TextView)this);
        }
        return this.mEmojiTextViewHelper;
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.a();
        }
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public int getAutoSizeMaxTextSize() {
        if (g1.b) {
            return access$001(((AppCompatTextView$b)this.getSuperCaller()).a);
        }
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return Math.round(mTextHelper.i.e);
        }
        return -1;
    }
    
    public int getAutoSizeMinTextSize() {
        if (g1.b) {
            return access$101(((AppCompatTextView$b)this.getSuperCaller()).a);
        }
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return Math.round(mTextHelper.i.d);
        }
        return -1;
    }
    
    public int getAutoSizeStepGranularity() {
        if (g1.b) {
            return access$201(((AppCompatTextView$b)this.getSuperCaller()).a);
        }
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return Math.round(mTextHelper.i.c);
        }
        return -1;
    }
    
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.b) {
            return access$301(((AppCompatTextView$b)this.getSuperCaller()).a);
        }
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return mTextHelper.i.f;
        }
        return new int[0];
    }
    
    public int getAutoSizeTextType() {
        final boolean b = g1.b;
        int n = 0;
        if (b) {
            if (access$401(((AppCompatTextView$b)this.getSuperCaller()).a) == 1) {
                n = 1;
            }
            return n;
        }
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return mTextHelper.i.a;
        }
        return 0;
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return j.e(super.getCustomSelectionActionModeCallback());
    }
    
    public int getFirstBaselineToTopHeight() {
        return ((View)this).getPaddingTop() - ((Paint)this.getPaint()).getFontMetricsInt().top;
    }
    
    public int getLastBaselineToBottomHeight() {
        return ((View)this).getPaddingBottom() + ((Paint)this.getPaint()).getFontMetricsInt().bottom;
    }
    
    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 28) {
                this.mSuperCaller = (a)new c();
            }
            else if (sdk_INT >= 26) {
                this.mSuperCaller = (a)new AppCompatTextView$b(this);
            }
        }
        return this.mSuperCaller;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        ColorStateList b;
        if (mBackgroundTintHelper != null) {
            b = mBackgroundTintHelper.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        PorterDuff$Mode c;
        if (mBackgroundTintHelper != null) {
            c = mBackgroundTintHelper.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }
    
    public CharSequence getText() {
        this.consumeTextFutureAndSetBlocking();
        return super.getText();
    }
    
    public TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final v mTextClassifierHelper = this.mTextClassifierHelper;
            if (mTextClassifierHelper != null) {
                TextClassifier textClassifier;
                if ((textClassifier = mTextClassifierHelper.b) == null) {
                    textClassifier = v$a.a(mTextClassifierHelper.a);
                }
                return textClassifier;
            }
        }
        return access$501(((AppCompatTextView$b)this.getSuperCaller()).a);
    }
    
    public d$a getTextMetricsParamsCompat() {
        return j.a((TextView)this);
    }
    
    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().b.a.b();
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build$VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            d4.a.c(editorInfo, this.getText());
        }
        cg.d.w3((View)this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null && !g1.b) {
            mTextHelper.i.a();
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        this.consumeTextFutureAndSetBlocking();
        super.onMeasure(n, n2);
    }
    
    public void onTextChanged(final CharSequence charSequence, int n, int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        final w mTextHelper = this.mTextHelper;
        n2 = 1;
        Label_0063: {
            if (mTextHelper != null && !g1.b) {
                final y i = mTextHelper.i;
                if (i.i() && i.a != 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    n = n2;
                    break Label_0063;
                }
            }
            n = 0;
        }
        if (n != 0) {
            this.mTextHelper.i.a();
        }
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        if (g1.b) {
            access$601(((AppCompatTextView$b)this.getSuperCaller()).a, n, n2, n3, n4);
        }
        else {
            final w mTextHelper = this.mTextHelper;
            if (mTextHelper != null) {
                mTextHelper.h(n, n2, n3, n4);
            }
        }
    }
    
    public void setAutoSizeTextTypeUniformWithPresetSizes(final int[] array, final int n) throws IllegalArgumentException {
        if (g1.b) {
            access$701(((AppCompatTextView$b)this.getSuperCaller()).a, array, n);
        }
        else {
            final w mTextHelper = this.mTextHelper;
            if (mTextHelper != null) {
                mTextHelper.i(array, n);
            }
        }
    }
    
    public void setAutoSizeTextTypeWithDefaults(final int n) {
        if (g1.b) {
            access$801(((AppCompatTextView$b)this.getSuperCaller()).a, n);
        }
        else {
            final w mTextHelper = this.mTextHelper;
            if (mTextHelper != null) {
                mTextHelper.j(n);
            }
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.f(backgroundResource);
        }
    }
    
    public void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = ((View)this).getContext();
        Drawable u1 = null;
        Drawable u2;
        if (n != 0) {
            u2 = vl.a.U1(context, n);
        }
        else {
            u2 = null;
        }
        Drawable u3;
        if (n2 != 0) {
            u3 = vl.a.U1(context, n2);
        }
        else {
            u3 = null;
        }
        Drawable u4;
        if (n3 != 0) {
            u4 = vl.a.U1(context, n3);
        }
        else {
            u4 = null;
        }
        if (n4 != 0) {
            u1 = vl.a.U1(context, n4);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(u2, u3, u4, u1);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = ((View)this).getContext();
        Drawable u1 = null;
        Drawable u2;
        if (n != 0) {
            u2 = vl.a.U1(context, n);
        }
        else {
            u2 = null;
        }
        Drawable u3;
        if (n2 != 0) {
            u3 = vl.a.U1(context, n2);
        }
        else {
            u3 = null;
        }
        Drawable u4;
        if (n3 != 0) {
            u4 = vl.a.U1(context, n3);
        }
        else {
            u4 = null;
        }
        if (n4 != 0) {
            u1 = vl.a.U1(context, n4);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(u2, u3, u4, u1);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.b();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(j.f(actionMode$Callback, (TextView)this));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setFirstBaselineToTopHeight(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.getSuperCaller().a(n);
        }
        else {
            j.c((TextView)this, n);
        }
    }
    
    public void setLastBaselineToBottomHeight(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.getSuperCaller().b(n);
        }
        else {
            j.d((TextView)this, n);
        }
    }
    
    public void setLineHeight(final int n) {
        l0.M(n);
        final int fontMetricsInt = ((Paint)this.getPaint()).getFontMetricsInt((Paint$FontMetricsInt)null);
        if (n != fontMetricsInt) {
            this.setLineSpacing((float)(n - fontMetricsInt), 1.0f);
        }
    }
    
    public void setPrecomputedText(final d d) {
        if (Build$VERSION.SDK_INT >= 29) {
            d.getClass();
            this.setText((CharSequence)null);
            return;
        }
        final d$a a = j.a((TextView)this);
        d.getClass();
        a.a((d$a)null);
        throw null;
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final e mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.mTextHelper.k(list);
        this.mTextHelper.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.mTextHelper.l(porterDuff$Mode);
        this.mTextHelper.b();
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final w mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.g(n, context);
        }
    }
    
    public void setTextClassifier(final TextClassifier b) {
        if (Build$VERSION.SDK_INT < 28) {
            final v mTextClassifierHelper = this.mTextClassifierHelper;
            if (mTextClassifierHelper != null) {
                mTextClassifierHelper.b = b;
                return;
            }
        }
        access$901(((AppCompatTextView$b)this.getSuperCaller()).a, b);
    }
    
    public void setTextFuture(final Future<d> mPrecomputedTextFuture) {
        this.mPrecomputedTextFuture = mPrecomputedTextFuture;
        if (mPrecomputedTextFuture != null) {
            ((View)this).requestLayout();
        }
    }
    
    public void setTextMetricsParamsCompat(final d$a d$a) {
        final TextDirectionHeuristic b = d$a.b;
        final TextDirectionHeuristic firststrong_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int n = 1;
        if (b != firststrong_RTL) {
            if (b != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                if (b == TextDirectionHeuristics.ANYRTL_LTR) {
                    n = 2;
                }
                else if (b == TextDirectionHeuristics.LTR) {
                    n = 3;
                }
                else if (b == TextDirectionHeuristics.RTL) {
                    n = 4;
                }
                else if (b == TextDirectionHeuristics.LOCALE) {
                    n = 5;
                }
                else if (b == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    n = 6;
                }
                else if (b == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    n = 7;
                }
            }
        }
        j$b.h((View)this, n);
        this.getPaint().set(d$a.a);
        j$c.e((TextView)this, d$a.c);
        j$c.h((TextView)this, d$a.d);
    }
    
    public void setTextSize(final int n, final float n2) {
        final boolean b = g1.b;
        if (b) {
            super.setTextSize(n, n2);
        }
        else {
            final w mTextHelper = this.mTextHelper;
            if (mTextHelper != null && !b) {
                final y i = mTextHelper.i;
                if (!i.i() || i.a == 0) {
                    mTextHelper.i.f(n2, n);
                }
            }
        }
    }
    
    public void setTypeface(Typeface typeface, final int n) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface create;
        final Typeface typeface2 = create = null;
        if (typeface != null) {
            create = typeface2;
            if (n > 0) {
                final Context context = ((View)this).getContext();
                final p a = i.a;
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null");
                }
                create = Typeface.create(typeface, n);
            }
        }
        this.mIsSetTypefaceProcessing = true;
        if (create != null) {
            typeface = create;
        }
        try {
            super.setTypeface(typeface, n);
        }
        finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }
    
    public interface a
    {
        void a(final int p0);
        
        void b(final int p0);
    }
    
    public final class c extends AppCompatTextView$b
    {
        public final AppCompatTextView b;
        
        public c(final AppCompatTextView b) {
            super(this.b = b);
        }
        
        public final void a(final int n) {
            AppCompatTextView.access$1001(this.b, n);
        }
        
        public final void b(final int n) {
            AppCompatTextView.access$1101(this.b, n);
        }
    }
}
