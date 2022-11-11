// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import X.02p;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import android.view.MenuItem;
import X.1fZ;
import android.os.Parcelable;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import X.02R;
import X.1fV;
import X.12x;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import X.130;
import X.13G;
import X.02t;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.util.SparseBooleanArray;
import android.graphics.drawable.Drawable;
import X.07t;
import X.12u;

public class ActionMenuPresenter extends 12u implements 07t.a
{
    public ActionMenuPresenter.d LJII;
    public Drawable LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public ActionMenuPresenter.e LJIIL;
    public ActionMenuPresenter.a LJIILIIL;
    public ActionMenuPresenter.c LJIILJJIL;
    public final ActionMenuPresenter.f LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public int LJJI;
    public final SparseBooleanArray LJJIFFI;
    public ActionMenuPresenter.b LJJII;
    
    static {
        Covode.recordClassIndex(383);
    }
    
    public ActionMenuPresenter(final Context context) {
        super(context);
        this.LJJIFFI = new SparseBooleanArray();
        this.LJIILL = new ActionMenuPresenter.f(this);
    }
    
    @Override
    public final 02t LIZ(final ViewGroup viewGroup) {
        final 02t ljff = super.LJFF;
        final 02t liz = super.LIZ(viewGroup);
        if (ljff != liz) {
            ((13G)liz).setPresenter(this);
        }
        return liz;
    }
    
    @Override
    public final View LIZ(final 130 130, final View view, final ViewGroup viewGroup) {
        View view2 = 130.getActionView();
        if (view2 == null || 130.LJIIIZ()) {
            view2 = super.LIZ(130, view, viewGroup);
        }
        int visibility;
        if (130.isActionViewExpanded()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view2.setVisibility(visibility);
        final 13G 13G = (13G)viewGroup;
        final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
        if (!13G.checkLayoutParams(layoutParams)) {
            view2.setLayoutParams((ViewGroup$LayoutParams)13G.LIZ(layoutParams));
        }
        return view2;
    }
    
    @Override
    public final void LIZ(final 12x 12x, final boolean b) {
        this.LJII();
        super.LIZ(12x, b);
    }
    
    @Override
    public final void LIZ(final 130 130, final 02t.a a) {
        a.LIZ(130);
        final 13G itemInvoker = (13G)super.LJFF;
        final 1fV 1fV = (1fV)a;
        1fV.setItemInvoker(itemInvoker);
        if (this.LJJII == null) {
            this.LJJII = new ActionMenuPresenter.b(this);
        }
        1fV.setPopupCallback((1fV.b)this.LJJII);
    }
    
    public final void LIZ(final 13G ljff) {
        super.LJFF = ljff;
        ljff.LIZ = super.LIZJ;
    }
    
    @Override
    public final void LIZ(final Context context, final 12x 12x) {
        super.LIZ(context, 12x);
        final Resources resources = context.getResources();
        final 02R liz = 02R.LIZ(context);
        if (!this.LJIIZILJ) {
            this.LJIIJ = true;
        }
        if (!this.LJJ) {
            this.LJIJ = liz.LIZ.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.LJIJJLI) {
            this.LJIJJ = liz.LIZ();
        }
        int ljij = this.LJIJ;
        if (this.LJIIJ) {
            if (this.LJII == null) {
                final ActionMenuPresenter.d ljii = new ActionMenuPresenter.d(this, super.LIZ);
                this.LJII = ljii;
                if (this.LJIIIZ) {
                    ((AppCompatImageView)ljii).setImageDrawable(this.LJIIIIZZ);
                    this.LJIIIIZZ = null;
                    this.LJIIIZ = false;
                }
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                this.LJII.measure(measureSpec, measureSpec);
            }
            ljij -= this.LJII.getMeasuredWidth();
        }
        else {
            this.LJII = null;
        }
        this.LJIJI = ljij;
        this.LJJI = (int)(resources.getDisplayMetrics().density * 56.0f);
    }
    
    @Override
    public final void LIZ(final Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            return;
        }
        final SavedState savedState = (SavedState)parcelable;
        if (savedState.LIZ > 0) {
            final MenuItem item = super.LIZJ.findItem(savedState.LIZ);
            if (item != null) {
                this.LIZ((1fZ)item.getSubMenu());
            }
        }
    }
    
