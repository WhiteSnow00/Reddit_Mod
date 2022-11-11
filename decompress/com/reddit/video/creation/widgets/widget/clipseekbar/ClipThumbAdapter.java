// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.clipseekbar;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$p;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$f0;
import sg2.e;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$Adapter;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/clipseekbar/ClipThumbAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/ClipThumbViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lhg2/j;", "onBindViewHolder", "getItemCount", "", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/Frame;", "frames", "Ljava/util/List;", "itemWidthPx", "I", "<init>", "(Ljava/util/List;I)V", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class ClipThumbAdapter extends RecyclerView$Adapter<ClipThumbViewHolder>
{
    private final List<Frame> frames;
    private final int itemWidthPx;
    
    public ClipThumbAdapter(final List<Frame> frames, final int itemWidthPx) {
        e.f((Object)frames, "frames");
        this.frames = frames;
        this.itemWidthPx = itemWidthPx;
    }
    
    public int getItemCount() {
        return this.frames.size();
    }
    
    public void onBindViewHolder(final ClipThumbViewHolder clipThumbViewHolder, final int n) {
        e.f((Object)clipThumbViewHolder, "holder");
        clipThumbViewHolder.bind(this.frames.get(n));
    }
    
    public ClipThumbViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        e.f((Object)viewGroup, "parent");
        final View inflate = ClipThumbViewHolder.Companion.inflate(viewGroup);
        final ViewGroup$LayoutParams layoutParams = inflate.getLayoutParams();
        e.d((Object)layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        final RecyclerView$p layoutParams2 = (RecyclerView$p)layoutParams;
        ((ViewGroup$MarginLayoutParams)layoutParams2).width = this.itemWidthPx;
        inflate.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        return new ClipThumbViewHolder(inflate);
    }
}
