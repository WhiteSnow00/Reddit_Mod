// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.view.View;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.x;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

public class y extends LinearLayoutManager
{
    public y(final Context context, final int n) {
        super(context, n, false);
    }
    
    public final void smoothScrollToPosition(final RecyclerView recyclerView, final RecyclerView.b0 b0, final int targetPosition) {
        final x x = new x(((View)recyclerView).getContext()) {
            public final float calculateSpeedPerPixel(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        ((RecyclerView.a0)x).setTargetPosition(targetPosition);
        ((RecyclerView.o)this).startSmoothScroll((RecyclerView.a0)x);
    }
}
