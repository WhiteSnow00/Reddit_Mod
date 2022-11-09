// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.tux.a.h.i;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.util.TypedValue;
import android.view.b;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 197 implements 0IF
{
    static {
        Covode.recordClassIndex(1972);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(13194);
        final Resources resources = context.getResources();
        final VideoSeekBarMaskView videoSeekBarMaskView = new VideoSeekBarMaskView(context);
        ((View)videoSeekBarMaskView).setId(2131370975);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final 2UP 2up = new 2UP(context);
        ((View)2up).setId(2131370656);
        ((View)2up).setBackgroundColor(resources.getColor(2131099677));
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)videoSeekBarMaskView, -1, -1);
        final View liz3 = 0I8.LIZ(context, 2131559308, (ViewGroup)2up, false, 0);
        if (liz3.getParent() == null) {
            ((ViewGroup)2up).addView(liz3);
        }
        final View view = new View(context);
        view.setId(2131364311);
        view.setBackgroundResource(2131233074);
        final ViewGroup$MarginLayoutParams liz4 = b.LIZ((ViewGroup)2up, -1, (int)TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)2up).addView(view, (ViewGroup$LayoutParams)liz4);
        }
        final ViewStub viewStub = new ViewStub(context);
        ((View)viewStub).setId(2131371834);
        final ViewGroup$MarginLayoutParams liz5 = b.LIZ((ViewGroup)2up, -1, -1);
        viewStub.setInflatedId(-1);
        b.LIZ((View)viewStub);
        if (((View)viewStub).getParent() == null) {
            ((ViewGroup)2up).addView((View)viewStub, (ViewGroup$LayoutParams)liz5);
        }
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(2131365531);
        final ViewGroup$MarginLayoutParams liz6 = b.LIZ((ViewGroup)2up, -1, -2);
        final Je6 je6 = new Je6(context);
        ((View)je6).setId(2131362642);
        ((View)je6).setPadding((int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        ((AppCompatImageView)je6).setImageResource(2131233093);
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.setMarginStart((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        b.LIZ((View)je6);
        if (((View)je6).getParent() == null) {
            constraintLayout.addView((View)je6, (ViewGroup$LayoutParams)a);
        }
        final 4fg 4fg = new 4fg(context);
        ((View)4fg).setId(2131367107);
        ((ImageView)4fg).setScaleType(ImageView$ScaleType.CENTER);
        ((ImageView)4fg).setVisibility(4);
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.setMarginEnd((int)TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToTop = 0;
        }
        final i i = new i();
        i.LIZ("app:tux_icon", (a)new a.b("2131755601", "raw"), 4fg, (ViewGroup$LayoutParams)a2);
        i.LIZ("app:tux_iconHeight", (a)new a.d("24", "dp"), 4fg, (ViewGroup$LayoutParams)a2);
        i.LIZ("app:tux_iconWidth", (a)new a.d("24", "dp"), 4fg, (ViewGroup$LayoutParams)a2);
        i.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg, (ViewGroup$LayoutParams)a2);
        CTM.LIZ((Object)4fg, (Object)a2);
        b.LIZ((View)4fg);
        if (((View)4fg).getParent() == null) {
            constraintLayout.addView((View)4fg, (ViewGroup$LayoutParams)a2);
        }
        final ViewStub viewStub2 = new ViewStub(context);
        ((View)viewStub2).setId(2131374347);
        final ConstraintLayout.a a3 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a3)) {
            a3.setMarginEnd((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.startToEnd = 2131362642;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            a3.topToTop = 0;
        }
        viewStub2.setInflatedId(-1);
        b.LIZ((View)viewStub2);
        if (((View)viewStub2).getParent() == null) {
            constraintLayout.addView((View)viewStub2, (ViewGroup$LayoutParams)a3);
        }
        final ViewStub viewStub3 = new ViewStub(context);
        ((View)viewStub3).setId(2131365532);
        final ConstraintLayout.a a4 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            a4.topToTop = 0;
        }
        viewStub3.setInflatedId(-1);
        b.LIZ((View)viewStub3);
        if (((View)viewStub3).getParent() == null) {
            constraintLayout.addView((View)viewStub3, (ViewGroup$LayoutParams)a4);
        }
        final ViewStub viewStub4 = new ViewStub(context);
        ((View)viewStub4).setId(2131365530);
        viewStub4.setLayoutResource(2131559602);
        final ConstraintLayout.a a5 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            a5.topToTop = 0;
        }
        viewStub4.setInflatedId(-1);
        b.LIZ((View)viewStub4);
        if (((View)viewStub4).getParent() == null) {
            constraintLayout.addView((View)viewStub4, (ViewGroup$LayoutParams)a5);
        }
        final 4fg 4fg2 = new 4fg(context);
        ((View)4fg2).setId(2131363579);
        ((ImageView)4fg2).setVisibility(4);
        final ConstraintLayout.a a6 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup$MarginLayoutParams.class.isInstance(a6)) {
            a6.setMarginEnd((int)TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.bottomToBottom = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            a6.topToTop = 0;
        }
        final i j = new i();
        j.LIZ("app:tux_icon", (a)new a.b("2131755848", "raw"), 4fg2, (ViewGroup$LayoutParams)a6);
        j.LIZ("app:tux_tintColor", (a)new a.b("2130968627", "attr"), 4fg2, (ViewGroup$LayoutParams)a6);
        CTM.LIZ((Object)4fg2, (Object)a6);
        b.LIZ((View)4fg2);
        if (((View)4fg2).getParent() == null) {
            constraintLayout.addView((View)4fg2, (ViewGroup$LayoutParams)a6);
        }
        b.LIZ((View)constraintLayout);
        if (((View)constraintLayout).getParent() == null) {
            ((ViewGroup)2up).addView((View)constraintLayout, (ViewGroup$LayoutParams)liz6);
        }
        final ViewStub viewStub5 = new ViewStub(context);
        ((View)viewStub5).setId(2131365528);
        viewStub5.setLayoutResource(2131559603);
        final ViewGroup$MarginLayoutParams liz7 = b.LIZ((ViewGroup)2up, -2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz7)) {
            ((LinearLayout$LayoutParams)liz7).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz7)) {
            ((FrameLayout$LayoutParams)liz7).gravity = 17;
        }
        if (092.d.class.isInstance(liz7)) {
            ((092.d)liz7).LIZ = 17;
        }
        viewStub5.setInflatedId(-1);
        b.LIZ((View)viewStub5);
        if (((View)viewStub5).getParent() == null) {
            ((ViewGroup)2up).addView((View)viewStub5, (ViewGroup$LayoutParams)liz7);
        }
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setId(2131362892);
        final ViewGroup$MarginLayoutParams liz8 = b.LIZ((ViewGroup)2up, -1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz8)) {
            ((LinearLayout$LayoutParams)liz8).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz8)) {
            ((FrameLayout$LayoutParams)liz8).gravity = 80;
        }
        if (092.d.class.isInstance(liz8)) {
            ((092.d)liz8).LIZ = 80;
        }
        final FrameLayout frameLayout2 = new FrameLayout(context);
        ((View)frameLayout2).setId(2131366263);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams)) {
            frameLayout$LayoutParams.gravity = 80;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams)) {
            ((092.d)frameLayout$LayoutParams).LIZ = 80;
        }
        b.LIZ((View)frameLayout2);
        if (((View)frameLayout2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout2, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        b.LIZ((View)frameLayout);
        if (((View)frameLayout).getParent() == null) {
            ((ViewGroup)2up).addView((View)frameLayout, (ViewGroup$LayoutParams)liz8);
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ((View)frameLayout3).setId(2131370978);
        final ViewGroup$MarginLayoutParams liz9 = b.LIZ((ViewGroup)2up, -1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz9)) {
            ((LinearLayout$LayoutParams)liz9).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz9)) {
            ((FrameLayout$LayoutParams)liz9).gravity = 80;
        }
        if (092.d.class.isInstance(liz9)) {
            ((092.d)liz9).LIZ = 80;
        }
        b.LIZ((View)frameLayout3);
        if (((View)frameLayout3).getParent() == null) {
            ((ViewGroup)2up).addView((View)frameLayout3, (ViewGroup$LayoutParams)liz9);
        }
        final View liz10 = 0I8.LIZ(context, 2131559355, (ViewGroup)2up, false, 0);
        if (liz10.getParent() == null) {
            ((ViewGroup)2up).addView(liz10);
        }
        b.LIZ((View)2up);
        if (((View)2up).getParent() == null) {
            ((ViewGroup)videoSeekBarMaskView).addView((View)2up, (ViewGroup$LayoutParams)liz2);
        }
        b.LIZ((View)videoSeekBarMaskView);
        ((View)videoSeekBarMaskView).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)videoSeekBarMaskView);
        }
        MethodCollector.o(13194);
        return (View)videoSeekBarMaskView;
    }
}
