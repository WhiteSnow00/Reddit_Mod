// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.draw;

import android.widget.ProgressBar;
import android.view.View;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.util.AttributeSet;
import sg2.e;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import androidx.appcompat.widget.AppCompatSeekBar;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0015\u0010\u001bJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u001d" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/draw/VerticalSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "", "w", "h", "oldw", "oldh", "Lhg2/j;", "onSizeChanged", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "c", "onDraw", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class VerticalSeekBar extends AppCompatSeekBar
{
    public static final VerticalSeekBar.VerticalSeekBar$Companion Companion;
    public static final float SEEK_BAR_ROTATION = -90.0f;
    
    static {
        Companion = new VerticalSeekBar.VerticalSeekBar$Companion((DefaultConstructorMarker)null);
    }
    
    public VerticalSeekBar(final Context context) {
        e.f((Object)context, "context");
        super(context);
    }
    
    public VerticalSeekBar(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        super(context, set);
    }
    
    public VerticalSeekBar(final Context context, final AttributeSet set, final int n) {
        e.f((Object)context, "context");
        super(context, set, n);
    }
    
    public void onDraw(final Canvas canvas) {
        e.f((Object)canvas, "c");
        canvas.rotate(-90.0f);
        canvas.translate(-(float)((View)this).getHeight(), 0.0f);
        super.onDraw(canvas);
    }
    
    public void onMeasure(final int n, final int n2) {
        synchronized (this) {
            super.onMeasure(n2, n);
            ((View)this).setMeasuredDimension(((View)this).getMeasuredHeight(), ((View)this).getMeasuredWidth());
        }
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n2, n, n4, n3);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        e.f((Object)motionEvent, "event");
        if (!((View)this).isEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2) {
            ((ProgressBar)this).setProgress(((ProgressBar)this).getMax() - (int)(motionEvent.getY() * ((ProgressBar)this).getMax() / ((View)this).getHeight()));
            this.onSizeChanged(((View)this).getWidth(), ((View)this).getHeight(), 0, 0);
        }
        return true;
    }
}
