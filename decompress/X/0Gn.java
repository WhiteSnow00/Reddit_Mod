// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.a.c;

public final class 0gn
{
    public int LIZ;
    @c(LIZ = "id")
    public long LIZIZ;
    @c(LIZ = "name")
    public String LIZJ;
    @c(LIZ = "eng_name")
    public String LIZLLL;
    @c(LIZ = "url")
    public ImageModel LJ;
    @c(LIZ = "icon")
    public ImageModel LJFF;
    @c(LIZ = "version")
    public long LJI;
    
    static {
        Covode.recordClassIndex(6237);
    }
    
    public 0gn() {
        this.LIZJ = "";
        this.LIZLLL = "";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends 0gn> class1 = this.getClass();
        Class<?> class2;
        if (o != null) {
            class2 = o.getClass();
        }
        else {
            class2 = null;
        }
        if (n.LIZ((Object)class1, (Object)class2) ^ true) {
            return false;
        }
        Objects.requireNonNull(o, "null cannot be cast to non-null type com.bytedance.android.live.effect.api.soundeffect.SoundEffect");
        return this.LIZIZ == ((0gn)o).LIZIZ;
    }
    
    @Override
    public final int hashCode() {
        final long liziz = this.LIZIZ;
        return (int)(liziz ^ liziz >>> 32);
    }
}
