// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.cropView.aspectRatiosList;

import android.widget.TextView;
import android.widget.RelativeLayout;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import android.view.View;
import kotlin.a;
import android.view.LayoutInflater;
import sg2.e;
import android.view.ViewGroup;
import hg2.j;
import rg2.l;
import hg2.f;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$f0;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/AspectRatioItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/AspectRatioItemViewState;", "aspectRatioItemViewState", "Lhg2/j;", "bind", "Li30/a;", "binding$delegate", "Lhg2/f;", "getBinding", "()Li30/a;", "binding", "Landroid/view/ViewGroup;", "parentContainer", "Lkotlin/Function1;", "onItemSelected", "<init>", "(Landroid/view/ViewGroup;Lrg2/l;)V", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class AspectRatioItemViewHolder extends RecyclerView$f0
{
    private final f binding$delegate;
    private final l<AspectRatioItemViewState, j> onItemSelected;
    
    public AspectRatioItemViewHolder(final ViewGroup viewGroup, final l<? super AspectRatioItemViewState, j> onItemSelected) {
        e.f((Object)viewGroup, "parentContainer");
        super(LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131624426, viewGroup, false));
        this.onItemSelected = (l<AspectRatioItemViewState, j>)onItemSelected;
        this.binding$delegate = a.b((rg2.a)new AspectRatioItemViewHolder$binding$2(this));
    }
    
    private static final void bind$lambda-0(final AspectRatioItemViewHolder aspectRatioItemViewHolder, final AspectRatioItemViewState aspectRatioItemViewState, final View view) {
        e.f((Object)aspectRatioItemViewHolder, "this$0");
        e.f((Object)aspectRatioItemViewState, "$aspectRatioItemViewState");
        final l<AspectRatioItemViewState, j> onItemSelected = aspectRatioItemViewHolder.onItemSelected;
        if (onItemSelected != null) {
            onItemSelected.invoke(aspectRatioItemViewState);
        }
    }
    
    private final i30.a getBinding() {
        return this.binding$delegate.getValue();
    }
    
    public final void bind(final AspectRatioItemViewState aspectRatioItemViewState) {
        e.f((Object)aspectRatioItemViewState, "aspectRatioItemViewState");
        final AppCompatTextView c = this.getBinding().c;
        final Context context = ((View)this.getBinding().a).getContext();
        e.e((Object)context, "binding.root.context");
        ((TextView)c).setText((CharSequence)aspectRatioItemViewState.getItemText(context));
        ((TextView)this.getBinding().c).setTextColor(aspectRatioItemViewState.getItemTextColor());
        final RelativeLayout b = this.getBinding().b;
        final Context context2 = ((View)this.getBinding().a).getContext();
        e.e((Object)context2, "binding.root.context");
        ((View)b).setBackground(aspectRatioItemViewState.getItemBackground(context2));
        super.itemView.setOnClickListener((View$OnClickListener)new cs1.f(12, (Object)this, (Object)aspectRatioItemViewState));
    }
}
