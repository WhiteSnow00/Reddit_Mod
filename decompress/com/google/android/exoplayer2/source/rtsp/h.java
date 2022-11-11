// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.rtsp;

import ad.d0;
import java.util.regex.Matcher;
import com.google.android.exoplayer2.ParserException;
import rg.g;
import ad.c0;
import android.net.Uri;
import java.util.regex.Pattern;

public final class h
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final String g;
    public static final String h;
    
    static {
        a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
        b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
        c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
        d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
        e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
        f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
        g = new String(new byte[] { 10 });
        h = new String(new byte[] { 13, 10 });
    }
    
    public static int a(final String s) {
        s.getClass();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1800840907: {
                if (!s.equals("DESCRIBE")) {
                    break;
                }
                n = 11;
                break;
            }
            case 133006441: {
                if (!s.equals("ANNOUNCE")) {
                    break;
                }
                n = 10;
                break;
            }
            case 78791261: {
                if (!s.equals("SETUP")) {
                    break;
                }
                n = 9;
                break;
            }
            case 75902422: {
                if (!s.equals("PAUSE")) {
                    break;
                }
                n = 8;
                break;
            }
            case 71242700: {
                if (!s.equals("SET_PARAMETER")) {
                    break;
                }
                n = 7;
                break;
            }
            case 6481884: {
                if (!s.equals("REDIRECT")) {
                    break;
                }
                n = 6;
                break;
            }
            case 2458420: {
                if (!s.equals("PLAY")) {
                    break;
                }
                n = 5;
                break;
            }
            case -84360524: {
                if (!s.equals("PLAY_NOTIFY")) {
                    break;
                }
                n = 4;
                break;
            }
            case -531492226: {
                if (!s.equals("OPTIONS")) {
                    break;
                }
                n = 3;
                break;
            }
            case -702888512: {
                if (!s.equals("GET_PARAMETER")) {
                    break;
                }
                n = 2;
                break;
            }
            case -880847356: {
                if (!s.equals("TEARDOWN")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1881579439: {
                if (!s.equals("RECORD")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                throw new IllegalArgumentException();
            }
            case 11: {
                return 2;
            }
            case 10: {
                return 1;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 5;
            }
            case 7: {
                return 11;
            }
            case 6: {
                return 9;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 7;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 12;
            }
            case 0: {
                return 8;
            }
        }
    }
    
    public static a b(final Uri uri) {
        final String userInfo = uri.getUserInfo();
        a a = null;
        if (userInfo == null) {
            return null;
        }
        if (userInfo.contains(":")) {
            final int a2 = c0.a;
            final String[] split = userInfo.split(":", 2);
            a = new a(split[0], split[1]);
        }
        return a;
    }
    
    public static c c(String s) throws ParserException {
        final Matcher matcher = com.google.android.exoplayer2.source.rtsp.h.e.matcher(s);
        final boolean find = matcher.find();
        final String s2 = "";
        if (find) {
            final String group = matcher.group(1);
            group.getClass();
            final String group2 = matcher.group(3);
            group2.getClass();
            s = matcher.group(4);
            final int a = rg.g.a;
            if (s == null) {
                s = s2;
            }
            return new c(2, group, group2, s);
        }
        final Matcher matcher2 = com.google.android.exoplayer2.source.rtsp.h.f.matcher(s);
        if (matcher2.matches()) {
            s = matcher2.group(1);
            s.getClass();
            return new c(1, s, "", "");
        }
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "Invalid WWW-Authenticate header ".concat(s);
        }
        else {
            s = new String("Invalid WWW-Authenticate header ");
        }
        throw ParserException.createForMalformedManifest(s, null);
    }
    
    public static Uri d(final Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        final String authority = uri.getAuthority();
        authority.getClass();
        d0.c(authority.contains("@"));
        final int a = c0.a;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }
    
    public static String e(final int n) {
        switch (n) {
            default: {
                throw new IllegalStateException();
            }
            case 12: {
                return "TEARDOWN";
            }
            case 11: {
                return "SET_PARAMETER";
            }
            case 10: {
                return "SETUP";
            }
            case 9: {
                return "REDIRECT";
            }
            case 8: {
                return "RECORD";
            }
            case 7: {
                return "PLAY_NOTIFY";
            }
            case 6: {
                return "PLAY";
            }
            case 5: {
                return "PAUSE";
            }
            case 4: {
                return "OPTIONS";
            }
            case 3: {
                return "GET_PARAMETER";
            }
            case 2: {
                return "DESCRIBE";
            }
            case 1: {
                return "ANNOUNCE";
            }
        }
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        
        public a(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
    }
}
