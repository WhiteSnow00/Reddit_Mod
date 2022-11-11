// 
// Decompiled by Procyon v0.6.0
// 

package sb2;

import lq0.k;
import com.reddit.ui.ViewUtilKt;
import u5.m;
import u5.q;
import u5.d;
import android.content.res.Resources;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import kotlin.NoWhenBranchMatchedException;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.appcompat.widget.d1;
import o90.f3;
import sg2.e;
import com.reddit.domain.design.features.BottomNavMode;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import hg2.j;
import com.reddit.widget.bottomnav.BottomNavView;

public final class a
{
    public final BottomNavView.Item a;
    public final a<j> b;
    public final ViewGroup c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public h g;
    public final ColorStateList h;
    
    public a(ViewGroup c, final BottomNavView.Item a, final BottomNavMode bottomNavMode, final a<j> b, final Integer n) {
        sg2.e.f((Object)c, "parent");
        sg2.e.f((Object)bottomNavMode, "mode");
        sg2.e.f((Object)b, "onClick");
        this.a = a;
        this.b = b;
        c = (ViewGroup)f3.Q1(c, 2131624066, false);
        this.c = c;
        final View viewById = ((View)c).findViewById(2131427941);
        sg2.e.e((Object)viewById, "itemView.findViewById(R.id.bottom_nav_item_icon)");
        final ImageView imageView = (ImageView)viewById;
        final View viewById2 = ((View)c).findViewById(2131427942);
        sg2.e.e((Object)viewById2, "itemView.findViewById(R.id.bottom_nav_item_label)");
        final TextView d = (TextView)viewById2;
        this.d = d;
        final View viewById3 = ((View)c).findViewById(2131427943);
        sg2.e.e((Object)viewById3, "itemView.findViewById(R.\u2026om_nav_item_notification)");
        final TextView e = (TextView)viewById3;
        this.e = e;
        final View viewById4 = ((View)c).findViewById(2131427944);
        sg2.e.e((Object)viewById4, "itemView.findViewById(R.\u2026m_notification_no_number)");
        final ImageView f = (ImageView)viewById4;
        this.f = f;
        final Context context = ((View)c).getContext();
        sg2.e.e((Object)context, "itemView.context");
        this.g = (h)h$b.a;
        final int s = BottomNavView.s;
        final ColorStateList a2 = BottomNavView.a.a(context, bottomNavMode);
        this.h = a2;
        final Resources resources = context.getResources();
        final Integer b2 = a.b;
        sg2.e.c((Object)b2);
        final String string = resources.getString((int)b2);
        sg2.e.e((Object)string, "context.resources.getString(item.titleRes!!)");
        d1.a((View)c, (CharSequence)string);
        ((View)c).getLayoutParams().height = ((View)c).getResources().getDimensionPixelSize(sb2.f.a(bottomNavMode));
        ((View)c).setContentDescription((CharSequence)string);
        ((View)c).setOnClickListener((View$OnClickListener)new zv1.a((Object)this, 19));
        imageView.setImageTintList(a2);
        final int[] a3 = sb2.a.a.a;
        final int n2 = a3[((Enum)bottomNavMode).ordinal()];
        if (n2 == 1 || n2 == 2 || n2 == 3) {
            final StateListDrawable imageDrawable = new StateListDrawable();
            imageDrawable.addState(new int[] { 16842913 }, n3.a.getDrawable(((View)imageView).getContext(), a.d));
            imageDrawable.addState(new int[] { 0 }, n3.a.getDrawable(((View)imageView).getContext(), a.c));
            imageView.setImageDrawable((Drawable)imageDrawable);
        }
        final int n3 = a3[((Enum)bottomNavMode).ordinal()];
        boolean b3 = false;
        Label_0448: {
            Label_0445: {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (n == null) {
                            break Label_0445;
                        }
                        if (n != 0) {
                            break Label_0445;
                        }
                    }
                    b3 = false;
                    break Label_0448;
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
                    layoutParams2.topMargin = ((View)imageView).getResources().getDimensionPixelSize(2131165831);
                    ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                }
            }
            d.setText((CharSequence)string);
            if (n != null) {
                d.setLines(n.intValue());
            }
        }
        final int n4 = a3[((Enum)bottomNavMode).ordinal()];
        if (n4 != 1 && n4 != 2 && n4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        e.setIncludeFontPadding(false);
        final int n5 = a3[((Enum)bottomNavMode).ordinal()];
        if (n5 != 1 && n5 != 2 && n5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ((View)e).setBackgroundResource(2131231023);
        final ViewGroup$LayoutParams layoutParams3 = ((View)f).getLayoutParams();
        final Resources resources2 = ((View)f).getResources();
        final int n6 = a3[((Enum)bottomNavMode).ordinal()];
        if (n6 != 1 && n6 != 2 && n6 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        final int dimensionPixelSize = resources2.getDimensionPixelSize(2131165371);
        layoutParams3.width = dimensionPixelSize;
        layoutParams3.height = dimensionPixelSize;
    }
    
    public final void a(final h g) {
        sg2.e.f((Object)g, "value");
        if (!sg2.e.a((Object)this.g, (Object)g)) {
            q.a(this.c, (m)new d());
        }
        if (g instanceof h$a) {
            final TextView e = this.e;
            e.setText((CharSequence)((View)e).getResources().getString(2131953619, new Object[] { ((h$a)g).a }));
            ViewUtilKt.g((View)this.e);
            ViewUtilKt.e((View)this.f);
        }
        else if (sg2.e.a((Object)g, (Object)h$c.a)) {
            ViewUtilKt.g((View)this.f);
            ViewUtilKt.e((View)this.e);
        }
        else if (sg2.e.a((Object)g, (Object)h$b.a)) {
            ViewUtilKt.e((View)this.f);
            ViewUtilKt.e((View)this.e);
        }
        this.g = g;
    }
    
    public final void b(final boolean selected) {
        final TextView d = this.d;
        final Context context = ((View)d).getContext();
        sg2.e.e((Object)context, "context");
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
        d.setTextAppearance(k.U(intValue, context));
        d.setTextColor(this.h);
        ((View)this.c).setSelected(selected);
    }
}
