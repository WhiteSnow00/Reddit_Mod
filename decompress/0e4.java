// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import com.bytedance.android.live.design.app.LiveDialog;

public class 0e4
{
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final LiveDialog.b LIZJ;
    public final boolean LIZLLL;
    public TextView LJ;
    public ColorStateList LJFF;
    
    static {
        Covode.recordClassIndex(5923);
    }
    
    public 0e4(final a<?> a) {
        this.LIZ = a.LIZ;
        this.LIZIZ = a.LIZIZ;
        this.LIZJ = a.LIZJ;
        this.LIZLLL = a.LIZLLL;
        this.LJFF = a.LJ;
    }
    
    public static class a<T extends a<T>>
    {
        public CharSequence LIZ;
        public int LIZIZ;
        public LiveDialog.b LIZJ;
        public boolean LIZLLL;
        public ColorStateList LJ;
        
        static {
            Covode.recordClassIndex(5924);
        }
        
        public a() {
            this.LIZJ = 1IK.LIZ;
            this.LIZLLL = true;
        }
        
        public T LIZ(final int liziz) {
            this.LIZIZ = liziz;
            return (T)this;
        }
        
        public final T LIZ(final Context context, final int n) {
            if (context != null) {
                this.LIZ = context.getResources().getString(n);
            }
            return (T)this;
        }
    }
}
