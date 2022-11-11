// 
// Decompiled by Procyon v0.6.0
// 

package gb;

import com.google.common.collect.ImmutableCollection$a;
import java.util.List;
import com.google.common.collect.ImmutableList$a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import com.google.common.collect.ImmutableList;
import com.google.android.exoplayer2.ParserException;
import ad.d0;
import java.io.Reader;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParserFactory;

public final class e
{
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    
    static {
        a = new String[] { "Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo" };
        b = new String[] { "Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs" };
        c = new String[] { "Camera:MicroVideoOffset", "GCamera:MicroVideoOffset" };
    }
    
    public static b a(String s) throws XmlPullParserException, IOException {
        final XmlPullParser pullParser = XmlPullParserFactory.newInstance().newPullParser();
        pullParser.setInput((Reader)new StringReader(s));
        pullParser.next();
        if (!d0.k(pullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        ImmutableList of = ImmutableList.of();
        long n = -9223372036854775807L;
        ImmutableList list = null;
        long n6 = 0L;
        do {
            pullParser.next();
            Label_0310: {
                if (d0.k(pullParser, "rdf:Description")) {
                    final String[] a = e.a;
                    final int n2 = 0;
                    int n3 = 0;
                    int n5 = 0;
                    Label_0117: {
                        while (true) {
                            final int n4 = 1;
                            if (n3 >= 4) {
                                break;
                            }
                            s = d0.h(pullParser, a[n3]);
                            if (s != null) {
                                if (Integer.parseInt(s) == 1) {
                                    n5 = n4;
                                    break Label_0117;
                                }
                                break;
                            }
                            else {
                                ++n3;
                            }
                        }
                        n5 = 0;
                    }
                    if (n5 == 0) {
                        return null;
                    }
                    final String[] b = e.b;
                    int i = 0;
                    while (true) {
                        while (i < 4) {
                            s = d0.h(pullParser, b[i]);
                            if (s != null) {
                                final long long1;
                                if ((long1 = Long.parseLong(s)) == -1L) {
                                    break;
                                }
                                final String[] c = e.c;
                                while (true) {
                                    for (int j = n2; j < 2; ++j) {
                                        final String h = d0.h(pullParser, c[j]);
                                        if (h != null) {
                                            list = ImmutableList.of((Object)new b$a(0L, 0L, "image/jpeg"), (Object)new b$a(Long.parseLong(h), 0L, "video/mp4"));
                                            n6 = long1;
                                            break Label_0310;
                                        }
                                    }
                                    list = ImmutableList.of();
                                    continue;
                                }
                            }
                            else {
                                ++i;
                            }
                        }
                        long long1 = -9223372036854775807L;
                        continue;
                    }
                }
                else if (d0.k(pullParser, "Container:Directory")) {
                    list = b(pullParser, "Container", "Item");
                    n6 = n;
                }
                else {
                    list = of;
                    n6 = n;
                    if (d0.k(pullParser, "GContainer:Directory")) {
                        list = b(pullParser, "GContainer", "GContainerItem");
                        n6 = n;
                    }
                }
            }
            of = list;
            n = n6;
        } while (!d0.i(pullParser, "x:xmpmeta"));
        if (((List)list).isEmpty()) {
            return null;
        }
        return new b(n6, list);
    }
    
    public static ImmutableList<b$a> b(final XmlPullParser xmlPullParser, String concat, final String s) throws XmlPullParserException, IOException {
        final ImmutableList$a builder = ImmutableList.builder();
        final String concat2 = concat.concat(":Item");
        concat = concat.concat(":Directory");
        do {
            xmlPullParser.next();
            if (d0.k(xmlPullParser, concat2)) {
                final String concat3 = s.concat(":Mime");
                final String concat4 = s.concat(":Semantic");
                final String concat5 = s.concat(":Length");
                final String concat6 = s.concat(":Padding");
                final String h = d0.h(xmlPullParser, concat3);
                final String h2 = d0.h(xmlPullParser, concat4);
                final String h3 = d0.h(xmlPullParser, concat5);
                final String h4 = d0.h(xmlPullParser, concat6);
                if (h == null || h2 == null) {
                    return (ImmutableList<b$a>)ImmutableList.of();
                }
                long long1;
                if (h3 != null) {
                    long1 = Long.parseLong(h3);
                }
                else {
                    long1 = 0L;
                }
                long long2;
                if (h4 != null) {
                    long2 = Long.parseLong(h4);
                }
                else {
                    long2 = 0L;
                }
                ((ImmutableCollection$a)builder).c((Object)new b$a(long1, long2, h));
            }
        } while (!d0.i(xmlPullParser, concat));
        return (ImmutableList<b$a>)builder.f();
    }
}
