// 
// Decompiled by Procyon v0.6.0
// 

package lb2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import px0.c;
import com.reddit.common.experiments.model.design.BottomNavLabelsV2Variant;
import android.view.View$OnClickListener;
import cg.d;
import android.view.View;
import androidx.appcompat.widget.b1;
import com.reddit.widget.bottomnav.BottomNavView$a;
import com.reddit.widget.bottomnav.BottomNavView;
import kotlin.NoWhenBranchMatchedException;
import android.widget.TextView;
import android.widget.ImageView;
import mg.d0;
import ng2.e;
import com.reddit.domain.design.features.BottomNavMode;
import com.reddit.widget.bottomnav.BottomNavView$Item;
import android.view.ViewGroup;
import cg2.j;
import mg2.a;

public final class b
{
    public final mg2.a<j> a;
    public final ViewGroup b;
    
    public b(ViewGroup b, final BottomNavView$Item bottomNavView$Item, final BottomNavMode bottomNavMode, final mg2.a<j> a, final Integer n) {
        e.f((Object)b, "parent");
        this.a = a;
        final boolean b2 = false;
        b = (ViewGroup)d0.f0(b, 2131624068, false);
        this.b = b;
        final View viewById = ((View)b).findViewById(2131427941);
        e.e((Object)viewById, "itemView.findViewById(R.id.bottom_nav_item_icon)");
        final ImageView imageView = (ImageView)viewById;
        final View viewById2 = ((View)b).findViewById(2131427942);
        e.e((Object)viewById2, "itemView.findViewById(R.id.bottom_nav_item_label)");
        final TextView textView = (TextView)viewById2;
        final Context context = ((View)b).getContext();
        e.e((Object)context, "itemView.context");
        final Resources resources = context.getResources();
        final int[] a2 = lb2.b.a.a;
        final int n2 = a2[bottomNavMode.ordinal()];
        if (n2 != 1 && n2 != 2 && n2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        final String string = resources.getString(2131951774);
        e.e((Object)string, "context.resources.getStr\u2026ion_create\n      },\n    )");
        final int s = BottomNavView.s;
        final ColorStateList a3 = BottomNavView$a.a(context, bottomNavMode);
        ((View)b).getLayoutParams().height = ((View)b).getResources().getDimensionPixelSize(f.a(bottomNavMode));
        ((View)b).setContentDescription((CharSequence)string);
        b1.a((View)b, string);
        final int n3 = a2[bottomNavMode.ordinal()];
        if (n3 != 1 && n3 != 2 && n3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        final Context context2 = ((View)b).getContext();
        e.e((Object)context2, "context");
        ((View)b).setBackground(d.J2(2130969755, context2));
        ((View)b).setOnClickListener((View$OnClickListener)new u92.a(this, 10));
        imageView.setImageTintList(a3);
        final int n4 = a2[bottomNavMode.ordinal()];
        if (n4 != 1 && n4 != 2 && n4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setImageResource(bottomNavView$Item.c);
        final int n5 = a2[bottomNavMode.ordinal()];
        if (n5 != 1 && n5 != 2 && n5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ((View)imageView).setPadding(0, 0, 0, 0);
        final int n6 = a2[bottomNavMode.ordinal()];
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
            final BottomNavLabelsV2Variant w0 = i10.a.A(context3).p8().w0();
            int n7 = b2 ? 1 : 0;
            if (w0 != null) {
                n7 = (b2 ? 1 : 0);
                if (w0 != BottomNavLabelsV2Variant.CONTROL) {
                    n7 = 1;
                }
            }
            Label_0577: {
                if (n7 == 0) {
                    final Context context4 = ((View)textView).getContext();
                    e.e((Object)context4, "context");
                    if (!c.E2(i10.a.A(context4).L0().x3())) {
                        break Label_0577;
                    }
                }
                final Context context5 = ((View)textView).getContext();
                e.e((Object)context5, "context");
                textView.setTextAppearance(d.Y2(2130969921, context5));
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
                    layoutParams2.topMargin = ((View)imageView).getResources().getDimensionPixelSize(2131165833);
                    ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                }
            }
            textView.setText((CharSequence)string);
            if (n != null) {
                textView.setLines(n.intValue());
            }
        }
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
