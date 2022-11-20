// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ru1.n;
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
import java.util.WeakHashMap;
import com.reddit.video.creation.widgets.widget.clipseekbar.ClipSeekBarListener;
import android.view.View$OnLayoutChangeListener;
import a4.l0$g;
import a4.l0;
import com.reddit.video.creation.widgets.widget.clipseekbar.ClipSeekBar;
import android.widget.TextView;
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
import cg2.f;
import io.reactivex.disposables.CompositeDisposable;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import java.util.List;
import kotlin.Metadata;
import android.widget.RelativeLayout;

@Metadata(bv = {}, d1 = { "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 q2\u00020\u0001:\u0002qrB1\b\u0007\u0012\u0006\u0010j\u001a\u00020i\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010k\u0012\b\b\u0002\u0010m\u001a\u00020 \u0012\b\b\u0002\u0010n\u001a\u00020 ¢\u0006\u0004\bo\u0010pJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0014\u0010\u000f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0002J\u001e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0002J\u0006\u0010\u001c\u001a\u00020\u0002J\u0006\u0010\u001d\u001a\u00020\u0002J\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0002J\u0012\u0010#\u001a\u00020\"2\b\b\u0001\u0010!\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002J\u0018\u0010)\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\"H\u0002J\u0018\u0010*\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\"H\u0002J\b\u0010+\u001a\u00020\u0002H\u0002J\b\u0010,\u001a\u00020\u0002H\u0002J\b\u0010-\u001a\u00020\u0002H\u0002J \u00102\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020/0.2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000500H\u0002JR\u0010:\u001a\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050.2\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"042\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0002042\u0006\u00109\u001a\u000208H\u0002J\b\u0010;\u001a\u00020\u0002H\u0002J\b\u0010<\u001a\u00020\u0002H\u0002R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010@R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010AR\"\u0010D\u001a\u0010\u0012\f\u0012\n C*\u0004\u0018\u00010\u00020\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR)\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0N0.8\u0006¢\u0006\f\n\u0004\bO\u0010G\u001a\u0004\bP\u0010IR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0006¢\u0006\f\n\u0004\bQ\u0010G\u001a\u0004\bR\u0010IR!\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00180.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010IR\u001b\u0010Z\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010YR\u001b\u0010]\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010YR?\u0010a\u001a&\u0012\f\u0012\n C*\u0004\u0018\u00010^0^ C*\u0012\u0012\f\u0012\n C*\u0004\u0018\u00010^0^\u0018\u00010.0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010T\u001a\u0004\b`\u0010IR?\u0010d\u001a&\u0012\f\u0012\n C*\u0004\u0018\u00010^0^ C*\u0012\u0012\f\u0012\n C*\u0004\u0018\u00010^0^\u0018\u00010.0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010T\u001a\u0004\bc\u0010IR!\u0010h\u001a\b\u0012\u0004\u0012\u0002080\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010T\u001a\u0004\bf\u0010g¨\u0006s" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/VoiceoverScrubber;", "Landroid/widget/RelativeLayout;", "Lcg2/j;", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "minimumDistance", "maximumDistance", "setDistances", "startPosition", "endPosition", "setPositions", "", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "adjustableClips", "setClips", "millis", "setSeekBarAtPosition", "setStartProgress", "", "start", "end", "duration", "addExistingProgress", "", "finished", "updateProgress", "removeLastProgress", "hideSeekBar", "showSeekBar", "seekBarOverlaps", "undo", "", "id", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "getDimensionInPixels", "getClipDuration", "", "number", "round", "clipSeekBarWidth", "startPositionToLeftMargin", "endPositionToRightMargin", "observeTouchEvents", "observeLeftTouches", "observeRightTouches", "Laf2/t;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/VoiceoverScrubber$PositionData;", "Lag2/a;", "oldPositionSubject", "coercePosition", "positionObservable", "Lkotlin/Function2;", "positionToMarginConverter", "Landroid/widget/RelativeLayout$LayoutParams;", "marginSetter", "Landroid/view/View;", "handle", "observeMarginUpdates", "observeSeekPosition", "observeProgressSeekPosition", "Lio/reactivex/disposables/CompositeDisposable;", "attachedToWindowDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "Ljava/util/List;", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "maximumDistanceReachedSubject", "Lio/reactivex/subjects/PublishSubject;", "startPositionObservable", "Laf2/t;", "getStartPositionObservable", "()Laf2/t;", "endPositionObservable", "getEndPositionObservable", "maximumDistanceReachedObservable", "getMaximumDistanceReachedObservable", "Lkotlin/Pair;", "userSeekPositionObservable", "getUserSeekPositionObservable", "userSeekProgressPositionObservable", "getUserSeekProgressPositionObservable", "editingObservable$delegate", "Lcg2/f;", "getEditingObservable", "editingObservable", "thumbWidth$delegate", "getThumbWidth", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "thumbWidth", "handleWidth$delegate", "getHandleWidth", "handleWidth", "Landroid/view/MotionEvent;", "leftTouches$delegate", "getLeftTouches", "leftTouches", "rightTouches$delegate", "getRightTouches", "rightTouches", "bars$delegate", "getBars", "()Ljava/util/List;", "bars", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "PositionData", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class VoiceoverScrubber extends RelativeLayout
{
    public static final Companion Companion;
    private static final double ROUND_MULT = 10.0;
    private List<AdjustableClip> adjustableClips;
    private final CompositeDisposable attachedToWindowDisposable;
    private final f bars$delegate;
    private n30.f binding;
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
    
    public VoiceoverScrubber(final Context context) {
        e.f((Object)context, "context");
        this(context, null, 0, 0, 14, null);
    }
    
    public VoiceoverScrubber(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0, 0, 12, null);
    }
    
    public VoiceoverScrubber(final Context context, final AttributeSet set, final int n) {
        e.f((Object)context, "context");
        this(context, set, n, 0, 8, null);
    }
    
    public VoiceoverScrubber(final Context context, final AttributeSet set, int n, final int n2) {
        e.f((Object)context, "context");
        super(context, set, n, n2);
        LayoutInflater.from(context).inflate(2131625624, (ViewGroup)this);
        n = 2131429839;
        if (b.d0(2131429839, (View)this) != null) {
            n = 2131429840;
            final TextView textView = (TextView)b.d0(2131429840, (View)this);
            if (textView != null) {
                n = 2131431016;
                if (b.d0(2131431016, (View)this) != null) {
                    n = 2131431017;
                    final TextView textView2 = (TextView)b.d0(2131431017, (View)this);
                    if (textView2 != null) {
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
                                            this.binding = new n30.f((View)this, textView, textView2, d0, relativeLayout, relativeLayout2, clipSeekBar, d2);
                                            this.attachedToWindowDisposable = new CompositeDisposable();
                                            this.thumbWidth$delegate = kotlin.a.b((mg2.a)new VoiceoverScrubber$thumbWidth$2(this));
                                            this.handleWidth$delegate = kotlin.a.b((mg2.a)new VoiceoverScrubber$handleWidth$2(this));
                                            final TrimClipUnits.Milliseconds.Companion companion = TrimClipUnits.Milliseconds.Companion;
                                            this.minimumDistance = companion.getZERO();
                                            this.maximumDistance = companion.getZERO();
                                            this.leftTouches$delegate = kotlin.a.b((mg2.a)new VoiceoverScrubber$leftTouches$2(this));
                                            this.rightTouches$delegate = kotlin.a.b((mg2.a)new VoiceoverScrubber$rightTouches$2(this));
                                            this.bars$delegate = kotlin.a.b((mg2.a)new VoiceoverScrubber$bars$2(this));
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
                                            this.editingObservable$delegate = kotlin.a.b((mg2.a)new VoiceoverScrubber$editingObservable$2(this));
                                            final ClipSeekBar g = this.binding.g;
                                            g.hideBackground();
                                            g.hideTimeViews();
                                            g.setThumbResource(2131233193);
                                            final WeakHashMap a = l0.a;
                                            if (l0$g.c((View)g) && !((View)g).isLayoutRequested()) {
                                                access$getClipSeekBarWidthSubject$p(this).onNext(new TrimClipUnits.Pixels(((View)access$getBinding$p(this).g).getWidth()));
                                            }
                                            else {
                                                ((View)g).addOnLayoutChangeListener((View$OnLayoutChangeListener)new VoiceoverScrubber$_init_$lambda_2$$inlined$doOnLayout.VoiceoverScrubber$_init_$lambda_2$$inlined$doOnLayout$1(this));
                                            }
                                            g.setListener((ClipSeekBarListener)new VoiceoverScrubber$1.VoiceoverScrubber$1$2(this));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(((View)this).getResources().getResourceName(n)));
    }
    
    public VoiceoverScrubber(final Context context, AttributeSet set, int n, int n2, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
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
    
    public static boolean a(final VoiceoverScrubber voiceoverScrubber, final Boolean b) {
        return observeTouchEvents$lambda-5(voiceoverScrubber, b);
    }
    
    public static final TrimClipUnits.Pixels access$endPositionToRightMargin(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return voiceoverScrubber.endPositionToRightMargin(milliseconds, pixels);
    }
    
    public static final n30.f access$getBinding$p(final VoiceoverScrubber voiceoverScrubber) {
        return voiceoverScrubber.binding;
    }
    
    public static final a access$getClipSeekBarWidthSubject$p(final VoiceoverScrubber voiceoverScrubber) {
        return voiceoverScrubber.clipSeekBarWidthSubject;
    }
    
    public static final TrimClipUnits.Pixels access$getDimensionInPixels(final VoiceoverScrubber voiceoverScrubber, final int n) {
        return voiceoverScrubber.getDimensionInPixels(n);
    }
    
    public static final a access$getInternalUserSeekPositionSubject$p(final VoiceoverScrubber voiceoverScrubber) {
        return voiceoverScrubber.internalUserSeekPositionSubject;
    }
    
    public static final t access$getLeftTouches(final VoiceoverScrubber voiceoverScrubber) {
        return voiceoverScrubber.getLeftTouches();
    }
    
    public static final t access$getRightTouches(final VoiceoverScrubber voiceoverScrubber) {
        return voiceoverScrubber.getRightTouches();
    }
    
    public static final TrimClipUnits.Pixels access$startPositionToLeftMargin(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return voiceoverScrubber.startPositionToLeftMargin(milliseconds, pixels);
    }
    
    public static void b(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Milliseconds milliseconds) {
        onAttachedToWindow$lambda-4(voiceoverScrubber, milliseconds);
    }
    
    public static void c(final VoiceoverScrubber voiceoverScrubber, final Boolean b) {
        observeTouchEvents$lambda-6(voiceoverScrubber, b);
    }
    
    private final void coercePosition(final t<PositionData> t, final a<TrimClipUnits.Milliseconds> a) {
        final df2.a subscribe = t.subscribe((ff2.g<? super PositionData>)new v(a, this));
        e.e((Object)subscribe, "subscribe {\n      val ol\u2026newPositionCoerced)\n    }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final void coercePosition$lambda-9(final a a, final VoiceoverScrubber voiceoverScrubber, final PositionData positionData) {
        e.f((Object)a, "$oldPositionSubject");
        e.f((Object)voiceoverScrubber, "this$0");
        final Companion companion = VoiceoverScrubber.Companion;
        final TrimClipUnits.Milliseconds access$getValueOrZero = VoiceoverScrubber.Companion.access$getValueOrZero(companion, a);
        final TrimClipUnits.Milliseconds plus = access$getValueOrZero.plus(positionData.getOffset().div(VoiceoverScrubber.Companion.access$getValueOrZero(companion, (a)voiceoverScrubber.clipSeekBarWidthSubject)).times(voiceoverScrubber.getClipDuration()));
        final TrimClipUnits.Milliseconds coerceIn = plus.coerceIn(positionData.getAllowedRange());
        if (!e.a((Object)coerceIn, (Object)access$getValueOrZero) && positionData.getMaximumDistanceRange().exclusive().contains(plus)) {
            voiceoverScrubber.maximumDistanceReachedSubject.onNext((Object)j.a);
        }
        a.onNext(coerceIn);
    }
    
    public static void d(final p p5, final VoiceoverScrubber voiceoverScrubber, final View view, final p p6, final Pair pair) {
        observeMarginUpdates$lambda-13(p5, voiceoverScrubber, view, p6, pair);
    }
    
    public static PositionData e(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Pixels pixels) {
        return observeLeftTouches$lambda-7(voiceoverScrubber, pixels);
    }
    
    private final TrimClipUnits.Pixels endPositionToRightMargin(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return TrimClipUnits.Percentage.Companion.getONE().minus(milliseconds.div(this.getClipDuration())).times(pixels.minus(this.getThumbWidth()));
    }
    
    public static void f(final a a, final VoiceoverScrubber voiceoverScrubber, final PositionData positionData) {
        coercePosition$lambda-9(a, voiceoverScrubber, positionData);
    }
    
    public static void g(final VoiceoverScrubber voiceoverScrubber, final List list, final TrimClipUnits.Pixels pixels) {
        setClips$lambda-14(voiceoverScrubber, list, pixels);
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
    
    public static PositionData h(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Pixels pixels) {
        return observeRightTouches$lambda-8(voiceoverScrubber, pixels);
    }
    
    public static void i(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Milliseconds milliseconds) {
        onAttachedToWindow$lambda-3(voiceoverScrubber, milliseconds);
    }
    
    private final void observeLeftTouches() {
        final Companion companion = VoiceoverScrubber.Companion;
        final t<MotionEvent> leftTouches = this.getLeftTouches();
        e.e((Object)leftTouches, "leftTouches");
        final t map = VoiceoverScrubber.Companion.access$movementOffsets(companion, leftTouches).map((o)new r(this, 1));
        e.e((Object)map, "leftTouches.movementOffs\u2026sition,\n        )\n      }");
        this.coercePosition(map, this.startPositionSubject);
    }
    
    private static final PositionData observeLeftTouches$lambda-7(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Pixels pixels) {
        e.f((Object)voiceoverScrubber, "this$0");
        e.f((Object)pixels, "it");
        final TrimClipUnits.Milliseconds access$getValueOrZero = VoiceoverScrubber.Companion.access$getValueOrZero(VoiceoverScrubber.Companion, (a)voiceoverScrubber.endPositionSubject);
        final TrimClipUnits.Milliseconds.Companion companion = TrimClipUnits.Milliseconds.Companion;
        final TrimClipUnits.Milliseconds max = TrimClipUnitsKt.max(companion.getZERO(), access$getValueOrZero.minus(voiceoverScrubber.maximumDistance));
        return new PositionData(pixels, max.rangeTo(access$getValueOrZero.minus(voiceoverScrubber.minimumDistance)), companion.getZERO().rangeTo(max));
    }
    
    private final void observeMarginUpdates(final t<TrimClipUnits.Milliseconds> t, final p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels> p4, final p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j> p5, final View view) {
        final df2.a subscribe = yf2.a.a((t)t, (t)this.clipSeekBarWidthSubject).distinctUntilChanged().subscribe((g)new com.reddit.screens.pager.a((Object)p4, (Object)this, (Object)view, (Object)p5, 2));
        e.e((Object)subscribe, "Observables.combineLates\u2026nSetter(margin) }\n      }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final void observeMarginUpdates$lambda-13(final p p5, final VoiceoverScrubber voiceoverScrubber, final View view, final p p6, final Pair pair) {
        e.f((Object)p5, "$positionToMarginConverter");
        e.f((Object)voiceoverScrubber, "this$0");
        e.f((Object)view, "$handle");
        e.f((Object)p6, "$marginSetter");
        final TrimClipUnits.Milliseconds milliseconds = (TrimClipUnits.Milliseconds)pair.component1();
        final TrimClipUnits.Pixels pixels = (TrimClipUnits.Pixels)pair.component2();
        e.e((Object)pixels, "clipSeekBarWidth");
        final TrimClipUnits.Pixels pixels2 = (TrimClipUnits.Pixels)p5.invoke((Object)milliseconds, (Object)pixels);
        for (final View view2 : voiceoverScrubber.getBars()) {
            e.e((Object)view2, "it");
            final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            final RelativeLayout$LayoutParams layoutParams2 = (RelativeLayout$LayoutParams)layoutParams;
            p6.invoke((Object)layoutParams2, (Object)pixels2.plus(voiceoverScrubber.getHandleWidth()));
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
        final df2.a subscribe = ((t<Object>)this.internalProgrammaticSeekPositionSubject).distinctUntilChanged().subscribe((ff2.g<? super Object>)new u(this.userSeekProgressPositionSubject, 1));
        e.e((Object)subscribe, "internalProgrammaticSeek\u2026sPositionSubject::onNext)");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private final void observeRightTouches() {
        final Companion companion = VoiceoverScrubber.Companion;
        final t<MotionEvent> rightTouches = this.getRightTouches();
        e.e((Object)rightTouches, "rightTouches");
        final t map = VoiceoverScrubber.Companion.access$movementOffsets(companion, rightTouches).map((o)new com.reddit.video.creation.widgets.widget.trimclipview.o(this, 1));
        e.e((Object)map, "rightTouches.movementOff\u2026ration,\n        )\n      }");
        this.coercePosition(map, this.endPositionSubject);
    }
    
    private static final PositionData observeRightTouches$lambda-8(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Pixels pixels) {
        e.f((Object)voiceoverScrubber, "this$0");
        e.f((Object)pixels, "it");
        final TrimClipUnits.Milliseconds access$getValueOrZero = VoiceoverScrubber.Companion.access$getValueOrZero(VoiceoverScrubber.Companion, (a)voiceoverScrubber.startPositionSubject);
        final TrimClipUnits.Milliseconds clipDuration = voiceoverScrubber.getClipDuration();
        final TrimClipUnits.Milliseconds min = TrimClipUnitsKt.min(clipDuration, access$getValueOrZero.plus(voiceoverScrubber.maximumDistance));
        return new PositionData(pixels, access$getValueOrZero.plus(voiceoverScrubber.minimumDistance).rangeTo(min), min.rangeTo(clipDuration));
    }
    
    private final void observeSeekPosition() {
        final df2.a subscribe = ((t<Object>)this.internalUserSeekPositionSubject).distinctUntilChanged().subscribe((ff2.g<? super Object>)new d(this.userSeekPositionSubject, 1));
        e.e((Object)subscribe, "internalUserSeekPosition\u2026kPositionSubject::onNext)");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private final void observeTouchEvents() {
        final Companion companion = VoiceoverScrubber.Companion;
        final t<Object> merge = t.merge((af2.y<?>)this.getLeftTouches(), (af2.y<?>)this.getRightTouches());
        e.e((Object)merge, "merge(\n      leftTouches\u2026      rightTouches,\n    )");
        final df2.a subscribe = VoiceoverScrubber.Companion.access$isInUseTouchEvents(companion, merge).filter((q)new com.reddit.video.creation.widgets.widget.trimclipview.t(this)).doOnNext((g)new u(this, 0)).subscribe();
        e.e((Object)subscribe, "merge(\n      leftTouches\u2026(it) }\n      .subscribe()");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
    }
    
    private static final boolean observeTouchEvents$lambda-5(final VoiceoverScrubber voiceoverScrubber, final Boolean b) {
        e.f((Object)voiceoverScrubber, "this$0");
        e.f((Object)b, "it");
        return ((View)voiceoverScrubber).getParent() != null;
    }
    
    private static final void observeTouchEvents$lambda-6(final VoiceoverScrubber voiceoverScrubber, final Boolean b) {
        e.f((Object)voiceoverScrubber, "this$0");
        final ViewParent parent = ((View)voiceoverScrubber).getParent();
        e.e((Object)b, "it");
        parent.requestDisallowInterceptTouchEvent((boolean)b);
    }
    
    private static final void onAttachedToWindow$lambda-3(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Milliseconds milliseconds) {
        e.f((Object)voiceoverScrubber, "this$0");
        voiceoverScrubber.binding.b.setText((CharSequence)String.valueOf(voiceoverScrubber.round(milliseconds.getValue() / 1000.0)));
    }
    
    private static final void onAttachedToWindow$lambda-4(final VoiceoverScrubber voiceoverScrubber, final TrimClipUnits.Milliseconds milliseconds) {
        e.f((Object)voiceoverScrubber, "this$0");
        voiceoverScrubber.binding.c.setText((CharSequence)String.valueOf(voiceoverScrubber.round(milliseconds.getValue() / 1000.0)));
    }
    
    private final double round(final double n) {
        return p7.a.V(Double.longBitsToDouble(Double.doubleToLongBits(n) + 1L) * 10.0) / 10.0;
    }
    
    private static final void setClips$lambda-14(final VoiceoverScrubber voiceoverScrubber, final List list, final TrimClipUnits.Pixels pixels) {
        e.f((Object)voiceoverScrubber, "this$0");
        e.f((Object)list, "$adjustableClips");
        final ClipSeekBar g = voiceoverScrubber.binding.g;
        e.e((Object)g, "binding.trimClipScrubberSeekBar");
        ClipSeekBar.setUpWithClips$default(g, list, false, false, 6, null);
    }
    
    private final TrimClipUnits.Pixels startPositionToLeftMargin(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Pixels pixels) {
        return milliseconds.div(this.getClipDuration()).times(pixels.minus(this.getThumbWidth()));
    }
    
    public final void addExistingProgress(final long n, final long n2, final long n3) {
        this.binding.g.addExistingProgress(n, n2, n3);
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
    
    public final void hideSeekBar() {
        this.binding.g.hideSeekBar();
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.observeLeftTouches();
        this.observeRightTouches();
        this.observeTouchEvents();
        final a<TrimClipUnits.Milliseconds> startPositionSubject = this.startPositionSubject;
        final VoiceoverScrubber$onAttachedToWindow$1 voiceoverScrubber$onAttachedToWindow$1 = new VoiceoverScrubber$onAttachedToWindow$1((Object)this);
        final VoiceoverScrubber$onAttachedToWindow$2 instance = VoiceoverScrubber$onAttachedToWindow$2.INSTANCE;
        final RelativeLayout e = this.binding.e;
        ng2.e.e((Object)e, "binding.trimClipScrubberLeftHandle");
        this.observeMarginUpdates((t<TrimClipUnits.Milliseconds>)startPositionSubject, (p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels>)voiceoverScrubber$onAttachedToWindow$1, (p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j>)instance, (View)e);
        final a<TrimClipUnits.Milliseconds> endPositionSubject = this.endPositionSubject;
        final VoiceoverScrubber$onAttachedToWindow$3 voiceoverScrubber$onAttachedToWindow$2 = new VoiceoverScrubber$onAttachedToWindow$3((Object)this);
        final VoiceoverScrubber$onAttachedToWindow$4 instance2 = VoiceoverScrubber$onAttachedToWindow$4.INSTANCE;
        final RelativeLayout f = this.binding.f;
        ng2.e.e((Object)f, "binding.trimClipScrubberRightHandle");
        this.observeMarginUpdates((t<TrimClipUnits.Milliseconds>)endPositionSubject, (p<? super TrimClipUnits.Milliseconds, ? super TrimClipUnits.Pixels, TrimClipUnits.Pixels>)voiceoverScrubber$onAttachedToWindow$2, (p<? super RelativeLayout$LayoutParams, ? super TrimClipUnits.Pixels, j>)instance2, (View)f);
        final df2.a subscribe = this.startPositionObservable.subscribe((ff2.g<? super TrimClipUnits.Milliseconds>)new com.reddit.video.creation.widgets.widget.trimclipview.e(this, 2));
        ng2.e.e((Object)subscribe, "startPositionObservable\n\u2026ble()).toString()\n      }");
        p7.a.e(this.attachedToWindowDisposable, subscribe);
        final df2.a subscribe2 = this.endPositionObservable.subscribe((ff2.g<? super TrimClipUnits.Milliseconds>)new com.reddit.video.creation.widgets.widget.trimclipview.b(this, 2));
        ng2.e.e((Object)subscribe2, "endPositionObservable\n  \u2026ble()).toString()\n      }");
        p7.a.e(this.attachedToWindowDisposable, subscribe2);
        this.observeSeekPosition();
        this.observeProgressSeekPosition();
    }
    
    public void onDetachedFromWindow() {
        this.attachedToWindowDisposable.clear();
        super.onDetachedFromWindow();
    }
    
    public final void removeLastProgress() {
        this.binding.g.removeLastProgress();
    }
    
    public final boolean seekBarOverlaps() {
        return this.binding.g.seekBarOverlaps();
    }
    
    public final void setClips(final List<AdjustableClip> adjustableClips) {
        e.f((Object)adjustableClips, "adjustableClips");
        this.adjustableClips = adjustableClips;
        final CompositeDisposable attachedToWindowDisposable = this.attachedToWindowDisposable;
        final df2.a subscribe = ((t<Object>)this.clipSeekBarWidthSubject).subscribe((ff2.g<? super Object>)new com.reddit.video.creation.widgets.widget.trimclipview.a(3, this, adjustableClips));
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
        final Companion companion = VoiceoverScrubber.Companion;
        final TrimClipUnits.Milliseconds access$getValueOrZero = VoiceoverScrubber.Companion.access$getValueOrZero(companion, (a)this.startPositionSubject);
        final TrimClipUnits.Milliseconds.Companion companion2 = TrimClipUnits.Milliseconds.Companion;
        if (e.a((Object)access$getValueOrZero, (Object)companion2.getZERO())) {
            this.startPositionSubject.onNext(milliseconds);
        }
        if (e.a((Object)VoiceoverScrubber.Companion.access$getValueOrZero(companion, (a)this.endPositionSubject), (Object)companion2.getZERO()) && milliseconds2.getValue() != Long.MAX_VALUE) {
            this.endPositionSubject.onNext(milliseconds2);
        }
    }
    
    public final void setSeekBarAtPosition(final TrimClipUnits.Milliseconds milliseconds) {
        e.f((Object)milliseconds, "millis");
        this.internalProgrammaticSeekPositionSubject.onNext(milliseconds);
        final ClipSeekBar g = this.binding.g;
        e.e((Object)g, "binding.trimClipScrubberSeekBar");
        ClipSeekBar.setSeekBarAtPosition$default(g, milliseconds.getValue(), 0, 2, null);
    }
    
    public final void setStartProgress() {
        this.binding.g.setStartProgress();
    }
    
    public final void showSeekBar() {
        this.binding.g.showSeekBar();
    }
    
    public final void undo() {
        this.binding.g.undo();
    }
    
    public final void updateProgress(final boolean b) {
        this.binding.g.updateProgress(b);
    }
    
    @Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/VoiceoverScrubber$Companion;", "", "Lag2/a;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "getValueOrZero", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "Laf2/t;", "Landroid/view/MotionEvent;", "", "isInUseTouchEvents", "movementOffsets", "", "ROUND_MULT", "D", "<init>", "()V", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public static boolean a(final MotionEvent motionEvent) {
            return movementOffsets$lambda-1(motionEvent);
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
        
        public static boolean b(final MotionEvent motionEvent) {
            return movementOffsets$lambda-4$lambda-2(motionEvent);
        }
        
        public static Boolean c(final MotionEvent motionEvent) {
            return isInUseTouchEvents$lambda-0(motionEvent);
        }
        
        public static y d(final t t, final MotionEvent motionEvent) {
            return movementOffsets$lambda-4(t, motionEvent);
        }
        
        public static TrimClipUnits.Pixels e(final float n, final MotionEvent motionEvent) {
            return movementOffsets$lambda-4$lambda-3(n, motionEvent);
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
            final t<Object> map = t.map((ff2.o<? super MotionEvent, ?>)new k(1));
            e.e((Object)map, "map { initialMotionEvent\u2026on == ACTION_MOVE\n      }");
            return (t<Boolean>)map;
        }
        
        private static final Boolean isInUseTouchEvents$lambda-0(final MotionEvent motionEvent) {
            e.f((Object)motionEvent, "initialMotionEvent");
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        
        private final t<TrimClipUnits.Pixels> movementOffsets(final t<MotionEvent> t) {
            final t<Object> switchMap = t.filter((ff2.q<? super MotionEvent>)new aq2.a()).switchMap((ff2.o<? super MotionEvent, ? extends af2.y<?>>)new n((Object)t, 11));
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
                t = t.filter((ff2.q<? super Object>)new l(4)).map((ff2.o<? super Object, ?>)new w(motionEvent.getX()));
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
    
    @Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/VoiceoverScrubber$PositionData;", "", "offset", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "allowedRange", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;", "maximumDistanceRange", "(Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;)V", "getAllowedRange", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;", "getMaximumDistanceRange", "getOffset", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
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
