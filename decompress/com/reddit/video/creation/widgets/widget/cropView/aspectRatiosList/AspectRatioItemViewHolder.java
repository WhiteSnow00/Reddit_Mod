// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.cropView.aspectRatiosList;

import android.widget.RelativeLayout;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import n30.b;
import android.view.View;
import kotlin.a;
import android.view.LayoutInflater;
import ng2.e;
import android.view.ViewGroup;
import cg2.j;
import mg2.l;
import cg2.f;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$f0;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/AspectRatioItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/AspectRatioItemViewState;", "aspectRatioItemViewState", "Lcg2/j;", "bind", "Ln30/b;", "binding$delegate", "Lcg2/f;", "getBinding", "()Ln30/b;", "binding", "Landroid/view/ViewGroup;", "parentContainer", "Lkotlin/Function1;", "onItemSelected", "<init>", "(Landroid/view/ViewGroup;Lmg2/l;)V", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class AspectRatioItemViewHolder extends RecyclerView$f0
{
    private final f binding$delegate;
    private final l<AspectRatioItemViewState, j> onItemSelected;
    
    public AspectRatioItemViewHolder(final ViewGroup viewGroup, final l<? super AspectRatioItemViewState, j> onItemSelected) {
        e.f((Object)viewGroup, "parentContainer");
        super(LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131624429, viewGroup, false));
        this.onItemSelected = (l<AspectRatioItemViewState, j>)onItemSelected;
        this.binding$delegate = a.b((mg2.a)new AspectRatioItemViewHolder$binding$2(this));
    }
    
    public static void S0(final AspectRatioItemViewHolder aspectRatioItemViewHolder, final AspectRatioItemViewState aspectRatioItemViewState, final View view) {
        bind$lambda-0(aspectRatioItemViewHolder, aspectRatioItemViewState, view);
    }
    
    private static final void bind$lambda-0(final AspectRatioItemViewHolder aspectRatioItemViewHolder, final AspectRatioItemViewState aspectRatioItemViewState, final View view) {
        e.f((Object)aspectRatioItemViewHolder, "this$0");
        e.f((Object)aspectRatioItemViewState, "$aspectRatioItemViewState");
        final l<AspectRatioItemViewState, j> onItemSelected = aspectRatioItemViewHolder.onItemSelected;
        if (onItemSelected != null) {
            onItemSelected.invoke((Object)aspectRatioItemViewState);
        }
    }
    
    private final b getBinding() {
        return (b)this.binding$delegate.getValue();
    }
    
    public final void bind(final AspectRatioItemViewState aspectRatioItemViewState) {
        e.f((Object)aspectRatioItemViewState, "aspectRatioItemViewState");
        final AppCompatTextView c = this.getBinding().c;
        final Context context = ((View)this.getBinding().a).getContext();
        e.e((Object)context, "binding.root.context");
        c.setText((CharSequence)aspectRatioItemViewState.getItemText(context));
        this.getBinding().c.setTextColor(aspectRatioItemViewState.getItemTextColor());
        final RelativeLayout b = this.getBinding().b;
        final Context context2 = ((View)this.getBinding().a).getContext();
        e.e((Object)context2, "binding.root.context");
        ((View)b).setBackground(aspectRatioItemViewState.getItemBackground(context2));
        super.itemView.setOnClickListener((View$OnClickListener)new ql1.a(29, (Object)this, (Object)aspectRatioItemViewState));
    }
}
