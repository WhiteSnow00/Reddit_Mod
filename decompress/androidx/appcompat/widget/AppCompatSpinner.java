// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import h.m;
import android.app.Dialog;
import android.view.AbsSavedState;
import android.widget.AbsSpinner;
import android.widget.AdapterView;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.e$a;
import android.content.DialogInterface$OnClickListener;
import eg.n0;
import android.widget.ListAdapter;
import android.widget.Adapter;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.widget.ArrayAdapter;
import android.util.Log;
import k.d;
import gn.a;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.SpinnerAdapter;
import android.content.Context;
import android.widget.Spinner;

public class AppCompatSpinner extends Spinner
{
    public static final int[] n;
    public final androidx.appcompat.widget.e f;
    public final Context g;
    public u h;
    public SpinnerAdapter i;
    public final boolean j;
    public i k;
    public int l;
    public final Rect m;
    
    static {
        n = new int[] { 16843505 };
    }
    
    public AppCompatSpinner(final Context context, final AttributeSet set) {
        this(context, set, 2130969813);
    }
    
    public AppCompatSpinner(final Context g, AttributeSet set, final int n) {
        super(g, set, n);
        this.m = new Rect();
        u0.a(((View)this).getContext(), (View)this);
        final z0 z0 = new z0(g, g.obtainStyledAttributes(set, a.l0, n, 0));
        this.f = new androidx.appcompat.widget.e((View)this);
        int n2 = z0.i(4, 0);
        if (n2 != 0) {
            this.g = (Context)new d(g, n2);
        }
        else {
            this.g = g;
        }
        AttributeSet obtainStyledAttributes = null;
        final int n3 = -1;
        Label_0429: {
            Label_0213: {
                TypedArray typedArray2 = null;
                Label_0208: {
                    TypedArray typedArray;
                    try {
                        typedArray = (TypedArray)(obtainStyledAttributes = (AttributeSet)g.obtainStyledAttributes(set, AppCompatSpinner.n, n, 0));
                        n2 = n3;
                        typedArray2 = typedArray;
                        try {
                            try {
                                if (!typedArray.hasValue(0)) {
                                    break Label_0208;
                                }
                                obtainStyledAttributes = (AttributeSet)typedArray;
                                n2 = typedArray.getInt(0, 0);
                            }
                            finally {}
                        }
                        catch (final Exception typedArray2) {}
                    }
                    catch (final Exception typedArray2) {
                        typedArray = null;
                    }
                    finally {
                        set = obtainStyledAttributes;
                        break Label_0429;
                    }
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", (Throwable)typedArray2);
                    n2 = n3;
                    if (typedArray == null) {
                        break Label_0213;
                    }
                    typedArray2 = typedArray;
                    n2 = n3;
                }
                typedArray2.recycle();
            }
            if (n2 != 0) {
                if (n2 == 1) {
                    final AppCompatSpinner.AppCompatSpinner$g k = new AppCompatSpinner.AppCompatSpinner$g(this, this.g, set, n);
                    final z0 m = androidx.appcompat.widget.z0.m(this.g, set, a.l0, n);
                    this.l = m.b.getLayoutDimension(3, -2);
                    ((i0)k).o(m.e(1));
                    k.G = z0.j(2);
                    m.n();
                    this.k = (i)k;
                    this.h = new u(this, (View)this, k);
                }
            }
            else {
                final e i = new e();
                this.k = (i)i;
                i.h = z0.j(2);
            }
            final CharSequence[] textArray = z0.b.getTextArray(0);
            if (textArray != null) {
                final ArrayAdapter adapter = new ArrayAdapter(g, 17367048, (Object[])textArray);
                adapter.setDropDownViewResource(2131625498);
                this.setAdapter((SpinnerAdapter)adapter);
            }
            z0.n();
            this.j = true;
            final SpinnerAdapter j = this.i;
            if (j != null) {
                this.setAdapter(j);
                this.i = null;
            }
            this.f.d(set, n);
            return;
        }
        if (set != null) {
            ((TypedArray)set).recycle();
        }
    }
    
