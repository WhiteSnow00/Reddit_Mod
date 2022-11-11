// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.PopupWindow$OnDismissListener;
import android.content.DialogInterface;
import android.widget.ListView;
import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.database.DataSetObserver;
import android.widget.ThemedSpinnerAdapter;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
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
import androidx.appcompat.widget.AppCompatSpinner;
import android.view.View;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import android.widget.SpinnerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.widget.Spinner;

public class 03E extends Spinner
{
    public static final int[] LIZJ;
    public int LIZ;
    public final Rect LIZIZ;
    public final 04J LIZLLL;
    public final Context LJ;
    public 03g LJFF;
    public SpinnerAdapter LJI;
    public final boolean LJII;
    public d LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(407);
        LIZJ = new int[] { 16843505 };
    }
    
    public 03E(final Context context, final AttributeSet set) {
        this(context, set, 2130971016);
    }
    
    public 03E(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, (byte)0);
    }
    
    public 03E(final Context context, final AttributeSet set, final int n, final byte b) {
        this(context, set, n, -1);
    }
    
    public 03E(Context lji, AttributeSet set, final int n, final int n2) {
        super(lji, set, n);
        this.LIZIZ = new Rect();
        final 043 liz = 043.LIZ(lji, set, new int[] { 16842930, 16843126, 16843131, 16843362, 2130970747 }, n, 0);
        this.LIZLLL = new 04J((View)this);
        final int ljff = liz.LJFF(4, 0);
        if (ljff != 0) {
            this.LJ = (Context)new 02V(lji, ljff);
        }
        else {
            this.LJ = lji;
        }
        while (true) {
            try {
                final TypedArray obtainStyledAttributes = lji.obtainStyledAttributes(set, 03E.LIZJ, n, 0);
                int int1 = n2;
                try {
                    if (obtainStyledAttributes.hasValue(0)) {
                        int1 = obtainStyledAttributes.getInt(0, 0);
                    }
                }
                catch (final Exception ex) {
                    int1 = n2;
                    if (obtainStyledAttributes == null) {
                        break Label_0181;
                    }
                    int1 = n2;
                }
                finally {
                    set = (AttributeSet)lji;
                    if (obtainStyledAttributes != null) {
                        obtainStyledAttributes.recycle();
                        set = (AttributeSet)lji;
                    }
                }
                obtainStyledAttributes.recycle();
                if (int1 != 0) {
                    if (int1 == 1) {
                        final c ljiiiizz = new c(this.LJ, set, n);
                        final 043 liz2 = 043.LIZ(this.LJ, set, new int[] { 16842930, 16843126, 16843131, 16843362, 2130970747 }, n, 0);
                        this.LIZ = liz2.LJ(3, -2);
                        ljiiiizz.LIZ(liz2.LIZ(1));
                        ljiiiizz.LIZ = liz.LIZLLL(2);
                        liz2.LIZ.recycle();
                        this.LJIIIIZZ = (d)ljiiiizz;
                        this.LJFF = (03g)new AppCompatSpinner.AppCompatSpinner$1(this, (View)this, ljiiiizz);
                    }
                }
                else {
                    ((a)(this.LJIIIIZZ = (d)new a())).LIZ(liz.LIZLLL(2));
                }
                final CharSequence[] textArray = liz.LIZ.getTextArray(0);
                if (textArray != null) {
                    lji = (Context)new ArrayAdapter(lji, 17367048, (Object[])textArray);
                    ((ArrayAdapter)lji).setDropDownViewResource(2131561652);
                    this.setAdapter((SpinnerAdapter)lji);
                }
                liz.LIZ.recycle();
                this.LJII = true;
                lji = (Context)this.LJI;
                if (lji != null) {
                    this.setAdapter((SpinnerAdapter)lji);
                    this.LJI = null;
                }
                this.LIZLLL.LIZ(set, n);
            }
            catch (final Exception ex2) {
                final int int1 = n2;
                continue;
            }
            break;
        }
    }
    
    public final int LIZ(final SpinnerAdapter spinnerAdapter, final Drawable drawable) {
        int n = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        final int max = Math.max(0, this.getSelectedItemPosition());
        final int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int max2 = 0;
        while (i < min) {
            final int itemViewType = spinnerAdapter.getItemViewType(i);
            int n2;
            if (itemViewType != (n2 = n)) {
                view = null;
                n2 = itemViewType;
            }
            view = spinnerAdapter.getView(i, view, (ViewGroup)this);
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
            drawable.getPadding(this.LIZIZ);
            n3 = max2 + (this.LIZIZ.left + this.LIZIZ.right);
        }
        return n3;
    }
    
    public final void LIZ() {
        this.LJIIIIZZ.LIZ(this.getTextDirection(), this.getTextAlignment());
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final 04J lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZLLL();
        }
    }
    
    public int getDropDownHorizontalOffset() {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            return ljiiiizz.LJFF();
        }
        return super.getDropDownHorizontalOffset();
    }
    
    public int getDropDownVerticalOffset() {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            return ljiiiizz.LIZJ();
        }
        return super.getDropDownVerticalOffset();
    }
    
    public int getDropDownWidth() {
        if (this.LJIIIIZZ != null) {
            return this.LIZ;
        }
        return super.getDropDownWidth();
    }
    
    public final d getInternalPopup() {
        return this.LJIIIIZZ;
    }
    
    public Drawable getPopupBackground() {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            return ljiiiizz.LIZIZ();
        }
        return super.getPopupBackground();
    }
    
    public Context getPopupContext() {
        return this.LJ;
    }
    
    public CharSequence getPrompt() {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            return ljiiiizz.LIZ();
        }
        return super.getPrompt();
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final 04J lizlll = this.LIZLLL;
        if (lizlll != null) {
            return lizlll.LIZIZ();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final 04J lizlll = this.LIZLLL;
        if (lizlll != null) {
            return lizlll.LIZJ();
        }
        return null;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null && ljiiiizz.LJ()) {
            this.LJIIIIZZ.LIZLLL();
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.LJIIIIZZ != null && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.LIZ(this.getAdapter(), this.getBackground())), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final 03E.SavedState savedState = (03E.SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.LIZ) {
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new AppCompatSpinner.AppCompatSpinner$2(this));
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final 03E.SavedState savedState = new 03E.SavedState(super.onSaveInstanceState());
        final d ljiiiizz = this.LJIIIIZZ;
        savedState.LIZ = (ljiiiizz != null && ljiiiizz.LJ());
        return (Parcelable)savedState;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final 03g ljff = this.LJFF;
        return (ljff != null && ljff.onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public boolean performClick() {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            if (!ljiiiizz.LJ()) {
                this.LIZ();
            }
            return true;
        }
        return super.performClick();
    }
    
    public void setAdapter(final SpinnerAdapter spinnerAdapter) {
        if (!this.LJII) {
            this.LJI = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.LJIIIIZZ != null) {
            Context context;
            if ((context = this.LJ) == null) {
                context = this.getContext();
            }
            this.LJIIIIZZ.LIZ((ListAdapter)new b(spinnerAdapter, context.getTheme()));
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final 04J lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZ();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final 04J lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZ(backgroundResource);
        }
    }
    
    public void setDropDownHorizontalOffset(final int dropDownHorizontalOffset) {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.LIZJ(dropDownHorizontalOffset);
            this.LJIIIIZZ.LIZIZ(dropDownHorizontalOffset);
            return;
        }
        super.setDropDownHorizontalOffset(dropDownHorizontalOffset);
    }
    
    public void setDropDownVerticalOffset(final int dropDownVerticalOffset) {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.LIZ(dropDownVerticalOffset);
            return;
        }
        super.setDropDownVerticalOffset(dropDownVerticalOffset);
    }
    
    public void setDropDownWidth(final int n) {
        if (this.LJIIIIZZ != null) {
            this.LIZ = n;
            return;
        }
        super.setDropDownWidth(n);
    }
    
    public void setPopupBackgroundDrawable(final Drawable popupBackgroundDrawable) {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.LIZ(popupBackgroundDrawable);
            return;
        }
        super.setPopupBackgroundDrawable(popupBackgroundDrawable);
    }
    
    public void setPopupBackgroundResource(final int n) {
        this.setPopupBackgroundDrawable(01s.LIZIZ(this.getPopupContext(), n));
    }
    
    public void setPrompt(final CharSequence prompt) {
        final d ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.LIZ(prompt);
            return;
        }
        super.setPrompt(prompt);
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final 04J lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZ(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final 04J lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZ(porterDuff$Mode);
        }
    }
    
    public static final class b implements ListAdapter, SpinnerAdapter
    {
        public SpinnerAdapter LIZ;
        public ListAdapter LIZIZ;
        
        static {
            Covode.recordClassIndex(413);
        }
        
        public b(final SpinnerAdapter liz, final Resources$Theme dropDownViewTheme) {
            this.LIZ = liz;
            if (liz instanceof ListAdapter) {
                this.LIZIZ = (ListAdapter)liz;
            }
            if (dropDownViewTheme != null && Build$VERSION.SDK_INT >= 23 && liz instanceof ThemedSpinnerAdapter) {
                final ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter)liz;
                if (themedSpinnerAdapter.getDropDownViewTheme() != dropDownViewTheme) {
                    themedSpinnerAdapter.setDropDownViewTheme(dropDownViewTheme);
                }
            }
        }
        
        public final boolean areAllItemsEnabled() {
            final ListAdapter liziz = this.LIZIZ;
            return liziz == null || liziz.areAllItemsEnabled();
        }
        
        public final int getCount() {
            final SpinnerAdapter liz = this.LIZ;
            if (liz == null) {
                return 0;
            }
            return liz.getCount();
        }
        
        public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
            final SpinnerAdapter liz = this.LIZ;
            if (liz == null) {
                return null;
            }
            return liz.getDropDownView(n, view, viewGroup);
        }
        
        public final Object getItem(final int n) {
            final SpinnerAdapter liz = this.LIZ;
            if (liz == null) {
                return null;
            }
            return liz.getItem(n);
        }
        
        public final long getItemId(final int n) {
            final SpinnerAdapter liz = this.LIZ;
            if (liz == null) {
                return -1L;
            }
            return liz.getItemId(n);
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
            final SpinnerAdapter liz = this.LIZ;
            return liz != null && liz.hasStableIds();
        }
        
        public final boolean isEmpty() {
            return this.getCount() == 0;
        }
        
        public final boolean isEnabled(final int n) {
            final ListAdapter liziz = this.LIZIZ;
            return liziz == null || liziz.isEnabled(n);
        }
        
        public final void registerDataSetObserver(final DataSetObserver dataSetObserver) {
            final SpinnerAdapter liz = this.LIZ;
            if (liz != null) {
                liz.registerDataSetObserver(dataSetObserver);
            }
        }
        
        public final void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
            final SpinnerAdapter liz = this.LIZ;
            if (liz != null) {
                liz.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
    
    public interface d
    {
        default static {
            Covode.recordClassIndex(418);
        }
        
        CharSequence LIZ();
        
        void LIZ(final int p0);
        
        void LIZ(final int p0, final int p1);
        
        void LIZ(final Drawable p0);
        
        void LIZ(final ListAdapter p0);
        
        void LIZ(final CharSequence p0);
        
        Drawable LIZIZ();
        
        void LIZIZ(final int p0);
        
        int LIZJ();
        
        void LIZJ(final int p0);
        
        void LIZLLL();
        
        boolean LJ();
        
        int LJFF();
    }
    
    public final class a implements DialogInterface$OnClickListener, d
    {
        public 1fM LIZ;
        public ListAdapter LIZJ;
        public CharSequence LIZLLL;
        
        static {
            Covode.recordClassIndex(412);
        }
        
        public final CharSequence LIZ() {
            return this.LIZLLL;
        }
        
        public final void LIZ(final int n) {
        }
        
        public final void LIZ(final int textDirection, final int textAlignment) {
            if (this.LIZJ == null) {
                return;
            }
            final 1fM.a a = new 1fM.a(03E.this.getPopupContext());
            final CharSequence lizlll = this.LIZLLL;
            if (lizlll != null) {
                a.LIZ(lizlll);
            }
            final ListAdapter lizj = this.LIZJ;
            final int selectedItemPosition = 03E.this.getSelectedItemPosition();
            a.LIZ.LJIL = lizj;
            a.LIZ.LJJ = (DialogInterface$OnClickListener)this;
            a.LIZ.LJJIJIIJIL = selectedItemPosition;
            a.LIZ.LJJIJIIJI = true;
            final 1fM liz = a.LIZ();
            this.LIZ = liz;
            final ListView lji = liz.LIZ.LJI;
            lji.setTextDirection(textDirection);
            lji.setTextAlignment(textAlignment);
            final 1fM liz2 = this.LIZ;
            liz2.show();
            KN6.LIZ.LIZ((Dialog)liz2);
        }
        
        public final void LIZ(final Drawable drawable) {
        }
        
        public final void LIZ(final ListAdapter lizj) {
            this.LIZJ = lizj;
        }
        
        public final void LIZ(final CharSequence lizlll) {
            this.LIZLLL = lizlll;
        }
        
        public final Drawable LIZIZ() {
            return null;
        }
        
        public final void LIZIZ(final int n) {
        }
        
        public final int LIZJ() {
            return 0;
        }
        
        public final void LIZJ(final int n) {
        }
        
        public final void LIZLLL() {
            final 1fM liz = this.LIZ;
            if (liz != null) {
                liz.dismiss();
                this.LIZ = null;
            }
        }
        
        public final boolean LJ() {
            final 1fM liz = this.LIZ;
            return liz != null && liz.isShowing();
        }
        
        public final int LJFF() {
            return 0;
        }
        
        public final void onClick(final DialogInterface dialogInterface, final int selection) {
            03E.this.setSelection(selection);
            if (03E.this.getOnItemClickListener() != null) {
                03E.this.performItemClick((View)null, selection, this.LIZJ.getItemId(selection));
            }
            this.LIZLLL();
        }
    }
    
    public final class c extends 13R implements 03E.d
    {
        public CharSequence LIZ;
        public ListAdapter LIZIZ;
        public final Rect LIZJ;
        public final /* synthetic */ 03E LIZLLL;
        public int LJIL;
        
        static {
            Covode.recordClassIndex(414);
        }
        
        public c(final 03E 03E, final Context context, final AttributeSet set, final int n) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_1        
            //     2: putfield        X/1fb.LIZLLL:LX/03E;
            //     5: aload_0        
            //     6: aload_2        
            //     7: aload_3        
            //     8: iload           4
            //    10: invokespecial   X/13R.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
            //    13: aload_0        
            //    14: new             Landroid/graphics/Rect;
            //    17: dup            
            //    18: invokespecial   android/graphics/Rect.<init>:()V
            //    21: putfield        X/1fb.LIZJ:Landroid/graphics/Rect;
            //    24: aload_0        
            //    25: aload_1        
            //    26: putfield        X/13R.LJIILJJIL:Landroid/view/View;
            //    29: aload_0        
            //    30: invokevirtual   X/13R.LJIIIIZZ:()V
            //    33: aload_0        
            //    34: iconst_0       
            //    35: putfield        X/13R.LJIILIIL:I
            //    38: aload_0        
            //    39: new             LX/03A;
            //    42: dup            
            //    43: aload_0        
            //    44: invokespecial   X/03A.<init>:(LX/1fb;)V
            //    47: putfield        X/13R.LJIILLIIL:Landroid/widget/AdapterView$OnItemClickListener;
            //    50: return         
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public final CharSequence LIZ() {
            return this.LIZ;
        }
        
        @Override
        public final void LIZ(final int textDirection, final int textAlignment) {
            public final class 03C implements PopupWindow$OnDismissListener
            {
                public final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListener LIZ;
                public final /* synthetic */ c LIZIZ;
                
                static {
                    Covode.recordClassIndex(417);
                }
                
                public 03C(final c liziz, final ViewTreeObserver$OnGlobalLayoutListener liz) {
                    this.LIZIZ = liziz;
                    this.LIZ = liz;
                }
                
                public final void onDismiss() {
                    final ViewTreeObserver viewTreeObserver = this.LIZIZ.LIZLLL.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this.LIZ);
                    }
                }
            }
            public final class 03B implements ViewTreeObserver$OnGlobalLayoutListener
            {
                public final /* synthetic */ c LIZ;
                
                static {
                    Covode.recordClassIndex(416);
                }
                
                public 03B(final c liz) {
                    this.LIZ = liz;
                }
                
                public final void onGlobalLayout() {
                    final c liz = this.LIZ;
                    final 03E lizlll = liz.LIZLLL;
                    if (((View)lizlll).isAttachedToWindow() && ((View)lizlll).getGlobalVisibleRect(liz.LIZJ)) {
                        this.LIZ.LJII();
                        this.LIZ.a_();
                        return;
                    }
                    this.LIZ.LIZLLL();
                }
            }
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokevirtual   X/13R.LJ:()Z
            //     4: istore_3       
            //     5: aload_0        
            //     6: invokevirtual   X/1fb.LJII:()V
            //     9: aload_0        
            //    10: invokevirtual   X/13R.LJIIIZ:()V
            //    13: aload_0        
            //    14: invokevirtual   X/13R.a_:()V
            //    17: aload_0        
            //    18: getfield        X/13R.LJ:LX/03b;
            //    21: astore          4
            //    23: aload           4
            //    25: iconst_1       
            //    26: invokevirtual   android/widget/ListView.setChoiceMode:(I)V
            //    29: aload           4
            //    31: iload_1        
            //    32: invokevirtual   android/widget/ListView.setTextDirection:(I)V
            //    35: aload           4
            //    37: iload_2        
            //    38: invokevirtual   android/widget/ListView.setTextAlignment:(I)V
            //    41: aload_0        
            //    42: aload_0        
            //    43: getfield        X/1fb.LIZLLL:LX/03E;
            //    46: invokevirtual   X/03E.getSelectedItemPosition:()I
            //    49: invokevirtual   X/13R.LJ:(I)V
            //    52: iload_3        
            //    53: ifeq            57
            //    56: return         
            //    57: aload_0        
            //    58: getfield        X/1fb.LIZLLL:LX/03E;
            //    61: invokevirtual   X/03E.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
            //    64: astore          5
            //    66: aload           5
            //    68: ifnull          102
            //    71: new             LX/03B;
            //    74: dup            
            //    75: aload_0        
            //    76: invokespecial   X/03B.<init>:(LX/1fb;)V
            //    79: astore          4
            //    81: aload           5
            //    83: aload           4
            //    85: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
            //    88: aload_0        
            //    89: new             LX/03C;
            //    92: dup            
            //    93: aload_0        
            //    94: aload           4
            //    96: invokespecial   X/03C.<init>:(LX/1fb;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
            //    99: invokevirtual   X/13R.LIZ:(Landroid/widget/PopupWindow$OnDismissListener;)V
            //   102: return         
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public final void LIZ(final ListAdapter liziz) {
            super.LIZ(liziz);
            this.LIZIZ = liziz;
        }
        
        @Override
        public final void LIZ(final CharSequence liz) {
            this.LIZ = liz;
        }
        
        @Override
        public final void LIZJ(final int ljil) {
            this.LJIL = ljil;
        }
        
        public final void LJII() {
            final Drawable background = super.LJIJJLI.getBackground();
            int right = 0;
            if (background != null) {
                background.getPadding(this.LIZLLL.LIZIZ);
                if (04A.LIZ((View)this.LIZLLL)) {
                    right = this.LIZLLL.LIZIZ.right;
                }
                else {
                    right = -this.LIZLLL.LIZIZ.left;
                }
            }
            else {
                final Rect liziz = this.LIZLLL.LIZIZ;
                this.LIZLLL.LIZIZ.right = 0;
                liziz.left = 0;
            }
            final int paddingLeft = this.LIZLLL.getPaddingLeft();
            final int paddingRight = this.LIZLLL.getPaddingRight();
            final int width = this.LIZLLL.getWidth();
            if (this.LIZLLL.LIZ == -2) {
                final int liz = this.LIZLLL.LIZ((SpinnerAdapter)this.LIZIZ, super.LJIJJLI.getBackground());
                final int n = this.LIZLLL.getContext().getResources().getDisplayMetrics().widthPixels - this.LIZLLL.LIZIZ.left - this.LIZLLL.LIZIZ.right;
                int n2;
                if ((n2 = liz) > n) {
                    n2 = n;
                }
                this.LIZLLL(Math.max(n2, width - paddingLeft - paddingRight));
            }
            else if (this.LIZLLL.LIZ == -1) {
                this.LIZLLL(width - paddingLeft - paddingRight);
            }
            else {
                this.LIZLLL(this.LIZLLL.LIZ);
            }
            int ljii;
            if (04A.LIZ((View)this.LIZLLL)) {
                ljii = right + (width - paddingRight - super.LJI - this.LJIL);
            }
            else {
                ljii = right + (paddingLeft + this.LJIL);
            }
            super.LJII = ljii;
        }
    }
}
