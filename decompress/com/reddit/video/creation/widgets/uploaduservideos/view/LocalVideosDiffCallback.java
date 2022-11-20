// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.uploaduservideos.view;

import ng2.e;
import com.reddit.video.creation.widgets.uploaduservideos.model.LocalUserVideo;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.n$b;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011" }, d2 = { "Lcom/reddit/video/creation/widgets/uploaduservideos/view/LocalVideosDiffCallback;", "Landroidx/recyclerview/widget/n$b;", "", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "getOldListSize", "getNewListSize", "", "Lcom/reddit/video/creation/widgets/uploaduservideos/model/LocalUserVideo;", "oldItems", "Ljava/util/List;", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class LocalVideosDiffCallback extends n$b
{
    public static final int $stable = 8;
    private final List<LocalUserVideo> newItems;
    private final List<LocalUserVideo> oldItems;
    
    public LocalVideosDiffCallback(final List<LocalUserVideo> oldItems, final List<LocalUserVideo> newItems) {
        e.f((Object)oldItems, "oldItems");
        e.f((Object)newItems, "newItems");
        this.oldItems = oldItems;
        this.newItems = newItems;
    }
    
    public boolean areContentsTheSame(final int n, final int n2) {
        return e.a((Object)this.oldItems.get(n), (Object)this.newItems.get(n2));
    }
    
    public boolean areItemsTheSame(final int n, final int n2) {
        return e.a((Object)this.oldItems.get(n).getUri(), (Object)this.newItems.get(n2).getUri());
    }
    
    public int getNewListSize() {
        return this.newItems.size();
    }
    
    public int getOldListSize() {
        return this.oldItems.size();
    }
}
