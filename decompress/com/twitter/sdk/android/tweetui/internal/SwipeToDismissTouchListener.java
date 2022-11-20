// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnTouchListener;

public class SwipeToDismissTouchListener implements View$OnTouchListener
{
    private Callback callback;
    private final float closeThreshold;
    private float initialY;
    private boolean isMoving;
    private float lastX;
    private float lastY;
    private final float maxTranslate;
    private int pointerIndex;
    private int touchSlop;
    
    public SwipeToDismissTouchListener(final Callback callback, final int n, final float n2) {
        this(callback, n, n2, 0.2f * n2);
    }
    
    public SwipeToDismissTouchListener(final Callback callback, final int touchSlop, final float maxTranslate, final float closeThreshold) {
        this.setCallback(callback);
        this.touchSlop = touchSlop;
        this.maxTranslate = maxTranslate;
        this.closeThreshold = closeThreshold;
    }
    
    public static Callback access$000(final SwipeToDismissTouchListener swipeToDismissTouchListener) {
        return swipeToDismissTouchListener.callback;
    }
    
    public static SwipeToDismissTouchListener createFromView(final View view, final Callback callback) {
        return new SwipeToDismissTouchListener(callback, ViewConfiguration.get(view.getContext()).getScaledTouchSlop(), view.getContext().getResources().getDisplayMetrics().heightPixels * 0.5f);
    }
    
    public float bound(final float n) {
        final float maxTranslate = this.maxTranslate;
        if (n < -maxTranslate) {
            return -maxTranslate;
        }
        if (n > maxTranslate) {
            return maxTranslate;
        }
        return n;
    }
    
    public double calculateTension(float closeThreshold) {
        final float abs = Math.abs(closeThreshold);
        closeThreshold = this.closeThreshold;
        return 1.0 - Math.pow(abs, 2.0) / Math.pow(closeThreshold * 2.0f, 2.0);
    }
    
    public boolean handleTouchEvent(final View view, final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean b = false;
        boolean b2;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            b2 = b;
                            return b2;
                        }
                        this.settleView(view);
                        this.isMoving = false;
                        this.pointerIndex = -1;
                        b2 = b;
                        return b2;
                    }
                }
                else {
                    final float rawX = motionEvent.getRawX();
                    final float rawY = motionEvent.getRawY();
                    final float initialY = this.initialY;
                    final float lastX = this.lastX;
                    final float n = rawY - this.lastY;
                    this.lastX = rawX;
                    this.lastY = rawY;
                    b2 = b;
                    if (this.isValidPointer(motionEvent)) {
                        if (!this.isMoving) {
                            b2 = b;
                            if (!this.hasMovedEnoughInProperYDirection(rawY - initialY)) {
                                return b2;
                            }
                            b2 = b;
                            if (!this.hasMovedMoreInYDirectionThanX(rawX - lastX, n)) {
                                return b2;
                            }
                        }
                        this.isMoving = true;
                        this.moveView(view, n);
                        b2 = b;
                        return b2;
                    }
                    return b2;
                }
            }
            b2 = (this.isValidPointer(motionEvent) && this.isMoving && this.settleOrCloseView(view));
            this.isMoving = false;
        }
        else {
            this.lastX = motionEvent.getRawX();
            final float rawY2 = motionEvent.getRawY();
            this.lastY = rawY2;
            this.initialY = rawY2;
            this.isMoving = false;
            this.pointerIndex = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            b2 = b;
        }
        return b2;
    }
    
    public boolean hasMovedEnoughInProperYDirection(final float n) {
        return Math.abs(n) > this.touchSlop;
    }
    
    public boolean hasMovedMoreInYDirectionThanX(final float n, final float n2) {
        return Math.abs(n2) > Math.abs(n);
    }
    
    public boolean isMoving() {
        return this.isMoving;
    }
    
    public boolean isValidPointer(final MotionEvent motionEvent) {
        final int pointerIndex = this.pointerIndex;
        boolean b = true;
        if (pointerIndex < 0 || motionEvent.getPointerCount() != 1) {
            b = false;
        }
        return b;
    }
    
    public void moveView(final View view, float bound) {
        final float translationY = view.getTranslationY();
        bound = this.bound(translationY + (float)(this.calculateTension(translationY) * bound));
        view.setTranslationY(bound);
        final Callback callback = this.callback;
        if (callback != null) {
            callback.onMove(bound);
        }
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean b = view instanceof SwipeableViewProvider;
        final boolean b2 = false;
        if ((b && !((SwipeableViewProvider)view).canBeSwiped() && !this.isMoving()) || !this.handleTouchEvent(view, motionEvent)) {
            final boolean b3 = b2;
            if (!view.onTouchEvent(motionEvent)) {
                return b3;
            }
        }
        return true;
    }
    
    public void setCallback(final Callback callback) {
        this.callback = callback;
    }
    
    public boolean settleOrCloseView(final View view) {
        final float translationY = view.getTranslationY();
        final float closeThreshold = this.closeThreshold;
        if (translationY <= closeThreshold && translationY >= -closeThreshold) {
            this.settleView(view);
            return false;
        }
        final Callback callback = this.callback;
        if (callback != null) {
            callback.onDismiss();
        }
        return true;
    }
    
    public void settleView(final View view) {
        if (view.getTranslationY() != 0.0f) {
            final ObjectAnimator setDuration = ObjectAnimator.ofFloat((Object)view, View.TRANSLATION_Y, new float[] { 0.0f }).setDuration(100L);
            ((ValueAnimator)setDuration).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener(this) {
                public final SwipeToDismissTouchListener this$0;
                
                public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                    final float floatValue = (float)valueAnimator.getAnimatedValue();
                    if (SwipeToDismissTouchListener.access$000(this.this$0) != null) {
                        SwipeToDismissTouchListener.access$000(this.this$0).onMove(floatValue);
                    }
                }
            });
            setDuration.start();
        }
    }
    
    public interface Callback
    {
        void onDismiss();
        
        void onMove(final float p0);
    }
    
    public interface SwipeableViewProvider
    {
        boolean canBeSwiped();
    }
}
