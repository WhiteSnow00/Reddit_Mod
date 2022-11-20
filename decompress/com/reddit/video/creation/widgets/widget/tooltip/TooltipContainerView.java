// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.tooltip;

import y72.b;
import android.view.View$OnClickListener;
import s92.g;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.util.AttributeSet;
import ng2.e;
import android.content.Context;
import cg2.j;
import mg2.l;
import kotlin.Metadata;
import androidx.constraintlayout.widget.ConstraintLayout;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B=\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/tooltip/TooltipContainerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Lcom/reddit/video/creation/widgets/widget/tooltip/TooltipContainerView$Options;", "Lcg2/j;", "listener", "Lmg2/l;", "getListener", "()Lmg2/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILmg2/l;)V", "Options", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class TooltipContainerView extends ConstraintLayout
{
    private final l<TooltipContainerView.TooltipContainerView$Options, j> listener;
    
    public TooltipContainerView(final Context context) {
        e.f((Object)context, "context");
        this(context, null, 0, null, 14, null);
    }
    
    public TooltipContainerView(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0, null, 12, null);
    }
    
    public TooltipContainerView(final Context context, final AttributeSet set, final int n) {
        e.f((Object)context, "context");
        this(context, set, n, null, 8, null);
    }
    
    public TooltipContainerView(final Context context, final AttributeSet set, final int n, final l<? super TooltipContainerView.TooltipContainerView$Options, j> listener) {
        e.f((Object)context, "context");
        e.f((Object)listener, "listener");
        super(context, set, n);
        this.listener = (l<TooltipContainerView.TooltipContainerView$Options, j>)listener;
        View.inflate(context, 2131625526, (ViewGroup)this);
        ((View)((View)this).findViewById(2131428800)).setOnClickListener((View$OnClickListener)new g((Object)this, 9));
        ((View)((View)this).findViewById(2131428805)).setOnClickListener((View$OnClickListener)new b((Object)this, 13));
    }
    
    public TooltipContainerView(final Context context, AttributeSet set, int n, l instance, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x2) != 0x0) {
            set = null;
        }
        if ((n2 & 0x4) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x8) != 0x0) {
            instance = (l)TooltipContainerView$1.INSTANCE;
        }
        this(context, set, n, (l<? super TooltipContainerView.TooltipContainerView$Options, j>)instance);
    }
    
    private static final void _init_$lambda-0(final TooltipContainerView tooltipContainerView, final View view) {
        e.f((Object)tooltipContainerView, "this$0");
        tooltipContainerView.listener.invoke((Object)TooltipContainerView.TooltipContainerView$Options.DURATION);
    }
    
    private static final void _init_$lambda-1(final TooltipContainerView tooltipContainerView, final View view) {
        e.f((Object)tooltipContainerView, "this$0");
        tooltipContainerView.listener.invoke((Object)TooltipContainerView.TooltipContainerView$Options.EDIT);
    }
    
    public static void n(final TooltipContainerView tooltipContainerView, final View view) {
        _init_$lambda-0(tooltipContainerView, view);
    }
    
    public static void o(final TooltipContainerView tooltipContainerView, final View view) {
        _init_$lambda-1(tooltipContainerView, view);
    }
    
    public final l<TooltipContainerView.TooltipContainerView$Options, j> getListener() {
        return this.listener;
    }
}
