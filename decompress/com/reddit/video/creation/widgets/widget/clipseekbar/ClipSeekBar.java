// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.clipseekbar;

import ff2.t;
import android.widget.SeekBar;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import bj2.k;
import ud1.h;
import ff2.c0;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import uf2.j;
import androidx.constraintlayout.widget.ConstraintLayout$a;
import lg.e0;
import kf2.g;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.graphics.Rect;
import a4.o1;
import android.graphics.drawable.Drawable;
import com.reddit.video.creation.widgets.widget.trimclipview.TrimClipUnits$Percentage;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.reddit.video.creation.widgets.utils.Time;
import android.util.Log;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import kotlin.Triple;
import java.util.ListIterator;
import yg2.i;
import java.util.Iterator;
import ig2.w;
import ig2.m;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.Pair;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.collections.EmptyList;
import android.util.AttributeSet;
import sg2.e;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import android.view.View;
import if2.a;
import hg2.f;
import i30.b;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Metadata;
import androidx.constraintlayout.widget.ConstraintLayout;

@Metadata(bv = {}, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 I2\u00020\u0001:\u0001IB'\b\u0007\u0012\u0006\u0010C\u001a\u00020B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\b\b\u0002\u0010F\u001a\u00020\u0016¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\u0002J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016J(\u0010\u001e\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\rJ\u0006\u0010\u001f\u001a\u00020\u0002J\u0006\u0010 \u001a\u00020\u0002J\u0010\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0016J0\u0010'\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\rJ6\u0010.\u001a\u00020\u0002*\u00020(2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\b\b\u0002\u0010-\u001a\u00020\rH\u0002J0\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u0019\u0012\u0004\u0012\u00020\u0007002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010/\u001a\u00020\rH\u0002R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00103R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010A\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006J" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/clipseekbar/ClipSeekBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lhg2/j;", "onDetachedFromWindow", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/ClipSeekBarListener;", "clipSeekBarListener", "setListener", "", "start", "end", "duration", "addExistingProgress", "setStartProgress", "", "seekBarOverlaps", "undo", "hideSeekBar", "showSeekBar", "finished", "updateProgress", "removeLastProgress", "currentPosition", "", "indexOfTrack", "setSeekBarAtPosition", "", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "adjustableClips", "showUntrimmedClip", "showMicros", "setUpWithClips", "hideBackground", "hideTimeViews", "drawableId", "setThumbResource", "startMargin", "startMillis", "endMargin", "endMillis", "setTimeTextsAndPositions", "Landroid/view/View;", "l", "t", "r", "b", "ignoreL", "setMargins", "showUntrimmedClips", "Lkotlin/Pair;", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/Frame;", "mapToFramesWithDuration", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/ClipSeekBarListener;", "startTimeOfEachClip", "Ljava/util/List;", "Lio/reactivex/disposables/CompositeDisposable;", "attachedToWindowDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "timeLabelsSetExternally", "Z", "progressView", "Landroid/view/View;", "clipSeekBarMinLabelDistance$delegate", "Lhg2/f;", "getClipSeekBarMinLabelDistance", "()I", "clipSeekBarMinLabelDistance", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class ClipSeekBar extends ConstraintLayout
{
    public static final ClipSeekBar.ClipSeekBar$Companion Companion;
    public static final int MILLIS_IN_SECOND = 1000;
    public static final int NUMBER_OF_DISPLAYED_FRAMES = 15;
    public static final long SEEKBAR_STEP_MILLIS = 10L;
    private static final String TAG = "ClipSeekBar";
    public static final double THUMB_WIDTH_DIVIDER = 3.0;
    private final CompositeDisposable attachedToWindowDisposable;
    private b binding;
    private ClipSeekBarListener clipSeekBarListener;
    private final f clipSeekBarMinLabelDistance$delegate;
    private a framesDisposable;
    private View progressView;
    private final fg2.a<Integer> seekBarMaxSubject;
    private List<Long> startTimeOfEachClip;
    private boolean timeLabelsSetExternally;
    
    static {
        Companion = new ClipSeekBar.ClipSeekBar$Companion((DefaultConstructorMarker)null);
    }
    
    public ClipSeekBar(final Context context) {
        e.f((Object)context, "context");
        this(context, null, 0, 6, null);
    }
    
    public ClipSeekBar(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0, 4, null);
    }
    
    public ClipSeekBar(final Context context, final AttributeSet set, int n) {
        e.f((Object)context, "context");
        super(context, set, n);
        this.startTimeOfEachClip = (List<Long>)EmptyList.INSTANCE;
        this.seekBarMaxSubject = (fg2.a<Integer>)new fg2.a();
        this.attachedToWindowDisposable = new CompositeDisposable();
        LayoutInflater.from(context).inflate(2131625597, (ViewGroup)this);
        n = 2131428440;
        final RelativeLayout relativeLayout = (RelativeLayout)a92.b.G(2131428440, (View)this);
        if (relativeLayout != null) {
            n = 2131429150;
            final FrameLayout frameLayout = (FrameLayout)a92.b.G(2131429150, (View)this);
            if (frameLayout != null) {
                n = 2131431053;
                final RecyclerView recyclerView = (RecyclerView)a92.b.G(2131431053, (View)this);
                if (recyclerView != null) {
                    n = 2131431166;
                    final AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar)a92.b.G(2131431166, (View)this);
                    if (appCompatSeekBar != null) {
                        n = 2131431926;
                        final TextView textView = (TextView)a92.b.G(2131431926, (View)this);
                        if (textView != null) {
                            n = 2131431943;
                            final TextView textView2 = (TextView)a92.b.G(2131431943, (View)this);
                            if (textView2 != null) {
                                this.binding = new b((View)this, relativeLayout, frameLayout, recyclerView, appCompatSeekBar, textView, textView2);
                                this.clipSeekBarMinLabelDistance$delegate = kotlin.a.b((rg2.a)new ClipSeekBar$clipSeekBarMinLabelDistance$2(this));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(((View)this).getResources().getResourceName(n)));
    }
    
    private final int getClipSeekBarMinLabelDistance() {
        return this.clipSeekBarMinLabelDistance$delegate.getValue().intValue();
    }
    
    private final Pair<List<Frame>, Long> mapToFramesWithDuration(final List<AdjustableClip> list, final boolean b) {
        final Iterator<Object> iterator = list.iterator();
        long n = 0L;
        while (iterator.hasNext()) {
            n += mapToFramesWithDuration$getDuration(iterator.next(), b);
        }
        final int n2 = (int)Math.floor(n / 14.0);
        final ArrayList list2 = new ArrayList();
        final i j0 = lw0.b.J0((Collection)list);
        final ArrayList startTimeOfEachClip = new ArrayList<Long>(m.c3((Iterable)j0, 10));
        final Iterator iterator2 = ((Iterable)j0).iterator();
        while (iterator2.hasNext()) {
            final Iterator<Object> iterator3 = list.subList(0, ((w)iterator2).nextInt()).iterator();
            long n3 = 0L;
            while (iterator3.hasNext()) {
                n3 += mapToFramesWithDuration$getDuration(iterator3.next(), b);
            }
            startTimeOfEachClip.add(Long.valueOf(n3));
        }
        this.startTimeOfEachClip = (List<Long>)startTimeOfEachClip;
        int n4 = 0;
    Label_0184:
        while (true) {
            final long n5 = n4;
            if (n5 <= n) {
                final List<Long> startTimeOfEachClip2 = this.startTimeOfEachClip;
                final ListIterator<Long> listIterator = startTimeOfEachClip2.listIterator(startTimeOfEachClip2.size());
                while (true) {
                    while (listIterator.hasPrevious()) {
                        if (((Number)listIterator.previous()).longValue() <= n5) {
                            final int nextIndex = listIterator.nextIndex();
                            final AdjustableClip adjustableClip = list.get(nextIndex);
                            final long longValue = this.startTimeOfEachClip.get(nextIndex).longValue();
                            long startPointMillis;
                            if (b) {
                                startPointMillis = 0L;
                            }
                            else {
                                startPointMillis = adjustableClip.getStartPointMillis();
                            }
                            list2.add(new Frame(adjustableClip.getUri(), n5 - longValue + startPointMillis));
                            n4 += n2;
                            continue Label_0184;
                        }
                    }
                    final int nextIndex = -1;
                    continue;
                }
            }
            break;
        }
        return (Pair<List<Frame>, Long>)new Pair((Object)list2, (Object)n);
    }
    
    private static final long mapToFramesWithDuration$getDuration(final AdjustableClip adjustableClip, final boolean b) {
        long n;
        if (b) {
            n = adjustableClip.getDurationMillis();
        }
        else {
            n = adjustableClip.getDurationAfterTrimming();
        }
        return n;
    }
    
    private final void setMargins(final View view, int leftMargin, final int n, final int n2, final int n3, final boolean b) {
        if (view.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            e.d((Object)layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            if (b) {
                leftMargin = viewGroup$MarginLayoutParams.leftMargin;
            }
            viewGroup$MarginLayoutParams.setMargins(leftMargin, n, n2, n3);
            view.requestLayout();
        }
    }
    
    public static /* synthetic */ void setMargins$default(final ClipSeekBar clipSeekBar, final View view, final int n, final int n2, final int n3, final int n4, boolean b, final int n5, final Object o) {
        if ((n5 & 0x10) != 0x0) {
            b = false;
        }
        clipSeekBar.setMargins(view, n, n2, n3, n4, b);
    }
    
    private static final void setSeekBarAtPosition$lambda-4(final ClipSeekBar clipSeekBar, int n, final long n2, final Integer n3) {
        e.f((Object)clipSeekBar, "this$0");
        final Long n4 = (Long)CollectionsKt___CollectionsKt.D3(n, (List)clipSeekBar.startTimeOfEachClip);
        long longValue;
        if (n4 != null) {
            longValue = n4;
        }
        else {
            longValue = 0L;
        }
        final int j2 = lw0.b.j2((longValue + (double)n2) / 10L);
        final int n5 = n = 0;
        if (j2 >= 0) {
            e.e((Object)n3, "seekBarMax");
            n = n5;
            if (j2 <= n3) {
                n = 1;
            }
        }
        if (n != 0) {
            ((ProgressBar)clipSeekBar.binding.e).setProgress(j2);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("currentProgress ");
            sb.append(j2);
            sb.append(" is not within range (0..");
            sb.append(n3);
            sb.append(')');
            Log.w("ClipSeekBar", (Throwable)new IllegalArgumentException(sb.toString()));
        }
    }
    
    private static final void setTimeTextsAndPositions$setMillis(final TextView textView, final boolean b, final long n) {
        String text;
        if (n == 0L) {
            text = ((View)textView).getContext().getString(2131958117, new Object[] { n / (float)1000 });
        }
        else {
            final Time.Milliseconds milliseconds = new Time.Milliseconds(n);
            if (b) {
                text = ((View)textView).getContext().getString(2131958115, new Object[] { milliseconds.getAsMinutes(), milliseconds.getAsRemainingSeconds(), milliseconds.getAsRemainingMicros() });
            }
            else {
                text = ((View)textView).getContext().getString(2131958114, new Object[] { milliseconds.getAsMinutes(), milliseconds.getAsRemainingSeconds() });
            }
        }
        textView.setText((CharSequence)text);
    }
    
    private static final Triple setUpWithClips$lambda-5(final ClipSeekBar clipSeekBar, final List list, final boolean b) {
        e.f((Object)clipSeekBar, "this$0");
        e.f((Object)list, "$adjustableClips");
        final Pair<List<Frame>, Long> mapToFramesWithDuration = clipSeekBar.mapToFramesWithDuration(list, b);
        return new Triple((Object)mapToFramesWithDuration.component1(), (Object)((Number)mapToFramesWithDuration.component2()).longValue(), (Object)(int)Math.floor(((View)clipSeekBar).getWidth() / 15.0));
    }
    
    private static final void setUpWithClips$lambda-6(final ClipSeekBar clipSeekBar, final boolean b, final Triple triple) {
        e.f((Object)clipSeekBar, "this$0");
        final List list = (List)triple.component1();
        final long longValue = ((Number)triple.component2()).longValue();
        final int intValue = ((Number)triple.component3()).intValue();
        final int max = (int)(float)Math.floor(longValue / (float)10L);
        ((ProgressBar)clipSeekBar.binding.e).setMax(max);
        clipSeekBar.seekBarMaxSubject.onNext((Object)max);
        if (!clipSeekBar.timeLabelsSetExternally) {
            final String string = ((View)clipSeekBar).getContext().getString(2131958116, new Object[] { 0 });
            e.e((Object)string, "context.getString(R.stri\u2026.video_length_seconds, 0)");
            final Time.Milliseconds milliseconds = new Time.Milliseconds(longValue);
            String text;
            if (b) {
                text = ((View)clipSeekBar).getContext().getString(2131958115, new Object[] { milliseconds.getAsMinutes(), milliseconds.getAsRemainingSeconds(), milliseconds.getAsRemainingMicros() });
            }
            else {
                text = ((View)clipSeekBar).getContext().getString(2131958114, new Object[] { milliseconds.getAsMinutes(), milliseconds.getAsRemainingSeconds() });
            }
            e.e((Object)text, "if (showMicros) {\n      \u2026          )\n            }");
            clipSeekBar.binding.g.setText((CharSequence)string);
            clipSeekBar.binding.f.setText((CharSequence)text);
        }
        clipSeekBar.binding.d.setAdapter((RecyclerView$Adapter)null);
        clipSeekBar.binding.d.setAdapter((RecyclerView$Adapter)new ClipThumbAdapter(list, intValue));
    }
    
    private static final void setUpWithClips$lambda-7(final Throwable t) {
        Log.w("ClipSeekBar", t);
    }
    
    public final void addExistingProgress(final long n, final long n2, final long n3) {
        final double n4 = (double)n;
        final double n5 = (double)n3;
        final double n6 = n4 / n5;
        final double n7 = ((View)this).getMeasuredWidth() - ((AbsSeekBar)this.binding.e).getThumb().getBounds().width();
        final double n8 = TrimClipUnits$Percentage.Companion.getONE().getValue();
        final double n9 = n2 / n5;
        final double n10 = ((View)this).getMeasuredWidth() - ((AbsSeekBar)this.binding.e).getThumb().getBounds().width();
        final View inflate = View.inflate(((View)this).getContext(), 2131625583, (ViewGroup)null);
        ((ViewGroup)this.binding.b).addView(inflate);
        e.e((Object)inflate, "");
        setMargins$default(this, inflate, (int)(n6 * n7), 0, (int)((n8 - n9) * n10), 0, false, 16, null);
        this.progressView = inflate;
    }
    
    public final void hideBackground() {
        ((View)this.binding.e).setBackground((Drawable)null);
    }
    
    public final void hideSeekBar() {
        ((View)this.binding.e).setVisibility(4);
    }
    
    public final void hideTimeViews() {
        ((View)this.binding.g).setVisibility(4);
        ((View)this.binding.f).setVisibility(4);
        ((View)this.binding.b).setVisibility(0);
        ((View)this.binding.c).setVisibility(0);
    }
    
    public void onDetachedFromWindow() {
        this.attachedToWindowDisposable.clear();
        super.onDetachedFromWindow();
    }
    
    public final void removeLastProgress() {
        ((ViewGroup)this.binding.b).removeView(this.progressView);
        this.progressView = null;
    }
    
    public final boolean seekBarOverlaps() {
        final Rect bounds = ((AbsSeekBar)this.binding.e).getThumb().getBounds();
        e.e((Object)bounds, "binding.seekBarClips.thumb.bounds");
        final int centerX = bounds.centerX();
        final RelativeLayout b = this.binding.b;
        e.e((Object)b, "binding.container");
        final Iterator<View> iterator = androidx.core.view.a.a((ViewGroup)b).iterator();
        boolean b2 = false;
        while (true) {
            final o1 o1 = (o1)iterator;
            if (!o1.hasNext()) {
                break;
            }
            final View view = (View)o1.next();
            final int left = view.getLeft();
            if (centerX > view.getRight() || left > centerX) {
                continue;
            }
            b2 = true;
        }
        return b2;
    }
    
    public final void setListener(final ClipSeekBarListener clipSeekBarListener) {
        this.clipSeekBarListener = clipSeekBarListener;
        ((SeekBar)this.binding.e).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new ClipSeekBar$setListener$1(this, clipSeekBarListener));
    }
    
    public final void setSeekBarAtPosition(final long n, final int n2) {
        final CompositeDisposable attachedToWindowDisposable = this.attachedToWindowDisposable;
        final a subscribe = ((t)this.seekBarMaxSubject).subscribe((g)new com.reddit.video.creation.widgets.widget.clipseekbar.b(this, n2, n));
        e.e((Object)subscribe, "seekBarMaxSubject.subscr\u2026,\n        )\n      }\n    }");
        e0.d0(attachedToWindowDisposable, subscribe);
    }
    
    public final void setStartProgress() {
        final Rect bounds = ((AbsSeekBar)this.binding.e).getThumb().getBounds();
        e.e((Object)bounds, "binding.seekBarClips.thumb.bounds");
        final int left = bounds.left;
        final int measuredWidth = ((View)this).getMeasuredWidth();
        final int left2 = bounds.left;
        final View inflate = View.inflate(((View)this).getContext(), 2131625583, (ViewGroup)null);
        ((ViewGroup)this.binding.b).addView(inflate);
        e.e((Object)inflate, "");
        setMargins$default(this, inflate, left, 0, measuredWidth - left2, 0, false, 16, null);
        this.progressView = inflate;
    }
    
    public final void setThumbResource(final int n) {
        ((AbsSeekBar)this.binding.e).setThumb(n3.a.getDrawable(((View)this).getContext(), n));
    }
    
    public final void setTimeTextsAndPositions(int n, final long n2, int n3, final long n4, final boolean b) {
        this.timeLabelsSetExternally = true;
        final TextView g = this.binding.g;
        e.e((Object)g, "binding.tvStartTime");
        setTimeTextsAndPositions$setMillis(g, b, n2);
        final TextView f = this.binding.f;
        e.e((Object)f, "binding.tvEndTime");
        setTimeTextsAndPositions$setMillis(f, b, n4);
        final int n5 = ((View)this.binding.g).getWidth() + n + this.getClipSeekBarMinLabelDistance() - (((View)this).getWidth() - n3 - ((View)this.binding.f).getWidth());
        int marginStart = n;
        int marginEnd = n3;
        if (n5 > 0) {
            final int n6 = n5 / 2;
            n -= n6;
            n3 -= n6;
            if (n < 0) {
                marginEnd = n3 + n;
                marginStart = 0;
            }
            else {
                marginStart = n;
                if ((marginEnd = n3) < 0) {
                    marginStart = n + n3;
                    marginEnd = 0;
                }
            }
        }
        final TextView g2 = this.binding.g;
        e.e((Object)g2, "binding.tvStartTime");
        final ViewGroup$LayoutParams layoutParams = ((View)g2).getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        final ConstraintLayout$a layoutParams2 = (ConstraintLayout$a)layoutParams;
        ((ViewGroup$MarginLayoutParams)layoutParams2).setMarginStart(marginStart);
        ((View)g2).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        final TextView f2 = this.binding.f;
        e.e((Object)f2, "binding.tvEndTime");
        final ViewGroup$LayoutParams layoutParams3 = ((View)f2).getLayoutParams();
        if (layoutParams3 != null) {
            final ConstraintLayout$a layoutParams4 = (ConstraintLayout$a)layoutParams3;
            ((ViewGroup$MarginLayoutParams)layoutParams4).setMarginEnd(marginEnd);
            ((View)f2).setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
    
    public final void setUpWithClips(final List<AdjustableClip> list, final boolean b, final boolean b2) {
        e.f((Object)list, "adjustableClips");
        final a framesDisposable = this.framesDisposable;
        if (framesDisposable != null) {
            framesDisposable.dispose();
        }
        final a f = RxJavaPlugins.onAssembly(new j<Object>((Callable<?>)new com.reddit.video.creation.widgets.widget.clipseekbar.a(this, (List)list, b))).H(eg2.a.b()).y(hf2.a.a()).F((kf2.g<? super Object>)new h((Object)this, 2, b2), (g<? super Throwable>)new hn0.a(4));
        e0.m(this.attachedToWindowDisposable, f);
        this.framesDisposable = f;
    }
    
    public final void showSeekBar() {
        ((View)this.binding.e).setVisibility(0);
    }
    
    public final void undo() {
        final RelativeLayout b = this.binding.b;
        e.e((Object)b, "binding.container");
        if (kotlin.sequences.b.f1((k)androidx.core.view.a.a((ViewGroup)b)) > 0) {
            final RelativeLayout b2 = this.binding.b;
            e.e((Object)b2, "binding.container");
            ((ViewGroup)b2).removeView((View)kotlin.sequences.b.r1((k)androidx.core.view.a.a((ViewGroup)b2)));
        }
    }
    
    public final void updateProgress(final boolean b) {
        final Rect bounds = ((AbsSeekBar)this.binding.e).getThumb().getBounds();
        e.e((Object)bounds, "binding.seekBarClips.thumb.bounds");
        double n;
        if (b) {
            final AppCompatSeekBar e = this.binding.e;
            ((ProgressBar)e).setProgress(((ProgressBar)e).getMax());
            n = 0.0;
        }
        else {
            n = ((View)this).getMeasuredWidth() - bounds.left - bounds.width() / 3.0;
        }
        final View progressView = this.progressView;
        if (progressView != null) {
            this.setMargins(progressView, 0, 0, (int)n, 0, true);
        }
    }
}