    @Override
    public final void LIZ(final boolean b) {
        super.LIZ(b);
        ((View)super.LJFF).requestLayout();
        if (super.LIZJ != null) {
            final 12x lizj = super.LIZJ;
            lizj.LJIIIZ();
            final ArrayList<130> lj = lizj.LJ;
            for (int size = lj.size(), i = 0; i < size; ++i) {
                final 07t ljff = lj.get(i).LJFF;
                if (ljff != null) {
                    ljff.LIZJ = (07t.a)this;
                }
            }
        }
        ArrayList<130> ljiij;
        if (super.LIZJ != null) {
            ljiij = super.LIZJ.LJIIJ();
        }
        else {
            ljiij = null;
        }
        while (true) {
            Label_0246: {
                if (!this.LJIIJ || ljiij == null) {
                    break Label_0246;
                }
                final int size2 = ljiij.size();
                if (size2 == 1) {
                    if (!(((130)ljiij.get(0)).isActionViewExpanded() ^ true)) {
                        break Label_0246;
                    }
                }
                else if (size2 <= 0) {
                    break Label_0246;
                }
                if (this.LJII == null) {
                    this.LJII = new ActionMenuPresenter.d(this, super.LIZ);
                }
                final ViewGroup viewGroup = (ViewGroup)this.LJII.getParent();
                if (viewGroup != super.LJFF) {
                    if (viewGroup != null) {
                        viewGroup.removeView((View)this.LJII);
                    }
                    final 13G 13G = (13G)super.LJFF;
                    final ActionMenuPresenter.d ljii = this.LJII;
                    final 13G.c liz = 13G.LIZ();
                    liz.LIZ = true;
                    13G.addView((View)ljii, (ViewGroup$LayoutParams)liz);
                }
                ((13G)super.LJFF).setOverflowReserved(this.LJIIJ);
                return;
            }
            final ActionMenuPresenter.d ljii2 = this.LJII;
            if (ljii2 != null && ljii2.getParent() == super.LJFF) {
                ((ViewGroup)super.LJFF).removeView((View)this.LJII);
            }
            continue;
        }
    }
    
