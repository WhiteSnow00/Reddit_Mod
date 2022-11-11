// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.widget.ImageView$ScaleType;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.k;
import android.util.TypedValue;
import com.bytedance.tux.input.TuxTextView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewStub;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18w implements 0IF
{
    static {
        Covode.recordClassIndex(1961);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(8944);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131365312);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final ViewStub viewStub = new ViewStub(context);
        ((View)viewStub).setId(2131363803);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        b.LIZ((View)viewStub);
        if (((View)viewStub).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)viewStub, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final LinearLayout linearLayout = new LinearLayout(context);
        ((View)linearLayout).setId(2131367945);
        linearLayout.setOrientation(1);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -1);
        final FrameLayout frameLayout2 = new FrameLayout(context);
        ((View)frameLayout2).setId(2131365961);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, -2);
        b.LIZ((View)frameLayout2);
        if (((View)frameLayout2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131372326);
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), (int)TypedValue.applyDimension(1, 12.5f, resources.getDisplayMetrics()), ((View)tuxTextView).getPaddingRight(), ((View)tuxTextView).getPaddingBottom());
        ((TextView)tuxTextView).setPadding(((View)tuxTextView).getPaddingLeft(), ((View)tuxTextView).getPaddingTop(), ((View)tuxTextView).getPaddingRight(), (int)TypedValue.applyDimension(1, 12.5f, resources.getDisplayMetrics()));
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968672 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            linearLayout$LayoutParams2.gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams2)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams2).gravity = 1;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams2)) {
            ((092.d)linearLayout$LayoutParams2).LIZ = 1;
        }
        ((TextView)tuxTextView).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("P2_Semibold"), tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        CTM.LIZ((Object)tuxTextView, (Object)linearLayout$LayoutParams2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        }
        final TuxTextView tuxTextView2 = new TuxTextView(context);
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968681 });
        ((TextView)tuxTextView2).setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ((TextView)tuxTextView2).setText(2131823086);
        ((View)tuxTextView2).setVisibility(8);
        ((View)tuxTextView2).setId(2131363742);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            linearLayout$LayoutParams3.gravity = 1;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams3).gravity = 1;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams3)) {
            ((092.d)linearLayout$LayoutParams3).LIZ = 1;
        }
        ((TextView)tuxTextView2).setGravity(17);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams3).setMarginStart((int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams3).setMarginEnd((int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams3)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams3).bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("P3_Bold"), tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        CTM.LIZ((Object)tuxTextView2, (Object)linearLayout$LayoutParams3);
        b.LIZ((View)tuxTextView2);
        if (((View)tuxTextView2).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)tuxTextView2, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ((View)frameLayout3).setId(2131371572);
        ((View)frameLayout3).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams4 = new LinearLayout$LayoutParams(-1, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).leftMargin = (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).rightMargin = (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams4)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams4).bottomMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)frameLayout3);
        if (((View)frameLayout3).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)frameLayout3, (ViewGroup$LayoutParams)linearLayout$LayoutParams4);
        }
        final View liz2 = 0I8.LIZ(context, 2131558818, (ViewGroup)linearLayout, false, 0);
        liz2.setId(2131364458);
        liz2.setVisibility(8);
        if (liz2.getParent() == null) {
            ((ViewGroup)linearLayout).addView(liz2);
        }
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        ((View)relativeLayout).setId(2131365313);
        final LinearLayout$LayoutParams linearLayout$LayoutParams5 = new LinearLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams5)) {
            linearLayout$LayoutParams5.weight = 1.0f;
        }
        final AUY auy = new AUY(context);
        ((View)auy).setId(2131370265);
        ((View)auy).setOverScrollMode(2);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-1, -2);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            relativeLayout$LayoutParams.addRule(10, -1);
        }
        b.LIZ((View)auy);
        if (((View)auy).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)auy, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final P1c p1c = new P1c(context);
        ((View)p1c).setId(2131371669);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams(-1, -1);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(3, 2131370265);
        }
        b.LIZ((View)p1c);
        if (((View)p1c).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)p1c, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        final LinearLayout linearLayout2 = new LinearLayout(context);
        ((View)linearLayout2).setId(2131365511);
        linearLayout2.setOrientation(1);
        ((View)linearLayout2).setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams(-1, -1);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(3, 2131371669);
        }
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams3).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams3).gravity = 17;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams3)) {
            ((092.d)relativeLayout$LayoutParams3).LIZ = 17;
        }
        linearLayout2.setGravity(17);
        final 4fg 4fg = new 4fg(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams6 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755538", "raw"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968673", "attr"), 4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        CTM.LIZ((Object)4fg, (Object)linearLayout$LayoutParams6);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)4fg, (ViewGroup$LayoutParams)linearLayout$LayoutParams6);
        }
        final TuxTextView tuxTextView3 = new TuxTextView(context);
        ((TextView)tuxTextView3).setText(2131821409);
        final LinearLayout$LayoutParams linearLayout$LayoutParams7 = new LinearLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams7).topMargin = (int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        new k().LIZ("app:tux_font", (a)new a.c("P1_Regular"), tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        CTM.LIZ((Object)tuxTextView3, (Object)linearLayout$LayoutParams7);
        b.LIZ((View)tuxTextView3);
        if (((View)tuxTextView3).getParent() == null) {
            ((ViewGroup)linearLayout2).addView((View)tuxTextView3, (ViewGroup$LayoutParams)linearLayout$LayoutParams7);
        }
        b.LIZ((View)linearLayout2);
        if (((View)linearLayout2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)linearLayout2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        }
        final P1c p1c2 = new P1c(context);
        ((View)p1c2).setId(2131363699);
        p1c2.setVisibility(8);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout$LayoutParams(-1, -1);
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            relativeLayout$LayoutParams4.addRule(3, 2131365511);
        }
        if (LinearLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            ((LinearLayout$LayoutParams)relativeLayout$LayoutParams4).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams4)) {
            ((FrameLayout$LayoutParams)relativeLayout$LayoutParams4).gravity = 17;
        }
        if (092.d.class.isInstance(relativeLayout$LayoutParams4)) {
            ((092.d)relativeLayout$LayoutParams4).LIZ = 17;
        }
        b.LIZ((View)p1c2);
        if (((View)p1c2).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)p1c2, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
        }
        b.LIZ((View)relativeLayout);
        if (((View)relativeLayout).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)relativeLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams5);
        }
        final View view = new View(context);
        view.setId(2131363704);
        final TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[] { 2130968637 });
        view.setBackgroundColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams8 = new LinearLayout$LayoutParams(-1, (int)TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)linearLayout).addView(view, (ViewGroup$LayoutParams)linearLayout$LayoutParams8);
        }
        final LinearLayout linearLayout3 = new LinearLayout(context);
        ((View)linearLayout3).setId(2131370650);
        linearLayout3.setOrientation(1);
        ((View)linearLayout3).setBackgroundResource(2131231088);
        final LinearLayout$LayoutParams linearLayout$LayoutParams9 = new LinearLayout$LayoutParams(-1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams9)) {
            linearLayout$LayoutParams9.gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams9)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams9).gravity = 80;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams9)) {
            ((092.d)linearLayout$LayoutParams9).LIZ = 80;
        }
        final A8b a8b = new A8b(context);
        ((View)a8b).setId(2131366043);
        ((View)a8b).setVisibility(0);
        final LinearLayout$LayoutParams linearLayout$LayoutParams10 = new LinearLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(linearLayout$LayoutParams10)) {
            ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams10).topMargin = (int)TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)a8b);
        if (((View)a8b).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)a8b, (ViewGroup$LayoutParams)linearLayout$LayoutParams10);
        }
        final FrameLayout frameLayout4 = new FrameLayout(context);
        final LinearLayout$LayoutParams linearLayout$LayoutParams11 = new LinearLayout$LayoutParams(-1, -2);
        final View liz3 = 0I8.LIZ(context, 2131558781, (ViewGroup)frameLayout4, false, 0);
        liz3.setId(2131363700);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(-1, -2);
        if (liz3.getParent() == null) {
            ((ViewGroup)frameLayout4).addView(liz3, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        final FrameLayout frameLayout5 = new FrameLayout(context);
        ((View)frameLayout5).setVisibility(8);
        ((View)frameLayout5).setId(2131363710);
        final FrameLayout$LayoutParams frameLayout$LayoutParams4 = new FrameLayout$LayoutParams(-1, -2);
        b.LIZ((View)frameLayout5);
        if (((View)frameLayout5).getParent() == null) {
            ((ViewGroup)frameLayout4).addView((View)frameLayout5, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        }
        b.LIZ((View)frameLayout4);
        if (((View)frameLayout4).getParent() == null) {
            ((ViewGroup)linearLayout3).addView((View)frameLayout4, (ViewGroup$LayoutParams)linearLayout$LayoutParams11);
        }
        b.LIZ((View)linearLayout3);
        if (((View)linearLayout3).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)linearLayout3, (ViewGroup$LayoutParams)linearLayout$LayoutParams9);
        }
        final LinearLayout linearLayout4 = new LinearLayout(context);
        ((View)linearLayout4).setId(2131362713);
        linearLayout4.setOrientation(0);
        ((View)linearLayout4).setVisibility(8);
        final LinearLayout$LayoutParams linearLayout$LayoutParams12 = new LinearLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        final TuxTextView tuxTextView4 = new TuxTextView(context);
        ((View)tuxTextView4).setId(2131362714);
        ((TextView)tuxTextView4).setText(2131822965);
        final TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[] { 2130968673 });
        ((TextView)tuxTextView4).setTextColor(obtainStyledAttributes4.getColor(0, 0));
        obtainStyledAttributes4.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams13 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams13)) {
            linearLayout$LayoutParams13.weight = 1.0f;
        }
        ((TextView)tuxTextView4).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams13);
        CTM.LIZ((Object)tuxTextView4, (Object)linearLayout$LayoutParams13);
        b.LIZ((View)tuxTextView4);
        if (((View)tuxTextView4).getParent() == null) {
            ((ViewGroup)linearLayout4).addView((View)tuxTextView4, (ViewGroup$LayoutParams)linearLayout$LayoutParams13);
        }
        final View view2 = new View(context);
        final TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[] { 2130968638 });
        view2.setBackgroundColor(obtainStyledAttributes5.getColor(0, 0));
        obtainStyledAttributes5.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams14 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams14)) {
            linearLayout$LayoutParams14.gravity = 16;
        }
        if (FrameLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams14)) {
            ((FrameLayout$LayoutParams)linearLayout$LayoutParams14).gravity = 16;
        }
        if (092.d.class.isInstance(linearLayout$LayoutParams14)) {
            ((092.d)linearLayout$LayoutParams14).LIZ = 16;
        }
        b.LIZ(view2);
        if (view2.getParent() == null) {
            ((ViewGroup)linearLayout4).addView(view2, (ViewGroup$LayoutParams)linearLayout$LayoutParams14);
        }
        final TuxTextView tuxTextView5 = new TuxTextView(context);
        ((View)tuxTextView5).setId(2131362717);
        ((TextView)tuxTextView5).setText(2131822969);
        final TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[] { 2130968673 });
        ((TextView)tuxTextView5).setTextColor(obtainStyledAttributes6.getColor(0, 0));
        obtainStyledAttributes6.recycle();
        final LinearLayout$LayoutParams linearLayout$LayoutParams15 = new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout$LayoutParams.class.isInstance(linearLayout$LayoutParams15)) {
            linearLayout$LayoutParams15.weight = 1.0f;
        }
        ((TextView)tuxTextView5).setGravity(17);
        new k().LIZ("app:tux_font", (a)new a.c("H4_Semibold"), tuxTextView5, (ViewGroup$LayoutParams)linearLayout$LayoutParams15);
        CTM.LIZ((Object)tuxTextView5, (Object)linearLayout$LayoutParams15);
        b.LIZ((View)tuxTextView5);
        if (((View)tuxTextView5).getParent() == null) {
            ((ViewGroup)linearLayout4).addView((View)tuxTextView5, (ViewGroup$LayoutParams)linearLayout$LayoutParams15);
        }
        b.LIZ((View)linearLayout4);
        if (((View)linearLayout4).getParent() == null) {
            ((ViewGroup)linearLayout).addView((View)linearLayout4, (ViewGroup$LayoutParams)linearLayout$LayoutParams12);
        }
        b.LIZ((View)linearLayout);
        if (((View)linearLayout).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)linearLayout, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        final FrameLayout frameLayout6 = new FrameLayout(context);
        ((View)frameLayout6).setId(2131363908);
        final FrameLayout$LayoutParams frameLayout$LayoutParams5 = new FrameLayout$LayoutParams(-1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams5)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams5).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams5)) {
            frameLayout$LayoutParams5.gravity = 80;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams5)) {
            ((092.d)frameLayout$LayoutParams5).LIZ = 80;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams5)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams5).bottomMargin = (int)TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)frameLayout6);
        if (((View)frameLayout6).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout6, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        }
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131362711);
        ((View)4fg2).setPadding((int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ((ImageView)4fg2).setScaleType(ImageView$ScaleType.FIT_CENTER);
        ((ImageView)4fg2).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams6 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams6).gravity = 8388611;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            frameLayout$LayoutParams6.gravity = 8388611;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams6)) {
            ((092.d)frameLayout$LayoutParams6).LIZ = 8388611;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams6)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams6).setMarginStart((int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        final i j = new i();
        j.LIZ("app:tux_icon", (a)new a.b("2131755401", "raw"), 4fg2, (ViewGroup$LayoutParams)frameLayout$LayoutParams6);
        j.LIZ("app:tux_tintColor", (a)new a.b("2130968678", "attr"), 4fg2, (ViewGroup$LayoutParams)frameLayout$LayoutParams6);
        CTM.LIZ((Object)4fg2, (Object)frameLayout$LayoutParams6);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)4fg2, (ViewGroup$LayoutParams)frameLayout$LayoutParams6);
        }
        final 4fg 4fg3 = new 4fg(context);
        ((View)4fg3).setId(2131371260);
        ((View)4fg3).setClickable(false);
        ((ImageView)4fg3).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams7 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        final i k = new i();
        k.LIZ("app:tux_icon", (a)new a.b("2131755722", "raw"), 4fg3, (ViewGroup$LayoutParams)frameLayout$LayoutParams7);
        k.LIZ("app:tux_tintColor", (a)new a.b("2130968649", "attr"), 4fg3, (ViewGroup$LayoutParams)frameLayout$LayoutParams7);
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams7).setMarginStart((int)TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams7)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams7).topMargin = (int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        CTM.LIZ((Object)4fg3, (Object)frameLayout$LayoutParams7);
        b.LIZ((View)4fg3);
        if (((View)4fg3).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)4fg3, (ViewGroup$LayoutParams)frameLayout$LayoutParams7);
        }
        final TuxTextView tuxTextView6 = new TuxTextView(context);
        ((View)tuxTextView6).setId(2131362715);
        ((TextView)tuxTextView6).setText(2131822968);
        ((View)tuxTextView6).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams8 = new FrameLayout$LayoutParams(-2, -2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams8).setMarginEnd((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams8).topMargin = (int)TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams8).gravity = 8388613;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            frameLayout$LayoutParams8.gravity = 8388613;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams8)) {
            ((092.d)frameLayout$LayoutParams8).LIZ = 8388613;
        }
        new k().LIZ("app:tux_font", (a)new a.c("P1_Semibold"), tuxTextView6, (ViewGroup$LayoutParams)frameLayout$LayoutParams8);
        CTM.LIZ((Object)tuxTextView6, (Object)frameLayout$LayoutParams8);
        b.LIZ((View)tuxTextView6);
        if (((View)tuxTextView6).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)tuxTextView6, (ViewGroup$LayoutParams)frameLayout$LayoutParams8);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(8944);
        return (View)frameLayout;
    }
}
