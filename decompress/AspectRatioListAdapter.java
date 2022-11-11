// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.cropView.aspectRatiosList;

import java.util.Collection;
import java.util.List;
import android.view.ViewGroup;
import sg2.e;
import androidx.recyclerview.widget.RecyclerView$f0;
import hg2.j;
import rg2.l;
import java.util.ArrayList;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$Adapter;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0011j\b\u0012\u0004\u0012\u00020\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/AspectRatioListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/AspectRatioItemViewHolder;", "", "Lcom/reddit/video/creation/widgets/widget/cropView/aspectRatiosList/AspectRatioItemViewState;", "aspectRatioList", "Lhg2/j;", "updateItemList", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "Lkotlin/Function1;", "onItemSelected", "Lrg2/l;", "getOnItemSelected", "()Lrg2/l;", "setOnItemSelected", "(Lrg2/l;)V", "<init>", "()V", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class AspectRatioListAdapter extends RecyclerView$Adapter<AspectRatioItemViewHolder>
{
    private final ArrayList<AspectRatioItemViewState> aspectRatioList;
    private l<? super AspectRatioItemViewState, j> onItemSelected;
    
    public AspectRatioListAdapter() {
        this.aspectRatioList = new ArrayList<AspectRatioItemViewState>();
    }
    
    public int getItemCount() {
        return this.aspectRatioList.size();
    }
    
    public final l<AspectRatioItemViewState, j> getOnItemSelected() {
        return (l<AspectRatioItemViewState, j>)this.onItemSelected;
    }
    
    public void onBindViewHolder(final AspectRatioItemViewHolder aspectRatioItemViewHolder, final int n) {
        e.f((Object)aspectRatioItemViewHolder, "holder");
        final AspectRatioItemViewState value = this.aspectRatioList.get(n);
        e.e((Object)value, "aspectRatioList[position]");
        aspectRatioItemViewHolder.bind(value);
    }
    
    public AspectRatioItemViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        e.f((Object)viewGroup, "parent");
        return new AspectRatioItemViewHolder(viewGroup, this.onItemSelected);
    }
    
    public final void setOnItemSelected(final l<? super AspectRatioItemViewState, j> onItemSelected) {
        this.onItemSelected = onItemSelected;
    }
    
    public final void updateItemList(final List<AspectRatioItemViewState> list) {
        e.f((Object)list, "aspectRatioList");
        this.aspectRatioList.clear();
        this.aspectRatioList.addAll(list);
        this.notifyDataSetChanged();
    }
}
