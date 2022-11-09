// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import a4.x;
import android.graphics.Region$Op;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.view.View;

abstract class ViewHighlightOverlays
{
    public ViewHighlightOverlays() {
    }
    
    public static ViewHighlightOverlays newInstance() {
        return new ViewHighlightOverlaysJellybeanMR2();
    }
    
    public abstract void highlightView(final View p0, final Rect p1, final int p2);
    
    public abstract void removeHighlight(final View p0);
    
    public static class NoOpViewHighlightOverlays extends ViewHighlightOverlays
    {
        private NoOpViewHighlightOverlays() {
        }
        
        @Override
        public void highlightView(final View view, final Rect rect, final int n) {
        }
        
        @Override
        public void removeHighlight(final View view) {
        }
    }
    
    public static class ViewHighlightOverlaysJellybeanMR2 extends ViewHighlightOverlays
    {
        private static final int MARGIN_OVERLAY_COLOR = -1426797922;
        private static final int PADDING_OVERLAY_COLOR = -1430332746;
        private final HighlightDrawable[] mHighlightDrawables;
        private final MainHighlightDrawable mMainHighlightDrawable;
        
        public ViewHighlightOverlaysJellybeanMR2() {
            final MainHighlightDrawable mMainHighlightDrawable = new MainHighlightDrawable();
            this.mMainHighlightDrawable = mMainHighlightDrawable;
            this.mHighlightDrawables = new HighlightDrawable[] { (HighlightDrawable)mMainHighlightDrawable, (HighlightDrawable)new PaddingTopHighlightDrawable(), (HighlightDrawable)new PaddingBottomHighlightDrawable(), (HighlightDrawable)new PaddingRightHighlightDrawable(), (HighlightDrawable)new PaddingLeftHighlightDrawable(), (HighlightDrawable)new MarginTopHighlightDrawable(), (HighlightDrawable)new MarginBottomHighlightDrawable(), (HighlightDrawable)new MarginRightHighlightDrawable(), (HighlightDrawable)new MarginLeftHighlightDrawable() };
        }
        
        @Override
        public void highlightView(final View view, final Rect bounds, int i) {
            this.mMainHighlightDrawable.setColor(i);
            final boolean empty = bounds.isEmpty();
            i = 0;
            if (empty) {
                ((Drawable)this.mMainHighlightDrawable).setBounds(0, 0, view.getWidth(), view.getHeight());
            }
            else {
                ((Drawable)this.mMainHighlightDrawable).setBounds(bounds);
            }
            while (i < this.mHighlightDrawables.length) {
                final HighlightDrawable highlightDrawable = this.mHighlightDrawables[i];
                highlightDrawable.highlightView(view);
                view.getOverlay().add((Drawable)highlightDrawable);
                ++i;
            }
        }
        
        @Override
        public void removeHighlight(final View view) {
            final HighlightDrawable[] mHighlightDrawables = this.mHighlightDrawables;
            for (int length = mHighlightDrawables.length, i = 0; i < length; ++i) {
                view.getOverlay().remove((Drawable)mHighlightDrawables[i]);
            }
        }
        
        public abstract static class HighlightDrawable extends ColorDrawable
        {
            public final Rect mMargins;
            public final Rect mPaddings;
            
            public HighlightDrawable() {
                this.mMargins = new Rect();
                this.mPaddings = new Rect();
            }
            
            public HighlightDrawable(final int n) {
                super(n);
                this.mMargins = new Rect();
                this.mPaddings = new Rect();
            }
            
            public void highlightView(final View view) {
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                    final Rect mMargins = this.mMargins;
                    mMargins.left = viewGroup$MarginLayoutParams.leftMargin;
                    mMargins.top = viewGroup$MarginLayoutParams.topMargin;
                    mMargins.right = viewGroup$MarginLayoutParams.rightMargin;
                    mMargins.bottom = viewGroup$MarginLayoutParams.bottomMargin;
                }
                else {
                    final Rect mMargins2 = this.mMargins;
                    mMargins2.left = 0;
                    mMargins2.top = 0;
                    mMargins2.right = 0;
                    mMargins2.bottom = 0;
                }
                this.mPaddings.left = view.getPaddingLeft();
                this.mPaddings.top = view.getPaddingTop();
                this.mPaddings.right = view.getPaddingRight();
                this.mPaddings.bottom = view.getPaddingBottom();
            }
        }
        
