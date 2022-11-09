// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import y3.c;
import android.os.LocaleList;
import java.util.Locale;

public final class h
{
    public static final h b;
    public final i a;
    
    static {
        b = e(h.b.a(new Locale[0]));
    }
    
    public h(final j a) {
        this.a = a;
    }
    
    public static h a(final String s) {
        if (s != null && !s.isEmpty()) {
            final String[] split = s.split(",", -1);
            final int length = split.length;
            final Locale[] array = new Locale[length];
            for (int i = 0; i < length; ++i) {
                array[i] = a.a(split[i]);
            }
            return e(h.b.a(array));
        }
        return h.b;
    }
    
    public static h e(final LocaleList list) {
        return new h(new j(list));
    }
    
    public final Locale b(final int n) {
        return this.a.get(n);
    }
    
    public final int c() {
        return this.a.size();
    }
    
    public final String d() {
        return this.a.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof h && this.a.equals(((h)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    public static final class a
    {
        public static final Locale[] a;
        
        static {
            a = new Locale[] { new Locale("en", "XA"), new Locale("ar", "XB") };
        }
        
        public static Locale a(final String s) {
            return Locale.forLanguageTag(s);
        }
        
        public static boolean b(final Locale locale, final Locale locale2) {
            final boolean equals = locale.equals(locale2);
            final boolean b = true;
            if (equals) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            final Locale[] a = h.a.a;
            while (true) {
                for (int length = a.length, i = 0; i < length; ++i) {
                    if (a[i].equals(locale)) {
                        final boolean b2 = true;
                        if (!b2) {
                            final Locale[] a2 = h.a.a;
                            final int length2 = a2.length;
                            int j = 0;
                            while (true) {
                                while (j < length2) {
                                    if (a2[j].equals(locale2)) {
                                        final boolean b3 = true;
                                        if (b3) {
                                            return false;
                                        }
                                        final String c = y3.c.c((Object)y3.c.a((Object)y3.c.b(locale)));
                                        if (c.isEmpty()) {
                                            final String country = locale.getCountry();
                                            boolean b4 = b;
                                            if (!country.isEmpty()) {
                                                b4 = (country.equals(locale2.getCountry()) && b);
                                            }
                                            return b4;
                                        }
                                        return c.equals(y3.c.c((Object)y3.c.a((Object)y3.c.b(locale2))));
                                    }
                                    else {
                                        ++j;
                                    }
                                }
                                final boolean b3 = false;
                                continue;
                            }
                        }
                        return false;
                    }
                }
                final boolean b2 = false;
                continue;
            }
        }
    }
    
    public static final class b
    {
        public static LocaleList a(final Locale... array) {
            return new LocaleList(array);
        }
        
        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }
        
        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }
}
