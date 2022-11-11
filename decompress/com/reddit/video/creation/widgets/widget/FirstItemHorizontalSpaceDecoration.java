// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget;

import sg2.e;
import androidx.recyclerview.widget.RecyclerView$b0;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$n;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/FirstItemHorizontalSpaceDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$b0;", "state", "Lhg2/j;", "getItemOffsets", "", "space", "I", "<init>", "(I)V", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class FirstItemHorizontalSpaceDecoration extends RecyclerView$n
{
    private final int space;
    
    public FirstItemHorizontalSpaceDecoration(final int space) {
        this.space = space;
    }
    
    public void getItemOffsets(final Rect rect, final View view, final RecyclerView recyclerView, final RecyclerView$b0 recyclerView$b0) {
        e.f((Object)rect, "outRect");
        e.f((Object)view, "view");
        e.f((Object)recyclerView, "parent");
        e.f((Object)recyclerView$b0, "state");
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = this.space;
        }
        rect.right = 0;
        rect.bottom = 0;
        rect.top = 0;
    }
}
