// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class 05G
{
    public static float DEFAULT_BIAS;
    public ArrayList<05D> mAnchors;
    public 05D mBaseline;
    public int mBaselineDistance;
    public 05H mBelongingGroup;
    public 05D mBottom;
    public boolean mBottomHasCentered;
    public 05D mCenter;
    public 05D mCenterX;
    public 05D mCenterY;
    public float mCircleConstraintAngle;
    public Object mCompanionWidget;
    public int mContainerItemSkip;
    public String mDebugName;
    public float mDimensionRatio;
    public int mDimensionRatioSide;
    public int mDistToBottom;
    public int mDistToLeft;
    public int mDistToRight;
    public int mDistToTop;
    public int mDrawHeight;
    public int mDrawWidth;
    public int mDrawX;
    public int mDrawY;
    public boolean mGroupsToSolver;
    public int mHeight;
    public float mHorizontalBiasPercent;
    public boolean mHorizontalChainFixedPosition;
    public int mHorizontalChainStyle;
    public 05G mHorizontalNextWidget;
    public int mHorizontalResolution;
    public boolean mHorizontalWrapVisited;
    public boolean mIsHeightWrapContent;
    public boolean mIsWidthWrapContent;
    public 05D mLeft;
    public boolean mLeftHasCentered;
    public 05D[] mListAnchors;
    public a[] mListDimensionBehaviors;
    public 05G[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    public int[] mMaxDimension;
    public int mMinHeight;
    public int mMinWidth;
    public 05G[] mNextChainWidget;
    public int mOffsetX;
    public int mOffsetY;
    public boolean mOptimizerMeasurable;
    public boolean mOptimizerMeasured;
    public 05G mParent;
    public int mRelX;
    public int mRelY;
    public 13p mResolutionHeight;
    public 13p mResolutionWidth;
    public float mResolvedDimensionRatio;
    public int mResolvedDimensionRatioSide;
    public int[] mResolvedMatchConstraintDefault;
    public 05D mRight;
    public boolean mRightHasCentered;
    public 05D mTop;
    public boolean mTopHasCentered;
    public String mType;
    public float mVerticalBiasPercent;
    public boolean mVerticalChainFixedPosition;
    public int mVerticalChainStyle;
    public 05G mVerticalNextWidget;
    public int mVerticalResolution;
    public boolean mVerticalWrapVisited;
    public int mVisibility;
    public float[] mWeight;
    public int mWidth;
    public int mWrapHeight;
    public int mWrapWidth;
    public int mX;
    public int mY;
    
    static {
        Covode.recordClassIndex(605);
        05G.DEFAULT_BIAS = 0.5f;
    }
    
    public 05G() {
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.mLeft = new 05D(this, 05D.b.LEFT);
        this.mTop = new 05D(this, 05D.b.TOP);
        this.mRight = new 05D(this, 05D.b.RIGHT);
        this.mBottom = new 05D(this, 05D.b.BOTTOM);
        this.mBaseline = new 05D(this, 05D.b.BASELINE);
        this.mCenterX = new 05D(this, 05D.b.CENTER_X);
        this.mCenterY = new 05D(this, 05D.b.CENTER_Y);
        final 05D mCenter = new 05D(this, 05D.b.CENTER);
        this.mCenter = mCenter;
        this.mListAnchors = new 05D[] { this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, mCenter };
        this.mAnchors = new ArrayList<05D>();
        this.mListDimensionBehaviors = new a[] { a.FIXED, a.FIXED };
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        final float default_BIAS = 05G.DEFAULT_BIAS;
        this.mHorizontalBiasPercent = default_BIAS;
        this.mVerticalBiasPercent = default_BIAS;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[] { -1.0f, -1.0f };
        this.mListNextMatchConstraintsWidget = new 05G[] { null, null };
        this.mNextChainWidget = new 05G[] { null, null };
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.addAnchors();
    }
    
    public 05G(final int n, final int n2) {
        this(0, 0, n, n2);
    }
    
    public 05G(final int mx, final int my, final int mWidth, final int mHeight) {
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.mLeft = new 05D(this, 05D.b.LEFT);
        this.mTop = new 05D(this, 05D.b.TOP);
        this.mRight = new 05D(this, 05D.b.RIGHT);
        this.mBottom = new 05D(this, 05D.b.BOTTOM);
        this.mBaseline = new 05D(this, 05D.b.BASELINE);
        this.mCenterX = new 05D(this, 05D.b.CENTER_X);
        this.mCenterY = new 05D(this, 05D.b.CENTER_Y);
        final 05D mCenter = new 05D(this, 05D.b.CENTER);
        this.mCenter = mCenter;
        this.mListAnchors = new 05D[] { this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, mCenter };
        this.mAnchors = new ArrayList<05D>();
        this.mListDimensionBehaviors = new a[] { a.FIXED, a.FIXED };
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        final float default_BIAS = 05G.DEFAULT_BIAS;
        this.mHorizontalBiasPercent = default_BIAS;
        this.mVerticalBiasPercent = default_BIAS;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[] { -1.0f, -1.0f };
        this.mListNextMatchConstraintsWidget = new 05G[] { null, null };
        this.mNextChainWidget = new 05G[] { null, null };
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.mX = mx;
        this.mY = my;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
        this.addAnchors();
        this.forceUpdateDrawPosition();
    }
    
    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }
    
    private void applyConstraints(final 05Q 05Q, final boolean b, final 05V 05V, final 05V 05V2, final a a, final boolean b2, final 05D 05D, final 05D 05D2, int n, int n2, int n3, int n4, final float n5, final boolean b3, final boolean b4, int liziz, int n6, int n7, final float n8, final boolean b5) {
        final int n9 = n2;
        final 05V liz = 05Q.LIZ(05D);
        final 05V liz2 = 05Q.LIZ(05D2);
        final 05V liz3 = 05Q.LIZ(05D.LIZLLL);
        final 05V liz4 = 05Q.LIZ(05D2.LIZLLL);
        if (05Q.LIZLLL && 05D.LIZ.LJIIIIZZ == 1 && 05D2.LIZ.LJIIIIZZ == 1) {
            if (05Q.LJII != null) {
                final 05R ljii = 05Q.LJII;
                ++ljii.LJIJ;
            }
            05D.LIZ.LIZ(05Q);
            05D2.LIZ.LIZ(05Q);
            if (!b4 && b) {
                05Q.LIZ(05V2, liz2, 0, 6);
            }
            return;
        }
        if (05Q.LJII != null) {
            final 05R ljii2 = 05Q.LJII;
            ++ljii2.LJJIII;
        }
        final int lizlll = 05D.LIZLLL() ? 1 : 0;
        final boolean lizlll2 = 05D2.LIZLLL();
        final boolean lizlll3 = this.mCenter.LIZLLL();
        if (lizlll2) {
            n2 = lizlll + 1;
        }
        else {
            n2 = lizlll;
        }
        int n10 = n2;
        if (lizlll3) {
            n10 = n2 + 1;
        }
        if (b3) {
            liziz = 3;
        }
        n2 = 05E.LIZIZ[a.ordinal()];
        int n11;
        if (n2 != 1 && n2 != 2 && n2 != 3 && n2 == 4 && liziz != 4) {
            n11 = 1;
        }
        else {
            n11 = 0;
        }
        n2 = n9;
        if (this.mVisibility == 8) {
            n2 = 0;
            n11 = 0;
        }
        if (b5) {
            if (lizlll == 0) {
                if (!lizlll2 && !lizlll3) {
                    05Q.LIZ(liz, n);
                }
            }
            else if (!lizlll2) {
                05Q.LIZJ(liz, liz3, 05D.LIZIZ(), 6);
            }
        }
        int n12 = 0;
        Label_0361: {
            if (n11 == 0) {
                if (b2) {
                    05Q.LIZJ(liz2, liz, 0, 3);
                    if (n3 > 0) {
                        05Q.LIZ(liz2, liz, n3, 6);
                    }
                    if (n4 < Integer.MAX_VALUE) {
                        05Q.LIZIZ(liz2, liz, n4, 6);
                    }
                }
                else {
                    05Q.LIZJ(liz2, liz, n2, 6);
                }
                n2 = 0;
                n12 = n6;
            }
            else {
                if ((n = n6) == -2) {
                    n = n2;
                }
                if ((n4 = n7) == -2) {
                    n4 = n2;
                }
                n6 = n2;
                if (n > 0) {
                    05Q.LIZ(liz2, liz, n, 6);
                    n6 = Math.max(n2, n);
                }
                int min = n6;
                if (n4 > 0) {
                    05Q.LIZIZ(liz2, liz, n4, 6);
                    min = Math.min(n6, n4);
                }
                if (liziz == 1) {
                    if (b) {
                        05Q.LIZJ(liz2, liz, min, 6);
                        n6 = 1;
                    }
                    else if (b4) {
                        05Q.LIZJ(liz2, liz, min, 4);
                        n6 = liziz;
                    }
                    else {
                        05Q.LIZJ(liz2, liz, min, 1);
                        n6 = liziz;
                    }
                }
                else if ((n6 = liziz) == 2) {
                    05V 05V3;
                    05V 05V4;
                    if (05D.LIZJ == X.05D.b.TOP || 05D.LIZJ == X.05D.b.BOTTOM) {
                        05V3 = 05Q.LIZ(this.mParent.getAnchor(X.05D.b.TOP));
                        05V4 = 05Q.LIZ(this.mParent.getAnchor(X.05D.b.BOTTOM));
                    }
                    else {
                        05V3 = 05Q.LIZ(this.mParent.getAnchor(X.05D.b.LEFT));
                        05V4 = 05Q.LIZ(this.mParent.getAnchor(X.05D.b.RIGHT));
                    }
                    final 13r liziz2 = 05Q.LIZIZ();
                    liziz = 2;
                    liziz2.LIZ(liz2, liz, 05V4, 05V3, n8);
                    05Q.LIZ(liziz2);
                    n2 = 0;
                    n7 = n4;
                    n12 = n;
                    break Label_0361;
                }
                liziz = n6;
                n7 = n4;
                n12 = n;
                if ((n2 = n11) != 0) {
                    liziz = n6;
                    n7 = n4;
                    n12 = n;
                    n2 = n11;
                    if (n10 != 2) {
                        liziz = n6;
                        n7 = n4;
                        n12 = n;
                        n2 = n11;
                        if (!b3) {
                            liziz = (n2 = Math.max(n, min));
                            if (n4 > 0) {
                                n2 = Math.min(n4, liziz);
                            }
                            05Q.LIZJ(liz2, liz, n2, 6);
                            n2 = 0;
                            liziz = n6;
                            n7 = n4;
                            n12 = n;
                        }
                    }
                }
            }
        }
        if (!b5 || b4) {
            if (n10 < 2 && b) {
                05Q.LIZ(liz, 05V, 0, 6);
                05Q.LIZ(05V2, liz2, 0, 6);
            }
            return;
        }
        Label_0927: {
            if (lizlll == 0 && !lizlll2) {
                if (!lizlll3) {
                    if (!b) {
                        return;
                    }
                    05Q.LIZ(05V2, liz2, 0, 5);
                }
            }
            else if (lizlll != 0) {
                if (!lizlll2) {
                    if (!b) {
                        return;
                    }
                    05Q.LIZ(05V2, liz2, 0, 5);
                }
                else if (lizlll != 0 && lizlll2) {
                    while (true) {
                        Label_1424: {
                            if (n2 == 0) {
                                n3 = 1;
                                break Label_1424;
                            }
                            if (b && n3 == 0) {
                                05Q.LIZ(liz2, liz, 0, 6);
                            }
                            while (true) {
                                Label_1287: {
                                    Label_1080: {
                                        if (liziz == 0) {
                                            if (n7 > 0 || n12 > 0) {
                                                n = 1;
                                                n3 = 4;
                                            }
                                            else {
                                                n = 0;
                                                n3 = 6;
                                            }
                                            05Q.LIZJ(liz, liz3, 05D.LIZIZ(), n3);
                                            05Q.LIZJ(liz2, liz4, -05D2.LIZIZ(), n3);
                                            if (n7 > 0 || n12 > 0) {
                                                n3 = 1;
                                            }
                                            else {
                                                n3 = 0;
                                            }
                                        }
                                        else {
                                            if (liziz == 1) {
                                                n = 1;
                                                n3 = 6;
                                                break Label_1080;
                                            }
                                            if (liziz != 3) {
                                                n3 = 0;
                                                break Label_1424;
                                            }
                                            if (!b3 && this.mResolvedDimensionRatioSide != -1 && n7 <= 0) {
                                                n = 6;
                                            }
                                            else {
                                                n = 4;
                                            }
                                            05Q.LIZJ(liz, liz3, 05D.LIZIZ(), n);
                                            05Q.LIZJ(liz2, liz4, -05D2.LIZIZ(), n);
                                            n3 = 1;
                                            n = 1;
                                        }
                                        n4 = 5;
                                        if (n3 == 0) {
                                            liziz = n;
                                            break Label_1287;
                                        }
                                        n3 = n4;
                                    }
                                    n6 = 05D.LIZIZ();
                                    liziz = 05D2.LIZIZ();
                                    n4 = 5;
                                    05Q.LIZ(liz, liz3, n6, n5, liz4, liz2, liziz, n3);
                                    final boolean b6 = 05D.LIZLLL.LIZIZ instanceof 1fg;
                                    final boolean b7 = 05D2.LIZLLL.LIZIZ instanceof 1fg;
                                    boolean b8;
                                    boolean b9;
                                    if (b6) {
                                        liziz = n;
                                        if (b7) {
                                            break Label_1287;
                                        }
                                        b8 = b;
                                        n3 = 5;
                                        n4 = 6;
                                        b9 = true;
                                    }
                                    else {
                                        liziz = n;
                                        if (!b7) {
                                            break Label_1287;
                                        }
                                        b9 = b;
                                        n3 = 6;
                                        b8 = true;
                                    }
                                    if (n != 0) {
                                        n4 = 6;
                                        n3 = 6;
                                    }
                                    if ((n2 == 0 && b8) || n != 0) {
                                        05Q.LIZ(liz, liz3, 05D.LIZIZ(), n3);
                                    }
                                    if ((n2 == 0 && b9) || n != 0) {
                                        05Q.LIZIZ(liz2, liz4, -05D2.LIZIZ(), n4);
                                    }
                                    if (b) {
                                        05Q.LIZ(liz, 05V, 0, 6);
                                        break Label_0927;
                                    }
                                    return;
                                }
                                n4 = 5;
                                boolean b9;
                                boolean b8 = b9 = b;
                                n3 = 5;
                                n = liziz;
                                continue;
                            }
                        }
                        n = 0;
                        continue;
                    }
                }
            }
            else if (lizlll2) {
                05Q.LIZJ(liz2, liz4, -05D2.LIZIZ(), 6);
                if (!b) {
                    return;
                }
                05Q.LIZ(liz, 05V, 0, 5);
            }
            if (!b) {
                return;
            }
        }
        05Q.LIZ(05V2, liz2, 0, 6);
    }
    
    private boolean isChainHead(int n) {
        n *= 2;
        if (this.mListAnchors[n].LIZLLL != null) {
            final 05D lizlll = this.mListAnchors[n].LIZLLL.LIZLLL;
            final 05D[] mListAnchors = this.mListAnchors;
            if (lizlll != mListAnchors[n]) {
                ++n;
                if (mListAnchors[n].LIZLLL != null && this.mListAnchors[n].LIZLLL.LIZLLL == this.mListAnchors[n]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void addToSolver(final 05Q 05Q) {
        final 05V liz = 05Q.LIZ(this.mLeft);
        final 05V liz2 = 05Q.LIZ(this.mRight);
        final 05V liz3 = 05Q.LIZ(this.mTop);
        final 05V liz4 = 05Q.LIZ(this.mBottom);
        final 05V liz5 = 05Q.LIZ(this.mBaseline);
        final 05G mParent = this.mParent;
        boolean b3;
        boolean b4;
        boolean b5;
        boolean b6;
        if (mParent != null) {
            final boolean b = mParent.mListDimensionBehaviors[0] == a.WRAP_CONTENT;
            final 05G mParent2 = this.mParent;
            final boolean b2 = mParent2 != null && mParent2.mListDimensionBehaviors[1] == a.WRAP_CONTENT;
            boolean inHorizontalChain;
            if (this.isChainHead(0)) {
                ((1fh)this.mParent).LIZ(this, 0);
                inHorizontalChain = true;
            }
            else {
                inHorizontalChain = this.isInHorizontalChain();
            }
            boolean inVerticalChain;
            if (this.isChainHead(1)) {
                ((1fh)this.mParent).LIZ(this, 1);
                inVerticalChain = true;
            }
            else {
                inVerticalChain = this.isInVerticalChain();
            }
            if (b && this.mVisibility != 8 && this.mLeft.LIZLLL == null && this.mRight.LIZLLL == null) {
                05Q.LIZ(05Q.LIZ(this.mParent.mRight), liz2, 0, 1);
            }
            b3 = b;
            b4 = b2;
            b5 = inHorizontalChain;
            b6 = inVerticalChain;
            if (b2) {
                b3 = b;
                b4 = b2;
                b5 = inHorizontalChain;
                b6 = inVerticalChain;
                if (this.mVisibility != 8) {
                    b3 = b;
                    b4 = b2;
                    b5 = inHorizontalChain;
                    b6 = inVerticalChain;
                    if (this.mTop.LIZLLL == null) {
                        b3 = b;
                        b4 = b2;
                        b5 = inHorizontalChain;
                        b6 = inVerticalChain;
                        if (this.mBottom.LIZLLL == null) {
                            b3 = b;
                            b4 = b2;
                            b5 = inHorizontalChain;
                            b6 = inVerticalChain;
                            if (this.mBaseline == null) {
                                05Q.LIZ(05Q.LIZ(this.mParent.mBottom), liz4, 0, 1);
                                b6 = inVerticalChain;
                                b5 = inHorizontalChain;
                                b4 = b2;
                                b3 = b;
                            }
                        }
                    }
                }
            }
        }
        else {
            b3 = false;
            b4 = false;
            b5 = false;
            b6 = false;
        }
        final int mWidth = this.mWidth;
        final int mMinWidth = this.mMinWidth;
        int n;
        if ((n = mWidth) < mMinWidth) {
            n = mMinWidth;
        }
        final int mHeight = this.mHeight;
        final int mMinHeight = this.mMinHeight;
        int n2;
        if ((n2 = mHeight) < mMinHeight) {
            n2 = mMinHeight;
        }
        final boolean b7 = this.mListDimensionBehaviors[0] != a.MATCH_CONSTRAINT;
        final boolean b8 = this.mListDimensionBehaviors[1] != a.MATCH_CONSTRAINT;
        this.mResolvedDimensionRatioSide = this.mDimensionRatioSide;
        final float mDimensionRatio = this.mDimensionRatio;
        this.mResolvedDimensionRatio = mDimensionRatio;
        final int mMatchConstraintDefaultWidth = this.mMatchConstraintDefaultWidth;
        final int mMatchConstraintDefaultHeight = this.mMatchConstraintDefaultHeight;
        int n3 = 0;
        int n4 = 0;
        int n6 = 0;
        int n8 = 0;
        Label_0615: {
            if (mDimensionRatio > 0.0f && this.mVisibility != 8) {
                n3 = mMatchConstraintDefaultWidth;
                if (this.mListDimensionBehaviors[0] == a.MATCH_CONSTRAINT && (n3 = mMatchConstraintDefaultWidth) == 0) {
                    n3 = 3;
                }
                n4 = mMatchConstraintDefaultHeight;
                if (this.mListDimensionBehaviors[1] == a.MATCH_CONSTRAINT && (n4 = mMatchConstraintDefaultHeight) == 0) {
                    n4 = 3;
                }
                int n5;
                int n7;
                if (this.mListDimensionBehaviors[0] == a.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == a.MATCH_CONSTRAINT && n3 == 3 && n4 == 3) {
                    this.setupDimensionRatio(b3, b4, b7, b8);
                    n5 = n2;
                    n6 = n;
                    n7 = n3;
                }
                else if (this.mListDimensionBehaviors[0] == a.MATCH_CONSTRAINT && n3 == 3) {
                    this.mResolvedDimensionRatioSide = 0;
                    n6 = (int)(this.mResolvedDimensionRatio * this.mHeight);
                    if (this.mListDimensionBehaviors[1] != a.MATCH_CONSTRAINT) {
                        n8 = 0;
                        n3 = 4;
                        break Label_0615;
                    }
                    n7 = 3;
                    n5 = n2;
                }
                else {
                    n7 = n3;
                    n6 = n;
                    n5 = n2;
                    if (this.mListDimensionBehaviors[1] == a.MATCH_CONSTRAINT) {
                        n7 = n3;
                        n6 = n;
                        n5 = n2;
                        if (n4 == 3) {
                            this.mResolvedDimensionRatioSide = 1;
                            if (this.mDimensionRatioSide == -1) {
                                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                            }
                            n2 = (int)(this.mResolvedDimensionRatio * this.mWidth);
                            n7 = n3;
                            n6 = n;
                            n5 = n2;
                            if (this.mListDimensionBehaviors[0] != a.MATCH_CONSTRAINT) {
                                final int n9 = 0;
                                n4 = 4;
                                n6 = n;
                                n8 = n9;
                                break Label_0615;
                            }
                        }
                    }
                }
                n8 = 1;
                n2 = n5;
                n3 = n7;
            }
            else {
                final int n10 = 0;
                n4 = mMatchConstraintDefaultHeight;
                n3 = mMatchConstraintDefaultWidth;
                n6 = n;
                n8 = n10;
            }
        }
        final int[] mResolvedMatchConstraintDefault = this.mResolvedMatchConstraintDefault;
        mResolvedMatchConstraintDefault[0] = n3;
        mResolvedMatchConstraintDefault[1] = n4;
        while (true) {
            Label_0844: {
                if (n8 == 0) {
                    break Label_0844;
                }
                final int mResolvedDimensionRatioSide = this.mResolvedDimensionRatioSide;
                if (mResolvedDimensionRatioSide != 0 && mResolvedDimensionRatioSide != -1) {
                    break Label_0844;
                }
                final boolean b9 = true;
                final boolean b10 = this.mListDimensionBehaviors[0] == a.WRAP_CONTENT && this instanceof 1fh;
                final boolean b11 = this.mCenter.LIZLLL() ^ true;
                final int mHorizontalResolution = this.mHorizontalResolution;
                final 05V 05V = null;
                if (mHorizontalResolution != 2) {
                    final 05G mParent3 = this.mParent;
                    05V liz6;
                    if (mParent3 != null) {
                        liz6 = 05Q.LIZ(mParent3.mRight);
                    }
                    else {
                        liz6 = null;
                    }
                    final 05G mParent4 = this.mParent;
                    05V liz7;
                    if (mParent4 != null) {
                        liz7 = 05Q.LIZ(mParent4.mLeft);
                    }
                    else {
                        liz7 = null;
                    }
                    this.applyConstraints(05Q, b3, liz7, liz6, this.mListDimensionBehaviors[0], b10, this.mLeft, this.mRight, this.mX, n6, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, b9, b5, n3, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, b11);
                }
                if (this.mVerticalResolution == 2) {
                    return;
                }
                final boolean b12 = this.mListDimensionBehaviors[1] == a.WRAP_CONTENT && this instanceof 1fh;
                while (true) {
                    Label_1656: {
                        if (n8 == 0) {
                            break Label_1656;
                        }
                        final int mResolvedDimensionRatioSide2 = this.mResolvedDimensionRatioSide;
                        if (mResolvedDimensionRatioSide2 != 1 && mResolvedDimensionRatioSide2 != -1) {
                            break Label_1656;
                        }
                        final boolean b13 = true;
                        boolean b14 = b11;
                        if (this.mBaselineDistance > 0) {
                            if (this.mBaseline.LIZ.LJIIIIZZ == 1) {
                                this.mBaseline.LIZ.LIZ(05Q);
                                b14 = b11;
                            }
                            else {
                                05Q.LIZJ(liz5, liz3, this.mBaselineDistance, 6);
                                b14 = b11;
                                if (this.mBaseline.LIZLLL != null) {
                                    05Q.LIZJ(liz5, 05Q.LIZ(this.mBaseline.LIZLLL), 0, 6);
                                    b14 = false;
                                }
                            }
                        }
                        final 05G mParent5 = this.mParent;
                        05V liz8;
                        if (mParent5 != null) {
                            liz8 = 05Q.LIZ(mParent5.mBottom);
                        }
                        else {
                            liz8 = null;
                        }
                        final 05G mParent6 = this.mParent;
                        05V liz9 = 05V;
                        if (mParent6 != null) {
                            liz9 = 05Q.LIZ(mParent6.mTop);
                        }
                        this.applyConstraints(05Q, b4, liz9, liz8, this.mListDimensionBehaviors[1], b12, this.mTop, this.mBottom, this.mY, n2, this.mMinHeight, this.mMaxDimension[1], this.mVerticalBiasPercent, b13, b6, n4, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, b14);
                        if (n8 != 0) {
                            if (this.mResolvedDimensionRatioSide == 1) {
                                05Q.LIZ(liz4, liz3, liz2, liz, this.mResolvedDimensionRatio);
                            }
                            else {
                                05Q.LIZ(liz2, liz, liz4, liz3, this.mResolvedDimensionRatio);
                            }
                        }
                        if (this.mCenter.LIZLLL()) {
                            final 05G liziz = this.mCenter.LIZLLL.LIZIZ;
                            final float n11 = (float)Math.toRadians(this.mCircleConstraintAngle + 90.0f);
                            final int liziz2 = this.mCenter.LIZIZ();
                            final 05V liz10 = 05Q.LIZ(this.getAnchor(05D.b.LEFT));
                            final 05V liz11 = 05Q.LIZ(this.getAnchor(05D.b.TOP));
                            final 05V liz12 = 05Q.LIZ(this.getAnchor(05D.b.RIGHT));
                            final 05V liz13 = 05Q.LIZ(this.getAnchor(05D.b.BOTTOM));
                            final 05V liz14 = 05Q.LIZ(liziz.getAnchor(05D.b.LEFT));
                            final 05V liz15 = 05Q.LIZ(liziz.getAnchor(05D.b.TOP));
                            final 05V liz16 = 05Q.LIZ(liziz.getAnchor(05D.b.RIGHT));
                            final 05V liz17 = 05Q.LIZ(liziz.getAnchor(05D.b.BOTTOM));
                            final 13r liziz3 = 05Q.LIZIZ();
                            final double n12 = n11;
                            final double sin = Math.sin(n12);
                            final double n13 = liziz2;
                            liziz3.LIZIZ(liz11, liz13, liz15, liz17, (float)(sin * n13));
                            05Q.LIZ(liziz3);
                            final 13r liziz4 = 05Q.LIZIZ();
                            liziz4.LIZIZ(liz10, liz12, liz14, liz16, (float)(Math.cos(n12) * n13));
                            05Q.LIZ(liziz4);
                        }
                        return;
                    }
                    final boolean b13 = false;
                    continue;
                }
            }
            final boolean b9 = false;
            continue;
        }
    }
    
    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }
    
    public void analyze(final int n) {
        05J.LIZ(n, this);
    }
    
    public void connect(final 05D.b b, final 05G 05G, final 05D.b b2) {
        this.connect(b, 05G, b2, 0, 05D.a.STRONG);
    }
    
    public void connect(final 05D.b b, final 05G 05G, final 05D.b b2, final int n) {
        this.connect(b, 05G, b2, n, 05D.a.STRONG);
    }
    
    public void connect(final 05D.b b, final 05G 05G, final 05D.b b2, final int n, final 05D.a a) {
        this.connect(b, 05G, b2, n, a, 0);
    }
    
    public void connect(05D.b b, final 05G 05G, 05D.b top, int n, final 05D.a a, final int n2) {
        final 05D.b center = 05D.b.CENTER;
        final int n3 = 0;
        final int n4 = 0;
        if (b == center) {
            if (top == 05D.b.CENTER) {
                final 05D anchor = this.getAnchor(05D.b.LEFT);
                final 05D anchor2 = this.getAnchor(05D.b.RIGHT);
                final 05D anchor3 = this.getAnchor(05D.b.TOP);
                final 05D anchor4 = this.getAnchor(05D.b.BOTTOM);
                if ((anchor == null || !anchor.LIZLLL()) && (anchor2 == null || !anchor2.LIZLLL())) {
                    final 05D.b left = 05D.b.LEFT;
                    b = 05D.b.LEFT;
                    this.connect(left, 05G, b, 0, a, n2);
                    this.connect(05D.b.RIGHT, 05G, 05D.b.RIGHT, 0, a, n2);
                    n = 1;
                }
                else {
                    n = 0;
                }
                int n5 = 0;
                05G 05G2 = null;
                Label_0207: {
                    if (anchor3 != null) {
                        n5 = n4;
                        05G2 = 05G;
                        if (anchor3.LIZLLL()) {
                            break Label_0207;
                        }
                    }
                    if (anchor4 != null) {
                        n5 = n4;
                        05G2 = 05G;
                        if (anchor4.LIZLLL()) {
                            break Label_0207;
                        }
                    }
                    top = 05D.b.TOP;
                    final 05D.b top2 = 05D.b.TOP;
                    05G2 = 05G;
                    this.connect(top, 05G2, top2, 0, a, n2);
                    this.connect(05D.b.BOTTOM, 05G2, 05D.b.BOTTOM, 0, a, n2);
                    n5 = 1;
                }
                if (n == 0) {
                    if (n5 != 0) {
                        this.getAnchor(05D.b.CENTER_Y).LIZ(05G2.getAnchor(05D.b.CENTER_Y), n2);
                    }
                    return;
                }
                if (n5 != 0) {
                    this.getAnchor(05D.b.CENTER).LIZ(05G2.getAnchor(05D.b.CENTER), n2);
                    return;
                }
                this.getAnchor(05D.b.CENTER_X).LIZ(05G2.getAnchor(05D.b.CENTER_X), n2);
            }
            else {
                if (top == 05D.b.LEFT || top == 05D.b.RIGHT) {
                    this.connect(05D.b.LEFT, 05G, top, 0, a, n2);
                    b = 05D.b.RIGHT;
                    try {
                        this.connect(b, 05G, top, 0, a, n2);
                        this.getAnchor(05D.b.CENTER).LIZ(05G.getAnchor(top), n2);
                        return;
                    }
                    finally {}
                }
                if (top == 05D.b.TOP || top == 05D.b.BOTTOM) {
                    this.connect(05D.b.TOP, 05G, top, 0, a, n2);
                    this.connect(05D.b.BOTTOM, 05G, top, 0, a, n2);
                    this.getAnchor(05D.b.CENTER).LIZ(05G.getAnchor(top), n2);
                }
            }
        }
        else {
            if (b == 05D.b.CENTER_X && (top == 05D.b.LEFT || top == 05D.b.RIGHT)) {
                final 05D anchor5 = this.getAnchor(05D.b.LEFT);
                final 05D anchor6 = 05G.getAnchor(top);
                final 05D anchor7 = this.getAnchor(05D.b.RIGHT);
                anchor5.LIZ(anchor6, n2);
                anchor7.LIZ(anchor6, n2);
                this.getAnchor(05D.b.CENTER_X).LIZ(anchor6, n2);
                return;
            }
            if (b == 05D.b.CENTER_Y && (top == 05D.b.TOP || top == 05D.b.BOTTOM)) {
                final 05D anchor8 = 05G.getAnchor(top);
                this.getAnchor(05D.b.TOP).LIZ(anchor8, n2);
                this.getAnchor(05D.b.BOTTOM).LIZ(anchor8, n2);
                this.getAnchor(05D.b.CENTER_Y).LIZ(anchor8, n2);
                return;
            }
            if (b == 05D.b.CENTER_X && top == 05D.b.CENTER_X) {
                this.getAnchor(05D.b.LEFT).LIZ(05G.getAnchor(05D.b.LEFT), n2);
                this.getAnchor(05D.b.RIGHT).LIZ(05G.getAnchor(05D.b.RIGHT), n2);
                this.getAnchor(05D.b.CENTER_X).LIZ(05G.getAnchor(top), n2);
                return;
            }
            if (b == 05D.b.CENTER_Y && top == 05D.b.CENTER_Y) {
                this.getAnchor(05D.b.TOP).LIZ(05G.getAnchor(05D.b.TOP), n2);
                this.getAnchor(05D.b.BOTTOM).LIZ(05G.getAnchor(05D.b.BOTTOM), n2);
                this.getAnchor(05D.b.CENTER_Y).LIZ(05G.getAnchor(top), n2);
                return;
            }
            final 05D anchor9 = this.getAnchor(b);
            final 05D anchor10 = 05G.getAnchor(top);
            if (anchor9.LIZ(anchor10)) {
                if (b == 05D.b.BASELINE) {
                    final 05D anchor11 = this.getAnchor(05D.b.TOP);
                    final 05D anchor12 = this.getAnchor(05D.b.BOTTOM);
                    if (anchor11 != null) {
                        anchor11.LIZJ();
                    }
                    n = n3;
                    if (anchor12 != null) {
                        anchor12.LIZJ();
                        n = n3;
                    }
                }
                else if (b == 05D.b.TOP || b == 05D.b.BOTTOM) {
                    final 05D anchor13 = this.getAnchor(05D.b.BASELINE);
                    if (anchor13 != null) {
                        anchor13.LIZJ();
                    }
                    final 05D anchor14 = this.getAnchor(05D.b.CENTER);
                    if (anchor14.LIZLLL != anchor10) {
                        anchor14.LIZJ();
                    }
                    final 05D lj = this.getAnchor(b).LJ();
                    final 05D anchor15 = this.getAnchor(05D.b.CENTER_Y);
                    if (anchor15.LIZLLL()) {
                        lj.LIZJ();
                        anchor15.LIZJ();
                    }
                }
                else if (b == 05D.b.LEFT || b == 05D.b.RIGHT) {
                    final 05D anchor16 = this.getAnchor(05D.b.CENTER);
                    if (anchor16.LIZLLL != anchor10) {
                        anchor16.LIZJ();
                    }
                    final 05D lj2 = this.getAnchor(b).LJ();
                    final 05D anchor17 = this.getAnchor(05D.b.CENTER_X);
                    if (anchor17.LIZLLL()) {
                        lj2.LIZJ();
                        anchor17.LIZJ();
                    }
                }
                anchor9.LIZ(anchor10, n, a, n2);
                anchor10.LIZIZ.connectedTo(anchor9.LIZIZ);
            }
        }
    }
    
    public void connect(final 05D 05D, final 05D 05D2, final int n) {
        this.connect(05D, 05D2, n, X.05D.a.STRONG, 0);
    }
    
    public void connect(final 05D 05D, final 05D 05D2, final int n, final int n2) {
        this.connect(05D, 05D2, n, X.05D.a.STRONG, n2);
    }
    
    public void connect(final 05D 05D, final 05D 05D2, final int n, final 05D.a a, final int n2) {
        if (05D.LIZIZ == this) {
            this.connect(05D.LIZJ, 05D2.LIZIZ, 05D2.LIZJ, n, a, n2);
        }
    }
    
    public void connectCircularConstraint(final 05G 05G, final float mCircleConstraintAngle, final int n) {
        this.immediateConnect(05D.b.CENTER, 05G, 05D.b.CENTER, n, 0);
        this.mCircleConstraintAngle = mCircleConstraintAngle;
    }
    
    public void connectedTo(final 05G 05G) {
    }
    
    public void createObjectVariables(final 05Q 05Q) {
        05Q.LIZ(this.mLeft);
        05Q.LIZ(this.mTop);
        05Q.LIZ(this.mRight);
        05Q.LIZ(this.mBottom);
        if (this.mBaselineDistance > 0) {
            05Q.LIZ(this.mBaseline);
        }
    }
    
    public void disconnectUnlockedWidget(final 05G 05G) {
        final ArrayList<05D> anchors = this.getAnchors();
        for (int size = anchors.size(), i = 0; i < size; ++i) {
            final 05D 05D = anchors.get(i);
            if (05D.LIZLLL() && 05D.LIZLLL.LIZIZ == 05G && 05D.LJII == 2) {
                05D.LIZJ();
            }
        }
    }
    
    public void disconnectWidget(final 05G 05G) {
        final ArrayList<05D> anchors = this.getAnchors();
        for (int size = anchors.size(), i = 0; i < size; ++i) {
            final 05D 05D = anchors.get(i);
            if (05D.LIZLLL() && 05D.LIZLLL.LIZIZ == 05G) {
                05D.LIZJ();
            }
        }
    }
    
    public void forceUpdateDrawPosition() {
        final int mx = this.mX;
        final int my = this.mY;
        final int mWidth = this.mWidth;
        final int mHeight = this.mHeight;
        this.mDrawX = mx;
        this.mDrawY = my;
        this.mDrawWidth = mWidth + mx - mx;
        this.mDrawHeight = mHeight + my - my;
    }
    
    public 05D getAnchor(final 05D.b b) {
        switch (05E.LIZ[b.ordinal()]) {
            default: {
                throw new AssertionError((Object)b.name());
            }
            case 1: {
                return this.mLeft;
            }
            case 2: {
                return this.mTop;
            }
            case 3: {
                return this.mRight;
            }
            case 4: {
                return this.mBottom;
            }
            case 5: {
                return this.mBaseline;
            }
            case 6: {
                return this.mCenter;
            }
            case 7: {
                return this.mCenterX;
            }
            case 8: {
                return this.mCenterY;
            }
            case 9: {
                return null;
            }
        }
    }
    
    public ArrayList<05D> getAnchors() {
        return this.mAnchors;
    }
    
    public float getBiasPercent(final int n) {
        if (n == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (n == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }
    
    public int getBottom() {
        return this.mY + this.mHeight;
    }
    
    public a getDimensionBehaviour(final int n) {
        if (n == 0) {
            return this.getHorizontalDimensionBehaviour();
        }
        if (n == 1) {
            return this.getVerticalDimensionBehaviour();
        }
        return null;
    }
    
    public int getDrawBottom() {
        return this.getDrawY() + this.mDrawHeight;
    }
    
    public int getDrawRight() {
        return this.getDrawX() + this.mDrawWidth;
    }
    
    public int getDrawX() {
        return this.mDrawX + this.mOffsetX;
    }
    
    public int getDrawY() {
        return this.mDrawY + this.mOffsetY;
    }
    
    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }
    
    public 05G getHorizontalChainControlWidget() {
        final boolean inHorizontalChain = this.isInHorizontalChain();
        05G 05G2;
        final 05G 05G = 05G2 = null;
        if (inHorizontalChain) {
            05G2 = this;
            while (true) {
                final 05D anchor = 05G2.getAnchor(05D.b.LEFT);
                05G liziz = null;
                Label_0032: {
                    if (anchor != null) {
                        final 05D lizlll = anchor.LIZLLL;
                        if (lizlll != null) {
                            liziz = lizlll.LIZIZ;
                            break Label_0032;
                        }
                    }
                    liziz = null;
                }
                if (liziz == this.mParent) {
                    return 05G2;
                }
                if (liziz == null) {
                    break;
                }
                final 05D lizlll2 = liziz.getAnchor(05D.b.RIGHT).LIZLLL;
                if (lizlll2 != null && lizlll2.LIZIZ != 05G2) {
                    return 05G2;
                }
                05G2 = 05G;
                if (liziz == null) {
                    return 05G2;
                }
                05G2 = liziz;
            }
            05G2 = 05G;
        }
        return 05G2;
    }
    
    public a getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }
    
    public int getInternalDrawBottom() {
        return this.mDrawY + this.mDrawHeight;
    }
    
    public int getInternalDrawRight() {
        return this.mDrawX + this.mDrawWidth;
    }
    
    public int getLeft() {
        return this.mX;
    }
    
    public int getLength(final int n) {
        if (n == 0) {
            return this.getWidth();
        }
        if (n == 1) {
            return this.getHeight();
        }
        return 0;
    }
    
    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }
    
    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }
    
    public int getOptimizerWrapHeight() {
        int mHeight = this.mHeight;
        if (this.mListDimensionBehaviors[1] == a.MATCH_CONSTRAINT) {
            int mHeight2;
            if (this.mMatchConstraintDefaultHeight == 1) {
                mHeight2 = Math.max(this.mMatchConstraintMinHeight, mHeight);
            }
            else {
                mHeight2 = this.mMatchConstraintMinHeight;
                if (mHeight2 > 0) {
                    this.mHeight = mHeight2;
                }
                else {
                    mHeight2 = 0;
                }
            }
            final int mMatchConstraintMaxHeight = this.mMatchConstraintMaxHeight;
            mHeight = mHeight2;
            if (mMatchConstraintMaxHeight > 0 && mMatchConstraintMaxHeight < (mHeight = mHeight2)) {
                mHeight = mMatchConstraintMaxHeight;
            }
        }
        return mHeight;
    }
    
    public int getOptimizerWrapWidth() {
        int mWidth = this.mWidth;
        if (this.mListDimensionBehaviors[0] == a.MATCH_CONSTRAINT) {
            int mWidth2;
            if (this.mMatchConstraintDefaultWidth == 1) {
                mWidth2 = Math.max(this.mMatchConstraintMinWidth, mWidth);
            }
            else {
                mWidth2 = this.mMatchConstraintMinWidth;
                if (mWidth2 > 0) {
                    this.mWidth = mWidth2;
                }
                else {
                    mWidth2 = 0;
                }
            }
            final int mMatchConstraintMaxWidth = this.mMatchConstraintMaxWidth;
            mWidth = mWidth2;
            if (mMatchConstraintMaxWidth > 0 && mMatchConstraintMaxWidth < (mWidth = mWidth2)) {
                mWidth = mMatchConstraintMaxWidth;
            }
        }
        return mWidth;
    }
    
    public int getRelativePositioning(final int n) {
        if (n == 0) {
            return this.mRelX;
        }
        if (n == 1) {
            return this.mRelY;
        }
        return 0;
    }
    
    public 13p getResolutionHeight() {
        if (this.mResolutionHeight == null) {
            this.mResolutionHeight = new 13p();
        }
        return this.mResolutionHeight;
    }
    
    public 13p getResolutionWidth() {
        if (this.mResolutionWidth == null) {
            this.mResolutionWidth = new 13p();
        }
        return this.mResolutionWidth;
    }
    
    public int getRight() {
        return this.mX + this.mWidth;
    }
    
    public 13q getRootWidgetContainer() {
        05G 05G = this;
        while (true) {
            final 05G mParent = 05G.mParent;
            if (mParent == null) {
                break;
            }
            05G = mParent;
        }
        if (05G instanceof 13q) {
            return (13q)05G;
        }
        return null;
    }
    
    public int getRootX() {
        return this.mX + this.mOffsetX;
    }
    
    public int getRootY() {
        return this.mY + this.mOffsetY;
    }
    
    public int getTop() {
        return this.mY;
    }
    
    public String getType() {
        return this.mType;
    }
    
    public 05G getVerticalChainControlWidget() {
        final boolean inVerticalChain = this.isInVerticalChain();
        05G 05G2;
        final 05G 05G = 05G2 = null;
        if (inVerticalChain) {
            05G2 = this;
            while (true) {
                final 05D anchor = 05G2.getAnchor(05D.b.TOP);
                05G liziz = null;
                Label_0032: {
                    if (anchor != null) {
                        final 05D lizlll = anchor.LIZLLL;
                        if (lizlll != null) {
                            liziz = lizlll.LIZIZ;
                            break Label_0032;
                        }
                    }
                    liziz = null;
                }
                if (liziz == this.mParent) {
                    return 05G2;
                }
                if (liziz == null) {
                    break;
                }
                final 05D lizlll2 = liziz.getAnchor(05D.b.BOTTOM).LIZLLL;
                if (lizlll2 != null && lizlll2.LIZIZ != 05G2) {
                    return 05G2;
                }
                05G2 = 05G;
                if (liziz == null) {
                    return 05G2;
                }
                05G2 = liziz;
            }
            05G2 = 05G;
        }
        return 05G2;
    }
    
    public a getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }
    
    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }
    
    public boolean hasAncestor(final 05G 05G) {
        final 05G mParent = this.mParent;
        if (mParent == 05G) {
            return true;
        }
        05G mParent2;
        if ((mParent2 = mParent) == 05G.mParent) {
            return false;
        }
        while (mParent2 != null) {
            if (mParent2 == 05G) {
                return true;
            }
            if (mParent2 == 05G.mParent) {
                return true;
            }
            mParent2 = mParent2.mParent;
        }
        return false;
    }
    
    public boolean hasBaseline() {
        return this.mBaselineDistance > 0;
    }
    
    public void immediateConnect(final 05D.b b, final 05G 05G, final 05D.b b2, final int n, final int n2) {
        this.getAnchor(b).LIZ(05G.getAnchor(b2), n, n2, 05D.a.STRONG, 0, true);
    }
    
    public boolean isFullyResolved() {
        return this.mLeft.LIZ.LJIIIIZZ == 1 && this.mRight.LIZ.LJIIIIZZ == 1 && this.mTop.LIZ.LJIIIIZZ == 1 && this.mBottom.LIZ.LJIIIIZZ == 1;
    }
    
    public boolean isInHorizontalChain() {
        return (this.mLeft.LIZLLL != null && this.mLeft.LIZLLL.LIZLLL == this.mLeft) || (this.mRight.LIZLLL != null && this.mRight.LIZLLL.LIZLLL == this.mRight);
    }
    
    public boolean isInVerticalChain() {
        return (this.mTop.LIZLLL != null && this.mTop.LIZLLL.LIZLLL == this.mTop) || (this.mBottom.LIZLLL != null && this.mBottom.LIZLLL.LIZLLL == this.mBottom);
    }
    
    public boolean isInsideConstraintLayout() {
        05G 05G;
        if ((05G = this.mParent) == null) {
            return false;
        }
        while (!(05G instanceof 1fh)) {
            05G = 05G.mParent;
            if (05G != null) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public boolean isRoot() {
        return this.mParent == null;
    }
    
    public boolean isRootContainer() {
        if (this instanceof 1fh) {
            final 05G mParent = this.mParent;
            if (mParent == null || !(mParent instanceof 1fh)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == a.MATCH_CONSTRAINT;
    }
    
    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == a.MATCH_CONSTRAINT;
    }
    
    public void reset() {
        this.mLeft.LIZJ();
        this.mTop.LIZJ();
        this.mRight.LIZJ();
        this.mBottom.LIZJ();
        this.mBaseline.LIZJ();
        this.mCenterX.LIZJ();
        this.mCenterY.LIZJ();
        this.mCenter.LIZJ();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mWrapWidth = 0;
        this.mWrapHeight = 0;
        final float default_BIAS = 05G.DEFAULT_BIAS;
        this.mHorizontalBiasPercent = default_BIAS;
        this.mVerticalBiasPercent = default_BIAS;
        this.mListDimensionBehaviors[0] = a.FIXED;
        this.mListDimensionBehaviors[1] = a.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        final float[] mWeight = this.mWeight;
        mWeight[1] = (mWeight[0] = -1.0f);
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        final int[] mMaxDimension = this.mMaxDimension;
        mMaxDimension[1] = (mMaxDimension[0] = Integer.MAX_VALUE);
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        final 13p mResolutionWidth = this.mResolutionWidth;
        if (mResolutionWidth != null) {
            mResolutionWidth.LIZIZ();
        }
        final 13p mResolutionHeight = this.mResolutionHeight;
        if (mResolutionHeight != null) {
            mResolutionHeight.LIZIZ();
        }
        this.mBelongingGroup = null;
        this.mOptimizerMeasurable = false;
        this.mOptimizerMeasured = false;
        this.mGroupsToSolver = false;
    }
    
    public void resetAllConstraints() {
        this.resetAnchors();
        final float default_BIAS = 05G.DEFAULT_BIAS;
        this.mVerticalBiasPercent = default_BIAS;
        this.mHorizontalBiasPercent = default_BIAS;
        if (this instanceof 1fh) {
            return;
        }
        if (this.getHorizontalDimensionBehaviour() == a.MATCH_CONSTRAINT) {
            if (this.getWidth() == this.mWrapWidth) {
                this.setHorizontalDimensionBehaviour(a.WRAP_CONTENT);
            }
            else if (this.getWidth() > this.mMinWidth) {
                this.setHorizontalDimensionBehaviour(a.FIXED);
            }
        }
        if (this.getVerticalDimensionBehaviour() == a.MATCH_CONSTRAINT) {
            if (this.getHeight() == this.mWrapHeight) {
                this.setVerticalDimensionBehaviour(a.WRAP_CONTENT);
                return;
            }
            if (this.getHeight() > this.mMinHeight) {
                this.setVerticalDimensionBehaviour(a.FIXED);
            }
        }
    }
    
    public void resetAnchor(final 05D 05D) {
        final 05D anchor = this.getAnchor(05D.b.LEFT);
        final 05D anchor2 = this.getAnchor(05D.b.RIGHT);
        final 05D anchor3 = this.getAnchor(05D.b.TOP);
        final 05D anchor4 = this.getAnchor(05D.b.BOTTOM);
        final 05D anchor5 = this.getAnchor(05D.b.CENTER);
        final 05D anchor6 = this.getAnchor(05D.b.CENTER_X);
        final 05D anchor7 = this.getAnchor(05D.b.CENTER_Y);
        if (05D == anchor5) {
            if (anchor.LIZLLL() && anchor2.LIZLLL() && anchor.LIZLLL == anchor2.LIZLLL) {
                anchor.LIZJ();
                anchor2.LIZJ();
            }
            if (anchor3.LIZLLL() && anchor4.LIZLLL() && anchor3.LIZLLL == anchor4.LIZLLL) {
                anchor3.LIZJ();
                anchor4.LIZJ();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        }
        else if (05D == anchor6) {
            if (anchor.LIZLLL() && anchor2.LIZLLL() && anchor.LIZLLL.LIZIZ == anchor2.LIZLLL.LIZIZ) {
                anchor.LIZJ();
                anchor2.LIZJ();
            }
            this.mHorizontalBiasPercent = 0.5f;
        }
        else if (05D == anchor7) {
            if (anchor3.LIZLLL() && anchor4.LIZLLL() && anchor3.LIZLLL.LIZIZ == anchor4.LIZLLL.LIZIZ) {
                anchor3.LIZJ();
                anchor4.LIZJ();
            }
            this.mVerticalBiasPercent = 0.5f;
        }
        else if (05D == anchor || 05D == anchor2) {
            if (anchor.LIZLLL() && anchor.LIZLLL == anchor2.LIZLLL) {
                anchor5.LIZJ();
            }
        }
        else if ((05D == anchor3 || 05D == anchor4) && anchor3.LIZLLL() && anchor3.LIZLLL == anchor4.LIZLLL) {
            anchor5.LIZJ();
        }
        05D.LIZJ();
    }
    
    public void resetAnchors() {
        for (int size = this.mAnchors.size(), i = 0; i < size; ++i) {
            this.mAnchors.get(i).LIZJ();
        }
    }
    
    public void resetAnchors(final int n) {
        for (int size = this.mAnchors.size(), i = 0; i < size; ++i) {
            final 05D 05D = this.mAnchors.get(i);
            if (n == 05D.LJII) {
                switch (05A.LIZ[05D.LIZJ.ordinal()]) {
                    default: {
                        throw new AssertionError((Object)05D.LIZJ.name());
                    }
                    case 1:
                    case 2:
                    case 3:
                    case 7: {
                        this.mHorizontalBiasPercent = 05G.DEFAULT_BIAS;
                        break;
                    }
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9: {
                        this.mVerticalBiasPercent = 05G.DEFAULT_BIAS;
                        break;
                    }
                }
                05D.LIZJ();
            }
        }
    }
    
    public void resetResolutionNodes() {
        int n = 0;
        do {
            this.mListAnchors[n].LIZ.LIZIZ();
        } while (++n < 6);
    }
    
    public void resetSolverVariables(final 05O 05O) {
        this.mLeft.LIZ();
        this.mTop.LIZ();
        this.mRight.LIZ();
        this.mBottom.LIZ();
        this.mBaseline.LIZ();
        this.mCenter.LIZ();
        this.mCenterX.LIZ();
        this.mCenterY.LIZ();
    }
    
    public void resolve() {
    }
    
    public void setContainerItemSkip(final int mContainerItemSkip) {
        if (mContainerItemSkip >= 0) {
            this.mContainerItemSkip = mContainerItemSkip;
            return;
        }
        this.mContainerItemSkip = 0;
    }
    
    public void setDebugSolverName(final 05Q 05Q, final String mDebugName) {
        this.mDebugName = mDebugName;
        final 05V liz = 05Q.LIZ(this.mLeft);
        final 05V liz2 = 05Q.LIZ(this.mTop);
        final 05V liz3 = 05Q.LIZ(this.mRight);
        final 05V liz4 = 05Q.LIZ(this.mBottom);
        final StringBuilder sb = new StringBuilder();
        sb.append(mDebugName);
        sb.append(".left");
        liz.LIZIZ = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(mDebugName);
        sb2.append(".top");
        liz2.LIZIZ = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(mDebugName);
        sb3.append(".right");
        liz3.LIZIZ = sb3.toString();
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(mDebugName);
        sb4.append(".bottom");
        liz4.LIZIZ = sb4.toString();
        if (this.mBaselineDistance > 0) {
            final 05V liz5 = 05Q.LIZ(this.mBaseline);
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(mDebugName);
            sb5.append(".baseline");
            liz5.LIZIZ = sb5.toString();
        }
    }
    
    public void setDimension(int mMinHeight, final int mHeight) {
        this.mWidth = mMinHeight;
        final int mMinWidth = this.mMinWidth;
        if (mMinHeight < mMinWidth) {
            this.mWidth = mMinWidth;
        }
        this.mHeight = mHeight;
        mMinHeight = this.mMinHeight;
        if (mHeight < mMinHeight) {
            this.mHeight = mMinHeight;
        }
    }
    
    public void setDimensionRatio(final float mDimensionRatio, final int mDimensionRatioSide) {
        this.mDimensionRatio = mDimensionRatio;
        this.mDimensionRatioSide = mDimensionRatioSide;
    }
    
    public void setDimensionRatio(String s) {
        if (s == null || s.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        final int n = -1;
        final int length = s.length();
        final int index = s.indexOf(44);
        int n3;
        final int n2 = n3 = 0;
        int mDimensionRatioSide = n;
        if (index > 0) {
            n3 = n2;
            mDimensionRatioSide = n;
            if (index < length - 1) {
                final String substring = s.substring(0, index);
                if (substring.equalsIgnoreCase("W")) {
                    mDimensionRatioSide = 0;
                }
                else {
                    mDimensionRatioSide = n;
                    if (substring.equalsIgnoreCase("H")) {
                        mDimensionRatioSide = 1;
                    }
                }
                n3 = index + 1;
            }
        }
        final int index2 = s.indexOf(58);
        Label_0223: {
            if (index2 < 0 || index2 >= length - 1) {
                break Label_0223;
            }
            final String substring2 = s.substring(n3, index2);
            s = s.substring(index2 + 1);
            if (substring2.length() <= 0 || s.length() <= 0) {
                return;
            }
            try {
                final float float1 = Float.parseFloat(substring2);
                final float float2 = Float.parseFloat(s);
                if (float1 <= 0.0f || float2 <= 0.0f) {
                    return;
                }
                float mDimensionRatio;
                if (mDimensionRatioSide == 1) {
                    mDimensionRatio = Math.abs(float2 / float1);
                }
                else {
                    mDimensionRatio = Math.abs(float1 / float2);
                }
                while (true) {
                    if (mDimensionRatio > 0.0f) {
                        this.mDimensionRatio = mDimensionRatio;
                        this.mDimensionRatioSide = mDimensionRatioSide;
                        return;
                    }
                    return;
                    s = s.substring(n3);
                    iftrue(Label_0266:)(s.length() <= 0);
                    mDimensionRatio = Float.parseFloat(s);
                    continue;
                }
            }
            catch (final NumberFormatException ex) {}
        }
        Label_0266:;
    }
    
    public void setDrawOrigin(int n, int n2) {
        n -= this.mOffsetX;
        this.mDrawX = n;
        n2 -= this.mOffsetY;
        this.mDrawY = n2;
        this.mX = n;
        this.mY = n2;
    }
    
    public void setDrawX(int n) {
        n -= this.mOffsetX;
        this.mDrawX = n;
        this.mX = n;
    }
    
    public void setDrawY(int n) {
        n -= this.mOffsetY;
        this.mDrawY = n;
        this.mY = n;
    }
    
    public void setFrame(final int n, final int n2, final int n3) {
        if (n3 == 0) {
            this.setHorizontalDimension(n, n2);
        }
        else if (n3 == 1) {
            this.setVerticalDimension(n, n2);
        }
        this.mOptimizerMeasured = true;
    }
    
    public void setFrame(int n, int mWidth, int mMinHeight, int mHeight) {
        final int n2 = mMinHeight - n;
        mMinHeight = mHeight - mWidth;
        this.mX = n;
        this.mY = mWidth;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        n = n2;
        if (this.mListDimensionBehaviors[0] == a.FIXED) {
            mWidth = this.mWidth;
            if ((n = n2) < mWidth) {
                n = mWidth;
            }
        }
        mWidth = mMinHeight;
        if (this.mListDimensionBehaviors[1] == a.FIXED) {
            mHeight = this.mHeight;
            if ((mWidth = mMinHeight) < mHeight) {
                mWidth = mHeight;
            }
        }
        this.mWidth = n;
        this.mHeight = mWidth;
        mMinHeight = this.mMinHeight;
        if (mWidth < mMinHeight) {
            this.mHeight = mMinHeight;
        }
        mWidth = this.mMinWidth;
        if (n < mWidth) {
            this.mWidth = mWidth;
        }
        this.mOptimizerMeasured = true;
    }
    
    public void setGoneMargin(final 05D.b b, final int n) {
        final int n2 = 05E.LIZ[b.ordinal()];
        if (n2 == 1) {
            this.mLeft.LJFF = n;
            return;
        }
        if (n2 == 2) {
            this.mTop.LJFF = n;
            return;
        }
        if (n2 != 3) {
            if (n2 == 4) {
                this.mBottom.LJFF = n;
            }
            return;
        }
        this.mRight.LJFF = n;
    }
    
    public void setHeight(final int mHeight) {
        this.mHeight = mHeight;
        final int mMinHeight = this.mMinHeight;
        if (mHeight < mMinHeight) {
            this.mHeight = mMinHeight;
        }
    }
    
    public void setHorizontalDimension(int n, int mMinWidth) {
        this.mX = n;
        n = mMinWidth - n;
        this.mWidth = n;
        mMinWidth = this.mMinWidth;
        if (n < mMinWidth) {
            this.mWidth = mMinWidth;
        }
    }
    
    public void setHorizontalDimensionBehaviour(final a a) {
        this.mListDimensionBehaviors[0] = a;
        if (a == 05G.a.WRAP_CONTENT) {
            this.setWidth(this.mWrapWidth);
        }
    }
    
    public void setHorizontalMatchStyle(final int mMatchConstraintDefaultWidth, final int mMatchConstraintMinWidth, final int mMatchConstraintMaxWidth, final float mMatchConstraintPercentWidth) {
        this.mMatchConstraintDefaultWidth = mMatchConstraintDefaultWidth;
        this.mMatchConstraintMinWidth = mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = mMatchConstraintMaxWidth;
        this.mMatchConstraintPercentWidth = mMatchConstraintPercentWidth;
        if (mMatchConstraintPercentWidth < 1.0f && mMatchConstraintDefaultWidth == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }
    
    public void setHorizontalWeight(final float n) {
        this.mWeight[0] = n;
    }
    
    public void setLength(final int n, final int n2) {
        if (n2 == 0) {
            this.setWidth(n);
            return;
        }
        if (n2 == 1) {
            this.setHeight(n);
        }
    }
    
    public void setMaxHeight(final int n) {
        this.mMaxDimension[1] = n;
    }
    
    public void setMaxWidth(final int n) {
        this.mMaxDimension[0] = n;
    }
    
    public void setMinHeight(final int mMinHeight) {
        if (mMinHeight < 0) {
            this.mMinHeight = 0;
            return;
        }
        this.mMinHeight = mMinHeight;
    }
    
    public void setMinWidth(final int mMinWidth) {
        if (mMinWidth < 0) {
            this.mMinWidth = 0;
            return;
        }
        this.mMinWidth = mMinWidth;
    }
    
    public void setOffset(final int mOffsetX, final int mOffsetY) {
        this.mOffsetX = mOffsetX;
        this.mOffsetY = mOffsetY;
    }
    
    public void setOrigin(final int mx, final int my) {
        this.mX = mx;
        this.mY = my;
    }
    
    public void setRelativePositioning(final int n, final int n2) {
        if (n2 == 0) {
            this.mRelX = n;
            return;
        }
        if (n2 == 1) {
            this.mRelY = n;
        }
    }
    
    public void setVerticalDimension(int mMinHeight, int mHeight) {
        this.mY = mMinHeight;
        mHeight -= mMinHeight;
        this.mHeight = mHeight;
        mMinHeight = this.mMinHeight;
        if (mHeight < mMinHeight) {
            this.mHeight = mMinHeight;
        }
    }
    
    public void setVerticalDimensionBehaviour(final a a) {
        this.mListDimensionBehaviors[1] = a;
        if (a == 05G.a.WRAP_CONTENT) {
            this.setHeight(this.mWrapHeight);
        }
    }
    
    public void setVerticalMatchStyle(final int mMatchConstraintDefaultHeight, final int mMatchConstraintMinHeight, final int mMatchConstraintMaxHeight, final float mMatchConstraintPercentHeight) {
        this.mMatchConstraintDefaultHeight = mMatchConstraintDefaultHeight;
        this.mMatchConstraintMinHeight = mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = mMatchConstraintPercentHeight;
        if (mMatchConstraintPercentHeight < 1.0f && mMatchConstraintDefaultHeight == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }
    
    public void setVerticalWeight(final float n) {
        this.mWeight[1] = n;
    }
    
    public void setWidth(final int mWidth) {
        this.mWidth = mWidth;
        final int mMinWidth = this.mMinWidth;
        if (mWidth < mMinWidth) {
            this.mWidth = mMinWidth;
        }
    }
    
    public void setupDimensionRatio(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (b3) {
                if (!b4) {
                    this.mResolvedDimensionRatioSide = 0;
                }
            }
            else if (b4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.LIZLLL() || !this.mBottom.LIZLLL())) {
            this.mResolvedDimensionRatioSide = 1;
        }
        else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.LIZLLL() || !this.mRight.LIZLLL())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.LIZLLL() || !this.mBottom.LIZLLL() || !this.mLeft.LIZLLL() || !this.mRight.LIZLLL())) {
            if (this.mTop.LIZLLL() && this.mBottom.LIZLLL()) {
                this.mResolvedDimensionRatioSide = 0;
            }
            else if (this.mLeft.LIZLLL() && this.mRight.LIZLLL()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            if (b) {
                if (!b2) {
                    this.mResolvedDimensionRatioSide = 0;
                }
            }
            else if (b2) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            final int mMatchConstraintMinWidth = this.mMatchConstraintMinWidth;
            if (mMatchConstraintMinWidth > 0) {
                if (this.mMatchConstraintMinHeight == 0) {
                    this.mResolvedDimensionRatioSide = 0;
                }
            }
            else if (mMatchConstraintMinWidth == 0 && this.mMatchConstraintMinHeight > 0) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1 && b && b2) {
            this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final String mType = this.mType;
        final String s = "";
        String string;
        if (mType != null) {
            final StringBuilder sb2 = new StringBuilder("type: ");
            sb2.append(this.mType);
            sb2.append(" ");
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        String string2 = s;
        if (this.mDebugName != null) {
            final StringBuilder sb3 = new StringBuilder("id: ");
            sb3.append(this.mDebugName);
            sb3.append(" ");
            string2 = sb3.toString();
        }
        sb.append(string2);
        sb.append("(");
        sb.append(this.mX);
        sb.append(", ");
        sb.append(this.mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(") wrap: (");
        sb.append(this.mWrapWidth);
        sb.append(" x ");
        sb.append(this.mWrapHeight);
        sb.append(")");
        return sb.toString();
    }
    
    public void updateDrawPosition() {
        final int mx = this.mX;
        final int my = this.mY;
        final int mWidth = this.mWidth;
        final int mHeight = this.mHeight;
        this.mDrawX = mx;
        this.mDrawY = my;
        this.mDrawWidth = mWidth + mx - mx;
        this.mDrawHeight = mHeight + my - my;
    }
    
    public void updateFromSolver(final 05Q 05Q) {
        int liziz = 05Q.LIZIZ(this.mLeft);
        int liziz2 = 05Q.LIZIZ(this.mTop);
        int liziz3 = 05Q.LIZIZ(this.mRight);
        final int liziz4 = 05Q.LIZIZ(this.mBottom);
        int n;
        if (liziz3 - liziz < 0 || liziz4 - liziz2 < 0 || liziz == Integer.MIN_VALUE || liziz == Integer.MAX_VALUE || liziz2 == Integer.MIN_VALUE || liziz2 == Integer.MAX_VALUE || liziz3 == Integer.MIN_VALUE || liziz3 == Integer.MAX_VALUE || liziz4 == Integer.MIN_VALUE || (n = liziz4) == Integer.MAX_VALUE) {
            n = 0;
            liziz = 0;
            liziz2 = 0;
            liziz3 = 0;
        }
        this.setFrame(liziz, liziz2, liziz3, n);
    }
    
    public void updateResolutionNodes() {
        int n = 0;
        do {
            final 13o liz = this.mListAnchors[n].LIZ;
            final 05D lizlll = liz.LIZ.LIZLLL;
            if (lizlll != null) {
                if (lizlll.LIZLLL == liz.LIZ) {
                    liz.LJFF = 4;
                    lizlll.LIZ.LJFF = 4;
                }
                final int liziz = liz.LIZ.LIZIZ();
                int n2 = 0;
                Label_0092: {
                    if (liz.LIZ.LIZJ != 05D.b.RIGHT) {
                        n2 = liziz;
                        if (liz.LIZ.LIZJ != 05D.b.BOTTOM) {
                            break Label_0092;
                        }
                    }
                    n2 = -liziz;
                }
                liz.LIZIZ(lizlll.LIZ, n2);
            }
        } while (++n < 6);
    }
    
    public enum a
    {
        FIXED, 
        MATCH_CONSTRAINT, 
        MATCH_PARENT, 
        WRAP_CONTENT;
        
        static {
            Covode.recordClassIndex(607);
        }
    }
}
