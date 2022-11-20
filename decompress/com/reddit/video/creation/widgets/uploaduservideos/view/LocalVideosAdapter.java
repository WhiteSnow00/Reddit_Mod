// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.uploaduservideos.view;

import androidx.recyclerview.widget.n$b;
import androidx.recyclerview.widget.n;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$f0;
import javax.inject.Inject;
import kotlin.collections.EmptyList;
import ng2.e;
import com.reddit.video.creation.widgets.uploaduservideos.model.LocalUserVideo;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$Adapter;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0017" }, d2 = { "Lcom/reddit/video/creation/widgets/uploaduservideos/view/LocalVideosAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reddit/video/creation/widgets/uploaduservideos/view/LocalVideoViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lcg2/j;", "onBindViewHolder", "getItemCount", "", "Lcom/reddit/video/creation/widgets/uploaduservideos/model/LocalUserVideo;", "localVideos", "setData", "Lcom/reddit/video/creation/widgets/uploaduservideos/view/LocalVideoViewHolderFactory;", "localVideoViewHolderFactory", "Lcom/reddit/video/creation/widgets/uploaduservideos/view/LocalVideoViewHolderFactory;", "Ljava/util/List;", "<init>", "(Lcom/reddit/video/creation/widgets/uploaduservideos/view/LocalVideoViewHolderFactory;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class LocalVideosAdapter extends RecyclerView$Adapter<LocalVideoViewHolder>
{
    private final LocalVideoViewHolderFactory localVideoViewHolderFactory;
    private List<LocalUserVideo> localVideos;
    
    @Inject
    public LocalVideosAdapter(final LocalVideoViewHolderFactory localVideoViewHolderFactory) {
        e.f((Object)localVideoViewHolderFactory, "localVideoViewHolderFactory");
        this.localVideoViewHolderFactory = localVideoViewHolderFactory;
        this.localVideos = (List<LocalUserVideo>)EmptyList.INSTANCE;
    }
    
    public int getItemCount() {
        return this.localVideos.size();
    }
    
    public /* bridge */ void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, final int n) {
        this.onBindViewHolder((LocalVideoViewHolder)recyclerView$f0, n);
    }
    
    public void onBindViewHolder(final LocalVideoViewHolder localVideoViewHolder, final int n) {
        e.f((Object)localVideoViewHolder, "holder");
        LocalVideoViewHolder.bind$default(localVideoViewHolder, this.localVideos.get(n), false, 2, null);
    }
    
    public /* bridge */ RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return this.onCreateViewHolder(viewGroup, n);
    }
    
    public LocalVideoViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        e.f((Object)viewGroup, "parent");
        final LocalVideoViewHolder create = this.localVideoViewHolderFactory.create(viewGroup);
        e.e((Object)create, "localVideoViewHolderFactory.create(parent)");
        return create;
    }
    
    public final void setData(final List<LocalUserVideo> localVideos) {
        e.f((Object)localVideos, "localVideos");
        final List<LocalUserVideo> localVideos2 = this.localVideos;
        this.localVideos = localVideos;
        n.a((n$b)new LocalVideosDiffCallback(localVideos2, localVideos), true).b((RecyclerView$Adapter)this);
    }
}
