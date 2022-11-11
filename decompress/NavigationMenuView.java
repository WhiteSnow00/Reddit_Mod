// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.view.menu.j;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements j
{
    public NavigationMenuView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NavigationMenuView(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        this.setLayoutManager((RecyclerView.o)new LinearLayoutManager(context, 1, false));
    }
    
    public final void a(final MenuBuilder menuBuilder) {
    }
    
    public int getWindowAnimations() {
        return 0;
    }
}
