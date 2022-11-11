// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget;

import androidx.recyclerview.widget.RecyclerView$b0;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$n;

public class ItemOffsetDecoration extends RecyclerView$n
{
    private final int itemOffset;
    
    public ItemOffsetDecoration(final int itemOffset) {
        this.itemOffset = itemOffset;
    }
    
    public ItemOffsetDecoration(final Context context, final int n) {
        this(context.getResources().getDimensionPixelSize(n));
    }
    
    public void getItemOffsets(final Rect rect, final View view, final RecyclerView recyclerView, final RecyclerView$b0 recyclerView$b0) {
        super.getItemOffsets(rect, view, recyclerView, recyclerView$b0);
        rect.set(0, 0, 0, this.itemOffset);
    }
}
