// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import vb.h;
import vb.l;
import android.util.Log;
import vb.e;
import bd.s;

public final class f
{
    public static final String[] a;
    
    static {
        a = new String[] { "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient" };
    }
    
    public static e a(final int n, final s s) {
        final int c = s.c();
        if (s.c() == 1684108385) {
            s.C(8);
            final String m = s.m(c - 16);
            return new e("und", m, m);
        }
        final String value = String.valueOf(kb.a.a(n));
        String concat;
        if (value.length() != 0) {
            concat = "Failed to parse comment attribute: ".concat(value);
        }
        else {
            concat = new String("Failed to parse comment attribute: ");
        }
        Log.w("MetadataUtil", concat);
        return null;
    }
    
    public static vb.a b(final s s) {
        int c = s.c();
        if (s.c() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        final int n = s.c() & 0xFFFFFF;
        String s2;
        if (n == 13) {
            s2 = "image/jpeg";
        }
        else if (n == 14) {
            s2 = "image/png";
        }
        else {
            s2 = null;
        }
        if (s2 == null) {
            ag0.a.u(41, "Unrecognized cover art flags: ", n, "MetadataUtil");
            return null;
        }
        s.C(4);
        c -= 16;
        final byte[] array = new byte[c];
        s.b(0, c, array);
        return new vb.a(s2, null, 3, array);
    }
    
    public static l c(int w, final s s, final String s2) {
        final int c = s.c();
        if (s.c() == 1684108385 && c >= 22) {
            s.C(10);
            final int w2 = s.w();
            if (w2 > 0) {
                final StringBuilder sb = new StringBuilder(11);
                sb.append(w2);
                final String string = sb.toString();
                w = s.w();
                String string2 = string;
                if (w > 0) {
                    final String value = String.valueOf(string);
                    final StringBuilder sb2 = new StringBuilder(value.length() + 12);
                    sb2.append(value);
                    sb2.append("/");
                    sb2.append(w);
                    string2 = sb2.toString();
                }
                return new l(s2, null, string2);
            }
        }
        final String value2 = String.valueOf(kb.a.a(w));
        String concat;
        if (value2.length() != 0) {
            concat = "Failed to parse index/count attribute: ".concat(value2);
        }
        else {
            concat = new String("Failed to parse index/count attribute: ");
        }
        Log.w("MetadataUtil", concat);
        return null;
    }
    
    public static l d(final int n, final s s, final String s2) {
        final int c = s.c();
        if (s.c() == 1684108385) {
            s.C(8);
            return new l(s2, null, s.m(c - 16));
        }
        final String value = String.valueOf(kb.a.a(n));
        String concat;
        if (value.length() != 0) {
            concat = "Failed to parse text attribute: ".concat(value);
        }
        else {
            concat = new String("Failed to parse text attribute: ");
        }
        Log.w("MetadataUtil", concat);
        return null;
    }
    
    public static h e(final int n, String o, final s s, final boolean b, final boolean b2) {
        int n3;
        final int n2 = n3 = f(s);
        if (b2) {
            n3 = Math.min(1, n2);
        }
        if (n3 >= 0) {
            h h;
            if (b) {
                h = new l((String)o, null, Integer.toString(n3));
            }
            else {
                h = new e("und", (String)o, Integer.toString(n3));
            }
            return h;
        }
        o = String.valueOf(kb.a.a(n));
        if (((String)o).length() != 0) {
            o = "Failed to parse uint8 attribute: ".concat((String)o);
        }
        else {
            o = new String("Failed to parse uint8 attribute: ");
        }
        Log.w("MetadataUtil", (String)o);
        return null;
    }
    
    public static int f(final s s) {
        s.C(4);
        if (s.c() == 1684108385) {
            s.C(8);
            return s.r();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
