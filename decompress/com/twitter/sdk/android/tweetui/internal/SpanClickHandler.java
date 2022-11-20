// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View$OnTouchListener;
import android.widget.TextView;
import android.view.View;
import android.text.Layout;

public class SpanClickHandler
{
    private HighlightedClickableSpan highlightedClickableSpan;
    private Layout layout;
    private float left;
    private float top;
    private final View view;
    
    public SpanClickHandler(final View view, final Layout layout) {
        this.view = view;
        this.layout = layout;
    }
    
    public static Layout access$002(final SpanClickHandler spanClickHandler, final Layout layout) {
        return spanClickHandler.layout = layout;
    }
    
    public static float access$102(final SpanClickHandler spanClickHandler, final float left) {
        return spanClickHandler.left = left;
    }
    
    public static float access$202(final SpanClickHandler spanClickHandler, final float top) {
        return spanClickHandler.top = top;
    }
    
    private void deselectSpan() {
        final HighlightedClickableSpan highlightedClickableSpan = this.highlightedClickableSpan;
        if (highlightedClickableSpan != null && highlightedClickableSpan.isSelected()) {
            highlightedClickableSpan.select(false);
            this.highlightedClickableSpan = null;
            this.invalidate();
        }
    }
    
    public static void enableClicksOnSpans(final TextView textView) {
        ((View)textView).setOnTouchListener((View$OnTouchListener)new View$OnTouchListener(new SpanClickHandler((View)textView, null)) {
            public final SpanClickHandler val$helper;
            
            public boolean onTouch(final View view, final MotionEvent motionEvent) {
                final TextView textView = (TextView)view;
                final Layout layout = textView.getLayout();
                if (layout != null) {
                    SpanClickHandler.access$002(this.val$helper, layout);
                    SpanClickHandler.access$102(this.val$helper, (float)(((View)textView).getScrollX() + textView.getTotalPaddingLeft()));
                    SpanClickHandler.access$202(this.val$helper, (float)(((View)textView).getScrollY() + textView.getTotalPaddingTop()));
                    return this.val$helper.handleTouchEvent(motionEvent);
                }
                return false;
            }
        });
    }
    
    private void invalidate() {
        final View view = this.view;
        final float left = this.left;
        view.invalidate((int)left, (int)this.top, this.layout.getWidth() + (int)left, this.layout.getHeight() + (int)this.top);
    }
    
    private void selectSpan(final HighlightedClickableSpan highlightedClickableSpan) {
        highlightedClickableSpan.select(true);
        this.highlightedClickableSpan = highlightedClickableSpan;
        this.invalidate();
    }
    
    public boolean handleTouchEvent(final MotionEvent motionEvent) {
        final CharSequence text = this.layout.getText();
        Spanned spanned;
        if (text instanceof Spanned) {
            spanned = (Spanned)text;
        }
        else {
            spanned = null;
        }
        if (spanned == null) {
            return false;
        }
        final int n = motionEvent.getAction() & 0xFF;
        final int n2 = (int)(motionEvent.getX() - this.left);
        final int n3 = (int)(motionEvent.getY() - this.top);
        if (n2 < 0 || n2 >= this.layout.getWidth() || n3 < 0 || n3 >= this.layout.getHeight()) {
            this.deselectSpan();
            return false;
        }
        final int lineForVertical = this.layout.getLineForVertical(n3);
        final float n4 = (float)n2;
        if (n4 >= this.layout.getLineLeft(lineForVertical) && n4 <= this.layout.getLineRight(lineForVertical)) {
            if (n == 0) {
                final int offsetForHorizontal = this.layout.getOffsetForHorizontal(lineForVertical, n4);
                final HighlightedClickableSpan[] array = (HighlightedClickableSpan[])spanned.getSpans(offsetForHorizontal, offsetForHorizontal, (Class)HighlightedClickableSpan.class);
                if (array.length > 0) {
                    this.selectSpan(array[0]);
                    return true;
                }
            }
            else if (n == 1) {
                final HighlightedClickableSpan highlightedClickableSpan = this.highlightedClickableSpan;
                if (highlightedClickableSpan != null) {
                    highlightedClickableSpan.onClick(this.view);
                    this.deselectSpan();
                    return true;
                }
            }
            return false;
        }
        this.deselectSpan();
        return false;
    }
}
