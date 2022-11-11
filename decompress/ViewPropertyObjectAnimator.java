// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.contrib.viewpropertyobjectanimator;

import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Collection;
import android.animation.TimeInterpolator;
import android.graphics.Paint;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.util.Property;
import java.util.Map;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.Animator$AnimatorListener;
import java.util.List;
import android.view.animation.Interpolator;

public class ViewPropertyObjectAnimator
{
    private DimensionChangeListener dimensionListener;
    private long duration;
    private Interpolator interpolator;
    private List<Animator$AnimatorListener> listeners;
    private MarginChangeListener marginListener;
    private PaddingChangeListener paddingListener;
    private List<Animator$AnimatorPauseListener> pauseListeners;
    private PercentChangeListener percentListener;
    private Map<Property<View, Float>, PropertyValuesHolder> propertyHoldersMap;
    private ScrollChangeListener scrollListener;
    private long startDelay;
    private List<ValueAnimator$AnimatorUpdateListener> updateListeners;
    private final WeakReference<View> viewRef;
    private boolean withLayer;
    
    private ViewPropertyObjectAnimator(final View view) {
        this.duration = -1L;
        this.startDelay = -1L;
        this.withLayer = false;
        this.listeners = new ArrayList<Animator$AnimatorListener>();
        this.updateListeners = new ArrayList<ValueAnimator$AnimatorUpdateListener>();
        this.pauseListeners = new ArrayList<Animator$AnimatorPauseListener>();
        this.propertyHoldersMap = new HashMap<Property<View, Float>, PropertyValuesHolder>();
        this.viewRef = new WeakReference<View>(view);
    }
    
    public static /* synthetic */ WeakReference access$100(final ViewPropertyObjectAnimator viewPropertyObjectAnimator) {
        return viewPropertyObjectAnimator.viewRef;
    }
    
    public static ViewPropertyObjectAnimator animate(final View view) {
        return new ViewPropertyObjectAnimator(view);
    }
    
    private void animateProperty(final Property<View, Float> property, final float n) {
        if (this.hasView()) {
            this.animatePropertyBetween(property, (float)property.get((Object)this.viewRef.get()), n);
        }
    }
    
    private void animatePropertyBetween(final Property<View, Float> property, final float n, final float n2) {
        this.propertyHoldersMap.remove(property);
        this.propertyHoldersMap.put(property, PropertyValuesHolder.ofFloat((Property)property, new float[] { n, n2 }));
    }
    
    private void animatePropertyBy(final Property<View, Float> property, final float n) {
        if (this.hasView()) {
            final float floatValue = (float)property.get((Object)this.viewRef.get());
            this.animatePropertyBetween(property, floatValue, n + floatValue);
        }
    }
    
    private boolean hasView() {
        return this.viewRef.get() != null;
    }
    
    private boolean initDimensionListener() {
        if (this.dimensionListener == null) {
            if (!this.hasView()) {
                return false;
            }
            this.dimensionListener = new DimensionChangeListener(this.viewRef.get());
        }
        return true;
    }
    
    private boolean initMarginListener() {
        if (this.marginListener == null) {
            if (!this.hasView()) {
                return false;
            }
            this.marginListener = new MarginChangeListener(this.viewRef.get());
        }
        return true;
    }
    
    private boolean initPaddingListener() {
        if (this.paddingListener == null) {
            if (!this.hasView()) {
                return false;
            }
            this.paddingListener = new PaddingChangeListener(this.viewRef.get());
        }
        return true;
    }
    
    private boolean initPercentListener() {
        if (this.percentListener == null) {
            if (!this.hasView()) {
                return false;
            }
            this.percentListener = new PercentChangeListener(this.viewRef.get());
        }
        return true;
    }
    
    private boolean initScrollListener() {
        if (this.scrollListener == null) {
            if (!this.hasView()) {
                return false;
            }
            this.scrollListener = new ScrollChangeListener(this.viewRef.get());
        }
        return true;
    }
    
    private static boolean isAttachedToWindow(final View view) {
        return view.isAttachedToWindow();
    }
    
