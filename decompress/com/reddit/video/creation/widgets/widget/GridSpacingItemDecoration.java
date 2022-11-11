// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget;

import androidx.recyclerview.widget.RecyclerView$b0;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView$n;

public class GridSpacingItemDecoration extends RecyclerView$n
{
    private final boolean includeEdge;
    private final int spacing;
    private final int spanCount;
    
    public GridSpacingItemDecoration(final int spanCount, final int spacing, final boolean includeEdge) {
        this.spanCount = spanCount;
        this.spacing = spacing;
        this.includeEdge = includeEdge;
    }
    
    public void getItemOffsets(final Rect rect, final View view, final RecyclerView recyclerView, final RecyclerView$b0 recyclerView$b0) {
        final int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        final int spanCount = this.spanCount;
        final int n = childAdapterPosition % spanCount;
        if (this.includeEdge) {
            final int spacing = this.spacing;
            rect.left = spacing - n * spacing / spanCount;
            rect.right = (n + 1) * spacing / spanCount;
            if (childAdapterPosition < spanCount) {
                rect.top = spacing;
            }
            rect.bottom = spacing;
        }
        else {
            final int spacing2 = this.spacing;
            rect.left = n * spacing2 / spanCount;
            rect.right = spacing2 - (n + 1) * spacing2 / spanCount;
            if (childAdapterPosition >= spanCount) {
                rect.top = spacing2;
            }
        }
    }
}
