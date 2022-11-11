// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.draw;

import android.widget.ProgressBar;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.reddit.video.creation.widgets.widget.colorPicker.ColorRadioButton;
import android.util.TypedValue;
import java.util.TimerTask;
import java.util.Timer;
import android.view.MotionEvent;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$OnTouchListener;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import android.widget.SeekBar;
import com.reddit.video.creation.widgets.utils.ViewExtensions;
import android.view.View$OnClickListener;
import m42.a;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import sg2.e;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import hg2.j;
import rg2.l;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.ImageView;
import kotlin.Metadata;
import androidx.constraintlayout.widget.ConstraintLayout;

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001*B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0014\u0010\f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u001a\u0010\u0015\u001a\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u0012R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006+" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/draw/DrawContainerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lhg2/j;", "updateBrushControls", "initSeekBar", "setUpColorPicker", "Landroid/view/View;", "it", "setUpRadioButton", "Landroid/widget/RadioGroup;", "", "checkedId", "onRadioChecked", "hideViews", "showViews", "Lcom/reddit/video/creation/widgets/widget/draw/DrawView;", "drawView", "initView", "Lkotlin/Function1;", "", "listener", "setDoneListener", "Lcom/reddit/video/creation/widgets/widget/draw/DrawView;", "Landroid/widget/TextView;", "undo", "Landroid/widget/TextView;", "done", "Landroid/widget/ImageView;", "brush", "Landroid/widget/ImageView;", "eraser", "colorPicker", "Landroid/widget/RadioGroup;", "selectedColor", "I", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class DrawContainerView extends ConstraintLayout
{
    public static final DrawContainerView.DrawContainerView$Companion Companion;
    public static final int SEEK_BAR_MAX_VALUE = 60;
    public static final float SEEK_BAR_TRANSLATION = 26.0f;
    public static final long SEEK_BAR_TRANSLATION_DELAY = 2000L;
    public static final float SEEK_BAR_VALUE_DELTA = 10.0f;
    private ImageView brush;
    private RadioGroup colorPicker;
    private TextView done;
    private DrawView drawView;
    private ImageView eraser;
    private l<? super Boolean, j> listener;
    private int selectedColor;
    private TextView undo;
    
    static {
        Companion = new DrawContainerView.DrawContainerView$Companion((DefaultConstructorMarker)null);
    }
    
    public DrawContainerView(final Context context) {
        e.f((Object)context, "context");
        this(context, null, 0, 6, null);
    }
    
    public DrawContainerView(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0, 4, null);
    }
    
    public DrawContainerView(final Context context, final AttributeSet set, final int n) {
        e.f((Object)context, "context");
        super(context, set, n);
        this.selectedColor = -16777216;
        View.inflate(context, 2131624227, (ViewGroup)this);
        this.hideViews();
        final View viewById = ((View)this).findViewById(2131431949);
        e.e((Object)viewById, "findViewById(R.id.tvUndo)");
        this.undo = (TextView)viewById;
        final View viewById2 = ((View)this).findViewById(2131431922);
        e.e((Object)viewById2, "findViewById(R.id.tvDone)");
        this.done = (TextView)viewById2;
        final View viewById3 = ((View)this).findViewById(2131427979);
        e.e((Object)viewById3, "findViewById(R.id.brush)");
        this.brush = (ImageView)viewById3;
        final View viewById4 = ((View)this).findViewById(2131428896);
        e.e((Object)viewById4, "findViewById(R.id.eraser)");
        this.eraser = (ImageView)viewById4;
        this.updateBrushControls();
        ((View)this.brush).setOnClickListener((View$OnClickListener)new a((Object)this, 15));
        ((View)this.eraser).setOnClickListener((View$OnClickListener)new t32.e((Object)this, 18));
        final View viewById5 = ((View)this).findViewById(2131430869);
        e.e((Object)viewById5, "findViewById(R.id.rbOverlayColorPicker)");
        this.colorPicker = (RadioGroup)viewById5;
        ((View)this.undo).setOnClickListener((View$OnClickListener)new zv1.a((Object)this, 17));
        ((View)this.done).setOnClickListener((View$OnClickListener)new x62.a((Object)this, 14));
        this.initSeekBar();
        this.setUpColorPicker();
    }
    
    private static final void _init_$lambda-0(final DrawContainerView drawContainerView, final View view) {
        e.f((Object)drawContainerView, "this$0");
        final DrawView drawView = drawContainerView.drawView;
        boolean b = true;
        if (drawView == null || !drawView.isEraserOn()) {
            b = false;
        }
        if (b) {
            final DrawView drawView2 = drawContainerView.drawView;
            if (drawView2 != null) {
                drawView2.toggleEraser();
            }
            drawContainerView.updateBrushControls();
        }
    }
    
    private static final void _init_$lambda-1(final DrawContainerView drawContainerView, final View view) {
        e.f((Object)drawContainerView, "this$0");
        final DrawView drawView = drawContainerView.drawView;
        int n = 0;
        if (drawView != null) {
            n = n;
            if (!drawView.isEraserOn()) {
                n = 1;
            }
        }
        if (n != 0) {
            final DrawView drawView2 = drawContainerView.drawView;
            if (drawView2 != null) {
                drawView2.toggleEraser();
            }
            drawContainerView.updateBrushControls();
        }
    }
    
    private static final void _init_$lambda-2(final DrawContainerView drawContainerView, final View view) {
        e.f((Object)drawContainerView, "this$0");
        final DrawView drawView = drawContainerView.drawView;
        if (drawView != null) {
            drawView.undo();
        }
    }
    
    private static final void _init_$lambda-3(final DrawContainerView drawContainerView, final View view) {
        e.f((Object)drawContainerView, "this$0");
        final DrawView drawView = drawContainerView.drawView;
        if (drawView != null) {
            drawView.onClickDone();
        }
        final DrawView drawView2 = drawContainerView.drawView;
        boolean hasDrawing = false;
        if (drawView2 != null) {
            ((View)drawView2).setEnabled(false);
        }
        final DrawView drawView3 = drawContainerView.drawView;
        boolean b = true;
        if (drawView3 == null || !drawView3.isEraserOn()) {
            b = false;
        }
        if (b) {
            final DrawView drawView4 = drawContainerView.drawView;
            if (drawView4 != null) {
                drawView4.toggleEraser();
            }
            drawContainerView.updateBrushControls();
        }
        drawContainerView.hideViews();
        final l<? super Boolean, j> listener = drawContainerView.listener;
        if (listener != null) {
            final DrawView drawView5 = drawContainerView.drawView;
            if (drawView5 != null) {
                hasDrawing = drawView5.hasDrawing();
            }
            listener.invoke(hasDrawing);
        }
        ((RadioGroup)((View)drawContainerView).findViewById(2131430869)).clearCheck();
    }
    
    private final void hideViews() {
        ViewExtensions.setInvisible((View)this);
    }
    
    private final void initSeekBar() {
        final SeekBar seekBar = (SeekBar)((View)this).findViewById(2131430400);
        final ImageView imageView = (ImageView)((View)this).findViewById(2131431165);
        ((ProgressBar)seekBar).setMax(60);
        ((ProgressBar)seekBar).setProgress(((ProgressBar)seekBar).getMax() / 2);
        ((View)seekBar).setOnTouchListener((View$OnTouchListener)new com.reddit.video.creation.widgets.widget.draw.a(new Ref$BooleanRef(), new Ref$ObjectRef(), seekBar, this, imageView));
        seekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new DrawContainerView$initSeekBar$2(this));
    }
    
    private static final boolean initSeekBar$lambda-4(final Ref$BooleanRef ref$BooleanRef, final Ref$ObjectRef ref$ObjectRef, final SeekBar seekBar, final DrawContainerView drawContainerView, final ImageView imageView, final View view, final MotionEvent motionEvent) {
        e.f((Object)ref$BooleanRef, "$wasScheduled");
        e.f((Object)ref$ObjectRef, "$timer");
        e.f((Object)drawContainerView, "this$0");
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (((View)seekBar).getTranslationX() > 0.0f && !ref$BooleanRef.element) {
                    ref$BooleanRef.element = true;
                    final Timer element = new Timer();
                    ref$ObjectRef.element = element;
                    final Timer timer = element;
                    element.schedule((TimerTask)new DrawContainerView$initSeekBar$1$1(seekBar, imageView, ref$BooleanRef, ref$ObjectRef), 2000L);
                }
            }
        }
        else {
            if (ref$BooleanRef.element) {
                final Timer timer2 = (Timer)ref$ObjectRef.element;
                if (timer2 != null) {
                    timer2.cancel();
                }
                ref$ObjectRef.element = null;
            }
            ref$BooleanRef.element = false;
            if (((View)seekBar).getTranslationX() == 0.0f) {
                final float applyDimension = TypedValue.applyDimension(1, 26.0f, ((View)drawContainerView).getResources().getDisplayMetrics());
                ((View)seekBar).animate().translationX(applyDimension);
                ((View)imageView).animate().translationX(applyDimension);
            }
        }
        return false;
    }
    
    private final void onRadioChecked(final RadioGroup radioGroup, int n) {
        final ColorRadioButton colorRadioButton = (ColorRadioButton)((View)radioGroup).findViewById(n);
        if (colorRadioButton != null) {
            n = colorRadioButton.getRadioColor();
        }
        else {
            n = this.selectedColor;
        }
        this.selectedColor = n;
        final DrawView drawView = this.drawView;
        if (drawView != null) {
            drawView.setColor(n);
        }
    }
    
    private final void setUpColorPicker() {
        final RadioGroup colorPicker = this.colorPicker;
        for (int childCount = ((ViewGroup)colorPicker).getChildCount(), i = 0; i < childCount; ++i) {
            final View child = ((ViewGroup)colorPicker).getChildAt(i);
            e.e((Object)child, "getChildAt(index)");
            this.setUpRadioButton(child);
        }
        colorPicker.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new b(this, colorPicker));
    }
    
    private static final void setUpColorPicker$lambda-7$lambda-6(final DrawContainerView drawContainerView, final RadioGroup radioGroup, final RadioGroup radioGroup2, final int n) {
        e.f((Object)drawContainerView, "this$0");
        e.f((Object)radioGroup, "$this_apply");
        drawContainerView.onRadioChecked(radioGroup, n);
    }
    
    private final void setUpRadioButton(final View view) {
        e.d((Object)view, "null cannot be cast to non-null type com.reddit.video.creation.widgets.widget.colorPicker.ColorRadioButton");
        final ColorRadioButton colorRadioButton = (ColorRadioButton)view;
        colorRadioButton.setChecked(colorRadioButton.getRadioColor() == this.selectedColor);
    }
    
    private final void showViews() {
        ViewExtensions.show((View)this);
        final TextView undo = this.undo;
        final DrawView drawView = this.drawView;
        boolean b = true;
        final int n = 0;
        if (drawView == null || !drawView.canUndo()) {
            b = false;
        }
        int visibility;
        if (b) {
            visibility = n;
        }
        else {
            visibility = 4;
        }
        ((View)undo).setVisibility(visibility);
        this.setUpColorPicker();
    }
    
    private final void updateBrushControls() {
        final DrawView drawView = this.drawView;
        boolean b = true;
        if (drawView == null || !drawView.isEraserOn()) {
            b = false;
        }
        if (b) {
            this.brush.setImageResource(2131231510);
            this.eraser.setImageResource(2131231556);
        }
        else {
            this.brush.setImageResource(2131231511);
            this.eraser.setImageResource(2131231555);
        }
    }
    
    public final void initView(final DrawView drawView) {
        e.f((Object)drawView, "drawView");
        ((View)(this.drawView = drawView)).setEnabled(true);
        this.showViews();
        drawView.setEventsListener((l)new DrawContainerView$initView$1(this));
    }
    
    public final void setDoneListener(final l<? super Boolean, j> listener) {
        e.f((Object)listener, "listener");
        this.listener = listener;
    }
}