    public ViewPropertyObjectAnimator addListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.listeners.add(animator$AnimatorListener);
        return this;
    }
    
    public ViewPropertyObjectAnimator addPauseListener(final Animator$AnimatorPauseListener animator$AnimatorPauseListener) {
        this.pauseListeners.add(animator$AnimatorPauseListener);
        return this;
    }
    
    public ViewPropertyObjectAnimator addUpdateListener(final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        this.updateListeners.add(valueAnimator$AnimatorUpdateListener);
        return this;
    }
    
    public ViewPropertyObjectAnimator alpha(final float n) {
        this.animateProperty((Property<View, Float>)View.ALPHA, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator alphaBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.ALPHA, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator aspectRatio(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.aspectRatio(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator aspectRatioBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.aspectRatioBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator bottomMargin(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.bottomMargin(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator bottomMarginBy(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.bottomMarginBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator bottomMarginPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.bottomMarginPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator bottomMarginPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.bottomMarginPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator bottomPadding(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.bottomPadding(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator bottomPaddingBy(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.bottomPaddingBy(n);
        }
        return this;
    }
    
    public ObjectAnimator get() {
        if (this.hasView()) {
            final Collection<PropertyValuesHolder> values = this.propertyHoldersMap.values();
            final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.viewRef.get(), (PropertyValuesHolder[])values.toArray(new PropertyValuesHolder[values.size()]));
            if (this.withLayer) {
                ((Animator)ofPropertyValuesHolder).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                    public int currentLayerType = 0;
                    
                    public void onAnimationEnd(final Animator animator) {
                        if (ViewPropertyObjectAnimator.this.hasView()) {
                            ((View)ViewPropertyObjectAnimator.access$100(ViewPropertyObjectAnimator.this).get()).setLayerType(this.currentLayerType, (Paint)null);
                        }
                    }
                    
                    public void onAnimationStart(final Animator animator) {
                        if (ViewPropertyObjectAnimator.this.hasView()) {
                            final View view = (View)ViewPropertyObjectAnimator.access$100(ViewPropertyObjectAnimator.this).get();
                            this.currentLayerType = view.getLayerType();
                            view.setLayerType(2, (Paint)null);
                            if (isAttachedToWindow(view)) {
                                view.buildLayer();
                            }
                        }
                    }
                });
            }
            final long startDelay = this.startDelay;
            if (startDelay != -1L) {
                ((Animator)ofPropertyValuesHolder).setStartDelay(startDelay);
            }
            final long duration = this.duration;
            if (duration != -1L) {
                ofPropertyValuesHolder.setDuration(duration);
            }
            final Interpolator interpolator = this.interpolator;
            if (interpolator != null) {
                ((Animator)ofPropertyValuesHolder).setInterpolator((TimeInterpolator)interpolator);
            }
            final Iterator<Animator$AnimatorListener> iterator = this.listeners.iterator();
            while (iterator.hasNext()) {
                ((Animator)ofPropertyValuesHolder).addListener((Animator$AnimatorListener)iterator.next());
            }
            final MarginChangeListener marginListener = this.marginListener;
            if (marginListener != null) {
                ((ValueAnimator)ofPropertyValuesHolder).addUpdateListener((ValueAnimator$AnimatorUpdateListener)marginListener);
            }
            final DimensionChangeListener dimensionListener = this.dimensionListener;
            if (dimensionListener != null) {
                ((ValueAnimator)ofPropertyValuesHolder).addUpdateListener((ValueAnimator$AnimatorUpdateListener)dimensionListener);
            }
            final PaddingChangeListener paddingListener = this.paddingListener;
            if (paddingListener != null) {
                ((ValueAnimator)ofPropertyValuesHolder).addUpdateListener((ValueAnimator$AnimatorUpdateListener)paddingListener);
            }
            final ScrollChangeListener scrollListener = this.scrollListener;
            if (scrollListener != null) {
                ((ValueAnimator)ofPropertyValuesHolder).addUpdateListener((ValueAnimator$AnimatorUpdateListener)scrollListener);
            }
            final PercentChangeListener percentListener = this.percentListener;
            if (percentListener != null) {
                ((ValueAnimator)ofPropertyValuesHolder).addUpdateListener((ValueAnimator$AnimatorUpdateListener)percentListener);
            }
            final Iterator<ValueAnimator$AnimatorUpdateListener> iterator2 = this.updateListeners.iterator();
            while (iterator2.hasNext()) {
                ((ValueAnimator)ofPropertyValuesHolder).addUpdateListener((ValueAnimator$AnimatorUpdateListener)iterator2.next());
            }
            final Iterator<Animator$AnimatorPauseListener> iterator3 = this.pauseListeners.iterator();
            while (iterator3.hasNext()) {
                ((Animator)ofPropertyValuesHolder).addPauseListener((Animator$AnimatorPauseListener)iterator3.next());
            }
            return ofPropertyValuesHolder;
        }
        return ObjectAnimator.ofFloat((Object)null, View.ALPHA, new float[] { 1.0f, 1.0f });
    }
    
    public ViewPropertyObjectAnimator height(final int n) {
        if (this.initDimensionListener()) {
            this.dimensionListener.height(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator heightBy(final int n) {
        if (this.initDimensionListener()) {
            this.dimensionListener.heightBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator heightPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.heightPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator heightPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.heightPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator horizontalMargin(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.horizontalMargin(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator horizontalMarginBy(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.horizontalMarginBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator horizontalMarginPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.horizontalMarginPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator horizontalMarginPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.horizontalMarginPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator horizontalPadding(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.horizontalPadding(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator horizontalPaddingBy(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.horizontalPaddingBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator leftMargin(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.leftMargin(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator leftMarginBy(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.leftMarginBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator leftMarginPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.leftMarginPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator leftMarginPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.leftMarginPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator leftPadding(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.leftPadding(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator leftPaddingBy(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.leftPaddingBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator margin(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.margin(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator marginBy(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.marginBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator marginPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.marginPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator marginPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.marginPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator padding(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.padding(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator paddingBy(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.paddingBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator removeAllListeners() {
        this.listeners.clear();
        return this;
    }
    
    public ViewPropertyObjectAnimator removeAllPauseListeners() {
        this.pauseListeners.clear();
        return this;
    }
    
    public ViewPropertyObjectAnimator removeAllUpdateListeners() {
        this.updateListeners.clear();
        return this;
    }
    
    public ViewPropertyObjectAnimator removeListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.listeners.remove(animator$AnimatorListener);
        return this;
    }
    
    public ViewPropertyObjectAnimator removePauseListener(final Animator$AnimatorPauseListener animator$AnimatorPauseListener) {
        this.pauseListeners.remove(animator$AnimatorPauseListener);
        return this;
    }
    
    public ViewPropertyObjectAnimator removeUpdateListener(final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        this.updateListeners.remove(valueAnimator$AnimatorUpdateListener);
        return this;
    }
    
    public ViewPropertyObjectAnimator rightMargin(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.rightMargin(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator rightMarginBy(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.rightMarginBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator rightMarginPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.rightMarginPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator rightMarginPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.rightMarginPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator rightPadding(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.rightPadding(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator rightPaddingBy(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.rightPaddingBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator rotation(final float n) {
        this.animateProperty((Property<View, Float>)View.ROTATION, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator rotationBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.ROTATION, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator rotationX(final float n) {
        this.animateProperty((Property<View, Float>)View.ROTATION_X, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator rotationXBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.ROTATION_X, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator rotationY(final float n) {
        this.animateProperty((Property<View, Float>)View.ROTATION_Y, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator rotationYBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.ROTATION_Y, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator scaleX(final float n) {
        this.animateProperty((Property<View, Float>)View.SCALE_X, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator scaleXBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.SCALE_X, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator scaleY(final float n) {
        this.animateProperty((Property<View, Float>)View.SCALE_Y, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator scaleYBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.SCALE_Y, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator scales(final float n) {
        this.scaleY(n);
        this.scaleX(n);
        return this;
    }
    
    public ViewPropertyObjectAnimator scalesBy(final float n) {
        this.scaleYBy(n);
        this.scaleXBy(n);
        return this;
    }
    
    public ViewPropertyObjectAnimator scrollX(final int n) {
        if (this.initScrollListener()) {
            this.scrollListener.scrollX(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator scrollXBy(final int n) {
        if (this.initScrollListener()) {
            this.scrollListener.scrollXBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator scrollY(final int n) {
        if (this.initScrollListener()) {
            this.scrollListener.scrollY(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator scrollYBy(final int n) {
        if (this.initScrollListener()) {
            this.scrollListener.scrollYBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator setDuration(final long duration) {
        if (duration >= 0L) {
            this.duration = duration;
            return this;
        }
        throw new IllegalArgumentException("duration cannot be < 0");
    }
    
    public ViewPropertyObjectAnimator setInterpolator(final Interpolator interpolator) {
        this.interpolator = interpolator;
        return this;
    }
    
    public ViewPropertyObjectAnimator setStartDelay(final long startDelay) {
        if (startDelay >= 0L) {
            this.startDelay = startDelay;
            return this;
        }
        throw new IllegalArgumentException("startDelay cannot be < 0");
    }
    
    public ViewPropertyObjectAnimator size(final int n) {
        if (this.initDimensionListener()) {
            this.dimensionListener.size(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator sizeBy(final int n) {
        if (this.initDimensionListener()) {
            this.dimensionListener.sizeBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator sizePercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.sizePercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator sizePercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.sizePercentBy(n);
        }
        return this;
    }
    
    public void start() {
        this.get().start();
    }
    
    public ViewPropertyObjectAnimator topMargin(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.topMargin(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator topMarginBy(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.topMarginBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator topMarginPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.topMarginPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator topMarginPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.topMarginPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator topPadding(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.topPadding(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator topPaddingBy(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.topPaddingBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator translationX(final float n) {
        this.animateProperty((Property<View, Float>)View.TRANSLATION_X, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator translationXBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.TRANSLATION_X, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator translationY(final float n) {
        this.animateProperty((Property<View, Float>)View.TRANSLATION_Y, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator translationYBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.TRANSLATION_Y, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator translationZ(final float n) {
        this.animateProperty((Property<View, Float>)View.TRANSLATION_Z, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator translationZBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.TRANSLATION_Z, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator verticalMargin(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.verticalMargin(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator verticalMarginBy(final int n) {
        if (this.initMarginListener()) {
            this.marginListener.verticalMarginBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator verticalMarginPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.verticalMarginPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator verticalMarginPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.verticalMarginPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator verticalPadding(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.verticalPadding(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator verticalPaddingBy(final int n) {
        if (this.initPaddingListener()) {
            this.paddingListener.verticalPaddingBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator width(final int n) {
        if (this.initDimensionListener()) {
            this.dimensionListener.width(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator widthBy(final int n) {
        if (this.initDimensionListener()) {
            this.dimensionListener.widthBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator widthPercent(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.widthPercent(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator widthPercentBy(final float n) {
        if (this.initPercentListener()) {
            this.percentListener.widthPercentBy(n);
        }
        return this;
    }
    
    public ViewPropertyObjectAnimator withEndAction(final Runnable runnable) {
        return this.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            private boolean isCanceled;
            
            public void onAnimationCancel(final Animator animator) {
                this.isCanceled = true;
            }
            
            public void onAnimationEnd(final Animator animator) {
                if (!this.isCanceled) {
                    runnable.run();
                }
                ViewPropertyObjectAnimator.this.removeListener((Animator$AnimatorListener)this);
            }
        });
    }
    
    public ViewPropertyObjectAnimator withLayer() {
        this.withLayer = true;
        return this;
    }
    
    public ViewPropertyObjectAnimator withStartAction(final Runnable runnable) {
        return this.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationStart(final Animator animator) {
                runnable.run();
                ViewPropertyObjectAnimator.this.removeListener((Animator$AnimatorListener)this);
            }
        });
    }
    
    public ViewPropertyObjectAnimator x(final float n) {
        this.animateProperty((Property<View, Float>)View.X, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator xBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.X, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator y(final float n) {
        this.animateProperty((Property<View, Float>)View.Y, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator yBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.Y, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator z(final float n) {
        this.animateProperty((Property<View, Float>)View.Z, n);
        return this;
    }
    
    public ViewPropertyObjectAnimator zBy(final float n) {
        this.animatePropertyBy((Property<View, Float>)View.Z, n);
        return this;
    }
}
