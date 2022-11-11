// 
// Decompiled by Procyon v0.6.0
// 

package sb2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.reddit.common.experiments.model.design.BottomNavLabelsV2Variant;
import android.view.View$OnClickListener;
import lq0.k;
import android.view.View;
import androidx.appcompat.widget.d1;
import kotlin.NoWhenBranchMatchedException;
import android.widget.TextView;
import android.widget.ImageView;
import o90.f3;
import sg2.e;
import com.reddit.domain.design.features.BottomNavMode;
import com.reddit.widget.bottomnav.BottomNavView;
import android.view.ViewGroup;
import hg2.j;
import rg2.a;

public final class b
{
    public final rg2.a<j> a;
    public final ViewGroup b;
    
    public b(final ViewGroup viewGroup, final BottomNavView.Item item, final BottomNavMode bottomNavMode, final rg2.a<j> a, final Integer n) {
        e.f((Object)viewGroup, "parent");
        this.a = a;
        final boolean b = false;
        final ViewGroup b2 = (ViewGroup)f3.Q1(viewGroup, 2131624067, false);
        this.b = b2;
        final View viewById = ((View)b2).findViewById(2131427941);
        e.e((Object)viewById, "itemView.findViewById(R.id.bottom_nav_item_icon)");
        final ImageView imageView = (ImageView)viewById;
        final View viewById2 = ((View)b2).findViewById(2131427942);
        e.e((Object)viewById2, "itemView.findViewById(R.id.bottom_nav_item_label)");
        final TextView textView = (TextView)viewById2;
        final Context context = ((View)b2).getContext();
        e.e((Object)context, "itemView.context");
        final Resources resources = context.getResources();
        final int[] a2 = sb2.b.a.a;
        final int n2 = a2[((Enum)bottomNavMode).ordinal()];
        if (n2 != 1 && n2 != 2 && n2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        final String string = resources.getString(2131951769);
        e.e((Object)string, "context.resources.getStr\u2026ion_create\n      },\n    )");
        final int s = BottomNavView.s;
        final ColorStateList a3 = BottomNavView.a.a(context, bottomNavMode);
        ((View)b2).getLayoutParams().height = ((View)b2).getResources().getDimensionPixelSize(f.a(bottomNavMode));
        ((View)b2).setContentDescription((CharSequence)string);
        d1.a((View)b2, (CharSequence)string);
        final int n3 = a2[((Enum)bottomNavMode).ordinal()];
        if (n3 != 1 && n3 != 2 && n3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        final Context context2 = ((View)b2).getContext();
        e.e((Object)context2, "context");
        ((View)b2).setBackground(k.M(2130969755, context2));
        ((View)b2).setOnClickListener((View$OnClickListener)new x62.a((Object)this, 17));
        imageView.setImageTintList(a3);
        final int n4 = a2[((Enum)bottomNavMode).ordinal()];
        if (n4 != 1 && n4 != 2 && n4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setImageResource(item.c);
        final int n5 = a2[((Enum)bottomNavMode).ordinal()];
        if (n5 != 1 && n5 != 2 && n5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ((View)imageView).setPadding(0, 0, 0, 0);
        final int n6 = a2[((Enum)bottomNavMode).ordinal()];
        boolean b3 = false;
        Label_0441: {
            Label_0438: {
                if (n6 != 1) {
                    if (n6 != 2) {
                        if (n6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (n == null) {
                            break Label_0438;
                        }
                        if (n != 0) {
                            break Label_0438;
                        }
                    }
                    b3 = false;
                    break Label_0441;
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
        ((View)textView).setVisibility(visibility);
        if (b3) {
            final Context context3 = ((View)textView).getContext();
            e.e((Object)context3, "context");
            final BottomNavLabelsV2Variant u0 = mf1.a.u(context3).f8().u0();
            int n7 = b ? 1 : 0;
            if (u0 != null) {
                n7 = (b ? 1 : 0);
                if (u0 != BottomNavLabelsV2Variant.CONTROL) {
                    n7 = 1;
                }
            }
            Label_0577: {
                if (n7 == 0) {
                    final Context context4 = ((View)textView).getContext();
                    e.e((Object)context4, "context");
                    if (!ml0.a.f0(mf1.a.u(context4).L0().n3())) {
                        break Label_0577;
                    }
                }
                final Context context5 = ((View)textView).getContext();
                e.e((Object)context5, "context");
                textView.setTextAppearance(k.U(2130969921, context5));
            }
            textView.setTextColor(a3);
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
            textView.setText((CharSequence)string);
            if (n != null) {
                textView.setLines(n.intValue());
            }
        }
    }
}
