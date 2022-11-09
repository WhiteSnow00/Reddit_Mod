// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import com.bytedance.covode.number.Covode;

public final class 13m extends 05G
{
    public float LIZ;
    public int LIZIZ;
    public int LIZJ;
    public 05D LIZLLL;
    public int LJ;
    public boolean LJFF;
    
    static {
        Covode.recordClassIndex(610);
    }
    
    public 13m() {
        this.LIZ = -1.0f;
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LIZLLL = super.mTop;
        super.mAnchors.clear();
        super.mAnchors.add(this.LIZLLL);
        for (int length = super.mListAnchors.length, i = 0; i < length; ++i) {
            super.mListAnchors[i] = this.LIZLLL;
        }
    }
    
    public final void LIZ(final float liz) {
        if (liz > -1.0f) {
            this.LIZ = liz;
            this.LIZIZ = -1;
            this.LIZJ = -1;
        }
    }
    
    public final void LIZ(int i) {
        if (this.LJ == i) {
            return;
        }
        this.LJ = i;
        super.mAnchors.clear();
        if (this.LJ == 1) {
            this.LIZLLL = super.mLeft;
        }
        else {
            this.LIZLLL = super.mTop;
        }
        super.mAnchors.add(this.LIZLLL);
        int length;
        for (length = super.mListAnchors.length, i = 0; i < length; ++i) {
            super.mListAnchors[i] = this.LIZLLL;
        }
    }
    
    public final void LIZIZ(final int liziz) {
        if (liziz >= 0) {
            this.LIZ = -1.0f;
            this.LIZIZ = liziz;
            this.LIZJ = -1;
        }
    }
    
    public final void LIZJ(final int lizj) {
        if (lizj >= 0) {
            this.LIZ = -1.0f;
            this.LIZIZ = -1;
            this.LIZJ = lizj;
        }
    }
    
