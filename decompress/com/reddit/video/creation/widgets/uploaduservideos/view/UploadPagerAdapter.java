// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.uploaduservideos.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.RecyclerView$f0;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.view.View;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$Adapter;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/creation/widgets/uploaduservideos/view/UploadPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reddit/video/creation/widgets/uploaduservideos/view/UploadPagerAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "viewHolder", "position", "Lcg2/j;", "onBindViewHolder", "getItemCount", "Landroid/view/View;", "videoView", "Landroid/view/View;", "photoView", "<init>", "(Landroid/view/View;Landroid/view/View;)V", "Companion", "ViewHolder", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class UploadPagerAdapter extends RecyclerView$Adapter<ViewHolder>
{
    public static final int $stable;
    public static final UploadPagerAdapter.UploadPagerAdapter$Companion Companion;
    public static final int VIDEO_TAB_POSITION = 0;
    private final View photoView;
    private final View videoView;
    
    static {
        Companion = new UploadPagerAdapter.UploadPagerAdapter$Companion((DefaultConstructorMarker)null);
        $stable = 8;
    }
    
    public UploadPagerAdapter(final View videoView, final View photoView) {
        e.f((Object)videoView, "videoView");
        e.f((Object)photoView, "photoView");
        this.videoView = videoView;
        this.photoView = photoView;
    }
    
    public int getItemCount() {
        return 2;
    }
    
    public /* bridge */ void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, final int n) {
        this.onBindViewHolder((ViewHolder)recyclerView$f0, n);
    }
    
    public void onBindViewHolder(final ViewHolder viewHolder, final int n) {
        e.f((Object)viewHolder, "viewHolder");
        if (n == 0) {
            viewHolder.getView().addView(this.videoView, (ViewGroup$LayoutParams)new RecyclerView$p(-1, -1));
        }
        else {
            viewHolder.getView().addView(this.photoView, (ViewGroup$LayoutParams)new RecyclerView$p(-1, -1));
        }
    }
    
    public /* bridge */ RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return this.onCreateViewHolder(viewGroup, n);
    }
    
    public ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        e.f((Object)viewGroup, "viewGroup");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131625569, viewGroup, false);
        e.d((Object)inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new ViewHolder((ViewGroup)inflate);
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/reddit/video/creation/widgets/uploaduservideos/view/UploadPagerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "view", "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class ViewHolder extends RecyclerView$f0
    {
        public static final int $stable = 8;
        private final ViewGroup view;
        
        public ViewHolder(final ViewGroup view) {
            e.f((Object)view, "view");
            super((View)view);
            this.view = view;
        }
        
        public final ViewGroup getView() {
            return this.view;
        }
    }
}
