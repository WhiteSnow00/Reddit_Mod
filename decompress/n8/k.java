// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import android.content.res.Resources;
import r8.d;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Bitmap;
import android.view.Gravity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import ml0.a;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public final class k extends Drawable implements b, Animatable
{
    public final a f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public Paint n;
    public Rect o;
    
    public k() {
        throw null;
    }
    
    public k(final a f) {
        this.j = true;
        this.l = -1;
        ml0.a.l((Object)f);
        this.f = f;
    }
    
    public final void a() {
        Drawable$Callback drawable$Callback;
        for (drawable$Callback = this.getCallback(); drawable$Callback instanceof Drawable; drawable$Callback = ((Drawable)drawable$Callback).getCallback()) {}
        if (drawable$Callback == null) {
            this.stop();
            this.invalidateSelf();
            return;
        }
        this.invalidateSelf();
        final m a = this.f.a;
        final m.a i = a.i;
        int j;
        if (i != null) {
            j = i.j;
        }
        else {
            j = -1;
        }
        if (j == a.a.d() - 1) {
            ++this.k;
        }
        final int l = this.l;
        if (l != -1 && this.k >= l) {
            this.stop();
        }
    }
    
    public final void b() {
        ml0.a.i(this.i ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f.a.a.d() == 1) {
            this.invalidateSelf();
        }
        else if (!this.g) {
            this.g = true;
            final m a = this.f.a;
            if (a.j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            if (a.c.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            final boolean empty = a.c.isEmpty();
            a.c.add(this);
            if (empty) {
                if (!a.f) {
                    a.f = true;
                    a.j = false;
                    a.a();
                }
            }
            this.invalidateSelf();
        }
    }
    
    public final void draw(final Canvas canvas) {
        if (this.i) {
            return;
        }
        if (this.m) {
            final int intrinsicWidth = this.getIntrinsicWidth();
            final int intrinsicHeight = this.getIntrinsicHeight();
            final Rect bounds = this.getBounds();
            if (this.o == null) {
                this.o = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.o);
            this.m = false;
        }
        final m a = this.f.a;
        final m.a i = a.i;
        Bitmap bitmap;
        if (i != null) {
            bitmap = i.l;
        }
        else {
            bitmap = a.l;
        }
        if (this.o == null) {
            this.o = new Rect();
        }
        final Rect o = this.o;
        if (this.n == null) {
            this.n = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect)null, o, this.n);
    }
    
    public final Drawable$ConstantState getConstantState() {
        return this.f;
    }
    
    public final int getIntrinsicHeight() {
        return this.f.a.q;
    }
    
    public final int getIntrinsicWidth() {
        return this.f.a.p;
    }
    
    @Deprecated
    public final int getOpacity() {
        return -2;
    }
    
    public final boolean isRunning() {
        return this.g;
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.m = true;
    }
    
    public final void setAlpha(final int alpha) {
        if (this.n == null) {
            this.n = new Paint(2);
        }
        this.n.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        if (this.n == null) {
            this.n = new Paint(2);
        }
        this.n.setColorFilter(colorFilter);
    }
    
    public final boolean setVisible(final boolean j, final boolean b) {
        ml0.a.i(this.i ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        if (!(this.j = j)) {
            this.g = false;
            final m a = this.f.a;
            a.c.remove(this);
            if (a.c.isEmpty()) {
                a.f = false;
            }
        }
        else if (this.h) {
            this.b();
        }
        return super.setVisible(j, b);
    }
    
    public final void start() {
        this.h = true;
        this.k = 0;
        if (this.j) {
            this.b();
        }
    }
    
    public final void stop() {
        this.h = false;
        this.g = false;
        final m a = this.f.a;
        a.c.remove(this);
        if (a.c.isEmpty()) {
            a.f = false;
        }
    }
    
    public static final class a extends Drawable$ConstantState
    {
        public final m a;
        
        public a(final r8.d d, final m a) {
            this.a = a;
        }
        
        public final int getChangingConfigurations() {
            return 0;
        }
        
        public final Drawable newDrawable() {
            return new k(this);
        }
        
        public final Drawable newDrawable(final Resources resources) {
            return new k(this);
        }
    }
}
