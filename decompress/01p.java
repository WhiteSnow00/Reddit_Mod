// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import android.content.Intent;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public abstract class 01p
{
    public Random LIZIZ;
    public final Map<Integer, String> LIZJ;
    public final Map<String, Integer> LIZLLL;
    public final Map<String, b> LJ;
    public ArrayList<String> LJFF;
    public final transient Map<String, a<?>> LJI;
    public final Map<String, Object> LJII;
    public final Bundle LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(228);
    }
    
    public 01p() {
        this.LIZIZ = new Random();
        this.LIZJ = new HashMap<Integer, String>();
        this.LIZLLL = new HashMap<String, Integer>();
        this.LJ = new HashMap<String, b>();
        this.LJFF = new ArrayList<String>();
        this.LJI = new HashMap<String, a<?>>();
        this.LJII = new HashMap<String, Object>();
        this.LJIIIIZZ = new Bundle();
    }
    
    private int LIZ() {
        int n = this.LIZIZ.nextInt(2147418112);
        int n2;
        while (true) {
            n2 = n + 65536;
            if (!this.LIZJ.containsKey(n2)) {
                break;
            }
            n = this.LIZIZ.nextInt(2147418112);
        }
        return n2;
    }
    
    private <O> void LIZ(final String s, final int n, final Intent intent, final a<O> a) {
        if (a != null && a.LIZ != null) {
            a.LIZ.LIZ(a.LIZIZ.LIZ(n, intent));
            return;
        }
        this.LJII.remove(s);
        this.LJIIIIZZ.putParcelable(s, (Parcelable)new ActivityResult(n, intent));
    }
    
    public abstract <I, O> void LIZ(final int p0, final 01k<I, O> p1, final I p2);
    
    public final void LIZ(final int n, final String s) {
        this.LIZJ.put(n, s);
        this.LIZLLL.put(s, n);
    }
    
    public final void LIZ(final String s) {
        if (!this.LJFF.contains(s)) {
            final Integer remove = this.LIZLLL.remove(s);
            if (remove != null) {
                this.LIZJ.remove(remove);
            }
        }
        this.LJI.remove(s);
        if (this.LJII.containsKey(s)) {
            this.LJII.remove(s);
        }
        if (this.LJIIIIZZ.containsKey(s)) {
            this.LJIIIIZZ.remove(s);
        }
        final b b = this.LJ.get(s);
        if (b != null) {
            final Iterator<15t> iterator = b.LIZIZ.iterator();
            while (iterator.hasNext()) {
                b.LIZ.LIZIZ(iterator.next());
            }
            b.LIZIZ.clear();
            this.LJ.remove(s);
        }
    }
    
    public final boolean LIZ(final int n, final int n2, final Intent intent) {
        final String s = this.LIZJ.get(n);
        if (s == null) {
            return false;
        }
        this.LJFF.remove(s);
        this.LIZ(s, n2, intent, this.LJI.get(s));
        return true;
    }
    
    public final int LIZIZ(final String s) {
        final Integer n = this.LIZLLL.get(s);
        if (n != null) {
            return n;
        }
        final int liz = this.LIZ();
        this.LIZ(liz, s);
        return liz;
    }
    
    public static final class a<O>
    {
        public final 01l<O> LIZ;
        public final 01k<?, O> LIZIZ;
        
        static {
            Covode.recordClassIndex(231);
        }
        
        public a(final 01l<O> liz, final 01k<?, O> liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
    
    public static final class b
    {
        public final 0CC LIZ;
        public final ArrayList<15t> LIZIZ;
        
        static {
            Covode.recordClassIndex(232);
        }
        
        public b(final 0CC liz) {
            this.LIZ = liz;
            this.LIZIZ = new ArrayList<15t>();
        }
    }
}
