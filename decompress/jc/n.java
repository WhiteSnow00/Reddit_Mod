// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import com.google.common.collect.ImmutableCollection$a;
import java.util.regex.Matcher;
import rg.g;
import android.net.Uri;
import ad.d0;
import com.google.android.exoplayer2.ParserException;
import ad.c0;
import com.google.android.exoplayer2.source.rtsp.h;
import java.util.regex.Pattern;

public final class n
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    
    static {
        a = Pattern.compile("([a-z])=\\s?(.+)");
        b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
        c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");
    }
    
    public static m a(String ex) throws ParserException {
        final m.a a = new m.a();
        String s = h.h;
        if (!((String)ex).contains(s)) {
            s = h.g;
        }
        final int a2 = c0.a;
        final String[] split = ((String)ex).split(s, -1);
        final int length = split.length;
        ex = null;
        int i = 0;
    Label_0755_Outer:
        while (i < length) {
            final String s2 = split[i];
            String s3 = "";
            while (true) {
                String e = null;
                Label_0794: {
                    final Matcher matcher2;
                    Label_0683: {
                        Label_0076: {
                            if ("".equals(s2)) {
                                break Label_0076;
                            }
                            final Matcher matcher = n.a.matcher(s2);
                            if (!matcher.matches()) {
                                ex = (IllegalStateException)String.valueOf(s2);
                                if (((String)ex).length() != 0) {
                                    ex = (IllegalStateException)"Malformed SDP line: ".concat((String)ex);
                                }
                                else {
                                    ex = (IllegalStateException)new String("Malformed SDP line: ");
                                }
                                throw ParserException.createForMalformedManifest((String)ex, null);
                            }
                            final String group = matcher.group(1);
                            group.getClass();
                            e = matcher.group(2);
                            e.getClass();
                            int n = 0;
                            Label_0527: {
                                switch (group.hashCode()) {
                                    case 122: {
                                        if (group.equals("z")) {
                                            n = 14;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 118: {
                                        if (group.equals("v")) {
                                            n = 0;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 117: {
                                        if (group.equals("u")) {
                                            n = 4;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 116: {
                                        if (group.equals("t")) {
                                            n = 9;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 115: {
                                        if (group.equals("s")) {
                                            n = 2;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 114: {
                                        if (group.equals("r")) {
                                            n = 13;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 112: {
                                        if (group.equals("p")) {
                                            n = 6;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 111: {
                                        if (group.equals("o")) {
                                            n = 1;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 109: {
                                        if (group.equals("m")) {
                                            n = 12;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 107: {
                                        if (group.equals("k")) {
                                            n = 10;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 105: {
                                        if (group.equals("i")) {
                                            n = 3;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 101: {
                                        if (group.equals("e")) {
                                            n = 5;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 99: {
                                        if (group.equals("c")) {
                                            n = 7;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 98: {
                                        if (group.equals("b")) {
                                            n = 8;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                    case 97: {
                                        if (group.equals("a")) {
                                            n = 11;
                                            break Label_0527;
                                        }
                                        break;
                                    }
                                }
                                n = -1;
                            }
                            switch (n) {
                                default: {
                                    break Label_0076;
                                }
                                case 12: {
                                    Label_0630: {
                                        if (ex != null) {
                                            try {
                                                ex = (IllegalStateException)((a.a)ex).a();
                                                ((ImmutableCollection$a)a.b).c((Object)ex);
                                                break Label_0630;
                                            }
                                            catch (final IllegalStateException ex) {}
                                            catch (final IllegalArgumentException ex2) {}
                                            throw ParserException.createForMalformedManifest(null, ex);
                                        }
                                    }
                                    matcher2 = jc.n.c.matcher(e);
                                    if (!matcher2.matches()) {
                                        if (e.length() != 0) {
                                            ex = (IllegalStateException)"Malformed SDP media description line: ".concat(e);
                                        }
                                        else {
                                            ex = (IllegalStateException)new String("Malformed SDP media description line: ");
                                        }
                                        throw ParserException.createForMalformedManifest((String)ex, null);
                                    }
                                    break Label_0683;
                                }
                                case 11: {
                                    break Label_0794;
                                }
                                case 10: {
                                    if (ex == null) {
                                        a.i = e;
                                        break Label_0755;
                                    }
                                    ((a.a)ex).i = e;
                                    break Label_0755;
                                }
                                case 9: {
                                    a.f = e;
                                    break Label_0755;
                                }
                                case 8: {
                                    final String[] split2 = e.split(":\\s?", -1);
                                    d0.c(split2.length == 2);
                                    final int int1 = Integer.parseInt(split2[1]);
                                    if (ex == null) {
                                        a.c = int1 * 1000;
                                        break Label_0755;
                                    }
                                    ((a.a)ex).f = int1 * 1000;
                                    break Label_0755;
                                }
                                case 7: {
                                    if (ex == null) {
                                        a.h = e;
                                        break Label_0755;
                                    }
                                    ((a.a)ex).h = e;
                                    break Label_0755;
                                }
                                case 6: {
                                    a.l = e;
                                    break Label_0755;
                                }
                                case 5: {
                                    a.k = e;
                                    break Label_0755;
                                }
                                case 4: {
                                    a.g = Uri.parse(e);
                                    break Label_0755;
                                }
                                case 3: {
                                    if (ex == null) {
                                        a.j = e;
                                        break Label_0755;
                                    }
                                    ((a.a)ex).g = e;
                                    break Label_0755;
                                }
                                case 2: {
                                    a.d = e;
                                    break Label_0755;
                                }
                                case 1: {
                                    a.e = e;
                                    break Label_0755;
                                }
                                case 0: {
                                    if ("0".equals(e)) {
                                        break Label_0076;
                                    }
                                    throw ParserException.createForMalformedManifest(String.format("SDP version %s is not supported.", e), null);
                                }
                            }
                        }
                        break Label_0755;
                    }
                    ex = (IllegalStateException)matcher2.group(1);
                    ex.getClass();
                    final String group2 = matcher2.group(2);
                    group2.getClass();
                    final String group3 = matcher2.group(3);
                    group3.getClass();
                    final String group4 = matcher2.group(4);
                    group4.getClass();
                    Label_1139: {
                        try {
                            ex = (IllegalStateException)new a.a((String)ex, Integer.parseInt(group2), group3, Integer.parseInt(group4));
                            break Label_1139;
                        }
                        catch (final NumberFormatException ex3) {
                            if (e.length() != 0) {
                                ex = (IllegalStateException)"Malformed SDP media description line: ".concat(e);
                            }
                            else {
                                ex = (IllegalStateException)new String("Malformed SDP media description line: ");
                            }
                            throw ParserException.createForMalformedManifest((String)ex, ex3);
                        }
                        break Label_0794;
                    }
                    ++i;
                    continue Label_0755_Outer;
                }
                final Matcher matcher3 = n.b.matcher(e);
                if (!matcher3.matches()) {
                    ex = (IllegalStateException)String.valueOf(s2);
                    if (((String)ex).length() != 0) {
                        ex = (IllegalStateException)"Malformed Attribute line: ".concat((String)ex);
                    }
                    else {
                        ex = (IllegalStateException)new String("Malformed Attribute line: ");
                    }
                    throw ParserException.createForMalformedManifest((String)ex, null);
                }
                final String group5 = matcher3.group(1);
                group5.getClass();
                e = matcher3.group(2);
                final int a3 = g.a;
                if (e != null) {
                    s3 = e;
                }
                if (ex == null) {
                    a.a.put(group5, s3);
                    continue;
                }
                ((a.a)ex).e.put(group5, s3);
                continue;
            }
        }
        Label_1176: {
            if (ex != null) {
                try {
                    ex = (IllegalStateException)((a.a)ex).a();
                    ((ImmutableCollection$a)a.b).c((Object)ex);
                    break Label_1176;
                }
                catch (final IllegalStateException ex) {}
                catch (final IllegalArgumentException ex4) {}
                throw ParserException.createForMalformedManifest(null, ex);
            }
            try {
                ex = (IllegalStateException)a.a();
                return (m)ex;
            }
            catch (final IllegalStateException ex) {}
            catch (final IllegalArgumentException ex5) {}
        }
        throw ParserException.createForMalformedManifest(null, ex);
    }
}
