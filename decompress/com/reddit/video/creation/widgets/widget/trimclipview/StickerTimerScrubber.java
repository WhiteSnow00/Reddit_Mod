// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ff2.h;
import android.view.ViewParent;
import ff2.q;
import af2.y;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import ff2.o;
import android.view.MotionEvent;
import java.util.Iterator;
import mg2.p;
import ff2.g;
import kotlin.Triple;
import java.util.WeakHashMap;
import com.reddit.video.creation.widgets.widget.clipseekbar.ClipSeekBarListener;
import android.view.View$OnLayoutChangeListener;
import a4.l0$g;
import a4.l0;
import com.reddit.video.creation.widgets.widget.clipseekbar.ClipSeekBar;
import android.view.View;
import ah0.b;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import ng2.e;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import io.reactivex.subjects.PublishSubject;
import cg2.j;
import kotlin.Pair;
import af2.t;
import ag2.a;
import n30.d;
import cg2.f;
import io.reactivex.disposables.CompositeDisposable;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import java.util.List;
import kotlin.Metadata;
import android.widget.RelativeLayout;

@Metadata(bv = {}, d1 = { "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 b2\u00020\u0001:\u0002bcB1\b\u0007\u0012\u0006\u0010[\u001a\u00020Z\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\\u0012\b\b\u0002\u0010^\u001a\u00020\u0012\u0012\b\b\u0002\u0010_\u001a\u00020\u0012¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0014\u0010\u000f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005J\u0012\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J \u0010\"\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050 H\u0002JR\u0010*\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140$2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010)\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020\u0002H\u0002J\b\u0010,\u001a\u00020\u0002H\u0002R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00100R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u00101R\"\u00104\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00020\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R)\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120>0\u001e8\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u00109R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u00109R!\u0010G\u001a\b\u0012\u0004\u0012\u00020C0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u00109R\u001b\u0010K\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010JR\u001b\u0010N\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\bM\u0010JR?\u0010R\u001a&\u0012\f\u0012\n 3*\u0004\u0018\u00010O0O 3*\u0012\u0012\f\u0012\n 3*\u0004\u0018\u00010O0O\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u00109R?\u0010U\u001a&\u0012\f\u0012\n 3*\u0004\u0018\u00010O0O 3*\u0012\u0012\f\u0012\n 3*\u0004\u0018\u00010O0O\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bT\u00109R!\u0010Y\u001a\b\u0012\u0004\u0012\u00020(0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010X¨\u0006d" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/StickerTimerScrubber;", "Landroid/widget/RelativeLayout;", "Lcg2/j;", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "minimumDistance", "maximumDistance", "setDistances", "startPosition", "endPosition", "setPositions", "", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "adjustableClips", "setClips", "millis", "setSeekBarAtPosition", "", "id", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "getDimensionInPixels", "getClipDuration", "clipSeekBarWidth", "startPositionToLeftMargin", "endPositionToRightMargin", "updateClipSeekBar", "observeTouchEvents", "observeLeftTouches", "observeRightTouches", "Laf2/t;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/StickerTimerScrubber$PositionData;", "Lag2/a;", "oldPositionSubject", "coercePosition", "positionObservable", "Lkotlin/Function2;", "positionToMarginConverter", "Landroid/widget/RelativeLayout$LayoutParams;", "marginSetter", "Landroid/view/View;", "handle", "observeMarginUpdates", "observeSeekPosition", "observeProgressSeekPosition", "Lio/reactivex/disposables/CompositeDisposable;", "attachedToWindowDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "Ljava/util/List;", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "maximumDistanceReachedSubject", "Lio/reactivex/subjects/PublishSubject;", "startPositionObservable", "Laf2/t;", "getStartPositionObservable", "()Laf2/t;", "endPositionObservable", "getEndPositionObservable", "maximumDistanceReachedObservable", "getMaximumDistanceReachedObservable", "Lkotlin/Pair;", "userSeekPositionObservable", "getUserSeekPositionObservable", "userSeekProgressPositionObservable", "getUserSeekProgressPositionObservable", "", "editingObservable$delegate", "Lcg2/f;", "getEditingObservable", "editingObservable", "thumbWidth$delegate", "getThumbWidth", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "thumbWidth", "handleWidth$delegate", "getHandleWidth", "handleWidth", "Landroid/view/MotionEvent;", "leftTouches$delegate", "getLeftTouches", "leftTouches", "rightTouches$delegate", "getRightTouches", "rightTouches", "bars$delegate", "getBars", "()Ljava/util/List;", "bars", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "PositionData", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class StickerTimerScrubber extends RelativeLayout
{
    public static final Companion Companion;
    private List<AdjustableClip> adjustableClips;
    private final CompositeDisposable attachedToWindowDisposable;
    private final f bars$delegate;
    private d binding;
    private final a<TrimClipUnits.Pixels> clipSeekBarWidthSubject;
    private final f editingObservable$delegate;
    private final t<TrimClipUnits.Milliseconds> endPositionObservable;
    private final a<TrimClipUnits.Milliseconds> endPositionSubject;
    private final f handleWidth$delegate;
    private final a<TrimClipUnits.Milliseconds> internalProgrammaticSeekPositionSubject;
    private final a<Pair<TrimClipUnits.Milliseconds, Integer>> internalUserSeekPositionSubject;
    private final f leftTouches$delegate;
    private TrimClipUnits.Milliseconds maximumDistance;
    private final t<j> maximumDistanceReachedObservable;
    private final PublishSubject<j> maximumDistanceReachedSubject;
    private TrimClipUnits.Milliseconds minimumDistance;
    private final f rightTouches$delegate;
    private final t<TrimClipUnits.Milliseconds> startPositionObservable;
    private final a<TrimClipUnits.Milliseconds> startPositionSubject;
    private final f thumbWidth$delegate;
    private final t<Pair<TrimClipUnits.Milliseconds, Integer>> userSeekPositionObservable;
    private final a<Pair<TrimClipUnits.Milliseconds, Integer>> userSeekPositionSubject;
    private final t<TrimClipUnits.Milliseconds> userSeekProgressPositionObservable;
    private final a<TrimClipUnits.Milliseconds> userSeekProgressPositionSubject;
    
    static {
        Companion = new Companion(null);
    }
    
    public StickerTimerScrubber(final Context context) {
        e.f((Object)context, "context");
        this(context, null, 0, 0, 14, null);
    }
    
    public StickerTimerScrubber(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0, 0, 12, null);
    }
    
    public StickerTimerScrubber(final Context context, final AttributeSet set, final int n) {
        e.f((Object)context, "context");
        this(context, set, n, 0, 8, null);
    }
    
    public StickerTimerScrubber(final Context context, final AttributeSet set, int n, final int n2) {
        e.f((Object)context, "context");
        super(context, set, n, n2);
        LayoutInflater.from(context).inflate(2131625621, (ViewGroup)this);
        n = 2131429839;
        if (b.d0(2131429839, (View)this) != null) {
            n = 2131431016;
            if (b.d0(2131431016, (View)this) != null) {
                n = 2131431905;
                final View d0 = b.d0(2131431905, (View)this);
                if (d0 != null) {
                    n = 2131431906;
                    final RelativeLayout relativeLayout = (RelativeLayout)b.d0(2131431906, (View)this);
                    if (relativeLayout != null) {
                        n = 2131431907;
                        final RelativeLayout relativeLayout2 = (RelativeLayout)b.d0(2131431907, (View)this);
                        if (relativeLayout2 != null) {
                            n = 2131431908;
                            final ClipSeekBar clipSeekBar = (ClipSeekBar)b.d0(2131431908, (View)this);
                            if (clipSeekBar != null) {
                                n = 2131431909;
                                final View d2 = b.d0(2131431909, (View)this);
                                if (d2 != null) {
                                    this.binding = new d((View)this, d0, relativeLayout, relativeLayout2, clipSeekBar, d2);
                                    this.attachedToWindowDisposable = new CompositeDisposable();
                                    this.thumbWidth$delegate = kotlin.a.b((mg2.a)new StickerTimerScrubber$thumbWidth$2(this));
                                    this.handleWidth$delegate = kotlin.a.b((mg2.a)new StickerTimerScrubber$handleWidth$2(this));
                                    final TrimClipUnits.Milliseconds.Companion companion = TrimClipUnits.Milliseconds.Companion;
                                    this.minimumDistance = companion.getZERO();
                                    this.maximumDistance = companion.getZERO();
                                    this.leftTouches$delegate = kotlin.a.b((mg2.a)new StickerTimerScrubber$leftTouches$2(this));
                                    this.rightTouches$delegate = kotlin.a.b((mg2.a)new StickerTimerScrubber$rightTouches$2(this));
                                    this.bars$delegate = kotlin.a.b((mg2.a)new StickerTimerScrubber$bars$2(this));
                                    this.clipSeekBarWidthSubject = new a<TrimClipUnits.Pixels>();
                                    final a<TrimClipUnits.Milliseconds> startPositionSubject = new a<TrimClipUnits.Milliseconds>();
                                    this.startPositionSubject = startPositionSubject;
                                    final a<TrimClipUnits.Milliseconds> endPositionSubject = new a<TrimClipUnits.Milliseconds>();
                                    this.endPositionSubject = endPositionSubject;
                                    final t<Object> distinctUntilChanged = (t<Object>)((t<TrimClipUnits.Milliseconds>)startPositionSubject).distinctUntilChanged();
                                    e.e((Object)distinctUntilChanged, "startPositionSubject.distinctUntilChanged()");
                                    this.startPositionObservable = (t<TrimClipUnits.Milliseconds>)distinctUntilChanged;
                                    final t<Object> distinctUntilChanged2 = (t<Object>)((t<TrimClipUnits.Milliseconds>)endPositionSubject).distinctUntilChanged();
                                    e.e((Object)distinctUntilChanged2, "endPositionSubject.distinctUntilChanged()");
                                    this.endPositionObservable = (t<TrimClipUnits.Milliseconds>)distinctUntilChanged2;
                                    final PublishSubject create = PublishSubject.create();
                                    e.e((Object)create, "create<Unit>()");
                                    this.maximumDistanceReachedSubject = (PublishSubject<j>)create;
                                    this.maximumDistanceReachedObservable = (t<j>)create;
                                    this.internalUserSeekPositionSubject = a.b(new Pair((Object)companion.getZERO(), (Object)0));
                                    this.internalProgrammaticSeekPositionSubject = a.b(companion.getZERO());
                                    final a<Pair<TrimClipUnits.Milliseconds, Integer>> userSeekPositionSubject = new a<Pair<TrimClipUnits.Milliseconds, Integer>>();
                                    this.userSeekPositionSubject = userSeekPositionSubject;
                                    final t<Object> distinctUntilChanged3 = (t<Object>)((t<Pair<TrimClipUnits.Milliseconds, Integer>>)userSeekPositionSubject).distinctUntilChanged();
                                    e.e((Object)distinctUntilChanged3, "userSeekPositionSubject.distinctUntilChanged()");
                                    this.userSeekPositionObservable = (t<Pair<TrimClipUnits.Milliseconds, Integer>>)distinctUntilChanged3;
                                    final a<TrimClipUnits.Milliseconds> userSeekProgressPositionSubject = new a<TrimClipUnits.Milliseconds>();
                                    this.userSeekProgressPositionSubject = userSeekProgressPositionSubject;
                                    final t<Object> distinctUntilChanged4 = (t<Object>)((t<TrimClipUnits.Milliseconds>)userSeekProgressPositionSubject).distinctUntilChanged();
                                    e.e((Object)distinctUntilChanged4, "userSeekProgressPosition\u2026ct.distinctUntilChanged()");
                                    this.userSeekProgressPositionObservable = (t<TrimClipUnits.Milliseconds>)distinctUntilChanged4;
                                    this.editingObservable$delegate = kotlin.a.b((mg2.a)new StickerTimerScrubber$editingObservable$2(this));
                                    final ClipSeekBar e = this.binding.e;
                                    e.hideBackground();
                                    e.setThumbResource(2131233193);
                                    final WeakHashMap a = l0.a;
                                    if (l0$g.c((View)e) && !((View)e).isLayoutRequested()) {
                                        access$getClipSeekBarWidthSubject$p(this).onNext(new TrimClipUnits.Pixels(((View)access$getBinding$p(this).e).getWidth()));
                                    }
                                    else {
                                        ((View)e).addOnLayoutChangeListener((View$OnLayoutChangeListener)new StickerTimerScrubber$_init_$lambda_2$$inlined$doOnLayout.StickerTimerScrubber$_init_$lambda_2$$inlined$doOnLayout$1(this));
                                    }
                                    e.setListener((ClipSeekBarListener)new StickerTimerScrubber$1.StickerTimerScrubber$1$2(this));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(((View)this).getResources().getResourceName(n)));
    }
    
    public StickerTimerScrubber(final Context context, AttributeSet set, int n, int n2, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x2) != 0x0) {
            set = null;
        }
        if ((n3 & 0x4) != 0x0) {
            n = 0;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = 0;
        }
        this(context, set, n, n2);
    }
    
    public static PositionData a(final StickerTimerScrubber stickerTimerScrubber, final TrimClipUnits.Pixels pixels) {
        return observeRightTouches$lambda-7(stickerTimerScrubber, pixels);
    }
    
    public static final TrimClipUnits.Pixels access$endPositionToRightMargin(final StickerTimerScrubber stickerTimerScrubber, final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return stickerTimerScrubber.endPositionToRightMargin(milliseconds, pixels);
    }
    
    public static final d access$getBinding$p(final StickerTimerScrubber stickerTimerScrubber) {
        return stickerTimerScrubber.binding;
    }
    
    public static final a access$getClipSeekBarWidthSubject$p(final StickerTimerScrubber stickerTimerScrubber) {
        return stickerTimerScrubber.clipSeekBarWidthSubject;
    }
    
    public static final TrimClipUnits.Pixels access$getDimensionInPixels(final StickerTimerScrubber stickerTimerScrubber, final int n) {
        return stickerTimerScrubber.getDimensionInPixels(n);
    }
    
    public static final a access$getInternalUserSeekPositionSubject$p(final StickerTimerScrubber stickerTimerScrubber) {
        return stickerTimerScrubber.internalUserSeekPositionSubject;
    }
    
    public static final t access$getLeftTouches(final StickerTimerScrubber stickerTimerScrubber) {
        return stickerTimerScrubber.getLeftTouches();
    }
    
    public static final t access$getRightTouches(final StickerTimerScrubber stickerTimerScrubber) {
        return stickerTimerScrubber.getRightTouches();
    }
    
    public static final TrimClipUnits.Pixels access$startPositionToLeftMargin(final StickerTimerScrubber stickerTimerScrubber, final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return stickerTimerScrubber.startPositionToLeftMargin(milliseconds, pixels);
    }
    
    public static void b(final a a, final StickerTimerScrubber stickerTimerScrubber, final PositionData positionData) {
        coercePosition$lambda-8(a, stickerTimerScrubber, positionData);
    }
    
    public static void c(final StickerTimerScrubber stickerTimerScrubber, final Triple triple) {
        updateClipSeekBar$lambda-3(stickerTimerScrubber, triple);
    }
    
    private final void coercePosition(final t<PositionData> t, final a<TrimClipUnits.Milliseconds> a) {
        final df2.a subscribe = t.subscribe((ff2.g<? super PositionData>)new com.reddit.video.creation.widgets.widget.trimclipview.a(0, a, this));
        e.e((Object)subscribe, "subscribe {\n      val ol\u2026newPositionCoerced)\n    }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final void coercePosition$lambda-8(final a a, final StickerTimerScrubber stickerTimerScrubber, final PositionData positionData) {
        e.f((Object)a, "$oldPositionSubject");
        e.f((Object)stickerTimerScrubber, "this$0");
        final Companion companion = StickerTimerScrubber.Companion;
        final TrimClipUnits.Milliseconds access$getValueOrZero = StickerTimerScrubber.Companion.access$getValueOrZero(companion, a);
        final TrimClipUnits.Milliseconds plus = access$getValueOrZero.plus(positionData.getOffset().div(StickerTimerScrubber.Companion.access$getValueOrZero(companion, (a)stickerTimerScrubber.clipSeekBarWidthSubject)).times(stickerTimerScrubber.getClipDuration()));
        final TrimClipUnits.Milliseconds coerceIn = plus.coerceIn(positionData.getAllowedRange());
        if (!e.a((Object)coerceIn, (Object)access$getValueOrZero) && positionData.getMaximumDistanceRange().exclusive().contains(plus)) {
            stickerTimerScrubber.maximumDistanceReachedSubject.onNext((Object)j.a);
        }
        a.onNext(coerceIn);
    }
    
    public static PositionData d(final StickerTimerScrubber stickerTimerScrubber, final TrimClipUnits.Pixels pixels) {
        return observeLeftTouches$lambda-6(stickerTimerScrubber, pixels);
    }
    
    public static void e(final StickerTimerScrubber stickerTimerScrubber, final Boolean b) {
        observeTouchEvents$lambda-5(stickerTimerScrubber, b);
    }
    
    private final TrimClipUnits.Pixels endPositionToRightMargin(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return TrimClipUnits.Percentage.Companion.getONE().minus(milliseconds.div(this.getClipDuration())).times(pixels.minus(this.getThumbWidth()));
    }
    
    public static void f(final p p5, final StickerTimerScrubber stickerTimerScrubber, final View view, final p p6, final Pair pair) {
        observeMarginUpdates$lambda-12(p5, stickerTimerScrubber, view, p6, pair);
    }
    
    public static boolean g(final StickerTimerScrubber stickerTimerScrubber, final Boolean b) {
        return observeTouchEvents$lambda-4(stickerTimerScrubber, b);
    }
    
    private final List<View> getBars() {
        return (List)this.bars$delegate.getValue();
    }
    
    private final TrimClipUnits.Milliseconds getClipDuration() {
        final List<AdjustableClip> adjustableClips = this.adjustableClips;
        if (adjustableClips != null) {
            final Iterator<Object> iterator = adjustableClips.iterator();
            long n = 0L;
            while (iterator.hasNext()) {
                n += iterator.next().getDurationMillis();
            }
            return new TrimClipUnits.Milliseconds(n);
        }
        e.n("adjustableClips");
        throw null;
    }
    
    private final TrimClipUnits.Pixels getDimensionInPixels(final int n) {
        return new TrimClipUnits.Pixels(p7.a.W(((View)this).getResources().getDimension(n)));
    }
    
    private final TrimClipUnits.Pixels getHandleWidth() {
        return (TrimClipUnits.Pixels)this.handleWidth$delegate.getValue();
    }
    
    private final t<MotionEvent> getLeftTouches() {
        return (t)this.leftTouches$delegate.getValue();
    }
    
    private final t<MotionEvent> getRightTouches() {
        return (t)this.rightTouches$delegate.getValue();
    }
    
    private final TrimClipUnits.Pixels getThumbWidth() {
        return (TrimClipUnits.Pixels)this.thumbWidth$delegate.getValue();
    }
    
    public static void h(final StickerTimerScrubber stickerTimerScrubber, final List list, final TrimClipUnits.Pixels pixels) {
        setClips$lambda-13(stickerTimerScrubber, list, pixels);
    }
    
    private final void observeLeftTouches() {
        final Companion companion = StickerTimerScrubber.Companion;
        final t<MotionEvent> leftTouches = this.getLeftTouches();
        e.e((Object)leftTouches, "leftTouches");
        final t map = StickerTimerScrubber.Companion.access$movementOffsets(companion, leftTouches).map((o)new com.reddit.video.creation.widgets.widget.trimclipview.f(this));
        e.e((Object)map, "leftTouches.movementOffs\u2026sition,\n        )\n      }");
        this.coercePosition(map, this.startPositionSubject);
    }
    
    private static final PositionData observeLeftTouches$lambda-6(final StickerTimerScrubber stickerTimerScrubber, final TrimClipUnits.Pixels pixels) {
        e.f((Object)stickerTimerScrubber, "this$0");
        e.f((Object)pixels, "it");
        final TrimClipUnits.Milliseconds access$getValueOrZero = StickerTimerScrubber.Companion.access$getValueOrZero(StickerTimerScrubber.Companion, (a)stickerTimerScrubber.endPositionSubject);
        final TrimClipUnits.Milliseconds.Companion companion = TrimClipUnits.Milliseconds.Companion;
        final TrimClipUnits.Milliseconds max = TrimClipUnitsKt.max(companion.getZERO(), access$getValueOrZero.minus(stickerTimerScrubber.maximumDistance));
        return new PositionData(pixels, max.rangeTo(access$getValueOrZero.minus(stickerTimerScrubber.minimumDistance)), companion.getZERO().rangeTo(max));
    }
    
    private final void observeMarginUpdates(final t<TrimClipUnits.Milliseconds> t, final p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels> p4, final p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j> p5, final View view) {
        final df2.a subscribe = yf2.a.a((t)t, (t)this.clipSeekBarWidthSubject).distinctUntilChanged().subscribe((g)new mf1.g((p)p4, this, view, (p)p5));
        e.e((Object)subscribe, "Observables.combineLates\u2026nSetter(margin) }\n      }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final void observeMarginUpdates$lambda-12(final p p5, final StickerTimerScrubber stickerTimerScrubber, final View view, final p p6, final Pair pair) {
        e.f((Object)p5, "$positionToMarginConverter");
        e.f((Object)stickerTimerScrubber, "this$0");
        e.f((Object)view, "$handle");
        e.f((Object)p6, "$marginSetter");
        final TrimClipUnits.Milliseconds milliseconds = (TrimClipUnits.Milliseconds)pair.component1();
        final TrimClipUnits.Pixels pixels = (TrimClipUnits.Pixels)pair.component2();
        e.e((Object)pixels, "clipSeekBarWidth");
        final TrimClipUnits.Pixels pixels2 = (TrimClipUnits.Pixels)p5.invoke((Object)milliseconds, (Object)pixels);
        for (final View view2 : stickerTimerScrubber.getBars()) {
            e.e((Object)view2, "it");
            final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            final RelativeLayout$LayoutParams layoutParams2 = (RelativeLayout$LayoutParams)layoutParams;
            p6.invoke((Object)layoutParams2, (Object)pixels2.plus(stickerTimerScrubber.getHandleWidth()));
            view2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        }
        final ViewGroup$LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 != null) {
            final RelativeLayout$LayoutParams layoutParams4 = (RelativeLayout$LayoutParams)layoutParams3;
            p6.invoke((Object)layoutParams4, (Object)pixels2);
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }
    
    private final void observeProgressSeekPosition() {
        final df2.a subscribe = ((t<Object>)this.internalProgrammaticSeekPositionSubject).distinctUntilChanged().subscribe((ff2.g<? super Object>)new com.reddit.video.creation.widgets.widget.trimclipview.b(this.userSeekProgressPositionSubject, 0));
        e.e((Object)subscribe, "internalProgrammaticSeek\u2026sPositionSubject::onNext)");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private final void observeRightTouches() {
        final Companion companion = StickerTimerScrubber.Companion;
        final t<MotionEvent> rightTouches = this.getRightTouches();
        e.e((Object)rightTouches, "rightTouches");
        final t map = StickerTimerScrubber.Companion.access$movementOffsets(companion, rightTouches).map((o)new c(this));
        e.e((Object)map, "rightTouches.movementOff\u2026ration,\n        )\n      }");
        this.coercePosition(map, this.endPositionSubject);
    }
    
    private static final PositionData observeRightTouches$lambda-7(final StickerTimerScrubber stickerTimerScrubber, final TrimClipUnits.Pixels pixels) {
        e.f((Object)stickerTimerScrubber, "this$0");
        e.f((Object)pixels, "it");
        final TrimClipUnits.Milliseconds access$getValueOrZero = StickerTimerScrubber.Companion.access$getValueOrZero(StickerTimerScrubber.Companion, (a)stickerTimerScrubber.startPositionSubject);
        final TrimClipUnits.Milliseconds clipDuration = stickerTimerScrubber.getClipDuration();
        final TrimClipUnits.Milliseconds min = TrimClipUnitsKt.min(clipDuration, access$getValueOrZero.plus(stickerTimerScrubber.maximumDistance));
        return new PositionData(pixels, access$getValueOrZero.plus(stickerTimerScrubber.minimumDistance).rangeTo(min), min.rangeTo(clipDuration));
    }
    
    private final void observeSeekPosition() {
        final df2.a subscribe = ((t<Object>)this.internalUserSeekPositionSubject).distinctUntilChanged().subscribe((ff2.g<? super Object>)new com.reddit.video.creation.widgets.widget.trimclipview.d(this.userSeekPositionSubject, 0));
        e.e((Object)subscribe, "internalUserSeekPosition\u2026kPositionSubject::onNext)");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private final void observeTouchEvents() {
        final Companion companion = StickerTimerScrubber.Companion;
        final t<Object> merge = t.merge((af2.y<?>)this.getLeftTouches(), (af2.y<?>)this.getRightTouches());
        e.e((Object)merge, "merge(\n      leftTouches\u2026      rightTouches,\n    )");
        final df2.a subscribe = StickerTimerScrubber.Companion.access$isInUseTouchEvents(companion, merge).filter((q)new r(this, 0)).doOnNext((g)new com.reddit.video.creation.widgets.voiceover.a(this, 1)).subscribe();
        e.e((Object)subscribe, "merge(\n      leftTouches\u2026(it) }\n      .subscribe()");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final boolean observeTouchEvents$lambda-4(final StickerTimerScrubber stickerTimerScrubber, final Boolean b) {
        e.f((Object)stickerTimerScrubber, "this$0");
        e.f((Object)b, "it");
        return ((View)stickerTimerScrubber).getParent() != null;
    }
    
    private static final void observeTouchEvents$lambda-5(final StickerTimerScrubber stickerTimerScrubber, final Boolean b) {
        e.f((Object)stickerTimerScrubber, "this$0");
        final ViewParent parent = ((View)stickerTimerScrubber).getParent();
        e.e((Object)b, "it");
        parent.requestDisallowInterceptTouchEvent((boolean)b);
    }
    
    private static final void setClips$lambda-13(final StickerTimerScrubber stickerTimerScrubber, final List list, final TrimClipUnits.Pixels pixels) {
        e.f((Object)stickerTimerScrubber, "this$0");
        e.f((Object)list, "$adjustableClips");
        final ClipSeekBar e = stickerTimerScrubber.binding.e;
        ng2.e.e((Object)e, "binding.trimClipScrubberSeekBar");
        ClipSeekBar.setUpWithClips$default(e, list, false, false, 6, null);
    }
    
    private final TrimClipUnits.Pixels startPositionToLeftMargin(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return milliseconds.div(this.getClipDuration()).times(pixels.minus(this.getThumbWidth()));
    }
    
    private final void updateClipSeekBar() {
        final a<TrimClipUnits.Milliseconds> startPositionSubject = this.startPositionSubject;
        final a<TrimClipUnits.Milliseconds> endPositionSubject = this.endPositionSubject;
        final a<TrimClipUnits.Pixels> clipSeekBarWidthSubject = this.clipSeekBarWidthSubject;
        e.g((Object)startPositionSubject, "source1");
        e.g((Object)endPositionSubject, "source2");
        e.g((Object)clipSeekBarWidthSubject, "source3");
        final t<Object> combineLatest = t.combineLatest((af2.y<?>)startPositionSubject, (af2.y<?>)endPositionSubject, (af2.y<?>)clipSeekBarWidthSubject, (ff2.h<? super Object, ? super Object, ? super Object, ?>)p7.a.C);
        e.b((Object)combineLatest, "Observable.combineLatest\u2026 -> Triple(t1, t2, t3) })");
        final df2.a subscribe = combineLatest.subscribe((ff2.g<? super Object>)new com.reddit.video.creation.widgets.widget.trimclipview.e(this, 0));
        e.e((Object)subscribe, "Observables.combineLates\u2026.value,\n        )\n      }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final void updateClipSeekBar$lambda-3(final StickerTimerScrubber stickerTimerScrubber, final Triple triple) {
        e.f((Object)stickerTimerScrubber, "this$0");
        final TrimClipUnits.Milliseconds milliseconds = (TrimClipUnits.Milliseconds)triple.component1();
        final TrimClipUnits.Milliseconds milliseconds2 = (TrimClipUnits.Milliseconds)triple.component2();
        final TrimClipUnits.Pixels pixels = (TrimClipUnits.Pixels)triple.component3();
        e.e((Object)milliseconds, "startPosition");
        e.e((Object)pixels, "clipSeekBarWidth");
        final TrimClipUnits.Pixels startPositionToLeftMargin = stickerTimerScrubber.startPositionToLeftMargin(milliseconds, pixels);
        e.e((Object)milliseconds2, "endPosition");
        final TrimClipUnits.Pixels endPositionToRightMargin = stickerTimerScrubber.endPositionToRightMargin(milliseconds2, pixels);
        final ClipSeekBar e = stickerTimerScrubber.binding.e;
        ng2.e.e((Object)e, "binding.trimClipScrubberSeekBar");
        ClipSeekBar.setTimeTextsAndPositions$default(e, startPositionToLeftMargin.getValue(), milliseconds.getValue(), endPositionToRightMargin.getValue(), milliseconds2.getValue(), false, 16, null);
    }
    
    public final t<Boolean> getEditingObservable() {
        final Object value = this.editingObservable$delegate.getValue();
        e.e(value, "<get-editingObservable>(...)");
        return (t<Boolean>)value;
    }
    
    public final t<TrimClipUnits.Milliseconds> getEndPositionObservable() {
        return this.endPositionObservable;
    }
    
    public final t<j> getMaximumDistanceReachedObservable() {
        return this.maximumDistanceReachedObservable;
    }
    
    public final t<TrimClipUnits.Milliseconds> getStartPositionObservable() {
        return this.startPositionObservable;
    }
    
    public final t<Pair<TrimClipUnits.Milliseconds, Integer>> getUserSeekPositionObservable() {
        return this.userSeekPositionObservable;
    }
    
    public final t<TrimClipUnits.Milliseconds> getUserSeekProgressPositionObservable() {
        return this.userSeekProgressPositionObservable;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.observeLeftTouches();
        this.observeRightTouches();
        this.observeTouchEvents();
        final a<TrimClipUnits.Milliseconds> startPositionSubject = this.startPositionSubject;
        final StickerTimerScrubber$onAttachedToWindow$1 stickerTimerScrubber$onAttachedToWindow$1 = new StickerTimerScrubber$onAttachedToWindow$1((Object)this);
        final StickerTimerScrubber$onAttachedToWindow$2 instance = StickerTimerScrubber$onAttachedToWindow$2.INSTANCE;
        final RelativeLayout c = this.binding.c;
        e.e((Object)c, "binding.trimClipScrubberLeftHandle");
        this.observeMarginUpdates((t<TrimClipUnits.Milliseconds>)startPositionSubject, (p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels>)stickerTimerScrubber$onAttachedToWindow$1, (p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j>)instance, (View)c);
        final a<TrimClipUnits.Milliseconds> endPositionSubject = this.endPositionSubject;
        final StickerTimerScrubber$onAttachedToWindow$3 stickerTimerScrubber$onAttachedToWindow$2 = new StickerTimerScrubber$onAttachedToWindow$3((Object)this);
        final StickerTimerScrubber$onAttachedToWindow$4 instance2 = StickerTimerScrubber$onAttachedToWindow$4.INSTANCE;
        final RelativeLayout d = this.binding.d;
        e.e((Object)d, "binding.trimClipScrubberRightHandle");
        this.observeMarginUpdates((t<TrimClipUnits.Milliseconds>)endPositionSubject, (p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels>)stickerTimerScrubber$onAttachedToWindow$2, (p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j>)instance2, (View)d);
        this.updateClipSeekBar();
        this.observeSeekPosition();
        this.observeProgressSeekPosition();
    }
    
    public void onDetachedFromWindow() {
        this.attachedToWindowDisposable.clear();
        super.onDetachedFromWindow();
    }
    
    public final void setClips(final List<AdjustableClip> adjustableClips) {
        e.f((Object)adjustableClips, "adjustableClips");
        this.adjustableClips = adjustableClips;
        final CompositeDisposable attachedToWindowDisposable = this.attachedToWindowDisposable;
        final df2.a subscribe = ((t<Object>)this.clipSeekBarWidthSubject).subscribe((ff2.g<? super Object>)new com.reddit.video.creation.widgets.widget.trimclipview.a(this, adjustableClips));
        e.e((Object)subscribe, "clipSeekBarWidthSubject.\u2026ps(adjustableClips)\n    }");
        p7.a.J(attachedToWindowDisposable, subscribe);
    }
    
    public final void setDistances(final TrimClipUnits.Milliseconds minimumDistance, final TrimClipUnits.Milliseconds maximumDistance) {
        e.f((Object)minimumDistance, "minimumDistance");
        e.f((Object)maximumDistance, "maximumDistance");
        this.minimumDistance = minimumDistance;
        this.maximumDistance = maximumDistance;
    }
    
    public final void setPositions(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Milliseconds milliseconds2) {
        e.f((Object)milliseconds, "startPosition");
        e.f((Object)milliseconds2, "endPosition");
        final Companion companion = StickerTimerScrubber.Companion;
        final TrimClipUnits.Milliseconds access$getValueOrZero = StickerTimerScrubber.Companion.access$getValueOrZero(companion, (a)this.startPositionSubject);
        final TrimClipUnits.Milliseconds.Companion companion2 = TrimClipUnits.Milliseconds.Companion;
        if (e.a((Object)access$getValueOrZero, (Object)companion2.getZERO())) {
            this.startPositionSubject.onNext(milliseconds);
        }
        if (e.a((Object)StickerTimerScrubber.Companion.access$getValueOrZero(companion, (a)this.endPositionSubject), (Object)companion2.getZERO()) && milliseconds2.getValue() != Long.MAX_VALUE) {
            this.endPositionSubject.onNext(milliseconds2);
        }
    }
    
    public final void setSeekBarAtPosition(final TrimClipUnits.Milliseconds milliseconds) {
        e.f((Object)milliseconds, "millis");
        this.internalProgrammaticSeekPositionSubject.onNext(milliseconds);
        final ClipSeekBar e = this.binding.e;
        ng2.e.e((Object)e, "binding.trimClipScrubberSeekBar");
        ClipSeekBar.setSeekBarAtPosition$default(e, milliseconds.getValue(), 0, 2, null);
    }
    
    @Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\r" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/StickerTimerScrubber$Companion;", "", "Lag2/a;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "getValueOrZero", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "Laf2/t;", "Landroid/view/MotionEvent;", "", "isInUseTouchEvents", "movementOffsets", "<init>", "()V", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public static y a(final t t, final MotionEvent motionEvent) {
            return movementOffsets$lambda-4(t, motionEvent);
        }
        
        public static final TrimClipUnits.Milliseconds access$getValueOrZero(final Companion companion, final a a) {
            return companion.getValueOrZero((a<TrimClipUnits.Milliseconds>)a);
        }
        
        public static final TrimClipUnits.Pixels access$getValueOrZero(final Companion companion, final a a) {
            return companion.getValueOrZero((a<TrimClipUnits.Pixels>)a);
        }
        
        public static final t access$isInUseTouchEvents(final Companion companion, final t t) {
            return companion.isInUseTouchEvents(t);
        }
        
        public static final t access$movementOffsets(final Companion companion, final t t) {
            return companion.movementOffsets(t);
        }
        
        public static Boolean b(final MotionEvent motionEvent) {
            return isInUseTouchEvents$lambda-0(motionEvent);
        }
        
        public static TrimClipUnits.Pixels c(final float n, final MotionEvent motionEvent) {
            return movementOffsets$lambda-4$lambda-3(n, motionEvent);
        }
        
        public static boolean d(final MotionEvent motionEvent) {
            return movementOffsets$lambda-4$lambda-2(motionEvent);
        }
        
        public static boolean e(final MotionEvent motionEvent) {
            return movementOffsets$lambda-1(motionEvent);
        }
        
        private final TrimClipUnits.Milliseconds getValueOrZero(final a<TrimClipUnits.Milliseconds> a) {
            Object zero;
            if ((zero = a.d()) == null) {
                zero = TrimClipUnits.Milliseconds.Companion.getZERO();
            }
            e.e(zero, "value ?: Milliseconds.ZERO");
            return (TrimClipUnits.Milliseconds)zero;
        }
        
        private final TrimClipUnits.Pixels getValueOrZero(final a<TrimClipUnits.Pixels> a) {
            Object zero;
            if ((zero = a.d()) == null) {
                zero = TrimClipUnits.Pixels.Companion.getZERO();
            }
            e.e(zero, "value ?: Pixels.ZERO");
            return (TrimClipUnits.Pixels)zero;
        }
        
        private final t<Boolean> isInUseTouchEvents(final t<MotionEvent> t) {
            final t<Object> map = t.map((ff2.o<? super MotionEvent, ?>)new s(1));
            e.e((Object)map, "map { initialMotionEvent\u2026on == ACTION_MOVE\n      }");
            return (t<Boolean>)map;
        }
        
        private static final Boolean isInUseTouchEvents$lambda-0(final MotionEvent motionEvent) {
            e.f((Object)motionEvent, "initialMotionEvent");
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        
        private final t<TrimClipUnits.Pixels> movementOffsets(final t<MotionEvent> t) {
            final t<Object> switchMap = t.filter((ff2.q<? super MotionEvent>)new l(2)).switchMap((ff2.o<? super MotionEvent, ? extends af2.y<?>>)new com.reddit.video.creation.widgets.widget.trimclipview.g(t, 0));
            e.e((Object)switchMap, "filter {\n        it.acti\u2026empty()\n        }\n      }");
            return (t<TrimClipUnits.Pixels>)switchMap;
        }
        
        private static final boolean movementOffsets$lambda-1(final MotionEvent motionEvent) {
            e.f((Object)motionEvent, "it");
            return cg.d.m3((Object[])new Integer[] { 0, 1 }).contains(motionEvent.getAction());
        }
        
        private static final y movementOffsets$lambda-4(t t, final MotionEvent motionEvent) {
            e.f((Object)t, "$this_movementOffsets");
            e.f((Object)motionEvent, "initialMotionEvent");
            if (motionEvent.getAction() == 0) {
                t = t.filter((ff2.q<? super Object>)new com.reddit.video.creation.widgets.widget.trimclipview.p(1)).map((ff2.o<? super Object, ?>)new com.reddit.video.creation.widgets.widget.trimclipview.h(motionEvent.getX(), 0));
            }
            else {
                t = t.empty();
            }
            return (y)t;
        }
        
        private static final boolean movementOffsets$lambda-4$lambda-2(final MotionEvent motionEvent) {
            e.f((Object)motionEvent, "it");
            return motionEvent.getAction() == 2;
        }
        
        private static final TrimClipUnits.Pixels movementOffsets$lambda-4$lambda-3(final float n, final MotionEvent motionEvent) {
            e.f((Object)motionEvent, "it");
            return new TrimClipUnits.Pixels(p7.a.W(motionEvent.getX() - n));
        }
    }
    
    @Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/StickerTimerScrubber$PositionData;", "", "offset", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "allowedRange", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;", "maximumDistanceRange", "(Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;)V", "getAllowedRange", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;", "getMaximumDistanceRange", "getOffset", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class PositionData
    {
        private final TrimClipUnits.Milliseconds.Range allowedRange;
        private final TrimClipUnits.Milliseconds.Range maximumDistanceRange;
        private final TrimClipUnits.Pixels offset;
        
        public PositionData(final TrimClipUnits.Pixels offset, final TrimClipUnits.Milliseconds.Range allowedRange, final TrimClipUnits.Milliseconds.Range maximumDistanceRange) {
            e.f((Object)offset, "offset");
            e.f((Object)allowedRange, "allowedRange");
            e.f((Object)maximumDistanceRange, "maximumDistanceRange");
            this.offset = offset;
            this.allowedRange = allowedRange;
            this.maximumDistanceRange = maximumDistanceRange;
        }
        
        public static PositionData copy$default(final PositionData positionData, TrimClipUnits.Pixels offset, TrimClipUnits.Milliseconds.Range allowedRange, TrimClipUnits.Milliseconds.Range maximumDistanceRange, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                offset = positionData.offset;
            }
            if ((n & 0x2) != 0x0) {
                allowedRange = positionData.allowedRange;
            }
            if ((n & 0x4) != 0x0) {
                maximumDistanceRange = positionData.maximumDistanceRange;
            }
            return positionData.copy(offset, allowedRange, maximumDistanceRange);
        }
        
        public final TrimClipUnits.Pixels component1() {
            return this.offset;
        }
        
        public final TrimClipUnits.Milliseconds.Range component2() {
            return this.allowedRange;
        }
        
        public final TrimClipUnits.Milliseconds.Range component3() {
            return this.maximumDistanceRange;
        }
        
        public final PositionData copy(final TrimClipUnits.Pixels pixels, final TrimClipUnits.Milliseconds.Range range, final TrimClipUnits.Milliseconds.Range range2) {
            e.f((Object)pixels, "offset");
            e.f((Object)range, "allowedRange");
            e.f((Object)range2, "maximumDistanceRange");
            return new PositionData(pixels, range, range2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof PositionData)) {
                return false;
            }
            final PositionData positionData = (PositionData)o;
            return e.a((Object)this.offset, (Object)positionData.offset) && e.a((Object)this.allowedRange, (Object)positionData.allowedRange) && e.a((Object)this.maximumDistanceRange, (Object)positionData.maximumDistanceRange);
        }
        
        public final TrimClipUnits.Milliseconds.Range getAllowedRange() {
            return this.allowedRange;
        }
        
        public final TrimClipUnits.Milliseconds.Range getMaximumDistanceRange() {
            return this.maximumDistanceRange;
        }
        
        public final TrimClipUnits.Pixels getOffset() {
            return this.offset;
        }
        
        @Override
        public int hashCode() {
            return this.maximumDistanceRange.hashCode() + (this.allowedRange.hashCode() + this.offset.hashCode() * 31) * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("PositionData(offset=");
            t.append(this.offset);
            t.append(", allowedRange=");
            t.append(this.allowedRange);
            t.append(", maximumDistanceRange=");
            t.append(this.maximumDistanceRange);
            t.append(')');
            return t.toString();
        }
    }
}
