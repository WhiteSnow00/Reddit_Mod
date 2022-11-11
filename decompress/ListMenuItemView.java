// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.CompoundButton;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import android.view.View;
import a4.p0;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Rect;
import android.content.res.TypedArray;
import androidx.appcompat.widget.z0;
import gn.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.widget.AbsListView$SelectionBoundsAdjuster;
import android.widget.LinearLayout;

public class ListMenuItemView extends LinearLayout implements j$a, AbsListView$SelectionBoundsAdjuster
{
    public g f;
    public ImageView g;
    public RadioButton h;
    public TextView i;
    public CheckBox j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public LinearLayout n;
    public Drawable o;
    public int p;
    public Context q;
    public boolean r;
    public Drawable s;
    public boolean t;
    public LayoutInflater u;
    public boolean v;
    
    public ListMenuItemView(final Context q, final AttributeSet set) {
        super(q, set);
        final z0 m = z0.m(((View)this).getContext(), set, a.h0, 2130969347);
        this.o = m.e(5);
        this.p = m.i(1, -1);
        this.r = m.a(7, false);
        this.q = q;
        this.s = m.e(8);
        final TypedArray obtainStyledAttributes = q.getTheme().obtainStyledAttributes((AttributeSet)null, new int[] { 16843049 }, 2130968933, 0);
        this.t = obtainStyledAttributes.hasValue(0);
        m.n();
        obtainStyledAttributes.recycle();
    }
    
    private LayoutInflater getInflater() {
        if (this.u == null) {
            this.u = LayoutInflater.from(((View)this).getContext());
        }
        return this.u;
    }
    
    private void setSubMenuArrowVisible(final boolean b) {
        final ImageView l = this.l;
        if (l != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            l.setVisibility(visibility);
        }
    }
    
