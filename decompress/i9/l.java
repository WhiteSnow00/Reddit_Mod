// 
// Decompiled by Procyon v0.6.0
// 

package i9;

import java.util.Iterator;
import java.util.Collection;
import java.lang.ref.WeakReference;
import android.view.ViewGroup$LayoutParams;
import android.view.Display;
import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import android.util.Log;
import java.util.ArrayList;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.drawable.Drawable;
import h9.c;
import android.view.View$OnAttachStateChangeListener;
import ng.f0;
import android.view.View;

@Deprecated
public abstract class l<T extends View, Z> extends i9.a<Z>
{
    public final T g;
    public final a h;
    public k i;
    public boolean j;
    public boolean k;
    
    public l(final T g) {
        f0.a2(g);
        this.g = g;
        this.h = new a(g);
    }
    
    public final void a() {
        final k i = this.i;
        if (i != null) {
            if (!this.k) {
                this.g.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)i);
                this.k = true;
            }
        }
    }
    
    public final void b(final c c) {
        this.g.setTag(2131429244, (Object)c);
    }
    
    public void c(final Drawable drawable) {
        final a h = this.h;
        final ViewTreeObserver viewTreeObserver = h.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)h.d);
        }
        h.d = null;
        h.b.clear();
        if (!this.j) {
            final k i = this.i;
            if (i != null) {
                if (this.k) {
                    this.g.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)i);
                    this.k = false;
                }
            }
        }
    }
    
    public final void e(final i i) {
        this.h.b.remove(i);
    }
    
    public void f(final Drawable drawable) {
        this.a();
    }
    
    public final void g(final i i) {
        final a h = this.h;
        final int c = h.c();
        final int b = h.b();
        final boolean b2 = false;
        final boolean b3 = c > 0 || c == Integer.MIN_VALUE;
        int n = b2 ? 1 : 0;
        if (b3) {
            final boolean b4 = b > 0 || b == Integer.MIN_VALUE;
            n = (b2 ? 1 : 0);
            if (b4) {
                n = 1;
            }
        }
        if (n != 0) {
            i.b(c, b);
        }
        else {
            if (!h.b.contains(i)) {
                h.b.add(i);
            }
            if (h.d == null) {
                h.a.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)(h.d = new a.a(h)));
            }
        }
    }
    
    public final c getRequest() {
        final Object tag = this.g.getTag(2131429244);
        c c = null;
        if (tag != null) {
            if (!(tag instanceof c)) {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
            c = (c)tag;
        }
        return c;
    }
    
    public final void i() {
        this.h.c = true;
    }
    
    public final String toString() {
        final StringBuilder k = a.k("Target for: ");
        k.append(this.g);
        return k.toString();
    }
    
    public static final class a
    {
        public static Integer e;
        public final View a;
        public final ArrayList b;
        public boolean c;
        public l.a.a d;
        
        public a(final View a) {
            this.b = new ArrayList();
            this.a = a;
        }
        
        public final int a(int n, final int n2, final int n3) {
            final int n4 = n2 - n3;
            if (n4 > 0) {
                return n4;
            }
            if (this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            n -= n3;
            if (n > 0) {
                return n;
            }
            if (!this.a.isLayoutRequested() && n2 == -2) {
                if (Log.isLoggable("ViewTarget", 4)) {
                    Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                final Context context = this.a.getContext();
                if (l.a.e == null) {
                    final WindowManager windowManager = (WindowManager)context.getSystemService("window");
                    f0.a2(windowManager);
                    final Display defaultDisplay = windowManager.getDefaultDisplay();
                    final Point point = new Point();
                    defaultDisplay.getSize(point);
                    l.a.e = Math.max(point.x, point.y);
                }
                return l.a.e;
            }
            return 0;
        }
        
        public final int b() {
            final int paddingTop = this.a.getPaddingTop();
            final int paddingBottom = this.a.getPaddingBottom();
            final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
            int height;
            if (layoutParams != null) {
                height = layoutParams.height;
            }
            else {
                height = 0;
            }
            return this.a(this.a.getHeight(), height, paddingBottom + paddingTop);
        }
        
        public final int c() {
            final int paddingLeft = this.a.getPaddingLeft();
            final int paddingRight = this.a.getPaddingRight();
            final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
            int width;
            if (layoutParams != null) {
                width = layoutParams.width;
            }
            else {
                width = 0;
            }
            return this.a(this.a.getWidth(), width, paddingRight + paddingLeft);
        }
        
        public static final class a implements ViewTreeObserver$OnPreDrawListener
        {
            public final WeakReference<l.a> f;
            
            public a(final l.a a) {
                this.f = new WeakReference<l.a>(a);
            }
            
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v("ViewTarget", sb.toString());
                }
                final l.a a = this.f.get();
                if (a != null) {
                    if (!a.b.isEmpty()) {
                        final int c = a.c();
                        final int b = a.b();
                        final boolean b2 = false;
                        final boolean b3 = c > 0 || c == Integer.MIN_VALUE;
                        int n = b2 ? 1 : 0;
                        if (b3) {
                            final boolean b4 = b > 0 || b == Integer.MIN_VALUE;
                            n = (b2 ? 1 : 0);
                            if (b4) {
                                n = 1;
                            }
                        }
                        if (n != 0) {
                            final Iterator iterator = new ArrayList(a.b).iterator();
                            while (iterator.hasNext()) {
                                ((i)iterator.next()).b(c, b);
                            }
                            final ViewTreeObserver viewTreeObserver = a.a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)a.d);
                            }
                            a.d = null;
                            a.b.clear();
                        }
                    }
                }
                return true;
            }
        }
    }
}
