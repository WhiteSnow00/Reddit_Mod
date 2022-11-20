// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.time;

import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public final class a extends View
{
    public final Paint f;
    public boolean g;
    public int h;
    public int i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    
    public a(final Context context) {
        super(context);
        this.f = new Paint();
        this.l = false;
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.getWidth() != 0) {
            if (this.l) {
                if (!this.m) {
                    this.n = this.getWidth() / 2;
                    final int o = this.getHeight() / 2;
                    this.o = o;
                    final int p = (int)(Math.min(this.n, o) * this.j);
                    this.p = p;
                    if (!this.g) {
                        this.o -= (int)((int)(p * this.k) * 0.75);
                    }
                    this.m = true;
                }
                this.f.setColor(this.h);
                canvas.drawCircle((float)this.n, (float)this.o, (float)this.p, this.f);
                this.f.setColor(this.i);
                canvas.drawCircle((float)this.n, (float)this.o, 8.0f, this.f);
            }
        }
    }
}
