// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public abstract class 0i9
{
    static {
        Covode.recordClassIndex(6656);
    }
    
    public static final class a extends 0i9
    {
        public final 0gn LIZ;
        
        static {
            Covode.recordClassIndex(6657);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && n.LIZ((Object)this.LIZ, (Object)((a)o).LIZ));
        }
        
        @Override
        public final int hashCode() {
            final 0gn liz = this.LIZ;
            if (liz != null) {
                return liz.hashCode();
            }
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("DownloadItem(soundEffect=");
            sb.append(this.LIZ);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends 0i9
    {
        public final long LIZ;
        
        static {
            Covode.recordClassIndex(6658);
        }
        
        public b(final long liz) {
            super((byte)0);
            this.LIZ = liz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.LIZ == ((b)o).LIZ);
        }
        
        @Override
        public final int hashCode() {
            final long liz = this.LIZ;
            return (int)(liz ^ liz >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("FetchData(roomId=");
            sb.append(this.LIZ);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends 0i9
    {
        public final 0gn LIZ;
        
        static {
            Covode.recordClassIndex(6659);
        }
        
        public c(final 0gn liz) {
            CTM.LIZ((Object)liz);
            super((byte)0);
            this.LIZ = liz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && n.LIZ((Object)this.LIZ, (Object)((c)o).LIZ));
        }
        
        @Override
        public final int hashCode() {
            final 0gn liz = this.LIZ;
            if (liz != null) {
                return liz.hashCode();
            }
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("SelectItem(soundEffect=");
            sb.append(this.LIZ);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends 0i9
    {
        public final 0gn LIZ;
        
        static {
            Covode.recordClassIndex(6660);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && n.LIZ((Object)this.LIZ, (Object)((d)o).LIZ));
        }
        
        @Override
        public final int hashCode() {
            final 0gn liz = this.LIZ;
            if (liz != null) {
                return liz.hashCode();
            }
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("UnSelectItem(soundEffect=");
            sb.append(this.LIZ);
            sb.append(")");
            return sb.toString();
        }
    }
}
