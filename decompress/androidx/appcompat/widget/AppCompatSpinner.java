// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.AbsListView;
import android.widget.PopupWindow;
import android.view.AbsSavedState;
import android.widget.AbsSpinner;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.widget.PopupWindow$OnDismissListener;
import java.util.WeakHashMap;
import a4.l0$g;
import a4.l0;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.database.DataSetObserver;
import z3.b;
import android.content.res.Resources$Theme;
import android.widget.ThemedSpinnerAdapter;
import vl.a;
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
import mg.d0;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.SpinnerAdapter;
import android.content.Context;
import android.widget.Spinner;

public class AppCompatSpinner extends Spinner
{
    public static final int[] n;
    public final e f;
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
        this(context, set, 2130969805);
    }
    
    public AppCompatSpinner(final Context g, AttributeSet set, final int n) {
        super(g, set, n);
        this.m = new Rect();
        t0.a(((View)this).getContext(), (View)this);
        final y0 y0 = new y0(g, g.obtainStyledAttributes(set, d0.S, n, 0));
        this.f = new e((View)this);
        int n2 = y0.i(4, 0);
        if (n2 != 0) {
            this.g = (Context)new k.d(g, n2);
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
                    final g k = new g(this.g, set, n);
                    final y0 m = androidx.appcompat.widget.y0.m(this.g, set, d0.S, n);
                    this.l = m.b.getLayoutDimension(3, -2);
                    k.o(m.e(1));
                    k.G = y0.j(2);
                    m.n();
                    this.k = (i)k;
                    this.h = new u(this, (View)this, k);
                }
            }
            else {
                final AppCompatSpinner.AppCompatSpinner$e i = new AppCompatSpinner.AppCompatSpinner$e(this);
                this.k = (i)i;
                i.h = y0.j(2);
            }
            final CharSequence[] textArray = y0.b.getTextArray(0);
            if (textArray != null) {
                final ArrayAdapter adapter = new ArrayAdapter(g, 17367048, (Object[])textArray);
                adapter.setDropDownViewResource(2131625491);
                this.setAdapter((SpinnerAdapter)adapter);
            }
            y0.n();
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
        final e f = this.f;
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
        final e f = this.f;
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
        final e f = this.f;
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
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener(this) {
                    public final AppCompatSpinner f;
                    
                    public final void onGlobalLayout() {
                        if (!this.f.getInternalPopup().a()) {
                            final AppCompatSpinner f = this.f;
                            f.k.e(c.b((View)f), c.a((View)f));
                        }
                        final ViewTreeObserver viewTreeObserver = ((View)this.f).getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            b.a(viewTreeObserver, (ViewTreeObserver$OnGlobalLayoutListener)this);
                        }
                    }
                });
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
        return (h != null && ((g0)h).onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public boolean performClick() {
        final i k = this.k;
        if (k != null) {
            if (!k.a()) {
                this.k.e(c.b((View)this), c.a((View)this));
            }
            return true;
        }
        return super.performClick();
    }
    
    public /* bridge */ void setAdapter(final Adapter adapter) {
        this.setAdapter((SpinnerAdapter)adapter);
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
            this.k.n((ListAdapter)new f(spinnerAdapter, context.getTheme()));
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final e f = this.f;
        if (f != null) {
            f.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final e f = this.f;
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
        this.setPopupBackgroundDrawable(a.U1(this.getPopupContext(), n));
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
        final e f = this.f;
        if (f != null) {
            f.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final e f = this.f;
        if (f != null) {
            f.i(porterDuff$Mode);
        }
    }
    
    public static final class b
    {
        public static void a(final ViewTreeObserver viewTreeObserver, final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
        }
    }
    
    public static final class c
    {
        public static int a(final View view) {
            return view.getTextAlignment();
        }
        
        public static int b(final View view) {
            return view.getTextDirection();
        }
        
        public static void c(final View view, final int textAlignment) {
            view.setTextAlignment(textAlignment);
        }
        
        public static void d(final View view, final int textDirection) {
            view.setTextDirection(textDirection);
        }
    }
    
    public static final class d
    {
        public static void a(final ThemedSpinnerAdapter themedSpinnerAdapter, final Resources$Theme dropDownViewTheme) {
            if (!z3.b.a(themedSpinnerAdapter.getDropDownViewTheme(), dropDownViewTheme)) {
                themedSpinnerAdapter.setDropDownViewTheme(dropDownViewTheme);
            }
        }
    }
    
    public static final class f implements ListAdapter, SpinnerAdapter
    {
        public SpinnerAdapter f;
        public ListAdapter g;
        
        public f(final SpinnerAdapter f, final Resources$Theme resources$Theme) {
            this.f = f;
            if (f instanceof ListAdapter) {
                this.g = (ListAdapter)f;
            }
            if (resources$Theme != null) {
                if (f instanceof ThemedSpinnerAdapter) {
                    d.a((ThemedSpinnerAdapter)f, resources$Theme);
                }
                else if (f instanceof u0) {
                    final u0 u0 = (u0)f;
                    if (u0.getDropDownViewTheme() == null) {
                        u0.a();
                    }
                }
            }
        }
        
        public final boolean areAllItemsEnabled() {
            final ListAdapter g = this.g;
            return g == null || g.areAllItemsEnabled();
        }
        
        public final int getCount() {
            final SpinnerAdapter f = this.f;
            int count;
            if (f == null) {
                count = 0;
            }
            else {
                count = ((Adapter)f).getCount();
            }
            return count;
        }
        
        public final View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
            final SpinnerAdapter f = this.f;
            if (f == null) {
                dropDownView = null;
            }
            else {
                dropDownView = f.getDropDownView(n, dropDownView, viewGroup);
            }
            return dropDownView;
        }
        
        public final Object getItem(final int n) {
            final SpinnerAdapter f = this.f;
            Object item;
            if (f == null) {
                item = null;
            }
            else {
                item = ((Adapter)f).getItem(n);
            }
            return item;
        }
        
        public final long getItemId(final int n) {
            final SpinnerAdapter f = this.f;
            long itemId;
            if (f == null) {
                itemId = -1L;
            }
            else {
                itemId = ((Adapter)f).getItemId(n);
            }
            return itemId;
        }
        
        public final int getItemViewType(final int n) {
            return 0;
        }
        
        public final View getView(final int n, final View view, final ViewGroup viewGroup) {
            return this.getDropDownView(n, view, viewGroup);
        }
        
        public final int getViewTypeCount() {
            return 1;
        }
        
        public final boolean hasStableIds() {
            final SpinnerAdapter f = this.f;
            return f != null && ((Adapter)f).hasStableIds();
        }
        
        public final boolean isEmpty() {
            return this.getCount() == 0;
        }
        
        public final boolean isEnabled(final int n) {
            final ListAdapter g = this.g;
            return g == null || g.isEnabled(n);
        }
        
        public final void registerDataSetObserver(final DataSetObserver dataSetObserver) {
            final SpinnerAdapter f = this.f;
            if (f != null) {
                ((Adapter)f).registerDataSetObserver(dataSetObserver);
            }
        }
        
        public final void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
            final SpinnerAdapter f = this.f;
            if (f != null) {
                ((Adapter)f).unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
    
    public final class g extends i0 implements i
    {
        public CharSequence G;
        public ListAdapter H;
        public final Rect I;
        public int J;
        public final AppCompatSpinner K;
        
        public g(final AppCompatSpinner appCompatSpinner, final Context context, final AttributeSet set, final int n) {
            this.K = appCompatSpinner;
            super(context, set, n, 0);
            this.I = new Rect();
            super.t = (View)appCompatSpinner;
            super.C = true;
            ((PopupWindow)super.D).setFocusable(true);
            super.u = (AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener(this) {
                public final g f;
                
                public final void onItemClick(final AdapterView<?> adapterView, final View view, final int selection, final long n) {
                    ((AdapterView)this.f.K).setSelection(selection);
                    if (((AdapterView)this.f.K).getOnItemClickListener() != null) {
                        final g f = this.f;
                        ((AdapterView)f.K).performItemClick(view, selection, ((Adapter)f.H).getItemId(selection));
                    }
                    this.f.dismiss();
                }
            };
        }
        
        public final void d(final int j) {
            this.J = j;
        }
        
        public final void e(int selectedItemPosition, final int n) {
            final boolean a = this.a();
            this.r();
            ((PopupWindow)super.D).setInputMethodMode(2);
            this.show();
            final e0 h = super.h;
            ((AbsListView)h).setChoiceMode(1);
            c.d((View)h, selectedItemPosition);
            c.c((View)h, n);
            selectedItemPosition = ((AdapterView)this.K).getSelectedItemPosition();
            final e0 h2 = super.h;
            if (this.a() && h2 != null) {
                h2.setListSelectionHidden(false);
                ((AdapterView)h2).setSelection(selectedItemPosition);
                if (((AbsListView)h2).getChoiceMode() != 0) {
                    ((AbsListView)h2).setItemChecked(selectedItemPosition, true);
                }
            }
            if (a) {
                return;
            }
            final ViewTreeObserver viewTreeObserver = ((View)this.K).getViewTreeObserver();
            if (viewTreeObserver != null) {
                final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener(this) {
                    public final g f;
                    
                    public final void onGlobalLayout() {
                        final g f = this.f;
                        final AppCompatSpinner k = f.K;
                        f.getClass();
                        final WeakHashMap a = l0.a;
                        if (!l0$g.b((View)k) || !((View)k).getGlobalVisibleRect(f.I)) {
                            this.f.dismiss();
                        }
                        else {
                            this.f.r();
                            this.f.show();
                        }
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)viewTreeObserver$OnGlobalLayoutListener);
                ((PopupWindow)super.D).setOnDismissListener((PopupWindow$OnDismissListener)new PopupWindow$OnDismissListener(this, viewTreeObserver$OnGlobalLayoutListener) {
                    public final ViewTreeObserver$OnGlobalLayoutListener f;
                    public final g g;
                    
                    public final void onDismiss() {
                        final ViewTreeObserver viewTreeObserver = ((View)this.g.K).getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(this.f);
                        }
                    }
                });
            }
        }
        
        public final CharSequence l() {
            return this.G;
        }
        
        public final void m(final CharSequence g) {
            this.G = g;
        }
        
        public final void n(final ListAdapter h) {
            super.n(h);
            this.H = h;
        }
        
        public final void r() {
            final Drawable b = this.b();
            int right = 0;
            if (b != null) {
                b.getPadding(this.K.m);
                if (g1.a((View)this.K)) {
                    right = this.K.m.right;
                }
                else {
                    right = -this.K.m.left;
                }
            }
            else {
                final Rect m = this.K.m;
                m.right = 0;
                m.left = 0;
            }
            final int paddingLeft = ((View)this.K).getPaddingLeft();
            final int paddingRight = ((View)this.K).getPaddingRight();
            final int width = ((View)this.K).getWidth();
            final AppCompatSpinner k = this.K;
            final int l = k.l;
            if (l == -2) {
                final int a = k.a((SpinnerAdapter)this.H, this.b());
                final int widthPixels = ((View)this.K).getContext().getResources().getDisplayMetrics().widthPixels;
                final Rect i = this.K.m;
                final int n = widthPixels - i.left - i.right;
                int n2;
                if ((n2 = a) > n) {
                    n2 = n;
                }
                this.q(Math.max(n2, width - paddingLeft - paddingRight));
            }
            else if (l == -1) {
                this.q(width - paddingLeft - paddingRight);
            }
            else {
                this.q(l);
            }
            int j;
            if (g1.a((View)this.K)) {
                j = width - paddingRight - super.j - this.J + right;
            }
            else {
                j = paddingLeft + this.J + right;
            }
            super.k = j;
        }
    }
    
    public static final class h extends View$BaseSavedState
    {
        public static final Parcelable$Creator<h> CREATOR;
        public boolean f;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<h>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new h(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new h[n];
                }
            };
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
