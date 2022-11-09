// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.view.ViewStub;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import android.widget.LinearLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.b;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 195 implements 0IF
{
    static {
        Covode.recordClassIndex(1970);
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup, final boolean b) {
        MethodCollector.i(12510);
        final Resources resources = context.getResources();
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setBackgroundColor(resources.getColor(2131099763));
        ((View)frameLayout).setId(2131364307);
        final ViewGroup$MarginLayoutParams liz = b.LIZ(viewGroup, -1, -1);
        final FrameLayout frameLayout2 = new FrameLayout(context);
        ((View)frameLayout2).setId(2131365527);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)frameLayout2);
        if (((View)frameLayout2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout2, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ((View)frameLayout3).setId(2131365523);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)frameLayout3);
        if (((View)frameLayout3).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout3, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        }
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(2131233095);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams3).gravity = 51;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams3)) {
            frameLayout$LayoutParams3.gravity = 51;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams3)) {
            ((092.d)frameLayout$LayoutParams3).LIZ = 51;
        }
        b.LIZ((View)appCompatImageView);
        if (((View)appCompatImageView).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)appCompatImageView, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        }
        final AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(2131233096);
        final FrameLayout$LayoutParams frameLayout$LayoutParams4 = new FrameLayout$LayoutParams(-2, -2);
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams4)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams4).gravity = 53;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams4)) {
            frameLayout$LayoutParams4.gravity = 53;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams4)) {
            ((092.d)frameLayout$LayoutParams4).LIZ = 53;
        }
        b.LIZ((View)appCompatImageView2);
        if (((View)appCompatImageView2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)appCompatImageView2, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        }
        final FrameLayout frameLayout4 = new FrameLayout(context);
        ((View)frameLayout4).setId(2131365785);
        final FrameLayout$LayoutParams frameLayout$LayoutParams5 = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)frameLayout4);
        if (((View)frameLayout4).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout4, (ViewGroup$LayoutParams)frameLayout$LayoutParams5);
        }
        final FrameLayout frameLayout5 = new FrameLayout(context);
        ((View)frameLayout5).setId(2131362115);
        final FrameLayout$LayoutParams frameLayout$LayoutParams6 = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)frameLayout5);
        if (((View)frameLayout5).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout5, (ViewGroup$LayoutParams)frameLayout$LayoutParams6);
        }
        final AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context);
        ((View)adHalfWebPageMaskLayer).setId(2131362131);
        final FrameLayout$LayoutParams frameLayout$LayoutParams7 = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)adHalfWebPageMaskLayer);
        if (((View)adHalfWebPageMaskLayer).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)adHalfWebPageMaskLayer, (ViewGroup$LayoutParams)frameLayout$LayoutParams7);
        }
        final AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context);
        ((View)adHalfWebPageContainer).setId(2131362130);
        final FrameLayout$LayoutParams frameLayout$LayoutParams8 = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int)TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        if (LinearLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            ((LinearLayout$LayoutParams)frameLayout$LayoutParams8).gravity = 81;
        }
        if (FrameLayout$LayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            frameLayout$LayoutParams8.gravity = 81;
        }
        if (092.d.class.isInstance(frameLayout$LayoutParams8)) {
            ((092.d)frameLayout$LayoutParams8).LIZ = 81;
        }
        if (ViewGroup$MarginLayoutParams.class.isInstance(frameLayout$LayoutParams8)) {
            ((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams8).bottomMargin = (int)TypedValue.applyDimension(1, -300.0f, resources.getDisplayMetrics());
        }
        b.LIZ((View)adHalfWebPageContainer);
        if (((View)adHalfWebPageContainer).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)adHalfWebPageContainer, (ViewGroup$LayoutParams)frameLayout$LayoutParams8);
        }
        final FrameLayout frameLayout6 = new FrameLayout(context);
        ((View)frameLayout6).setId(2131365408);
        ((View)frameLayout6).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams9 = new FrameLayout$LayoutParams(-1, -1);
        b.LIZ((View)frameLayout6);
        if (((View)frameLayout6).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout6, (ViewGroup$LayoutParams)frameLayout$LayoutParams9);
        }
        final FrameLayout frameLayout7 = new FrameLayout(context);
        ((View)frameLayout7).setId(2131372626);
        ((View)frameLayout7).setVisibility(8);
        final FrameLayout$LayoutParams frameLayout$LayoutParams10 = new FrameLayout$LayoutParams(-2, -2);
        b.LIZ((View)frameLayout7);
        if (((View)frameLayout7).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)frameLayout7, (ViewGroup$LayoutParams)frameLayout$LayoutParams10);
        }
        final ViewStub viewStub = new ViewStub(context);
        ((View)viewStub).setId(2131363866);
        viewStub.setLayoutResource(2131559297);
        final FrameLayout$LayoutParams frameLayout$LayoutParams11 = new FrameLayout$LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        b.LIZ((View)viewStub);
        if (((View)viewStub).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)viewStub, (ViewGroup$LayoutParams)frameLayout$LayoutParams11);
        }
        final ViewStub viewStub2 = new ViewStub(context);
        ((View)viewStub2).setId(2131362036);
        viewStub2.setLayoutResource(2131559587);
        final FrameLayout$LayoutParams frameLayout$LayoutParams12 = new FrameLayout$LayoutParams(-1, -1);
        viewStub2.setInflatedId(-1);
        b.LIZ((View)viewStub2);
        if (((View)viewStub2).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)viewStub2, (ViewGroup$LayoutParams)frameLayout$LayoutParams12);
        }
        b.LIZ((View)frameLayout);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)liz);
        if (viewGroup != null && b) {
            viewGroup.addView((View)frameLayout);
        }
        MethodCollector.o(12510);
        return (View)frameLayout;
    }
}
