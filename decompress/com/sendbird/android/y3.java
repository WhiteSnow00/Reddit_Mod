// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.ArrayList;

public final class y3 implements Runnable
{
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;
    public final /* synthetic */ a4 j;
    
    public y3(final a4 j, final ArrayList f, final ArrayList g, final boolean h, final String i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        this.j.l.a(this.f, this.g, this.h, this.i, (SendBirdException)null);
    }
}
