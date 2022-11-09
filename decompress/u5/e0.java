// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.Animator$AnimatorListener;
import c1.c;
import android.view.ViewGroupOverlay;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import a4.y0;
import android.graphics.Picture;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

public abstract class e0 extends m
{
    public static final String[] F;
    public int E;
    
    static {
        F = new String[] { "android:visibility:visibility", "android:visibility:parent" };
    }
    
    public e0() {
        this.E = 3;
    }
    
    public static b L(final t t, final t t2) {
        final b b = new b();
        b.a = false;
        b.b = false;
        if (t != null && t.a.containsKey("android:visibility:visibility")) {
            b.c = t.a.get("android:visibility:visibility");
            b.e = t.a.get("android:visibility:parent");
        }
        else {
            b.c = -1;
            b.e = null;
        }
        if (t2 != null && t2.a.containsKey("android:visibility:visibility")) {
            b.d = t2.a.get("android:visibility:visibility");
            b.f = t2.a.get("android:visibility:parent");
        }
        else {
            b.d = -1;
            b.f = null;
        }
        if (t != null && t2 != null) {
            final int c = b.c;
            final int d = b.d;
            if (c == d && b.e == b.f) {
                return b;
            }
            if (c != d) {
                if (c == 0) {
                    b.b = false;
                    b.a = true;
                }
                else if (d == 0) {
                    b.b = true;
                    b.a = true;
                }
            }
            else if (b.f == null) {
                b.b = false;
                b.a = true;
            }
            else if (b.e == null) {
                b.b = true;
                b.a = true;
            }
        }
        else if (t == null && b.d == 0) {
            b.b = true;
            b.a = true;
        }
        else if (t2 == null && b.c == 0) {
            b.b = false;
            b.a = true;
        }
        return b;
    }
    
    public final void K(final t t) {
        t.a.put("android:visibility:visibility", t.b.getVisibility());
        t.a.put("android:visibility:parent", t.b.getParent());
        final int[] array = new int[2];
        t.b.getLocationOnScreen(array);
        t.a.put("android:visibility:screenLocation", array);
    }
    
    public abstract Animator M(final ViewGroup p0, final View p1, final t p2, final t p3);
    
    public abstract Animator N(final ViewGroup p0, final View p1, final t p2);
    
    @Override
    public void e(final t t) {
        this.K(t);
    }
    
    @Override
    public void h(final t t) {
        this.K(t);
    }
    