    @Override
    public final boolean LIZ() {
        ArrayList<130> ljiiiizz;
        int size;
        if (super.LIZJ != null) {
            ljiiiizz = super.LIZJ.LJIIIIZZ();
            size = ljiiiizz.size();
        }
        else {
            ljiiiizz = null;
            size = 0;
        }
        int ljijj = this.LJIJJ;
        int ljiji = this.LJIJI;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)super.LJFF;
        int i = 0;
        boolean b = false;
        int n = 0;
        int n2 = 0;
        while (i < size) {
            final 130 130 = ljiiiizz.get(i);
            if (130.LJII()) {
                ++n;
            }
            else if (130.LJI()) {
                ++n2;
            }
            else {
                b = true;
            }
            int n3 = ljijj;
            if (this.LJIIJJI) {
                n3 = ljijj;
                if (130.isActionViewExpanded()) {
                    n3 = 0;
                }
            }
            ++i;
            ljijj = n3;
        }
        int n4 = ljijj;
        if (this.LJIIJ && (b || n2 + n > (n4 = ljijj))) {
            n4 = ljijj - 1;
        }
        int n5 = n4 - n;
        final SparseBooleanArray ljjiffi = this.LJJIFFI;
        ljjiffi.clear();
        int n6;
        int n7;
        if (this.LJIL) {
            final int ljji = this.LJJI;
            n6 = ljiji / ljji;
            n7 = ljji + ljiji % ljji / n6;
        }
        else {
            n7 = 0;
            n6 = 0;
        }
        int j = 0;
        int n8 = 0;
    Label_0666_Outer:
        while (j < size) {
            final 130 131 = ljiiiizz.get(j);
            int n10 = 0;
            int n11 = 0;
            Label_0373: {
                if (131.LJII()) {
                    final View liz = this.LIZ(131, null, viewGroup);
                    if (this.LJIL) {
                        n6 -= 13G.LIZ(liz, n7, n6, measureSpec, 0);
                    }
                    else {
                        liz.measure(measureSpec, measureSpec);
                    }
                    final int measuredWidth = liz.getMeasuredWidth();
                    ljiji -= measuredWidth;
                    int n9 = n8;
                    if (n8 == 0) {
                        n9 = measuredWidth;
                    }
                    final int groupId = 131.getGroupId();
                    if (groupId != 0) {
                        ljjiffi.put(groupId, true);
                    }
                    131.LIZJ(true);
                    n8 = n9;
                    n10 = n5;
                    n11 = n6;
                }
                else if (131.LJI()) {
                    final int groupId2 = 131.getGroupId();
                    final boolean value = ljjiffi.get(groupId2);
                    boolean b3;
                    boolean b2 = b3 = ((n5 > 0 || value) && ljiji > 0 && (!this.LJIL || n6 > 0));
                    int n12 = n6;
                    int n13 = ljiji;
                    int n14 = n8;
                    while (true) {
                        while (true) {
                            Label_0717: {
                                if (!b2) {
                                    break Label_0717;
                                }
                                final View liz2 = this.LIZ(131, null, viewGroup);
                                if (this.LJIL) {
                                    final int liz3 = 13G.LIZ(liz2, n7, n6, measureSpec, 0);
                                    final int n15 = n6 -= liz3;
                                    if (liz3 == 0) {
                                        b2 = false;
                                        n6 = n15;
                                    }
                                }
                                else {
                                    liz2.measure(measureSpec, measureSpec);
                                }
                                final int measuredWidth2 = liz2.getMeasuredWidth();
                                final int n16 = ljiji - measuredWidth2;
                                int n17;
                                if ((n17 = n8) == 0) {
                                    n17 = measuredWidth2;
                                }
                                final boolean b4 = b3 = (b2 & (this.LJIL ? (n16 >= 0) : (n16 + n17 > 0)));
                                n12 = n6;
                                n13 = n16;
                                n14 = n17;
                                if (!b4) {
                                    break Label_0717;
                                }
                                b3 = b4;
                                n12 = n6;
                                n13 = n16;
                                n14 = n17;
                                if (groupId2 == 0) {
                                    break Label_0717;
                                }
                                ljjiffi.put(groupId2, true);
                                n14 = n17;
                                n13 = n16;
                                n12 = n6;
                                b3 = b4;
                                final int n18 = n5 - 1;
                                final int n19 = n14;
                                ljiji = n13;
                                final int n20 = n12;
                                final boolean b5 = b3;
                                131.LIZJ(b5);
                                n11 = n20;
                                n10 = n18;
                                n8 = n19;
                                break Label_0373;
                            }
                            int n21 = n5;
                            if (value) {
                                ljjiffi.put(groupId2, false);
                                int n22 = 0;
                                while (true) {
                                    n21 = n5;
                                    if (n22 >= j) {
                                        break;
                                    }
                                    final 130 132 = ljiiiizz.get(n22);
                                    int n23 = n5;
                                    if (132.getGroupId() == groupId2) {
                                        n23 = n5;
                                        if (132.LJFF()) {
                                            n23 = n5 + 1;
                                        }
                                        132.LIZJ(false);
                                    }
                                    ++n22;
                                    n5 = n23;
                                }
                            }
                            final boolean b5 = b3;
                            final int n20 = n12;
                            ljiji = n13;
                            final int n18 = n21;
                            final int n19 = n14;
                            if (b3) {
                                n5 = n21;
                                continue Label_0666_Outer;
                            }
                            break;
                        }
                        continue;
                    }
                }
                else {
                    131.LIZJ(false);
                    n11 = n6;
                    n10 = n5;
                }
            }
            ++j;
            n6 = n11;
            n5 = n10;
        }
        return true;
    }
    
    @Override
    public final boolean LIZ(final 130 130) {
        return 130.LJFF();
    }
    
    @Override
    public final boolean LIZ(final 1fZ 1fZ) {
        final boolean hasVisibleItems = 1fZ.hasVisibleItems();
        final boolean b = false;
        if (!hasVisibleItems) {
            return false;
        }
        1fZ 1fZ2;
        for (1fZ2 = 1fZ; 1fZ2.LJIILIIL != super.LIZJ; 1fZ2 = (1fZ)1fZ2.LJIILIIL) {}
        final MenuItem item = 1fZ2.getItem();
        final ViewGroup viewGroup = (ViewGroup)super.LJFF;
        if (viewGroup != null) {
            final int childCount = viewGroup.getChildCount();
            int i = 0;
            while (i < childCount) {
                final View child = viewGroup.getChildAt(i);
                if (child instanceof 02t.a && ((02t.a)child).getItemData() == item) {
                    if (child == null) {
                        break;
                    }
                    this.LJIILLIIL = 1fZ.getItem().getItemId();
                    final int size = 1fZ.size();
                    int n = 0;
                    boolean b2;
                    while (true) {
                        b2 = b;
                        if (n >= size) {
                            break;
                        }
                        final MenuItem item2 = 1fZ.getItem(n);
                        if (item2.isVisible() && item2.getIcon() != null) {
                            b2 = true;
                            break;
                        }
                        ++n;
                    }
                    ((02p)(this.LJIILIIL = new ActionMenuPresenter.a(this, super.LIZIZ, 1fZ, child))).LIZ(b2);
                    if (((02p)this.LJIILIIL).LIZIZ()) {
                        super.LIZ(1fZ);
                        return true;
                    }
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                else {
                    ++i;
                }
            }
        }
        return false;
    }
    
    @Override
    public final boolean LIZ(final ViewGroup viewGroup, final int n) {
        return viewGroup.getChildAt(n) != this.LJII && super.LIZ(viewGroup, n);
    }
    
    @Override
    public final void LIZIZ(final boolean b) {
        if (b) {
            super.LIZ((1fZ)null);
            return;
        }
        if (super.LIZJ != null) {
            super.LIZJ.LIZ(false);
        }
    }
    
    public final void LIZJ() {
        if (!this.LJIJJLI) {
            this.LJIJJ = 02R.LIZ(super.LIZIZ).LIZ();
        }
        if (super.LIZJ != null) {
            super.LIZJ.LIZIZ(true);
        }
    }
    
    public final void LIZLLL() {
        this.LJIIJ = true;
        this.LJIIZILJ = true;
    }
    
    public final boolean LJ() {
        if (this.LJIIJ && !this.LJIIIZ() && super.LIZJ != null && super.LJFF != null && this.LJIILJJIL == null && !super.LIZJ.LJIIJ().isEmpty()) {
            this.LJIILJJIL = new ActionMenuPresenter.c(this, new ActionMenuPresenter.e(this, super.LIZIZ, super.LIZJ, (View)this.LJII));
            ((View)super.LJFF).post((Runnable)this.LJIILJJIL);
            super.LIZ((1fZ)null);
            return true;
        }
        return false;
    }
    
    @Override
    public final Parcelable LJFF() {
        final SavedState savedState = new SavedState();
        savedState.LIZ = this.LJIILLIIL;
        return (Parcelable)savedState;
    }
    
    public final boolean LJI() {
        if (this.LJIILJJIL != null && super.LJFF != null) {
            ((View)super.LJFF).removeCallbacks((Runnable)this.LJIILJJIL);
            this.LJIILJJIL = null;
            return true;
        }
        final ActionMenuPresenter.e ljiil = this.LJIIL;
        if (ljiil != null) {
            ((02p)ljiil).LIZJ();
            return true;
        }
        return false;
    }
    
    public final boolean LJII() {
        return this.LJI() | this.LJIIIIZZ();
    }
    
    public final boolean LJIIIIZZ() {
        final ActionMenuPresenter.a ljiiliil = this.LJIILIIL;
        if (ljiiliil != null) {
            ((02p)ljiiliil).LIZJ();
            return true;
        }
        return false;
    }
    
    public final boolean LJIIIZ() {
        final ActionMenuPresenter.e ljiil = this.LJIIL;
        return ljiil != null && ((02p)ljiil).LJ();
    }
    
    public static class SavedState implements Parcelable
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public int LIZ;
        
        static {
            Covode.recordClassIndex(384);
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {
                static {
                    Covode.recordClassIndex(385);
                }
            };
        }
        
        public SavedState() {
        }
        
        public SavedState(final Parcel parcel) {
            this.LIZ = parcel.readInt();
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.LIZ);
        }
    }
}
