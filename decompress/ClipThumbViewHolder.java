// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.clipseekbar;

import com.reddit.video.creation.widgets.utils.ImageViewUtils;
import android.widget.ImageView;
import sg2.e;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$f0;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/clipseekbar/ClipThumbViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/Frame;", "frame", "Lhg2/j;", "bind", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Companion", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class ClipThumbViewHolder extends RecyclerView$f0
{
    public static final ClipThumbViewHolder.ClipThumbViewHolder$Companion Companion;
    
    static {
        Companion = new ClipThumbViewHolder.ClipThumbViewHolder$Companion((DefaultConstructorMarker)null);
    }
    
    public ClipThumbViewHolder(final View view) {
        e.f((Object)view, "containerView");
        super(view);
    }
    
    public final void bind(final Frame frame) {
        e.f((Object)frame, "frame");
        final ImageView imageView = (ImageView)super.itemView.findViewById(2131429738);
        if (imageView != null) {
            ImageViewUtils.loadThumbnailFromUrlForVideo(imageView, frame.getVideoUri(), frame.getFrameTimeMillis());
        }
    }
}
