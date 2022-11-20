// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import java.util.Iterator;
import z3.c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$b0;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Canvas;
import java.util.Calendar;
import androidx.recyclerview.widget.RecyclerView$n;

public final class h extends RecyclerView$n
{
    public final Calendar f;
    public final Calendar g;
    public final MaterialCalendar h;
    
    public h(final MaterialCalendar h) {
        this.h = h;
        this.f = a0.d((Calendar)null);
        this.g = a0.d((Calendar)null);
    }
    
    public final void onDraw(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView$b0 recyclerView$b0) {
        if (recyclerView.getAdapter() instanceof c0) {
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                final c0 c0 = (c0)recyclerView.getAdapter();
                final GridLayoutManager gridLayoutManager = (GridLayoutManager)recyclerView.getLayoutManager();
                final Iterator iterator = this.h.h.I0().iterator();
                while (iterator.hasNext()) {
                    ((c<?, ?>)iterator.next()).getClass();
                }
            }
        }
    }
}
