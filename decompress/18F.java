// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import android.content.res.Resources;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.a.b.a.a;
import com.ss.android.ugc.aweme.base.ui.b.c;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.b;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 18f implements 0IF
{
    static {
        Covode.recordClassIndex(1944);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(6027);
        final Resources resources = context.getResources();
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -2, (int)TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        final View view = new View(context);
        view.setId(2131368472);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 107.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            relativeLayout$LayoutParams.addRule(21, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            relativeLayout$LayoutParams.addRule(11, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams)) {
            relativeLayout$LayoutParams.addRule(12, -1);
        }
        b.LIZ(view);
        if (view.getParent() == null) {
            ((ViewGroup)relativeLayout).addView(view, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        }
        final VpB vpB = new VpB(context);
        ((View)vpB).setId(2131368728);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(21, -1);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            relativeLayout$LayoutParams2.addRule(11, -1);
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).setMarginEnd((int)TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(relativeLayout$LayoutParams2)) {
            ((ViewGroup$MarginLayoutParams)relativeLayout$LayoutParams2).rightMargin = (int)TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)vpB);
        if (((View)vpB).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)vpB, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        }
        final 2uk 2uk = new 2uk(context, (byte)0);
        ((View)2uk).setId(2131368406);
        ((View)2uk).setFocusable(false);
        ((View)2uk).setFocusableInTouchMode(false);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(0, 2131368472);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(16, 2131368472);
        }
        if (RelativeLayout$LayoutParams.class.isInstance(relativeLayout$LayoutParams3)) {
            relativeLayout$LayoutParams3.addRule(12, -1);
        }
        final SEM sem = new SEM(context);
        ((View)sem).setId(2131368405);
        ((View)sem).setFocusable(false);
        ((View)sem).setFocusableInTouchMode(false);
        final ViewGroup$MarginLayoutParams liz2 = b.LIZ((ViewGroup)2uk, (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        final c c = new c();
        c.LIZ("app:placeholderImage", (a)new a.b("2131233104", "drawable"), (SmartImageView)sem, (ViewGroup$LayoutParams)liz2);
        c.LIZ((SmartImageView)sem, (ViewGroup$LayoutParams)liz2);
        b.LIZ((View)sem);
        if (((View)sem).getParent() == null) {
            ((ViewGroup)2uk).addView((View)sem, (ViewGroup$LayoutParams)liz2);
        }
        final SEM sem2 = new SEM(context);
        ((View)sem2).setId(2131369013);
        ((View)sem2).setFocusable(false);
        ((View)sem2).setFocusableInTouchMode(false);
        ((ImageView)sem2).setVisibility(8);
        final ViewGroup$MarginLayoutParams liz3 = b.LIZ((ViewGroup)2uk, (int)TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(liz3)) {
            ((LinearLayout$LayoutParams)liz3).gravity = 17;
        }
        if (FrameLayout$LayoutParams.class.isInstance(liz3)) {
            ((FrameLayout$LayoutParams)liz3).gravity = 17;
        }
        if (092.d.class.isInstance(liz3)) {
            ((092.d)liz3).LIZ = 17;
        }
        b.LIZ((View)sem2);
        if (((View)sem2).getParent() == null) {
            ((ViewGroup)2uk).addView((View)sem2, (ViewGroup$LayoutParams)liz3);
        }
        b.LIZ((View)2uk);
        if (((View)2uk).getParent() == null) {
            ((ViewGroup)relativeLayout).addView((View)2uk, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
        }
        b.LIZ((View)relativeLayout);
        ((View)relativeLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)relativeLayout);
        }
        MethodCollector.o(6027);
        return (View)relativeLayout;
    }
}
