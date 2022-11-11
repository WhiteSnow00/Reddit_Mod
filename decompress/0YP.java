// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.View;

public final class 0yP<V extends View>
{
    public V LIZ;
    public DataChannel LIZIZ;
    public Map<Class<? extends HPY>, b> LIZJ;
    
    static {
        Covode.recordClassIndex(10390);
    }
    
    public 0yP(final DataChannel liziz, final V liz, final a<V> a) {
        this.LIZJ = new HashMap<Class<? extends HPY>, b>();
        this.LIZIZ = liziz;
        this.LIZ = liz;
        if (a.LIZJ != null) {
            a.LIZJ.LIZ(this.LIZ);
        }
        a<V> liz2 = a;
        do {
            final a.a lizlll = liz2.LIZLLL;
            if (lizlll != null) {
                this.LIZJ.put(lizlll.LIZ, (b)lizlll.LIZIZ);
                if (lizlll.LIZJ) {
                    this.LIZIZ.LIZ((Object)this, (Class)lizlll.LIZ, (SRS)new 1mm(this, lizlll));
                }
                else {
                    final DataChannel liziz2 = this.LIZIZ;
                    0CH 0ch;
                    if (a.LIZIZ != null) {
                        0ch = a.LIZIZ;
                    }
                    else {
                        0ch = this.LIZIZ.LIZIZ();
                    }
                    liziz2.LIZ(0ch, (Class)lizlll.LIZ, (SRS)new 1mn(this, lizlll));
                }
            }
            liz2 = liz2.LIZ;
        } while (liz2 != null);
    }
    
    public final void LIZ() {
        this.LIZIZ.LIZIZ((Object)this);
        this.LIZJ.clear();
    }
    
    public final void LIZ(final Class<? extends HPY> clazz, final Object o) {
        if (clazz != null && o != null && this.LIZJ.keySet().contains(clazz) && this.LIZJ.get(clazz) != null) {
            this.LIZJ.get(clazz).LIZ(this.LIZ, o);
        }
    }
    
    public static final class a<V extends View>
    {
        public 0yP.a<V> LIZ;
        public 0CH LIZIZ;
        public c<V> LIZJ;
        public 0yP.a.a LIZLLL;
        public 0yK LJ;
        public DataChannel LJFF;
        public V LJI;
        
        static {
            Covode.recordClassIndex(10391);
        }
        
        public a(final DataChannel ljff, final V lji, final 0yK lj) {
            this.LJFF = ljff;
            this.LJI = lji;
            this.LJ = lj;
        }
        
        private 0yP.a<V> LIZIZ() {
            final 0yP.a a = new 0yP.a(this.LJFF, this.LJI, this.LJ);
            a.LIZIZ = this.LIZIZ;
            a.LIZ = this;
            a.LIZJ = this.LIZJ;
            return a;
        }
        
        public final <T> 0yP.a<V> LIZ(final Class<? extends HPY> clazz, final b<V, T> b) {
            this.LIZLLL = new 0yP.a.a(clazz, b, false, (byte)0);
            return this.LIZIZ();
        }
        
        public final 0yP<V> LIZ() {
            final 0yP 0yP = new 0yP(this.LJFF, this.LJI, this.LIZ, (byte)0);
            this.LJ.LIZ(0yP);
            return 0yP;
        }
        
        public final <T> 0yP.a<V> LIZIZ(final Class<? extends HPY> clazz, final b<V, T> b) {
            this.LIZLLL = new 0yP.a.a(clazz, b, true, (byte)0);
            return this.LIZIZ();
        }
        
        public static final class a<V extends View, T>
        {
            public Class<? extends HPY> LIZ;
            public b<V, T> LIZIZ;
            public boolean LIZJ;
            
            static {
                Covode.recordClassIndex(10392);
            }
            
            public a(final Class<? extends HPY> liz, final b<V, T> liziz, final boolean lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
        }
    }
    
    public interface b<V extends View, T>
    {
        default static {
            Covode.recordClassIndex(10393);
        }
        
        void LIZ(final V p0, final T p1);
    }
    
    public interface c<V extends View>
    {
        default static {
            Covode.recordClassIndex(10394);
        }
        
        void LIZ(final V p0);
    }
}
