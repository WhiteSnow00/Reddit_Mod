// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.ComponentName;
import android.widget.AdapterView;
import android.content.Intent;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.content.pm.PackageManager;
import android.widget.TextView;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.View$MeasureSpec;
import android.widget.ListAdapter;
import android.view.ViewTreeObserver;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.covode.number.Covode;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.ImageView;
import android.view.View;
import android.widget.PopupWindow$OnDismissListener;
import android.database.DataSetObserver;
import android.widget.FrameLayout;
import android.view.ViewGroup;

public final class 036 extends ViewGroup
{
    public final a LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public 07t LIZLLL;
    public final DataSetObserver LJ;
    public PopupWindow$OnDismissListener LJFF;
    public boolean LJI;
    public int LJII;
    public final b LJIIIIZZ;
    public final View LJIIIZ;
    public final ImageView LJIIJ;
    public final int LJIIJJI;
    public final ViewTreeObserver$OnGlobalLayoutListener LJIIL;
    public 13R LJIILIIL;
    public boolean LJIILJJIL;
    
    static {
        Covode.recordClassIndex(399);
    }
    
    private boolean LIZIZ() {
        return this.getListPopupWindow().LJIJJLI.isShowing();
    }
    
    public final void LIZ(final int n) {
        if (this.LIZ.LIZ != null) {
            this.getViewTreeObserver().addOnGlobalLayoutListener(this.LJIIL);
            int n2;
            if (this.LIZJ.getVisibility() == 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            final int liz = this.LIZ.LIZ.LIZ();
            if (n != Integer.MAX_VALUE && liz > n + n2) {
                this.LIZ.LIZ(true);
                this.LIZ.LIZ(n - 1);
            }
            else {
                this.LIZ.LIZ(false);
                this.LIZ.LIZ(n);
            }
            final 13R listPopupWindow = this.getListPopupWindow();
            if (!listPopupWindow.LJIJJLI.isShowing()) {
                if (this.LJI || n2 == 0) {
                    this.LIZ.LIZ(true, (boolean)(n2 != 0));
                }
                else {
                    this.LIZ.LIZ(false, false);
                }
                listPopupWindow.LIZLLL(Math.min(this.LIZ.LIZ(), this.LJIIJJI));
                listPopupWindow.a_();
                final 07t lizlll = this.LIZLLL;
                if (lizlll != null) {
                    lizlll.LIZ(true);
                }
                listPopupWindow.LJ.setContentDescription((CharSequence)this.getContext().getString(2131821189));
                listPopupWindow.LJ.setSelector((Drawable)new ColorDrawable(0));
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }
    
    public final boolean LIZ() {
        if (this.getListPopupWindow().LJIJJLI.isShowing()) {
            this.getListPopupWindow().LIZLLL();
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.LJIIL);
            }
        }
        return true;
    }
    
    public final 04H getDataModel() {
        return this.LIZ.LIZ;
    }
    
    public final 13R getListPopupWindow() {
        if (this.LJIILIIL == null) {
            (this.LJIILIIL = new 13R(this.getContext())).LIZ((ListAdapter)this.LIZ);
            this.LJIILIIL.LJIILJJIL = (View)this;
            this.LJIILIIL.LJIIIIZZ();
            this.LJIILIIL.LJIILLIIL = (AdapterView$OnItemClickListener)this.LJIIIIZZ;
            this.LJIILIIL.LIZ((PopupWindow$OnDismissListener)this.LJIIIIZZ);
        }
        return this.LJIILIIL;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final 04H liz = this.LIZ.LIZ;
        if (liz != null) {
            liz.registerObserver((Object)this.LJ);
        }
        this.LJIILJJIL = true;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final 04H liz = this.LIZ.LIZ;
        if (liz != null) {
            liz.unregisterObserver((Object)this.LJ);
        }
        final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.LJIIL);
        }
        if (this.LIZIZ()) {
            this.LIZ();
        }
        this.LJIILJJIL = false;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.LJIIIZ.layout(0, 0, n3 - n, n4 - n2);
        if (!this.LIZIZ()) {
            this.LIZ();
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        final View ljiiiz = this.LJIIIZ;
        int measureSpec = n2;
        if (this.LIZJ.getVisibility() != 0) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2), 1073741824);
        }
        this.measureChild(ljiiiz, n, measureSpec);
        this.setMeasuredDimension(ljiiiz.getMeasuredWidth(), ljiiiz.getMeasuredHeight());
    }
    
    public final void setActivityChooserModel(final 04H liz) {
        final a liz2 = this.LIZ;
        final 04H liz3 = liz2.LIZJ.LIZ.LIZ;
        if (liz3 != null && liz2.LIZJ.isShown()) {
            liz3.unregisterObserver((Object)liz2.LIZJ.LJ);
        }
        if ((liz2.LIZ = liz) != null && liz2.LIZJ.isShown()) {
            liz.registerObserver((Object)liz2.LIZJ.LJ);
        }
        liz2.notifyDataSetChanged();
        if (this.getListPopupWindow().LJIJJLI.isShowing()) {
            this.LIZ();
            if (!this.getListPopupWindow().LJIJJLI.isShowing() && this.LJIILJJIL) {
                this.LJI = false;
                this.LIZ(this.LJII);
            }
        }
    }
    
    public final void setDefaultActionButtonContentDescription(final int n) {
    }
    
    public final void setExpandActivityOverflowButtonContentDescription(final int n) {
        this.LJIIJ.setContentDescription((CharSequence)this.getContext().getString(n));
    }
    
    public final void setExpandActivityOverflowButtonDrawable(final Drawable imageDrawable) {
        this.LJIIJ.setImageDrawable(imageDrawable);
    }
    
    public final void setInitialActivityCount(final int ljii) {
        this.LJII = ljii;
    }
    
    public final void setOnDismissListener(final PopupWindow$OnDismissListener ljff) {
        this.LJFF = ljff;
    }
    
    public final void setProvider(final 07t lizlll) {
        this.LIZLLL = lizlll;
    }
    
    public static class InnerLayout extends LinearLayout
    {
        public static final int[] LIZ;
        
        static {
            Covode.recordClassIndex(400);
            LIZ = new int[] { 16842964 };
        }
        
        public InnerLayout(final Context context, final AttributeSet set) {
            super(context, set);
            final 043 liz = 043.LIZ(context, set, InnerLayout.LIZ);
            this.setBackgroundDrawable(liz.LIZ(0));
            liz.LIZ.recycle();
        }
    }
    
    public final class a extends BaseAdapter
    {
        public 04H LIZ;
        public boolean LIZIZ;
        public final /* synthetic */ 036 LIZJ;
        public int LIZLLL;
        public boolean LJ;
        public boolean LJFF;
        
        static {
            Covode.recordClassIndex(401);
        }
        
        public final int LIZ() {
            final int lizlll = this.LIZLLL;
            this.LIZLLL = Integer.MAX_VALUE;
            int i = 0;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
            final int count = this.getCount();
            View view = null;
            int max = 0;
            while (i < count) {
                view = this.getView(i, view, null);
                view.measure(measureSpec, measureSpec2);
                max = Math.max(max, view.getMeasuredWidth());
                ++i;
            }
            this.LIZLLL = lizlll;
            return max;
        }
        
        public final void LIZ(final int lizlll) {
            if (this.LIZLLL != lizlll) {
                this.LIZLLL = lizlll;
                this.notifyDataSetChanged();
            }
        }
        
        public final void LIZ(final boolean ljff) {
            if (this.LJFF != ljff) {
                this.LJFF = ljff;
                this.notifyDataSetChanged();
            }
        }
        
        public final void LIZ(final boolean liziz, final boolean lj) {
            if (this.LIZIZ != liziz || this.LJ != lj) {
                this.LIZIZ = liziz;
                this.LJ = lj;
                this.notifyDataSetChanged();
            }
        }
        
        public final int getCount() {
            int liz;
            final int n = liz = this.LIZ.LIZ();
            if (!this.LIZIZ) {
                liz = n;
                if (this.LIZ.LIZIZ() != null) {
                    liz = n - 1;
                }
            }
            int min = Math.min(liz, this.LIZLLL);
            if (this.LJFF) {
                ++min;
            }
            return min;
        }
        
        public final Object getItem(final int n) {
            final int itemViewType = this.getItemViewType(n);
            if (itemViewType == 0) {
                int n2 = n;
                if (!this.LIZIZ) {
                    n2 = n;
                    if (this.LIZ.LIZIZ() != null) {
                        n2 = n + 1;
                    }
                }
                return this.LIZ.LIZ(n2);
            }
            if (itemViewType == 1) {
                return null;
            }
            throw new IllegalArgumentException();
        }
        
        public final long getItemId(final int n) {
            return n;
        }
        
        public final int getItemViewType(final int n) {
            if (this.LJFF && n == this.getCount() - 1) {
                return 1;
            }
            return 0;
        }
        
        public final View getView(final int n, final View view, final ViewGroup viewGroup) {
            final int itemViewType = this.getItemViewType(n);
            if (itemViewType == 0) {
                View liz = null;
                Label_0129: {
                    if (view != null) {
                        liz = view;
                        if (view.getId() == 2131367658) {
                            break Label_0129;
                        }
                    }
                    liz = 0II.LIZ(LayoutInflater.from(this.LIZJ.getContext()), 2131558446, viewGroup, false);
                }
                final PackageManager packageManager = this.LIZJ.getContext().getPackageManager();
                final ImageView imageView = (ImageView)liz.findViewById(2131366108);
                final ResolveInfo resolveInfo = (ResolveInfo)this.getItem(n);
                imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView)liz.findViewById(2131372326)).setText(resolveInfo.loadLabel(packageManager));
                if (this.LIZIZ && n == 0 && this.LJ) {
                    liz.setActivated(true);
                }
                else {
                    liz.setActivated(false);
                }
                return liz;
            }
            if (itemViewType == 1) {
                if (view != null) {
                    final View liz2 = view;
                    if (view.getId() == 1) {
                        return liz2;
                    }
                }
                final View liz2 = 0II.LIZ(LayoutInflater.from(this.LIZJ.getContext()), 2131558446, viewGroup, false);
                liz2.setId(1);
                ((TextView)liz2.findViewById(2131372326)).setText((CharSequence)this.LIZJ.getContext().getString(2131821188));
                return liz2;
            }
            throw new IllegalArgumentException();
        }
        
        public final int getViewTypeCount() {
            return 3;
        }
    }
    
    public final class b implements View$OnClickListener, View$OnLongClickListener, AdapterView$OnItemClickListener, PopupWindow$OnDismissListener
    {
        public final /* synthetic */ 036 LIZ;
        
        static {
            Covode.recordClassIndex(402);
        }
        
        public static void LIZ(final Context context, final Intent intent) {
            0Qu.LIZ(intent, context);
            context.startActivity(intent);
        }
        
        public static void LIZIZ(final Context context, final Intent intent) {
            Q0z.LIZ(intent, (Object)context);
            LIZ(context, intent);
        }
        
        public final void onClick(final View view) {
            if (view == this.LIZ.LIZJ) {
                this.LIZ.LIZ();
                final Intent liziz = this.LIZ.LIZ.LIZ.LIZIZ(this.LIZ.LIZ.LIZ.LIZ(this.LIZ.LIZ.LIZ.LIZIZ()));
                if (liziz != null) {
                    liziz.addFlags(524288);
                    LIZIZ(this.LIZ.getContext(), liziz);
                }
                return;
            }
            if (view == this.LIZ.LIZIZ) {
                this.LIZ.LJI = false;
                final 036 liz = this.LIZ;
                liz.LIZ(liz.LJII);
                return;
            }
            throw new IllegalArgumentException();
        }
        
        public final void onDismiss() {
            if (this.LIZ.LJFF != null) {
                this.LIZ.LJFF.onDismiss();
            }
            if (this.LIZ.LIZLLL != null) {
                this.LIZ.LIZLLL.LIZ(false);
            }
        }
        
        public final void onItemClick(final AdapterView<?> adapterView, final View view, int n, final long n2) {
            final int itemViewType = ((a)adapterView.getAdapter()).getItemViewType(n);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    this.LIZ.LIZ(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            else {
                this.LIZ.LIZ();
                if (this.LIZ.LJI) {
                    if (n > 0) {
                        final 04H liz = this.LIZ.LIZ.LIZ;
                        synchronized (liz.LIZ) {
                            liz.LIZJ();
                            final 04H.a a = liz.LIZIZ.get(n);
                            final 04H.a a2 = liz.LIZIZ.get(0);
                            float n3;
                            if (a2 != null) {
                                n3 = a2.LIZIZ - a.LIZIZ + 5.0f;
                            }
                            else {
                                n3 = 1.0f;
                            }
                            liz.LIZ(new 04H.c(new ComponentName(a.LIZ.activityInfo.packageName, a.LIZ.activityInfo.name), System.currentTimeMillis(), n3));
                            monitorexit(liz.LIZ);
                        }
                    }
                    return;
                }
                if (!this.LIZ.LIZ.LIZIZ) {
                    ++n;
                }
                final Intent liziz = this.LIZ.LIZ.LIZ.LIZIZ(n);
                if (liziz != null) {
                    liziz.addFlags(524288);
                    LIZIZ(this.LIZ.getContext(), liziz);
                }
            }
        }
        
        public final boolean onLongClick(final View view) {
            if (view == this.LIZ.LIZJ) {
                if (this.LIZ.LIZ.getCount() > 0) {
                    this.LIZ.LJI = true;
                    final 036 liz = this.LIZ;
                    liz.LIZ(liz.LJII);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }
}
