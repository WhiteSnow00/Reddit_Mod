// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewDebug$ExportedProperty;
import android.view.ContextThemeWrapper;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.accessibility.AccessibilityEvent;
import android.view.MenuItem;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;

public class 13G extends LinearLayoutCompat implements 12x.b, 02t
{
    public 12x LIZ;
    public boolean LIZIZ;
    public ActionMenuPresenter LIZJ;
    public 12x.a LIZLLL;
    public e LJ;
    public Context LJII;
    public int LJIIIIZZ;
    public 02r.a LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    
    static {
        Covode.recordClassIndex(393);
    }
    
    public 13G(final Context context) {
        this(context, null);
    }
    
    public 13G(final Context ljii, final AttributeSet set) {
        super(ljii, set);
        this.setBaselineAligned(false);
        final float density = ljii.getResources().getDisplayMetrics().density;
        this.LJIIL = (int)(56.0f * density);
        this.LJIILIIL = (int)(density * 4.0f);
        this.LJII = ljii;
        this.LJIIIIZZ = 0;
    }
    
    public static int LIZ(final View view, final int n, int liziz, int n2, int n3) {
        final c c = (c)view.getLayoutParams();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2) - n3, View$MeasureSpec.getMode(n2));
        1fV 1fV;
        if (view instanceof 1fV) {
            1fV = (1fV)view;
        }
        else {
            1fV = null;
        }
        boolean lizlll = true;
        if (1fV != null && 1fV.LIZIZ()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        n3 = 2;
        if (liziz > 0 && (n2 == 0 || liziz >= 2)) {
            view.measure(View$MeasureSpec.makeMeasureSpec(liziz * n, Integer.MIN_VALUE), measureSpec);
            final int measuredWidth = view.getMeasuredWidth();
            final int n4 = liziz = measuredWidth / n;
            if (measuredWidth % n != 0) {
                liziz = n4 + 1;
            }
            if (n2 != 0 && liziz < 2) {
                liziz = n3;
            }
        }
        else {
            liziz = 0;
        }
        if (c.LIZ || n2 == 0) {
            lizlll = false;
        }
        c.LIZLLL = lizlll;
        c.LIZIZ = liziz;
        view.measure(View$MeasureSpec.makeMeasureSpec(n * liziz, 1073741824), measureSpec);
        return liziz;
    }
    
    private c LIZIZ(final AttributeSet set) {
        return new c(this.getContext(), set);
    }
    
    private boolean LIZIZ(final int n) {
        final boolean b = false;
        if (n == 0) {
            return false;
        }
        final View child = this.getChildAt(n - 1);
        final View child2 = this.getChildAt(n);
        boolean b2 = b;
        if (n < this.getChildCount()) {
            b2 = b;
            if (child instanceof a) {
                b2 = (false | ((a)child).LIZLLL());
            }
        }
        boolean b3 = b2;
        if (n > 0) {
            b3 = b2;
            if (child2 instanceof a) {
                b3 = (b2 | ((a)child2).LIZJ());
            }
        }
        return b3;
    }
    
    public final c LIZ() {
        final c c = new c();
        c.LJII = 16;
        return c;
    }
    
    public final c LIZ(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            c c;
            if (viewGroup$LayoutParams instanceof c) {
                c = new c((c)viewGroup$LayoutParams);
            }
            else {
                c = new c(viewGroup$LayoutParams);
            }
            if (c.LJII <= 0) {
                c.LJII = 16;
            }
            return c;
        }
        return this.LIZ();
    }
    
    public final void LIZ(final 02r.a ljiiiz, final 12x.a lizlll) {
        this.LJIIIZ = ljiiiz;
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final void LIZ(final 12x liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final boolean LIZ(final 130 130) {
        return this.LIZ.LIZ((MenuItem)130, null, 0);
    }
    
    public final void LIZIZ() {
        final ActionMenuPresenter lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LJII();
        }
    }
    
    @Override
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof c;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    public Menu getMenu() {
        if (this.LIZ == null) {
            final Context context = this.getContext();
            (this.LIZ = new 12x(context)).LIZ((12x.a)new d());
            (this.LIZJ = new ActionMenuPresenter(context)).LIZLLL();
            final ActionMenuPresenter lizj = this.LIZJ;
            02r.a ljiiiz = this.LJIIIZ;
            if (ljiiiz == null) {
                ljiiiz = new b();
            }
            lizj.LJ = ljiiiz;
            this.LIZ.LIZ(this.LIZJ, this.LJII);
            this.LIZJ.LIZ(this);
        }
        return (Menu)this.LIZ;
    }
    
    public Drawable getOverflowIcon() {
        this.getMenu();
        final ActionMenuPresenter lizj = this.LIZJ;
        if (lizj.LJII != null) {
            return lizj.LJII.getDrawable();
        }
        if (lizj.LJIIIZ) {
            return lizj.LJIIIIZZ;
        }
        return null;
    }
    
    public int getPopupTheme() {
        return this.LJIIIIZZ;
    }
    
    public int getWindowAnimations() {
        return 0;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final ActionMenuPresenter lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ(false);
            if (this.LIZJ.LJIIIZ()) {
                this.LIZJ.LJI();
                this.LIZJ.LJ();
            }
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LIZIZ();
    }
    
    @Override
    public void onLayout(final boolean b, int i, int n, int j, int max) {
        if (!this.LJIIJ) {
            super.onLayout(b, i, n, j, max);
            return;
        }
        final int childCount = this.getChildCount();
        final int n2 = (max - n) / 2;
        final int dividerWidth = this.getDividerWidth();
        final int n3 = j - i;
        max = n3 - this.getPaddingRight() - this.getPaddingLeft();
        final boolean liz = 04A.LIZ((View)this);
        j = 0;
        int n4 = 0;
        n = 0;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            i = max;
            int n5 = n4;
            int n6 = n;
            if (child.getVisibility() != 8) {
                final c c = (c)child.getLayoutParams();
                if (c.LIZ) {
                    final int n7 = i = child.getMeasuredWidth();
                    if (this.LIZIZ(j)) {
                        i = n7 + dividerWidth;
                    }
                    final int measuredHeight = child.getMeasuredHeight();
                    int n8;
                    int n9;
                    if (liz) {
                        n8 = this.getPaddingLeft() + c.leftMargin;
                        n9 = n8 + i;
                    }
                    else {
                        n9 = this.getWidth() - this.getPaddingRight() - c.rightMargin;
                        n8 = n9 - i;
                    }
                    final int n10 = n2 - measuredHeight / 2;
                    child.layout(n8, n10, n9, measuredHeight + n10);
                    i = max - i;
                    n5 = 1;
                    n6 = n;
                }
                else {
                    i = max - (child.getMeasuredWidth() + c.leftMargin + c.rightMargin);
                    this.LIZIZ(j);
                    n6 = n + 1;
                    n5 = n4;
                }
            }
            ++j;
            max = i;
            n4 = n5;
            n = n6;
        }
        if (childCount == 1 && n4 == 0) {
            final View child2 = this.getChildAt(0);
            i = child2.getMeasuredWidth();
            n = child2.getMeasuredHeight();
            j = n3 / 2 - i / 2;
            max = n2 - n / 2;
            child2.layout(j, max, i + j, n + max);
            return;
        }
        i = n - (n4 ^ 0x1);
        if (i > 0) {
            i = max / i;
        }
        else {
            i = 0;
        }
        max = Math.max(0, i);
        if (liz) {
            j = this.getWidth() - this.getPaddingRight();
            View child3;
            c c2;
            int n11;
            int measuredWidth;
            for (i = 0; i < childCount; ++i, j = n) {
                child3 = this.getChildAt(i);
                c2 = (c)child3.getLayoutParams();
                n = j;
                if (child3.getVisibility() != 8) {
                    n = j;
                    if (!c2.LIZ) {
                        n11 = j - c2.rightMargin;
                        measuredWidth = child3.getMeasuredWidth();
                        j = child3.getMeasuredHeight();
                        n = n2 - j / 2;
                        child3.layout(n11 - measuredWidth, n, n11, j + n);
                        n = n11 - (measuredWidth + c2.leftMargin + max);
                    }
                }
            }
            return;
        }
        n = this.getPaddingLeft();
        View child4;
        c c3;
        int measuredWidth2;
        int n12;
        for (i = 0; i < childCount; ++i, n = j) {
            child4 = this.getChildAt(i);
            c3 = (c)child4.getLayoutParams();
            j = n;
            if (child4.getVisibility() != 8) {
                j = n;
                if (!c3.LIZ) {
                    j = n + c3.leftMargin;
                    measuredWidth2 = child4.getMeasuredWidth();
                    n = child4.getMeasuredHeight();
                    n12 = n2 - n / 2;
                    child4.layout(j, n12, j + measuredWidth2, n + n12);
                    j += measuredWidth2 + c3.rightMargin + max;
                }
            }
        }
    }
    
    @Override
    public void onMeasure(int i, int n) {
        final boolean ljiij = this.LJIIJ;
        final boolean ljiij2 = View$MeasureSpec.getMode(i) == 1073741824 || false;
        this.LJIIJ = ljiij2;
        if (ljiij != ljiij2) {
            this.LJIIJJI = 0;
        }
        final int size = View$MeasureSpec.getSize(i);
        if (this.LJIIJ) {
            final 12x liz = this.LIZ;
            if (liz != null && size != this.LJIIJJI) {
                this.LJIIJJI = size;
                liz.LIZIZ(true);
            }
        }
        final int childCount = this.getChildCount();
        if (this.LJIIJ) {
            if (childCount > 0) {
                final int mode = View$MeasureSpec.getMode(n);
                final int size2 = View$MeasureSpec.getSize(i);
                final int size3 = View$MeasureSpec.getSize(n);
                i = this.getPaddingLeft();
                final int paddingRight = this.getPaddingRight();
                final int n2 = this.getPaddingTop() + this.getPaddingBottom();
                final int childMeasureSpec = getChildMeasureSpec(n, n2, -2);
                final int n3 = size2 - (i + paddingRight);
                n = this.LJIIL;
                i = n3 / n;
                if (i == 0) {
                    this.setMeasuredDimension(n3, 0);
                    return;
                }
                final int n4 = n + n3 % n / i;
                final int childCount2 = this.getChildCount();
                int n5 = 0;
                int n6 = 0;
                int n7 = 0;
                int n8 = 0;
                int j = 0;
                int n9 = 0;
                long n10 = 0L;
                while (j < childCount2) {
                    final View child = this.getChildAt(j);
                    int max = n6;
                    int n11 = i;
                    int n12 = n7;
                    long n13 = n10;
                    int n14 = n5;
                    int n15 = n9;
                    int n16 = n8;
                    if (child.getVisibility() != 8) {
                        final boolean b = child instanceof 1fV;
                        ++n5;
                        if (b) {
                            n = this.LJIILIIL;
                            child.setPadding(n, 0, n, 0);
                        }
                        final c c = (c)child.getLayoutParams();
                        c.LJFF = false;
                        c.LIZJ = 0;
                        c.LIZIZ = 0;
                        c.LIZLLL = false;
                        c.leftMargin = 0;
                        c.rightMargin = 0;
                        c.LJ = (b && ((1fV)child).LIZIZ());
                        if (c.LIZ) {
                            n = 1;
                        }
                        else {
                            n = i;
                        }
                        final int liz2 = LIZ(child, n4, n, childMeasureSpec, n2);
                        final int max2 = Math.max(n7, liz2);
                        n = n8;
                        if (c.LIZLLL) {
                            n = n8 + 1;
                        }
                        if (c.LIZ) {
                            n9 = 1;
                        }
                        i -= liz2;
                        max = Math.max(n6, child.getMeasuredHeight());
                        n11 = i;
                        n12 = max2;
                        n13 = n10;
                        n14 = n5;
                        n15 = n9;
                        n16 = n;
                        if (liz2 == 1) {
                            n13 = (n10 | (long)(1 << j));
                            n16 = n;
                            n15 = n9;
                            n14 = n5;
                            n12 = max2;
                            n11 = i;
                            max = max;
                        }
                    }
                    ++j;
                    n6 = max;
                    i = n11;
                    n7 = n12;
                    n10 = n13;
                    n5 = n14;
                    n9 = n15;
                    n8 = n16;
                }
                boolean b2;
                if (n9 != 0 && n5 == 2) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                n = 0;
                int n17 = i;
                long n18;
                while (true) {
                    n18 = n10;
                    if (n8 <= 0) {
                        break;
                    }
                    n18 = n10;
                    if (n17 <= 0) {
                        break;
                    }
                    int n19 = Integer.MAX_VALUE;
                    int k = 0;
                    int n20 = 0;
                    long n21 = 0L;
                    while (k < childCount2) {
                        final c c2 = (c)this.getChildAt(k).getLayoutParams();
                        int liziz = n19;
                        i = n20;
                        long n22 = n21;
                        if (c2.LIZLLL) {
                            if (c2.LIZIZ < n19) {
                                liziz = c2.LIZIZ;
                                n22 = 1L << k;
                                i = 1;
                            }
                            else {
                                liziz = n19;
                                i = n20;
                                n22 = n21;
                                if (c2.LIZIZ == n19) {
                                    n22 = (n21 | 1L << k);
                                    i = n20 + 1;
                                    liziz = n19;
                                }
                            }
                        }
                        ++k;
                        n19 = liziz;
                        n20 = i;
                        n21 = n22;
                    }
                    n10 = (n18 = (n10 | n21));
                    if (n20 > n17) {
                        break;
                    }
                    View child2;
                    c c3;
                    long n23;
                    long n24;
                    for (i = 0; i < childCount2; ++i, n17 = n, n10 = n24) {
                        child2 = this.getChildAt(i);
                        c3 = (c)child2.getLayoutParams();
                        n23 = 1 << i;
                        if ((n21 & n23) == 0x0L) {
                            n = n17;
                            n24 = n10;
                            if (c3.LIZIZ == n19 + 1) {
                                n24 = (n10 | n23);
                                n = n17;
                            }
                        }
                        else {
                            if (b2 && c3.LJ && n17 == 1) {
                                n = this.LJIILIIL;
                                child2.setPadding(n + n4, 0, n, 0);
                            }
                            ++c3.LIZIZ;
                            c3.LJFF = true;
                            n = n17 - 1;
                            n24 = n10;
                        }
                    }
                    n = 1;
                }
                boolean b3;
                if (n9 == 0 && n5 == 1) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                i = n;
                Label_1279: {
                    if (n17 > 0) {
                        i = n;
                        if (n18 != 0L) {
                            if (n17 >= n5 - 1 && !b3) {
                                i = n;
                                if (n7 <= 1) {
                                    break Label_1279;
                                }
                            }
                            float n26;
                            final float n25 = n26 = (float)Long.bitCount(n18);
                            if (!b3) {
                                float n27 = n25;
                                if ((n18 & 0x1L) != 0x0L) {
                                    n27 = n25;
                                    if (!((c)this.getChildAt(0).getLayoutParams()).LJ) {
                                        n27 = n25 - 0.5f;
                                    }
                                }
                                i = childCount2 - 1;
                                n26 = n27;
                                if ((n18 & (long)(1 << i)) != 0x0L) {
                                    n26 = n27;
                                    if (!((c)this.getChildAt(i).getLayoutParams()).LJ) {
                                        n26 = n27 - 0.5f;
                                    }
                                }
                            }
                            int n28;
                            if (n26 > 0.0f) {
                                n28 = (int)(n17 * n4 / n26);
                            }
                            else {
                                n28 = 0;
                            }
                            int n29 = 0;
                            while (true) {
                                i = n;
                                if (n29 >= childCount2) {
                                    break;
                                }
                                i = n;
                                Label_1186: {
                                    if ((n18 & (long)(1 << n29)) != 0x0L) {
                                        final View child3 = this.getChildAt(n29);
                                        final c c4 = (c)child3.getLayoutParams();
                                        if (child3 instanceof 1fV) {
                                            c4.LIZJ = n28;
                                            c4.LJFF = true;
                                            if (n29 == 0 && !c4.LJ) {
                                                c4.leftMargin = -n28 / 2;
                                            }
                                        }
                                        else if (c4.LIZ) {
                                            c4.LIZJ = n28;
                                            c4.LJFF = true;
                                            c4.rightMargin = -n28 / 2;
                                        }
                                        else {
                                            if (n29 != 0) {
                                                c4.leftMargin = n28 / 2;
                                            }
                                            i = n;
                                            if (n29 != childCount2 - 1) {
                                                c4.rightMargin = n28 / 2;
                                                i = n;
                                            }
                                            break Label_1186;
                                        }
                                        i = 1;
                                    }
                                }
                                ++n29;
                                n = i;
                            }
                        }
                    }
                }
                if (i != 0) {
                    View child4;
                    c c5;
                    for (i = 0; i < childCount2; ++i) {
                        child4 = this.getChildAt(i);
                        c5 = (c)child4.getLayoutParams();
                        if (c5.LJFF) {
                            child4.measure(View$MeasureSpec.makeMeasureSpec(c5.LIZIZ * n4 + c5.LIZJ, 1073741824), childMeasureSpec);
                        }
                    }
                }
                if (mode != 1073741824) {
                    i = n6;
                }
                else {
                    i = size3;
                }
                this.setMeasuredDimension(n3, i);
                return;
            }
        }
        else {
            for (int l = 0; l < childCount; ++l) {
                final c c6 = (c)this.getChildAt(l).getLayoutParams();
                c6.rightMargin = 0;
                c6.leftMargin = 0;
            }
        }
        super.onMeasure(i, n);
    }
    
    public void setExpandedActionViewsExclusive(final boolean ljiijji) {
        this.LIZJ.LJIIJJI = ljiijji;
    }
    
    public void setOnMenuItemClickListener(final e lj) {
        this.LJ = lj;
    }
    
    public void setOverflowIcon(final Drawable drawable) {
        this.getMenu();
        final ActionMenuPresenter lizj = this.LIZJ;
        if (lizj.LJII != null) {
            lizj.LJII.setImageDrawable(drawable);
            return;
        }
        lizj.LJIIIZ = true;
        lizj.LJIIIIZZ = drawable;
    }
    
    public void setOverflowReserved(final boolean liziz) {
        this.LIZIZ = liziz;
    }
    
    public void setPopupTheme(final int ljiiiizz) {
        if (this.LJIIIIZZ != ljiiiizz) {
            if ((this.LJIIIIZZ = ljiiiizz) == 0) {
                this.LJII = this.getContext();
                return;
            }
            this.LJII = (Context)new ContextThemeWrapper(this.getContext(), ljiiiizz);
        }
    }
    
    public void setPresenter(final ActionMenuPresenter lizj) {
        (this.LIZJ = lizj).LIZ(this);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(394);
        }
        
        boolean LIZJ();
        
        boolean LIZLLL();
    }
    
    public interface e
    {
        default static {
            Covode.recordClassIndex(398);
        }
        
        boolean LIZ(final MenuItem p0);
    }
    
    public static final class b implements 02r.a
    {
        static {
            Covode.recordClassIndex(395);
        }
        
        @Override
        public final void LIZ(final 12x 12x, final boolean b) {
        }
        
        @Override
        public final boolean LIZ(final 12x 12x) {
            return false;
        }
    }
    
    public static final class c extends LinearLayoutCompat.a
    {
        @ViewDebug$ExportedProperty
        public boolean LIZ;
        @ViewDebug$ExportedProperty
        public int LIZIZ;
        @ViewDebug$ExportedProperty
        public int LIZJ;
        @ViewDebug$ExportedProperty
        public boolean LIZLLL;
        @ViewDebug$ExportedProperty
        public boolean LJ;
        public boolean LJFF;
        
        static {
            Covode.recordClassIndex(396);
        }
        
        public c() {
            super(-2, -2);
        }
        
        public c(final c c) {
            super((ViewGroup$LayoutParams)c);
            this.LIZ = c.LIZ;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
    
    public final class d implements 12x.a
    {
        static {
            Covode.recordClassIndex(397);
        }
        
        @Override
        public final void LIZ(final 12x 12x) {
            if (13G.this.LIZLLL != null) {
                13G.this.LIZLLL.LIZ(12x);
            }
        }
        
        @Override
        public final boolean LIZ(final 12x 12x, final MenuItem menuItem) {
            return 13G.this.LJ != null && 13G.this.LJ.LIZ(menuItem);
        }
    }
}
