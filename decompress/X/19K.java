// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.widget.LinearLayout;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.tux.a.h.k;
import com.bytedance.tux.input.TuxTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.base.ui.b.c;
import android.util.TypedValue;
import com.bytedance.lighten.loader.SmartImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.FunRootLinearLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 19k implements 0IF
{
    static {
        Covode.recordClassIndex(2011);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(8665);
        final Resources resources = context.getResources();
        final FunRootLinearLayout funRootLinearLayout = new FunRootLinearLayout(context);
        ((View)funRootLinearLayout).setId(2131366521);
        ((LinearLayout)funRootLinearLayout).setOrientation(1);
        ((View)funRootLinearLayout).setBackgroundResource(2131232859);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz)) {
            ((LinearLayout$LayoutParams)liz).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz)) {
            ((FrameLayout$LayoutParams)liz).gravity = 80;
        }
        if (092.d.class.isInstance(liz)) {
            ((092.d)liz).LIZ = 80;
        }
        final ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(2131374086);
        ((View)constraintLayout).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)funRootLinearLayout, -1, -2);
        final SmartImageView smartImageView = new SmartImageView(context);
        ((View)smartImageView).setId(2131374121);
        final ConstraintLayout.a a = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        final c c = new c();
        c.LIZ("app:roundedCornerRadius", (a)new a.d("2", "dp"), smartImageView, (ViewGroup$LayoutParams)a);
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.startToStart = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.topToTop = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a)) {
            a.bottomToBottom = 0;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.leftMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.rightMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a)) {
            a.bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        c.LIZ(smartImageView, (ViewGroup$LayoutParams)a);
        b.LIZ((View)smartImageView);
        if (((View)smartImageView).getParent() == null) {
            constraintLayout.addView((View)smartImageView, (ViewGroup$LayoutParams)a);
        }
        final TuxTextView tuxTextView = new TuxTextView(context);
        ((View)tuxTextView).setId(2131374088);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130968678 });
        ((TextView)tuxTextView).setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        final ConstraintLayout.a a2 = new ConstraintLayout.a((int)TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.startToEnd = 2131374121;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.endToEnd = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.topToTop = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            a2.bottomToBottom = 0;
        }
        new k().LIZ("app:tux_font", (a)new a.c("H3_Regular"), tuxTextView, (ViewGroup$LayoutParams)a2);
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.topMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.rightMargin = (int)TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(a2)) {
            a2.bottomMargin = (int)TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        CTM.LIZ((Object)tuxTextView, (Object)a2);
        b.LIZ((View)tuxTextView);
        if (((View)tuxTextView).getParent() == null) {
            constraintLayout.addView((View)tuxTextView, (ViewGroup$LayoutParams)a2);
        }
        b.LIZ((View)constraintLayout);
        if (((View)constraintLayout).getParent() == null) {
            ((ViewGroup)funRootLinearLayout).addView((View)constraintLayout, (ViewGroup$LayoutParams)liz2);
        }
        final ViewStub viewStub = new ViewStub(context);
        ((View)viewStub).setId(2131371245);
        viewStub.setInflatedId(2131370369);
        viewStub.setLayoutResource(2131560135);
        final ViewGroup$MarginLayoutParams liz3 = b.LIZ((ViewGroup)funRootLinearLayout, -1, -2);
        b.LIZ((View)viewStub);
        if (((View)viewStub).getParent() == null) {
            ((ViewGroup)funRootLinearLayout).addView((View)viewStub, (ViewGroup$LayoutParams)liz3);
        }
        final ViewStub viewStub2 = new ViewStub(context);
        ((View)viewStub2).setId(2131371828);
        viewStub2.setLayoutResource(2131560117);
        viewStub2.setInflatedId(2131364680);
        final ViewGroup$MarginLayoutParams liz4 = b.LIZ((ViewGroup)funRootLinearLayout, -1, -2);
        if (LinearLayout$LayoutParams.class.isInstance(liz4)) {
            ((LinearLayout$LayoutParams)liz4).gravity = 80;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz4)) {
            ((FrameLayout$LayoutParams)liz4).gravity = 80;
        }
        if (092.d.class.isInstance(liz4)) {
            ((092.d)liz4).LIZ = 80;
        }
        b.LIZ((View)viewStub2);
        if (((View)viewStub2).getParent() == null) {
            ((ViewGroup)funRootLinearLayout).addView((View)viewStub2, (ViewGroup$LayoutParams)liz4);
        }
        final ViewStub viewStub3 = new ViewStub(context);
        ((View)viewStub3).setId(2131371826);
        viewStub3.setLayoutResource(2131560115);
        viewStub3.setInflatedId(2131364680);
        final ViewGroup$MarginLayoutParams liz5 = b.LIZ((ViewGroup)funRootLinearLayout, -1, -2);
        b.LIZ((View)viewStub3);
        if (((View)viewStub3).getParent() == null) {
            ((ViewGroup)funRootLinearLayout).addView((View)viewStub3, (ViewGroup$LayoutParams)liz5);
        }
        final ViewStub viewStub4 = new ViewStub(context);
        ((View)viewStub4).setId(2131371827);
        viewStub4.setLayoutResource(2131560116);
        viewStub4.setInflatedId(2131364680);
        final ViewGroup$MarginLayoutParams liz6 = b.LIZ((ViewGroup)funRootLinearLayout, -1, -2);
        b.LIZ((View)viewStub4);
        if (((View)viewStub4).getParent() == null) {
            ((ViewGroup)funRootLinearLayout).addView((View)viewStub4, (ViewGroup$LayoutParams)liz6);
        }
        final Jcq jcq = new Jcq(context);
        ((View)jcq).setId(2131369104);
        final TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[] { 2130968596 });
        ((View)jcq).setBackgroundColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ((View)jcq).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz7 = b.LIZ((ViewGroup)funRootLinearLayout, -1, -2);
        b.LIZ((View)jcq);
        if (((View)jcq).getParent() == null) {
            ((ViewGroup)funRootLinearLayout).addView((View)jcq, (ViewGroup$LayoutParams)liz7);
        }
        b.LIZ((View)funRootLinearLayout);
        ((View)funRootLinearLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)funRootLinearLayout);
        }
        MethodCollector.o(8665);
        return (View)funRootLinearLayout;
    }
}
