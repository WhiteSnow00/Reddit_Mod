// 
// Decompiled by Procyon v0.6.0
// 

package com.yalantis.ucrop.view;

import android.view.View;
import je2.c;
import ie2.e$a;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.os.Handler;
import android.view.GestureDetector$OnGestureListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.GestureDetector;
import ie2.e;
import android.view.ScaleGestureDetector;
import je2.a;

public class GestureCropImageView extends a
{
    public ScaleGestureDetector K;
    public e L;
    public GestureDetector M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    
    public GestureCropImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public GestureCropImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        this.P = true;
        this.Q = true;
        this.R = 5;
    }
    
    public int getDoubleTapScaleSteps() {
        return this.R;
    }
    
    public float getDoubleTapTargetScale() {
        return this.getCurrentScale() * (float)Math.pow(this.getMaxScale() / this.getMinScale(), 1.0f / this.R);
    }
    
    @Override
    public final void init() {
        super.init();
        this.M = new GestureDetector(((View)this).getContext(), (GestureDetector$OnGestureListener)new GestureCropImageView.GestureCropImageView$a(this), (Handler)null, true);
        this.K = new ScaleGestureDetector(((View)this).getContext(), (ScaleGestureDetector$OnScaleGestureListener)new GestureCropImageView.GestureCropImageView$c(this));
        this.L = new e(new GestureCropImageView.GestureCropImageView$b(this));
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 0xFF) == 0x0) {
            ((View)this).removeCallbacks((Runnable)super.D);
            ((View)this).removeCallbacks((Runnable)super.E);
        }
        if (motionEvent.getPointerCount() > 1) {
            this.N = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.O = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.M.onTouchEvent(motionEvent);
        if (this.Q) {
            this.K.onTouchEvent(motionEvent);
        }
        if (this.P) {
            final e l = this.L;
            l.getClass();
            final int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                l.f = -1;
                            }
                        }
                        else {
                            l.a = motionEvent.getX();
                            l.b = motionEvent.getY();
                            l.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                            l.g = 0.0f;
                            l.h = true;
                        }
                    }
                    else if (l.e != -1 && l.f != -1 && motionEvent.getPointerCount() > l.f) {
                        final float x = motionEvent.getX(l.e);
                        final float y = motionEvent.getY(l.e);
                        final float x2 = motionEvent.getX(l.f);
                        final float y2 = motionEvent.getY(l.f);
                        if (l.h) {
                            l.g = 0.0f;
                            l.h = false;
                        }
                        else {
                            final float g = (float)Math.toDegrees((float)Math.atan2(y2 - y, x2 - x)) % 360.0f - (float)Math.toDegrees((float)Math.atan2(l.b - l.d, l.a - l.c)) % 360.0f;
                            l.g = g;
                            if (g < -180.0f) {
                                l.g = g + 360.0f;
                            }
                            else if (g > 180.0f) {
                                l.g = g - 360.0f;
                            }
                        }
                        final e$a i = l.i;
                        if (i != null) {
                            final GestureCropImageView a = ((GestureCropImageView.GestureCropImageView$b)i).a;
                            final float g2 = l.g;
                            final float n = a.N;
                            final float o = a.O;
                            if (g2 != 0.0f) {
                                a.m.postRotate(g2, n, o);
                                a.setImageMatrix(a.m);
                                final c.a p = a.p;
                                if (p != null) {
                                    a.a(a.m);
                                    p.d();
                                }
                            }
                        }
                        l.a = x2;
                        l.b = y2;
                        l.c = x;
                        l.d = y;
                    }
                }
                else {
                    l.e = -1;
                }
            }
            else {
                l.c = motionEvent.getX();
                l.d = motionEvent.getY();
                l.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                l.g = 0.0f;
                l.h = true;
            }
        }
        if ((motionEvent.getAction() & 0xFF) == 0x1) {
            this.setImageToWrapCropBounds(true);
        }
        return true;
    }
    
    public void setDoubleTapScaleSteps(final int r) {
        this.R = r;
    }
    
    public void setRotateEnabled(final boolean p) {
        this.P = p;
    }
    
    public void setScaleEnabled(final boolean q) {
        this.Q = q;
    }
}