    @Override
    public final Animator l(final ViewGroup viewGroup, final t t, final t t2) {
        final b l = L(t, t2);
        if (!l.a || (l.e == null && l.f == null)) {
            return null;
        }
        final boolean b = l.b;
        boolean b2 = true;
        if (b) {
            if ((this.E & 0x1) == 0x1) {
                if (t2 != null) {
                    if (t == null) {
                        final View view = (View)t2.b.getParent();
                        if (L(this.q(view, false), this.t(view, false)).a) {
                            return null;
                        }
                    }
                    return this.M(viewGroup, t2.b, t, t2);
                }
            }
            return null;
        }
        final int d = l.d;
        if ((this.E & 0x2) == 0x2) {
            if (t != null) {
                final View b3 = t.b;
                View b4;
                if (t2 != null) {
                    b4 = t2.b;
                }
                else {
                    b4 = null;
                }
                final View view2 = (View)b3.getTag(2131431073);
                View view3 = null;
                View view4 = null;
                Label_0918: {
                    if (view2 != null) {
                        view3 = null;
                        view4 = view2;
                    }
                    else {
                        boolean b5 = false;
                        View view5 = null;
                        Label_0255: {
                            Label_0252: {
                                Label_0247: {
                                    if (b4 != null && b4.getParent() != null) {
                                        if (d != 4) {
                                            if (b3 != b4) {
                                                break Label_0247;
                                            }
                                        }
                                        b5 = false;
                                        break Label_0252;
                                    }
                                    if (b4 != null) {
                                        view5 = b4;
                                        b5 = false;
                                        b4 = null;
                                        break Label_0255;
                                    }
                                }
                                b5 = true;
                                b4 = null;
                            }
                            view5 = null;
                        }
                        View view8 = null;
                        Label_0909: {
                            if (b5) {
                                if (b3.getParent() == null) {
                                    final View view6 = b3;
                                    b2 = false;
                                    view3 = b4;
                                    view4 = view6;
                                    break Label_0918;
                                }
                                if (b3.getParent() instanceof View) {
                                    final View view7 = (View)b3.getParent();
                                    if (!L(this.t(view7, true), this.q(view7, true)).a) {
                                        final boolean a = u5.s.a;
                                        final Matrix matrix = new Matrix();
                                        matrix.setTranslate((float)(-view7.getScrollX()), (float)(-view7.getScrollY()));
                                        final b0 a2 = u5.x.a;
                                        ((z)a2).S2(b3, matrix);
                                        ((z)a2).T2((View)viewGroup, matrix);
                                        final RectF rectF = new RectF(0.0f, 0.0f, (float)b3.getWidth(), (float)b3.getHeight());
                                        matrix.mapRect(rectF);
                                        final int round = Math.round(rectF.left);
                                        final int round2 = Math.round(rectF.top);
                                        final int round3 = Math.round(rectF.right);
                                        final int round4 = Math.round(rectF.bottom);
                                        final ImageView imageView = new ImageView(b3.getContext());
                                        imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
                                        boolean b6;
                                        boolean attachedToWindow;
                                        if (u5.s.a) {
                                            b6 = (b3.isAttachedToWindow() ^ true);
                                            attachedToWindow = ((View)viewGroup).isAttachedToWindow();
                                        }
                                        else {
                                            b6 = (attachedToWindow = false);
                                        }
                                        final boolean b7 = u5.s.b;
                                        Bitmap imageBitmap = null;
                                        Label_0803: {
                                            ViewGroup viewGroup2;
                                            int indexOfChild;
                                            if (b7 && b6) {
                                                if (!attachedToWindow) {
                                                    imageBitmap = null;
                                                    break Label_0803;
                                                }
                                                viewGroup2 = (ViewGroup)b3.getParent();
                                                indexOfChild = viewGroup2.indexOfChild(b3);
                                                viewGroup.getOverlay().add(b3);
                                            }
                                            else {
                                                viewGroup2 = null;
                                                indexOfChild = 0;
                                            }
                                            final int round5 = Math.round(rectF.width());
                                            final int round6 = Math.round(rectF.height());
                                            Bitmap bitmap;
                                            if (round5 > 0 && round6 > 0) {
                                                final float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                final int round7 = Math.round(round5 * min);
                                                final int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (u5.s.c) {
                                                    final Picture picture = new Picture();
                                                    final Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    b3.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = y0.a(picture);
                                                }
                                                else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap$Config.ARGB_8888);
                                                    final Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    b3.draw(canvas);
                                                }
                                            }
                                            else {
                                                bitmap = null;
                                            }
                                            imageBitmap = bitmap;
                                            if (b7) {
                                                imageBitmap = bitmap;
                                                if (b6) {
                                                    viewGroup.getOverlay().remove(b3);
                                                    viewGroup2.addView(b3, indexOfChild);
                                                    imageBitmap = bitmap;
                                                }
                                            }
                                        }
                                        if (imageBitmap != null) {
                                            imageView.setImageBitmap(imageBitmap);
                                        }
                                        ((View)imageView).measure(View$MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View$MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        ((View)imageView).layout(round, round2, round3, round4);
                                        view8 = (View)imageView;
                                        break Label_0909;
                                    }
                                    final int id = view7.getId();
                                    view8 = view5;
                                    if (view7.getParent() != null) {
                                        break Label_0909;
                                    }
                                    view8 = view5;
                                    if (id != -1) {
                                        ((View)viewGroup).findViewById(id);
                                        view8 = view5;
                                    }
                                    break Label_0909;
                                }
                            }
                            view8 = view5;
                        }
                        view3 = b4;
                        b2 = false;
                        view4 = view8;
                    }
                }
                if (view4 != null) {
                    if (!b2) {
                        final int[] array = t.a.get("android:visibility:screenLocation");
                        final int n = array[0];
                        final int n2 = array[1];
                        final int[] array2 = new int[2];
                        ((View)viewGroup).getLocationOnScreen(array2);
                        view4.offsetLeftAndRight(n - array2[0] - view4.getLeft());
                        view4.offsetTopAndBottom(n2 - array2[1] - view4.getTop());
                        ((ViewGroupOverlay)new c1.c(viewGroup).f).add(view4);
                    }
                    Animator animator2;
                    final Animator animator = animator2 = this.N(viewGroup, view4, t);
                    if (b2) {
                        return animator2;
                    }
                    if (animator == null) {
                        ((ViewGroupOverlay)new c1.c(viewGroup).f).remove(view4);
                        animator2 = animator;
                        return animator2;
                    }
                    b3.setTag(2131431073, (Object)view4);
                    this.a((d)new d0(this, viewGroup, view4, b3));
                    animator2 = animator;
                    return animator2;
                }
                else if (view3 != null) {
                    final int visibility = view3.getVisibility();
                    final b0 a3 = u5.x.a;
                    a3.h2(0, view3);
                    final Animator animator2 = this.N(viewGroup, view3, t);
                    if (animator2 != null) {
                        final a a4 = new a(view3, d);
                        animator2.addListener((Animator$AnimatorListener)a4);
                        animator2.addPauseListener((Animator$AnimatorPauseListener)a4);
                        this.a((d)a4);
                        return animator2;
                    }
                    a3.h2(visibility, view3);
                    return animator2;
                }
            }
        }
        return null;
    }
    
    @Override
    public final String[] s() {
        return e0.F;
    }
    
    @Override
    public final boolean u(final t t, final t t2) {
        final boolean b = false;
        if (t == null && t2 == null) {
            return false;
        }
        if (t != null && t2 != null && t2.a.containsKey("android:visibility:visibility") != t.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        final b l = L(t, t2);
        boolean b2 = b;
        if (l.a) {
            if (l.c != 0) {
                b2 = b;
                if (l.d != 0) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public static final class a extends AnimatorListenerAdapter implements d
    {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f;
        
        public a(final View a, final int b) {
            this.f = false;
            this.a = a;
            this.b = b;
            this.c = (ViewGroup)a.getParent();
            this.f(this.d = true);
        }
        
        public final void a(final m m) {
            if (!this.f) {
                u5.x.a.h2(this.b, this.a);
                final ViewGroup c = this.c;
                if (c != null) {
                    ((View)c).invalidate();
                }
            }
            this.f(false);
            m.y((d)this);
        }
        
        public final void b(final m m) {
        }
        
        public final void c(final m m) {
            this.f(true);
        }
        
        public final void d(final m m) {
        }
        
        public final void e(final m m) {
            this.f(false);
        }
        
        public final void f(final boolean e) {
            if (this.d && this.e != e) {
                final ViewGroup c = this.c;
                if (c != null) {
                    u5.v.a(c, this.e = e);
                }
            }
        }
        
        public final void onAnimationCancel(final Animator animator) {
            this.f = true;
        }
        
        public final void onAnimationEnd(final Animator animator) {
            if (!this.f) {
                u5.x.a.h2(this.b, this.a);
                final ViewGroup c = this.c;
                if (c != null) {
                    ((View)c).invalidate();
                }
            }
            this.f(false);
        }
        
        public final void onAnimationPause(final Animator animator) {
            if (!this.f) {
                u5.x.a.h2(this.b, this.a);
            }
        }
        
        public final void onAnimationRepeat(final Animator animator) {
        }
        
        public final void onAnimationResume(final Animator animator) {
            if (!this.f) {
                u5.x.a.h2(0, this.a);
            }
        }
        
        public final void onAnimationStart(final Animator animator) {
        }
    }
    
    public static final class b
    {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }
}