    public final int a(final SpinnerAdapter spinnerAdapter, final Drawable drawable) {
        int n = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight(), 0);
        final int max = Math.max(0, ((AdapterView)this).getSelectedItemPosition());
        final int min = Math.min(((Adapter)spinnerAdapter).getCount(), max + 15);
        int i = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int max2 = 0;
        while (i < min) {
            final int itemViewType = ((Adapter)spinnerAdapter).getItemViewType(i);
            int n2;
            if (itemViewType != (n2 = n)) {
                view = null;
                n2 = itemViewType;
            }
            view = ((Adapter)spinnerAdapter).getView(i, view, (ViewGroup)this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
            }
            view.measure(measureSpec, measureSpec2);
            max2 = Math.max(max2, view.getMeasuredWidth());
            ++i;
            n = n2;
        }
        int n3 = max2;
        if (drawable != null) {
            drawable.getPadding(this.m);
            final Rect m = this.m;
            n3 = max2 + (m.left + m.right);
        }
        return n3;
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final androidx.appcompat.widget.e f = this.f;
        if (f != null) {
            f.a();
        }
    }
    
    public int getDropDownHorizontalOffset() {
        final i k = this.k;
        if (k != null) {
            return k.i();
        }
        return super.getDropDownHorizontalOffset();
    }
    
    public int getDropDownVerticalOffset() {
        final i k = this.k;
        if (k != null) {
            return k.f();
        }
        return super.getDropDownVerticalOffset();
    }
    
    public int getDropDownWidth() {
        if (this.k != null) {
            return this.l;
        }
        return super.getDropDownWidth();
    }
    
    public final i getInternalPopup() {
        return this.k;
    }
    
    public Drawable getPopupBackground() {
        final i k = this.k;
        if (k != null) {
            return k.b();
        }
        return super.getPopupBackground();
    }
    
    public Context getPopupContext() {
        return this.g;
    }
    
    public CharSequence getPrompt() {
        final i k = this.k;
        CharSequence charSequence;
        if (k != null) {
            charSequence = k.l();
        }
        else {
            charSequence = super.getPrompt();
        }
        return charSequence;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final androidx.appcompat.widget.e f = this.f;
        ColorStateList b;
        if (f != null) {
            b = f.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final androidx.appcompat.widget.e f = this.f;
        PorterDuff$Mode c;
        if (f != null) {
            c = f.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final i k = this.k;
        if (k != null && k.a()) {
            this.k.dismiss();
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.k != null && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            ((View)this).setMeasuredDimension(Math.min(Math.max(((View)this).getMeasuredWidth(), this.a(((AbsSpinner)this).getAdapter(), ((View)this).getBackground())), View$MeasureSpec.getSize(n)), ((View)this).getMeasuredHeight());
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        final h h = (h)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)h).getSuperState());
        if (h.f) {
            final ViewTreeObserver viewTreeObserver = ((View)this).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new AppCompatSpinner$a(this));
            }
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final h h = new h(super.onSaveInstanceState());
        final i k = this.k;
        h.f = (k != null && k.a());
        return (Parcelable)h;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final u h = this.h;
        return (h != null && h.onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public boolean performClick() {
        final i k = this.k;
        if (k != null) {
            if (!k.a()) {
                this.k.e(AppCompatSpinner$c.b((View)this), AppCompatSpinner$c.a((View)this));
            }
            return true;
        }
        return super.performClick();
    }
    
    public void setAdapter(final SpinnerAdapter spinnerAdapter) {
        if (!this.j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.k != null) {
            Context context;
            if ((context = this.g) == null) {
                context = ((View)this).getContext();
            }
            this.k.n((ListAdapter)new AppCompatSpinner.AppCompatSpinner$f(spinnerAdapter, context.getTheme()));
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final androidx.appcompat.widget.e f = this.f;
        if (f != null) {
            f.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final androidx.appcompat.widget.e f = this.f;
        if (f != null) {
            f.f(backgroundResource);
        }
    }
    
    public void setDropDownHorizontalOffset(final int dropDownHorizontalOffset) {
        final i k = this.k;
        if (k != null) {
            k.d(dropDownHorizontalOffset);
            this.k.k(dropDownHorizontalOffset);
        }
        else {
            super.setDropDownHorizontalOffset(dropDownHorizontalOffset);
        }
    }
    
    public void setDropDownVerticalOffset(final int dropDownVerticalOffset) {
        final i k = this.k;
        if (k != null) {
            k.c(dropDownVerticalOffset);
        }
        else {
            super.setDropDownVerticalOffset(dropDownVerticalOffset);
        }
    }
    
    public void setDropDownWidth(final int n) {
        if (this.k != null) {
            this.l = n;
        }
        else {
            super.setDropDownWidth(n);
        }
    }
    
    public void setPopupBackgroundDrawable(final Drawable popupBackgroundDrawable) {
        final i k = this.k;
        if (k != null) {
            k.o(popupBackgroundDrawable);
        }
        else {
            super.setPopupBackgroundDrawable(popupBackgroundDrawable);
        }
    }
    
    public void setPopupBackgroundResource(final int n) {
        this.setPopupBackgroundDrawable(n0.L(this.getPopupContext(), n));
    }
    
    public void setPrompt(final CharSequence prompt) {
        final i k = this.k;
        if (k != null) {
            k.m(prompt);
        }
        else {
            super.setPrompt(prompt);
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final androidx.appcompat.widget.e f = this.f;
        if (f != null) {
            f.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final androidx.appcompat.widget.e f = this.f;
        if (f != null) {
            f.i(porterDuff$Mode);
        }
    }
    
    public final class e implements i, DialogInterface$OnClickListener
    {
        public androidx.appcompat.app.e f;
        public ListAdapter g;
        public CharSequence h;
        
        @Override
        public final boolean a() {
            final androidx.appcompat.app.e f = this.f;
            return f != null && ((Dialog)f).isShowing();
        }
        
        @Override
        public final Drawable b() {
            return null;
        }
        
        @Override
        public final void c(final int n) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public final void d(final int n) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public final void dismiss() {
            final androidx.appcompat.app.e f = this.f;
            if (f != null) {
                ((m)f).dismiss();
                this.f = null;
            }
        }
        
        @Override
        public final void e(final int n, final int n2) {
            if (this.g == null) {
                return;
            }
            final e$a e$a = new e$a(AppCompatSpinner.this.getPopupContext());
            final CharSequence h = this.h;
            if (h != null) {
                e$a.setTitle(h);
            }
            final androidx.appcompat.app.e create = e$a.setSingleChoiceItems(this.g, ((AdapterView)AppCompatSpinner.this).getSelectedItemPosition(), (DialogInterface$OnClickListener)this).create();
            this.f = create;
            final AlertController$RecycleListView g = create.j.g;
            AppCompatSpinner$c.d((View)g, n);
            AppCompatSpinner$c.c((View)g, n2);
            ((Dialog)this.f).show();
        }
        
        @Override
        public final int f() {
            return 0;
        }
        
        @Override
        public final int i() {
            return 0;
        }
        
        @Override
        public final void k(final int n) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public final CharSequence l() {
            return this.h;
        }
        
        @Override
        public final void m(final CharSequence h) {
            this.h = h;
        }
        
        @Override
        public final void n(final ListAdapter g) {
            this.g = g;
        }
        
        @Override
        public final void o(final Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
        
        public final void onClick(final DialogInterface dialogInterface, final int selection) {
            ((AdapterView)AppCompatSpinner.this).setSelection(selection);
            if (((AdapterView)AppCompatSpinner.this).getOnItemClickListener() != null) {
                ((AdapterView)AppCompatSpinner.this).performItemClick((View)null, selection, ((Adapter)this.g).getItemId(selection));
            }
            this.dismiss();
        }
    }
    
    public static final class h extends View$BaseSavedState
    {
        public static final Parcelable$Creator<h> CREATOR;
        public boolean f;
        
        static {
            CREATOR = (Parcelable$Creator)new AppCompatSpinner$h$a();
        }
        
        public h(final Parcel parcel) {
            super(parcel);
            this.f = (parcel.readByte() != 0);
        }
        
        public h(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeByte((byte)(byte)(this.f ? 1 : 0));
        }
    }
    
    public interface i
    {
        boolean a();
        
        Drawable b();
        
        void c(final int p0);
        
        void d(final int p0);
        
        void dismiss();
        
        void e(final int p0, final int p1);
        
        int f();
        
        int i();
        
        void k(final int p0);
        
        CharSequence l();
        
        void m(final CharSequence p0);
        
        void n(final ListAdapter p0);
        
        void o(final Drawable p0);
    }
}
