// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroup;

public final class 05d extends ViewGroup
{
    public 05c LIZ;
    
    static {
        Covode.recordClassIndex(642);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ConstraintLayout.a(viewGroup$LayoutParams);
    }
    
    public final 05c getConstraintSet() {
        if (this.LIZ == null) {
            this.LIZ = new 05c();
        }
        final 05c liz = this.LIZ;
        final int childCount = this.getChildCount();
        liz.LIZIZ.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final a a = (a)child.getLayoutParams();
            final int id = child.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!liz.LIZIZ.containsKey(id)) {
                liz.LIZIZ.put(id, new 05c.a((byte)0));
            }
            final 05c.a a2 = liz.LIZIZ.get(id);
            if (child instanceof 05a) {
                final 05a 05a = (05a)child;
                a2.LIZ(id, a);
                if (05a instanceof 13t) {
                    a2.LJJLL = 1;
                    final 13t 13t = (13t)05a;
                    a2.LJJLJLI = 13t.getType();
                    a2.LJJZ = 13t.getReferencedIds();
                }
            }
            a2.LIZ(id, a);
        }
        return this.LIZ;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public static final class a extends ConstraintLayout.a
    {
        public float LIZ;
        public boolean LIZIZ;
        public float LIZJ;
        public float LIZLLL;
        public float LJ;
        public float LJFF;
        public float LJI;
        public float LJII;
        public float LJIIIIZZ;
        public float LJIIIZ;
        public float LJIIJ;
        public float LJIIJJI;
        public float LJIIL;
        
        static {
            Covode.recordClassIndex(643);
        }
        
        public a() {
            super(-2, -2);
            this.LIZ = 1.0f;
            this.LJI = 1.0f;
            this.LJII = 1.0f;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.LIZ = 1.0f;
            this.LJI = 1.0f;
            this.LJII = 1.0f;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, 2130969098, 2130969099, 2130969229, 2130969380, 2130969795, 2130969796, 2130969797, 2130969798, 2130969799, 2130969800, 2130969801, 2130969802, 2130969803, 2130969804, 2130969805, 2130969806, 2130969807, 2130969808, 2130969809, 2130969810, 2130969811, 2130969812, 2130969813, 2130969814, 2130969815, 2130969816, 2130969817, 2130969818, 2130969819, 2130969820, 2130969821, 2130969822, 2130969823, 2130969824, 2130969825, 2130969826, 2130969827, 2130969828, 2130969829, 2130969830, 2130969831, 2130969832, 2130969833, 2130969834, 2130969835, 2130969837, 2130969838, 2130969842, 2130969843, 2130969844, 2130969845, 2130969846, 2130969847 });
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 13) {
                    this.LIZ = obtainStyledAttributes.getFloat(index, this.LIZ);
                }
                else if (index == 26) {
                    this.LIZJ = obtainStyledAttributes.getFloat(index, this.LIZJ);
                    this.LIZIZ = true;
                }
                else if (index == 21) {
                    this.LJ = obtainStyledAttributes.getFloat(index, this.LJ);
                }
                else if (index == 22) {
                    this.LJFF = obtainStyledAttributes.getFloat(index, this.LJFF);
                }
                else if (index == 20) {
                    this.LIZLLL = obtainStyledAttributes.getFloat(index, this.LIZLLL);
                }
                else if (index == 18) {
                    this.LJI = obtainStyledAttributes.getFloat(index, this.LJI);
                }
                else if (index == 19) {
                    this.LJII = obtainStyledAttributes.getFloat(index, this.LJII);
                }
                else if (index == 14) {
                    this.LJIIIIZZ = obtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
                }
                else if (index == 15) {
                    this.LJIIIZ = obtainStyledAttributes.getFloat(index, this.LJIIIZ);
                }
                else if (index == 16) {
                    this.LJIIJ = obtainStyledAttributes.getFloat(index, this.LJIIJ);
                }
                else if (index == 17) {
                    this.LJIIJJI = obtainStyledAttributes.getFloat(index, this.LJIIJJI);
                }
                else if (index == 25) {
                    this.LJIIJ = obtainStyledAttributes.getFloat(index, this.LJIIL);
                }
            }
        }
    }
}