        public static class MainHighlightDrawable extends HighlightDrawable
        {
            public void draw(final Canvas canvas) {
                final Rect clipBounds = canvas.getClipBounds();
                final Rect mMargins = super.mMargins;
                clipBounds.inset(-(mMargins.right + mMargins.left), -(mMargins.top + mMargins.bottom));
                if (Build$VERSION.SDK_INT < 26) {
                    canvas.clipRect(clipBounds, Region$Op.REPLACE);
                }
                else {
                    x.d(canvas, clipBounds);
                }
                super.draw(canvas);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
            }
        }
        
        public static class MarginBottomHighlightDrawable extends HighlightDrawable
        {
            public MarginBottomHighlightDrawable() {
                super(-1426797922);
            }
            
            public void draw(final Canvas canvas) {
                final Rect mMargins = super.mMargins;
                canvas.translate(0.0f, (float)(mMargins.bottom + mMargins.top));
                super.draw(canvas);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
                ((Drawable)this).setBounds(0, view.getHeight() - super.mMargins.bottom, view.getWidth(), view.getHeight());
            }
        }
        
        public static class MarginLeftHighlightDrawable extends HighlightDrawable
        {
            public MarginLeftHighlightDrawable() {
                super(-1426797922);
            }
            
            public void draw(final Canvas canvas) {
                final Rect mMargins = super.mMargins;
                canvas.translate((float)(-(mMargins.left + mMargins.right)), 0.0f);
                super.draw(canvas);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
                final int left = super.mMargins.left;
                final int height = view.getHeight();
                final Rect mMargins = super.mMargins;
                ((Drawable)this).setBounds(0, 0, left, height + mMargins.top + mMargins.bottom);
            }
        }
        
        public static class MarginRightHighlightDrawable extends HighlightDrawable
        {
            public MarginRightHighlightDrawable() {
                super(-1426797922);
            }
            
            public void draw(final Canvas canvas) {
                final Rect mMargins = super.mMargins;
                canvas.translate((float)mMargins.right, (float)(-(mMargins.top + mMargins.bottom)));
                super.draw(canvas);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
                final int width = view.getWidth();
                final int right = super.mMargins.right;
                final int width2 = view.getWidth();
                final int height = view.getHeight();
                final Rect mMargins = super.mMargins;
                ((Drawable)this).setBounds(width - right, 0, width2, height + mMargins.top + mMargins.bottom);
            }
        }
        
        public static class MarginTopHighlightDrawable extends HighlightDrawable
        {
            public MarginTopHighlightDrawable() {
                super(-1426797922);
            }
            
            public void draw(final Canvas canvas) {
                canvas.translate(0.0f, (float)(-super.mMargins.top));
                super.draw(canvas);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
                ((Drawable)this).setBounds(0, 0, view.getWidth(), super.mMargins.top);
            }
        }
        
        public static class PaddingBottomHighlightDrawable extends HighlightDrawable
        {
            public PaddingBottomHighlightDrawable() {
                super(-1430332746);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
                ((Drawable)this).setBounds(super.mPaddings.left, view.getHeight() - super.mPaddings.bottom, view.getWidth() - super.mPaddings.right, view.getHeight());
            }
        }
        
        public static class PaddingLeftHighlightDrawable extends HighlightDrawable
        {
            public PaddingLeftHighlightDrawable() {
                super(-1430332746);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
                ((Drawable)this).setBounds(0, 0, super.mPaddings.left, view.getHeight());
            }
        }
        
        public static class PaddingRightHighlightDrawable extends HighlightDrawable
        {
            public PaddingRightHighlightDrawable() {
                super(-1430332746);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
                ((Drawable)this).setBounds(view.getWidth() - super.mPaddings.right, 0, view.getWidth(), view.getHeight());
            }
        }
        
        public static class PaddingTopHighlightDrawable extends HighlightDrawable
        {
            public PaddingTopHighlightDrawable() {
                super(-1430332746);
            }
            
            @Override
            public void highlightView(final View view) {
                super.highlightView(view);
                final int left = super.mPaddings.left;
                final int width = view.getWidth();
                final Rect mPaddings = super.mPaddings;
                ((Drawable)this).setBounds(left, 0, width - mPaddings.right, mPaddings.top);
            }
        }
    }
}
