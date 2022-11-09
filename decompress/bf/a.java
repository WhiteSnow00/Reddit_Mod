// 
// Decompiled by Procyon v0.6.0
// 

package bf;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.graphics.ColorFilter;
import java.util.WeakHashMap;
import a4.p0;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.content.res.Resources;
import sf.d;
import android.graphics.Paint$Align;
import qf.g;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import vf.f;
import android.content.Context;
import java.lang.ref.WeakReference;
import qf.f$b;
import android.graphics.drawable.Drawable;

public final class a extends Drawable implements f$b
{
    public final WeakReference<Context> f;
    public final f g;
    public final qf.f h;
    public final Rect i;
    public final float j;
    public final float k;
    public final float l;
    public final a m;
    public float n;
    public float o;
    public int p;
    public float q;
    public float r;
    public float s;
    public WeakReference<View> t;
    public WeakReference<ViewGroup> u;
    
    public a(Context context) {
        final WeakReference f = new WeakReference((T)context);
        this.f = f;
        qf.g.c(context, qf.g.b, "Theme.MaterialComponents");
        final Resources resources = context.getResources();
        this.i = new Rect();
        this.g = new f();
        this.j = (float)resources.getDimensionPixelSize(2131166159);
        this.l = (float)resources.getDimensionPixelSize(2131166158);
        this.k = (float)resources.getDimensionPixelSize(2131166162);
        final qf.f h = new qf.f((f$b)this);
        this.h = h;
        ((Paint)h.a).setTextAlign(Paint$Align.CENTER);
        this.m = new a(context);
        context = (Context)f.get();
        if (context != null) {
            final d d = new d(context, 2132017736);
            if (h.f != d) {
                final Context context2 = (Context)f.get();
                if (context2 != null) {
                    h.b(d, context2);
                    this.f();
                }
            }
        }
    }
    
    public final void a() {
        this.invalidateSelf();
    }
    
    public final String b() {
        if (this.d() <= this.p) {
            return Integer.toString(this.d());
        }
        final Context context = this.f.get();
        if (context == null) {
            return "";
        }
        return context.getString(2131955997, new Object[] { this.p, "+" });
    }
    
    public final CharSequence c() {
        if (!this.isVisible()) {
            return null;
        }
        if (!this.e()) {
            return this.m.k;
        }
        if (this.m.l <= 0) {
            return null;
        }
        final Context context = this.f.get();
        if (context == null) {
            return null;
        }
        final int d = this.d();
        final int p = this.p;
        if (d <= p) {
            return context.getResources().getQuantityString(this.m.l, this.d(), new Object[] { this.d() });
        }
        return context.getString(this.m.m, new Object[] { p });
    }
    
    public final int d() {
        if (!this.e()) {
            return 0;
        }
        return this.m.i;
    }
    
    public final void draw(final Canvas canvas) {
        if (!this.getBounds().isEmpty() && this.m.h != 0) {
            if (this.isVisible()) {
                this.g.draw(canvas);
                if (this.e()) {
                    final Rect rect = new Rect();
                    final String b = this.b();
                    ((Paint)this.h.a).getTextBounds(b, 0, b.length(), rect);
                    canvas.drawText(b, this.n, this.o + rect.height() / 2, (Paint)this.h.a);
                }
            }
        }
    }
    
    public final boolean e() {
        return this.m.i != -1;
    }
    
    public final void f() {
        final Context context = this.f.get();
        final WeakReference<View> t = this.t;
        ViewGroup viewGroup = null;
        View view;
        if (t != null) {
            view = t.get();
        }
        else {
            view = null;
        }
        if (context != null) {
            if (view != null) {
                final Rect rect = new Rect();
                rect.set(this.i);
                final Rect rect2 = new Rect();
                view.getDrawingRect(rect2);
                final WeakReference<ViewGroup> u = this.u;
                if (u != null) {
                    viewGroup = (ViewGroup)u.get();
                }
                if (viewGroup != null) {
                    ViewGroup viewGroup2;
                    if ((viewGroup2 = viewGroup) == null) {
                        viewGroup2 = (ViewGroup)view.getParent();
                    }
                    viewGroup2.offsetDescendantRectToMyCoords(view, rect2);
                }
                final a m = this.m;
                final int n = m.n;
                if (n != 8388691 && n != 8388693) {
                    this.o = (float)(rect2.top + m.p);
                }
                else {
                    this.o = (float)(rect2.bottom - m.p);
                }
                if (this.d() <= 9) {
                    float r;
                    if (!this.e()) {
                        r = this.j;
                    }
                    else {
                        r = this.k;
                    }
                    this.q = r;
                    this.s = r;
                    this.r = r;
                }
                else {
                    final float k = this.k;
                    this.q = k;
                    this.s = k;
                    this.r = this.h.a(this.b()) / 2.0f + this.l;
                }
                final Resources resources = context.getResources();
                int n2;
                if (this.e()) {
                    n2 = 2131166160;
                }
                else {
                    n2 = 2131166157;
                }
                final int dimensionPixelSize = resources.getDimensionPixelSize(n2);
                final int n3 = this.m.n;
                if (n3 != 8388659 && n3 != 8388691) {
                    final WeakHashMap a = p0.a;
                    float n4;
                    if (p0.e.d(view) == 0) {
                        n4 = rect2.right + this.r - dimensionPixelSize - this.m.o;
                    }
                    else {
                        n4 = rect2.left - this.r + dimensionPixelSize + this.m.o;
                    }
                    this.n = n4;
                }
                else {
                    final WeakHashMap a2 = p0.a;
                    float n5;
                    if (p0.e.d(view) == 0) {
                        n5 = rect2.left - this.r + dimensionPixelSize + this.m.o;
                    }
                    else {
                        n5 = rect2.right + this.r - dimensionPixelSize - this.m.o;
                    }
                    this.n = n5;
                }
                final Rect i = this.i;
                final float n6 = this.n;
                final float o = this.o;
                final float r2 = this.r;
                final float s = this.s;
                i.set((int)(n6 - r2), (int)(o - s), (int)(n6 + r2), (int)(o + s));
                final f g = this.g;
                g.setShapeAppearanceModel(g.f.a.d(this.q));
                if (!rect.equals((Object)this.i)) {
                    ((Drawable)this.g).setBounds(this.i);
                }
            }
        }
    }
    
    public final int getAlpha() {
        return this.m.h;
    }
    
    public final int getIntrinsicHeight() {
        return this.i.height();
    }
    
    public final int getIntrinsicWidth() {
        return this.i.width();
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final boolean isStateful() {
        return false;
    }
    
    public final boolean onStateChange(final int[] array) {
        return super.onStateChange(array);
    }
    
    public final void setAlpha(final int n) {
        this.m.h = n;
        ((Paint)this.h.a).setAlpha(n);
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
    
    public static final class a implements Parcelable
    {
        public static final Parcelable$Creator<a> CREATOR;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public String k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new a(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new a[n];
                }
            };
        }
        
        public a(final Context context) {
            this.h = 255;
            this.i = -1;
            this.g = new d(context, 2132017736).b.getDefaultColor();
            this.k = context.getString(2131955994);
            this.l = 2131820632;
            this.m = 2131955996;
        }
        
        public a(final Parcel parcel) {
            this.h = 255;
            this.i = -1;
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readString();
            this.l = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeString(this.k.toString());
            parcel.writeInt(this.l);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
        }
    }
}
