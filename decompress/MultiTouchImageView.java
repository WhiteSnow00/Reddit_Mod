// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.view.View;
import android.widget.ImageView$ScaleType;
import android.view.ViewParent;
import android.view.MotionEvent;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.ValueAnimator;
import android.view.GestureDetector$OnGestureListener;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.GestureDetector;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.widget.ImageView;

public class MultiTouchImageView extends ImageView implements SwipeToDismissTouchListener$SwipeableViewProvider
{
    private static final float DOUBLE_TAP_SCALE_FACTOR = 2.0f;
    private static final float MINIMUM_SCALE_FACTOR = 1.0f;
    private static final long SCALE_ANIMATION_DURATION = 300L;
    public boolean allowIntercept;
    public final Matrix baseMatrix;
    public final Matrix drawMatrix;
    public final RectF drawRect;
    public final GestureDetector gestureDetector;
    public final float[] matrixValues;
    public final ScaleGestureDetector scaleGestureDetector;
    public final Matrix updateMatrix;
    public final RectF viewRect;
    
    public MultiTouchImageView(final Context context) {
        this(context, null);
    }
    
    public MultiTouchImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MultiTouchImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.drawMatrix = new Matrix();
        this.baseMatrix = new Matrix();
        this.updateMatrix = new Matrix();
        this.viewRect = new RectF();
        this.drawRect = new RectF();
        this.matrixValues = new float[9];
        this.scaleGestureDetector = new ScaleGestureDetector(context, (ScaleGestureDetector$OnScaleGestureListener)new MultiTouchImageView$1(this));
        this.gestureDetector = new GestureDetector(context, (GestureDetector$OnGestureListener)new MultiTouchImageView$2(this));
    }
    
    public void animateScale(final float n, final float n2, final float n3, final float n4) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { n, n2 });
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new MultiTouchImageView$3(this, n3, n4));
        ofFloat.start();
    }
    
    public boolean canBeSwiped() {
        return this.getScale() == 1.0f;
    }
    
    public Matrix getDrawMatrix() {
        this.drawMatrix.set(this.baseMatrix);
        this.drawMatrix.postConcat(this.updateMatrix);
        return this.drawMatrix;
    }
    
    public RectF getDrawRect(final Matrix matrix) {
        final Drawable drawable = this.getDrawable();
        if (drawable != null) {
            this.drawRect.set(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
            matrix.mapRect(this.drawRect);
        }
        return this.drawRect;
    }
    
    public float getScale() {
        this.updateMatrix.getValues(this.matrixValues);
        return this.matrixValues[0];
    }
    
    public void initializeBaseMatrix(final Drawable drawable) {
        final RectF rectF = new RectF(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
        this.baseMatrix.reset();
        this.baseMatrix.setRectToRect(rectF, this.viewRect, Matrix$ScaleToFit.CENTER);
    }
    
    public void initializeViewRect() {
        this.viewRect.set((float)((View)this).getPaddingLeft(), (float)((View)this).getPaddingTop(), (float)(((View)this).getWidth() - ((View)this).getPaddingRight()), (float)(((View)this).getHeight() - ((View)this).getPaddingBottom()));
    }
    
    public boolean isInitializationComplete() {
        final Drawable drawable = this.getDrawable();
        return drawable != null && drawable.getIntrinsicWidth() > 0;
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.isInitializationComplete()) {
            this.initializeViewRect();
            this.initializeBaseMatrix(this.getDrawable());
            this.setImageMatrix();
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean initializationComplete = this.isInitializationComplete();
        boolean b = false;
        if (!initializationComplete) {
            return false;
        }
        this.requestDisallowInterceptTouchEvent(true);
        final boolean onTouchEvent = this.scaleGestureDetector.onTouchEvent(motionEvent);
        if (this.gestureDetector.onTouchEvent(motionEvent) || onTouchEvent || super.onTouchEvent(motionEvent)) {
            b = true;
        }
        return b;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        final ViewParent parent = ((View)this).getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    public void reset() {
        this.updateMatrix.reset();
    }
    
    public void setImageMatrix() {
        this.updateMatrixBounds();
        this.setScaleType(ImageView$ScaleType.MATRIX);
        this.setImageMatrix(this.getDrawMatrix());
    }
    
    public void setScale(final float n, final float n2, final float n3) {
        this.updateMatrix.postScale(n, n, n2, n3);
    }
    
    public void setTranslate(final float n, final float n2) {
        this.updateMatrix.postTranslate(n, n2);
    }
    
    public void updateMatrixBounds() {
        final RectF drawRect = this.getDrawRect(this.getDrawMatrix());
        final float height = drawRect.height();
        final float height2 = this.viewRect.height();
        final float n = 0.0f;
        float n3 = 0.0f;
        Label_0108: {
            float height3;
            float n2;
            if (height <= height2) {
                height3 = (this.viewRect.height() - drawRect.height()) / 2.0f;
                n2 = drawRect.top;
            }
            else {
                final float top = drawRect.top;
                if (top > 0.0f) {
                    n3 = -top;
                    break Label_0108;
                }
                if (drawRect.bottom >= this.viewRect.height()) {
                    n3 = 0.0f;
                    break Label_0108;
                }
                height3 = this.viewRect.height();
                n2 = drawRect.bottom;
            }
            n3 = height3 - n2;
        }
        float n4;
        if (drawRect.width() <= this.viewRect.width()) {
            this.allowIntercept = true;
            n4 = (this.viewRect.width() - drawRect.width()) / 2.0f - drawRect.left;
        }
        else {
            final float left = drawRect.left;
            if (left > 0.0f) {
                this.allowIntercept = true;
                n4 = -left;
            }
            else if (drawRect.right < this.viewRect.width()) {
                this.allowIntercept = true;
                n4 = this.viewRect.width() - drawRect.right;
            }
            else {
                this.allowIntercept = false;
                n4 = n;
            }
        }
        this.setTranslate(n4, n3);
    }
}
