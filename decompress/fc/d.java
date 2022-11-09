// 
// Decompiled by Procyon v0.6.0
// 

package fc;

import java.io.InputStream;
import org.xmlpull.v1.XmlSerializer;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.OutputStream;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import com.google.android.exoplayer2.n$a;
import bd.o;
import java.util.Collection;
import android.net.Uri;
import java.util.regex.Matcher;
import com.google.android.exoplayer2.drm.b$b;
import android.util.Log;
import android.util.Base64;
import kb.i;
import java.util.UUID;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.Lists;
import bd.b0;
import java.util.List;
import mk2.e;
import java.io.IOException;
import bd.d0;
import org.xmlpull.v1.XmlPullParser;
import bd.c0;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import java.util.regex.Pattern;
import com.google.android.exoplayer2.upstream.i$a;
import org.xml.sax.helpers.DefaultHandler;

public class d extends DefaultHandler implements i$a<c>
{
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final int[] e;
    public final XmlPullParserFactory a;
    
    static {
        b = Pattern.compile("(\\d+)(?:/(\\d+))?");
        c = Pattern.compile("CC([1-4])=.*");
        d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
        e = new int[] { -1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14 };
    }
    
    public d() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        }
        catch (final XmlPullParserException ex) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", (Throwable)ex);
        }
    }
    
    public static long b(final ArrayList list, long n, final long n2, int a, final long n3) {
        if (a >= 0) {
            ++a;
        }
        else {
            a = c0.a;
            a = (int)((n3 - n + n2 - 1L) / n2);
        }
        for (int i = 0; i < a; ++i) {
            list.add(new k$d(n, n2));
            n += n2;
        }
        return n;
    }
    
    public static void c(final XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (!d0.j(xmlPullParser)) {
            return;
        }
        int i = 1;
        while (i != 0) {
            xmlPullParser.next();
            if (d0.j(xmlPullParser)) {
                ++i;
            }
            else {
                if (xmlPullParser.getEventType() != 3) {
                    continue;
                }
                --i;
            }
        }
    }
    
    public static int e(final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        if ((attributeValue = xmlPullParser.getAttributeValue((String)null, "schemeIdUri")) == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        final int hashCode = attributeValue.hashCode();
        final int n = -1;
        final int n2 = 0;
        int n3 = 0;
        Label_0149: {
            switch (hashCode) {
                case 2036691300: {
                    if (!attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                        break;
                    }
                    n3 = 3;
                    break Label_0149;
                }
                case -986633423: {
                    if (!attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                        break;
                    }
                    n3 = 2;
                    break Label_0149;
                }
                case -1138141449: {
                    if (!attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                        break;
                    }
                    n3 = 1;
                    break Label_0149;
                }
                case -1352850286: {
                    if (!attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                        break;
                    }
                    n3 = 0;
                    break Label_0149;
                }
            }
            n3 = -1;
        }
        int m = 0;
        Label_0428: {
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            m = n;
                            break Label_0428;
                        }
                    }
                    else {
                        final int i = m(xmlPullParser, "value", -1);
                        m = n;
                        if (i < 0) {
                            break Label_0428;
                        }
                        final int[] e = fc.d.e;
                        m = n;
                        if (i < e.length) {
                            m = e[i];
                        }
                        break Label_0428;
                    }
                }
                final String attributeValue2 = xmlPullParser.getAttributeValue((String)null, "value");
                if (attributeValue2 == null) {
                    m = n;
                }
                else {
                    final String o = mk2.e.O(attributeValue2);
                    o.getClass();
                    int n4 = 0;
                    Label_0359: {
                        switch (o.hashCode()) {
                            case 3133436: {
                                if (!o.equals("fa01")) {
                                    break;
                                }
                                n4 = 3;
                                break Label_0359;
                            }
                            case 3094035: {
                                if (!o.equals("f801")) {
                                    break;
                                }
                                n4 = 2;
                                break Label_0359;
                            }
                            case 2937391: {
                                if (!o.equals("a000")) {
                                    break;
                                }
                                n4 = 1;
                                break Label_0359;
                            }
                            case 1596796: {
                                n4 = n2;
                                if (!o.equals("4000")) {
                                    break;
                                }
                                break Label_0359;
                            }
                        }
                        n4 = -1;
                    }
                    switch (n4) {
                        default: {
                            m = n;
                            break;
                        }
                        case 3: {
                            m = 8;
                            break;
                        }
                        case 2: {
                            m = 6;
                            break;
                        }
                        case 1: {
                            m = 2;
                            break;
                        }
                        case 0: {
                            m = 1;
                            break;
                        }
                    }
                }
            }
            else {
                m = m(xmlPullParser, "value", -1);
            }
            do {
                xmlPullParser.next();
            } while (!d0.i(xmlPullParser, "AudioChannelConfiguration"));
        }
        return m;
    }
    
    public static long f(final XmlPullParser xmlPullParser, final long n) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return n;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long)(Float.parseFloat(attributeValue) * 1000000.0f);
    }
    
    public static ArrayList g(final XmlPullParser xmlPullParser, final List list, final boolean b) throws XmlPullParserException, IOException {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "dvb:priority");
        int n;
        if (attributeValue != null) {
            n = Integer.parseInt(attributeValue);
        }
        else if (b) {
            n = 1;
        }
        else {
            n = Integer.MIN_VALUE;
        }
        final String attributeValue2 = xmlPullParser.getAttributeValue((String)null, "dvb:weight");
        int n2;
        if (attributeValue2 != null) {
            n2 = Integer.parseInt(attributeValue2);
        }
        else {
            n2 = 1;
        }
        final String attributeValue3 = xmlPullParser.getAttributeValue((String)null, "serviceLocation");
        String s = "";
        String text;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            }
            else {
                c(xmlPullParser);
                text = s;
            }
            s = text;
        } while (!d0.i(xmlPullParser, "BaseURL"));
        final int n3 = 0;
        if (text != null && b0.a(text)[0] != -1) {
            String s2;
            if ((s2 = attributeValue3) == null) {
                s2 = text;
            }
            return Lists.b((Object[])new b[] { new b(text, s2, n, n2) });
        }
        final ArrayList<b> list2 = new ArrayList<b>();
        for (int i = n3; i < list.size(); ++i) {
            final b b2 = list.get(i);
            final String c = b0.c(b2.a, text);
            String b3;
            if (attributeValue3 == null) {
                b3 = c;
            }
            else {
                b3 = attributeValue3;
            }
            if (b) {
                n = b2.c;
                n2 = b2.d;
                b3 = b2.b;
            }
            list2.add(new b(c, b3, n, n2));
        }
        return list2;
    }
    
    public static Pair h(final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        final Object o = null;
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "schemeIdUri");
    Label_0359:
        while (true) {
            String s2 = null;
            Label_0349: {
                Label_0346: {
                    Label_0344: {
                        if (attributeValue != null) {
                            final String o2 = mk2.e.O(attributeValue);
                            o2.getClass();
                            int n = 0;
                            Label_0117: {
                                switch (o2) {
                                    case "urn:mpeg:dash:mp4protection:2011": {
                                        n = 2;
                                        break Label_0117;
                                    }
                                    case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed": {
                                        n = 1;
                                        break Label_0117;
                                    }
                                    case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95": {
                                        n = 0;
                                        break Label_0117;
                                    }
                                    default:
                                        break;
                                }
                                n = -1;
                            }
                            UUID uuid = null;
                            switch (n) {
                                default: {
                                    break Label_0344;
                                }
                                case 2: {
                                    final String attributeValue2 = xmlPullParser.getAttributeValue((String)null, "value");
                                    final int attributeCount = xmlPullParser.getAttributeCount();
                                    int i = 0;
                                    while (true) {
                                        while (i < attributeCount) {
                                            String s = xmlPullParser.getAttributeName(i);
                                            final int index = s.indexOf(58);
                                            if (index != -1) {
                                                s = s.substring(index + 1);
                                            }
                                            if (s.equals("default_KID")) {
                                                final String attributeValue3 = xmlPullParser.getAttributeValue(i);
                                                s2 = attributeValue2;
                                                if (TextUtils.isEmpty((CharSequence)attributeValue3)) {
                                                    break Label_0346;
                                                }
                                                s2 = attributeValue2;
                                                if (!"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                                                    final String[] split = attributeValue3.split("\\s+");
                                                    final UUID[] array = new UUID[split.length];
                                                    for (int j = 0; j < split.length; ++j) {
                                                        array[j] = UUID.fromString(split[j]);
                                                    }
                                                    final UUID b = wa.c.b;
                                                    final Object a = kb.i.a(b, array, null);
                                                    final String s3 = null;
                                                    break Label_0359;
                                                }
                                                break Label_0346;
                                            }
                                            else {
                                                ++i;
                                            }
                                        }
                                        final String attributeValue3 = null;
                                        continue;
                                    }
                                }
                                case 1: {
                                    uuid = wa.c.d;
                                    break;
                                }
                                case 0: {
                                    uuid = wa.c.e;
                                    break;
                                }
                            }
                            final UUID b = uuid;
                            s2 = null;
                            break Label_0349;
                        }
                        break Label_0344;
                        String attributeValue4 = null;
                        UUID uuid2 = null;
                        Object a2 = null;
                        do {
                            xmlPullParser.next();
                            Label_0626: {
                                if (d0.k(xmlPullParser, "ms:laurl")) {
                                    attributeValue4 = xmlPullParser.getAttributeValue((String)null, "licenseUrl");
                                    final UUID b;
                                    uuid2 = b;
                                    final Object a;
                                    a2 = a;
                                }
                                else {
                                    final Object a;
                                    final String s3;
                                    if (a == null) {
                                        boolean b2 = false;
                                        Label_0457: {
                                            if (d0.j(xmlPullParser)) {
                                                String s4 = xmlPullParser.getName();
                                                final int index2 = s4.indexOf(58);
                                                if (index2 != -1) {
                                                    s4 = s4.substring(index2 + 1);
                                                }
                                                if (s4.equals("pssh")) {
                                                    b2 = true;
                                                    break Label_0457;
                                                }
                                            }
                                            b2 = false;
                                        }
                                        if (b2 && xmlPullParser.next() == 4) {
                                            final byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                                            final i.a b3 = i.b(decode);
                                            UUID a3;
                                            if (b3 == null) {
                                                a3 = null;
                                            }
                                            else {
                                                a3 = b3.a;
                                            }
                                            if (a3 == null) {
                                                Log.w("MpdParser", "Skipping malformed cenc:pssh data");
                                                final byte[] array2 = null;
                                                uuid2 = a3;
                                                a2 = array2;
                                                attributeValue4 = s3;
                                                break Label_0626;
                                            }
                                            uuid2 = a3;
                                            a2 = decode;
                                            attributeValue4 = s3;
                                            break Label_0626;
                                        }
                                    }
                                    final UUID b;
                                    if (a == null) {
                                        final UUID e = wa.c.e;
                                        if (e.equals(b) && d0.k(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                                            a2 = i.a(e, null, Base64.decode(xmlPullParser.getText(), 0));
                                            uuid2 = b;
                                            attributeValue4 = s3;
                                            break Label_0626;
                                        }
                                    }
                                    c(xmlPullParser);
                                    attributeValue4 = s3;
                                    a2 = a;
                                    uuid2 = b;
                                }
                            }
                            final UUID b = uuid2;
                            final Object a = a2;
                            final String s3 = attributeValue4;
                        } while (!d0.i(xmlPullParser, "ContentProtection"));
                        Object o3 = o;
                        if (uuid2 != null) {
                            o3 = new b$b(uuid2, attributeValue4, "video/mp4", (byte[])a2);
                        }
                        String attributeValue2 = null;
                        return Pair.create((Object)attributeValue2, o3);
                    }
                    s2 = null;
                }
                final UUID b = null;
            }
            String s3;
            final Object a = s3 = null;
            final String attributeValue2 = s2;
            continue Label_0359;
        }
    }
    
    public static int i(final XmlPullParser xmlPullParser) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "contentType");
        if (!TextUtils.isEmpty((CharSequence)attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
        }
        return -1;
    }
    
    public static fc.e j(final XmlPullParser xmlPullParser, final String s) throws XmlPullParserException, IOException {
        String s2 = null;
        String attributeValue;
        if ((attributeValue = xmlPullParser.getAttributeValue((String)null, "schemeIdUri")) == null) {
            attributeValue = "";
        }
        String attributeValue2;
        if ((attributeValue2 = xmlPullParser.getAttributeValue((String)null, "value")) == null) {
            attributeValue2 = null;
        }
        final String attributeValue3 = xmlPullParser.getAttributeValue((String)null, "id");
        if (attributeValue3 != null) {
            s2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!d0.i(xmlPullParser, s));
        return new fc.e(attributeValue, attributeValue2, s2);
    }
    
    public static long k(final XmlPullParser xmlPullParser, String s, long n) {
        s = xmlPullParser.getAttributeValue((String)null, s);
        if (s == null) {
            return n;
        }
        final Matcher matcher = c0.h.matcher(s);
        if (matcher.matches()) {
            final boolean empty = TextUtils.isEmpty((CharSequence)matcher.group(1));
            s = matcher.group(3);
            double double1 = 0.0;
            double n2;
            if (s != null) {
                n2 = Double.parseDouble(s) * 3.1556908E7;
            }
            else {
                n2 = 0.0;
            }
            s = matcher.group(5);
            double n3;
            if (s != null) {
                n3 = Double.parseDouble(s) * 2629739.0;
            }
            else {
                n3 = 0.0;
            }
            s = matcher.group(7);
            double n4;
            if (s != null) {
                n4 = Double.parseDouble(s) * 86400.0;
            }
            else {
                n4 = 0.0;
            }
            s = matcher.group(10);
            double n5;
            if (s != null) {
                n5 = Double.parseDouble(s) * 3600.0;
            }
            else {
                n5 = 0.0;
            }
            s = matcher.group(12);
            double n6;
            if (s != null) {
                n6 = Double.parseDouble(s) * 60.0;
            }
            else {
                n6 = 0.0;
            }
            final String group = matcher.group(14);
            if (group != null) {
                double1 = Double.parseDouble(group);
            }
            final long n7 = n = (long)((n2 + n3 + n4 + n5 + n6 + double1) * 1000.0);
            if (true ^ empty) {
                n = -n7;
            }
        }
        else {
            n = (long)(Double.parseDouble(s) * 3600.0 * 1000.0);
        }
        return n;
    }
    
    public static float l(final XmlPullParser xmlPullParser, final float n) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "frameRate");
        float n2 = n;
        if (attributeValue != null) {
            final Matcher matcher = fc.d.b.matcher(attributeValue);
            n2 = n;
            if (matcher.matches()) {
                final int int1 = Integer.parseInt(matcher.group(1));
                final String group = matcher.group(2);
                if (!TextUtils.isEmpty((CharSequence)group)) {
                    n2 = int1 / (float)Integer.parseInt(group);
                }
                else {
                    n2 = (float)int1;
                }
            }
        }
        return n2;
    }
    
    public static int m(final XmlPullParser xmlPullParser, final String s, int int1) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue != null) {
            int1 = Integer.parseInt(attributeValue);
        }
        return int1;
    }
    
    public static long n(final XmlPullParser xmlPullParser, final String s, long long1) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue != null) {
            long1 = Long.parseLong(attributeValue);
        }
        return long1;
    }
    
    public static c o(final XmlPullParser xmlPullParser, final Uri uri) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String[] split = new String[0];
        final String attributeValue = xmlPullParser2.getAttributeValue((String)null, "profiles");
        if (attributeValue != null) {
            split = attributeValue.split(",");
        }
        final int length = split.length;
        int n = 0;
        int n2;
        boolean b;
        while (true) {
            n2 = 1;
            if (n >= length) {
                b = false;
                break;
            }
            if (split[n].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                b = true;
                break;
            }
            ++n;
        }
        final String attributeValue2 = xmlPullParser2.getAttributeValue((String)null, "availabilityStartTime");
        long m;
        if (attributeValue2 == null) {
            m = -9223372036854775807L;
        }
        else {
            m = c0.M(attributeValue2);
        }
        final long k = k(xmlPullParser2, "mediaPresentationDuration", -9223372036854775807L);
        final long i = k(xmlPullParser2, "minBufferTime", -9223372036854775807L);
        final boolean equals = "dynamic".equals(xmlPullParser2.getAttributeValue((String)null, "type"));
        long j;
        if (equals) {
            j = k(xmlPullParser2, "minimumUpdatePeriod", -9223372036854775807L);
        }
        else {
            j = -9223372036854775807L;
        }
        long l;
        if (equals) {
            l = k(xmlPullParser2, "timeShiftBufferDepth", -9223372036854775807L);
        }
        else {
            l = -9223372036854775807L;
        }
        long k2;
        if (equals) {
            k2 = k(xmlPullParser2, "suggestedPresentationDelay", -9223372036854775807L);
        }
        else {
            k2 = -9223372036854775807L;
        }
        final String attributeValue3 = xmlPullParser2.getAttributeValue((String)null, "publishTime");
        long m2;
        if (attributeValue3 == null) {
            m2 = -9223372036854775807L;
        }
        else {
            m2 = c0.M(attributeValue3);
        }
        long n3;
        if (equals) {
            n3 = 0L;
        }
        else {
            n3 = -9223372036854775807L;
        }
        final String string = uri.toString();
        final String string2 = uri.toString();
        int n4;
        if (b) {
            n4 = 1;
        }
        else {
            n4 = Integer.MIN_VALUE;
        }
        ArrayList b2 = Lists.b((Object[])new b[] { new b(string, string2, n4, 1) });
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        long n5;
        if (equals) {
            n5 = -9223372036854775807L;
        }
        else {
            n5 = 0L;
        }
        XmlPullParser xmlPullParser3 = xmlPullParser2;
        int n7;
        int n6 = n7 = 0;
        n n8;
        Object o = n8 = null;
        Object o2;
        Object d = o2 = n8;
        int n9 = n2;
        while (true) {
            xmlPullParser.next();
            String s = "BaseURL";
            long n14 = 0L;
            XmlPullParser xmlPullParser4 = null;
            ArrayList list4 = null;
            ArrayList list5 = null;
            Label_7509: {
                Label_0749: {
                    if (d0.k(xmlPullParser3, "BaseURL")) {
                        long f = n3;
                        int n10;
                        if ((n10 = n6) == 0) {
                            f = f(xmlPullParser3, n3);
                            n10 = n9;
                        }
                        list2.addAll(g(xmlPullParser3, b2, b));
                        n3 = f;
                        n6 = n10;
                    }
                    else {
                        final boolean k3 = d0.k(xmlPullParser3, "ProgramInformation");
                        String s2 = "lang";
                        if (k3) {
                            String attributeValue4 = xmlPullParser3.getAttributeValue((String)null, "moreInformationURL");
                            if (attributeValue4 == null) {
                                attributeValue4 = null;
                            }
                            String attributeValue5 = xmlPullParser3.getAttributeValue((String)null, "lang");
                            if (attributeValue5 == null) {
                                attributeValue5 = null;
                            }
                            String nextText = null;
                            String nextText3;
                            String nextText2 = nextText3 = nextText;
                            do {
                                xmlPullParser.next();
                                if (d0.k(xmlPullParser3, "Title")) {
                                    nextText = xmlPullParser.nextText();
                                }
                                else if (d0.k(xmlPullParser3, "Source")) {
                                    nextText2 = xmlPullParser.nextText();
                                }
                                else if (d0.k(xmlPullParser3, "Copyright")) {
                                    nextText3 = xmlPullParser.nextText();
                                }
                                else {
                                    c(xmlPullParser);
                                }
                            } while (!d0.i(xmlPullParser3, "ProgramInformation"));
                            o = new h(nextText, nextText2, nextText3, attributeValue4, attributeValue5);
                        }
                        else if (d0.k(xmlPullParser3, "UTCTiming")) {
                            n8 = new n(xmlPullParser3.getAttributeValue((String)null, "schemeIdUri"), xmlPullParser3.getAttributeValue((String)null, "value"), 0);
                        }
                        else if (d0.k(xmlPullParser3, "Location")) {
                            d = b0.d(uri.toString(), xmlPullParser.nextText());
                        }
                        else {
                            if (d0.k(xmlPullParser3, "ServiceDescription")) {
                                float float2;
                                float float1 = float2 = -3.4028235E38f;
                                long n11 = -9223372036854775807L;
                                long n12 = -9223372036854775807L;
                                long n13 = -9223372036854775807L;
                                n14 = n3;
                                long n15;
                                long n16;
                                long n17;
                                while (true) {
                                    xmlPullParser.next();
                                    if (d0.k(xmlPullParser3, "Latency")) {
                                        n15 = n(xmlPullParser3, "target", -9223372036854775807L);
                                        n16 = n(xmlPullParser3, "min", -9223372036854775807L);
                                        n17 = n(xmlPullParser3, "max", -9223372036854775807L);
                                    }
                                    else {
                                        n15 = n11;
                                        n16 = n12;
                                        n17 = n13;
                                        if (d0.k(xmlPullParser3, "PlaybackRate")) {
                                            final String attributeValue6 = xmlPullParser3.getAttributeValue((String)null, "min");
                                            if (attributeValue6 == null) {
                                                float1 = -3.4028235E38f;
                                            }
                                            else {
                                                float1 = Float.parseFloat(attributeValue6);
                                            }
                                            final String attributeValue7 = xmlPullParser3.getAttributeValue((String)null, "max");
                                            if (attributeValue7 == null) {
                                                float2 = -3.4028235E38f;
                                                n15 = n11;
                                                n16 = n12;
                                                n17 = n13;
                                            }
                                            else {
                                                float2 = Float.parseFloat(attributeValue7);
                                                n15 = n11;
                                                n16 = n12;
                                                n17 = n13;
                                            }
                                        }
                                    }
                                    if (d0.i(xmlPullParser3, "ServiceDescription")) {
                                        break;
                                    }
                                    n11 = n15;
                                    n12 = n16;
                                    n13 = n17;
                                }
                                o2 = new l(n15, n16, n17, float1, float2);
                                break Label_0749;
                            }
                            final long n18 = n3;
                            if (!d0.k(xmlPullParser3, "Period") || n7 != 0) {
                                final ArrayList list3 = list;
                                xmlPullParser4 = xmlPullParser2;
                                n9 = 1;
                                c(xmlPullParser);
                                list4 = list2;
                                n14 = n18;
                                list5 = list3;
                                break Label_7509;
                            }
                            ArrayList list6;
                            if (!list2.isEmpty()) {
                                list6 = list2;
                            }
                            else {
                                list6 = b2;
                            }
                            final String s3 = "id";
                            final String attributeValue8 = xmlPullParser3.getAttributeValue((String)null, "id");
                            final long k4 = k(xmlPullParser3, "start", n5);
                            ArrayList list7 = b2;
                            String s4 = "schemeIdUri";
                            long n19;
                            if (m != -9223372036854775807L) {
                                n19 = m + k4;
                            }
                            else {
                                n19 = -9223372036854775807L;
                            }
                            final String s5 = "duration";
                            final long k5 = k(xmlPullParser3, "duration", -9223372036854775807L);
                            ArrayList<a> list8 = new ArrayList<a>();
                            final String s6 = "Period";
                            final ArrayList<f> list9 = new ArrayList<f>();
                            final ArrayList list10 = new ArrayList();
                            long n20 = -9223372036854775807L;
                            XmlPullParser xmlPullParser5 = xmlPullParser2;
                            String s7 = "value";
                            int n21 = 0;
                            long n22 = n18;
                            k s8 = null;
                            ArrayList list11 = list2;
                            ArrayList list12 = list;
                            String s9 = s5;
                            String s10 = s3;
                            long n23 = n5;
                            while (true) {
                                xmlPullParser.next();
                                String s11 = null;
                                String s12 = null;
                                String s13 = null;
                                String s14 = null;
                                String s15 = null;
                                String s16 = null;
                                long n26 = 0L;
                                ArrayList<a> list16 = null;
                                Label_7233: {
                                    if (d0.k(xmlPullParser5, s)) {
                                        long f2 = n22;
                                        int n24;
                                        if ((n24 = n21) == 0) {
                                            f2 = f(xmlPullParser5, n22);
                                            n24 = 1;
                                        }
                                        list10.addAll(g(xmlPullParser5, list6, b));
                                        final ArrayList list13 = list12;
                                        final ArrayList list14 = list11;
                                        final ArrayList<a> list15 = list8;
                                        s11 = s;
                                        s12 = s2;
                                        final int n25 = 1;
                                        s13 = s4;
                                        s14 = s7;
                                        s15 = s10;
                                        s16 = s9;
                                        n21 = n24;
                                        n26 = f2;
                                        list4 = list14;
                                        b2 = list7;
                                        n9 = n25;
                                        list5 = list13;
                                        list16 = list15;
                                    }
                                    else {
                                        final boolean k6 = d0.k(xmlPullParser5, "AdaptationSet");
                                        n26 = n22;
                                        String s17 = "AdaptationSet";
                                        String s18 = "SegmentTemplate";
                                        String s122 = null;
                                        String s123 = null;
                                        Label_7218: {
                                            if (k6) {
                                                ArrayList list17;
                                                if (!list10.isEmpty()) {
                                                    list17 = list10;
                                                }
                                                else {
                                                    list17 = list6;
                                                }
                                                ArrayList list18 = list17;
                                                final int m3 = m(xmlPullParser5, s10, -1);
                                                int i2 = i(xmlPullParser);
                                                String s19 = "mimeType";
                                                final String attributeValue9 = xmlPullParser5.getAttributeValue((String)null, "mimeType");
                                                final String attributeValue10 = xmlPullParser5.getAttributeValue((String)null, "codecs");
                                                String s20 = s9;
                                                int m4 = m(xmlPullParser5, "width", -1);
                                                ArrayList<a> list19 = list8;
                                                ArrayList list20 = list12;
                                                int m5 = m(xmlPullParser5, "height", -1);
                                                final float l2 = l(xmlPullParser5, -1.0f);
                                                ArrayList list21 = list11;
                                                String s21 = "SegmentList";
                                                String s22 = "SegmentBase";
                                                final int m6 = m(xmlPullParser5, "audioSamplingRate", -1);
                                                final String attributeValue11 = xmlPullParser5.getAttributeValue((String)null, s2);
                                                String s23 = "audioSamplingRate";
                                                String attributeValue12 = xmlPullParser5.getAttributeValue((String)null, "label");
                                                final ArrayList<b$b> list22 = new ArrayList<b$b>();
                                                ArrayList<fc.e> list23 = new ArrayList<fc.e>();
                                                ArrayList<fc.e> list24 = new ArrayList<fc.e>();
                                                ArrayList<fc.e> list25 = new ArrayList<fc.e>();
                                                final ArrayList<fc.e> list26 = new ArrayList<fc.e>();
                                                List<fc.e> list27 = new ArrayList<fc.e>();
                                                ArrayList list28 = new ArrayList();
                                                final ArrayList list29 = new ArrayList();
                                                String s24 = "width";
                                                String s25 = "codecs";
                                                String s26 = s10;
                                                String s27 = "height";
                                                long f3 = n20;
                                                k k7 = s8;
                                                long f4 = n26;
                                                String c = attributeValue11;
                                                int n27 = -1;
                                                String s28 = null;
                                                XmlPullParser xmlPullParser6 = xmlPullParser;
                                                int n28 = 0;
                                                String s29 = s4;
                                                ArrayList list30 = list29;
                                                String s71 = null;
                                                ArrayList<fc.e> list61 = null;
                                                String s83 = null;
                                                int n57 = 0;
                                                ArrayList<fc.e> list62 = null;
                                                String s85 = null;
                                                String s87 = null;
                                                ArrayList list63 = null;
                                                List<fc.e> list64 = null;
                                                ArrayList list65 = null;
                                                String s89 = null;
                                                String s90 = null;
                                                ArrayList list68 = null;
                                                String s91 = null;
                                                while (true) {
                                                    xmlPullParser.next();
                                                    int n31 = 0;
                                                    String s44 = null;
                                                    String s47 = null;
                                                    String s72 = null;
                                                    String s74 = null;
                                                    XmlPullParser xmlPullParser9 = null;
                                                    String s80 = null;
                                                    String s82 = null;
                                                    String s84 = null;
                                                    String s86 = null;
                                                    String s88 = null;
                                                    ArrayList<fc.e> list66 = null;
                                                    ArrayList list67 = null;
                                                    String s92 = null;
                                                    Label_5416: {
                                                        if (d0.k(xmlPullParser6, s)) {
                                                            if (n28 == 0) {
                                                                f4 = f(xmlPullParser6, f4);
                                                                n28 = 1;
                                                            }
                                                            list30.addAll(g(xmlPullParser6, list18, b));
                                                        }
                                                        else {
                                                            String s30 = null;
                                                            int i3 = 0;
                                                            int e = 0;
                                                            String s31 = null;
                                                            Label_2030: {
                                                                if (d0.k(xmlPullParser6, "ContentProtection")) {
                                                                    final Pair h = h(xmlPullParser);
                                                                    final Object first = h.first;
                                                                    if (first != null) {
                                                                        s28 = (String)first;
                                                                    }
                                                                    final Object second = h.second;
                                                                    s30 = c;
                                                                    i3 = i2;
                                                                    e = n27;
                                                                    s31 = s28;
                                                                    if (second != null) {
                                                                        list22.add((b$b)second);
                                                                        s30 = c;
                                                                        i3 = i2;
                                                                        e = n27;
                                                                        s31 = s28;
                                                                    }
                                                                }
                                                                else {
                                                                    final long n29 = f4;
                                                                    if (!d0.k(xmlPullParser6, "ContentComponent")) {
                                                                        long f6 = 0L;
                                                                        Label_5209: {
                                                                            String s94 = null;
                                                                            Label_5201: {
                                                                                if (d0.k(xmlPullParser6, "Role")) {
                                                                                    list25.add(j(xmlPullParser6, "Role"));
                                                                                }
                                                                                else {
                                                                                    final String s32 = "AudioChannelConfiguration";
                                                                                    if (d0.k(xmlPullParser6, "AudioChannelConfiguration")) {
                                                                                        e = e(xmlPullParser);
                                                                                        s31 = s28;
                                                                                        i3 = i2;
                                                                                        s30 = c;
                                                                                        break Label_2030;
                                                                                    }
                                                                                    if (d0.k(xmlPullParser6, "Accessibility")) {
                                                                                        list24.add(j(xmlPullParser6, "Accessibility"));
                                                                                    }
                                                                                    else if (d0.k(xmlPullParser6, "EssentialProperty")) {
                                                                                        list26.add(j(xmlPullParser6, "EssentialProperty"));
                                                                                    }
                                                                                    else if (d0.k(xmlPullParser6, "SupplementalProperty")) {
                                                                                        ((ArrayList<fc.e>)list27).add(j(xmlPullParser6, "SupplementalProperty"));
                                                                                    }
                                                                                    else {
                                                                                        final String s33 = "SupplementalProperty";
                                                                                        final boolean k8 = d0.k(xmlPullParser6, "Representation");
                                                                                        final String s34 = "Representation";
                                                                                        final String s35 = "InbandEventStream";
                                                                                        if (k8) {
                                                                                            final boolean empty = list30.isEmpty();
                                                                                            final ArrayList<fc.e> list31 = list24;
                                                                                            final String s36 = "ContentProtection";
                                                                                            ArrayList list32;
                                                                                            if (!empty) {
                                                                                                list32 = list30;
                                                                                            }
                                                                                            else {
                                                                                                list32 = list18;
                                                                                            }
                                                                                            final String attributeValue13 = xmlPullParser6.getAttributeValue((String)null, s26);
                                                                                            final String s37 = "EssentialProperty";
                                                                                            String s38 = s26;
                                                                                            final int m7 = m(xmlPullParser6, "bandwidth", -1);
                                                                                            String attributeValue14 = xmlPullParser6.getAttributeValue((String)null, s19);
                                                                                            if (attributeValue14 == null) {
                                                                                                attributeValue14 = attributeValue9;
                                                                                            }
                                                                                            String attributeValue15;
                                                                                            if ((attributeValue15 = xmlPullParser6.getAttributeValue((String)null, s25)) == null) {
                                                                                                attributeValue15 = attributeValue10;
                                                                                            }
                                                                                            final int m8 = m(xmlPullParser6, s24, m4);
                                                                                            int n30 = i2;
                                                                                            final String s39 = s27;
                                                                                            final ArrayList list33 = list30;
                                                                                            final int m9 = m(xmlPullParser6, s39, m5);
                                                                                            n31 = m5;
                                                                                            final float l3 = l(xmlPullParser6, l2);
                                                                                            final String s40 = s23;
                                                                                            final int m10 = m(xmlPullParser6, s40, m6);
                                                                                            final ArrayList list34 = new ArrayList();
                                                                                            final ArrayList list35 = new ArrayList();
                                                                                            final ArrayList list36 = new ArrayList<fc.e>(list26);
                                                                                            final ArrayList list37 = new ArrayList<fc.e>(list27);
                                                                                            final ArrayList list38 = new ArrayList();
                                                                                            String s41 = s24;
                                                                                            int n32 = 0;
                                                                                            int e2 = n27;
                                                                                            long n33 = f3;
                                                                                            k k9 = k7;
                                                                                            final long n34 = n29;
                                                                                            String s42 = null;
                                                                                            final String s43 = s37;
                                                                                            s44 = s25;
                                                                                            String s45 = s2;
                                                                                            ArrayList list39 = list28;
                                                                                            String s46 = s19;
                                                                                            ArrayList<fc.e> list40 = list23;
                                                                                            s47 = s21;
                                                                                            ArrayList list41 = list21;
                                                                                            ArrayList list42 = list20;
                                                                                            final ArrayList<a> list43 = list19;
                                                                                            final String s48 = s20;
                                                                                            final long n35 = n23;
                                                                                            String s49 = s18;
                                                                                            String s50 = s17;
                                                                                            final String s51 = s29;
                                                                                            final ArrayList list44 = list7;
                                                                                            ArrayList list45 = list32;
                                                                                            ArrayList list46 = list38;
                                                                                            long f5 = n34;
                                                                                            String s52 = attributeValue13;
                                                                                            XmlPullParser xmlPullParser7 = xmlPullParser6;
                                                                                            final int n36 = m4;
                                                                                            final String s53 = s;
                                                                                            final String s54 = s39;
                                                                                            ArrayList<fc.e> list47 = list25;
                                                                                            final String s55 = s40;
                                                                                            String s56 = s32;
                                                                                            ArrayList<fc.e> list49 = null;
                                                                                            String s60 = null;
                                                                                            int x = 0;
                                                                                            String s62 = null;
                                                                                            String s69;
                                                                                            String s70;
                                                                                            String a;
                                                                                            ArrayList<fc.e> list50;
                                                                                            int n38;
                                                                                            ArrayList list51;
                                                                                            ArrayList list52;
                                                                                            ArrayList<fc.e> list53;
                                                                                            ArrayList list54;
                                                                                            ArrayList list55;
                                                                                            String s73;
                                                                                            while (true) {
                                                                                                xmlPullParser.next();
                                                                                                String s61 = null;
                                                                                                int n37 = 0;
                                                                                                Label_3161: {
                                                                                                    if (d0.k(xmlPullParser7, s53)) {
                                                                                                        if (n32 == 0) {
                                                                                                            f5 = f(xmlPullParser7, f5);
                                                                                                            n32 = 1;
                                                                                                        }
                                                                                                        list46.addAll(g(xmlPullParser7, list45, b));
                                                                                                    }
                                                                                                    else {
                                                                                                        final ArrayList<fc.e> list48 = (ArrayList<fc.e>)list27;
                                                                                                        if (d0.k(xmlPullParser7, s56)) {
                                                                                                            e2 = e(xmlPullParser);
                                                                                                        }
                                                                                                        else {
                                                                                                            final String s57 = s22;
                                                                                                            if (d0.k(xmlPullParser7, s57)) {
                                                                                                                k9 = s(xmlPullParser7, (k.e)k9);
                                                                                                            }
                                                                                                            else {
                                                                                                                if (d0.k(xmlPullParser7, s47)) {
                                                                                                                    n33 = f(xmlPullParser7, n33);
                                                                                                                    final k.b b3 = (k.b)k9;
                                                                                                                    final String s58 = s57;
                                                                                                                    final String s59 = s56;
                                                                                                                    list49 = list48;
                                                                                                                    final k.b t = t(xmlPullParser, b3, n19, k5, f5, n33, l);
                                                                                                                    s60 = s42;
                                                                                                                    x = e2;
                                                                                                                    s61 = s59;
                                                                                                                    n37 = n32;
                                                                                                                    k9 = t;
                                                                                                                    s62 = s58;
                                                                                                                    break Label_3161;
                                                                                                                }
                                                                                                                final String s63 = s57;
                                                                                                                final String s64 = s43;
                                                                                                                final XmlPullParser xmlPullParser8 = xmlPullParser7;
                                                                                                                final String s65 = s56;
                                                                                                                list49 = list48;
                                                                                                                if (d0.k(xmlPullParser8, s49)) {
                                                                                                                    n33 = f(xmlPullParser8, n33);
                                                                                                                    k9 = u(xmlPullParser, (k.c)k9, list49, n19, k5, f5, n33, l);
                                                                                                                }
                                                                                                                else if (d0.k(xmlPullParser8, s36)) {
                                                                                                                    final Pair h2 = h(xmlPullParser);
                                                                                                                    final Object first2 = h2.first;
                                                                                                                    if (first2 != null) {
                                                                                                                        s42 = (String)first2;
                                                                                                                    }
                                                                                                                    final Object second2 = h2.second;
                                                                                                                    if (second2 != null) {
                                                                                                                        list34.add(second2);
                                                                                                                    }
                                                                                                                }
                                                                                                                else {
                                                                                                                    final String s66 = s35;
                                                                                                                    if (d0.k(xmlPullParser8, s66)) {
                                                                                                                        list35.add(j(xmlPullParser8, s66));
                                                                                                                    }
                                                                                                                    else if (d0.k(xmlPullParser8, s64)) {
                                                                                                                        list36.add(j(xmlPullParser8, s64));
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        final String s67 = s33;
                                                                                                                        if (d0.k(xmlPullParser8, s67)) {
                                                                                                                            list37.add(j(xmlPullParser8, s67));
                                                                                                                        }
                                                                                                                        else {
                                                                                                                            c(xmlPullParser);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                final String s68 = s42;
                                                                                                                x = e2;
                                                                                                                s62 = s63;
                                                                                                                n37 = n32;
                                                                                                                s61 = s65;
                                                                                                                s60 = s68;
                                                                                                                break Label_3161;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    s62 = s22;
                                                                                                    s60 = s42;
                                                                                                    s61 = s56;
                                                                                                    list49 = (ArrayList<fc.e>)list27;
                                                                                                    x = e2;
                                                                                                    n37 = n32;
                                                                                                }
                                                                                                s69 = s49;
                                                                                                s70 = s50;
                                                                                                a = s52;
                                                                                                list50 = list40;
                                                                                                n38 = n30;
                                                                                                list51 = list39;
                                                                                                s71 = s38;
                                                                                                list52 = list42;
                                                                                                list53 = list47;
                                                                                                list54 = list41;
                                                                                                list55 = list45;
                                                                                                s72 = s41;
                                                                                                s73 = s45;
                                                                                                s74 = s46;
                                                                                                if (d0.i(xmlPullParser7, s34)) {
                                                                                                    break;
                                                                                                }
                                                                                                s46 = s74;
                                                                                                s45 = s73;
                                                                                                s41 = s72;
                                                                                                list45 = list55;
                                                                                                final ArrayList<fc.e> list56 = list49;
                                                                                                list47 = list53;
                                                                                                list39 = list51;
                                                                                                list40 = list50;
                                                                                                s52 = a;
                                                                                                list42 = list52;
                                                                                                s56 = s61;
                                                                                                list27 = list56;
                                                                                                xmlPullParser7 = xmlPullParser;
                                                                                                s50 = s70;
                                                                                                s49 = s69;
                                                                                                list41 = list54;
                                                                                                s22 = s62;
                                                                                                s38 = s71;
                                                                                                n30 = n38;
                                                                                                n32 = n37;
                                                                                                s42 = s60;
                                                                                                e2 = x;
                                                                                            }
                                                                                            String s75 = null;
                                                                                            Label_3413: {
                                                                                                if (bd.o.k(attributeValue14)) {
                                                                                                    s75 = bd.o.b(attributeValue15);
                                                                                                }
                                                                                                else if (bd.o.m(attributeValue14)) {
                                                                                                    s75 = bd.o.j(attributeValue15);
                                                                                                }
                                                                                                else {
                                                                                                    Label_3410: {
                                                                                                        if (bd.o.l(attributeValue14)) {
                                                                                                            if ("application/x-rawcc".equals(attributeValue14)) {
                                                                                                                if (attributeValue15 == null) {
                                                                                                                    break Label_3410;
                                                                                                                }
                                                                                                                final String[] r = c0.R(attributeValue15);
                                                                                                                for (int length2 = r.length, n39 = 0; n39 < length2; ++n39) {
                                                                                                                    s75 = bd.o.e(r[n39]);
                                                                                                                    if (s75 != null && bd.o.l(s75)) {
                                                                                                                        break Label_3413;
                                                                                                                    }
                                                                                                                }
                                                                                                                break Label_3410;
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            final String s76 = attributeValue14;
                                                                                                            if (!"image".equals(bd.o.h(s76))) {
                                                                                                                if (!"application/mp4".equals(s76)) {
                                                                                                                    break Label_3410;
                                                                                                                }
                                                                                                                if ("text/vtt".equals(s75 = bd.o.e(attributeValue15))) {
                                                                                                                    s75 = "application/x-mp4-vtt";
                                                                                                                }
                                                                                                                break Label_3413;
                                                                                                            }
                                                                                                        }
                                                                                                        s75 = attributeValue14;
                                                                                                        break Label_3413;
                                                                                                    }
                                                                                                    s75 = null;
                                                                                                }
                                                                                            }
                                                                                            final boolean equals2 = "audio/eac3".equals(s75);
                                                                                            final String s77 = "ec+3";
                                                                                            String k10 = s75;
                                                                                            Label_3562: {
                                                                                                if (equals2) {
                                                                                                    int n40 = 0;
                                                                                                    while (true) {
                                                                                                        while (n40 < list37.size()) {
                                                                                                            final fc.e e3 = list37.get(n40);
                                                                                                            final String a2 = e3.a;
                                                                                                            if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(a2) && "JOC".equals(e3.b)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(a2) && "ec+3".equals(e3.b))) {
                                                                                                                final String s78 = "audio/eac3-joc";
                                                                                                                k10 = s78;
                                                                                                                if ("audio/eac3-joc".equals(s78)) {
                                                                                                                    k10 = s78;
                                                                                                                    attributeValue15 = s77;
                                                                                                                }
                                                                                                                break Label_3562;
                                                                                                            }
                                                                                                            else {
                                                                                                                ++n40;
                                                                                                            }
                                                                                                        }
                                                                                                        final String s78 = "audio/eac3";
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            int d2;
                                                                                            int n41 = d2 = 0;
                                                                                            String s79;
                                                                                            while (true) {
                                                                                                final int size = list53.size();
                                                                                                s79 = "urn:mpeg:dash:role:2011";
                                                                                                if (n41 >= size) {
                                                                                                    break;
                                                                                                }
                                                                                                final fc.e e4 = list53.get(n41);
                                                                                                int n42 = d2;
                                                                                                if (mk2.e.w((CharSequence)"urn:mpeg:dash:role:2011", e4.a)) {
                                                                                                    final String b4 = e4.b;
                                                                                                    int n43 = 0;
                                                                                                    Label_3664: {
                                                                                                        if (b4 != null) {
                                                                                                            if (b4.equals("forced_subtitle") || b4.equals("forced-subtitle")) {
                                                                                                                n43 = 2;
                                                                                                                break Label_3664;
                                                                                                            }
                                                                                                        }
                                                                                                        n43 = 0;
                                                                                                    }
                                                                                                    n42 = (d2 | n43);
                                                                                                }
                                                                                                ++n41;
                                                                                                d2 = n42;
                                                                                            }
                                                                                            final ArrayList<fc.e> list57 = list53;
                                                                                            int n45;
                                                                                            int n46;
                                                                                            for (int n44 = n45 = 0; n44 < list57.size(); ++n44, n45 = n46) {
                                                                                                final fc.e e5 = list57.get(n44);
                                                                                                n46 = n45;
                                                                                                if (mk2.e.w((CharSequence)"urn:mpeg:dash:role:2011", e5.a)) {
                                                                                                    n46 = (n45 | q(e5.b));
                                                                                                }
                                                                                            }
                                                                                            final ArrayList<fc.e> list58 = list57;
                                                                                            int n48;
                                                                                            int n47;
                                                                                            ArrayList<fc.e> list59;
                                                                                            fc.e e6;
                                                                                            int n49;
                                                                                            String b5;
                                                                                            int n50 = 0;
                                                                                            int n51 = 0;
                                                                                            for (n47 = (n48 = 0), list59 = list31; n47 < list59.size(); ++n47, n48 = n49) {
                                                                                                e6 = list59.get(n47);
                                                                                                if (mk2.e.w((CharSequence)s79, e6.a)) {
                                                                                                    n49 = (q(e6.b) | n48);
                                                                                                }
                                                                                                else {
                                                                                                    n49 = n48;
                                                                                                    if (mk2.e.w((CharSequence)"urn:tva:metadata:cs:AudioPurposeCS:2007", e6.a)) {
                                                                                                        b5 = e6.b;
                                                                                                        Label_4069: {
                                                                                                            if (b5 != null) {
                                                                                                                Label_4002: {
                                                                                                                    switch (b5) {
                                                                                                                        case "6": {
                                                                                                                            n50 = 4;
                                                                                                                            break Label_4002;
                                                                                                                        }
                                                                                                                        case "4": {
                                                                                                                            n50 = 3;
                                                                                                                            break Label_4002;
                                                                                                                        }
                                                                                                                        case "3": {
                                                                                                                            n50 = 2;
                                                                                                                            break Label_4002;
                                                                                                                        }
                                                                                                                        case "2": {
                                                                                                                            n50 = 1;
                                                                                                                            break Label_4002;
                                                                                                                        }
                                                                                                                        case "1": {
                                                                                                                            n50 = 0;
                                                                                                                            break Label_4002;
                                                                                                                        }
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    n50 = -1;
                                                                                                                }
                                                                                                                if (n50 == 0) {
                                                                                                                    n51 = 512;
                                                                                                                    break Label_4069;
                                                                                                                }
                                                                                                                if (n50 == 1) {
                                                                                                                    n51 = 2048;
                                                                                                                    break Label_4069;
                                                                                                                }
                                                                                                                if (n50 == 2) {
                                                                                                                    n51 = 4;
                                                                                                                    break Label_4069;
                                                                                                                }
                                                                                                                if (n50 == 3) {
                                                                                                                    n51 = 8;
                                                                                                                    break Label_4069;
                                                                                                                }
                                                                                                                if (n50 == 4) {
                                                                                                                    n51 = 1;
                                                                                                                    break Label_4069;
                                                                                                                }
                                                                                                            }
                                                                                                            n51 = 0;
                                                                                                        }
                                                                                                        n49 = (n51 | n48);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            final int r2 = r(list36);
                                                                                            final int r3 = r(list37);
                                                                                            final n$a n$a = new n$a();
                                                                                            n$a.a = a;
                                                                                            n$a.j = attributeValue14;
                                                                                            n$a.k = k10;
                                                                                            n$a.h = attributeValue15;
                                                                                            n$a.g = m7;
                                                                                            n$a.d = d2;
                                                                                            n$a.e = (n45 | n48 | r2 | r3);
                                                                                            n$a.c = c;
                                                                                            if (bd.o.m(k10)) {
                                                                                                n$a.p = m8;
                                                                                                n$a.q = m9;
                                                                                                n$a.r = l3;
                                                                                            }
                                                                                            else if (bd.o.k(k10)) {
                                                                                                n$a.x = x;
                                                                                                n$a.y = m10;
                                                                                            }
                                                                                            else if (bd.o.l(k10)) {
                                                                                                int c2 = 0;
                                                                                                Label_4555: {
                                                                                                    if ("application/cea-608".equals(k10)) {
                                                                                                        for (int n52 = 0; n52 < list59.size(); ++n52) {
                                                                                                            final fc.e e7 = list59.get(n52);
                                                                                                            if ("urn:scte:dash:cc:cea-608:2015".equals(e7.a)) {
                                                                                                                final String b6 = e7.b;
                                                                                                                if (b6 != null) {
                                                                                                                    final Matcher matcher = fc.d.c.matcher(b6);
                                                                                                                    if (matcher.matches()) {
                                                                                                                        c2 = Integer.parseInt(matcher.group(1));
                                                                                                                        break Label_4555;
                                                                                                                    }
                                                                                                                    final String value = String.valueOf(e7.b);
                                                                                                                    String concat;
                                                                                                                    if (value.length() != 0) {
                                                                                                                        concat = "Unable to parse CEA-608 channel number from: ".concat(value);
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        concat = new String("Unable to parse CEA-608 channel number from: ");
                                                                                                                    }
                                                                                                                    Log.w("MpdParser", concat);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if ("application/cea-708".equals(k10)) {
                                                                                                        for (int n53 = 0; n53 < list59.size(); ++n53) {
                                                                                                            final fc.e e8 = list59.get(n53);
                                                                                                            if ("urn:scte:dash:cc:cea-708:2015".equals(e8.a)) {
                                                                                                                final String b7 = e8.b;
                                                                                                                if (b7 != null) {
                                                                                                                    final Matcher matcher2 = fc.d.d.matcher(b7);
                                                                                                                    if (matcher2.matches()) {
                                                                                                                        c2 = Integer.parseInt(matcher2.group(1));
                                                                                                                        break Label_4555;
                                                                                                                    }
                                                                                                                    final String value2 = String.valueOf(e8.b);
                                                                                                                    String concat2;
                                                                                                                    if (value2.length() != 0) {
                                                                                                                        concat2 = "Unable to parse CEA-708 service block number from: ".concat(value2);
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        concat2 = new String("Unable to parse CEA-708 service block number from: ");
                                                                                                                    }
                                                                                                                    Log.w("MpdParser", concat2);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    c2 = -1;
                                                                                                }
                                                                                                n$a.C = c2;
                                                                                            }
                                                                                            else if ("image".equals(bd.o.h(k10))) {
                                                                                                n$a.p = m8;
                                                                                                n$a.q = m9;
                                                                                            }
                                                                                            final com.google.android.exoplayer2.n n54 = new com.google.android.exoplayer2.n(n$a);
                                                                                            if (k9 == null) {
                                                                                                k9 = new k.e();
                                                                                            }
                                                                                            if (list46.isEmpty()) {
                                                                                                list46 = list55;
                                                                                            }
                                                                                            final d.d$a d$a = new d.d$a(n54, (List)list46, k9, s60, list34, list35, list36, list37);
                                                                                            final int i4 = bd.o.i(n54.q);
                                                                                            int n55 = n38;
                                                                                            if (n55 == -1) {
                                                                                                n55 = i4;
                                                                                            }
                                                                                            else if (i4 != -1) {
                                                                                                d0.f(n55 == i4);
                                                                                            }
                                                                                            list51.add(d$a);
                                                                                            xmlPullParser9 = xmlPullParser;
                                                                                            final ArrayList list60 = list51;
                                                                                            final int n56 = 1;
                                                                                            f4 = n29;
                                                                                            s80 = s70;
                                                                                            final String s81 = s69;
                                                                                            s82 = c;
                                                                                            list61 = list50;
                                                                                            s83 = attributeValue12;
                                                                                            n57 = n55;
                                                                                            s84 = s62;
                                                                                            list62 = list59;
                                                                                            s85 = s53;
                                                                                            s86 = s54;
                                                                                            s87 = s73;
                                                                                            m4 = n36;
                                                                                            list63 = list54;
                                                                                            list64 = list49;
                                                                                            list65 = list44;
                                                                                            n9 = n56;
                                                                                            s88 = s55;
                                                                                            list66 = list58;
                                                                                            s89 = s28;
                                                                                            list5 = list52;
                                                                                            list67 = list33;
                                                                                            n23 = n35;
                                                                                            s90 = s48;
                                                                                            list68 = list60;
                                                                                            list16 = list43;
                                                                                            s91 = s51;
                                                                                            s92 = s81;
                                                                                            break Label_5416;
                                                                                        }
                                                                                        Label_5068: {
                                                                                            if (d0.k(xmlPullParser6, s22)) {
                                                                                                k7 = s(xmlPullParser6, (k.e)k7);
                                                                                            }
                                                                                            else {
                                                                                                final String s93 = s21;
                                                                                                if (d0.k(xmlPullParser6, s93)) {
                                                                                                    f3 = f(xmlPullParser6, f3);
                                                                                                    k7 = t(xmlPullParser, (k.b)k7, n19, k5, n29, f3, l);
                                                                                                }
                                                                                                else {
                                                                                                    if (d0.k(xmlPullParser6, s18)) {
                                                                                                        f6 = f(xmlPullParser6, f3);
                                                                                                        final k.c c3 = (k.c)k7;
                                                                                                        s21 = s93;
                                                                                                        k7 = u(xmlPullParser, c3, list27, n19, k5, n29, f6, l);
                                                                                                        break Label_5068;
                                                                                                    }
                                                                                                    final XmlPullParser xmlPullParser10 = xmlPullParser6;
                                                                                                    if (d0.k(xmlPullParser10, s35)) {
                                                                                                        list23.add(j(xmlPullParser10, s35));
                                                                                                        s94 = attributeValue12;
                                                                                                        break Label_5201;
                                                                                                    }
                                                                                                    if (d0.k(xmlPullParser10, "Label")) {
                                                                                                        String s95 = "";
                                                                                                        String text;
                                                                                                        do {
                                                                                                            xmlPullParser10.next();
                                                                                                            if (xmlPullParser10.getEventType() == 4) {
                                                                                                                text = xmlPullParser10.getText();
                                                                                                            }
                                                                                                            else {
                                                                                                                c(xmlPullParser10);
                                                                                                                text = s95;
                                                                                                            }
                                                                                                            s95 = text;
                                                                                                        } while (!d0.i(xmlPullParser10, "Label"));
                                                                                                        s94 = text;
                                                                                                        break Label_5201;
                                                                                                    }
                                                                                                    s94 = attributeValue12;
                                                                                                    if (d0.j(xmlPullParser)) {
                                                                                                        c(xmlPullParser);
                                                                                                        s94 = attributeValue12;
                                                                                                    }
                                                                                                    break Label_5201;
                                                                                                }
                                                                                            }
                                                                                            f6 = f3;
                                                                                        }
                                                                                        break Label_5209;
                                                                                    }
                                                                                }
                                                                                s94 = attributeValue12;
                                                                            }
                                                                            f6 = f3;
                                                                            attributeValue12 = s94;
                                                                        }
                                                                        final String s96 = s18;
                                                                        final String s97 = s29;
                                                                        final ArrayList<a> list69 = list19;
                                                                        final ArrayList list70 = list28;
                                                                        final String s98 = s20;
                                                                        final String s99 = s26;
                                                                        final ArrayList list71 = list30;
                                                                        final ArrayList list72 = list20;
                                                                        final ArrayList<fc.e> list73 = list25;
                                                                        final int n58 = 1;
                                                                        final ArrayList list74 = list7;
                                                                        final ArrayList<fc.e> list75 = (ArrayList<fc.e>)list27;
                                                                        final String s100 = s25;
                                                                        n31 = m5;
                                                                        final ArrayList list76 = list21;
                                                                        s72 = s24;
                                                                        final String s101 = s2;
                                                                        s74 = s19;
                                                                        final String s102 = s27;
                                                                        final String s103 = s;
                                                                        list62 = list24;
                                                                        s84 = s22;
                                                                        list61 = list23;
                                                                        xmlPullParser9 = xmlPullParser6;
                                                                        s82 = c;
                                                                        final String s104 = attributeValue12;
                                                                        n57 = i2;
                                                                        final String s105 = s17;
                                                                        s92 = s96;
                                                                        s91 = s97;
                                                                        list16 = list69;
                                                                        list68 = list70;
                                                                        s47 = s21;
                                                                        s90 = s98;
                                                                        s71 = s99;
                                                                        list67 = list71;
                                                                        list5 = list72;
                                                                        f3 = f6;
                                                                        s89 = s28;
                                                                        list66 = list73;
                                                                        s88 = s23;
                                                                        n9 = n58;
                                                                        list65 = list74;
                                                                        list64 = list75;
                                                                        s44 = s100;
                                                                        list63 = list76;
                                                                        s87 = s101;
                                                                        s86 = s102;
                                                                        s85 = s103;
                                                                        s80 = s105;
                                                                        s83 = s104;
                                                                        f4 = n29;
                                                                        break Label_5416;
                                                                    }
                                                                    final String attributeValue16 = xmlPullParser6.getAttributeValue((String)null, s2);
                                                                    if (c == null) {
                                                                        c = attributeValue16;
                                                                    }
                                                                    else if (attributeValue16 != null) {
                                                                        d0.f(c.equals(attributeValue16));
                                                                    }
                                                                    i3 = i(xmlPullParser);
                                                                    if (i2 == -1) {
                                                                        s30 = c;
                                                                        e = n27;
                                                                        s31 = s28;
                                                                    }
                                                                    else if (i3 == -1) {
                                                                        s30 = c;
                                                                        i3 = i2;
                                                                        e = n27;
                                                                        s31 = s28;
                                                                    }
                                                                    else {
                                                                        d0.f(i2 == i3);
                                                                        s30 = c;
                                                                        i3 = i2;
                                                                        e = n27;
                                                                        s31 = s28;
                                                                    }
                                                                }
                                                            }
                                                            s28 = s31;
                                                            n27 = e;
                                                            i2 = i3;
                                                            c = s30;
                                                        }
                                                        final ArrayList list77 = list30;
                                                        final String s106 = s;
                                                        final String s107 = s2;
                                                        final ArrayList<fc.e> list78 = list24;
                                                        final String s108 = s29;
                                                        final String s109 = s18;
                                                        final String s110 = s20;
                                                        final ArrayList<a> list79 = list19;
                                                        final ArrayList list80 = list20;
                                                        final ArrayList list81 = list21;
                                                        final String s111 = s21;
                                                        n31 = m5;
                                                        final ArrayList list82 = list28;
                                                        s86 = s27;
                                                        final String s112 = s26;
                                                        final int n59 = 1;
                                                        s80 = s17;
                                                        s88 = s23;
                                                        final ArrayList list83 = list7;
                                                        s82 = c;
                                                        list61 = list23;
                                                        s83 = attributeValue12;
                                                        n57 = i2;
                                                        xmlPullParser9 = xmlPullParser6;
                                                        s84 = s22;
                                                        list62 = list78;
                                                        s85 = s106;
                                                        s74 = s19;
                                                        s87 = s107;
                                                        s72 = s24;
                                                        list63 = list81;
                                                        s44 = s25;
                                                        list64 = list27;
                                                        list65 = list83;
                                                        n9 = n59;
                                                        list66 = list25;
                                                        s89 = s28;
                                                        list5 = list80;
                                                        list67 = list77;
                                                        s71 = s112;
                                                        s90 = s110;
                                                        s47 = s111;
                                                        list68 = list82;
                                                        list16 = list79;
                                                        s91 = s108;
                                                        s92 = s109;
                                                    }
                                                    if (d0.i(xmlPullParser9, s80)) {
                                                        break;
                                                    }
                                                    final String s113 = s80;
                                                    final String s114 = s85;
                                                    final String s115 = s86;
                                                    attributeValue12 = s83;
                                                    final String s116 = s87;
                                                    final String s117 = s72;
                                                    final String s118 = s44;
                                                    s23 = s88;
                                                    final ArrayList list84 = list18;
                                                    final ArrayList list85 = list67;
                                                    s26 = s71;
                                                    final String s119 = s90;
                                                    s21 = s47;
                                                    list28 = list68;
                                                    final ArrayList<a> list86 = list16;
                                                    final String s120 = s92;
                                                    list23 = list61;
                                                    list27 = list64;
                                                    s22 = s84;
                                                    final ArrayList list87 = list63;
                                                    final ArrayList list88 = list5;
                                                    c = s82;
                                                    list30 = list85;
                                                    list25 = list66;
                                                    i2 = n57;
                                                    s = s114;
                                                    s2 = s116;
                                                    xmlPullParser6 = xmlPullParser9;
                                                    list24 = list62;
                                                    s19 = s74;
                                                    list18 = list84;
                                                    list7 = list65;
                                                    s29 = s91;
                                                    s17 = s113;
                                                    s18 = s120;
                                                    s20 = s119;
                                                    list19 = list86;
                                                    list20 = list88;
                                                    list21 = list87;
                                                    m5 = n31;
                                                    s28 = s89;
                                                    s27 = s115;
                                                    s24 = s117;
                                                    s25 = s118;
                                                }
                                                final ArrayList list89 = new ArrayList<j>(list68.size());
                                                int n60 = 0;
                                                String b8 = s83;
                                                while (n60 < list68.size()) {
                                                    final d.d$a d$a2 = (d.d$a)list68.get(n60);
                                                    final com.google.android.exoplayer2.n a3 = d$a2.a;
                                                    a3.getClass();
                                                    final n$a n$a2 = new n$a(a3);
                                                    if (b8 != null) {
                                                        n$a2.b = b8;
                                                    }
                                                    String d3;
                                                    if ((d3 = d$a2.d) == null) {
                                                        d3 = s89;
                                                    }
                                                    final ArrayList e9 = d$a2.e;
                                                    e9.addAll(list22);
                                                    if (!e9.isEmpty()) {
                                                    Label_5725:
                                                        for (int n61 = e9.size() - 1; n61 >= 0; --n61) {
                                                            final b$b b$b = e9.get(n61);
                                                            int n62;
                                                            if (b$b.j != null) {
                                                                n62 = n9;
                                                            }
                                                            else {
                                                                n62 = 0;
                                                            }
                                                            String s121 = b8;
                                                            if (n62 == 0) {
                                                                int n63 = 0;
                                                                while (true) {
                                                                    s121 = b8;
                                                                    if (n63 >= e9.size()) {
                                                                        break;
                                                                    }
                                                                    final b$b b$b2 = e9.get(n63);
                                                                    int n64;
                                                                    if (b$b2.j != null) {
                                                                        n64 = n9;
                                                                    }
                                                                    else {
                                                                        n64 = 0;
                                                                    }
                                                                    int n66 = 0;
                                                                    Label_5699: {
                                                                        if (n64 != 0) {
                                                                            int n65;
                                                                            if (b$b.j != null) {
                                                                                n65 = n9;
                                                                            }
                                                                            else {
                                                                                n65 = 0;
                                                                            }
                                                                            if (n65 == 0 && b$b2.a(b$b.g)) {
                                                                                n66 = n9;
                                                                                break Label_5699;
                                                                            }
                                                                        }
                                                                        n66 = 0;
                                                                    }
                                                                    if (n66 != 0) {
                                                                        e9.remove(n61);
                                                                        continue Label_5725;
                                                                    }
                                                                    ++n63;
                                                                }
                                                            }
                                                            b8 = s121;
                                                        }
                                                        n$a2.n = new com.google.android.exoplayer2.drm.b(d3, e9);
                                                    }
                                                    final ArrayList f7 = d$a2.f;
                                                    f7.addAll(list61);
                                                    final long g = d$a2.g;
                                                    final com.google.android.exoplayer2.n n67 = new com.google.android.exoplayer2.n(n$a2);
                                                    final ImmutableList b9 = d$a2.b;
                                                    final k c4 = d$a2.c;
                                                    final List h3 = d$a2.h;
                                                    final List i5 = d$a2.i;
                                                    j j2;
                                                    if (c4 instanceof k.e) {
                                                        j2 = new j.b(g, n67, b9, (k.e)c4, f7, h3, i5);
                                                    }
                                                    else {
                                                        if (!(c4 instanceof k.a)) {
                                                            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                        }
                                                        j2 = new j.a(g, n67, b9, (k.a)c4, f7, h3, i5);
                                                    }
                                                    list89.add(j2);
                                                    ++n60;
                                                }
                                                list16.add(new a(m3, n57, list89, (List)list62, (List)list26, (List)list64));
                                                s13 = s91;
                                                s122 = s85;
                                                s14 = s7;
                                                s15 = s71;
                                                s123 = s90;
                                                s12 = s87;
                                                list4 = list63;
                                                b2 = list65;
                                            }
                                            else {
                                                s15 = s10;
                                                final String s124 = s9;
                                                list5 = list12;
                                                final ArrayList list90 = list11;
                                                s11 = s;
                                                s12 = s2;
                                                n9 = 1;
                                                final int n68 = 1;
                                                if (d0.k(xmlPullParser, "EventStream")) {
                                                    final String s125 = s4;
                                                    String attributeValue17;
                                                    if ((attributeValue17 = xmlPullParser.getAttributeValue((String)null, s125)) == null) {
                                                        attributeValue17 = "";
                                                    }
                                                    String attributeValue18 = xmlPullParser.getAttributeValue((String)null, s7);
                                                    if (attributeValue18 == null) {
                                                        attributeValue18 = "";
                                                    }
                                                    final long n69 = n(xmlPullParser, "timescale", 1L);
                                                    final ArrayList<Pair> list91 = new ArrayList<Pair>();
                                                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                                    String s126 = s124;
                                                    final String s127 = s15;
                                                    String s131;
                                                    while (true) {
                                                        xmlPullParser.next();
                                                        final String s128 = "Event";
                                                        if (d0.k(xmlPullParser, "Event")) {
                                                            final long n70 = n(xmlPullParser, s127, 0L);
                                                            final long n71 = n(xmlPullParser, s126, -9223372036854775807L);
                                                            final long n72 = n(xmlPullParser, "presentationTime", 0L);
                                                            final long p2 = c0.P(n71, 1000L, n69);
                                                            final long p3 = c0.P(n72, 1000000L, n69);
                                                            String attributeValue19;
                                                            if ((attributeValue19 = xmlPullParser.getAttributeValue((String)null, "messageData")) == null) {
                                                                attributeValue19 = null;
                                                            }
                                                            byteArrayOutputStream.reset();
                                                            final XmlSerializer serializer = Xml.newSerializer();
                                                            serializer.setOutput((OutputStream)byteArrayOutputStream, tg.b.c.name());
                                                            xmlPullParser.nextToken();
                                                            while (!d0.i(xmlPullParser, s128)) {
                                                                Label_6605: {
                                                                    switch (xmlPullParser.getEventType()) {
                                                                        case 10: {
                                                                            serializer.docdecl(xmlPullParser.getText());
                                                                            break;
                                                                        }
                                                                        case 9: {
                                                                            serializer.comment(xmlPullParser.getText());
                                                                            break;
                                                                        }
                                                                        case 8: {
                                                                            serializer.processingInstruction(xmlPullParser.getText());
                                                                            break;
                                                                        }
                                                                        case 7: {
                                                                            serializer.ignorableWhitespace(xmlPullParser.getText());
                                                                            break;
                                                                        }
                                                                        case 6: {
                                                                            serializer.entityRef(xmlPullParser.getText());
                                                                            break;
                                                                        }
                                                                        case 5: {
                                                                            serializer.cdsect(xmlPullParser.getText());
                                                                            break;
                                                                        }
                                                                        case 4: {
                                                                            serializer.text(xmlPullParser.getText());
                                                                            break;
                                                                        }
                                                                        case 3: {
                                                                            serializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            serializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                            int n73 = 0;
                                                                            final String s129 = s7;
                                                                            final String s130 = s126;
                                                                            while (true) {
                                                                                s126 = s130;
                                                                                s7 = s129;
                                                                                if (n73 >= xmlPullParser.getAttributeCount()) {
                                                                                    break Label_6605;
                                                                                }
                                                                                serializer.attribute(xmlPullParser.getAttributeNamespace(n73), xmlPullParser.getAttributeName(n73), xmlPullParser.getAttributeValue(n73));
                                                                                ++n73;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 1: {
                                                                            serializer.endDocument();
                                                                            break;
                                                                        }
                                                                        case 0: {
                                                                            serializer.startDocument((String)null, Boolean.FALSE);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                xmlPullParser.nextToken();
                                                            }
                                                            serializer.flush();
                                                            byte[] array = byteArrayOutputStream.toByteArray();
                                                            if (attributeValue19 != null) {
                                                                array = c0.C(attributeValue19);
                                                            }
                                                            s123 = s126;
                                                            list91.add(Pair.create((Object)p3, (Object)new sb.a(attributeValue17, attributeValue18, p2, n70, array)));
                                                            s131 = s7;
                                                        }
                                                        else {
                                                            c(xmlPullParser);
                                                            s123 = s126;
                                                            s131 = s7;
                                                        }
                                                        if (d0.i(xmlPullParser, "EventStream")) {
                                                            break;
                                                        }
                                                        s7 = s131;
                                                        s126 = s123;
                                                    }
                                                    final long[] array2 = new long[list91.size()];
                                                    final sb.a[] array3 = new sb.a[list91.size()];
                                                    for (int n74 = 0; n74 < list91.size(); ++n74) {
                                                        final Pair pair = list91.get(n74);
                                                        array2[n74] = (long)pair.first;
                                                        array3[n74] = (sb.a)pair.second;
                                                    }
                                                    list9.add(new f(attributeValue17, attributeValue18, array2, array3));
                                                    s13 = s125;
                                                    s122 = s11;
                                                    s14 = s131;
                                                    s15 = s127;
                                                    list4 = list90;
                                                    b2 = list7;
                                                    n9 = n68;
                                                    list16 = list8;
                                                }
                                                else {
                                                    list16 = list8;
                                                    s16 = s124;
                                                    if (d0.k(xmlPullParser, "SegmentBase")) {
                                                        s8 = s(xmlPullParser, null);
                                                        xmlPullParser5 = xmlPullParser;
                                                        s13 = s4;
                                                        s14 = s7;
                                                        list4 = list90;
                                                        b2 = list7;
                                                        break Label_7233;
                                                    }
                                                    k.a a4;
                                                    if (d0.k(xmlPullParser, "SegmentList")) {
                                                        n20 = f(xmlPullParser, -9223372036854775807L);
                                                        a4 = t(xmlPullParser, null, n19, k5, n26, n20, l);
                                                    }
                                                    else {
                                                        s14 = s7;
                                                        if (d0.k(xmlPullParser, s18)) {
                                                            n20 = f(xmlPullParser, -9223372036854775807L);
                                                            a4 = u(xmlPullParser, null, (List)ImmutableList.of(), n19, k5, n26, n20, l);
                                                        }
                                                        else {
                                                            s13 = s4;
                                                            if (d0.k(xmlPullParser, "AssetIdentifier")) {
                                                                j(xmlPullParser, "AssetIdentifier");
                                                                s122 = s11;
                                                                s123 = s16;
                                                                list4 = list90;
                                                                b2 = list7;
                                                                n9 = n68;
                                                                break Label_7218;
                                                            }
                                                            c(xmlPullParser);
                                                            n9 = n68;
                                                            b2 = list7;
                                                            list4 = list90;
                                                            s123 = s16;
                                                            s122 = s11;
                                                            break Label_7218;
                                                        }
                                                    }
                                                    s8 = a4;
                                                    s13 = s4;
                                                    s122 = s11;
                                                    s14 = s7;
                                                    s123 = s16;
                                                    list4 = list90;
                                                    b2 = list7;
                                                    n9 = n68;
                                                }
                                            }
                                        }
                                        s16 = s123;
                                        s11 = s122;
                                        xmlPullParser5 = xmlPullParser;
                                    }
                                }
                                if (d0.i(xmlPullParser5, s6)) {
                                    final Pair create = Pair.create((Object)new g(attributeValue8, k4, (ArrayList)list16, (List)list9), (Object)k5);
                                    final g g2 = (g)create.first;
                                    int n75;
                                    if (g2.b == -9223372036854775807L) {
                                        if (!equals) {
                                            final int size2 = list5.size();
                                            final StringBuilder sb = new StringBuilder(47);
                                            sb.append("Unable to determine start of period ");
                                            sb.append(size2);
                                            throw ParserException.createForMalformedManifest(sb.toString(), (Throwable)null);
                                        }
                                        n75 = n9;
                                        n5 = n23;
                                    }
                                    else {
                                        final long longValue = (long)create.second;
                                        long n76;
                                        if (longValue == -9223372036854775807L) {
                                            n76 = -9223372036854775807L;
                                        }
                                        else {
                                            n76 = g2.b + longValue;
                                        }
                                        list5.add(g2);
                                        n75 = n7;
                                        n5 = n76;
                                    }
                                    xmlPullParser3 = xmlPullParser;
                                    xmlPullParser4 = xmlPullParser;
                                    n7 = n75;
                                    n14 = n18;
                                    break Label_7509;
                                }
                                s = s11;
                                final String s132 = s14;
                                list12 = list5;
                                final ArrayList<a> list92 = list16;
                                n22 = n26;
                                s10 = s15;
                                s9 = s16;
                                list11 = list4;
                                list8 = list92;
                                s2 = s12;
                                list7 = b2;
                                s4 = s13;
                                s7 = s132;
                            }
                        }
                    }
                    n14 = n3;
                }
                final ArrayList list93 = list2;
                n9 = 1;
                list5 = list;
                xmlPullParser4 = xmlPullParser2;
                list4 = list93;
            }
            if (d0.i(xmlPullParser3, "MPD")) {
                long n77 = k;
                if (k == -9223372036854775807L) {
                    if (n5 != -9223372036854775807L) {
                        n77 = n5;
                    }
                    else {
                        if (!equals) {
                            throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", (Throwable)null);
                        }
                        n77 = k;
                    }
                }
                if (!list5.isEmpty()) {
                    return new c(m, n77, i, equals, j, l, k2, m2, (h)o, n8, (l)o2, (Uri)d, list5);
                }
                throw ParserException.createForMalformedManifest("No periods found.", (Throwable)null);
            }
            else {
                final XmlPullParser xmlPullParser11 = xmlPullParser4;
                n3 = n14;
                list = list5;
                list2 = list4;
                xmlPullParser2 = xmlPullParser11;
            }
        }
    }
    
    public static fc.i p(final XmlPullParser xmlPullParser, String attributeValue, final String s) {
        attributeValue = xmlPullParser.getAttributeValue((String)null, attributeValue);
        final String attributeValue2 = xmlPullParser.getAttributeValue((String)null, s);
        long long1;
        if (attributeValue2 != null) {
            final String[] split = attributeValue2.split("-");
            final long n = long1 = Long.parseLong(split[0]);
            if (split.length == 2) {
                final long n2 = Long.parseLong(split[1]) - n + 1L;
                return new fc.i(attributeValue, n, n2);
            }
        }
        else {
            long1 = 0L;
        }
        final long n3 = -1L;
        final long n = long1;
        final long n2 = n3;
        return new fc.i(attributeValue, n, n2);
    }
    
    public static int q(final String s) {
        if (s == null) {
            return 0;
        }
        int n = -1;
        switch (s) {
            case "supplementary": {
                n = 12;
                break;
            }
            case "emergency": {
                n = 11;
                break;
            }
            case "commentary": {
                n = 10;
                break;
            }
            case "caption": {
                n = 9;
                break;
            }
            case "sign": {
                n = 8;
                break;
            }
            case "main": {
                n = 7;
                break;
            }
            case "dub": {
                n = 6;
                break;
            }
            case "forced-subtitle": {
                n = 5;
                break;
            }
            case "alternate": {
                n = 4;
                break;
            }
            case "forced_subtitle": {
                n = 3;
                break;
            }
            case "enhanced-audio-intelligibility": {
                n = 2;
                break;
            }
            case "description": {
                n = 1;
                break;
            }
            case "subtitle": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                return 0;
            }
            case 12: {
                return 4;
            }
            case 11: {
                return 32;
            }
            case 10: {
                return 8;
            }
            case 9: {
                return 64;
            }
            case 8: {
                return 256;
            }
            case 7: {
                return 1;
            }
            case 6: {
                return 16;
            }
            case 4: {
                return 2;
            }
            case 2: {
                return 2048;
            }
            case 1: {
                return 512;
            }
            case 0:
            case 3:
            case 5: {
                return 128;
            }
        }
    }
    
    public static int r(final ArrayList list) {
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            int n2 = n;
            if (mk2.e.w((CharSequence)"http://dashif.org/guidelines/trickmode", ((fc.e)list.get(i)).a)) {
                n2 = (n | 0x4000);
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public static k.e s(final XmlPullParser xmlPullParser, final k.e e) throws XmlPullParserException, IOException {
        long b;
        if (e != null) {
            b = e.b;
        }
        else {
            b = 1L;
        }
        final long n = n(xmlPullParser, "timescale", b);
        long e2 = 0L;
        long c;
        if (e != null) {
            c = e.c;
        }
        else {
            c = 0L;
        }
        final long n2 = n(xmlPullParser, "presentationTimeOffset", c);
        long n3;
        if (e != null) {
            n3 = e.d;
        }
        else {
            n3 = 0L;
        }
        if (e != null) {
            e2 = e.e;
        }
        fc.i a = null;
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "indexRange");
        if (attributeValue != null) {
            final String[] split = attributeValue.split("-");
            n3 = Long.parseLong(split[0]);
            e2 = Long.parseLong(split[1]) - n3 + 1L;
        }
        if (e != null) {
            a = e.a;
        }
        fc.i p2;
        do {
            xmlPullParser.next();
            if (d0.k(xmlPullParser, "Initialization")) {
                p2 = p(xmlPullParser, "sourceURL", "range");
            }
            else {
                c(xmlPullParser);
                p2 = a;
            }
            a = p2;
        } while (!d0.i(xmlPullParser, "SegmentBase"));
        return new k.e(p2, n, n2, n3, e2);
    }
    
    public static k.b t(final XmlPullParser xmlPullParser, final k.b b, final long n, final long n2, long n3, final long n4, final long n5) throws XmlPullParserException, IOException {
        final long n6 = 1L;
        long b2;
        if (b != null) {
            b2 = b.b;
        }
        else {
            b2 = 1L;
        }
        final long n7 = n(xmlPullParser, "timescale", b2);
        long c;
        if (b != null) {
            c = b.c;
        }
        else {
            c = 0L;
        }
        final long n8 = n(xmlPullParser, "presentationTimeOffset", c);
        long e;
        if (b != null) {
            e = b.e;
        }
        else {
            e = -9223372036854775807L;
        }
        final long n9 = n(xmlPullParser, "duration", e);
        long d = n6;
        if (b != null) {
            d = b.d;
        }
        final long n10 = n(xmlPullParser, "startNumber", d);
        if (n4 != -9223372036854775807L) {
            n3 = n4;
        }
        if (n3 == Long.MAX_VALUE) {
            n3 = -9223372036854775807L;
        }
        List<fc.i> list = null;
        List<k$d> list2;
        Object o = list2 = null;
        Object o2;
        List<fc.i> list3;
        List<k$d> list4;
        do {
            xmlPullParser.next();
            if (d0.k(xmlPullParser, "Initialization")) {
                o2 = p(xmlPullParser, "sourceURL", "range");
                list3 = list;
                list4 = list2;
            }
            else if (d0.k(xmlPullParser, "SegmentTimeline")) {
                list4 = v(xmlPullParser, n7, n2);
                list3 = list;
                o2 = o;
            }
            else if (d0.k(xmlPullParser, "SegmentURL")) {
                if ((list3 = list) == null) {
                    list3 = new ArrayList<fc.i>();
                }
                list3.add(p(xmlPullParser, "media", "mediaRange"));
                o2 = o;
                list4 = list2;
            }
            else {
                c(xmlPullParser);
                list4 = list2;
                o2 = o;
                list3 = list;
            }
            list = list3;
            o = o2;
            list2 = list4;
        } while (!d0.i(xmlPullParser, "SegmentList"));
        Object o3 = o2;
        ArrayList list5 = (ArrayList)list4;
        if (b != null) {
            if (o2 == null) {
                o2 = b.a;
            }
            if (list4 == null) {
                list4 = b.f;
            }
            if (list3 == null) {
                final List<fc.i> j = b.j;
                o3 = o2;
                return new k.b((fc.i)o3, n7, n8, n10, n9, list4, n3, j, c0.J(n5), c0.J(n));
            }
            o3 = o2;
            list5 = (ArrayList)list4;
        }
        final List<fc.i> j = list3;
        list4 = list5;
        return new k.b((fc.i)o3, n7, n8, n10, n9, list4, n3, j, c0.J(n5), c0.J(n));
    }
    
    public static k.c u(final XmlPullParser xmlPullParser, final k.c c, final List list, final long n, final long n2, long n3, final long n4, final long n5) throws XmlPullParserException, IOException {
        final long n6 = 1L;
        long b;
        if (c != null) {
            b = c.b;
        }
        else {
            b = 1L;
        }
        final long n7 = n(xmlPullParser, "timescale", b);
        long c2;
        if (c != null) {
            c2 = c.c;
        }
        else {
            c2 = 0L;
        }
        final long n8 = n(xmlPullParser, "presentationTimeOffset", c2);
        long e;
        if (c != null) {
            e = c.e;
        }
        else {
            e = -9223372036854775807L;
        }
        final long n9 = n(xmlPullParser, "duration", e);
        long d = n6;
        if (c != null) {
            d = c.d;
        }
        final long n10 = n(xmlPullParser, "startNumber", d);
        while (true) {
            for (int i = 0; i < list.size(); ++i) {
                final fc.e e2 = list.get(i);
                if (mk2.e.w((CharSequence)"http://dashif.org/guidelines/last-segment-number", e2.a)) {
                    final long long1 = Long.parseLong(e2.b);
                    if (n4 != -9223372036854775807L) {
                        n3 = n4;
                    }
                    if (n3 == Long.MAX_VALUE) {
                        n3 = -9223372036854775807L;
                    }
                    fc.i j = null;
                    m k;
                    if (c != null) {
                        k = c.k;
                    }
                    else {
                        k = null;
                    }
                    final m w = w(xmlPullParser, "media", k);
                    m l;
                    if (c != null) {
                        l = c.j;
                    }
                    else {
                        l = null;
                    }
                    final m w2 = w(xmlPullParser, "initialization", l);
                    ArrayList list2 = null;
                    fc.i m;
                    ArrayList v;
                    do {
                        xmlPullParser.next();
                        if (d0.k(xmlPullParser, "Initialization")) {
                            m = p(xmlPullParser, "sourceURL", "range");
                            v = list2;
                        }
                        else if (d0.k(xmlPullParser, "SegmentTimeline")) {
                            v = v(xmlPullParser, n7, n2);
                            m = j;
                        }
                        else {
                            c(xmlPullParser);
                            v = list2;
                            m = j;
                        }
                        j = m;
                        list2 = v;
                    } while (!d0.i(xmlPullParser, "SegmentTemplate"));
                    fc.i i2 = m;
                    if (c != null) {
                        if (m == null) {
                            m = c.a;
                        }
                        if (v == null) {
                            final List<k$d> f = c.f;
                            i2 = m;
                            return new k.c(i2, n7, n8, n10, long1, n9, f, n3, w2, w, c0.J(n5), c0.J(n));
                        }
                        i2 = m;
                    }
                    final List<k$d> f = v;
                    return new k.c(i2, n7, n8, n10, long1, n9, f, n3, w2, w, c0.J(n5), c0.J(n));
                }
            }
            final long long1 = -1L;
            continue;
        }
    }
    
    public static ArrayList v(final XmlPullParser xmlPullParser, final long n, final long n2) throws XmlPullParserException, IOException {
        final ArrayList list = new ArrayList();
        long n3 = 0L;
        int n5;
        int n4 = n5 = 0;
        long n6 = -9223372036854775807L;
        int m;
        int n10;
        long n11;
        long n12;
        do {
            xmlPullParser.next();
            if (d0.k(xmlPullParser, "S")) {
                final long n7 = n(xmlPullParser, "t", -9223372036854775807L);
                long b = n3;
                if (n4 != 0) {
                    b = b(list, n3, n6, n5, n7);
                }
                long n8;
                if (n7 != -9223372036854775807L) {
                    n8 = n7;
                }
                else {
                    n8 = b;
                }
                final long n9 = n(xmlPullParser, "d", -9223372036854775807L);
                m = m(xmlPullParser, "r", 0);
                n10 = 1;
                n11 = n8;
                n12 = n9;
            }
            else {
                c(xmlPullParser);
                m = n5;
                n12 = n6;
                n11 = n3;
                n10 = n4;
            }
            n4 = n10;
            n3 = n11;
            n6 = n12;
            n5 = m;
        } while (!d0.i(xmlPullParser, "SegmentTimeline"));
        if (n10 != 0) {
            b(list, n11, n12, m, c0.P(n2, n, 1000L));
        }
        return list;
    }
    
    public static m w(final XmlPullParser xmlPullParser, String s, final m m) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue != null) {
            final String[] array = new String[5];
            final int[] array2 = new int[4];
            final String[] array3 = new String[4];
            array[0] = "";
            int n;
            int i = n = 0;
            while (i < attributeValue.length()) {
                final int index = attributeValue.indexOf("$", i);
                final int n2 = -1;
                if (index == -1) {
                    s = String.valueOf(array[n]);
                    final String value = String.valueOf(attributeValue.substring(i));
                    String concat;
                    if (value.length() != 0) {
                        concat = s.concat(value);
                    }
                    else {
                        concat = new String(s);
                    }
                    array[n] = concat;
                    i = attributeValue.length();
                }
                else if (index != i) {
                    final String value2 = String.valueOf(array[n]);
                    s = String.valueOf(attributeValue.substring(i, index));
                    String concat2;
                    if (s.length() != 0) {
                        concat2 = value2.concat(s);
                    }
                    else {
                        concat2 = new String(value2);
                    }
                    array[n] = concat2;
                    i = index;
                }
                else if (attributeValue.startsWith("$$", i)) {
                    array[n] = String.valueOf(array[n]).concat("$");
                    i += 2;
                }
                else {
                    ++i;
                    final int index2 = attributeValue.indexOf("$", i);
                    s = attributeValue.substring(i, index2);
                    if (s.equals("RepresentationID")) {
                        array2[n] = 1;
                    }
                    else {
                        final int index3 = s.indexOf("%0");
                        String s3;
                        if (index3 != -1) {
                            final String s2 = s3 = s.substring(index3);
                            if (!s2.endsWith("d")) {
                                s3 = s2;
                                if (!s2.endsWith("x")) {
                                    s3 = s2;
                                    if (!s2.endsWith("X")) {
                                        s3 = s2.concat("d");
                                    }
                                }
                            }
                            s = s.substring(0, index3);
                        }
                        else {
                            s3 = "%01d";
                        }
                        s.getClass();
                        int n3 = 0;
                        switch (s.hashCode()) {
                            default: {
                                n3 = n2;
                                break;
                            }
                            case 38199441: {
                                if (!s.equals("Bandwidth")) {
                                    n3 = n2;
                                    break;
                                }
                                n3 = 2;
                                break;
                            }
                            case 2606829: {
                                if (!s.equals("Time")) {
                                    n3 = n2;
                                    break;
                                }
                                n3 = 1;
                                break;
                            }
                            case -1950496919: {
                                if (!s.equals("Number")) {
                                    n3 = n2;
                                    break;
                                }
                                n3 = 0;
                                break;
                            }
                        }
                        switch (n3) {
                            default: {
                                String concat3;
                                if (attributeValue.length() != 0) {
                                    concat3 = "Invalid template: ".concat(attributeValue);
                                }
                                else {
                                    concat3 = new String("Invalid template: ");
                                }
                                throw new IllegalArgumentException(concat3);
                            }
                            case 2: {
                                array2[n] = 3;
                                break;
                            }
                            case 1: {
                                array2[n] = 4;
                                break;
                            }
                            case 0: {
                                array2[n] = 2;
                                break;
                            }
                        }
                        array3[n] = s3;
                    }
                    ++n;
                    array[n] = "";
                    i = index2 + 1;
                }
            }
            return new m(array, array2, array3, n);
        }
        return m;
    }
    
    public final c d(final Uri uri, final InputStream inputStream) throws IOException {
        try {
            final XmlPullParser pullParser = this.a.newPullParser();
            pullParser.setInput(inputStream, (String)null);
            if (pullParser.next() == 2 && "MPD".equals(pullParser.getName())) {
                return o(pullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", (Throwable)null);
        }
        catch (final XmlPullParserException ex) {
            throw ParserException.createForMalformedManifest((String)null, (Throwable)ex);
        }
    }
}
