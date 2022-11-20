// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.LinearLayout$LayoutParams;
import l.f;
import androidx.appcompat.view.menu.h;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import l.d;
import android.view.ViewParent;
import a4.b;
import android.view.MenuItem;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.j;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.util.ArrayList;
import android.view.View$MeasureSpec;
import android.os.Parcelable;
import androidx.appcompat.view.menu.i$a;
import androidx.appcompat.view.menu.MenuBuilder;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.view.menu.ActionMenuItemView$b;
import androidx.appcompat.view.menu.MenuBuilder$b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j$a;
import android.view.ViewGroup;
import android.view.View;
import androidx.appcompat.view.menu.g;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.a;

public final class c extends a
{
    public c A;
    public c$b B;
    public final c$f C;
    public int D;
    public c$d o;
    public Drawable p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public final SparseBooleanArray x;
    public c$e y;
    public c$a z;
    
    public c(final Context context) {
        super(context);
        this.x = new SparseBooleanArray();
        this.C = new c$f(this);
    }
    
    public final View a(final androidx.appcompat.view.menu.g g, final View view, final ViewGroup viewGroup) {
        View actionView = g.getActionView();
        int visibility = 0;
        if (actionView == null || g.e()) {
            j$a j$a;
            if (view instanceof j$a) {
                j$a = (j$a)view;
            }
            else {
                j$a = (j$a)super.i.inflate(super.l, viewGroup, false);
            }
            j$a.b(g);
            final ActionMenuView itemInvoker = (ActionMenuView)super.m;
            final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)j$a;
            actionMenuItemView.setItemInvoker((MenuBuilder$b)itemInvoker);
            if (this.B == null) {
                this.B = new c$b(this);
            }
            actionMenuItemView.setPopupCallback((ActionMenuItemView$b)this.B);
            actionView = (View)j$a;
        }
        if (g.C) {
            visibility = 8;
        }
        actionView.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams((ViewGroup$LayoutParams)ActionMenuView.d(layoutParams));
        }
        return actionView;
    }
    
    public final void b(final MenuBuilder menuBuilder, final boolean b) {
        this.h();
        final c$a z = this.z;
        if (z != null && ((h)z).b()) {
            ((f)((h)z).j).dismiss();
        }
        final i$a j = super.j;
        if (j != null) {
            j.b(menuBuilder, b);
        }
    }
    
    public final Parcelable c() {
        final g g = new g();
        g.f = this.D;
        return (Parcelable)g;
    }
    
    public final boolean e() {
        final MenuBuilder h = super.h;
        ArrayList visibleItems;
        int size;
        if (h != null) {
            visibleItems = h.getVisibleItems();
            size = visibleItems.size();
        }
        else {
            size = 0;
            visibleItems = null;
        }
        final int v = this.v;
        final int u = this.u;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)super.m;
        int i = 0;
        int n = 0;
        int n3;
        int n2 = n3 = n;
        int n4 = v;
        while (i < size) {
            final androidx.appcompat.view.menu.g g = visibleItems.get(i);
            final int y = g.y;
            if ((y & 0x2) == 0x2) {
                ++n3;
            }
            else if ((y & 0x1) == 0x1) {
                ++n2;
            }
            else {
                n = 1;
            }
            int n5 = n4;
            if (this.w) {
                n5 = n4;
                if (g.C) {
                    n5 = 0;
                }
            }
            ++i;
            n4 = n5;
        }
        int n6 = n4;
        if (this.r && (n != 0 || n2 + n3 > (n6 = n4))) {
            n6 = n4 - 1;
        }
        int n7 = n6 - n3;
        final SparseBooleanArray x = this.x;
        x.clear();
        int j = 0;
        int n8 = 0;
        int n9 = u;
        while (j < size) {
            final androidx.appcompat.view.menu.g g2 = visibleItems.get(j);
            final int y2 = g2.y;
            int n10 = 0;
            Label_0650: {
                int n11;
                if ((y2 & 0x2) == 0x2) {
                    final View a = this.a(g2, null, viewGroup);
                    a.measure(measureSpec, measureSpec);
                    final int measuredWidth = a.getMeasuredWidth();
                    n10 = n9 - measuredWidth;
                    if ((n11 = n8) == 0) {
                        n11 = measuredWidth;
                    }
                    final int b = g2.b;
                    if (b != 0) {
                        x.put(b, true);
                    }
                    g2.f(true);
                }
                else {
                    if ((y2 & 0x1) != 0x1) {
                        g2.f(false);
                        n10 = n9;
                        break Label_0650;
                    }
                    final int b2 = g2.b;
                    final boolean value = x.get(b2);
                    final boolean b3 = (n7 > 0 || value) && n9 > 0;
                    n10 = n9;
                    n11 = n8;
                    boolean b4 = b3;
                    if (b3) {
                        final View a2 = this.a(g2, null, viewGroup);
                        a2.measure(measureSpec, measureSpec);
                        final int measuredWidth2 = a2.getMeasuredWidth();
                        n10 = n9 - measuredWidth2;
                        if ((n11 = n8) == 0) {
                            n11 = measuredWidth2;
                        }
                        b4 = (b3 & n10 + n11 > 0);
                    }
                    int n12;
                    if (b4 && b2 != 0) {
                        x.put(b2, true);
                        n12 = n7;
                    }
                    else {
                        n12 = n7;
                        if (value) {
                            x.put(b2, false);
                            int n13 = 0;
                            while (true) {
                                n12 = n7;
                                if (n13 >= j) {
                                    break;
                                }
                                final androidx.appcompat.view.menu.g g3 = visibleItems.get(n13);
                                int n14 = n7;
                                if (g3.b == b2) {
                                    final boolean b5 = (g3.x & 0x20) == 0x20;
                                    n14 = n7;
                                    if (b5) {
                                        n14 = n7 + 1;
                                    }
                                    g3.f(false);
                                }
                                ++n13;
                                n7 = n14;
                            }
                        }
                    }
                    n7 = n12;
                    if (b4) {
                        n7 = n12 - 1;
                    }
                    g2.f(b4);
                }
                n8 = n11;
            }
            ++j;
            n9 = n10;
        }
        return true;
    }
    
    public final void f(final Context g, final MenuBuilder h) {
        LayoutInflater.from(super.g = g);
        super.h = h;
        final Resources resources = g.getResources();
        final k.a a = new k.a(g);
        if (!this.s) {
            this.r = true;
        }
        this.t = g.getResources().getDisplayMetrics().widthPixels / 2;
        this.v = a.a();
        int t = this.t;
        if (this.r) {
            if (this.o == null) {
                final c$d o = new c$d(this, super.f);
                this.o = o;
                if (this.q) {
                    ((AppCompatImageView)o).setImageDrawable(this.p);
                    this.p = null;
                    this.q = false;
                }
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                ((View)this.o).measure(measureSpec, measureSpec);
            }
            t -= ((View)this.o).getMeasuredWidth();
        }
        else {
            this.o = null;
        }
        this.u = t;
        final float density = resources.getDisplayMetrics().density;
    }
    
    public final boolean h() {
        final c a = this.A;
        if (a != null) {
            final j m = super.m;
            if (m != null) {
                ((View)m).removeCallbacks((Runnable)a);
                this.A = null;
                return true;
            }
        }
        final c$e y = this.y;
        if (y != null) {
            if (((h)y).b()) {
                ((f)((h)y).j).dismiss();
            }
            return true;
        }
        return false;
    }
    
    public final void j(final Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            return;
        }
        final int f = ((g)parcelable).f;
        if (f > 0) {
            final MenuItem item = super.h.findItem(f);
            if (item != null) {
                this.l((l)item.getSubMenu());
            }
        }
    }
    
    public final void k() {
        final ViewGroup viewGroup = (ViewGroup)super.m;
        final boolean b = false;
        final ArrayList list = null;
        if (viewGroup != null) {
            final MenuBuilder h = super.h;
            int i;
            if (h != null) {
                h.flagActionItems();
                final ArrayList visibleItems = super.h.getVisibleItems();
                final int size = visibleItems.size();
                int n = 0;
                int n2 = 0;
                while (true) {
                    i = n2;
                    if (n >= size) {
                        break;
                    }
                    final androidx.appcompat.view.menu.g g = visibleItems.get(n);
                    final boolean b2 = (g.x & 0x20) == 0x20;
                    int n3 = n2;
                    if (b2) {
                        final View child = viewGroup.getChildAt(n2);
                        androidx.appcompat.view.menu.g itemData;
                        if (child instanceof j$a) {
                            itemData = ((j$a)child).getItemData();
                        }
                        else {
                            itemData = null;
                        }
                        final View a = this.a(g, child, viewGroup);
                        if (g != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != child) {
                            final ViewGroup viewGroup2 = (ViewGroup)a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup)super.m).addView(a, n2);
                        }
                        n3 = n2 + 1;
                    }
                    ++n;
                    n2 = n3;
                }
            }
            else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                boolean b3;
                if (viewGroup.getChildAt(i) == this.o) {
                    b3 = false;
                }
                else {
                    viewGroup.removeViewAt(i);
                    b3 = true;
                }
                if (!b3) {
                    ++i;
                }
            }
        }
        ((View)super.m).requestLayout();
        final MenuBuilder h2 = super.h;
        if (h2 != null) {
            final ArrayList actionItems = h2.getActionItems();
            for (int size2 = actionItems.size(), j = 0; j < size2; ++j) {
                final b a2 = actionItems.get(j).A;
            }
        }
        final MenuBuilder h3 = super.h;
        ArrayList nonActionItems = list;
        if (h3 != null) {
            nonActionItems = h3.getNonActionItems();
        }
        int n4 = b ? 1 : 0;
        if (this.r) {
            n4 = (b ? 1 : 0);
            if (nonActionItems != null) {
                final int size3 = nonActionItems.size();
                if (size3 == 1) {
                    n4 = ((((androidx.appcompat.view.menu.g)nonActionItems.get(0)).C ^ true) ? 1 : 0);
                }
                else {
                    n4 = (b ? 1 : 0);
                    if (size3 > 0) {
                        n4 = 1;
                    }
                }
            }
        }
        if (n4 != 0) {
            if (this.o == null) {
                this.o = new c$d(this, super.f);
            }
            final ViewGroup viewGroup3 = (ViewGroup)((View)this.o).getParent();
            if (viewGroup3 != super.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView((View)this.o);
                }
                final ActionMenuView actionMenuView = (ActionMenuView)super.m;
                final c$d o = this.o;
                actionMenuView.getClass();
                final ActionMenuView$c actionMenuView$c = new ActionMenuView$c();
                ((LinearLayout$LayoutParams)actionMenuView$c).gravity = 16;
                actionMenuView$c.a = true;
                ((ViewGroup)actionMenuView).addView((View)o, (ViewGroup$LayoutParams)actionMenuView$c);
            }
        }
        else {
            final c$d o2 = this.o;
            if (o2 != null) {
                final ViewParent parent = ((View)o2).getParent();
                final j m = super.m;
                if (parent == m) {
                    ((ViewGroup)m).removeView((View)this.o);
                }
            }
        }
        ((ActionMenuView)super.m).setOverflowReserved(this.r);
    }
    
    public final boolean l(final l l) {
        final boolean hasVisibleItems = l.hasVisibleItems();
        final int n = 0;
        if (!hasVisibleItems) {
            return false;
        }
        l i = l;
        while (true) {
            final MenuBuilder a = i.a;
            if (a == super.h) {
                break;
            }
            i = (l)a;
        }
        final androidx.appcompat.view.menu.g b = i.b;
        final ViewGroup viewGroup = (ViewGroup)super.m;
        final View view = null;
        View child;
        if (viewGroup == null) {
            child = view;
        }
        else {
            final int childCount = viewGroup.getChildCount();
            int n2 = 0;
            while (true) {
                child = view;
                if (n2 >= childCount) {
                    break;
                }
                child = viewGroup.getChildAt(n2);
                if (child instanceof j$a && ((j$a)child).getItemData() == b) {
                    break;
                }
                ++n2;
            }
        }
        if (child == null) {
            return false;
        }
        this.D = l.b.a;
        final int size = l.size();
        int j = 0;
        while (true) {
            while (j < size) {
                final MenuItem item = l.getItem(j);
                if (item.isVisible() && item.getIcon() != null) {
                    final boolean h = true;
                    final c$a z = new c$a(this, super.g, l, child);
                    this.z = z;
                    ((h)z).h = h;
                    final d k = ((h)z).j;
                    if (k != null) {
                        k.p(h);
                    }
                    final c$a z2 = this.z;
                    int n3 = 0;
                    Label_0298: {
                        if (!((h)z2).b()) {
                            if (((h)z2).f == null) {
                                n3 = n;
                                break Label_0298;
                            }
                            ((h)z2).d(0, 0, false, false);
                        }
                        n3 = 1;
                    }
                    if (n3 != 0) {
                        final i$a m = super.j;
                        if (m != null) {
                            m.c((MenuBuilder)l);
                        }
                        return true;
                    }
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                else {
                    ++j;
                }
            }
            final boolean h = false;
            continue;
        }
    }
    
    public final boolean m() {
        final c$e y = this.y;
        return y != null && ((h)y).b();
    }
    
    public final boolean n() {
        if (this.r && !this.m()) {
            final MenuBuilder h = super.h;
            if (h != null && super.m != null && this.A == null && !h.getNonActionItems().isEmpty()) {
                final c a = new c(new c$e(this, super.g, super.h, this.o));
                this.A = a;
                ((View)super.m).post((Runnable)a);
                return true;
            }
        }
        return false;
    }
    
    public final class c implements Runnable
    {
        public c$e f;
        public final androidx.appcompat.widget.c g;
        
        public c(final androidx.appcompat.widget.c g, final c$e f) {
            this.g = g;
            this.f = f;
        }
        
        @Override
        public final void run() {
            final MenuBuilder h = this.g.h;
            if (h != null) {
                h.changeMenuMode();
            }
            final View view = (View)this.g.m;
            if (view != null && view.getWindowToken() != null) {
                final c$e f = this.f;
                final boolean b = ((h)f).b();
                boolean b2 = true;
                if (!b) {
                    if (((h)f).f == null) {
                        b2 = false;
                    }
                    else {
                        ((h)f).d(0, 0, false, false);
                    }
                }
                if (b2) {
                    this.g.y = this.f;
                }
            }
            this.g.A = null;
        }
    }
    
    public static final class g implements Parcelable
    {
        public static final Parcelable$Creator<g> CREATOR;
        public int f;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<g>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new g(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new g[n];
                }
            };
        }
        
        public g() {
        }
        
        public g(final Parcel parcel) {
            this.f = parcel.readInt();
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.f);
        }
    }
}
