// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import u10.k;
import android.widget.RelativeLayout$LayoutParams;
import ff2.h;
import af2.y;
import mg.d0;
import cg.d;
import android.view.MotionEvent;
import java.util.Iterator;
import kotlin.Triple;
import ff2.o;
import ff2.q;
import ff2.g;
import kotlin.Pair;
import java.util.WeakHashMap;
import com.reddit.video.creation.widgets.widget.clipseekbar.ClipSeekBarListener;
import android.view.View$OnLayoutChangeListener;
import a4.l0$g;
import a4.l0;
import com.reddit.video.creation.widgets.widget.clipseekbar.ClipSeekBar;
import android.widget.FrameLayout;
import android.view.View;
import ah0.b;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import io.reactivex.subjects.PublishSubject;
import cg2.j;
import af2.t;
import ag2.a;
import n30.e;
import cg2.f;
import io.reactivex.disposables.CompositeDisposable;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import java.util.List;
import kotlin.Metadata;
import android.widget.RelativeLayout;

@Metadata(bv = {}, d1 = { "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 j2\u00020\u0001:\u0003jklB1\b\u0007\u0012\u0006\u0010c\u001a\u00020b\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010d\u0012\b\b\u0002\u0010f\u001a\u00020\u0019\u0012\b\b\u0002\u0010g\u001a\u00020\u0019¢\u0006\u0004\bh\u0010iJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\u0014\u0010\u0015\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\u0002J\u0012\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\bH\u0002J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u0002H\u0002J\b\u0010\"\u001a\u00020\u0002H\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J \u0010(\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020%0$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0&H\u0002JR\u00100\u001a\u00020\u00022\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0$2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0*2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010/\u001a\u00020.H\u0002J\b\u00101\u001a\u00020\u0002H\u0002J\b\u00102\u001a\u00020\u0002H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002030$H\u0002J\u0016\u00106\u001a\u00020\u00022\f\u00105\u001a\b\u0012\u0004\u0012\u0002030$H\u0002J\u0016\u00107\u001a\u00020\u00022\f\u00105\u001a\b\u0012\u0004\u0012\u0002030$H\u0002R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010<R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010<R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010=R\"\u0010@\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010\u00020\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0$8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\b0$8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010ER\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0$8\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010ER!\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010ER\u001b\u0010S\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010RR\u001b\u0010V\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010RR?\u0010Z\u001a&\u0012\f\u0012\n ?*\u0004\u0018\u00010W0W ?*\u0012\u0012\f\u0012\n ?*\u0004\u0018\u00010W0W\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010M\u001a\u0004\bY\u0010ER?\u0010]\u001a&\u0012\f\u0012\n ?*\u0004\u0018\u00010W0W ?*\u0012\u0012\f\u0012\n ?*\u0004\u0018\u00010W0W\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010ER!\u0010a\u001a\b\u0012\u0004\u0012\u00020.0\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010M\u001a\u0004\b_\u0010`¨\u0006m" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipScrubber;", "Landroid/widget/RelativeLayout;", "Lcg2/j;", "onAttachedToWindow", "", "hasWindowFocus", "onWindowFocusChanged", "onDetachedFromWindow", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "minimumDistance", "maximumDistance", "setDistances", "startPosition", "endPosition", "setPositions", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "adjustableClip", "showMicros", "setClip", "", "adjustableClips", "setClips", "millis", "setSeekBarAtPosition", "setScrubberColorWhite", "", "id", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "getDimensionInPixels", "getClipDuration", "clipSeekBarWidth", "startPositionToLeftMargin", "endPositionToRightMargin", "observeTouchEvents", "observeLeftTouches", "observeRightTouches", "Laf2/t;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipScrubber$PositionData;", "Lag2/a;", "oldPositionSubject", "coercePosition", "positionObservable", "Lkotlin/Function2;", "positionToMarginConverter", "Landroid/widget/RelativeLayout$LayoutParams;", "marginSetter", "Landroid/view/View;", "handle", "observeMarginUpdates", "updateClipSeekBar", "observeSeekPosition", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipScrubber$SeekPositionData;", "observeInternalSeekPosition", "seekPositionDataObservable", "correctInternalSeekPosition", "publishSeekPosition", "Z", "Lio/reactivex/disposables/CompositeDisposable;", "attachedToWindowDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "Ljava/util/List;", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "maximumDistanceReachedSubject", "Lio/reactivex/subjects/PublishSubject;", "startPositionObservable", "Laf2/t;", "getStartPositionObservable", "()Laf2/t;", "endPositionObservable", "getEndPositionObservable", "maximumDistanceReachedObservable", "getMaximumDistanceReachedObservable", "userSeekPositionObservable", "getUserSeekPositionObservable", "editingObservable$delegate", "Lcg2/f;", "getEditingObservable", "editingObservable", "thumbWidth$delegate", "getThumbWidth", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "thumbWidth", "handleWidth$delegate", "getHandleWidth", "handleWidth", "Landroid/view/MotionEvent;", "leftTouches$delegate", "getLeftTouches", "leftTouches", "rightTouches$delegate", "getRightTouches", "rightTouches", "bars$delegate", "getBars", "()Ljava/util/List;", "bars", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "PositionData", "SeekPositionData", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class TrimClipScrubber extends RelativeLayout
{
    public static final Companion Companion;
    private List<AdjustableClip> adjustableClips;
    private final CompositeDisposable attachedToWindowDisposable;
    private final f bars$delegate;
    private e binding;
    private final a<TrimClipUnits.Pixels> clipSeekBarWidthSubject;
    private final f editingObservable$delegate;
    private final t<TrimClipUnits.Milliseconds> endPositionObservable;
    private final a<TrimClipUnits.Milliseconds> endPositionSubject;
    private final f handleWidth$delegate;
    private final a<TrimClipUnits.Milliseconds> internalProgrammaticSeekPositionSubject;
    private final a<TrimClipUnits.Milliseconds> internalUserSeekPositionSubject;
    private final f leftTouches$delegate;
    private TrimClipUnits.Milliseconds maximumDistance;
    private final t<j> maximumDistanceReachedObservable;
    private final PublishSubject<j> maximumDistanceReachedSubject;
    private TrimClipUnits.Milliseconds minimumDistance;
    private final f rightTouches$delegate;
    private boolean showMicros;
    private final t<TrimClipUnits.Milliseconds> startPositionObservable;
    private final a<TrimClipUnits.Milliseconds> startPositionSubject;
    private final f thumbWidth$delegate;
    private final t<TrimClipUnits.Milliseconds> userSeekPositionObservable;
    private final a<TrimClipUnits.Milliseconds> userSeekPositionSubject;
    
    static {
        Companion = new Companion(null);
    }
    
    public TrimClipScrubber(final Context context) {
        ng2.e.f((Object)context, "context");
        this(context, null, 0, 0, 14, null);
    }
    
    public TrimClipScrubber(final Context context, final AttributeSet set) {
        ng2.e.f((Object)context, "context");
        this(context, set, 0, 0, 12, null);
    }
    
    public TrimClipScrubber(final Context context, final AttributeSet set, final int n) {
        ng2.e.f((Object)context, "context");
        this(context, set, n, 0, 8, null);
    }
    
    public TrimClipScrubber(final Context context, final AttributeSet set, int n, final int n2) {
        ng2.e.f((Object)context, "context");
        super(context, set, n, n2);
        this.attachedToWindowDisposable = new CompositeDisposable();
        this.thumbWidth$delegate = kotlin.a.b((mg2.a)new TrimClipScrubber$thumbWidth$2(this));
        this.handleWidth$delegate = kotlin.a.b((mg2.a)new TrimClipScrubber$handleWidth$2(this));
        final TrimClipUnits.Milliseconds.Companion companion = TrimClipUnits.Milliseconds.Companion;
        this.minimumDistance = companion.getZERO();
        this.maximumDistance = companion.getZERO();
        this.leftTouches$delegate = kotlin.a.b((mg2.a)new TrimClipScrubber$leftTouches$2(this));
        this.rightTouches$delegate = kotlin.a.b((mg2.a)new TrimClipScrubber$rightTouches$2(this));
        this.bars$delegate = kotlin.a.b((mg2.a)new TrimClipScrubber$bars$2(this));
        this.clipSeekBarWidthSubject = new a<TrimClipUnits.Pixels>();
        final a startPositionSubject = new a<TrimClipUnits.Milliseconds>();
        this.startPositionSubject = (a<TrimClipUnits.Milliseconds>)startPositionSubject;
        final a endPositionSubject = new a<TrimClipUnits.Milliseconds>();
        this.endPositionSubject = (a<TrimClipUnits.Milliseconds>)endPositionSubject;
        final t<TrimClipUnits.Milliseconds> distinctUntilChanged = ((t<TrimClipUnits.Milliseconds>)startPositionSubject).distinctUntilChanged();
        ng2.e.e((Object)distinctUntilChanged, "startPositionSubject.distinctUntilChanged()");
        this.startPositionObservable = distinctUntilChanged;
        final t<TrimClipUnits.Milliseconds> distinctUntilChanged2 = ((t<TrimClipUnits.Milliseconds>)endPositionSubject).distinctUntilChanged();
        ng2.e.e((Object)distinctUntilChanged2, "endPositionSubject.distinctUntilChanged()");
        this.endPositionObservable = distinctUntilChanged2;
        final PublishSubject create = PublishSubject.create();
        ng2.e.e((Object)create, "create<Unit>()");
        this.maximumDistanceReachedSubject = (PublishSubject<j>)create;
        this.maximumDistanceReachedObservable = (t<j>)create;
        this.internalUserSeekPositionSubject = a.b(companion.getZERO());
        this.internalProgrammaticSeekPositionSubject = a.b(companion.getZERO());
        final a userSeekPositionSubject = new a<TrimClipUnits.Milliseconds>();
        this.userSeekPositionSubject = (a<TrimClipUnits.Milliseconds>)userSeekPositionSubject;
        final t<TrimClipUnits.Milliseconds> distinctUntilChanged3 = ((t<TrimClipUnits.Milliseconds>)userSeekPositionSubject).distinctUntilChanged();
        ng2.e.e((Object)distinctUntilChanged3, "userSeekPositionSubject.distinctUntilChanged()");
        this.userSeekPositionObservable = distinctUntilChanged3;
        this.editingObservable$delegate = kotlin.a.b((mg2.a)new TrimClipScrubber$editingObservable$2(this));
        LayoutInflater.from(context).inflate(2131625623, (ViewGroup)this);
        n = 2131429841;
        final ImageView imageView = (ImageView)b.d0(2131429841, (View)this);
        if (imageView != null) {
            n = 2131431018;
            final ImageView imageView2 = (ImageView)b.d0(2131431018, (View)this);
            if (imageView2 != null) {
                n = 2131431905;
                final View d0 = b.d0(2131431905, (View)this);
                if (d0 != null) {
                    n = 2131431906;
                    final FrameLayout frameLayout = (FrameLayout)b.d0(2131431906, (View)this);
                    if (frameLayout != null) {
                        n = 2131431907;
                        final FrameLayout frameLayout2 = (FrameLayout)b.d0(2131431907, (View)this);
                        if (frameLayout2 != null) {
                            n = 2131431908;
                            final ClipSeekBar clipSeekBar = (ClipSeekBar)b.d0(2131431908, (View)this);
                            if (clipSeekBar != null) {
                                n = 2131431909;
                                final View d2 = b.d0(2131431909, (View)this);
                                if (d2 != null) {
                                    this.binding = new e((View)this, imageView, imageView2, d0, frameLayout, frameLayout2, clipSeekBar, d2);
                                    clipSeekBar.hideBackground();
                                    clipSeekBar.setThumbResource(2131233193);
                                    final WeakHashMap a = l0.a;
                                    if (l0$g.c((View)clipSeekBar) && !((View)clipSeekBar).isLayoutRequested()) {
                                        final a access$getClipSeekBarWidthSubject$p = access$getClipSeekBarWidthSubject$p(this);
                                        final e access$getBinding$p = access$getBinding$p(this);
                                        if (access$getBinding$p == null) {
                                            ng2.e.n("binding");
                                            throw null;
                                        }
                                        access$getClipSeekBarWidthSubject$p.onNext(new TrimClipUnits.Pixels(((View)access$getBinding$p.g).getWidth()));
                                    }
                                    else {
                                        ((View)clipSeekBar).addOnLayoutChangeListener((View$OnLayoutChangeListener)new TrimClipScrubber$_init_$lambda_2$$inlined$doOnLayout.TrimClipScrubber$_init_$lambda_2$$inlined$doOnLayout$1(this));
                                    }
                                    clipSeekBar.setListener((ClipSeekBarListener)new TrimClipScrubber$1.TrimClipScrubber$1$2(this));
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
    
    public TrimClipScrubber(final Context context, AttributeSet set, int n, int n2, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
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
    
    public static Pair a(final TrimClipUnits.Milliseconds milliseconds) {
        return observeInternalSeekPosition$lambda-13(milliseconds);
    }
    
    public static final TrimClipUnits.Pixels access$endPositionToRightMargin(final TrimClipScrubber trimClipScrubber, final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return trimClipScrubber.endPositionToRightMargin(milliseconds, pixels);
    }
    
    public static final e access$getBinding$p(final TrimClipScrubber trimClipScrubber) {
        return trimClipScrubber.binding;
    }
    
    public static final a access$getClipSeekBarWidthSubject$p(final TrimClipScrubber trimClipScrubber) {
        return trimClipScrubber.clipSeekBarWidthSubject;
    }
    
    public static final TrimClipUnits.Pixels access$getDimensionInPixels(final TrimClipScrubber trimClipScrubber, final int n) {
        return trimClipScrubber.getDimensionInPixels(n);
    }
    
    public static final a access$getInternalUserSeekPositionSubject$p(final TrimClipScrubber trimClipScrubber) {
        return trimClipScrubber.internalUserSeekPositionSubject;
    }
    
    public static final t access$getLeftTouches(final TrimClipScrubber trimClipScrubber) {
        return trimClipScrubber.getLeftTouches();
    }
    
    public static final t access$getRightTouches(final TrimClipScrubber trimClipScrubber) {
        return trimClipScrubber.getRightTouches();
    }
    
    public static final TrimClipUnits.Pixels access$startPositionToLeftMargin(final TrimClipScrubber trimClipScrubber, final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return trimClipScrubber.startPositionToLeftMargin(milliseconds, pixels);
    }
    
    public static void b(final TrimClipScrubber trimClipScrubber, final TrimClipUnits.Milliseconds milliseconds) {
        correctInternalSeekPosition$lambda-18(trimClipScrubber, milliseconds);
    }
    
    public static boolean c(final TrimClipScrubber trimClipScrubber, final Boolean b) {
        return observeTouchEvents$lambda-3(trimClipScrubber, b);
    }
    
    private final void coercePosition(final t<PositionData> t, final a<TrimClipUnits.Milliseconds> a) {
        final df2.a subscribe = t.subscribe((ff2.g<? super PositionData>)new com.reddit.video.creation.widgets.widget.trimclipview.a(1, a, this));
        ng2.e.e((Object)subscribe, "subscribe {\n      val ol\u2026newPositionCoerced)\n    }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final void coercePosition$lambda-7(final a a, final TrimClipScrubber trimClipScrubber, final PositionData positionData) {
        ng2.e.f((Object)a, "$oldPositionSubject");
        ng2.e.f((Object)trimClipScrubber, "this$0");
        final Companion companion = TrimClipScrubber.Companion;
        final TrimClipUnits.Milliseconds access$getValueOrZero = TrimClipScrubber.Companion.access$getValueOrZero(companion, a);
        final TrimClipUnits.Milliseconds plus = access$getValueOrZero.plus(positionData.getOffset().div(TrimClipScrubber.Companion.access$getValueOrZero(companion, (a)trimClipScrubber.clipSeekBarWidthSubject)).times(trimClipScrubber.getClipDuration()));
        final TrimClipUnits.Milliseconds coerceIn = plus.coerceIn(positionData.getAllowedRange());
        if (!ng2.e.a((Object)coerceIn, (Object)access$getValueOrZero) && positionData.getMaximumDistanceRange().exclusive().contains(plus)) {
            trimClipScrubber.maximumDistanceReachedSubject.onNext((Object)j.a);
        }
        a.onNext(coerceIn);
    }
    
    private final void correctInternalSeekPosition(final t<SeekPositionData> t) {
        final df2.a subscribe = t.filter((ff2.q<? super SeekPositionData>)new p(0)).map((ff2.o<? super SeekPositionData, ?>)new com.reddit.video.creation.widgets.widget.trimclipview.q(0)).subscribe((ff2.g<? super Object>)new n(this, 1));
        ng2.e.e((Object)subscribe, "seekPositionDataObservab\u2026ubject.onNext(it)\n      }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final boolean correctInternalSeekPosition$lambda-16(final SeekPositionData seekPositionData) {
        ng2.e.f((Object)seekPositionData, "<name for destructuring parameter 0>");
        return seekPositionData.component1();
    }
    
    private static final TrimClipUnits.Milliseconds correctInternalSeekPosition$lambda-17(final SeekPositionData seekPositionData) {
        ng2.e.f((Object)seekPositionData, "<name for destructuring parameter 0>");
        return seekPositionData.component3();
    }
    
    private static final void correctInternalSeekPosition$lambda-18(final TrimClipScrubber trimClipScrubber, final TrimClipUnits.Milliseconds milliseconds) {
        ng2.e.f((Object)trimClipScrubber, "this$0");
        final e binding = trimClipScrubber.binding;
        if (binding != null) {
            final ClipSeekBar g = binding.g;
            ng2.e.e((Object)g, "binding.trimClipScrubberSeekBar");
            ClipSeekBar.setSeekBarAtPosition$default(g, milliseconds.getValue(), 0, 2, null);
            trimClipScrubber.internalUserSeekPositionSubject.onNext(milliseconds);
            return;
        }
        ng2.e.n("binding");
        throw null;
    }
    
    public static void d(final TrimClipScrubber trimClipScrubber, final Triple triple) {
        updateClipSeekBar$lambda-12(trimClipScrubber, triple);
    }
    
    public static void e(final mg2.p p5, final TrimClipScrubber trimClipScrubber, final View view, final mg2.p p6, final Pair pair) {
        observeMarginUpdates$lambda-11(p5, trimClipScrubber, view, p6, pair);
    }
    
    private final TrimClipUnits.Pixels endPositionToRightMargin(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return TrimClipUnits.Percentage.Companion.getONE().minus(milliseconds.div(this.getClipDuration())).times(pixels.minus(this.getThumbWidth()));
    }
    
    public static void f(final TrimClipScrubber trimClipScrubber, final Boolean b) {
        observeTouchEvents$lambda-4(trimClipScrubber, b);
    }
    
    public static TrimClipUnits.Milliseconds g(final SeekPositionData seekPositionData) {
        return correctInternalSeekPosition$lambda-17(seekPositionData);
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
        ng2.e.n("adjustableClips");
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
    
    public static boolean h(final SeekPositionData seekPositionData) {
        return publishSeekPosition$lambda-19(seekPositionData);
    }
    
    public static Pair i(final TrimClipUnits.Milliseconds milliseconds) {
        return observeInternalSeekPosition$lambda-14(milliseconds);
    }
    
    public static PositionData j(final TrimClipScrubber trimClipScrubber, final TrimClipUnits.Pixels pixels) {
        return observeRightTouches$lambda-6(trimClipScrubber, pixels);
    }
    
    public static PositionData k(final TrimClipScrubber trimClipScrubber, final TrimClipUnits.Pixels pixels) {
        return observeLeftTouches$lambda-5(trimClipScrubber, pixels);
    }
    
    public static void l(final a a, final TrimClipScrubber trimClipScrubber, final PositionData positionData) {
        coercePosition$lambda-7(a, trimClipScrubber, positionData);
    }
    
    public static void m(final TrimClipScrubber trimClipScrubber, final List list, final TrimClipUnits.Pixels pixels) {
        setClips$lambda-21(trimClipScrubber, list, pixels);
    }
    
    public static boolean n(final SeekPositionData seekPositionData) {
        return correctInternalSeekPosition$lambda-16(seekPositionData);
    }
    
    public static TrimClipUnits.Milliseconds o(final SeekPositionData seekPositionData) {
        return publishSeekPosition$lambda-20(seekPositionData);
    }
    
    private final t<SeekPositionData> observeInternalSeekPosition() {
        final t<Object> combineLatest = t.combineLatest((af2.y<?>)this.startPositionSubject, (af2.y<?>)this.endPositionSubject, (af2.y<?>)d0.w0(d.m3((Object[])new t[] { ((t<Object>)this.internalUserSeekPositionSubject).map((ff2.o<? super Object, ?>)new com.reddit.video.creation.widgets.widget.trimclipview.q(2)), ((t<Object>)this.internalProgrammaticSeekPositionSubject).map((ff2.o<? super Object, ?>)new s(2)) })), (ff2.h<? super Object, ? super Object, ? super Object, ?>)new TrimClipScrubber$observeInternalSeekPosition$$inlined$combineLatest.TrimClipScrubber$observeInternalSeekPosition$$inlined$combineLatest$1());
        ng2.e.b((Object)combineLatest, "Observable.combineLatest\u2026neFunction(t1, t2, t3) })");
        final t<Object> share = combineLatest.distinctUntilChanged().share();
        ng2.e.e((Object)share, "Observables.combineLates\u2026lChanged()\n      .share()");
        return (t<SeekPositionData>)share;
    }
    
    private static final Pair observeInternalSeekPosition$lambda-13(final TrimClipUnits.Milliseconds milliseconds) {
        ng2.e.f((Object)milliseconds, "it");
        return new Pair((Object)Boolean.TRUE, (Object)milliseconds);
    }
    
    private static final Pair observeInternalSeekPosition$lambda-14(final TrimClipUnits.Milliseconds milliseconds) {
        ng2.e.f((Object)milliseconds, "it");
        return new Pair((Object)Boolean.FALSE, (Object)milliseconds);
    }
    
    private final void observeLeftTouches() {
        final Companion companion = TrimClipScrubber.Companion;
        final t<MotionEvent> leftTouches = this.getLeftTouches();
        ng2.e.e((Object)leftTouches, "leftTouches");
        final t map = TrimClipScrubber.Companion.access$movementOffsets(companion, leftTouches).map((o)new com.reddit.video.creation.widgets.widget.trimclipview.o(this, 0));
        ng2.e.e((Object)map, "leftTouches.movementOffs\u2026sition,\n        )\n      }");
        this.coercePosition(map, this.startPositionSubject);
    }
    
    private static final PositionData observeLeftTouches$lambda-5(final TrimClipScrubber trimClipScrubber, final TrimClipUnits.Pixels pixels) {
        ng2.e.f((Object)trimClipScrubber, "this$0");
        ng2.e.f((Object)pixels, "it");
        final TrimClipUnits.Milliseconds access$getValueOrZero = TrimClipScrubber.Companion.access$getValueOrZero(TrimClipScrubber.Companion, (a)trimClipScrubber.endPositionSubject);
        final TrimClipUnits.Milliseconds.Companion companion = TrimClipUnits.Milliseconds.Companion;
        final TrimClipUnits.Milliseconds max = TrimClipUnitsKt.max(companion.getZERO(), access$getValueOrZero.minus(trimClipScrubber.maximumDistance));
        return new PositionData(pixels, max.rangeTo(access$getValueOrZero.minus(trimClipScrubber.minimumDistance)), companion.getZERO().rangeTo(max));
    }
    
    private final void observeMarginUpdates(final t<TrimClipUnits.Milliseconds> t, final mg2.p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels> p4, final mg2.p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j> p5, final View view) {
        final df2.a subscribe = yf2.a.a((t)t, (t)this.clipSeekBarWidthSubject).distinctUntilChanged().subscribe((g)new k((Object)p4, (Object)this, (Object)view, (cg2.d)p5, 1));
        ng2.e.e((Object)subscribe, "Observables.combineLates\u2026nSetter(margin) }\n      }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final void observeMarginUpdates$lambda-11(final mg2.p p5, final TrimClipScrubber trimClipScrubber, final View view, final mg2.p p6, final Pair pair) {
        ng2.e.f((Object)p5, "$positionToMarginConverter");
        ng2.e.f((Object)trimClipScrubber, "this$0");
        ng2.e.f((Object)view, "$handle");
        ng2.e.f((Object)p6, "$marginSetter");
        final TrimClipUnits.Milliseconds milliseconds = (TrimClipUnits.Milliseconds)pair.component1();
        final TrimClipUnits.Pixels pixels = (TrimClipUnits.Pixels)pair.component2();
        ng2.e.e((Object)pixels, "clipSeekBarWidth");
        final TrimClipUnits.Pixels pixels2 = (TrimClipUnits.Pixels)p5.invoke((Object)milliseconds, (Object)pixels);
        for (final View view2 : trimClipScrubber.getBars()) {
            ng2.e.e((Object)view2, "it");
            final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            final RelativeLayout$LayoutParams layoutParams2 = (RelativeLayout$LayoutParams)layoutParams;
            p6.invoke((Object)layoutParams2, (Object)pixels2.plus(trimClipScrubber.getHandleWidth()));
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
    
    private final void observeRightTouches() {
        final Companion companion = TrimClipScrubber.Companion;
        final t<MotionEvent> rightTouches = this.getRightTouches();
        ng2.e.e((Object)rightTouches, "rightTouches");
        final t map = TrimClipScrubber.Companion.access$movementOffsets(companion, rightTouches).map((o)new r(this, 0));
        ng2.e.e((Object)map, "rightTouches.movementOff\u2026ration,\n        )\n      }");
        this.coercePosition(map, this.endPositionSubject);
    }
    
    private static final PositionData observeRightTouches$lambda-6(final TrimClipScrubber trimClipScrubber, final TrimClipUnits.Pixels pixels) {
        ng2.e.f((Object)trimClipScrubber, "this$0");
        ng2.e.f((Object)pixels, "it");
        final TrimClipUnits.Milliseconds access$getValueOrZero = TrimClipScrubber.Companion.access$getValueOrZero(TrimClipScrubber.Companion, (a)trimClipScrubber.startPositionSubject);
        final TrimClipUnits.Milliseconds clipDuration = trimClipScrubber.getClipDuration();
        final TrimClipUnits.Milliseconds min = TrimClipUnitsKt.min(clipDuration, access$getValueOrZero.plus(trimClipScrubber.maximumDistance));
        return new PositionData(pixels, access$getValueOrZero.plus(trimClipScrubber.minimumDistance).rangeTo(min), min.rangeTo(clipDuration));
    }
    
    private final void observeSeekPosition() {
        final t<SeekPositionData> observeInternalSeekPosition = this.observeInternalSeekPosition();
        this.correctInternalSeekPosition(observeInternalSeekPosition);
        this.publishSeekPosition(observeInternalSeekPosition);
    }
    
    private final void observeTouchEvents() {
        final Companion companion = TrimClipScrubber.Companion;
        final t<Object> merge = t.merge((af2.y<?>)this.getLeftTouches(), (af2.y<?>)this.getRightTouches());
        ng2.e.e((Object)merge, "merge(\n      leftTouches\u2026      rightTouches,\n    )");
        final df2.a subscribe = TrimClipScrubber.Companion.access$isInUseTouchEvents(companion, merge).filter((q)new r(this, 1)).doOnNext((g)new n(this, 0)).subscribe();
        ng2.e.e((Object)subscribe, "merge(\n      leftTouches\u2026(it) }\n      .subscribe()");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final boolean observeTouchEvents$lambda-3(final TrimClipScrubber trimClipScrubber, final Boolean b) {
        ng2.e.f((Object)trimClipScrubber, "this$0");
        ng2.e.f((Object)b, "it");
        return ((View)trimClipScrubber).getParent() != null;
    }
    
    private static final void observeTouchEvents$lambda-4(final TrimClipScrubber trimClipScrubber, final Boolean b) {
        ng2.e.f((Object)trimClipScrubber, "this$0");
        final ViewParent parent = ((View)trimClipScrubber).getParent();
        ng2.e.e((Object)b, "it");
        parent.requestDisallowInterceptTouchEvent((boolean)b);
    }
    
    private final void publishSeekPosition(final t<SeekPositionData> t) {
        final df2.a subscribe = t.filter((ff2.q<? super SeekPositionData>)new l(0)).map((ff2.o<? super SeekPositionData, ?>)new m(0)).distinctUntilChanged().subscribe((ff2.g<? super Object>)new com.reddit.video.creation.widgets.widget.trimclipview.b(this.userSeekPositionSubject, 1));
        ng2.e.e((Object)subscribe, "seekPositionDataObservab\u2026kPositionSubject::onNext)");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final boolean publishSeekPosition$lambda-19(final SeekPositionData seekPositionData) {
        ng2.e.f((Object)seekPositionData, "<name for destructuring parameter 0>");
        return seekPositionData.component2();
    }
    
    private static final TrimClipUnits.Milliseconds publishSeekPosition$lambda-20(final SeekPositionData seekPositionData) {
        ng2.e.f((Object)seekPositionData, "<name for destructuring parameter 0>");
        return seekPositionData.component3();
    }
    
    public static void setClip$default(final TrimClipScrubber trimClipScrubber, final AdjustableClip adjustableClip, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        trimClipScrubber.setClip(adjustableClip, b);
    }
    
    private static final void setClips$lambda-21(final TrimClipScrubber trimClipScrubber, final List list, final TrimClipUnits.Pixels pixels) {
        ng2.e.f((Object)trimClipScrubber, "this$0");
        ng2.e.f((Object)list, "$adjustableClips");
        final e binding = trimClipScrubber.binding;
        if (binding != null) {
            binding.g.setUpWithClips(list, true, trimClipScrubber.showMicros);
            return;
        }
        ng2.e.n("binding");
        throw null;
    }
    
    private final TrimClipUnits.Pixels startPositionToLeftMargin(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return milliseconds.div(this.getClipDuration()).times(pixels.minus(this.getThumbWidth()));
    }
    
    private final void updateClipSeekBar() {
        final a<TrimClipUnits.Milliseconds> startPositionSubject = this.startPositionSubject;
        final a<TrimClipUnits.Milliseconds> endPositionSubject = this.endPositionSubject;
        final a<TrimClipUnits.Pixels> clipSeekBarWidthSubject = this.clipSeekBarWidthSubject;
        ng2.e.g((Object)startPositionSubject, "source1");
        ng2.e.g((Object)endPositionSubject, "source2");
        ng2.e.g((Object)clipSeekBarWidthSubject, "source3");
        final t<Object> combineLatest = t.combineLatest((af2.y<?>)startPositionSubject, (af2.y<?>)endPositionSubject, (af2.y<?>)clipSeekBarWidthSubject, (ff2.h<? super Object, ? super Object, ? super Object, ?>)p7.a.C);
        ng2.e.b((Object)combineLatest, "Observable.combineLatest\u2026 -> Triple(t1, t2, t3) })");
        final df2.a subscribe = combineLatest.subscribe((ff2.g<? super Object>)new com.reddit.video.creation.widgets.widget.trimclipview.e(this, 1));
        ng2.e.e((Object)subscribe, "Observables.combineLates\u2026Micros,\n        )\n      }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final void updateClipSeekBar$lambda-12(final TrimClipScrubber trimClipScrubber, final Triple triple) {
        ng2.e.f((Object)trimClipScrubber, "this$0");
        final TrimClipUnits.Milliseconds milliseconds = (TrimClipUnits.Milliseconds)triple.component1();
        final TrimClipUnits.Milliseconds milliseconds2 = (TrimClipUnits.Milliseconds)triple.component2();
        final TrimClipUnits.Pixels pixels = (TrimClipUnits.Pixels)triple.component3();
        ng2.e.e((Object)milliseconds, "startPosition");
        ng2.e.e((Object)pixels, "clipSeekBarWidth");
        final TrimClipUnits.Pixels startPositionToLeftMargin = trimClipScrubber.startPositionToLeftMargin(milliseconds, pixels);
        ng2.e.e((Object)milliseconds2, "endPosition");
        final TrimClipUnits.Pixels endPositionToRightMargin = trimClipScrubber.endPositionToRightMargin(milliseconds2, pixels);
        final e binding = trimClipScrubber.binding;
        if (binding != null) {
            binding.g.setTimeTextsAndPositions(startPositionToLeftMargin.getValue(), milliseconds.getValue(), endPositionToRightMargin.getValue(), milliseconds2.getValue(), trimClipScrubber.showMicros);
            return;
        }
        ng2.e.n("binding");
        throw null;
    }
    
    public final t<Boolean> getEditingObservable() {
        final Object value = this.editingObservable$delegate.getValue();
        ng2.e.e(value, "<get-editingObservable>(...)");
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
    
    public final t<TrimClipUnits.Milliseconds> getUserSeekPositionObservable() {
        return this.userSeekPositionObservable;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.observeLeftTouches();
        this.observeRightTouches();
        this.observeTouchEvents();
        final a<TrimClipUnits.Milliseconds> startPositionSubject = this.startPositionSubject;
        final TrimClipScrubber$onAttachedToWindow$1 trimClipScrubber$onAttachedToWindow$1 = new TrimClipScrubber$onAttachedToWindow$1((Object)this);
        final TrimClipScrubber$onAttachedToWindow$2 instance = TrimClipScrubber$onAttachedToWindow$2.INSTANCE;
        final e binding = this.binding;
        if (binding == null) {
            ng2.e.n("binding");
            throw null;
        }
        final FrameLayout e = binding.e;
        ng2.e.e((Object)e, "binding.trimClipScrubberLeftHandle");
        this.observeMarginUpdates((t<TrimClipUnits.Milliseconds>)startPositionSubject, (mg2.p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels>)trimClipScrubber$onAttachedToWindow$1, (mg2.p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j>)instance, (View)e);
        final a<TrimClipUnits.Milliseconds> endPositionSubject = this.endPositionSubject;
        final TrimClipScrubber$onAttachedToWindow$3 trimClipScrubber$onAttachedToWindow$2 = new TrimClipScrubber$onAttachedToWindow$3((Object)this);
        final TrimClipScrubber$onAttachedToWindow$4 instance2 = TrimClipScrubber$onAttachedToWindow$4.INSTANCE;
        final e binding2 = this.binding;
        if (binding2 != null) {
            final FrameLayout f = binding2.f;
            ng2.e.e((Object)f, "binding.trimClipScrubberRightHandle");
            this.observeMarginUpdates((t<TrimClipUnits.Milliseconds>)endPositionSubject, (mg2.p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels>)trimClipScrubber$onAttachedToWindow$2, (mg2.p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j>)instance2, (View)f);
            this.updateClipSeekBar();
            this.observeSeekPosition();
            return;
        }
        ng2.e.n("binding");
        throw null;
    }
    
    public void onDetachedFromWindow() {
        this.attachedToWindowDisposable.clear();
        super.onDetachedFromWindow();
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        this.updateClipSeekBar();
    }
    
    public final void setClip(final AdjustableClip adjustableClip, final boolean showMicros) {
        ng2.e.f((Object)adjustableClip, "adjustableClip");
        this.showMicros = showMicros;
        this.setClips(d.l3((Object)adjustableClip));
    }
    
    public final void setClips(final List<AdjustableClip> adjustableClips) {
        ng2.e.f((Object)adjustableClips, "adjustableClips");
        this.adjustableClips = adjustableClips;
        final CompositeDisposable attachedToWindowDisposable = this.attachedToWindowDisposable;
        final df2.a subscribe = ((t<Object>)this.clipSeekBarWidthSubject).subscribe((ff2.g<? super Object>)new f40.q(19, (Object)this, (Object)adjustableClips));
        ng2.e.e((Object)subscribe, "clipSeekBarWidthSubject.\u2026, true, showMicros)\n    }");
        p7.a.J(attachedToWindowDisposable, subscribe);
    }
    
    public final void setDistances(final TrimClipUnits.Milliseconds minimumDistance, final TrimClipUnits.Milliseconds maximumDistance) {
        ng2.e.f((Object)minimumDistance, "minimumDistance");
        ng2.e.f((Object)maximumDistance, "maximumDistance");
        this.minimumDistance = minimumDistance;
        this.maximumDistance = maximumDistance;
    }
    
    public final void setPositions(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Milliseconds milliseconds2) {
        ng2.e.f((Object)milliseconds, "startPosition");
        ng2.e.f((Object)milliseconds2, "endPosition");
        this.startPositionSubject.onNext(milliseconds);
        this.endPositionSubject.onNext(milliseconds2);
    }
    
    public final void setScrubberColorWhite() {
        final e binding = this.binding;
        if (binding == null) {
            ng2.e.n("binding");
            throw null;
        }
        binding.h.setBackground((Drawable)new ColorDrawable(((View)this).getResources().getColor(2131100777)));
        final e binding2 = this.binding;
        if (binding2 == null) {
            ng2.e.n("binding");
            throw null;
        }
        binding2.d.setBackground((Drawable)new ColorDrawable(((View)this).getResources().getColor(2131100777)));
        final e binding3 = this.binding;
        if (binding3 == null) {
            ng2.e.n("binding");
            throw null;
        }
        ((View)binding3.b).setBackgroundResource(2131231004);
        final e binding4 = this.binding;
        if (binding4 == null) {
            ng2.e.n("binding");
            throw null;
        }
        ((View)binding4.c).setBackgroundResource(2131231006);
        final e binding5 = this.binding;
        if (binding5 == null) {
            ng2.e.n("binding");
            throw null;
        }
        final FrameLayout e = binding5.e;
        ng2.e.e((Object)e, "binding.trimClipScrubberLeftHandle");
        final ViewGroup$LayoutParams layoutParams = ((View)e).getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        ((View)e).setLayoutParams(layoutParams);
        final e binding6 = this.binding;
        if (binding6 == null) {
            ng2.e.n("binding");
            throw null;
        }
        final FrameLayout f = binding6.f;
        ng2.e.e((Object)f, "binding.trimClipScrubberRightHandle");
        final ViewGroup$LayoutParams layoutParams2 = ((View)f).getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            ((View)f).setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
    
    public final void setSeekBarAtPosition(final TrimClipUnits.Milliseconds milliseconds) {
        ng2.e.f((Object)milliseconds, "millis");
        this.internalProgrammaticSeekPositionSubject.onNext(milliseconds);
        final e binding = this.binding;
        if (binding != null) {
            final ClipSeekBar g = binding.g;
            ng2.e.e((Object)g, "binding.trimClipScrubberSeekBar");
            ClipSeekBar.setSeekBarAtPosition$default(g, milliseconds.getValue(), 0, 2, null);
            return;
        }
        ng2.e.n("binding");
        throw null;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\r" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipScrubber$Companion;", "", "Lag2/a;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "getValueOrZero", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "Laf2/t;", "Landroid/view/MotionEvent;", "", "isInUseTouchEvents", "movementOffsets", "<init>", "()V", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public static boolean a(final MotionEvent motionEvent) {
            return movementOffsets$lambda-4$lambda-2(motionEvent);
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
        
        public static y c(final t t, final MotionEvent motionEvent) {
            return movementOffsets$lambda-4(t, motionEvent);
        }
        
        public static TrimClipUnits.Pixels d(final float n, final MotionEvent motionEvent) {
            return movementOffsets$lambda-4$lambda-3(n, motionEvent);
        }
        
        public static boolean e(final MotionEvent motionEvent) {
            return movementOffsets$lambda-1(motionEvent);
        }
        
        private final TrimClipUnits.Milliseconds getValueOrZero(final a<TrimClipUnits.Milliseconds> a) {
            Object zero;
            if ((zero = a.d()) == null) {
                zero = TrimClipUnits.Milliseconds.Companion.getZERO();
            }
            ng2.e.e(zero, "value ?: Milliseconds.ZERO");
            return (TrimClipUnits.Milliseconds)zero;
        }
        
        private final TrimClipUnits.Pixels getValueOrZero(final a<TrimClipUnits.Pixels> a) {
            Object zero;
            if ((zero = a.d()) == null) {
                zero = TrimClipUnits.Pixels.Companion.getZERO();
            }
            ng2.e.e(zero, "value ?: Pixels.ZERO");
            return (TrimClipUnits.Pixels)zero;
        }
        
        private final t<Boolean> isInUseTouchEvents(final t<MotionEvent> t) {
            final t<Object> map = t.map((ff2.o<? super MotionEvent, ?>)new s(3));
            ng2.e.e((Object)map, "map { initialMotionEvent\u2026on == ACTION_MOVE\n      }");
            return (t<Boolean>)map;
        }
        
        private static final Boolean isInUseTouchEvents$lambda-0(final MotionEvent motionEvent) {
            ng2.e.f((Object)motionEvent, "initialMotionEvent");
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        
        private final t<TrimClipUnits.Pixels> movementOffsets(final t<MotionEvent> t) {
            final t<Object> switchMap = t.filter((ff2.q<? super MotionEvent>)new l(3)).switchMap((ff2.o<? super MotionEvent, ? extends af2.y<?>>)new com.reddit.video.creation.widgets.widget.trimclipview.g(t, 1));
            ng2.e.e((Object)switchMap, "filter {\n        it.acti\u2026empty()\n        }\n      }");
            return (t<TrimClipUnits.Pixels>)switchMap;
        }
        
        private static final boolean movementOffsets$lambda-1(final MotionEvent motionEvent) {
            ng2.e.f((Object)motionEvent, "it");
            return d.m3((Object[])new Integer[] { 0, 1 }).contains(motionEvent.getAction());
        }
        
        private static final y movementOffsets$lambda-4(t t, final MotionEvent motionEvent) {
            ng2.e.f((Object)t, "$this_movementOffsets");
            ng2.e.f((Object)motionEvent, "initialMotionEvent");
            if (motionEvent.getAction() == 0) {
                t = t.filter((ff2.q<? super Object>)new p(2)).map((ff2.o<? super Object, ?>)new com.reddit.video.creation.widgets.widget.trimclipview.h(motionEvent.getX(), 1));
            }
            else {
                t = t.empty();
            }
            return (y)t;
        }
        
        private static final boolean movementOffsets$lambda-4$lambda-2(final MotionEvent motionEvent) {
            ng2.e.f((Object)motionEvent, "it");
            return motionEvent.getAction() == 2;
        }
        
        private static final TrimClipUnits.Pixels movementOffsets$lambda-4$lambda-3(final float n, final MotionEvent motionEvent) {
            ng2.e.f((Object)motionEvent, "it");
            return new TrimClipUnits.Pixels(p7.a.W(motionEvent.getX() - n));
        }
    }
    
    @Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipScrubber$PositionData;", "", "offset", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "allowedRange", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;", "maximumDistanceRange", "(Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;)V", "getAllowedRange", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;", "getMaximumDistanceRange", "getOffset", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class PositionData
    {
        private final TrimClipUnits.Milliseconds.Range allowedRange;
        private final TrimClipUnits.Milliseconds.Range maximumDistanceRange;
        private final TrimClipUnits.Pixels offset;
        
        public PositionData(final TrimClipUnits.Pixels offset, final TrimClipUnits.Milliseconds.Range allowedRange, final TrimClipUnits.Milliseconds.Range maximumDistanceRange) {
            ng2.e.f((Object)offset, "offset");
            ng2.e.f((Object)allowedRange, "allowedRange");
            ng2.e.f((Object)maximumDistanceRange, "maximumDistanceRange");
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
            ng2.e.f((Object)pixels, "offset");
            ng2.e.f((Object)range, "allowedRange");
            ng2.e.f((Object)range2, "maximumDistanceRange");
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
            return ng2.e.a((Object)this.offset, (Object)positionData.offset) && ng2.e.a((Object)this.allowedRange, (Object)positionData.allowedRange) && ng2.e.a((Object)this.maximumDistanceRange, (Object)positionData.maximumDistanceRange);
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
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipScrubber$SeekPositionData;", "", "corrected", "", "setByUser", "seekPosition", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "(ZZLcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;)V", "getCorrected", "()Z", "getSeekPosition", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "getSetByUser", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SeekPositionData
    {
        private final boolean corrected;
        private final TrimClipUnits.Milliseconds seekPosition;
        private final boolean setByUser;
        
        public SeekPositionData(final boolean corrected, final boolean setByUser, final TrimClipUnits.Milliseconds seekPosition) {
            ng2.e.f((Object)seekPosition, "seekPosition");
            this.corrected = corrected;
            this.setByUser = setByUser;
            this.seekPosition = seekPosition;
        }
        
        public static SeekPositionData copy$default(final SeekPositionData seekPositionData, boolean corrected, boolean setByUser, TrimClipUnits.Milliseconds seekPosition, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                corrected = seekPositionData.corrected;
            }
            if ((n & 0x2) != 0x0) {
                setByUser = seekPositionData.setByUser;
            }
            if ((n & 0x4) != 0x0) {
                seekPosition = seekPositionData.seekPosition;
            }
            return seekPositionData.copy(corrected, setByUser, seekPosition);
        }
        
        public final boolean component1() {
            return this.corrected;
        }
        
        public final boolean component2() {
            return this.setByUser;
        }
        
        public final TrimClipUnits.Milliseconds component3() {
            return this.seekPosition;
        }
        
        public final SeekPositionData copy(final boolean b, final boolean b2, final TrimClipUnits.Milliseconds milliseconds) {
            ng2.e.f((Object)milliseconds, "seekPosition");
            return new SeekPositionData(b, b2, milliseconds);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof SeekPositionData)) {
                return false;
            }
            final SeekPositionData seekPositionData = (SeekPositionData)o;
            return this.corrected == seekPositionData.corrected && this.setByUser == seekPositionData.setByUser && ng2.e.a((Object)this.seekPosition, (Object)seekPositionData.seekPosition);
        }
        
        public final boolean getCorrected() {
            return this.corrected;
        }
        
        public final TrimClipUnits.Milliseconds getSeekPosition() {
            return this.seekPosition;
        }
        
        public final boolean getSetByUser() {
            return this.setByUser;
        }
        
        @Override
        public int hashCode() {
            final int corrected = this.corrected ? 1 : 0;
            int n = 1;
            int n2 = corrected;
            if (corrected != 0) {
                n2 = 1;
            }
            final int setByUser = this.setByUser ? 1 : 0;
            if (setByUser == 0) {
                n = setByUser;
            }
            return this.seekPosition.hashCode() + (n2 * 31 + n) * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("SeekPositionData(corrected=");
            t.append(this.corrected);
            t.append(", setByUser=");
            t.append(this.setByUser);
            t.append(", seekPosition=");
            t.append(this.seekPosition);
            t.append(')');
            return t.toString();
        }
    }
}
