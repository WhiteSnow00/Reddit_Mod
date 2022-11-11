// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.accessibility.AccessibilityRecord;
import android.widget.LinearLayout$LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;
import android.view.Gravity;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.view.View;
import a4.p0;
import gn.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class LinearLayoutCompat extends ViewGroup
{
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;
    
    public LinearLayoutCompat(final Context context) {
        this(context, null);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        final int[] d0 = gn.a.d0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, d0, n, 0);
        final z0 z0 = new z0(context, obtainStyledAttributes);
        p0.k((View)this, context, d0, set, obtainStyledAttributes, n);
        n = z0.h(1, -1);
        if (n >= 0) {
            this.setOrientation(n);
        }
        n = z0.h(0, -1);
        if (n >= 0) {
            this.setGravity(n);
        }
        final boolean a = z0.a(2, true);
        if (!a) {
            this.setBaselineAligned(a);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = z0.h(3, -1);
        this.mUseLargestChild = z0.a(7, false);
        this.setDividerDrawable(z0.e(5));
        this.mShowDividers = z0.h(8, 0);
        this.mDividerPadding = z0.d(6, 0);
        z0.n();
    }
    
    private void forceUniformHeight(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View virtualChild = this.getVirtualChildAt(i);
            if (virtualChild.getVisibility() != 8) {
                final a a = (a)virtualChild.getLayoutParams();
                if (a.height == -1) {
                    final int width = a.width;
                    a.width = virtualChild.getMeasuredWidth();
                    this.measureChildWithMargins(virtualChild, n2, 0, measureSpec, 0);
                    a.width = width;
                }
            }
        }
    }
    
    private void forceUniformWidth(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View virtualChild = this.getVirtualChildAt(i);
            if (virtualChild.getVisibility() != 8) {
                final a a = (a)virtualChild.getLayoutParams();
                if (a.width == -1) {
                    final int height = a.height;
                    a.height = virtualChild.getMeasuredHeight();
                    this.measureChildWithMargins(virtualChild, measureSpec, 0, n2, 0);
                    a.height = height;
                }
            }
        }
    }
    
    private void setChildFrame(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(n, n2, n3 + n, n4 + n2);
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    public void drawDividersHorizontal(final Canvas canvas) {
        final int virtualChildCount = this.getVirtualChildCount();
        final boolean a = i1.a((View)this);
        for (int i = 0; i < virtualChildCount; ++i) {
            final View virtualChild = this.getVirtualChildAt(i);
            if (virtualChild != null && virtualChild.getVisibility() != 8 && this.hasDividerBeforeChildAt(i)) {
                final a a2 = (a)virtualChild.getLayoutParams();
                int n;
                if (a) {
                    n = virtualChild.getRight() + a2.rightMargin;
                }
                else {
                    n = virtualChild.getLeft() - a2.leftMargin - this.mDividerWidth;
                }
                this.drawVerticalDivider(canvas, n);
            }
        }
        if (this.hasDividerBeforeChildAt(virtualChildCount)) {
            final View virtualChild2 = this.getVirtualChildAt(virtualChildCount - 1);
            int paddingLeft = 0;
            Label_0223: {
                int n2;
                int n3;
                if (virtualChild2 == null) {
                    if (a) {
                        paddingLeft = ((View)this).getPaddingLeft();
                        break Label_0223;
                    }
                    n2 = ((View)this).getWidth() - ((View)this).getPaddingRight();
                    n3 = this.mDividerWidth;
                }
                else {
                    final a a3 = (a)virtualChild2.getLayoutParams();
                    if (!a) {
                        paddingLeft = virtualChild2.getRight() + a3.rightMargin;
                        break Label_0223;
                    }
                    n2 = virtualChild2.getLeft() - a3.leftMargin;
                    n3 = this.mDividerWidth;
                }
                paddingLeft = n2 - n3;
            }
            this.drawVerticalDivider(canvas, paddingLeft);
        }
    }
    
    public void drawDividersVertical(final Canvas canvas) {
        final int virtualChildCount = this.getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; ++i) {
            final View virtualChild = this.getVirtualChildAt(i);
            if (virtualChild != null && virtualChild.getVisibility() != 8 && this.hasDividerBeforeChildAt(i)) {
                this.drawHorizontalDivider(canvas, virtualChild.getTop() - ((a)virtualChild.getLayoutParams()).topMargin - this.mDividerHeight);
            }
        }
        if (this.hasDividerBeforeChildAt(virtualChildCount)) {
            final View virtualChild2 = this.getVirtualChildAt(virtualChildCount - 1);
            int n;
            if (virtualChild2 == null) {
                n = ((View)this).getHeight() - ((View)this).getPaddingBottom() - this.mDividerHeight;
            }
            else {
                n = virtualChild2.getBottom() + ((a)virtualChild2.getLayoutParams()).bottomMargin;
            }
            this.drawHorizontalDivider(canvas, n);
        }
    }
    
    public void drawHorizontalDivider(final Canvas canvas, final int n) {
        this.mDivider.setBounds(((View)this).getPaddingLeft() + this.mDividerPadding, n, ((View)this).getWidth() - ((View)this).getPaddingRight() - this.mDividerPadding, this.mDividerHeight + n);
        this.mDivider.draw(canvas);
    }
    
    public void drawVerticalDivider(final Canvas canvas, final int n) {
        this.mDivider.setBounds(n, ((View)this).getPaddingTop() + this.mDividerPadding, this.mDividerWidth + n, ((View)this).getHeight() - ((View)this).getPaddingBottom() - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }
    
    public a generateDefaultLayoutParams() {
        final int mOrientation = this.mOrientation;
        if (mOrientation == 0) {
            return new a(-2, -2);
        }
        if (mOrientation == 1) {
            return new a(-1, -2);
        }
        return null;
    }
    
    public a generateLayoutParams(final AttributeSet set) {
        return new a(((View)this).getContext(), set);
    }
    
    public a generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new a(viewGroup$LayoutParams);
    }
    
    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        final int childCount = this.getChildCount();
        final int mBaselineAlignedChildIndex = this.mBaselineAlignedChildIndex;
        if (childCount <= mBaselineAlignedChildIndex) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        final View child = this.getChildAt(mBaselineAlignedChildIndex);
        final int baseline = child.getBaseline();
        if (baseline != -1) {
            int mBaselineChildTop;
            final int n = mBaselineChildTop = this.mBaselineChildTop;
            if (this.mOrientation == 1) {
                final int n2 = this.mGravity & 0x70;
                mBaselineChildTop = n;
                if (n2 != 48) {
                    if (n2 != 16) {
                        if (n2 != 80) {
                            mBaselineChildTop = n;
                        }
                        else {
                            mBaselineChildTop = ((View)this).getBottom() - ((View)this).getTop() - ((View)this).getPaddingBottom() - this.mTotalLength;
                        }
                    }
                    else {
                        mBaselineChildTop = n + (((View)this).getBottom() - ((View)this).getTop() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom() - this.mTotalLength) / 2;
                    }
                }
            }
            return mBaselineChildTop + ((a)child.getLayoutParams()).topMargin + baseline;
        }
        if (this.mBaselineAlignedChildIndex == 0) {
            return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    }
    
    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }
    
    public int getChildrenSkipCount(final View view, final int n) {
        return 0;
    }
    
    public Drawable getDividerDrawable() {
        return this.mDivider;
    }
    
    public int getDividerPadding() {
        return this.mDividerPadding;
    }
    
    public int getDividerWidth() {
        return this.mDividerWidth;
    }
    
    public int getGravity() {
        return this.mGravity;
    }
    
    public int getLocationOffset(final View view) {
        return 0;
    }
    
    public int getNextLocationOffset(final View view) {
        return 0;
    }
    
    public int getOrientation() {
        return this.mOrientation;
    }
    
    public int getShowDividers() {
        return this.mShowDividers;
    }
    
    View getVirtualChildAt(final int n) {
        return this.getChildAt(n);
    }
    
    int getVirtualChildCount() {
        return this.getChildCount();
    }
    
    public float getWeightSum() {
        return this.mWeightSum;
    }
    
    public boolean hasDividerBeforeChildAt(int n) {
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        if (n == 0) {
            if ((this.mShowDividers & 0x1) != 0x0) {
                b3 = true;
            }
            return b3;
        }
        if (n == this.getChildCount()) {
            boolean b4 = b;
            if ((this.mShowDividers & 0x4) != 0x0) {
                b4 = true;
            }
            return b4;
        }
        boolean b5 = b2;
        if ((this.mShowDividers & 0x2) != 0x0) {
            --n;
            while (true) {
                b5 = b2;
                if (n < 0) {
                    break;
                }
                if (this.getChildAt(n).getVisibility() != 8) {
                    b5 = true;
                    break;
                }
                --n;
            }
        }
        return b5;
    }
    
    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }
    
    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }
    
    public void layoutHorizontal(int n, int n2, int n3, int n4) {
        final boolean a = i1.a((View)this);
        final int paddingTop = ((View)this).getPaddingTop();
        final int n5 = n4 - n2;
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int paddingBottom2 = ((View)this).getPaddingBottom();
        final int virtualChildCount = this.getVirtualChildCount();
        n2 = this.mGravity;
        n4 = (n2 & 0x70);
        final boolean mBaselineAligned = this.mBaselineAligned;
        final int[] mMaxAscent = this.mMaxAscent;
        final int[] mMaxDescent = this.mMaxDescent;
        final WeakHashMap a2 = p0.a;
        n2 = Gravity.getAbsoluteGravity(0x800007 & n2, p0.e.d((View)this));
        if (n2 != 1) {
            if (n2 != 5) {
                n2 = ((View)this).getPaddingLeft();
            }
            else {
                n2 = ((View)this).getPaddingLeft() + n3 - n - this.mTotalLength;
            }
        }
        else {
            n2 = ((View)this).getPaddingLeft() + (n3 - n - this.mTotalLength) / 2;
        }
        int n6;
        int n7;
        if (a) {
            n6 = virtualChildCount - 1;
            n7 = -1;
        }
        else {
            n6 = 0;
            n7 = 1;
        }
        int i = 0;
        n3 = n4;
        n4 = paddingTop;
        while (i < virtualChildCount) {
            final int n8 = n7 * i + n6;
            final View virtualChild = this.getVirtualChildAt(n8);
            if (virtualChild == null) {
                n2 += this.measureNullChild(n8);
            }
            else if (virtualChild.getVisibility() != 8) {
                final int measuredWidth = virtualChild.getMeasuredWidth();
                final int measuredHeight = virtualChild.getMeasuredHeight();
                final a a3 = (a)virtualChild.getLayoutParams();
                int baseline;
                if (mBaselineAligned && a3.height != -1) {
                    baseline = virtualChild.getBaseline();
                }
                else {
                    baseline = -1;
                }
                if ((n = a3.gravity) < 0) {
                    n = n3;
                }
                n &= 0x70;
                if (n != 16) {
                    if (n != 48) {
                        if (n != 80) {
                            n = n4;
                        }
                        else {
                            final int n9 = n = n5 - paddingBottom - measuredHeight - a3.bottomMargin;
                            if (baseline != -1) {
                                n = virtualChild.getMeasuredHeight();
                                n = n9 - (mMaxDescent[2] - (n - baseline));
                            }
                        }
                    }
                    else {
                        final int n10 = n = a3.topMargin + n4;
                        if (baseline != -1) {
                            n = mMaxAscent[1] - baseline + n10;
                        }
                    }
                }
                else {
                    n = (n5 - paddingTop - paddingBottom2 - measuredHeight) / 2 + n4 + a3.topMargin - a3.bottomMargin;
                }
                int n11 = n2;
                if (this.hasDividerBeforeChildAt(n8)) {
                    n11 = n2 + this.mDividerWidth;
                }
                n2 = a3.leftMargin + n11;
                this.setChildFrame(virtualChild, this.getLocationOffset(virtualChild) + n2, n, measuredWidth, measuredHeight);
                n = a3.rightMargin;
                n2 += this.getNextLocationOffset(virtualChild) + (measuredWidth + n);
                i += this.getChildrenSkipCount(virtualChild, n8);
            }
            ++i;
        }
    }
    
    public void layoutVertical(int paddingTop, int i, int bottomMargin, int n) {
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int n2 = bottomMargin - paddingTop;
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingRight2 = ((View)this).getPaddingRight();
        final int virtualChildCount = this.getVirtualChildCount();
        final int mGravity = this.mGravity;
        paddingTop = (mGravity & 0x70);
        if (paddingTop != 16) {
            if (paddingTop != 80) {
                paddingTop = ((View)this).getPaddingTop();
            }
            else {
                paddingTop = ((View)this).getPaddingTop() + n - i - this.mTotalLength;
            }
        }
        else {
            paddingTop = ((View)this).getPaddingTop() + (n - i - this.mTotalLength) / 2;
        }
        View virtualChild;
        int measuredWidth;
        int measuredHeight;
        a a;
        WeakHashMap a2;
        for (i = 0; i < virtualChildCount; ++i) {
            virtualChild = this.getVirtualChildAt(i);
            if (virtualChild == null) {
                bottomMargin = this.measureNullChild(i) + paddingTop;
            }
            else {
                bottomMargin = paddingTop;
                if (virtualChild.getVisibility() != 8) {
                    measuredWidth = virtualChild.getMeasuredWidth();
                    measuredHeight = virtualChild.getMeasuredHeight();
                    a = (a)virtualChild.getLayoutParams();
                    n = a.gravity;
                    if ((bottomMargin = n) < 0) {
                        bottomMargin = (mGravity & 0x800007);
                    }
                    a2 = p0.a;
                    bottomMargin = (Gravity.getAbsoluteGravity(bottomMargin, p0.e.d((View)this)) & 0x7);
                    Label_0278: {
                        if (bottomMargin != 1) {
                            if (bottomMargin != 5) {
                                bottomMargin = a.leftMargin + paddingLeft;
                                break Label_0278;
                            }
                            bottomMargin = n2 - paddingRight - measuredWidth;
                            n = a.rightMargin;
                        }
                        else {
                            bottomMargin = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + a.leftMargin;
                            n = a.rightMargin;
                        }
                        bottomMargin -= n;
                    }
                    n = paddingTop;
                    if (this.hasDividerBeforeChildAt(i)) {
                        n = paddingTop + this.mDividerHeight;
                    }
                    paddingTop = n + a.topMargin;
                    this.setChildFrame(virtualChild, bottomMargin, this.getLocationOffset(virtualChild) + paddingTop, measuredWidth, measuredHeight);
                    bottomMargin = a.bottomMargin;
                    paddingTop += this.getNextLocationOffset(virtualChild) + (measuredHeight + bottomMargin);
                    i += this.getChildrenSkipCount(virtualChild, i);
                    continue;
                }
            }
            paddingTop = bottomMargin;
        }
    }
    
    public void measureChildBeforeLayout(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.measureChildWithMargins(view, n2, n3, n4, n5);
    }
    
    public void measureHorizontal(final int n, final int n2) {
        this.mTotalLength = 0;
        final int virtualChildCount = this.getVirtualChildCount();
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        final int[] mMaxAscent = this.mMaxAscent;
        final int[] mMaxDescent = this.mMaxDescent;
        mMaxAscent[2] = (mMaxAscent[3] = -1);
        mMaxAscent[0] = (mMaxAscent[1] = -1);
        mMaxDescent[2] = (mMaxDescent[3] = -1);
        mMaxDescent[0] = (mMaxDescent[1] = -1);
        final boolean mBaselineAligned = this.mBaselineAligned;
        final boolean mUseLargestChild = this.mUseLargestChild;
        int n3 = 1073741824;
        final boolean b = mode == 1073741824;
        int n4;
        int i = n4 = 0;
        int max;
        int n5 = max = n4;
        int n7;
        int n6 = n7 = max;
        int n9;
        int n8 = n9 = n7;
        int n10 = 1;
        float n11 = 0.0f;
        while (i < virtualChildCount) {
            final View virtualChild = this.getVirtualChildAt(i);
            int n19 = 0;
            int n20 = 0;
            Label_0894: {
                if (virtualChild == null) {
                    this.mTotalLength += this.measureNullChild(i);
                }
                else {
                    if (virtualChild.getVisibility() != 8) {
                        if (this.hasDividerBeforeChildAt(i)) {
                            this.mTotalLength += this.mDividerWidth;
                        }
                        final a a = (a)virtualChild.getLayoutParams();
                        final float weight = a.weight;
                        n11 += weight;
                        Label_0619: {
                            int max2;
                            if (mode == n3 && a.width == 0 && weight > 0.0f) {
                                if (b) {
                                    this.mTotalLength += a.leftMargin + a.rightMargin;
                                }
                                else {
                                    final int mTotalLength = this.mTotalLength;
                                    this.mTotalLength = Math.max(mTotalLength, a.leftMargin + mTotalLength + a.rightMargin);
                                }
                                if (!mBaselineAligned) {
                                    n7 = 1;
                                    break Label_0619;
                                }
                                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                                virtualChild.measure(measureSpec, measureSpec);
                                max2 = n4;
                            }
                            else {
                                int width;
                                if (a.width == 0 && weight > 0.0f) {
                                    a.width = -2;
                                    width = 0;
                                }
                                else {
                                    width = Integer.MIN_VALUE;
                                }
                                int mTotalLength2;
                                if (n11 == 0.0f) {
                                    mTotalLength2 = this.mTotalLength;
                                }
                                else {
                                    mTotalLength2 = 0;
                                }
                                this.measureChildBeforeLayout(virtualChild, i, n, mTotalLength2, n2, 0);
                                if (width != Integer.MIN_VALUE) {
                                    a.width = width;
                                }
                                final int measuredWidth = virtualChild.getMeasuredWidth();
                                if (b) {
                                    this.mTotalLength += this.getNextLocationOffset(virtualChild) + (a.leftMargin + measuredWidth + a.rightMargin);
                                }
                                else {
                                    final int mTotalLength3 = this.mTotalLength;
                                    this.mTotalLength = Math.max(mTotalLength3, this.getNextLocationOffset(virtualChild) + (mTotalLength3 + measuredWidth + a.leftMargin + a.rightMargin));
                                }
                                max2 = n4;
                                if (mUseLargestChild) {
                                    max2 = Math.max(measuredWidth, n4);
                                }
                            }
                            n4 = max2;
                        }
                        final int n12 = i;
                        final int n13 = 1073741824;
                        int n14;
                        if (mode2 != 1073741824 && a.height == -1) {
                            n14 = (n9 = 1);
                        }
                        else {
                            n14 = 0;
                        }
                        int n15 = a.topMargin + a.bottomMargin;
                        final int n16 = virtualChild.getMeasuredHeight() + n15;
                        final int combineMeasuredStates = View.combineMeasuredStates(n8, virtualChild.getMeasuredState());
                        if (mBaselineAligned) {
                            final int baseline = virtualChild.getBaseline();
                            if (baseline != -1) {
                                int n17;
                                if ((n17 = a.gravity) < 0) {
                                    n17 = this.mGravity;
                                }
                                final int n18 = ((n17 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                                mMaxAscent[n18] = Math.max(mMaxAscent[n18], baseline);
                                mMaxDescent[n18] = Math.max(mMaxDescent[n18], n16 - baseline);
                            }
                        }
                        n5 = Math.max(n5, n16);
                        if (n10 != 0 && a.height == -1) {
                            n10 = 1;
                        }
                        else {
                            n10 = 0;
                        }
                        int max3;
                        if (a.weight > 0.0f) {
                            if (n14 == 0) {
                                n15 = n16;
                            }
                            max3 = Math.max(n6, n15);
                        }
                        else {
                            if (n14 == 0) {
                                n15 = n16;
                            }
                            max = Math.max(max, n15);
                            max3 = n6;
                        }
                        n19 = this.getChildrenSkipCount(virtualChild, n12) + n12;
                        n8 = combineMeasuredStates;
                        n6 = max3;
                        n20 = n13;
                        break Label_0894;
                    }
                    i += this.getChildrenSkipCount(virtualChild, i);
                }
                final int n21 = i;
                n20 = n3;
                n19 = n21;
            }
            final int n22 = n20;
            i = n19 + 1;
            n3 = n22;
        }
        if (this.mTotalLength > 0 && this.hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        final int n23 = mMaxAscent[1];
        if (n23 != -1 || mMaxAscent[0] != -1 || mMaxAscent[2] != -1 || mMaxAscent[3] != -1) {
            n5 = Math.max(n5, Math.max(mMaxDescent[3], Math.max(mMaxDescent[0], Math.max(mMaxDescent[1], mMaxDescent[2]))) + Math.max(mMaxAscent[3], Math.max(mMaxAscent[0], Math.max(n23, mMaxAscent[2]))));
        }
        int n24 = n5;
        Label_1259: {
            if (mUseLargestChild) {
                if (mode != Integer.MIN_VALUE) {
                    n24 = n5;
                    if (mode != 0) {
                        break Label_1259;
                    }
                }
                this.mTotalLength = 0;
                int n25 = 0;
                while (true) {
                    n24 = n5;
                    if (n25 >= virtualChildCount) {
                        break;
                    }
                    final View virtualChild2 = this.getVirtualChildAt(n25);
                    if (virtualChild2 == null) {
                        this.mTotalLength += this.measureNullChild(n25);
                    }
                    else if (virtualChild2.getVisibility() == 8) {
                        n25 += this.getChildrenSkipCount(virtualChild2, n25);
                    }
                    else {
                        final a a2 = (a)virtualChild2.getLayoutParams();
                        if (b) {
                            this.mTotalLength += this.getNextLocationOffset(virtualChild2) + (a2.leftMargin + n4 + a2.rightMargin);
                        }
                        else {
                            final int mTotalLength4 = this.mTotalLength;
                            this.mTotalLength = Math.max(mTotalLength4, this.getNextLocationOffset(virtualChild2) + (mTotalLength4 + n4 + a2.leftMargin + a2.rightMargin));
                        }
                    }
                    ++n25;
                }
            }
        }
        final int mTotalLength5 = ((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = mTotalLength5;
        final int resolveSizeAndState = View.resolveSizeAndState(Math.max(mTotalLength5, ((View)this).getSuggestedMinimumWidth()), n, 0);
        final int n26 = (0xFFFFFF & resolveSizeAndState) - this.mTotalLength;
        int n27;
        int max5;
        int n28;
        if (n7 == 0 && (n26 == 0 || n11 <= 0.0f)) {
            final int max4 = Math.max(max, n6);
            if (mUseLargestChild && mode != 1073741824) {
                for (int j = 0; j < virtualChildCount; ++j) {
                    final View virtualChild3 = this.getVirtualChildAt(j);
                    if (virtualChild3 != null) {
                        if (virtualChild3.getVisibility() != 8) {
                            if (((a)virtualChild3.getLayoutParams()).weight > 0.0f) {
                                virtualChild3.measure(View$MeasureSpec.makeMeasureSpec(n4, 1073741824), View$MeasureSpec.makeMeasureSpec(virtualChild3.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                }
            }
            n27 = virtualChildCount;
            max5 = n24;
            n28 = max4;
        }
        else {
            final float mWeightSum = this.mWeightSum;
            if (mWeightSum > 0.0f) {
                n11 = mWeightSum;
            }
            mMaxAscent[2] = (mMaxAscent[3] = -1);
            mMaxAscent[0] = (mMaxAscent[1] = -1);
            mMaxDescent[2] = (mMaxDescent[3] = -1);
            mMaxDescent[0] = (mMaxDescent[1] = -1);
            this.mTotalLength = 0;
            int n29 = -1;
            final int n30 = n8;
            int k = 0;
            int n31 = n10;
            final int n32 = virtualChildCount;
            int combineMeasuredStates2 = n30;
            int n33 = max;
            int n34 = n26;
            while (k < n32) {
                final View virtualChild4 = this.getVirtualChildAt(k);
                if (virtualChild4 != null) {
                    if (virtualChild4.getVisibility() != 8) {
                        final a a3 = (a)virtualChild4.getLayoutParams();
                        final float weight2 = a3.weight;
                        if (weight2 > 0.0f) {
                            final int n35 = (int)(n34 * weight2 / n11);
                            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n2, ((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + a3.topMargin + a3.bottomMargin, a3.height);
                            if (a3.width == 0 && mode == 1073741824) {
                                int n36;
                                if (n35 > 0) {
                                    n36 = n35;
                                }
                                else {
                                    n36 = 0;
                                }
                                virtualChild4.measure(View$MeasureSpec.makeMeasureSpec(n36, 1073741824), childMeasureSpec);
                            }
                            else {
                                int n37;
                                if ((n37 = virtualChild4.getMeasuredWidth() + n35) < 0) {
                                    n37 = 0;
                                }
                                virtualChild4.measure(View$MeasureSpec.makeMeasureSpec(n37, 1073741824), childMeasureSpec);
                            }
                            combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates2, virtualChild4.getMeasuredState() & 0xFF000000);
                            n11 -= weight2;
                            n34 -= n35;
                        }
                        if (b) {
                            this.mTotalLength += this.getNextLocationOffset(virtualChild4) + (virtualChild4.getMeasuredWidth() + a3.leftMargin + a3.rightMargin);
                        }
                        else {
                            final int mTotalLength6 = this.mTotalLength;
                            this.mTotalLength = Math.max(mTotalLength6, this.getNextLocationOffset(virtualChild4) + (virtualChild4.getMeasuredWidth() + mTotalLength6 + a3.leftMargin + a3.rightMargin));
                        }
                        final boolean b2 = mode2 != 1073741824 && a3.height == -1;
                        final int n38 = a3.topMargin + a3.bottomMargin;
                        final int n39 = virtualChild4.getMeasuredHeight() + n38;
                        final int max6 = Math.max(n29, n39);
                        int n40;
                        if (b2) {
                            n40 = n38;
                        }
                        else {
                            n40 = n39;
                        }
                        final int max7 = Math.max(n33, n40);
                        if (n31 != 0 && a3.height == -1) {
                            n31 = 1;
                        }
                        else {
                            n31 = 0;
                        }
                        if (mBaselineAligned) {
                            final int baseline2 = virtualChild4.getBaseline();
                            if (baseline2 != -1) {
                                int n41;
                                if ((n41 = a3.gravity) < 0) {
                                    n41 = this.mGravity;
                                }
                                final int n42 = ((n41 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                                mMaxAscent[n42] = Math.max(mMaxAscent[n42], baseline2);
                                mMaxDescent[n42] = Math.max(mMaxDescent[n42], n39 - baseline2);
                            }
                        }
                        n33 = max7;
                        n29 = max6;
                    }
                }
                ++k;
            }
            this.mTotalLength += ((View)this).getPaddingRight() + ((View)this).getPaddingLeft();
            final int n43 = mMaxAscent[1];
            if (n43 == -1 && mMaxAscent[0] == -1 && mMaxAscent[2] == -1 && mMaxAscent[3] == -1) {
                max5 = n29;
            }
            else {
                max5 = Math.max(n29, Math.max(mMaxDescent[3], Math.max(mMaxDescent[0], Math.max(mMaxDescent[1], mMaxDescent[2]))) + Math.max(mMaxAscent[3], Math.max(mMaxAscent[0], Math.max(n43, mMaxAscent[2]))));
            }
            n8 = combineMeasuredStates2;
            n10 = n31;
            n27 = n32;
            n28 = n33;
        }
        if (n10 != 0 || mode2 == 1073741824) {
            n28 = max5;
        }
        ((View)this).setMeasuredDimension(resolveSizeAndState | (n8 & 0xFF000000), View.resolveSizeAndState(Math.max(((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + n28, ((View)this).getSuggestedMinimumHeight()), n2, n8 << 16));
        if (n9 != 0) {
            this.forceUniformHeight(n27, n);
        }
    }
    
    public int measureNullChild(final int n) {
        return 0;
    }
    
    public void measureVertical(final int n, final int n2) {
        this.mTotalLength = 0;
        final int virtualChildCount = this.getVirtualChildCount();
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int mBaselineAlignedChildIndex = this.mBaselineAlignedChildIndex;
        final boolean mUseLargestChild = this.mUseLargestChild;
        int max;
        int combineMeasuredStates = max = 0;
        int max3;
        int max2 = max3 = max;
        int i;
        int max4 = i = max3;
        int n4;
        int n3 = n4 = i;
        float n5 = 0.0f;
        int n6 = 1;
        while (i < virtualChildCount) {
            final View virtualChild = this.getVirtualChildAt(i);
            if (virtualChild == null) {
                this.mTotalLength += this.measureNullChild(i);
            }
            else if (virtualChild.getVisibility() == 8) {
                i += this.getChildrenSkipCount(virtualChild, i);
            }
            else {
                if (this.hasDividerBeforeChildAt(i)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                final a a = (a)virtualChild.getLayoutParams();
                final float weight = a.weight;
                n5 += weight;
                if (mode2 == 1073741824 && a.height == 0 && weight > 0.0f) {
                    final int mTotalLength = this.mTotalLength;
                    this.mTotalLength = Math.max(mTotalLength, a.topMargin + mTotalLength + a.bottomMargin);
                    n3 = 1;
                }
                else {
                    int height;
                    if (a.height == 0 && weight > 0.0f) {
                        a.height = -2;
                        height = 0;
                    }
                    else {
                        height = Integer.MIN_VALUE;
                    }
                    int mTotalLength2;
                    if (n5 == 0.0f) {
                        mTotalLength2 = this.mTotalLength;
                    }
                    else {
                        mTotalLength2 = 0;
                    }
                    this.measureChildBeforeLayout(virtualChild, i, n, 0, n2, mTotalLength2);
                    if (height != Integer.MIN_VALUE) {
                        a.height = height;
                    }
                    final int measuredHeight = virtualChild.getMeasuredHeight();
                    final int mTotalLength3 = this.mTotalLength;
                    this.mTotalLength = Math.max(mTotalLength3, this.getNextLocationOffset(virtualChild) + (mTotalLength3 + measuredHeight + a.topMargin + a.bottomMargin));
                    if (mUseLargestChild) {
                        max2 = Math.max(measuredHeight, max2);
                    }
                }
                final int n7 = i;
                if (mBaselineAlignedChildIndex >= 0 && mBaselineAlignedChildIndex == n7 + 1) {
                    this.mBaselineChildTop = this.mTotalLength;
                }
                if (n7 < mBaselineAlignedChildIndex && a.weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                int n8;
                if (mode != 1073741824 && a.width == -1) {
                    n8 = (n4 = 1);
                }
                else {
                    n8 = 0;
                }
                int n9 = a.leftMargin + a.rightMargin;
                final int n10 = virtualChild.getMeasuredWidth() + n9;
                max = Math.max(max, n10);
                final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, virtualChild.getMeasuredState());
                int n11;
                if (n6 != 0 && a.width == -1) {
                    n11 = 1;
                }
                else {
                    n11 = 0;
                }
                int max5;
                if (a.weight > 0.0f) {
                    if (n8 == 0) {
                        n9 = n10;
                    }
                    max3 = Math.max(max3, n9);
                    max5 = max4;
                }
                else {
                    if (n8 == 0) {
                        n9 = n10;
                    }
                    max5 = Math.max(max4, n9);
                }
                final int childrenSkipCount = this.getChildrenSkipCount(virtualChild, n7);
                max4 = max5;
                final int n12 = combineMeasuredStates2;
                i = childrenSkipCount + n7;
                n6 = n11;
                combineMeasuredStates = n12;
            }
            ++i;
        }
        if (this.mTotalLength > 0 && this.hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerHeight;
        }
        if (mUseLargestChild && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.mTotalLength = 0;
            for (int j = 0; j < virtualChildCount; ++j) {
                final View virtualChild2 = this.getVirtualChildAt(j);
                if (virtualChild2 == null) {
                    this.mTotalLength += this.measureNullChild(j);
                }
                else if (virtualChild2.getVisibility() == 8) {
                    j += this.getChildrenSkipCount(virtualChild2, j);
                }
                else {
                    final a a2 = (a)virtualChild2.getLayoutParams();
                    final int mTotalLength4 = this.mTotalLength;
                    this.mTotalLength = Math.max(mTotalLength4, this.getNextLocationOffset(virtualChild2) + (mTotalLength4 + max2 + a2.topMargin + a2.bottomMargin));
                }
            }
        }
        final int mTotalLength5 = ((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + this.mTotalLength;
        this.mTotalLength = mTotalLength5;
        final int resolveSizeAndState = View.resolveSizeAndState(Math.max(mTotalLength5, ((View)this).getSuggestedMinimumHeight()), n2, 0);
        final int n13 = (0xFFFFFF & resolveSizeAndState) - this.mTotalLength;
        int n14;
        int n15;
        int n16;
        if (n3 == 0 && (n13 == 0 || n5 <= 0.0f)) {
            final int max6 = Math.max(max4, max3);
            if (mUseLargestChild && mode2 != 1073741824) {
                for (int k = 0; k < virtualChildCount; ++k) {
                    final View virtualChild3 = this.getVirtualChildAt(k);
                    if (virtualChild3 != null) {
                        if (virtualChild3.getVisibility() != 8) {
                            if (((a)virtualChild3.getLayoutParams()).weight > 0.0f) {
                                virtualChild3.measure(View$MeasureSpec.makeMeasureSpec(virtualChild3.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(max2, 1073741824));
                            }
                        }
                    }
                }
            }
            n14 = combineMeasuredStates;
            n15 = max6;
            n16 = max;
        }
        else {
            final float mWeightSum = this.mWeightSum;
            if (mWeightSum > 0.0f) {
                n5 = mWeightSum;
            }
            this.mTotalLength = 0;
            int n17 = n13;
            int l = 0;
            n16 = max;
            while (l < virtualChildCount) {
                final View virtualChild4 = this.getVirtualChildAt(l);
                if (virtualChild4.getVisibility() != 8) {
                    final a a3 = (a)virtualChild4.getLayoutParams();
                    final float weight2 = a3.weight;
                    if (weight2 > 0.0f) {
                        final int n18 = (int)(n17 * weight2 / n5);
                        final int paddingLeft = ((View)this).getPaddingLeft();
                        final int paddingRight = ((View)this).getPaddingRight();
                        final int leftMargin = a3.leftMargin;
                        final int rightMargin = a3.rightMargin;
                        final int width = a3.width;
                        final int n19 = n17 - n18;
                        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, paddingRight + paddingLeft + leftMargin + rightMargin, width);
                        if (a3.height == 0 && mode2 == 1073741824) {
                            int n20;
                            if (n18 > 0) {
                                n20 = n18;
                            }
                            else {
                                n20 = 0;
                            }
                            virtualChild4.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n20, 1073741824));
                        }
                        else {
                            int n21;
                            if ((n21 = virtualChild4.getMeasuredHeight() + n18) < 0) {
                                n21 = 0;
                            }
                            virtualChild4.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n21, 1073741824));
                        }
                        combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, virtualChild4.getMeasuredState() & 0xFFFFFF00);
                        n5 -= weight2;
                        n17 = n19;
                    }
                    final int n22 = a3.leftMargin + a3.rightMargin;
                    final int n23 = virtualChild4.getMeasuredWidth() + n22;
                    final int max7 = Math.max(n16, n23);
                    int n24;
                    if (mode != 1073741824 && a3.width == -1) {
                        n24 = n22;
                    }
                    else {
                        n24 = n23;
                    }
                    max4 = Math.max(max4, n24);
                    if (n6 != 0 && a3.width == -1) {
                        n6 = 1;
                    }
                    else {
                        n6 = 0;
                    }
                    final int mTotalLength6 = this.mTotalLength;
                    this.mTotalLength = Math.max(mTotalLength6, this.getNextLocationOffset(virtualChild4) + (virtualChild4.getMeasuredHeight() + mTotalLength6 + a3.topMargin + a3.bottomMargin));
                    n16 = max7;
                }
                ++l;
            }
            this.mTotalLength += ((View)this).getPaddingBottom() + ((View)this).getPaddingTop();
            n14 = combineMeasuredStates;
            n15 = max4;
        }
        if (n6 != 0 || mode == 1073741824) {
            n15 = n16;
        }
        ((View)this).setMeasuredDimension(View.resolveSizeAndState(Math.max(((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + n15, ((View)this).getSuggestedMinimumWidth()), n, n14), resolveSizeAndState);
        if (n4 != 0) {
            this.forceUniformWidth(virtualChildCount, n2);
        }
    }
    
    public void onDraw(final Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            this.drawDividersVertical(canvas);
        }
        else {
            this.drawDividersHorizontal(canvas);
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.mOrientation == 1) {
            this.layoutVertical(n, n2, n3, n4);
        }
        else {
            this.layoutHorizontal(n, n2, n3, n4);
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.mOrientation == 1) {
            this.measureVertical(n, n2);
        }
        else {
            this.measureHorizontal(n, n2);
        }
    }
    
    public void setBaselineAligned(final boolean mBaselineAligned) {
        this.mBaselineAligned = mBaselineAligned;
    }
    
    public void setBaselineAlignedChildIndex(final int mBaselineAlignedChildIndex) {
        if (mBaselineAlignedChildIndex >= 0 && mBaselineAlignedChildIndex < this.getChildCount()) {
            this.mBaselineAlignedChildIndex = mBaselineAlignedChildIndex;
            return;
        }
        final StringBuilder k = a.k("base aligned child index out of range (0, ");
        k.append(this.getChildCount());
        k.append(")");
        throw new IllegalArgumentException(k.toString());
    }
    
    public void setDividerDrawable(final Drawable mDivider) {
        if (mDivider == this.mDivider) {
            return;
        }
        this.mDivider = mDivider;
        boolean willNotDraw = false;
        if (mDivider != null) {
            this.mDividerWidth = mDivider.getIntrinsicWidth();
            this.mDividerHeight = mDivider.getIntrinsicHeight();
        }
        else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        if (mDivider == null) {
            willNotDraw = true;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).requestLayout();
    }
    
    public void setDividerPadding(final int mDividerPadding) {
        this.mDividerPadding = mDividerPadding;
    }
    
    public void setGravity(int mGravity) {
        if (this.mGravity != mGravity) {
            int n = mGravity;
            if ((0x800007 & mGravity) == 0x0) {
                n = (mGravity | 0x800003);
            }
            mGravity = n;
            if ((n & 0x70) == 0x0) {
                mGravity = (n | 0x30);
            }
            this.mGravity = mGravity;
            ((View)this).requestLayout();
        }
    }
    
    public void setHorizontalGravity(int mGravity) {
        final int n = mGravity & 0x800007;
        mGravity = this.mGravity;
        if ((0x800007 & mGravity) != n) {
            this.mGravity = (n | (0xFF7FFFF8 & mGravity));
            ((View)this).requestLayout();
        }
    }
    
    public void setMeasureWithLargestChildEnabled(final boolean mUseLargestChild) {
        this.mUseLargestChild = mUseLargestChild;
    }
    
    public void setOrientation(final int mOrientation) {
        if (this.mOrientation != mOrientation) {
            this.mOrientation = mOrientation;
            ((View)this).requestLayout();
        }
    }
    
    public void setShowDividers(final int mShowDividers) {
        if (mShowDividers != this.mShowDividers) {
            ((View)this).requestLayout();
        }
        this.mShowDividers = mShowDividers;
    }
    
    public void setVerticalGravity(int mGravity) {
        final int n = mGravity & 0x70;
        mGravity = this.mGravity;
        if ((mGravity & 0x70) != n) {
            this.mGravity = (n | (mGravity & 0xFFFFFF8F));
            ((View)this).requestLayout();
        }
    }
    
    public void setWeightSum(final float n) {
        this.mWeightSum = Math.max(0.0f, n);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public static class a extends LinearLayout$LayoutParams
    {
        public a(final int n, final int n2) {
            super(n, n2);
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
}
