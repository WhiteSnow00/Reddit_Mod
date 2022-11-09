// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.Util;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import android.graphics.Rect;
import android.view.View;

abstract class ViewHighlighter
{
    public ViewHighlighter() {
    }
    
    public static ViewHighlighter newInstance() {
        return new OverlayHighlighter();
    }
    
    public abstract void clearHighlight();
    
    public abstract void setHighlightedView(final View p0, final Rect p1, final int p2);
    
    public static final class NoopHighlighter extends ViewHighlighter
    {
        private NoopHighlighter() {
        }
        
        @Override
        public void clearHighlight() {
        }
        
        @Override
        public void setHighlightedView(final View view, final Rect rect, final int n) {
        }
    }
    
    public static final class OverlayHighlighter extends ViewHighlighter
    {
        private AtomicReference<Rect> mBoundsToHighlight;
        private AtomicInteger mContentColor;
        private final Rect mEmptyRect;
        private final Handler mHandler;
        private final ViewHighlightOverlays mHighlightOverlays;
        private final Runnable mHighlightViewOnUiThreadRunnable;
        private final Rect mHighlightedBounds;
        private View mHighlightedView;
        private AtomicReference<View> mViewToHighlight;
        
        public OverlayHighlighter() {
            this.mHighlightOverlays = ViewHighlightOverlays.newInstance();
            this.mHighlightedBounds = new Rect();
            this.mEmptyRect = new Rect();
            this.mViewToHighlight = new AtomicReference<View>();
            this.mBoundsToHighlight = new AtomicReference<Rect>();
            this.mContentColor = new AtomicInteger();
            this.mHighlightViewOnUiThreadRunnable = new Runnable() {
                @Override
                public void run() {
                    OverlayHighlighter.this.highlightViewOnUiThread();
                }
            };
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        
        private void highlightViewOnUiThread() {
            final View mHighlightedView = this.mViewToHighlight.getAndSet(null);
            Rect mEmptyRect;
            if ((mEmptyRect = this.mBoundsToHighlight.getAndSet(null)) == null) {
                mEmptyRect = this.mEmptyRect;
            }
            if (mHighlightedView == this.mHighlightedView && this.mHighlightedBounds.equals((Object)mEmptyRect)) {
                return;
            }
            final View mHighlightedView2 = this.mHighlightedView;
            if (mHighlightedView2 != null) {
                this.mHighlightOverlays.removeHighlight(mHighlightedView2);
            }
            if (mHighlightedView != null) {
                this.mHighlightOverlays.highlightView(mHighlightedView, mEmptyRect, this.mContentColor.get());
            }
            this.mHighlightedView = mHighlightedView;
            if (mEmptyRect == null) {
                this.mHighlightedBounds.setEmpty();
            }
            else {
                this.mHighlightedBounds.set(mEmptyRect);
            }
        }
        
        private void setHighlightedViewImpl(final View view, final Rect rect, final int n) {
            this.mHandler.removeCallbacks(this.mHighlightViewOnUiThreadRunnable);
            this.mViewToHighlight.set(view);
            this.mBoundsToHighlight.set(rect);
            this.mContentColor.set(n);
            this.mHandler.postDelayed(this.mHighlightViewOnUiThreadRunnable, 100L);
        }
        
        @Override
        public void clearHighlight() {
            this.setHighlightedViewImpl(null, null, 0);
        }
        
        @Override
        public void setHighlightedView(final View view, final Rect rect, final int n) {
            this.setHighlightedViewImpl(Util.throwIfNull(view), rect, n);
        }
    }
}