    @Override
    public final void addToSolver(final 05Q 05Q) {
        final 05G mParent = super.mParent;
        if (mParent == null) {
            return;
        }
        05D 05D = mParent.getAnchor(X.05D.b.LEFT);
        05D 05D2 = mParent.getAnchor(X.05D.b.RIGHT);
        final 05G mParent2 = super.mParent;
        final int n = 1;
        int n2;
        if (mParent2 != null && super.mParent.mListDimensionBehaviors[0] == a.WRAP_CONTENT) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.LJ == 0) {
            05D = mParent.getAnchor(X.05D.b.TOP);
            05D2 = mParent.getAnchor(X.05D.b.BOTTOM);
            if (super.mParent != null && super.mParent.mListDimensionBehaviors[1] == a.WRAP_CONTENT) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.LIZIZ != -1) {
            final 05V liz = 05Q.LIZ(this.LIZLLL);
            05Q.LIZJ(liz, 05Q.LIZ(05D), this.LIZIZ, 6);
            if (n2 != 0) {
                05Q.LIZ(05Q.LIZ(05D2), liz, 0, 5);
            }
            return;
        }
        if (this.LIZJ != -1) {
            final 05V liz2 = 05Q.LIZ(this.LIZLLL);
            final 05V liz3 = 05Q.LIZ(05D2);
            05Q.LIZJ(liz2, liz3, -this.LIZJ, 6);
            if (n2 != 0) {
                05Q.LIZ(liz2, 05Q.LIZ(05D), 0, 5);
                05Q.LIZ(liz3, liz2, 0, 5);
            }
            return;
        }
        if (this.LIZ != -1.0f) {
            final 05V liz4 = 05Q.LIZ(this.LIZLLL);
            final 05V liz5 = 05Q.LIZ(05D);
            final 05V liz6 = 05Q.LIZ(05D2);
            final float liz7 = this.LIZ;
            final boolean ljff = this.LJFF;
            final 13r liziz = 05Q.LIZIZ();
            if (ljff) {
                liziz.LIZ(05Q, 0);
            }
            liziz.LIZJ.LIZ(liz4, -1.0f);
            liziz.LIZJ.LIZ(liz5, 1.0f - liz7);
            liziz.LIZJ.LIZ(liz6, liz7);
            05Q.LIZ(liziz);
        }
    }
    
    @Override
    public final boolean allowedInBarrier() {
        return true;
    }
    
    @Override
    public final void analyze(int n) {
        final 05G mParent = super.mParent;
        if (mParent == null) {
            return;
        }
        if (this.LJ == 1) {
            super.mTop.LIZ.LIZ(mParent.mTop.LIZ, 0);
            super.mBottom.LIZ.LIZ(mParent.mTop.LIZ, 0);
            if (this.LIZIZ != -1) {
                super.mLeft.LIZ.LIZ(mParent.mLeft.LIZ, this.LIZIZ);
                super.mRight.LIZ.LIZ(mParent.mLeft.LIZ, this.LIZIZ);
                return;
            }
            if (this.LIZJ != -1) {
                super.mLeft.LIZ.LIZ(mParent.mRight.LIZ, -this.LIZJ);
                super.mRight.LIZ.LIZ(mParent.mRight.LIZ, -this.LIZJ);
                return;
            }
            if (this.LIZ != -1.0f && mParent.getHorizontalDimensionBehaviour() == a.FIXED) {
                n = (int)(mParent.mWidth * this.LIZ);
                super.mLeft.LIZ.LIZ(mParent.mLeft.LIZ, n);
                super.mRight.LIZ.LIZ(mParent.mLeft.LIZ, n);
            }
        }
        else {
            super.mLeft.LIZ.LIZ(mParent.mLeft.LIZ, 0);
            super.mRight.LIZ.LIZ(mParent.mLeft.LIZ, 0);
            if (this.LIZIZ != -1) {
                super.mTop.LIZ.LIZ(mParent.mTop.LIZ, this.LIZIZ);
                super.mBottom.LIZ.LIZ(mParent.mTop.LIZ, this.LIZIZ);
                return;
            }
            if (this.LIZJ != -1) {
                super.mTop.LIZ.LIZ(mParent.mBottom.LIZ, -this.LIZJ);
                super.mBottom.LIZ.LIZ(mParent.mBottom.LIZ, -this.LIZJ);
                return;
            }
            if (this.LIZ != -1.0f && mParent.getVerticalDimensionBehaviour() == a.FIXED) {
                n = (int)(mParent.mHeight * this.LIZ);
                super.mTop.LIZ.LIZ(mParent.mTop.LIZ, n);
                super.mBottom.LIZ.LIZ(mParent.mTop.LIZ, n);
            }
        }
    }
    
    @Override
    public final 05D getAnchor(final 05D.b b) {
        switch (05I.LIZ[b.ordinal()]) {
            case 1:
            case 2: {
                if (this.LJ == 1) {
                    return this.LIZLLL;
                }
                break;
            }
            case 3:
            case 4: {
                if (this.LJ == 0) {
                    return this.LIZLLL;
                }
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                return null;
            }
        }
        throw new AssertionError((Object)b.name());
    }
    
    @Override
    public final ArrayList<05D> getAnchors() {
        return super.mAnchors;
    }
    
    @Override
    public final String getType() {
        return "Guideline";
    }
    
    @Override
    public final void setDrawOrigin(int n, final int n2) {
        if (this.LJ == 1) {
            n -= super.mOffsetX;
            if (this.LIZIZ != -1) {
                this.LIZIZ(n);
                return;
            }
            if (this.LIZJ != -1) {
                this.LIZJ(super.mParent.getWidth() - n);
                return;
            }
            if (this.LIZ != -1.0f) {
                this.LIZ(n / (float)super.mParent.getWidth());
            }
        }
        else {
            n = n2 - super.mOffsetY;
            if (this.LIZIZ != -1) {
                this.LIZIZ(n);
                return;
            }
            if (this.LIZJ != -1) {
                this.LIZJ(super.mParent.getHeight() - n);
                return;
            }
            if (this.LIZ != -1.0f) {
                this.LIZ(n / (float)super.mParent.getHeight());
            }
        }
    }
    
    @Override
    public final void updateFromSolver(final 05Q 05Q) {
        if (super.mParent == null) {
            return;
        }
        final int liziz = 05Q.LIZIZ(this.LIZLLL);
        if (this.LJ == 1) {
            super.mX = liziz;
            super.mY = 0;
            this.setHeight(super.mParent.getHeight());
            this.setWidth(0);
            return;
        }
        super.mX = 0;
        super.mY = liziz;
        this.setWidth(super.mParent.getWidth());
        this.setHeight(0);
    }
}
