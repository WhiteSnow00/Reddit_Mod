// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Collection;
import com.android.billingclient.api.SkuDetails;
import java.util.List;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class 0M3
{
    public boolean LIZ;
    public String LIZIZ;
    public String LIZJ;
    public c LIZLLL;
    public S41 LJ;
    public ArrayList LJFF;
    public boolean LJI;
    
    static {
        Covode.recordClassIndex(2499);
    }
    
    public static a LIZ() {
        return new a((byte)0);
    }
    
    public static final class a
    {
        public String LIZ;
        public String LIZIZ;
        public List LIZJ;
        public ArrayList LIZLLL;
        public boolean LJ;
        public c.a LJFF;
        
        static {
            Covode.recordClassIndex(2500);
        }
        
        public a() {
            final c.a liz = c.LIZ();
            liz.LIZIZ = true;
            this.LJFF = liz;
        }
        
        public final a LIZ(final c c) {
            final c.a liz = 0M3.c.LIZ();
            liz.LIZ = c.LIZ;
            liz.LIZJ = c.LIZIZ;
            this.LJFF = liz;
            return this;
        }
        
        public final a LIZ(final SkuDetails skuDetails) {
            final ArrayList lizlll = new ArrayList();
            lizlll.add(skuDetails);
            this.LIZLLL = lizlll;
            return this;
        }
        
        public final 0M3 LIZ() {
            final ArrayList lizlll = this.LIZLLL;
            final boolean b = true;
            boolean b2;
            if (lizlll != null && !lizlll.isEmpty()) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            final List lizj = this.LIZJ;
            boolean b3;
            if (lizj != null && !lizj.isEmpty()) {
                b3 = true;
            }
            else {
                b3 = false;
            }
            if (!b2) {
                if (!b3) {
                    throw new IllegalArgumentException("Details of the products must be provided.");
                }
            }
            else if (b3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (b2) {
                if (this.LIZLLL.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.LIZLLL.size() > 1) {
                    final SkuDetails skuDetails = this.LIZLLL.get(0);
                    final String liziz = skuDetails.LIZIZ();
                    final ArrayList lizlll2 = this.LIZLLL;
                    for (int size = lizlll2.size(), i = 0; i < size; ++i) {
                        final SkuDetails skuDetails2 = (SkuDetails)lizlll2.get(i);
                        if (!liziz.equals("play_pass_subs") && !skuDetails2.LIZIZ().equals("play_pass_subs") && !liziz.equals(skuDetails2.LIZIZ())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    final String lizj2 = skuDetails.LIZJ();
                    final ArrayList lizlll3 = this.LIZLLL;
                    for (int size2 = lizlll3.size(), j = 0; j < size2; ++j) {
                        final SkuDetails skuDetails3 = (SkuDetails)lizlll3.get(j);
                        if (!liziz.equals("play_pass_subs") && !skuDetails3.LIZIZ().equals("play_pass_subs") && !lizj2.equals(skuDetails3.LIZJ())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            else {
                final b b4 = this.LIZJ.get(0);
                for (int k = 0; k < this.LIZJ.size(); ++k) {
                    final b b5 = this.LIZJ.get(k);
                    if (b5 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (k != 0 && !b5.LIZ.LIZIZ.equals(b4.LIZ.LIZIZ) && !b5.LIZ.LIZIZ.equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                final String liz = b4.LIZ.LIZ();
                for (final b b6 : this.LIZJ) {
                    if (!b4.LIZ.LIZIZ.equals("play_pass_subs") && !b6.LIZ.LIZIZ.equals("play_pass_subs")) {
                        if (liz.equals(b6.LIZ.LIZ())) {
                            continue;
                        }
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            }
            final 0M3 0m3 = new 0M3((byte)0);
            boolean liz2 = false;
            Label_0602: {
                if (b2) {
                    liz2 = b;
                    if (!this.LIZLLL.get(0).LIZJ().isEmpty()) {
                        break Label_0602;
                    }
                }
                liz2 = (b3 && !this.LIZJ.get(0).LIZ.LIZ().isEmpty() && b);
            }
            0m3.LIZ = liz2;
            0m3.LIZIZ = this.LIZ;
            0m3.LIZJ = this.LIZIZ;
            0m3.LIZLLL = this.LJFF.LIZ();
            final ArrayList lizlll4 = this.LIZLLL;
            ArrayList ljff;
            if (lizlll4 != null) {
                ljff = new ArrayList(lizlll4);
            }
            else {
                ljff = new ArrayList();
            }
            0m3.LJFF = ljff;
            0m3.LJI = this.LJ;
            final List lizj3 = this.LIZJ;
            S41 lj;
            if (lizj3 != null) {
                lj = S41.zzk((Collection)lizj3);
            }
            else {
                lj = S41.zzl();
            }
            0m3.LJ = lj;
            return 0m3;
        }
    }
    
    public static final class b
    {
        public final 0M9 LIZ;
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(2501);
        }
    }
    
    public static final class c
    {
        public String LIZ;
        public int LIZIZ;
        
        static {
            Covode.recordClassIndex(2502);
        }
        
        public static a LIZ() {
            return new a((byte)0);
        }
        
        public static final class a
        {
            public String LIZ;
            public boolean LIZIZ;
            public int LIZJ;
            
            static {
                Covode.recordClassIndex(2503);
            }
            
            public final c LIZ() {
                boolean b;
                if (!TextUtils.isEmpty((CharSequence)this.LIZ) || !TextUtils.isEmpty((CharSequence)null)) {
                    b = true;
                }
                else {
                    b = false;
                }
                final boolean b2 = TextUtils.isEmpty((CharSequence)null) ^ true;
                if (b && b2) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (this.LIZIZ || b || b2) {
                    final c c = new c((byte)0);
                    c.LIZ = this.LIZ;
                    c.LIZIZ = this.LIZJ;
                    return c;
                }
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
        }
    }
}