    public final void adjustListItemSelectionBounds(final Rect rect) {
        final ImageView m = this.m;
        if (m != null && ((View)m).getVisibility() == 0) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.m).getLayoutParams();
            rect.top += ((View)this.m).getHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
        }
    }
    
    public final void b(final g f) {
        this.f = f;
        final boolean visible = f.isVisible();
        final int n = 0;
        int visibility;
        if (visible) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)this).setVisibility(visibility);
        this.setTitle(f.e);
        this.setCheckable(f.isCheckable());
        boolean b = false;
        Label_0097: {
            if (f.n.isShortcutsVisible()) {
                char c;
                if (f.n.isQwertyMode()) {
                    c = f.j;
                }
                else {
                    c = f.h;
                }
                if (c != '\0') {
                    b = true;
                    break Label_0097;
                }
            }
            b = false;
        }
        f.n.isQwertyMode();
        int visibility2 = 0;
        Label_0184: {
            if (b) {
                final g f2 = this.f;
                boolean b2 = false;
                Label_0169: {
                    if (f2.n.isShortcutsVisible()) {
                        char c2;
                        if (f2.n.isQwertyMode()) {
                            c2 = f2.j;
                        }
                        else {
                            c2 = f2.h;
                        }
                        if (c2 != '\0') {
                            b2 = true;
                            break Label_0169;
                        }
                    }
                    b2 = false;
                }
                if (b2) {
                    visibility2 = n;
                    break Label_0184;
                }
            }
            visibility2 = 8;
        }
        if (visibility2 == 0) {
            final TextView k = this.k;
            final g f3 = this.f;
            char c3;
            if (f3.n.isQwertyMode()) {
                c3 = f3.j;
            }
            else {
                c3 = f3.h;
            }
            String string;
            if (c3 == '\0') {
                string = "";
            }
            else {
                final Resources resources = f3.n.getContext().getResources();
                final StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(f3.n.getContext()).hasPermanentMenuKey()) {
                    sb.append(resources.getString(2131951646));
                }
                int n2;
                if (f3.n.isQwertyMode()) {
                    n2 = f3.k;
                }
                else {
                    n2 = f3.i;
                }
                androidx.appcompat.view.menu.g.c(sb, n2, 65536, resources.getString(2131951642));
                androidx.appcompat.view.menu.g.c(sb, n2, 4096, resources.getString(2131951638));
                androidx.appcompat.view.menu.g.c(sb, n2, 2, resources.getString(2131951637));
                androidx.appcompat.view.menu.g.c(sb, n2, 1, resources.getString(2131951643));
                androidx.appcompat.view.menu.g.c(sb, n2, 4, resources.getString(2131951645));
                androidx.appcompat.view.menu.g.c(sb, n2, 8, resources.getString(2131951641));
                if (c3 != '\b') {
                    if (c3 != '\n') {
                        if (c3 != ' ') {
                            sb.append(c3);
                        }
                        else {
                            sb.append(resources.getString(2131951644));
                        }
                    }
                    else {
                        sb.append(resources.getString(2131951640));
                    }
                }
                else {
                    sb.append(resources.getString(2131951639));
                }
                string = sb.toString();
            }
            k.setText((CharSequence)string);
        }
        if (((View)this.k).getVisibility() != visibility2) {
            ((View)this.k).setVisibility(visibility2);
        }
        this.setIcon(f.getIcon());
        ((View)this).setEnabled(f.isEnabled());
        this.setSubMenuArrowVisible(f.hasSubMenu());
        ((View)this).setContentDescription(f.q);
    }
    
    public g getItemData() {
        return this.f;
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final Drawable o = this.o;
        final WeakHashMap a = p0.a;
        p0.d.q((View)this, o);
        final TextView i = (TextView)((View)this).findViewById(2131431743);
        this.i = i;
        final int p = this.p;
        if (p != -1) {
            i.setTextAppearance(this.q, p);
        }
        this.k = (TextView)((View)this).findViewById(2131431269);
        final ImageView l = (ImageView)((View)this).findViewById(2131431520);
        if ((this.l = l) != null) {
            l.setImageDrawable(this.s);
        }
        this.m = (ImageView)((View)this).findViewById(2131429265);
        this.n = (LinearLayout)((View)this).findViewById(2131428462);
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.g != null && this.r) {
            final ViewGroup$LayoutParams layoutParams = ((View)this).getLayoutParams();
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.g).getLayoutParams();
            final int height = layoutParams.height;
            if (height > 0 && linearLayout$LayoutParams.width <= 0) {
                linearLayout$LayoutParams.width = height;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public void setCheckable(final boolean b) {
        if (!b && this.h == null && this.j == null) {
            return;
        }
        Object o;
        Object o2;
        if ((this.f.x & 0x4) != 0x0) {
            if (this.h == null) {
                final RadioButton h = (RadioButton)this.getInflater().inflate(2131624003, (ViewGroup)this, false);
                this.h = h;
                final LinearLayout n = this.n;
                if (n != null) {
                    ((ViewGroup)n).addView((View)h, -1);
                }
                else {
                    ((ViewGroup)this).addView((View)h, -1);
                }
            }
            o = this.h;
            o2 = this.j;
        }
        else {
            if (this.j == null) {
                final CheckBox j = (CheckBox)this.getInflater().inflate(2131624000, (ViewGroup)this, false);
                this.j = j;
                final LinearLayout n2 = this.n;
                if (n2 != null) {
                    ((ViewGroup)n2).addView((View)j, -1);
                }
                else {
                    ((ViewGroup)this).addView((View)j, -1);
                }
            }
            o = this.j;
            o2 = this.h;
        }
        if (b) {
            ((CompoundButton)o).setChecked(this.f.isChecked());
            if (((View)o).getVisibility() != 0) {
                ((View)o).setVisibility(0);
            }
            if (o2 != null && ((View)o2).getVisibility() != 8) {
                ((View)o2).setVisibility(8);
            }
        }
        else {
            final CheckBox i = this.j;
            if (i != null) {
                ((View)i).setVisibility(8);
            }
            final RadioButton h2 = this.h;
            if (h2 != null) {
                ((View)h2).setVisibility(8);
            }
        }
    }
    
    public void setChecked(final boolean checked) {
        Object o;
        if ((this.f.x & 0x4) != 0x0) {
            if (this.h == null) {
                final RadioButton h = (RadioButton)this.getInflater().inflate(2131624003, (ViewGroup)this, false);
                this.h = h;
                final LinearLayout n = this.n;
                if (n != null) {
                    ((ViewGroup)n).addView((View)h, -1);
                }
                else {
                    ((ViewGroup)this).addView((View)h, -1);
                }
            }
            o = this.h;
        }
        else {
            if (this.j == null) {
                final CheckBox j = (CheckBox)this.getInflater().inflate(2131624000, (ViewGroup)this, false);
                this.j = j;
                final LinearLayout n2 = this.n;
                if (n2 != null) {
                    ((ViewGroup)n2).addView((View)j, -1);
                }
                else {
                    ((ViewGroup)this).addView((View)j, -1);
                }
            }
            o = this.j;
        }
        ((CompoundButton)o).setChecked(checked);
    }
    
    public void setForceShowIcon(final boolean b) {
        this.v = b;
        this.r = b;
    }
    
    public void setGroupDividerEnabled(final boolean b) {
        final ImageView m = this.m;
        if (m != null) {
            int visibility;
            if (!this.t && b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            m.setVisibility(visibility);
        }
    }
    
    public void setIcon(Drawable imageDrawable) {
        final boolean b = this.f.n.getOptionalIconsVisible() || this.v;
        if (!b && !this.r) {
            return;
        }
        final ImageView g = this.g;
        if (g == null && imageDrawable == null && !this.r) {
            return;
        }
        if (g == null) {
            final ImageView g2 = (ImageView)this.getInflater().inflate(2131624001, (ViewGroup)this, false);
            this.g = g2;
            final LinearLayout n = this.n;
            if (n != null) {
                ((ViewGroup)n).addView((View)g2, 0);
            }
            else {
                ((ViewGroup)this).addView((View)g2, 0);
            }
        }
        if (imageDrawable == null && !this.r) {
            this.g.setVisibility(8);
        }
        else {
            final ImageView g3 = this.g;
            if (!b) {
                imageDrawable = null;
            }
            g3.setImageDrawable(imageDrawable);
            if (((View)this.g).getVisibility() != 0) {
                this.g.setVisibility(0);
            }
        }
    }
    
    public void setTitle(final CharSequence text) {
        if (text != null) {
            this.i.setText(text);
            if (((View)this.i).getVisibility() != 0) {
                ((View)this.i).setVisibility(0);
            }
        }
        else if (((View)this.i).getVisibility() != 8) {
            ((View)this.i).setVisibility(8);
        }
    }
}
