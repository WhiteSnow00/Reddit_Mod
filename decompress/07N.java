// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 07N
{
    public static final 07L LIZ;
    public static final 07L LIZIZ;
    public static final 07L LIZJ;
    public static final 07L LIZLLL;
    public static final 07L LJ;
    
    static {
        Covode.recordClassIndex(787);
        LIZ = new e(null, false);
        LIZIZ = new e(null, true);
        LIZJ = new e(b.LIZ, false);
        LIZLLL = new e(b.LIZ, true);
        LJ = new e(a.LIZ, false);
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(790);
        }
        
        int LIZ(final CharSequence p0, final int p1);
    }
    
    public static final class a implements c
    {
        public static final a LIZ;
        public final boolean LIZIZ;
        
        static {
            Covode.recordClassIndex(788);
            LIZ = new a();
        }
        
        public a() {
            this.LIZIZ = true;
        }
        
        @Override
        public final int LIZ(final CharSequence charSequence, final int n) {
            int i = 0;
            boolean b = false;
        Label_0041_Outer:
            while (i < n + 0) {
                final byte directionality = Character.getDirectionality(charSequence.charAt(i));
                while (true) {
                    Label_0065: {
                        if (directionality != 0) {
                            if (directionality == 1 || directionality == 2) {
                                if (this.LIZIZ) {
                                    return 0;
                                }
                                break Label_0065;
                            }
                        }
                        else {
                            if (!this.LIZIZ) {
                                return 1;
                            }
                            break Label_0065;
                        }
                        ++i;
                        continue Label_0041_Outer;
                    }
                    b = true;
                    continue;
                }
            }
            if (!b) {
                return 2;
            }
            if (this.LIZIZ) {
                return 1;
            }
            return 0;
        }
    }
    
    public static final class b implements c
    {
        public static final b LIZ;
        
        static {
            Covode.recordClassIndex(789);
            LIZ = new b();
        }
        
        @Override
        public final int LIZ(final CharSequence charSequence, final int n) {
            int n2 = 0;
            int n3 = 2;
        Label_0083_Outer:
            while (n2 < n + 0 && n3 == 2) {
                final byte directionality = Character.getDirectionality(charSequence.charAt(n2));
                while (true) {
                    Label_0095: {
                        if (directionality == 0) {
                            break Label_0095;
                        }
                        if (directionality != 1 && directionality != 2) {
                            switch (directionality) {
                                default: {
                                    n3 = 2;
                                    break Label_0083;
                                }
                                case 16:
                                case 17: {
                                    break;
                                }
                                case 14:
                                case 15: {
                                    break Label_0095;
                                }
                            }
                        }
                        n3 = 0;
                        ++n2;
                        continue Label_0083_Outer;
                    }
                    n3 = 1;
                    continue;
                }
            }
            return n3;
        }
    }
    
    public abstract static class d implements 07L
    {
        public final c LIZ;
        
        static {
            Covode.recordClassIndex(791);
        }
        
        public d(final c liz) {
            this.LIZ = liz;
        }
        
        public abstract boolean LIZ();
        
        @Override
        public final boolean LIZ(final CharSequence charSequence, int liz) {
            if (charSequence == null || liz < 0 || charSequence.length() - liz < 0) {
                throw new IllegalArgumentException();
            }
            final c liz2 = this.LIZ;
            if (liz2 == null) {
                return this.LIZ();
            }
            liz = liz2.LIZ(charSequence, liz);
            return liz == 0 || (liz != 1 && this.LIZ());
        }
    }
    
    public static final class e extends d
    {
        public final boolean LIZ;
        
        static {
            Covode.recordClassIndex(792);
        }
        
        public e(final c c, final boolean liz) {
            super(c);
            this.LIZ = liz;
        }
        
        @Override
        public final boolean LIZ() {
            return this.LIZ;
        }
    }
}
