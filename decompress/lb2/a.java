// 
// Decompiled by Procyon v0.6.0
// 

package lb2;

import com.reddit.ui.ViewUtilKt;
import t5.m;
import t5.q;
import t5.d;
import android.content.res.Resources;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import kotlin.NoWhenBranchMatchedException;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.appcompat.widget.b1;
import com.reddit.widget.bottomnav.BottomNavView$a;
import com.reddit.widget.bottomnav.BottomNavView;
import mg.d0;
import ng2.e;
import com.reddit.domain.design.features.BottomNavMode;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import cg2.j;
import com.reddit.widget.bottomnav.BottomNavView$Item;

public final class a
{
    public final BottomNavView$Item a;
    public final a<j> b;
    public final ViewGroup c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public h g;
    public final ColorStateList h;
    
    public a(final ViewGroup viewGroup, final BottomNavView$Item a, final BottomNavMode bottomNavMode, final a<j> b, final Integer n) {
        ng2.e.f((Object)viewGroup, "parent");
        ng2.e.f((Object)bottomNavMode, "mode");
        ng2.e.f((Object)b, "onClick");
        this.a = a;
        this.b = b;
        final ViewGroup c = (ViewGroup)d0.f0(viewGroup, 2131624067, false);
        this.c = c;
        final View viewById = ((View)c).findViewById(2131427941);
        ng2.e.e((Object)viewById, "itemView.findViewById(R.id.bottom_nav_item_icon)");
        final ImageView imageView = (ImageView)viewById;
        final View viewById2 = ((View)c).findViewById(2131427942);
        ng2.e.e((Object)viewById2, "itemView.findViewById(R.id.bottom_nav_item_label)");
        final TextView d = (TextView)viewById2;
        this.d = d;
        final View viewById3 = ((View)c).findViewById(2131427943);
        ng2.e.e((Object)viewById3, "itemView.findViewById(R.\u2026om_nav_item_notification)");
        final TextView e = (TextView)viewById3;
        this.e = e;
        final View viewById4 = ((View)c).findViewById(2131427944);
        ng2.e.e((Object)viewById4, "itemView.findViewById(R.\u2026m_notification_no_number)");
        final ImageView f = (ImageView)viewById4;
        this.f = f;
        final Context context = ((View)c).getContext();
        ng2.e.e((Object)context, "itemView.context");
        this.g = lb2.h.b.a;
        final int s = BottomNavView.s;
        final ColorStateList a2 = BottomNavView$a.a(context, bottomNavMode);
        this.h = a2;
        final Resources resources = context.getResources();
        final Integer b2 = a.b;
        ng2.e.c((Object)b2);
        final String string = resources.getString((int)b2);
        ng2.e.e((Object)string, "context.resources.getString(item.titleRes!!)");
        b1.a((View)c, string);
        ((View)c).getLayoutParams().height = ((View)c).getResources().getDimensionPixelSize(lb2.f.a(bottomNavMode));
        ((View)c).setContentDescription((CharSequence)string);
        ((View)c).setOnClickListener((View$OnClickListener)new com.reddit.vault.feature.vault.transfer.a((Object)this, 8));
        imageView.setImageTintList(a2);
        final int[] a3 = lb2.a.a.a;
        final int n2 = a3[bottomNavMode.ordinal()];
        if (n2 == 1 || n2 == 2 || n2 == 3) {
            final StateListDrawable imageDrawable = new StateListDrawable();
            imageDrawable.addState(new int[] { 16842913 }, n3.a.getDrawable(((View)imageView).getContext(), a.d));
            imageDrawable.addState(new int[] { 0 }, n3.a.getDrawable(((View)imageView).getContext(), a.c));
            imageView.setImageDrawable((Drawable)imageDrawable);
        }
        final int n3 = a3[bottomNavMode.ordinal()];
        boolean b3 = false;
        Label_0449: {
            Label_0446: {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (n == null) {
                            break Label_0446;
                        }
                        if (n != 0) {
                            break Label_0446;
                        }
                    }
                    b3 = false;
                    break Label_0449;
                }
            }
            b3 = true;
        }
        int visibility;
        if (b3) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)d).setVisibility(visibility);
        if (b3) {
            d.setTextColor(a2);
            if (bottomNavMode == BottomNavMode.DYNAMIC) {
                final ViewGroup$LayoutParams layoutParams = ((View)imageView).getLayoutParams();
                ViewGroup$MarginLayoutParams layoutParams2;
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    layoutParams2 = (ViewGroup$MarginLayoutParams)layoutParams;
                }
                else {
                    layoutParams2 = null;
                }
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = ((View)imageView).getResources().getDimensionPixelSize(2131165833);
                    ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                }
            }
            d.setText((CharSequence)string);
            if (n != null) {
                d.setLines(n.intValue());
            }
        }
        final int n4 = a3[bottomNavMode.ordinal()];
        if (n4 != 1 && n4 != 2 && n4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        e.setIncludeFontPadding(false);
        final int n5 = a3[bottomNavMode.ordinal()];
        if (n5 != 1 && n5 != 2 && n5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ((View)e).setBackgroundResource(2131231025);
        final ViewGroup$LayoutParams layoutParams3 = ((View)f).getLayoutParams();
        final Resources resources2 = ((View)f).getResources();
        final int n6 = a3[bottomNavMode.ordinal()];
        if (n6 != 1 && n6 != 2 && n6 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        final int dimensionPixelSize = resources2.getDimensionPixelSize(2131165371);
        layoutParams3.width = dimensionPixelSize;
        layoutParams3.height = dimensionPixelSize;
    }
    
    public final void a(final h g) {
        ng2.e.f((Object)g, "value");
        if (!ng2.e.a((Object)this.g, (Object)g)) {
            q.a(this.c, (m)new d());
        }
        if (g instanceof h.a) {
            final TextView e = this.e;
            e.setText((CharSequence)((View)e).getResources().getString(2131953642, new Object[] { ((h.a)g).a }));
            ViewUtilKt.g((View)this.e);
            ViewUtilKt.e((View)this.f);
        }
        else if (ng2.e.a((Object)g, (Object)lb2.h.c.a)) {
            ViewUtilKt.g((View)this.f);
            ViewUtilKt.e((View)this.e);
        }
        else if (ng2.e.a((Object)g, (Object)lb2.h.b.a)) {
            ViewUtilKt.e((View)this.f);
            ViewUtilKt.e((View)this.e);
        }
        this.g = g;
    }
    
    public final void b(final boolean selected) {
        final TextView d = this.d;
        final Context context = ((View)d).getContext();
        ng2.e.e((Object)context, "context");
        Integer value = 2130969932;
        value.intValue();
        if (!selected) {
            value = null;
        }
        int intValue;
        if (value != null) {
            intValue = value;
        }
        else {
            intValue = 2130969921;
        }
        d.setTextAppearance(cg.d.Y2(intValue, context));
        d.setTextColor(this.h);
        ((View)this.c).setSelected(selected);
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[BottomNavMode.values().length];
            a2[BottomNavMode.WITH_LABELS.ordinal()] = 1;
            a2[BottomNavMode.WITHOUT_LABELS.ordinal()] = 2;
            a2[BottomNavMode.DYNAMIC.ordinal()] = 3;
            a = a2;
        }
    }
}
