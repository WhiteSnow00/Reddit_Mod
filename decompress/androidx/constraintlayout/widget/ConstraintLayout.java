// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.SparseIntArray;
import android.util.Log;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.constraintlayout.solver.widgets.g;
import java.util.Iterator;
import androidx.constraintlayout.solver.widgets.f;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import androidx.constraintlayout.solver.widgets.i;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import android.content.res.Resources$NotFoundException;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import g3.c;
import androidx.constraintlayout.solver.widgets.e;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.View;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConstraintLayout extends ViewGroup
{
    public static final boolean ALLOWS_EMBEDDED = false;
    private static final boolean CACHE_MEASURED_DIMENSION = false;
    private static final boolean DEBUG = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-1.1.3";
    public SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.a> mConstraintHelpers;
    private b mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    private boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public e mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    private c mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOptimizationLevel;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets;
    
    public ConstraintLayout(final Context context) {
        super(context);
        this.mChildrenByIds = (SparseArray<View>)new SparseArray();
        this.mConstraintHelpers = new ArrayList<androidx.constraintlayout.widget.a>(4);
        this.mVariableDimensionsWidgets = new ArrayList<ConstraintWidget>(100);
        this.mLayoutWidget = new e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<String, Integer>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(null);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.mChildrenByIds = (SparseArray<View>)new SparseArray();
        this.mConstraintHelpers = new ArrayList<androidx.constraintlayout.widget.a>(4);
        this.mVariableDimensionsWidgets = new ArrayList<ConstraintWidget>(100);
        this.mLayoutWidget = new e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<String, Integer>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(set);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mChildrenByIds = (SparseArray<View>)new SparseArray();
        this.mConstraintHelpers = new ArrayList<androidx.constraintlayout.widget.a>(4);
        this.mVariableDimensionsWidgets = new ArrayList<ConstraintWidget>(100);
        this.mLayoutWidget = new e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<String, Integer>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(set);
    }
    
    private final ConstraintWidget getTargetWidget(final int n) {
        if (n == 0) {
            return (ConstraintWidget)this.mLayoutWidget;
        }
        View view;
        if ((view = (View)this.mChildrenByIds.get(n)) == null) {
            final View viewById = ((View)this).findViewById(n);
            if ((view = viewById) != null && (view = viewById) != this) {
                view = viewById;
                if (viewById.getParent() == this) {
                    this.onViewAdded(viewById);
                    view = viewById;
                }
            }
        }
        if (view == this) {
            return (ConstraintWidget)this.mLayoutWidget;
        }
        ConstraintWidget k0;
        if (view == null) {
            k0 = null;
        }
        else {
            k0 = ((a)view.getLayoutParams()).k0;
        }
        return k0;
    }
    
    private void init(AttributeSet obtainStyledAttributes) {
        ((ConstraintWidget)this.mLayoutWidget).X = this;
        this.mChildrenByIds.put(((View)this).getId(), (Object)this);
        this.mConstraintSet = null;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes = (AttributeSet)((View)this).getContext().obtainStyledAttributes(obtainStyledAttributes, ah0.b.u);
            for (int indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = ((TypedArray)obtainStyledAttributes).getIndex(i);
                if (index == 3) {
                    this.mMinWidth = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.mMinWidth);
                }
                else if (index == 4) {
                    this.mMinHeight = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.mMinHeight);
                }
                else if (index == 1) {
                    this.mMaxWidth = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.mMaxWidth);
                }
                else if (index == 2) {
                    this.mMaxHeight = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.mMaxHeight);
                }
                else if (index == 59) {
                    this.mOptimizationLevel = ((TypedArray)obtainStyledAttributes).getInt(index, this.mOptimizationLevel);
                }
                else if (index == 8) {
                    final int resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(index, 0);
                    try {
                        (this.mConstraintSet = new b()).m(resourceId, ((View)this).getContext());
                    }
                    catch (final Resources$NotFoundException ex) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId;
                }
            }
            ((TypedArray)obtainStyledAttributes).recycle();
        }
        this.mLayoutWidget.w0 = this.mOptimizationLevel;
    }
    
    private void internalMeasureChildren(final int n, final int n2) {
        final int n3 = ((View)this).getPaddingBottom() + ((View)this).getPaddingTop();
        final int n4 = ((View)this).getPaddingRight() + ((View)this).getPaddingLeft();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final a a = (a)child.getLayoutParams();
                final ConstraintWidget k0 = a.k0;
                if (!a.X) {
                    if (!a.Y) {
                        k0.Y = child.getVisibility();
                        int t = a.width;
                        int u = a.height;
                        final boolean u2 = a.U;
                        int n5 = 1;
                        final int n6 = 1;
                        boolean b = false;
                        Label_0203: {
                            Label_0201: {
                                if (!u2) {
                                    final boolean v = a.V;
                                    if (!v && (u2 || a.H != 1) && t != -1) {
                                        if (!v) {
                                            if (a.I == 1) {
                                                break Label_0201;
                                            }
                                            if (u == -1) {
                                                break Label_0201;
                                            }
                                        }
                                        b = false;
                                        break Label_0203;
                                    }
                                }
                            }
                            b = true;
                        }
                        boolean b2;
                        if (b) {
                            int n7;
                            if (t == 0) {
                                n7 = ViewGroup.getChildMeasureSpec(n, n4, -2);
                                b2 = true;
                            }
                            else if (t == -1) {
                                n7 = ViewGroup.getChildMeasureSpec(n, n4, -1);
                                b2 = false;
                            }
                            else {
                                b2 = (t == -2);
                                n7 = ViewGroup.getChildMeasureSpec(n, n4, t);
                            }
                            int n8;
                            if (u == 0) {
                                n8 = ViewGroup.getChildMeasureSpec(n2, n3, -2);
                            }
                            else if (u == -1) {
                                n8 = ViewGroup.getChildMeasureSpec(n2, n3, -1);
                                n5 = 0;
                            }
                            else {
                                if (u == -2) {
                                    n5 = n6;
                                }
                                else {
                                    n5 = 0;
                                }
                                n8 = ViewGroup.getChildMeasureSpec(n2, n3, u);
                            }
                            child.measure(n7, n8);
                            t = child.getMeasuredWidth();
                            u = child.getMeasuredHeight();
                        }
                        else {
                            b2 = false;
                            n5 = 0;
                        }
                        k0.w(t);
                        k0.s(u);
                        if (b2) {
                            k0.T = t;
                        }
                        if (n5 != 0) {
                            k0.U = u;
                        }
                        if (a.W) {
                            final int baseline = child.getBaseline();
                            if (baseline != -1) {
                                k0.Q = baseline;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void internalMeasureDimensions(final int n, final int n2) {
        final int n3 = ((View)this).getPaddingBottom() + ((View)this).getPaddingTop();
        final int n4 = ((View)this).getPaddingRight() + ((View)this).getPaddingLeft();
        final int childCount = this.getChildCount();
        int n5 = 0;
        int n6;
        int n7;
        while (true) {
            n6 = -1;
            n7 = -2;
            if (n5 >= childCount) {
                break;
            }
            final View child = this.getChildAt(n5);
            if (child.getVisibility() != 8) {
                final a a = (a)child.getLayoutParams();
                final ConstraintWidget k0 = a.k0;
                if (!a.X) {
                    if (!a.Y) {
                        k0.Y = child.getVisibility();
                        final int width = a.width;
                        final int height = a.height;
                        if (width != 0 && height != 0) {
                            final boolean b = width == -2;
                            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, n4, width);
                            final boolean b2 = height == -2;
                            child.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(n2, n3, height));
                            final int measuredWidth = child.getMeasuredWidth();
                            final int measuredHeight = child.getMeasuredHeight();
                            k0.w(measuredWidth);
                            k0.s(measuredHeight);
                            if (b) {
                                k0.T = measuredWidth;
                            }
                            if (b2) {
                                k0.U = measuredHeight;
                            }
                            if (a.W) {
                                final int baseline = child.getBaseline();
                                if (baseline != -1) {
                                    k0.Q = baseline;
                                }
                            }
                            if (a.U && a.V) {
                                k0.j().g(measuredWidth);
                                k0.i().g(measuredHeight);
                            }
                        }
                        else {
                            ((h3.c)k0.j()).c();
                            ((h3.c)k0.i()).c();
                        }
                    }
                }
            }
            ++n5;
        }
        this.mLayoutWidget.D();
        int i = 0;
        int n8 = n7;
        while (i < childCount) {
            final View child2 = this.getChildAt(i);
            int n9 = 0;
            int n10 = 0;
            Label_1287: {
                if (child2.getVisibility() != 8) {
                    final a a2 = (a)child2.getLayoutParams();
                    final ConstraintWidget k2 = a2.k0;
                    if (!a2.X) {
                        if (!a2.Y) {
                            k2.Y = child2.getVisibility();
                            final int width2 = a2.width;
                            final int height2 = a2.height;
                            if (width2 == 0 || height2 == 0) {
                                final ConstraintAnchor.Type left = ConstraintAnchor.Type.LEFT;
                                final i a3 = k2.f(left).a;
                                final ConstraintAnchor.Type right = ConstraintAnchor.Type.RIGHT;
                                final i a4 = k2.f(right).a;
                                final boolean b3 = k2.f(left).d != null && k2.f(right).d != null;
                                final ConstraintAnchor.Type top = ConstraintAnchor.Type.TOP;
                                final i a5 = k2.f(top).a;
                                final ConstraintAnchor.Type bottom = ConstraintAnchor.Type.BOTTOM;
                                final i a6 = k2.f(bottom).a;
                                final boolean b4 = k2.f(top).d != null && k2.f(bottom).d != null;
                                if (width2 == 0 && height2 == 0 && b3 && b4) {
                                    n9 = -2;
                                    n10 = -1;
                                    break Label_1287;
                                }
                                final ConstraintWidget.DimensionBehaviour[] c = ((ConstraintWidget)this.mLayoutWidget).C;
                                final ConstraintWidget.DimensionBehaviour dimensionBehaviour = c[0];
                                final ConstraintWidget.DimensionBehaviour wrap_CONTENT = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                final boolean b5 = dimensionBehaviour != wrap_CONTENT;
                                int n11;
                                if (c[1] != wrap_CONTENT) {
                                    n11 = 1;
                                }
                                else {
                                    n11 = 0;
                                }
                                if (!b5) {
                                    ((h3.c)k2.j()).c();
                                }
                                if (n11 == 0) {
                                    ((h3.c)k2.i()).c();
                                }
                                int n12 = 0;
                                boolean b6 = false;
                                int n13 = 0;
                                Label_0903: {
                                    if (width2 == 0) {
                                        if (!b5 || (k2.e != 0 || k2.G != 0.0f || k2.h != 0 || k2.i != 0 || k2.C[0] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || !b3 || !a3.d() || !a4.d()) {
                                            n12 = ViewGroup.getChildMeasureSpec(n, n4, -2);
                                            b6 = false;
                                            n13 = 1;
                                            break Label_0903;
                                        }
                                        final int n14 = (int)(a4.g - a3.g);
                                        k2.j().g(n14);
                                        n12 = ViewGroup.getChildMeasureSpec(n, n4, n14);
                                    }
                                    else {
                                        if (width2 != -1) {
                                            final boolean b7 = width2 == -2;
                                            n12 = ViewGroup.getChildMeasureSpec(n, n4, width2);
                                            b6 = b5;
                                            n13 = (b7 ? 1 : 0);
                                            break Label_0903;
                                        }
                                        n12 = ViewGroup.getChildMeasureSpec(n, n4, -1);
                                    }
                                    n13 = 0;
                                    b6 = b5;
                                }
                                int n16;
                                boolean b8;
                                if (height2 == 0) {
                                    if (n11 != 0 && (k2.f == 0 && k2.G == 0.0f && k2.k == 0 && k2.l == 0 && k2.C[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && b4 && a5.d() && a6.d()) {
                                        final int n15 = (int)(a6.g - a5.g);
                                        k2.i().g(n15);
                                        n16 = ViewGroup.getChildMeasureSpec(n2, n3, n15);
                                        b8 = false;
                                    }
                                    else {
                                        n16 = ViewGroup.getChildMeasureSpec(n2, n3, -2);
                                        b8 = true;
                                        n11 = 0;
                                    }
                                }
                                else if (height2 == -1) {
                                    n16 = ViewGroup.getChildMeasureSpec(n2, n3, -1);
                                    b8 = false;
                                }
                                else {
                                    b8 = (height2 == -2);
                                    n16 = ViewGroup.getChildMeasureSpec(n2, n3, height2);
                                }
                                final int n17 = -2;
                                child2.measure(n12, n16);
                                final int measuredWidth2 = child2.getMeasuredWidth();
                                final int measuredHeight2 = child2.getMeasuredHeight();
                                k2.w(measuredWidth2);
                                k2.s(measuredHeight2);
                                if (n13 != 0) {
                                    k2.T = measuredWidth2;
                                }
                                if (b8) {
                                    k2.U = measuredHeight2;
                                }
                                if (b6) {
                                    k2.j().g(measuredWidth2);
                                }
                                else {
                                    ((h3.c)k2.j()).b = 2;
                                }
                                if (n11 != 0) {
                                    k2.i().g(measuredHeight2);
                                }
                                else {
                                    ((h3.c)k2.i()).b = 2;
                                }
                                if (!a2.W) {
                                    n10 = -1;
                                    n9 = n17;
                                    break Label_1287;
                                }
                                final int baseline2 = child2.getBaseline();
                                final int n18 = -1;
                                n9 = n17;
                                n10 = n18;
                                if (baseline2 != -1) {
                                    k2.Q = baseline2;
                                    n9 = n17;
                                    n10 = n18;
                                }
                                break Label_1287;
                            }
                        }
                    }
                }
                final int n19 = n6;
                n9 = n8;
                n10 = n19;
            }
            ++i;
            final int n20 = n9;
            n6 = n10;
            n8 = n20;
        }
    }
    
    private void setChildrenConstraints() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/view/View.isInEditMode:()Z
        //     4: istore          14
        //     6: aload_0        
        //     7: invokevirtual   android/view/ViewGroup.getChildCount:()I
        //    10: istore          6
        //    12: iconst_0       
        //    13: istore          5
        //    15: iload           14
        //    17: ifeq            114
        //    20: iconst_0       
        //    21: istore_3       
        //    22: iload_3        
        //    23: iload           6
        //    25: if_icmpge       114
        //    28: aload_0        
        //    29: iload_3        
        //    30: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //    33: astore          17
        //    35: aload_0        
        //    36: invokevirtual   android/view/View.getResources:()Landroid/content/res/Resources;
        //    39: aload           17
        //    41: invokevirtual   android/view/View.getId:()I
        //    44: invokevirtual   android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
        //    47: astore          16
        //    49: aload_0        
        //    50: iconst_0       
        //    51: aload           16
        //    53: aload           17
        //    55: invokevirtual   android/view/View.getId:()I
        //    58: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    61: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setDesignInformation:(ILjava/lang/Object;Ljava/lang/Object;)V
        //    64: aload           16
        //    66: bipush          47
        //    68: invokevirtual   java/lang/String.indexOf:(I)I
        //    71: istore          4
        //    73: aload           16
        //    75: astore          15
        //    77: iload           4
        //    79: iconst_m1      
        //    80: if_icmpeq       94
        //    83: aload           16
        //    85: iload           4
        //    87: iconst_1       
        //    88: iadd           
        //    89: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    92: astore          15
        //    94: aload_0        
        //    95: aload           17
        //    97: invokevirtual   android/view/View.getId:()I
        //   100: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //   103: aload           15
        //   105: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.Z:Ljava/lang/String;
        //   108: iinc            3, 1
        //   111: goto            22
        //   114: iconst_0       
        //   115: istore_3       
        //   116: iload_3        
        //   117: iload           6
        //   119: if_icmpge       152
        //   122: aload_0        
        //   123: aload_0        
        //   124: iload_3        
        //   125: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //   128: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getViewWidget:(Landroid/view/View;)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //   131: astore          15
        //   133: aload           15
        //   135: ifnonnull       141
        //   138: goto            146
        //   141: aload           15
        //   143: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.o:()V
        //   146: iinc            3, 1
        //   149: goto            116
        //   152: aload_0        
        //   153: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSetId:I
        //   156: iconst_m1      
        //   157: if_icmpeq       213
        //   160: iconst_0       
        //   161: istore_3       
        //   162: iload_3        
        //   163: iload           6
        //   165: if_icmpge       213
        //   168: aload_0        
        //   169: iload_3        
        //   170: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //   173: astore          15
        //   175: aload           15
        //   177: invokevirtual   android/view/View.getId:()I
        //   180: aload_0        
        //   181: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSetId:I
        //   184: if_icmpne       207
        //   187: aload           15
        //   189: instanceof      Landroidx/constraintlayout/widget/c;
        //   192: ifeq            207
        //   195: aload_0        
        //   196: aload           15
        //   198: checkcast       Landroidx/constraintlayout/widget/c;
        //   201: invokevirtual   androidx/constraintlayout/widget/c.getConstraintSet:()Landroidx/constraintlayout/widget/b;
        //   204: putfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSet:Landroidx/constraintlayout/widget/b;
        //   207: iinc            3, 1
        //   210: goto            162
        //   213: aload_0        
        //   214: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintSet:Landroidx/constraintlayout/widget/b;
        //   217: astore          15
        //   219: aload           15
        //   221: ifnull          230
        //   224: aload           15
        //   226: aload_0        
        //   227: invokevirtual   androidx/constraintlayout/widget/b.c:(Landroidx/constraintlayout/widget/ConstraintLayout;)V
        //   230: aload_0        
        //   231: getfield        androidx/constraintlayout/widget/ConstraintLayout.mLayoutWidget:Landroidx/constraintlayout/solver/widgets/e;
        //   234: getfield        h3/d.i0:Ljava/util/ArrayList;
        //   237: invokevirtual   java/util/ArrayList.clear:()V
        //   240: aload_0        
        //   241: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintHelpers:Ljava/util/ArrayList;
        //   244: invokevirtual   java/util/ArrayList.size:()I
        //   247: istore          4
        //   249: iload           4
        //   251: ifle            283
        //   254: iconst_0       
        //   255: istore_3       
        //   256: iload_3        
        //   257: iload           4
        //   259: if_icmpge       283
        //   262: aload_0        
        //   263: getfield        androidx/constraintlayout/widget/ConstraintLayout.mConstraintHelpers:Ljava/util/ArrayList;
        //   266: iload_3        
        //   267: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   270: checkcast       Landroidx/constraintlayout/widget/a;
        //   273: aload_0        
        //   274: invokevirtual   androidx/constraintlayout/widget/a.d:(Landroidx/constraintlayout/widget/ConstraintLayout;)V
        //   277: iinc            3, 1
        //   280: goto            256
        //   283: iconst_0       
        //   284: istore_3       
        //   285: iconst_1       
        //   286: istore          12
        //   288: iload_3        
        //   289: iload           6
        //   291: if_icmpge       399
        //   294: aload_0        
        //   295: iload_3        
        //   296: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //   299: astore          15
        //   301: aload           15
        //   303: instanceof      Landroidx/constraintlayout/widget/d;
        //   306: ifeq            393
        //   309: aload           15
        //   311: checkcast       Landroidx/constraintlayout/widget/d;
        //   314: astore          16
        //   316: aload           16
        //   318: getfield        androidx/constraintlayout/widget/d.f:I
        //   321: iconst_m1      
        //   322: if_icmpne       343
        //   325: aload           16
        //   327: invokevirtual   android/view/View.isInEditMode:()Z
        //   330: ifne            343
        //   333: aload           16
        //   335: aload           16
        //   337: getfield        androidx/constraintlayout/widget/d.h:I
        //   340: invokevirtual   android/view/View.setVisibility:(I)V
        //   343: aload_0        
        //   344: aload           16
        //   346: getfield        androidx/constraintlayout/widget/d.f:I
        //   349: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   352: astore          15
        //   354: aload           16
        //   356: aload           15
        //   358: putfield        androidx/constraintlayout/widget/d.g:Landroid/view/View;
        //   361: aload           15
        //   363: ifnull          393
        //   366: aload           15
        //   368: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   371: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout$a;
        //   374: iconst_1       
        //   375: putfield        androidx/constraintlayout/widget/ConstraintLayout$a.Z:Z
        //   378: aload           16
        //   380: getfield        androidx/constraintlayout/widget/d.g:Landroid/view/View;
        //   383: iconst_0       
        //   384: invokevirtual   android/view/View.setVisibility:(I)V
        //   387: aload           16
        //   389: iconst_0       
        //   390: invokevirtual   android/view/View.setVisibility:(I)V
        //   393: iinc            3, 1
        //   396: goto            285
        //   399: iconst_0       
        //   400: istore          4
        //   402: iload           5
        //   404: istore_3       
        //   405: iload           4
        //   407: iload           6
        //   409: if_icmpge       2321
        //   412: aload_0        
        //   413: iload           4
        //   415: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //   418: astore          17
        //   420: aload_0        
        //   421: aload           17
        //   423: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getViewWidget:(Landroid/view/View;)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //   426: astore          16
        //   428: aload           16
        //   430: ifnonnull       436
        //   433: goto            940
        //   436: aload           17
        //   438: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   441: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout$a;
        //   444: astore          15
        //   446: aload           15
        //   448: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout$a.a:()V
        //   451: iload           14
        //   453: ifeq            516
        //   456: aload_0        
        //   457: invokevirtual   android/view/View.getResources:()Landroid/content/res/Resources;
        //   460: aload           17
        //   462: invokevirtual   android/view/View.getId:()I
        //   465: invokevirtual   android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
        //   468: astore          18
        //   470: aload_0        
        //   471: iload_3        
        //   472: aload           18
        //   474: aload           17
        //   476: invokevirtual   android/view/View.getId:()I
        //   479: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   482: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setDesignInformation:(ILjava/lang/Object;Ljava/lang/Object;)V
        //   485: aload           18
        //   487: aload           18
        //   489: ldc_w           "id/"
        //   492: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   495: iconst_3       
        //   496: iadd           
        //   497: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   500: astore          18
        //   502: aload_0        
        //   503: aload           17
        //   505: invokevirtual   android/view/View.getId:()I
        //   508: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //   511: aload           18
        //   513: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.Z:Ljava/lang/String;
        //   516: aload           16
        //   518: aload           17
        //   520: invokevirtual   android/view/View.getVisibility:()I
        //   523: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.Y:I
        //   526: aload           15
        //   528: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.Z:Z
        //   531: ifeq            541
        //   534: aload           16
        //   536: bipush          8
        //   538: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.Y:I
        //   541: aload           16
        //   543: aload           17
        //   545: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.X:Ljava/lang/Object;
        //   548: aload_0        
        //   549: getfield        androidx/constraintlayout/widget/ConstraintLayout.mLayoutWidget:Landroidx/constraintlayout/solver/widgets/e;
        //   552: astore          18
        //   554: aload           18
        //   556: getfield        h3/d.i0:Ljava/util/ArrayList;
        //   559: aload           16
        //   561: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   564: pop            
        //   565: aload           16
        //   567: getfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.D:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //   570: astore          17
        //   572: aload           17
        //   574: ifnull          597
        //   577: aload           17
        //   579: checkcast       Lh3/d;
        //   582: getfield        h3/d.i0:Ljava/util/ArrayList;
        //   585: aload           16
        //   587: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   590: pop            
        //   591: aload           16
        //   593: aconst_null    
        //   594: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.D:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //   597: aload           16
        //   599: aload           18
        //   601: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.D:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //   604: aload           15
        //   606: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.V:Z
        //   609: ifeq            620
        //   612: aload           15
        //   614: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.U:Z
        //   617: ifne            630
        //   620: aload_0        
        //   621: getfield        androidx/constraintlayout/widget/ConstraintLayout.mVariableDimensionsWidgets:Ljava/util/ArrayList;
        //   624: aload           16
        //   626: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   629: pop            
        //   630: aload           15
        //   632: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.X:Z
        //   635: ifeq            775
        //   638: aload           16
        //   640: checkcast       Landroidx/constraintlayout/solver/widgets/g;
        //   643: astore          16
        //   645: aload           15
        //   647: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.h0:I
        //   650: istore          8
        //   652: aload           15
        //   654: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.i0:I
        //   657: istore          5
        //   659: aload           15
        //   661: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.j0:F
        //   664: fstore_1       
        //   665: fload_1        
        //   666: ldc_w           -1.0
        //   669: fcmpl          
        //   670: istore          7
        //   672: iload           7
        //   674: ifeq            703
        //   677: iload           7
        //   679: ifle            940
        //   682: aload           16
        //   684: fload_1        
        //   685: putfield        androidx/constraintlayout/solver/widgets/g.i0:F
        //   688: aload           16
        //   690: iconst_m1      
        //   691: putfield        androidx/constraintlayout/solver/widgets/g.j0:I
        //   694: aload           16
        //   696: iconst_m1      
        //   697: putfield        androidx/constraintlayout/solver/widgets/g.k0:I
        //   700: goto            940
        //   703: iload           8
        //   705: iconst_m1      
        //   706: if_icmpeq       739
        //   709: iload           8
        //   711: iconst_m1      
        //   712: if_icmple       940
        //   715: aload           16
        //   717: ldc_w           -1.0
        //   720: putfield        androidx/constraintlayout/solver/widgets/g.i0:F
        //   723: aload           16
        //   725: iload           8
        //   727: putfield        androidx/constraintlayout/solver/widgets/g.j0:I
        //   730: aload           16
        //   732: iconst_m1      
        //   733: putfield        androidx/constraintlayout/solver/widgets/g.k0:I
        //   736: goto            940
        //   739: iload           5
        //   741: iconst_m1      
        //   742: if_icmpeq       940
        //   745: iload           5
        //   747: iconst_m1      
        //   748: if_icmple       940
        //   751: aload           16
        //   753: ldc_w           -1.0
        //   756: putfield        androidx/constraintlayout/solver/widgets/g.i0:F
        //   759: aload           16
        //   761: iconst_m1      
        //   762: putfield        androidx/constraintlayout/solver/widgets/g.j0:I
        //   765: aload           16
        //   767: iload           5
        //   769: putfield        androidx/constraintlayout/solver/widgets/g.k0:I
        //   772: goto            940
        //   775: aload           15
        //   777: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.d:I
        //   780: iconst_m1      
        //   781: if_icmpne       943
        //   784: aload           15
        //   786: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.e:I
        //   789: iconst_m1      
        //   790: if_icmpne       943
        //   793: aload           15
        //   795: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.f:I
        //   798: iconst_m1      
        //   799: if_icmpne       943
        //   802: aload           15
        //   804: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.g:I
        //   807: iconst_m1      
        //   808: if_icmpne       943
        //   811: aload           15
        //   813: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.q:I
        //   816: iconst_m1      
        //   817: if_icmpne       943
        //   820: aload           15
        //   822: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.p:I
        //   825: iconst_m1      
        //   826: if_icmpne       943
        //   829: aload           15
        //   831: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.r:I
        //   834: iconst_m1      
        //   835: if_icmpne       943
        //   838: aload           15
        //   840: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.s:I
        //   843: iconst_m1      
        //   844: if_icmpne       943
        //   847: aload           15
        //   849: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.h:I
        //   852: iconst_m1      
        //   853: if_icmpne       943
        //   856: aload           15
        //   858: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.i:I
        //   861: iconst_m1      
        //   862: if_icmpne       943
        //   865: aload           15
        //   867: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.j:I
        //   870: iconst_m1      
        //   871: if_icmpne       943
        //   874: aload           15
        //   876: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.k:I
        //   879: iconst_m1      
        //   880: if_icmpne       943
        //   883: aload           15
        //   885: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.l:I
        //   888: iconst_m1      
        //   889: if_icmpne       943
        //   892: aload           15
        //   894: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.P:I
        //   897: iconst_m1      
        //   898: if_icmpne       943
        //   901: aload           15
        //   903: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.Q:I
        //   906: iconst_m1      
        //   907: if_icmpne       943
        //   910: aload           15
        //   912: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.m:I
        //   915: iconst_m1      
        //   916: if_icmpne       943
        //   919: aload           15
        //   921: getfield        android/view/ViewGroup$MarginLayoutParams.width:I
        //   924: iconst_m1      
        //   925: if_icmpeq       943
        //   928: aload           15
        //   930: getfield        android/view/ViewGroup$MarginLayoutParams.height:I
        //   933: iconst_m1      
        //   934: if_icmpne       940
        //   937: goto            943
        //   940: goto            2315
        //   943: aload           15
        //   945: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.a0:I
        //   948: istore          7
        //   950: aload           15
        //   952: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.b0:I
        //   955: istore          9
        //   957: aload           15
        //   959: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.c0:I
        //   962: istore_3       
        //   963: aload           15
        //   965: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.d0:I
        //   968: istore          5
        //   970: aload           15
        //   972: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.e0:I
        //   975: istore          8
        //   977: aload           15
        //   979: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.f0:I
        //   982: istore          10
        //   984: aload           15
        //   986: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.g0:F
        //   989: fstore_1       
        //   990: aload           15
        //   992: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.m:I
        //   995: istore          11
        //   997: iload           11
        //   999: iconst_m1      
        //  1000: if_icmpeq       1055
        //  1003: aload_0        
        //  1004: iload           11
        //  1006: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1009: astore          18
        //  1011: aload           18
        //  1013: ifnull          1596
        //  1016: aload           15
        //  1018: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.o:F
        //  1021: fstore_1       
        //  1022: aload           15
        //  1024: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.n:I
        //  1027: istore_3       
        //  1028: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.CENTER:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1031: astore          17
        //  1033: aload           16
        //  1035: aload           17
        //  1037: aload           18
        //  1039: aload           17
        //  1041: iload_3        
        //  1042: iconst_0       
        //  1043: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1046: aload           16
        //  1048: fload_1        
        //  1049: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.r:F
        //  1052: goto            1596
        //  1055: iload           7
        //  1057: iconst_m1      
        //  1058: if_icmpeq       1103
        //  1061: aload_0        
        //  1062: iload           7
        //  1064: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1067: astore          18
        //  1069: aload           18
        //  1071: ifnull          1100
        //  1074: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.LEFT:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1077: astore          17
        //  1079: aload           16
        //  1081: aload           17
        //  1083: aload           18
        //  1085: aload           17
        //  1087: aload           15
        //  1089: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //  1092: iload           8
        //  1094: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1097: goto            1142
        //  1100: goto            1142
        //  1103: iload           9
        //  1105: iconst_m1      
        //  1106: if_icmpeq       1142
        //  1109: aload_0        
        //  1110: iload           9
        //  1112: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1115: astore          17
        //  1117: aload           17
        //  1119: ifnull          1142
        //  1122: aload           16
        //  1124: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.LEFT:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1127: aload           17
        //  1129: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.RIGHT:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1132: aload           15
        //  1134: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //  1137: iload           8
        //  1139: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1142: iload_3        
        //  1143: iconst_m1      
        //  1144: if_icmpeq       1182
        //  1147: aload_0        
        //  1148: iload_3        
        //  1149: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1152: astore          17
        //  1154: aload           17
        //  1156: ifnull          1224
        //  1159: aload           16
        //  1161: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.RIGHT:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1164: aload           17
        //  1166: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.LEFT:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1169: aload           15
        //  1171: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //  1174: iload           10
        //  1176: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1179: goto            1224
        //  1182: iload           5
        //  1184: iconst_m1      
        //  1185: if_icmpeq       1224
        //  1188: aload_0        
        //  1189: iload           5
        //  1191: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1194: astore          18
        //  1196: aload           18
        //  1198: ifnull          1224
        //  1201: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.RIGHT:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1204: astore          17
        //  1206: aload           16
        //  1208: aload           17
        //  1210: aload           18
        //  1212: aload           17
        //  1214: aload           15
        //  1216: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //  1219: iload           10
        //  1221: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1224: aload           15
        //  1226: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.h:I
        //  1229: istore_3       
        //  1230: iload_3        
        //  1231: iconst_m1      
        //  1232: if_icmpeq       1276
        //  1235: aload_0        
        //  1236: iload_3        
        //  1237: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1240: astore          17
        //  1242: aload           17
        //  1244: ifnull          1322
        //  1247: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.TOP:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1250: astore          18
        //  1252: aload           16
        //  1254: aload           18
        //  1256: aload           17
        //  1258: aload           18
        //  1260: aload           15
        //  1262: getfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //  1265: aload           15
        //  1267: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.u:I
        //  1270: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1273: goto            1322
        //  1276: aload           15
        //  1278: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.i:I
        //  1281: istore_3       
        //  1282: iload_3        
        //  1283: iconst_m1      
        //  1284: if_icmpeq       1322
        //  1287: aload_0        
        //  1288: iload_3        
        //  1289: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1292: astore          17
        //  1294: aload           17
        //  1296: ifnull          1322
        //  1299: aload           16
        //  1301: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.TOP:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1304: aload           17
        //  1306: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.BOTTOM:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1309: aload           15
        //  1311: getfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //  1314: aload           15
        //  1316: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.u:I
        //  1319: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1322: aload           15
        //  1324: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.j:I
        //  1327: istore_3       
        //  1328: iload_3        
        //  1329: iconst_m1      
        //  1330: if_icmpeq       1371
        //  1333: aload_0        
        //  1334: iload_3        
        //  1335: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1338: astore          17
        //  1340: aload           17
        //  1342: ifnull          1420
        //  1345: aload           16
        //  1347: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.BOTTOM:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1350: aload           17
        //  1352: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.TOP:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1355: aload           15
        //  1357: getfield        android/view/ViewGroup$MarginLayoutParams.bottomMargin:I
        //  1360: aload           15
        //  1362: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.w:I
        //  1365: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1368: goto            1420
        //  1371: aload           15
        //  1373: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.k:I
        //  1376: istore_3       
        //  1377: iload_3        
        //  1378: iconst_m1      
        //  1379: if_icmpeq       1420
        //  1382: aload_0        
        //  1383: iload_3        
        //  1384: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1387: astore          18
        //  1389: aload           18
        //  1391: ifnull          1420
        //  1394: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.BOTTOM:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1397: astore          17
        //  1399: aload           16
        //  1401: aload           17
        //  1403: aload           18
        //  1405: aload           17
        //  1407: aload           15
        //  1409: getfield        android/view/ViewGroup$MarginLayoutParams.bottomMargin:I
        //  1412: aload           15
        //  1414: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.w:I
        //  1417: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.l:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
        //  1420: aload           15
        //  1422: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.l:I
        //  1425: istore_3       
        //  1426: iload_3        
        //  1427: iconst_m1      
        //  1428: if_icmpeq       1550
        //  1431: aload_0        
        //  1432: getfield        androidx/constraintlayout/widget/ConstraintLayout.mChildrenByIds:Landroid/util/SparseArray;
        //  1435: iload_3        
        //  1436: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
        //  1439: checkcast       Landroid/view/View;
        //  1442: astore          18
        //  1444: aload_0        
        //  1445: aload           15
        //  1447: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.l:I
        //  1450: invokespecial   androidx/constraintlayout/widget/ConstraintLayout.getTargetWidget:(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
        //  1453: astore          17
        //  1455: aload           17
        //  1457: ifnull          1550
        //  1460: aload           18
        //  1462: ifnull          1550
        //  1465: aload           18
        //  1467: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1470: instanceof      Landroidx/constraintlayout/widget/ConstraintLayout$a;
        //  1473: ifeq            1550
        //  1476: aload           18
        //  1478: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //  1481: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout$a;
        //  1484: astore          18
        //  1486: aload           15
        //  1488: iconst_1       
        //  1489: putfield        androidx/constraintlayout/widget/ConstraintLayout$a.W:Z
        //  1492: aload           18
        //  1494: iconst_1       
        //  1495: putfield        androidx/constraintlayout/widget/ConstraintLayout$a.W:Z
        //  1498: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.BASELINE:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1501: astore          18
        //  1503: aload           16
        //  1505: aload           18
        //  1507: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.f:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
        //  1510: aload           17
        //  1512: aload           18
        //  1514: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.f:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
        //  1517: iconst_0       
        //  1518: iconst_m1      
        //  1519: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Strength.STRONG:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Strength;
        //  1522: iconst_0       
        //  1523: iconst_1       
        //  1524: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintAnchor.a:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;IILandroidx/constraintlayout/solver/widgets/ConstraintAnchor$Strength;IZ)Z
        //  1527: pop            
        //  1528: aload           16
        //  1530: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.TOP:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1533: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.f:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
        //  1536: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintAnchor.d:()V
        //  1539: aload           16
        //  1541: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.BOTTOM:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1544: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.f:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
        //  1547: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintAnchor.d:()V
        //  1550: fload_1        
        //  1551: fconst_0       
        //  1552: fcmpl          
        //  1553: iflt            1570
        //  1556: fload_1        
        //  1557: ldc_w           0.5
        //  1560: fcmpl          
        //  1561: ifeq            1570
        //  1564: aload           16
        //  1566: fload_1        
        //  1567: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.V:F
        //  1570: aload           15
        //  1572: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.A:F
        //  1575: fstore_1       
        //  1576: fload_1        
        //  1577: fconst_0       
        //  1578: fcmpl          
        //  1579: iflt            1596
        //  1582: fload_1        
        //  1583: ldc_w           0.5
        //  1586: fcmpl          
        //  1587: ifeq            1596
        //  1590: aload           16
        //  1592: fload_1        
        //  1593: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.W:F
        //  1596: iload           14
        //  1598: ifeq            1641
        //  1601: aload           15
        //  1603: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.P:I
        //  1606: istore_3       
        //  1607: iload_3        
        //  1608: iconst_m1      
        //  1609: if_icmpne       1621
        //  1612: aload           15
        //  1614: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.Q:I
        //  1617: iconst_m1      
        //  1618: if_icmpeq       1641
        //  1621: aload           15
        //  1623: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.Q:I
        //  1626: istore          5
        //  1628: aload           16
        //  1630: iload_3        
        //  1631: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.I:I
        //  1634: aload           16
        //  1636: iload           5
        //  1638: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.J:I
        //  1641: aload           15
        //  1643: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.U:Z
        //  1646: ifne            1718
        //  1649: aload           15
        //  1651: getfield        android/view/ViewGroup$MarginLayoutParams.width:I
        //  1654: iconst_m1      
        //  1655: if_icmpne       1701
        //  1658: aload           16
        //  1660: getstatic       androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.MATCH_PARENT:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
        //  1663: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.t:(Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
        //  1666: aload           16
        //  1668: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.LEFT:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1671: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.f:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
        //  1674: aload           15
        //  1676: getfield        android/view/ViewGroup$MarginLayoutParams.leftMargin:I
        //  1679: putfield        androidx/constraintlayout/solver/widgets/ConstraintAnchor.e:I
        //  1682: aload           16
        //  1684: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.RIGHT:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1687: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.f:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
        //  1690: aload           15
        //  1692: getfield        android/view/ViewGroup$MarginLayoutParams.rightMargin:I
        //  1695: putfield        androidx/constraintlayout/solver/widgets/ConstraintAnchor.e:I
        //  1698: goto            1736
        //  1701: aload           16
        //  1703: getstatic       androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
        //  1706: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.t:(Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
        //  1709: aload           16
        //  1711: iconst_0       
        //  1712: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.w:(I)V
        //  1715: goto            1736
        //  1718: aload           16
        //  1720: getstatic       androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.FIXED:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
        //  1723: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.t:(Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
        //  1726: aload           16
        //  1728: aload           15
        //  1730: getfield        android/view/ViewGroup$MarginLayoutParams.width:I
        //  1733: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.w:(I)V
        //  1736: aload           15
        //  1738: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.V:Z
        //  1741: ifne            1813
        //  1744: aload           15
        //  1746: getfield        android/view/ViewGroup$MarginLayoutParams.height:I
        //  1749: iconst_m1      
        //  1750: if_icmpne       1796
        //  1753: aload           16
        //  1755: getstatic       androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.MATCH_PARENT:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
        //  1758: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.v:(Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
        //  1761: aload           16
        //  1763: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.TOP:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1766: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.f:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
        //  1769: aload           15
        //  1771: getfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //  1774: putfield        androidx/constraintlayout/solver/widgets/ConstraintAnchor.e:I
        //  1777: aload           16
        //  1779: getstatic       androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.BOTTOM:Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
        //  1782: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.f:(Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
        //  1785: aload           15
        //  1787: getfield        android/view/ViewGroup$MarginLayoutParams.bottomMargin:I
        //  1790: putfield        androidx/constraintlayout/solver/widgets/ConstraintAnchor.e:I
        //  1793: goto            1831
        //  1796: aload           16
        //  1798: getstatic       androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
        //  1801: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.v:(Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
        //  1804: aload           16
        //  1806: iconst_0       
        //  1807: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.s:(I)V
        //  1810: goto            1831
        //  1813: aload           16
        //  1815: getstatic       androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.FIXED:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
        //  1818: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.v:(Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
        //  1821: aload           16
        //  1823: aload           15
        //  1825: getfield        android/view/ViewGroup$MarginLayoutParams.height:I
        //  1828: invokevirtual   androidx/constraintlayout/solver/widgets/ConstraintWidget.s:(I)V
        //  1831: aload           15
        //  1833: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.B:Ljava/lang/String;
        //  1836: astore          18
        //  1838: aload           18
        //  1840: ifnull          2101
        //  1843: aload           18
        //  1845: invokevirtual   java/lang/String.length:()I
        //  1848: ifne            1860
        //  1851: aload           16
        //  1853: fconst_0       
        //  1854: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.G:F
        //  1857: goto            2101
        //  1860: aload           18
        //  1862: invokevirtual   java/lang/String.length:()I
        //  1865: istore          7
        //  1867: aload           18
        //  1869: bipush          44
        //  1871: invokevirtual   java/lang/String.indexOf:(I)I
        //  1874: istore          5
        //  1876: iload           5
        //  1878: ifle            1940
        //  1881: iload           5
        //  1883: iload           7
        //  1885: iconst_1       
        //  1886: isub           
        //  1887: if_icmpge       1940
        //  1890: aload           18
        //  1892: iconst_0       
        //  1893: iload           5
        //  1895: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1898: astore          17
        //  1900: aload           17
        //  1902: ldc_w           "W"
        //  1905: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1908: ifeq            1916
        //  1911: iconst_0       
        //  1912: istore_3       
        //  1913: goto            1934
        //  1916: aload           17
        //  1918: ldc_w           "H"
        //  1921: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1924: ifeq            1932
        //  1927: iconst_1       
        //  1928: istore_3       
        //  1929: goto            1934
        //  1932: iconst_m1      
        //  1933: istore_3       
        //  1934: iinc            5, 1
        //  1937: goto            1945
        //  1940: iconst_m1      
        //  1941: istore_3       
        //  1942: iconst_0       
        //  1943: istore          5
        //  1945: aload           18
        //  1947: bipush          58
        //  1949: invokevirtual   java/lang/String.indexOf:(I)I
        //  1952: istore          8
        //  1954: iload           8
        //  1956: iflt            2055
        //  1959: iload           8
        //  1961: iload           7
        //  1963: iconst_1       
        //  1964: isub           
        //  1965: if_icmpge       2055
        //  1968: aload           18
        //  1970: iload           5
        //  1972: iload           8
        //  1974: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1977: astore          17
        //  1979: aload           18
        //  1981: iload           8
        //  1983: iconst_1       
        //  1984: iadd           
        //  1985: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1988: astore          18
        //  1990: aload           17
        //  1992: invokevirtual   java/lang/String.length:()I
        //  1995: ifle            2081
        //  1998: aload           18
        //  2000: invokevirtual   java/lang/String.length:()I
        //  2003: ifle            2081
        //  2006: aload           17
        //  2008: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //  2011: fstore_2       
        //  2012: aload           18
        //  2014: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //  2017: fstore_1       
        //  2018: fload_2        
        //  2019: fconst_0       
        //  2020: fcmpl          
        //  2021: ifle            2081
        //  2024: fload_1        
        //  2025: fconst_0       
        //  2026: fcmpl          
        //  2027: ifle            2081
        //  2030: iload_3        
        //  2031: iconst_1       
        //  2032: if_icmpne       2045
        //  2035: fload_1        
        //  2036: fload_2        
        //  2037: fdiv           
        //  2038: invokestatic    java/lang/Math.abs:(F)F
        //  2041: fstore_1       
        //  2042: goto            2078
        //  2045: fload_2        
        //  2046: fload_1        
        //  2047: fdiv           
        //  2048: invokestatic    java/lang/Math.abs:(F)F
        //  2051: fstore_1       
        //  2052: goto            2078
        //  2055: aload           18
        //  2057: iload           5
        //  2059: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  2062: astore          17
        //  2064: aload           17
        //  2066: invokevirtual   java/lang/String.length:()I
        //  2069: ifle            2081
        //  2072: aload           17
        //  2074: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //  2077: fstore_1       
        //  2078: goto            2083
        //  2081: fconst_0       
        //  2082: fstore_1       
        //  2083: fload_1        
        //  2084: fconst_0       
        //  2085: fcmpl          
        //  2086: ifle            2101
        //  2089: aload           16
        //  2091: fload_1        
        //  2092: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.G:F
        //  2095: aload           16
        //  2097: iload_3        
        //  2098: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.H:I
        //  2101: aload           15
        //  2103: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.D:F
        //  2106: fstore_1       
        //  2107: aload           16
        //  2109: getfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.f0:[F
        //  2112: astore          17
        //  2114: iconst_0       
        //  2115: istore          5
        //  2117: aload           17
        //  2119: iconst_0       
        //  2120: fload_1        
        //  2121: fastore        
        //  2122: aload           15
        //  2124: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.E:F
        //  2127: fstore_1       
        //  2128: iconst_1       
        //  2129: istore          13
        //  2131: aload           17
        //  2133: iconst_1       
        //  2134: fload_1        
        //  2135: fastore        
        //  2136: aload           16
        //  2138: aload           15
        //  2140: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.F:I
        //  2143: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.d0:I
        //  2146: aload           16
        //  2148: aload           15
        //  2150: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.G:I
        //  2153: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.e0:I
        //  2156: aload           15
        //  2158: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.H:I
        //  2161: istore          7
        //  2163: aload           15
        //  2165: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.J:I
        //  2168: istore          8
        //  2170: aload           15
        //  2172: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.L:I
        //  2175: istore_3       
        //  2176: aload           15
        //  2178: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.N:F
        //  2181: fstore_1       
        //  2182: aload           16
        //  2184: iload           7
        //  2186: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.e:I
        //  2189: aload           16
        //  2191: iload           8
        //  2193: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.h:I
        //  2196: aload           16
        //  2198: iload_3        
        //  2199: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.i:I
        //  2202: aload           16
        //  2204: fload_1        
        //  2205: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.j:F
        //  2208: fload_1        
        //  2209: fconst_1       
        //  2210: fcmpg          
        //  2211: ifge            2225
        //  2214: iload           7
        //  2216: ifne            2225
        //  2219: aload           16
        //  2221: iconst_2       
        //  2222: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.e:I
        //  2225: aload           15
        //  2227: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.I:I
        //  2230: istore          7
        //  2232: aload           15
        //  2234: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.K:I
        //  2237: istore_3       
        //  2238: aload           15
        //  2240: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.M:I
        //  2243: istore          8
        //  2245: aload           15
        //  2247: getfield        androidx/constraintlayout/widget/ConstraintLayout$a.O:F
        //  2250: fstore_1       
        //  2251: aload           16
        //  2253: iload           7
        //  2255: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.f:I
        //  2258: aload           16
        //  2260: iload_3        
        //  2261: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.k:I
        //  2264: aload           16
        //  2266: iload           8
        //  2268: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.l:I
        //  2271: aload           16
        //  2273: fload_1        
        //  2274: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.m:F
        //  2277: iload           5
        //  2279: istore_3       
        //  2280: iload           13
        //  2282: istore          12
        //  2284: fload_1        
        //  2285: fconst_1       
        //  2286: fcmpg          
        //  2287: ifge            2315
        //  2290: iload           5
        //  2292: istore_3       
        //  2293: iload           13
        //  2295: istore          12
        //  2297: iload           7
        //  2299: ifne            2315
        //  2302: aload           16
        //  2304: iconst_2       
        //  2305: putfield        androidx/constraintlayout/solver/widgets/ConstraintWidget.f:I
        //  2308: iload           13
        //  2310: istore          12
        //  2312: iload           5
        //  2314: istore_3       
        //  2315: iinc            4, 1
        //  2318: goto            405
        //  2321: return         
        //  2322: astore          15
        //  2324: goto            108
        //  2327: astore          18
        //  2329: goto            516
        //  2332: astore          17
        //  2334: goto            2081
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  35     73     2322   2327   Landroid/content/res/Resources$NotFoundException;
        //  83     94     2322   2327   Landroid/content/res/Resources$NotFoundException;
        //  94     108    2322   2327   Landroid/content/res/Resources$NotFoundException;
        //  456    516    2327   2332   Landroid/content/res/Resources$NotFoundException;
        //  2006   2018   2332   2337   Ljava/lang/NumberFormatException;
        //  2035   2042   2332   2337   Ljava/lang/NumberFormatException;
        //  2045   2052   2332   2337   Ljava/lang/NumberFormatException;
        //  2072   2078   2332   2337   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1070, Size: 1070
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void setSelfDimensionBehaviour(int size, int size2) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int mode2 = View$MeasureSpec.getMode(size2);
        size2 = View$MeasureSpec.getSize(size2);
        final int paddingTop = ((View)this).getPaddingTop();
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ((View)this).getLayoutParams();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = null;
        Label_0120: {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode == 1073741824) {
                        size = Math.min(this.mMaxWidth, size) - (paddingRight + paddingLeft);
                        dimensionBehaviour2 = dimensionBehaviour;
                        break Label_0120;
                    }
                    dimensionBehaviour2 = dimensionBehaviour;
                }
                else {
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                size = 0;
            }
            else {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            }
        }
        Label_0174: {
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 == 1073741824) {
                        size2 = Math.min(this.mMaxHeight, size2) - (paddingBottom + paddingTop);
                        break Label_0174;
                    }
                }
                else {
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                size2 = 0;
            }
            else {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            }
        }
        final e mLayoutWidget = this.mLayoutWidget;
        ((ConstraintWidget)mLayoutWidget).R = 0;
        ((ConstraintWidget)mLayoutWidget).S = 0;
        ((ConstraintWidget)mLayoutWidget).t(dimensionBehaviour2);
        ((ConstraintWidget)this.mLayoutWidget).w(size);
        ((ConstraintWidget)this.mLayoutWidget).v(dimensionBehaviour);
        ((ConstraintWidget)this.mLayoutWidget).s(size2);
        final e mLayoutWidget2 = this.mLayoutWidget;
        size = this.mMinWidth - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight();
        if (size < 0) {
            ((ConstraintWidget)mLayoutWidget2).R = 0;
        }
        else {
            ((ConstraintWidget)mLayoutWidget2).R = size;
        }
        final e mLayoutWidget3 = this.mLayoutWidget;
        size = this.mMinHeight - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom();
        if (size < 0) {
            ((ConstraintWidget)mLayoutWidget3).S = 0;
        }
        else {
            ((ConstraintWidget)mLayoutWidget3).S = size;
        }
    }
    
    private void updateHierarchy() {
        final int childCount = this.getChildCount();
        final int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= childCount) {
                break;
            }
            if (this.getChildAt(n2).isLayoutRequested()) {
                n3 = 1;
                break;
            }
            ++n2;
        }
        if (n3 != 0) {
            this.mVariableDimensionsWidgets.clear();
            this.setChildrenConstraints();
        }
    }
    
    private void updatePostMeasures() {
        final int childCount = this.getChildCount();
        final int n = 0;
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child instanceof d) {
                final d d = (d)child;
                if (d.g != null) {
                    final a a = (a)d.getLayoutParams();
                    final a a2 = (a)d.g.getLayoutParams();
                    final ConstraintWidget k0 = a2.k0;
                    k0.Y = 0;
                    a.k0.w(k0.k());
                    a.k0.s(a2.k0.g());
                    a2.k0.Y = 8;
                }
            }
        }
        final int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int j = n; j < size; ++j) {
                this.mConstraintHelpers.get(j).getClass();
            }
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    public void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        if (((View)this).isInEditMode()) {
            final int childCount = this.getChildCount();
            final float n = (float)((View)this).getWidth();
            final float n2 = (float)((View)this).getHeight();
            for (int i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() != 8) {
                    final Object tag = child.getTag();
                    if (tag != null && tag instanceof String) {
                        final String[] split = ((String)tag).split(",");
                        if (split.length == 4) {
                            final int int1 = Integer.parseInt(split[0]);
                            final int int2 = Integer.parseInt(split[1]);
                            final int int3 = Integer.parseInt(split[2]);
                            final int int4 = Integer.parseInt(split[3]);
                            final int n3 = (int)(int1 / 1080.0f * n);
                            final int n4 = (int)(int2 / 1920.0f * n2);
                            final int n5 = (int)(int3 / 1080.0f * n);
                            final int n6 = (int)(int4 / 1920.0f * n2);
                            final Paint paint = new Paint();
                            paint.setColor(-65536);
                            final float n7 = (float)n3;
                            final float n8 = (float)n4;
                            final float n9 = (float)(n3 + n5);
                            canvas.drawLine(n7, n8, n9, n8, paint);
                            final float n10 = (float)(n4 + n6);
                            canvas.drawLine(n9, n8, n9, n10, paint);
                            canvas.drawLine(n9, n10, n7, n10, paint);
                            canvas.drawLine(n7, n10, n7, n8, paint);
                            paint.setColor(-16711936);
                            canvas.drawLine(n7, n8, n9, n10, paint);
                            canvas.drawLine(n7, n10, n9, n8, paint);
                        }
                    }
                }
            }
        }
    }
    
    public void fillMetrics(final c c) {
        this.mLayoutWidget.k0.getClass();
    }
    
    public /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.generateDefaultLayoutParams();
    }
    
    public a generateDefaultLayoutParams() {
        return new a(-2);
    }
    
    public /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(set);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new a(viewGroup$LayoutParams);
    }
    
    public a generateLayoutParams(final AttributeSet set) {
        return new a(((View)this).getContext(), set);
    }
    
    public Object getDesignInformation(final int n, final Object o) {
        if (n == 0 && o instanceof String) {
            final String s = (String)o;
            final HashMap<String, Integer> mDesignIds = this.mDesignIds;
            if (mDesignIds != null && mDesignIds.containsKey(s)) {
                return this.mDesignIds.get(s);
            }
        }
        return null;
    }
    
    public int getMaxHeight() {
        return this.mMaxHeight;
    }
    
    public int getMaxWidth() {
        return this.mMaxWidth;
    }
    
    public int getMinHeight() {
        return this.mMinHeight;
    }
    
    public int getMinWidth() {
        return this.mMinWidth;
    }
    
    public int getOptimizationLevel() {
        return this.mLayoutWidget.w0;
    }
    
    public View getViewById(final int n) {
        return (View)this.mChildrenByIds.get(n);
    }
    
    public final ConstraintWidget getViewWidget(final View view) {
        if (view == this) {
            return (ConstraintWidget)this.mLayoutWidget;
        }
        ConstraintWidget k0;
        if (view == null) {
            k0 = null;
        }
        else {
            k0 = ((a)view.getLayoutParams()).k0;
        }
        return k0;
    }
    
    public void onLayout(final boolean b, int i, int n, int n2, int n3) {
        n2 = this.getChildCount();
        final boolean inEditMode = ((View)this).isInEditMode();
        n = 0;
        View child;
        a a;
        ConstraintWidget k0;
        int n4;
        int n5;
        int n6;
        View content;
        for (i = 0; i < n2; ++i) {
            child = this.getChildAt(i);
            a = (a)child.getLayoutParams();
            k0 = a.k0;
            if (child.getVisibility() != 8 || a.X || a.Y || inEditMode) {
                if (!a.Z) {
                    n4 = k0.M + k0.O;
                    n5 = k0.N + k0.P;
                    n6 = k0.k() + n4;
                    n3 = k0.g() + n5;
                    child.layout(n4, n5, n6, n3);
                    if (child instanceof d) {
                        content = ((d)child).getContent();
                        if (content != null) {
                            content.setVisibility(0);
                            content.layout(n4, n5, n6, n3);
                        }
                    }
                }
            }
        }
        n2 = this.mConstraintHelpers.size();
        if (n2 > 0) {
            for (i = n; i < n2; ++i) {
                this.mConstraintHelpers.get(i).c();
            }
        }
    }
    
    public void onMeasure(int resolveSizeAndState, int min) {
        System.currentTimeMillis();
        final int mode = View$MeasureSpec.getMode(resolveSizeAndState);
        final int size = View$MeasureSpec.getSize(resolveSizeAndState);
        final int mode2 = View$MeasureSpec.getMode(min);
        final int size2 = View$MeasureSpec.getSize(min);
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingTop = ((View)this).getPaddingTop();
        final e mLayoutWidget = this.mLayoutWidget;
        ((ConstraintWidget)mLayoutWidget).I = paddingLeft;
        ((ConstraintWidget)mLayoutWidget).J = paddingTop;
        final int mMaxWidth = this.mMaxWidth;
        final int[] q = ((ConstraintWidget)mLayoutWidget).q;
        int i = 0;
        q[0] = mMaxWidth;
        q[1] = this.mMaxHeight;
        mLayoutWidget.j0 = (((View)this).getLayoutDirection() == 1);
        this.setSelfDimensionBehaviour(resolveSizeAndState, min);
        final int k = ((ConstraintWidget)this.mLayoutWidget).k();
        final int g = ((ConstraintWidget)this.mLayoutWidget).g();
        boolean b;
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            this.updateHierarchy();
            b = true;
        }
        else {
            b = false;
        }
        final boolean b2 = (this.mOptimizationLevel & 0x8) == 0x8;
        if (b2) {
            final e mLayoutWidget2 = this.mLayoutWidget;
            final int size3 = ((h3.d)mLayoutWidget2).i0.size();
            ((ConstraintWidget)mLayoutWidget2).p();
            while (i < size3) {
                ((ConstraintWidget)((h3.d)mLayoutWidget2).i0.get(i)).p();
                ++i;
            }
            mLayoutWidget2.c(mLayoutWidget2.w0);
            final e mLayoutWidget3 = this.mLayoutWidget;
            final ConstraintWidget.DimensionBehaviour dimensionBehaviour = ((ConstraintWidget)mLayoutWidget3).C[0];
            final ConstraintWidget.DimensionBehaviour wrap_CONTENT = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour != wrap_CONTENT) {
                final h3.b c = ((ConstraintWidget)mLayoutWidget3).c;
                if (c != null) {
                    c.g(k);
                }
            }
            if (((ConstraintWidget)mLayoutWidget3).C[1] != wrap_CONTENT) {
                final h3.b d = ((ConstraintWidget)mLayoutWidget3).d;
                if (d != null) {
                    d.g(g);
                }
            }
            this.internalMeasureDimensions(resolveSizeAndState, min);
        }
        else {
            this.internalMeasureChildren(resolveSizeAndState, min);
        }
        this.updatePostMeasures();
        boolean b6 = false;
        Label_0874: {
            if (this.getChildCount() > 0 && b) {
                final e mLayoutWidget4 = this.mLayoutWidget;
                if ((mLayoutWidget4.w0 & 0x20) == 0x20) {
                    mLayoutWidget4.x0 = true;
                    mLayoutWidget4.r0 = false;
                    mLayoutWidget4.s0 = false;
                    mLayoutWidget4.t0 = false;
                    final ArrayList i2 = ((h3.d)mLayoutWidget4).i0;
                    final ArrayList q2 = mLayoutWidget4.q0;
                    final ConstraintWidget.DimensionBehaviour[] c2 = ((ConstraintWidget)mLayoutWidget4).C;
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = c2[0];
                    final ConstraintWidget.DimensionBehaviour wrap_CONTENT2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    final boolean b3 = dimensionBehaviour2 == wrap_CONTENT2;
                    final boolean b4 = c2[1] == wrap_CONTENT2;
                    final boolean b5 = b3 || b4;
                    q2.clear();
                    for (final ConstraintWidget constraintWidget : i2) {
                        constraintWidget.p = null;
                        constraintWidget.c0 = false;
                        constraintWidget.p();
                    }
                    for (final ConstraintWidget constraintWidget2 : i2) {
                        if (constraintWidget2.p == null) {
                            final f f = new f(new ArrayList(), 0);
                            q2.add(f);
                            if (!androidx.constraintlayout.solver.widgets.a.f(constraintWidget2, f, q2, b5)) {
                                mLayoutWidget4.q0.clear();
                                mLayoutWidget4.q0.add(0, new f(((h3.d)mLayoutWidget4).i0));
                                mLayoutWidget4.x0 = false;
                                b6 = b2;
                                break Label_0874;
                            }
                            continue;
                        }
                    }
                    final Iterator iterator3 = q2.iterator();
                    int max = 0;
                    int max2 = 0;
                    while (iterator3.hasNext()) {
                        final f f2 = (f)iterator3.next();
                        max = Math.max(max, androidx.constraintlayout.solver.widgets.a.a(f2, 0));
                        max2 = Math.max(max2, androidx.constraintlayout.solver.widgets.a.a(f2, 1));
                    }
                    if (b3) {
                        ((ConstraintWidget)mLayoutWidget4).t(ConstraintWidget.DimensionBehaviour.FIXED);
                        ((ConstraintWidget)mLayoutWidget4).w(max);
                        mLayoutWidget4.r0 = true;
                        mLayoutWidget4.s0 = true;
                        mLayoutWidget4.u0 = max;
                    }
                    if (b4) {
                        ((ConstraintWidget)mLayoutWidget4).v(ConstraintWidget.DimensionBehaviour.FIXED);
                        ((ConstraintWidget)mLayoutWidget4).s(max2);
                        mLayoutWidget4.r0 = true;
                        mLayoutWidget4.t0 = true;
                        mLayoutWidget4.v0 = max2;
                    }
                    androidx.constraintlayout.solver.widgets.a.e(0, ((ConstraintWidget)mLayoutWidget4).k(), q2);
                    androidx.constraintlayout.solver.widgets.a.e(1, ((ConstraintWidget)mLayoutWidget4).g(), q2);
                    b6 = b2;
                    break Label_0874;
                }
                mLayoutWidget4.q0.clear();
                mLayoutWidget4.q0.add(0, new f(((h3.d)mLayoutWidget4).i0));
            }
            b6 = b2;
        }
        final e mLayoutWidget5 = this.mLayoutWidget;
        if (mLayoutWidget5.r0) {
            if (mLayoutWidget5.s0 && mode == Integer.MIN_VALUE) {
                final int u0 = mLayoutWidget5.u0;
                if (u0 < size) {
                    ((ConstraintWidget)mLayoutWidget5).w(u0);
                }
                ((ConstraintWidget)this.mLayoutWidget).t(ConstraintWidget.DimensionBehaviour.FIXED);
            }
            final e mLayoutWidget6 = this.mLayoutWidget;
            if (mLayoutWidget6.t0 && mode2 == Integer.MIN_VALUE) {
                final int v0 = mLayoutWidget6.v0;
                if (v0 < size2) {
                    ((ConstraintWidget)mLayoutWidget6).s(v0);
                }
                ((ConstraintWidget)this.mLayoutWidget).v(ConstraintWidget.DimensionBehaviour.FIXED);
            }
        }
        if ((this.mOptimizationLevel & 0x20) == 0x20) {
            final int j = ((ConstraintWidget)this.mLayoutWidget).k();
            final int g2 = ((ConstraintWidget)this.mLayoutWidget).g();
            if (this.mLastMeasureWidth != j && mode == 1073741824) {
                androidx.constraintlayout.solver.widgets.a.e(0, j, this.mLayoutWidget.q0);
            }
            if (this.mLastMeasureHeight != g2 && mode2 == 1073741824) {
                androidx.constraintlayout.solver.widgets.a.e(1, g2, this.mLayoutWidget.q0);
            }
            final e mLayoutWidget7 = this.mLayoutWidget;
            if (mLayoutWidget7.s0 && mLayoutWidget7.u0 > size) {
                androidx.constraintlayout.solver.widgets.a.e(0, size, mLayoutWidget7.q0);
            }
            final e mLayoutWidget8 = this.mLayoutWidget;
            if (mLayoutWidget8.t0 && mLayoutWidget8.v0 > size2) {
                androidx.constraintlayout.solver.widgets.a.e(1, size2, mLayoutWidget8.q0);
            }
        }
        if (this.getChildCount() > 0) {
            this.solveLinearSystem("First pass");
        }
        final int size4 = this.mVariableDimensionsWidgets.size();
        final int n = ((View)this).getPaddingBottom() + paddingTop;
        final int n2 = ((View)this).getPaddingRight() + paddingLeft;
        int n13;
        if (size4 > 0) {
            final e mLayoutWidget9 = this.mLayoutWidget;
            final ConstraintWidget.DimensionBehaviour[] c3 = ((ConstraintWidget)mLayoutWidget9).C;
            final ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = c3[0];
            final ConstraintWidget.DimensionBehaviour wrap_CONTENT3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            final boolean b7 = dimensionBehaviour3 == wrap_CONTENT3;
            final boolean b8 = c3[1] == wrap_CONTENT3;
            int max3 = Math.max(((ConstraintWidget)mLayoutWidget9).k(), this.mMinWidth);
            int max4 = Math.max(((ConstraintWidget)this.mLayoutWidget).g(), this.mMinHeight);
            int l = 0;
            int n4;
            int n3 = n4 = 0;
            while (l < size4) {
                final ConstraintWidget constraintWidget3 = this.mVariableDimensionsWidgets.get(l);
                final View view = (View)constraintWidget3.X;
                int max5;
                int n5;
                int n6;
                int combineMeasuredStates;
                if (view == null) {
                    max5 = max3;
                    n5 = max4;
                    n6 = n3;
                    combineMeasuredStates = n4;
                }
                else {
                    final a a = (a)view.getLayoutParams();
                    max5 = max3;
                    n5 = max4;
                    n6 = n3;
                    combineMeasuredStates = n4;
                    if (!a.Y) {
                        if (a.X) {
                            max5 = max3;
                            n5 = max4;
                            n6 = n3;
                            combineMeasuredStates = n4;
                        }
                        else if (view.getVisibility() == 8) {
                            max5 = max3;
                            n5 = max4;
                            n6 = n3;
                            combineMeasuredStates = n4;
                        }
                        else if (b6 && ((h3.c)constraintWidget3.j()).d() && ((h3.c)constraintWidget3.i()).d()) {
                            max5 = max3;
                            n5 = max4;
                            n6 = n3;
                            combineMeasuredStates = n4;
                        }
                        else {
                            final int width = a.width;
                            int n7;
                            if (width == -2 && a.U) {
                                n7 = ViewGroup.getChildMeasureSpec(resolveSizeAndState, n2, width);
                            }
                            else {
                                n7 = View$MeasureSpec.makeMeasureSpec(constraintWidget3.k(), 1073741824);
                            }
                            final int height = a.height;
                            int n8;
                            if (height == -2 && a.V) {
                                n8 = ViewGroup.getChildMeasureSpec(min, n, height);
                            }
                            else {
                                n8 = View$MeasureSpec.makeMeasureSpec(constraintWidget3.g(), 1073741824);
                            }
                            view.measure(n7, n8);
                            final int measuredWidth = view.getMeasuredWidth();
                            final int measuredHeight = view.getMeasuredHeight();
                            max5 = max3;
                            if (measuredWidth != constraintWidget3.k()) {
                                constraintWidget3.w(measuredWidth);
                                if (b6) {
                                    constraintWidget3.j().g(measuredWidth);
                                }
                                max5 = max3;
                                if (b7) {
                                    final int n9 = constraintWidget3.I + constraintWidget3.E;
                                    if (n9 > (max5 = max3)) {
                                        max5 = Math.max(max3, constraintWidget3.f(ConstraintAnchor.Type.RIGHT).b() + n9);
                                    }
                                }
                                n3 = 1;
                            }
                            int max6 = max4;
                            if (measuredHeight != constraintWidget3.g()) {
                                constraintWidget3.s(measuredHeight);
                                if (b6) {
                                    constraintWidget3.i().g(measuredHeight);
                                }
                                max6 = max4;
                                if (b8) {
                                    final int n10 = constraintWidget3.J + constraintWidget3.F;
                                    if (n10 > (max6 = max4)) {
                                        max6 = Math.max(max4, constraintWidget3.f(ConstraintAnchor.Type.BOTTOM).b() + n10);
                                    }
                                }
                                n3 = 1;
                            }
                            int n11 = n3;
                            if (a.W) {
                                final int baseline = view.getBaseline();
                                n11 = n3;
                                if (baseline != -1) {
                                    n11 = n3;
                                    if (baseline != constraintWidget3.Q) {
                                        constraintWidget3.Q = baseline;
                                        n11 = 1;
                                    }
                                }
                            }
                            combineMeasuredStates = View.combineMeasuredStates(n4, view.getMeasuredState());
                            n6 = n11;
                            n5 = max6;
                        }
                    }
                }
                ++l;
                max3 = max5;
                max4 = n5;
                n3 = n6;
                n4 = combineMeasuredStates;
            }
            if (n3 != 0) {
                ((ConstraintWidget)this.mLayoutWidget).w(k);
                ((ConstraintWidget)this.mLayoutWidget).s(g);
                if (b6) {
                    this.mLayoutWidget.D();
                }
                this.solveLinearSystem("2nd pass");
                boolean b9;
                if (((ConstraintWidget)this.mLayoutWidget).k() < max3) {
                    ((ConstraintWidget)this.mLayoutWidget).w(max3);
                    b9 = true;
                }
                else {
                    b9 = false;
                }
                boolean b10;
                if (((ConstraintWidget)this.mLayoutWidget).g() < max4) {
                    ((ConstraintWidget)this.mLayoutWidget).s(max4);
                    b10 = true;
                }
                else {
                    b10 = b9;
                }
                if (b10) {
                    this.solveLinearSystem("3rd pass");
                }
            }
            for (int n12 = 0; n12 < size4; ++n12) {
                final ConstraintWidget constraintWidget4 = this.mVariableDimensionsWidgets.get(n12);
                final View view2 = (View)constraintWidget4.X;
                if (view2 != null) {
                    if ((view2.getMeasuredWidth() != constraintWidget4.k() || view2.getMeasuredHeight() != constraintWidget4.g()) && constraintWidget4.Y != 8) {
                        view2.measure(View$MeasureSpec.makeMeasureSpec(constraintWidget4.k(), 1073741824), View$MeasureSpec.makeMeasureSpec(constraintWidget4.g(), 1073741824));
                    }
                }
            }
            n13 = n4;
        }
        else {
            n13 = 0;
        }
        final int m = ((ConstraintWidget)this.mLayoutWidget).k();
        final int g3 = ((ConstraintWidget)this.mLayoutWidget).g();
        resolveSizeAndState = View.resolveSizeAndState(m + n2, resolveSizeAndState, n13);
        final int resolveSizeAndState2 = View.resolveSizeAndState(g3 + n, min, n13 << 16);
        min = Math.min(this.mMaxWidth, resolveSizeAndState & 0xFFFFFF);
        final int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2 & 0xFFFFFF);
        final e mLayoutWidget10 = this.mLayoutWidget;
        resolveSizeAndState = min;
        if (mLayoutWidget10.y0) {
            resolveSizeAndState = (min | 0x1000000);
        }
        min = min2;
        if (mLayoutWidget10.z0) {
            min = (min2 | 0x1000000);
        }
        ((View)this).setMeasuredDimension(resolveSizeAndState, min);
        this.mLastMeasureWidth = resolveSizeAndState;
        this.mLastMeasureHeight = min;
    }
    
    public void onViewAdded(final View view) {
        super.onViewAdded(view);
        final ConstraintWidget viewWidget = this.getViewWidget(view);
        if (view instanceof Guideline && !(viewWidget instanceof g)) {
            final a a = (a)view.getLayoutParams();
            final g k0 = new g();
            a.k0 = k0;
            a.X = true;
            k0.z(a.R);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            final androidx.constraintlayout.widget.a a2 = (androidx.constraintlayout.widget.a)view;
            a2.e();
            ((a)view.getLayoutParams()).Y = true;
            if (!this.mConstraintHelpers.contains(a2)) {
                this.mConstraintHelpers.add(a2);
            }
        }
        this.mChildrenByIds.put(view.getId(), (Object)view);
        this.mDirtyHierarchy = true;
    }
    
    public void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        final ConstraintWidget viewWidget = this.getViewWidget(view);
        ((h3.d)this.mLayoutWidget).i0.remove(viewWidget);
        viewWidget.D = null;
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = true;
    }
    
    public void removeView(final View view) {
        super.removeView(view);
    }
    
    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
    
    public void setConstraintSet(final b mConstraintSet) {
        this.mConstraintSet = mConstraintSet;
    }
    
    public void setDesignInformation(int n, final Object o, final Object o2) {
        if (n == 0 && o instanceof String && o2 instanceof Integer) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<String, Integer>();
            }
            final String s = (String)o;
            n = s.indexOf("/");
            String substring = s;
            if (n != -1) {
                substring = s.substring(n + 1);
            }
            n = (int)o2;
            this.mDesignIds.put(substring, n);
        }
    }
    
    public void setId(final int id) {
        this.mChildrenByIds.remove(((View)this).getId());
        super.setId(id);
        this.mChildrenByIds.put(((View)this).getId(), (Object)this);
    }
    
    public void setMaxHeight(final int mMaxHeight) {
        if (mMaxHeight == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = mMaxHeight;
        this.requestLayout();
    }
    
    public void setMaxWidth(final int mMaxWidth) {
        if (mMaxWidth == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = mMaxWidth;
        this.requestLayout();
    }
    
    public void setMinHeight(final int mMinHeight) {
        if (mMinHeight == this.mMinHeight) {
            return;
        }
        this.mMinHeight = mMinHeight;
        this.requestLayout();
    }
    
    public void setMinWidth(final int mMinWidth) {
        if (mMinWidth == this.mMinWidth) {
            return;
        }
        this.mMinWidth = mMinWidth;
        this.requestLayout();
    }
    
    public void setOptimizationLevel(final int w0) {
        this.mLayoutWidget.w0 = w0;
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public void solveLinearSystem(final String s) {
        this.mLayoutWidget.z();
    }
    
    public static class a extends ViewGroup$MarginLayoutParams
    {
        public float A;
        public String B;
        public int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public boolean U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;
        public int a;
        public int a0;
        public int b;
        public int b0;
        public float c;
        public int c0;
        public int d;
        public int d0;
        public int e;
        public int e0;
        public int f;
        public int f0;
        public int g;
        public float g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public float j0;
        public int k;
        public ConstraintWidget k0;
        public int l;
        public int m;
        public int n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;
        
        public a(final int n) {
            super(n, -2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = 0.5f;
            this.k0 = new ConstraintWidget();
        }
        
        public a(Context obtainStyledAttributes, final AttributeSet set) {
            super(obtainStyledAttributes, set);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = 0.5f;
            this.k0 = new ConstraintWidget();
            obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, ah0.b.u);
            final int indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount();
            int n = 0;
        Label_2025_Outer:
            while (true) {
                Label_2031: {
                    if (n >= indexCount) {
                        break Label_2031;
                    }
                    final int index = ((TypedArray)obtainStyledAttributes).getIndex(n);
                    final int value = ConstraintLayout.a.a.a.get(index);
                Block_44_Outer:
                    while (true) {
                        Label_2003: {
                            final String substring2;
                            final String substring3;
                            Block_31: {
                                switch (value) {
                                    default: {
                                        switch (value) {
                                            default: {
                                                break Label_2025;
                                            }
                                            case 50: {
                                                this.Q = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.Q);
                                                break Label_2025;
                                            }
                                            case 49: {
                                                this.P = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.P);
                                                break Label_2025;
                                            }
                                            case 48: {
                                                this.G = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                                break Label_2025;
                                            }
                                            case 47: {
                                                this.F = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                                break Label_2025;
                                            }
                                            case 46: {
                                                this.E = ((TypedArray)obtainStyledAttributes).getFloat(index, this.E);
                                                break Label_2025;
                                            }
                                            case 45: {
                                                this.D = ((TypedArray)obtainStyledAttributes).getFloat(index, this.D);
                                                break Label_2025;
                                            }
                                            case 44: {
                                                final String string = ((TypedArray)obtainStyledAttributes).getString(index);
                                                this.B = string;
                                                this.C = -1;
                                                if (string == null) {
                                                    break Label_2025;
                                                }
                                                final int length = string.length();
                                                int index2 = this.B.indexOf(44);
                                                if (index2 > 0 && index2 < length - 1) {
                                                    final String substring = this.B.substring(0, index2);
                                                    if (substring.equalsIgnoreCase("W")) {
                                                        this.C = 0;
                                                    }
                                                    else if (substring.equalsIgnoreCase("H")) {
                                                        this.C = 1;
                                                    }
                                                    ++index2;
                                                }
                                                else {
                                                    index2 = 0;
                                                }
                                                final int index3 = this.B.indexOf(58);
                                                if (index3 < 0 || index3 >= length - 1) {
                                                    break Label_2003;
                                                }
                                                substring2 = this.B.substring(index2, index3);
                                                substring3 = this.B.substring(index3 + 1);
                                                if (substring2.length() > 0 && substring3.length() > 0) {
                                                    break Block_31;
                                                }
                                                break Label_2025;
                                            }
                                        }
                                        break;
                                    }
                                    case 38: {
                                        this.O = Math.max(0.0f, ((TypedArray)obtainStyledAttributes).getFloat(index, this.O));
                                        break Label_2025;
                                    }
                                    case 37: {
                                        try {
                                            this.M = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.M);
                                            break Label_2025;
                                        }
                                        catch (final Exception ex) {
                                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.M) == -2) {
                                                this.M = -2;
                                                break Label_2025;
                                            }
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 36: {
                                        try {
                                            this.K = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.K);
                                            break Label_2025;
                                        }
                                        catch (final Exception ex2) {
                                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.K) == -2) {
                                                this.K = -2;
                                                break Label_2025;
                                            }
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 35: {
                                        this.N = Math.max(0.0f, ((TypedArray)obtainStyledAttributes).getFloat(index, this.N));
                                        break Label_2025;
                                    }
                                    case 34: {
                                        try {
                                            this.L = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.L);
                                            break Label_2025;
                                        }
                                        catch (final Exception ex3) {
                                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.L) == -2) {
                                                this.L = -2;
                                                break Label_2025;
                                            }
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 33: {
                                        try {
                                            this.J = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.J);
                                            break Label_2025;
                                        }
                                        catch (final Exception ex4) {
                                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.J) == -2) {
                                                this.J = -2;
                                                break Label_2025;
                                            }
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 32: {
                                        final int int1 = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                        this.I = int1;
                                        if (int1 == 1) {
                                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 31: {
                                        final int int2 = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                        this.H = int2;
                                        if (int2 == 1) {
                                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 30: {
                                        this.A = ((TypedArray)obtainStyledAttributes).getFloat(index, this.A);
                                        break Label_2025;
                                    }
                                    case 29: {
                                        this.z = ((TypedArray)obtainStyledAttributes).getFloat(index, this.z);
                                        break Label_2025;
                                    }
                                    case 28: {
                                        this.T = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.T);
                                        break Label_2025;
                                    }
                                    case 27: {
                                        this.S = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.S);
                                        break Label_2025;
                                    }
                                    case 26: {
                                        this.y = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.y);
                                        break Label_2025;
                                    }
                                    case 25: {
                                        this.x = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.x);
                                        break Label_2025;
                                    }
                                    case 24: {
                                        this.w = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.w);
                                        break Label_2025;
                                    }
                                    case 23: {
                                        this.v = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.v);
                                        break Label_2025;
                                    }
                                    case 22: {
                                        this.u = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.u);
                                        break Label_2025;
                                    }
                                    case 21: {
                                        this.t = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.t);
                                        break Label_2025;
                                    }
                                    case 20: {
                                        final int resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.s);
                                        this.s = resourceId;
                                        if (resourceId == -1) {
                                            this.s = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 19: {
                                        final int resourceId2 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.r);
                                        this.r = resourceId2;
                                        if (resourceId2 == -1) {
                                            this.r = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 18: {
                                        final int resourceId3 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.q);
                                        this.q = resourceId3;
                                        if (resourceId3 == -1) {
                                            this.q = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 17: {
                                        final int resourceId4 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.p);
                                        this.p = resourceId4;
                                        if (resourceId4 == -1) {
                                            this.p = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 16: {
                                        final int resourceId5 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.l);
                                        this.l = resourceId5;
                                        if (resourceId5 == -1) {
                                            this.l = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 15: {
                                        final int resourceId6 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.k);
                                        this.k = resourceId6;
                                        if (resourceId6 == -1) {
                                            this.k = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 14: {
                                        final int resourceId7 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.j);
                                        this.j = resourceId7;
                                        if (resourceId7 == -1) {
                                            this.j = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 13: {
                                        final int resourceId8 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.i);
                                        this.i = resourceId8;
                                        if (resourceId8 == -1) {
                                            this.i = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 12: {
                                        final int resourceId9 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.h);
                                        this.h = resourceId9;
                                        if (resourceId9 == -1) {
                                            this.h = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 11: {
                                        final int resourceId10 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.g);
                                        this.g = resourceId10;
                                        if (resourceId10 == -1) {
                                            this.g = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 10: {
                                        final int resourceId11 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.f);
                                        this.f = resourceId11;
                                        if (resourceId11 == -1) {
                                            this.f = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 9: {
                                        final int resourceId12 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.e);
                                        this.e = resourceId12;
                                        if (resourceId12 == -1) {
                                            this.e = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 8: {
                                        final int resourceId13 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.d);
                                        this.d = resourceId13;
                                        if (resourceId13 == -1) {
                                            this.d = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 7: {
                                        this.c = ((TypedArray)obtainStyledAttributes).getFloat(index, this.c);
                                        break Label_2025;
                                    }
                                    case 6: {
                                        this.b = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.b);
                                        break Label_2025;
                                    }
                                    case 5: {
                                        this.a = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.a);
                                        break Label_2025;
                                    }
                                    case 4: {
                                        final float o = ((TypedArray)obtainStyledAttributes).getFloat(index, this.o) % 360.0f;
                                        this.o = o;
                                        if (o < 0.0f) {
                                            this.o = (360.0f - o) % 360.0f;
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 3: {
                                        this.n = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.n);
                                        break Label_2025;
                                    }
                                    case 2: {
                                        final int resourceId14 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.m);
                                        this.m = resourceId14;
                                        if (resourceId14 == -1) {
                                            this.m = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                            break Label_2025;
                                        }
                                        break Label_2025;
                                    }
                                    case 1: {
                                        this.R = ((TypedArray)obtainStyledAttributes).getInt(index, this.R);
                                        break Label_2025;
                                    }
                                }
                            }
                            try {
                                final float float1 = Float.parseFloat(substring2);
                                final float float2 = Float.parseFloat(substring3);
                                if (float1 > 0.0f && float2 > 0.0f) {
                                    if (this.C == 1) {
                                        Math.abs(float2 / float1);
                                    }
                                    else {
                                        Math.abs(float1 / float2);
                                    }
                                }
                                ++n;
                                continue Label_2025_Outer;
                                while (true) {
                                    final String substring4;
                                    Float.parseFloat(substring4);
                                    continue Block_44_Outer;
                                    final int index2;
                                    substring4 = this.B.substring(index2);
                                    iftrue(Label_2025:)(substring4.length() <= 0);
                                    continue;
                                }
                                ((TypedArray)obtainStyledAttributes).recycle();
                                this.a();
                            }
                            catch (final NumberFormatException ex5) {
                                continue;
                            }
                        }
                        break;
                    }
                }
            }
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = 0.5f;
            this.k0 = new ConstraintWidget();
        }
        
        public final void a() {
            this.X = false;
            this.U = true;
            this.V = true;
            final int width = super.width;
            if (width == -2 && this.S) {
                this.U = false;
                this.H = 1;
            }
            final int height = super.height;
            if (height == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            if (width == 0 || width == -1) {
                this.U = false;
                if (width == 0 && this.H == 1) {
                    super.width = -2;
                    this.S = true;
                }
            }
            if (height == 0 || height == -1) {
                this.V = false;
                if (height == 0 && this.I == 1) {
                    super.height = -2;
                    this.T = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.X = true;
                this.U = true;
                this.V = true;
                if (!(this.k0 instanceof g)) {
                    this.k0 = new g();
                }
                ((g)this.k0).z(this.R);
            }
        }
        
        public final void resolveLayoutDirection(int b0) {
            final int leftMargin = super.leftMargin;
            final int rightMargin = super.rightMargin;
            super.resolveLayoutDirection(b0);
            this.c0 = -1;
            this.d0 = -1;
            this.a0 = -1;
            this.b0 = -1;
            this.e0 = this.t;
            this.f0 = this.v;
            this.g0 = this.z;
            this.h0 = this.a;
            this.i0 = this.b;
            this.j0 = this.c;
            b0 = this.getLayoutDirection();
            final int n = 0;
            if (1 == b0) {
                b0 = 1;
            }
            else {
                b0 = 0;
            }
            if (b0 != 0) {
                b0 = this.p;
                Label_0151: {
                    if (b0 != -1) {
                        this.c0 = b0;
                    }
                    else {
                        final int q = this.q;
                        b0 = n;
                        if (q == -1) {
                            break Label_0151;
                        }
                        this.d0 = q;
                    }
                    b0 = 1;
                }
                final int r = this.r;
                if (r != -1) {
                    this.b0 = r;
                    b0 = 1;
                }
                final int s = this.s;
                if (s != -1) {
                    this.a0 = s;
                    b0 = 1;
                }
                final int x = this.x;
                if (x != -1) {
                    this.f0 = x;
                }
                final int y = this.y;
                if (y != -1) {
                    this.e0 = y;
                }
                if (b0 != 0) {
                    this.g0 = 1.0f - this.z;
                }
                if (this.X && this.R == 1) {
                    final float c = this.c;
                    if (c != -1.0f) {
                        this.j0 = 1.0f - c;
                        this.h0 = -1;
                        this.i0 = -1;
                    }
                    else {
                        b0 = this.a;
                        if (b0 != -1) {
                            this.i0 = b0;
                            this.h0 = -1;
                            this.j0 = -1.0f;
                        }
                        else {
                            b0 = this.b;
                            if (b0 != -1) {
                                this.h0 = b0;
                                this.i0 = -1;
                                this.j0 = -1.0f;
                            }
                        }
                    }
                }
            }
            else {
                b0 = this.p;
                if (b0 != -1) {
                    this.b0 = b0;
                }
                b0 = this.q;
                if (b0 != -1) {
                    this.a0 = b0;
                }
                b0 = this.r;
                if (b0 != -1) {
                    this.c0 = b0;
                }
                b0 = this.s;
                if (b0 != -1) {
                    this.d0 = b0;
                }
                b0 = this.x;
                if (b0 != -1) {
                    this.e0 = b0;
                }
                b0 = this.y;
                if (b0 != -1) {
                    this.f0 = b0;
                }
            }
            if (this.r == -1 && this.s == -1 && this.q == -1 && this.p == -1) {
                b0 = this.f;
                if (b0 != -1) {
                    this.c0 = b0;
                    if (super.rightMargin <= 0 && rightMargin > 0) {
                        super.rightMargin = rightMargin;
                    }
                }
                else {
                    b0 = this.g;
                    if (b0 != -1) {
                        this.d0 = b0;
                        if (super.rightMargin <= 0 && rightMargin > 0) {
                            super.rightMargin = rightMargin;
                        }
                    }
                }
                b0 = this.d;
                if (b0 != -1) {
                    this.a0 = b0;
                    if (super.leftMargin <= 0 && leftMargin > 0) {
                        super.leftMargin = leftMargin;
                    }
                }
                else {
                    b0 = this.e;
                    if (b0 != -1) {
                        this.b0 = b0;
                        if (super.leftMargin <= 0 && leftMargin > 0) {
                            super.leftMargin = leftMargin;
                        }
                    }
                }
            }
        }
        
        public static final class a
        {
            public static final SparseIntArray a;
            
            static {
                final SparseIntArray a2 = new SparseIntArray();
                (a = a2).append(34, 8);
                a2.append(35, 9);
                a2.append(37, 10);
                a2.append(38, 11);
                a2.append(43, 12);
                a2.append(42, 13);
                a2.append(16, 14);
                a2.append(15, 15);
                a2.append(13, 16);
                a2.append(17, 2);
                a2.append(19, 3);
                a2.append(18, 4);
                a2.append(51, 49);
                a2.append(52, 50);
                a2.append(23, 5);
                a2.append(24, 6);
                a2.append(25, 7);
                a2.append(0, 1);
                a2.append(39, 17);
                a2.append(40, 18);
                a2.append(22, 19);
                a2.append(21, 20);
                a2.append(55, 21);
                a2.append(58, 22);
                a2.append(56, 23);
                a2.append(53, 24);
                a2.append(57, 25);
                a2.append(54, 26);
                a2.append(30, 29);
                a2.append(44, 30);
                a2.append(20, 44);
                a2.append(32, 45);
                a2.append(46, 46);
                a2.append(31, 47);
                a2.append(45, 48);
                a2.append(11, 27);
                a2.append(10, 28);
                a2.append(47, 31);
                a2.append(26, 32);
                a2.append(49, 33);
                a2.append(48, 34);
                a2.append(50, 35);
                a2.append(28, 36);
                a2.append(27, 37);
                a2.append(29, 38);
                a2.append(33, 39);
                a2.append(41, 40);
                a2.append(36, 41);
                a2.append(14, 42);
                a2.append(12, 43);
            }
        }
    }
}
