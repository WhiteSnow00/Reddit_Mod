// 
// Decompiled by Procyon v0.6.0
// 

package uc;

import com.google.common.collect.AbstractIterator;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import com.google.common.collect.j0;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.i0;
import com.google.common.collect.k0;
import com.google.common.collect.ImmutableSet;
import android.text.TextUtils;
import java.io.IOException;
import bd.d0;
import java.util.HashMap;
import ag0.a;
import bd.c0;
import java.util.regex.Matcher;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.text.Layout$Alignment;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import java.util.regex.Pattern;
import nc.e;

public final class c extends e
{
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final b u;
    public static final a v;
    public final XmlPullParserFactory m;
    
    static {
        n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
        s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
        t = Pattern.compile("^(\\d+) (\\d+)$");
        u = new b(30.0f, 1, 1);
        v = new a(15);
    }
    
    public c() {
        try {
            (this.m = XmlPullParserFactory.newInstance()).setNamespaceAware(true);
        }
        catch (final XmlPullParserException ex) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", (Throwable)ex);
        }
    }
    
    public static f h(final f f) {
        f f2 = f;
        if (f == null) {
            f2 = new f();
        }
        return f2;
    }
    
    public static boolean i(final String s) {
        return s.equals("tt") || s.equals("head") || s.equals("body") || s.equals("div") || s.equals("p") || s.equals("span") || s.equals("br") || s.equals("style") || s.equals("styling") || s.equals("layout") || s.equals("region") || s.equals("metadata") || s.equals("image") || s.equals("data") || s.equals("information");
    }
    
    public static Layout$Alignment j(String o) {
        o = mk2.e.O(o);
        o.getClass();
        final int hashCode = o.hashCode();
        int n = -1;
        switch (hashCode) {
            case 109757538: {
                if (!o.equals("start")) {
                    break;
                }
                n = 4;
                break;
            }
            case 108511772: {
                if (!o.equals("right")) {
                    break;
                }
                n = 3;
                break;
            }
            case 3317767: {
                if (!o.equals("left")) {
                    break;
                }
                n = 2;
                break;
            }
            case 100571: {
                if (!o.equals("end")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1364013995: {
                if (!o.equals("center")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 2:
            case 4: {
                return Layout$Alignment.ALIGN_NORMAL;
            }
            case 1:
            case 3: {
                return Layout$Alignment.ALIGN_OPPOSITE;
            }
            case 0: {
                return Layout$Alignment.ALIGN_CENTER;
            }
        }
    }
    
    public static a k(XmlPullParser attributeValue, final a a) throws SubtitleDecoderException {
        attributeValue = (XmlPullParser)attributeValue.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return a;
        }
        final Matcher matcher = c.t.matcher((CharSequence)attributeValue);
        if (!matcher.matches()) {
            String concat;
            if (((String)attributeValue).length() != 0) {
                concat = "Ignoring malformed cell resolution: ".concat((String)attributeValue);
            }
            else {
                concat = new String("Ignoring malformed cell resolution: ");
            }
            Log.w("TtmlDecoder", concat);
            return a;
        }
        try {
            final String group = matcher.group(1);
            group.getClass();
            final int int1 = Integer.parseInt(group);
            final String group2 = matcher.group(2);
            group2.getClass();
            final int int2 = Integer.parseInt(group2);
            if (int1 != 0 && int2 != 0) {
                return new a(int2);
            }
            final StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(int1);
            sb.append(" ");
            sb.append(int2);
            throw new SubtitleDecoderException(sb.toString());
        }
        catch (final NumberFormatException ex) {
            String concat2;
            if (((String)attributeValue).length() != 0) {
                concat2 = "Ignoring malformed cell resolution: ".concat((String)attributeValue);
            }
            else {
                concat2 = new String("Ignoring malformed cell resolution: ");
            }
            Log.w("TtmlDecoder", concat2);
            return a;
        }
    }
    
    public static void l(String s, final f f) throws SubtitleDecoderException {
        final int a = c0.a;
        final String[] split = s.split("\\s+", -1);
        Matcher matcher;
        if (split.length == 1) {
            matcher = c.p.matcher(s);
        }
        else {
            if (split.length != 2) {
                final int length = split.length;
                final StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length);
                sb.append(".");
                throw new SubtitleDecoderException(sb.toString());
            }
            matcher = c.p.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (matcher.matches()) {
            s = matcher.group(3);
            s.getClass();
            s.hashCode();
            int n = -1;
            switch (s) {
                case "px": {
                    n = 2;
                    break;
                }
                case "em": {
                    n = 1;
                    break;
                }
                case "%": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    throw new SubtitleDecoderException(ag0.a.l(s.length() + 30, "Invalid unit for fontSize: '", s, "'."));
                }
                case 2: {
                    f.j = 1;
                    break;
                }
                case 1: {
                    f.j = 2;
                    break;
                }
                case 0: {
                    f.j = 3;
                    break;
                }
            }
            s = matcher.group(1);
            s.getClass();
            f.k = Float.parseFloat(s);
            return;
        }
        throw new SubtitleDecoderException(ag0.a.l(s.length() + 36, "Invalid expression for fontSize: '", s, "'."));
    }
    
    public static b m(final XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        final String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int int1;
        if (attributeValue != null) {
            int1 = Integer.parseInt(attributeValue);
        }
        else {
            int1 = 30;
        }
        float n = 1.0f;
        final String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            final int a = c0.a;
            final String[] split = attributeValue2.split(" ", -1);
            if (split.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            n = Integer.parseInt(split[0]) / (float)Integer.parseInt(split[1]);
        }
        final b u = c.u;
        int n2 = u.b;
        final String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            n2 = Integer.parseInt(attributeValue3);
        }
        int n3 = u.c;
        final String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            n3 = Integer.parseInt(attributeValue4);
        }
        return new b(int1 * n, n2, n3);
    }
    
    public static void n(final XmlPullParser xmlPullParser, final HashMap hashMap, final a a, final c c, final HashMap hashMap2, final HashMap hashMap3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            final boolean k = d0.k(xmlPullParser, "style");
            int i = 0;
            if (k) {
                final String h = d0.h(xmlPullParser, "style");
                final f p6 = p(xmlPullParser, new f());
                if (h != null) {
                    final String trim = h.trim();
                    String[] split;
                    if (trim.isEmpty()) {
                        split = new String[0];
                    }
                    else {
                        final int a2 = c0.a;
                        split = trim.split("\\s+", -1);
                    }
                    while (i < split.length) {
                        p6.a((f)hashMap.get(split[i]));
                        ++i;
                    }
                }
                final String l = p6.l;
                if (l == null) {
                    continue;
                }
                hashMap.put(l, p6);
            }
            else if (d0.k(xmlPullParser, "region")) {
                final String h2 = d0.h(xmlPullParser, "id");
                Object o = null;
                Label_1230: {
                    Label_1227: {
                        if (h2 != null) {
                            o = d0.h(xmlPullParser, "origin");
                            if (o != null) {
                                final Pattern r = c.r;
                                final Matcher matcher = r.matcher((CharSequence)o);
                                final Pattern s = c.s;
                                final Matcher matcher2 = s.matcher((CharSequence)o);
                                Label_0455: {
                                    if (matcher.matches()) {
                                        try {
                                            final String group = matcher.group(1);
                                            group.getClass();
                                            final float n = Float.parseFloat(group) / 100.0f;
                                            final String group2 = matcher.group(2);
                                            group2.getClass();
                                            final float n2 = Float.parseFloat(group2) / 100.0f;
                                            break Label_0455;
                                        }
                                        catch (final NumberFormatException ex) {
                                            String concat;
                                            if (((String)o).length() != 0) {
                                                concat = "Ignoring region with malformed origin: ".concat((String)o);
                                            }
                                            else {
                                                concat = new String("Ignoring region with malformed origin: ");
                                            }
                                            Log.w("TtmlDecoder", concat);
                                            break Label_1227;
                                        }
                                    }
                                    if (!matcher2.matches()) {
                                        String concat2;
                                        if (((String)o).length() != 0) {
                                            concat2 = "Ignoring region with unsupported origin: ".concat((String)o);
                                        }
                                        else {
                                            concat2 = new String("Ignoring region with unsupported origin: ");
                                        }
                                        Log.w("TtmlDecoder", concat2);
                                        break Label_1227;
                                    }
                                    if (c == null) {
                                        String concat3;
                                        if (((String)o).length() != 0) {
                                            concat3 = "Ignoring region with missing tts:extent: ".concat((String)o);
                                        }
                                        else {
                                            concat3 = new String("Ignoring region with missing tts:extent: ");
                                        }
                                        Log.w("TtmlDecoder", concat3);
                                        break Label_1227;
                                    }
                                    try {
                                        final String group3 = matcher2.group(1);
                                        group3.getClass();
                                        final int int1 = Integer.parseInt(group3);
                                        final String group4 = matcher2.group(2);
                                        group4.getClass();
                                        final int int2 = Integer.parseInt(group4);
                                        final float n = int1 / (float)c.a;
                                        float n2 = int2 / (float)c.b;
                                        final String h3 = d0.h(xmlPullParser, "extent");
                                        if (h3 != null) {
                                            final Matcher matcher3 = r.matcher(h3);
                                            final Matcher matcher4 = s.matcher(h3);
                                            Label_0726: {
                                                if (matcher3.matches()) {
                                                    try {
                                                        final String group5 = matcher3.group(1);
                                                        group5.getClass();
                                                        final float n3 = Float.parseFloat(group5) / 100.0f;
                                                        final String group6 = matcher3.group(2);
                                                        group6.getClass();
                                                        final float n4 = Float.parseFloat(group6) / 100.0f;
                                                        break Label_0726;
                                                    }
                                                    catch (final NumberFormatException ex2) {
                                                        if (((String)o).length() != 0) {
                                                            o = "Ignoring region with malformed extent: ".concat((String)o);
                                                        }
                                                        else {
                                                            o = new String("Ignoring region with malformed extent: ");
                                                        }
                                                        Log.w("TtmlDecoder", (String)o);
                                                        break Label_1227;
                                                    }
                                                }
                                                if (!matcher4.matches()) {
                                                    break Label_0726;
                                                }
                                                if (c == null) {
                                                    if (((String)o).length() != 0) {
                                                        o = "Ignoring region with missing tts:extent: ".concat((String)o);
                                                    }
                                                    else {
                                                        o = new String("Ignoring region with missing tts:extent: ");
                                                    }
                                                    Log.w("TtmlDecoder", (String)o);
                                                    break Label_1227;
                                                }
                                                try {
                                                    final String group7 = matcher4.group(1);
                                                    group7.getClass();
                                                    final int int3 = Integer.parseInt(group7);
                                                    final String group8 = matcher4.group(2);
                                                    group8.getClass();
                                                    final int int4 = Integer.parseInt(group8);
                                                    final float n3 = int3 / (float)c.a;
                                                    final float n4 = int4 / (float)c.b;
                                                    o = d0.h(xmlPullParser, "displayAlign");
                                                    int n5 = 0;
                                                    Label_0808: {
                                                        if (o != null) {
                                                            o = mk2.e.O((String)o);
                                                            ((String)o).getClass();
                                                            if (((String)o).equals("center")) {
                                                                n2 += n4 / 2.0f;
                                                                n5 = 1;
                                                                break Label_0808;
                                                            }
                                                            if (((String)o).equals("after")) {
                                                                n5 = 2;
                                                                n2 += n4;
                                                                break Label_0808;
                                                            }
                                                        }
                                                        n5 = 0;
                                                    }
                                                    final float n6 = 1.0f / a.a;
                                                    o = d0.h(xmlPullParser, "writingMode");
                                                    int n8 = 0;
                                                    Label_0996: {
                                                        if (o != null) {
                                                            o = mk2.e.O((String)o);
                                                            ((String)o).getClass();
                                                            int n7 = 0;
                                                            Label_0947: {
                                                                switch (o) {
                                                                    case "tbrl": {
                                                                        n7 = 2;
                                                                        break Label_0947;
                                                                    }
                                                                    case "tblr": {
                                                                        n7 = 1;
                                                                        break Label_0947;
                                                                    }
                                                                    case "tb": {
                                                                        n7 = 0;
                                                                        break Label_0947;
                                                                    }
                                                                    default:
                                                                        break;
                                                                }
                                                                n7 = -1;
                                                            }
                                                            switch (n7) {
                                                                case 2: {
                                                                    n8 = 1;
                                                                    break Label_0996;
                                                                }
                                                                case 0:
                                                                case 1: {
                                                                    n8 = 2;
                                                                    break Label_0996;
                                                                }
                                                            }
                                                        }
                                                        n8 = Integer.MIN_VALUE;
                                                    }
                                                    o = new uc.e(h2, n, n2, 0, n5, n3, n4, 1, n6, n8);
                                                    break Label_1230;
                                                }
                                                catch (final NumberFormatException ex3) {
                                                    if (((String)o).length() != 0) {
                                                        o = "Ignoring region with malformed extent: ".concat((String)o);
                                                    }
                                                    else {
                                                        o = new String("Ignoring region with malformed extent: ");
                                                    }
                                                    Log.w("TtmlDecoder", (String)o);
                                                    break Label_1227;
                                                }
                                            }
                                            if (((String)o).length() != 0) {
                                                o = "Ignoring region with unsupported extent: ".concat((String)o);
                                            }
                                            else {
                                                o = new String("Ignoring region with unsupported extent: ");
                                            }
                                            Log.w("TtmlDecoder", (String)o);
                                        }
                                        else {
                                            Log.w("TtmlDecoder", "Ignoring region without an extent");
                                        }
                                    }
                                    catch (final NumberFormatException ex4) {
                                        String concat4;
                                        if (((String)o).length() != 0) {
                                            concat4 = "Ignoring region with malformed origin: ".concat((String)o);
                                        }
                                        else {
                                            concat4 = new String("Ignoring region with malformed origin: ");
                                        }
                                        Log.w("TtmlDecoder", concat4);
                                    }
                                }
                            }
                            else {
                                Log.w("TtmlDecoder", "Ignoring region without an origin");
                            }
                        }
                    }
                    o = null;
                }
                if (o == null) {
                    continue;
                }
                hashMap2.put(((uc.e)o).a, o);
            }
            else {
                if (!d0.k(xmlPullParser, "metadata")) {
                    continue;
                }
                do {
                    xmlPullParser.next();
                    if (d0.k(xmlPullParser, "image")) {
                        final String h4 = d0.h(xmlPullParser, "id");
                        if (h4 == null) {
                            continue;
                        }
                        hashMap3.put(h4, xmlPullParser.nextText());
                    }
                } while (!d0.i(xmlPullParser, "metadata"));
            }
        } while (!d0.i(xmlPullParser, "head"));
    }
    
    public static d o(final XmlPullParser xmlPullParser, final d d, final HashMap hashMap, final b b) throws SubtitleDecoderException {
        final int attributeCount = xmlPullParser.getAttributeCount();
        final f p4 = p(xmlPullParser, null);
        String s = null;
        String s2 = "";
        long n = -9223372036854775807L;
        long n2 = -9223372036854775807L;
        long n3 = -9223372036854775807L;
        String[] array = (Object)s;
        String[] array2;
        String substring;
        long q;
        long q2;
        long q3;
        for (int i = 0; i < attributeCount; ++i, array = array2, s = substring, n = q, n2 = q2, n3 = q3) {
            final String attributeName = xmlPullParser.getAttributeName(i);
            final String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            int n4 = 0;
            Label_0263: {
                switch (attributeName) {
                    case "backgroundImage": {
                        n4 = 5;
                        break Label_0263;
                    }
                    case "style": {
                        n4 = 4;
                        break Label_0263;
                    }
                    case "begin": {
                        n4 = 3;
                        break Label_0263;
                    }
                    case "end": {
                        n4 = 2;
                        break Label_0263;
                    }
                    case "dur": {
                        n4 = 1;
                        break Label_0263;
                    }
                    case "region": {
                        n4 = 0;
                        break Label_0263;
                    }
                    default:
                        break;
                }
                n4 = -1;
            }
            if (n4 != 0) {
                if (n4 != 1) {
                    if (n4 != 2) {
                        if (n4 != 3) {
                            if (n4 != 4) {
                                if (n4 != 5) {
                                    array2 = array;
                                    substring = s;
                                    q = n;
                                    q2 = n2;
                                    q3 = n3;
                                }
                                else {
                                    array2 = array;
                                    substring = s;
                                    q = n;
                                    q2 = n2;
                                    q3 = n3;
                                    if (attributeValue.startsWith("#")) {
                                        substring = attributeValue.substring(1);
                                        array2 = array;
                                        q = n;
                                        q2 = n2;
                                        q3 = n3;
                                    }
                                }
                            }
                            else {
                                final String trim = attributeValue.trim();
                                String[] split;
                                if (trim.isEmpty()) {
                                    split = new String[0];
                                }
                                else {
                                    final int a = c0.a;
                                    split = trim.split("\\s+", -1);
                                }
                                array2 = array;
                                substring = s;
                                q = n;
                                q2 = n2;
                                q3 = n3;
                                if (split.length > 0) {
                                    array2 = split;
                                    substring = s;
                                    q = n;
                                    q2 = n2;
                                    q3 = n3;
                                }
                            }
                        }
                        else {
                            q = q(attributeValue, b);
                            array2 = array;
                            substring = s;
                            q2 = n2;
                            q3 = n3;
                        }
                    }
                    else {
                        q2 = q(attributeValue, b);
                        array2 = array;
                        substring = s;
                        q = n;
                        q3 = n3;
                    }
                }
                else {
                    q3 = q(attributeValue, b);
                    q2 = n2;
                    q = n;
                    substring = s;
                    array2 = array;
                }
            }
            else {
                array2 = array;
                substring = s;
                q = n;
                q2 = n2;
                q3 = n3;
                if (hashMap.containsKey(attributeValue)) {
                    s2 = attributeValue;
                    q3 = n3;
                    q2 = n2;
                    q = n;
                    substring = s;
                    array2 = array;
                }
            }
        }
        long n5;
        long n6;
        if (d != null) {
            final long d2 = d.d;
            n5 = n;
            n6 = n2;
            if (d2 != -9223372036854775807L) {
                long n7 = n;
                if (n != -9223372036854775807L) {
                    n7 = n + d2;
                }
                n5 = n7;
                n6 = n2;
                if (n2 != -9223372036854775807L) {
                    n6 = n2 + d2;
                    n5 = n7;
                }
            }
        }
        else {
            n6 = n2;
            n5 = n;
        }
        if (n6 == -9223372036854775807L) {
            if (n3 != -9223372036854775807L) {
                final long e = n5 + n3;
                return new d(xmlPullParser.getName(), null, n5, e, p4, array, s2, s, d);
            }
            if (d != null) {
                final long e = d.e;
                if (e != -9223372036854775807L) {
                    return new d(xmlPullParser.getName(), null, n5, e, p4, array, s2, s, d);
                }
            }
        }
        final long e = n6;
        return new d(xmlPullParser.getName(), null, n5, e, p4, array, s2, s, d);
    }
    
    public static f p(final XmlPullParser xmlPullParser, f f) {
        final int attributeCount = xmlPullParser.getAttributeCount();
        int i = 0;
        f f2 = f;
        while (i < attributeCount) {
            final String attributeValue = xmlPullParser.getAttributeValue(i);
            final String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            final int hashCode = attributeName.hashCode();
            final int n = 3;
            int n2 = -1;
            final int n3 = 1;
            int n4 = 0;
            Label_0488: {
                switch (hashCode) {
                    case 1754920356: {
                        if (!attributeName.equals("multiRowAlign")) {
                            break;
                        }
                        n4 = 14;
                        break Label_0488;
                    }
                    case 1287124693: {
                        if (!attributeName.equals("backgroundColor")) {
                            break;
                        }
                        n4 = 13;
                        break Label_0488;
                    }
                    case 1115953443: {
                        if (!attributeName.equals("rubyPosition")) {
                            break;
                        }
                        n4 = 12;
                        break Label_0488;
                    }
                    case 921125321: {
                        if (!attributeName.equals("textEmphasis")) {
                            break;
                        }
                        n4 = 11;
                        break Label_0488;
                    }
                    case 365601008: {
                        if (!attributeName.equals("fontSize")) {
                            break;
                        }
                        n4 = 10;
                        break Label_0488;
                    }
                    case 110138194: {
                        if (!attributeName.equals("textCombine")) {
                            break;
                        }
                        n4 = 9;
                        break Label_0488;
                    }
                    case 109403361: {
                        if (!attributeName.equals("shear")) {
                            break;
                        }
                        n4 = 8;
                        break Label_0488;
                    }
                    case 94842723: {
                        if (!attributeName.equals("color")) {
                            break;
                        }
                        n4 = 7;
                        break Label_0488;
                    }
                    case 3511770: {
                        if (!attributeName.equals("ruby")) {
                            break;
                        }
                        n4 = 6;
                        break Label_0488;
                    }
                    case 3355: {
                        if (!attributeName.equals("id")) {
                            break;
                        }
                        n4 = 5;
                        break Label_0488;
                    }
                    case -734428249: {
                        if (!attributeName.equals("fontWeight")) {
                            break;
                        }
                        n4 = 4;
                        break Label_0488;
                    }
                    case -879295043: {
                        if (!attributeName.equals("textDecoration")) {
                            break;
                        }
                        n4 = 3;
                        break Label_0488;
                    }
                    case -1065511464: {
                        if (!attributeName.equals("textAlign")) {
                            break;
                        }
                        n4 = 2;
                        break Label_0488;
                    }
                    case -1224696685: {
                        if (!attributeName.equals("fontFamily")) {
                            break;
                        }
                        n4 = 1;
                        break Label_0488;
                    }
                    case -1550943582: {
                        if (!attributeName.equals("fontStyle")) {
                            break;
                        }
                        n4 = 0;
                        break Label_0488;
                    }
                }
                n4 = -1;
            }
            Label_2373: {
                switch (n4) {
                    default: {
                        f = f2;
                        break;
                    }
                    case 14: {
                        f = h(f2);
                        f.p = j(attributeValue);
                        break;
                    }
                    case 13: {
                        final f h = h(f2);
                        try {
                            h.d = bd.d.a(attributeValue, false);
                            h.e = true;
                            f = h;
                        }
                        catch (final IllegalArgumentException ex) {
                            final String value = String.valueOf(attributeValue);
                            String concat;
                            if (value.length() != 0) {
                                concat = "Failed parsing background value: ".concat(value);
                            }
                            else {
                                concat = new String("Failed parsing background value: ");
                            }
                            Log.w("TtmlDecoder", concat);
                            f = h;
                        }
                        break;
                    }
                    case 12: {
                        final String o = mk2.e.O(attributeValue);
                        o.getClass();
                        if (o.equals("before")) {
                            f = h(f2);
                            f.n = 1;
                            break;
                        }
                        if (!o.equals("after")) {
                            f = f2;
                            break;
                        }
                        f = h(f2);
                        f.n = 2;
                        break;
                    }
                    case 11: {
                        final f h2 = h(f2);
                        final Pattern d = uc.b.d;
                        uc.b r = null;
                        if (attributeValue != null) {
                            final String o2 = mk2.e.O(attributeValue.trim());
                            if (!o2.isEmpty()) {
                                final ImmutableSet copy = ImmutableSet.copyOf((Object[])TextUtils.split(o2, uc.b.d));
                                final String s = (String)Iterators.d("outside", (Iterator)new i0(k0.d((ImmutableSet)uc.b.h, copy)));
                                final int hashCode2 = s.hashCode();
                                int n5 = 0;
                                Label_0899: {
                                    if (hashCode2 != -1392885889) {
                                        if (hashCode2 != -1106037339) {
                                            if (hashCode2 == 92734940) {
                                                if (s.equals("after")) {
                                                    n5 = 0;
                                                    break Label_0899;
                                                }
                                            }
                                        }
                                        else if (s.equals("outside")) {
                                            n5 = 1;
                                            break Label_0899;
                                        }
                                    }
                                    else if (s.equals("before")) {
                                        n5 = 2;
                                        break Label_0899;
                                    }
                                    n5 = -1;
                                }
                                int n6;
                                if (n5 != 0) {
                                    if (n5 != 1) {
                                        n6 = 1;
                                    }
                                    else {
                                        n6 = -2;
                                    }
                                }
                                else {
                                    n6 = 2;
                                }
                                final j0 d2 = k0.d((ImmutableSet)uc.b.e, copy);
                                if (!d2.isEmpty()) {
                                    final String s2 = (String)((AbstractIterator)new i0(d2)).next();
                                    final int hashCode3 = s2.hashCode();
                                    int n7 = 0;
                                    Label_1020: {
                                        if (hashCode3 != 3005871) {
                                            if (hashCode3 == 3387192) {
                                                if (s2.equals("none")) {
                                                    n7 = 0;
                                                    break Label_1020;
                                                }
                                            }
                                        }
                                        else if (s2.equals("auto")) {
                                            n7 = n3;
                                            break Label_1020;
                                        }
                                        n7 = -1;
                                    }
                                    if (n7 == 0) {
                                        n2 = 0;
                                    }
                                    r = new uc.b(n2, 0, n6);
                                }
                                else {
                                    final j0 d3 = k0.d((ImmutableSet)uc.b.g, copy);
                                    final j0 d4 = k0.d((ImmutableSet)uc.b.f, copy);
                                    if (d3.isEmpty() && d4.isEmpty()) {
                                        r = new uc.b(-1, 0, n6);
                                    }
                                    else {
                                        final String s3 = (String)Iterators.d("filled", (Iterator)new i0(d3));
                                        final int hashCode4 = s3.hashCode();
                                        int n8 = 0;
                                        Label_1177: {
                                            if (hashCode4 != -1274499742) {
                                                if (hashCode4 == 3417674) {
                                                    if (s3.equals("open")) {
                                                        n8 = 0;
                                                        break Label_1177;
                                                    }
                                                }
                                            }
                                            else if (s3.equals("filled")) {
                                                n8 = 1;
                                                break Label_1177;
                                            }
                                            n8 = -1;
                                        }
                                        int n9;
                                        if (n8 != 0) {
                                            n9 = 1;
                                        }
                                        else {
                                            n9 = 2;
                                        }
                                        final String s4 = (String)Iterators.d("circle", (Iterator)new i0(d4));
                                        final int hashCode5 = s4.hashCode();
                                        int n10;
                                        if (hashCode5 != -1360216880) {
                                            if (hashCode5 != -905816648) {
                                                if (hashCode5 != 99657) {
                                                    n10 = n2;
                                                }
                                                else {
                                                    n10 = n2;
                                                    if (s4.equals("dot")) {
                                                        n10 = 0;
                                                    }
                                                }
                                            }
                                            else {
                                                n10 = n2;
                                                if (s4.equals("sesame")) {
                                                    n10 = 1;
                                                }
                                            }
                                        }
                                        else {
                                            n10 = n2;
                                            if (s4.equals("circle")) {
                                                n10 = 2;
                                            }
                                        }
                                        int n11;
                                        if (n10 != 0) {
                                            n11 = n;
                                            if (n10 != 1) {
                                                n11 = 1;
                                            }
                                        }
                                        else {
                                            n11 = 2;
                                        }
                                        r = new uc.b(n11, n9, n6);
                                    }
                                }
                            }
                        }
                        h2.r = r;
                        f = h2;
                        break;
                    }
                    case 10: {
                        f = f2;
                        try {
                            final f f3 = f = h(f2);
                            l(attributeValue, f3);
                            f = f3;
                        }
                        catch (final SubtitleDecoderException ex2) {
                            final String value2 = String.valueOf(attributeValue);
                            String concat2;
                            if (value2.length() != 0) {
                                concat2 = "Failed parsing fontSize value: ".concat(value2);
                            }
                            else {
                                concat2 = new String("Failed parsing fontSize value: ");
                            }
                            Log.w("TtmlDecoder", concat2);
                        }
                        break;
                    }
                    case 9: {
                        final String o3 = mk2.e.O(attributeValue);
                        o3.getClass();
                        if (o3.equals("all")) {
                            f = h(f2);
                            f.q = 1;
                            break;
                        }
                        if (!o3.equals("none")) {
                            f = f2;
                            break;
                        }
                        f = h(f2);
                        f.q = 0;
                        break;
                    }
                    case 8: {
                        final f h3 = h(f2);
                        final Matcher matcher = c.q.matcher(attributeValue);
                        final boolean matches = matcher.matches();
                        float min = Float.MAX_VALUE;
                        if (!matches) {
                            final String value3 = String.valueOf(attributeValue);
                            String concat3;
                            if (value3.length() != 0) {
                                concat3 = "Invalid value for shear: ".concat(value3);
                            }
                            else {
                                concat3 = new String("Invalid value for shear: ");
                            }
                            Log.w("TtmlDecoder", concat3);
                        }
                        else {
                            try {
                                final String group = matcher.group(1);
                                group.getClass();
                                min = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                            }
                            catch (final NumberFormatException ex3) {
                                final String value4 = String.valueOf(attributeValue);
                                String concat4;
                                if (value4.length() != 0) {
                                    concat4 = "Failed to parse shear: ".concat(value4);
                                }
                                else {
                                    concat4 = new String("Failed to parse shear: ");
                                }
                                wi.b.n0("TtmlDecoder", concat4, (Throwable)ex3);
                            }
                        }
                        h3.s = min;
                        f = h3;
                        break;
                    }
                    case 7: {
                        final f h4 = h(f2);
                        try {
                            h4.b = bd.d.a(attributeValue, false);
                            h4.c = true;
                            f = h4;
                        }
                        catch (final IllegalArgumentException ex4) {
                            final String value5 = String.valueOf(attributeValue);
                            String concat5;
                            if (value5.length() != 0) {
                                concat5 = "Failed parsing color value: ".concat(value5);
                            }
                            else {
                                concat5 = new String("Failed parsing color value: ");
                            }
                            Log.w("TtmlDecoder", concat5);
                            f = h4;
                        }
                        break;
                    }
                    case 6: {
                        final String o4 = mk2.e.O(attributeValue);
                        o4.getClass();
                        int n12 = 0;
                        Label_1941: {
                            switch (o4) {
                                case "text": {
                                    n12 = 5;
                                    break Label_1941;
                                }
                                case "base": {
                                    n12 = 4;
                                    break Label_1941;
                                }
                                case "textContainer": {
                                    n12 = 3;
                                    break Label_1941;
                                }
                                case "delimiter": {
                                    n12 = 2;
                                    break Label_1941;
                                }
                                case "container": {
                                    n12 = 1;
                                    break Label_1941;
                                }
                                case "baseContainer": {
                                    n12 = 0;
                                    break Label_1941;
                                }
                                default:
                                    break;
                            }
                            n12 = -1;
                        }
                        switch (n12) {
                            default: {
                                f = f2;
                                break Label_2373;
                            }
                            case 3:
                            case 5: {
                                f = h(f2);
                                f.m = 3;
                                break Label_2373;
                            }
                            case 2: {
                                f = h(f2);
                                f.m = 4;
                                break Label_2373;
                            }
                            case 1: {
                                f = h(f2);
                                f.m = 1;
                                break Label_2373;
                            }
                            case 0:
                            case 4: {
                                f = h(f2);
                                f.m = 2;
                                break Label_2373;
                            }
                        }
                        break;
                    }
                    case 5: {
                        f = f2;
                        if ("style".equals(xmlPullParser.getName())) {
                            f = h(f2);
                            f.l = attributeValue;
                            break;
                        }
                        break;
                    }
                    case 4: {
                        f = h(f2);
                        f.h = ("bold".equalsIgnoreCase(attributeValue) ? 1 : 0);
                        break;
                    }
                    case 3: {
                        final String o5 = mk2.e.O(attributeValue);
                        o5.getClass();
                        int n13 = 0;
                        Label_2229: {
                            switch (o5.hashCode()) {
                                case 1679736913: {
                                    n13 = n;
                                    if (!o5.equals("linethrough")) {
                                        break;
                                    }
                                    break Label_2229;
                                }
                                case 913457136: {
                                    if (!o5.equals("nolinethrough")) {
                                        break;
                                    }
                                    n13 = 2;
                                    break Label_2229;
                                }
                                case -1026963764: {
                                    if (!o5.equals("underline")) {
                                        break;
                                    }
                                    n13 = 1;
                                    break Label_2229;
                                }
                                case -1461280213: {
                                    if (!o5.equals("nounderline")) {
                                        break;
                                    }
                                    n13 = 0;
                                    break Label_2229;
                                }
                            }
                            n13 = -1;
                        }
                        switch (n13) {
                            default: {
                                f = f2;
                                break Label_2373;
                            }
                            case 3: {
                                f = h(f2);
                                f.f = 1;
                                break Label_2373;
                            }
                            case 2: {
                                f = h(f2);
                                f.f = 0;
                                break Label_2373;
                            }
                            case 1: {
                                f = h(f2);
                                f.g = 1;
                                break Label_2373;
                            }
                            case 0: {
                                f = h(f2);
                                f.g = 0;
                                break Label_2373;
                            }
                        }
                        break;
                    }
                    case 2: {
                        f = h(f2);
                        f.o = j(attributeValue);
                        break;
                    }
                    case 1: {
                        f = h(f2);
                        f.a = attributeValue;
                        break;
                    }
                    case 0: {
                        f = h(f2);
                        f.i = ("italic".equalsIgnoreCase(attributeValue) ? 1 : 0);
                        break;
                    }
                }
            }
            ++i;
            f2 = f;
        }
        return f2;
    }
    
    public static long q(String s, final b b) throws SubtitleDecoderException {
        final Matcher matcher = c.n.matcher(s);
        final boolean matches = matcher.matches();
        int n = 4;
        if (matches) {
            s = matcher.group(1);
            s.getClass();
            final double n2 = (double)(Long.parseLong(s) * 3600L);
            s = matcher.group(2);
            s.getClass();
            final double n3 = (double)(Long.parseLong(s) * 60L);
            s = matcher.group(3);
            s.getClass();
            final double n4 = (double)Long.parseLong(s);
            s = matcher.group(4);
            double n5 = 0.0;
            double double1;
            if (s != null) {
                double1 = Double.parseDouble(s);
            }
            else {
                double1 = 0.0;
            }
            s = matcher.group(5);
            double n6;
            if (s != null) {
                n6 = Long.parseLong(s) / b.a;
            }
            else {
                n6 = 0.0;
            }
            s = matcher.group(6);
            if (s != null) {
                n5 = Long.parseLong(s) / (double)b.b / b.a;
            }
            return (long)((n2 + n3 + n4 + double1 + n6 + n5) * 1000000.0);
        }
        final Matcher matcher2 = c.o.matcher(s);
        if (matcher2.matches()) {
            s = matcher2.group(1);
            s.getClass();
            final double double2 = Double.parseDouble(s);
            s = matcher2.group(2);
            s.getClass();
            Label_0380: {
                switch (s) {
                    case "ms": {
                        break Label_0380;
                    }
                    case "t": {
                        n = 3;
                        break Label_0380;
                    }
                    case "m": {
                        n = 2;
                        break Label_0380;
                    }
                    case "h": {
                        n = 1;
                        break Label_0380;
                    }
                    case "f": {
                        n = 0;
                        break Label_0380;
                    }
                    default:
                        break;
                }
                n = -1;
            }
            double n9 = 0.0;
            Label_0461: {
                double n8 = 0.0;
                switch (n) {
                    default: {
                        final double n7 = double2;
                        return (long)(n7 * 1000000.0);
                    }
                    case 4: {
                        n8 = 1000.0;
                        break;
                    }
                    case 3: {
                        n8 = b.c;
                        break;
                    }
                    case 2: {
                        n9 = 60.0;
                        break Label_0461;
                    }
                    case 1: {
                        n9 = 3600.0;
                        break Label_0461;
                    }
                    case 0: {
                        n8 = b.a;
                        break;
                    }
                }
                final double n7 = double2 / n8;
                return (long)(n7 * 1000000.0);
            }
            final double n7 = double2 * n9;
            return (long)(n7 * 1000000.0);
        }
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "Malformed time expression: ".concat(s);
        }
        else {
            s = new String("Malformed time expression: ");
        }
        throw new SubtitleDecoderException(s);
    }
    
    public static c r(XmlPullParser h) {
        h = (XmlPullParser)d0.h(h, "extent");
        if (h == null) {
            return null;
        }
        final Matcher matcher = c.s.matcher((CharSequence)h);
        if (!matcher.matches()) {
            String concat;
            if (((String)h).length() != 0) {
                concat = "Ignoring non-pixel tts extent: ".concat((String)h);
            }
            else {
                concat = new String("Ignoring non-pixel tts extent: ");
            }
            Log.w("TtmlDecoder", concat);
            return null;
        }
        try {
            final String group = matcher.group(1);
            group.getClass();
            final int int1 = Integer.parseInt(group);
            final String group2 = matcher.group(2);
            group2.getClass();
            return new c(int1, Integer.parseInt(group2));
        }
        catch (final NumberFormatException ex) {
            String concat2;
            if (((String)h).length() != 0) {
                concat2 = "Ignoring malformed tts extent: ".concat((String)h);
            }
            else {
                concat2 = new String("Ignoring malformed tts extent: ");
            }
            Log.w("TtmlDecoder", concat2);
            return null;
        }
    }
    
    @Override
    public final nc.f g(byte[] array, int n, final boolean b) throws SubtitleDecoderException {
        try {
            final XmlPullParser pullParser = this.m.newPullParser();
            final HashMap hashMap = new HashMap();
            final HashMap<String, uc.e> hashMap2 = new HashMap<String, uc.e>();
            final HashMap hashMap3 = new HashMap();
            hashMap2.put("", new uc.e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array, 0, n);
            c r = null;
            pullParser.setInput((InputStream)byteArrayInputStream, (String)null);
            final ArrayDeque<d> arrayDeque = new ArrayDeque<d>();
            int i = pullParser.getEventType();
            b b2 = c.u;
            a a = c.v;
            int n2 = 0;
            array = null;
            while (i != 1) {
                final d d = arrayDeque.peek();
                c c;
                b b3;
                a a2;
                byte[] array2;
                if (n2 == 0) {
                    final String name = pullParser.getName();
                    if (i == 2) {
                        if ("tt".equals(name)) {
                            b2 = m(pullParser);
                            a = k(pullParser, uc.c.v);
                            r = r(pullParser);
                        }
                        if (!i(name)) {
                            final String value = String.valueOf(pullParser.getName());
                            String concat;
                            if (value.length() != 0) {
                                concat = "Ignoring unsupported tag: ".concat(value);
                            }
                            else {
                                concat = new String("Ignoring unsupported tag: ");
                            }
                            Log.i("TtmlDecoder", concat);
                            n = n2 + 1;
                        }
                        else if ("head".equals(name)) {
                            n(pullParser, hashMap, a, r, hashMap2, hashMap3);
                            n = n2;
                        }
                        else {
                            Label_0383: {
                                try {
                                    final d o = o(pullParser, d, hashMap2, b2);
                                    arrayDeque.push(o);
                                    n = n2;
                                    if (d != null) {
                                        if (d.m == null) {
                                            d.m = new ArrayList();
                                        }
                                        break Label_0383;
                                    }
                                }
                                catch (final SubtitleDecoderException ex) {
                                    wi.b.n0("TtmlDecoder", "Suppressing parser error", (Throwable)ex);
                                    n = n2 + 1;
                                    final d o;
                                    d.m.add(o);
                                    n = n2;
                                }
                            }
                        }
                        c = r;
                        b3 = b2;
                        a2 = a;
                        array2 = array;
                    }
                    else if (i == 4) {
                        d.getClass();
                        final d a3 = uc.d.a(pullParser.getText());
                        if (d.m == null) {
                            d.m = new ArrayList();
                        }
                        d.m.add(a3);
                        c = r;
                        b3 = b2;
                        a2 = a;
                        n = n2;
                        array2 = array;
                    }
                    else {
                        c = r;
                        b3 = b2;
                        a2 = a;
                        n = n2;
                        array2 = array;
                        if (i == 3) {
                            if (pullParser.getName().equals("tt")) {
                                array = new(uc.g.class)();
                                final d d2 = arrayDeque.peek();
                                d2.getClass();
                                new uc.g(d2, hashMap, hashMap2, hashMap3);
                            }
                            arrayDeque.pop();
                            c = r;
                            b3 = b2;
                            a2 = a;
                            n = n2;
                            array2 = array;
                        }
                    }
                }
                else if (i == 2) {
                    n = n2 + 1;
                    c = r;
                    b3 = b2;
                    a2 = a;
                    array2 = array;
                }
                else {
                    c = r;
                    b3 = b2;
                    a2 = a;
                    n = n2;
                    array2 = array;
                    if (i == 3) {
                        n = n2 - 1;
                        array2 = array;
                        a2 = a;
                        b3 = b2;
                        c = r;
                    }
                }
                pullParser.next();
                i = pullParser.getEventType();
                r = c;
                b2 = b3;
                a = a2;
                n2 = n;
                array = array2;
            }
            if (array != null) {
                return (nc.f)(Object)array;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        }
        catch (final IOException ex2) {
            throw new IllegalStateException("Unexpected error when reading input.", ex2);
        }
        catch (final XmlPullParserException ex3) {
            throw new SubtitleDecoderException("Unable to decode source", (Throwable)ex3);
        }
    }
    
    public static final class a
    {
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
    }
    
    public static final class b
    {
        public final float a;
        public final int b;
        public final int c;
        
        public b(final float a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        
        public c(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
