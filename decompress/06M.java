// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Icon;
import android.content.Context;
import android.app.Person$Builder;
import android.app.Person;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import androidx.core.graphics.drawable.IconCompat;

public final class 06M
{
    public CharSequence LIZ;
    public IconCompat LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    
    static {
        Covode.recordClassIndex(716);
    }
    
    public 06M(final a a) {
        this.LIZ = a.LIZ;
        this.LIZIZ = a.LIZIZ;
        this.LIZJ = a.LIZJ;
        this.LIZLLL = a.LIZLLL;
        this.LJ = a.LJ;
        this.LJFF = a.LJFF;
    }
    
    public final Bundle LIZ() {
        final Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.LIZ);
        final IconCompat liziz = this.LIZIZ;
        Bundle liziz2;
        if (liziz != null) {
            liziz2 = liziz.LIZIZ();
        }
        else {
            liziz2 = null;
        }
        bundle.putBundle("icon", liziz2);
        bundle.putString("uri", this.LIZJ);
        bundle.putString("key", this.LIZLLL);
        bundle.putBoolean("isBot", this.LJ);
        bundle.putBoolean("isImportant", this.LJFF);
        return bundle;
    }
    
    public final Person LIZIZ() {
        final Person$Builder setName = new Person$Builder().setName(this.LIZ);
        final IconCompat liziz = this.LIZIZ;
        Icon liz = null;
        if (liziz != null) {
            liz = liziz.LIZ((Context)null);
        }
        return setName.setIcon(liz).setUri(this.LIZJ).setKey(this.LIZLLL).setBot(this.LJ).setImportant(this.LJFF).build();
    }
    
    public static final class a
    {
        public CharSequence LIZ;
        public IconCompat LIZIZ;
        public String LIZJ;
        public String LIZLLL;
        public boolean LJ;
        public boolean LJFF;
        
        static {
            Covode.recordClassIndex(717);
        }
        
        public final 06M LIZ() {
            return new 06M(this);
        }
    }
}
