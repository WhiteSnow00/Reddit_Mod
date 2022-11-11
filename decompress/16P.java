// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class 16p implements 0Fi.a
{
    public final ArrayList<b> LIZ;
    public final ArrayList<b> LIZIZ;
    public final a LIZJ;
    public Runnable LIZLLL;
    public final boolean LJ;
    public final 0Fi LJFF;
    public int LJI;
    public 07T.a<b> LJII;
    
    static {
        Covode.recordClassIndex(1562);
    }
    
    public 16p(final a a) {
        this(a, (byte)0);
    }
    
    public 16p(final a lizj, final byte b) {
        this.LJII = new 07T.b<b>(30);
        this.LIZ = new ArrayList<b>();
        this.LIZIZ = new ArrayList<b>();
        this.LJI = 0;
        this.LIZJ = lizj;
        this.LJ = false;
        this.LJFF = new 0Fi((0Fi.a)this);
    }
    
    private void LIZ(final b b, final int n) {
        this.LIZJ.LIZ(b);
        final int liz = b.LIZ;
        if (liz == 2) {
            this.LIZJ.LIZ(n, b.LIZLLL);
            return;
        }
        if (liz == 4) {
            this.LIZJ.LIZ(n, b.LIZLLL, b.LIZJ);
            return;
        }
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }
    
    private void LIZ(final List<b> list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            this.LIZ((b)list.get(i));
        }
        list.clear();
    }
    
    private int LIZIZ(int i, final int n) {
        int j = this.LIZIZ.size() - 1;
        int n2 = i;
        while (j >= 0) {
            final b b = this.LIZIZ.get(j);
            if (b.LIZ == 8) {
                int n3;
                if (b.LIZIZ < b.LIZLLL) {
                    n3 = b.LIZIZ;
                    i = b.LIZLLL;
                }
                else {
                    n3 = b.LIZLLL;
                    i = b.LIZIZ;
                }
                if (n2 >= n3 && n2 <= i) {
                    if (n3 == b.LIZIZ) {
                        if (n == 1) {
                            ++b.LIZLLL;
                        }
                        else if (n == 2) {
                            --b.LIZLLL;
                        }
                        i = n2 + 1;
                    }
                    else {
                        if (n == 1) {
                            ++b.LIZIZ;
                        }
                        else if (n == 2) {
                            --b.LIZIZ;
                        }
                        i = n2 - 1;
                    }
                }
                else if ((i = n2) < b.LIZIZ) {
                    if (n == 1) {
                        ++b.LIZIZ;
                        ++b.LIZLLL;
                        i = n2;
                    }
                    else {
                        i = n2;
                        if (n == 2) {
                            --b.LIZIZ;
                            --b.LIZLLL;
                            i = n2;
                        }
                    }
                }
            }
            else if (b.LIZIZ <= n2) {
                if (b.LIZ == 1) {
                    i = n2 - b.LIZLLL;
                }
                else {
                    i = n2;
                    if (b.LIZ == 2) {
                        i = n2 + b.LIZLLL;
                    }
                }
            }
            else if (n == 1) {
                ++b.LIZIZ;
                i = n2;
            }
            else {
                i = n2;
                if (n == 2) {
                    --b.LIZIZ;
                    i = n2;
                }
            }
            --j;
            n2 = i;
        }
        b b2;
        for (i = this.LIZIZ.size() - 1; i >= 0; --i) {
            b2 = this.LIZIZ.get(i);
            if (b2.LIZ == 8) {
                if (b2.LIZLLL == b2.LIZIZ || b2.LIZLLL < 0) {
                    this.LIZIZ.remove(i);
                    this.LIZ(b2);
                }
            }
            else if (b2.LIZLLL <= 0) {
                this.LIZIZ.remove(i);
                this.LIZ(b2);
            }
        }
        return n2;
    }
    
    private void LIZIZ(b liz) {
        if (liz.LIZ != 1 && liz.LIZ != 8) {
            int liziz = this.LIZIZ(liz.LIZIZ, liz.LIZ);
            int liziz2 = liz.LIZIZ;
            final int liz2 = liz.LIZ;
            int n;
            if (liz2 != 2) {
                if (liz2 != 4) {
                    throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(liz)));
                }
                n = 1;
            }
            else {
                n = 0;
            }
            int i = 1;
            int n2 = 1;
        Label_0169_Outer:
            while (i < liz.LIZLLL) {
                final int liziz3 = this.LIZIZ(liz.LIZIZ + n * i, liz.LIZ);
                final int liz3 = liz.LIZ;
                while (true) {
                    Label_0196: {
                        if (liz3 != 2) {
                            if (liz3 == 4 && liziz3 == liziz + 1) {
                                break Label_0196;
                            }
                        }
                        else if (liziz3 == liziz) {
                            break Label_0196;
                        }
                        final b liz4 = this.LIZ(liz.LIZ, liziz, n2, liz.LIZJ);
                        this.LIZ(liz4, liziz2);
                        this.LIZ(liz4);
                        int n3 = liziz2;
                        if (liz.LIZ == 4) {
                            n3 = liziz2 + n2;
                        }
                        liziz = liziz3;
                        final int n4 = 1;
                        liziz2 = n3;
                        final int n5 = n4;
                        ++i;
                        n2 = n5;
                        continue Label_0169_Outer;
                    }
                    final int n5 = n2 + 1;
                    continue;
                }
            }
            final Object lizj = liz.LIZJ;
            this.LIZ(liz);
            if (n2 > 0) {
                liz = this.LIZ(liz.LIZ, liziz, n2, lizj);
                this.LIZ(liz, liziz2);
                this.LIZ(liz);
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    
    private void LIZJ(final b b) {
        this.LIZIZ.add(b);
        final int liz = b.LIZ;
        if (liz == 1) {
            this.LIZJ.LIZJ(b.LIZIZ, b.LIZLLL);
            return;
        }
        if (liz == 2) {
            this.LIZJ.LIZIZ(b.LIZIZ, b.LIZLLL);
            return;
        }
        if (liz == 4) {
            this.LIZJ.LIZ(b.LIZIZ, b.LIZLLL, b.LIZJ);
            return;
        }
        if (liz == 8) {
            this.LIZJ.LIZLLL(b.LIZIZ, b.LIZLLL);
            return;
        }
        throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(b)));
    }
    
    private boolean LIZLLL(final int n) {
        for (int size = this.LIZIZ.size(), i = 0; i < size; ++i) {
            final b b = this.LIZIZ.get(i);
            if (b.LIZ == 8) {
                if (this.LIZ(b.LIZLLL, i + 1) == n) {
                    return true;
                }
            }
            else if (b.LIZ == 1) {
                for (int liziz = b.LIZIZ, lizlll = b.LIZLLL, j = b.LIZIZ; j < liziz + lizlll; ++j) {
                    if (this.LIZ(j, i + 1) == n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final int LIZ(int lizlll, int n) {
        final int size = this.LIZIZ.size();
        int i = n;
        n = lizlll;
        while (i < size) {
            final b b = this.LIZIZ.get(i);
            if (b.LIZ == 8) {
                if (b.LIZIZ == n) {
                    lizlll = b.LIZLLL;
                }
                else {
                    int n2;
                    if (b.LIZIZ < (n2 = n)) {
                        n2 = n - 1;
                    }
                    if (b.LIZLLL <= (lizlll = n2)) {
                        lizlll = n2 + 1;
                    }
                }
            }
            else if (b.LIZIZ <= (lizlll = n)) {
                if (b.LIZ == 2) {
                    if (n < b.LIZIZ + b.LIZLLL) {
                        return -1;
                    }
                    lizlll = n - b.LIZLLL;
                }
                else {
                    lizlll = n;
                    if (b.LIZ == 1) {
                        lizlll = n + b.LIZLLL;
                    }
                }
            }
            ++i;
            n = lizlll;
        }
        return n;
    }
    
    @Override
    public final b LIZ(final int liz, final int liziz, final int lizlll, final Object lizj) {
        final b b = this.LJII.LIZ();
        b b2;
        if (b == null) {
            b2 = new b(liz, liziz, lizlll, lizj);
        }
        else {
            b.LIZ = liz;
            b.LIZIZ = liziz;
            b.LIZLLL = lizlll;
            b.LIZJ = lizj;
            b2 = b;
        }
        return b2;
    }
    
    public final void LIZ() {
        this.LIZ(this.LIZ);
        this.LIZ(this.LIZIZ);
        this.LJI = 0;
    }
    
    @Override
    public final void LIZ(final b b) {
        if (!this.LJ) {
            b.LIZJ = null;
            this.LJII.LIZ(b);
        }
    }
    
    public final boolean LIZ(final int n) {
        return (n & this.LJI) != 0x0;
    }
    
    public final int LIZIZ(final int n) {
        return this.LIZ(n, 0);
    }
    
    public final void LIZIZ() {
        final 0Fi ljff = this.LJFF;
        final ArrayList<b> liz = this.LIZ;
    Label_1219:
        while (true) {
            int i = liz.size() - 1;
            int n = 0;
            while (true) {
                while (i >= 0) {
                    int n2;
                    if (((b)liz.get(i)).LIZ == 8) {
                        if ((n2 = n) != 0) {
                            final int n3 = i;
                            Object liz2 = null;
                            Object liz3 = null;
                            if (n3 == -1) {
                                break Label_1219;
                            }
                            final int n4 = n3 + 1;
                            final b b = (b)liz.get(n3);
                            final b b2 = (b)liz.get(n4);
                            final int liz4 = b2.LIZ;
                            if (liz4 == 1) {
                                int n5;
                                if (b.LIZLLL < b2.LIZIZ) {
                                    n5 = -1;
                                }
                                else {
                                    n5 = 0;
                                }
                                int n6 = n5;
                                if (b.LIZIZ < b2.LIZIZ) {
                                    n6 = n5 + 1;
                                }
                                if (b2.LIZIZ <= b.LIZIZ) {
                                    b.LIZIZ += b2.LIZLLL;
                                }
                                if (b2.LIZIZ <= b.LIZLLL) {
                                    b.LIZLLL += b2.LIZLLL;
                                }
                                b2.LIZIZ += n6;
                                liz.set(n3, (Object)b2);
                                liz.set(n4, (Object)b);
                                continue Label_1219;
                            }
                            if (liz4 != 2) {
                                if (liz4 != 4) {
                                    continue Label_1219;
                                }
                                Object liz5 = null;
                                Label_0152: {
                                    if (b.LIZLLL < b2.LIZIZ) {
                                        --b2.LIZIZ;
                                    }
                                    else if (b.LIZLLL < b2.LIZIZ + b2.LIZLLL) {
                                        --b2.LIZLLL;
                                        liz5 = ljff.LIZ.LIZ(4, b.LIZIZ, 1, b2.LIZJ);
                                        break Label_0152;
                                    }
                                    liz5 = null;
                                }
                                if (b.LIZIZ <= b2.LIZIZ) {
                                    ++b2.LIZIZ;
                                }
                                else if (b.LIZIZ < b2.LIZIZ + b2.LIZLLL) {
                                    final int n7 = b2.LIZIZ + b2.LIZLLL - b.LIZIZ;
                                    liz3 = ljff.LIZ.LIZ(4, b.LIZIZ + 1, n7, b2.LIZJ);
                                    b2.LIZLLL -= n7;
                                }
                                liz.set(n4, (Object)b);
                                if (b2.LIZLLL > 0) {
                                    liz.set(n3, (Object)b2);
                                }
                                else {
                                    liz.remove(n3);
                                    ljff.LIZ.LIZ(b2);
                                }
                                if (liz5 != null) {
                                    liz.add(n3, liz5);
                                }
                                if (liz3 != null) {
                                    liz.add(n3, liz3);
                                    continue Label_1219;
                                }
                                continue Label_1219;
                            }
                            else {
                                int n8;
                                boolean b3;
                                if (b.LIZIZ < b.LIZLLL) {
                                    if (b2.LIZIZ == b.LIZIZ && b2.LIZLLL == b.LIZLLL - b.LIZIZ) {
                                        n8 = 1;
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    b3 = false;
                                }
                                else {
                                    if (b2.LIZIZ == b.LIZLLL + 1 && b2.LIZLLL == b.LIZIZ - b.LIZLLL) {
                                        n8 = 1;
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    b3 = true;
                                }
                                if (b.LIZLLL < b2.LIZIZ) {
                                    --b2.LIZIZ;
                                }
                                else if (b.LIZLLL < b2.LIZIZ + b2.LIZLLL) {
                                    --b2.LIZLLL;
                                    b.LIZ = 2;
                                    b.LIZLLL = 1;
                                    if (b2.LIZLLL == 0) {
                                        liz.remove(n4);
                                        ljff.LIZ.LIZ(b2);
                                        continue Label_1219;
                                    }
                                    continue Label_1219;
                                }
                                if (b.LIZIZ <= b2.LIZIZ) {
                                    ++b2.LIZIZ;
                                }
                                else if (b.LIZIZ < b2.LIZIZ + b2.LIZLLL) {
                                    liz2 = ljff.LIZ.LIZ(2, b.LIZIZ + 1, b2.LIZIZ + b2.LIZLLL - b.LIZIZ, null);
                                    b2.LIZLLL = b.LIZIZ - b2.LIZIZ;
                                }
                                if (n8 != 0) {
                                    liz.set(n3, (Object)b2);
                                    liz.remove(n4);
                                    ljff.LIZ.LIZ(b);
                                    continue Label_1219;
                                }
                                if (b3) {
                                    if (liz2 != null) {
                                        if (b.LIZIZ > ((b)liz2).LIZIZ) {
                                            b.LIZIZ -= ((b)liz2).LIZLLL;
                                        }
                                        if (b.LIZLLL > ((b)liz2).LIZIZ) {
                                            b.LIZLLL -= ((b)liz2).LIZLLL;
                                        }
                                    }
                                    if (b.LIZIZ > b2.LIZIZ) {
                                        b.LIZIZ -= b2.LIZLLL;
                                    }
                                    if (b.LIZLLL > b2.LIZIZ) {
                                        b.LIZLLL -= b2.LIZLLL;
                                    }
                                }
                                else {
                                    if (liz2 != null) {
                                        if (b.LIZIZ >= ((b)liz2).LIZIZ) {
                                            b.LIZIZ -= ((b)liz2).LIZLLL;
                                        }
                                        if (b.LIZLLL >= ((b)liz2).LIZIZ) {
                                            b.LIZLLL -= ((b)liz2).LIZLLL;
                                        }
                                    }
                                    if (b.LIZIZ >= b2.LIZIZ) {
                                        b.LIZIZ -= b2.LIZLLL;
                                    }
                                    if (b.LIZLLL >= b2.LIZIZ) {
                                        b.LIZLLL -= b2.LIZLLL;
                                    }
                                }
                                liz.set(n3, (Object)b2);
                                if (b.LIZIZ != b.LIZLLL) {
                                    liz.set(n4, (Object)b);
                                }
                                else {
                                    liz.remove(n4);
                                }
                                if (liz2 != null) {
                                    liz.add(n3, liz2);
                                    continue Label_1219;
                                }
                                continue Label_1219;
                            }
                        }
                    }
                    else {
                        n2 = 1;
                    }
                    --i;
                    n = n2;
                }
                final int n3 = -1;
                continue;
            }
        }
        for (int size = this.LIZ.size(), j = 0; j < size; ++j) {
            final b b4 = this.LIZ.get(j);
            final int liz6 = b4.LIZ;
            if (liz6 != 1) {
                if (liz6 != 2) {
                    if (liz6 != 4) {
                        if (liz6 == 8) {
                            this.LIZJ(b4);
                        }
                    }
                    else {
                        int liziz = b4.LIZIZ;
                        final int liziz2 = b4.LIZIZ;
                        final int lizlll = b4.LIZLLL;
                        int k = b4.LIZIZ;
                        int n9 = 0;
                        int n10 = -1;
                        while (k < liziz2 + lizlll) {
                            int n13;
                            int n14;
                            if (this.LIZJ.LIZ(k) != null || this.LIZLLL(k)) {
                                int n11 = n9;
                                int n12 = liziz;
                                if (n10 == 0) {
                                    this.LIZIZ(this.LIZ(4, liziz, n9, b4.LIZJ));
                                    n12 = k;
                                    n11 = 0;
                                }
                                n13 = 1;
                                liziz = n12;
                                n14 = n11;
                            }
                            else {
                                n14 = n9;
                                int n15 = liziz;
                                if (n10 == 1) {
                                    this.LIZJ(this.LIZ(4, liziz, n9, b4.LIZJ));
                                    n15 = k;
                                    n14 = 0;
                                }
                                final int n16 = 0;
                                liziz = n15;
                                n13 = n16;
                            }
                            n9 = n14 + 1;
                            ++k;
                            n10 = n13;
                        }
                        b liz7 = b4;
                        if (n9 != b4.LIZLLL) {
                            final Object lizj = b4.LIZJ;
                            this.LIZ(b4);
                            liz7 = this.LIZ(4, liziz, n9, lizj);
                        }
                        if (n10 == 0) {
                            this.LIZIZ(liz7);
                        }
                        else {
                            this.LIZJ(liz7);
                        }
                    }
                }
                else {
                    final int liziz3 = b4.LIZIZ;
                    int n17 = b4.LIZIZ + b4.LIZLLL;
                    int l = b4.LIZIZ;
                    int n18 = 0;
                    int n19 = -1;
                    while (l < n17) {
                        int n20;
                        if (this.LIZJ.LIZ(l) != null || this.LIZLLL(l)) {
                            if (n19 == 0) {
                                this.LIZIZ(this.LIZ(2, liziz3, n18, null));
                                n20 = 1;
                            }
                            else {
                                n20 = 0;
                            }
                            n19 = 1;
                        }
                        else {
                            int n21;
                            if (n19 == 1) {
                                this.LIZJ(this.LIZ(2, liziz3, n18, null));
                                n21 = 1;
                            }
                            else {
                                n21 = 0;
                            }
                            final int n22 = 0;
                            n20 = n21;
                            n19 = n22;
                        }
                        int n23;
                        if (n20 != 0) {
                            l -= n18;
                            n17 -= n18;
                            n23 = 1;
                        }
                        else {
                            n23 = n18 + 1;
                        }
                        ++l;
                        n18 = n23;
                    }
                    b liz8 = b4;
                    if (n18 != b4.LIZLLL) {
                        this.LIZ(b4);
                        liz8 = this.LIZ(2, liziz3, n18, null);
                    }
                    if (n19 == 0) {
                        this.LIZIZ(liz8);
                    }
                    else {
                        this.LIZJ(liz8);
                    }
                }
            }
            else {
                this.LIZJ(b4);
            }
            final Runnable lizlll2 = this.LIZLLL;
            if (lizlll2 != null) {
                lizlll2.run();
            }
        }
        this.LIZ.clear();
    }
    
    public final int LIZJ(int n) {
        final int size = this.LIZ.size();
        int i = 0;
        int n2 = n;
        while (i < size) {
            final b b = this.LIZ.get(i);
            n = b.LIZ;
            if (n != 1) {
                if (n != 2) {
                    if (n != 8) {
                        n = n2;
                    }
                    else if (b.LIZIZ == n2) {
                        n = b.LIZLLL;
                    }
                    else {
                        int n3;
                        if (b.LIZIZ < (n3 = n2)) {
                            n3 = n2 - 1;
                        }
                        if (b.LIZLLL <= (n = n3)) {
                            n = n3 + 1;
                        }
                    }
                }
                else if (b.LIZIZ <= (n = n2)) {
                    if (b.LIZIZ + b.LIZLLL > n2) {
                        return -1;
                    }
                    n = n2 - b.LIZLLL;
                }
            }
            else if (b.LIZIZ <= (n = n2)) {
                n = n2 + b.LIZLLL;
            }
            ++i;
            n2 = n;
        }
        return n2;
    }
    
    public final void LIZJ() {
        for (int size = this.LIZIZ.size(), i = 0; i < size; ++i) {
            this.LIZJ.LIZIZ(this.LIZIZ.get(i));
        }
        this.LIZ(this.LIZIZ);
        this.LJI = 0;
    }
    
    public final boolean LIZLLL() {
        return this.LIZ.size() > 0;
    }
    
    public final void LJ() {
        this.LIZJ();
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            final b b = this.LIZ.get(i);
            final int liz = b.LIZ;
            if (liz != 1) {
                if (liz != 2) {
                    if (liz != 4) {
                        if (liz == 8) {
                            this.LIZJ.LIZIZ(b);
                            this.LIZJ.LIZLLL(b.LIZIZ, b.LIZLLL);
                        }
                    }
                    else {
                        this.LIZJ.LIZIZ(b);
                        this.LIZJ.LIZ(b.LIZIZ, b.LIZLLL, b.LIZJ);
                    }
                }
                else {
                    this.LIZJ.LIZIZ(b);
                    this.LIZJ.LIZ(b.LIZIZ, b.LIZLLL);
                }
            }
            else {
                this.LIZJ.LIZIZ(b);
                this.LIZJ.LIZJ(b.LIZIZ, b.LIZLLL);
            }
            final Runnable lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.run();
            }
        }
        this.LIZ(this.LIZ);
        this.LJI = 0;
    }
    
    public final boolean LJFF() {
        return !this.LIZIZ.isEmpty() && !this.LIZ.isEmpty();
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(1563);
        }
        
        RecyclerView.ViewHolder LIZ(final int p0);
        
        void LIZ(final int p0, final int p1);
        
        void LIZ(final int p0, final int p1, final Object p2);
        
        void LIZ(final b p0);
        
        void LIZIZ(final int p0, final int p1);
        
        void LIZIZ(final b p0);
        
        void LIZJ(final int p0, final int p1);
        
        void LIZLLL(final int p0, final int p1);
    }
    
    public static final class b
    {
        public int LIZ;
        public int LIZIZ;
        public Object LIZJ;
        public int LIZLLL;
        
        static {
            Covode.recordClassIndex(1564);
        }
        
        public b(final int liz, final int liziz, final int lizlll, final Object lizj) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZLLL = lizlll;
            this.LIZJ = lizj;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            final int liz = this.LIZ;
            if (liz != b.LIZ) {
                return false;
            }
            if (liz == 8 && Math.abs(this.LIZLLL - this.LIZIZ) == 1 && this.LIZLLL == b.LIZIZ && this.LIZIZ == b.LIZLLL) {
                return true;
            }
            if (this.LIZLLL != b.LIZLLL) {
                return false;
            }
            if (this.LIZIZ != b.LIZIZ) {
                return false;
            }
            final Object lizj = this.LIZJ;
            if (lizj != null) {
                if (!lizj.equals(b.LIZJ)) {
                    return false;
                }
            }
            else if (b.LIZJ != null) {
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            return (this.LIZ * 31 + this.LIZIZ) * 31 + this.LIZLLL;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            final int liz = this.LIZ;
            String s;
            if (liz != 1) {
                if (liz != 2) {
                    if (liz != 4) {
                        if (liz != 8) {
                            s = "??";
                        }
                        else {
                            s = "mv";
                        }
                    }
                    else {
                        s = "up";
                    }
                }
                else {
                    s = "rm";
                }
            }
            else {
                s = "add";
            }
            sb.append(s);
            sb.append(",s:");
            sb.append(this.LIZIZ);
            sb.append("c:");
            sb.append(this.LIZLLL);
            sb.append(",p:");
            sb.append(this.LIZJ);
            sb.append("]");
            return sb.toString();
        }
    }
}
